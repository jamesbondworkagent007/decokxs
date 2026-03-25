package o;

import com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC25487ixe extends AbstractActivityC33013moT {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ixc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC25487ixe.AEQbTJ(this.AEQbTJ);
        }
    });
    public iGX copydefault;

    private final java.lang.String copydefault() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String AEQbTJ(ActivityC25487ixe activityC25487ixe) {
        android.content.Intent intent = activityC25487ixe.getIntent();
        return C33129mqd.gEmmrt(intent != null ? intent.getStringExtra("source") : null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (C25596izh.OLrzqt(this).KWHzl(this, new iBC(0, 0, 0, null, new Function0() { // from class: o.ixg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC25487ixe.copydefault(this.EZpvd);
            }
        }, 15, null))) {
            return;
        }
        iGX igxKWHzl = iGX.KWHzl(getLayoutInflater());
        this.copydefault = igxKWHzl;
        if (igxKWHzl == null) {
            Intrinsics.gEmmrt("");
            igxKWHzl = null;
        }
        setContentView(igxKWHzl.getRoot());
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.replace(C25493ixk.ActionBar.DMb, InvestHomeContainerFragment.Companion.copydefault(true));
        fragmentTransactionBeginTransaction.commit();
        KWHzl();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(ActivityC25487ixe activityC25487ixe) {
        activityC25487ixe.finish();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        KWHzl();
    }

    public final void KWHzl() {
        C27570jxg.investEvent$default("YieldHome_Full_Page_View", null, new Function1() { // from class: o.ixd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC25487ixe.AEQbTJ(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(ActivityC25487ixe activityC25487ixe, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) activityC25487ixe.copydefault())) {
            eventParamsList.put("source", activityC25487ixe.copydefault(), false);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
