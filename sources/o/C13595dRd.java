package o;

import com.okinc.business.defi.jsbridge.RechargeMessageData;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dRd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13595dRd extends AbstractC57329ygP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "window";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        java.lang.Integer addressType;
        java.lang.Boolean addCustomToken;
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        android.content.Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
        if (contextAEQbTJ instanceof AbstractActivityC33041mov) {
            java.lang.String str = message.data;
            Intrinsics.checkNotNullExpressionValue(str, "");
            RechargeMessageData rechargeMessageData = (RechargeMessageData) C33490mxT.EZpvd(str, RechargeMessageData.class);
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(rechargeMessageData != null ? rechargeMessageData.getChainId() : null);
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(rechargeMessageData != null ? rechargeMessageData.getTokenAddress() : null);
            java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(rechargeMessageData != null ? rechargeMessageData.getScene() : null);
            java.lang.String str2 = message.data;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            RechargeMessageData rechargeMessageData2 = (RechargeMessageData) C33490mxT.EZpvd(str2, RechargeMessageData.class);
            java.util.List<java.lang.String> blackList = rechargeMessageData2 != null ? rechargeMessageData2.getBlackList() : null;
            java.lang.String str3 = message.data;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            RechargeMessageData rechargeMessageData3 = (RechargeMessageData) C33490mxT.EZpvd(str3, RechargeMessageData.class);
            java.util.List<java.lang.String> whiteList = rechargeMessageData3 != null ? rechargeMessageData3.getWhiteList() : null;
            java.lang.String str4 = message.data;
            Intrinsics.checkNotNullExpressionValue(str4, "");
            RechargeMessageData rechargeMessageData4 = (RechargeMessageData) C33490mxT.EZpvd(str4, RechargeMessageData.class);
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class), (AbstractActivityC33041mov) contextAEQbTJ, new WalletRechargeBean(strGEmmrt, strGEmmrt2, java.lang.String.valueOf(rechargeMessageData != null ? rechargeMessageData.getBizSource() : null), strGEmmrt3, (java.util.ArrayList) blackList, (java.util.ArrayList) whiteList, (rechargeMessageData4 == null || (addCustomToken = rechargeMessageData4.getAddCustomToken()) == null) ? false : addCustomToken.booleanValue(), C33129mqd.gEmmrt(rechargeMessageData != null ? rechargeMessageData.getTip() : null), (rechargeMessageData == null || (addressType = rechargeMessageData.getAddressType()) == null) ? -1 : addressType.intValue()), 0, new Function1() { // from class: o.dRe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13595dRd.AEQbTJ(interfaceC57336ygW, message, (WalletRechargeResult) obj);
                }
            }, 4, null);
            return;
        }
        interfaceC57336ygW.copydefault(message, "fail");
    }

    public static final Unit AEQbTJ(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, WalletRechargeResult walletRechargeResult) {
        Intrinsics.checkNotNullParameter(walletRechargeResult, "");
        interfaceC57336ygW.OLrzqt(message, C12764ctD.OLrzqt.AEQbTJ(C56423yEv.EZpvd(C56390yDp.OLrzqt("result", java.lang.Boolean.valueOf(walletRechargeResult.isSubmit())))));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("showRechargePage", "web3/wallet/js/showRechargePage");
    }
}
