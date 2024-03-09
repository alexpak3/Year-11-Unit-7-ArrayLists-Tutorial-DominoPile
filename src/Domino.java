public class Domino {
    public int top;
    public int bottom;
    public Domino() {
        top = 0;
        bottom = 0;
    }
    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString() {
        return top + "/" + bottom;
    }
    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }
    public void settle() {
        if ((top>bottom)) {
            flip();
        }
    }

    public int compareTo(Domino other) {
        if (this.returnSmallestValue()<other.returnSmallestValue()) {
            return -1;
        }
        else if (this.returnSmallestValue()>other.returnSmallestValue()) {
            return 1;
        }
        else if (this.returnSmallestValue()==other.returnSmallestValue()) {
            if (this.returnBiggestValue() < other.returnBiggestValue()) {return -1;}
            if (this.returnBiggestValue() > other.returnBiggestValue()) {return 1;}
            if (this.returnBiggestValue() == other.returnBiggestValue())  {return 0;}
        }
        return 0;
    }
    public int compareToWeight(Domino other) {
        if ((top+bottom)<(other.top+other.bottom)) {return -1;}
        if ((top+bottom)>(other.top+other.bottom)) {return 1;}
        if ((top+bottom)==(other.top+other.bottom)) {return 0;}
        return 0;
    }
    public boolean canConnect(Domino other) {
        if (!(((top == other.top)) || ((top==other.bottom)) || ((bottom == other.top)) || ((bottom == other.bottom)))) {
            return false;
        }
        else {
            return true;
        }

    }

    public int returnSmallestValue() {
        if (top>bottom) {
            return bottom;
        }
        else {
            return top;
        }
    }
    public int returnBiggestValue() {
        if (top>bottom) {
            return top;
        }
        else {
            return bottom;
        }
    }

}