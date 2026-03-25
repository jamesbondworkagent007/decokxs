package o;

import o.HT;

/* JADX INFO: loaded from: classes14.dex */
public class HW<T extends HT<?>> extends HT<T> {
    public final C5205It AEQbTJ;

    public HW(T t, C5205It c5205It) {
        super(t);
        this.AEQbTJ = c5205It;
    }

    public HW<T> copydefault(C5211Iz c5211Iz) {
        this.AEQbTJ.EZpvd(c5211Iz);
        return this;
    }

    public HW<T> OLrzqt(byte[] bArr) {
        copydefault(KWHzl(bArr));
        return this;
    }

    public T copydefault() {
        if (this.AEQbTJ.OLrzqt()) {
            copydefault(II.AYXKKw);
        }
        return AEQbTJ();
    }
}
