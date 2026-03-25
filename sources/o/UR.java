package o;

/* JADX INFO: loaded from: classes21.dex */
public class UR extends UF {
    @Override // o.UF
    public long copydefault() {
        return java.lang.Float.floatToRawIntBits(Float.NaN);
    }

    @Override // o.UF
    public long OLrzqt() {
        return java.lang.Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // o.UF
    public long KWHzl() {
        return java.lang.Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // o.UF
    public long copydefault(java.lang.CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float fAEQbTJ = UJ.AEQbTJ(z, j, i3, z2, i4);
        if (java.lang.Float.isNaN(fAEQbTJ)) {
            fAEQbTJ = java.lang.Float.parseFloat(charSequence.subSequence(i, i2).toString());
        }
        return java.lang.Float.floatToRawIntBits(fAEQbTJ);
    }

    @Override // o.UF
    public long EZpvd(java.lang.CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float fCopydefault = UJ.copydefault(z, j, i3, z2, i4);
        if (java.lang.Float.isNaN(fCopydefault)) {
            fCopydefault = java.lang.Float.parseFloat(charSequence.subSequence(i, i2).toString());
        }
        return java.lang.Float.floatToRawIntBits(fCopydefault);
    }
}
