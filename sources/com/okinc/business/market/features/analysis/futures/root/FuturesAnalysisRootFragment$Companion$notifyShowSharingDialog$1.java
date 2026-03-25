package com.okinc.business.market.features.analysis.futures.root;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC49411unz;
import o.C49366unG;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;

/* JADX INFO: loaded from: classes23.dex */
public final class FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ComponentActivity $context;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1(ComponentActivity componentActivity, Continuation<? super FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1> continuation) {
        super(2, continuation);
        this.$context = componentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1(this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ComponentActivity componentActivity = this.$context;
            final Function0 function0 = null;
            AbstractC49411unz abstractC49411unz = (AbstractC49411unz) new ViewModelLazy(C56524yIo.AEQbTJ(FuturesAnalysisViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1$invokeSuspend$$inlined$viewModels$default$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                    return viewModelStore;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1$invokeSuspend$$inlined$viewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelProvider.Factory invoke() {
                    ViewModelProvider.Factory defaultViewModelProviderFactory = componentActivity.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1$invokeSuspend$$inlined$viewModels$default$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final CreationExtras invoke() {
                    CreationExtras creationExtras;
                    Function0 function02 = function0;
                    if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                        return creationExtras;
                    }
                    CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                    return defaultViewModelCreationExtras;
                }
            }).getValue();
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$Companion$notifyShowSharingDialog$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return Long.valueOf(((FuturesAnalysisViewModel.StateListAnimator) obj2).AYXKKw());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((FuturesAnalysisViewModel.StateListAnimator) obj2).AEQbTJ(((Number) obj3).longValue());
                }
            };
            Long lKWHzl = C56443yFo.KWHzl(System.currentTimeMillis());
            this.label = 1;
            if (C49366unG.AEQbTJ(abstractC49411unz, anonymousClass1, lKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
