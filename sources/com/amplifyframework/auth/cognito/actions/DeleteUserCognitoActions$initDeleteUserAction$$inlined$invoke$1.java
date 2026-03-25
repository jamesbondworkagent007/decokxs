package com.amplifyframework.auth.cognito.actions;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56442yFn;
import o.Condemned;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ String $accessToken$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(4:11|40|12|13)(2:16|17))(7:18|38|19|(2:21|(1:23))|27|36|37)|42|24|27|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r0 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        String str;
        Exception e;
        Object objKWHzl;
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
        int i3 = 2;
        Date date = null;
        byte b = 0;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Intrinsics.copydefault(environment, "");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                BinaryOperator cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                    Condemned.StateListAnimator stateListAnimator = Condemned.EZpvd;
                    final String str2 = this.$accessToken$inlined;
                    Condemned condemnedCopydefault = stateListAnimator.copydefault(new Function1<Condemned.Activity, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions$initDeleteUserAction$1$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Condemned.Activity activity) {
                            invoke2(activity);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Condemned.Activity activity) {
                            Intrinsics.checkNotNullParameter(activity, "");
                            activity.KWHzl(str2);
                        }
                    });
                    anonymousClass1.L$0 = eventDispatcher;
                    anonymousClass1.L$1 = id;
                    anonymousClass1.L$2 = authEnvironment;
                    anonymousClass1.label = 1;
                    objKWHzl = cognitoIdentityProviderClient.KWHzl(condemnedCopydefault, anonymousClass1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                }
                DeleteUserEvent deleteUserEvent = new DeleteUserEvent(new DeleteUserEvent.EventType.UserDeleted(null, 1, null), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + deleteUserEvent.getType());
                eventDispatcher.send(deleteUserEvent);
            } catch (Exception e2) {
                str = id;
                e = e2;
                authEnvironment.getLogger().warn("Failed to delete user.", e);
                if (e instanceof UserNotFoundException) {
                    DeleteUserEvent deleteUserEvent2 = new DeleteUserEvent(new DeleteUserEvent.EventType.ThrowError(e, true), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + deleteUserEvent2.getType());
                    eventDispatcher.send(deleteUserEvent2);
                } else {
                    DeleteUserEvent deleteUserEvent3 = new DeleteUserEvent(new DeleteUserEvent.EventType.ThrowError(e, false), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + deleteUserEvent3.getType());
                    eventDispatcher.send(deleteUserEvent3);
                    AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), date, i3, b == true ? 1 : 0);
                    authEnvironment.getLogger().verbose(str + " Sending event " + authorizationEvent.getType());
                    eventDispatcher.send(authorizationEvent);
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AuthEnvironment authEnvironment2 = (AuthEnvironment) anonymousClass1.L$2;
        String str3 = (String) anonymousClass1.L$1;
        EventDispatcher eventDispatcher2 = (EventDispatcher) anonymousClass1.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
            authEnvironment = authEnvironment2;
            eventDispatcher = eventDispatcher2;
            objKWHzl = obj;
            id = str3;
        } catch (Exception e3) {
            e = e3;
            String str4 = str3;
            authEnvironment = authEnvironment2;
            eventDispatcher = eventDispatcher2;
            str = str4;
            authEnvironment.getLogger().warn("Failed to delete user.", e);
            if (e instanceof UserNotFoundException) {
            }
        }
        DeleteUserEvent deleteUserEvent4 = new DeleteUserEvent(new DeleteUserEvent.EventType.UserDeleted(null, 1, null), null, 2, null);
        authEnvironment.getLogger().verbose(id + " Sending event " + deleteUserEvent4.getType());
        eventDispatcher.send(deleteUserEvent4);
        return Unit.INSTANCE;
    }

    public DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1(String str, String str2) {
        this.$accessToken$inlined = str2;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
