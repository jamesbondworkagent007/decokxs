package o;

/* JADX INFO: renamed from: o.avg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8064avg extends AbstractC8066avi {
    public final java.lang.CharSequence AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8066avi
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8066avi
    public java.lang.CharSequence EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8066avi
    public int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8066avi
    public android.widget.TextView OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8066avi
    public int copydefault() {
        return this.OLrzqt;
    }

    public C8064avg(android.widget.TextView textView, java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (textView == null) {
            throw new java.lang.NullPointerException("Null view");
        }
        this.EZpvd = textView;
        if (charSequence == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.AEQbTJ = charSequence;
        this.KWHzl = i;
        this.OLrzqt = i2;
        this.copydefault = i3;
    }

    public java.lang.String toString() {
        return "TextViewTextChangeEvent{view=" + this.EZpvd + ", text=" + ((java.lang.Object) this.AEQbTJ) + ", start=" + this.KWHzl + ", before=" + this.OLrzqt + ", count=" + this.copydefault + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8066avi)) {
            return false;
        }
        AbstractC8066avi abstractC8066avi = (AbstractC8066avi) obj;
        return this.EZpvd.equals(abstractC8066avi.OLrzqt()) && this.AEQbTJ.equals(abstractC8066avi.EZpvd()) && this.KWHzl == abstractC8066avi.KWHzl() && this.OLrzqt == abstractC8066avi.copydefault() && this.copydefault == abstractC8066avi.AEQbTJ();
    }

    public int hashCode() {
        return ((((((((this.EZpvd.hashCode() ^ 1000003) * 1000003) ^ this.AEQbTJ.hashCode()) * 1000003) ^ this.KWHzl) * 1000003) ^ this.OLrzqt) * 1000003) ^ this.copydefault;
    }
}
