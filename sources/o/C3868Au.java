package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC4025Ax;
import o.DI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3868Au implements AD {
    public final java.util.Set<AA> AEQbTJ;
    public final AbstractC4025Ax KWHzl;
    public final AbstractC4025Ax OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C3868Au() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.As.KWHzl(o.HI, o.DI):o.Ax */
    public C3868Au(@NotNull HM hm) {
        Intrinsics.checkNotNullParameter(hm, "");
        DI.ActionBar actionBar = DI.EZpvd;
        AbstractC4025Ax abstractC4025AxOLrzqt = C3762As.OLrzqt(hm, actionBar.KWHzl());
        this.OLrzqt = abstractC4025AxOLrzqt == null ? C3762As.EZpvd(hm, actionBar.KWHzl()) : abstractC4025AxOLrzqt;
        AbstractC4025Ax abstractC4025AxOLrzqt2 = C3762As.OLrzqt(hm, actionBar.OLrzqt());
        this.KWHzl = abstractC4025AxOLrzqt2 == null ? C3762As.EZpvd(hm, actionBar.OLrzqt()) : abstractC4025AxOLrzqt2;
        this.AEQbTJ = C3762As.KWHzl(hm);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.HM:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HM:0x0006: INVOKE (wrap:o.HL$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:32) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:32)) : (r1v0 o.HM))
 A[MD:(o.HM):void (m)] (LINE:32) call: o.Au.<init>(o.HM):void type: THIS */
    public /* synthetic */ C3868Au(HM hm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HL.OLrzqt.copydefault() : hm);
    }

    @Override // o.AD
    public AbstractC4025Ax OLrzqt(@NotNull DL dl) {
        AbstractC4025Ax abstractC4025Ax;
        Intrinsics.checkNotNullParameter(dl, "");
        if ((this.OLrzqt == null && this.KWHzl == null) || KWHzl(dl)) {
            return AbstractC4025Ax.Activity.AEQbTJ;
        }
        DI diAhwBna = dl.AhwBna();
        DI.ActionBar actionBar = DI.EZpvd;
        if (Intrinsics.EZpvd(diAhwBna, actionBar.KWHzl())) {
            abstractC4025Ax = this.OLrzqt;
        } else {
            abstractC4025Ax = Intrinsics.EZpvd(diAhwBna, actionBar.OLrzqt()) ? this.KWHzl : null;
        }
        return abstractC4025Ax == null ? AbstractC4025Ax.Activity.AEQbTJ : abstractC4025Ax;
    }

    public final boolean KWHzl(DL dl) {
        java.util.Set<AA> set = this.AEQbTJ;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            java.util.Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((AA) it.next()).KWHzl(dl)) {
                    return true;
                }
            }
        }
        return false;
    }
}
