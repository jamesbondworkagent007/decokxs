package o;

import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pXF<K, V> {
    public final InterfaceC56387yDm AEQbTJ;
    public final boolean EZpvd;
    public final InterfaceC56387yDm OLrzqt;

    public interface TaskDescription<V> {
        boolean OLrzqt();

        V copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public pXF() {
        this(false, 1, null);
    }

    public pXF(boolean z) {
        this.EZpvd = z;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pXF.EZpvd();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pXG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pXF.copydefault();
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:6) call: o.pXF.<init>(boolean):void type: THIS */
    public /* synthetic */ pXF(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final ConcurrentHashMap<K, TaskDescription<V>> KWHzl() {
        return (ConcurrentHashMap) this.OLrzqt.getValue();
    }

    public static final ConcurrentHashMap EZpvd() {
        return new ConcurrentHashMap();
    }

    public final ConcurrentHashMap<K, TaskDescription<SoftReference<V>>> gEmmrt() {
        return (ConcurrentHashMap) this.AEQbTJ.getValue();
    }

    public static final ConcurrentHashMap copydefault() {
        return new ConcurrentHashMap();
    }

    public final void AEQbTJ(K k, V v, long j) {
        long jCurrentTimeMillis = j == 0 ? Long.MAX_VALUE : j + java.lang.System.currentTimeMillis();
        if (this.EZpvd) {
            gEmmrt().put(k, new ActionBar(new SoftReference(v), jCurrentTimeMillis));
        } else {
            KWHzl().put(k, new Activity(v, jCurrentTimeMillis));
        }
    }

    public final V KWHzl(K k) {
        if (this.EZpvd) {
            TaskDescription<SoftReference<V>> taskDescription = gEmmrt().get(k);
            if (taskDescription != null && !taskDescription.OLrzqt()) {
                return taskDescription.copydefault().get();
            }
            return null;
        }
        TaskDescription<V> taskDescription2 = KWHzl().get(k);
        if (taskDescription2 != null && !taskDescription2.OLrzqt()) {
            return taskDescription2.copydefault();
        }
        return null;
    }

    public static final class Activity<V> implements TaskDescription<V> {
        public final V AEQbTJ;
        public final long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pXF$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Object obj, long j, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                j = activity.OLrzqt;
            }
            return activity.EZpvd(obj, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity<V> EZpvd(V v, long j) {
            return new Activity<>(v, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.pXF.TaskDescription
        public V copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && this.OLrzqt == activity.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            V v = this.AEQbTJ;
            return ((v == null ? 0 : v.hashCode()) * 31) + java.lang.Long.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CacheEntry(value=" + this.AEQbTJ + ", expiryTimeMillis=" + this.OLrzqt + ")";
        }

        public Activity(V v, long j) {
            this.AEQbTJ = v;
            this.OLrzqt = j;
        }

        @Override // o.pXF.TaskDescription
        public boolean OLrzqt() {
            return java.lang.System.currentTimeMillis() > EZpvd();
        }
    }

    public static final class ActionBar<V> implements TaskDescription<SoftReference<V>> {
        public final long AEQbTJ;
        public final SoftReference<V> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pXF$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, SoftReference softReference, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                softReference = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                j = actionBar.AEQbTJ;
            }
            return actionBar.AEQbTJ(softReference, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar<V> AEQbTJ(@NotNull SoftReference<V> softReference, long j) {
            Intrinsics.checkNotNullParameter(softReference, "");
            return new ActionBar<>(softReference, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault()Ljava/lang/Object; */
        @Override // o.pXF.TaskDescription
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public SoftReference<V> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && this.AEQbTJ == actionBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Long.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MemorySensitiveCacheEntry(value=" + this.KWHzl + ", expiryTimeMillis=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull SoftReference<V> softReference, long j) {
            Intrinsics.checkNotNullParameter(softReference, "");
            this.KWHzl = softReference;
            this.AEQbTJ = j;
        }

        @Override // o.pXF.TaskDescription
        public boolean OLrzqt() {
            return java.lang.System.currentTimeMillis() > KWHzl();
        }
    }
}
