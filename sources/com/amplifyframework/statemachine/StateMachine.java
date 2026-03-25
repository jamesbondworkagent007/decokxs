package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.State;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class StateMachine<StateType extends State, EnvironmentType extends Environment> implements EventDispatcher {
    private StateType currentState;
    private final CoroutineDispatcher dispatcherQueue;
    private final EnvironmentType environment;
    private final CoroutineExceptionHandler exceptionHandler;
    private final EffectExecutor executor;
    private final ExecutorCoroutineDispatcher operationQueue;
    private final Set<StateChangeListenerToken> pendingCancellations;
    private final AnyResolver<StateType, ?> resolver;
    private final CoroutineContext stateMachineScope;
    private final Map<StateChangeListenerToken, Function1<StateType, Unit>> subscribers;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EnvironmentType getEnvironment() {
        return this.environment;
    }

    public StateMachine(@NotNull StateMachineResolver<StateType> stateMachineResolver, @NotNull EnvironmentType environmenttype, EffectExecutor effectExecutor, CoroutineDispatcher coroutineDispatcher, StateType statetype) {
        Intrinsics.checkNotNullParameter(stateMachineResolver, "");
        Intrinsics.checkNotNullParameter(environmenttype, "");
        this.environment = environmenttype;
        this.resolver = stateMachineResolver.eraseToAnyResolver();
        this.currentState = statetype == null ? (StateType) stateMachineResolver.getDefaultState() : statetype;
        ExecutorCoroutineDispatcher executorCoroutineDispatcherNewFixedThreadPoolContext = ThreadPoolDispatcherKt.newFixedThreadPoolContext(1, "Single threaded dispatcher");
        this.operationQueue = executorCoroutineDispatcherNewFixedThreadPoolContext;
        this.exceptionHandler = new StateMachine$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
        this.stateMachineScope = JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(executorCoroutineDispatcherNewFixedThreadPoolContext);
        coroutineDispatcher = coroutineDispatcher == null ? Dispatchers.getDefault() : coroutineDispatcher;
        this.dispatcherQueue = coroutineDispatcher;
        this.executor = effectExecutor == null ? new ConcurrentEffectExecutor(coroutineDispatcher) : effectExecutor;
        this.subscribers = new LinkedHashMap();
        this.pendingCancellations = new LinkedHashSet();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 com.amplifyframework.statemachine.StateMachineResolver)
  (r9v0 com.amplifyframework.statemachine.Environment)
  (wrap:com.amplifyframework.statemachine.EffectExecutor:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.EffectExecutor) : (r10v0 com.amplifyframework.statemachine.EffectExecutor))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.coroutines.CoroutineDispatcher) : (r11v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:com.amplifyframework.statemachine.State:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.State) : (r12v0 com.amplifyframework.statemachine.State))
 A[MD:(com.amplifyframework.statemachine.StateMachineResolver<StateType extends com.amplifyframework.statemachine.State>, EnvironmentType extends com.amplifyframework.statemachine.Environment, com.amplifyframework.statemachine.EffectExecutor, kotlinx.coroutines.CoroutineDispatcher, StateType extends com.amplifyframework.statemachine.State):void (m)] (LINE:49) call: com.amplifyframework.statemachine.StateMachine.<init>(com.amplifyframework.statemachine.StateMachineResolver, com.amplifyframework.statemachine.Environment, com.amplifyframework.statemachine.EffectExecutor, kotlinx.coroutines.CoroutineDispatcher, com.amplifyframework.statemachine.State):void type: THIS */
    public /* synthetic */ StateMachine(StateMachineResolver stateMachineResolver, Environment environment, EffectExecutor effectExecutor, CoroutineDispatcher coroutineDispatcher, State state, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateMachineResolver, environment, (i & 4) != 0 ? null : effectExecutor, (i & 8) != 0 ? null : coroutineDispatcher, (i & 16) != 0 ? null : state);
    }

    /* JADX INFO: renamed from: com.amplifyframework.statemachine.StateMachine$listen$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<StateType, Unit> $listener;
        final /* synthetic */ Function0<Unit> $onSubscribe;
        final /* synthetic */ StateChangeListenerToken $token;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super StateType extends com.amplifyframework.statemachine.State, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16901(StateMachine<StateType, EnvironmentType> stateMachine, StateChangeListenerToken stateChangeListenerToken, Function1<? super StateType, Unit> function1, Function0<Unit> function0, Continuation<? super C16901> continuation) {
            super(2, continuation);
            this.this$0 = stateMachine;
            this.$token = stateChangeListenerToken;
            this.$listener = function1;
            this.$onSubscribe = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C16901(this.this$0, this.$token, this.$listener, this.$onSubscribe, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.addSubscription(this.$token, this.$listener, this.$onSubscribe);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void listen(@NotNull StateChangeListenerToken stateChangeListenerToken, @NotNull Function1<? super StateType, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(stateChangeListenerToken, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, this.stateMachineScope, null, new C16901(this, stateChangeListenerToken, function1, function0, null), 2, null);
    }

    /* JADX INFO: renamed from: com.amplifyframework.statemachine.StateMachine$cancel$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StateChangeListenerToken $token;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16881(StateMachine<StateType, EnvironmentType> stateMachine, StateChangeListenerToken stateChangeListenerToken, Continuation<? super C16881> continuation) {
            super(2, continuation);
            this.this$0 = stateMachine;
            this.$token = stateChangeListenerToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C16881(this.this$0, this.$token, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.removeSubscription(this.$token);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void cancel(@NotNull StateChangeListenerToken stateChangeListenerToken) {
        Intrinsics.checkNotNullParameter(stateChangeListenerToken, "");
        this.pendingCancellations.add(stateChangeListenerToken);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, this.stateMachineScope, null, new C16881(this, stateChangeListenerToken, null), 2, null);
    }

    /* JADX INFO: renamed from: com.amplifyframework.statemachine.StateMachine$getCurrentState$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<StateType, Unit> $completion;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super StateType extends com.amplifyframework.statemachine.State, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16891(Function1<? super StateType, Unit> function1, StateMachine<StateType, EnvironmentType> stateMachine, Continuation<? super C16891> continuation) {
            super(2, continuation);
            this.$completion = function1;
            this.this$0 = stateMachine;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C16891(this.$completion, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$completion.invoke((StateType) ((StateMachine) this.this$0).currentState);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void getCurrentState(@NotNull Function1<? super StateType, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, this.stateMachineScope, null, new C16891(function1, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSubscription(StateChangeListenerToken stateChangeListenerToken, Function1<? super StateType, Unit> function1, Function0<Unit> function0) {
        if (this.pendingCancellations.contains(stateChangeListenerToken)) {
            return;
        }
        StateType statetype = this.currentState;
        this.subscribers.put(stateChangeListenerToken, function1);
        if (function0 != null) {
            function0.invoke();
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, this.dispatcherQueue, null, new AnonymousClass1(function1, statetype, null), 2, null);
    }

    /* JADX INFO: renamed from: com.amplifyframework.statemachine.StateMachine$addSubscription$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StateType $currentState;
        final /* synthetic */ Function1<StateType, Unit> $listener;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super StateType extends com.amplifyframework.statemachine.State, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super StateType, Unit> function1, StateType statetype, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$listener = function1;
            this.$currentState = statetype;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$listener, this.$currentState, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$listener.invoke(this.$currentState);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSubscription(StateChangeListenerToken stateChangeListenerToken) {
        this.pendingCancellations.remove(stateChangeListenerToken);
        this.subscribers.remove(stateChangeListenerToken);
    }

    /* JADX INFO: renamed from: com.amplifyframework.statemachine.StateMachine$send$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StateMachineEvent $event;
        int label;
        final /* synthetic */ StateMachine<StateType, EnvironmentType> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16911(StateMachine<StateType, EnvironmentType> stateMachine, StateMachineEvent stateMachineEvent, Continuation<? super C16911> continuation) {
            super(2, continuation);
            this.this$0 = stateMachine;
            this.$event = stateMachineEvent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C16911(this.this$0, this.$event, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.process(this.$event);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.amplifyframework.statemachine.EventDispatcher
    public void send(@NotNull StateMachineEvent stateMachineEvent) {
        Intrinsics.checkNotNullParameter(stateMachineEvent, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, this.stateMachineScope, null, new C16911(this, stateMachineEvent, null), 2, null);
    }

    private final boolean notifySubscribers(Map.Entry<StateChangeListenerToken, ? extends Function1<? super StateType, Unit>> entry, StateType statetype) {
        if (this.pendingCancellations.contains(entry.getKey())) {
            return false;
        }
        entry.getValue().invoke(statetype);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void process(StateMachineEvent stateMachineEvent) {
        StateResolution<StateType> stateResolutionResolve = this.resolver.resolve(this.currentState, stateMachineEvent);
        if (!Intrinsics.EZpvd(this.currentState, stateResolutionResolve.getNewState())) {
            this.currentState = (StateType) stateResolutionResolve.getNewState();
            Map<StateChangeListenerToken, Function1<StateType, Unit>> map = this.subscribers;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<StateChangeListenerToken, Function1<StateType, Unit>> entry : map.entrySet()) {
                if (!notifySubscribers(entry, stateResolutionResolve.getNewState())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                this.subscribers.remove(((Map.Entry) it.next()).getKey());
            }
        }
        execute(stateResolutionResolve.getActions());
    }

    private final void execute(List<? extends Action> list) {
        this.executor.execute(list, this, this.environment);
    }
}
