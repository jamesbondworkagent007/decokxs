package com.okinc.business.defi.wallet.home.usdgActivity.ui.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.RegisterAddressStatus;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.RegisterAddressResultData;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.RegisterResultType;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.SupportChainAddressBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC12782ctV;
import o.AbstractC18226feR;
import o.ActivityC18238fed;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiUsdgResultActivity$observeRegisterState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC18238fed this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiUsdgResultActivity$observeRegisterState$1(ActivityC18238fed activityC18238fed, Continuation<? super DefiUsdgResultActivity$observeRegisterState$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC18238fed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiUsdgResultActivity$observeRegisterState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiUsdgResultActivity$observeRegisterState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.usdgActivity.ui.activity.DefiUsdgResultActivity$observeRegisterState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC18238fed this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC18238fed activityC18238fed, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC18238fed;
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.usdgActivity.ui.activity.DefiUsdgResultActivity$observeRegisterState$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02861 extends SuspendLambda implements Function2<AbstractC18226feR, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC18238fed this$0;

            /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.usdgActivity.ui.activity.DefiUsdgResultActivity$observeRegisterState$1$1$1$StateListAnimator */
            public final /* synthetic */ class StateListAnimator {
                public static final /* synthetic */ int[] KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[RegisterAddressStatus.values().length];
                    try {
                        iArr[RegisterAddressStatus.STATUS_REGISTERED_SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RegisterAddressStatus.STATUS_REGISTERED_REGION_NOT_SUPPORTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    KWHzl = iArr;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02861(ActivityC18238fed activityC18238fed, Continuation<? super C02861> continuation) {
                super(2, continuation);
                this.this$0 = activityC18238fed;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02861 c02861 = new C02861(this.this$0, continuation);
                c02861.L$0 = obj;
                return c02861;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AbstractC18226feR abstractC18226feR, Continuation<? super Unit> continuation) {
                return ((C02861) create(abstractC18226feR, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AbstractC18226feR abstractC18226feR = (AbstractC18226feR) this.L$0;
                    SupportChainAddressBean supportChainAddressBean = (SupportChainAddressBean) CollectionsKt___CollectionsKt.firstOrNull(this.this$0.AhwBna().AhwBna().getValue());
                    if (abstractC18226feR instanceof AbstractC18226feR.TaskDescription) {
                        AbstractC18226feR.TaskDescription taskDescription = (AbstractC18226feR.TaskDescription) abstractC18226feR;
                        int i = StateListAnimator.KWHzl[taskDescription.AEQbTJ().ordinal()];
                        if (i == 1) {
                            ActivityC18238fed activityC18238fed = this.this$0;
                            int value = RegisterResultType.TYPE_REGISTER_SUCCESS.getValue();
                            Long lKWHzl = supportChainAddressBean != null ? C56443yFo.KWHzl(supportChainAddressBean.getCoinId()) : null;
                            AbstractC12782ctV abstractC12782ctVValueOf = this.this$0.AhwBna().valueOf();
                            activityC18238fed.KWHzl = new RegisterAddressResultData(value, lKWHzl, abstractC12782ctVValueOf != null ? abstractC12782ctVValueOf.DbNXlk() : null, supportChainAddressBean != null ? C56443yFo.AEQbTJ(supportChainAddressBean.getAddressType()) : null, taskDescription.OLrzqt(), null, 32, null);
                            this.this$0.KWHzl();
                        } else if (i != 2) {
                            this.this$0.KWHzl(taskDescription.OLrzqt());
                        } else {
                            this.this$0.EZpvd();
                        }
                    } else if (abstractC18226feR instanceof AbstractC18226feR.Activity) {
                        this.this$0.KWHzl(false);
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
                SharedFlow<AbstractC18226feR> sharedFlowAuCTel = this.this$0.AhwBna().AuCTel();
                C02861 c02861 = new C02861(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowAuCTel, c02861, this) == objCopydefault) {
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
            ActivityC18238fed activityC18238fed = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC18238fed, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC18238fed, state, anonymousClass1, this) == objCopydefault) {
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
