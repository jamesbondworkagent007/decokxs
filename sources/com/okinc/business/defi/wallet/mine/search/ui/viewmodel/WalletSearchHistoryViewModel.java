package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C18903frG;
import o.C18908frL;
import o.C18910frN;
import o.C18911frO;
import o.C18989fsn;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryViewModel extends AbstractC33073mpa {
    public static final Map<HistoryFilterType, Boolean> KWHzl;
    public final MutableStateFlow<List<C18989fsn>> AEQbTJ;
    public final C18908frL AYXKKw;
    public final C18910frN AhwBna;
    public final StateFlow<List<C18989fsn>> AkhnZx;
    public boolean DbNXlk;
    public final MutableStateFlow<HistoryFilterType> EZpvd;
    public final MutableStateFlow<Boolean> copydefault;
    public final C18903frG djBIcL;
    public int fIwbmz;
    public final StateFlow<List<C18989fsn>> fJNWhG;
    public Job fetchVPNInfo;
    public List<C18989fsn> gEmmrt;
    public final C18911frO isConnected;
    public final StateFlow<Map<HistoryFilterType, Boolean>> valueOf;
    public final StateFlow<Boolean> values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SearchType.values().length];
            try {
                iArr[SearchType.DAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchType.WEBSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchType.TOKEN_ASSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchType.NFT_ASSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchType.DEFI_ASSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[HistoryFilterType.values().length];
            try {
                iArr2[HistoryFilterType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[HistoryFilterType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[HistoryFilterType.DAPPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[HistoryFilterType.ADDRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[HistoryFilterType.MY_ASSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Map<HistoryFilterType, Boolean>> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C18989fsn>> KWHzl() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C18989fsn>> copydefault() {
        return this.AkhnZx;
    }

    @yCM
    public WalletSearchHistoryViewModel(@NotNull C18911frO c18911frO, @NotNull C18910frN c18910frN, @NotNull C18908frL c18908frL, @NotNull C18903frG c18903frG) {
        Intrinsics.checkNotNullParameter(c18911frO, "");
        Intrinsics.checkNotNullParameter(c18910frN, "");
        Intrinsics.checkNotNullParameter(c18908frL, "");
        Intrinsics.checkNotNullParameter(c18903frG, "");
        this.isConnected = c18911frO;
        this.AhwBna = c18910frN;
        this.AYXKKw = c18908frL;
        this.djBIcL = c18903frG;
        MutableStateFlow<List<C18989fsn>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow);
        this.gEmmrt = yDY.AhwBna();
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.copydefault = MutableStateFlow2;
        this.values = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<HistoryFilterType> MutableStateFlow3 = StateFlowKt.MutableStateFlow(HistoryFilterType.ALL);
        this.EZpvd = MutableStateFlow3;
        Flow flowFlowCombine = FlowKt.flowCombine(MutableStateFlow, MutableStateFlow3, new WalletSearchHistoryViewModel$formattedSearchHistoryFlow$1(this, null));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.AkhnZx = FlowKt.stateIn(flowFlowCombine, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        this.valueOf = FlowKt.stateIn(new ActionBar(MutableStateFlow, this), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), KWHzl);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    static {
        Pair pairOLrzqt = C56390yDp.OLrzqt(HistoryFilterType.ALL, Boolean.TRUE);
        HistoryFilterType historyFilterType = HistoryFilterType.CRYPTO;
        Boolean bool = Boolean.FALSE;
        KWHzl = C56424yEw.gEmmrt(pairOLrzqt, C56390yDp.OLrzqt(historyFilterType, bool), C56390yDp.OLrzqt(HistoryFilterType.DAPPS, bool), C56390yDp.OLrzqt(HistoryFilterType.ADDRESS, bool), C56390yDp.OLrzqt(HistoryFilterType.MY_ASSET, bool));
    }

    public static final class ActionBar implements Flow<Map<HistoryFilterType, ? extends Boolean>> {
        public final /* synthetic */ WalletSearchHistoryViewModel AEQbTJ;
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ WalletSearchHistoryViewModel KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, WalletSearchHistoryViewModel walletSearchHistoryViewModel) {
                this.copydefault = flowCollector;
                this.KWHzl = walletSearchHistoryViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x00ce A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                WalletSearchHistoryViewModel$special$$inlined$map$1$2$1 walletSearchHistoryViewModel$special$$inlined$map$1$2$1;
                Map mapGEmmrt;
                if (continuation instanceof WalletSearchHistoryViewModel$special$$inlined$map$1$2$1) {
                    walletSearchHistoryViewModel$special$$inlined$map$1$2$1 = (WalletSearchHistoryViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = walletSearchHistoryViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        walletSearchHistoryViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        walletSearchHistoryViewModel$special$$inlined$map$1$2$1 = new WalletSearchHistoryViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = walletSearchHistoryViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = walletSearchHistoryViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    List list = (List) obj;
                    if (list == null) {
                        mapGEmmrt = WalletSearchHistoryViewModel.KWHzl;
                        walletSearchHistoryViewModel$special$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(mapGEmmrt, walletSearchHistoryViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        }
                    } else {
                        try {
                        } catch (Exception e) {
                            pUU.AEQbTJ("WalletSearchHistoryViewModel", "Error calculating chip visibility: " + e.getMessage(), e);
                            mapGEmmrt = WalletSearchHistoryViewModel.KWHzl;
                        }
                        if (list.isEmpty()) {
                            mapGEmmrt = WalletSearchHistoryViewModel.KWHzl;
                            walletSearchHistoryViewModel$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(mapGEmmrt, walletSearchHistoryViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            HistoryFilterType historyFilterType = HistoryFilterType.CRYPTO;
                            HistoryFilterType historyFilterType2 = HistoryFilterType.DAPPS;
                            HistoryFilterType historyFilterType3 = HistoryFilterType.ADDRESS;
                            HistoryFilterType historyFilterType4 = HistoryFilterType.MY_ASSET;
                            mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(HistoryFilterType.ALL, C56443yFo.KWHzl(true)), C56390yDp.OLrzqt(historyFilterType, C56443yFo.KWHzl(this.KWHzl.copydefault(list, historyFilterType))), C56390yDp.OLrzqt(historyFilterType2, C56443yFo.KWHzl(this.KWHzl.copydefault(list, historyFilterType2))), C56390yDp.OLrzqt(historyFilterType3, C56443yFo.KWHzl(this.KWHzl.copydefault(list, historyFilterType3))), C56390yDp.OLrzqt(historyFilterType4, C56443yFo.KWHzl(this.KWHzl.copydefault(list, historyFilterType4))));
                            walletSearchHistoryViewModel$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(mapGEmmrt, walletSearchHistoryViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                            }
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, WalletSearchHistoryViewModel walletSearchHistoryViewModel) {
            this.EZpvd = flow;
            this.AEQbTJ = walletSearchHistoryViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Map<HistoryFilterType, ? extends Boolean>> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadHistory$default(WalletSearchHistoryViewModel walletSearchHistoryViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        walletSearchHistoryViewModel.copydefault(z);
    }

    public final void copydefault(boolean z) {
        Job job;
        if (z) {
            Job job2 = this.fetchVPNInfo;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.DbNXlk = false;
            this.copydefault.setValue(Boolean.TRUE);
            this.fIwbmz = 0;
        }
        if (this.DbNXlk && (job = this.fetchVPNInfo) != null && job.isActive()) {
            return;
        }
        this.DbNXlk = true;
        this.fetchVPNInfo = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletSearchHistoryViewModel$loadHistory$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull HistoryFilterType historyFilterType) {
        Intrinsics.checkNotNullParameter(historyFilterType, "");
        this.EZpvd.setValue(historyFilterType);
    }

    public final List<C18989fsn> AEQbTJ(List<C18989fsn> list, HistoryFilterType historyFilterType) {
        ArrayList arrayList;
        int i = Application.OLrzqt[historyFilterType.ordinal()];
        if (i == 1) {
            return list;
        }
        if (i == 2) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C18989fsn) obj).AEQbTJ().gEmmrt() == SearchType.TOKEN) {
                    arrayList.add(obj);
                }
            }
        } else if (i == 3) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                int i2 = Application.EZpvd[((C18989fsn) obj2).AEQbTJ().gEmmrt().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    arrayList.add(obj2);
                }
            }
        } else if (i == 4) {
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (((C18989fsn) obj3).AEQbTJ().gEmmrt() == SearchType.ADDRESS) {
                    arrayList.add(obj3);
                }
            }
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList();
            for (Object obj4 : list) {
                int i3 = Application.EZpvd[((C18989fsn) obj4).AEQbTJ().gEmmrt().ordinal()];
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    arrayList.add(obj4);
                }
            }
        }
        return arrayList;
    }

    public final boolean copydefault(List<C18989fsn> list, HistoryFilterType historyFilterType) {
        try {
            return !AEQbTJ(list, historyFilterType).isEmpty();
        } catch (Exception e) {
            pUU.AEQbTJ("WalletSearchHistoryViewModel", "Error checking items for filter " + historyFilterType + ": " + e.getMessage(), e);
            return false;
        }
    }

    public final void EZpvd(@NotNull C18989fsn c18989fsn) {
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletSearchHistoryViewModel$deleteSearchHistoryItem$1(this, c18989fsn, null), 3, null);
    }

    public final void KWHzl(@NotNull SearchHistoryItem searchHistoryItem) {
        Intrinsics.checkNotNullParameter(searchHistoryItem, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletSearchHistoryViewModel$addSearchHistory$1(this, searchHistoryItem, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        WalletSearchHistoryViewModel$clearSearchHistory$1 walletSearchHistoryViewModel$clearSearchHistory$1;
        Object objM7377constructorimpl;
        Object objKWHzl;
        WalletSearchHistoryViewModel walletSearchHistoryViewModel;
        if (continuation instanceof WalletSearchHistoryViewModel$clearSearchHistory$1) {
            walletSearchHistoryViewModel$clearSearchHistory$1 = (WalletSearchHistoryViewModel$clearSearchHistory$1) continuation;
            int i = walletSearchHistoryViewModel$clearSearchHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSearchHistoryViewModel$clearSearchHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSearchHistoryViewModel$clearSearchHistory$1 = new WalletSearchHistoryViewModel$clearSearchHistory$1(this, continuation);
            }
        }
        Object obj = walletSearchHistoryViewModel$clearSearchHistory$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSearchHistoryViewModel$clearSearchHistory$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                Job job = this.fetchVPNInfo;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.DbNXlk = false;
                C18908frL c18908frL = this.AYXKKw;
                walletSearchHistoryViewModel$clearSearchHistory$1.L$0 = this;
                walletSearchHistoryViewModel$clearSearchHistory$1.label = 1;
                objKWHzl = c18908frL.KWHzl(walletSearchHistoryViewModel$clearSearchHistory$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                walletSearchHistoryViewModel = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                walletSearchHistoryViewModel = (WalletSearchHistoryViewModel) walletSearchHistoryViewModel$clearSearchHistory$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objKWHzl);
            walletSearchHistoryViewModel.gEmmrt = yDY.AhwBna();
            walletSearchHistoryViewModel.AEQbTJ.setValue(yDY.AhwBna());
            walletSearchHistoryViewModel.copydefault.setValue(C56443yFo.KWHzl(false));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletSearchHistoryViewModel", "Failed to clear search history: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
