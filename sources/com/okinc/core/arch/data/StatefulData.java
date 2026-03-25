package com.okinc.core.arch.data;

import com.okinc.core.arch.data.StatefulData;
import com.reown.android.pulse.model.EventType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class StatefulData<T> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final boolean AhwBna;
    public final Throwable EZpvd;
    public final boolean KWHzl;
    public final T copydefault;
    public final Status djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Status AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Throwable copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.KWHzl;
    }

    public StatefulData(@NotNull Status status, T t, Throwable th) {
        Intrinsics.checkNotNullParameter(status, "");
        this.djBIcL = status;
        this.copydefault = t;
        this.EZpvd = th;
        this.valueOf = AEQbTJ() == Status.SUCCESS;
        this.KWHzl = AEQbTJ() == Status.ERROR;
        this.AhwBna = AEQbTJ() == Status.LOADING;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.mnN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StatefulData.djBIcL(this.EZpvd);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mnQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StatefulData.AEQbTJ(this.OLrzqt);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.mnR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StatefulData.copydefault(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.core.arch.data.StatefulData$Status)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r4v0 java.lang.Throwable))
 A[MD:(com.okinc.core.arch.data.StatefulData$Status, T, java.lang.Throwable):void (m)] (LINE:9) call: com.okinc.core.arch.data.StatefulData.<init>(com.okinc.core.arch.data.StatefulData$Status, java.lang.Object, java.lang.Throwable):void type: THIS */
    public /* synthetic */ StatefulData(Status status, Object obj, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.core.arch.data.StatefulData$StateListAnimator */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Application djBIcL(StatefulData statefulData) {
        StateListAnimator stateListAnimator = Companion;
        Object objEZpvd = statefulData.EZpvd();
        Intrinsics.copydefault(objEZpvd);
        return stateListAnimator.EZpvd(objEZpvd);
    }

    public final Application<T> djBIcL() {
        return (Application) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.core.arch.data.StatefulData$StateListAnimator */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Activity AEQbTJ(StatefulData statefulData) {
        StateListAnimator stateListAnimator = Companion;
        Throwable thCopydefault = statefulData.copydefault();
        Intrinsics.copydefault(thCopydefault);
        return stateListAnimator.AEQbTJ(thCopydefault, statefulData.EZpvd());
    }

    public final Activity<T> OLrzqt() {
        return (Activity) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.core.arch.data.StatefulData$StateListAnimator */
    /* JADX WARN: Multi-variable type inference failed */
    public static final TaskDescription copydefault(StatefulData statefulData) {
        return Companion.copydefault(statefulData.EZpvd());
    }

    public final TaskDescription<T> KWHzl() {
        return (TaskDescription) this.gEmmrt.getValue();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status LOADING = new Status("LOADING", 1);
        public static final Status ERROR = new Status(EventType.ERROR, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, LOADING, ERROR};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public static final class Application<T> extends StatefulData<T> {
        public final T values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.core.arch.data.StatefulData
        public T EZpvd() {
            return this.values;
        }

        public Application(T t) {
            super(Status.SUCCESS, null, null, 2, null);
            this.values = t;
        }
    }

    public static final class Activity<T> extends StatefulData<T> {
        public final T isConnected;
        public final Throwable values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.core.arch.data.StatefulData
        public T EZpvd() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.core.arch.data.StatefulData
        public Throwable copydefault() {
            return this.values;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull Throwable th, T t) {
            super(Status.ERROR, null, null, 6, null);
            Intrinsics.checkNotNullParameter(th, "");
            this.values = th;
            this.isConnected = t;
        }
    }

    public static final class TaskDescription<T> extends StatefulData<T> {
        public final T DbNXlk;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Illegal instructions before constructor call */
        public TaskDescription() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            this(defaultConstructorMarker, 1, defaultConstructorMarker);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.core.arch.data.StatefulData
        public T EZpvd() {
            return this.DbNXlk;
        }

        public TaskDescription(T t) {
            super(Status.LOADING, null, null, 2, null);
            this.DbNXlk = t;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r1v0 java.lang.Object))
 A[MD:(T):void (m)] (LINE:30) call: com.okinc.core.arch.data.StatefulData.TaskDescription.<init>(java.lang.Object):void type: THIS */
        public /* synthetic */ TaskDescription(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj);
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.arch.data.StatefulData.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final <T> Application<T> EZpvd(T t) {
            return new Application<>(t);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.core.arch.data.StatefulData$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity error$default(StateListAnimator stateListAnimator, Throwable th, Object obj, int i, Object obj2) {
            if ((i & 2) != 0) {
                obj = null;
            }
            return stateListAnimator.AEQbTJ(th, obj);
        }

        public final <T> Activity<T> AEQbTJ(@NotNull Throwable th, T t) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Activity<>(th, t);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.core.arch.data.StatefulData$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription loading$default(StateListAnimator stateListAnimator, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return stateListAnimator.copydefault(obj);
        }

        public final <T> TaskDescription<T> copydefault(T t) {
            return new TaskDescription<>(t);
        }
    }
}
