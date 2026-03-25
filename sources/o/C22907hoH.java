package o;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hoH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22907hoH {
    public final C23212htv EZpvd;
    public final C22339hdW OLrzqt;

    public static final boolean EZpvd() {
        return true;
    }

    public C22907hoH(@NotNull C23212htv c23212htv, @NotNull C22339hdW c22339hdW) {
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(c22339hdW, "");
        this.EZpvd = c23212htv;
        this.OLrzqt = c22339hdW;
    }

    public static final Unit AEQbTJ(boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hoH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkPreferReferralCodeState$default(C22907hoH c22907hoH, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function2 = new Function2() { // from class: o.hoI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C22907hoH.AEQbTJ(((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                }
            };
        }
        c22907hoH.OLrzqt((Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>) function2);
    }

    public final void OLrzqt(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd.copydefault(this.OLrzqt.copydefault().invoke(), function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hoH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isPreReferCodeUse$default(C22907hoH c22907hoH, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: o.hoG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C22907hoH.EZpvd());
                }
            };
        }
        return c22907hoH.OLrzqt((Function0<java.lang.Boolean>) function0);
    }

    public final boolean OLrzqt(@NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return this.EZpvd.KWHzl(this.OLrzqt.copydefault().invoke(), function0.invoke().booleanValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hoH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.Map getReferralParamMap$default(C22907hoH c22907hoH, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = C56424yEw.KWHzl();
        }
        return c22907hoH.EZpvd(map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        ServiceFeeInfo serviceFeeInfoInvoke = this.OLrzqt.AEQbTJ().invoke();
        if (serviceFeeInfoInvoke == null) {
            return C56424yEw.KWHzl();
        }
        java.util.Map<java.lang.String, java.lang.String> referralParamInfoMap$default = C22910hoK.getReferralParamInfoMap$default(this.OLrzqt.KWHzl().invoke(), this.OLrzqt.OLrzqt().invoke(), serviceFeeInfoInvoke.getOriginalServiceFeeRate(), serviceFeeInfoInvoke.getDiscountedServiceFeeRate(), null, 16, null);
        return map.isEmpty() ? referralParamInfoMap$default : C56424yEw.OLrzqt(referralParamInfoMap$default, map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hoH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showReferralCodeApplyPanel$default(C22907hoH c22907hoH, android.content.Context context, java.util.Map map, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.hoF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C22907hoH.copydefault(((java.lang.Boolean) obj2).booleanValue());
                }
            };
        }
        c22907hoH.EZpvd(context, map, function1);
    }

    public static final Unit copydefault(boolean z) {
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.Map<java.lang.String, java.lang.String> mapEZpvd = EZpvd(map);
        if (mapEZpvd.isEmpty()) {
            function1.invoke(java.lang.Boolean.FALSE);
        } else {
            this.EZpvd.OLrzqt(context, this.OLrzqt.copydefault().invoke(), mapEZpvd, function1);
        }
    }
}
