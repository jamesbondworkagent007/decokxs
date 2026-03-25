package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49897uxH implements InterfaceC49899uxJ {
    public final Function1<BizInstrument, java.lang.Boolean> OLrzqt;
    public final Function0<java.lang.Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uxH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C49897uxH copy$default(C49897uxH c49897uxH, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = c49897uxH.copydefault;
        }
        if ((i & 2) != 0) {
            function1 = c49897uxH.OLrzqt;
        }
        return c49897uxH.AEQbTJ(function0, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49897uxH AEQbTJ(@NotNull Function0<java.lang.Boolean> function0, Function1<? super BizInstrument, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        return new C49897uxH(function0, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49899uxJ
    public Function0<java.lang.Boolean> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<BizInstrument, java.lang.Boolean> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49897uxH)) {
            return false;
        }
        C49897uxH c49897uxH = (C49897uxH) obj;
        return Intrinsics.EZpvd(this.copydefault, c49897uxH.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c49897uxH.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        Function1<BizInstrument, java.lang.Boolean> function1 = this.OLrzqt;
        return (iHashCode * 31) + (function1 == null ? 0 : function1.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarginSwitchInitParamsFuturesAccount(isSupportMargin=" + this.copydefault + ", isShowSpotGuide=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.BizInstrument, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C49897uxH(@NotNull Function0<java.lang.Boolean> function0, Function1<? super BizInstrument, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
        this.OLrzqt = function1;
    }
}
