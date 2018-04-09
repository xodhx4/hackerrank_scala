	# Add your code here
    def __init__(self, elements):
        self.elements = elements
        self.maximumDifference = 0
    def computeDifference(self):
        min_elem = min(self.elements)
        max_elem = max(self.elements)
        self.maximumDifference = max_elem - min_elem