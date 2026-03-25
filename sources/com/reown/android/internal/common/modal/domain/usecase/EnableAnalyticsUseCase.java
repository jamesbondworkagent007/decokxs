package com.reown.android.internal.common.modal.domain.usecase;

import com.reown.android.internal.common.modal.AppKitApiRepository;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class EnableAnalyticsUseCase implements EnableAnalyticsUseCaseInterface {
    public final AppKitApiRepository repository;

    public EnableAnalyticsUseCase(@NotNull AppKitApiRepository appKitApiRepository) {
        Intrinsics.checkNotNullParameter(appKitApiRepository, "");
        this.repository = appKitApiRepository;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.modal.domain.usecase.EnableAnalyticsUseCase$fetchAnalyticsConfig$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return EnableAnalyticsUseCase.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM7204getAnalyticsConfiggIAlus$default;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            boolean zBooleanValue = false;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AppKitApiRepository appKitApiRepository = EnableAnalyticsUseCase.this.repository;
                    this.label = 1;
                    objM7204getAnalyticsConfiggIAlus$default = AppKitApiRepository.m7204getAnalyticsConfiggIAlus$default(appKitApiRepository, null, this, 1, null);
                    if (objM7204getAnalyticsConfiggIAlus$default == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7204getAnalyticsConfiggIAlus$default = ((Result) obj).m7386unboximpl();
                }
                if (Result.m7384isSuccessimpl(objM7204getAnalyticsConfiggIAlus$default)) {
                    Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    if (Result.m7383isFailureimpl(objM7204getAnalyticsConfiggIAlus$default)) {
                        objM7204getAnalyticsConfiggIAlus$default = boolKWHzl;
                    }
                    zBooleanValue = ((Boolean) objM7204getAnalyticsConfiggIAlus$default).booleanValue();
                }
            } catch (Exception unused) {
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
    }

    @Override // com.reown.android.internal.common.modal.domain.usecase.EnableAnalyticsUseCaseInterface
    public boolean fetchAnalyticsConfig() {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null)).booleanValue();
    }
}
