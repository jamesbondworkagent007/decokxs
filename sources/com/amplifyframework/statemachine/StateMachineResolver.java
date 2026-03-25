package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface StateMachineResolver<StateType extends State> {
    AnyResolver<StateType, ?> eraseToAnyResolver();

    StateType getDefaultState();

    LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(Logger logger, @NotNull Level level);

    StateResolution<StateType> resolve(@NotNull StateType statetype, @NotNull StateMachineEvent stateMachineEvent);

    public static final class DefaultImpls {
        public static /* synthetic */ LoggingStateMachineResolver logging$default(StateMachineResolver stateMachineResolver, Logger logger, Level level, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logging");
            }
            if ((i & 1) != 0) {
                logger = null;
            }
            if ((i & 2) != 0) {
                level = Level.FINE;
                Intrinsics.checkNotNullExpressionValue(level, "");
            }
            return stateMachineResolver.logging(logger, level);
        }

        public static <StateType extends State> LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(@NotNull StateMachineResolver<StateType> stateMachineResolver, Logger logger, @NotNull Level level) {
            Intrinsics.checkNotNullParameter(level, "");
            return new LoggingStateMachineResolver<>(stateMachineResolver, logger, level);
        }

        public static <StateType extends State> AnyResolver<StateType, ?> eraseToAnyResolver(@NotNull StateMachineResolver<StateType> stateMachineResolver) {
            AnyResolver<StateType, ?> anyResolver = stateMachineResolver instanceof AnyResolver ? (AnyResolver) stateMachineResolver : null;
            return anyResolver == null ? new AnyResolver<>(stateMachineResolver) : anyResolver;
        }
    }
}
