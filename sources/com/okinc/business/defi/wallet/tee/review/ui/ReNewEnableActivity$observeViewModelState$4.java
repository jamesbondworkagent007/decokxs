package com.okinc.business.defi.wallet.tee.review.ui;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16363eiX;
import o.C13754dXa;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.fVU;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableActivity$observeViewModelState$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableActivity$observeViewModelState$4(fVU fvu, Continuation<? super ReNewEnableActivity$observeViewModelState$4> continuation) {
        super(2, continuation);
        this.this$0 = fvu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableActivity$observeViewModelState$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableActivity$observeViewModelState$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ fVU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fVU fvu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fvu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$4$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03161 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ fVU this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03161(fVU fvu, Continuation<? super C03161> continuation) {
                super(2, continuation);
                this.this$0 = fvu;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03161 c03161 = new C03161(this.this$0, continuation);
                c03161.L$0 = obj;
                return c03161;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return ((C03161) create(num, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                TextView textView;
                TextView textView2;
                TextView textView3;
                TextView textView4;
                TextView textView5;
                TextView textView6;
                TextView textView7;
                TextView textView8;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Integer num = (Integer) this.L$0;
                    if (num != null && num.intValue() == 0) {
                        AbstractC16363eiX abstractC16363eiX = this.this$0.gEmmrt;
                        if (abstractC16363eiX != null && (textView8 = abstractC16363eiX.AubY) != null) {
                            textView8.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zagaMW));
                        }
                        AbstractC16363eiX abstractC16363eiX2 = this.this$0.gEmmrt;
                        if (abstractC16363eiX2 != null && (textView7 = abstractC16363eiX2.wlaJM) != null) {
                            textView7.setVisibility(0);
                        }
                        AbstractC16363eiX abstractC16363eiX3 = this.this$0.gEmmrt;
                        if (abstractC16363eiX3 != null && (textView6 = abstractC16363eiX3.AYXKKw) != null) {
                            textView6.setVisibility(8);
                        }
                        AbstractC16363eiX abstractC16363eiX4 = this.this$0.gEmmrt;
                        if (abstractC16363eiX4 != null && (textView5 = abstractC16363eiX4.AhwBna) != null) {
                            fVU fvu = this.this$0;
                            textView5.setVisibility(0);
                            fvu.copydefault(textView5, C13754dXa.FragmentManager.DtA, C13754dXa.FragmentManager.SlnMSS);
                        }
                    } else {
                        AbstractC16363eiX abstractC16363eiX5 = this.this$0.gEmmrt;
                        if (abstractC16363eiX5 != null && (textView4 = abstractC16363eiX5.AubY) != null) {
                            textView4.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hBORwR));
                        }
                        AbstractC16363eiX abstractC16363eiX6 = this.this$0.gEmmrt;
                        if (abstractC16363eiX6 != null && (textView3 = abstractC16363eiX6.wlaJM) != null) {
                            textView3.setVisibility(4);
                        }
                        AbstractC16363eiX abstractC16363eiX7 = this.this$0.gEmmrt;
                        if (abstractC16363eiX7 != null && (textView2 = abstractC16363eiX7.AhwBna) != null) {
                            textView2.setVisibility(8);
                        }
                        AbstractC16363eiX abstractC16363eiX8 = this.this$0.gEmmrt;
                        if (abstractC16363eiX8 != null && (textView = abstractC16363eiX8.AYXKKw) != null) {
                            textView.setVisibility(0);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<Integer> stateFlowAkhnZx = this.this$0.gEmmrt().AkhnZx();
                C03161 c03161 = new C03161(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAkhnZx, c03161, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objCopydefault) {
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
