package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25642jAz;
import o.C56391yDq;
import o.C56442yFn;
import o.jAB;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressManagementViewModel$followAddress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C25642jAz> $addressWithAlias;
    final /* synthetic */ int $groupId;
    final /* synthetic */ Function0<Unit> $onFailure;
    final /* synthetic */ Function0<Unit> $onSuccess;
    int label;
    final /* synthetic */ TrackerAddressManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerAddressManagementViewModel$followAddress$1(TrackerAddressManagementViewModel trackerAddressManagementViewModel, int i, List<C25642jAz> list, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super TrackerAddressManagementViewModel$followAddress$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerAddressManagementViewModel;
        this.$groupId = i;
        this.$addressWithAlias = list;
        this.$onFailure = function0;
        this.$onSuccess = function02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerAddressManagementViewModel$followAddress$1(this.this$0, this.$groupId, this.$addressWithAlias, this.$onFailure, this.$onSuccess, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerAddressManagementViewModel$followAddress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jAB jab = this.this$0.DbNXlk;
            int i2 = this.$groupId;
            List<C25642jAz> list = this.$addressWithAlias;
            this.label = 1;
            objEZpvd = jab.EZpvd(i2, list, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            Function0<Unit> function0 = this.$onFailure;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
        Function0<Unit> function02 = this.$onSuccess;
        if (function02 != null) {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }
}
