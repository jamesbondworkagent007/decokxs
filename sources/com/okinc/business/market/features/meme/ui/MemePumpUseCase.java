package com.okinc.business.market.features.meme.ui;

import androidx.camera.video.AudioStats;
import com.okinc.business.market.features.meme.data.model.MemeFilterParam;
import com.okinc.business.market.features.meme.data.model.MemeTokenV2Data;
import com.okinc.business.market.features.meme.data.model.NewLogoWsData;
import com.okinc.business.market.features.meme.data.model.NewTokenWsData;
import com.okinc.business.market.features.meme.data.model.PersonalizedInfoWsData;
import com.okinc.business.market.features.meme.data.model.PublicMetricsWsData;
import com.okinc.business.market.features.meme.data.model.SameCarUpdateWsData;
import com.okinc.business.market.features.meme.domain.model.ConfigInfoData;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.domain.model.RankInfoData;
import com.okinc.business.market.features.meme.domain.model.SignalType;
import com.okinc.business.market.features.meme.filter.domain.MemeBlacklist;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.filter.social.SocialMediaType;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC43419rot;
import o.AbstractC56415yEn;
import o.C22416heu;
import o.C23313hvq;
import o.C25389ivm;
import o.C28631keS;
import o.C28634keV;
import o.C28635keW;
import o.C28636keX;
import o.C28638keZ;
import o.C28927kjx;
import o.C28928kjy;
import o.C29712kyn;
import o.C31191lpP;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.C56548yJl;
import o.C59443zhD;
import o.InterfaceC28692kfa;
import o.InterfaceC28693kfb;
import o.InterfaceC28694kfc;
import o.InterfaceC28697kff;
import o.InterfaceC28699kfh;
import o.InterfaceC28700kfi;
import o.InterfaceC28701kfj;
import o.InterfaceC28911kjh;
import o.InterfaceC28912kji;
import o.InterfaceC56445yFq;
import o.yCM;
import o.yDY;
import o.yEE;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase {
    public final MutableStateFlow<Set<Integer>> AEQbTJ;
    public ConfigInfoData AYXKKw;
    public List<MemeBlacklist> AhwBna;
    public final InterfaceC28693kfb AkhnZx;
    public final Set<String> AuCTel;
    public final Map<String, Integer> AuCTelauCTel;
    public final Map<String, Integer> AubY;
    public final CoroutineScope AwvSrB;
    public final List<PublicMetricsWsData>[] AxsJAY;
    public boolean DTwDnp;
    public Job DbNXlk;
    public final MutableStateFlow<InterfaceC28912kji> EZpvd;
    public final List<MutableStateFlow<InterfaceC28694kfc>> KWHzl;
    public final MutableStateFlow<InterfaceC28912kji> OLrzqt;
    public final MutableStateFlow<InterfaceC28912kji> copydefault;
    public final Map<Integer, Job> djBIcL;
    public final Map<Integer, Boolean> ejfBZ;
    public final Set<String> fARcdN;
    public final Set<String> fIwbmz;
    public final InterfaceC28700kfi fJNWhG;
    public int fetchVPNInfo;
    public final CoroutineDispatcher gEmmrt;
    public final StateFlow<InterfaceC28912kji> gHZMYf;
    public final InterfaceC28697kff getFieldNames;
    public final Map<Integer, List<C28635keW>> getNewProxyInstance;
    public final Map<String, Integer> hDKMBd;
    public final C29712kyn isConnected;
    public final Map<String, C28635keW> iwGUEr;
    public final Map<Integer, StateListAnimator> sSMYrx;
    public final InterfaceC28701kfj uzCIH;
    public final InterfaceC28692kfa valueOf;
    public final InterfaceC28699kfh values;
    public final Map<String, C28635keW> wlaJM;
    public final StateFlow<InterfaceC28912kji> zLjUOn;
    public final StateFlow<InterfaceC28912kji> zsXlph;
    public final Map<String, C28635keW> zuBGHE;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalType.values().length];
            try {
                iArr[SignalType.FOLLOWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignalType.KOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalType.SMART_MONEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28912kji> KWHzl() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28912kji> OLrzqt() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28912kji> copydefault() {
        return this.zLjUOn;
    }

    @yCM
    public MemePumpUseCase(@NotNull InterfaceC28693kfb interfaceC28693kfb, @NotNull InterfaceC28700kfi interfaceC28700kfi, @NotNull InterfaceC28699kfh interfaceC28699kfh, @NotNull InterfaceC28701kfj interfaceC28701kfj, @NotNull InterfaceC28697kff interfaceC28697kff, @NotNull InterfaceC28692kfa interfaceC28692kfa, @NotNull C29712kyn c29712kyn, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28693kfb, "");
        Intrinsics.checkNotNullParameter(interfaceC28700kfi, "");
        Intrinsics.checkNotNullParameter(interfaceC28699kfh, "");
        Intrinsics.checkNotNullParameter(interfaceC28701kfj, "");
        Intrinsics.checkNotNullParameter(interfaceC28697kff, "");
        Intrinsics.checkNotNullParameter(interfaceC28692kfa, "");
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AkhnZx = interfaceC28693kfb;
        this.fJNWhG = interfaceC28700kfi;
        this.values = interfaceC28699kfh;
        this.uzCIH = interfaceC28701kfj;
        this.getFieldNames = interfaceC28697kff;
        this.valueOf = interfaceC28692kfa;
        this.isConnected = c29712kyn;
        this.gEmmrt = coroutineDispatcher;
        InterfaceC28912kji.StateListAnimator stateListAnimator = InterfaceC28912kji.StateListAnimator.copydefault;
        MutableStateFlow<InterfaceC28912kji> MutableStateFlow = StateFlowKt.MutableStateFlow(stateListAnimator);
        this.EZpvd = MutableStateFlow;
        this.zLjUOn = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InterfaceC28912kji> MutableStateFlow2 = StateFlowKt.MutableStateFlow(stateListAnimator);
        this.OLrzqt = MutableStateFlow2;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<InterfaceC28912kji> MutableStateFlow3 = StateFlowKt.MutableStateFlow(stateListAnimator);
        this.copydefault = MutableStateFlow3;
        this.gHZMYf = FlowKt.asStateFlow(MutableStateFlow3);
        this.AEQbTJ = StateFlowKt.MutableStateFlow(yEE.copydefault());
        this.fARcdN = new LinkedHashSet();
        this.fIwbmz = new LinkedHashSet();
        this.AuCTel = new LinkedHashSet();
        this.AhwBna = yDY.AhwBna();
        this.sSMYrx = new LinkedHashMap();
        this.fetchVPNInfo = 50;
        this.iwGUEr = new LinkedHashMap();
        this.wlaJM = new LinkedHashMap();
        this.zuBGHE = new LinkedHashMap();
        this.hDKMBd = new LinkedHashMap();
        this.AubY = new LinkedHashMap();
        this.AuCTelauCTel = new LinkedHashMap();
        List<PublicMetricsWsData>[] listArr = new List[3];
        for (int i = 0; i < 3; i++) {
            listArr[i] = new ArrayList();
        }
        this.AxsJAY = listArr;
        this.djBIcL = new LinkedHashMap();
        this.getNewProxyInstance = new LinkedHashMap();
        this.ejfBZ = new LinkedHashMap();
        this.AwvSrB = CoroutineScopeKt.CoroutineScope(this.gEmmrt.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        InterfaceC28694kfc.TaskDescription taskDescription = InterfaceC28694kfc.TaskDescription.EZpvd;
        this.KWHzl = yDY.AhwBna(StateFlowKt.MutableStateFlow(taskDescription), StateFlowKt.MutableStateFlow(taskDescription), StateFlowKt.MutableStateFlow(taskDescription));
    }

    public static final class StateListAnimator {
        public final String AEQbTJ;
        public final String KWHzl;
        public final List<String> OLrzqt;
        public final MemeFilter copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.ui.MemePumpUseCase$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, List list, String str2, MemeFilter memeFilter, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                list = stateListAnimator.OLrzqt;
            }
            if ((i & 4) != 0) {
                str2 = stateListAnimator.KWHzl;
            }
            if ((i & 8) != 0) {
                memeFilter = stateListAnimator.copydefault;
            }
            return stateListAnimator.AEQbTJ(str, list, str2, memeFilter);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull String str, @NotNull List<String> list, @NotNull String str2, MemeFilter memeFilter) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(str, list, str2, memeFilter);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemeFilter copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            MemeFilter memeFilter = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (memeFilter == null ? 0 : memeFilter.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TabFilterState(chainId=" + this.AEQbTJ + ", protocolIdList=" + this.OLrzqt + ", walletAddress=" + this.KWHzl + ", localFilter=" + this.copydefault + ")";
        }

        public StateListAnimator(@NotNull String str, @NotNull List<String> list, @NotNull String str2, MemeFilter memeFilter) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.OLrzqt = list;
            this.KWHzl = str2;
            this.copydefault = memeFilter;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:97)) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.filter.domain.MemeFilter:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.filter.domain.MemeFilter) : (r5v0 com.okinc.business.market.features.meme.filter.domain.MemeFilter))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, com.okinc.business.market.features.meme.filter.domain.MemeFilter):void (m)] (LINE:95) call: com.okinc.business.market.features.meme.ui.MemePumpUseCase.StateListAnimator.<init>(java.lang.String, java.util.List, java.lang.String, com.okinc.business.market.features.meme.filter.domain.MemeFilter):void type: THIS */
        public /* synthetic */ StateListAnimator(String str, List list, String str2, MemeFilter memeFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : memeFilter);
        }
    }

    public static final class Activity<T> implements Comparator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(MemePumpUseCase.this.OLrzqt((C28636keX) t)), Integer.valueOf(MemePumpUseCase.this.OLrzqt((C28636keX) t2)));
        }
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(((C28635keW) t2).AEQbTJ());
            if (fieldNames == null) {
                fieldNames = l;
            }
            Long fieldNames2 = StringsKt__StringNumberConversionsKt.getFieldNames(((C28635keW) t).AEQbTJ());
            return yET.KWHzl(fieldNames, fieldNames2 != null ? fieldNames2 : 0L);
        }
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(((C28635keW) t2).ejfBZ());
            if (fieldNames == null) {
                fieldNames = l;
            }
            Long fieldNames2 = StringsKt__StringNumberConversionsKt.getFieldNames(((C28635keW) t).ejfBZ());
            return yET.KWHzl(fieldNames, fieldNames2 != null ? fieldNames2 : 0L);
        }
    }

    public static final class Fragment<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Double dAuCTel = C59443zhD.AuCTel(((C28635keW) t2).fARcdN());
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dAuCTel != null ? dAuCTel.doubleValue() : 0.0d;
            Double dAuCTel2 = C59443zhD.AuCTel(((C28635keW) t).fARcdN());
            if (dAuCTel2 != null) {
                dDoubleValue = dAuCTel2.doubleValue();
            }
            return yET.KWHzl(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue));
        }
    }

    public static final class FragmentManager<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(((C28635keW) t2).fIwbmz());
            long jLongValue = fieldNames != null ? fieldNames.longValue() : 0L;
            Long fieldNames2 = StringsKt__StringNumberConversionsKt.getFieldNames(((C28635keW) t).fIwbmz());
            return yET.KWHzl(Long.valueOf(jLongValue), Long.valueOf(fieldNames2 != null ? fieldNames2.longValue() : 0L));
        }
    }

    public final Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<ConfigInfoData, OKServerException>> continuation) {
        return BuildersKt.withContext(this.gEmmrt, new MemePumpUseCase$getMemeConfig$2(this, null), continuation);
    }

    public static final class LoaderManager<T> implements Comparator {
        public final /* synthetic */ Comparator OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Comparator comparator) {
            this.OLrzqt = comparator;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.OLrzqt.compare(t, t2);
            return iCompare != 0 ? iCompare : yET.KWHzl(((C28635keW) t).zuBGHE(), ((C28635keW) t2).zuBGHE());
        }
    }

    public static final class PendingIntent<T> implements Comparator {
        public final /* synthetic */ Comparator KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Comparator comparator) {
            this.KWHzl = comparator;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.KWHzl.compare(t, t2);
            return iCompare != 0 ? iCompare : yET.KWHzl(((C28635keW) t).zuBGHE(), ((C28635keW) t2).zuBGHE());
        }
    }

    public final Object EZpvd(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull MemeFilter memeFilter, int i, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.gEmmrt, new MemePumpUseCase$initTab$2(this, i, str, list, str2, memeFilter, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final Object copydefault(@NotNull String str, @NotNull String str2, @NotNull List<? extends List<String>> list, @NotNull List<MemeFilter> list2, @NotNull Continuation<? super Unit> continuation) {
        List listAhwBna = (List) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        Object objWithContext = BuildersKt.withContext(this.gEmmrt, new MemePumpUseCase$initAllTabs$2(this, str, listAhwBna, str2, list2, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final Object AEQbTJ(int i, String str, List<String> list, String str2, MemeFilter memeFilter, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.gEmmrt, new MemePumpUseCase$updateTabFilter$2(this, i, str, list, str2, memeFilter, z, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(int i, String str, boolean z, MemeFilter memeFilter, Continuation<? super Boolean> continuation) throws Throwable {
        MemePumpUseCase$loadTabData$1 memePumpUseCase$loadTabData$1;
        MemePumpUseCase memePumpUseCase;
        int i2 = i;
        boolean z2 = z;
        if (continuation instanceof MemePumpUseCase$loadTabData$1) {
            memePumpUseCase$loadTabData$1 = (MemePumpUseCase$loadTabData$1) continuation;
            int i3 = memePumpUseCase$loadTabData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                memePumpUseCase$loadTabData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                memePumpUseCase$loadTabData$1 = new MemePumpUseCase$loadTabData$1(this, continuation);
            }
        }
        Object objEZpvd = memePumpUseCase$loadTabData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = memePumpUseCase$loadTabData$1.label;
        boolean z3 = true;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            StateListAnimator stateListAnimator = this.sSMYrx.get(C56443yFo.AEQbTJ(i));
            if (stateListAnimator == null) {
                return C56443yFo.KWHzl(false);
            }
            if (z2) {
                this.KWHzl.get(i2).setValue(InterfaceC28694kfc.TaskDescription.EZpvd);
            }
            MemeFilterParam memeFilterParamOLrzqt = C28631keS.KWHzl.OLrzqt(stateListAnimator.AEQbTJ(), stateListAnimator.OLrzqt(), stateListAnimator.KWHzl(), str, memeFilter);
            InterfaceC28693kfb interfaceC28693kfb = this.AkhnZx;
            memePumpUseCase$loadTabData$1.L$0 = this;
            memePumpUseCase$loadTabData$1.I$0 = i2;
            memePumpUseCase$loadTabData$1.Z$0 = z2;
            memePumpUseCase$loadTabData$1.label = 1;
            objEZpvd = interfaceC28693kfb.EZpvd(memeFilterParamOLrzqt, memePumpUseCase$loadTabData$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            memePumpUseCase = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z4 = memePumpUseCase$loadTabData$1.Z$0;
            int i5 = memePumpUseCase$loadTabData$1.I$0;
            memePumpUseCase = (MemePumpUseCase) memePumpUseCase$loadTabData$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            z2 = z4;
            i2 = i5;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objEZpvd;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Iterable iterable = (Iterable) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((MemeTokenV2Data) it.next()).toMemePumpTokenModel());
            }
            List<C28635keW> listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList, memePumpUseCase.fetchVPNInfo);
            memePumpUseCase.copydefault(i2, listAhwBna);
            memePumpUseCase.AEQbTJ(i2, listAhwBna, UpdateType.API_DATA);
            memePumpUseCase.KWHzl.get(i2).setValue(new InterfaceC28694kfc.Application(null, false, 3, null));
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            memePumpUseCase.AEQbTJ(i2, yDY.AhwBna(), UpdateType.API_DATA);
            if (z2) {
                memePumpUseCase.KWHzl.get(i2).setValue(InterfaceC28694kfc.Activity.KWHzl);
            }
            z3 = false;
        }
        return C56443yFo.KWHzl(z3);
    }

    public static /* synthetic */ Object getBlackListed$default(MemePumpUseCase memePumpUseCase, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return memePumpUseCase.AEQbTJ(z, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MemePumpUseCase$getBlackListed$1 memePumpUseCase$getBlackListed$1;
        if (continuation instanceof MemePumpUseCase$getBlackListed$1) {
            memePumpUseCase$getBlackListed$1 = (MemePumpUseCase$getBlackListed$1) continuation;
            int i = memePumpUseCase$getBlackListed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memePumpUseCase$getBlackListed$1.label = i - Integer.MIN_VALUE;
            } else {
                memePumpUseCase$getBlackListed$1 = new MemePumpUseCase$getBlackListed$1(this, continuation);
            }
        }
        Object objWithContext = memePumpUseCase$getBlackListed$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memePumpUseCase$getBlackListed$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.gEmmrt;
            MemePumpUseCase$getBlackListed$$inlined$dexRunCatching$1 memePumpUseCase$getBlackListed$$inlined$dexRunCatching$1 = new MemePumpUseCase$getBlackListed$$inlined$dexRunCatching$1(null, this, z);
            memePumpUseCase$getBlackListed$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memePumpUseCase$getBlackListed$$inlined$dexRunCatching$1, memePumpUseCase$getBlackListed$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        Set<Integer> setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(this.AEQbTJ.getValue());
        setDXXBbs.add(Integer.valueOf(i));
        this.AEQbTJ.setValue(setDXXBbs);
    }

    public final void gEmmrt(int i) {
        List<C28635keW> listAxsJAYsNCnLh;
        Set<Integer> setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(this.AEQbTJ.getValue());
        setDXXBbs.remove(Integer.valueOf(i));
        this.AEQbTJ.setValue(setDXXBbs);
        AEQbTJ(i).clear();
        if (i == 0) {
            synchronized (this.iwGUEr) {
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.iwGUEr.values());
            }
        } else if (i == 1) {
            synchronized (this.wlaJM) {
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.wlaJM.values());
            }
        } else {
            if (i != 2) {
                return;
            }
            synchronized (this.zuBGHE) {
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.zuBGHE.values());
            }
        }
        if (true ^ listAxsJAYsNCnLh.isEmpty()) {
            AEQbTJ(i, OLrzqt(i, listAxsJAYsNCnLh), UpdateType.RESUME);
        }
    }

    public final void copydefault(int i, List<C28635keW> list) {
        AEQbTJ(i).clear();
        int i2 = 0;
        if (i == 0) {
            this.iwGUEr.clear();
            this.hDKMBd.clear();
            for (Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C28635keW c28635keW = (C28635keW) obj;
                String strCopydefault = copydefault(c28635keW.AwvSrB(), c28635keW.KWHzl());
                this.iwGUEr.put(strCopydefault, c28635keW);
                this.hDKMBd.put(strCopydefault, Integer.valueOf(i2));
                i2++;
            }
            return;
        }
        if (i == 1) {
            this.wlaJM.clear();
            this.AubY.clear();
            for (Object obj2 : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C28635keW c28635keW2 = (C28635keW) obj2;
                String strCopydefault2 = copydefault(c28635keW2.AwvSrB(), c28635keW2.KWHzl());
                this.wlaJM.put(strCopydefault2, c28635keW2);
                this.AubY.put(strCopydefault2, Integer.valueOf(i2));
                i2++;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        this.zuBGHE.clear();
        this.AuCTelauCTel.clear();
        for (Object obj3 : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            C28635keW c28635keW3 = (C28635keW) obj3;
            String strCopydefault3 = copydefault(c28635keW3.AwvSrB(), c28635keW3.KWHzl());
            this.zuBGHE.put(strCopydefault3, c28635keW3);
            this.AuCTelauCTel.put(strCopydefault3, Integer.valueOf(i2));
            i2++;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UpdateType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ UpdateType[] $VALUES;
        public static final UpdateType NEW_TOKENS = new UpdateType("NEW_TOKENS", 0);
        public static final UpdateType METRICS = new UpdateType("METRICS", 1);
        public static final UpdateType BUY_SIGNALS = new UpdateType("BUY_SIGNALS", 2);
        public static final UpdateType SAME_CAR = new UpdateType("SAME_CAR", 3);
        public static final UpdateType PERSONALIZED = new UpdateType("PERSONALIZED", 4);
        public static final UpdateType API_DATA = new UpdateType("API_DATA", 5);
        public static final UpdateType RESUME = new UpdateType("RESUME", 6);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ UpdateType[] $values() {
            return new UpdateType[]{NEW_TOKENS, METRICS, BUY_SIGNALS, SAME_CAR, PERSONALIZED, API_DATA, RESUME};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<UpdateType> getEntries() {
            return $ENTRIES;
        }

        private UpdateType(String str, int i) {
        }

        static {
            UpdateType[] updateTypeArr$values = $values();
            $VALUES = updateTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(updateTypeArr$values);
        }

        public static UpdateType valueOf(String str) {
            return (UpdateType) Enum.valueOf(UpdateType.class, str);
        }

        public static UpdateType[] values() {
            return (UpdateType[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ void emitTabData$default(MemePumpUseCase memePumpUseCase, int i, List list, UpdateType updateType, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            updateType = UpdateType.API_DATA;
        }
        memePumpUseCase.AEQbTJ(i, (List<C28635keW>) list, updateType);
    }

    public final void AEQbTJ(int i, List<C28635keW> list, UpdateType updateType) {
        if (this.AEQbTJ.getValue().contains(Integer.valueOf(i)) && updateType == UpdateType.NEW_TOKENS) {
            return;
        }
        if (this.AEQbTJ.getValue().contains(Integer.valueOf(i)) && updateType != UpdateType.RESUME) {
            Set<String> setAEQbTJ = AEQbTJ(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C28635keW c28635keW = (C28635keW) obj;
                if (!setAEQbTJ.contains(copydefault(c28635keW.AwvSrB(), c28635keW.KWHzl()))) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        if (i == 0) {
            this.EZpvd.setValue(new InterfaceC28912kji.Application(list));
        } else if (i == 1) {
            this.OLrzqt.setValue(new InterfaceC28912kji.Application(list));
        } else {
            if (i != 2) {
                return;
            }
            this.copydefault.setValue(new InterfaceC28912kji.Application(list));
        }
    }

    public final Set<String> AEQbTJ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? new LinkedHashSet() : this.AuCTel : this.fIwbmz : this.fARcdN;
    }

    public final String copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str + "_" + str2;
    }

    public final void djBIcL() {
        StateListAnimator stateListAnimator;
        if (C22416heu.ejfBZ() || (stateListAnimator = this.sSMYrx.get(0)) == null) {
            return;
        }
        String strAEQbTJ = stateListAnimator.AEQbTJ();
        String strKWHzl = stateListAnimator.KWHzl();
        List<String> listOLrzqt = stateListAnimator.OLrzqt();
        C25389ivm.safeLaunch$default(this.AwvSrB, null, null, new MemePumpUseCase$subscribeWebSockets$1(this, strAEQbTJ, null), 3, null);
        C25389ivm.safeLaunch$default(this.AwvSrB, null, null, new MemePumpUseCase$subscribeWebSockets$2(this, strAEQbTJ, null), 3, null);
        this.DbNXlk = C25389ivm.safeLaunch$default(this.AwvSrB, null, null, new MemePumpUseCase$subscribeWebSockets$3(this, null), 3, null);
        C25389ivm.safeLaunch$default(this.AwvSrB, null, null, new MemePumpUseCase$subscribeWebSockets$4(strKWHzl, this, strAEQbTJ, listOLrzqt, null), 3, null);
        C25389ivm.safeLaunch$default(this.AwvSrB, null, null, new MemePumpUseCase$subscribeWebSockets$5(this, strAEQbTJ, strKWHzl, null), 3, null);
        C25389ivm.safeLaunch$default(this.AwvSrB, null, null, new MemePumpUseCase$subscribeWebSockets$6(this, null), 3, null);
        if (strKWHzl.length() > 0) {
            C25389ivm.safeLaunch$default(this.AwvSrB, null, null, new MemePumpUseCase$subscribeWebSockets$7(this, strAEQbTJ, strKWHzl, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(List<NewTokenWsData> list, Continuation<? super Unit> continuation) throws Throwable {
        MemePumpUseCase$handleNewTokensUpdate$1 memePumpUseCase$handleNewTokensUpdate$1;
        Iterator it;
        MemePumpUseCase memePumpUseCase;
        if (continuation instanceof MemePumpUseCase$handleNewTokensUpdate$1) {
            memePumpUseCase$handleNewTokensUpdate$1 = (MemePumpUseCase$handleNewTokensUpdate$1) continuation;
            int i = memePumpUseCase$handleNewTokensUpdate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memePumpUseCase$handleNewTokensUpdate$1.label = i - Integer.MIN_VALUE;
            } else {
                memePumpUseCase$handleNewTokensUpdate$1 = new MemePumpUseCase$handleNewTokensUpdate$1(this, continuation);
            }
        }
        Object obj = memePumpUseCase$handleNewTokensUpdate$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memePumpUseCase$handleNewTokensUpdate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            it = list.iterator();
            memePumpUseCase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) memePumpUseCase$handleNewTokensUpdate$1.L$1;
            memePumpUseCase = (MemePumpUseCase) memePumpUseCase$handleNewTokensUpdate$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (it.hasNext()) {
            NewTokenWsData newTokenWsData = (NewTokenWsData) it.next();
            memePumpUseCase$handleNewTokensUpdate$1.L$0 = memePumpUseCase;
            memePumpUseCase$handleNewTokensUpdate$1.L$1 = it;
            memePumpUseCase$handleNewTokensUpdate$1.label = 1;
            if (memePumpUseCase.KWHzl(newTokenWsData, memePumpUseCase$handleNewTokensUpdate$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(List<NewLogoWsData> list) {
        if (list.isEmpty()) {
            return;
        }
        NewLogoWsData newLogoWsData = (NewLogoWsData) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        StateListAnimator stateListAnimator = this.sSMYrx.get(0);
        if (Intrinsics.EZpvd((Object) newLogoWsData.getChainId(), (Object) (stateListAnimator != null ? stateListAnimator.AEQbTJ() : null))) {
            String strCopydefault = copydefault(newLogoWsData.getContractAddress(), newLogoWsData.getChainId());
            synchronized (this.iwGUEr) {
                C28635keW c28635keW = this.iwGUEr.get(strCopydefault);
                if (c28635keW != null) {
                    if (c28635keW.fetchVPNInfo()) {
                        C28635keW c28635keWCopy$default = C28635keW.copy$default(c28635keW, null, null, null, null, newLogoWsData.getLogoBase64(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0L, null, null, -17, 1023, null);
                        this.iwGUEr.put(strCopydefault, c28635keWCopy$default);
                        List<C28635keW> list2 = this.getNewProxyInstance.get(0);
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                            for (C28635keW c28635keW2 : list2) {
                                if (Intrinsics.EZpvd((Object) copydefault(c28635keW2.AwvSrB(), c28635keW2.KWHzl()), (Object) strCopydefault)) {
                                    c28635keW2 = c28635keWCopy$default;
                                }
                                arrayList.add(c28635keW2);
                            }
                            this.getNewProxyInstance.put(0, arrayList);
                        }
                        Map<String, C28635keW> map = this.iwGUEr;
                        ArrayList arrayList2 = new ArrayList(map.size());
                        Iterator<Map.Entry<String, C28635keW>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList2.add(it.next().getValue());
                        }
                        AEQbTJ(0, OLrzqt(0, arrayList2), UpdateType.METRICS);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public final Object KWHzl(@NotNull NewTokenWsData newTokenWsData, @NotNull Continuation<? super Unit> continuation) {
        boolean zContainsKey;
        boolean zContainsKey2;
        boolean zContainsKey3;
        String strCopydefault = copydefault(newTokenWsData.getTokenContractAddress(), newTokenWsData.getChainIndex());
        boolean z = newTokenWsData.getMigrEnd().length() > 0;
        synchronized (this.iwGUEr) {
            zContainsKey = this.iwGUEr.containsKey(strCopydefault);
        }
        synchronized (this.wlaJM) {
            zContainsKey2 = this.wlaJM.containsKey(strCopydefault);
        }
        synchronized (this.zuBGHE) {
            zContainsKey3 = this.zuBGHE.containsKey(strCopydefault);
        }
        if (z) {
            if (zContainsKey) {
                copydefault(0, strCopydefault);
            }
            if (zContainsKey2) {
                copydefault(1, strCopydefault);
            }
            if (!zContainsKey3) {
                EZpvd(2, C56402yEa.EZpvd(newTokenWsData));
            }
        } else {
            if (zContainsKey3) {
                copydefault(2, strCopydefault);
            }
            if (!zContainsKey) {
                EZpvd(0, C56402yEa.EZpvd(newTokenWsData));
            }
            if (!zContainsKey2) {
                EZpvd(1, C56402yEa.EZpvd(newTokenWsData));
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(int i, @NotNull String str) {
        boolean z;
        List<C28635keW> listAxsJAYsNCnLh;
        Intrinsics.checkNotNullParameter(str, "");
        Pair<Map<String, C28635keW>, Map<String, Integer>> pairCopydefault = copydefault(i);
        Map<String, C28635keW> mapComponent1 = pairCopydefault.component1();
        Map<String, Integer> mapComponent2 = pairCopydefault.component2();
        synchronized (mapComponent1) {
            if (mapComponent1.containsKey(str)) {
                mapComponent1.remove(str);
                z = true;
            } else {
                z = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        synchronized (mapComponent2) {
            mapComponent2.remove(str);
        }
        if (z) {
            synchronized (mapComponent1) {
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(mapComponent1.values());
            }
            AEQbTJ(i, OLrzqt(i, listAxsJAYsNCnLh), UpdateType.NEW_TOKENS);
        }
    }

    public final void OLrzqt(int i) {
        List<PublicMetricsWsData> list = this.AxsJAY[i];
        ArrayList arrayList = new ArrayList();
        synchronized (list) {
            if (!list.isEmpty()) {
                arrayList.addAll(list);
                list.clear();
            }
            Unit unit = Unit.INSTANCE;
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!((PublicMetricsWsData) obj).getRankTypes().isEmpty()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((PublicMetricsWsData) obj2).getRankTypes().isEmpty()) {
                    arrayList3.add(obj2);
                }
            }
            if (!arrayList3.isEmpty()) {
                KWHzl(i, arrayList3);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                OLrzqt((PublicMetricsWsData) it.next());
            }
        }
    }

    public final List<Integer> EZpvd(@NotNull List<String> list) {
        List<RankInfoData> rankInfos;
        Intrinsics.checkNotNullParameter(list, "");
        int i = 0;
        if (list.isEmpty()) {
            return yDY.gEmmrt(0, 1, 2);
        }
        ArrayList arrayList = new ArrayList();
        ConfigInfoData configInfoData = this.AYXKKw;
        if (configInfoData != null && (rankInfos = configInfoData.getRankInfos()) != null) {
            for (Object obj : rankInfos) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (list.contains(((RankInfoData) obj).getRankType())) {
                    arrayList.add(Integer.valueOf(i));
                }
                i++;
            }
        }
        return arrayList.isEmpty() ? yDY.gEmmrt(0, 1, 2) : arrayList;
    }

    public final void copydefault(int i, List<C28635keW> list, UpdateType updateType) {
        Job job = this.djBIcL.get(Integer.valueOf(i));
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.djBIcL.put(Integer.valueOf(i), C25389ivm.safeLaunch$default(this.AwvSrB, null, null, new MemePumpUseCase$emitTabDataOptimized$1(this, i, list, updateType, null), 3, null));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kjy.updateMemePumpToken$default(o.kjy, com.okinc.business.market.features.meme.data.model.PublicMetricsWsData, o.keW, boolean, int, java.lang.Object):o.keW */
    public final void KWHzl(int i, List<PublicMetricsWsData> list) {
        Map<String, C28635keW> mapComponent1 = copydefault(i).component1();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PublicMetricsWsData publicMetricsWsData : list) {
            String strCopydefault = copydefault(publicMetricsWsData.getTokenContractAddress(), publicMetricsWsData.getChainIndex());
            C28635keW c28635keW = mapComponent1.get(strCopydefault);
            if (c28635keW != null) {
                linkedHashMap.put(strCopydefault, C28928kjy.updateMemePumpToken$default(C28928kjy.AEQbTJ, publicMetricsWsData, c28635keW, false, 2, null));
            }
        }
        if (!linkedHashMap.isEmpty()) {
            synchronized (mapComponent1) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    mapComponent1.put((String) entry.getKey(), (C28635keW) entry.getValue());
                }
                Unit unit = Unit.INSTANCE;
            }
            this.ejfBZ.put(Integer.valueOf(i), Boolean.TRUE);
            copydefault(i, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(mapComponent1.values()), UpdateType.METRICS);
        }
    }

    public final void OLrzqt(List<PersonalizedInfoWsData> list) {
        AEQbTJ(list);
    }

    public final void AEQbTJ(SameCarUpdateWsData sameCarUpdateWsData) {
        copydefault(sameCarUpdateWsData);
    }

    public final void OLrzqt(PublicMetricsWsData publicMetricsWsData) {
        String strCopydefault = copydefault(publicMetricsWsData.getTokenContractAddress(), publicMetricsWsData.getChainIndex());
        boolean z = publicMetricsWsData.getMigrEnd().length() > 0;
        C28635keW c28635keW = this.iwGUEr.get(strCopydefault);
        if (c28635keW == null && (c28635keW = this.wlaJM.get(strCopydefault)) == null && (c28635keW = this.zuBGHE.get(strCopydefault)) == null) {
            return;
        }
        C28635keW c28635keWUpdateMemePumpToken$default = C28928kjy.updateMemePumpToken$default(C28928kjy.AEQbTJ, publicMetricsWsData, c28635keW, false, 2, null);
        if (z) {
            synchronized (this.iwGUEr) {
                this.iwGUEr.remove(strCopydefault);
            }
            synchronized (this.wlaJM) {
                this.wlaJM.remove(strCopydefault);
            }
            synchronized (this.zuBGHE) {
                this.zuBGHE.put(strCopydefault, c28635keWUpdateMemePumpToken$default);
                Unit unit = Unit.INSTANCE;
            }
            Map<Integer, Boolean> map = this.ejfBZ;
            Boolean bool = Boolean.TRUE;
            map.put(0, bool);
            this.ejfBZ.put(1, bool);
            this.ejfBZ.put(2, bool);
            List<C28635keW> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.iwGUEr.values());
            UpdateType updateType = UpdateType.METRICS;
            copydefault(0, listAxsJAYsNCnLh, updateType);
            copydefault(1, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.wlaJM.values()), updateType);
            copydefault(2, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.zuBGHE.values()), updateType);
            return;
        }
        synchronized (this.iwGUEr) {
            if (this.iwGUEr.containsKey(strCopydefault)) {
                this.iwGUEr.put(strCopydefault, c28635keWUpdateMemePumpToken$default);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        synchronized (this.wlaJM) {
            if (this.wlaJM.containsKey(strCopydefault)) {
                this.wlaJM.put(strCopydefault, c28635keWUpdateMemePumpToken$default);
            }
        }
        Map<Integer, Boolean> map2 = this.ejfBZ;
        Boolean bool2 = Boolean.TRUE;
        map2.put(0, bool2);
        this.ejfBZ.put(1, bool2);
        List<C28635keW> listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.iwGUEr.values());
        UpdateType updateType2 = UpdateType.METRICS;
        copydefault(0, listAxsJAYsNCnLh2, updateType2);
        copydefault(1, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.wlaJM.values()), updateType2);
    }

    public final void AEQbTJ(List<PersonalizedInfoWsData> list) {
        AEQbTJ(0, list);
        AEQbTJ(1, list);
        AEQbTJ(2, list);
    }

    public final void AEQbTJ(int i, List<PersonalizedInfoWsData> list) {
        Map<String, C28635keW> mapComponent1 = copydefault(i).component1();
        boolean z = false;
        for (PersonalizedInfoWsData personalizedInfoWsData : list) {
            String strCopydefault = copydefault(personalizedInfoWsData.getTokenContractAddress(), personalizedInfoWsData.getChain());
            synchronized (mapComponent1) {
                C28635keW c28635keW = mapComponent1.get(strCopydefault);
                if (c28635keW != null) {
                    mapComponent1.put(strCopydefault, C28635keW.copy$default(c28635keW, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, personalizedInfoWsData.getSameCarNumber(), personalizedInfoWsData.getSameCarFollowedCount(), null, null, personalizedInfoWsData.isCollected(), 0L, null, null, -1, 947, null));
                    z = true;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        if (z) {
            this.ejfBZ.put(Integer.valueOf(i), Boolean.TRUE);
            copydefault(i, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(mapComponent1.values()), UpdateType.PERSONALIZED);
        }
    }

    public final void copydefault(SameCarUpdateWsData sameCarUpdateWsData) {
        copydefault(0, sameCarUpdateWsData);
        copydefault(1, sameCarUpdateWsData);
        copydefault(2, sameCarUpdateWsData);
    }

    public final void copydefault(int i, SameCarUpdateWsData sameCarUpdateWsData) {
        boolean z;
        Map<String, C28635keW> mapComponent1 = copydefault(i).component1();
        String strCopydefault = copydefault(sameCarUpdateWsData.getTokenContractAddress(), sameCarUpdateWsData.getChain());
        synchronized (mapComponent1) {
            C28635keW c28635keW = mapComponent1.get(strCopydefault);
            if (c28635keW != null) {
                mapComponent1.put(strCopydefault, C28928kjy.AEQbTJ.KWHzl(sameCarUpdateWsData, c28635keW));
                Unit unit = Unit.INSTANCE;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.ejfBZ.put(Integer.valueOf(i), Boolean.TRUE);
            copydefault(i, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(mapComponent1.values()), UpdateType.SAME_CAR);
        }
    }

    public final Object KWHzl(List<C28636keX> list, Continuation<? super Unit> continuation) {
        Object objOLrzqt;
        return (!list.isEmpty() && (objOLrzqt = OLrzqt(CollectionsKt___CollectionsKt.EZpvd(list, new Activity()), continuation)) == C56442yFn.copydefault()) ? objOLrzqt : Unit.INSTANCE;
    }

    public final int KWHzl(C28635keW c28635keW) {
        int i = TaskDescription.EZpvd[c28635keW.hDKMBd().ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 4 : 3;
        }
        return 2;
    }

    public final SignalType EZpvd(C28636keX c28636keX) {
        return c28636keX.OLrzqt() ? SignalType.FOLLOWING : c28636keX.djBIcL() ? SignalType.KOL : c28636keX.gEmmrt() ? SignalType.SMART_MONEY : SignalType.UNKNOWN;
    }

    public final boolean KWHzl(int i, @NotNull MemeUiModel memeUiModel, @NotNull C28634keV c28634keV) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(c28634keV, "");
        return OLrzqt(memeUiModel, c28634keV) && KWHzl(memeUiModel, c28634keV) && copydefault(memeUiModel, c28634keV) && djBIcL(memeUiModel, c28634keV) && gEmmrt(memeUiModel, c28634keV) && AEQbTJ(memeUiModel, c28634keV) && EZpvd(memeUiModel, c28634keV);
    }

    public final boolean OLrzqt(@NotNull MemeUiModel memeUiModel, @NotNull C28634keV c28634keV) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(c28634keV, "");
        return Intrinsics.EZpvd((Object) memeUiModel.KWHzl(), (Object) c28634keV.copydefault()) && c28634keV.AEQbTJ().OLrzqt().contains(memeUiModel.AkhnZx());
    }

    public final boolean KWHzl(@NotNull MemeUiModel memeUiModel, @NotNull C28634keV c28634keV) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(c28634keV, "");
        String strGEmmrt = memeUiModel.fIwbmz().gEmmrt();
        if (strGEmmrt.length() == 0) {
            strGEmmrt = "0";
        }
        if (copydefault(strGEmmrt, c28634keV.KWHzl().getTop10HoldingMin(), c28634keV.KWHzl().getTop10HoldingMax()) && copydefault(C23313hvq.mulCheckS$default(memeUiModel.fIwbmz().EZpvd(), "100", null, null, null, 14, null), c28634keV.KWHzl().getDevHoldingMin(), c28634keV.KWHzl().getDevHoldingMax()) && copydefault(C23313hvq.mulCheckS$default(memeUiModel.fIwbmz().djBIcL(), "100", null, null, null, 14, null), c28634keV.KWHzl().getInsiderMin(), c28634keV.KWHzl().getInsiderMax())) {
            String strAhwBna = memeUiModel.fIwbmz().AhwBna();
            if (copydefault(strAhwBna.length() != 0 ? strAhwBna : "0", c28634keV.KWHzl().getSniperMin(), c28634keV.KWHzl().getSniperMax()) && copydefault(C23313hvq.mulCheckS$default(memeUiModel.fIwbmz().AEQbTJ(), "100", null, null, null, 14, null), c28634keV.KWHzl().getBundleMin(), c28634keV.KWHzl().getBundleMax()) && copydefault(C23313hvq.mulCheckS$default(memeUiModel.fIwbmz().KWHzl(), "100", null, null, null, 14, null), c28634keV.KWHzl().getPhishHoldMin(), c28634keV.KWHzl().getPhishHoldMax()) && copydefault(C23313hvq.mulCheckS$default(memeUiModel.fIwbmz().OLrzqt(), "100", null, null, null, 14, null), c28634keV.KWHzl().getFreshHoldMin(), c28634keV.KWHzl().getFreshHoldMax())) {
                return true;
            }
        }
        return false;
    }

    public final boolean copydefault(@NotNull MemeUiModel memeUiModel, @NotNull C28634keV c28634keV) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(c28634keV, "");
        return copydefault(memeUiModel.values(), c28634keV.KWHzl().getBondingMin(), c28634keV.KWHzl().getBondingMax()) && AEQbTJ(memeUiModel.gEmmrt(), c28634keV.KWHzl().getMarketCapMin(), c28634keV.KWHzl().getMarketCapMax()) && AEQbTJ(memeUiModel.AubY(), c28634keV.KWHzl().getVolumeMin(), c28634keV.KWHzl().getVolumeMax()) && copydefault(memeUiModel.AYXKKw(), c28634keV.KWHzl().getHoldersMin(), c28634keV.KWHzl().getHoldersMax()) && copydefault(memeUiModel.valueOf(), c28634keV.KWHzl().getMigratedTokensMin(), c28634keV.KWHzl().getMigratedTokensMax());
    }

    public final boolean djBIcL(@NotNull MemeUiModel memeUiModel, @NotNull C28634keV c28634keV) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(c28634keV, "");
        return copydefault(memeUiModel.zsXlph(), c28634keV.KWHzl().getTransactionsMin(), c28634keV.KWHzl().getTransactionsMax()) && copydefault(memeUiModel.wlaJM(), c28634keV.KWHzl().getBuyMin(), c28634keV.KWHzl().getBuyMax()) && copydefault(memeUiModel.zLjUOn(), c28634keV.KWHzl().getSellMin(), c28634keV.KWHzl().getSellMax());
    }

    public final boolean gEmmrt(@NotNull MemeUiModel memeUiModel, @NotNull C28634keV c28634keV) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(c28634keV, "");
        long jCurrentTimeMillis = (System.currentTimeMillis() - C33129mqd.valueOf(memeUiModel.fJNWhG())) / TokenAgeType.Companion.copydefault(c28634keV.KWHzl().getTokenAgeUnit());
        String tokenAgeMin = c28634keV.KWHzl().getTokenAgeMin();
        boolean z = tokenAgeMin == null || tokenAgeMin.length() == 0 || jCurrentTimeMillis >= C33129mqd.valueOf(tokenAgeMin);
        String tokenAgeMax = c28634keV.KWHzl().getTokenAgeMax();
        return z && (tokenAgeMax == null || tokenAgeMax.length() == 0 || (jCurrentTimeMillis > C33129mqd.valueOf(tokenAgeMax) ? 1 : (jCurrentTimeMillis == C33129mqd.valueOf(tokenAgeMax) ? 0 : -1)) <= 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(@NotNull MemeUiModel memeUiModel, @NotNull C28634keV c28634keV) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(c28634keV, "");
        String keyword = c28634keV.KWHzl().getKeyword();
        String keywordExclude = c28634keV.KWHzl().getKeywordExclude();
        if (!C33129mqd.OLrzqt((CharSequence) keyword)) {
            z = true;
            break;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) keyword, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.hDKMBd((CharSequence) it.next()).toString());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str : arrayList2) {
                if (StringsKt__StringsKt.AhwBna((CharSequence) memeUiModel.getFieldNames(), (CharSequence) str, true) || StringsKt__StringsKt.AhwBna((CharSequence) memeUiModel.getNewProxyInstance(), (CharSequence) str, true)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (C33129mqd.OLrzqt((CharSequence) keywordExclude)) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) keywordExclude, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listSplit$default2, 10));
            Iterator it2 = listSplit$default2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(StringsKt__StringsKt.hDKMBd((CharSequence) it2.next()).toString());
            }
            ArrayList<String> arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((String) obj2).length() > 0) {
                    arrayList4.add(obj2);
                }
            }
            if (arrayList4.isEmpty()) {
                z2 = true;
            } else {
                for (String str2 : arrayList4) {
                    if (StringsKt__StringsKt.AhwBna((CharSequence) memeUiModel.getFieldNames(), (CharSequence) str2, true) || StringsKt__StringsKt.AhwBna((CharSequence) memeUiModel.getNewProxyInstance(), (CharSequence) str2, true)) {
                        z2 = false;
                        break;
                    }
                }
                z2 = true;
            }
        }
        return z && z2;
    }

    public final boolean EZpvd(@NotNull MemeUiModel memeUiModel, @NotNull C28634keV c28634keV) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(c28634keV, "");
        List<String> selectedSocialData = c28634keV.KWHzl().getSelectedSocialData();
        if (!(!selectedSocialData.isEmpty())) {
            return true;
        }
        if ((selectedSocialData instanceof Collection) && selectedSocialData.isEmpty()) {
            return true;
        }
        for (String str : selectedSocialData) {
            SocialMediaType.Activity activity = SocialMediaType.Companion;
            SocialMediaType socialMediaTypeOLrzqt = activity.OLrzqt(str);
            if (socialMediaTypeOLrzqt == null || !activity.AEQbTJ(memeUiModel, socialMediaTypeOLrzqt)) {
                return false;
            }
        }
        return true;
    }

    public final boolean copydefault(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return (str2 == null || str2.length() == 0 || C23313hvq.EZpvd(str, str2)) && (str3 == null || str3.length() == 0 || C23313hvq.valueOf(str, str3));
    }

    public final boolean AEQbTJ(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        String strCopydefault = C31191lpP.copydefault.copydefault(str);
        return (str2 == null || str2.length() == 0 || C23313hvq.EZpvd(strCopydefault, str2)) && (str3 == null || str3.length() == 0 || C23313hvq.valueOf(strCopydefault, str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull InterfaceC28912kji interfaceC28912kji, @NotNull ConfigInfoData configInfoData, @NotNull Continuation<? super InterfaceC28911kjh> continuation) throws Throwable {
        MemePumpUseCase$transformTokensToUiModels$1 memePumpUseCase$transformTokensToUiModels$1;
        if (continuation instanceof MemePumpUseCase$transformTokensToUiModels$1) {
            memePumpUseCase$transformTokensToUiModels$1 = (MemePumpUseCase$transformTokensToUiModels$1) continuation;
            int i = memePumpUseCase$transformTokensToUiModels$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memePumpUseCase$transformTokensToUiModels$1.label = i - Integer.MIN_VALUE;
            } else {
                memePumpUseCase$transformTokensToUiModels$1 = new MemePumpUseCase$transformTokensToUiModels$1(this, continuation);
            }
        }
        Object objKWHzl = memePumpUseCase$transformTokensToUiModels$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memePumpUseCase$transformTokensToUiModels$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (interfaceC28912kji instanceof InterfaceC28912kji.Application) {
                List<C28635keW> listKWHzl = ((InterfaceC28912kji.Application) interfaceC28912kji).KWHzl();
                List<MemeBlacklist> list = this.AhwBna;
                C29712kyn c29712kyn = this.isConnected;
                memePumpUseCase$transformTokensToUiModels$1.label = 1;
                objKWHzl = C28927kjx.KWHzl(listKWHzl, configInfoData, list, c29712kyn, memePumpUseCase$transformTokensToUiModels$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (Intrinsics.EZpvd(interfaceC28912kji, InterfaceC28912kji.StateListAnimator.copydefault)) {
                    return InterfaceC28911kjh.Application.AEQbTJ;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return new InterfaceC28911kjh.TaskDescription((List) objKWHzl);
    }

    public final int OLrzqt(C28636keX c28636keX) {
        String str;
        int iIndexOf;
        ConfigInfoData configInfoData = this.AYXKKw;
        if (configInfoData == null || configInfoData.getSameCarPriority().isEmpty()) {
            if (c28636keX.OLrzqt()) {
                return 1;
            }
            if (c28636keX.djBIcL()) {
                return 2;
            }
            return c28636keX.gEmmrt() ? 3 : 4;
        }
        if (c28636keX.OLrzqt()) {
            str = "0";
        } else if (c28636keX.djBIcL()) {
            str = "2";
        } else {
            str = c28636keX.gEmmrt() ? "1" : null;
        }
        if (str == null || (iIndexOf = configInfoData.getSameCarPriority().indexOf(str)) < 0) {
            return 4;
        }
        return iIndexOf + 1;
    }

    public final List<C28635keW> OLrzqt(int i, @NotNull List<C28635keW> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<C28635keW> listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(list);
        if (listQfsBiF.size() <= 1) {
            return listQfsBiF;
        }
        if (i == 0) {
            listQfsBiF = CollectionsKt___CollectionsKt.EZpvd(listQfsBiF, new PendingIntent(new ActionBar()));
        } else if (i == 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQfsBiF) {
                C28635keW c28635keW = (C28635keW) obj;
                if (c28635keW.fIwbmz().length() > 0 && c28635keW.ejfBZ().length() == 0) {
                    arrayList.add(obj);
                }
            }
            List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new FragmentManager());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listQfsBiF) {
                C28635keW c28635keW2 = (C28635keW) obj2;
                if (c28635keW2.fIwbmz().length() == 0 || c28635keW2.ejfBZ().length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            listQfsBiF = CollectionsKt___CollectionsKt.djBIcL((Collection) listEZpvd, (Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Fragment()));
        } else if (i == 2) {
            listQfsBiF = CollectionsKt___CollectionsKt.EZpvd(listQfsBiF, new LoaderManager(new Application()));
        }
        return CollectionsKt___CollectionsKt.AhwBna((Iterable) listQfsBiF, this.fetchVPNInfo);
    }

    public final Object OLrzqt(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        for (int i = 0; i < 3; i++) {
            StateListAnimator stateListAnimator = this.sSMYrx.get(C56443yFo.AEQbTJ(i));
            if (stateListAnimator != null) {
                this.sSMYrx.put(C56443yFo.AEQbTJ(i), StateListAnimator.copy$default(stateListAnimator, str, null, null, null, 14, null));
            }
            MutableStateFlow<InterfaceC28912kji> mutableStateFlow = this.EZpvd;
            InterfaceC28912kji.StateListAnimator stateListAnimator2 = InterfaceC28912kji.StateListAnimator.copydefault;
            mutableStateFlow.setValue(stateListAnimator2);
            this.OLrzqt.setValue(stateListAnimator2);
            this.copydefault.setValue(stateListAnimator2);
        }
        AYXKKw();
        AEQbTJ();
        Object objKWHzl = KWHzl(continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final void AYXKKw() {
        this.fJNWhG.copydefault();
        this.values.OLrzqt();
        this.uzCIH.copydefault();
        this.getFieldNames.EZpvd();
        this.valueOf.KWHzl();
        Job job = this.DbNXlk;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.DbNXlk = null;
        this.fJNWhG.EZpvd();
        Iterator<Integer> it = new IntRange(0, 2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC56415yEn) it).nextInt();
            synchronized (this.AxsJAY[iNextInt]) {
                this.AxsJAY[iNextInt].clear();
                Unit unit = Unit.INSTANCE;
            }
        }
        this.djBIcL.clear();
        this.getNewProxyInstance.clear();
        this.ejfBZ.clear();
        this.DTwDnp = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MemePumpUseCase$subscribePersonalizedWebSocket$1 memePumpUseCase$subscribePersonalizedWebSocket$1;
        StateListAnimator stateListAnimator;
        MemePumpUseCase memePumpUseCase;
        if (continuation instanceof MemePumpUseCase$subscribePersonalizedWebSocket$1) {
            memePumpUseCase$subscribePersonalizedWebSocket$1 = (MemePumpUseCase$subscribePersonalizedWebSocket$1) continuation;
            int i2 = memePumpUseCase$subscribePersonalizedWebSocket$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memePumpUseCase$subscribePersonalizedWebSocket$1.label = i2 - Integer.MIN_VALUE;
            } else {
                memePumpUseCase$subscribePersonalizedWebSocket$1 = new MemePumpUseCase$subscribePersonalizedWebSocket$1(this, continuation);
            }
        }
        MemePumpUseCase$subscribePersonalizedWebSocket$1 memePumpUseCase$subscribePersonalizedWebSocket$12 = memePumpUseCase$subscribePersonalizedWebSocket$1;
        Object obj = memePumpUseCase$subscribePersonalizedWebSocket$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = memePumpUseCase$subscribePersonalizedWebSocket$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!C22416heu.ejfBZ() && (stateListAnimator = this.sSMYrx.get(C56443yFo.AEQbTJ(i))) != null) {
                String strAEQbTJ = stateListAnimator.AEQbTJ();
                String strKWHzl = stateListAnimator.KWHzl();
                List<String> listOLrzqt = stateListAnimator.OLrzqt();
                if (strKWHzl.length() > 0) {
                    InterfaceC28701kfj interfaceC28701kfj = this.uzCIH;
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(i);
                    MemeFilter memeFilterCopydefault = stateListAnimator.copydefault();
                    memePumpUseCase$subscribePersonalizedWebSocket$12.L$0 = this;
                    memePumpUseCase$subscribePersonalizedWebSocket$12.I$0 = i;
                    memePumpUseCase$subscribePersonalizedWebSocket$12.label = 1;
                    if (interfaceC28701kfj.OLrzqt(strAEQbTJ, strKWHzl, listOLrzqt, numAEQbTJ, memeFilterCopydefault, memePumpUseCase$subscribePersonalizedWebSocket$12) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                memePumpUseCase = this;
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = memePumpUseCase$subscribePersonalizedWebSocket$12.I$0;
        memePumpUseCase = (MemePumpUseCase) memePumpUseCase$subscribePersonalizedWebSocket$12.L$0;
        C56391yDq.AEQbTJ(obj);
        if (i == 0) {
            memePumpUseCase.gEmmrt();
        } else {
            memePumpUseCase.valueOf();
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        this.uzCIH.copydefault();
    }

    public final void gEmmrt() {
        if (C22416heu.fJNWhG()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.AwvSrB, null, null, new MemePumpUseCase$subscribeNewTokenLogo$1(this, null), 3, null);
    }

    public final void valueOf() {
        this.fJNWhG.EZpvd();
    }

    public final Pair<Map<String, C28635keW>, Map<String, Integer>> copydefault(int i) {
        if (i == 0) {
            return new Pair<>(this.iwGUEr, this.hDKMBd);
        }
        if (i == 1) {
            return new Pair<>(this.wlaJM, this.AubY);
        }
        if (i == 2) {
            return new Pair<>(this.zuBGHE, this.AuCTelauCTel);
        }
        return new Pair<>(this.iwGUEr, this.hDKMBd);
    }

    public final void AEQbTJ() {
        this.iwGUEr.clear();
        this.wlaJM.clear();
        this.zuBGHE.clear();
        this.hDKMBd.clear();
        this.AubY.clear();
        this.AuCTelauCTel.clear();
        Iterator<Integer> it = new IntRange(0, 2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC56415yEn) it).nextInt();
            synchronized (this.AxsJAY[iNextInt]) {
                this.AxsJAY[iNextInt].clear();
                Unit unit = Unit.INSTANCE;
            }
        }
        this.djBIcL.clear();
        this.getNewProxyInstance.clear();
        this.ejfBZ.clear();
    }

    public final Object KWHzl(Continuation<? super Unit> continuation) {
        IntRange intRangeAhwBna = C56548yJl.AhwBna(0, 3);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(intRangeAhwBna, 10));
        Iterator<Integer> it = intRangeAhwBna.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC56415yEn) it).nextInt();
            Deferred deferredAsync$default = null;
            if (this.sSMYrx.get(C56443yFo.AEQbTJ(iNextInt)) != null) {
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.AwvSrB, null, null, new MemePumpUseCase$reloadAllTabsData$jobs$1$1(this, iNextInt, EZpvd(iNextInt), null), 3, null);
            }
            arrayList.add(deferredAsync$default);
        }
        Object objAwaitAll = AwaitKt.awaitAll(CollectionsKt___CollectionsKt.QfsBiF(arrayList), continuation);
        return objAwaitAll == C56442yFn.copydefault() ? objAwaitAll : Unit.INSTANCE;
    }

    public final String EZpvd(int i) {
        List<RankInfoData> rankInfos;
        RankInfoData rankInfoData;
        String rankType;
        ConfigInfoData configInfoData = this.AYXKKw;
        return (configInfoData == null || (rankInfos = configInfoData.getRankInfos()) == null || (rankInfoData = (RankInfoData) CollectionsKt___CollectionsKt.AkhnZx(rankInfos, i)) == null || (rankType = rankInfoData.getRankType()) == null) ? "1" : rankType;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull MemeUiModel memeUiModel, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MemePumpUseCase$addToBlacklist$1 memePumpUseCase$addToBlacklist$1;
        Function0<Unit> function02;
        MemePumpUseCase memePumpUseCase;
        MemePumpUseCase memePumpUseCase2;
        Function0<Unit> function03;
        if (continuation instanceof MemePumpUseCase$addToBlacklist$1) {
            memePumpUseCase$addToBlacklist$1 = (MemePumpUseCase$addToBlacklist$1) continuation;
            int i = memePumpUseCase$addToBlacklist$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memePumpUseCase$addToBlacklist$1.label = i - Integer.MIN_VALUE;
            } else {
                memePumpUseCase$addToBlacklist$1 = new MemePumpUseCase$addToBlacklist$1(this, continuation);
            }
        }
        Object obj = memePumpUseCase$addToBlacklist$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memePumpUseCase$addToBlacklist$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AYXKKw();
            InterfaceC28693kfb interfaceC28693kfb = this.AkhnZx;
            MemeBlacklist memeBlacklist = new MemeBlacklist(memeUiModel.KWHzl(), memeUiModel.AuCTel(), memeUiModel.iwGUEr(), memeUiModel.OLrzqt(), memeUiModel.getNewProxyInstance(), memeUiModel.getFieldNames());
            memePumpUseCase$addToBlacklist$1.L$0 = this;
            memePumpUseCase$addToBlacklist$1.L$1 = function0;
            memePumpUseCase$addToBlacklist$1.label = 1;
            if (interfaceC28693kfb.EZpvd(memeBlacklist, memePumpUseCase$addToBlacklist$1) == objCopydefault) {
                return objCopydefault;
            }
            function02 = function0;
            memePumpUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function03 = (Function0) memePumpUseCase$addToBlacklist$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    function03.invoke();
                    return Unit.INSTANCE;
                }
                function02 = (Function0) memePumpUseCase$addToBlacklist$1.L$1;
                memePumpUseCase2 = (MemePumpUseCase) memePumpUseCase$addToBlacklist$1.L$0;
                C56391yDq.AEQbTJ(obj);
                memePumpUseCase2.djBIcL();
                memePumpUseCase$addToBlacklist$1.L$0 = function02;
                memePumpUseCase$addToBlacklist$1.L$1 = null;
                memePumpUseCase$addToBlacklist$1.label = 3;
                if (DelayKt.delay(500L, memePumpUseCase$addToBlacklist$1) != objCopydefault) {
                    return objCopydefault;
                }
                function03 = function02;
                function03.invoke();
                return Unit.INSTANCE;
            }
            function02 = (Function0) memePumpUseCase$addToBlacklist$1.L$1;
            memePumpUseCase = (MemePumpUseCase) memePumpUseCase$addToBlacklist$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        memePumpUseCase$addToBlacklist$1.L$0 = memePumpUseCase;
        memePumpUseCase$addToBlacklist$1.L$1 = function02;
        memePumpUseCase$addToBlacklist$1.label = 2;
        if (memePumpUseCase.AEQbTJ(true, (Continuation<? super Unit>) memePumpUseCase$addToBlacklist$1) == objCopydefault) {
            return objCopydefault;
        }
        memePumpUseCase2 = memePumpUseCase;
        memePumpUseCase2.djBIcL();
        memePumpUseCase$addToBlacklist$1.L$0 = function02;
        memePumpUseCase$addToBlacklist$1.L$1 = null;
        memePumpUseCase$addToBlacklist$1.label = 3;
        if (DelayKt.delay(500L, memePumpUseCase$addToBlacklist$1) != objCopydefault) {
        }
    }

    public final List<StateFlow<InterfaceC28694kfc>> EZpvd() {
        List<MutableStateFlow<InterfaceC28694kfc>> list = this.KWHzl;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(FlowKt.asStateFlow((MutableStateFlow) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(int i, @NotNull List<NewTokenWsData> list) {
        Map<String, C28635keW> map;
        Map<String, Integer> map2;
        C28635keW c28635keWCopy$default;
        Intrinsics.checkNotNullParameter(list, "");
        if (i == 0) {
            map = this.iwGUEr;
        } else if (i == 1) {
            map = this.wlaJM;
        } else if (i != 2) {
            return;
        } else {
            map = this.zuBGHE;
        }
        if (i == 0) {
            map2 = this.hDKMBd;
        } else if (i == 1) {
            map2 = this.AubY;
        } else if (i != 2) {
            return;
        } else {
            map2 = this.AuCTelauCTel;
        }
        ArrayList<NewTokenWsData> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            NewTokenWsData newTokenWsData = (NewTokenWsData) next;
            StateListAnimator stateListAnimator = this.sSMYrx.get(Integer.valueOf(i));
            List<String> listOLrzqt = stateListAnimator != null ? stateListAnimator.OLrzqt() : null;
            if (listOLrzqt == null) {
                listOLrzqt = yDY.AhwBna();
            }
            if (listOLrzqt.contains(newTokenWsData.getProtocolId())) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList<C28635keW> arrayList2 = new ArrayList();
        for (NewTokenWsData newTokenWsData2 : arrayList) {
            if (map.containsKey(copydefault(newTokenWsData2.getTokenContractAddress(), newTokenWsData2.getChainIndex()))) {
                c28635keWCopy$default = null;
            } else {
                StateListAnimator stateListAnimator2 = this.sSMYrx.get(Integer.valueOf(i));
                List<String> listOLrzqt2 = stateListAnimator2 != null ? stateListAnimator2.OLrzqt() : null;
                if (listOLrzqt2 == null) {
                    listOLrzqt2 = yDY.AhwBna();
                }
                if (listOLrzqt2.contains(newTokenWsData2.getProtocolId())) {
                    c28635keWCopy$default = C28635keW.copy$default(C28638keZ.copydefault.AEQbTJ(newTokenWsData2), null, null, null, null, null, false, null, null, String.valueOf(System.currentTimeMillis()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0L, null, null, -257, 1023, null);
                }
            }
            if (c28635keWCopy$default != null) {
                arrayList2.add(c28635keWCopy$default);
            }
        }
        if (true ^ arrayList2.isEmpty()) {
            synchronized (map) {
                synchronized (map2) {
                    for (C28635keW c28635keW : arrayList2) {
                        map.put(copydefault(c28635keW.AwvSrB(), c28635keW.KWHzl()), c28635keW);
                    }
                    List<C28635keW> listOLrzqt3 = OLrzqt(i, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(map.values()));
                    map2.clear();
                    map.clear();
                    int i2 = 0;
                    for (Object obj : listOLrzqt3) {
                        if (i2 < 0) {
                            yDY.AYXKKw();
                        }
                        C28635keW c28635keW2 = (C28635keW) obj;
                        String strCopydefault = copydefault(c28635keW2.AwvSrB(), c28635keW2.KWHzl());
                        map2.put(strCopydefault, Integer.valueOf(i2));
                        map.put(strCopydefault, c28635keW2);
                        i2++;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            if (this.AEQbTJ.getValue().contains(Integer.valueOf(i))) {
                Set<String> setAEQbTJ = AEQbTJ(i);
                for (C28635keW c28635keW3 : arrayList2) {
                    setAEQbTJ.add(copydefault(c28635keW3.AwvSrB(), c28635keW3.KWHzl()));
                }
            }
            this.ejfBZ.put(Integer.valueOf(i), Boolean.TRUE);
            copydefault(i, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(map.values()), UpdateType.NEW_TOKENS);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [919=4, 920=4, 921=4] */
    public final Object OLrzqt(List<C28636keX> list, Continuation<? super Unit> continuation) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        for (C28636keX c28636keX : list) {
            String strCopydefault = copydefault(c28636keX.AEQbTJ(), c28636keX.EZpvd());
            for (Map map : yDY.gEmmrt(this.iwGUEr, this.wlaJM, this.zuBGHE)) {
                synchronized (map) {
                    C28635keW c28635keW = (C28635keW) map.get(strCopydefault);
                    if (c28635keW != null) {
                        if (OLrzqt(c28636keX) <= KWHzl(c28635keW)) {
                            map.put(strCopydefault, C28635keW.copy$default(c28635keW, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, c28636keX.KWHzl(), c28636keX.copydefault(), EZpvd(c28636keX), -1, 127, null));
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        this.ejfBZ.put(C56443yFo.AEQbTJ(0), C56443yFo.KWHzl(true));
        this.ejfBZ.put(C56443yFo.AEQbTJ(1), C56443yFo.KWHzl(true));
        this.ejfBZ.put(C56443yFo.AEQbTJ(2), C56443yFo.KWHzl(true));
        synchronized (this.iwGUEr) {
            Map<String, C28635keW> map2 = this.iwGUEr;
            arrayList = new ArrayList(map2.size());
            Iterator<Map.Entry<String, C28635keW>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
        }
        synchronized (this.wlaJM) {
            Map<String, C28635keW> map3 = this.wlaJM;
            arrayList2 = new ArrayList(map3.size());
            Iterator<Map.Entry<String, C28635keW>> it2 = map3.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getValue());
            }
        }
        synchronized (this.zuBGHE) {
            Map<String, C28635keW> map4 = this.zuBGHE;
            arrayList3 = new ArrayList(map4.size());
            Iterator<Map.Entry<String, C28635keW>> it3 = map4.entrySet().iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().getValue());
            }
        }
        UpdateType updateType = UpdateType.BUY_SIGNALS;
        copydefault(0, arrayList, updateType);
        copydefault(1, arrayList2, updateType);
        copydefault(2, arrayList3, updateType);
        return Unit.INSTANCE;
    }
}
