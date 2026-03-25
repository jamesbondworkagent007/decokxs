package o;

import androidx.lifecycle.MutableLiveData;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SelfSwapStatus;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC22387heR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hsK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23122hsK extends AbstractC33073mpa {
    public final C25412iwI AEQbTJ;
    public final C23314hvr<java.lang.Boolean> EZpvd;
    public final C23314hvr<CurrentChain> KWHzl;
    public final java.lang.String OLrzqt;
    public final MutableLiveData<java.lang.Boolean> copydefault;
    public TradeParam valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<CurrentChain> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<CurrentChain> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.Boolean> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:com.okinc.business.dex.api.bean.TradeParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.TradeParam) : (r2v0 com.okinc.business.dex.api.bean.TradeParam))
  (wrap:o.iwI:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iwI:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:26) call: o.iwI.<init>():void type: CONSTRUCTOR) : (r3v0 o.iwI))
 A[MD:(java.lang.String, com.okinc.business.dex.api.bean.TradeParam, o.iwI):void (m)] (LINE:23) call: o.hsK.<init>(java.lang.String, com.okinc.business.dex.api.bean.TradeParam, o.iwI):void type: THIS */
    public /* synthetic */ C23122hsK(java.lang.String str, TradeParam tradeParam, C25412iwI c25412iwI, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : tradeParam, (i & 4) != 0 ? new C25412iwI() : c25412iwI);
    }

    public C23122hsK(@NotNull java.lang.String str, TradeParam tradeParam, @NotNull C25412iwI c25412iwI) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c25412iwI, "");
        this.OLrzqt = str;
        this.valueOf = tradeParam;
        this.AEQbTJ = c25412iwI;
        this.KWHzl = new C23314hvr<>();
        this.EZpvd = new C23314hvr<>();
        this.copydefault = new MutableLiveData<>();
    }

    public final void copydefault(@NotNull CurrentChain currentChain) {
        Intrinsics.checkNotNullParameter(currentChain, "");
        this.KWHzl.setValue(currentChain);
    }

    public final void valueOf() {
        C22380heK c22380heK = C22380heK.OLrzqt;
        java.util.ArrayList<DefiChainInfo> arrayListEZpvd = c22380heK.copydefault(this.OLrzqt).AkhnZx().EZpvd();
        if (C33129mqd.KWHzl((java.util.Collection) arrayListEZpvd)) {
            this.EZpvd.setValue(java.lang.Boolean.FALSE);
            copydefault(arrayListEZpvd);
            return;
        }
        AbstractC58185ywX supportSingleChainList$default = InterfaceC22387heR.Application.getSupportSingleChainList$default(c22380heK.copydefault(this.OLrzqt).AkhnZx(), "3", false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.hsT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23122hsK.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hsQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23122hsK.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hsV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23122hsK.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = supportSingleChainList$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hsX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23122hsK.values(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C23122hsK c23122hsK, java.util.List list) {
        Intrinsics.copydefault(list);
        c23122hsK.copydefault((java.util.List<DefiChainInfo>) list);
        c23122hsK.EZpvd.setValue(java.lang.Boolean.valueOf(list.isEmpty()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C23122hsK c23122hsK, java.lang.Throwable th) {
        c23122hsK.EZpvd.setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final java.util.List<DefiChainInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(this.OLrzqt).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hsY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23122hsK.EZpvd(this.AEQbTJ, list, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hsW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23122hsK.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23122hsK.AEQbTJ(this.copydefault, list, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hsS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23122hsK.djBIcL(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C23122hsK c23122hsK, java.util.List list, InterfaceC9738bbJ interfaceC9738bbJ) {
        c23122hsK.OLrzqt((java.util.List<DefiChainInfo>) list, interfaceC9738bbJ);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23122hsK c23122hsK, java.util.List list, java.lang.Throwable th) {
        c23122hsK.OLrzqt((java.util.List<DefiChainInfo>) list, (InterfaceC9738bbJ) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull java.util.List<DefiChainInfo> list, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String chainId;
        CurrentChain currentChain;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DefiChainInfo defiChainInfo : list) {
            arrayList.add(new CurrentChain(defiChainInfo.getChainName(), defiChainInfo));
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = C22380heK.OLrzqt.copydefault(this.OLrzqt).fJNWhG().AEQbTJ();
        TradeParam tradeParam = this.valueOf;
        java.lang.Object obj = null;
        if (tradeParam == null) {
            chainId = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getChainId() : null;
        } else {
            java.lang.String chainId2 = tradeParam.getFromCoinInfo().getChainId();
            if (chainId2.length() <= 0) {
                chainId2 = null;
            }
            if (chainId2 == null) {
                java.lang.String chainId3 = tradeParam.getToCoinInfo().getChainId();
                if (chainId3.length() <= 0) {
                    chainId3 = null;
                }
                if (chainId3 != null) {
                    chainId = chainId3;
                } else if (dexMultiTokenInfoBeanAEQbTJ != null) {
                    chainId = dexMultiTokenInfoBeanAEQbTJ.getChainId();
                }
            } else {
                chainId = chainId2;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            CurrentChain currentChain2 = (CurrentChain) obj2;
            if (interfaceC9738bbJ != null && interfaceC9738bbJ.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(currentChain2.getData().getChainId())))) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
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
            currentChain = (CurrentChain) obj;
            if (currentChain == null) {
                currentChain = (CurrentChain) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList2);
            }
        } else {
            currentChain = (CurrentChain) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
        }
        this.KWHzl.postValue(KWHzl(currentChain));
    }

    private final CurrentChain KWHzl(CurrentChain currentChain) {
        java.lang.String strEZpvd;
        if (Intrinsics.EZpvd((java.lang.Object) currentChain.getData().getChainId(), (java.lang.Object) "0")) {
            C25412iwI c25412iwI = this.AEQbTJ;
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(this.OLrzqt).fARcdN().AEQbTJ();
            TradeParam tradeParam = this.valueOf;
            strEZpvd = c25412iwI.EZpvd(interfaceC9738bbJAEQbTJ, "0", tradeParam != null ? tradeParam.getBtcAddressType() : null);
        } else {
            strEZpvd = null;
        }
        DefiChainInfo data = currentChain.getData();
        return CurrentChain.copy$default(currentChain, null, data.copy(((-268435457) & 1) != 0 ? data.id : null, ((-268435457) & 2) != 0 ? data.chainName : null, ((-268435457) & 4) != 0 ? data.chainId : null, ((-268435457) & 8) != 0 ? data.chainSymbol : null, ((-268435457) & 16) != 0 ? data.chainUsed : null, ((-268435457) & 32) != 0 ? data.logoUrl : null, ((-268435457) & 64) != 0 ? data.resourceId : 0, ((-268435457) & 128) != 0 ? data.sortMultipleSwap : null, ((-268435457) & 256) != 0 ? data.tradeHashUrl : null, ((-268435457) & 512) != 0 ? data.network : null, ((-268435457) & 1024) != 0 ? data.baseToken : null, ((-268435457) & 2048) != 0 ? data.hotTokens : null, ((-268435457) & 4096) != 0 ? data.tokenAddress : null, ((-268435457) & 8192) != 0 ? data.reserveGas : null, ((-268435457) & 16384) != 0 ? data.sortCrossbridge : 0, ((-268435457) & 32768) != 0 ? data.sortSingleswap : 0, ((-268435457) & 65536) != 0 ? data.dexDefaultFromToTokenShowVO : null, ((-268435457) & 131072) != 0 ? data.chainType : null, ((-268435457) & 262144) != 0 ? data.bridgeSupportChainList : null, ((-268435457) & 524288) != 0 ? data.bridgeSupportChainInfoList : null, ((-268435457) & 1048576) != 0 ? data.crossChainType : null, ((-268435457) & 2097152) != 0 ? data.walletExplorePrefix : null, ((-268435457) & 4194304) != 0 ? data.isChainDisplay : null, ((-268435457) & 8388608) != 0 ? data.isSensitive : 0, ((-268435457) & 16777216) != 0 ? data.isNeedDealFeeCallData : null, ((-268435457) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? data.supportSwapType : null, ((-268435457) & 67108864) != 0 ? data.supportAAWallet : null, ((-268435457) & 134217728) != 0 ? data.gasPriceScalar : null, ((-268435457) & 268435456) != 0 ? data.localUserWalletAddress : strEZpvd, ((-268435457) & 536870912) != 0 ? data.isSupportDappTrade : 0, ((-268435457) & 1073741824) != 0 ? data.isSupportMarket : 0, ((-268435457) & Integer.MIN_VALUE) != 0 ? data.isSupportBlinksShareUrl : 0, (4194303 & 1) != 0 ? data.supportMev : null, (4194303 & 2) != 0 ? data.popularChain : false, (4194303 & 4) != 0 ? data.popularWeight : null, (4194303 & 8) != 0 ? data.crossAbility : null, (4194303 & 16) != 0 ? data.searchKey : null, (4194303 & 32) != 0 ? data.supportMemeMode : false, (4194303 & 64) != 0 ? data.supportCefiMode : false, (4194303 & 128) != 0 ? data.supportBatchBroadcast : false, (4194303 & 256) != 0 ? data.networkFeeUnit : null, (4194303 & 512) != 0 ? data.networkFeeDisplayDecimals : null, (4194303 & 1024) != 0 ? data.supportEip1559 : false, (4194303 & 2048) != 0 ? data.networkFeeType : null, (4194303 & 4096) != 0 ? data.nativeTokenSymbol : null, (4194303 & 8192) != 0 ? data.supportSmartAccount : false, (4194303 & 16384) != 0 ? data.supportLimitSwap : false, (4194303 & 32768) != 0 ? data.supportLimitU : false, (4194303 & 65536) != 0 ? data.supportTpSl : false, (4194303 & 131072) != 0 ? data.supportCopyTrade : false, (4194303 & 262144) != 0 ? data.supportCopyTradeCreate : false, (4194303 & 524288) != 0 ? data.isUpgradeRequired : false, (4194303 & 1048576) != 0 ? data.limitOrderTradeMinUSD : null, (4194303 & 2097152) != 0 ? data.needTop : false), 1, null);
    }

    public final void EZpvd(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        AbstractC58185ywX<SelfSwapStatus> abstractC58185ywXCopydefault = c22380heK.copydefault(this.OLrzqt).copydefault().copydefault(c22380heK.copydefault(this.OLrzqt).fARcdN().KWHzl(str));
        final Function1 function1 = new Function1() { // from class: o.hsL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23122hsK.AEQbTJ(this.OLrzqt, (SelfSwapStatus) obj);
            }
        };
        InterfaceC58227yxM<? super SelfSwapStatus> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hsN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23122hsK.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23122hsK.AEQbTJ(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hsP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23122hsK.AhwBna(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23122hsK c23122hsK, SelfSwapStatus selfSwapStatus) {
        c23122hsK.copydefault.setValue(java.lang.Boolean.valueOf(C23313hvq.copydefault(selfSwapStatus.getHasPointStatus(), "1")));
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23122hsK c23122hsK, java.lang.Throwable th) {
        c23122hsK.copydefault.setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        EZpvd(OLrzqt());
    }

    public static /* synthetic */ java.lang.String getWalletAddress$default(C23122hsK c23122hsK, InterfaceC9738bbJ interfaceC9738bbJ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC9738bbJ = null;
        }
        return c23122hsK.AEQbTJ(interfaceC9738bbJ);
    }

    public final java.lang.String AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
        C25412iwI c25412iwI = this.AEQbTJ;
        if (interfaceC9738bbJ == null) {
            interfaceC9738bbJ = C22380heK.OLrzqt.copydefault(this.OLrzqt).fARcdN().AEQbTJ();
        }
        java.lang.String strOLrzqt = OLrzqt();
        TradeParam tradeParam = this.valueOf;
        return c25412iwI.EZpvd(interfaceC9738bbJ, strOLrzqt, tradeParam != null ? tradeParam.getBtcAddressType() : null);
    }

    public final java.lang.String OLrzqt() {
        DefiChainInfo data;
        java.lang.String chainId;
        CurrentChain value = this.KWHzl.getValue();
        return (value == null || (data = value.getData()) == null || (chainId = data.getChainId()) == null) ? "" : chainId;
    }

    public final java.lang.Boolean KWHzl() {
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(this.OLrzqt).fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ != null) {
            return java.lang.Boolean.valueOf(interfaceC9738bbJAEQbTJ.getFieldNames());
        }
        return null;
    }
}
