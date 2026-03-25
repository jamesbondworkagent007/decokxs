package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class jWM {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ;
    public final C26235jWy EZpvd;
    public final android.content.Context KWHzl;
    public int copydefault;

    @yCM
    public jWM(@NotNull C26235jWy c26235jWy, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(c26235jWy, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = c26235jWy;
        this.KWHzl = context;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        this.AEQbTJ = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        this.copydefault = C33512mxp.tradeFallDefault$default(c33512mxp, context, 0.0f, 2, null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jWM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault() {
        return new kotlin.Pair<>(java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.DLGVGj)), java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.zzQwtT)));
    }
}
