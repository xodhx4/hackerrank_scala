    def removeDuplicates(self,head):
        #Write your code here       
        def removeDuplicatesHelper(head, node, pastData):
            if node.next is None:
                return head
            else:
                if node.next.data == pastData:
                    node.next = node.next.next
                    return removeDuplicatesHelper(head, node, pastData)
                else:
                    return removeDuplicatesHelper(head, node.next, node.next.data)
        
        if head is None:
            return None
        else:
            return removeDuplicatesHelper(head, head, head.data)

  
  
  
  
  
  
  
  
  
  
  