package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC25769jFr;
import o.C23274hvD;
import o.C25749jEy;
import o.C28586kda;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressManagementBaseViewModel$loadGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC25769jFr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressManagementBaseViewModel$loadGroup$1(AbstractC25769jFr abstractC25769jFr, Continuation<? super TrackerAddressManagementBaseViewModel$loadGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC25769jFr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressManagementBaseViewModel$loadGroup$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressManagementBaseViewModel$loadGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objM7386unboximpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kdaOLrzqt = this.this$0.OLrzqt();
            this.label = 1;
            objOLrzqt = c28586kdaOLrzqt.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                AbstractC25769jFr abstractC25769jFr = this.this$0;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    List<TrackerAddressGroupUIModel> listDjBIcL = (List) objM7386unboximpl;
                    if (listDjBIcL.size() > 1) {
                        listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) C56402yEa.EZpvd(new TrackerAddressGroupUIModel(-1, null, C23274hvD.Fragment.KWHzl, 0, 0, 0, false, false, 250, null)), (Iterable) listDjBIcL);
                    }
                    abstractC25769jFr.AhwBna().setValue(listDjBIcL);
                    abstractC25769jFr.AEQbTJ(listDjBIcL);
                }
                AbstractC25769jFr abstractC25769jFr2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("TrackerAddressManagementBaseViewModel", "Failed to load Group", thM7380exceptionOrNullimpl);
                    abstractC25769jFr2.KWHzl(thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        C25749jEy c25749jEyAEQbTJ = this.this$0.AEQbTJ();
        String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
        this.label = 2;
        Object objOLrzqt2 = c25749jEyAEQbTJ.OLrzqt(strEZpvd, this);
        if (objOLrzqt2 == objCopydefault) {
            return objCopydefault;
        }
        objM7386unboximpl = objOLrzqt2;
        AbstractC25769jFr abstractC25769jFr3 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
        }
        AbstractC25769jFr abstractC25769jFr22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
