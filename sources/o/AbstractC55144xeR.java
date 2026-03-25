package o;

/* JADX INFO: renamed from: o.xeR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55144xeR {
    public C55135xeI EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(C55135xeI c55135xeI) {
        this.EZpvd = c55135xeI;
    }

    public boolean KWHzl() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55135xeI copydefault() {
        return this.EZpvd;
    }

    public abstract void copydefault(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, C55142xeP c55142xeP);

    public void copydefault(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, C55142xeP c55142xeP) {
    }

    public boolean AEQbTJ(android.text.SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        if (this.EZpvd.KWHzl() && length > 2 && spannableStringBuilder.charAt(length - 1) == '\n' && spannableStringBuilder.charAt(length - 2) == '\n') {
            return false;
        }
        spannableStringBuilder.append("\n");
        return true;
    }
}
