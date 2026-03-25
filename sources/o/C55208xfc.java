package o;

import com.okinc.uilab.richtext.htmlspanner.spans.FontFamilySpan;

/* JADX INFO: renamed from: o.xfc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55208xfc extends AbstractC55144xeR {
    @Override // o.AbstractC55144xeR
    public boolean KWHzl() {
        return true;
    }

    public final void copydefault(java.lang.StringBuffer stringBuffer, java.lang.Object obj) {
        if (obj instanceof C59881zpa) {
            stringBuffer.append(C55148xeV.OLrzqt(((C59881zpa) obj).KWHzl().toString(), true));
        } else if (obj instanceof C59895zpo) {
            java.util.Iterator<? extends InterfaceC59833zoW> it = ((C59895zpo) obj).AYXKKw().iterator();
            while (it.hasNext()) {
                copydefault(stringBuffer, it.next());
            }
        }
    }

    @Override // o.AbstractC55144xeR
    public void copydefault(C59895zpo c59895zpo, android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, C55142xeP c55142xeP) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        copydefault(stringBuffer, c59895zpo);
        spannableStringBuilder.append((java.lang.CharSequence) stringBuffer.toString());
        c55142xeP.KWHzl(new FontFamilySpan(copydefault().AEQbTJ().AEQbTJ()), i, spannableStringBuilder.length());
        AEQbTJ(spannableStringBuilder);
        AEQbTJ(spannableStringBuilder);
    }
}
