package com.okinc.okapm;

import android.app.Application;
import com.okinc.base.thread.TPM;
import com.okinc.okapm.Apm;
import com.okinc.okapm.common.AppStartMode;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import o.C56390yDp;
import o.C56392yDr;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.rVP;
import o.rVR;
import o.rWC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface Apm extends rWC {
    public static final Activity Companion = Activity.copydefault;

    void AEQbTJ(@NotNull AppStartMode appStartMode);

    public static final class StateListAnimator {
        public Function1<? super rVR, Unit> AEQbTJ;
        public String EZpvd;
        public boolean KWHzl;
        public boolean OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, false, false, false, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.KWHzl;
            }
            if ((i & 4) != 0) {
                z2 = stateListAnimator.copydefault;
            }
            if ((i & 8) != 0) {
                z3 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(str, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.rVR, kotlin.Unit>, kotlin.jvm.functions.Function1<o.rVR, kotlin.Unit> */
        public final Function1<rVR, Unit> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(Function1<? super rVR, Unit> function1) {
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd) && this.KWHzl == stateListAnimator.KWHzl && this.copydefault == stateListAnimator.copydefault && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Options(sid=" + this.EZpvd + ", isE2E=" + this.KWHzl + ", enableTTID=" + this.copydefault + ", enableMemory=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.KWHzl = z;
            this.copydefault = z2;
            this.OLrzqt = z3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, boolean, boolean, boolean):void (m)] (LINE:31) call: com.okinc.okapm.Apm.StateListAnimator.<init>(java.lang.String, boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3);
        }
    }

    public static final class TaskDescription implements rVR {
        public static final Activity Companion = new Activity(null);
        public static final int EZpvd = 8;
        public final String AEQbTJ;
        public final String KWHzl;
        public final HashMap<String, String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.rVR
        public String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.rVR
        public String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.rVR
        public HashMap<String, String> KWHzl() {
            return this.OLrzqt;
        }

        public TaskDescription(@NotNull String str, @NotNull String str2, @NotNull HashMap<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.OLrzqt = map;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("apm_events") : (r2v0 java.lang.String))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x0012: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:43) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.HashMap))
 A[MD:(java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:40) call: com.okinc.okapm.Apm.TaskDescription.<init>(java.lang.String, java.lang.String, java.util.HashMap):void type: THIS */
        public /* synthetic */ TaskDescription(String str, String str2, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "apm_events" : str2, (i & 4) != 0 ? new HashMap() : map);
        }

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okapm.Apm.TaskDescription.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okapm.Apm$TaskDescription$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaskDescription create$default(Activity activity, String str, String str2, String str3, Map map, int i, Object obj) {
                if ((i & 4) != 0) {
                    str3 = "";
                }
                if ((i & 8) != 0) {
                    map = C56424yEw.KWHzl();
                }
                return activity.OLrzqt(str, str2, str3, map);
            }

            public final TaskDescription OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(map, "");
                HashMap mapAYXKKw = C56424yEw.AYXKKw(C56390yDp.OLrzqt("event", str2), C56390yDp.OLrzqt("type", str));
                mapAYXKKw.putAll(map);
                Unit unit = Unit.INSTANCE;
                return new TaskDescription(str3, null, mapAYXKKw, 2, null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EventGroupType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EventGroupType[] $VALUES;
        private final String value;
        public static final EventGroupType CUSTOM = new EventGroupType("CUSTOM", 0, "custom");
        public static final EventGroupType APP_LIFECYCLE = new EventGroupType("APP_LIFECYCLE", 1, "app_lifecycle");
        public static final EventGroupType PAGE_LIFECYCLE = new EventGroupType("PAGE_LIFECYCLE", 2, "page_lifecycle");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EventGroupType[] $values() {
            return new EventGroupType[]{CUSTOM, APP_LIFECYCLE, PAGE_LIFECYCLE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EventGroupType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private EventGroupType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            EventGroupType[] eventGroupTypeArr$values = $values();
            $VALUES = eventGroupTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(eventGroupTypeArr$values);
        }

        public static EventGroupType valueOf(String str) {
            return (EventGroupType) Enum.valueOf(EventGroupType.class, str);
        }

        public static EventGroupType[] values() {
            return (EventGroupType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EventType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        private final String value;
        public static final EventType MEMORY_LEAK = new EventType("MEMORY_LEAK", 0, "memory_leak");
        public static final EventType APP_TTID = new EventType("APP_TTID", 1, "app_ttid");
        public static final EventType APP_START = new EventType("APP_START", 2, "app_start");
        public static final EventType APP_END = new EventType("APP_END", 3, "app_end");
        public static final EventType VIEW_TTFD = new EventType("VIEW_TTFD", 4, "view_ttfd");
        public static final EventType APP_MEMORY = new EventType("APP_MEMORY", 5, "app_memory");
        public static final EventType VIEW_TTID = new EventType("VIEW_TTID", 6, "view_ttid");
        public static final EventType APP_MEMORY_WARNING = new EventType("APP_MEMORY_WARNING", 7, "memory_warning");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{MEMORY_LEAK, APP_TTID, APP_START, APP_END, VIEW_TTFD, APP_MEMORY, VIEW_TTID, APP_MEMORY_WARNING};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EventType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private EventType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(eventTypeArr$values);
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public static final class Activity {
        public static volatile Apm OLrzqt;
        public static final /* synthetic */ Activity copydefault = new Activity();
        public static final InterfaceC56387yDm<ExecutorCoroutineDispatcher> KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rVO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return Apm.Activity.KWHzl();
            }
        });

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Apm AEQbTJ() {
            return OLrzqt;
        }

        private Activity() {
        }

        public static final ExecutorCoroutineDispatcher KWHzl() {
            return ExecutorsKt.from(TPM.AEQbTJ.AhwBna());
        }

        public final ExecutorCoroutineDispatcher OLrzqt() {
            return KWHzl.getValue();
        }

        public static final Unit KWHzl(StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okapm.Apm$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void init$default(Activity activity, Application application, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.rVL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return Apm.Activity.KWHzl((Apm.StateListAnimator) obj2);
                    }
                };
            }
            activity.OLrzqt(application, function1);
        }

        public final void OLrzqt(@NotNull Application application, @NotNull Function1<? super StateListAnimator, Unit> function1) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(function1, "");
            if (OLrzqt == null) {
                synchronized (this) {
                    StateListAnimator stateListAnimator = new StateListAnimator(null, false, false, false, 15, null);
                    function1.invoke(stateListAnimator);
                    rVP rvp = new rVP(application, stateListAnimator);
                    rvp.AEQbTJ();
                    OLrzqt = rvp;
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }
}
