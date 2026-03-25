package com.okinc.business.defi.wallet.custom;

import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC12782ctV;
import o.C10614brl;
import o.C16083edI;
import o.C16084edJ;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ChooseCustomNetworkFragment$observeLiveData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C16084edJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseCustomNetworkFragment$observeLiveData$1(C16084edJ c16084edJ, Continuation<? super ChooseCustomNetworkFragment$observeLiveData$1> continuation) {
        super(2, continuation);
        this.this$0 = c16084edJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChooseCustomNetworkFragment$observeLiveData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChooseCustomNetworkFragment$observeLiveData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.custom.ChooseCustomNetworkFragment$observeLiveData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Point<? extends AbstractC12782ctV>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C16084edJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C16084edJ c16084edJ, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c16084edJ;
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
        public final Object invoke(Point<? extends AbstractC12782ctV> point, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(point, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Point point = (Point) this.L$0;
                if (!(point instanceof Point.StateListAnimator)) {
                    if (point instanceof Point.Application) {
                        WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(((AbstractC12782ctV) ((Point.Application) point).copydefault()).DbNXlk());
                        C16083edI c16083edI = this.this$0.EZpvd;
                        if (c16083edI != null) {
                            c16083edI.EZpvd(walletSelectedChainBeanKWHzl.getRpcUrl());
                        }
                        C16083edI c16083edI2 = this.this$0.EZpvd;
                        if (c16083edI2 != null) {
                            c16083edI2.AEQbTJ(walletSelectedChainBeanKWHzl.getChainId());
                        }
                        C16083edI c16083edI3 = this.this$0.EZpvd;
                        if (c16083edI3 != null) {
                            c16083edI3.notifyDataSetChanged();
                        }
                    } else if (point instanceof Point.TaskDescription) {
                        String strEZpvd = ((Point.TaskDescription) point).EZpvd();
                        if (strEZpvd == null) {
                            strEZpvd = "";
                        }
                        pUU.copydefault("fetchMainWallet failed", strEZpvd);
                    } else if (point != null) {
                        throw new NoWhenBranchMatchedException();
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
            StateFlow<Point<AbstractC12782ctV>> stateFlowEZpvd = this.this$0.KWHzl().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
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
