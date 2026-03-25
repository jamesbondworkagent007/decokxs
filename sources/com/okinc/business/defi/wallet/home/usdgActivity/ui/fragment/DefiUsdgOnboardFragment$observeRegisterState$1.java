package com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment;

import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.RegisterAddressStatus;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.RegisterResultType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC18226feR;
import o.C16698eoo;
import o.C18254fet;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiUsdgOnboardFragment$observeRegisterState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18254fet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiUsdgOnboardFragment$observeRegisterState$1(C18254fet c18254fet, Continuation<? super DefiUsdgOnboardFragment$observeRegisterState$1> continuation) {
        super(2, continuation);
        this.this$0 = c18254fet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiUsdgOnboardFragment$observeRegisterState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiUsdgOnboardFragment$observeRegisterState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeRegisterState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC18226feR, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18254fet this$0;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeRegisterState$1$1$ActionBar */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[RegisterAddressStatus.values().length];
                try {
                    iArr[RegisterAddressStatus.STATUS_REGISTERED_REGION_NOT_SUPPORTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RegisterAddressStatus.STATUS_REGISTERED_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18254fet c18254fet, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18254fet;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC18226feR abstractC18226feR, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC18226feR, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            RegisterResultType registerResultType;
            C52794wYp c52794wYp;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC18226feR abstractC18226feR = (AbstractC18226feR) this.L$0;
                C16698eoo c16698eoo = this.this$0.valueOf;
                if (c16698eoo != null && (c52794wYp = c16698eoo.AEQbTJ) != null) {
                    c52794wYp.fIwbmz();
                }
                if (abstractC18226feR instanceof AbstractC18226feR.TaskDescription) {
                    C18254fet c18254fet = this.this$0;
                    AbstractC18226feR.TaskDescription taskDescription = (AbstractC18226feR.TaskDescription) abstractC18226feR;
                    int i = ActionBar.copydefault[taskDescription.AEQbTJ().ordinal()];
                    if (i == 1) {
                        registerResultType = RegisterResultType.TYPE_REGION_NOT_SUPPORTED;
                    } else if (i == 2) {
                        registerResultType = RegisterResultType.TYPE_REGISTER_SUCCESS;
                    } else {
                        registerResultType = RegisterResultType.TYPE_REGISTER_FAIL;
                    }
                    c18254fet.copydefault(registerResultType, taskDescription.OLrzqt(), true);
                } else if (abstractC18226feR instanceof AbstractC18226feR.Activity) {
                    this.this$0.copydefault(RegisterResultType.TYPE_REGISTER_FAIL, false, true);
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
            SharedFlow<AbstractC18226feR> sharedFlowAuCTel = this.this$0.getFieldNames().AuCTel();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowAuCTel, anonymousClass1, this) == objCopydefault) {
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
