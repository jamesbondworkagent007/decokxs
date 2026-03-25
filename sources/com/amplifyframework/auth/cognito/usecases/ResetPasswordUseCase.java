package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import com.amplifyframework.auth.result.AuthResetPasswordResult;
import com.amplifyframework.auth.result.step.AuthNextResetPasswordStep;
import com.amplifyframework.auth.result.step.AuthResetPasswordStep;
import com.amplifyframework.core.Consumer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.UserIdInt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ResetPasswordUseCase {
    private final String appClientId;
    private final String appClientSecret;
    private final BinaryOperator cognitoIdentityProviderClient;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResetPasswordUseCase.this.execute(null, null, null, null, null, null, this);
        }
    }

    public ResetPasswordUseCase(@NotNull BinaryOperator binaryOperator, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(binaryOperator, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.cognitoIdentityProviderClient = binaryOperator;
        this.appClientId = str;
        this.appClientSecret = str2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x009d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.amplifyframework.core.Consumer] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(@NotNull String str, @NotNull AuthResetPasswordOptions authResetPasswordOptions, String str2, String str3, @NotNull Consumer<AuthResetPasswordResult> consumer, @NotNull Consumer<AuthException> consumer2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ?? r3;
        Consumer<AuthResetPasswordResult> consumer3;
        MainCoroutineDispatcher main;
        AnonymousClass3 anonymousClass3;
        MainCoroutineDispatcher main2;
        AnonymousClass2 anonymousClass2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objWithContext = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r2 = anonymousClass1.label;
        if (r2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            try {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                ResetPasswordUseCase$execute$response$1 resetPasswordUseCase$execute$response$1 = new ResetPasswordUseCase$execute$response$1(this, str, authResetPasswordOptions, str2, str3, null);
                consumer3 = consumer;
                anonymousClass1.L$0 = consumer3;
                r3 = consumer2;
                try {
                    anonymousClass1.L$1 = r3;
                    anonymousClass1.label = 1;
                    objWithContext = BuildersKt.withContext(io2, resetPasswordUseCase$execute$response$1, anonymousClass1);
                    r3 = r3;
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    main2 = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(consumer3, (UserIdInt) objWithContext, null);
                    anonymousClass1.L$0 = r3;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (BuildersKt.withContext(main2, anonymousClass2, anonymousClass1) == objCopydefault) {
                    }
                } catch (Exception e) {
                    e = e;
                    main = Dispatchers.getMain();
                    anonymousClass3 = new AnonymousClass3(r3, e, null);
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (BuildersKt.withContext(main, anonymousClass3, anonymousClass1) == objCopydefault) {
                    }
                }
            } catch (Exception e2) {
                e = e2;
                r3 = consumer2;
                main = Dispatchers.getMain();
                anonymousClass3 = new AnonymousClass3(r3, e, null);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (BuildersKt.withContext(main, anonymousClass3, anonymousClass1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            try {
                if (r2 == 1) {
                    Consumer consumer4 = (Consumer) anonymousClass1.L$1;
                    Consumer<AuthResetPasswordResult> consumer5 = (Consumer) anonymousClass1.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                    r3 = consumer4;
                    consumer3 = consumer5;
                    main2 = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(consumer3, (UserIdInt) objWithContext, null);
                    anonymousClass1.L$0 = r3;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (BuildersKt.withContext(main2, anonymousClass2, anonymousClass1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (r2 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                } else {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objWithContext);
                }
            } catch (Exception e3) {
                e = e3;
                r3 = r2;
                main = Dispatchers.getMain();
                anonymousClass3 = new AnonymousClass3(r3, e, null);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (BuildersKt.withContext(main, anonymousClass3, anonymousClass1) == objCopydefault) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AuthResetPasswordResult> $onSuccess;
        final /* synthetic */ UserIdInt $response;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Consumer<AuthResetPasswordResult> consumer, UserIdInt userIdInt, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onSuccess = consumer;
            this.$response = userIdInt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$onSuccess, this.$response, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$onSuccess.accept(new AuthResetPasswordResult(false, new AuthNextResetPasswordStep(AuthResetPasswordStep.CONFIRM_RESET_PASSWORD_WITH_CODE, C56424yEw.KWHzl(), ResetPasswordUseCaseKt.toAuthCodeDeliveryDetails(this.$response.AEQbTJ()))));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Exception $ex;
        final /* synthetic */ Consumer<AuthException> $onError;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Consumer<AuthException> consumer, Exception exc, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$onError = consumer;
            this.$ex = exc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass3(this.$onError, this.$ex, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(this.$ex, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
