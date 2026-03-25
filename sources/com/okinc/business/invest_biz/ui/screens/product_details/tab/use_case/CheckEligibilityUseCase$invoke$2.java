package com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case;

import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C26536jeF;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26557jea;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes6.dex */
public final class CheckEligibilityUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC26557jea>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ boolean $fromUserAction;
    final /* synthetic */ ProductDetailsByChain $params;
    int label;
    final /* synthetic */ C26536jeF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckEligibilityUseCase$invoke$2(C26536jeF c26536jeF, ProductDetailsByChain productDetailsByChain, long j, boolean z, Continuation<? super CheckEligibilityUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = c26536jeF;
        this.$params = productDetailsByChain;
        this.$chainId = j;
        this.$fromUserAction = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheckEligibilityUseCase$invoke$2(this.this$0, this.$params, this.$chainId, this.$fromUserAction, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InterfaceC26557jea> continuation) {
        return ((CheckEligibilityUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.KWHzl.OLrzqt() != null) {
                if (this.this$0.KWHzl.AhwBna()) {
                    AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtEZpvd = this.this$0.KWHzl.EZpvd();
                    this.label = 1;
                    obj = RxAwaitKt.await(abstractC58260yxtEZpvd, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    return new InterfaceC26557jea.FragmentManager(this.$params.AEQbTJ());
                }
            } else {
                return InterfaceC26557jea.ActionBar.AEQbTJ;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        if (!interfaceC9738bbJ.zLjUOn()) {
            Intrinsics.copydefault(interfaceC9738bbJ);
            return new InterfaceC26557jea.Activity(interfaceC9738bbJ);
        }
        if (!interfaceC9738bbJ.AkhnZx(this.$chainId)) {
            if (this.$fromUserAction) {
                return new InterfaceC26557jea.Fragment(interfaceC9738bbJ.getNewProxyInstance(), this.$params.AEQbTJ());
            }
            return InterfaceC26557jea.TaskDescription.copydefault;
        }
        if (interfaceC9738bbJ.EZpvd(this.$chainId).length() == 0) {
            return new InterfaceC26557jea.Dialog(this.$chainId);
        }
        if (!interfaceC9738bbJ.djSkpj() || !interfaceC9738bbJ.gEmmrt(this.$chainId)) {
            return new InterfaceC26557jea.Application(interfaceC9738bbJ.gHZMYf(), this.$params.AEQbTJ());
        }
        return InterfaceC26557jea.StateListAnimator.AEQbTJ;
    }
}
