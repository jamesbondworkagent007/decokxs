package com.amplifyframework.auth.cognito.actions;

import aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.log.AwsOKLogUtil;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.Character;
import o.IllegalAccessError;
import o.IllegalThreadStateException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ LoginsMapProvider $loginsMap$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[Catch: Exception -> 0x0046, NotAuthorizedException -> 0x0049, TryCatch #4 {NotAuthorizedException -> 0x0049, Exception -> 0x0046, blocks: (B:12:0x0042, B:29:0x00a9, B:36:0x00ba, B:44:0x00f0, B:46:0x00f6, B:47:0x0104, B:48:0x010b, B:38:0x00c0, B:40:0x00cc, B:42:0x00d2), top: B:74:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[Catch: Exception -> 0x0046, NotAuthorizedException -> 0x0049, TryCatch #4 {NotAuthorizedException -> 0x0049, Exception -> 0x0046, blocks: (B:12:0x0042, B:29:0x00a9, B:36:0x00ba, B:44:0x00f0, B:46:0x00f6, B:47:0x0104, B:48:0x010b, B:38:0x00c0, B:40:0x00cc, B:42:0x00d2), top: B:74:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc A[Catch: Exception -> 0x0046, NotAuthorizedException -> 0x0049, TryCatch #4 {NotAuthorizedException -> 0x0049, Exception -> 0x0046, blocks: (B:12:0x0042, B:29:0x00a9, B:36:0x00ba, B:44:0x00f0, B:46:0x00f6, B:47:0x0104, B:48:0x010b, B:38:0x00c0, B:40:0x00cc, B:42:0x00d2), top: B:74:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        final AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        Exception exc;
        EventDispatcher eventDispatcher3;
        NotAuthorizedException notAuthorizedException;
        FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1 fetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1;
        AuthEnvironment authEnvironment2;
        IllegalThreadStateException illegalThreadStateException;
        StateMachineEvent authorizationEvent;
        String strCopydefault;
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
            Intrinsics.copydefault(environment, "");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                IllegalAccessError.ActionBar actionBar = IllegalAccessError.KWHzl;
                final LoginsMapProvider loginsMapProvider = this.$loginsMap$inlined;
                IllegalAccessError illegalAccessErrorAEQbTJ = actionBar.AEQbTJ(new Function1<IllegalAccessError.Activity, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchIdentityAction$1$evt$request$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IllegalAccessError.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull IllegalAccessError.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                        IdentityPoolConfiguration identityPool = authEnvironment.getConfiguration().getIdentityPool();
                        activity.KWHzl(identityPool != null ? identityPool.getPoolId() : null);
                        activity.copydefault(loginsMapProvider.getLogins());
                    }
                });
                Character cognitoIdentityClient = authEnvironment.getCognitoAuthService().getCognitoIdentityClient();
                if (cognitoIdentityClient != null) {
                    anonymousClass1.L$0 = this;
                    eventDispatcher2 = eventDispatcher;
                    try {
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = id;
                        anonymousClass1.L$3 = authEnvironment;
                        anonymousClass1.label = 1;
                        Object objAEQbTJ = cognitoIdentityClient.AEQbTJ(illegalAccessErrorAEQbTJ, anonymousClass1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        authEnvironment2 = authEnvironment;
                        eventDispatcher3 = eventDispatcher2;
                        obj = objAEQbTJ;
                        fetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1 = this;
                        illegalThreadStateException = (IllegalThreadStateException) obj;
                        if (illegalThreadStateException == null) {
                            AwsOKLogUtil awsOKLogUtil = AwsOKLogUtil.INSTANCE;
                            IdentityPoolConfiguration identityPool = authEnvironment2.getConfiguration().getIdentityPool();
                            if (identityPool == null) {
                            }
                            awsOKLogUtil.okLog("getId response=" + illegalThreadStateException + " identityPoolId=" + (identityPool == null ? identityPool.getPoolId() : null));
                            Unit unit = Unit.INSTANCE;
                            if (illegalThreadStateException == null) {
                            }
                            throw new Exception("Fetching identity id failed.");
                        }
                    } catch (NotAuthorizedException e) {
                        e = e;
                        notAuthorizedException = e;
                        eventDispatcher3 = eventDispatcher2;
                        com.amplifyframework.auth.exceptions.NotAuthorizedException notAuthorizedException2 = new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
                        AwsOKLogUtil awsOKLogUtil2 = AwsOKLogUtil.INSTANCE;
                        IdentityPoolConfiguration identityPool2 = authEnvironment.getConfiguration().getIdentityPool();
                        if (identityPool2 != null) {
                        }
                        awsOKLogUtil2.okLog("getId notAuthorized=" + notAuthorizedException2 + " identityPoolId=" + (identityPool2 != null ? identityPool2.getPoolId() : null));
                        authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(notAuthorizedException2), null, 2, null);
                        authEnvironment2 = authEnvironment;
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        eventDispatcher3 = eventDispatcher2;
                        SignedOutException signedOutException = new SignedOutException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE, exc, 1, null);
                        AwsOKLogUtil awsOKLogUtil3 = AwsOKLogUtil.INSTANCE;
                        IdentityPoolConfiguration identityPool3 = authEnvironment.getConfiguration().getIdentityPool();
                        awsOKLogUtil3.okLog("getId e=" + signedOutException + " identityPoolId=" + (identityPool3 == null ? identityPool3.getPoolId() : null));
                        authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(signedOutException), null, 2, null);
                        authEnvironment2 = authEnvironment;
                    }
                } else {
                    fetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1 = this;
                    authEnvironment2 = authEnvironment;
                    illegalThreadStateException = null;
                    eventDispatcher3 = eventDispatcher;
                    if (illegalThreadStateException == null) {
                    }
                }
            } catch (NotAuthorizedException e3) {
                e = e3;
                eventDispatcher2 = eventDispatcher;
            } catch (Exception e4) {
                e = e4;
                eventDispatcher2 = eventDispatcher;
            }
            notAuthorizedException = e;
            eventDispatcher3 = eventDispatcher2;
            com.amplifyframework.auth.exceptions.NotAuthorizedException notAuthorizedException22 = new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
            AwsOKLogUtil awsOKLogUtil22 = AwsOKLogUtil.INSTANCE;
            IdentityPoolConfiguration identityPool22 = authEnvironment.getConfiguration().getIdentityPool();
            awsOKLogUtil22.okLog("getId notAuthorized=" + notAuthorizedException22 + " identityPoolId=" + (identityPool22 != null ? identityPool22.getPoolId() : null));
            authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(notAuthorizedException22), null, 2, null);
            authEnvironment2 = authEnvironment;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            id = (String) anonymousClass1.L$2;
            eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            fetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1 = (FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                illegalThreadStateException = (IllegalThreadStateException) obj;
                if (illegalThreadStateException == null || illegalThreadStateException.copydefault() == null) {
                    AwsOKLogUtil awsOKLogUtil4 = AwsOKLogUtil.INSTANCE;
                    IdentityPoolConfiguration identityPool4 = authEnvironment2.getConfiguration().getIdentityPool();
                    awsOKLogUtil4.okLog("getId response=" + illegalThreadStateException + " identityPoolId=" + (identityPool4 == null ? identityPool4.getPoolId() : null));
                    Unit unit2 = Unit.INSTANCE;
                }
                if (illegalThreadStateException == null && (strCopydefault = illegalThreadStateException.copydefault()) != null) {
                    authorizationEvent = new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.FetchAwsCredentials(strCopydefault, fetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1.$loginsMap$inlined), null, 2, null);
                } else {
                    throw new Exception("Fetching identity id failed.");
                }
            } catch (NotAuthorizedException e5) {
                notAuthorizedException = e5;
                authEnvironment = authEnvironment2;
                com.amplifyframework.auth.exceptions.NotAuthorizedException notAuthorizedException222 = new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
                AwsOKLogUtil awsOKLogUtil222 = AwsOKLogUtil.INSTANCE;
                IdentityPoolConfiguration identityPool222 = authEnvironment.getConfiguration().getIdentityPool();
                if (identityPool222 != null) {
                }
                awsOKLogUtil222.okLog("getId notAuthorized=" + notAuthorizedException222 + " identityPoolId=" + (identityPool222 != null ? identityPool222.getPoolId() : null));
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(notAuthorizedException222), null, 2, null);
                authEnvironment2 = authEnvironment;
            } catch (Exception e6) {
                exc = e6;
                authEnvironment = authEnvironment2;
                SignedOutException signedOutException2 = new SignedOutException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE, exc, 1, null);
                AwsOKLogUtil awsOKLogUtil32 = AwsOKLogUtil.INSTANCE;
                IdentityPoolConfiguration identityPool32 = authEnvironment.getConfiguration().getIdentityPool();
                if (identityPool32 == null) {
                }
                awsOKLogUtil32.okLog("getId e=" + signedOutException2 + " identityPoolId=" + (identityPool32 == null ? identityPool32.getPoolId() : null));
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(signedOutException2), null, 2, null);
                authEnvironment2 = authEnvironment;
            }
        }
        authEnvironment2.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
        eventDispatcher3.send(authorizationEvent);
        return Unit.INSTANCE;
    }

    public FetchAuthSessionCognitoActions$fetchIdentityAction$$inlined$invoke$1(String str, LoginsMapProvider loginsMapProvider) {
        this.$loginsMap$inlined = loginsMapProvider;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
