package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.firebase.messaging.Constants;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeReceiveReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iBc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23566iBc {
    public static final C23566iBc EZpvd = new C23566iBc();

    private C23566iBc() {
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final AbstractC58185ywX<kotlin.Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>> OLrzqt(@NotNull final InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq, int i, @NotNull final Function1<? super InvestGasPriceConfig, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(investUniv3SubscribeReceiveReq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<InvestGasPriceConfig> abstractC58185ywXKWHzl = C23539iAc.EZpvd.KWHzl(investUniv3SubscribeReceiveReq.getInvestmentId(), i, investUniv3SubscribeReceiveReq.getInputTokenAddress());
        final Function1 function12 = new Function1() { // from class: o.iAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23566iBc.OLrzqt(investUniv3SubscribeReceiveReq, function1, (InvestGasPriceConfig) obj);
            }
        };
        AbstractC58185ywX<InvestGasPriceConfig> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58227yxM() { // from class: o.iBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23566iBc.EZpvd(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.iBd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23566iBc.AEQbTJ(investUniv3SubscribeReceiveReq, (InvestGasPriceConfig) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.iBb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23566iBc.gEmmrt(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.iBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23566iBc.copydefault((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>> abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl3.OLrzqt(new InterfaceC58227yxM() { // from class: o.iBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23566iBc.AhwBna(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    public static final Unit OLrzqt(InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq, Function1 function1, InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.copydefault(investGasPriceConfig);
        investUniv3SubscribeReceiveReq.setSlippage((java.lang.String) function1.invoke(investGasPriceConfig));
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq, final InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        AbstractC58185ywX<InvestUniv3SubscribeReceiveInfo> abstractC58185ywXOLrzqt = EZpvd.OLrzqt(investUniv3SubscribeReceiveReq);
        final Function1 function1 = new Function1() { // from class: o.iBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23566iBc.EZpvd(investGasPriceConfig, (InvestUniv3SubscribeReceiveInfo) obj);
            }
        };
        return abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.iBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23566iBc.valueOf(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(InvestGasPriceConfig investGasPriceConfig, InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo) {
        Intrinsics.checkNotNullParameter(investUniv3SubscribeReceiveInfo, "");
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(investGasPriceConfig, investUniv3SubscribeReceiveInfo));
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        C43296rmc.copydefault(Constants.IPC_BUNDLE_KEY_SEND_ERROR, IEncryptorType.DEFAULT_ENCRYPTOR, th);
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<InvestUniv3SubscribeInfo> AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, java.lang.String str4, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("walletid is empty");
        }
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.EZpvd(j, str, str2, z, str3, str4, z2), (Function1) null, 1, (java.lang.Object) null);
    }

    public final AbstractC58185ywX<InvestUniv3SubscribeReceiveInfo> OLrzqt(@NotNull InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq) {
        Intrinsics.checkNotNullParameter(investUniv3SubscribeReceiveReq, "");
        return C43423rox.unwrapResponseData$default(C25592izd.OLrzqt.KWHzl(investUniv3SubscribeReceiveReq), (Function1) null, 1, (java.lang.Object) null);
    }
}
