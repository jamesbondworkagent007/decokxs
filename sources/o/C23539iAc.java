package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iAc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23539iAc {
    public static final C23539iAc EZpvd = new C23539iAc();

    private C23539iAc() {
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig, com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo>> */
    public final AbstractC58185ywX<kotlin.Pair<InvestGasPriceConfig, InvestSubscriptionReceiveInfo>> EZpvd(@NotNull final InvestSubscriptionReceiveReq investSubscriptionReceiveReq, int i, @NotNull final Function1<? super InvestGasPriceConfig, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveReq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<InvestGasPriceConfig> abstractC58185ywXKWHzl = KWHzl(investSubscriptionReceiveReq.getInvestmentId(), i, investSubscriptionReceiveReq.getInputTokenAddress());
        final Function1 function12 = new Function1() { // from class: o.iAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23539iAc.OLrzqt(investSubscriptionReceiveReq, function1, (InvestGasPriceConfig) obj);
            }
        };
        AbstractC58185ywX<InvestGasPriceConfig> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58227yxM() { // from class: o.iAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23539iAc.OLrzqt(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.iAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23539iAc.OLrzqt(investSubscriptionReceiveReq, (InvestGasPriceConfig) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.iAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23539iAc.valueOf(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final Unit OLrzqt(InvestSubscriptionReceiveReq investSubscriptionReceiveReq, Function1 function1, InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.copydefault(investGasPriceConfig);
        investSubscriptionReceiveReq.setSlippage((java.lang.String) function1.invoke(investGasPriceConfig));
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(InvestSubscriptionReceiveReq investSubscriptionReceiveReq, final InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        AbstractC58185ywX<InvestSubscriptionReceiveInfo> abstractC58185ywXAEQbTJ = EZpvd.AEQbTJ(investSubscriptionReceiveReq);
        final Function1 function1 = new Function1() { // from class: o.iAk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23539iAc.OLrzqt(investGasPriceConfig, (InvestSubscriptionReceiveInfo) obj);
            }
        };
        return abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.iAj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23539iAc.copydefault(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(InvestGasPriceConfig investGasPriceConfig, InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo) {
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfo, "");
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(investGasPriceConfig, investSubscriptionReceiveInfo));
    }

    public final AbstractC58185ywX<InvestSubscriptionInfo> AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, java.lang.Integer num, java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("walletid is empty");
        }
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.copydefault(j, str, str2, z, str3, num, num2), (Function1) null, 1, (java.lang.Object) null);
    }

    public final AbstractC58185ywX<java.util.List<InvestTokenWithAmount>> copydefault(@NotNull java.lang.String str, long j, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.KWHzl(str, j, list, str2), (Function1) null, 1, (java.lang.Object) null);
    }

    public final AbstractC58185ywX<InvestGasPriceConfig> KWHzl(long j, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.KWHzl(j, i, str), (Function1) null, 1, (java.lang.Object) null);
    }

    public final AbstractC58185ywX<InvestSubscriptionReceiveInfo> AEQbTJ(@NotNull InvestSubscriptionReceiveReq investSubscriptionReceiveReq) {
        Intrinsics.checkNotNullParameter(investSubscriptionReceiveReq, "");
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.EZpvd(investSubscriptionReceiveReq), (Function1) null, 1, (java.lang.Object) null);
    }
}
