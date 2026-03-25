package o;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: o.abP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7015abP extends AbstractC7239agA {
    public CharacterIterator copydefault;

    public C7015abP(CharacterIterator characterIterator) {
        if (characterIterator == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.copydefault = characterIterator;
    }

    @Override // o.AbstractC7239agA
    public int OLrzqt() {
        char cCurrent = this.copydefault.current();
        if (cCurrent == 65535) {
            return -1;
        }
        return cCurrent;
    }

    @Override // o.AbstractC7239agA
    public int AEQbTJ() {
        return this.copydefault.getEndIndex() - this.copydefault.getBeginIndex();
    }

    @Override // o.AbstractC7239agA
    public int EZpvd() {
        return this.copydefault.getIndex();
    }

    @Override // o.AbstractC7239agA
    public int KWHzl() {
        char cCurrent = this.copydefault.current();
        this.copydefault.next();
        if (cCurrent == 65535) {
            return -1;
        }
        return cCurrent;
    }

    @Override // o.AbstractC7239agA
    public int copydefault() {
        char cPrevious = this.copydefault.previous();
        if (cPrevious == 65535) {
            return -1;
        }
        return cPrevious;
    }

    @Override // o.AbstractC7239agA
    public void copydefault(int i) {
        try {
            this.copydefault.setIndex(i);
        } catch (java.lang.IllegalArgumentException unused) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    }

    @Override // o.AbstractC7239agA
    public java.lang.Object clone() {
        try {
            C7015abP c7015abP = (C7015abP) super.clone();
            c7015abP.copydefault = (CharacterIterator) this.copydefault.clone();
            return c7015abP;
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // o.AbstractC7239agA
    public int OLrzqt(int i) {
        int endIndex = this.copydefault.getEndIndex() - this.copydefault.getBeginIndex();
        int index = this.copydefault.getIndex() + i;
        if (index < 0) {
            endIndex = 0;
        } else if (index <= endIndex) {
            endIndex = index;
        }
        return this.copydefault.setIndex(endIndex);
    }
}
