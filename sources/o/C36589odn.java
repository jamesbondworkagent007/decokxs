package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C36589odn {
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final ConcurrentHashMap<java.lang.Long, java.lang.Boolean> copydefault = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<java.lang.Long, yDQ<C35254nrp>> KWHzl = new ConcurrentHashMap<>();

    @yCM
    public C36589odn() {
    }

    /* JADX INFO: renamed from: o.odn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.odn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final boolean AEQbTJ(long j) {
        pUU.EZpvd("StreamMessageUIManager", "isInTheQueue: " + j + ", " + this.KWHzl.containsKey(java.lang.Long.valueOf(j)));
        return this.KWHzl.containsKey(java.lang.Long.valueOf(j));
    }

    public final boolean OLrzqt(long j) {
        java.lang.Boolean bool = this.copydefault.get(java.lang.Long.valueOf(j));
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        pUU.EZpvd("StreamMessageUIManager", "isAnimating: " + j + ", " + Intrinsics.EZpvd(bool, bool2));
        return Intrinsics.EZpvd(this.copydefault.get(java.lang.Long.valueOf(j)), bool2);
    }

    public final void KWHzl(long j, boolean z) {
        pUU.EZpvd("StreamMessageUIManager", "setAnimating: " + j + ", " + z);
        this.copydefault.put(java.lang.Long.valueOf(j), java.lang.Boolean.valueOf(z));
    }

    public final void EZpvd(long j, @NotNull C35254nrp c35254nrp) {
        yDQ<C35254nrp> ydqPutIfAbsent;
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        pUU.EZpvd("StreamMessageUIManager", "queueUpdate: " + j);
        ConcurrentHashMap<java.lang.Long, yDQ<C35254nrp>> concurrentHashMap = this.KWHzl;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        yDQ<C35254nrp> ydq = concurrentHashMap.get(lValueOf);
        if (ydq == null && (ydqPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (ydq = new yDQ<>()))) != null) {
            ydq = ydqPutIfAbsent;
        }
        ydq.addLast(c35254nrp);
    }

    public final C35254nrp EZpvd(long j) {
        pUU.EZpvd("StreamMessageUIManager", "getNextQueuedUpdate: " + j);
        yDQ<C35254nrp> ydq = this.KWHzl.get(java.lang.Long.valueOf(j));
        if (ydq == null || !(!ydq.isEmpty())) {
            return null;
        }
        return ydq.removeFirst();
    }

    public final boolean copydefault(long j) {
        yDQ<C35254nrp> ydq = this.KWHzl.get(java.lang.Long.valueOf(j));
        pUU.EZpvd("StreamMessageUIManager", "hasQueuedUpdates: " + j + ", " + (ydq != null && (ydq.isEmpty() ^ true)));
        return ydq != null && (ydq.isEmpty() ^ true);
    }

    public final void KWHzl(long j) {
        pUU.EZpvd("StreamMessageUIManager", "removeQueue: " + j);
        this.KWHzl.remove(java.lang.Long.valueOf(j));
        this.copydefault.remove(java.lang.Long.valueOf(j));
    }
}
