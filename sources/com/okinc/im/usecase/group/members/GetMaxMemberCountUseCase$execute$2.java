package com.okinc.im.usecase.group.members;

import android.os.SystemClock;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44399sOj;
import o.C56391yDq;
import o.C56442yFn;
import o.oDW;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class GetMaxMemberCountUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC44399sOj>, Object> {
    public static int KWHzl;
    public static int copydefault;
    final /* synthetic */ GroupScenarioType $scenarioType;
    final /* synthetic */ GroupServiceType $serviceType;
    int label;
    final /* synthetic */ oDW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMaxMemberCountUseCase$execute$2(oDW odw, GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, Continuation<? super GetMaxMemberCountUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = odw;
        this.$serviceType = groupServiceType;
        this.$scenarioType = groupScenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetMaxMemberCountUseCase$execute$2(this.this$0, this.$serviceType, this.$scenarioType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC44399sOj> continuation) {
        return ((GetMaxMemberCountUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sir = this.this$0.copydefault;
            GroupServiceType groupServiceType = this.$serviceType;
            GroupScenarioType groupScenarioType = this.$scenarioType;
            this.label = 1;
            obj = sir.EZpvd(groupServiceType, groupScenarioType, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    public static int KWHzl() {
        int i = KWHzl;
        int i2 = i % 8211217;
        KWHzl = i + 1;
        if (i2 != 0) {
            return copydefault;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        copydefault = iElapsedRealtime;
        return iElapsedRealtime;
    }
}
