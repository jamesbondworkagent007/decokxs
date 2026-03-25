package com.okinc.business.invest_biz.data.logic;

import android.os.Handler;
import android.os.Looper;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestRedeemReceiveReq;
import com.okinc.business.invest_biz.data.logic.InvestSupplyHandle;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C25582izT;
import o.C27544jxG;
import o.C33050mpD;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSupplyHandle {
    public static final int $stable = 8;
    private Function2<? super MySupplyResponseState, ? super InvestTokenWithAmount, Unit> callBack;
    private int investmentCategory;
    private long investmentId;
    private boolean isLooping;
    private Handler handler = new Handler(Looper.getMainLooper());
    private long currentIntervalTime = 60000;
    private Object visibleKey = new Object();
    private String walletId = "";
    private String walletAddress = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void initData(@NotNull String str, @NotNull String str2, long j, int i, @NotNull Function2<? super MySupplyResponseState, ? super InvestTokenWithAmount, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.walletId = str;
        this.walletAddress = str2;
        this.investmentId = j;
        this.investmentCategory = i;
        this.callBack = function2;
    }

    private final void getMySupply(String str, String str2, long j, int i) {
        AbstractC58185ywX<InvestRedeemReceiveInfo> abstractC58185ywXCopydefault = C25582izT.OLrzqt.copydefault(new InvestRedeemReceiveReq(str, str2, "", j, i, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (Integer) null, (String) null, (Boolean) null, (String) null, (Long) null, 32736, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.iAp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSupplyHandle.getMySupply$lambda$0(this.AEQbTJ, (InvestRedeemReceiveInfo) obj);
            }
        };
        InterfaceC58227yxM<? super InvestRedeemReceiveInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iAo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSupplyHandle.getMySupply$lambda$2(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.visibleKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMySupply$lambda$0(InvestSupplyHandle investSupplyHandle, InvestRedeemReceiveInfo investRedeemReceiveInfo) {
        investSupplyHandle.isLooping = false;
        startLoop$default(investSupplyHandle, false, 1, null);
        Function2<? super MySupplyResponseState, ? super InvestTokenWithAmount, Unit> function2 = investSupplyHandle.callBack;
        if (function2 != null) {
            function2.invoke(new MySupplyResponseState(MySupplyResponseStateType.NORMAL, 0, (String) null, 6, (DefaultConstructorMarker) null), investRedeemReceiveInfo.getMySupply());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMySupply$lambda$2(InvestSupplyHandle investSupplyHandle, Throwable th) {
        investSupplyHandle.isLooping = false;
        startLoop$default(investSupplyHandle, false, 1, null);
        if (th instanceof ResponseFailedException) {
            Function2<? super MySupplyResponseState, ? super InvestTokenWithAmount, Unit> function2 = investSupplyHandle.callBack;
            if (function2 != null) {
                ResponseFailedException responseFailedException = (ResponseFailedException) th;
                function2.invoke(new MySupplyResponseState(MySupplyResponseStateType.SERVER_ERRRO, responseFailedException.getCode(), responseFailedException.getErrorMsg()), null);
            }
        } else if (th instanceof OKServerException) {
            Function2<? super MySupplyResponseState, ? super InvestTokenWithAmount, Unit> function22 = investSupplyHandle.callBack;
            if (function22 != null) {
                OKServerException oKServerException = (OKServerException) th;
                function22.invoke(new MySupplyResponseState(MySupplyResponseStateType.SERVER_ERRRO, oKServerException.getCode(), C27544jxG.copydefault(oKServerException)), null);
            }
        } else {
            Function2<? super MySupplyResponseState, ? super InvestTokenWithAmount, Unit> function23 = investSupplyHandle.callBack;
            if (function23 != null) {
                function23.invoke(new MySupplyResponseState(MySupplyResponseStateType.NET_ERRO, 0, (String) null, 6, (DefaultConstructorMarker) null), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void startLoop$default(InvestSupplyHandle investSupplyHandle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        investSupplyHandle.startLoop(z);
    }

    public final void startLoop(boolean z) {
        if (this.isLooping) {
            return;
        }
        this.isLooping = true;
        if (z) {
            this.handler.post(new Runnable() { // from class: o.iAm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    InvestSupplyHandle.startLoop$lambda$4(this.EZpvd);
                }
            });
        } else {
            this.handler.postDelayed(new Runnable() { // from class: o.iAr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    InvestSupplyHandle.startLoop$lambda$5(this.copydefault);
                }
            }, this.currentIntervalTime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLoop$lambda$4(InvestSupplyHandle investSupplyHandle) {
        investSupplyHandle.getMySupply(investSupplyHandle.walletId, investSupplyHandle.walletAddress, investSupplyHandle.investmentId, investSupplyHandle.investmentCategory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLoop$lambda$5(InvestSupplyHandle investSupplyHandle) {
        investSupplyHandle.getMySupply(investSupplyHandle.walletId, investSupplyHandle.walletAddress, investSupplyHandle.investmentId, investSupplyHandle.investmentCategory);
    }

    public final void releaseLoop() {
        this.isLooping = false;
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void dispose() {
        C33050mpD.OLrzqt(this.visibleKey);
    }
}
