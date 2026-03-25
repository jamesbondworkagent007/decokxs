package o;

import o.InterfaceC5540Vq;

/* JADX INFO: renamed from: o.Vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5541Vr<F extends InterfaceC5540Vq> {
    public int EZpvd;

    public C5541Vr(int i) {
        this.EZpvd = i;
    }

    public static <F extends InterfaceC5540Vq> C5541Vr<F> copydefault(F[] fArr) {
        if (fArr.length > 31) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), java.lang.Integer.valueOf(fArr.length)));
        }
        int mask = 0;
        for (F f : fArr) {
            if (f.enabledByDefault()) {
                mask |= f.getMask();
            }
        }
        return new C5541Vr<>(mask);
    }

    public C5541Vr<F> copydefault(F f) {
        int mask = f.getMask() | this.EZpvd;
        return mask == this.EZpvd ? this : new C5541Vr<>(mask);
    }

    public boolean KWHzl(F f) {
        return (f.getMask() & this.EZpvd) != 0;
    }
}
