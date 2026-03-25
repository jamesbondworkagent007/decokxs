package o;

/* JADX INFO: renamed from: o.avf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8063avf extends AbstractC8060avc {
    public final android.widget.TextView KWHzl;
    public final android.text.Editable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8060avc
    public android.widget.TextView KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8060avc
    public android.text.Editable OLrzqt() {
        return this.copydefault;
    }

    public C8063avf(android.widget.TextView textView, @androidx.annotation.Nullable android.text.Editable editable) {
        if (textView == null) {
            throw new java.lang.NullPointerException("Null view");
        }
        this.KWHzl = textView;
        this.copydefault = editable;
    }

    public java.lang.String toString() {
        return "TextViewAfterTextChangeEvent{view=" + this.KWHzl + ", editable=" + ((java.lang.Object) this.copydefault) + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8060avc)) {
            return false;
        }
        AbstractC8060avc abstractC8060avc = (AbstractC8060avc) obj;
        if (this.KWHzl.equals(abstractC8060avc.KWHzl())) {
            android.text.Editable editable = this.copydefault;
            if (editable == null) {
                if (abstractC8060avc.OLrzqt() == null) {
                    return true;
                }
            } else if (editable.equals(abstractC8060avc.OLrzqt())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        android.text.Editable editable = this.copydefault;
        return ((iHashCode ^ 1000003) * 1000003) ^ (editable == null ? 0 : editable.hashCode());
    }
}
