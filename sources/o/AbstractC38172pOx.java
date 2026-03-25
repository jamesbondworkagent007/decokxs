package o;

import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.pOx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC38172pOx {
    public final long copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: o.pOx.<init>(long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC38172pOx(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long EZpvd() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.pOx$Application */
    public static final class Application extends AbstractC38172pOx {
        public final long AEQbTJ;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: o.pOx.Application.<init>(long):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy--R2X_6o$default, reason: not valid java name */
        public static /* synthetic */ Application m8705copyR2X_6o$default(Application application, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = application.AEQbTJ;
            }
            return application.OLrzqt(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC38172pOx
        public long EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(long j) {
            return new Application(j, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && TextUnit.m5592equalsimpl0(this.AEQbTJ, ((Application) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return TextUnit.m5596hashCodeimpl(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Width(min=" + TextUnit.m5602toStringimpl(this.AEQbTJ) + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0006: INVOKE 
  (wrap:androidx.compose.ui.unit.TextUnit$Companion:0x0004: SGET  A[WRAPPED] (LINE:37) androidx.compose.ui.unit.TextUnit.Companion androidx.compose.ui.unit.TextUnit$Companion)
 VIRTUAL call: androidx.compose.ui.unit.TextUnit.Companion.getUnspecified-XSAIIZE():long A[MD:():long (m), WRAPPED] (LINE:37)) : (r1v0 long))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(long, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:37) call: o.pOx.Application.<init>(long, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
        public /* synthetic */ Application(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? TextUnit.Companion.m5606getUnspecifiedXSAIIZE() : j, null);
        }

        public Application(long j) {
            super(j, null);
            this.AEQbTJ = j;
        }
    }

    public AbstractC38172pOx(long j) {
        this.copydefault = j;
    }

    /* JADX INFO: renamed from: o.pOx$Activity */
    public static final class Activity extends AbstractC38172pOx {
        public final long EZpvd;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: o.pOx.Activity.<init>(long):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy--R2X_6o$default, reason: not valid java name */
        public static /* synthetic */ Activity m8704copyR2X_6o$default(Activity activity, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = activity.EZpvd;
            }
            return activity.AEQbTJ(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(long j) {
            return new Activity(j, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC38172pOx
        public long EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && TextUnit.m5592equalsimpl0(this.EZpvd, ((Activity) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return TextUnit.m5596hashCodeimpl(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Height(min=" + TextUnit.m5602toStringimpl(this.EZpvd) + ")";
        }

        public Activity(long j) {
            super(j, null);
            this.EZpvd = j;
        }
    }
}
