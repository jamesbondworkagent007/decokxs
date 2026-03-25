package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.google.android.material.appbar.AppBarLayout;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.components.track.TrackChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.giV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC20522giV extends AbstractActivityC33013moT implements InterfaceC20523giW {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public AbstractC16296ehJ OLrzqt;

    /* JADX INFO: renamed from: o.giV$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.giV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, TransactionInfo transactionInfo, boolean z, java.util.ArrayList<java.lang.Long> arrayList, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC20522giV.class);
            intent.putExtras(C20634gkb.Companion.AEQbTJ(str, str2, transactionInfo, z, arrayList, num));
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.OLrzqt = (AbstractC16296ehJ) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QfsBiF);
        OLrzqt();
        C20634gkb c20634gkb = new C20634gkb();
        c20634gkb.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.putInt, c20634gkb).commitAllowingStateLoss();
        C32866mlf.onEvent$default("SelectCrypto_Landing_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.giU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20522giV.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(ActivityC20522giV activityC20522giV) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20522giV, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void OLrzqt() {
        AbstractC16296ehJ abstractC16296ehJ = this.OLrzqt;
        if (abstractC16296ehJ == null) {
            Intrinsics.gEmmrt("");
            abstractC16296ehJ = null;
        }
        abstractC16296ehJ.OLrzqt.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OxbLUn));
        abstractC16296ehJ.EZpvd.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.giT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20522giV.KWHzl(this.EZpvd, view);
            }
        });
        abstractC16296ehJ.OLrzqt.setExpandedTitleMarginBottom(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        abstractC16296ehJ.OLrzqt.setExpandedTitleMarginTop(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public static final void KWHzl(ActivityC20522giV activityC20522giV, android.view.View view) {
        activityC20522giV.getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        super.addConfig();
        C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.copydefault);
    }

    public final void EZpvd() {
        ((AppBarLayout) findViewById(C13754dXa.ActionBar.AxsJAYsNCnLh)).setExpanded(false, true);
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
