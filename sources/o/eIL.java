package o;

import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eIL extends AbstractC33073mpa {
    public final C12827cuN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public eIL() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0007: INVOKE 
  (wrap:o.cuN$Application:0x0004: SGET  A[WRAPPED] (LINE:8) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:8)) : (r1v0 o.cuN))
 A[MD:(o.cuN):void (m)] (LINE:7) call: o.eIL.<init>(o.cuN):void type: THIS */
    public /* synthetic */ eIL(C12827cuN c12827cuN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN);
    }

    public eIL(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.copydefault = c12827cuN;
    }

    public final Calendar OLrzqt(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public final Calendar KWHzl(Calendar calendar) {
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar;
    }

    public final Calendar AEQbTJ() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -180);
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        return OLrzqt(calendar);
    }

    public static /* synthetic */ Calendar getDefaultStartTime$default(eIL eil, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return eil.EZpvd(z);
    }

    public final Calendar EZpvd(boolean z) {
        if (z) {
            Calendar defaultEndTime$default = getDefaultEndTime$default(this, false, 1, null);
            defaultEndTime$default.add(6, -90);
            return KWHzl(defaultEndTime$default);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -90);
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        return OLrzqt(calendar);
    }

    public static /* synthetic */ Calendar getDefaultEndTime$default(eIL eil, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return eil.OLrzqt(z);
    }

    public final Calendar OLrzqt(boolean z) {
        if (z) {
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "");
            return OLrzqt(calendar);
        }
        Calendar calendar2 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar2, "");
        return KWHzl(calendar2);
    }
}
