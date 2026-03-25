package com.okinc.business.defi.wallet.home.addressDetail.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC16365eiZ;
import o.ActivityC15891eZc;
import o.C13754dXa;
import o.C33070mpX;
import o.C43453rpa;
import o.C55173xeu;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfilePortfolioDetailsActivity$initListener$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC15891eZc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePortfolioDetailsActivity$initListener$3(ActivityC15891eZc activityC15891eZc, Continuation<? super ProfilePortfolioDetailsActivity$initListener$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC15891eZc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfilePortfolioDetailsActivity$initListener$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfilePortfolioDetailsActivity$initListener$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfilePortfolioDetailsActivity$initListener$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC15891eZc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC15891eZc activityC15891eZc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC15891eZc;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfilePortfolioDetailsActivity$initListener$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02831 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ ActivityC15891eZc this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02831(ActivityC15891eZc activityC15891eZc, Continuation<? super C02831> continuation) {
                super(2, continuation);
                this.this$0 = activityC15891eZc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02831 c02831 = new C02831(this.this$0, continuation);
                c02831.Z$0 = ((Boolean) obj).booleanValue();
                return c02831;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((C02831) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AbstractC16365eiZ abstractC16365eiZ = null;
                    if (this.Z$0) {
                        AbstractC16365eiZ abstractC16365eiZ2 = this.this$0.AkhnZx;
                        if (abstractC16365eiZ2 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16365eiZ2 = null;
                        }
                        abstractC16365eiZ2.AkhnZx.setVisibility(0);
                        AbstractC16365eiZ abstractC16365eiZ3 = this.this$0.AkhnZx;
                        if (abstractC16365eiZ3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16365eiZ = abstractC16365eiZ3;
                        }
                        abstractC16365eiZ.djBIcL.setVisibility(8);
                    } else {
                        AbstractC16365eiZ abstractC16365eiZ4 = this.this$0.AkhnZx;
                        if (abstractC16365eiZ4 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16365eiZ4 = null;
                        }
                        abstractC16365eiZ4.AkhnZx.AEQbTJ();
                        this.this$0.djBIcL();
                        if (this.this$0.gEmmrt().AYXKKw() <= 1 && !this.this$0.djBIcL) {
                            AbstractC16365eiZ abstractC16365eiZ5 = this.this$0.AkhnZx;
                            if (abstractC16365eiZ5 == null) {
                                Intrinsics.gEmmrt("");
                                abstractC16365eiZ5 = null;
                            }
                            abstractC16365eiZ5.AkhnZx.setVisibility(4);
                            AbstractC16365eiZ abstractC16365eiZ6 = this.this$0.AkhnZx;
                            if (abstractC16365eiZ6 == null) {
                                Intrinsics.gEmmrt("");
                                abstractC16365eiZ6 = null;
                            }
                            abstractC16365eiZ6.djBIcL.setVisibility(0);
                            AbstractC16365eiZ abstractC16365eiZ7 = this.this$0.AkhnZx;
                            if (abstractC16365eiZ7 == null) {
                                Intrinsics.gEmmrt("");
                            } else {
                                abstractC16365eiZ = abstractC16365eiZ7;
                            }
                            C55173xeu c55173xeu = abstractC16365eiZ.djBIcL;
                            final ActivityC15891eZc activityC15891eZc = this.this$0;
                            c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKOmnske));
                            c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC));
                            if (C43453rpa.AEQbTJ.KWHzl(activityC15891eZc)) {
                                c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onViewAttachedToWindow));
                                c55173xeu.setEmptyTypeImage(9);
                            } else {
                                c55173xeu.setEmptyTypeImage(8);
                                c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.R));
                            }
                            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eZl
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    ActivityC15891eZc.valueOf(activityC15891eZc);
                                }
                            });
                        } else {
                            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerCallbackMessenger), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
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
                MutableSharedFlow<Boolean> mutableSharedFlowAhwBna = this.this$0.gEmmrt().AhwBna();
                C02831 c02831 = new C02831(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableSharedFlowAhwBna, c02831, this) == objCopydefault) {
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
            ActivityC15891eZc activityC15891eZc = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC15891eZc, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC15891eZc, state, anonymousClass1, this) == objCopydefault) {
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
