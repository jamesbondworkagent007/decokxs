package com.reown.sign.engine.domain;

import com.reown.android.internal.common.model.Validation;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.verify.model.VerifyContext;
import com.reown.sign.engine.SessionRequestQueueKt;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.utils.UtilFunctionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignEngine$propagatePendingSessionRequestsQueue$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ EngineDO.SessionRequest $sessionRequest;
    public int label;
    public final /* synthetic */ SignEngine this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignEngine$propagatePendingSessionRequestsQueue$1$4$1(SignEngine signEngine, EngineDO.SessionRequest sessionRequest, Continuation<? super SignEngine$propagatePendingSessionRequestsQueue$1$4$1> continuation) {
        super(2, continuation);
        this.this$0 = signEngine;
        this.$sessionRequest = sessionRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new SignEngine$propagatePendingSessionRequestsQueue$1$4$1(this.this$0, this.$sessionRequest, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignEngine$propagatePendingSessionRequestsQueue$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$propagatePendingSessionRequestsQueue$1$4$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ EngineDO.SessionRequest $sessionRequest;
        public int label;
        public final /* synthetic */ SignEngine this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SignEngine signEngine, EngineDO.SessionRequest sessionRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = signEngine;
            this.$sessionRequest = sessionRequest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$sessionRequest, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                VerifyContextStorageRepository verifyContextStorageRepository = this.this$0.verifyContextStorageRepository;
                long id = this.$sessionRequest.getRequest().getId();
                this.label = 1;
                obj = verifyContextStorageRepository.get(id, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            VerifyContext verifyContext = (VerifyContext) obj;
            if (verifyContext == null) {
                long id2 = this.$sessionRequest.getRequest().getId();
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                verifyContext = new VerifyContext(id2, UtilFunctionsKt.getEmpty(c56529yIt), Validation.UNKNOWN, UtilFunctionsKt.getEmpty(c56529yIt), null);
            }
            SessionRequestQueueKt.getSessionRequestEventsQueue().add(new EngineDO.SessionRequestEvent(this.$sessionRequest, EngineMapperKt.toEngineDO(verifyContext)));
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$sessionRequest, null);
            this.label = 1;
            if (SupervisorKt.supervisorScope(anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
