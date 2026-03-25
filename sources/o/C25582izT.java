package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.izT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25582izT {
    public static final C25582izT OLrzqt = new C25582izT();

    private C25582izT() {
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig, com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo>> */
    public final AbstractC58185ywX<kotlin.Pair<InvestGasPriceConfig, InvestRedeemReceiveInfo>> copydefault(@NotNull final InvestRedeemReceiveReq investRedeemReceiveReq, int i, @NotNull java.lang.String str, @NotNull final Function1<? super InvestGasPriceConfig, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(investRedeemReceiveReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<InvestGasPriceConfig> abstractC58185ywXKWHzl = C23539iAc.EZpvd.KWHzl(investRedeemReceiveReq.getInvestmentId(), i, str);
        final Function1 function12 = new Function1() { // from class: o.izV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25582izT.EZpvd(investRedeemReceiveReq, function1, (InvestGasPriceConfig) obj);
            }
        };
        AbstractC58185ywX<InvestGasPriceConfig> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58227yxM() { // from class: o.izS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25582izT.copydefault(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.izU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25582izT.OLrzqt(investRedeemReceiveReq, (InvestGasPriceConfig) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.izY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25582izT.AhwBna(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final Unit EZpvd(InvestRedeemReceiveReq investRedeemReceiveReq, Function1 function1, InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.copydefault(investGasPriceConfig);
        investRedeemReceiveReq.setSlippage((java.lang.String) function1.invoke(investGasPriceConfig));
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(InvestRedeemReceiveReq investRedeemReceiveReq, final InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        AbstractC58185ywX<InvestRedeemReceiveInfo> abstractC58185ywXCopydefault = OLrzqt.copydefault(investRedeemReceiveReq);
        final Function1 function1 = new Function1() { // from class: o.izZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25582izT.EZpvd(investGasPriceConfig, (InvestRedeemReceiveInfo) obj);
            }
        };
        return abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.iAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C25582izT.OLrzqt(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(InvestGasPriceConfig investGasPriceConfig, InvestRedeemReceiveInfo investRedeemReceiveInfo) {
        Intrinsics.checkNotNullParameter(investRedeemReceiveInfo, "");
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(investGasPriceConfig, investRedeemReceiveInfo));
    }

    public final AbstractC58185ywX<InvestRedeemInitialInfo> copydefault(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, int i, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.EZpvd(str, j, str2, str3, z, i, str4), (Function1) null, 1, (java.lang.Object) null);
    }

    public final AbstractC58185ywX<InvestRedeemReceiveInfo> copydefault(@NotNull InvestRedeemReceiveReq investRedeemReceiveReq) {
        Intrinsics.checkNotNullParameter(investRedeemReceiveReq, "");
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.AEQbTJ(investRedeemReceiveReq), (Function1) null, 1, (java.lang.Object) null);
    }
}
