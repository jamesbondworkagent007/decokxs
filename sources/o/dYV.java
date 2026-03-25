package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.net.bean.ChainInfo;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoReq;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C12827cuN;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class dYV extends AbstractC33073mpa {
    public C10854bwM DbNXlk;
    public final InterfaceC56387yDm KWHzl;
    public final MutableLiveData<XRC20BalanceDetailInfoResp> OLrzqt;
    public final MutableLiveData<java.lang.Boolean> djBIcL;
    public java.lang.String fARcdN;
    public UTXOInfoResp fJNWhG;
    public java.lang.String fetchVPNInfo;
    public AbstractC12782ctV isConnected;
    public final LiveData<XRC20BalanceDetailInfoResp> uzCIH;
    public final MutableLiveData<java.lang.Boolean> valueOf;
    public final MutableLiveData<java.lang.Boolean> values;
    public int fIwbmz = 1;
    public int AYXKKw = 1;
    public final int AuCTel = 10;
    public final java.lang.String EZpvd = "BrcSendViewModel";
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.dZe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return dYV.getNewProxyInstance();
        }
    });
    public final MutableLiveData<java.util.List<dYU>> AEQbTJ = new MutableLiveData<>(new java.util.ArrayList());
    public final MutableLiveData<java.lang.String> AhwBna = new MutableLiveData<>();
    public final MutableLiveData<ActionBar> copydefault = new MutableLiveData<>();
    public BigDecimal gEmmrt = new BigDecimal(0);
    public final MutableLiveData<java.lang.String> AkhnZx = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<dYU>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ActionBar> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<XRC20BalanceDetailInfoResp> values() {
        return this.uzCIH;
    }

    public dYV() {
        MutableLiveData<XRC20BalanceDetailInfoResp> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.uzCIH = mutableLiveData;
        this.djBIcL = new MutableLiveData<>();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.valueOf = new MutableLiveData<>(bool);
        this.values = new MutableLiveData<>(bool);
        this.fJNWhG = new UTXOInfoResp("", "", new java.util.ArrayList(), (java.lang.String) null, (java.lang.Integer) null, 24, (DefaultConstructorMarker) null);
        this.fetchVPNInfo = "";
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.dZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return dYV.KWHzl(this.copydefault);
            }
        });
    }

    private final C13934dbu AuCTel() {
        return (C13934dbu) this.ejfBZ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13934dbu getNewProxyInstance() {
        return new C13934dbu();
    }

    public static final class StateListAnimator extends WalletCoinAssetSubManager.TaskDescription {
        public StateListAnimator(java.util.List<java.lang.Long> list) {
            super("assetSub-brc20Transfer", null, list, false, 10, null);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            C10854bwM c10854bwM = dYV.this.DbNXlk;
            if (c10854bwM != null) {
                dYV dyv = dYV.this;
                if (c10854bwM.hUfVAv()) {
                    java.util.Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((WalletCoinAssetSubManager.SubResponse) next).getAddress(), (java.lang.Object) dyv.fetchVPNInfo)) {
                                break;
                            }
                        }
                    }
                    if (((WalletCoinAssetSubManager.SubResponse) next) != null) {
                        dyv.gEmmrt();
                    }
                }
            }
        }
    }

    public final StateListAnimator AEQbTJ() {
        return (StateListAnimator) this.KWHzl.getValue();
    }

    public static final StateListAnimator KWHzl(dYV dyv) {
        C10854bwM c10854bwM = dyv.DbNXlk;
        return dyv.new StateListAnimator(C56402yEa.EZpvd(java.lang.Long.valueOf(c10854bwM != null ? c10854bwM.AhwBna() : 0L)));
    }

    public final void copydefault(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fARcdN = str;
        this.fIwbmz = i;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        this.DbNXlk = c10854bwMKWHzl;
        if (c10854bwMKWHzl == null) {
            C10856bwO.EZpvd(this.EZpvd, new OKWException("mCoinMeta is null. coinId=" + j, null));
        }
        this.fetchVPNInfo = str2;
        copydefault("0");
        C11205cFp.EZpvd.zLjUOn().AEQbTJ(AEQbTJ());
    }

    public final void fJNWhG() {
        if (Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) "")) {
            pUU.copydefault("walletId should not be null coinid should not be -1");
        } else {
            this.AYXKKw = 1;
            EZpvd(1, this.AuCTel);
        }
    }

    public final void fARcdN() {
        EZpvd(this.AYXKKw, this.AuCTel);
    }

    public final void gEmmrt() {
        java.lang.String strDjBIcL = djBIcL();
        C10854bwM c10854bwM = this.DbNXlk;
        XRC20BalanceDetailInfoReq xRC20BalanceDetailInfoReq = new XRC20BalanceDetailInfoReq(strDjBIcL, java.lang.Long.valueOf(c10854bwM != null ? c10854bwM.AhwBna() : 0L));
        java.lang.Long coinId = xRC20BalanceDetailInfoReq.getCoinId();
        if (coinId != null && coinId.longValue() == 0) {
            java.lang.String str = this.EZpvd;
            C10854bwM c10854bwM2 = this.DbNXlk;
            C10856bwO.EZpvd(str, new OKWException("mCoinMeta is null:" + (c10854bwM2 == null) + " and coinId:" + (c10854bwM2 != null ? c10854bwM2.AhwBna() : -1L), null));
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(AuCTel().KWHzl(xRC20BalanceDetailInfoReq), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.dYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dYV.copydefault(this.EZpvd, (XRC20BalanceDetailInfoResp) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dYY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dYV.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dZg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dYV.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dZh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dYV.isConnected(function12, obj);
            }
        }));
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(dYV dyv, XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp) {
        dyv.OLrzqt.setValue(xRC20BalanceDetailInfoResp);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(dYV dyv, java.lang.Throwable th) {
        dyv.OLrzqt.setValue(new XRC20BalanceDetailInfoResp(0L, null, null, null, null, null, null, null));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull UtxoInfo utxoInfo) {
        Intrinsics.checkNotNullParameter(utxoInfo, "");
        java.util.List<UtxoInfo> utxoList = this.fJNWhG.getUtxoList();
        Intrinsics.copydefault(utxoList, "");
        C56532yIw.OLrzqt(utxoList).add(utxoInfo);
        java.lang.String tokenAmount = utxoInfo.getTokenAmount();
        if (tokenAmount == null) {
            tokenAmount = "0";
        }
        EZpvd(tokenAmount);
        this.valueOf.setValue(java.lang.Boolean.TRUE);
    }

    public final void ejfBZ() {
        java.util.List<dYU> value;
        MutableLiveData<java.util.List<dYU>> mutableLiveData = this.AEQbTJ;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return;
        }
        for (dYU dyu : value) {
            if (dyu instanceof dYT) {
                dYT dyt = (dYT) dyu;
                if (!dyt.EZpvd()) {
                    dyt.copydefault(true);
                    UtxoInfo utxoInfoOLrzqt = dyt.OLrzqt();
                    if (utxoInfoOLrzqt != null) {
                        OLrzqt(utxoInfoOLrzqt);
                    }
                }
            }
        }
    }

    public final void fIwbmz() {
        java.util.List<dYU> value;
        MutableLiveData<java.util.List<dYU>> mutableLiveData = this.AEQbTJ;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return;
        }
        for (dYU dyu : value) {
            if (dyu instanceof dYT) {
                dYT dyt = (dYT) dyu;
                if (dyt.EZpvd()) {
                    dyt.copydefault(false);
                    UtxoInfo utxoInfoOLrzqt = dyt.OLrzqt();
                    if (utxoInfoOLrzqt != null) {
                        KWHzl(utxoInfoOLrzqt);
                    }
                }
            }
        }
    }

    public final boolean DbNXlk() {
        java.util.List<dYU> value = this.AEQbTJ.getValue();
        if (value != null) {
            if (!value.isEmpty()) {
                for (dYU dyu : value) {
                    if (!(dyu instanceof dYT) || ((dYT) dyu).EZpvd()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String isConnected() {
        java.lang.String nftId;
        java.lang.Object next;
        Gson gson = new Gson();
        java.util.List listEZpvd = C56402yEa.EZpvd(this.fJNWhG);
        java.util.List<UtxoInfo> utxoList = this.fJNWhG.getUtxoList();
        java.util.ArrayList arrayList = null;
        if (utxoList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(utxoList, 10));
            for (UtxoInfo utxoInfo : utxoList) {
                C10854bwM c10854bwMEZpvd = EZpvd();
                java.lang.Long lValueOf = c10854bwMEZpvd != null ? java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna()) : null;
                java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
                if (nftLocaltionVOs != null) {
                    java.util.Iterator<T> it = nftLocaltionVOs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd(((UTXONftInfo) next).getBrc20Nft(), java.lang.Boolean.FALSE)) {
                            break;
                        }
                    }
                    UTXONftInfo uTXONftInfo = (UTXONftInfo) next;
                    nftId = uTXONftInfo != null ? uTXONftInfo.getNftId() : null;
                }
                java.lang.String str = nftId == null ? "" : nftId;
                java.lang.String inscriptionId = utxoInfo.getInscriptionId();
                java.lang.String str2 = inscriptionId == null ? "" : inscriptionId;
                java.lang.String tokenAmount = utxoInfo.getTokenAmount();
                java.lang.String str3 = tokenAmount == null ? "" : tokenAmount;
                java.lang.String strDjBIcL = djBIcL();
                java.lang.String str4 = strDjBIcL == null ? "" : strDjBIcL;
                C10854bwM c10854bwMEZpvd2 = EZpvd();
                java.lang.Integer numQbewEr = c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.QbewEr() : null;
                C10854bwM c10854bwMEZpvd3 = EZpvd();
                arrayList2.add(new FixedUTXOInfo(lValueOf, str, (java.lang.String) null, (java.lang.Integer) null, str2, str3, (java.lang.String) null, (java.lang.String) null, str4, false, (java.lang.String) null, (java.lang.String) null, numQbewEr, c10854bwMEZpvd3 != null ? c10854bwMEZpvd3.DbNXlk() : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 118476, (DefaultConstructorMarker) null));
            }
            arrayList = arrayList2;
        }
        java.lang.String json = gson.toJson(new OkUTXOTransaction.InitArgs(listEZpvd, arrayList));
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    private final void EZpvd(java.lang.String str) {
        BigDecimal bigDecimalAdd = this.gEmmrt.add(new BigDecimal(str));
        this.gEmmrt = bigDecimalAdd;
        java.lang.String string = bigDecimalAdd.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        copydefault(string);
    }

    public final void copydefault(java.lang.String str) {
        MutableLiveData<java.lang.String> mutableLiveData = this.AhwBna;
        C10854bwM c10854bwMEZpvd = EZpvd();
        int iValueOf = c10854bwMEZpvd != null ? c10854bwMEZpvd.valueOf() : 0;
        C10854bwM c10854bwMEZpvd2 = EZpvd();
        mutableLiveData.setValue(java.lang.String.valueOf(C54870xYj.EZpvd(str, iValueOf, c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.AkhnZx() : 0, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null)));
    }

    public final void KWHzl(@NotNull UtxoInfo utxoInfo) {
        Intrinsics.checkNotNullParameter(utxoInfo, "");
        java.util.List<UtxoInfo> utxoList = this.fJNWhG.getUtxoList();
        Intrinsics.copydefault(utxoList, "");
        C56532yIw.OLrzqt(utxoList).remove(utxoInfo);
        java.lang.String tokenAmount = utxoInfo.getTokenAmount();
        if (tokenAmount == null) {
            tokenAmount = "0";
        }
        OLrzqt(tokenAmount);
        java.util.List<UtxoInfo> utxoList2 = this.fJNWhG.getUtxoList();
        if (utxoList2 == null || utxoList2.size() != 0) {
            return;
        }
        this.valueOf.setValue(java.lang.Boolean.FALSE);
    }

    public final void OLrzqt(java.lang.String str) {
        BigDecimal bigDecimalSubtract = this.gEmmrt.subtract(new BigDecimal(str));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
        this.gEmmrt = bigDecimalSubtract;
        java.lang.String string = bigDecimalSubtract.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        copydefault(string);
    }

    public final void EZpvd(final int i, final int i2) {
        if (Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) "")) {
            throw new java.lang.IllegalArgumentException("should set prikey or walletid");
        }
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dZo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dYV.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEnsureInitialized$default.KWHzl(new InterfaceC58229yxO() { // from class: o.dZp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dYV.values(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dYW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dYV.OLrzqt(i, this, i2, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.dYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dYV.DbNXlk(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dYV.KWHzl(this.KWHzl, i, i2, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dYV.AkhnZx(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.dZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dYV.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dZf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dYV.ejfBZ(function14, obj);
            }
        }));
    }

    public static final InterfaceC60096zvd values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(final dYV dyv, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
        java.lang.String str = dyv.fARcdN;
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = instance$default.OLrzqt(str != null ? str : "", true).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dYV.copydefault(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.dZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dYV.fetchVPNInfo(function1, obj);
            }
        });
    }

    public static final Unit fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit copydefault(dYV dyv, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        dyv.isConnected = abstractC12782ctV;
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC60096zvd OLrzqt(int i, final dYV dyv, int i2, Unit unit) {
        java.lang.String strUSBtdM;
        java.lang.String strDbNXlk;
        java.lang.String strDbNXlk2;
        java.lang.String strUSBtdM2;
        C10854bwM c10854bwMKWHzl;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(unit, "");
        if (i == 1) {
            dyv.gEmmrt();
        }
        java.lang.String strDjBIcL = dyv.djBIcL();
        C10854bwM c10854bwM = dyv.DbNXlk;
        java.lang.Long lValueOf = null;
        java.lang.String strFJNWhG = c10854bwM != null ? c10854bwM.fJNWhG() : null;
        C10854bwM c10854bwMEZpvd = dyv.EZpvd();
        UTXOAddressInfoReq uTXOAddressInfoReq = new UTXOAddressInfoReq(strDjBIcL, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) 4, (java.lang.String) null, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), strFJNWhG, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, c10854bwMEZpvd != null ? c10854bwMEZpvd.QbewEr() : null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 61206, (DefaultConstructorMarker) null);
        C10854bwM c10854bwMEZpvd2 = dyv.EZpvd();
        if (c10854bwMEZpvd2 != null && c10854bwMEZpvd2.DAIeex()) {
            C10854bwM c10854bwMEZpvd3 = dyv.EZpvd();
            java.lang.String strOLrzqt = c10854bwMEZpvd3 != null ? c10854bwMEZpvd3.OLrzqt() : null;
            int iLastIndexOf$default = strOLrzqt != null ? StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) strOLrzqt, "-", 0, false, 6, (java.lang.Object) null) : -1;
            if (iLastIndexOf$default != -1) {
                int i3 = iLastIndexOf$default + 1;
                if (i3 < (strOLrzqt != null ? strOLrzqt.length() : 0)) {
                    if (strOLrzqt != null) {
                        java.lang.String strSubstring = strOLrzqt.substring(i3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        if (strSubstring == null) {
                            strSubstring = "";
                        }
                        uTXOAddressInfoReq.setTid(strSubstring);
                    }
                }
            }
        }
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(uTXOAddressInfoReq);
        C10854bwM c10854bwM2 = dyv.DbNXlk;
        if (c10854bwM2 != null && (c10854bwMKWHzl = c10854bwM2.KWHzl()) != null) {
            lValueOf = java.lang.Long.valueOf(c10854bwMKWHzl.AhwBna());
        }
        UTXOInfoReq uTXOInfoReq = new UTXOInfoReq(lValueOf, arrayListCopydefault, 0, 4, null);
        AbstractC12782ctV abstractC12782ctV = dyv.isConnected;
        java.lang.String str2 = (abstractC12782ctV == null || (strUSBtdM2 = abstractC12782ctV.USBtdM()) == null) ? "" : strUSBtdM2;
        AbstractC12782ctV abstractC12782ctV2 = dyv.isConnected;
        java.lang.String str3 = (abstractC12782ctV2 == null || (strDbNXlk2 = abstractC12782ctV2.DbNXlk()) == null) ? "" : strDbNXlk2;
        C10854bwM c10854bwMEZpvd4 = dyv.EZpvd();
        long jAhwBna = c10854bwMEZpvd4 != null ? c10854bwMEZpvd4.AhwBna() : -1L;
        java.lang.String str4 = dyv.fetchVPNInfo;
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, ResponseData<ChainInfo>>> abstractC58185ywXKWHzl = dyv.KWHzl(str2, str3, jAhwBna, str4 == null ? "" : str4, dyv.fIwbmz);
        C13934dbu c13934dbuAuCTel = dyv.AuCTel();
        AbstractC12782ctV abstractC12782ctV3 = dyv.isConnected;
        if (abstractC12782ctV3 == null || (strUSBtdM = abstractC12782ctV3.USBtdM()) == null) {
            strUSBtdM = "";
        }
        AbstractC12782ctV abstractC12782ctV4 = dyv.isConnected;
        if (abstractC12782ctV4 != null && (strDbNXlk = abstractC12782ctV4.DbNXlk()) != null) {
            str = strDbNXlk;
        }
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl2 = c13934dbuAuCTel.KWHzl(strUSBtdM, str, uTXOInfoReq);
        final Function2 function2 = new Function2() { // from class: o.dZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return dYV.KWHzl(this.copydefault, (kotlin.Pair) obj, (ResponseData) obj2);
            }
        };
        return AbstractC58185ywX.EZpvd(abstractC58185ywXKWHzl, abstractC58185ywXKWHzl2, new InterfaceC58223yxI() { // from class: o.dZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return dYV.KWHzl(function2, obj, obj2);
            }
        });
    }

    public static final kotlin.Pair KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair KWHzl(dYV dyv, kotlin.Pair pair, ResponseData responseData) {
        java.lang.String withdrawMsg;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        ActionBar actionBar = dyv.new ActionBar();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            actionBar.AEQbTJ(true);
        } else {
            actionBar.AEQbTJ(false);
            ChainInfo chainInfo = (ChainInfo) ((ResponseData) pair.getSecond()).getData();
            if (chainInfo != null && !chainInfo.getCanWithdraw()) {
                actionBar.KWHzl(false);
                if (chainInfo != null && (withdrawMsg = chainInfo.getWithdrawMsg()) != null) {
                    str = withdrawMsg;
                }
                actionBar.AEQbTJ(str);
            } else {
                actionBar.KWHzl(true);
                actionBar.AEQbTJ(((ResponseData) pair.getSecond()).getMsg());
            }
        }
        return C56390yDp.OLrzqt(actionBar, responseData);
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(dYV dyv, int i, int i2, kotlin.Pair pair) {
        UTXOInfoResp uTXOInfoResp;
        java.util.List<UtxoInfo> utxoList;
        UTXOInfoResp uTXOInfoResp2;
        java.util.List<UtxoInfo> utxoList2;
        UTXOInfoResp uTXOInfoResp3;
        java.util.List<UtxoInfo> utxoList3;
        UTXOInfoResp uTXOInfoResp4;
        UTXOInfoResp uTXOInfoResp5;
        ActionBar actionBar = (ActionBar) pair.getFirst();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        ResponseData responseData = (ResponseData) second;
        dyv.copydefault.setValue(actionBar);
        java.util.List<dYU> value = dyv.AEQbTJ.getValue();
        if (value != null && value.isEmpty() && i == 1) {
            java.util.List<dYU> value2 = dyv.AEQbTJ.getValue();
            if (value2 != null) {
                value2.clear();
            }
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null && (uTXOInfoResp3 = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list)) != null && (utxoList3 = uTXOInfoResp3.getUtxoList()) != null && utxoList3.size() > 0) {
                UTXOInfoResp uTXOInfoResp6 = dyv.fJNWhG;
                java.util.List list2 = (java.util.List) responseData.getData();
                uTXOInfoResp6.setAddress((list2 == null || (uTXOInfoResp5 = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list2)) == null) ? null : uTXOInfoResp5.getAddress());
                UTXOInfoResp uTXOInfoResp7 = dyv.fJNWhG;
                java.util.List list3 = (java.util.List) responseData.getData();
                uTXOInfoResp7.setCanTransferAmount((list3 == null || (uTXOInfoResp4 = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list3)) == null) ? null : uTXOInfoResp4.getCanTransferAmount());
            } else {
                dyv.djBIcL.setValue(java.lang.Boolean.TRUE);
                return Unit.INSTANCE;
            }
        }
        java.util.List list4 = (java.util.List) responseData.getData();
        if (list4 != null && (uTXOInfoResp = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list4)) != null && (utxoList = uTXOInfoResp.getUtxoList()) != null && utxoList.size() > 0) {
            dyv.AYXKKw++;
            java.util.List list5 = (java.util.List) responseData.getData();
            java.util.List<dYU> listCopydefault = dyv.copydefault(list5 != null ? (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list5) : null);
            java.util.List<dYU> value3 = dyv.AEQbTJ.getValue();
            if (value3 != null) {
                value3.addAll(listCopydefault);
            }
            MutableLiveData<java.util.List<dYU>> mutableLiveData = dyv.AEQbTJ;
            mutableLiveData.setValue(mutableLiveData.getValue());
            java.util.List list6 = (java.util.List) responseData.getData();
            if (((list6 == null || (uTXOInfoResp2 = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list6)) == null || (utxoList2 = uTXOInfoResp2.getUtxoList()) == null) ? 0 : utxoList2.size()) < i2) {
                dyv.values.setValue(java.lang.Boolean.TRUE);
            }
        } else {
            dyv.values.setValue(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(dYV dyv, java.lang.Throwable th) {
        dyv.djBIcL.setValue(java.lang.Boolean.TRUE);
        ActionBar actionBar = dyv.new ActionBar();
        actionBar.AEQbTJ(false);
        actionBar.KWHzl(true);
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        actionBar.AEQbTJ(message);
        dyv.copydefault.setValue(actionBar);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C11205cFp.EZpvd.zLjUOn().OLrzqt(AEQbTJ());
    }

    public final java.util.List<dYU> copydefault(UTXOInfoResp uTXOInfoResp) {
        java.util.List<UtxoInfo> utxoList;
        java.lang.String strFJNWhG;
        java.lang.String strDbNXlk;
        if (uTXOInfoResp != null && (utxoList = uTXOInfoResp.getUtxoList()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(utxoList, 10));
            for (UtxoInfo utxoInfo : utxoList) {
                dYT dyt = new dYT();
                java.lang.String tokenAmount = utxoInfo.getTokenAmount();
                if (tokenAmount == null) {
                    tokenAmount = "0";
                }
                dyt.KWHzl(tokenAmount);
                C10854bwM c10854bwM = this.DbNXlk;
                java.lang.String str = "";
                if (c10854bwM == null || (strFJNWhG = c10854bwM.fJNWhG()) == null) {
                    strFJNWhG = "";
                }
                dyt.AEQbTJ(strFJNWhG);
                java.lang.String inscriptionId = utxoInfo.getInscriptionId();
                if (inscriptionId == null) {
                    inscriptionId = "";
                }
                dyt.copydefault(inscriptionId);
                C10854bwM c10854bwM2 = this.DbNXlk;
                if (c10854bwM2 != null && (strDbNXlk = c10854bwM2.DbNXlk()) != null) {
                    str = strDbNXlk;
                }
                dyt.EZpvd(str);
                dyt.copydefault(false);
                dyt.KWHzl(utxoInfo);
                arrayList.add(dyt);
            }
            java.util.List<dYU> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
            if (listFJNWhG != null) {
                return listFJNWhG;
            }
        }
        return new java.util.ArrayList();
    }

    /* JADX DEBUG: Type inference failed for r8v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.net.bean.ChainInfo>>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, ResponseData<ChainInfo>>> KWHzl(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, int i) {
        AbstractC58185ywX<ResponseData<ChainInfo>> abstractC58185ywXAEQbTJ = AuCTel().AEQbTJ(str, str2, j, str3, i);
        final Function1 function1 = new Function1() { // from class: o.dZl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dYV.EZpvd((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.dZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dYV.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final class ActionBar {
        public boolean AEQbTJ;
        public boolean KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair EZpvd(ResponseData responseData) {
        boolean z;
        ChainInfo chainInfo;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null || (chainInfo = (ChainInfo) responseData.getData()) == null) {
            z = false;
        } else {
            z = true;
            if (!chainInfo.getCanWithdraw()) {
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), responseData);
    }
}
