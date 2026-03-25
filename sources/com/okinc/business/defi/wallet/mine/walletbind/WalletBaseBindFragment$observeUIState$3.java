package com.okinc.business.defi.wallet.mine.walletbind;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$3;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC19318fyy;
import o.C32866mlf;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.rTU;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletBaseBindFragment$observeUIState$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC19318fyy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBaseBindFragment$observeUIState$3(AbstractC19318fyy abstractC19318fyy, Continuation<? super WalletBaseBindFragment$observeUIState$3> continuation) {
        super(2, continuation);
        this.this$0 = abstractC19318fyy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBaseBindFragment$observeUIState$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBaseBindFragment$observeUIState$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AbstractC19318fyy this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC19318fyy abstractC19318fyy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = abstractC19318fyy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C32866mlf.onEvent$default("LinkedAccount_NoKyc_KycVerify_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                rTU rtu = (rTU) C43248rlh.KWHzl.AEQbTJ(rTU.class);
                FragmentActivity activity = this.this$0.getActivity();
                if (activity == null) {
                    return Unit.INSTANCE;
                }
                rTU.Application.checkAndRestrictsDistributary$default(rtu, activity, null, null, new Function1() { // from class: o.fyQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletBaseBindFragment$observeUIState$3.AnonymousClass1.invokeSuspend$lambda$1(((java.lang.Integer) obj2).intValue());
                    }
                }, null, new Function1() { // from class: o.fyT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletBaseBindFragment$observeUIState$3.AnonymousClass1.invokeSuspend$lambda$3((ResultBackStatus) obj2);
                    }
                }, 22, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(int i) {
            C32866mlf.onEvent$default("LinkedAccount_NoKyc_KycVerify_Click", (TrackChannel[]) null, new Function1() { // from class: o.fyO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletBaseBindFragment$observeUIState$3.AnonymousClass1.invokeSuspend$lambda$1$lambda$0((EventParamsList) obj);
                }
            }, 1, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(EventParamsList eventParamsList) {
            eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(ResultBackStatus resultBackStatus) {
            final String str = resultBackStatus == ResultBackStatus.Success ? "verify_now" : "back";
            C32866mlf.onEvent$default("LinkedAccount_NoKyc_KycVerify_Click", (TrackChannel[]) null, new Function1() { // from class: o.fyN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletBaseBindFragment$observeUIState$3.AnonymousClass1.invokeSuspend$lambda$3$lambda$2(str, (EventParamsList) obj);
                }
            }, 1, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$lambda$2(String str, EventParamsList eventParamsList) {
            eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<Unit> sharedFlowDjBIcL = this.this$0.values().djBIcL();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Flow flowFlowWithLifecycle$default = FlowExtKt.flowWithLifecycle$default(sharedFlowDjBIcL, lifecycle, null, 2, null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFlowWithLifecycle$default, anonymousClass1, this) == objCopydefault) {
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
