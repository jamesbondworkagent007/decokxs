package o;

import android.view.View;
import androidx.core.content.IntentCompat;
import com.okinc.business.market.features.coindetail.ui.image_view.TokenImageParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.jPd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC26025jPd extends jOX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.jPc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC26025jPd.copydefault(this.OLrzqt);
        }
    });
    public C23383hxG gEmmrt;

    /* JADX INFO: renamed from: o.jPd$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jPd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Possible override for method o.jOX.OLrzqt()V */
    public final TokenImageParams OLrzqt() {
        return (TokenImageParams) this.djBIcL.getValue();
    }

    public static final TokenImageParams copydefault(ActivityC26025jPd activityC26025jPd) {
        TokenImageParams tokenImageParams;
        android.content.Intent intent = activityC26025jPd.getIntent();
        return (intent == null || (tokenImageParams = (TokenImageParams) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "key.token_image_url", TokenImageParams.class))) == null) ? new TokenImageParams(null, false, 3, null) : tokenImageParams;
    }

    @Override // o.jOX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C23383hxG c23383hxGEZpvd = C23383hxG.EZpvd(getLayoutInflater());
        this.gEmmrt = c23383hxGEZpvd;
        setContentView(c23383hxGEZpvd != null ? c23383hxGEZpvd.getRoot() : null);
        AhwBna();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.jPe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC26025jPd.KWHzl(this.OLrzqt);
            }
        });
    }

    public static final void KWHzl(ActivityC26025jPd activityC26025jPd) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC26025jPd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        C23383hxG c23383hxG = this.gEmmrt;
        if (c23383hxG != null) {
            C33537myN c33537myN = c23383hxG.copydefault;
            c33537myN.setBackVisible(0);
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.jPg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC26025jPd.copydefault(this.KWHzl, view);
                }
            });
            ScaleGestureDetectorOnScaleGestureListenerC7495aks scaleGestureDetectorOnScaleGestureListenerC7495aks = c23383hxG.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(scaleGestureDetectorOnScaleGestureListenerC7495aks, "");
            C33054mpH.AEQbTJ(scaleGestureDetectorOnScaleGestureListenerC7495aks, OLrzqt().EZpvd());
            C52794wYp c52794wYp = c23383hxG.EZpvd;
            Intrinsics.copydefault(c52794wYp);
            c52794wYp.setVisibility(OLrzqt().OLrzqt() ? 0 : 8);
            c52794wYp.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        }
    }

    public static final void copydefault(ActivityC26025jPd activityC26025jPd, android.view.View view) {
        activityC26025jPd.finish();
    }

    /* JADX INFO: renamed from: o.jPd$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC26025jPd EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC26025jPd activityC26025jPd) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = activityC26025jPd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityC26025jPd activityC26025jPd = this.EZpvd;
                C25352ivB.AEQbTJ(activityC26025jPd, activityC26025jPd.OLrzqt().EZpvd());
            }
        }
    }

    @Override // o.jOX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.jOX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.jOX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.jOX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
