package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StateResolution<T extends State> {
    public static final Companion Companion = new Companion(null);
    private final List<Action> actions;
    private final T newState;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Action> getActions() {
        return this.actions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getNewState() {
        return this.newState;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.StateResolution.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends State> StateResolution<T> from(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            return new StateResolution<>(t, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.amplifyframework.statemachine.Action> */
    /* JADX WARN: Multi-variable type inference failed */
    public StateResolution(@NotNull T t, @NotNull List<? extends Action> list) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.newState = t;
        this.actions = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.State)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r2v0 java.util.List))
 A[MD:(T extends com.amplifyframework.statemachine.State, java.util.List<? extends com.amplifyframework.statemachine.Action>):void (m)] (LINE:18) call: com.amplifyframework.statemachine.StateResolution.<init>(com.amplifyframework.statemachine.State, java.util.List):void type: THIS */
    public /* synthetic */ StateResolution(State state, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(state, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
