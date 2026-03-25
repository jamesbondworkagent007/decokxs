package o;

import androidx.collection.ArrayMapKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexGasStationFeeDetailVOX;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22052hWc extends AbstractC59533zio<C22029hVg, StateListAnimator> {
    public final java.lang.String AEQbTJ;

    public C22052hWc(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21480hAy c21480hAyAEQbTJ = C21480hAy.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21480hAyAEQbTJ, "");
        return new StateListAnimator(c21480hAyAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull C22029hVg c22029hVg) {
        java.lang.String fromTokenSymbol;
        DexBridgeOrderInfoVo bridgeOrderInfoVo;
        java.lang.String bridgeName;
        DexBridgeOrderInfoVo bridgeOrderInfoVo2;
        java.lang.String bridgeName2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(c22029hVg, "");
        OrderDetailBean orderDetailBeanKWHzl = c22029hVg.KWHzl();
        stateListAnimator.copydefault().copydefault.OLrzqt(false);
        java.lang.String strCopydefault = c22029hVg.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_FROM.getValue())) {
            C22689hkB c22689hkB = C22689hkB.EZpvd;
            java.lang.String strEZpvd = c22689hkB.EZpvd(orderDetailBeanKWHzl);
            java.lang.String strOLrzqt = c22689hkB.OLrzqt(c22029hVg.KWHzl());
            stateListAnimator.copydefault().copydefault.setContentDescription("web3_dex_history_networkFee_cell");
            if (c22029hVg.KWHzl().isFreeGas()) {
                KWHzl(c22029hVg, stateListAnimator, strOLrzqt);
                return;
            }
            final DexGasStationFeeDetailVOX dexGasStationFeeDetailVO = c22029hVg.KWHzl().getDexGasStationFeeDetailVO();
            if (dexGasStationFeeDetailVO != null) {
                final hWP hwp = stateListAnimator.copydefault().copydefault;
                hwp.OLrzqt(true);
                hwp.setOnTipClickListener(new Function0() { // from class: o.hWd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C22052hWc.KWHzl(hwp, dexGasStationFeeDetailVO);
                    }
                });
            } else {
                stateListAnimator.copydefault().copydefault.OLrzqt(false);
                Unit unit = Unit.INSTANCE;
            }
            boolean z = c22029hVg.KWHzl().isCrossChainSwap() || c22029hVg.KWHzl().isBridge();
            hWP hwp2 = stateListAnimator.copydefault().copydefault;
            java.lang.String strOLrzqt2 = c22689hkB.OLrzqt(this.AEQbTJ, c22029hVg.KWHzl(), false);
            java.lang.String strCopydefault2 = c22689hkB.copydefault(this.AEQbTJ, c22029hVg.KWHzl());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd) && z) {
                str = "(" + strEZpvd + ")";
            }
            hwp2.setNetworkInfo(strOLrzqt, strOLrzqt2, strCopydefault2, str, (32 & 16) != 0 ? false : !z || strEZpvd.length() == 0, (32 & 32) != 0 ? false : false);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_FEE_BRIDGE.getValue())) {
            DexMultiChildOrderInfoVo bridgeChildOrderDetailVo = c22029hVg.KWHzl().getBridgeChildOrderDetailVo();
            if (bridgeChildOrderDetailVo != null && (bridgeOrderInfoVo2 = bridgeChildOrderDetailVo.getBridgeOrderInfoVo()) != null && (bridgeName2 = bridgeOrderInfoVo2.getBridgeName()) != null) {
                str = bridgeName2;
            }
            java.lang.String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.Ohcwxs, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt(TabTitleInfo.KEY_BRIDGE, str)));
            stateListAnimator.copydefault().copydefault.setContentDescription("web3_dex_history_crossBridgeFee_cell");
            stateListAnimator.copydefault().copydefault.setNetworkInfo(strKWHzl, C22689hkB.EZpvd.AEQbTJ(this.AEQbTJ, c22029hVg.KWHzl(), true), "", "", true, true);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_BRIDGE.getValue())) {
            DexMultiChildOrderInfoVo bridgeChildOrderDetailVo2 = c22029hVg.KWHzl().getBridgeChildOrderDetailVo();
            if (bridgeChildOrderDetailVo2 != null && (bridgeOrderInfoVo = bridgeChildOrderDetailVo2.getBridgeOrderInfoVo()) != null && (bridgeName = bridgeOrderInfoVo.getBridgeName()) != null) {
                str = bridgeName;
            }
            stateListAnimator.copydefault().copydefault.setNetworkInfo(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.isTimeProfileEmpty, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt(TabTitleInfo.KEY_BRIDGE, str))), C22689hkB.EZpvd.copydefault(c22029hVg.KWHzl()), "", "", true, true);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_TO.getValue())) {
            java.lang.String strKWHzl2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getFillInIntent, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("chainName", orderDetailBeanKWHzl.getToChainName())));
            C22689hkB c22689hkB2 = C22689hkB.EZpvd;
            c22689hkB2.KWHzl(orderDetailBeanKWHzl);
            stateListAnimator.copydefault().copydefault.setNetworkInfo(strKWHzl2, c22689hkB2.copydefault(this.AEQbTJ, c22029hVg.KWHzl(), false), orderDetailBeanKWHzl.getToChainNativeTokenSymbol(), "", (32 & 16) != 0 ? false : true, (32 & 32) != 0 ? false : false);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_OTHER.getValue())) {
            hWP hwp3 = stateListAnimator.copydefault().copydefault;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.gmHjFq);
            java.lang.String strKWHzl3 = C22689hkB.EZpvd.KWHzl(this.AEQbTJ, orderDetailBeanKWHzl, false);
            DexMultiChildOrderInfoVo bridgeChildOrderDetailVo3 = orderDetailBeanKWHzl.getBridgeChildOrderDetailVo();
            hwp3.setNetworkInfo(strAYXKKw, strKWHzl3, (bridgeChildOrderDetailVo3 == null || (fromTokenSymbol = bridgeChildOrderDetailVo3.getFromTokenSymbol()) == null) ? "" : fromTokenSymbol, "", (32 & 16) != 0 ? false : true, (32 & 32) != 0 ? false : false);
        }
    }

    public static final Unit KWHzl(hWP hwp, DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX) {
        hwp.copydefault(dexGasStationFeeDetailVOX);
        return Unit.INSTANCE;
    }

    public final void KWHzl(C22029hVg c22029hVg, StateListAnimator stateListAnimator, java.lang.String str) {
        if (c22029hVg.KWHzl().isFreeGas() || Intrinsics.EZpvd((java.lang.Object) c22029hVg.KWHzl().getStatus(), (java.lang.Object) "1") || Intrinsics.EZpvd((java.lang.Object) c22029hVg.KWHzl().getStatus(), (java.lang.Object) "0")) {
            stateListAnimator.copydefault().copydefault.setFreeGasNetworkInfo(str, C33070mpX.AYXKKw(C23274hvD.Fragment.LocalActivityResultRegistryOwnerLocalComposition1), C52761wXj.ActionBar.DCUTEI);
        } else {
            hWP.setFreeGasNetworkInfo$default(stateListAnimator.copydefault().copydefault, str, "--", 0, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.hWc$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C21480hAy copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21480hAy copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C21480hAy c21480hAy) {
            super(c21480hAy.getRoot());
            Intrinsics.checkNotNullParameter(c21480hAy, "");
            this.copydefault = c21480hAy;
        }
    }
}
