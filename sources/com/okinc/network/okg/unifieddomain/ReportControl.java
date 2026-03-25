package com.okinc.network.okg.unifieddomain;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class ReportControl {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final Map<ReportType, Application> KWHzl;

    public ReportControl() {
        int i = 3;
        this.KWHzl = C56424yEw.gEmmrt(C56390yDp.OLrzqt(ReportType.CORE, new Application(null, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0)), C56390yDp.OLrzqt(ReportType.FILE_DOWNLOAD, new Application(0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0)));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ReportType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ReportType[] $VALUES;
        public static final ReportType CORE = new ReportType("CORE", 0);
        public static final ReportType FILE_DOWNLOAD = new ReportType("FILE_DOWNLOAD", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ReportType[] $values() {
            return new ReportType[]{CORE, FILE_DOWNLOAD};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ReportType> getEntries() {
            return $ENTRIES;
        }

        private ReportType(String str, int i) {
        }

        static {
            ReportType[] reportTypeArr$values = $values();
            $VALUES = reportTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(reportTypeArr$values);
        }

        public static ReportType valueOf(String str) {
            return (ReportType) Enum.valueOf(ReportType.class, str);
        }

        public static ReportType[] values() {
            return (ReportType[]) $VALUES.clone();
        }
    }

    public static final class Application {
        public final AtomicInteger EZpvd;
        public final ConcurrentLinkedDeque<Long> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.okg.unifieddomain.ReportControl$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, AtomicInteger atomicInteger, ConcurrentLinkedDeque concurrentLinkedDeque, int i, Object obj) {
            if ((i & 1) != 0) {
                atomicInteger = application.EZpvd;
            }
            if ((i & 2) != 0) {
                concurrentLinkedDeque = application.KWHzl;
            }
            return application.copydefault(atomicInteger, concurrentLinkedDeque);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConcurrentLinkedDeque<Long> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull AtomicInteger atomicInteger, @NotNull ConcurrentLinkedDeque<Long> concurrentLinkedDeque) {
            Intrinsics.checkNotNullParameter(atomicInteger, "");
            Intrinsics.checkNotNullParameter(concurrentLinkedDeque, "");
            return new Application(atomicInteger, concurrentLinkedDeque);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AtomicInteger copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ReportConfig(maxRequests=" + this.EZpvd + ", records=" + this.KWHzl + ")";
        }

        public Application(@NotNull AtomicInteger atomicInteger, @NotNull ConcurrentLinkedDeque<Long> concurrentLinkedDeque) {
            Intrinsics.checkNotNullParameter(atomicInteger, "");
            Intrinsics.checkNotNullParameter(concurrentLinkedDeque, "");
            this.EZpvd = atomicInteger;
            this.KWHzl = concurrentLinkedDeque;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.util.concurrent.atomic.AtomicInteger:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.concurrent.atomic.AtomicInteger:0x0007: CONSTRUCTOR (-1 int) A[MD:(int):void (c), WRAPPED] (LINE:42) call: java.util.concurrent.atomic.AtomicInteger.<init>(int):void type: CONSTRUCTOR) : (r1v0 java.util.concurrent.atomic.AtomicInteger))
  (wrap:java.util.concurrent.ConcurrentLinkedDeque:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.concurrent.ConcurrentLinkedDeque:0x0010: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:43) call: java.util.concurrent.ConcurrentLinkedDeque.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.concurrent.ConcurrentLinkedDeque))
 A[MD:(java.util.concurrent.atomic.AtomicInteger, java.util.concurrent.ConcurrentLinkedDeque<java.lang.Long>):void (m)] (LINE:41) call: com.okinc.network.okg.unifieddomain.ReportControl.Application.<init>(java.util.concurrent.atomic.AtomicInteger, java.util.concurrent.ConcurrentLinkedDeque):void type: THIS */
        public /* synthetic */ Application(AtomicInteger atomicInteger, ConcurrentLinkedDeque concurrentLinkedDeque, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new AtomicInteger(-1) : atomicInteger, (i & 2) != 0 ? new ConcurrentLinkedDeque() : concurrentLinkedDeque);
        }
    }

    public final void AEQbTJ(@NotNull ReportType reportType) {
        Intrinsics.checkNotNullParameter(reportType, "");
        Application application = this.KWHzl.get(reportType);
        if (application == null) {
            return;
        }
        application.KWHzl().addLast(Long.valueOf(SystemClock.elapsedRealtime()));
        while (application.KWHzl().size() > 256) {
            application.KWHzl().removeFirst();
        }
    }

    public final void EZpvd(@NotNull ReportType reportType, int i) {
        Intrinsics.checkNotNullParameter(reportType, "");
        Application application = this.KWHzl.get(reportType);
        if (application == null) {
            return;
        }
        application.copydefault().set(i);
    }

    public final boolean KWHzl(@NotNull ReportType reportType) {
        Long lPeekFirst;
        Intrinsics.checkNotNullParameter(reportType, "");
        Application application = this.KWHzl.get(reportType);
        if (application == null) {
            return false;
        }
        int i = application.copydefault().get();
        if (i == -1) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while ((!application.KWHzl().isEmpty()) && (lPeekFirst = application.KWHzl().peekFirst()) != null && lPeekFirst.longValue() < jElapsedRealtime - 60000) {
            application.KWHzl().removeFirst();
        }
        return application.KWHzl().size() < i;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.unifieddomain.ReportControl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
