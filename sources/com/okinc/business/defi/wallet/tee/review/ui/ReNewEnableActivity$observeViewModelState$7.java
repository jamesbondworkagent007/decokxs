package com.okinc.business.defi.wallet.tee.review.ui;

import android.app.Activity;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16363eiX;
import o.C52794wYp;
import o.C55173xeu;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.fVU;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableActivity$observeViewModelState$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableActivity$observeViewModelState$7(fVU fvu, Continuation<? super ReNewEnableActivity$observeViewModelState$7> continuation) {
        super(2, continuation);
        this.this$0 = fvu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableActivity$observeViewModelState$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableActivity$observeViewModelState$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$7$1, reason: invalid class name */
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$7$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03181 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ fVU this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03181(fVU fvu, Continuation<? super C03181> continuation) {
                super(2, continuation);
                this.this$0 = fvu;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03181 c03181 = new C03181(this.this$0, continuation);
                c03181.L$0 = obj;
                return c03181;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return ((C03181) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$7$1$1$Application */
            public static final class Application implements View.OnClickListener {
                public final /* synthetic */ View AEQbTJ;
                public final /* synthetic */ long EZpvd;
                public final /* synthetic */ fVU OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public Application(View view, long j, fVU fvu) {
                    this.AEQbTJ = view;
                    this.EZpvd = j;
                    this.OLrzqt = fvu;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                        C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                        this.OLrzqt.gEmmrt().fJNWhG();
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C55173xeu c55173xeu;
                C52794wYp c52794wYp;
                NestedScrollView nestedScrollView;
                C55173xeu c55173xeu2;
                Group group;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Boolean bool = (Boolean) this.L$0;
                    if (bool == null) {
                        return Unit.INSTANCE;
                    }
                    if (bool.booleanValue()) {
                        AbstractC16363eiX abstractC16363eiX = this.this$0.gEmmrt;
                        if (abstractC16363eiX != null && (group = abstractC16363eiX.valueOf) != null) {
                            group.setVisibility(4);
                        }
                        AbstractC16363eiX abstractC16363eiX2 = this.this$0.gEmmrt;
                        if (abstractC16363eiX2 != null && (c55173xeu2 = abstractC16363eiX2.gEmmrt) != null) {
                            fVU fvu = this.this$0;
                            c55173xeu2.setVisibility(0);
                            C52794wYp c52794wYpAEQbTJ = c55173xeu2.AEQbTJ();
                            c52794wYpAEQbTJ.setOnClickListener(new Application(c52794wYpAEQbTJ, 1000L, fvu));
                        }
                        rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                    } else {
                        AbstractC16363eiX abstractC16363eiX3 = this.this$0.gEmmrt;
                        if (abstractC16363eiX3 != null && (nestedScrollView = abstractC16363eiX3.djBIcL) != null) {
                            nestedScrollView.setVisibility(0);
                        }
                        AbstractC16363eiX abstractC16363eiX4 = this.this$0.gEmmrt;
                        if (abstractC16363eiX4 != null && (c52794wYp = abstractC16363eiX4.copydefault) != null) {
                            c52794wYp.setVisibility(this.this$0.gEmmrt().valueOf().getValue() instanceof ReNewEnableViewModel.Activity.C0321Activity ? 0 : 4);
                        }
                        AbstractC16363eiX abstractC16363eiX5 = this.this$0.gEmmrt;
                        if (abstractC16363eiX5 != null && (c55173xeu = abstractC16363eiX5.gEmmrt) != null) {
                            c55173xeu.setVisibility(8);
                        }
                        rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    }
                    this.this$0.dismissLoadingWithLogo();
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
                StateFlow<Boolean> stateFlowAhwBna = this.this$0.gEmmrt().AhwBna();
                C03181 c03181 = new C03181(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAhwBna, c03181, this) == objCopydefault) {
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
