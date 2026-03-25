package com.okinc.okex.lite.hero.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.lite.hero.data.model.HeroSection;
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
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC45723svf;
import o.InterfaceC45740svw;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class HeroContainerViewModel extends ViewModel {
    public final MutableStateFlow<InterfaceC45740svw> AEQbTJ;
    public final StateFlow<InterfaceC45740svw> OLrzqt;
    public final InterfaceC45723svf copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC45740svw> AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public HeroContainerViewModel(@NotNull InterfaceC45723svf interfaceC45723svf) {
        Intrinsics.checkNotNullParameter(interfaceC45723svf, "");
        this.copydefault = interfaceC45723svf;
        MutableStateFlow<InterfaceC45740svw> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC45740svw.Application.EZpvd);
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        EZpvd(interfaceC45723svf.copydefault());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.okex.lite.hero.ui.HeroContainerViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HeroContainerViewModel.this.new AnonymousClass1(continuation);
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
                SharedFlow<HeroSection> sharedFlowOLrzqt = HeroContainerViewModel.this.copydefault.OLrzqt();
                final HeroContainerViewModel heroContainerViewModel = HeroContainerViewModel.this;
                FlowCollector<? super HeroSection> flowCollector = new FlowCollector() { // from class: com.okinc.okex.lite.hero.ui.HeroContainerViewModel.1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(HeroSection heroSection, Continuation<? super Unit> continuation) {
                        heroContainerViewModel.EZpvd(heroSection);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
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

    public final void EZpvd(HeroSection heroSection) {
        if ((heroSection != null ? heroSection.KWHzl() : null) != null) {
            this.AEQbTJ.setValue(new InterfaceC45740svw.Activity(heroSection.KWHzl()));
        }
    }
}
