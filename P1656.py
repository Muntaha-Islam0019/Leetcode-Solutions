class OrderedStream:
  def __init__(self, n: int):
    self.data = [None] * (n + 1)
    self.ptr = 1
 
  def insert(self, id: int, value: str) -> List[str]:
    self.data[id] = value
    if id == self.ptr:
      while self.ptr < len(self.data) and self.data[self.ptr]:
        self.ptr += 1
      return self.data[id:self.ptr]
    return []
