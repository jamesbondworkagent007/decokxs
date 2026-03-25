package o;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5098Eq extends C5101Et {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.util.List<C5101Et> AhwBna;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Eq$Activity) A[MD:(o.Eq$Activity):void (m)] call: o.Eq.<init>(o.Eq$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C5098Eq(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C5101Et> OLrzqt() {
        return this.AhwBna;
    }

    public C5098Eq(Activity activity) {
        super(AbstractC5105Ex.PictureInPictureParams.KWHzl, activity.AEQbTJ());
        this.AhwBna = activity.OLrzqt();
    }

    /* JADX INFO: renamed from: o.Eq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Eq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.Eq$Activity */
    public static final class Activity {
        public final java.util.List<C5101Et> AEQbTJ = new java.util.ArrayList();
        public final java.util.Set<InterfaceC5096Eo> EZpvd = new LinkedHashSet();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Set<InterfaceC5096Eo> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C5101Et> OLrzqt() {
            return this.AEQbTJ;
        }

        public final void EZpvd(@NotNull C5101Et c5101Et) {
            Intrinsics.checkNotNullParameter(c5101Et, "");
            c5101Et.AEQbTJ(this.AEQbTJ.size());
            this.AEQbTJ.add(c5101Et);
        }

        public final void KWHzl(@NotNull InterfaceC5096Eo interfaceC5096Eo) {
            Intrinsics.checkNotNullParameter(interfaceC5096Eo, "");
            this.EZpvd.add(interfaceC5096Eo);
        }

        public final C5098Eq KWHzl() {
            return new C5098Eq(this, null);
        }
    }
}
