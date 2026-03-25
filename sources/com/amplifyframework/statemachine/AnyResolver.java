package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineResolver;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AnyResolver<StateType extends State, ResolverType extends StateMachineResolver<StateType>> implements StateMachineResolver<StateType> {
    private StateType defaultState;
    private final ResolverType resolver;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public StateType getDefaultState() {
        return this.defaultState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResolverType getResolver() {
        return this.resolver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDefaultState(@NotNull StateType statetype) {
        Intrinsics.checkNotNullParameter(statetype, "");
        this.defaultState = statetype;
    }

    public AnyResolver(@NotNull ResolverType resolvertype) {
        Intrinsics.checkNotNullParameter(resolvertype, "");
        this.resolver = resolvertype;
        this.defaultState = (StateType) resolvertype.getDefaultState();
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public AnyResolver<StateType, ?> eraseToAnyResolver() {
        return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(Logger logger, @NotNull Level level) {
        return StateMachineResolver.DefaultImpls.logging(this, logger, level);
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public StateResolution<StateType> resolve(@NotNull StateType statetype, @NotNull StateMachineEvent stateMachineEvent) {
        Intrinsics.checkNotNullParameter(statetype, "");
        Intrinsics.checkNotNullParameter(stateMachineEvent, "");
        return this.resolver.resolve(statetype, stateMachineEvent);
    }
}
