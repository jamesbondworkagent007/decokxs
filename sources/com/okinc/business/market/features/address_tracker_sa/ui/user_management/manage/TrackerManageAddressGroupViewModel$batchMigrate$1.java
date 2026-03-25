package com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C25749jEy;
import o.C28586kda;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.jFL;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerManageAddressGroupViewModel$batchMigrate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Long> $targetGroupIdList;
    Object L$0;
    int label;
    final /* synthetic */ TrackerManageAddressGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerManageAddressGroupViewModel$batchMigrate$1(TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel, List<Long> list, Continuation<? super TrackerManageAddressGroupViewModel$batchMigrate$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerManageAddressGroupViewModel;
        this.$targetGroupIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerManageAddressGroupViewModel$batchMigrate$1(this.this$0, this.$targetGroupIdList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerManageAddressGroupViewModel$batchMigrate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<String> arrayList;
        Object objOLrzqt;
        Object objEZpvd;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<jFL> listDbNXlk = this.this$0.DbNXlk();
            arrayList = new ArrayList<>(C56403yEb.AYXKKw(listDbNXlk, 10));
            Iterator<T> it = listDbNXlk.iterator();
            while (it.hasNext()) {
                arrayList.add(((jFL) it.next()).OLrzqt());
            }
            C28586kda c28586kdaOLrzqt = this.this$0.OLrzqt();
            this.L$0 = arrayList;
            this.label = 1;
            objOLrzqt = c28586kdaOLrzqt.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                        MutableSharedFlow mutableSharedFlow = trackerManageAddressGroupViewModel.DbNXlk;
                        Integer numAEQbTJ = C56443yFo.AEQbTJ(-1);
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow.emit(numAEQbTJ, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                obj2 = objEZpvd;
                TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel2 = this.this$0;
                List<Long> list = this.$targetGroupIdList;
                if (Result.m7384isSuccessimpl(obj2)) {
                    ((Number) obj2).intValue();
                    MutableSharedFlow mutableSharedFlow2 = trackerManageAddressGroupViewModel2.DbNXlk;
                    Integer numAEQbTJ2 = C56443yFo.AEQbTJ(list.size());
                    this.L$0 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow2.emit(numAEQbTJ2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel3 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                }
                return Unit.INSTANCE;
            }
            arrayList = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        List<String> list2 = arrayList;
        C56391yDq.AEQbTJ(objOLrzqt);
        String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
        C25749jEy c25749jEyAEQbTJ = this.this$0.AEQbTJ();
        long jEZpvd = this.this$0.EZpvd();
        List<Long> list3 = this.$targetGroupIdList;
        this.L$0 = null;
        this.label = 2;
        objEZpvd = c25749jEyAEQbTJ.EZpvd(strEZpvd, list2, jEZpvd, list3, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        obj2 = objEZpvd;
        TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel22 = this.this$0;
        List<Long> list4 = this.$targetGroupIdList;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModel32 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(obj2) != null) {
        }
        return Unit.INSTANCE;
    }
}
