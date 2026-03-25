package o;

import com.google.gson.Gson;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.cosmos.RSVSignatureRawValue;
import com.okinc.wallet.core.sign.tron.BaseTronTransaction;
import com.okinc.wallet.core.sign.tron.SignedTransaction;
import com.okinc.wallet.core.sign.tron.TronTokenTransaction;
import com.okinc.wallet.core.sign.tron.TronTransaction;
import com.okinc.wallet.core.sign.utxo.RSV;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ceX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11991ceX extends AbstractC12442cmy {
    public final C12010ceq KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11991ceX(@NotNull C12010ceq c12010ceq) {
        super(c12010ceq);
        Intrinsics.checkNotNullParameter(c12010ceq, "");
        this.KWHzl = c12010ceq;
    }

    public final SignedTx KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = C54902xZo.KWHzl.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), KWHzl());
        return new SignedTx(strOLrzqt, xYW.AEQbTJ.OLrzqt(strOLrzqt, this.KWHzl.dHguZz().QKVWgx()), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null);
    }

    public final TxMessage copydefault() {
        C10854bwM c10854bwMFHqPtx = this.KWHzl.fHqPtx();
        return C54902xZo.KWHzl.EZpvd(this.KWHzl.dHguZz().QKVWgx(), c10854bwMFHqPtx.AuCTel() ? null : c10854bwMFHqPtx.fJNWhG(), KWHzl());
    }

    public final SignedTransaction EZpvd(@NotNull java.lang.String str, @NotNull RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return C54902xZo.KWHzl.EZpvd(this.KWHzl.dHguZz().QKVWgx(), new RSVSignatureRawValue(rsv.getR(), rsv.getS(), rsv.getV(), str, null, 16, null));
    }

    public final LedgerSignHelper.TronTransactionParam.TronUnsignedTx AEQbTJ() {
        java.lang.Object objFromJson = new Gson().fromJson(C54902xZo.KWHzl.KWHzl(this.KWHzl.dHguZz().fetchVPNInfo(), v_(), KWHzl()), (java.lang.Class<java.lang.Object>) LedgerSignHelper.TronTransactionParam.TronUnsignedTx.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        return (LedgerSignHelper.TronTransactionParam.TronUnsignedTx) objFromJson;
    }

    public final BaseTronTransaction KWHzl() {
        if (this.KWHzl.fHqPtx().AuCTel()) {
            java.lang.String address = this.KWHzl.fERRXa().getAddress();
            java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String strZuBGHE = this.KWHzl.zuBGHE();
            java.lang.String ref_block_bytes = this.KWHzl.OcIXYQ().getRef_block_bytes();
            java.lang.String str = ref_block_bytes == null ? "" : ref_block_bytes;
            java.lang.String ref_block_hash = this.KWHzl.OcIXYQ().getRef_block_hash();
            java.lang.String str2 = ref_block_hash == null ? "" : ref_block_hash;
            java.lang.String ref_block_number = this.KWHzl.OcIXYQ().getRef_block_number();
            java.lang.String str3 = ref_block_number == null ? "" : ref_block_number;
            java.lang.String timestamp = this.KWHzl.OcIXYQ().getTimestamp();
            java.lang.String str4 = timestamp == null ? "" : timestamp;
            java.lang.String expiration = this.KWHzl.OcIXYQ().getExpiration();
            return new TronTransaction(address, strZLjUOn, strConvertToBigIntegerString$default, str, strZuBGHE, str2, str3, str4, expiration == null ? "" : expiration, this.KWHzl.OcIXYQ().getFee());
        }
        java.lang.String address2 = this.KWHzl.fERRXa().getAddress();
        java.lang.String strZLjUOn2 = this.KWHzl.zLjUOn();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String ref_block_bytes2 = this.KWHzl.OcIXYQ().getRef_block_bytes();
        java.lang.String str5 = ref_block_bytes2 == null ? "" : ref_block_bytes2;
        java.lang.String strZuBGHE2 = this.KWHzl.zuBGHE();
        java.lang.String ref_block_hash2 = this.KWHzl.OcIXYQ().getRef_block_hash();
        java.lang.String str6 = ref_block_hash2 == null ? "" : ref_block_hash2;
        java.lang.String ref_block_number2 = this.KWHzl.OcIXYQ().getRef_block_number();
        java.lang.String str7 = ref_block_number2 == null ? "" : ref_block_number2;
        java.lang.String timestamp2 = this.KWHzl.OcIXYQ().getTimestamp();
        java.lang.String str8 = timestamp2 == null ? "" : timestamp2;
        java.lang.String expiration2 = this.KWHzl.OcIXYQ().getExpiration();
        java.lang.String str9 = expiration2 == null ? "" : expiration2;
        java.lang.String fee = this.KWHzl.OcIXYQ().getFee();
        java.lang.String asset = this.KWHzl.OcIXYQ().getAsset();
        java.lang.String contractAddress = this.KWHzl.OcIXYQ().getContractAddress();
        java.lang.String feelimit = this.KWHzl.OcIXYQ().getFeelimit();
        java.lang.String trc = this.KWHzl.OcIXYQ().getTrc();
        return new TronTokenTransaction(address2, strZLjUOn2, strConvertToBigIntegerString$default2, str5, strZuBGHE2, str6, str7, str8, str9, fee, asset, contractAddress, feelimit, trc == null ? "" : trc);
    }
}
