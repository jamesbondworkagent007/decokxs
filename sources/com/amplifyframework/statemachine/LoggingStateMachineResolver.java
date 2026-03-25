package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineResolver;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class LoggingStateMachineResolver<StateType extends State, ResolverType extends StateMachineResolver<StateType>> implements StateMachineResolver<StateType> {
    public static final Companion Companion = new Companion(null);
    private final StateType defaultState;
    private final Level level;
    private Logger logger;
    private final ResolverType resolver;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public StateType getDefaultState() {
        return this.defaultState;
    }

    public LoggingStateMachineResolver(@NotNull ResolverType resolvertype, Logger logger, @NotNull Level level) {
        Intrinsics.checkNotNullParameter(resolvertype, "");
        Intrinsics.checkNotNullParameter(level, "");
        this.resolver = resolvertype;
        this.level = level;
        this.logger = logger == null ? Companion.makeDefaultLogger() : logger;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoggingStateMachineResolver(StateMachineResolver stateMachineResolver, Logger logger, Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        logger = (i & 2) != 0 ? null : logger;
        if ((i & 4) != 0) {
            level = Level.INFO;
            Intrinsics.checkNotNullExpressionValue(level, "");
        }
        this(stateMachineResolver, logger, level);
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.LoggingStateMachineResolver.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Logger makeDefaultLogger() {
            Logger logger = Logger.getLogger(toString());
            ConsoleHandler consoleHandler = new ConsoleHandler();
            Level level = Level.ALL;
            consoleHandler.setLevel(level);
            logger.setLevel(level);
            logger.addHandler(consoleHandler);
            logger.setUseParentHandlers(false);
            Intrinsics.copydefault(logger);
            return logger;
        }
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public StateResolution<StateType> resolve(@NotNull StateType statetype, @NotNull StateMachineEvent stateMachineEvent) {
        Intrinsics.checkNotNullParameter(statetype, "");
        Intrinsics.checkNotNullParameter(stateMachineEvent, "");
        StateResolution<StateType> stateResolutionResolve = this.resolver.resolve(statetype, stateMachineEvent);
        this.logger.log(this.level, statetype.toString());
        this.logger.log(this.level, stateMachineEvent.getType());
        this.logger.log(this.level, stateResolutionResolve.getNewState().toString());
        return stateResolutionResolve;
    }
}
