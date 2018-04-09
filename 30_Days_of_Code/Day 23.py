    def levelOrder(self,root):
        #Write your code here
        queue = list()
        def levelOrderHelper(root, queue):
            if root is None:
                if not queue:
                    pass
                else:
                    nextNode = queue.pop(0)
                    levelOrderHelper(nextNode, queue)
            else:
                print(root.data, end=' ')
                queue.append(root.left)
                queue.append(root.right)
            
                nextNode = queue.pop(0)
                levelOrderHelper(nextNode, queue)
        
        levelOrderHelper(root, queue)
                