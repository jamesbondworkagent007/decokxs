package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.okinc.business.defi.api.model.tx.signdata.BRC20MintSignData;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferSignData;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoReq;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C8475bDS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20852goh extends AbstractC20809gnr {
    public final MutableLiveData<java.lang.String> AYXKKw;
    public boolean DbNXlk;
    public InterfaceC58217yxC ejfBZ;
    public InterfaceC58217yxC fIwbmz;
    public int fJNWhG;
    public final LiveData<java.lang.String> fetchVPNInfo;
    public final MutableLiveData<XRC20BalanceDetailInfoResp> gEmmrt;
    public final LiveData<XRC20BalanceDetailInfoResp> getFieldNames;
    public AbstractC8426bCW<?> values;
    public java.lang.String fARcdN = "";
    public java.lang.String isConnected = "0";
    public final Application AuCTel = new Application();
    public final StateListAnimator AkhnZx = new StateListAnimator();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> AubY() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AwvSrB() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC8426bCW<?> AxsJAY() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<XRC20BalanceDetailInfoResp> sSMYrx() {
        return this.getFieldNames;
    }

    @Override // o.AbstractC20809gnr
    public int values() {
        return 2;
    }

    public C20852goh() {
        MutableLiveData<XRC20BalanceDetailInfoResp> mutableLiveData = new MutableLiveData<>();
        this.gEmmrt = mutableLiveData;
        this.getFieldNames = mutableLiveData;
        MutableLiveData<java.lang.String> mutableLiveData2 = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData2;
        this.fetchVPNInfo = mutableLiveData2;
    }

    /* JADX INFO: renamed from: o.goh$Application */
    public static final class Application implements C8475bDS.ActionBar {
        public Application() {
        }

        @Override // o.C8475bDS.ActionBar
        public void OLrzqt(java.util.List<WalletTickerManager.CoinPrice> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C20852goh.this.AEQbTJ(1, false, 0);
        }
    }

    /* JADX INFO: renamed from: o.goh$StateListAnimator */
    public static final class StateListAnimator implements C8475bDS.TaskDescription {
        @Override // o.C8475bDS.TaskDescription
        public void OLrzqt() {
        }

        public StateListAnimator() {
        }

        @Override // o.C8475bDS.TaskDescription
        public void EZpvd() {
            if (C20852goh.this.fJNWhG() != null) {
                C20852goh.this.AEQbTJ(2, false, 0);
            }
        }
    }

    @Override // o.AbstractC20809gnr
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, TransactionInfo transactionInfo, @NotNull java.lang.String str6, int i, java.lang.String str7, java.lang.String str8, int i2, @NotNull java.lang.String str9, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, java.lang.String str10, java.lang.Integer num, java.lang.Long l, java.lang.String str11, boolean z, java.util.ArrayList<java.lang.Integer> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        InterfaceC58217yxC interfaceC58217yxCAkhnZx = AkhnZx();
        if (interfaceC58217yxCAkhnZx != null) {
            interfaceC58217yxCAkhnZx.dispose();
        }
        AYXKKw(str);
        copydefault(str2);
        this.fARcdN = str3;
        this.isConnected = str4;
        copydefault(transactionInfo);
        this.fJNWhG = i2;
        OLrzqt(arrayList);
        boolean z2 = false;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6)) {
            MutableLiveData<C20863gos> mutableLiveDataEjfBZ = ejfBZ();
            C20863gos c20863gos = new C20863gos();
            c20863gos.KWHzl(null);
            c20863gos.OLrzqt(C10857bwP.KWHzl("OKTransferAmountViewModel", new java.lang.Throwable("toAddress is blank")));
            c20863gos.EZpvd(false);
            mutableLiveDataEjfBZ.setValue(c20863gos);
            return;
        }
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(java.lang.Long.valueOf(C33129mqd.valueOf(str2)), true);
        if (c10854bwMCopydefault == null && (str11 == null || str11.length() == 0)) {
            C10954byG c10954byG = C10954byG.EZpvd;
            int size = c10954byG.valueOf().values().size();
            CoinMetaError coinMetaError = new CoinMetaError("coin meta not found");
            java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("coinId", str2), C56390yDp.OLrzqt("txSource", java.lang.String.valueOf(i2)), C56390yDp.OLrzqt("enabledCoinsCount", java.lang.String.valueOf(size)), C56390yDp.OLrzqt("initStatus", java.lang.String.valueOf(c10954byG.AhwBna())));
            if (transactionInfo != null) {
                mapDjBIcL.put("scanTransInfo", new Gson().toJson(transactionInfo));
            }
            C6777aVl.Companion.OLrzqt(coinMetaError, mapDjBIcL, C33488mxR.EZpvd(mapDjBIcL), "OKTransferAmountViewModel");
            MutableLiveData<C20863gos> mutableLiveDataEjfBZ2 = ejfBZ();
            C20863gos c20863gos2 = new C20863gos();
            c20863gos2.KWHzl(null);
            c20863gos2.OLrzqt(C10857bwP.KWHzl("OKTransferAmountViewModel", coinMetaError));
            c20863gos2.EZpvd(true);
            mutableLiveDataEjfBZ2.setValue(c20863gos2);
            return;
        }
        C8396bBt c8396bBt = C8396bBt.AEQbTJ;
        java.lang.String currency = transactionInfo != null ? transactionInfo.getCurrency() : null;
        if (transactionInfo != null && transactionInfo.hasCurrency()) {
            z2 = true;
        }
        SignDataArgs<?> signDataArgsAEQbTJ = AEQbTJ(str, c10854bwMCopydefault, str6, str3, str8, str9, str7, txToastCheckBizAndPayloadInfo, currency, num, l, str11, i, str5, str10, !z2, z, str4);
        signDataArgsAEQbTJ.setCheckTypeFailList(uzCIH());
        Unit unit = Unit.INSTANCE;
        AbstractC58260yxt abstractC58260yxtBuildOKWTransaction$default = C8396bBt.buildOKWTransaction$default(c8396bBt, signDataArgsAEQbTJ, null, false, 6, null);
        final Function1 function1 = new Function1() { // from class: o.goi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20852goh.copydefault(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.goj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20852goh.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gon
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20852goh.djBIcL(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        EZpvd(abstractC58260yxtBuildOKWTransaction$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gop
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20852goh.isConnected(function12, obj);
            }
        }));
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C20852goh c20852goh, kotlin.Pair pair) {
        MutableLiveData<C20863gos> mutableLiveDataEjfBZ = c20852goh.ejfBZ();
        C20863gos c20863gos = new C20863gos();
        OKWBaseTransaction oKWBaseTransaction = pair != null ? (OKWBaseTransaction) pair.getFirst() : null;
        c20863gos.KWHzl(oKWBaseTransaction instanceof AbstractC8664bGw ? (AbstractC8664bGw) oKWBaseTransaction : null);
        c20863gos.OLrzqt((java.lang.String) pair.getSecond());
        mutableLiveDataEjfBZ.setValue(c20863gos);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C20852goh c20852goh, java.lang.Throwable th) {
        MutableLiveData<C20863gos> mutableLiveDataEjfBZ = c20852goh.ejfBZ();
        C20863gos c20863gos = new C20863gos();
        c20863gos.KWHzl(null);
        Intrinsics.copydefault(th);
        c20863gos.OLrzqt(C10857bwP.KWHzl("OKTransferAmountViewModel", th));
        c20863gos.EZpvd(true);
        mutableLiveDataEjfBZ.setValue(c20863gos);
        return Unit.INSTANCE;
    }

    public final SignDataArgs<?> AEQbTJ(java.lang.String str, C10854bwM c10854bwM, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, java.lang.String str7, java.lang.Integer num, java.lang.Long l, java.lang.String str8, int i, java.lang.String str9, java.lang.String str10, boolean z, boolean z2, java.lang.String str11) {
        TransferSignData transferSignData;
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        if (c10854bwM != null && (c10854bwMKWHzl2 = c10854bwM.KWHzl()) != null && c10854bwMKWHzl2.call()) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str6)) {
                long jValueOf = C33129mqd.valueOf(djBIcL());
                java.lang.String str12 = str4 == null ? "" : str4;
                java.lang.Integer numQbewEr = c10854bwM.QbewEr();
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<OkUTXOTransaction.InitArgs> kSerializerSerializer = OkUTXOTransaction.InitArgs.Companion.serializer();
                Intrinsics.copydefault((java.lang.Object) str6);
                java.util.List<FixedUTXOInfo> batchBean = ((OkUTXOTransaction.InitArgs) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, str6)).getBatchBean();
                if (batchBean == null) {
                    batchBean = yDY.AhwBna();
                }
                transferSignData = new FixedUTXOSignData(jValueOf, str2, str5, str12, false, false, null, batchBean, "53", numQbewEr, null, 1024, null);
            } else if (c10854bwM.hUfVAv()) {
                long jValueOf2 = C33129mqd.valueOf(djBIcL());
                java.lang.String str13 = str4 == null ? "" : str4;
                java.lang.Integer numQbewEr2 = c10854bwM.QbewEr();
                transferSignData = new BRC20MintSignData(java.lang.Long.valueOf(jValueOf2), str5, str2, str13, false, false, null, numQbewEr2 != null ? numQbewEr2.intValue() : 0, (c10854bwM.iZzfmt() || c10854bwM.fvQaOB() || !c10854bwM.DAIeex()) ? 9 : 10, null, null, null, 3584, null);
            } else {
                transferSignData = new UTXOTransferSignData(C33129mqd.valueOf(djBIcL()), str5, str2, str4 == null ? "" : str4, false, true, null);
            }
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str8)) {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C11600cUg.copydefault(l));
            transferSignData = new BRC20MintSignData(c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.AhwBna()) : null, str5, str2, str4 == null ? "" : str4, false, false, null, num != null ? num.intValue() : 0, 9, null, null, str8, 1536, null);
        } else {
            transferSignData = new TransferSignData(C33129mqd.valueOf(djBIcL()), str5, str2, str4 == null ? "" : str4, null, null, 48, null);
            transferSignData.setXLayerPrefixToAddress(z2);
        }
        TransferSignData transferSignData2 = transferSignData;
        transferSignData2.setCurrencyIsoCode(str7);
        transferSignData2.setTransferAmount(z);
        transferSignData2.setToAddressName(str3);
        if (i == 1) {
            transferSignData2.setOkexAccount(str9);
            transferSignData2.setMemo(str10);
        }
        transferSignData2.setDepositLimit(str11);
        return new SignDataArgs<>(str, null, (c10854bwM == null || (c10854bwMKWHzl = c10854bwM.KWHzl()) == null) ? l != null ? l.longValue() : -1L : c10854bwMKWHzl.fetchVPNInfo(), transferSignData2, null, null, null, null, null, null, 1, 11, null, txToastCheckBizAndPayloadInfo != null ? txToastCheckBizAndPayloadInfo.getTxToastCheckBizLine() : null, txToastCheckBizAndPayloadInfo != null ? txToastCheckBizAndPayloadInfo.getTxToastCheckPayload() : null, null, null, false, false, null, false, false, true, false, 12555250, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // o.AbstractC20809gnr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd(java.lang.String str) {
        java.lang.String strKWHzl;
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXA_;
        if (str == null) {
            strKWHzl = "0";
        } else {
            C10854bwM c10854bwMValueOf = valueOf();
            strKWHzl = C54870xYj.KWHzl(str, c10854bwMValueOf != null ? c10854bwMValueOf.valueOf() : 0);
            if (strKWHzl == null) {
            }
        }
        InterfaceC58217yxC interfaceC58217yxCSubscribeBy$default = null;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(strKWHzl, true, (RoundingMode) null, 2, (java.lang.Object) null);
        AEQbTJ(3, true, 0);
        InterfaceC58217yxC interfaceC58217yxC = this.ejfBZ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null && (abstractC58185ywXA_ = abstractC8664bGwFJNWhG.a_(strConvertToBigIntegerString$default)) != null) {
            interfaceC58217yxCSubscribeBy$default = yBI.subscribeBy$default(abstractC58185ywXA_, (Function1) null, (Function0) null, new Function1() { // from class: o.gor
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20852goh.AhwBna(this.copydefault, (kotlin.Pair) obj);
                }
            }, 3, (java.lang.Object) null);
        }
        this.ejfBZ = interfaceC58217yxCSubscribeBy$default;
    }

    public static final Unit AhwBna(C20852goh c20852goh, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c20852goh.AEQbTJ(3, false, 0);
        return Unit.INSTANCE;
    }

    public void gHZMYf() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAp_;
        AEQbTJ(3, true, 0);
        InterfaceC58217yxC interfaceC58217yxC = this.fIwbmz;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        this.fIwbmz = (abstractC8664bGwFJNWhG == null || (abstractC58185ywXAp_ = abstractC8664bGwFJNWhG.ap_()) == null) ? null : yBI.subscribeBy$default(abstractC58185ywXAp_, (Function1) null, (Function0) null, new Function1() { // from class: o.goq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20852goh.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C20852goh c20852goh, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c20852goh.AEQbTJ(3, false, 0);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20809gnr
    public java.lang.String AuCTel() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null) {
            java.lang.String transferAmount$default = AbstractC8704bHj.getTransferAmount$default(abstractC8664bGwFJNWhG, false, false, 3, null);
            if (transferAmount$default != null) {
                C10854bwM c10854bwMValueOf = valueOf();
                java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(transferAmount$default, c10854bwMValueOf != null ? c10854bwMValueOf.valueOf() : 0);
                if (strAEQbTJ != null) {
                    return strAEQbTJ;
                }
            }
        }
        return "0";
    }

    @Override // o.AbstractC20809gnr
    public void copydefault(boolean z) {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null) {
            abstractC8664bGwFJNWhG.AEQbTJ(z);
        }
    }

    @Override // o.AbstractC20809gnr
    public boolean AuCTelauCTel() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        return abstractC8664bGwFJNWhG != null && abstractC8664bGwFJNWhG.B_();
    }

    @Override // o.AbstractC20809gnr
    public void valueOf(java.lang.String str) {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null) {
            if (str == null) {
                str = "0";
            }
            abstractC8664bGwFJNWhG.b_(str);
        }
    }

    @Override // o.AbstractC20809gnr
    public java.lang.String fARcdN() {
        java.lang.String transferValuation$default;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        return (abstractC8664bGwFJNWhG == null || (transferValuation$default = AbstractC8664bGw.getTransferValuation$default(abstractC8664bGwFJNWhG, false, 1, null)) == null) ? "0" : transferValuation$default;
    }

    @Override // o.AbstractC20809gnr
    public C10854bwM valueOf() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null) {
            return abstractC8664bGwFJNWhG.fHqPtx();
        }
        return null;
    }

    @Override // o.AbstractC20809gnr
    public int fetchVPNInfo() {
        C10854bwM c10854bwMValueOf = valueOf();
        if (c10854bwMValueOf != null) {
            return c10854bwMValueOf.DTwDnp();
        }
        return 0;
    }

    @Override // o.AbstractC20809gnr
    public boolean iwGUEr() {
        WalletTickerManager.CoinPrice coinPriceWlaJM = wlaJM();
        return coinPriceWlaJM != null && coinPriceWlaJM.getHasPrice();
    }

    public WalletTickerManager.CoinPrice wlaJM() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null) {
            return abstractC8664bGwFJNWhG.DarRvM().copydefault(java.lang.Long.valueOf(abstractC8664bGwFJNWhG.fHqPtx().AhwBna()));
        }
        return null;
    }

    @Override // o.AbstractC20809gnr
    public java.lang.String isConnected() {
        WalletTickerManager.CoinPrice coinPriceWlaJM = wlaJM();
        if (coinPriceWlaJM != null) {
            return coinPriceWlaJM.getRealPrice();
        }
        return null;
    }

    @Override // o.AbstractC20809gnr
    public java.lang.Double getFieldNames() {
        C8544bEi c8544bEiZuWLRA;
        WalletCurrencyBean walletCurrencyBeanKWHzl;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG == null || (c8544bEiZuWLRA = abstractC8664bGwFJNWhG.zuWLRA()) == null || (walletCurrencyBeanKWHzl = c8544bEiZuWLRA.KWHzl()) == null) {
            return null;
        }
        return java.lang.Double.valueOf(walletCurrencyBeanKWHzl.getUsdToThisRate());
    }

    @Override // o.AbstractC20809gnr
    public void AEQbTJ(@NotNull WalletCurrencyBean walletCurrencyBean) {
        C8544bEi c8544bEiZuWLRA;
        Intrinsics.checkNotNullParameter(walletCurrencyBean, "");
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG == null || (c8544bEiZuWLRA = abstractC8664bGwFJNWhG.zuWLRA()) == null) {
            return;
        }
        c8544bEiZuWLRA.EZpvd(walletCurrencyBean);
    }

    @Override // o.AbstractC20809gnr
    public java.lang.String DbNXlk() {
        C8544bEi c8544bEiZuWLRA;
        WalletCurrencyBean walletCurrencyBeanKWHzl;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG == null || (c8544bEiZuWLRA = abstractC8664bGwFJNWhG.zuWLRA()) == null || (walletCurrencyBeanKWHzl = c8544bEiZuWLRA.KWHzl()) == null) {
            return null;
        }
        return walletCurrencyBeanKWHzl.getIsoCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.bCW<?>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.bCW] */
    @Override // o.AbstractC20809gnr
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        ?? QKudOq;
        AbstractC58185ywX abstractC58185ywXIsConnected;
        AbstractC58185ywX abstractC58185ywXOLrzqt;
        C8475bDS c8475bDSDarRvM;
        C8475bDS c8475bDSDarRvM2;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null && (c8475bDSDarRvM2 = abstractC8664bGwFJNWhG.DarRvM()) != null) {
            c8475bDSDarRvM2.OLrzqt(this.AuCTel);
        }
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG2 = fJNWhG();
        if (abstractC8664bGwFJNWhG2 != null && (c8475bDSDarRvM = abstractC8664bGwFJNWhG2.DarRvM()) != null) {
            c8475bDSDarRvM.KWHzl(this.AkhnZx);
        }
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG3 = fJNWhG();
        this.values = abstractC8664bGwFJNWhG3 != null ? abstractC8664bGwFJNWhG3.QKudOq() : 0;
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG4 = fJNWhG();
        if (abstractC8664bGwFJNWhG4 == null || (QKudOq = abstractC8664bGwFJNWhG4.QKudOq()) == 0 || (abstractC58185ywXIsConnected = QKudOq.isConnected()) == null || (abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXIsConnected, lifecycleOwner, Lifecycle.Event.ON_DESTROY)) == null) {
            return;
        }
        yBI.subscribeBy$default(abstractC58185ywXOLrzqt, (Function1) null, (Function0) null, new ActionBar(function0), 3, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.goh$ActionBar */
    public static final class ActionBar implements Function1<?, Unit> {
        public final /* synthetic */ Function0<Unit> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function0<Unit> function0) {
            this.EZpvd = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Object obj) {
            EZpvd((C8486bDd) obj);
            return Unit.INSTANCE;
        }

        public final void EZpvd(C8486bDd c8486bDd) {
            Intrinsics.checkNotNullParameter(c8486bDd, "");
            if (C20852goh.this.fJNWhG() != null) {
                C20852goh.this.AEQbTJ(0, false, 0);
            }
            if (C20852goh.this.DbNXlk) {
                return;
            }
            C20852goh.this.DbNXlk = true;
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Override // o.AbstractC20809gnr
    public void AhwBna() {
        super.AhwBna();
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null) {
            abstractC8664bGwFJNWhG.fFgQHt();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.ejfBZ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.fIwbmz;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final void zLjUOn() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null) {
            long jAhwBna = abstractC8664bGwFJNWhG.fHqPtx().AhwBna();
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(abstractC8664bGwFJNWhG.ixgjPv().KWHzl(abstractC8664bGwFJNWhG.dUDNAs().USBtdM(), abstractC8664bGwFJNWhG.dUDNAs().DbNXlk(), new UTXOInfoReq(java.lang.Long.valueOf(jAhwBna), yDY.AhwBna(new UTXOAddressInfoReq(abstractC8664bGwFJNWhG.htlTjW(), (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) 1, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 65526, (DefaultConstructorMarker) null)), 0, 4, null)), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.goo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20852goh.KWHzl(this.AEQbTJ, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.got
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20852goh.AhwBna(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gov
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20852goh.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            call().AEQbTJ(abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gou
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20852goh.djBIcL(function12, obj);
                }
            }));
        }
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C20852goh c20852goh, java.util.List list) {
        Intrinsics.copydefault(list);
        if (!list.isEmpty()) {
            MutableLiveData<java.lang.String> mutableLiveData = c20852goh.AYXKKw;
            UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list);
            mutableLiveData.setValue(uTXOInfoResp != null ? uTXOInfoResp.getLockAmount() : null);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C20852goh c20852goh, java.lang.Throwable th) {
        c20852goh.AYXKKw.setValue("0");
        return Unit.INSTANCE;
    }

    public final void zuBGHE() {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = fJNWhG();
        if (abstractC8664bGwFJNWhG != null) {
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(abstractC8664bGwFJNWhG.ixgjPv().KWHzl(new XRC20BalanceDetailInfoReq(abstractC8664bGwFJNWhG.htlTjW(), java.lang.Long.valueOf(abstractC8664bGwFJNWhG.fHqPtx().AhwBna()))), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.gog
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20852goh.AEQbTJ(this.KWHzl, (XRC20BalanceDetailInfoResp) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gok
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20852goh.gEmmrt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gom
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20852goh.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            call().AEQbTJ(abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gol
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20852goh.valueOf(function12, obj);
                }
            }));
        }
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C20852goh c20852goh, XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp) {
        c20852goh.gEmmrt.setValue(xRC20BalanceDetailInfoResp);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C20852goh c20852goh, java.lang.Throwable th) {
        c20852goh.gEmmrt.setValue(new XRC20BalanceDetailInfoResp(0L, "", 0L, null, null, null, null, null));
        return Unit.INSTANCE;
    }
}
