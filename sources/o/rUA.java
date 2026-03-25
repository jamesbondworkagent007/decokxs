package o;

import androidx.appcompat.app.AppCompatActivity;
import com.flyco.tablayout.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mMP;

/* JADX INFO: loaded from: classes10.dex */
public final class rUA extends AbstractC43215rlA implements mMP {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final int EZpvd = 1;
    public final int OLrzqt = BuildConfig.VERSION_CODE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "OKCompliance Feature restriction mock tool";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return false;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rUA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @Override // o.mMP
    public boolean onClick() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (!(activityAEQbTJ instanceof AppCompatActivity)) {
            return true;
        }
        rUZ ruz = new rUZ();
        androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) activityAEQbTJ).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        ruz.show(supportFragmentManager);
        return true;
    }
}
