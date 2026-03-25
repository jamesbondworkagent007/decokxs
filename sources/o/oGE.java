package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGE {
    public static final TaskDescription Companion = new TaskDescription(null);

    @yCM
    public oGE() {
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final int AEQbTJ(@NotNull java.util.List<C35254nrp> list, long j, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        int i = 0;
        for (C35254nrp c35254nrp : list) {
            if (c35254nrp.OLrzqt().getSeq() == j) {
                return i;
            }
            if (str != null && Intrinsics.EZpvd((java.lang.Object) c35254nrp.OLrzqt().getClientMessageId(), (java.lang.Object) str)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
