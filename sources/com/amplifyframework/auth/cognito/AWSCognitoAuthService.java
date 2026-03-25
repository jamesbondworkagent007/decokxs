package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.codegen.data.AuthConfiguration;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BinaryOperator;
import o.C57631ym;
import o.Character;
import o.IntToLongFunction;
import o.InterfaceC5037Ch;
import o.InterfaceC5039Cj;
import o.InterfaceC54725xT;
import o.InterfaceC54833xX;
import o.InterfaceC54860xY;
import o.InterfaceC54887xZ;
import o.InterfaceC56995ya;
import o.Predicate;
import o.UncheckedIOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AWSCognitoAuthService {
    public static final Companion Companion = Companion.$$INSTANCE;

    Character getCognitoIdentityClient();

    BinaryOperator getCognitoIdentityProviderClient();

    Map<String, String> getCustomUserAgentPairs();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AWSCognitoAuthService fromConfiguration$aws_auth_cognito_release(@NotNull AuthConfiguration authConfiguration) {
            Intrinsics.checkNotNullParameter(authConfiguration, "");
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            final UserPoolConfiguration userPool = authConfiguration.getUserPool();
            final BinaryOperator binaryOperatorCopydefault = userPool != null ? BinaryOperator.EZpvd.copydefault(new Function1<BinaryOperator.ActionBar.TaskDescription, Unit>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityProviderClient$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BinaryOperator.ActionBar.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BinaryOperator.ActionBar.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                    taskDescription.OLrzqt(userPool.getRegion());
                    final String endpoint = userPool.getEndpoint();
                    taskDescription.OLrzqt(endpoint != null ? new Predicate() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityProviderClient$1$1$1$1
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
                        @Override // o.InterfaceC57790yp
                        public /* bridge */ /* synthetic */ Object resolveEndpoint(IntToLongFunction intToLongFunction, Continuation continuation) {
                            return resolveEndpoint2(intToLongFunction, (Continuation<? super C57631ym>) continuation);
                        }

                        /* JADX INFO: renamed from: resolveEndpoint, reason: avoid collision after fix types in other method */
                        public final Object resolveEndpoint2(@NotNull IntToLongFunction intToLongFunction, @NotNull Continuation<? super C57631ym> continuation) {
                            return new C57631ym(endpoint);
                        }
                    } : null);
                    List<InterfaceC54725xT<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj>> listFetchVPNInfo = taskDescription.fetchVPNInfo();
                    final Map<String, String> map = linkedHashMap;
                    listFetchVPNInfo.add(new InterfaceC54725xT<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityProviderClient$1$1.2
                        @Override // o.InterfaceC54725xT
                        /* JADX INFO: renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
                        public Object mo5946modifyBeforeAttemptCompletiongIAlus(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Object>> continuation) {
                            return InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        /* JADX INFO: renamed from: modifyBeforeCompletion-gIAlu-s */
                        public Object mo5947modifyBeforeCompletiongIAlus(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Object>> continuation) {
                            return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeDeserialization(@NotNull InterfaceC54833xX<Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX, @NotNull Continuation<? super InterfaceC5039Cj> continuation) {
                            return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX, (Continuation) continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeRetryLoop(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
                            return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ, (Continuation) continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeSigning(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
                            return InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC54887xZ, continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeTransmit(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
                            return InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ, continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterAttempt(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
                            InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterDeserialization(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
                            InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterExecution(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
                            InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterSerialization(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.AEQbTJ(this, interfaceC54887xZ);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterSigning(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.EZpvd(this, interfaceC54887xZ);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterTransmit(@NotNull InterfaceC54833xX<Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
                            InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeAttempt(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeDeserialization(@NotNull InterfaceC54833xX<Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
                            InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeExecution(@NotNull InterfaceC56995ya<Object> interfaceC56995ya) {
                            InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeSerialization(@NotNull InterfaceC56995ya<Object> interfaceC56995ya) {
                            InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC56995ya);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeSigning(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeTransmit(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.ya<java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>] */
                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeSerialization(@NotNull InterfaceC56995ya<Object> interfaceC56995ya, @NotNull Continuation<? super Object> continuation) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                UncheckedIOException.OLrzqt(interfaceC56995ya.KWHzl()).OLrzqt(entry.getKey(), entry.getValue());
                            }
                            return InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya, continuation);
                        }
                    });
                }
            }) : null;
            final IdentityPoolConfiguration identityPool = authConfiguration.getIdentityPool();
            final Character characterCopydefault = identityPool != null ? Character.OLrzqt.copydefault(new Function1<Character.Activity.TaskDescription, Unit>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityClient$1$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Character.Activity.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Character.Activity.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                    taskDescription.OLrzqt(identityPool.getRegion());
                    List<InterfaceC54725xT<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj>> listIsConnected = taskDescription.isConnected();
                    final Map<String, String> map = linkedHashMap;
                    listIsConnected.add(new InterfaceC54725xT<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj>() { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$cognitoIdentityClient$1$1.1
                        @Override // o.InterfaceC54725xT
                        /* JADX INFO: renamed from: modifyBeforeAttemptCompletion-gIAlu-s, reason: not valid java name */
                        public Object mo5946modifyBeforeAttemptCompletiongIAlus(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Object>> continuation) {
                            return InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        /* JADX INFO: renamed from: modifyBeforeCompletion-gIAlu-s, reason: not valid java name */
                        public Object mo5947modifyBeforeCompletiongIAlus(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends Object>> continuation) {
                            return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeDeserialization(@NotNull InterfaceC54833xX<Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX, @NotNull Continuation<? super InterfaceC5039Cj> continuation) {
                            return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX, (Continuation) continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeRetryLoop(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
                            return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ, (Continuation) continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeSigning(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
                            return InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC54887xZ, continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeTransmit(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
                            return InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ, continuation);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterAttempt(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
                            InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterDeserialization(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
                            InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterExecution(@NotNull InterfaceC54860xY<Object, Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
                            InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterSerialization(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.AEQbTJ(this, interfaceC54887xZ);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterSigning(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.EZpvd(this, interfaceC54887xZ);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readAfterTransmit(@NotNull InterfaceC54833xX<Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
                            InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeAttempt(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeDeserialization(@NotNull InterfaceC54833xX<Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
                            InterfaceC54725xT.StateListAnimator.copydefault((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeExecution(@NotNull InterfaceC56995ya<Object> interfaceC56995ya) {
                            InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeSerialization(@NotNull InterfaceC56995ya<Object> interfaceC56995ya) {
                            InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC56995ya);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeSigning(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
                        }

                        @Override // o.InterfaceC54725xT
                        public void readBeforeTransmit(@NotNull InterfaceC54887xZ<Object, InterfaceC5037Ch> interfaceC54887xZ) {
                            InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.ya<java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>] */
                        @Override // o.InterfaceC54725xT
                        public Object modifyBeforeSerialization(@NotNull InterfaceC56995ya<Object> interfaceC56995ya, @NotNull Continuation<? super Object> continuation) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                UncheckedIOException.OLrzqt(interfaceC56995ya.KWHzl()).OLrzqt(entry.getKey(), entry.getValue());
                            }
                            return InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya, continuation);
                        }
                    });
                }
            }) : null;
            return new AWSCognitoAuthService(binaryOperatorCopydefault, characterCopydefault, linkedHashMap) { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$1
                private final Character cognitoIdentityClient;
                private final BinaryOperator cognitoIdentityProviderClient;
                private final Map<String, String> customUserAgentPairs;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.amplifyframework.auth.cognito.AWSCognitoAuthService
                public Character getCognitoIdentityClient() {
                    return this.cognitoIdentityClient;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.amplifyframework.auth.cognito.AWSCognitoAuthService
                public BinaryOperator getCognitoIdentityProviderClient() {
                    return this.cognitoIdentityProviderClient;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.amplifyframework.auth.cognito.AWSCognitoAuthService
                public Map<String, String> getCustomUserAgentPairs() {
                    return this.customUserAgentPairs;
                }

                {
                    this.cognitoIdentityProviderClient = binaryOperatorCopydefault;
                    this.cognitoIdentityClient = characterCopydefault;
                    this.customUserAgentPairs = linkedHashMap;
                }
            };
        }
    }
}
