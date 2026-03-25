package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.cognito.actions.CredentialStoreCognitoActions;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.StateMachine;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.codegen.states.CredentialStoreState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CredentialStoreStateMachine extends StateMachine<CredentialStoreState, Environment> {
    public static final Companion Companion = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialStoreStateMachine(@NotNull StateMachineResolver<CredentialStoreState> stateMachineResolver, @NotNull Environment environment) {
        super(stateMachineResolver, environment, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(stateMachineResolver, "");
        Intrinsics.checkNotNullParameter(environment, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CredentialStoreStateMachine(@NotNull Environment environment) {
        this(new CredentialStoreState.Resolver(CredentialStoreCognitoActions.INSTANCE), environment);
        Intrinsics.checkNotNullParameter(environment, "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.CredentialStoreStateMachine.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CredentialStoreStateMachine logging(@NotNull Environment environment) {
            Intrinsics.checkNotNullParameter(environment, "");
            return new CredentialStoreStateMachine(StateMachineResolver.DefaultImpls.logging$default(new CredentialStoreState.Resolver(CredentialStoreCognitoActions.INSTANCE), null, null, 3, null), environment);
        }
    }
}
