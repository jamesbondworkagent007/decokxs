package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.model.tx.signdata.TronContractSignData;
import com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.cosmos.RSVSignatureRawValue;
import com.okinc.wallet.core.sign.tron.Contract;
import com.okinc.wallet.core.sign.tron.Parameter;
import com.okinc.wallet.core.sign.tron.SignedTransaction;
import com.okinc.wallet.core.sign.tron.TronRawData;
import com.okinc.wallet.core.sign.tron.TronSignData;
import com.okinc.wallet.core.sign.tron.Value;
import com.okinc.wallet.core.sign.utxo.RSV;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ceT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11987ceT extends AbstractC12442cmy {
    public final OKWTronSignContract<?> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11987ceT(@NotNull OKWTronSignContract<?> oKWTronSignContract) {
        super(oKWTronSignContract);
        Intrinsics.checkNotNullParameter(oKWTronSignContract, "");
        this.copydefault = oKWTronSignContract;
    }

    public final SignedTx AEQbTJ(@NotNull java.lang.String str) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (this.copydefault.QwvEab() != 2 || this.copydefault.OJuSTm().getBroadcastDelegate() == null) {
            java.lang.String expiration = this.copydefault.DGOPHZ().getExpiration();
            if (expiration != null) {
                str2 = expiration;
            }
        } else {
            str2 = "0";
        }
        JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(C54902xZo.KWHzl.EZpvd(str, AEQbTJ(), str2));
        java.lang.String asString = null;
        java.lang.String asString2 = (jsonObjectOLrzqt == null || (jsonElement3 = jsonObjectOLrzqt.get("hex")) == null) ? null : jsonElement3.getAsString();
        java.lang.String asString3 = (jsonObjectOLrzqt == null || (jsonElement2 = jsonObjectOLrzqt.get("txId")) == null) ? null : jsonElement2.getAsString();
        if (jsonObjectOLrzqt != null && (jsonElement = jsonObjectOLrzqt.get("signature")) != null) {
            asString = jsonElement.getAsString();
        }
        return new SignedTx(asString2, asString3, asString, (java.lang.String) null, 8, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Gson gsonCreate = new GsonBuilder().disableHtmlEscaping().create();
        TronSignData tronSignDataAEQbTJ = AEQbTJ();
        tronSignDataAEQbTJ.setSignature(str3 != null ? C56402yEa.EZpvd(str3) : null);
        tronSignDataAEQbTJ.setServiceCharge(((C8429bCZ) this.copydefault.QKudOq()).AEQbTJ());
        tronSignDataAEQbTJ.setTxHashValue(str2);
        tronSignDataAEQbTJ.setFullSignature(str != null ? C56402yEa.EZpvd(str) : null);
        java.lang.String json = gsonCreate.toJson(tronSignDataAEQbTJ);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final TxMessage EZpvd() {
        java.lang.String expiration;
        if (this.copydefault.QwvEab() == 2) {
            expiration = "0";
        } else {
            expiration = this.copydefault.DGOPHZ().getExpiration();
            if (expiration == null) {
                expiration = "";
            }
        }
        return C54902xZo.KWHzl.KWHzl(AEQbTJ(), expiration);
    }

    public final SignedTransaction KWHzl(@NotNull java.lang.String str, @NotNull RSV rsv) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rsv, "");
        return C54902xZo.KWHzl.EZpvd(this.copydefault.dHguZz().QKVWgx(), new RSVSignatureRawValue(rsv.getR(), rsv.getS(), rsv.getV(), str, null, 16, null));
    }

    public final TronSignData AEQbTJ() {
        java.util.List<TronContractSignData.Contract> contract;
        java.util.List<TronContractSignData.Contract> list;
        java.lang.String owner_address;
        TronContractSignData.Contract contract2;
        TronContractSignData.Parameter parameter;
        TronContractSignData.Value value;
        TronContractSignData.Value value2;
        TronContractSignData.Contract contract3;
        TronContractSignData.Parameter parameter2;
        TronContractSignData.Value value3;
        TronContractSignData.Contract contract4;
        TronContractSignData.Parameter parameter3;
        TronContractSignData.Value value4;
        TronContractSignData.Value value5;
        TronContractSignData.Value value6;
        java.lang.Boolean visible = ((TronContractSignData) this.copydefault.QVsKAR()).getVisible();
        java.lang.String txID = this.copydefault.gasjUx().getTxID();
        java.lang.String raw_data_hex = this.copydefault.gasjUx().getRaw_data_hex();
        java.util.List<java.lang.String> signature = this.copydefault.gasjUx().getSignature();
        TronContractSignData.RawData raw_data = this.copydefault.gasjUx().getRaw_data();
        java.lang.String ref_block_bytes = raw_data != null ? raw_data.getRef_block_bytes() : null;
        int iAhwBna = C33129mqd.AhwBna(this.copydefault.flVtFt());
        TronContractSignData.RawData raw_data2 = this.copydefault.gasjUx().getRaw_data();
        java.lang.String ref_block_hash = raw_data2 != null ? raw_data2.getRef_block_hash() : null;
        TronContractSignData.RawData raw_data3 = this.copydefault.gasjUx().getRaw_data();
        java.lang.Long fee_limit = raw_data3 != null ? raw_data3.getFee_limit() : null;
        TronContractSignData.RawData raw_data4 = this.copydefault.gasjUx().getRaw_data();
        java.lang.Long timestamp = raw_data4 != null ? raw_data4.getTimestamp() : null;
        TronContractSignData.RawData raw_data5 = this.copydefault.gasjUx().getRaw_data();
        java.lang.Long expiration = raw_data5 != null ? raw_data5.getExpiration() : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        TronContractSignData.RawData raw_data6 = ((TronContractSignData) this.copydefault.QVsKAR()).getRaw_data();
        java.util.List<TronContractSignData.Contract> contract5 = raw_data6 != null ? raw_data6.getContract() : null;
        TronContractSignData.RawData raw_data7 = this.copydefault.gasjUx().getRaw_data();
        if (raw_data7 != null && (contract = raw_data7.getContract()) != null) {
            int i = 0;
            for (java.util.Iterator it = contract.iterator(); it.hasNext(); it = it) {
                java.lang.Object next = it.next();
                if (i < 0) {
                    yDY.AYXKKw();
                }
                TronContractSignData.Contract contract6 = (TronContractSignData.Contract) next;
                java.lang.String type = contract6.getType();
                TronContractSignData.Parameter parameter4 = contract6.getParameter();
                java.lang.String type_url = parameter4 != null ? parameter4.getType_url() : null;
                TronContractSignData.Parameter parameter5 = contract6.getParameter();
                java.lang.Long call_value = (parameter5 == null || (value6 = parameter5.getValue()) == null) ? null : value6.getCall_value();
                TronContractSignData.Parameter parameter6 = contract6.getParameter();
                java.lang.Long amount = (parameter6 == null || (value5 = parameter6.getValue()) == null) ? null : value5.getAmount();
                java.lang.String contract_address = (contract5 == null || (contract4 = contract5.get(i)) == null || (parameter3 = contract4.getParameter()) == null || (value4 = parameter3.getValue()) == null) ? null : value4.getContract_address();
                java.lang.String to_address = (contract5 == null || (contract3 = contract5.get(i)) == null || (parameter2 = contract3.getParameter()) == null || (value3 = parameter2.getValue()) == null) ? null : value3.getTo_address();
                TronContractSignData.Parameter parameter7 = contract6.getParameter();
                java.lang.String data = (parameter7 == null || (value2 = parameter7.getValue()) == null) ? null : value2.getData();
                if (contract5 == null || (contract2 = contract5.get(i)) == null || (parameter = contract2.getParameter()) == null || (value = parameter.getValue()) == null) {
                    list = contract5;
                    owner_address = null;
                } else {
                    owner_address = value.getOwner_address();
                    list = contract5;
                }
                arrayList.add(new Contract(new Parameter(type_url, new Value(call_value, amount, contract_address, to_address, data, owner_address)), type));
                i++;
                contract5 = list;
            }
        }
        return new TronSignData(new TronRawData(arrayList, expiration, fee_limit, ref_block_bytes, java.lang.Integer.valueOf(iAhwBna), ref_block_hash, timestamp), raw_data_hex, signature, txID, visible, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, 224, (DefaultConstructorMarker) null);
    }
}
