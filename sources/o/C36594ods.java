package o;

import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ods, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36594ods implements InterfaceC35277nsL {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.ods$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.ods$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ods.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC35277nsL
    public boolean copydefault(@NotNull C35239nra c35239nra) {
        RelationInfo relationInfoKWHzl;
        Intrinsics.checkNotNullParameter(c35239nra, "");
        if (Application.KWHzl[c35239nra.OLrzqt().getConversationType().ordinal()] != 1 || (relationInfoKWHzl = c35239nra.KWHzl()) == null) {
            return false;
        }
        return relationInfoKWHzl.isBlackList();
    }
}
