package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ResultInfo {
    public static final Activity EZpvd = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ResultInfo$Application) A[MD:(o.ResultInfo$Application):void (m)] call: o.ResultInfo.<init>(o.ResultInfo$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ResultInfo(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public ResultInfo(Application application) {
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ResultInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "RevokeTokenResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(ResultInfo.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResultInfo.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Application {
        public final Application KWHzl() {
            return this;
        }

        public final ResultInfo AEQbTJ() {
            return new ResultInfo(this, null);
        }
    }
}
