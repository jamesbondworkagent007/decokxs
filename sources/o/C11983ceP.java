package o;

import com.okinc.business.defi.api.model.tx.signdata.TronApprovalSignData;
import com.okinc.business.defi.api.model.tx.signdata.TronContractSignData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.tron.TronGenerateUnsignedContract;
import com.okinc.wallet.core.sign.tron.TronSignContract;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ceP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11983ceP extends AbstractC12442cmy {
    public final java.lang.String KWHzl;
    public final C11925cdK OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11983ceP(@NotNull C11925cdK c11925cdK) {
        super(c11925cdK);
        Intrinsics.checkNotNullParameter(c11925cdK, "");
        this.OLrzqt = c11925cdK;
        this.KWHzl = "approve(address,uint256)";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final SignedTx EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54902xZo c54902xZo = C54902xZo.KWHzl;
        TronContractSignData.Value valueFvQaOB = this.OLrzqt.fvQaOB();
        java.lang.String owner_address = valueFvQaOB != null ? valueFvQaOB.getOwner_address() : null;
        java.lang.String str2 = owner_address == null ? "" : owner_address;
        java.lang.String approvalAddress = ((TronApprovalSignData) this.OLrzqt.QVsKAR()).getApprovalAddress();
        java.lang.String str3 = approvalAddress == null ? "" : approvalAddress;
        TronContractSignData.Value valueFvQaOB2 = this.OLrzqt.fvQaOB();
        java.lang.String contract_address = valueFvQaOB2 != null ? valueFvQaOB2.getContract_address() : null;
        java.lang.String str4 = contract_address == null ? "" : contract_address;
        java.lang.String str5 = this.KWHzl;
        java.lang.String feelimit = this.OLrzqt.DGOPHZ().getFeelimit();
        java.lang.String strConvertToBigIntegerString$default = feelimit != null ? C54862xYb.convertToBigIntegerString$default(feelimit, false, (RoundingMode) null, 3, (java.lang.Object) null) : null;
        java.lang.String ref_block_number = this.OLrzqt.DGOPHZ().getRef_block_number();
        java.lang.String strConvertToBigIntegerString$default2 = ref_block_number != null ? C54862xYb.convertToBigIntegerString$default(ref_block_number, false, (RoundingMode) null, 3, (java.lang.Object) null) : null;
        java.lang.String ref_block_bytes = this.OLrzqt.DGOPHZ().getRef_block_bytes();
        java.lang.String str6 = ref_block_bytes == null ? "" : ref_block_bytes;
        java.lang.String strFlVtFt = this.OLrzqt.flVtFt();
        java.lang.String ref_block_hash = this.OLrzqt.DGOPHZ().getRef_block_hash();
        java.lang.String str7 = ref_block_hash == null ? "" : ref_block_hash;
        java.lang.String timestamp = this.OLrzqt.DGOPHZ().getTimestamp();
        java.lang.String str8 = timestamp == null ? "" : timestamp;
        java.lang.String expiration = this.OLrzqt.DGOPHZ().getExpiration();
        java.lang.String strAEQbTJ = c54902xZo.AEQbTJ(new TronSignContract(str, str2, str3, str4, str5, "0", strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, str6, strFlVtFt, str7, str8, expiration != null ? expiration : ""));
        return new SignedTx(strAEQbTJ, xYW.AEQbTJ.OLrzqt(strAEQbTJ, this.OLrzqt.dHguZz().QKVWgx()), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final TxMessage copydefault() {
        C54902xZo c54902xZo = C54902xZo.KWHzl;
        TronContractSignData.Value valueFvQaOB = this.OLrzqt.fvQaOB();
        java.lang.String owner_address = valueFvQaOB != null ? valueFvQaOB.getOwner_address() : null;
        java.lang.String str = owner_address == null ? "" : owner_address;
        java.lang.String approvalAddress = ((TronApprovalSignData) this.OLrzqt.QVsKAR()).getApprovalAddress();
        java.lang.String str2 = approvalAddress == null ? "" : approvalAddress;
        TronContractSignData.Value valueFvQaOB2 = this.OLrzqt.fvQaOB();
        java.lang.String contract_address = valueFvQaOB2 != null ? valueFvQaOB2.getContract_address() : null;
        java.lang.String str3 = contract_address == null ? "" : contract_address;
        java.lang.String str4 = this.KWHzl;
        java.lang.String feelimit = this.OLrzqt.DGOPHZ().getFeelimit();
        java.lang.String strConvertToBigIntegerString$default = feelimit != null ? C54862xYb.convertToBigIntegerString$default(feelimit, false, (RoundingMode) null, 3, (java.lang.Object) null) : null;
        java.lang.String ref_block_number = this.OLrzqt.DGOPHZ().getRef_block_number();
        java.lang.String strConvertToBigIntegerString$default2 = ref_block_number != null ? C54862xYb.convertToBigIntegerString$default(ref_block_number, false, (RoundingMode) null, 3, (java.lang.Object) null) : null;
        java.lang.String ref_block_bytes = this.OLrzqt.DGOPHZ().getRef_block_bytes();
        java.lang.String str5 = ref_block_bytes == null ? "" : ref_block_bytes;
        java.lang.String strFlVtFt = this.OLrzqt.flVtFt();
        java.lang.String ref_block_hash = this.OLrzqt.DGOPHZ().getRef_block_hash();
        java.lang.String str6 = ref_block_hash == null ? "" : ref_block_hash;
        java.lang.String timestamp = this.OLrzqt.DGOPHZ().getTimestamp();
        java.lang.String str7 = timestamp == null ? "" : timestamp;
        java.lang.String expiration = this.OLrzqt.DGOPHZ().getExpiration();
        return c54902xZo.AEQbTJ(new TronGenerateUnsignedContract(str, str2, str3, str4, "0", strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, str5, strFlVtFt, str6, str7, expiration == null ? "" : expiration));
    }
}
