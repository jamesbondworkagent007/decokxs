package com.amplifyframework.auth.cognito.actions;

import aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.log.AwsOKLogUtil;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C5173Hn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.Character;
import o.Enum;
import o.IllegalArgumentException;
import o.IllegalMonitorStateException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ String $identityId$inlined;
    final /* synthetic */ LoginsMapProvider $loginsMap$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[Catch: Exception -> 0x0047, NotAuthorizedException -> 0x004a, TryCatch #4 {NotAuthorizedException -> 0x004a, Exception -> 0x0047, blocks: (B:12:0x0043, B:29:0x00ac, B:36:0x00bd, B:40:0x00e5, B:42:0x00eb, B:44:0x00ff, B:46:0x0109, B:47:0x011a, B:48:0x0121, B:38:0x00c3), top: B:66:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[Catch: Exception -> 0x0047, NotAuthorizedException -> 0x004a, TryCatch #4 {NotAuthorizedException -> 0x004a, Exception -> 0x0047, blocks: (B:12:0x0043, B:29:0x00ac, B:36:0x00bd, B:40:0x00e5, B:42:0x00eb, B:44:0x00ff, B:46:0x0109, B:47:0x011a, B:48:0x0121, B:38:0x00c3), top: B:66:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        Exception exc;
        FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1 fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1;
        EventDispatcher eventDispatcher3;
        NotAuthorizedException notAuthorizedException;
        AuthEnvironment authEnvironment2;
        IllegalArgumentException illegalArgumentException;
        AuthorizationEvent authorizationEvent;
        StateMachineEvent fetchAuthSessionEvent;
        Enum enumAEQbTJ;
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
                IllegalMonitorStateException.ActionBar actionBar = IllegalMonitorStateException.copydefault;
                final String str = this.$identityId$inlined;
                final LoginsMapProvider loginsMapProvider = this.$loginsMap$inlined;
                IllegalMonitorStateException illegalMonitorStateExceptionCopydefault = actionBar.copydefault(new Function1<IllegalMonitorStateException.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$1$evt$request$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IllegalMonitorStateException.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull IllegalMonitorStateException.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                        application.OLrzqt(str);
                        application.AEQbTJ(loginsMapProvider.getLogins());
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
                        Object objEZpvd = cognitoIdentityClient.EZpvd(illegalMonitorStateExceptionCopydefault, anonymousClass1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1 = this;
                        authEnvironment2 = authEnvironment;
                        eventDispatcher3 = eventDispatcher2;
                        obj = objEZpvd;
                        illegalArgumentException = (IllegalArgumentException) obj;
                        if (illegalArgumentException == null) {
                            AwsOKLogUtil.INSTANCE.okLog("getCredentialsForIdentity response=" + illegalArgumentException + " " + fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1.$identityId$inlined);
                            Unit unit = Unit.INSTANCE;
                            if (illegalArgumentException == null) {
                            }
                            throw new Exception("Fetching AWS credentials failed.");
                        }
                    } catch (NotAuthorizedException e) {
                        e = e;
                        notAuthorizedException = e;
                        fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1 = this;
                        eventDispatcher3 = eventDispatcher2;
                        com.amplifyframework.auth.exceptions.NotAuthorizedException notAuthorizedException2 = new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
                        AwsOKLogUtil.INSTANCE.okLog("getCredentialsForIdentity notAuthorized=" + notAuthorizedException2 + " " + fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1.$identityId$inlined);
                        authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(notAuthorizedException2), null, 2, null);
                        authEnvironment2 = authEnvironment;
                        fetchAuthSessionEvent = authorizationEvent;
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1 = this;
                        eventDispatcher3 = eventDispatcher2;
                        SignedOutException signedOutException = new SignedOutException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE, exc, 1, null);
                        AwsOKLogUtil.INSTANCE.okLog("getCredentialsForIdentity e=" + signedOutException + " " + fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1.$identityId$inlined);
                        authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(signedOutException), null, 2, null);
                        authEnvironment2 = authEnvironment;
                        fetchAuthSessionEvent = authorizationEvent;
                    }
                } else {
                    fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1 = this;
                    authEnvironment2 = authEnvironment;
                    illegalArgumentException = null;
                    eventDispatcher3 = eventDispatcher;
                    if (illegalArgumentException == null) {
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
            fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1 = this;
            eventDispatcher3 = eventDispatcher2;
            com.amplifyframework.auth.exceptions.NotAuthorizedException notAuthorizedException22 = new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
            AwsOKLogUtil.INSTANCE.okLog("getCredentialsForIdentity notAuthorized=" + notAuthorizedException22 + " " + fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1.$identityId$inlined);
            authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(notAuthorizedException22), null, 2, null);
            authEnvironment2 = authEnvironment;
            fetchAuthSessionEvent = authorizationEvent;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            id = (String) anonymousClass1.L$2;
            eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1 = (FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                illegalArgumentException = (IllegalArgumentException) obj;
                if (illegalArgumentException == null || illegalArgumentException.AEQbTJ() == null) {
                    AwsOKLogUtil.INSTANCE.okLog("getCredentialsForIdentity response=" + illegalArgumentException + " " + fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1.$identityId$inlined);
                    Unit unit2 = Unit.INSTANCE;
                }
                if (illegalArgumentException == null && (enumAEQbTJ = illegalArgumentException.AEQbTJ()) != null) {
                    String strAEQbTJ = enumAEQbTJ.AEQbTJ();
                    String strKWHzl = enumAEQbTJ.KWHzl();
                    String strCopydefault = enumAEQbTJ.copydefault();
                    C5173Hn c5173HnEZpvd = enumAEQbTJ.EZpvd();
                    fetchAuthSessionEvent = new FetchAuthSessionEvent(new FetchAuthSessionEvent.EventType.Fetched(fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1.$identityId$inlined, new AWSCredentials(strAEQbTJ, strKWHzl, strCopydefault, c5173HnEZpvd != null ? C56443yFo.KWHzl(c5173HnEZpvd.KWHzl()) : null)), null, 2, null);
                } else {
                    throw new Exception("Fetching AWS credentials failed.");
                }
            } catch (NotAuthorizedException e5) {
                notAuthorizedException = e5;
                authEnvironment = authEnvironment2;
                com.amplifyframework.auth.exceptions.NotAuthorizedException notAuthorizedException222 = new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
                AwsOKLogUtil.INSTANCE.okLog("getCredentialsForIdentity notAuthorized=" + notAuthorizedException222 + " " + fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1.$identityId$inlined);
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(notAuthorizedException222), null, 2, null);
                authEnvironment2 = authEnvironment;
                fetchAuthSessionEvent = authorizationEvent;
            } catch (Exception e6) {
                exc = e6;
                authEnvironment = authEnvironment2;
                SignedOutException signedOutException2 = new SignedOutException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE, exc, 1, null);
                AwsOKLogUtil.INSTANCE.okLog("getCredentialsForIdentity e=" + signedOutException2 + " " + fetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1.$identityId$inlined);
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(signedOutException2), null, 2, null);
                authEnvironment2 = authEnvironment;
                fetchAuthSessionEvent = authorizationEvent;
            }
        }
        authEnvironment2.getLogger().verbose(id + " Sending event " + fetchAuthSessionEvent.getType());
        eventDispatcher3.send(fetchAuthSessionEvent);
        return Unit.INSTANCE;
    }

    public FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$$inlined$invoke$1(String str, String str2, LoginsMapProvider loginsMapProvider) {
        this.$identityId$inlined = str2;
        this.$loginsMap$inlined = loginsMapProvider;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
