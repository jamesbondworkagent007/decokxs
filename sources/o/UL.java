package o;

/* JADX INFO: loaded from: classes21.dex */
public final class UL extends UF {
    @Override // o.UF
    public long copydefault() {
        return java.lang.Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // o.UF
    public long OLrzqt() {
        return java.lang.Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // o.UF
    public long KWHzl() {
        return java.lang.Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // o.UF
    public long copydefault(java.lang.CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double dAEQbTJ = UM.AEQbTJ(z, j, i3, z2, i4);
        if (java.lang.Double.isNaN(dAEQbTJ)) {
            dAEQbTJ = java.lang.Double.parseDouble(charSequence.subSequence(i, i2).toString());
        }
        return java.lang.Double.doubleToRawLongBits(dAEQbTJ);
    }

    @Override // o.UF
    public long EZpvd(java.lang.CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double dOLrzqt = UM.OLrzqt(z, j, i3, z2, i4);
        if (java.lang.Double.isNaN(dOLrzqt)) {
            dOLrzqt = java.lang.Double.parseDouble(charSequence.subSequence(i, i2).toString());
        }
        return java.lang.Double.doubleToRawLongBits(dOLrzqt);
    }
}
