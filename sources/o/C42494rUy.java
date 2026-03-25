package o;

import androidx.appcompat.app.AppCompatActivity;
import com.flyco.tablayout.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mMP;

/* JADX INFO: renamed from: o.rUy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42494rUy extends AbstractC43215rlA implements mMP {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final int OLrzqt = 1;
    public final int AEQbTJ = BuildConfig.VERSION_CODE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "OKCompliance app&cefi mode switch";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return false;
    }

    /* JADX INFO: renamed from: o.rUy$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rUy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
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
        rUE rue = new rUE();
        androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) activityAEQbTJ).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        rue.show(supportFragmentManager);
        return true;
    }
}
