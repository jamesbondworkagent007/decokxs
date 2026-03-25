package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44385sNw {
    public static final int OLrzqt;
    public static final java.util.Set<java.lang.String> copydefault;
    public static final C44385sNw KWHzl = new C44385sNw();
    public static final ConcurrentHashMap<java.lang.String, MutableSharedFlow<TaskDescription>> EZpvd = new ConcurrentHashMap<>();

    private C44385sNw() {
    }

    /* JADX INFO: renamed from: o.sNw$TaskDescription */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.sNw$TaskDescription$ActionBar */
        public static final class ActionBar extends TaskDescription {
            public final int OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = actionBar.OLrzqt;
                }
                return actionBar.OLrzqt(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar OLrzqt(int i) {
                return new ActionBar(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && this.OLrzqt == ((ActionBar) obj).OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Integer.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Progress(percent=" + this.OLrzqt + ")";
            }

            public ActionBar(int i) {
                super(null);
                this.OLrzqt = i;
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.sNw$TaskDescription$Application */
        public static final class Application extends TaskDescription {
            public static final Application copydefault = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1016439243;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Complete";
            }

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.sNw$TaskDescription$StateListAnimator */
        public static final class StateListAnimator extends TaskDescription {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1524289593;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failed";
            }

            private StateListAnimator() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.sNw$TaskDescription$Activity */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends TaskDescription {
            public static final Activity EZpvd = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 434674645;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Cancelled";
            }

            private Activity() {
                super(null);
            }
        }
    }

    static {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        Intrinsics.checkNotNullExpressionValue(keySetViewNewKeySet, "");
        copydefault = keySetViewNewKeySet;
        OLrzqt = 8;
    }

    public final SharedFlow<TaskDescription> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("FileUploadProgress", "[" + valueOf(str) + "] progressFlow: UI subscribing");
        return AEQbTJ(str);
    }

    public final void KWHzl(@NotNull java.lang.String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (j2 <= 0) {
            return;
        }
        int iEZpvd = C56548yJl.EZpvd((int) ((((long) 100) * j) / j2), 0, 100);
        MutableSharedFlow<TaskDescription> mutableSharedFlowAEQbTJ = AEQbTJ(str);
        TaskDescription taskDescription = (TaskDescription) CollectionsKt___CollectionsKt.wlaJM(mutableSharedFlowAEQbTJ.getReplayCache());
        boolean z = taskDescription instanceof TaskDescription.ActionBar;
        if (z && ((TaskDescription.ActionBar) taskDescription).OLrzqt() == iEZpvd) {
            return;
        }
        boolean zTryEmit = mutableSharedFlowAEQbTJ.tryEmit(new TaskDescription.ActionBar(iEZpvd));
        TaskDescription.ActionBar actionBar = z ? (TaskDescription.ActionBar) taskDescription : null;
        if (iEZpvd - (actionBar != null ? actionBar.OLrzqt() : 0) >= 5 || iEZpvd == 100) {
            pUU.EZpvd("FileUploadProgress", "[" + valueOf(str) + "] reportProgress: " + iEZpvd + "% (" + j + "/" + j2 + "), emitted=" + zTryEmit);
        }
    }

    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean zTryEmit = AEQbTJ(str).tryEmit(TaskDescription.Application.copydefault);
        pUU.EZpvd("FileUploadProgress", "[" + valueOf(str) + "] reportComplete: emitted=" + zTryEmit);
    }

    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean zTryEmit = AEQbTJ(str).tryEmit(TaskDescription.StateListAnimator.OLrzqt);
        pUU.EZpvd("FileUploadProgress", "[" + valueOf(str) + "] reportFailed: emitted=" + zTryEmit);
    }

    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean zTryEmit = AEQbTJ(str).tryEmit(TaskDescription.Activity.EZpvd);
        pUU.EZpvd("FileUploadProgress", "[" + valueOf(str) + "] reportCancelled: emitted=" + zTryEmit);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault.add(str);
        pUU.EZpvd("FileUploadProgress", "[" + valueOf(str) + "] markUserCancelled");
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault.remove(str);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("FileUploadProgress", "[" + valueOf(str) + "] cleanup: removing flow");
        EZpvd.remove(str);
    }

    public final MutableSharedFlow<TaskDescription> AEQbTJ(java.lang.String str) {
        MutableSharedFlow<TaskDescription> mutableSharedFlowPutIfAbsent;
        ConcurrentHashMap<java.lang.String, MutableSharedFlow<TaskDescription>> concurrentHashMap = EZpvd;
        boolean zContainsKey = concurrentHashMap.containsKey(str);
        MutableSharedFlow<TaskDescription> mutableSharedFlowMutableSharedFlow$default = concurrentHashMap.get(str);
        if (mutableSharedFlowMutableSharedFlow$default == null && (mutableSharedFlowPutIfAbsent = concurrentHashMap.putIfAbsent(str, (mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 100, null, 4, null)))) != null) {
            mutableSharedFlowMutableSharedFlow$default = mutableSharedFlowPutIfAbsent;
        }
        MutableSharedFlow<TaskDescription> mutableSharedFlow = mutableSharedFlowMutableSharedFlow$default;
        if (!zContainsKey) {
            pUU.EZpvd("FileUploadProgress", "[" + valueOf(str) + "] getOrCreateFlow: CREATED new flow");
        }
        Intrinsics.copydefault(mutableSharedFlow);
        return mutableSharedFlow;
    }

    public final java.lang.String valueOf(java.lang.String str) {
        return C59454zhO.isConnected(str, 8);
    }
}
