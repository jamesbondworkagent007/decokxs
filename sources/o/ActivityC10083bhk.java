package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bhk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC10083bhk extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public AbstractC16410ejR KWHzl;
    public long OLrzqt = Long.MIN_VALUE;

    /* JADX INFO: renamed from: o.bhk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bhk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void OLrzqt(@NotNull android.content.Context context, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC10083bhk.class);
            intent.putExtra("chain_id", j);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = (AbstractC16410ejR) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.fjfviF);
        this.OLrzqt = getIntent().getLongExtra("chain_id", Long.MIN_VALUE);
        OLrzqt();
        AEQbTJ();
        C32866mlf.onEvent$default("Web3WalletHomepage_ManageCrypto_RecentlyRemoved_View", (TrackChannel[]) null, new Function1() { // from class: o.bhr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10083bhk.OLrzqt(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.bhn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC10083bhk.OLrzqt(this.OLrzqt);
            }
        });
    }

    public static final Unit OLrzqt(ActivityC10083bhk activityC10083bhk, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("network_selection", activityC10083bhk.copydefault(activityC10083bhk.OLrzqt), true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC10083bhk activityC10083bhk) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC10083bhk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void OLrzqt() {
        AbstractC16413ejU abstractC16413ejU;
        android.widget.ImageView imageView;
        AbstractC16413ejU abstractC16413ejU2;
        android.widget.TextView textView;
        AbstractC16413ejU abstractC16413ejU3;
        android.widget.ImageView imageView2;
        AbstractC16410ejR abstractC16410ejR = this.KWHzl;
        if (abstractC16410ejR != null && (abstractC16413ejU3 = abstractC16410ejR.copydefault) != null && (imageView2 = abstractC16413ejU3.OLrzqt) != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.bhq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC10083bhk.OLrzqt(this.EZpvd, view);
                }
            });
        }
        AbstractC16410ejR abstractC16410ejR2 = this.KWHzl;
        if (abstractC16410ejR2 != null && (abstractC16413ejU2 = abstractC16410ejR2.copydefault) != null && (textView = abstractC16413ejU2.KWHzl) != null) {
            textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.requestPostMessageChannel));
        }
        AbstractC16410ejR abstractC16410ejR3 = this.KWHzl;
        if (abstractC16410ejR3 == null || (abstractC16413ejU = abstractC16410ejR3.copydefault) == null || (imageView = abstractC16413ejU.copydefault) == null) {
            return;
        }
        imageView.setVisibility(8);
    }

    public static final void OLrzqt(ActivityC10083bhk activityC10083bhk, android.view.View view) {
        java.lang.Object systemService = activityC10083bhk.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        activityC10083bhk.onBackPressed();
    }

    public final void AEQbTJ() {
        getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.gCNefq, C10087bho.Companion.AEQbTJ(this.OLrzqt), C56524yIo.AEQbTJ(C10087bho.class).valueOf()).commitAllowingStateLoss();
    }

    private final java.lang.String copydefault(long j) {
        C10854bwM c10854bwMKWHzl;
        if (j == Long.MIN_VALUE) {
            return "allnetwork";
        }
        C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        java.lang.String strFJNWhG = (c10854bwMKWHzl2 == null || (c10854bwMKWHzl = c10854bwMKWHzl2.KWHzl()) == null) ? null : c10854bwMKWHzl.fJNWhG();
        return strFJNWhG == null ? "" : strFJNWhG;
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
