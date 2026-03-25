package o;

import com.okinc.okimcore.feature.message.utility.TaskPriority;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sMQ {
    public final Continuation<Unit> AEQbTJ;
    public final TaskPriority EZpvd;
    public final CompletableDeferred<Job> KWHzl;
    public final long OLrzqt;
    public final Function2<CoroutineScope, Continuation<? super Unit>, java.lang.Object> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.sMQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ sMQ copy$default(sMQ smq, TaskPriority taskPriority, long j, CompletableDeferred completableDeferred, Continuation continuation, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taskPriority = smq.EZpvd;
        }
        if ((i & 2) != 0) {
            j = smq.OLrzqt;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            completableDeferred = smq.KWHzl;
        }
        CompletableDeferred completableDeferred2 = completableDeferred;
        if ((i & 8) != 0) {
            continuation = smq.AEQbTJ;
        }
        Continuation continuation2 = continuation;
        if ((i & 16) != 0) {
            function2 = smq.copydefault;
        }
        return smq.KWHzl(taskPriority, j2, completableDeferred2, continuation2, function2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Continuation<Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskPriority EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<CoroutineScope, Continuation<? super Unit>, java.lang.Object> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sMQ KWHzl(@NotNull TaskPriority taskPriority, long j, @NotNull CompletableDeferred<Job> completableDeferred, Continuation<? super Unit> continuation, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(taskPriority, "");
        Intrinsics.checkNotNullParameter(completableDeferred, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return new sMQ(taskPriority, j, completableDeferred, continuation, function2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompletableDeferred<Job> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sMQ)) {
            return false;
        }
        sMQ smq = (sMQ) obj;
        return this.EZpvd == smq.EZpvd && this.OLrzqt == smq.OLrzqt && Intrinsics.EZpvd(this.KWHzl, smq.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, smq.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, smq.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = java.lang.Long.hashCode(this.OLrzqt);
        int iHashCode3 = this.KWHzl.hashCode();
        Continuation<Unit> continuation = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (continuation == null ? 0 : continuation.hashCode())) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PrioritizedTask(priority=" + this.EZpvd + ", sequence=" + this.OLrzqt + ", executionJob=" + this.KWHzl + ", continuation=" + this.AEQbTJ + ", task=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public sMQ(@NotNull TaskPriority taskPriority, long j, @NotNull CompletableDeferred<Job> completableDeferred, Continuation<? super Unit> continuation, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(taskPriority, "");
        Intrinsics.checkNotNullParameter(completableDeferred, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = taskPriority;
        this.OLrzqt = j;
        this.KWHzl = completableDeferred;
        this.AEQbTJ = continuation;
        this.copydefault = function2;
    }
}
