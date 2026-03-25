package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22809hmP extends AbstractC22818hmY {

    /* JADX INFO: renamed from: o.hmP$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ApproveStatus.values().length];
            try {
                iArr[ApproveStatus.APPROVING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ApproveStatus.CANCEL_APPROVING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22809hmP(@NotNull AbstractC23101hrq abstractC23101hrq) {
        super(abstractC23101hrq);
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
    }

    @Override // o.AbstractC22818hmY
    public void KWHzl() {
        java.lang.String decimals;
        java.lang.String data;
        SwapState swapState;
        DexQuoteBridgeVO dexQuoteBridgeVOBridge;
        DeFiPlatformTokenApprovalInfo dexMultiTokenAllowanceOut;
        TradeInputGroup data2;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data3;
        EditTextData editData;
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(gEmmrt().ffGIBT()).fARcdN().valueOf();
        java.lang.Boolean boolValueOf = interfaceC9738bbJValueOf != null ? java.lang.Boolean.valueOf(interfaceC9738bbJValueOf.getFieldNames()) : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = gEmmrt().QUSxYX().copydefault();
        if (dexMultiTokenInfoBeanCopydefault == null || (decimals = dexMultiTokenInfoBeanCopydefault.getDecimals()) == null) {
            decimals = "0";
        }
        ConsumeData<TradeInputGroup> value = gEmmrt().dmfpNf().getValue();
        if (value == null || (data2 = value.getData()) == null || (fromData = data2.getFromData()) == null || (data3 = fromData.getData()) == null || (editData = data3.getEditData()) == null || (data = editData.getData()) == null) {
            data = "";
        }
        QuotePriceRes quotePriceResAxsJAYsNCnLh = gEmmrt().AxsJAYsNCnLh();
        ApproveStatusGroup approveStatusGroupCheckApproveStatusGroupForSwap = (quotePriceResAxsJAYsNCnLh == null || (dexQuoteBridgeVOBridge = quotePriceResAxsJAYsNCnLh.bridge()) == null || (dexMultiTokenAllowanceOut = dexQuoteBridgeVOBridge.getDexMultiTokenAllowanceOut()) == null) ? null : dexMultiTokenAllowanceOut.checkApproveStatusGroupForSwap(decimals, data);
        if (approveStatusGroupCheckApproveStatusGroupForSwap != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (Intrinsics.EZpvd(boolValueOf, bool)) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = gEmmrt().QUSxYX().copydefault();
                boolean z = true;
                if (dexMultiTokenInfoBeanCopydefault2 != null && dexMultiTokenInfoBeanCopydefault2.isMainChainCoin() && !C22370heA.EZpvd(dexMultiTokenInfoBeanCopydefault2.getChainId())) {
                    gEmmrt().dHguZz().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
                    gEmmrt().fJNWhG().setValue(bool);
                    return;
                }
                if (!approveStatusGroupCheckApproveStatusGroupForSwap.getNeedApprove()) {
                    int i = Activity.OLrzqt[approveStatusGroupCheckApproveStatusGroupForSwap.getApproveStatus().ordinal()];
                    if (i == 1) {
                        gEmmrt().dHguZz().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, approveStatusGroupCheckApproveStatusGroupForSwap.isRegisterType() ? SwapState.REGISTERING : SwapState.APPROVING, true, false));
                        gEmmrt().fJNWhG().setValue(bool);
                        return;
                    } else if (i == 2) {
                        gEmmrt().dHguZz().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.CANCEL_APPROVING, true, false));
                        gEmmrt().fJNWhG().setValue(java.lang.Boolean.TRUE);
                        return;
                    } else {
                        gEmmrt().dHguZz().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
                        gEmmrt().fJNWhG().setValue(bool);
                        return;
                    }
                }
                if (approveStatusGroupCheckApproveStatusGroupForSwap.isRegisterType()) {
                    swapState = SwapState.REGISTER;
                } else if (approveStatusGroupCheckApproveStatusGroupForSwap.getApproveStatus() == ApproveStatus.APPROVED_NEED_CANCEL_APPROVE) {
                    swapState = SwapState.APPROVED_AND_NEED_CANCEL_APPROVE;
                } else if (approveStatusGroupCheckApproveStatusGroupForSwap.getApproveStatus() == ApproveStatus.CANCEL_APPROVING) {
                    swapState = SwapState.CANCEL_APPROVING;
                } else {
                    swapState = SwapState.APPROVE;
                }
                gEmmrt().dHguZz().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, swapState, true, false));
                MutableLiveData<java.lang.Boolean> mutableLiveDataFJNWhG = gEmmrt().fJNWhG();
                if (swapState != SwapState.APPROVED_AND_NEED_CANCEL_APPROVE && swapState != SwapState.CANCEL_APPROVING) {
                    z = false;
                }
                mutableLiveDataFJNWhG.setValue(java.lang.Boolean.valueOf(z));
                return;
            }
        }
        gEmmrt().isConnected().setApproveStatusGroup(null);
        gEmmrt().dHguZz().refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
    }
}
