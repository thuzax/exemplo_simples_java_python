
import sys

def soma(a, b):
    return a + b

def main(args):
    print(soma(int(args[0]), int(args[1])))
    
main(sys.argv[1:])