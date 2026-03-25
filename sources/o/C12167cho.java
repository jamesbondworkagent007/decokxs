package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.BTCNFTInfo;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.TxInsBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12167cho extends AbstractC12145chS {
    public final InterfaceC56387yDm QUSxYX = C56392yDr.copydefault(new Function0() { // from class: o.chJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12167cho.OLrzqt(this.AEQbTJ);
        }
    });
    public C10854bwM QfsBiF;

    public java.lang.String QIZEnU() {
        return null;
    }

    public int RXzakW() {
        return 2;
    }

    public final C12159chg QDqgQU() {
        return (C12159chg) this.QUSxYX.getValue();
    }

    public static final C12159chg OLrzqt(C12167cho c12167cho) {
        return new C12159chg(c12167cho);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd fHqPtx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC12102cgc, o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUfzxmz = Ufzxmz();
        final Function1 function1 = new Function1() { // from class: o.chM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12167cho.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXUfzxmz.KWHzl(new InterfaceC58229yxO() { // from class: o.chL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12167cho.fHqPtx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(C12167cho c12167cho, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.r_();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> Ufzxmz() {
        java.lang.String strTarCU = TarCU();
        if (strTarCU == null || strTarCU.length() == 0) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<CoinMetaBean>> abstractC58185ywXKWHzl2 = OFhtUX().KWHzl(C11600cUg.copydefault(dvKsVJ()), strTarCU);
        final Function1 function1 = new Function1() { // from class: o.chO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12167cho.valueOf(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.chQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12167cho.Dmq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair Dmq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String TarCU() {
        FixedUTXOInfo fixedUTXOInfo;
        if (QXDzTk() || (fixedUTXOInfo = (FixedUTXOInfo) CollectionsKt___CollectionsKt.firstOrNull(((FixedUTXOSignData) QVsKAR()).getBatchBean())) == null) {
            return null;
        }
        return fixedUTXOInfo.getTicker();
    }

    public static final InterfaceC60096zvd UrRBLY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        if (this.QfsBiF != null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQHmsKR = QHmsKR();
            final Function1 function1 = new Function1() { // from class: o.chv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12167cho.KWHzl(this.OLrzqt, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXQHmsKR.KWHzl(new InterfaceC58229yxO() { // from class: o.chu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12167cho.UrRBLY(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return super.dxcTrN();
    }

    public static final InterfaceC60096zvd KWHzl(C12167cho c12167cho, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.dxcTrN();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8704bHj
    public C10854bwM fHqPtx() {
        C10854bwM c10854bwM = this.QfsBiF;
        if (c10854bwM != null) {
            return c10854bwM;
        }
        if (QXDzTk()) {
            return dHguZz();
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((FixedUTXOInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(((FixedUTXOSignData) QVsKAR()).getBatchBean())).getCoinId());
        return c10854bwMKWHzl == null ? dHguZz() : c10854bwMKWHzl;
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean F_() {
        return (flVtFt() || giSNqX() || gasjUx() || !C33129mqd.copydefault(OcIXYQ(), C54862xYb.KWHzl(DXXBbs().AEQbTJ(), OTwTPd()))) ? false : true;
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
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.lang.String strQUSxYX = QUSxYX();
        java.lang.String strConvertToBigIntegerString$default = refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : C54862xYb.convertToBigIntegerString$default(OTwTPd(), true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : C54862xYb.convertToBigIntegerString$default(DXXBbs().AEQbTJ(), true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        if (listQKVWgx == null || listQKVWgx.isEmpty()) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = listQKVWgx.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    for (UtxoInfo utxoInfo : utxoList) {
                        arrayList2.add(utxoInfo.getTxHash() + "-" + utxoInfo.getVout());
                    }
                }
            }
            arrayList = arrayList2;
        }
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(strQUSxYX, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, (java.lang.Integer) 1, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) arrayList, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 65008, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC12102cgc, o.AbstractC11993ceZ
    public void EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        EZpvd(listQKVWgx != null ? djBIcL(listQKVWgx) : null);
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult RVsVBY() {
        return QDqgQU().OLrzqt(QKVWgx(), djSkpj());
    }

    @Override // o.AbstractC12102cgc
    public XRC20TransactionResult gEmmrt(java.lang.String str, java.lang.String str2) {
        return QDqgQU().AEQbTJ(str, str2, QDqgQU().copydefault(copydefault(QKVWgx(), djSkpj())));
    }

    /* JADX DEBUG: Type inference failed for r10v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        if (ULRxlR()) {
            AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
            final Function1 function1 = new Function1() { // from class: o.chx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12167cho.isConnected(this.AEQbTJ, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.chz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12167cho.DCUTEIddSDPG(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(73819762, null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl3);
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd DCUTEIddSDPG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd isConnected(final C12167cho c12167cho, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            TxInsBean txInsBeanCopydefault = c12167cho.QDqgQU().copydefault(c12167cho.copydefault(c12167cho.QKVWgx(), c12167cho.djSkpj()));
            java.lang.String balance = txInsBeanCopydefault != null ? txInsBeanCopydefault.getBalance() : null;
            java.lang.String str = balance != null ? balance : "";
            java.lang.String strAEQbTJ = c12167cho.DXXBbs().AEQbTJ();
            java.util.List<UTXOTxIn> txIns = txInsBeanCopydefault != null ? txInsBeanCopydefault.getTxIns() : null;
            if (txIns == null) {
                txIns = yDY.AhwBna();
            }
            AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXAEQbTJ = c12167cho.AEQbTJ(str, strAEQbTJ, txIns);
            final Function1 function1 = new Function1() { // from class: o.chG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12167cho.fetchVPNInfo(this.KWHzl, (ResponseData) obj);
                }
            };
            return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.chF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12167cho.run(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null));
    }

    public static final ResponseData run(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData fetchVPNInfo(C12167cho c12167cho, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12167cho.djBIcL((ResponseData<XRC20TransactionResult>) responseData);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(final SubmitTxExpandBean submitTxExpandBean) {
        if (ULRxlR()) {
            AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
            final Function1 function1 = new Function1() { // from class: o.chN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12167cho.copydefault(submitTxExpandBean, this, (ResponseData) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.chP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12167cho.spnCvw(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.cht
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12167cho.DbNXlk(this.AEQbTJ, (ResponseData) obj);
                }
            };
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.chw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12167cho.call(function12, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(73819762, null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl3);
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd spnCvw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(SubmitTxExpandBean submitTxExpandBean, C12167cho c12167cho, ResponseData responseData) {
        ResponseData responseData2;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            java.lang.String keystoneSignTx = submitTxExpandBean != null ? submitTxExpandBean.getKeystoneSignTx() : null;
            if (keystoneSignTx == null || keystoneSignTx.length() == 0) {
                responseData2 = new ResponseData(-5013, null, null, null, null, null, 62, null);
            } else {
                responseData2 = new ResponseData(-5001, null, null, null, new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, submitTxExpandBean != null ? submitTxExpandBean.getKeystoneSignTx() : null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, c12167cho.DXXBbs().AEQbTJ(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 3959, (DefaultConstructorMarker) null), null, 46, null);
            }
            return AbstractC58185ywX.KWHzl(responseData2);
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, null, 54, null));
    }

    public static final ResponseData call(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData DbNXlk(C12167cho c12167cho, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12167cho.djBIcL((ResponseData<XRC20TransactionResult>) responseData);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(SubmitTxExpandBean submitTxExpandBean) {
        if (ULRxlR()) {
            AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
            final Function1 function1 = new Function1() { // from class: o.chs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12167cho.values(this.EZpvd, (ResponseData) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.chp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12167cho.WS(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.chE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12167cho.AkhnZx(this.AEQbTJ, (ResponseData) obj);
                }
            };
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.chI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12167cho.DGOPHZ(function12, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl3);
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd WS(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd values(C12167cho c12167cho, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            return c12167cho.EZpvd(c12167cho.QDqgQU().copydefault(c12167cho.copydefault(c12167cho.QKVWgx(), c12167cho.djSkpj())));
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, null, 54, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final ResponseData DGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AkhnZx(C12167cho c12167cho, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12167cho.djBIcL((ResponseData<XRC20TransactionResult>) responseData);
    }

    public static final InterfaceC60096zvd KDccX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.chy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12167cho.OLrzqt(this.copydefault, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.chC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12167cho.KDccX(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.chH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12167cho.fARcdN(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.chD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12167cho.DWgRXt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final InterfaceC60096zvd OLrzqt(C12167cho c12167cho, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            return c12167cho.QDqgQU().OLrzqt(str, c12167cho.QDqgQU().copydefault(c12167cho.copydefault(c12167cho.QKVWgx(), c12167cho.djSkpj())));
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, null, 54, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final ResponseData DWgRXt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData fARcdN(C12167cho c12167cho, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12167cho.djBIcL((ResponseData<XRC20TransactionResult>) responseData);
    }

    public final java.lang.String RKcVTr() {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        if (listQKVWgx != null) {
            java.util.Iterator<T> it = listQKVWgx.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    java.util.Iterator<T> it2 = utxoList.iterator();
                    while (it2.hasNext()) {
                        bigDecimal = C54862xYb.KWHzl(bigDecimal, ((UtxoInfo) it2.next()).getCoinAmount());
                    }
                }
            }
        }
        return C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
    }

    public final boolean ULRxlR() {
        return !QXDzTk();
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.wallet.core.sign.utxo.XRC20TransactionResult>> */
    public final AbstractC58185ywX<ResponseData<XRC20TransactionResult>> AEQbTJ(java.lang.String str, final java.lang.String str2, java.util.List<UTXOTxIn> list) {
        C10854bwM c10854bwMDHguZz = dHguZz();
        ChainAddress chainAddressFERRXa = fERRXa();
        LedgerSignHelper ledgerSignHelper = LedgerSignHelper.AEQbTJ;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(str, false, (RoundingMode) null, 3, (java.lang.Object) null);
        UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strHtlTjW = htlTjW();
        java.lang.String strZLjUOn = zLjUOn();
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(UhxbNG(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(str2, false, (RoundingMode) null, 3, (java.lang.Object) null);
        ChainAddress chainAddressRcXXUw = RcXXUw();
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = ledgerSignHelper.AEQbTJ(new LedgerSignHelper.ActionBar(c10854bwMDHguZz, chainAddressFERRXa, null, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strHtlTjW, strZLjUOn, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, list, chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddressType() : AddressType.Legacy.getValue(), QUSxYX()));
        final Function1 function1 = new Function1() { // from class: o.chB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12167cho.EZpvd(str2, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.chA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12167cho.zblBkD(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData zblBkD(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(responseData.getCode(), null, null, null, responseData.getCode() == -5001 ? new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, (java.lang.String) responseData.getData(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, str, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 3959, (DefaultConstructorMarker) null) : null, responseData.getError_code(), 14, null);
    }

    /* JADX DEBUG: Type inference failed for r4v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.wallet.core.sign.utxo.XRC20TransactionResult>> */
    public final AbstractC58185ywX<ResponseData<XRC20TransactionResult>> EZpvd(TxInsBean txInsBean) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = OneKeySignHelper.copydefault.copydefault(dUDNAs(), QDqgQU().EZpvd(txInsBean));
        final Function1 function1 = new Function1() { // from class: o.chK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12167cho.gEmmrt(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.chR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12167cho.DCUTEIdCUTEI(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData DCUTEIdCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData gEmmrt(C12167cho c12167cho, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(responseData.getCode(), null, null, null, responseData.getCode() == -5001 ? new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, (java.lang.String) responseData.getData(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, c12167cho.DXXBbs().AEQbTJ(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 3959, (DefaultConstructorMarker) null) : null, responseData.getError_code(), 14, null);
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.String zuBGHE() {
        return aKErDB().copydefault(QDqgQU().EZpvd(QDqgQU().copydefault(copydefault(QKVWgx(), djSkpj()))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12102cgc
    public ResponseData<BatchBroadcastModel> djBIcL(@NotNull ResponseData<XRC20TransactionResult> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            java.util.List<UTXONftInfo> listDaRZkR = DaRZkR();
            XRC20TransactionResult data = responseData.getData();
            java.lang.String commitTx = data != null ? data.getCommitTx() : null;
            if (commitTx == null) {
                commitTx = "";
            }
            XRC20TransactionResult data2 = responseData.getData();
            java.lang.String commitTx2 = data2 != null ? data2.getCommitTx() : null;
            java.lang.String strAhwBna = AhwBna(commitTx2 != null ? commitTx2 : "");
            int iRXzakW = RXzakW();
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
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(this, commitTx, strAhwBna, null, new UTXOExtJson(java.lang.Integer.valueOf(iRXzakW), strQUSxYX, nftId, arrayList, nftLocation, arrayList2, arrayList3, QIZEnU(), null, null, 0, dvKsVJ(), null, 4864, null), 4, null);
            broadcastBeanGenerateBroadcastModel$default.setCoinAmount(C54862xYb.convertToBigIntegerString$default(DNMMPQ(), true, (RoundingMode) null, 2, (java.lang.Object) null));
            XRC20TransactionResult data3 = responseData.getData();
            broadcastBeanGenerateBroadcastModel$default.setFeeRate(data3 != null ? data3.getFeeRate() : null);
            return new ResponseData<>(-5001, null, null, null, AhwBna(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default)), null, 46, null);
        }
        return new ResponseData<>(responseData.getCode(), null, null, null, null, responseData.getError_code(), 30, null);
    }

    public final java.lang.String UhxbNG() {
        return C54862xYb.convertToString$default(C54862xYb.KWHzl(RKcVTr(), OTwTPd()), false, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12102cgc
    public java.lang.String DNMMPQ() {
        if (QXDzTk()) {
            return C33129mqd.gEmmrt(java.lang.Integer.valueOf(((FixedUTXOSignData) QVsKAR()).getBatchBean().size()));
        }
        return UhxbNG();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public C12797ctk.Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strHtlTjW = htlTjW();
        java.util.List<UTXOInfoResp> data = responseData.getData();
        long jDGOPHZ = DGOPHZ();
        java.lang.String strDbNXlk = fHqPtx().DbNXlk();
        java.util.List<FixedUTXOInfo> batchBean = ((FixedUTXOSignData) QVsKAR()).getBatchBean();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(batchBean, 10));
        for (FixedUTXOInfo fixedUTXOInfo : batchBean) {
            java.lang.Long coinId = fixedUTXOInfo.getCoinId();
            java.lang.String nftId = fixedUTXOInfo.getNftId();
            java.lang.String nftPrice = fixedUTXOInfo.getNftPrice();
            java.lang.Integer protocolId = fixedUTXOInfo.getProtocolId();
            java.lang.String inscriptionId = fixedUTXOInfo.getInscriptionId();
            arrayList.add(new BTCNFTInfo(coinId, nftId, fixedUTXOInfo.getTxHash(), fixedUTXOInfo.getVOut(), inscriptionId, fixedUTXOInfo.getCoinAmount(), nftPrice, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, protocolId, fixedUTXOInfo.getNftLogoUrl(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 118656, (DefaultConstructorMarker) null));
        }
        return new C12797ctk.Application(responseData, strHtlTjW, data, jDGOPHZ, 67, strDbNXlk, arrayList, false, fragmentActivity, 128, null);
    }

    public static final kotlin.Pair valueOf(C12167cho c12167cho, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c12167cho.QfsBiF = new C10854bwM((CoinMetaBean) data);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
