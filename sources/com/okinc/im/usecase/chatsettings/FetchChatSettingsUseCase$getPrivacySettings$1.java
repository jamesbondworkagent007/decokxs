package com.okinc.im.usecase.chatsettings;

import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35767oCy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class FetchChatSettingsUseCase$getPrivacySettings$1 extends SuspendLambda implements Function2<FlowCollector<? super Result<? extends ChatSettingsResult>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35767oCy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchChatSettingsUseCase$getPrivacySettings$1(C35767oCy c35767oCy, Continuation<? super FetchChatSettingsUseCase$getPrivacySettings$1> continuation) {
        super(2, continuation);
        this.this$0 = c35767oCy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchChatSettingsUseCase$getPrivacySettings$1 fetchChatSettingsUseCase$getPrivacySettings$1 = new FetchChatSettingsUseCase$getPrivacySettings$1(this.this$0, continuation);
        fetchChatSettingsUseCase$getPrivacySettings$1.L$0 = obj;
        return fetchChatSettingsUseCase$getPrivacySettings$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends ChatSettingsResult>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Result<ChatSettingsResult>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Result<ChatSettingsResult>> flowCollector, Continuation<? super Unit> continuation) {
        return ((FetchChatSettingsUseCase$getPrivacySettings$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r1 = this.label;
        try {
        } catch (Exception e) {
            Result.Application application = Result.Companion;
            Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
            this.L$0 = null;
            this.label = 3;
            if (r1.emit(resultM7376boximpl, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (r1 == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            CoroutineDispatcher coroutineDispatcher = this.this$0.copydefault;
            FetchChatSettingsUseCase$getPrivacySettings$1$result$1 fetchChatSettingsUseCase$getPrivacySettings$1$result$1 = new FetchChatSettingsUseCase$getPrivacySettings$1$result$1(this.this$0, null);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, fetchChatSettingsUseCase$getPrivacySettings$1$result$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                    C56391yDq.AEQbTJ(obj);
                } else {
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Result.Application application2 = Result.Companion;
        Result resultM7376boximpl2 = Result.m7376boximpl(Result.m7377constructorimpl((ChatSettingsResult) obj));
        this.L$0 = flowCollector;
        this.label = 2;
        if (flowCollector.emit(resultM7376boximpl2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
