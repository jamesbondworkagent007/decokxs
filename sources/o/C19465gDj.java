package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.HotActivityAddressStatusResp;
import com.okinc.business.defi.biz.net.bean.TxHistory;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.WalletCoinLatestPnlResponse;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoReq;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.ActivityStatus;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.AddressRegisterStatus;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Bitmap;
import o.C10407bnq;
import o.C10525bqB;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gDj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19465gDj extends AbstractC33073mpa {
    public MutableLiveData<WalletCoinLatestPnlResponse> AEQbTJ;
    public final LiveData<UTXOInfoResp> AYXKKw;
    public C10854bwM AhwBna;
    public java.lang.Boolean AkhnZx;
    public boolean AuCTel;
    public final MutableLiveData<Bitmap<java.util.ArrayList<java.lang.Object>>> AuCTelauCTel;
    public java.util.ArrayList<java.lang.Object> AubY;
    public final C13934dbu AwvSrB;
    public AbstractC12782ctV AxsJAY;
    public java.lang.Boolean DbNXlk;
    public final MutableLiveData<gFH> EZpvd;
    public final MutableLiveData<UTXOInfoResp> KWHzl;
    public final MutableLiveData<XRC20BalanceDetailInfoResp> OLrzqt;
    public final MutableLiveData<C18177fdV> copydefault;
    public boolean djBIcL;
    public final MutableLiveData<java.lang.Boolean> ejfBZ;
    public java.lang.String fARcdN;
    public java.lang.String fIwbmz;
    public java.lang.Boolean fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final MutableLiveData<C10525bqB> gEmmrt;
    public java.lang.String gHZMYf;
    public final java.lang.String getFieldNames;
    public java.lang.String getNewProxyInstance;
    public final MutableLiveData<java.util.List<DeFiApyDataInfoData>> hDKMBd;
    public final C10948byA isConnected;
    public InterfaceC58217yxC iwGUEr;
    public final C10407bnq sSMYrx;
    public InterfaceC58217yxC uzCIH;
    public final LiveData<WalletCoinLatestPnlResponse> valueOf;
    public int values;
    public java.lang.String wlaJM;
    public final LiveData<C18177fdV> zLjUOn;
    public final LiveData<gFH> zsXlph;
    public final C12827cuN zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C19465gDj() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<UTXOInfoResp> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getNewProxyInstance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        java.lang.String str = this.getNewProxyInstance;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AhwBna() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV AuCTel() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<XRC20BalanceDetailInfoResp> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C10525bqB> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<gFH> ejfBZ() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Bitmap<java.util.ArrayList<java.lang.Object>>> fARcdN() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C18177fdV> fJNWhG() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<WalletCoinLatestPnlResponse> gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean getFieldNames() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean getNewProxyInstance() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean hDKMBd() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<DeFiApyDataInfoData>> isConnected() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0008: INVOKE 
  (wrap:o.cuN$Application:0x0006: SGET  A[WRAPPED] (LINE:59) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:59)) : (r3v0 o.cuN))
  (wrap:o.bnq:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bnq:0x0012: INVOKE 
  (wrap:o.bnq$ActionBar:0x0010: SGET  A[WRAPPED] (LINE:60) o.bnq.Companion o.bnq$ActionBar)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.bnq.ActionBar.getInstance$default(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq A[MD:(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq (m), WRAPPED] (LINE:60)) : (r4v0 o.bnq))
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x0016: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x001c: INVOKE (wrap:o.byG:0x001a: SGET  A[WRAPPED] (LINE:61) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:61)) : (r5v0 o.byA))
 A[MD:(o.cuN, o.bnq, o.byA):void (m)] (LINE:58) call: o.gDj.<init>(o.cuN, o.bnq, o.byA):void type: THIS */
    public /* synthetic */ C19465gDj(C12827cuN c12827cuN, C10407bnq c10407bnq, C10948byA c10948byA, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 2) != 0 ? C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null) : c10407bnq, (i & 4) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA);
    }

    public C19465gDj(@NotNull C12827cuN c12827cuN, @NotNull C10407bnq c10407bnq, @NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10407bnq, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.zuBGHE = c12827cuN;
        this.sSMYrx = c10407bnq;
        this.isConnected = c10948byA;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.fJNWhG = bool;
        this.AkhnZx = bool;
        this.DbNXlk = bool;
        this.AuCTel = true;
        this.hDKMBd = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AwvSrB = new C13934dbu();
        this.AuCTelauCTel = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        MutableLiveData<UTXOInfoResp> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.AYXKKw = mutableLiveData;
        MutableLiveData<C18177fdV> mutableLiveData2 = new MutableLiveData<>();
        this.copydefault = mutableLiveData2;
        this.zLjUOn = mutableLiveData2;
        MutableLiveData<gFH> mutableLiveData3 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData3;
        this.zsXlph = mutableLiveData3;
        this.getFieldNames = C19465gDj.class.getName();
        MutableLiveData<WalletCoinLatestPnlResponse> mutableLiveData4 = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData4;
        this.valueOf = mutableLiveData4;
        this.ejfBZ = new MutableLiveData<>();
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.gDB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19465gDj.zsXlph();
            }
        });
    }

    /* JADX INFO: renamed from: o.gDj$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(C19465gDj.this.AEQbTJ((CoinAndAddressHistoryDetail) t)), java.lang.Integer.valueOf(C19465gDj.this.AEQbTJ((CoinAndAddressHistoryDetail) t2)));
        }
    }

    private final InterfaceC25424iwU AxsJAY() {
        return (InterfaceC25424iwU) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC25424iwU zsXlph() {
        return (InterfaceC25424iwU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25424iwU.class));
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4) {
        this.fARcdN = str;
        if (str != null) {
            this.AhwBna = this.isConnected.KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(str)));
        }
        this.gHZMYf = str2;
        this.fIwbmz = str3;
        this.wlaJM = str4;
        this.getNewProxyInstance = str5;
        this.fJNWhG = bool;
        this.AkhnZx = bool2;
        this.DbNXlk = bool3;
        this.djBIcL = Intrinsics.EZpvd(bool4, java.lang.Boolean.TRUE);
    }

    public final void AEQbTJ(@NotNull WalletTxHistorySubManager.SubResponse subResponse, boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(subResponse, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            function0.invoke();
        } else {
            this.ejfBZ.setValue(java.lang.Boolean.FALSE);
        }
    }

    public final AbstractC58185ywX<UTXOInfoResp> AubY() {
        AbstractC12782ctV abstractC12782ctV = this.AxsJAY;
        if (abstractC12782ctV != null) {
            C10854bwM c10854bwM = this.AhwBna;
            AbstractC58185ywX<UTXOInfoResp> abstractC58185ywXEZpvd = EZpvd(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), new UTXOInfoReq(java.lang.Long.valueOf(c10854bwM != null ? c10854bwM.AhwBna() : 1L), yDY.AhwBna(new UTXOAddressInfoReq(AYXKKw(), (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) 1, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 65526, (DefaultConstructorMarker) null)), 0, 4, null));
            if (abstractC58185ywXEZpvd != null) {
                return abstractC58185ywXEZpvd;
            }
        }
        AbstractC58185ywX<UTXOInfoResp> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl((java.lang.Object) null);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final AbstractC58185ywX<C18177fdV> wlaJM() {
        java.lang.String strOLrzqt;
        java.lang.String strEZpvd;
        AbstractC12782ctV abstractC12782ctV = this.AxsJAY;
        if (abstractC12782ctV != null) {
            C13934dbu c13934dbu = this.AwvSrB;
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
            java.lang.String strAUsmxb = abstractC12782ctV.aUsmxb();
            C10854bwM c10854bwM = this.AhwBna;
            java.lang.String str = (c10854bwM == null || (strEZpvd = abstractC12782ctV.EZpvd(c10854bwM.fetchVPNInfo())) == null) ? "" : strEZpvd;
            C10854bwM c10854bwM2 = this.AhwBna;
            java.lang.String str2 = (c10854bwM2 == null || (strOLrzqt = c10854bwM2.OLrzqt()) == null) ? "" : strOLrzqt;
            C10854bwM c10854bwM3 = this.AhwBna;
            AbstractC58185ywX<ResponseData<HotActivityAddressStatusResp>> abstractC58185ywXKWHzl = c13934dbu.KWHzl(strDbNXlk, strUSBtdM, strAUsmxb, str, c10854bwM3 != null ? c10854bwM3.fetchVPNInfo() : -1L, str2);
            final Function1 function1 = new Function1() { // from class: o.gEi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19465gDj.djBIcL(this.AEQbTJ, (ResponseData) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.gEk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C19465gDj.sSMYrx(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.gEj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19465gDj.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX<C18177fdV> abstractC58185ywXDjBIcL = abstractC58185ywXKWHzl2.djBIcL(new InterfaceC58229yxO() { // from class: o.gEp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C19465gDj.QKVWgx(function12, obj);
                }
            });
            if (abstractC58185ywXDjBIcL != null) {
                return abstractC58185ywXDjBIcL;
            }
        }
        AbstractC58185ywX<C18177fdV> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new C18177fdV("", -1L, "", AddressRegisterStatus.STATUS_UNACTIVATED, ActivityStatus.STATUS_CLOSED));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final C18177fdV QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C18177fdV) function1.invoke(obj);
    }

    public static final C18177fdV AEQbTJ(C19465gDj c19465gDj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.AEQbTJ(c19465gDj.getFieldNames, "queryUsdgAddressRegisterStatus", th);
        c19465gDj.copydefault.setValue(null);
        return new C18177fdV("", -1L, "", AddressRegisterStatus.STATUS_UNACTIVATED, ActivityStatus.STATUS_CLOSED);
    }

    public static final UTXOInfoResp QfsBiF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (UTXOInfoResp) function1.invoke(obj);
    }

    public final AbstractC58185ywX<UTXOInfoResp> EZpvd(java.lang.String str, java.lang.String str2, UTXOInfoReq uTXOInfoReq) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(this.AwvSrB.KWHzl(str, str2, uTXOInfoReq), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.gDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<UTXOInfoResp> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gDq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.QfsBiF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final UTXOInfoResp OLrzqt(C19465gDj c19465gDj, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) CollectionsKt___CollectionsKt.firstOrNull(list);
        c19465gDj.KWHzl.setValue(uTXOInfoResp);
        return uTXOInfoResp;
    }

    public final AbstractC58185ywX<XRC20BalanceDetailInfoResp> OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(this.AwvSrB.KWHzl(new XRC20BalanceDetailInfoReq(str, java.lang.Long.valueOf(j))), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.gEe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.EZpvd(this.AEQbTJ, (XRC20BalanceDetailInfoResp) obj);
            }
        };
        AbstractC58185ywX<XRC20BalanceDetailInfoResp> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.RJOkX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final XRC20BalanceDetailInfoResp RJOkX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (XRC20BalanceDetailInfoResp) function1.invoke(obj);
    }

    public static final XRC20BalanceDetailInfoResp EZpvd(C19465gDj c19465gDj, XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp) {
        Intrinsics.checkNotNullParameter(xRC20BalanceDetailInfoResp, "");
        c19465gDj.OLrzqt.setValue(xRC20BalanceDetailInfoResp);
        return xRC20BalanceDetailInfoResp;
    }

    public final AbstractC58185ywX<Unit> AuCTelauCTel() {
        C14720dql c14720dql = C14720dql.copydefault;
        C10525bqB value = this.gEmmrt.getValue();
        if (c14720dql.OLrzqt(value != null ? java.lang.Long.valueOf(value.OLrzqt()) : null)) {
            C12827cuN c12827cuN = this.zuBGHE;
            java.lang.String str = this.gHZMYf;
            if (str == null) {
                str = "";
            }
            AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = c12827cuN.OLrzqt(str, false).EZpvd();
            final Function1 function1 = new Function1() { // from class: o.gEd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19465gDj.AhwBna(this.AEQbTJ, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gEf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C19465gDj.QUSxYX(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.gEc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19465gDj.AEQbTJ(this.AEQbTJ, (Unit) obj);
                }
            };
            AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.gEg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C19465gDj.dNCPSb(function12, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<Unit> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final Unit QUSxYX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit AhwBna(C19465gDj c19465gDj, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c19465gDj.AxsJAY = abstractC12782ctV;
        c19465gDj.KWHzl();
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd dNCPSb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C19465gDj c19465gDj, Unit unit) {
        AbstractC12782ctV abstractC12782ctV;
        Intrinsics.checkNotNullParameter(unit, "");
        C10525bqB value = c19465gDj.gEmmrt.getValue();
        if (value != null) {
            long jGEmmrt = value.gEmmrt();
            AbstractC12782ctV abstractC12782ctV2 = c19465gDj.AxsJAY;
            boolean z = true;
            if ((abstractC12782ctV2 != null && abstractC12782ctV2.QfsBiF()) || ((abstractC12782ctV = c19465gDj.AxsJAY) != null && abstractC12782ctV.DCUTEIdCUTEI())) {
                z = false;
            }
            c19465gDj.EZpvd.postValue(new gFH(z, jGEmmrt));
        }
        return AbstractC58185ywX.KWHzl(Unit.INSTANCE);
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C19465gDj c19465gDj, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        c19465gDj.AxsJAY = abstractC12782ctV;
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C19465gDj c19465gDj, Function1 function1, java.lang.Throwable th) {
        pUU.copydefault(c19465gDj.getFieldNames, "getWallet error meeage :" + th.getMessage());
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC12782ctV abstractC12782ctV = this.AxsJAY;
        if (abstractC12782ctV != null && !z) {
            function1.invoke(abstractC12782ctV);
            return;
        }
        C12827cuN c12827cuN = this.zuBGHE;
        java.lang.String str = this.gHZMYf;
        if (str == null) {
            return;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = c12827cuN.OLrzqt(str, false);
        final Function1 function12 = new Function1() { // from class: o.gDI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.AEQbTJ(this.KWHzl, function1, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gDK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19465gDj.getFieldNames(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gDN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.AEQbTJ(this.copydefault, function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19465gDj.hDKMBd(function13, obj);
            }
        });
        call().AEQbTJ(interfaceC58217yxCAEQbTJ);
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gDj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshData$default(C19465gDj c19465gDj, boolean z, boolean z2, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        c19465gDj.EZpvd(z, z2, (Function0<Unit>) function0);
    }

    public final void EZpvd(final boolean z, final boolean z2, final Function0<Unit> function0) {
        InterfaceC58217yxC interfaceC58217yxC = this.uzCIH;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        C12827cuN c12827cuN = this.zuBGHE;
        java.lang.String str = this.gHZMYf;
        if (str == null) {
            str = "";
        }
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = c12827cuN.OLrzqt(str, false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.gDy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.EZpvd(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.OcIXYQ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.gDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.copydefault(this.KWHzl, z2, z, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.gDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.ORxRYg(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.gDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.EZpvd(function0, (Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gDF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19465gDj.QVAiDq(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.gDL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.AEQbTJ(this.KWHzl, function0, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gDJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19465gDj.QbewEr(function14, obj);
            }
        });
        this.uzCIH = interfaceC58217yxCAEQbTJ;
        call().AEQbTJ(interfaceC58217yxCAEQbTJ);
    }

    public static final Unit OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit EZpvd(C19465gDj c19465gDj, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c19465gDj.AxsJAY = abstractC12782ctV;
        c19465gDj.KWHzl();
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd ORxRYg(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C19465gDj c19465gDj, boolean z, final boolean z2, Unit unit) {
        InterfaceC60096zvd interfaceC60096zvdKWHzl;
        AbstractC58185ywX abstractC58185ywXKWHzl;
        AbstractC58185ywX<C18177fdV> abstractC58185ywXKWHzl2;
        C10854bwM c10854bwM;
        Intrinsics.checkNotNullParameter(unit, "");
        C10407bnq c10407bnq = c19465gDj.sSMYrx;
        java.lang.String str = c19465gDj.gHZMYf;
        java.lang.String str2 = str == null ? "" : str;
        C10953byF c10953byF = C10953byF.KWHzl;
        java.lang.String str3 = c19465gDj.fARcdN;
        if (str3 == null) {
            str3 = "";
        }
        AbstractC58185ywX<C10404bnn> abstractC58185ywXKWHzl3 = c10407bnq.KWHzl(str2, c10953byF.EZpvd(str3), yDY.AhwBna(), false, false);
        final Function1 function1 = new Function1() { // from class: o.gDo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.AEQbTJ(z2, c19465gDj, (C10404bnn) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXKWHzl3.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gDr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.QOLQEE(function1, obj);
            }
        });
        C10854bwM c10854bwM2 = c19465gDj.AhwBna;
        if (c10854bwM2 != null && c10854bwM2.hUfVAv()) {
            java.lang.String strAkhnZx = c19465gDj.AkhnZx();
            if (strAkhnZx == null) {
                strAkhnZx = "";
            }
            long jEZpvd = c10953byF.EZpvd(strAkhnZx);
            if (jEZpvd == 0) {
                java.lang.String str4 = c19465gDj.getFieldNames;
                java.lang.String strAkhnZx2 = c19465gDj.AkhnZx();
                if (strAkhnZx2 == null) {
                    strAkhnZx2 = "";
                }
                pUU.copydefault(str4, "refreshData coinId is invalid, metaId:" + strAkhnZx2);
                java.lang.String str5 = c19465gDj.getFieldNames;
                Intrinsics.checkNotNullExpressionValue(str5, "");
                java.lang.String strAkhnZx3 = c19465gDj.AkhnZx();
                if (strAkhnZx3 == null) {
                    strAkhnZx3 = "";
                }
                C10856bwO.EZpvd(str5, new OKWException("coinId is invalid, metaId:" + strAkhnZx3, null));
            }
            interfaceC60096zvdKWHzl = c19465gDj.OLrzqt(c19465gDj.AYXKKw(), jEZpvd);
        } else {
            C10854bwM c10854bwM3 = c19465gDj.AhwBna;
            if (c10854bwM3 != null && c10854bwM3.iRxXKY()) {
                interfaceC60096zvdKWHzl = c19465gDj.AubY();
            } else {
                interfaceC60096zvdKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
                Intrinsics.copydefault(interfaceC60096zvdKWHzl);
            }
        }
        if (z) {
            AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXIwGUEr = c19465gDj.iwGUEr();
            AbstractC58185ywX<ResponseData<TxHistory>> abstractC58185ywXOLrzqt = c19465gDj.OLrzqt("");
            AbstractC58185ywX<Unit> abstractC58185ywXUzCIH = c19465gDj.uzCIH();
            final yHO yho = new yHO() { // from class: o.gDz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C19465gDj.AEQbTJ(this.KWHzl, (java.util.List) obj, (ResponseData) obj2, (Unit) obj3);
                }
            };
            abstractC58185ywXKWHzl = AbstractC58185ywX.AEQbTJ(abstractC58185ywXIwGUEr, abstractC58185ywXOLrzqt, abstractC58185ywXUzCIH, new InterfaceC58228yxN() { // from class: o.gDH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58228yxN
                public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C19465gDj.copydefault(yho, obj, obj2, obj3);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        C35202nqq c35202nqq = C35202nqq.OLrzqt;
        if (c35202nqq.AEQbTJ("web3_usdg_activity_status") && (c10854bwM = c19465gDj.AhwBna) != null && c10854bwM.RcXXUw()) {
            abstractC58185ywXKWHzl2 = c19465gDj.wlaJM();
        } else {
            java.lang.String str6 = c19465gDj.getFieldNames;
            boolean zAEQbTJ = c35202nqq.AEQbTJ("web3_usdg_activity_status");
            C10854bwM c10854bwM4 = c19465gDj.AhwBna;
            pUU.copydefault(str6, "activityStatus: " + zAEQbTJ + ", supportQuery:" + (c10854bwM4 != null ? java.lang.Boolean.valueOf(c10854bwM4.RcXXUw()) : null) + ", coinMeta is null:" + (c19465gDj.AhwBna == null));
            c19465gDj.copydefault.setValue(null);
            abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        }
        final yHT yht = new yHT() { // from class: o.gDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHT
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C19465gDj.copydefault((C10404bnn) obj, obj2, obj3, obj4);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = AbstractC58185ywX.copydefault(interfaceC60096zvdAEQbTJ, interfaceC60096zvdKWHzl, abstractC58185ywXKWHzl, abstractC58185ywXKWHzl2, new InterfaceC58230yxP() { // from class: o.gEh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58230yxP
            public final java.lang.Object EZpvd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C19465gDj.copydefault(yht, obj, obj2, obj3, obj4);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.gEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.copydefault(this.copydefault, (Unit) obj);
            }
        };
        return abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.gEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.DTwDnp(function12, obj);
            }
        });
    }

    public static final C10404bnn QOLQEE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10404bnn) function1.invoke(obj);
    }

    public static final C10404bnn AEQbTJ(boolean z, C19465gDj c19465gDj, C10404bnn c10404bnn) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        if (z) {
            c19465gDj.zLjUOn();
        } else {
            c19465gDj.KWHzl();
        }
        return c10404bnn;
    }

    public static final ResponseData copydefault(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (ResponseData) yho.invoke(obj, obj2, obj3);
    }

    public static final ResponseData AEQbTJ(C19465gDj c19465gDj, java.util.List list, ResponseData responseData, Unit unit) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(unit, "");
        c19465gDj.AEQbTJ((ResponseData<TxHistory>) responseData);
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c19465gDj.hDKMBd.setValue(list);
        }
        return responseData;
    }

    public static final Unit copydefault(yHT yht, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Intrinsics.checkNotNullParameter(obj4, "");
        return (Unit) yht.invoke(obj, obj2, obj3, obj4);
    }

    public static final InterfaceC60096zvd DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final Unit copydefault(C10404bnn c10404bnn, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd copydefault(C19465gDj c19465gDj, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c19465gDj.AuCTelauCTel();
    }

    public static final void QVAiDq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function0 function0, Unit unit) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void QbewEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C19465gDj c19465gDj, Function0 function0, java.lang.Throwable th) {
        pUU.copydefault(c19465gDj.getFieldNames, "refreshData error message :" + th.getMessage());
        c19465gDj.AuCTelauCTel.setValue(new Bitmap.ActionBar(th.getMessage(), c19465gDj.AubY));
        c19465gDj.OLrzqt.setValue(new XRC20BalanceDetailInfoResp(0L, null, 0L, null, null, null, null, null));
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    public final AbstractC58185ywX<Unit> uzCIH() {
        C13934dbu c13934dbu = this.AwvSrB;
        java.lang.String str = this.fIwbmz;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.getNewProxyInstance;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.wlaJM;
        if (str3 == null) {
            str3 = "";
        }
        AbstractC58185ywX<ResponseData<WalletCoinLatestPnlResponse>> abstractC58185ywXKWHzl = c13934dbu.KWHzl(str, str2, str3);
        final Function1 function1 = new Function1() { // from class: o.gEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.OLrzqt(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.AwvSrB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gDj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void intervalRefreshData$default(C19465gDj c19465gDj, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c19465gDj.copydefault(z, (Function0<Unit>) function0);
    }

    public final void copydefault(boolean z, final Function0<Unit> function0) {
        final AbstractC58185ywX abstractC58185ywXAEQbTJ;
        final AbstractC58185ywX abstractC58185ywXKWHzl;
        C10953byF c10953byF = C10953byF.KWHzl;
        java.lang.String strAkhnZx = AkhnZx();
        if (strAkhnZx == null) {
            strAkhnZx = "";
        }
        long jEZpvd = c10953byF.EZpvd(strAkhnZx);
        C10854bwM c10854bwMKWHzl = this.isConnected.KWHzl(java.lang.Long.valueOf(jEZpvd));
        final boolean z2 = c10854bwMKWHzl != null && c10854bwMKWHzl.aKErDB();
        if (z2) {
            abstractC58185ywXAEQbTJ = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        } else {
            C10407bnq c10407bnq = this.sSMYrx;
            java.lang.String str = this.gHZMYf;
            if (str == null) {
                str = "";
            }
            AbstractC58185ywX abstractC58185ywXRefreshWalletSingleCoinAsset$default = C10407bnq.refreshWalletSingleCoinAsset$default(c10407bnq, str, jEZpvd, null, false, false, 12, null);
            final Function1 function1 = new Function1() { // from class: o.gDM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19465gDj.AEQbTJ(this.EZpvd, (C10404bnn) obj);
                }
            };
            abstractC58185ywXAEQbTJ = abstractC58185ywXRefreshWalletSingleCoinAsset$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gDV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C19465gDj.zLjUOn(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        }
        if (z && !z2) {
            AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXIwGUEr = iwGUEr();
            AbstractC58185ywX<ResponseData<TxHistory>> abstractC58185ywXOLrzqt = OLrzqt("");
            AbstractC58185ywX<Unit> abstractC58185ywXUzCIH = uzCIH();
            final yHO yho = new yHO() { // from class: o.gDS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C19465gDj.copydefault(this.OLrzqt, (java.util.List) obj, (ResponseData) obj2, (Unit) obj3);
                }
            };
            abstractC58185ywXKWHzl = AbstractC58185ywX.AEQbTJ(abstractC58185ywXIwGUEr, abstractC58185ywXOLrzqt, abstractC58185ywXUzCIH, new InterfaceC58228yxN() { // from class: o.gDU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58228yxN
                public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C19465gDj.EZpvd(yho, obj, obj2, obj3);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        InterfaceC58217yxC interfaceC58217yxC = this.iwGUEr;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        C12827cuN c12827cuN = this.zuBGHE;
        java.lang.String str2 = this.gHZMYf;
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = c12827cuN.OLrzqt(str2 != null ? str2 : "", false).EZpvd();
        final Function1 function12 = new Function1() { // from class: o.gDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.OLrzqt(this.OLrzqt, z2, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ2 = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.AubY(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.gEa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.EZpvd(abstractC58185ywXAEQbTJ, abstractC58185ywXKWHzl, this, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXAEQbTJ2.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.gDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.zsXlph(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.gDX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.KWHzl(function0, (Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gDZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19465gDj.wlaJM(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.gDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.EZpvd(this.AEQbTJ, function0, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gDO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19465gDj.AxsJAY(function15, obj);
            }
        });
        this.iwGUEr = interfaceC58217yxCAEQbTJ;
        call().AEQbTJ(interfaceC58217yxCAEQbTJ);
    }

    public static final C10404bnn zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10404bnn) function1.invoke(obj);
    }

    public static final C10404bnn AEQbTJ(C19465gDj c19465gDj, C10404bnn c10404bnn) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        c19465gDj.zLjUOn();
        return c10404bnn;
    }

    public static final ResponseData EZpvd(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (ResponseData) yho.invoke(obj, obj2, obj3);
    }

    public static final Unit AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit OLrzqt(C19465gDj c19465gDj, boolean z, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c19465gDj.AxsJAY = abstractC12782ctV;
        if (!z) {
            c19465gDj.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(AbstractC58185ywX abstractC58185ywX, AbstractC58185ywX abstractC58185ywX2, final C19465gDj c19465gDj, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywX, abstractC58185ywX2, new InterfaceC58223yxI() { // from class: o.gDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C19465gDj.AEQbTJ(obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.gDs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.KWHzl(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.gDv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19465gDj.AuCTelauCTel(function1, obj);
            }
        });
    }

    public static final kotlin.Pair AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return C56390yDp.OLrzqt(obj, obj2);
    }

    public static final InterfaceC60096zvd AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C19465gDj c19465gDj, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return c19465gDj.AuCTelauCTel();
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function0 function0, Unit unit) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C19465gDj c19465gDj, Function0 function0, java.lang.Throwable th) {
        c19465gDj.AuCTelauCTel.setValue(new Bitmap.ActionBar(null, c19465gDj.AubY));
        pUU.copydefault(c19465gDj.getFieldNames, "intervalRefreshData error message :" + th.getMessage());
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        C10525bqB c10525bqBAEQbTJ;
        AbstractC12782ctV abstractC12782ctV;
        AbstractC12782ctV abstractC12782ctV2 = this.AxsJAY;
        if (abstractC12782ctV2 != null) {
            C10953byF c10953byF = C10953byF.KWHzl;
            java.lang.String strAkhnZx = AkhnZx();
            if (strAkhnZx == null) {
                strAkhnZx = "";
            }
            c10525bqBAEQbTJ = abstractC12782ctV2.EZpvd(c10953byF.EZpvd(strAkhnZx), AYXKKw());
        } else {
            c10525bqBAEQbTJ = null;
        }
        if (c10525bqBAEQbTJ == null) {
            C10948byA c10948byA = this.isConnected;
            C10953byF c10953byF2 = C10953byF.KWHzl;
            java.lang.String strAkhnZx2 = AkhnZx();
            C10854bwM c10854bwMKWHzl = c10948byA.KWHzl(java.lang.Long.valueOf(c10953byF2.EZpvd(strAkhnZx2 != null ? strAkhnZx2 : "")));
            if (c10854bwMKWHzl != null && (abstractC12782ctV = this.AxsJAY) != null) {
                C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                Intrinsics.copydefault(abstractC12782ctV);
                c10525bqBAEQbTJ = stateListAnimator.AEQbTJ(c10854bwMKWHzl, abstractC12782ctV, AYXKKw());
            }
        }
        if (c10525bqBAEQbTJ == null) {
            return;
        }
        MutableLiveData<C10525bqB> mutableLiveData = this.gEmmrt;
        Intrinsics.copydefault(c10525bqBAEQbTJ);
        mutableLiveData.setValue(c10525bqBAEQbTJ);
    }

    public final java.util.List<java.lang.Long> valueOf() {
        C10953byF c10953byF = C10953byF.KWHzl;
        java.lang.String strAkhnZx = AkhnZx();
        if (strAkhnZx == null) {
            strAkhnZx = "";
        }
        return C56402yEa.EZpvd(java.lang.Long.valueOf(c10953byF.EZpvd(strAkhnZx)));
    }

    public final void zLjUOn() {
        EZpvd(true, new Function1() { // from class: o.gDp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.OLrzqt(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit OLrzqt(C19465gDj c19465gDj, AbstractC12782ctV abstractC12782ctV) {
        c19465gDj.KWHzl();
        return Unit.INSTANCE;
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<TxHistory>> abstractC58185ywXOLrzqt = OLrzqt(str);
        final Function1 function1 = new Function1() { // from class: o.gDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.KWHzl(this.OLrzqt, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<TxHistory>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19465gDj.gHZMYf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19465gDj.copydefault(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gDx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19465gDj.zuBGHE(function12, obj);
            }
        }));
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C19465gDj c19465gDj, java.lang.Throwable th) {
        pUU.copydefault(c19465gDj.getFieldNames, "loadMoreCoinTxHistory error message :" + th.getMessage());
        c19465gDj.AuCTelauCTel.setValue(new Bitmap.ActionBar(th.getMessage(), c19465gDj.AubY));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58185ywX<ResponseData<TxHistory>> OLrzqt(java.lang.String str) {
        java.lang.String strDbNXlk;
        boolean zBooleanValue;
        java.lang.String strUSBtdM;
        if (str.length() == 0) {
            this.values = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        AbstractC12782ctV abstractC12782ctV = this.AxsJAY;
        if (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        arrayList.add(strDbNXlk);
        arrayList2.add(AYXKKw());
        if (this.AxsJAY == null) {
            zBooleanValue = true;
        } else {
            xWV xwv = (xWV) C43251rlk.OLrzqt(xWV.class);
            java.lang.Boolean boolValueOf = xwv != null ? java.lang.Boolean.valueOf(xwv.OLrzqt()) : null;
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            }
        }
        boolean z = zBooleanValue;
        C13934dbu c13934dbu = this.AwvSrB;
        AbstractC12782ctV abstractC12782ctV2 = this.AxsJAY;
        if (abstractC12782ctV2 == null || (strUSBtdM = abstractC12782ctV2.USBtdM()) == null) {
            strUSBtdM = "";
        }
        C10953byF c10953byF = C10953byF.KWHzl;
        java.lang.String strAkhnZx = AkhnZx();
        return c13934dbu.EZpvd(strUSBtdM, arrayList, c10953byF.EZpvd(strAkhnZx != null ? strAkhnZx : ""), arrayList2, str, 20, z);
    }

    public final AbstractC58185ywX<ChainStatus> KWHzl(long j) {
        java.util.List<? extends ChainCheckType> listEZpvd;
        C10525bqB value = this.gEmmrt.getValue();
        if (value == null) {
            AbstractC58185ywX<ChainStatus> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(ChainStatus.CANNOT_TRANSFER);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C10854bwM c10854bwMKWHzl = value.KWHzl().KWHzl();
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.hCLrkq()) {
            listEZpvd = yDY.gEmmrt(ChainCheckType.CHECK_TRANSFER, ChainCheckType.CHECK_REGISTER);
        } else {
            listEZpvd = C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER);
        }
        return ChainStatusChecker.OLrzqt.OLrzqt(j, value.zuBGHE(), value.KWHzl().OLrzqt(), listEZpvd);
    }

    public final AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> iwGUEr() {
        InterfaceC25424iwU interfaceC25424iwUAxsJAY;
        AbstractC12782ctV abstractC12782ctV = this.AxsJAY;
        if (abstractC12782ctV == null) {
            AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new java.util.ArrayList());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C10525bqB value = this.gEmmrt.getValue();
        if (value == null) {
            AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new java.util.ArrayList());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        long jAhwBna = value.KWHzl().AhwBna();
        if (value.KWHzl().giSNqX() && Intrinsics.EZpvd((java.lang.Object) value.KWHzl().fJNWhG(), (java.lang.Object) "USDG")) {
            if (!value.KWHzl().KDccX()) {
                AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new java.util.ArrayList());
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
                return abstractC58185ywXKWHzl3;
            }
            if (!abstractC12782ctV.AwvSrB() && !abstractC12782ctV.AubY()) {
                AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(new java.util.ArrayList());
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
                return abstractC58185ywXKWHzl4;
            }
        } else if (!this.djBIcL || (interfaceC25424iwUAxsJAY = AxsJAY()) == null || !interfaceC25424iwUAxsJAY.EZpvd(abstractC12782ctV.DbNXlk())) {
            AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXKWHzl5 = AbstractC58185ywX.KWHzl(new java.util.ArrayList());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl5, "");
            return abstractC58185ywXKWHzl5;
        }
        boolean zAEQbTJ = C33129mqd.AEQbTJ(value.fIwbmz(), 0);
        InterfaceC25424iwU interfaceC25424iwUAxsJAY2 = AxsJAY();
        if (interfaceC25424iwUAxsJAY2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (zAEQbTJ) {
                arrayList.add(java.lang.Long.valueOf(jAhwBna));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (!zAEQbTJ) {
                arrayList2.add(java.lang.Long.valueOf(jAhwBna));
            }
            Unit unit = Unit.INSTANCE;
            AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXOLrzqt = interfaceC25424iwUAxsJAY2.OLrzqt(arrayList, arrayList2);
            if (abstractC58185ywXOLrzqt != null) {
                return abstractC58185ywXOLrzqt;
            }
        }
        AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXKWHzl6 = AbstractC58185ywX.KWHzl(new java.util.ArrayList());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl6, "");
        return abstractC58185ywXKWHzl6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r8.getRepeatTxType() != 3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r8.getRepeatTxType() != 3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int EZpvd(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        if (coinAndAddressHistoryDetail == null) {
            return 5;
        }
        int txStatus = coinAndAddressHistoryDetail.getTxStatus();
        if (txStatus != 1) {
            if (txStatus == 2) {
                return 5;
            }
            if (txStatus == 3) {
                return 4;
            }
            if (txStatus != 5) {
                return txStatus != 6 ? 5 : 7;
            }
            return 6;
        }
        C10854bwM c10854bwMKWHzl = this.isConnected.KWHzl(coinAndAddressHistoryDetail.getMainCoinId());
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.QkdxfA()) {
            if (!coinAndAddressHistoryDetail.isShowPending()) {
                return 0;
            }
            if (coinAndAddressHistoryDetail.getRepeatTxType() != 1) {
                if (coinAndAddressHistoryDetail.getRepeatTxType() != 2) {
                }
                return 3;
            }
            return 2;
        }
        if (coinAndAddressHistoryDetail.getRepeatTxType() != 1) {
            if (coinAndAddressHistoryDetail.getRepeatTxType() != 2) {
            }
            return 3;
        }
        return 2;
    }

    public final int AEQbTJ(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        int iEZpvd = EZpvd(coinAndAddressHistoryDetail);
        int i = iEZpvd != 0 ? iEZpvd != 1 ? (iEZpvd == 2 || iEZpvd == 3) ? 2 : 4 : 1 : 3;
        if ((coinAndAddressHistoryDetail == null || !coinAndAddressHistoryDetail.isShowSpeedupCancel()) && ((coinAndAddressHistoryDetail == null || !coinAndAddressHistoryDetail.isShowCancel()) && (coinAndAddressHistoryDetail == null || !coinAndAddressHistoryDetail.isShowSpeedUp()))) {
            return i;
        }
        return 0;
    }

    public final void AEQbTJ(ResponseData<TxHistory> responseData) {
        TxHistory data;
        java.util.ArrayList<java.lang.Object> arrayList;
        java.util.List<CoinAndAddressHistoryDetail> content;
        java.util.List listEZpvd;
        java.util.ArrayList<java.lang.Object> arrayList2;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            this.values++;
            java.util.ArrayList<java.lang.Object> arrayList3 = this.AubY;
            if (arrayList3 == null) {
                this.AubY = new java.util.ArrayList<>();
            } else if (arrayList3 != null) {
                arrayList3.clear();
            }
            TxHistory data2 = responseData.getData();
            if (data2 != null && (content = data2.getContent()) != null && (listEZpvd = CollectionsKt___CollectionsKt.EZpvd(content, new Activity())) != null && (arrayList2 = this.AubY) != null) {
                arrayList2.addAll(listEZpvd);
            }
            java.util.ArrayList<java.lang.Object> arrayList4 = this.AubY;
            if (arrayList4 == null || !arrayList4.isEmpty()) {
                if (this.AubY != null && (!r0.isEmpty()) && (data = responseData.getData()) != null && Intrinsics.EZpvd(data.getHasViewMore(), java.lang.Boolean.FALSE) && (arrayList = this.AubY) != null) {
                    TxHistory data3 = responseData.getData();
                    arrayList.add(new C14322djK(data3 != null ? data3.getExplorerUrl() : null));
                }
            } else {
                java.util.ArrayList<java.lang.Object> arrayList5 = this.AubY;
                if (arrayList5 != null) {
                    TxHistory data4 = responseData.getData();
                    arrayList5.add(new C14316djE(data4 != null ? data4.getExplorerUrl() : null, 0, 2, null));
                }
            }
            this.AuCTelauCTel.setValue(new Bitmap.StateListAnimator(this.AubY));
            return;
        }
        this.AuCTelauCTel.setValue(new Bitmap.ActionBar(responseData.getMsg(), this.AubY));
    }

    public static final InterfaceC60096zvd djBIcL(C19465gDj c19465gDj, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            pUU.copydefault(c19465gDj.getFieldNames, "queryUsdgAddressRegisterStatus: request error");
            c19465gDj.copydefault.setValue(null);
            return AbstractC58185ywX.KWHzl(new C18177fdV("", -1L, "", AddressRegisterStatus.STATUS_UNACTIVATED, ActivityStatus.STATUS_CLOSED));
        }
        pUU.copydefault(c19465gDj.getFieldNames, "queryUsdgAddressRegisterStatus normal");
        java.lang.Object data = responseData.getData();
        Intrinsics.copydefault(data);
        HotActivityAddressStatusResp hotActivityAddressStatusResp = (HotActivityAddressStatusResp) data;
        java.lang.String userAddress = hotActivityAddressStatusResp.getAddressRegisterDetail().getUserAddress();
        long chainIndex = hotActivityAddressStatusResp.getAddressRegisterDetail().getChainIndex();
        java.lang.String tokenAddress = hotActivityAddressStatusResp.getAddressRegisterDetail().getTokenAddress();
        AddressRegisterStatus addressRegisterStatusCopydefault = AddressRegisterStatus.Companion.copydefault(hotActivityAddressStatusResp.getAddressRegisterDetail().getStatus());
        if (addressRegisterStatusCopydefault == null) {
            addressRegisterStatusCopydefault = AddressRegisterStatus.STATUS_UNACTIVATED;
        }
        AddressRegisterStatus addressRegisterStatus = addressRegisterStatusCopydefault;
        ActivityStatus activityStatusAEQbTJ = ActivityStatus.Companion.AEQbTJ(hotActivityAddressStatusResp.getActivityDetail().getActivityStatus());
        if (activityStatusAEQbTJ == null) {
            activityStatusAEQbTJ = ActivityStatus.STATUS_CLOSED;
        }
        C18177fdV c18177fdV = new C18177fdV(userAddress, chainIndex, tokenAddress, addressRegisterStatus, activityStatusAEQbTJ);
        c19465gDj.copydefault.setValue(c18177fdV);
        return AbstractC58185ywX.KWHzl(c18177fdV);
    }

    public static final Unit OLrzqt(C19465gDj c19465gDj, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            MutableLiveData<WalletCoinLatestPnlResponse> mutableLiveData = c19465gDj.AEQbTJ;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            mutableLiveData.postValue((WalletCoinLatestPnlResponse) data);
        }
        return Unit.INSTANCE;
    }

    public static final ResponseData copydefault(C19465gDj c19465gDj, java.util.List list, ResponseData responseData, Unit unit) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(unit, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c19465gDj.AEQbTJ((ResponseData<TxHistory>) responseData);
            c19465gDj.hDKMBd.setValue(list);
        }
        return responseData;
    }

    public static final Unit KWHzl(C19465gDj c19465gDj, ResponseData responseData) {
        TxHistory txHistory;
        java.util.ArrayList<java.lang.Object> arrayList;
        java.util.List<CoinAndAddressHistoryDetail> content;
        java.util.ArrayList<java.lang.Object> arrayList2;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c19465gDj.values++;
            if (c19465gDj.AubY == null) {
                c19465gDj.AubY = new java.util.ArrayList<>();
            }
            TxHistory txHistory2 = (TxHistory) responseData.getData();
            if (txHistory2 != null && (content = txHistory2.getContent()) != null && (arrayList2 = c19465gDj.AubY) != null) {
                arrayList2.addAll(content);
            }
            if (c19465gDj.AubY != null && (!r0.isEmpty()) && ((((txHistory = (TxHistory) responseData.getData()) != null && Intrinsics.EZpvd(txHistory.getHasViewMore(), java.lang.Boolean.FALSE)) || c19465gDj.values == 50) && (arrayList = c19465gDj.AubY) != null)) {
                TxHistory txHistory3 = (TxHistory) responseData.getData();
                arrayList.add(new C14322djK(txHistory3 != null ? txHistory3.getExplorerUrl() : null));
            }
            c19465gDj.AuCTelauCTel.setValue(new Bitmap.StateListAnimator(c19465gDj.AubY));
        } else {
            c19465gDj.AuCTelauCTel.setValue(new Bitmap.ActionBar(responseData.getMsg(), c19465gDj.AubY));
        }
        return Unit.INSTANCE;
    }
}
