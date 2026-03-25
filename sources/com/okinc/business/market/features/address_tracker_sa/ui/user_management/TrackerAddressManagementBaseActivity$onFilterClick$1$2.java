package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import com.okinc.business.dexlogic.track.DexTrackEventParameter;
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
import o.jBN;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressManagementBaseActivity$onFilterClick$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FilterAction $action;
    final /* synthetic */ TokenFilter $newFilter;
    int label;
    final /* synthetic */ AbstractActivityC25766jFo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressManagementBaseActivity$onFilterClick$1$2(FilterAction filterAction, AbstractActivityC25766jFo abstractActivityC25766jFo, TokenFilter tokenFilter, Continuation<? super TrackerAddressManagementBaseActivity$onFilterClick$1$2> continuation) {
        super(2, continuation);
        this.$action = filterAction;
        this.this$0 = abstractActivityC25766jFo;
        this.$newFilter = tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressManagementBaseActivity$onFilterClick$1$2(this.$action, this.this$0, this.$newFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressManagementBaseActivity$onFilterClick$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FilterAction filterAction = this.$action;
            if (filterAction instanceof FilterAction.Create) {
                AbstractC25769jFr abstractC25769jFrAYXKKw = this.this$0.AYXKKw();
                String strCopydefault = ((FilterAction.Create) this.$action).copydefault();
                this.label = 1;
                objCopydefault = abstractC25769jFrAYXKKw.copydefault(strCopydefault, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                if (!Result.m7384isSuccessimpl(objCopydefault)) {
                }
            } else if (filterAction instanceof FilterAction.Update) {
                AbstractC25769jFr abstractC25769jFrAYXKKw2 = this.this$0.AYXKKw();
                TokenFilter tokenFilter = this.$newFilter;
                String strEZpvd = ((FilterAction.Update) this.$action).EZpvd();
                List<AddressTrackerUserAction> listKWHzl = this.this$0.KWHzl(this.$newFilter.DbNXlk());
                this.label = 2;
                objKWHzl = abstractC25769jFrAYXKKw2.KWHzl(tokenFilter, true, strEZpvd, listKWHzl, this);
                if (objKWHzl == objCopydefault2) {
                    return objCopydefault2;
                }
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                }
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.APPLY_EDIT_ALERT);
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
            if (!Result.m7384isSuccessimpl(objCopydefault)) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.WFXFk), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (Integer) null, 0, 0, 60, (Object) null);
                this.this$0.AYXKKw().KWHzl(false);
            } else {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.OfWYUE), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            if (Result.m7384isSuccessimpl(objKWHzl)) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.FdcJU), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (Integer) null, 0, 0, 60, (Object) null);
                this.this$0.AYXKKw().KWHzl(false);
            }
            jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.APPLY_EDIT_ALERT);
        }
        return Unit.INSTANCE;
    }
}
