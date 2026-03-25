package o;

/* JADX INFO: renamed from: o.xfh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55213xfh extends AbstractC55144xeR {
    @Override // o.AbstractC55144xeR
    public boolean KWHzl() {
        return true;
    }

    @Override // o.AbstractC55144xeR
    public void copydefault(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, C55142xeP c55142xeP) {
        if (copydefault().EZpvd() && c59895zpo.AYXKKw().size() == 1) {
            InterfaceC59833zoW interfaceC59833zoW = c59895zpo.AYXKKw().get(0);
            if (interfaceC59833zoW instanceof C59881zpa) {
                AEQbTJ(((C59881zpa) interfaceC59833zoW).KWHzl(), c55142xeP);
            }
        }
    }

    public final void AEQbTJ(java.lang.String str, C55142xeP c55142xeP) {
        try {
            java.util.Iterator<C57845yqB> it = C57847yqD.EZpvd(str).iterator();
            while (it.hasNext()) {
                c55142xeP.KWHzl(C55146xeT.copydefault(it.next(), copydefault()));
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
