package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12207cib extends C12167cho {

    /* JADX INFO: renamed from: o.cib$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.List<? extends UTXOInfoResp>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C12167cho
    public java.lang.String QIZEnU() {
        return ExtJson.BRC20TYPE_TRANSFER;
    }

    @Override // o.C12167cho
    public int RXzakW() {
        return 4;
    }

    @Override // o.C12167cho
    public java.lang.String TarCU() {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public boolean q_() {
        super.q_();
        java.lang.String utxoListJson = ((FixedUTXOSignData) QVsKAR()).getUtxoListJson();
        EZpvd(utxoListJson != null ? (java.util.List) new Gson().fromJson(utxoListJson, new TaskDescription().getType()) : null);
        return true;
    }

    @Override // o.C12167cho, o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C12167cho, o.AbstractC8704bHj
    public C10854bwM fHqPtx() {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((FixedUTXOInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(((FixedUTXOSignData) QVsKAR()).getBatchBean())).getCoinId());
        return c10854bwMKWHzl == null ? dHguZz() : c10854bwMKWHzl;
    }

    @Override // o.C12167cho, o.AbstractC12102cgc
    public java.lang.String DNMMPQ() {
        return Ufzxmz();
    }

    @Override // o.AbstractC12102cgc, o.AbstractC11993ceZ
    public java.lang.Integer dvKsVJ() {
        return fHqPtx().QbewEr();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX DEBUG: Possible override for method o.cho.Ufzxmz()Lo/ywX; */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String Ufzxmz() {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.Iterator<T> it = ((FixedUTXOSignData) QVsKAR()).getBatchBean().iterator();
        BigDecimal bigDecimalKWHzl = bigDecimal;
        while (it.hasNext()) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, ((FixedUTXOInfo) it.next()).getCoinAmount());
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    public static /* synthetic */ OkUTXOTransaction.InputsAndOutputs getInputsAndOutputs$default(C12207cib c12207cib, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c12207cib.OLrzqt(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [o.bCW] */
    public final OkUTXOTransaction.InputsAndOutputs OLrzqt(boolean z) {
        java.lang.String strConvertToString$default;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.Iterator<T> it = copydefault(QKVWgx(), djSkpj()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) it.next();
            java.util.List<UtxoInfo> utxoList = uTXOInfoResp.getUtxoList();
            if (utxoList != null) {
                for (UtxoInfo utxoInfo : utxoList) {
                    bigDecimal = C54862xYb.KWHzl(bigDecimal, utxoInfo.getCoinAmount());
                    java.lang.String coinAmount = utxoInfo.getCoinAmount();
                    java.lang.String strEZpvd = coinAmount == null ? "0" : coinAmount;
                    java.lang.String address = uTXOInfoResp.getAddress();
                    if (address == null) {
                        address = "";
                    }
                    if (z) {
                        strEZpvd = C54870xYj.EZpvd(strEZpvd, dHguZz().valueOf(), dHguZz().AkhnZx(), dHguZz().fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                    }
                    arrayList.add(new OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean(address, strEZpvd));
                    java.lang.Integer utxoType = utxoInfo.getUtxoType();
                    if (utxoType != null && utxoType.intValue() == 4) {
                        int iAhwBna = C33129mqd.AhwBna(utxoInfo.getCoinAmount());
                        UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
                        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(java.lang.Math.max(iAhwBna, C33129mqd.AhwBna(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getInscriptionOutput() : null))));
                        java.lang.String strZLjUOn = zLjUOn();
                        if (z) {
                            strGEmmrt = AbstractC8426bCW.formatToFeeCoinAmount$default(QKudOq(), strGEmmrt, false, false, false, 14, null);
                        }
                        arrayList2.add(new OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean(strZLjUOn, strGEmmrt));
                    }
                }
            }
        }
        BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(C54862xYb.AEQbTJ(C54862xYb.AEQbTJ(bigDecimal, RKcVTr()), OTwTPd()), ((C11990ceW) QKudOq()).AEQbTJ());
        UTXOSignInfo uTXOSignInfoUeEOUB2 = UeEOUB();
        if (C33129mqd.copydefault(bigDecimalAEQbTJ, uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getMinOutput() : null)) {
            java.lang.String strHtlTjW = htlTjW();
            if (z) {
                strConvertToString$default = C54870xYj.EZpvd(C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null), dHguZz().valueOf(), dHguZz().AkhnZx(), dHguZz().fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            } else {
                strConvertToString$default = C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null);
            }
            arrayList2.add(new OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean(strHtlTjW, strConvertToString$default));
        }
        return new OkUTXOTransaction.InputsAndOutputs(arrayList, arrayList2);
    }

    @Override // o.C12167cho, o.AbstractC11993ceZ
    public C12797ctk.Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new C12797ctk.Application(responseData, htlTjW(), responseData.getData(), DGOPHZ(), C33129mqd.AhwBna(l_()), fHqPtx().DbNXlk(), null, false, null, 448, null);
    }
}
