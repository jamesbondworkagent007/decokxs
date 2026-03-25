package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C58024ytV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ytV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58024ytV<STATE, EVENT, SIDE_EFFECT> {
    public static final Application Companion = new Application(null);
    public final AtomicReference<STATE> EZpvd;
    public final StateListAnimator<STATE, EVENT, SIDE_EFFECT> copydefault;

    public C58024ytV(StateListAnimator<STATE, EVENT, SIDE_EFFECT> stateListAnimator) {
        this.copydefault = stateListAnimator;
        this.EZpvd = new AtomicReference<>(stateListAnimator.OLrzqt());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ytV$StateListAnimator) A[MD:(o.ytV$StateListAnimator<STATE, EVENT, SIDE_EFFECT>):void (m)] (LINE:5) call: o.ytV.<init>(o.ytV$StateListAnimator):void type: THIS */
    public /* synthetic */ C58024ytV(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    public final STATE OLrzqt() {
        STATE state = this.EZpvd.get();
        Intrinsics.AEQbTJ(state, "");
        return state;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.ytV<STATE, EVENT, SIDE_EFFECT> */
    /* JADX WARN: Multi-variable type inference failed */
    public final Activity<STATE, EVENT, SIDE_EFFECT> EZpvd(@NotNull EVENT event) {
        Activity<STATE, EVENT, SIDE_EFFECT> activityOLrzqt;
        Intrinsics.EZpvd((java.lang.Object) event, "");
        synchronized (this) {
            STATE state = this.EZpvd.get();
            Intrinsics.AEQbTJ(state, "");
            activityOLrzqt = OLrzqt(state, event);
            if (activityOLrzqt instanceof Activity.StateListAnimator) {
                this.EZpvd.set((STATE) ((Activity.StateListAnimator) activityOLrzqt).AEQbTJ());
            }
        }
        EZpvd((Activity) activityOLrzqt);
        if (activityOLrzqt instanceof Activity.StateListAnimator) {
            Activity.StateListAnimator stateListAnimator = (Activity.StateListAnimator) activityOLrzqt;
            copydefault(stateListAnimator.KWHzl(), event);
            AEQbTJ(stateListAnimator.AEQbTJ(), event);
        }
        return activityOLrzqt;
    }

    public final Activity<STATE, EVENT, SIDE_EFFECT> OLrzqt(@NotNull STATE state, EVENT event) {
        for (Map.Entry<ActionBar<EVENT, EVENT>, Function2<STATE, EVENT, StateListAnimator.Activity.TaskDescription<STATE, SIDE_EFFECT>>> entry : KWHzl(state).KWHzl().entrySet()) {
            ActionBar<EVENT, EVENT> key = entry.getKey();
            Function2<STATE, EVENT, StateListAnimator.Activity.TaskDescription<STATE, SIDE_EFFECT>> value = entry.getValue();
            if (key.copydefault(event)) {
                StateListAnimator.Activity.TaskDescription<STATE, SIDE_EFFECT> taskDescriptionInvoke = value.invoke(state, event);
                return new Activity.StateListAnimator(state, event, taskDescriptionInvoke.copydefault(), taskDescriptionInvoke.AEQbTJ());
            }
        }
        return new Activity.C1011Activity(state, event);
    }

    public final StateListAnimator.Activity<STATE, EVENT, SIDE_EFFECT> KWHzl(@NotNull STATE state) {
        java.util.Map<ActionBar<STATE, STATE>, StateListAnimator.Activity<STATE, EVENT, SIDE_EFFECT>> mapEZpvd = this.copydefault.EZpvd();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<ActionBar<STATE, STATE>, StateListAnimator.Activity<STATE, EVENT, SIDE_EFFECT>> entry : mapEZpvd.entrySet()) {
            if (entry.getKey().copydefault(state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((StateListAnimator.Activity) ((Map.Entry) it.next()).getValue());
        }
        StateListAnimator.Activity<STATE, EVENT, SIDE_EFFECT> activity = (StateListAnimator.Activity) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (activity != null) {
            return activity;
        }
        throw new java.lang.IllegalStateException(("Missing definition for state " + state.getClass().getSimpleName() + '!').toString());
    }

    public final void AEQbTJ(@NotNull STATE state, EVENT event) {
        java.util.Iterator<T> it = KWHzl(state).copydefault().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    public final void copydefault(@NotNull STATE state, EVENT event) {
        java.util.Iterator<T> it = KWHzl(state).EZpvd().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    public final void EZpvd(@NotNull Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT> activity) {
        java.util.Iterator<T> it = this.copydefault.KWHzl().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(activity);
        }
    }

    /* JADX INFO: renamed from: o.ytV$Activity */
    public static abstract class Activity<STATE, EVENT, SIDE_EFFECT> {
        public abstract STATE KWHzl();

        private Activity() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:69) call: o.ytV.Activity.<init>():void type: THIS */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.ytV$Activity$StateListAnimator */
        public static final class StateListAnimator<STATE, EVENT, SIDE_EFFECT> extends Activity<STATE, EVENT, SIDE_EFFECT> {
            public final STATE EZpvd;
            public final EVENT KWHzl;
            public final STATE OLrzqt;
            public final SIDE_EFFECT copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytV$Activity$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, java.lang.Object obj5) {
                if ((i & 1) != 0) {
                    obj = stateListAnimator.KWHzl();
                }
                if ((i & 2) != 0) {
                    obj2 = stateListAnimator.OLrzqt();
                }
                if ((i & 4) != 0) {
                    obj3 = stateListAnimator.EZpvd;
                }
                if ((i & 8) != 0) {
                    obj4 = stateListAnimator.copydefault;
                }
                return stateListAnimator.KWHzl(obj, obj2, obj3, obj4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final STATE AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C58024ytV.Activity
            public STATE KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator<STATE, EVENT, SIDE_EFFECT> KWHzl(@NotNull STATE state, @NotNull EVENT event, @NotNull STATE state2, SIDE_EFFECT side_effect) {
                Intrinsics.EZpvd((java.lang.Object) state, "");
                Intrinsics.EZpvd((java.lang.Object) event, "");
                Intrinsics.EZpvd((java.lang.Object) state2, "");
                return new StateListAnimator<>(state, event, state2, side_effect);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public EVENT OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd(KWHzl(), stateListAnimator.KWHzl()) && Intrinsics.EZpvd(OLrzqt(), stateListAnimator.OLrzqt()) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                STATE stateKWHzl = KWHzl();
                int iHashCode = stateKWHzl != null ? stateKWHzl.hashCode() : 0;
                EVENT eventOLrzqt = OLrzqt();
                int iHashCode2 = eventOLrzqt != null ? eventOLrzqt.hashCode() : 0;
                STATE state = this.EZpvd;
                int iHashCode3 = state != null ? state.hashCode() : 0;
                SIDE_EFFECT side_effect = this.copydefault;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (side_effect != null ? side_effect.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Valid(fromState=" + KWHzl() + ", event=" + OLrzqt() + ", toState=" + this.EZpvd + ", sideEffect=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull STATE state, @NotNull EVENT event, @NotNull STATE state2, SIDE_EFFECT side_effect) {
                super(null);
                Intrinsics.EZpvd((java.lang.Object) state, "");
                Intrinsics.EZpvd((java.lang.Object) event, "");
                Intrinsics.EZpvd((java.lang.Object) state2, "");
                this.OLrzqt = state;
                this.KWHzl = event;
                this.EZpvd = state2;
                this.copydefault = side_effect;
            }
        }

        /* JADX INFO: renamed from: o.ytV$Activity$Activity, reason: collision with other inner class name */
        public static final class C1011Activity<STATE, EVENT, SIDE_EFFECT> extends Activity<STATE, EVENT, SIDE_EFFECT> {
            public final STATE OLrzqt;
            public final EVENT copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytV$Activity$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ C1011Activity copy$default(C1011Activity c1011Activity, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
                if ((i & 1) != 0) {
                    obj = c1011Activity.KWHzl();
                }
                if ((i & 2) != 0) {
                    obj2 = c1011Activity.AEQbTJ();
                }
                return c1011Activity.AEQbTJ(obj, obj2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public EVENT AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C1011Activity<STATE, EVENT, SIDE_EFFECT> AEQbTJ(@NotNull STATE state, @NotNull EVENT event) {
                Intrinsics.EZpvd((java.lang.Object) state, "");
                Intrinsics.EZpvd((java.lang.Object) event, "");
                return new C1011Activity<>(state, event);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C58024ytV.Activity
            public STATE KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1011Activity)) {
                    return false;
                }
                C1011Activity c1011Activity = (C1011Activity) obj;
                return Intrinsics.EZpvd(KWHzl(), c1011Activity.KWHzl()) && Intrinsics.EZpvd(AEQbTJ(), c1011Activity.AEQbTJ());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                STATE stateKWHzl = KWHzl();
                int iHashCode = stateKWHzl != null ? stateKWHzl.hashCode() : 0;
                EVENT eventAEQbTJ = AEQbTJ();
                return (iHashCode * 31) + (eventAEQbTJ != null ? eventAEQbTJ.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Invalid(fromState=" + KWHzl() + ", event=" + AEQbTJ() + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1011Activity(@NotNull STATE state, @NotNull EVENT event) {
                super(null);
                Intrinsics.EZpvd((java.lang.Object) state, "");
                Intrinsics.EZpvd((java.lang.Object) event, "");
                this.OLrzqt = state;
                this.copydefault = event;
            }
        }
    }

    /* JADX INFO: renamed from: o.ytV$StateListAnimator */
    public static final class StateListAnimator<STATE, EVENT, SIDE_EFFECT> {
        public final STATE EZpvd;
        public final java.util.Map<ActionBar<STATE, STATE>, Activity<STATE, EVENT, SIDE_EFFECT>> KWHzl;
        public final java.util.List<Function1<Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytV$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Object obj, java.util.Map map, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                map = stateListAnimator.KWHzl;
            }
            if ((i & 4) != 0) {
                list = stateListAnimator.copydefault;
            }
            return stateListAnimator.copydefault(obj, map, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<ActionBar<STATE, STATE>, Activity<STATE, EVENT, SIDE_EFFECT>> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Function1<Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final STATE OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator<STATE, EVENT, SIDE_EFFECT> copydefault(@NotNull STATE state, @NotNull java.util.Map<ActionBar<STATE, STATE>, Activity<STATE, EVENT, SIDE_EFFECT>> map, @NotNull java.util.List<? extends Function1<? super Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> list) {
            Intrinsics.EZpvd((java.lang.Object) state, "");
            Intrinsics.EZpvd((java.lang.Object) map, "");
            Intrinsics.EZpvd((java.lang.Object) list, "");
            return new StateListAnimator<>(state, map, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            STATE state = this.EZpvd;
            int iHashCode = state != null ? state.hashCode() : 0;
            java.util.Map<ActionBar<STATE, STATE>, Activity<STATE, EVENT, SIDE_EFFECT>> map = this.KWHzl;
            int iHashCode2 = map != null ? map.hashCode() : 0;
            java.util.List<Function1<Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> list = this.copydefault;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Graph(initialState=" + this.EZpvd + ", stateDefinitions=" + this.KWHzl + ", onTransitionListeners=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends kotlin.jvm.functions.Function1<? super o.ytV$Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull STATE state, @NotNull java.util.Map<ActionBar<STATE, STATE>, Activity<STATE, EVENT, SIDE_EFFECT>> map, @NotNull java.util.List<? extends Function1<? super Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> list) {
            Intrinsics.EZpvd((java.lang.Object) state, "");
            Intrinsics.EZpvd((java.lang.Object) map, "");
            Intrinsics.EZpvd((java.lang.Object) list, "");
            this.EZpvd = state;
            this.KWHzl = map;
            this.copydefault = list;
        }

        /* JADX INFO: renamed from: o.ytV$StateListAnimator$Activity */
        public static final class Activity<STATE, EVENT, SIDE_EFFECT> {
            public final java.util.List<Function2<STATE, EVENT, Unit>> EZpvd = new java.util.ArrayList();
            public final java.util.List<Function2<STATE, EVENT, Unit>> copydefault = new java.util.ArrayList();
            public final LinkedHashMap<ActionBar<EVENT, EVENT>, Function2<STATE, EVENT, TaskDescription<STATE, SIDE_EFFECT>>> OLrzqt = new LinkedHashMap<>();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<Function2<STATE, EVENT, Unit>> EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LinkedHashMap<ActionBar<EVENT, EVENT>, Function2<STATE, EVENT, TaskDescription<STATE, SIDE_EFFECT>>> KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<Function2<STATE, EVENT, Unit>> copydefault() {
                return this.EZpvd;
            }

            /* JADX INFO: renamed from: o.ytV$StateListAnimator$Activity$TaskDescription */
            public static final class TaskDescription<STATE, SIDE_EFFECT> {
                public final STATE AEQbTJ;
                public final SIDE_EFFECT EZpvd;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytV$StateListAnimator$Activity$TaskDescription */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
                    if ((i & 1) != 0) {
                        obj = taskDescription.AEQbTJ;
                    }
                    if ((i & 2) != 0) {
                        obj2 = taskDescription.EZpvd;
                    }
                    return taskDescription.EZpvd(obj, obj2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SIDE_EFFECT AEQbTJ() {
                    return this.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final TaskDescription<STATE, SIDE_EFFECT> EZpvd(@NotNull STATE state, SIDE_EFFECT side_effect) {
                    Intrinsics.EZpvd((java.lang.Object) state, "");
                    return new TaskDescription<>(state, side_effect);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final STATE copydefault() {
                    return this.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TaskDescription)) {
                        return false;
                    }
                    TaskDescription taskDescription = (TaskDescription) obj;
                    return Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    STATE state = this.AEQbTJ;
                    int iHashCode = state != null ? state.hashCode() : 0;
                    SIDE_EFFECT side_effect = this.EZpvd;
                    return (iHashCode * 31) + (side_effect != null ? side_effect.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public java.lang.String toString() {
                    return "TransitionTo(toState=" + this.AEQbTJ + ", sideEffect=" + this.EZpvd + ")";
                }

                public TaskDescription(@NotNull STATE state, SIDE_EFFECT side_effect) {
                    Intrinsics.EZpvd((java.lang.Object) state, "");
                    this.AEQbTJ = state;
                    this.EZpvd = side_effect;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ytV$ActionBar */
    public static final class ActionBar<T, R extends T> {
        public static final C1010ActionBar Companion = new C1010ActionBar(null);
        public final java.util.List<Function1<T, java.lang.Boolean>> AEQbTJ;
        public final java.lang.Class<R> copydefault;

        public ActionBar(java.lang.Class<R> cls) {
            this.copydefault = cls;
            this.AEQbTJ = yDY.AhwBna(new Function1<T, java.lang.Boolean>() { // from class: com.tinder.StateMachine$Matcher$predicates$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Boolean invoke(Object obj) {
                    return Boolean.valueOf(invoke2(obj));
                }

                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(@NotNull T t) {
                    Intrinsics.EZpvd((Object) t, "");
                    return this.this$0.copydefault.isInstance(t);
                }
            });
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Class) A[MD:(java.lang.Class<R extends T>):void (m)] (LINE:104) call: o.ytV.ActionBar.<init>(java.lang.Class):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.Class cls, DefaultConstructorMarker defaultConstructorMarker) {
            this(cls);
        }

        public final ActionBar<T, R> copydefault(@NotNull final Function1<? super R, java.lang.Boolean> function1) {
            Intrinsics.EZpvd((java.lang.Object) function1, "");
            this.AEQbTJ.add(new Function1<T, java.lang.Boolean>() { // from class: com.tinder.StateMachine$Matcher$where$$inlined$apply$lambda$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Boolean invoke(Object obj) {
                    return Boolean.valueOf(invoke2(obj));
                }

                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2(@NotNull T t) {
                    Intrinsics.EZpvd((Object) t, "");
                    return ((Boolean) function1.invoke(t)).booleanValue();
                }
            });
            return this;
        }

        /* JADX INFO: renamed from: o.ytV$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C1010ActionBar {
            private C1010ActionBar() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:117) call: o.ytV.ActionBar.ActionBar.<init>():void type: THIS */
            public /* synthetic */ C1010ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <T, R extends T> ActionBar<T, R> copydefault(@NotNull java.lang.Class<R> cls) {
                Intrinsics.EZpvd((java.lang.Object) cls, "");
                return new ActionBar<>(cls, null);
            }
        }

        public final boolean copydefault(@NotNull T t) {
            Intrinsics.EZpvd((java.lang.Object) t, "");
            java.util.List<Function1<T, java.lang.Boolean>> list = this.AEQbTJ;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((java.lang.Boolean) ((Function1) it.next()).invoke(t)).booleanValue()) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: o.ytV$TaskDescription */
    public static final class TaskDescription<STATE, EVENT, SIDE_EFFECT> {
        public final java.util.ArrayList<Function1<Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> AEQbTJ;
        public final LinkedHashMap<ActionBar<STATE, STATE>, StateListAnimator.Activity<STATE, EVENT, SIDE_EFFECT>> KWHzl;
        public STATE OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull STATE state) {
            Intrinsics.EZpvd((java.lang.Object) state, "");
            this.OLrzqt = state;
        }

        public TaskDescription(StateListAnimator<STATE, EVENT, SIDE_EFFECT> stateListAnimator) {
            java.util.List<Function1<Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> listKWHzl;
            java.util.Map<ActionBar<STATE, STATE>, StateListAnimator.Activity<STATE, EVENT, SIDE_EFFECT>> mapEZpvd;
            this.OLrzqt = stateListAnimator != null ? stateListAnimator.OLrzqt() : null;
            this.KWHzl = new LinkedHashMap<>((stateListAnimator == null || (mapEZpvd = stateListAnimator.EZpvd()) == null) ? C56424yEw.KWHzl() : mapEZpvd);
            this.AEQbTJ = new java.util.ArrayList<>((stateListAnimator == null || (listKWHzl = stateListAnimator.KWHzl()) == null) ? yDY.AhwBna() : listKWHzl);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.ytV$StateListAnimator:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.ytV$StateListAnimator) : (r1v0 o.ytV$StateListAnimator))
 A[MD:(o.ytV$StateListAnimator<STATE, EVENT, SIDE_EFFECT>):void (m)] (LINE:127) call: o.ytV.TaskDescription.<init>(o.ytV$StateListAnimator):void type: THIS */
        public /* synthetic */ TaskDescription(StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stateListAnimator);
        }

        public final <S extends STATE> void AEQbTJ(@NotNull ActionBar<STATE, ? extends S> actionBar, @NotNull Function1<? super TaskDescription<STATE, EVENT, SIDE_EFFECT>.StateListAnimator<S>, Unit> function1) {
            Intrinsics.EZpvd((java.lang.Object) actionBar, "");
            Intrinsics.EZpvd((java.lang.Object) function1, "");
            LinkedHashMap<ActionBar<STATE, STATE>, StateListAnimator.Activity<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.KWHzl;
            StateListAnimator stateListAnimator = new StateListAnimator();
            function1.invoke(stateListAnimator);
            linkedHashMap.put(actionBar, stateListAnimator.AEQbTJ());
        }

        public final void AEQbTJ(@NotNull Function1<? super Activity<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit> function1) {
            Intrinsics.EZpvd((java.lang.Object) function1, "");
            this.AEQbTJ.add(function1);
        }

        public final StateListAnimator<STATE, EVENT, SIDE_EFFECT> EZpvd() {
            STATE state = this.OLrzqt;
            if (state != null) {
                return new StateListAnimator<>(state, C56424yEw.values(this.KWHzl), CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.AEQbTJ));
            }
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }

        /* JADX INFO: renamed from: o.ytV$TaskDescription$StateListAnimator */
        public final class StateListAnimator<S extends STATE> {
            public final StateListAnimator.Activity<STATE, EVENT, SIDE_EFFECT> KWHzl = new StateListAnimator.Activity<>();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator.Activity<STATE, EVENT, SIDE_EFFECT> AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public StateListAnimator() {
            }

            public final <E extends EVENT> void OLrzqt(@NotNull ActionBar<EVENT, ? extends E> actionBar, @NotNull final Function2<? super S, ? super E, ? extends StateListAnimator.Activity.TaskDescription<? extends STATE, ? extends SIDE_EFFECT>> function2) {
                Intrinsics.EZpvd((java.lang.Object) actionBar, "");
                Intrinsics.EZpvd((java.lang.Object) function2, "");
                this.KWHzl.KWHzl().put(actionBar, new Function2<STATE, EVENT, StateListAnimator.Activity.TaskDescription<? extends STATE, ? extends SIDE_EFFECT>>() { // from class: com.tinder.StateMachine$GraphBuilder$StateDefinitionBuilder$on$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final C58024ytV.StateListAnimator.Activity.TaskDescription<STATE, SIDE_EFFECT> invoke(@NotNull STATE state, @NotNull EVENT event) {
                        Intrinsics.EZpvd((Object) state, "");
                        Intrinsics.EZpvd((Object) event, "");
                        return (C58024ytV.StateListAnimator.Activity.TaskDescription) function2.invoke(state, event);
                    }
                });
            }

            public final boolean AEQbTJ(@NotNull final Function2<? super S, ? super EVENT, Unit> function2) {
                Intrinsics.EZpvd((java.lang.Object) function2, "");
                return this.KWHzl.copydefault().add(new Function2<STATE, EVENT, Unit>() { // from class: com.tinder.StateMachine$GraphBuilder$StateDefinitionBuilder$onEnter$$inlined$with$lambda$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
                        invoke2(obj, obj2);
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function2.invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull STATE state, @NotNull EVENT event) {
                        Intrinsics.EZpvd((Object) state, "");
                        Intrinsics.EZpvd((Object) event, "");
                        function2.invoke(state, event);
                    }
                });
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytV$TaskDescription$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator.Activity.TaskDescription transitionTo$default(StateListAnimator stateListAnimator, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, java.lang.Object obj4) {
                if ((i & 2) != 0) {
                    obj3 = null;
                }
                return stateListAnimator.OLrzqt(obj, obj2, obj3);
            }

            public final StateListAnimator.Activity.TaskDescription<STATE, SIDE_EFFECT> OLrzqt(@NotNull S s, @NotNull STATE state, SIDE_EFFECT side_effect) {
                Intrinsics.EZpvd((java.lang.Object) s, "");
                Intrinsics.EZpvd((java.lang.Object) state, "");
                return new StateListAnimator.Activity.TaskDescription<>(state, side_effect);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytV$TaskDescription$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator.Activity.TaskDescription dontTransition$default(StateListAnimator stateListAnimator, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
                if ((i & 1) != 0) {
                    obj2 = null;
                }
                return stateListAnimator.AEQbTJ(obj, obj2);
            }

            public final StateListAnimator.Activity.TaskDescription<STATE, SIDE_EFFECT> AEQbTJ(@NotNull S s, SIDE_EFFECT side_effect) {
                Intrinsics.EZpvd((java.lang.Object) s, "");
                return OLrzqt(s, s, side_effect);
            }
        }
    }

    /* JADX INFO: renamed from: o.ytV$Application */
    public static final class Application {
        private Application() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:216) call: o.ytV.Application.<init>():void type: THIS */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <STATE, EVENT, SIDE_EFFECT> C58024ytV<STATE, EVENT, SIDE_EFFECT> EZpvd(@NotNull Function1<? super TaskDescription<STATE, EVENT, SIDE_EFFECT>, Unit> function1) {
            Intrinsics.EZpvd((java.lang.Object) function1, "");
            return EZpvd(null, function1);
        }

        public final <STATE, EVENT, SIDE_EFFECT> C58024ytV<STATE, EVENT, SIDE_EFFECT> EZpvd(StateListAnimator<STATE, EVENT, SIDE_EFFECT> stateListAnimator, Function1<? super TaskDescription<STATE, EVENT, SIDE_EFFECT>, Unit> function1) {
            TaskDescription taskDescription = new TaskDescription(stateListAnimator);
            function1.invoke(taskDescription);
            return new C58024ytV<>(taskDescription.EZpvd(), null);
        }
    }
}
