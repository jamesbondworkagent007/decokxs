package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListViewModel$getCustomTabList$1;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListViewModel$loadChainList$1;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListViewModel$loadMultiChain$1;
import com.okinc.business.trade.features.home.tokenlist.ui.viewmodel.TokenListViewModel$updateSelectedChain$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC28377kZd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.laD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30384laD extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final StateFlow<InterfaceC28377kZd> AEQbTJ;
    public final C29709kyk AYXKKw;
    public final java.util.ArrayList<java.lang.String> AhwBna;
    public final StateFlow<java.lang.String> AkhnZx;
    public TradingBizType DbNXlk;
    public final MutableStateFlow<java.lang.String> EZpvd;
    public final MutableStateFlow<InterfaceC28377kZd> KWHzl;
    public final C23314hvr<kotlin.Pair<DexMultiTokenInfoBean, java.lang.Boolean>> OLrzqt;
    public final kUH djBIcL;
    public boolean fetchVPNInfo;
    public final C28387kZn gEmmrt;
    public boolean isConnected;
    public java.lang.String valueOf;

    /* JADX INFO: renamed from: o.laD$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingBizType.values().length];
            try {
                iArr[TradingBizType.Simple.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradingBizType.Meme.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingBizType.AdvancedMarket.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TradingBizType.Advanced.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TradingBizType.Market.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[TradingBizType.Limit.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[TradingBizType.Bridge.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28377kZd> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingBizType OLrzqt() {
        return this.DbNXlk;
    }

    public C30384laD(@NotNull kUH kuh, @NotNull C28387kZn c28387kZn, @NotNull C29709kyk c29709kyk) {
        Intrinsics.checkNotNullParameter(kuh, "");
        Intrinsics.checkNotNullParameter(c28387kZn, "");
        Intrinsics.checkNotNullParameter(c29709kyk, "");
        this.djBIcL = kuh;
        this.gEmmrt = c28387kZn;
        this.AYXKKw = c29709kyk;
        this.valueOf = "";
        this.DbNXlk = TradingBizType.AdvancedMarket;
        this.fetchVPNInfo = true;
        this.AhwBna = new java.util.ArrayList<>();
        MutableStateFlow<InterfaceC28377kZd> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC28377kZd.Application.copydefault);
        this.KWHzl = MutableStateFlow;
        MutableStateFlow<java.lang.String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.EZpvd = MutableStateFlow2;
        this.OLrzqt = new C23314hvr<>();
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow2);
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: renamed from: o.laD$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.laD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final LiveData<kotlin.Pair<DexMultiTokenInfoBean, java.lang.Boolean>> copydefault() {
        C23314hvr<kotlin.Pair<DexMultiTokenInfoBean, java.lang.Boolean>> c23314hvr = this.OLrzqt;
        Intrinsics.copydefault(c23314hvr, "");
        return c23314hvr;
    }

    public final void AEQbTJ(boolean z, @NotNull java.lang.String str, @NotNull TradingBizType tradingBizType, boolean z2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradingBizType, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.isConnected = z;
        this.valueOf = str;
        this.DbNXlk = tradingBizType;
        this.fetchVPNInfo = z2;
        this.AhwBna.addAll(list);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenListViewModel$loadChainList$1(this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<DefiChainInfo> list, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TokenListViewModel$loadMultiChain$1 tokenListViewModel$loadMultiChain$1;
        C30384laD c30384laD;
        java.lang.Object next;
        java.lang.Object next2;
        if (continuation instanceof TokenListViewModel$loadMultiChain$1) {
            tokenListViewModel$loadMultiChain$1 = (TokenListViewModel$loadMultiChain$1) continuation;
            int i = tokenListViewModel$loadMultiChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenListViewModel$loadMultiChain$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenListViewModel$loadMultiChain$1 = new TokenListViewModel$loadMultiChain$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = tokenListViewModel$loadMultiChain$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = tokenListViewModel$loadMultiChain$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            tokenListViewModel$loadMultiChain$1.L$0 = this;
            tokenListViewModel$loadMultiChain$1.L$1 = list;
            tokenListViewModel$loadMultiChain$1.L$2 = str;
            tokenListViewModel$loadMultiChain$1.label = 1;
            objCopydefault = copydefault(tokenListViewModel$loadMultiChain$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c30384laD = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) tokenListViewModel$loadMultiChain$1.L$2;
            list = (java.util.List) tokenListViewModel$loadMultiChain$1.L$1;
            c30384laD = (C30384laD) tokenListViewModel$loadMultiChain$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.List<java.lang.String> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) objCopydefault);
        if (listFJNWhG.isEmpty()) {
            c30384laD.KWHzl.setValue(InterfaceC28377kZd.StateListAnimator.AEQbTJ);
            return Unit.INSTANCE;
        }
        int iIndexOf = listFJNWhG.indexOf(str);
        if (iIndexOf == -1 || iIndexOf >= 7) {
            listFJNWhG.remove(str);
            listFJNWhG.add(0, str);
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DefiChainInfo) next).getNeedTop()) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        java.lang.String chainId = defiChainInfo != null ? defiChainInfo.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        listFJNWhG.remove(chainId);
        listFJNWhG.add(0, chainId);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : listFJNWhG) {
            java.util.Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next2).getChainId(), (java.lang.Object) str2)) {
                    break;
                }
            }
            DefiChainInfo defiChainInfo2 = (DefiChainInfo) next2;
            if (defiChainInfo2 != null) {
                arrayList.add(defiChainInfo2);
            }
        }
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 7);
        c30384laD.gEmmrt.EZpvd(listFJNWhG);
        c30384laD.KWHzl.setValue(new InterfaceC28377kZd.Activity(listAhwBna, str));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super java.util.List<java.lang.String>> continuation) throws java.lang.Throwable {
        TokenListViewModel$getCustomTabList$1 tokenListViewModel$getCustomTabList$1;
        C30384laD c30384laD;
        if (continuation instanceof TokenListViewModel$getCustomTabList$1) {
            tokenListViewModel$getCustomTabList$1 = (TokenListViewModel$getCustomTabList$1) continuation;
            int i = tokenListViewModel$getCustomTabList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenListViewModel$getCustomTabList$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenListViewModel$getCustomTabList$1 = new TokenListViewModel$getCustomTabList$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = tokenListViewModel$getCustomTabList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenListViewModel$getCustomTabList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.List<java.lang.String> listOLrzqt = this.gEmmrt.OLrzqt();
            if (!listOLrzqt.isEmpty()) {
                return listOLrzqt;
            }
            kUH kuh = this.djBIcL;
            ChainBizType chainBizType = ChainBizType.Single;
            tokenListViewModel$getCustomTabList$1.L$0 = this;
            tokenListViewModel$getCustomTabList$1.label = 1;
            objEZpvd = kuh.EZpvd(chainBizType, tokenListViewModel$getCustomTabList$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c30384laD = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c30384laD = (C30384laD) tokenListViewModel$getCustomTabList$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List list = (java.util.List) ((AbstractC43419rot) objEZpvd).copydefault();
        if (list == null || list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(((DefiChainInfo) it.next()).getChainId());
        }
        c30384laD.gEmmrt.EZpvd(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: o.laD$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((DefiChainInfo) t2).getPopularWeight())), java.lang.Long.valueOf(C33129mqd.valueOf(((DefiChainInfo) t).getPopularWeight())));
        }
    }

    public final ChainBizType EZpvd(TradingBizType tradingBizType) {
        switch (TaskDescription.AEQbTJ[tradingBizType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return ChainBizType.Single;
            case 5:
                return ChainBizType.Market;
            case 6:
                return ChainBizType.Limit;
            case 7:
                return ChainBizType.Bridge;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setValue(str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenListViewModel$updateSelectedChain$1(this, AEQbTJ(this.djBIcL.AEQbTJ(EZpvd(this.DbNXlk))), str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<DefiChainInfo> AEQbTJ(java.util.List<DefiChainInfo> list) {
        java.util.ArrayList arrayList;
        java.lang.Object next;
        java.util.List<java.lang.Integer> bridgeSupportChainList;
        int i = TaskDescription.AEQbTJ[this.DbNXlk.ordinal()];
        if (i == 2) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((DefiChainInfo) obj).getSupportMemeMode()) {
                    arrayList.add(obj);
                }
            }
        } else if (i == 4) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (((DefiChainInfo) obj2).getSupportCefiMode()) {
                    arrayList.add(obj2);
                }
            }
        } else {
            if (i == 7 && !this.isConnected) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) this.valueOf)) {
                        break;
                    }
                }
                DefiChainInfo defiChainInfo = (DefiChainInfo) next;
                if (defiChainInfo == null || (bridgeSupportChainList = defiChainInfo.getBridgeSupportChainList()) == null) {
                    return list;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(bridgeSupportChainList, 10));
                java.util.Iterator<T> it2 = bridgeSupportChainList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(java.lang.String.valueOf(((java.lang.Number) it2.next()).intValue()));
                }
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    if (arrayList2.contains(((DefiChainInfo) obj3).getChainId())) {
                        arrayList.add(obj3);
                    }
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj4 : list) {
                if (!this.AhwBna.contains(((DefiChainInfo) obj4).getChainId())) {
                    arrayList3.add(obj4);
                }
            }
            return arrayList3;
        }
        list = arrayList;
        java.util.ArrayList arrayList32 = new java.util.ArrayList();
        while (r5.hasNext()) {
        }
        return arrayList32;
    }

    public final void AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        this.OLrzqt.setValue(C56390yDp.OLrzqt(dexMultiTokenInfoBean, java.lang.Boolean.valueOf(z)));
    }
}
