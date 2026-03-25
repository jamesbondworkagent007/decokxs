package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iAL {
    public static final iAL EZpvd = new iAL();

    private iAL() {
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig, com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo>> */
    public final AbstractC58185ywX<kotlin.Pair<InvestGasPriceConfig, InvestUniv3RedeemReceiveInfo>> EZpvd(@NotNull final InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, int i, @NotNull java.lang.String str, @NotNull final Function1<? super InvestGasPriceConfig, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(investUniv3RedeemReceiveReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<InvestGasPriceConfig> abstractC58185ywXKWHzl = C23539iAc.EZpvd.KWHzl(investUniv3RedeemReceiveReq.getInvestmentId(), i, str);
        final Function1 function12 = new Function1() { // from class: o.iAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iAL.KWHzl(investUniv3RedeemReceiveReq, function1, (InvestGasPriceConfig) obj);
            }
        };
        AbstractC58185ywX<InvestGasPriceConfig> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58227yxM() { // from class: o.iAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iAL.KWHzl(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.iAP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iAL.AEQbTJ(investUniv3RedeemReceiveReq, (InvestGasPriceConfig) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.iAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return iAL.gEmmrt(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final Unit KWHzl(InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, Function1 function1, InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.copydefault(investGasPriceConfig);
        investUniv3RedeemReceiveReq.setSlippage((java.lang.String) function1.invoke(investGasPriceConfig));
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq, final InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        AbstractC58185ywX<InvestUniv3RedeemReceiveInfo> abstractC58185ywXKWHzl = EZpvd.KWHzl(investUniv3RedeemReceiveReq);
        final Function1 function1 = new Function1() { // from class: o.iAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iAL.copydefault(investGasPriceConfig, (InvestUniv3RedeemReceiveInfo) obj);
            }
        };
        return abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.iAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return iAL.EZpvd(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(InvestGasPriceConfig investGasPriceConfig, InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo) {
        Intrinsics.checkNotNullParameter(investUniv3RedeemReceiveInfo, "");
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(investGasPriceConfig, investUniv3RedeemReceiveInfo));
    }

    public final AbstractC58185ywX<InvestUniv3RedeemInitialInfo> OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.AEQbTJ(str, j, str2, str4, z, str3), (Function1) null, 1, (java.lang.Object) null);
    }

    public final AbstractC58185ywX<InvestUniv3RedeemReceiveInfo> KWHzl(@NotNull InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq) {
        Intrinsics.checkNotNullParameter(investUniv3RedeemReceiveReq, "");
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.copydefault(investUniv3RedeemReceiveReq), (Function1) null, 1, (java.lang.Object) null);
    }
}
