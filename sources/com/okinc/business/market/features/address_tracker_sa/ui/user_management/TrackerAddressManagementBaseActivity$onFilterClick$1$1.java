package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.FilterAction;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC25766jFo;
import o.AbstractC25769jFr;
import o.C23274hvD;
import o.C33070mpX;
import o.C52761wXj;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressManagementBaseActivity$onFilterClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FilterAction $action;
    final /* synthetic */ TokenFilter $newFilter;
    int label;
    final /* synthetic */ AbstractActivityC25766jFo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressManagementBaseActivity$onFilterClick$1$1(AbstractActivityC25766jFo abstractActivityC25766jFo, TokenFilter tokenFilter, FilterAction filterAction, Continuation<? super TrackerAddressManagementBaseActivity$onFilterClick$1$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractActivityC25766jFo;
        this.$newFilter = tokenFilter;
        this.$action = filterAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressManagementBaseActivity$onFilterClick$1$1(this.this$0, this.$newFilter, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressManagementBaseActivity$onFilterClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC25769jFr abstractC25769jFrAYXKKw = this.this$0.AYXKKw();
            TokenFilter tokenFilter = this.$newFilter;
            String strKWHzl = ((FilterAction.Delete) this.$action).KWHzl();
            List<AddressTrackerUserAction> listKWHzl = this.this$0.KWHzl(this.$newFilter.DbNXlk());
            this.label = 1;
            objKWHzl = abstractC25769jFrAYXKKw.KWHzl(tokenFilter, false, strKWHzl, listKWHzl, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.component1), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (Integer) null, 0, 0, 60, (Object) null);
            this.this$0.AYXKKw().KWHzl(false);
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.shErWi), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
