package com.okinc.auth.impl.reset2fa.domain.reset2fa;

import com.google.gson.reflect.TypeToken;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaPreconditionResponse;
import com.okinc.auth.impl.reset2fa.data.datasource.Reset2faRemoteDataSource;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import o.C43284rmQ;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.C6623aSo;
import o.C6737aUy;

/* JADX INFO: loaded from: classes3.dex */
public final class Reset2faUseCase$getPreconditionFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super C6623aSo.StateListAnimator>, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubdomainStrategy $subdomainStrategy;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6623aSo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Reset2faUseCase$getPreconditionFlow$1(C6623aSo c6623aSo, SubdomainStrategy subdomainStrategy, Continuation<? super Reset2faUseCase$getPreconditionFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c6623aSo;
        this.$subdomainStrategy = subdomainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Reset2faUseCase$getPreconditionFlow$1 reset2faUseCase$getPreconditionFlow$1 = new Reset2faUseCase$getPreconditionFlow$1(this.this$0, this.$subdomainStrategy, continuation);
        reset2faUseCase$getPreconditionFlow$1.L$0 = obj;
        return reset2faUseCase$getPreconditionFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super C6623aSo.StateListAnimator> flowCollector, Continuation<? super Unit> continuation) {
        return ((Reset2faUseCase$getPreconditionFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x000b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResponseData responseData;
        ?? r1;
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r12 = this.label;
        try {
        } catch (OKServerException e) {
            if (e.getCode() != -1) {
                try {
                    Object objFromJson = C6737aUy.OLrzqt().fromJson(e.getResponse(), TypeToken.getParameterized(ResponseData.class, ResetMfaPreconditionResponse.class).getType());
                    Intrinsics.copydefault(objFromJson);
                    responseData = (ResponseData) objFromJson;
                    r1 = r12;
                } catch (Throwable unused) {
                    Json jsonKWHzl = C43284rmQ.KWHzl();
                    String strValueOf = String.valueOf(e.getResponse());
                    jsonKWHzl.getSerializersModule();
                    responseData = (ResponseData) jsonKWHzl.decodeFromString(ResponseData.Companion.serializer(ResetMfaPreconditionResponse.Companion.serializer()), strValueOf);
                    r1 = r12;
                }
            } else {
                throw e;
            }
        }
        if (r12 == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            C6623aSo.StateListAnimator.Activity activity = C6623aSo.StateListAnimator.Activity.copydefault;
            this.L$0 = flowCollector2;
            this.label = 1;
            if (flowCollector2.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
            flowCollector = flowCollector2;
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    if (r12 != 3 && r12 != 4 && r12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                r12 = flowCollector3;
                responseData = (ResponseData) obj;
                r1 = r12;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    C6623aSo.StateListAnimator.ActionBar actionBar = new C6623aSo.StateListAnimator.ActionBar((ResetMfaPreconditionResponse) responseData.getData());
                    this.L$0 = null;
                    this.label = 3;
                    if (r1.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (responseData.getCode() != 33903) {
                    C6623aSo.StateListAnimator.C0821StateListAnimator c0821StateListAnimator = new C6623aSo.StateListAnimator.C0821StateListAnimator((ResetMfaPreconditionResponse) responseData.getData());
                    this.L$0 = null;
                    this.label = 4;
                    if (r1.emit(c0821StateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    C6623aSo.StateListAnimator.TaskDescription taskDescription = new C6623aSo.StateListAnimator.TaskDescription(C43422row.AEQbTJ((ResponseData<?>) responseData));
                    this.L$0 = null;
                    this.label = 5;
                    if (r1.emit(taskDescription, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector4 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            flowCollector = flowCollector4;
        }
        C6623aSo c6623aSo = this.this$0;
        SubdomainStrategy subdomainStrategy = this.$subdomainStrategy;
        Reset2faRemoteDataSource reset2faRemoteDataSource = c6623aSo.AEQbTJ;
        this.L$0 = flowCollector;
        this.label = 2;
        obj = reset2faRemoteDataSource.precondition(subdomainStrategy, this);
        r12 = flowCollector;
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        responseData = (ResponseData) obj;
        r1 = r12;
        if (responseData.getCode() != 0) {
            if (responseData.getCode() != 33903) {
            }
        }
        return Unit.INSTANCE;
    }
}
