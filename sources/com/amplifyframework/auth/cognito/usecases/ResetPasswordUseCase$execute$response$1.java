package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthResetPasswordOptions;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AccountManagerResponse;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.RestoreDescription;
import o.UserIdInt;
import o.Widget;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ResetPasswordUseCase$execute$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserIdInt>, Object> {
    final /* synthetic */ String $encodedContextData;
    final /* synthetic */ AuthResetPasswordOptions $options;
    final /* synthetic */ String $pinpointEndpointId;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ ResetPasswordUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordUseCase$execute$response$1(ResetPasswordUseCase resetPasswordUseCase, String str, AuthResetPasswordOptions authResetPasswordOptions, String str2, String str3, Continuation<? super ResetPasswordUseCase$execute$response$1> continuation) {
        super(2, continuation);
        this.this$0 = resetPasswordUseCase;
        this.$username = str;
        this.$options = authResetPasswordOptions;
        this.$encodedContextData = str2;
        this.$pinpointEndpointId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new ResetPasswordUseCase$execute$response$1(this.this$0, this.$username, this.$options, this.$encodedContextData, this.$pinpointEndpointId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super UserIdInt> continuation) {
        return ((ResetPasswordUseCase$execute$response$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Map<String, String> mapKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BinaryOperator binaryOperator = this.this$0.cognitoIdentityProviderClient;
            String str = this.$username;
            AuthResetPasswordOptions authResetPasswordOptions = this.$options;
            ResetPasswordUseCase resetPasswordUseCase = this.this$0;
            final String str2 = this.$encodedContextData;
            final String str3 = this.$pinpointEndpointId;
            Widget.ActionBar actionBar = new Widget.ActionBar();
            actionBar.KWHzl(str);
            AWSCognitoAuthResetPasswordOptions aWSCognitoAuthResetPasswordOptions = authResetPasswordOptions instanceof AWSCognitoAuthResetPasswordOptions ? (AWSCognitoAuthResetPasswordOptions) authResetPasswordOptions : null;
            if (aWSCognitoAuthResetPasswordOptions == null || (mapKWHzl = aWSCognitoAuthResetPasswordOptions.getMetadata()) == null) {
                mapKWHzl = C56424yEw.KWHzl();
            }
            actionBar.OLrzqt(mapKWHzl);
            actionBar.copydefault(resetPasswordUseCase.appClientId);
            actionBar.AEQbTJ(AuthHelper.Companion.getSecretHash(str, resetPasswordUseCase.appClientId, resetPasswordUseCase.appClientSecret));
            if (str2 != null) {
                actionBar.KWHzl(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$response$1$1$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(RestoreDescription.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull RestoreDescription.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                        application.copydefault(str2);
                    }
                });
            }
            if (str3 != null) {
                actionBar.EZpvd(AccountManagerResponse.OLrzqt.OLrzqt(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$response$1$1$2$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AccountManagerResponse.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AccountManagerResponse.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                        application.OLrzqt(str3);
                    }
                }));
            }
            Widget widgetKWHzl = actionBar.KWHzl();
            this.label = 1;
            obj = binaryOperator.EZpvd(widgetKWHzl, this);
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
}
