package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56764yRl {
    java.util.Set<java.lang.String> AEQbTJ(@NotNull C56933yXs c56933yXs);

    InterfaceC56840yUg AEQbTJ(@NotNull C56933yXs c56933yXs, boolean z);

    yTT EZpvd(@NotNull TaskDescription taskDescription);

    /* JADX INFO: renamed from: o.yRl$TaskDescription */
    public static final class TaskDescription {
        public final byte[] KWHzl;
        public final yTT OLrzqt;
        public final C56929yXo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56929yXo copydefault() {
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
            return Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            byte[] bArr = this.KWHzl;
            int iHashCode2 = bArr == null ? 0 : java.util.Arrays.hashCode(bArr);
            yTT ytt = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (ytt != null ? ytt.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Request(classId=" + this.copydefault + ", previouslyFoundClassFileContent=" + java.util.Arrays.toString(this.KWHzl) + ", outerClass=" + this.OLrzqt + ')';
        }

        public TaskDescription(@NotNull C56929yXo c56929yXo, byte[] bArr, yTT ytt) {
            Intrinsics.checkNotNullParameter(c56929yXo, "");
            this.copydefault = c56929yXo;
            this.KWHzl = bArr;
            this.OLrzqt = ytt;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 o.yXo)
  (wrap:byte[]:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null byte[]) : (r3v0 byte[]))
  (wrap:o.yTT:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.yTT) : (r4v0 o.yTT))
 A[MD:(o.yXo, byte[], o.yTT):void (m)] (LINE:14) call: o.yRl.TaskDescription.<init>(o.yXo, byte[], o.yTT):void type: THIS */
        public /* synthetic */ TaskDescription(C56929yXo c56929yXo, byte[] bArr, yTT ytt, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c56929yXo, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : ytt);
        }
    }
}
