package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yVX {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public static final Activity EZpvd = new Activity(JvmPrimitiveType.BOOLEAN);
    public static final Activity AEQbTJ = new Activity(JvmPrimitiveType.CHAR);
    public static final Activity OLrzqt = new Activity(JvmPrimitiveType.BYTE);
    public static final Activity valueOf = new Activity(JvmPrimitiveType.SHORT);
    public static final Activity djBIcL = new Activity(JvmPrimitiveType.INT);
    public static final Activity AhwBna = new Activity(JvmPrimitiveType.FLOAT);
    public static final Activity gEmmrt = new Activity(JvmPrimitiveType.LONG);
    public static final Activity KWHzl = new Activity(JvmPrimitiveType.DOUBLE);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yVX.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ yVX(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private yVX() {
    }

    public static final class Activity extends yVX {
        public final JvmPrimitiveType AYXKKw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JvmPrimitiveType valueOf() {
            return this.AYXKKw;
        }

        public Activity(JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.AYXKKw = jvmPrimitiveType;
        }
    }

    public static final class ActionBar extends yVX {
        public final java.lang.String AYXKKw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AYXKKw = str;
        }
    }

    public static final class Application extends yVX {
        public final yVX AYXKKw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final yVX valueOf() {
            return this.AYXKKw;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull yVX yvx) {
            super(null);
            Intrinsics.checkNotNullParameter(yvx, "");
            this.AYXKKw = yvx;
        }
    }

    public java.lang.String toString() {
        return yVW.copydefault.OLrzqt(this);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yVX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final Activity KWHzl() {
            return yVX.EZpvd;
        }

        public final Activity EZpvd() {
            return yVX.AEQbTJ;
        }

        public final Activity OLrzqt() {
            return yVX.OLrzqt;
        }

        public final Activity valueOf() {
            return yVX.valueOf;
        }

        public final Activity AhwBna() {
            return yVX.djBIcL;
        }

        public final Activity copydefault() {
            return yVX.AhwBna;
        }

        public final Activity djBIcL() {
            return yVX.gEmmrt;
        }

        public final Activity AEQbTJ() {
            return yVX.KWHzl;
        }
    }
}
