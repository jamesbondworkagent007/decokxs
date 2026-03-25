package o;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SelfSwapStatus;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC22387heR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hsa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23138hsa extends AndroidViewModel {
    public final android.app.Application AEQbTJ;
    public MutableLiveData<java.lang.Boolean> AYXKKw;
    public java.lang.Object AhwBna;
    public final C25412iwI AkhnZx;
    public TradeParam DbNXlk;
    public final MutableLiveData<java.lang.Integer> EZpvd;
    public C23314hvr<java.lang.Boolean> KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public final MutableLiveData<java.lang.Boolean> copydefault;
    public final LiveData<java.lang.Integer> djBIcL;
    public C23314hvr<CurrentChain> gEmmrt;
    public AbstractC23101hrq isConnected;
    public final LiveData<java.lang.Boolean> valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<CurrentChain> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.Boolean> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Integer> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<CurrentChain> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.app.Application)
  (r2v0 java.lang.String)
  (wrap:com.okinc.business.dex.api.bean.TradeParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.TradeParam) : (r3v0 com.okinc.business.dex.api.bean.TradeParam))
 A[MD:(android.app.Application, java.lang.String, com.okinc.business.dex.api.bean.TradeParam):void (m)] (LINE:29) call: o.hsa.<init>(android.app.Application, java.lang.String, com.okinc.business.dex.api.bean.TradeParam):void type: THIS */
    public /* synthetic */ C23138hsa(android.app.Application application, java.lang.String str, TradeParam tradeParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, (i & 4) != 0 ? null : tradeParam);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23138hsa(@NotNull android.app.Application application, @NotNull java.lang.String str, TradeParam tradeParam) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = application;
        this.values = str;
        this.DbNXlk = tradeParam;
        this.KWHzl = new C23314hvr<>();
        this.gEmmrt = new C23314hvr<>();
        this.AYXKKw = new MutableLiveData<>();
        this.AhwBna = new java.lang.Object();
        this.AkhnZx = new C25412iwI();
        MutableLiveData<java.lang.Integer> mutableLiveData = new MutableLiveData<>(0);
        this.EZpvd = mutableLiveData;
        this.djBIcL = mutableLiveData;
        MutableLiveData<java.lang.Boolean> mutableLiveData2 = new MutableLiveData<>(java.lang.Boolean.TRUE);
        this.copydefault = mutableLiveData2;
        this.valueOf = mutableLiveData2;
    }

    public final void AEQbTJ(boolean z) {
        this.copydefault.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void valueOf() {
        C22380heK c22380heK = C22380heK.OLrzqt;
        java.util.ArrayList<DefiChainInfo> arrayListOLrzqt = c22380heK.copydefault(this.values).AkhnZx().OLrzqt();
        if (C33129mqd.KWHzl((java.util.Collection) arrayListOLrzqt)) {
            this.KWHzl.setValue(java.lang.Boolean.FALSE);
            EZpvd(arrayListOLrzqt);
            return;
        }
        AbstractC58185ywX supportChainList$default = InterfaceC22387heR.Application.getSupportChainList$default(c22380heK.copydefault(this.values).AkhnZx(), "3", false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.hrX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23138hsa.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hrZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23138hsa.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hsj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23138hsa.EZpvd(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = supportChainList$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hsh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23138hsa.AkhnZx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.AhwBna);
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23138hsa c23138hsa, java.util.List list) {
        Intrinsics.copydefault(list);
        c23138hsa.EZpvd(list);
        c23138hsa.KWHzl.setValue(java.lang.Boolean.valueOf(list.isEmpty()));
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C23138hsa c23138hsa, java.lang.Throwable th) {
        c23138hsa.KWHzl.setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.util.List<DefiChainInfo> list) {
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(this.values).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23138hsa.AEQbTJ(this.OLrzqt, list, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hsb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23138hsa.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hsf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23138hsa.KWHzl(this.AEQbTJ, list, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hsd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23138hsa.AuCTel(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.AhwBna);
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23138hsa c23138hsa, java.util.List list, InterfaceC9738bbJ interfaceC9738bbJ) {
        c23138hsa.KWHzl((java.util.List<DefiChainInfo>) list, interfaceC9738bbJ);
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C23138hsa c23138hsa, java.util.List list, java.lang.Throwable th) {
        c23138hsa.KWHzl((java.util.List<DefiChainInfo>) list, (InterfaceC9738bbJ) null);
        return Unit.INSTANCE;
    }

    public final CurrentChain AEQbTJ(@NotNull CurrentChain currentChain) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(currentChain, "");
        if (Intrinsics.EZpvd((java.lang.Object) currentChain.getData().getChainId(), (java.lang.Object) "0")) {
            C25412iwI c25412iwI = this.AkhnZx;
            InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.values).fARcdN().valueOf();
            TradeParam tradeParam = this.DbNXlk;
            strEZpvd = c25412iwI.EZpvd(interfaceC9738bbJValueOf, "0", tradeParam != null ? tradeParam.getBtcAddressType() : null);
        } else {
            strEZpvd = null;
        }
        DefiChainInfo data = currentChain.getData();
        return CurrentChain.copy$default(currentChain, null, data.copy(((-268435457) & 1) != 0 ? data.id : null, ((-268435457) & 2) != 0 ? data.chainName : null, ((-268435457) & 4) != 0 ? data.chainId : null, ((-268435457) & 8) != 0 ? data.chainSymbol : null, ((-268435457) & 16) != 0 ? data.chainUsed : null, ((-268435457) & 32) != 0 ? data.logoUrl : null, ((-268435457) & 64) != 0 ? data.resourceId : 0, ((-268435457) & 128) != 0 ? data.sortMultipleSwap : null, ((-268435457) & 256) != 0 ? data.tradeHashUrl : null, ((-268435457) & 512) != 0 ? data.network : null, ((-268435457) & 1024) != 0 ? data.baseToken : null, ((-268435457) & 2048) != 0 ? data.hotTokens : null, ((-268435457) & 4096) != 0 ? data.tokenAddress : null, ((-268435457) & 8192) != 0 ? data.reserveGas : null, ((-268435457) & 16384) != 0 ? data.sortCrossbridge : 0, ((-268435457) & 32768) != 0 ? data.sortSingleswap : 0, ((-268435457) & 65536) != 0 ? data.dexDefaultFromToTokenShowVO : null, ((-268435457) & 131072) != 0 ? data.chainType : null, ((-268435457) & 262144) != 0 ? data.bridgeSupportChainList : null, ((-268435457) & 524288) != 0 ? data.bridgeSupportChainInfoList : null, ((-268435457) & 1048576) != 0 ? data.crossChainType : null, ((-268435457) & 2097152) != 0 ? data.walletExplorePrefix : null, ((-268435457) & 4194304) != 0 ? data.isChainDisplay : null, ((-268435457) & 8388608) != 0 ? data.isSensitive : 0, ((-268435457) & 16777216) != 0 ? data.isNeedDealFeeCallData : null, ((-268435457) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? data.supportSwapType : null, ((-268435457) & 67108864) != 0 ? data.supportAAWallet : null, ((-268435457) & 134217728) != 0 ? data.gasPriceScalar : null, ((-268435457) & 268435456) != 0 ? data.localUserWalletAddress : strEZpvd, ((-268435457) & 536870912) != 0 ? data.isSupportDappTrade : 0, ((-268435457) & 1073741824) != 0 ? data.isSupportMarket : 0, ((-268435457) & Integer.MIN_VALUE) != 0 ? data.isSupportBlinksShareUrl : 0, (4194303 & 1) != 0 ? data.supportMev : null, (4194303 & 2) != 0 ? data.popularChain : false, (4194303 & 4) != 0 ? data.popularWeight : null, (4194303 & 8) != 0 ? data.crossAbility : null, (4194303 & 16) != 0 ? data.searchKey : null, (4194303 & 32) != 0 ? data.supportMemeMode : false, (4194303 & 64) != 0 ? data.supportCefiMode : false, (4194303 & 128) != 0 ? data.supportBatchBroadcast : false, (4194303 & 256) != 0 ? data.networkFeeUnit : null, (4194303 & 512) != 0 ? data.networkFeeDisplayDecimals : null, (4194303 & 1024) != 0 ? data.supportEip1559 : false, (4194303 & 2048) != 0 ? data.networkFeeType : null, (4194303 & 4096) != 0 ? data.nativeTokenSymbol : null, (4194303 & 8192) != 0 ? data.supportSmartAccount : false, (4194303 & 16384) != 0 ? data.supportLimitSwap : false, (4194303 & 32768) != 0 ? data.supportLimitU : false, (4194303 & 65536) != 0 ? data.supportTpSl : false, (4194303 & 131072) != 0 ? data.supportCopyTrade : false, (4194303 & 262144) != 0 ? data.supportCopyTradeCreate : false, (4194303 & 524288) != 0 ? data.isUpgradeRequired : false, (4194303 & 1048576) != 0 ? data.limitOrderTradeMinUSD : null, (4194303 & 2097152) != 0 ? data.needTop : false), 1, null);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        AbstractC58185ywX<SelfSwapStatus> abstractC58185ywXCopydefault = c22380heK.copydefault(this.values).copydefault().copydefault(c22380heK.copydefault(this.values).fARcdN().KWHzl(str));
        final Function1 function1 = new Function1() { // from class: o.hso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23138hsa.AEQbTJ(this.KWHzl, (SelfSwapStatus) obj);
            }
        };
        InterfaceC58227yxM<? super SelfSwapStatus> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hsm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23138hsa.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hrY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23138hsa.OLrzqt(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hse
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23138hsa.gEmmrt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.AhwBna);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23138hsa c23138hsa, SelfSwapStatus selfSwapStatus) {
        c23138hsa.AYXKKw.setValue(java.lang.Boolean.valueOf(C23313hvq.copydefault(selfSwapStatus.getHasPointStatus(), "1")));
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C23138hsa c23138hsa, java.lang.Throwable th) {
        c23138hsa.AYXKKw.setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        AbstractC58185ywX<java.util.List<SlippageConfigVo>> abstractC58185ywXCopydefault = C22380heK.OLrzqt.copydefault(this.values).copydefault().copydefault();
        final Function1 function1 = new Function1() { // from class: o.hsg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23138hsa.copydefault((java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<SlippageConfigVo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hsk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23138hsa.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hsi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23138hsa.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hsp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23138hsa.isConnected(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.AhwBna);
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.util.List list) {
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        KWHzl(EZpvd());
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        fetchVPNInfo();
    }

    public final void fetchVPNInfo() {
        C33050mpD.OLrzqt(this.AhwBna);
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.isConnected = null;
    }

    public static /* synthetic */ java.lang.String getWalletAddress$default(C23138hsa c23138hsa, InterfaceC9738bbJ interfaceC9738bbJ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC9738bbJ = null;
        }
        return c23138hsa.copydefault(interfaceC9738bbJ);
    }

    public final java.lang.String copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
        C25412iwI c25412iwI = this.AkhnZx;
        if (interfaceC9738bbJ == null) {
            interfaceC9738bbJ = C22380heK.OLrzqt.copydefault(this.values).fARcdN().AEQbTJ();
        }
        java.lang.String strEZpvd = EZpvd();
        TradeParam tradeParam = this.DbNXlk;
        return c25412iwI.EZpvd(interfaceC9738bbJ, strEZpvd, tradeParam != null ? tradeParam.getBtcAddressType() : null);
    }

    public final java.lang.String EZpvd() {
        DefiChainInfo data;
        CurrentChain value = this.gEmmrt.getValue();
        java.lang.String chainId = (value == null || (data = value.getData()) == null) ? null : data.getChainId();
        return (chainId == null || chainId.length() == 0) ? "1" : chainId;
    }

    public final java.lang.Boolean gEmmrt() {
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(this.values).fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ != null) {
            return java.lang.Boolean.valueOf(interfaceC9738bbJAEQbTJ.getFieldNames());
        }
        return null;
    }

    public final void KWHzl(java.util.List<DefiChainInfo> list, InterfaceC9738bbJ interfaceC9738bbJ) {
        CoinInfo fromCoinInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DefiChainInfo defiChainInfo : list) {
            arrayList.add(new CurrentChain(defiChainInfo.getChainName(), defiChainInfo));
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = C23317hvu.EZpvd();
        TradeParam tradeParam = this.DbNXlk;
        java.lang.Object obj = null;
        java.lang.String chainId = (tradeParam == null || (fromCoinInfo = tradeParam.getFromCoinInfo()) == null) ? null : fromCoinInfo.getChainId();
        java.lang.String chainId2 = dexMultiTokenInfoBeanEZpvd != null ? dexMultiTokenInfoBeanEZpvd.getChainId() : null;
        if (chainId2 == null) {
            chainId2 = "";
        }
        if (chainId == null || chainId.length() == 0) {
            chainId = chainId2;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            CurrentChain currentChain = (CurrentChain) obj2;
            if (interfaceC9738bbJ != null && interfaceC9738bbJ.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(currentChain.getData().getChainId())))) {
                arrayList2.add(obj2);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((CurrentChain) next).getData().getChainId(), (java.lang.Object) chainId)) {
                obj = next;
                break;
            }
        }
        CurrentChain currentChain2 = (CurrentChain) obj;
        if (currentChain2 == null && (currentChain2 = (CurrentChain) CollectionsKt___CollectionsKt.firstOrNull(arrayList2)) == null) {
            currentChain2 = (CurrentChain) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
        }
        this.gEmmrt.setValue(AEQbTJ(currentChain2));
        AYXKKw();
    }
}
