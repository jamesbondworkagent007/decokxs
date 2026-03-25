package o;

/* JADX INFO: renamed from: o.xfb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55207xfb extends C55215xfj {
    public int AEQbTJ;

    public C55207xfb(int i, AbstractC55144xeR abstractC55144xeR) {
        super(abstractC55144xeR);
        this.AEQbTJ = i;
    }

    @Override // o.C55215xfj, o.AbstractC55144xeR
    public void copydefault(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, C55142xeP c55142xeP) {
        super.copydefault(c59895zpo, spannableStringBuilder, i, i2, c55142xeP);
        for (int i3 = 0; i3 < this.AEQbTJ; i3++) {
            AEQbTJ(spannableStringBuilder);
        }
    }
}
