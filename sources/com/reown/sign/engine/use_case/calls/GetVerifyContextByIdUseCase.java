package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.verify.model.VerifyContext;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetVerifyContextByIdUseCase implements GetVerifyContextByIdUseCaseInterface {
    public final VerifyContextStorageRepository verifyContextStorageRepository;

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.GetVerifyContextByIdUseCase$getVerifyContext$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetVerifyContextByIdUseCase.this.getVerifyContext(0L, this);
        }
    }

    public GetVerifyContextByIdUseCase(@NotNull VerifyContextStorageRepository verifyContextStorageRepository) {
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        this.verifyContextStorageRepository = verifyContextStorageRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.reown.sign.engine.use_case.calls.GetVerifyContextByIdUseCaseInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getVerifyContext(long j, @NotNull Continuation<? super EngineDO.VerifyContext> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            VerifyContextStorageRepository verifyContextStorageRepository = this.verifyContextStorageRepository;
            anonymousClass1.label = 1;
            obj = verifyContextStorageRepository.get(j, anonymousClass1);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        VerifyContext verifyContext = (VerifyContext) obj;
        if (verifyContext != null) {
            return EngineMapperKt.toEngineDO(verifyContext);
        }
        return null;
    }
}
