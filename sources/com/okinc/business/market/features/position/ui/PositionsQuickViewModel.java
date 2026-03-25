package com.okinc.business.market.features.position.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C29095knF;
import o.C29123knh;
import o.C29129knn;
import o.C56391yDq;
import o.C56442yFn;
import o.kKG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsQuickViewModel extends ViewModel {
    public String AEQbTJ;
    public final StateFlow<C29095knF> AYXKKw;
    public final C29123knh AhwBna;
    public final MutableStateFlow<C29095knF> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final C29129knn OLrzqt;
    public String copydefault;
    public final kKG djBIcL;
    public final StateFlow<Boolean> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29095knF> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public PositionsQuickViewModel(@NotNull kKG kkg, @NotNull C29123knh c29123knh, @NotNull C29129knn c29129knn) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c29123knh, "");
        Intrinsics.checkNotNullParameter(c29129knn, "");
        this.djBIcL = kkg;
        this.AhwBna = c29123knh;
        this.OLrzqt = c29129knn;
        MutableStateFlow<C29095knF> MutableStateFlow = StateFlowKt.MutableStateFlow(new C29095knF(false, null, null, 7, null));
        this.EZpvd = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.KWHzl = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.position.ui.PositionsQuickViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionsQuickViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<PnLDetailsUiModel> stateFlowCopydefault = PositionsQuickViewModel.this.AhwBna.copydefault();
                final PositionsQuickViewModel positionsQuickViewModel = PositionsQuickViewModel.this;
                FlowCollector<? super PnLDetailsUiModel> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.position.ui.PositionsQuickViewModel.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(PnLDetailsUiModel pnLDetailsUiModel, Continuation<? super Unit> continuation) {
                        positionsQuickViewModel.EZpvd.setValue(new C29095knF(false, pnLDetailsUiModel, null, 5, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static /* synthetic */ void getPnl$default(PositionsQuickViewModel positionsQuickViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        positionsQuickViewModel.OLrzqt(str, str2, z);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsQuickViewModel$getPnl$1(this, z, str, str2, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsQuickViewModel$checkPrivateMode$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsQuickViewModel$subscribeWs$1(this, str, str2, null), 3, null);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PositionsQuickViewModel$unsubscribeWs$1(this, null), 3, null);
    }
}
