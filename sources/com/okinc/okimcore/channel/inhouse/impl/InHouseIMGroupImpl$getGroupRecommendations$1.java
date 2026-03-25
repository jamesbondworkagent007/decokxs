package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.GroupRecommendationResponse;
import com.okinc.okimcore.model.remote.GroupRecommendations;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C44124sEe;
import o.C44127sEh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44256sJb;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMGroupImpl$getGroupRecommendations$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends GroupRecommendations>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $excludePaidGroups;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44127sEh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMGroupImpl$getGroupRecommendations$1(C44127sEh c44127sEh, Boolean bool, Continuation<? super InHouseIMGroupImpl$getGroupRecommendations$1> continuation) {
        super(2, continuation);
        this.this$0 = c44127sEh;
        this.$excludePaidGroups = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMGroupImpl$getGroupRecommendations$1 inHouseIMGroupImpl$getGroupRecommendations$1 = new InHouseIMGroupImpl$getGroupRecommendations$1(this.this$0, this.$excludePaidGroups, continuation);
        inHouseIMGroupImpl$getGroupRecommendations$1.L$0 = obj;
        return inHouseIMGroupImpl$getGroupRecommendations$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends GroupRecommendations>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<GroupRecommendations>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<GroupRecommendations>> flowCollector, Continuation<? super Unit> continuation) {
        return ((InHouseIMGroupImpl$getGroupRecommendations$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0009 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ?? r1;
        List<GroupRecommendations> listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r12 = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            r1 = r12;
        }
        if (r12 == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            C44127sEh c44127sEh = this.this$0;
            Boolean bool = this.$excludePaidGroups;
            Result.Application application2 = Result.Companion;
            InterfaceC44256sJb interfaceC44256sJb = c44127sEh.valueOf;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = interfaceC44256sJb.copydefault(bool, this);
            r12 = flowCollector;
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2 && r12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r12 = flowCollector2;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) obj);
        r1 = r12;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            GroupRecommendationResponse groupRecommendationResponse = (GroupRecommendationResponse) ((ResponseData) objM7377constructorimpl).getData();
            if (groupRecommendationResponse == null || (listAhwBna = groupRecommendationResponse.getGroupInfoList()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            this.L$0 = null;
            this.label = 2;
            if (r1.emit(listAhwBna, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            C44124sEe.AYXKKw("Failed to get group recommendations", thM7380exceptionOrNullimpl);
            List listAhwBna2 = yDY.AhwBna();
            this.L$0 = null;
            this.label = 3;
            if (r1.emit(listAhwBna2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
