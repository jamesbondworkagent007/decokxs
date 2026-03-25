package o;

import com.okinc.business.dexlogic.bean.ShareLinkVO;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.HomeTokenData;
import com.okinc.business.market.data.model.ModuleBoostHeaderData;
import com.okinc.business.market.data.model.ModuleBoostTokenData;
import com.okinc.business.market.data.model.ModuleData;
import com.okinc.business.market.data.model.ModuleDetailData;
import com.okinc.business.market.data.model.ShareLinkData;
import com.okinc.business.market.data.model.TokenAggregateData;
import com.okinc.business.market.features.module.domain.ModuleUseCase$getModuleDetail$1;
import com.okinc.business.market.features.module.domain.ModuleUseCase$getModuleDetailhUnOzRk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.module.domain.ModuleUseCase$getModules$1;
import com.okinc.business.market.features.module.domain.ModuleUseCase$getModulesIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.module.domain.ModuleUseCase$mapToModuleDetail$1;
import com.okinc.business.market.features.module.domain.ModuleUseCase$mapToModuleDetailFromV3$1;
import com.okinc.business.market.features.module.domain.ModuleUseCase$mapToModuleDetailFromV3tZkwj4A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.module.domain.ModuleUseCase$mapToModuleDetailyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.module.domain.ModuleUseCase$startModuleDetailWs$2;
import com.okinc.business.market.features.module.domain.ModuleUseCase$startModulesWebsocket$2;
import com.okinc.business.market.features.module.domain.ModuleUseCase$stopModuleDetailWs$2;
import com.okinc.business.market.features.module.domain.ModuleUseCase$stopModulesWebsocket$2;
import com.okinc.business.market.features.module.domain.model.MarketSortBy;
import com.okinc.business.market.features.module.domain.type.ModuleCategoryType;
import com.okinc.business.market.features.module.domain.type.TimeType;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28896kjS {
    public final StateFlow<java.util.List<C28897kjT>> AYXKKw;
    public final C28547kco AhwBna;
    public final C29712kyn EZpvd;
    public final C25983jNp KWHzl;
    public final MutableStateFlow<java.util.List<C28897kjT>> OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final InterfaceC28901kjX valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.kjS$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketSortBy.values().length];
            try {
                iArr[MarketSortBy.VOLUME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarketSortBy.MCAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketSortBy.PRICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketSortBy.CHANGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[MarketSortBy.RANK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[OKSortTextView.SortType.values().length];
            try {
                iArr2[OKSortTextView.SortType.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[OKSortTextView.SortType.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[TimeType.values().length];
            try {
                iArr3[TimeType.ONE_DAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[TimeType.FOUR_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[TimeType.ONE_HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[TimeType.FIVE_MINUTES.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            EZpvd = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<C28897kjT>> OLrzqt() {
        return this.AYXKKw;
    }

    @yCM
    public C28896kjS(@NotNull InterfaceC28901kjX interfaceC28901kjX, @NotNull C28547kco c28547kco, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C25983jNp c25983jNp, @NotNull C29712kyn c29712kyn) {
        Intrinsics.checkNotNullParameter(interfaceC28901kjX, "");
        Intrinsics.checkNotNullParameter(c28547kco, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        this.valueOf = interfaceC28901kjX;
        this.AhwBna = c28547kco;
        this.copydefault = coroutineDispatcher;
        this.KWHzl = c25983jNp;
        this.EZpvd = c29712kyn;
        MutableStateFlow<java.util.List<C28897kjT>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<? extends java.util.List<C28897kjT>>> continuation) throws java.lang.Throwable {
        ModuleUseCase$getModules$1 moduleUseCase$getModules$1;
        if (continuation instanceof ModuleUseCase$getModules$1) {
            moduleUseCase$getModules$1 = (ModuleUseCase$getModules$1) continuation;
            int i = moduleUseCase$getModules$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                moduleUseCase$getModules$1.label = i - Integer.MIN_VALUE;
            } else {
                moduleUseCase$getModules$1 = new ModuleUseCase$getModules$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = moduleUseCase$getModules$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = moduleUseCase$getModules$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            ModuleUseCase$getModulesIoAF18A$$inlined$dexRunCatching$1 moduleUseCase$getModulesIoAF18A$$inlined$dexRunCatching$1 = new ModuleUseCase$getModulesIoAF18A$$inlined$dexRunCatching$1(null, this);
            moduleUseCase$getModules$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, moduleUseCase$getModulesIoAF18A$$inlined$dexRunCatching$1, moduleUseCase$getModules$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new ModuleUseCase$startModulesWebsocket$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new ModuleUseCase$stopModulesWebsocket$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: getModuleDetail-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8666getModuleDetailhUnOzRk$default(C28896kjS c28896kjS, java.lang.String str, java.lang.String str2, TimeType timeType, java.lang.String str3, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            bool = null;
        }
        return c28896kjS.AEQbTJ(str, str2, timeType, str3, bool, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TimeType timeType, @NotNull java.lang.String str3, java.lang.Boolean bool, @NotNull Continuation<? super Result<C28899kjV>> continuation) throws java.lang.Throwable {
        ModuleUseCase$getModuleDetail$1 moduleUseCase$getModuleDetail$1;
        if (continuation instanceof ModuleUseCase$getModuleDetail$1) {
            moduleUseCase$getModuleDetail$1 = (ModuleUseCase$getModuleDetail$1) continuation;
            int i = moduleUseCase$getModuleDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                moduleUseCase$getModuleDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                moduleUseCase$getModuleDetail$1 = new ModuleUseCase$getModuleDetail$1(this, continuation);
            }
        }
        ModuleUseCase$getModuleDetail$1 moduleUseCase$getModuleDetail$12 = moduleUseCase$getModuleDetail$1;
        java.lang.Object objWithContext = moduleUseCase$getModuleDetail$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = moduleUseCase$getModuleDetail$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            ModuleUseCase$getModuleDetailhUnOzRk$$inlined$dexRunCatching$1 moduleUseCase$getModuleDetailhUnOzRk$$inlined$dexRunCatching$1 = new ModuleUseCase$getModuleDetailhUnOzRk$$inlined$dexRunCatching$1(null, this, str2, timeType, str3, bool, str);
            moduleUseCase$getModuleDetail$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, moduleUseCase$getModuleDetailhUnOzRk$$inlined$dexRunCatching$1, moduleUseCase$getModuleDetail$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.kjS$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            this.KWHzl = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Boolean.valueOf(this.KWHzl.invoke(t).toString().length() == 0), java.lang.Boolean.valueOf(this.KWHzl.invoke(t2).toString().length() == 0));
        }
    }

    /* JADX INFO: renamed from: o.kjS$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            this.copydefault = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Boolean.valueOf(this.copydefault.invoke(t).toString().length() == 0), java.lang.Boolean.valueOf(this.copydefault.invoke(t2).toString().length() == 0));
        }
    }

    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("categoryModuleId", str), C56390yDp.OLrzqt("periodType", str2), C56390yDp.OLrzqt("chainId", str3), C56390yDp.OLrzqt("page", 1), C56390yDp.OLrzqt("pageSize", 200));
    }

    /* JADX INFO: renamed from: o.kjS$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kjS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<C28899kjV>> continuation) {
        return BuildersKt.withContext(this.copydefault, new ModuleUseCase$startModuleDetailWs$2(this, str, str2, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.copydefault, new ModuleUseCase$stopModuleDetailWs$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kjS$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Comparator AEQbTJ;
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.util.Comparator comparator, Function1 function1) {
            this.AEQbTJ = comparator;
            this.EZpvd = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.AEQbTJ.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            java.lang.Comparable comparableFARcdN = C59443zhD.fARcdN(this.EZpvd.invoke(t).toString());
            if (comparableFARcdN == null) {
                comparableFARcdN = 0;
            }
            java.lang.Comparable comparableFARcdN2 = C59443zhD.fARcdN(this.EZpvd.invoke(t2).toString());
            if (comparableFARcdN2 == null) {
                comparableFARcdN2 = 0;
            }
            return yET.KWHzl(comparableFARcdN, comparableFARcdN2);
        }
    }

    public final java.util.List<C28902kjY> AEQbTJ(@NotNull java.util.List<C28902kjY> list, @NotNull OKSortTextView.SortType sortType, @NotNull final MarketSortBy marketSortBy) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(marketSortBy, "");
        return (list.isEmpty() || marketSortBy == MarketSortBy.NONE) ? list : copydefault(list, sortType, new Function1() { // from class: o.kjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28896kjS.EZpvd(marketSortBy, (C28902kjY) obj);
            }
        });
    }

    public static final java.lang.String EZpvd(MarketSortBy marketSortBy, C28902kjY c28902kjY) {
        Intrinsics.checkNotNullParameter(c28902kjY, "");
        int i = Application.OLrzqt[marketSortBy.ordinal()];
        if (i == 1) {
            return c28902kjY.AkhnZx();
        }
        if (i == 2) {
            return c28902kjY.copydefault();
        }
        if (i == 3) {
            return c28902kjY.gEmmrt();
        }
        if (i == 4) {
            return c28902kjY.EZpvd();
        }
        if (i != 5) {
            return "";
        }
        if (c28902kjY.valueOf().length() == 0) {
            return "0";
        }
        return "-" + c28902kjY.valueOf();
    }

    /* JADX INFO: renamed from: o.kjS$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ java.util.Comparator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(java.util.Comparator comparator, Function1 function1) {
            this.copydefault = comparator;
            this.KWHzl = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.copydefault.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            java.lang.Comparable comparableFARcdN = C59443zhD.fARcdN(this.KWHzl.invoke(t2).toString());
            if (comparableFARcdN == null) {
                comparableFARcdN = 0;
            }
            java.lang.Comparable comparableFARcdN2 = C59443zhD.fARcdN(this.KWHzl.invoke(t).toString());
            if (comparableFARcdN2 == null) {
                comparableFARcdN2 = 0;
            }
            return yET.KWHzl(comparableFARcdN, comparableFARcdN2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends U> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends java.lang.Comparable<? super T>, U> java.util.List<U> copydefault(@NotNull java.util.List<? extends U> list, @NotNull OKSortTextView.SortType sortType, @NotNull Function1<? super U, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int i = Application.AEQbTJ[sortType.ordinal()];
        if (i != 1) {
            return i != 2 ? list : CollectionsKt___CollectionsKt.EZpvd(list, new Activity(new StateListAnimator(function1), function1));
        }
        return CollectionsKt___CollectionsKt.EZpvd(list, new PendingIntent(new TaskDescription(function1), function1));
    }

    public final void EZpvd(java.util.Map<java.lang.String, C28897kjT> map) {
        java.util.List<C28897kjT> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) this.OLrzqt.getValue());
        int i = 0;
        for (java.lang.Object obj : listFJNWhG) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C28897kjT c28897kjT = (C28897kjT) obj;
            C28897kjT c28897kjT2 = map.get(c28897kjT.valueOf());
            if (c28897kjT2 != null) {
                listFJNWhG.set(i, c28897kjT2.EZpvd((524275 & 1) != 0 ? c28897kjT2.DbNXlk : null, (524275 & 2) != 0 ? c28897kjT2.copydefault : null, (524275 & 4) != 0 ? c28897kjT2.fJNWhG : c28897kjT.AuCTel(), (524275 & 8) != 0 ? c28897kjT2.AkhnZx : c28897kjT.AhwBna(), (524275 & 16) != 0 ? c28897kjT2.values : null, (524275 & 32) != 0 ? c28897kjT2.AhwBna : null, (524275 & 64) != 0 ? c28897kjT2.AEQbTJ : null, (524275 & 128) != 0 ? c28897kjT2.djBIcL : null, (524275 & 256) != 0 ? c28897kjT2.KWHzl : null, (524275 & 512) != 0 ? c28897kjT2.EZpvd : null, (524275 & 1024) != 0 ? c28897kjT2.gEmmrt : false, (524275 & 2048) != 0 ? c28897kjT2.valueOf : null, (524275 & 4096) != 0 ? c28897kjT2.AYXKKw : false, (524275 & 8192) != 0 ? c28897kjT2.ejfBZ : null, (524275 & 16384) != 0 ? c28897kjT2.isConnected : null, (524275 & 32768) != 0 ? c28897kjT2.fIwbmz : null, (524275 & 65536) != 0 ? c28897kjT2.fetchVPNInfo : null, (524275 & 131072) != 0 ? c28897kjT2.AuCTel : null, (524275 & 262144) != 0 ? c28897kjT2.fARcdN : null));
            }
            i++;
        }
        this.OLrzqt.setValue(listFJNWhG);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(C28897kjT c28897kjT, java.util.List<HomeTokenData> list, TokenAggregateData tokenAggregateData, java.util.List<MarketChainBean> list2, TimeType timeType, java.lang.String str, ModuleBoostHeaderData moduleBoostHeaderData, boolean z, Continuation<? super Result<C28899kjV>> continuation) throws java.lang.Throwable {
        ModuleUseCase$mapToModuleDetailFromV3$1 moduleUseCase$mapToModuleDetailFromV3$1;
        if (continuation instanceof ModuleUseCase$mapToModuleDetailFromV3$1) {
            moduleUseCase$mapToModuleDetailFromV3$1 = (ModuleUseCase$mapToModuleDetailFromV3$1) continuation;
            int i = moduleUseCase$mapToModuleDetailFromV3$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                moduleUseCase$mapToModuleDetailFromV3$1.label = i - Integer.MIN_VALUE;
            } else {
                moduleUseCase$mapToModuleDetailFromV3$1 = new ModuleUseCase$mapToModuleDetailFromV3$1(this, continuation);
            }
        }
        ModuleUseCase$mapToModuleDetailFromV3$1 moduleUseCase$mapToModuleDetailFromV3$12 = moduleUseCase$mapToModuleDetailFromV3$1;
        java.lang.Object objWithContext = moduleUseCase$mapToModuleDetailFromV3$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = moduleUseCase$mapToModuleDetailFromV3$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            ModuleUseCase$mapToModuleDetailFromV3tZkwj4A$$inlined$dexRunCatching$1 moduleUseCase$mapToModuleDetailFromV3tZkwj4A$$inlined$dexRunCatching$1 = new ModuleUseCase$mapToModuleDetailFromV3tZkwj4A$$inlined$dexRunCatching$1(null, timeType, c28897kjT, tokenAggregateData, list, str, z, moduleBoostHeaderData, list2, this);
            moduleUseCase$mapToModuleDetailFromV3$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, moduleUseCase$mapToModuleDetailFromV3tZkwj4A$$inlined$dexRunCatching$1, moduleUseCase$mapToModuleDetailFromV3$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(ModuleDetailData moduleDetailData, java.util.List<MarketChainBean> list, java.util.List<ModuleBoostTokenData> list2, java.lang.String str, Continuation<? super Result<C28899kjV>> continuation) throws java.lang.Throwable {
        ModuleUseCase$mapToModuleDetail$1 moduleUseCase$mapToModuleDetail$1;
        if (continuation instanceof ModuleUseCase$mapToModuleDetail$1) {
            moduleUseCase$mapToModuleDetail$1 = (ModuleUseCase$mapToModuleDetail$1) continuation;
            int i = moduleUseCase$mapToModuleDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                moduleUseCase$mapToModuleDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                moduleUseCase$mapToModuleDetail$1 = new ModuleUseCase$mapToModuleDetail$1(this, continuation);
            }
        }
        ModuleUseCase$mapToModuleDetail$1 moduleUseCase$mapToModuleDetail$12 = moduleUseCase$mapToModuleDetail$1;
        java.lang.Object objWithContext = moduleUseCase$mapToModuleDetail$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = moduleUseCase$mapToModuleDetail$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            ModuleUseCase$mapToModuleDetailyxL6bBk$$inlined$dexRunCatching$1 moduleUseCase$mapToModuleDetailyxL6bBk$$inlined$dexRunCatching$1 = new ModuleUseCase$mapToModuleDetailyxL6bBk$$inlined$dexRunCatching$1(null, moduleDetailData, list2, str, list, this);
            moduleUseCase$mapToModuleDetail$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, moduleUseCase$mapToModuleDetailyxL6bBk$$inlined$dexRunCatching$1, moduleUseCase$mapToModuleDetail$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.util.List<C28897kjT> copydefault(java.util.List<ModuleData> list) {
        java.util.List listAhwBna;
        int i = 10;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (ModuleData moduleData : list) {
            java.lang.String strValueOf = java.lang.String.valueOf(moduleData.AkhnZx());
            java.lang.Integer numAEQbTJ = moduleData.AEQbTJ();
            java.lang.String string = numAEQbTJ != null ? numAEQbTJ.toString() : null;
            if (string == null) {
                string = "";
            }
            java.lang.String strAhwBna = moduleData.AhwBna();
            if (strAhwBna == null || strAhwBna.length() == 0) {
                strAhwBna = "--";
            }
            java.lang.String strDjBIcL = moduleData.djBIcL();
            if (strDjBIcL == null || strDjBIcL.length() == 0) {
                strDjBIcL = "--";
            }
            java.lang.String strKWHzl = moduleData.KWHzl();
            if (strKWHzl == null || strKWHzl.length() == 0) {
                strKWHzl = "--";
            }
            java.util.List<java.lang.String> listFJNWhG = moduleData.fJNWhG();
            if (listFJNWhG != null) {
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listFJNWhG, i));
                for (java.lang.String str : listFJNWhG) {
                    if (str == null) {
                        str = "";
                    }
                    listAhwBna.add(str);
                }
            } else {
                listAhwBna = null;
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.lang.Integer numCopydefault = moduleData.copydefault();
            ModuleCategoryType moduleCategoryType = (numCopydefault != null && numCopydefault.intValue() == 0) ? ModuleCategoryType.MEME_FUN : ModuleCategoryType.GENERAL;
            ShareLinkData shareLinkDataFIwbmz = moduleData.fIwbmz();
            java.lang.String strKWHzl2 = shareLinkDataFIwbmz != null ? shareLinkDataFIwbmz.KWHzl() : null;
            java.lang.String str2 = strKWHzl2 == null ? "" : strKWHzl2;
            java.lang.String strValueOf2 = moduleData.valueOf();
            java.lang.String str3 = strValueOf2 == null ? "" : strValueOf2;
            java.lang.String strAYXKKw = moduleData.AYXKKw();
            java.lang.String str4 = strAYXKKw == null ? "" : strAYXKKw;
            java.lang.String strGEmmrt = moduleData.gEmmrt();
            java.lang.String str5 = strGEmmrt == null ? "" : strGEmmrt;
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) moduleData.EZpvd(), (java.lang.Object) "0");
            java.lang.String strEjfBZ = moduleData.ejfBZ();
            java.lang.String str6 = strEjfBZ == null ? "" : strEjfBZ;
            java.lang.String strIsConnected = moduleData.isConnected();
            java.lang.String str7 = strIsConnected == null ? "" : strIsConnected;
            java.lang.String strFetchVPNInfo = moduleData.fetchVPNInfo();
            java.lang.String str8 = strFetchVPNInfo == null ? "" : strFetchVPNInfo;
            java.lang.String strDbNXlk = moduleData.DbNXlk();
            java.lang.String str9 = strDbNXlk == null ? "" : strDbNXlk;
            java.lang.String strValues = moduleData.values();
            java.lang.String str10 = strValues == null ? "" : strValues;
            ShareLinkData shareLinkDataFIwbmz2 = moduleData.fIwbmz();
            arrayList.add(new C28897kjT(strValueOf, string, strAhwBna, strDjBIcL, strKWHzl, listAhwBna, moduleCategoryType, str2, str3, str4, moduleData.AuCTel() == StringBooleanType.TRUE, str5, !zEZpvd, str6, str7, str8, str9, str10, shareLinkDataFIwbmz2 != null ? new ShareLinkVO(shareLinkDataFIwbmz2.KWHzl(), shareLinkDataFIwbmz2.EZpvd()) : null));
            i = 10;
        }
        return arrayList;
    }
}
