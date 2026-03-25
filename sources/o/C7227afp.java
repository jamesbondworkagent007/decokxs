package o;

import com.ibm.icu.text.PluralRules;

/* JADX INFO: renamed from: o.afp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7227afp implements InterfaceC7269age {
    public final C7020abU AEQbTJ;
    public final InterfaceC7163aee OLrzqt;
    public final InterfaceC7163aee copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @java.lang.Deprecated
    public PluralRules.TaskDescription EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @java.lang.Deprecated
    public PluralRules.TaskDescription copydefault() {
        return this.OLrzqt;
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.AEQbTJ.toString();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.AEQbTJ.charAt(i);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.AEQbTJ.length();
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i, int i2) {
        return this.AEQbTJ.OLrzqt(i, i2);
    }

    public int hashCode() {
        return ((java.util.Arrays.hashCode(this.AEQbTJ.AYXKKw()) ^ java.util.Arrays.hashCode(this.AEQbTJ.gEmmrt())) ^ this.OLrzqt.AhwBna().hashCode()) ^ this.copydefault.AhwBna().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7227afp)) {
            return false;
        }
        C7227afp c7227afp = (C7227afp) obj;
        return java.util.Arrays.equals(this.AEQbTJ.AYXKKw(), c7227afp.AEQbTJ.AYXKKw()) && java.util.Arrays.equals(this.AEQbTJ.gEmmrt(), c7227afp.AEQbTJ.gEmmrt()) && this.OLrzqt.AhwBna().equals(c7227afp.OLrzqt.AhwBna()) && this.copydefault.AhwBna().equals(c7227afp.copydefault.AhwBna());
    }
}
