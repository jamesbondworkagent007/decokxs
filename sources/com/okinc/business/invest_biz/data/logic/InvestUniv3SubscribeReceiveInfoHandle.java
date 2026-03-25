package com.okinc.business.invest_biz.data.logic;

import android.os.Handler;
import android.os.Looper;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUniv3SubscribeReceiveReq;
import com.okinc.business.invest_biz.data.logic.InvestUniv3SubscribeReceiveInfoHandle;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.network.okg.response.ResponseFailedException;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C23566iBc;
import o.C33050mpD;
import o.C33129mqd;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeReceiveInfoHandle {
    public static final int $stable = 8;
    private Function0<Unit> loopCallback;
    private Handler handler = new Handler(Looper.getMainLooper());
    private long currentIntervalTime = 60000;
    private Object visibleKey = new Object();

    public final void getReceiveInfo(@NotNull String str, @NotNull String str2, @NotNull final InvestTokenWithAmount investTokenWithAmount, @NotNull final String str3, long j, boolean z, int i, int i2, @NotNull String str4, @NotNull Function1<? super InvestGasPriceConfig, String> function1, @NotNull final Function2<? super ResponseState, ? super Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        String plainString = C33129mqd.EZpvd(str3).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        AbstractC58185ywX<Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>> abstractC58185ywXOLrzqt = C23566iBc.EZpvd.OLrzqt(new InvestUniv3SubscribeReceiveReq(str2, plainString, investTokenWithAmount.getTokenAddress(), j, Boolean.valueOf(z), i, i2, str4, investTokenWithAmount.getTokenPrecision(), str, (String) null, (Boolean) null, (List) null, 7168, (DefaultConstructorMarker) null), 0, function1);
        final Function1 function12 = new Function1() { // from class: o.iBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeReceiveInfoHandle.getReceiveInfo$lambda$0(function2, investTokenWithAmount, str3, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.iBj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeReceiveInfoHandle.getReceiveInfo$lambda$2(function2, investTokenWithAmount, str3, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iBl
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
    public static final Unit getReceiveInfo$lambda$0(Function2 function2, InvestTokenWithAmount investTokenWithAmount, String str, Pair pair) {
        function2.invoke(new ResponseState(ResponseStateType.NORMAL, investTokenWithAmount.getTokenAddress(), str, 0, (String) null, 24, (DefaultConstructorMarker) null), pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReceiveInfo$lambda$2(Function2 function2, InvestTokenWithAmount investTokenWithAmount, String str, Throwable th) {
        if (th instanceof ResponseFailedException) {
            ResponseFailedException responseFailedException = (ResponseFailedException) th;
            function2.invoke(new ResponseState(ResponseStateType.SERVER_ERRRO, investTokenWithAmount.getTokenAddress(), str, responseFailedException.getCode(), responseFailedException.getErrorMsg()), null);
        } else {
            function2.invoke(new ResponseState(ResponseStateType.NET_ERRO, investTokenWithAmount.getTokenAddress(), str, 0, (String) null, 24, (DefaultConstructorMarker) null), null);
        }
        return Unit.INSTANCE;
    }

    public final void getReceiveInfo(@NotNull final InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq, @NotNull Function1<? super InvestGasPriceConfig, String> function1, @NotNull final Function2<? super ResponseState, ? super Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>, Unit> function2) {
        Intrinsics.checkNotNullParameter(investUniv3SubscribeReceiveReq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        AbstractC58185ywX<Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>> abstractC58185ywXOLrzqt = C23566iBc.EZpvd.OLrzqt(investUniv3SubscribeReceiveReq, 0, function1);
        final Function1 function12 = new Function1() { // from class: o.iBr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeReceiveInfoHandle.getReceiveInfo$lambda$4(function2, investUniv3SubscribeReceiveReq, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.iBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeReceiveInfoHandle.getReceiveInfo$lambda$6(function2, investUniv3SubscribeReceiveReq, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iBp
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
    public static final Unit getReceiveInfo$lambda$4(Function2 function2, InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq, Pair pair) {
        function2.invoke(new ResponseState(ResponseStateType.NORMAL, investUniv3SubscribeReceiveReq.getInputTokenAddress(), investUniv3SubscribeReceiveReq.getInputAmount(), 0, (String) null, 24, (DefaultConstructorMarker) null), pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReceiveInfo$lambda$6(Function2 function2, InvestUniv3SubscribeReceiveReq investUniv3SubscribeReceiveReq, Throwable th) {
        if (th instanceof ResponseFailedException) {
            ResponseFailedException responseFailedException = (ResponseFailedException) th;
            function2.invoke(new ResponseState(ResponseStateType.SERVER_ERRRO, investUniv3SubscribeReceiveReq.getInputTokenAddress(), investUniv3SubscribeReceiveReq.getInputAmount(), responseFailedException.getCode(), responseFailedException.getErrorMsg()), null);
        } else {
            function2.invoke(new ResponseState(ResponseStateType.NET_ERRO, investUniv3SubscribeReceiveReq.getInputTokenAddress(), investUniv3SubscribeReceiveReq.getInputAmount(), 0, (String) null, 24, (DefaultConstructorMarker) null), null);
        }
        return Unit.INSTANCE;
    }

    public final void startLoop(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.loopCallback = function0;
        this.handler.postDelayed(new Runnable() { // from class: o.iBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        }, this.currentIntervalTime);
    }

    public final void releaseLoop() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void executeCallback() {
        releaseLoop();
        this.handler.post(new Runnable() { // from class: o.iBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                InvestUniv3SubscribeReceiveInfoHandle.executeCallback$lambda$9(this.copydefault);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeCallback$lambda$9(InvestUniv3SubscribeReceiveInfoHandle investUniv3SubscribeReceiveInfoHandle) {
        Function0<Unit> function0 = investUniv3SubscribeReceiveInfoHandle.loopCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void dispose() {
        C33050mpD.OLrzqt(this.visibleKey);
    }
}
