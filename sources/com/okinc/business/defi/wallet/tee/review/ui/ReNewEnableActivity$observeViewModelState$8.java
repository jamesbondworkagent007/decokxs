package com.okinc.business.defi.wallet.tee.review.ui;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC14702dqT;
import o.C13754dXa;
import o.C14703dqU;
import o.C33070mpX;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.dTQ;
import o.fVE;
import o.fVU;
import o.fWX;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableActivity$observeViewModelState$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableActivity$observeViewModelState$8(fVU fvu, Continuation<? super ReNewEnableActivity$observeViewModelState$8> continuation) {
        super(2, continuation);
        this.this$0 = fvu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableActivity$observeViewModelState$8(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableActivity$observeViewModelState$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$8$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<fWX, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fWX fwx, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(fwx, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            dTQ dtq;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                fWX fwx = (fWX) this.L$0;
                this.this$0.dismissLoadingWithLogo();
                if (fwx != null) {
                    fVU fvu = this.this$0;
                    if (fwx.OLrzqt()) {
                        if (fvu.KWHzl() && (dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class)) != null && dtq.OLrzqt(fvu.djBIcL)) {
                            AbstractC14702dqT abstractC14702dqTKWHzl = C14703dqU.Companion.KWHzl();
                            abstractC14702dqTKWHzl.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivityExternalSyntheticLambda2));
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC14702dqTKWHzl), null, null, new ReNewEnableActivity$observeViewModelState$8$1$1$1$1(abstractC14702dqTKWHzl, fwx, fvu, null), 3, null);
                            FragmentManager supportFragmentManager = fvu.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                            abstractC14702dqTKWHzl.show(supportFragmentManager, "DefiCreateWalletLoadingDFragment");
                        } else {
                            fvu.setResult(-1);
                            fvu.finish();
                            fVE.Companion.EZpvd().EZpvd(fwx);
                        }
                    } else if (fwx.AYXKKw()) {
                        fvu.gEmmrt().fJNWhG();
                        fVE.Companion.EZpvd().EZpvd(fwx);
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
            StateFlow<fWX> stateFlowValues = this.this$0.gEmmrt().values();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowValues, anonymousClass1, this) == objCopydefault) {
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
