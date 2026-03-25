package o;

import com.okinc.uilab.richtext.htmlspanner.style.Style;
import java.util.Objects;
import java.util.Stack;

/* JADX INFO: renamed from: o.xeP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55142xeP {
    public Stack<InterfaceC55141xeO> copydefault = new Stack<>();
    public java.util.Set<C55150xeX> OLrzqt = new java.util.HashSet();
    public java.util.Map<C59895zpo, java.util.List<C55150xeX>> EZpvd = new java.util.HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String copydefault(java.lang.String str) {
        return str == null ? "" : str;
    }

    public void KWHzl(C55150xeX c55150xeX) {
        this.OLrzqt.add(c55150xeX);
    }

    public Style AEQbTJ(C59895zpo c59895zpo, Style style) {
        if (!this.EZpvd.containsKey(c59895zpo)) {
            c59895zpo.values();
            copydefault(c59895zpo.EZpvd("id"));
            copydefault(c59895zpo.EZpvd("class"));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (C55150xeX c55150xeX : this.OLrzqt) {
                if (c55150xeX.OLrzqt(c59895zpo)) {
                    arrayList.add(c55150xeX);
                }
            }
            arrayList.size();
            this.EZpvd.put(c59895zpo, arrayList);
        }
        for (C55150xeX c55150xeX2 : this.EZpvd.get(c59895zpo)) {
            Objects.toString(c55150xeX2);
            Style styleAEQbTJ = c55150xeX2.AEQbTJ(style);
            Objects.toString(style);
            Objects.toString(styleAEQbTJ);
            style = styleAEQbTJ;
        }
        return style;
    }

    public void KWHzl(final java.lang.Object obj, final int i, final int i2) {
        if (i2 > i) {
            this.copydefault.push(new InterfaceC55141xeO() { // from class: o.xeP.3
                @Override // o.InterfaceC55141xeO
                public void KWHzl(C55135xeI c55135xeI, android.text.SpannableStringBuilder spannableStringBuilder) {
                    spannableStringBuilder.setSpan(obj, i, i2, 33);
                }
            });
        } else {
            obj.getClass().getSimpleName();
        }
    }

    public void KWHzl(InterfaceC55141xeO interfaceC55141xeO) {
        this.copydefault.push(interfaceC55141xeO);
    }

    public void KWHzl(C55135xeI c55135xeI, android.text.SpannableStringBuilder spannableStringBuilder) {
        while (!this.copydefault.isEmpty()) {
            this.copydefault.pop().KWHzl(c55135xeI, spannableStringBuilder);
        }
    }
}
