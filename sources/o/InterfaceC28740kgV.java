package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28740kgV {

    /* JADX INFO: renamed from: o.kgV$Activity */
    public static final class Activity implements InterfaceC28740kgV {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.kgV$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28740kgV {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.kgV$TaskDescription */
    public static final class TaskDescription implements InterfaceC28740kgV {
        public final C28807khj OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C28807khj c28807khj, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c28807khj = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(c28807khj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull C28807khj c28807khj) {
            Intrinsics.checkNotNullParameter(c28807khj, "");
            return new TaskDescription(c28807khj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C28807khj copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(data=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull C28807khj c28807khj) {
            Intrinsics.checkNotNullParameter(c28807khj, "");
            this.OLrzqt = c28807khj;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ TaskDescription(o.C28807khj r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
            /*
                r32 = this;
                r0 = r34 & 1
                if (r0 == 0) goto L3c
                o.khj r0 = new o.khj
                r1 = r0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 268435455(0xfffffff, float:2.5243547E-29)
                r31 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                r1 = r32
                goto L40
            L3c:
                r1 = r32
                r0 = r33
            L40:
                r1.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.InterfaceC28740kgV.TaskDescription.<init>(o.khj, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
