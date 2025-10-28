from math import hypot

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self):
        return hypot(self.x, self.y)

    def distanceTo(self, p):
        return hypot(self.x - p.x, self.y - p.y)

x = float(input("Enter x coordinate: "))
y = float(input("Enter y coordinate: "))

p = Point(x, y)
p2 = Point(4.5, 7.0)
print(p.distance())
print(p.distanceTo(p2))