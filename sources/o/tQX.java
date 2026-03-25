package o;

import com.okinc.planet.domain.usecase.PaginationUseCase$invoke$2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.tQX.Application;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tQX<Input, T extends Application> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public boolean AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public java.lang.String OLrzqt;
    public int djBIcL;
    public java.util.List<? extends T> gEmmrt;
    public int valueOf;

    /* JADX INFO: loaded from: classes16.dex */
    public interface Application {
        java.lang.String getPaginationId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.valueOf;
    }

    public abstract java.lang.Object EZpvd(Input input, @NotNull Continuation<? super java.util.List<? extends T>> continuation);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.djBIcL;
    }

    public tQX(@NotNull CoroutineDispatcher coroutineDispatcher, int i) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AhwBna = coroutineDispatcher;
        this.djBIcL = i;
        this.gEmmrt = yDY.AhwBna();
        this.valueOf = 1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 kotlinx.coroutines.CoroutineDispatcher)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r2v0 int))
 A[MD:(kotlinx.coroutines.CoroutineDispatcher, int):void (m)] (LINE:10) call: o.tQX.<init>(kotlinx.coroutines.CoroutineDispatcher, int):void type: THIS */
    public /* synthetic */ tQX(CoroutineDispatcher coroutineDispatcher, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineDispatcher, (i2 & 2) != 0 ? 20 : i);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tQX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Object AEQbTJ(Input input, @NotNull Continuation<? super TaskDescription<T>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new PaginationUseCase$invoke$2(this, input, null), continuation);
    }

    public final TaskDescription<T> OLrzqt(@NotNull java.util.List<? extends T> list) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = false;
        if (!list.isEmpty()) {
            this.gEmmrt = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) this.gEmmrt, (java.lang.Iterable) list);
            Application application = (Application) CollectionsKt___CollectionsKt.wlaJM(list);
            this.OLrzqt = application != null ? application.getPaginationId() : null;
            if (list.size() >= OLrzqt() && (str = this.OLrzqt) != null && str.length() != 0) {
                z = true;
            }
            this.AYXKKw = z;
            if (z) {
                this.valueOf++;
            }
        } else {
            this.OLrzqt = null;
            this.AYXKKw = false;
        }
        return new TaskDescription<>(this.gEmmrt, this.AYXKKw, null, 4, null);
    }

    public void copydefault() {
        this.gEmmrt = yDY.AhwBna();
        this.OLrzqt = null;
        this.valueOf = 1;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription<T> {
        public final java.util.List<T> EZpvd;
        public final boolean KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tQX$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                z = taskDescription.KWHzl;
            }
            if ((i & 4) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.EZpvd(list, z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription<T> EZpvd(@NotNull java.util.List<? extends T> list, boolean z, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription<>(list, z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<T> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.KWHzl == taskDescription.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
            java.lang.String str = this.copydefault;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Response(list=" + this.EZpvd + ", canLoadMore=" + this.KWHzl + ", dataVersion=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull java.util.List<? extends T> list, boolean z, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            this.KWHzl = z;
            this.copydefault = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.util.List<? extends T>, boolean, java.lang.String):void (m)] (LINE:68) call: o.tQX.TaskDescription.<init>(java.util.List, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(java.util.List list, boolean z, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, z, (i & 4) != 0 ? null : str);
        }
    }
}
