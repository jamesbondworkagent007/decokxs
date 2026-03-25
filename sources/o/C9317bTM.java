package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.evm.AccountTokenTransaction;
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.okinc.wallet.core.sign.evm.OpCalDataTransaction;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bTM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9317bTM extends AbstractC12442cmy {
    public final C8885bLE KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9317bTM(@NotNull C8885bLE c8885bLE) {
        super(c8885bLE);
        Intrinsics.checkNotNullParameter(c8885bLE, "");
        this.KWHzl = c8885bLE;
    }

    public final java.lang.String AEQbTJ() {
        OpCalDataTransaction opCalDataTransaction;
        long jFetchVPNInfo = this.KWHzl.dHguZz().fetchVPNInfo();
        SignParams signParams = new SignParams(jFetchVPNInfo, jFetchVPNInfo, this.KWHzl.fHqPtx().AuCTel() ? null : this.KWHzl.fHqPtx().fJNWhG(), null, null, null, 0, null, false, false, null, 2040, null);
        if (this.KWHzl.fHqPtx().AuCTel()) {
            opCalDataTransaction = new OpCalDataTransaction(this.KWHzl.zLjUOn(), C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, WalletImportError.ERROR_CODE_AA_EXIST, (DefaultConstructorMarker) null);
        } else {
            opCalDataTransaction = new OpCalDataTransaction(this.KWHzl.zLjUOn(), C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null), (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null), this.KWHzl.fHqPtx().OLrzqt(), (java.lang.String) null, 72, (DefaultConstructorMarker) null);
        }
        return xYZ.KWHzl.copydefault(signParams, opCalDataTransaction);
    }

    public final SignedTx KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = xYZ.KWHzl.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), KWHzl());
        if (strOLrzqt != null) {
            return new SignedTx(strOLrzqt, xYW.AEQbTJ.AEQbTJ(strOLrzqt, this.KWHzl.dHguZz().QKVWgx()), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null);
        }
        return null;
    }

    public final BaseAccountTransaction KWHzl() {
        if (this.KWHzl.fHqPtx().AuCTel()) {
            return copydefault();
        }
        return EZpvd();
    }

    public final AccountTransaction copydefault() {
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(this.KWHzl.V_(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        int iIwGUEr = this.KWHzl.iwGUEr();
        java.lang.String strConvertToBigIntegerString$default5 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String priorityFee$default = C9311bTG.getPriorityFee$default(this.KWHzl.DXXBbs(), 0, 1, null);
        return new AccountTransaction(strZLjUOn, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, strConvertToBigIntegerString$default2, (java.lang.String) null, iIwGUEr, strConvertToBigIntegerString$default5, priorityFee$default != null ? C54862xYb.convertToBigIntegerString$default(priorityFee$default, false, (RoundingMode) null, 3, (java.lang.Object) null) : null, this.KWHzl.QKVWgx(), (java.lang.String) null, 1024, (DefaultConstructorMarker) null);
    }

    public final AccountTokenTransaction EZpvd() {
        java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(this.KWHzl.V_(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = Intrinsics.EZpvd(this.KWHzl.fHqPtx().WS(), java.lang.Boolean.TRUE) ? C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null) : "0";
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strOLrzqt = this.KWHzl.fHqPtx().OLrzqt();
        java.lang.String address = this.KWHzl.fERRXa().getAddress();
        int iIwGUEr = this.KWHzl.iwGUEr();
        java.lang.String strConvertToBigIntegerString$default5 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default6 = C54862xYb.convertToBigIntegerString$default(C9311bTG.getPriorityFee$default(this.KWHzl.DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strQKVWgx = this.KWHzl.QKVWgx();
        java.lang.String strConvertToBigIntegerString$default7 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strKWHzl = this.KWHzl.KWHzl();
        if (strKWHzl == null || strKWHzl.length() == 0) {
            strKWHzl = "";
        } else if (!C59449zhJ.AYXKKw(strKWHzl, EIP1271Verifier.hexPrefix, true)) {
            strKWHzl = EIP1271Verifier.hexPrefix + strKWHzl;
        }
        return new AccountTokenTransaction(strZLjUOn, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, strConvertToBigIntegerString$default2, iIwGUEr, strConvertToBigIntegerString$default5, strConvertToBigIntegerString$default6, strQKVWgx, strKWHzl, strOLrzqt, strConvertToBigIntegerString$default7, address);
    }
}
