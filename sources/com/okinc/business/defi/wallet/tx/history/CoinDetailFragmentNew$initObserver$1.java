package com.okinc.business.defi.wallet.tx.history;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$initObserver$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC12782ctV;
import o.AbstractC16521elW;
import o.C19465gDj;
import o.C55251xgS;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.InterfaceC9738bbJ;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class CoinDetailFragmentNew$initObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CoinDetailFragmentNew this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailFragmentNew$initObserver$1(CoinDetailFragmentNew coinDetailFragmentNew, Continuation<? super CoinDetailFragmentNew$initObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = coinDetailFragmentNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailFragmentNew$initObserver$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailFragmentNew$initObserver$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$initObserver$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ CoinDetailFragmentNew this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CoinDetailFragmentNew coinDetailFragmentNew, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = coinDetailFragmentNew;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                AbstractC16521elW abstractC16521elW = this.this$0.AYXKKw;
                AbstractC16521elW abstractC16521elW2 = null;
                if (abstractC16521elW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW = null;
                }
                abstractC16521elW.hDKMBd.setVisibility(z ? 0 : 8);
                if (z) {
                    AbstractC16521elW abstractC16521elW3 = this.this$0.AYXKKw;
                    if (abstractC16521elW3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16521elW2 = abstractC16521elW3;
                    }
                    C19465gDj c19465gDjAEQbTJ = abstractC16521elW2.AEQbTJ();
                    if (c19465gDjAEQbTJ != null) {
                        final CoinDetailFragmentNew coinDetailFragmentNew = this.this$0;
                        c19465gDjAEQbTJ.EZpvd(false, new Function1() { // from class: o.gAq
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return CoinDetailFragmentNew$initObserver$1.AnonymousClass1.invokeSuspend$lambda$0(coinDetailFragmentNew, (AbstractC12782ctV) obj2);
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CoinDetailFragmentNew coinDetailFragmentNew, AbstractC12782ctV abstractC12782ctV) {
            ChainAddress chainAddress;
            ChainAddress chainAddress2;
            String address = (abstractC12782ctV == null || (chainAddress2 = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, 0L, null, 2, null)) == null) ? null : chainAddress2.getAddress();
            AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            pUU.copydefault("fcj wallet address is " + address + " " + (c19465gDjAEQbTJ != null ? c19465gDjAEQbTJ.AYXKKw() : null));
            AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW2 = null;
            }
            C55251xgS c55251xgS = abstractC16521elW2.iwGUEr;
            String address2 = (abstractC12782ctV == null || (chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, 0L, null, 2, null)) == null) ? null : chainAddress.getAddress();
            AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW3.AEQbTJ();
            c55251xgS.setVisibility(!C59449zhJ.equals$default(address2, c19465gDjAEQbTJ2 != null ? c19465gDjAEQbTJ2.AYXKKw() : null, false, 2, null) ? 4 : 0);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Boolean> stateFlowAEQbTJ = this.this$0.sSMYrx().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
