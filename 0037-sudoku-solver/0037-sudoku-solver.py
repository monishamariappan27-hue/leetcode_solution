class Solution(object):
    def solveSudoku(self, board):
        
        rows = [set() for _ in range(9)]
        cols = [set() for _ in range(9)]
        boxes = [set() for _ in range(9)]
        
        # Step 1: Fill sets
        for i in range(9):
            for j in range(9):
                if board[i][j] != ".":
                    num = board[i][j]
                    rows[i].add(num)
                    cols[j].add(num)
                    boxes[(i // 3) * 3 + j // 3].add(num)
        
        # Step 2: Backtracking
        def backtrack():
            for i in range(9):
                for j in range(9):
                    
                    if board[i][j] == ".":
                        
                        for num in "123456789":
                            
                            box_idx = (i // 3) * 3 + j // 3
                            
                            if (num not in rows[i] and 
                                num not in cols[j] and 
                                num not in boxes[box_idx]):
                                
                                # Place number
                                board[i][j] = num
                                rows[i].add(num)
                                cols[j].add(num)
                                boxes[box_idx].add(num)
                                
                                if backtrack():
                                    return True
                                
                                # Backtrack
                                board[i][j] = "."
                                rows[i].remove(num)
                                cols[j].remove(num)
                                boxes[box_idx].remove(num)
                        
                        return False
            
            return True
        
        backtrack()