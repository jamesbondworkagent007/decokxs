package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yMM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMO {
    public final java.util.Map<C56933yXs, java.util.List<yMM>> EZpvd;
    public final java.util.List<yMM> KWHzl;
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public static final yMO AEQbTJ = new yMO(yDY.gEmmrt(yMM.TaskDescription.copydefault, yMM.Activity.copydefault, yMM.Application.copydefault, yMM.ActionBar.copydefault));

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yMO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final yMO AEQbTJ() {
            return yMO.AEQbTJ;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.yMM> */
    /* JADX WARN: Multi-variable type inference failed */
    public yMO(@NotNull java.util.List<? extends yMM> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            C56933yXs c56933yXsEZpvd = ((yMM) obj).EZpvd();
            java.lang.Object arrayList = linkedHashMap.get(c56933yXsEZpvd);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(c56933yXsEZpvd, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        this.EZpvd = linkedHashMap;
    }

    public final yMM KWHzl(@NotNull C56933yXs c56933yXs, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(str, "");
        TaskDescription taskDescriptionCopydefault = copydefault(c56933yXs, str);
        if (taskDescriptionCopydefault != null) {
            return taskDescriptionCopydefault.KWHzl();
        }
        return null;
    }

    public final TaskDescription copydefault(@NotNull C56933yXs c56933yXs, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<yMM> list = this.EZpvd.get(c56933yXs);
        if (list == null) {
            return null;
        }
        for (yMM ymm : list) {
            if (C59449zhJ.startsWith$default(str, ymm.copydefault(), false, 2, null)) {
                java.lang.String strSubstring = str.substring(ymm.copydefault().length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                java.lang.Integer numCopydefault = copydefault(strSubstring);
                if (numCopydefault != null) {
                    return new TaskDescription(ymm, numCopydefault.intValue());
                }
            }
        }
        return null;
    }

    public static final class TaskDescription {
        public final yMM EZpvd;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final yMM AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final yMM KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "KindWithArity(kind=" + this.EZpvd + ", arity=" + this.copydefault + ')';
        }

        public TaskDescription(@NotNull yMM ymm, int i) {
            Intrinsics.checkNotNullParameter(ymm, "");
            this.EZpvd = ymm;
            this.copydefault = i;
        }
    }

    public final java.lang.Integer copydefault(java.lang.String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iCharAt = str.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i = (i * 10) + iCharAt;
        }
        return java.lang.Integer.valueOf(i);
    }
}
