package com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC25769jFr;
import o.C23274hvD;
import o.C33070mpX;
import o.C52761wXj;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.jFP;

/* JADX INFO: loaded from: classes15.dex */
public final class TrackerManageAddressGroupActivity$handleUnfollowClick$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jFP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerManageAddressGroupActivity$handleUnfollowClick$1$1$1(jFP jfp, Continuation<? super TrackerManageAddressGroupActivity$handleUnfollowClick$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = jfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerManageAddressGroupActivity$handleUnfollowClick$1$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerManageAddressGroupActivity$handleUnfollowClick$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModelAhwBna = this.this$0.AhwBna();
            boolean z = this.this$0.valueOf;
            this.label = 1;
            objOLrzqt = trackerManageAddressGroupViewModelAhwBna.OLrzqt(z, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.isAttachedToWindow), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (Integer) null, 0, 0, 60, (Object) null);
            AbstractC25769jFr.loadAddresses$default(this.this$0.AhwBna(), false, 1, null);
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.Api26Impl), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
