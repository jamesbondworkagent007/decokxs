package o;

/* JADX INFO: renamed from: o.afm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7224afm extends AbstractC7236afy {
    public AbstractC7236afy copydefault(int i) {
        if (i >= 1 && i <= 999) {
            return AbstractC7236afy.AEQbTJ(this, i, -1);
        }
        throw new java.lang.IllegalArgumentException("Significant digits must be between 1 and 999 (inclusive)");
    }

    public AbstractC7236afy KWHzl(int i) {
        if (i >= 1 && i <= 999) {
            return AbstractC7236afy.AEQbTJ(this, -1, i);
        }
        throw new java.lang.IllegalArgumentException("Significant digits must be between 1 and 999 (inclusive)");
    }
}
