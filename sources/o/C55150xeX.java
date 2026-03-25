package o;

import com.okinc.uilab.richtext.htmlspanner.style.Style;
import o.C55146xeT;

/* JADX INFO: renamed from: o.xeX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55150xeX {
    public java.util.List<C55146xeT.StateListAnimator> EZpvd;
    public C55135xeI KWHzl;
    public java.util.List<java.util.List<C55146xeT.Application>> OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.copydefault;
    }

    public C55150xeX(C55135xeI c55135xeI, java.util.List<java.util.List<C55146xeT.Application>> list, java.util.List<C55146xeT.StateListAnimator> list2, java.lang.String str) {
        this.OLrzqt = new java.util.ArrayList();
        new java.util.ArrayList();
        this.KWHzl = c55135xeI;
        this.OLrzqt = list;
        this.EZpvd = list2;
        this.copydefault = str;
    }

    public Style AEQbTJ(Style style) {
        java.util.Iterator<C55146xeT.StateListAnimator> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            style = it.next().OLrzqt(style, this.KWHzl);
        }
        return style;
    }

    public boolean OLrzqt(C59895zpo c59895zpo) {
        java.util.Iterator<java.util.List<C55146xeT.Application>> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            if (OLrzqt(it.next(), c59895zpo)) {
                return true;
            }
        }
        return false;
    }

    public static boolean OLrzqt(java.util.List<C55146xeT.Application> list, C59895zpo c59895zpo) {
        java.util.Iterator<C55146xeT.Application> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().AEQbTJ(c59895zpo)) {
                return false;
            }
            c59895zpo = c59895zpo.copydefault();
        }
        return true;
    }
}
