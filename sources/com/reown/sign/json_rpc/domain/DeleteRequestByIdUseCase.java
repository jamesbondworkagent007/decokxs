package com.reown.sign.json_rpc.domain;

import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class DeleteRequestByIdUseCase {
    public final JsonRpcHistory jsonRpcHistory;
    public final VerifyContextStorageRepository verifyContextStorageRepository;

    public DeleteRequestByIdUseCase(@NotNull JsonRpcHistory jsonRpcHistory, @NotNull VerifyContextStorageRepository verifyContextStorageRepository) {
        Intrinsics.checkNotNullParameter(jsonRpcHistory, "");
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        this.jsonRpcHistory = jsonRpcHistory;
        this.verifyContextStorageRepository = verifyContextStorageRepository;
    }

    /* JADX INFO: renamed from: com.reown.sign.json_rpc.domain.DeleteRequestByIdUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ long $id;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$id = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return DeleteRequestByIdUseCase.this.new AnonymousClass2(this.$id, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                DeleteRequestByIdUseCase.this.jsonRpcHistory.deleteRecordById(this.$id);
                VerifyContextStorageRepository verifyContextStorageRepository = DeleteRequestByIdUseCase.this.verifyContextStorageRepository;
                long j = this.$id;
                this.label = 1;
                if (verifyContextStorageRepository.delete(j, this) == objCopydefault) {
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

    public final Object invoke(long j, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(j, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
