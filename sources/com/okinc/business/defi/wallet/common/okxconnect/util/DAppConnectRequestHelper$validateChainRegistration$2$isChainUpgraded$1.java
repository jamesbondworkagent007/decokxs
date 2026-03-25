package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C16013ebs;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;

/* JADX INFO: loaded from: classes18.dex */
public final class DAppConnectRequestHelper$validateChainRegistration$2$isChainUpgraded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ AbstractC12782ctV $wallet;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$validateChainRegistration$2$isChainUpgraded$1(C16013ebs c16013ebs, FragmentActivity fragmentActivity, long j, AbstractC12782ctV abstractC12782ctV, FragmentManager fragmentManager, Continuation<? super DAppConnectRequestHelper$validateChainRegistration$2$isChainUpgraded$1> continuation) {
        super(2, continuation);
        this.this$0 = c16013ebs;
        this.$fragmentActivity = fragmentActivity;
        this.$chainId = j;
        this.$wallet = abstractC12782ctV;
        this.$fragmentManager = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$validateChainRegistration$2$isChainUpgraded$1(this.this$0, this.$fragmentActivity, this.$chainId, this.$wallet, this.$fragmentManager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((DAppConnectRequestHelper$validateChainRegistration$2$isChainUpgraded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C16013ebs c16013ebs = this.this$0;
            FragmentActivity fragmentActivity = this.$fragmentActivity;
            long j = this.$chainId;
            AbstractC12782ctV abstractC12782ctV = this.$wallet;
            FragmentManager fragmentManager = this.$fragmentManager;
            this.L$0 = c16013ebs;
            this.L$1 = fragmentActivity;
            this.L$2 = abstractC12782ctV;
            this.L$3 = fragmentManager;
            this.J$0 = j;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl.initCancellability();
            c16013ebs.AhwBna.KWHzl(fragmentActivity, j, abstractC12782ctV.DbNXlk(), fragmentManager, new StateListAnimator(cancellableContinuationImpl));
            obj = cancellableContinuationImpl.getResult();
            if (obj == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    public static final class StateListAnimator implements Function1<Bundle, Unit> {
        public final /* synthetic */ CancellableContinuation<Boolean> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Bundle bundle) {
            OLrzqt(bundle);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Bundle bundle) {
            if (this.EZpvd.isActive()) {
                Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("result")) : null;
                CancellableContinuation<Boolean> cancellableContinuation = this.EZpvd;
                boolean z = numValueOf != null && numValueOf.intValue() == -1;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Boolean.valueOf(z)));
            }
        }
    }
}
