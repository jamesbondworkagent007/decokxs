package o;

import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32982mnp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractActivityC33007moN extends AbstractActivityC33041mov {
    public androidx.fragment.app.Fragment OLrzqt;
    public AbstractC33093mpu copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public static final java.lang.String EZpvd = "single_fragment";

    public abstract java.lang.CharSequence EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.Fragment KWHzl() {
        return this.OLrzqt;
    }

    public abstract androidx.fragment.app.Fragment copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AbstractC33093mpu abstractC33093mpu) {
        Intrinsics.checkNotNullParameter(abstractC33093mpu, "");
        this.copydefault = abstractC33093mpu;
    }

    public final boolean valueOf() {
        return false;
    }

    public final AbstractC33093mpu djBIcL() {
        AbstractC33093mpu abstractC33093mpu = this.copydefault;
        if (abstractC33093mpu != null) {
            return abstractC33093mpu;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault((AbstractC33093mpu) DataBindingUtil.setContentView(this, C32982mnp.Activity.copydefault));
        djBIcL().EZpvd(valueOf());
        setSupportActionBar(djBIcL().EZpvd);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        androidx.appcompat.app.ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowHomeEnabled(false);
        }
        androidx.appcompat.app.ActionBar supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.setTitle((java.lang.CharSequence) null);
        }
        djBIcL().djBIcL.setText(EZpvd());
        if (bundle == null) {
            this.OLrzqt = copydefault();
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int i = C32982mnp.StateListAnimator.AhwBna;
            androidx.fragment.app.Fragment fragment = this.OLrzqt;
            Intrinsics.copydefault(fragment);
            fragmentTransactionBeginTransaction.add(i, fragment, EZpvd).commit();
            return;
        }
        this.OLrzqt = getSupportFragmentManager().findFragmentByTag(EZpvd);
    }

    /* JADX INFO: renamed from: o.moN$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.moN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String EZpvd() {
            return AbstractActivityC33007moN.EZpvd;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
