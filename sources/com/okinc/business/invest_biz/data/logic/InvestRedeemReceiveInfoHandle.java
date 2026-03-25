package com.okinc.business.invest_biz.data.logic;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.logic.InvestRedeemReceiveInfoHandle;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C25582izT;
import o.C27544jxG;
import o.C33050mpD;
import o.C33129mqd;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestRedeemReceiveInfoHandle {
    public static final int $stable = 8;
    private Object visibleKey = new Object();

    public final void getReceiveInfo(@NotNull String str, @NotNull String str2, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str3, long j, int i, @NotNull String str4, InvestTokenWithAmount investTokenWithAmount2, boolean z, @NotNull Function1<? super InvestGasPriceConfig, String> function1, @NotNull Function2<? super ResponseState, ? super Pair<InvestGasPriceConfig, InvestRedeemReceiveInfo>, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        String plainString = C33129mqd.EZpvd(str3).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        getDefaultReceiveInfo(new InvestRedeemReceiveReq(str, str2, plainString, j, i, investTokenWithAmount2 != null ? investTokenWithAmount2.getTokenAddress() : null, investTokenWithAmount2 != null ? investTokenWithAmount2.getTokenPrecision() : null, Boolean.valueOf(z), (String) null, str4, (Integer) null, (String) null, (Boolean) null, (String) null, (Long) null, 32000, (DefaultConstructorMarker) null), investTokenWithAmount, str3, investTokenWithAmount2, function1, function2);
    }

    private final void getDefaultReceiveInfo(InvestRedeemReceiveReq investRedeemReceiveReq, final InvestTokenWithAmount investTokenWithAmount, final String str, InvestTokenWithAmount investTokenWithAmount2, Function1<? super InvestGasPriceConfig, String> function1, final Function2<? super ResponseState, ? super Pair<InvestGasPriceConfig, InvestRedeemReceiveInfo>, Unit> function2) {
        String tokenAddress;
        C25582izT c25582izT = C25582izT.OLrzqt;
        if (investTokenWithAmount2 == null || (tokenAddress = investTokenWithAmount2.getTokenAddress()) == null) {
            tokenAddress = "";
        }
        AbstractC58185ywX<Pair<InvestGasPriceConfig, InvestRedeemReceiveInfo>> abstractC58185ywXCopydefault = c25582izT.copydefault(investRedeemReceiveReq, 1, tokenAddress, function1);
        final Function1 function12 = new Function1() { // from class: o.izW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestRedeemReceiveInfoHandle.getDefaultReceiveInfo$lambda$0(function2, investTokenWithAmount, str, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super Pair<InvestGasPriceConfig, InvestRedeemReceiveInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.izX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.iAe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestRedeemReceiveInfoHandle.getDefaultReceiveInfo$lambda$2(this.EZpvd, investTokenWithAmount, str, function2, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iAb
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
    public static final Unit getDefaultReceiveInfo$lambda$0(Function2 function2, InvestTokenWithAmount investTokenWithAmount, String str, Pair pair) {
        function2.invoke(new ResponseState(ResponseStateType.NORMAL, investTokenWithAmount.getTokenAddress(), str, 0, (String) null, 24, (DefaultConstructorMarker) null), pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDefaultReceiveInfo$lambda$2(InvestRedeemReceiveInfoHandle investRedeemReceiveInfoHandle, InvestTokenWithAmount investTokenWithAmount, String str, Function2 function2, Throwable th) {
        Intrinsics.copydefault(th);
        investRedeemReceiveInfoHandle.handleApiError(th, investTokenWithAmount, str, function2);
        return Unit.INSTANCE;
    }

    private final void handleApiError(Throwable th, InvestTokenWithAmount investTokenWithAmount, String str, Function2<? super ResponseState, ? super Pair<InvestGasPriceConfig, InvestRedeemReceiveInfo>, Unit> function2) {
        if (th instanceof ResponseFailedException) {
            ResponseFailedException responseFailedException = (ResponseFailedException) th;
            function2.invoke(new ResponseState(ResponseStateType.SERVER_ERRRO, investTokenWithAmount.getTokenAddress(), str, responseFailedException.getCode(), responseFailedException.getErrorMsg()), null);
        } else if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            function2.invoke(new ResponseState(ResponseStateType.SERVER_ERRRO, investTokenWithAmount.getTokenAddress(), str, oKServerException.getCode(), C27544jxG.copydefault(oKServerException)), null);
        } else {
            function2.invoke(new ResponseState(ResponseStateType.NET_ERRO, investTokenWithAmount.getTokenAddress(), str, 0, (String) null, 24, (DefaultConstructorMarker) null), null);
        }
    }

    public final void dispose() {
        C33050mpD.OLrzqt(this.visibleKey);
    }
}
