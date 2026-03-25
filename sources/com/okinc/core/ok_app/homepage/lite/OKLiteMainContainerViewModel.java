package com.okinc.core.ok_app.homepage.lite;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC47263tmj;
import o.AbstractC56429yFa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C6777aVl;
import o.InterfaceC47278tmy;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class OKLiteMainContainerViewModel extends ViewModel implements DefaultLifecycleObserver {
    public final MutableStateFlow<Boolean> AEQbTJ;
    public final StateFlow<Boolean> EZpvd;
    public final InterfaceC47278tmy KWHzl;
    public final CoroutineExceptionHandler copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public OKLiteMainContainerViewModel(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.KWHzl = interfaceC47278tmy;
        this.copydefault = new ActionBar(CoroutineExceptionHandler.Key);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.AEQbTJ = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerViewModel$onCreate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OKLiteMainContainerViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerViewModel$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03901 extends SuspendLambda implements Function2<AbstractC47263tmj, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OKLiteMainContainerViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03901(OKLiteMainContainerViewModel oKLiteMainContainerViewModel, Continuation<? super C03901> continuation) {
                super(2, continuation);
                this.this$0 = oKLiteMainContainerViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03901 c03901 = new C03901(this.this$0, continuation);
                c03901.L$0 = obj;
                return c03901;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
                return ((C03901) create(abstractC47263tmj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AbstractC47263tmj abstractC47263tmj = (AbstractC47263tmj) this.L$0;
                    if ((abstractC47263tmj instanceof AbstractC47263tmj.ActionBar) || (abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator) || Intrinsics.EZpvd(abstractC47263tmj, AbstractC47263tmj.Activity.OLrzqt)) {
                        MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                        Boolean boolKWHzl = C56443yFo.KWHzl(false);
                        this.label = 1;
                        if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<AbstractC47263tmj> flowFIwbmz = OKLiteMainContainerViewModel.this.KWHzl.fIwbmz();
                C03901 c03901 = new C03901(OKLiteMainContainerViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFIwbmz, c03901, this) == objCopydefault) {
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.homepage.lite.OKLiteMainContainerViewModel$onResume$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17031(Continuation<? super C17031> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OKLiteMainContainerViewModel.this.new C17031(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = OKLiteMainContainerViewModel.this.AEQbTJ;
                Boolean boolKWHzl = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableStateFlow.emit(boolKWHzl, this) == objCopydefault) {
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new C17031(null), 2, null);
    }

    public static final class ActionBar extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public ActionBar(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            C6777aVl.Companion.EZpvd(th);
            C56524yIo.AEQbTJ(OKLiteMainContainerViewModel.class).valueOf();
        }
    }
}
