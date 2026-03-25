package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC17404fEb;
import o.Point;
import o.fDO;
import o.fDU;
import o.fDV;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public List<fDU> AEQbTJ;
    public final InterfaceC17404fEb AYXKKw;
    public final StateFlow<Point<String>> AhwBna;
    public String AkhnZx;
    public final boolean DbNXlk;
    public final fDV KWHzl;
    public final MutableStateFlow<Point<String>> OLrzqt;
    public final MutableStateFlow<Point<Application>> copydefault;
    public final boolean djBIcL;
    public final CoroutineDispatcher gEmmrt;
    public Job isConnected;
    public final StateFlow<Point<Application>> valueOf;
    public final MutableStateFlow<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<Application>> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Point<String>> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.djBIcL;
    }

    @yCM
    public SearchWalletViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC17404fEb interfaceC17404fEb, @NotNull fDV fdv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC17404fEb, "");
        Intrinsics.checkNotNullParameter(fdv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AYXKKw = interfaceC17404fEb;
        this.KWHzl = fdv;
        this.gEmmrt = coroutineDispatcher;
        Boolean bool = (Boolean) savedStateHandle.get("show_tee_wallet_status");
        this.DbNXlk = bool != null ? bool.booleanValue() : true;
        MutableStateFlow<Point<Application>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Point<String>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        this.AEQbTJ = yDY.AhwBna();
        this.values = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.djBIcL = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchWalletViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Object value;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SearchWalletViewModel searchWalletViewModel = SearchWalletViewModel.this;
                    Result.Application application = Result.Companion;
                    InterfaceC17404fEb interfaceC17404fEb = searchWalletViewModel.AYXKKw;
                    boolean z = searchWalletViewModel.DbNXlk;
                    this.label = 1;
                    obj = interfaceC17404fEb.EZpvd(z, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            SearchWalletViewModel searchWalletViewModel2 = SearchWalletViewModel.this;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                searchWalletViewModel2.AEQbTJ = (List) objM7377constructorimpl;
                searchWalletViewModel2.EZpvd(searchWalletViewModel2.AkhnZx, 0L);
            }
            SearchWalletViewModel searchWalletViewModel3 = SearchWalletViewModel.this;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                searchWalletViewModel3.AEQbTJ = yDY.AhwBna();
                MutableStateFlow mutableStateFlow = searchWalletViewModel3.copydefault;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, new Point.TaskDescription(thM7380exceptionOrNullimpl.getMessage())));
            }
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(String str) {
        String string = str != null ? StringsKt__StringsKt.hDKMBd((CharSequence) str).toString() : null;
        this.AkhnZx = string;
        startSearchTextJob$default(this, string, 0L, 2, null);
    }

    public static /* synthetic */ void startSearchTextJob$default(SearchWalletViewModel searchWalletViewModel, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 500;
        }
        searchWalletViewModel.EZpvd(str, j);
    }

    public final void EZpvd(String str, long j) {
        Job job = this.isConnected;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.isConnected = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchWalletViewModel$startSearchTextJob$1(j, this, str, null), 3, null);
    }

    public final Job AEQbTJ(CoroutineScope coroutineScope) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SearchWalletViewModel$launchLoadingIfDelayed$1(this, null), 3, null);
    }

    public final Job copydefault(CoroutineScope coroutineScope, String str) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SearchWalletViewModel$filterRootWallets$1(this, str, null), 3, null);
    }

    public final Object AEQbTJ(fDU fdu, String str, Continuation<? super List<fDO>> continuation) {
        return CoroutineScopeKt.coroutineScope(new SearchWalletViewModel$getFilteredAccounts$2(fdu, str, this, null), continuation);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchWalletViewModel$changeWallet$1(this, str, null), 3, null);
    }

    public static final class Application {
        public final List<fDU> AEQbTJ;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            if ((i & 2) != 0) {
                list = application.AEQbTJ;
            }
            return application.copydefault(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<fDU> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(String str, @NotNull List<fDU> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletSearchResultsState(searchText=" + this.copydefault + ", searchResults=" + this.AEQbTJ + ")";
        }

        public Application(String str, @NotNull List<fDU> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = str;
            this.AEQbTJ = list;
        }
    }

    public final void AEQbTJ() {
        MutableStateFlow<Point<String>> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
        }
    }
}
