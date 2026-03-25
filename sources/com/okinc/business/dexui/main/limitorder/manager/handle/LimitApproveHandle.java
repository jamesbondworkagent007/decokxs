package com.okinc.business.dexui.main.limitorder.manager.handle;

import android.graphics.drawable.Drawable;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DefiPlatformInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitApproveHandle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C22380heK;
import o.C22495hgT;
import o.C33050mpD;
import o.C55326xho;
import o.InterfaceC22432hfJ;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitApproveHandle {
    public static final int $stable = 8;
    private Object approve;
    private ApproveStatusGroup approveStatusGroup;
    private final C22495hgT viewModel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveStatusGroup getApproveStatusGroup() {
        return this.approveStatusGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApproveStatusGroup(ApproveStatusGroup approveStatusGroup) {
        this.approveStatusGroup = approveStatusGroup;
    }

    public LimitApproveHandle(@NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.viewModel = c22495hgT;
        this.approve = new Object();
    }

    public final void getUnApproveData(@NotNull String str, @NotNull final Function1<? super ApproveSwapData, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DefiChainInfo newProxyInstance = this.viewModel.getNewProxyInstance();
        C22495hgT c22495hgT = this.viewModel;
        if (c22495hgT.OcIXYQ() == null || c22495hgT.finit().AEQbTJ() == null || newProxyInstance == null) {
            return;
        }
        InterfaceC22432hfJ interfaceC22432hfJGEmmrt = C22380heK.OLrzqt.copydefault(c22495hgT.AxsJAYaxsJAY()).gEmmrt();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = c22495hgT.OcIXYQ();
        Intrinsics.copydefault(dexMultiTokenInfoBeanOcIXYQ);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = c22495hgT.QKudOq();
        Intrinsics.copydefault(dexMultiTokenInfoBeanQKudOq);
        Object objAEQbTJ = c22495hgT.finit().AEQbTJ();
        AbstractC58185ywX<ApproveSwapData> abstractC58185ywXKWHzl = interfaceC22432hfJGEmmrt.KWHzl(dexMultiTokenInfoBeanOcIXYQ, dexMultiTokenInfoBeanQKudOq, objAEQbTJ != null ? (DefiPlatformInfo) objAEQbTJ : new DefiPlatformInfo((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null), 2, str, newProxyInstance);
        final Function1 function12 = new Function1() { // from class: o.hLa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitApproveHandle.getUnApproveData$lambda$4$lambda$0(function1, (ApproveSwapData) obj);
            }
        };
        InterfaceC58227yxM<? super ApproveSwapData> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hLb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hLc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitApproveHandle.getUnApproveData$lambda$4$lambda$2((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hLe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function13.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.approve);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUnApproveData$lambda$4$lambda$0(Function1 function1, ApproveSwapData approveSwapData) {
        Intrinsics.copydefault(approveSwapData);
        function1.invoke(approveSwapData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUnApproveData$lambda$4$lambda$2(Throwable th) {
        C55326xho.toast$default(th.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        return Unit.INSTANCE;
    }

    public final void disposeApprove() {
        C33050mpD.OLrzqt(this.approve);
    }
}
