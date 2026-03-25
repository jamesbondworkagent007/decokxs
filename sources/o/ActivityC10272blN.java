package o;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10347bmj;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.blN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC10272blN extends AbstractActivityC10263blE {
    public C16341eiB EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C16341eiB c16341eiB) {
        Intrinsics.checkNotNullParameter(c16341eiB, "");
        this.EZpvd = c16341eiB;
    }

    /* JADX DEBUG: Possible override for method o.blE.OLrzqt()V */
    public final C16341eiB OLrzqt() {
        C16341eiB c16341eiB = this.EZpvd;
        if (c16341eiB != null) {
            return c16341eiB;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractActivityC10263blE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt(C16341eiB.EZpvd(getLayoutInflater()));
        setContentView(OLrzqt().getRoot());
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.onStatusChanged, C10275blQ.Companion.copydefault(getIntent().getExtras()));
        fragmentTransactionBeginTransaction.commit();
        OLrzqt().EZpvd.setBackListener(new View.OnClickListener() { // from class: o.blM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC10272blN.onCreate$lambda$1(view);
            }
        });
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.blK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC10272blN.AEQbTJ(this.copydefault);
            }
        });
        C14646dpQ.EZpvd(this, C10350bmm.AEQbTJ.AEQbTJ(), Lifecycle.State.CREATED, new Function1() { // from class: o.blL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10272blN.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final void onCreate$lambda$1(android.view.View view) {
        C10350bmm.AEQbTJ.AEQbTJ(AbstractC10347bmj.ActionBar.copydefault);
    }

    public static final void AEQbTJ(ActivityC10272blN activityC10272blN) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC10272blN, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(ActivityC10272blN activityC10272blN, boolean z) {
        if (z) {
            activityC10272blN.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C10350bmm.AEQbTJ.AEQbTJ(AbstractC10347bmj.ActionBar.copydefault);
    }

    @Override // o.AbstractActivityC10263blE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC10263blE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC10263blE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC10263blE, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
