package com.okinc.business.market.features.watchlist.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C26109jSg;
import o.C26240jXc;
import o.C27764kCm;
import o.C27767kCp;
import o.C27772kCu;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SharedWatchListViewModel extends ViewModel {
    public final C26109jSg AEQbTJ;
    public final StateFlow<List<CommonGroupUiModel>> AYXKKw;
    public final C27767kCp AhwBna;
    public final StateFlow<Long> AkhnZx;
    public final StateFlow<List<CommonGroupData>> DbNXlk;
    public final MutableStateFlow<List<CommonGroupUiModel>> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final MutableStateFlow<List<CommonGroupData>> OLrzqt;
    public final MutableStateFlow<List<CommonGroupUiModel>> copydefault;
    public final C27764kCm djBIcL;
    public final StateFlow<Boolean> fetchVPNInfo;
    public final C26240jXc gEmmrt;
    public final Map<Integer, Boolean> isConnected;
    public final C27772kCu valueOf;
    public final SavedStateHandle values;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupSelectionMode.values().length];
            try {
                iArr[GroupSelectionMode.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupSelectionMode.BULK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<CommonGroupUiModel>> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Long> KWHzl() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.fetchVPNInfo;
    }

    @yCM
    public SharedWatchListViewModel(@NotNull C27764kCm c27764kCm, @NotNull C27772kCu c27772kCu, @NotNull C26109jSg c26109jSg, @NotNull C27767kCp c27767kCp, @NotNull C26240jXc c26240jXc, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c27764kCm, "");
        Intrinsics.checkNotNullParameter(c27772kCu, "");
        Intrinsics.checkNotNullParameter(c26109jSg, "");
        Intrinsics.checkNotNullParameter(c27767kCp, "");
        Intrinsics.checkNotNullParameter(c26240jXc, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = c27764kCm;
        this.valueOf = c27772kCu;
        this.AEQbTJ = c26109jSg;
        this.AhwBna = c27767kCp;
        this.gEmmrt = c26240jXc;
        this.values = savedStateHandle;
        MutableStateFlow<List<CommonGroupData>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<CommonGroupUiModel>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow2;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow2);
        this.isConnected = new LinkedHashMap();
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.KWHzl = MutableStateFlow3;
        this.fetchVPNInfo = MutableStateFlow3;
        this.copydefault = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AkhnZx = c26109jSg.AEQbTJ();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedWatchListViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:12:0x0046). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = o.C56437yFi.OLrzqt()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r6.L$2
                java.lang.Object r3 = r6.L$1
                com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel r3 = (com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel) r3
                java.lang.Object r4 = r6.L$0
                kotlinx.coroutines.flow.MutableStateFlow r4 = (kotlinx.coroutines.flow.MutableStateFlow) r4
                o.C56391yDq.AEQbTJ(r7)
                goto L46
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                o.C56391yDq.AEQbTJ(r7)
                com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel r7 = com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel.valueOf(r7)
                com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel r1 = com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel.this
                r4 = r7
                r3 = r1
            L2e:
                java.lang.Object r1 = r4.getValue()
                r7 = r1
                java.util.List r7 = (java.util.List) r7
                r6.L$0 = r4
                r6.L$1 = r3
                r6.L$2 = r1
                r6.label = r2
                r7 = 0
                r5 = 0
                java.lang.Object r7 = com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel.refreshWatchListGroups$default(r3, r7, r6, r2, r5)
                if (r7 != r0) goto L46
                return r0
            L46:
                java.util.List r7 = (java.util.List) r7
                boolean r7 = r4.compareAndSet(r1, r7)
                if (r7 == 0) goto L2e
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ Object refreshWatchListGroups$default(SharedWatchListViewModel sharedWatchListViewModel, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return sharedWatchListViewModel.OLrzqt(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(boolean z, @NotNull Continuation<? super List<CommonGroupData>> continuation) throws Throwable {
        SharedWatchListViewModel$refreshWatchListGroups$1 sharedWatchListViewModel$refreshWatchListGroups$1;
        Object objCopydefault;
        if (continuation instanceof SharedWatchListViewModel$refreshWatchListGroups$1) {
            sharedWatchListViewModel$refreshWatchListGroups$1 = (SharedWatchListViewModel$refreshWatchListGroups$1) continuation;
            int i = sharedWatchListViewModel$refreshWatchListGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sharedWatchListViewModel$refreshWatchListGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                sharedWatchListViewModel$refreshWatchListGroups$1 = new SharedWatchListViewModel$refreshWatchListGroups$1(this, continuation);
            }
        }
        Object obj = sharedWatchListViewModel$refreshWatchListGroups$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = sharedWatchListViewModel$refreshWatchListGroups$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C27764kCm c27764kCm = this.djBIcL;
            sharedWatchListViewModel$refreshWatchListGroups$1.label = 1;
            objCopydefault = c27764kCm.copydefault(z, sharedWatchListViewModel$refreshWatchListGroups$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        return Result.m7383isFailureimpl(objCopydefault) ? yDY.AhwBna() : objCopydefault;
    }

    public final void copydefault() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SharedWatchListViewModel$invalidateCachedWatchlistGroups$1(this, null), 3, null);
    }

    public final void OLrzqt(@NotNull TokenGroupSelectionParams tokenGroupSelectionParams) {
        Intrinsics.checkNotNullParameter(tokenGroupSelectionParams, "");
        int i = ActionBar.OLrzqt[tokenGroupSelectionParams.KWHzl().ordinal()];
        if (i == 1) {
            HomeToken homeToken = (HomeToken) CollectionsKt___CollectionsKt.firstOrNull(tokenGroupSelectionParams.OLrzqt());
            if (homeToken == null) {
                return;
            }
            copydefault(homeToken);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Integer numAEQbTJ = tokenGroupSelectionParams.AEQbTJ();
        if (numAEQbTJ != null) {
            KWHzl(numAEQbTJ.intValue());
        }
    }

    public final void KWHzl(int i) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SharedWatchListViewModel$loadAvailableGroups$1(this, i, null), 3, null);
    }

    public final void EZpvd() {
        boolean z;
        List<CommonGroupUiModel> value = this.copydefault.getValue();
        if ((value instanceof Collection) && value.isEmpty()) {
            z = false;
        } else {
            for (CommonGroupUiModel commonGroupUiModel : value) {
                Boolean bool = this.isConnected.get(Integer.valueOf(commonGroupUiModel.KWHzl()));
                if (bool != null && !Intrinsics.EZpvd(bool, Boolean.valueOf(commonGroupUiModel.copydefault()))) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.KWHzl.setValue(Boolean.valueOf(z));
    }

    public final void copydefault(HomeToken homeToken) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SharedWatchListViewModel$loadGroupWithTokenStatus$1(this, homeToken, null), 3, null);
    }

    public final Pair<List<Integer>, List<Integer>> AhwBna() {
        List<CommonGroupUiModel> value = this.copydefault.getValue();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CommonGroupUiModel commonGroupUiModel : value) {
            Boolean bool = this.isConnected.get(Integer.valueOf(commonGroupUiModel.KWHzl()));
            if ((bool != null ? bool.booleanValue() : false) != commonGroupUiModel.copydefault()) {
                if (commonGroupUiModel.copydefault()) {
                    arrayList.add(commonGroupUiModel);
                } else {
                    arrayList2.add(commonGroupUiModel);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((CommonGroupUiModel) it.next()).KWHzl()));
        }
        ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Integer.valueOf(((CommonGroupUiModel) it2.next()).KWHzl()));
        }
        return C56390yDp.OLrzqt(arrayList3, arrayList4);
    }

    public final void EZpvd(int i) {
        List<CommonGroupUiModel> value;
        ArrayList arrayList;
        MutableStateFlow<List<CommonGroupUiModel>> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
            List<CommonGroupUiModel> list = value;
            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (CommonGroupUiModel commonGroupUiModelCopy$default : list) {
                if (commonGroupUiModelCopy$default.KWHzl() == i) {
                    C33129mqd.copydefault((Object) Integer.valueOf(commonGroupUiModelCopy$default.OLrzqt()), (Object) 200);
                    commonGroupUiModelCopy$default = CommonGroupUiModel.copy$default(commonGroupUiModelCopy$default, 0, null, 0, 0, 0, !commonGroupUiModelCopy$default.copydefault(), false, 95, null);
                }
                arrayList.add(commonGroupUiModelCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        this.EZpvd.setValue(this.copydefault.getValue());
        EZpvd();
    }
}
