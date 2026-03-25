package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5145Gl extends AbstractC56429yFa {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.util.Map<java.lang.String, java.lang.Object> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Gl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5145Gl copy$default(C5145Gl c5145Gl, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c5145Gl.EZpvd;
        }
        return c5145Gl.EZpvd(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5145Gl EZpvd(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new C5145Gl(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5145Gl) && Intrinsics.EZpvd(this.EZpvd, ((C5145Gl) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5145Gl(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        super(OLrzqt);
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = map;
    }

    /* JADX INFO: renamed from: o.Gl$TaskDescription */
    public static final class TaskDescription implements CoroutineContext.TaskDescription<C5145Gl> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Gl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5145Gl(@NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        this((java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.valueOf(pairArr));
        Intrinsics.checkNotNullParameter(pairArr, "");
    }

    public java.lang.String toString() {
        return "LoggingContextElement(" + this.EZpvd + ')';
    }
}
