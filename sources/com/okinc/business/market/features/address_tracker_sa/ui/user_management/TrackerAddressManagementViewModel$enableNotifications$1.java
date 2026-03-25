package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC25772jFu;
import o.C56391yDq;
import o.C56442yFn;
import o.jAG;
import o.jEP;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressManagementViewModel$enableNotifications$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<jEP> $originAddressList;
    int label;
    final /* synthetic */ TrackerAddressManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressManagementViewModel$enableNotifications$1(TrackerAddressManagementViewModel trackerAddressManagementViewModel, List<jEP> list, Continuation<? super TrackerAddressManagementViewModel$enableNotifications$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerAddressManagementViewModel;
        this.$originAddressList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressManagementViewModel$enableNotifications$1(this.this$0, this.$originAddressList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressManagementViewModel$enableNotifications$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jAG jag = this.this$0.fetchVPNInfo;
            this.label = 1;
            objOLrzqt = jag.OLrzqt(this);
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
        TrackerAddressManagementViewModel trackerAddressManagementViewModel = this.this$0;
        List<jEP> list = this.$originAddressList;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            trackerAddressManagementViewModel.values.setValue(new AbstractC25772jFu.Activity(list, false));
        }
        TrackerAddressManagementViewModel trackerAddressManagementViewModel2 = this.this$0;
        List<jEP> list2 = this.$originAddressList;
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
            trackerAddressManagementViewModel2.values.setValue(new AbstractC25772jFu.Activity(list2, true));
        }
        return Unit.INSTANCE;
    }
}
