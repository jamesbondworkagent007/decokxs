package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cgA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12074cgA extends AbstractC12102cgc {
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String Ufzxmz() {
        FixedUTXOInfo fixedUTXOInfo = (FixedUTXOInfo) CollectionsKt___CollectionsKt.firstOrNull(((FixedUTXOSignData) QVsKAR()).getBatchBean());
        java.lang.String from = fixedUTXOInfo != null ? fixedUTXOInfo.getFrom() : null;
        return from == null ? "" : from;
    }

    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return zLjUOn();
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean F_() {
        return super.F_() && !flVtFt();
    }

    public final java.lang.String valueOf(@NotNull java.util.List<FixedUTXOInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.Iterator<T> it = list.iterator();
        BigDecimal bigDecimalKWHzl = bigDecimal;
        while (it.hasNext()) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, ((FixedUTXOInfo) it.next()).getNftPrice());
        }
        return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v11. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<o.bwM, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<kotlin.Pair<C10854bwM, java.lang.String>> RXzakW() {
        FixedUTXOInfo fixedUTXOInfo = (FixedUTXOInfo) CollectionsKt___CollectionsKt.firstOrNull(((FixedUTXOSignData) QVsKAR()).getBatchBean());
        java.lang.String strOLrzqt = fixedUTXOInfo != null ? OLrzqt(fixedUTXOInfo) : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            C13934dbu c13934dbuOFhtUX = OFhtUX();
            int iCopydefault = C11600cUg.copydefault(dvKsVJ());
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            AbstractC58185ywX<ResponseData<CoinMetaBean>> abstractC58185ywXKWHzl = c13934dbuOFhtUX.KWHzl(iCopydefault, strOLrzqt);
            final Function1 function1 = new Function1() { // from class: o.cgC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12074cgA.values((ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cgE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12074cgA.fjfviF(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<kotlin.Pair<C10854bwM, java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(null, ""));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final kotlin.Pair fjfviF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final java.lang.String OLrzqt(FixedUTXOInfo fixedUTXOInfo) {
        java.lang.Integer protocolId = fixedUTXOInfo.getProtocolId();
        if (protocolId != null && protocolId.intValue() == 1) {
            return fixedUTXOInfo.getTicker();
        }
        if (protocolId != null && protocolId.intValue() == 6) {
            return fixedUTXOInfo.getTickerId();
        }
        if (protocolId != null && protocolId.intValue() == 2) {
            return fixedUTXOInfo.getTokenId();
        }
        if (protocolId != null && protocolId.intValue() == 13) {
            return fixedUTXOInfo.getTickerId();
        }
        return null;
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
            broadcastBeanGenerateBroadcastModel$default.setFromAdr(Ufzxmz());
            XRC20TransactionResult data4 = responseData.getData();
            broadcastBeanGenerateBroadcastModel$default.setFeeRate(data4 != null ? data4.getFeeRate() : null);
            return new ResponseData<>(-5001, null, null, null, AhwBna(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default)), null, 46, null);
        }
        return new ResponseData<>(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null);
    }

    @Override // o.AbstractC11993ceZ
    public C12797ctk.Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new C12797ctk.Application(responseData, htlTjW(), copydefault((java.util.List<UTXOInfoResp>) null, djSkpj()), dmfpNf(), C33129mqd.AhwBna(l_()), dHguZz().DbNXlk(), null, false, fragmentActivity, 192, null);
    }

    public static final kotlin.Pair values(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return C56390yDp.OLrzqt(new C10854bwM((CoinMetaBean) data), "");
        }
        return C56390yDp.OLrzqt(null, responseData.getMsg());
    }
}
