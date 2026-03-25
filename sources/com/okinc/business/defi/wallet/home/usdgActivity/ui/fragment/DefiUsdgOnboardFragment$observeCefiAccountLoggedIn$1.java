package com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment;

import android.view.View;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC12782ctV;
import o.AbstractC18226feR;
import o.C13754dXa;
import o.C18254fet;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18254fet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1(C18254fet c18254fet, Continuation<? super DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1> continuation) {
        super(2, continuation);
        this.this$0 = c18254fet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC18226feR.ActionBar, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18254fet this$0;

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
        public final Object invoke(AbstractC18226feR.ActionBar actionBar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (((AbstractC18226feR.ActionBar) this.L$0).EZpvd()) {
                    this.this$0.getFieldNames().gEmmrt();
                } else {
                    final C18254fet c18254fet = this.this$0;
                    c18254fet.EZpvd(C13754dXa.FragmentManager.extraCallbackWithResult, new View.OnClickListener() { // from class: o.feN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            DefiUsdgOnboardFragment$observeCefiAccountLoggedIn$1.AnonymousClass1.invokeSuspend$lambda$0(c18254fet, view);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(C18254fet c18254fet, View view) {
            AbstractC12782ctV abstractC12782ctVValueOf = c18254fet.getFieldNames().valueOf();
            c18254fet.OLrzqt(false, abstractC12782ctVValueOf != null ? abstractC12782ctVValueOf.DbNXlk() : null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<AbstractC18226feR.ActionBar> sharedFlowFIwbmz = this.this$0.getFieldNames().fIwbmz();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowFIwbmz, anonymousClass1, this) == objCopydefault) {
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
