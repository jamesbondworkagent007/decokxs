package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56740yQo implements yTN {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final C56935yXu copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.yXu) A[MD:(o.yXu):void (m)] call: o.yQo.<init>(o.yXu):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC56740yQo(C56935yXu c56935yXu, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56935yXu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yTN
    public C56935yXu AEQbTJ() {
        return this.copydefault;
    }

    public AbstractC56740yQo(C56935yXu c56935yXu) {
        this.copydefault = c56935yXu;
    }

    /* JADX INFO: renamed from: o.yQo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yQo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC56740yQo copydefault(@NotNull java.lang.Object obj, C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(obj, "");
            return C56743yQr.AhwBna(obj.getClass()) ? new yQF(c56935yXu, (java.lang.Enum) obj) : obj instanceof java.lang.annotation.Annotation ? new C56745yQt(c56935yXu, (java.lang.annotation.Annotation) obj) : obj instanceof java.lang.Object[] ? new C56748yQw(c56935yXu, (java.lang.Object[]) obj) : obj instanceof java.lang.Class ? new C56751yQz(c56935yXu, (java.lang.Class) obj) : new yQJ(c56935yXu, obj);
        }
    }
}
