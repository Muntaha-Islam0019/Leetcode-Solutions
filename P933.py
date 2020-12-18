class RecentCounter(object):

    def __init__(self):
        self.data = []
        

    def ping(self, t):
        while self.data and t - self.data[0] > 3000:
            self.data.pop(0)
        self.data.append(t)
        return len(self.data)


# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)
