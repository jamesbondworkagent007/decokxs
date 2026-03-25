package com.okinc.business.invest_biz.data.logic;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemReceiveReq;
import com.okinc.business.invest_biz.data.logic.InvestUniv3RedeemReceiveInfoHandle;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C33050mpD;
import o.C33129mqd;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.iAL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3RedeemReceiveInfoHandle {
    public static final int $stable = 8;
    private Object visibleKey = new Object();

    public final void getReceiveInfo(@NotNull String str, @NotNull String str2, long j, @NotNull final String str3, @NotNull String str4, boolean z, InvestTokenWithAmount investTokenWithAmount, @NotNull Function1<? super InvestGasPriceConfig, String> function1, @NotNull final Function2<? super ResponseState, ? super Pair<InvestGasPriceConfig, InvestUniv3RedeemReceiveInfo>, Unit> function2) {
        String tokenAddress;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        InvestUniv3RedeemReceiveReq investUniv3RedeemReceiveReq = new InvestUniv3RedeemReceiveReq(str, str2, j, C33129mqd.mulS$default(str3, Double.valueOf(0.01d), null, null, null, 14, null), str4, Boolean.valueOf(z), investTokenWithAmount != null ? investTokenWithAmount.getTokenAddress() : null, investTokenWithAmount != null ? investTokenWithAmount.getTokenPrecision() : null, (String) null, (Long) null, false, 1792, (DefaultConstructorMarker) null);
        iAL ial = iAL.EZpvd;
        if (investTokenWithAmount == null || (tokenAddress = investTokenWithAmount.getTokenAddress()) == null) {
            tokenAddress = "";
        }
        AbstractC58185ywX<Pair<InvestGasPriceConfig, InvestUniv3RedeemReceiveInfo>> abstractC58185ywXEZpvd = ial.EZpvd(investUniv3RedeemReceiveReq, 1, tokenAddress, function1);
        final Function1 function12 = new Function1() { // from class: o.iAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3RedeemReceiveInfoHandle.getReceiveInfo$lambda$0(function2, str3, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super Pair<InvestGasPriceConfig, InvestUniv3RedeemReceiveInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.iAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3RedeemReceiveInfoHandle.getReceiveInfo$lambda$2(function2, str3, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iAY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function13.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.visibleKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReceiveInfo$lambda$0(Function2 function2, String str, Pair pair) {
        function2.invoke(new ResponseState(ResponseStateType.NORMAL, "", str, 0, (String) null, 24, (DefaultConstructorMarker) null), pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReceiveInfo$lambda$2(Function2 function2, String str, Throwable th) {
        if (th instanceof ResponseFailedException) {
            ResponseFailedException responseFailedException = (ResponseFailedException) th;
            function2.invoke(new ResponseState(ResponseStateType.SERVER_ERRRO, "", str, responseFailedException.getCode(), responseFailedException.getErrorMsg()), null);
        } else {
            function2.invoke(new ResponseState(ResponseStateType.NET_ERRO, "", str, 0, (String) null, 24, (DefaultConstructorMarker) null), null);
        }
        return Unit.INSTANCE;
    }

    public final void dispose() {
        C33050mpD.OLrzqt(this.visibleKey);
    }
}
