package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final java.lang.Object KWHzl = new java.lang.Object();
    public static final java.util.Map<java.lang.String, IX> copydefault = new LinkedHashMap();
    public final InterfaceC5215Jd AEQbTJ;
    public final IZ OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IX.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IX(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5215Jd EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IZ copydefault() {
        return this.OLrzqt;
    }

    private IX() {
        this.AEQbTJ = new C5212Ja();
        this.OLrzqt = new IW();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final IX KWHzl(@NotNull java.lang.String str) {
            IX ix;
            Intrinsics.checkNotNullParameter(str, "");
            synchronized (IX.KWHzl) {
                java.util.Map map = IX.copydefault;
                java.lang.Object ix2 = map.get(str);
                if (ix2 == null) {
                    ix2 = new IX(null);
                    map.put(str, ix2);
                }
                ix = (IX) ix2;
            }
            return ix;
        }
    }
}
