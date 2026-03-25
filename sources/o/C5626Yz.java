package o;

/* JADX INFO: renamed from: o.Yz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5626Yz {
    public C5620Ys<java.lang.Object[]> AEQbTJ;
    public C5620Ys<java.lang.Object[]> KWHzl;
    public int OLrzqt;
    public java.lang.Object[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    public java.lang.Object[] OLrzqt() {
        copydefault();
        java.lang.Object[] objArr = this.copydefault;
        if (objArr != null) {
            return objArr;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[12];
        this.copydefault = objArr2;
        return objArr2;
    }

    public java.lang.Object[] AEQbTJ(java.lang.Object[] objArr, int i) {
        copydefault();
        java.lang.Object[] objArr2 = this.copydefault;
        if (objArr2 == null || objArr2.length < i) {
            this.copydefault = new java.lang.Object[java.lang.Math.max(12, i)];
        }
        java.lang.System.arraycopy(objArr, 0, this.copydefault, 0, i);
        return this.copydefault;
    }

    public java.lang.Object[] AEQbTJ(java.lang.Object[] objArr) {
        C5620Ys<java.lang.Object[]> c5620Ys = new C5620Ys<>(objArr, null);
        if (this.AEQbTJ == null) {
            this.KWHzl = c5620Ys;
            this.AEQbTJ = c5620Ys;
        } else {
            this.KWHzl.AEQbTJ(c5620Ys);
            this.KWHzl = c5620Ys;
        }
        int length = objArr.length;
        this.OLrzqt += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new java.lang.Object[length];
    }

    public java.lang.Object[] EZpvd(java.lang.Object[] objArr, int i) {
        int i2 = this.OLrzqt + i;
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        copydefault(objArr2, i2, objArr, i);
        copydefault();
        return objArr2;
    }

    public <T> T[] OLrzqt(java.lang.Object[] objArr, int i, java.lang.Class<T> cls) {
        int i2 = this.OLrzqt + i;
        T[] tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i2));
        copydefault(tArr, i2, objArr, i);
        copydefault();
        return tArr;
    }

    public void OLrzqt(java.lang.Object[] objArr, int i, java.util.List<java.lang.Object> list) {
        int i2;
        C5620Ys<java.lang.Object[]> c5620YsCopydefault = this.AEQbTJ;
        while (true) {
            i2 = 0;
            if (c5620YsCopydefault == null) {
                break;
            }
            java.lang.Object[] objArrKWHzl = c5620YsCopydefault.KWHzl();
            int length = objArrKWHzl.length;
            while (i2 < length) {
                list.add(objArrKWHzl[i2]);
                i2++;
            }
            c5620YsCopydefault = c5620YsCopydefault.copydefault();
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        copydefault();
    }

    public int KWHzl() {
        java.lang.Object[] objArr = this.copydefault;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public void copydefault() {
        C5620Ys<java.lang.Object[]> c5620Ys = this.KWHzl;
        if (c5620Ys != null) {
            this.copydefault = c5620Ys.KWHzl();
        }
        this.KWHzl = null;
        this.AEQbTJ = null;
        this.OLrzqt = 0;
    }

    public final void copydefault(java.lang.Object obj, int i, java.lang.Object[] objArr, int i2) {
        int i3 = 0;
        for (C5620Ys<java.lang.Object[]> c5620YsCopydefault = this.AEQbTJ; c5620YsCopydefault != null; c5620YsCopydefault = c5620YsCopydefault.copydefault()) {
            java.lang.Object[] objArrKWHzl = c5620YsCopydefault.KWHzl();
            int length = objArrKWHzl.length;
            java.lang.System.arraycopy(objArrKWHzl, 0, obj, i3, length);
            i3 += length;
        }
        java.lang.System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 == i) {
            return;
        }
        throw new java.lang.IllegalStateException("Should have gotten " + i + " entries, got " + i4);
    }
}
