package o;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yVP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56731yQf {
    public static final Activity OLrzqt = new Activity(null);
    public final C59083zaO AEQbTJ;
    public final yPU KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.zaO), (r2v0 o.yPU) A[MD:(o.zaO, o.yPU):void (m)] call: o.yQf.<init>(o.zaO, o.yPU):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C56731yQf(C59083zaO c59083zaO, yPU ypu, DefaultConstructorMarker defaultConstructorMarker) {
        this(c59083zaO, ypu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59083zaO OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yPU copydefault() {
        return this.KWHzl;
    }

    public C56731yQf(C59083zaO c59083zaO, yPU ypu) {
        this.AEQbTJ = c59083zaO;
        this.KWHzl = ypu;
    }

    public final yNP EZpvd() {
        return this.AEQbTJ.fetchVPNInfo();
    }

    /* JADX INFO: renamed from: o.yQf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yQf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C56731yQf OLrzqt(@NotNull java.lang.ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter(classLoader, "");
            C56732yQg c56732yQg = new C56732yQg(classLoader);
            yVP.Activity activity = yVP.KWHzl;
            java.lang.ClassLoader classLoader2 = Unit.class.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader2, "");
            yVP.Activity.TaskDescription taskDescriptionEZpvd = activity.EZpvd(c56732yQg, new C56732yQg(classLoader2), new yPZ(classLoader), "runtime module for " + classLoader, C56729yQd.copydefault, C56737yQl.EZpvd);
            return new C56731yQf(taskDescriptionEZpvd.KWHzl().KWHzl(), new yPU(taskDescriptionEZpvd.AEQbTJ(), c56732yQg), null);
        }
    }
}
