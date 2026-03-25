package o;

/* JADX INFO: renamed from: o.xfe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55210xfe extends AbstractC55144xeR {
    public final int copydefault;

    public C55210xfe(int i) {
        this.copydefault = i;
    }

    public final int OLrzqt(C59895zpo c59895zpo) {
        if (c59895zpo.copydefault() == null) {
            return -1;
        }
        int i = 1;
        for (InterfaceC59833zoW interfaceC59833zoW : c59895zpo.copydefault().AYXKKw()) {
            if (interfaceC59833zoW == c59895zpo) {
                return i;
            }
            if ((interfaceC59833zoW instanceof C59895zpo) && "li".equals(((C59895zpo) interfaceC59833zoW).values())) {
                i++;
            }
        }
        return -1;
    }

    public final java.lang.String copydefault(C59895zpo c59895zpo) {
        if (c59895zpo.copydefault() == null) {
            return null;
        }
        return c59895zpo.copydefault().values();
    }

    @Override // o.AbstractC55144xeR
    public void copydefault(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, C55142xeP c55142xeP) {
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append("\n");
        }
        if ("ol".equals(copydefault(c59895zpo))) {
            c55142xeP.KWHzl(new C55226xfu(OLrzqt(c59895zpo), this.copydefault), i, i2);
        } else if ("ul".equals(copydefault(c59895zpo))) {
            c55142xeP.KWHzl(new C55226xfu(this.copydefault), i, i2);
        }
    }
}
