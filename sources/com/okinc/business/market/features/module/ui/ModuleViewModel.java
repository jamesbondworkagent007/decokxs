package com.okinc.business.market.features.module.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C25389ivm;
import o.C28896kjS;
import o.C28897kjT;
import o.C28970kkn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ModuleViewModel extends ViewModel {
    public final kKG EZpvd;
    public final MutableLiveData<C28970kkn> KWHzl;
    public final C28896kjS OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C28970kkn> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28896kjS KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public ModuleViewModel(@NotNull kKG kkg, @NotNull C28896kjS c28896kjS, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28896kjS, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = kkg;
        this.OLrzqt = c28896kjS;
        this.copydefault = coroutineDispatcher;
        this.KWHzl = new MutableLiveData<>();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.module.ui.ModuleViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ModuleViewModel.this.new AnonymousClass1(continuation);
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
                StateFlow<List<C28897kjT>> stateFlowOLrzqt = ModuleViewModel.this.KWHzl().OLrzqt();
                final ModuleViewModel moduleViewModel = ModuleViewModel.this;
                FlowCollector<? super List<C28897kjT>> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.module.ui.ModuleViewModel.1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List<C28897kjT> list, Continuation<? super Unit> continuation) {
                        moduleViewModel.KWHzl.setValue(new C28970kkn(false, false, list, 3, null));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
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

    public final void EZpvd() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ModuleViewModel$getModules$1(this, null), 3, null);
    }

    public final String OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.EZpvd.valueOf();
        if (interfaceC9738bbJValueOf != null) {
            return interfaceC9738bbJValueOf.DbNXlk();
        }
        return null;
    }

    public final void copydefault() {
        C28970kkn value = this.KWHzl.getValue();
        List<C28897kjT> listCopydefault = value != null ? value.copydefault() : null;
        if (listCopydefault == null || listCopydefault.isEmpty()) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new ModuleViewModel$startWebsocket$1(this, null), 2, null);
    }

    public final void AhwBna() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ModuleViewModel$stopWebsocket$1(this, null), 3, null);
    }
}
