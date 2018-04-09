    def getHeight(self,root):
        #Write your code here
        if root.left is None and root.right is None:
            return 0
        elif root.left is None:
            return 1 + self.getHeight(root.right)
        elif root.right is None:
            return 1 + self.getHeight(root.left)
        else:
            return 1 + max(self.getHeight(root.left), self.getHeight(root.right))