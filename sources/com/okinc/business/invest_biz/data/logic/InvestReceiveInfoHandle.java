package com.okinc.business.invest_biz.data.logic;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.logic.InvestReceiveInfoHandle;
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
import o.C23539iAc;
import o.C27544jxG;
import o.C33050mpD;
import o.C33129mqd;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestReceiveInfoHandle {
    public static final int $stable = 8;
    private Object visibleKey = new Object();

    public final void getReceiveInfo(@NotNull String str, @NotNull String str2, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str3, long j, int i, boolean z, Integer num, @NotNull Function1<? super InvestGasPriceConfig, String> function1, @NotNull Function2<? super ResponseState, ? super Pair<InvestGasPriceConfig, InvestSubscriptionReceiveInfo>, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        String plainString = C33129mqd.EZpvd(str3).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        getDefaultReceiveInfo(new InvestSubscriptionReceiveReq(str, plainString, j, investTokenWithAmount.getTokenAddress(), str2, investTokenWithAmount.getTokenPrecision(), Boolean.valueOf(z), (String) null, (Integer) null, (Integer) null, (String) null, Integer.valueOf(i), num, (Long) null, 10112, (DefaultConstructorMarker) null), investTokenWithAmount, str3, function1, function2);
    }

    private final void getDefaultReceiveInfo(InvestSubscriptionReceiveReq investSubscriptionReceiveReq, final InvestTokenWithAmount investTokenWithAmount, final String str, Function1<? super InvestGasPriceConfig, String> function1, final Function2<? super ResponseState, ? super Pair<InvestGasPriceConfig, InvestSubscriptionReceiveInfo>, Unit> function2) {
        AbstractC58185ywX<Pair<InvestGasPriceConfig, InvestSubscriptionReceiveInfo>> abstractC58185ywXEZpvd = C23539iAc.EZpvd.EZpvd(investSubscriptionReceiveReq, 0, function1);
        final Function1 function12 = new Function1() { // from class: o.izQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestReceiveInfoHandle.getDefaultReceiveInfo$lambda$0(function2, investTokenWithAmount, str, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super Pair<InvestGasPriceConfig, InvestSubscriptionReceiveInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.izN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.izO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestReceiveInfoHandle.getDefaultReceiveInfo$lambda$2(this.EZpvd, investTokenWithAmount, str, function2, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.izR
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
    public static final Unit getDefaultReceiveInfo$lambda$2(InvestReceiveInfoHandle investReceiveInfoHandle, InvestTokenWithAmount investTokenWithAmount, String str, Function2 function2, Throwable th) {
        Intrinsics.copydefault(th);
        investReceiveInfoHandle.handleApiError(th, investTokenWithAmount, str, function2);
        return Unit.INSTANCE;
    }

    private final void handleApiError(Throwable th, InvestTokenWithAmount investTokenWithAmount, String str, Function2<? super ResponseState, ? super Pair<InvestGasPriceConfig, InvestSubscriptionReceiveInfo>, Unit> function2) {
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
