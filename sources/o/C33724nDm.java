package o;

import com.okinc.business.web3pay.api.model.ClaimApiErrorType;
import com.okinc.business.web3pay.api.model.ClaimTransactionParams;
import com.okinc.okimcore.model.im.BaseOKPayMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33724nDm {
    public static final C33724nDm KWHzl = new C33724nDm();

    private C33724nDm() {
    }

    public final ClaimTransactionParams EZpvd(@NotNull OKMessage oKMessage, @NotNull BaseOKPayMessage baseOKPayMessage) {
        RelationInfo relationInfoKWHzl;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(baseOKPayMessage, "");
        java.lang.String paymentId = baseOKPayMessage.getPaymentId();
        java.lang.String str = paymentId == null ? "" : paymentId;
        java.lang.String senderUserId = oKMessage.getSenderUserId();
        ClaimApiErrorType claimApiErrorType = null;
        java.lang.String displayName$default = (senderUserId == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(senderUserId)) == null) ? null : C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null);
        java.lang.Integer status = baseOKPayMessage.getStatus();
        if (status != null && status.intValue() == 203) {
            claimApiErrorType = ClaimApiErrorType.TRANSACTION_HAS_DECLINED;
        } else if (status != null && status.intValue() == 103) {
            claimApiErrorType = ClaimApiErrorType.TRANSACTION_EXPIRED;
        }
        ClaimApiErrorType claimApiErrorType2 = claimApiErrorType;
        java.lang.String paymentSenderId = baseOKPayMessage.getPaymentSenderId();
        java.lang.String str2 = displayName$default == null ? "" : displayName$default;
        java.lang.String str3 = baseOKPayMessage.getAmount() + " " + baseOKPayMessage.getTokenType();
        java.lang.String senderMessage = baseOKPayMessage.getSenderMessage();
        java.lang.String str4 = senderMessage == null ? "" : senderMessage;
        java.lang.String usdValue = baseOKPayMessage.getUsdValue();
        java.lang.String str5 = usdValue == null ? "" : usdValue;
        java.lang.String chainIndex = baseOKPayMessage.getChainIndex();
        return new ClaimTransactionParams(str, str2, str3, str4, str5, chainIndex == null ? "" : chainIndex, paymentSenderId == null ? "" : paymentSenderId, claimApiErrorType2);
    }
}
