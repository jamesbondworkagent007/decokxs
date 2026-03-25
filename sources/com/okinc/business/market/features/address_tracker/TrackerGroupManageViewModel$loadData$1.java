package com.okinc.business.market.features.address_tracker;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC26239jXb;
import o.jAJ;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerGroupManageViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TrackerGroupManageViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerGroupManageViewModel$loadData$1(TrackerGroupManageViewModel trackerGroupManageViewModel, Continuation<? super TrackerGroupManageViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerGroupManageViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerGroupManageViewModel$loadData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerGroupManageViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jAJ jaj = this.this$0.gEmmrt;
            this.label = 1;
            objKWHzl = jaj.KWHzl(true, this);
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
        TrackerGroupManageViewModel trackerGroupManageViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            List list = (List) objKWHzl;
            if (!(true ^ list.isEmpty())) {
                trackerGroupManageViewModel.OLrzqt.setValue(InterfaceC26239jXb.TaskDescription.KWHzl);
            } else {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(trackerGroupManageViewModel.djBIcL.OLrzqt((CommonGroupData) it.next()));
                }
                trackerGroupManageViewModel.OLrzqt.setValue(new InterfaceC26239jXb.ActionBar(arrayList));
            }
        }
        TrackerGroupManageViewModel trackerGroupManageViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            trackerGroupManageViewModel2.OLrzqt.setValue(InterfaceC26239jXb.Application.AEQbTJ);
        }
        return Unit.INSTANCE;
    }
}
