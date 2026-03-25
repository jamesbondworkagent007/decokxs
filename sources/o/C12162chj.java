package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.chj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12162chj extends AbstractC12145chS {
    public final InterfaceC56387yDm QUSxYX = C56392yDr.copydefault(new Function0() { // from class: o.chr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12162chj.AEQbTJ(this.AEQbTJ);
        }
    });

    public final C12087cgN QIZEnU() {
        return (C12087cgN) this.QUSxYX.getValue();
    }

    public static final C12087cgN AEQbTJ(C12162chj c12162chj) {
        return new C12087cgN(c12162chj);
    }

    @Override // o.AbstractC8704bHj
    public C10854bwM fHqPtx() {
        return dHguZz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(batchBean, 10));
        for (FixedUTXOInfo fixedUTXOInfo : batchBean) {
            arrayList.add(new UTXOAddressInfoReq(fixedUTXOInfo.getFrom(), "0", "0", (java.lang.Integer) 2, fixedUTXOInfo.getNftId(), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, fixedUTXOInfo.getProtocolId(), (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 61408, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(QUSxYX(), "0", refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : C54862xYb.convertToBigIntegerString$default(DXXBbs().AEQbTJ(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.Integer) 6, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 65520, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean F_() {
        return super.F_() && !flVtFt();
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult RVsVBY() {
        C12087cgN c12087cgNQIZEnU = QIZEnU();
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        UTXOInfoResp uTXOInfoResp = listQKVWgx != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listQKVWgx) : null;
        java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
        return c12087cgNQIZEnU.copydefault(uTXOInfoResp, listDjSkpj != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listDjSkpj) : null);
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult gEmmrt(java.lang.String str, java.lang.String str2) {
        C12087cgN c12087cgNQIZEnU = QIZEnU();
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        UTXOInfoResp uTXOInfoResp = listQKVWgx != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listQKVWgx) : null;
        java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
        return c12087cgNQIZEnU.OLrzqt(str, str2, uTXOInfoResp, listDjSkpj != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(listDjSkpj) : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12102cgc
    public ResponseData<BatchBroadcastModel> djBIcL(@NotNull ResponseData<XRC20TransactionResult> responseData) {
        java.lang.String commitTx;
        java.lang.String commitTx2;
        java.lang.String commitTxFee;
        java.lang.String strConvertToBigIntegerString$default;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            java.util.List<UTXONftInfo> listDaRZkR = DaRZkR();
            XRC20TransactionResult data = responseData.getData();
            if (data == null || (commitTx = data.getCommitTx()) == null) {
                commitTx = "";
            }
            XRC20TransactionResult data2 = responseData.getData();
            if (data2 == null || (commitTx2 = data2.getCommitTx()) == null) {
                commitTx2 = "";
            }
            java.lang.String strAhwBna = AhwBna(commitTx2);
            java.lang.String strQUSxYX = QUSxYX();
            UTXONftInfo uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(listDaRZkR);
            java.lang.String nftId = uTXONftInfo != null ? uTXONftInfo.getNftId() : null;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDaRZkR, 10));
            java.util.Iterator<T> it = listDaRZkR.iterator();
            while (it.hasNext()) {
                arrayList.add(((UTXONftInfo) it.next()).getNftId());
            }
            UTXONftInfo uTXONftInfo2 = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(listDaRZkR);
            java.lang.String nftLocation = uTXONftInfo2 != null ? uTXONftInfo2.getNftLocation() : null;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listDaRZkR, 10));
            java.util.Iterator<T> it2 = listDaRZkR.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((UTXONftInfo) it2.next()).getNftLocation());
            }
            java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(batchBean, 10));
            java.util.Iterator<T> it3 = batchBean.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((FixedUTXOInfo) it3.next()).getInscriptionId());
            }
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(this, commitTx, strAhwBna, null, new UTXOExtJson(2, strQUSxYX, nftId, arrayList, nftLocation, arrayList2, arrayList3, null, null, null, 0, dvKsVJ(), null, 4992, null), 4, null);
            broadcastBeanGenerateBroadcastModel$default.setCoinAmount(DNMMPQ());
            XRC20TransactionResult data3 = responseData.getData();
            if (data3 != null && (commitTxFee = data3.getCommitTxFee()) != null && (strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(commitTxFee, true, (RoundingMode) null, 2, (java.lang.Object) null)) != null) {
                str = strConvertToBigIntegerString$default;
            }
            broadcastBeanGenerateBroadcastModel$default.setServiceCharge(str);
            broadcastBeanGenerateBroadcastModel$default.setFromAdr(htlTjW());
            XRC20TransactionResult data4 = responseData.getData();
            broadcastBeanGenerateBroadcastModel$default.setFeeRate(data4 != null ? data4.getFeeRate() : null);
            return new ResponseData<>(-5001, null, null, null, AhwBna(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default)), null, 46, null);
        }
        return new ResponseData<>(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null);
    }

    @Override // o.AbstractC12102cgc
    public java.lang.String DNMMPQ() {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        if (listQKVWgx != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = listQKVWgx.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList == null) {
                    utxoList = yDY.AhwBna();
                }
                C56406yEe.KWHzl(arrayList, utxoList);
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                bigDecimal = C54862xYb.KWHzl(bigDecimal, ((UtxoInfo) it2.next()).getCoinAmount());
            }
        }
        return C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
    }

    @Override // o.AbstractC11993ceZ
    public C12797ctk.Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new C12797ctk.Application(responseData, htlTjW(), responseData.getData(), dmfpNf(), C33129mqd.AhwBna(l_()), dHguZz().DbNXlk(), null, false, fragmentActivity, 192, null);
    }
}
