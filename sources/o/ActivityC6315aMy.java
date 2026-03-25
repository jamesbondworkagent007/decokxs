package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aMy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6315aMy extends AbstractActivityC6316aMz {
    public AbstractC5667aAm KWHzl;

    @Override // o.AbstractActivityC6316aMz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        AbstractC5667aAm abstractC5667aAmEZpvd = AbstractC5667aAm.EZpvd(getLayoutInflater());
        this.KWHzl = abstractC5667aAmEZpvd;
        setContentView(abstractC5667aAmEZpvd != null ? abstractC5667aAmEZpvd.getRoot() : null);
        AbstractC5667aAm abstractC5667aAm = this.KWHzl;
        if (abstractC5667aAm != null) {
            abstractC5667aAm.KWHzl.AEQbTJ().setVisibility(0);
            android.widget.ImageView imageViewAEQbTJ = abstractC5667aAm.KWHzl.AEQbTJ();
            imageViewAEQbTJ.setOnClickListener(new Application(imageViewAEQbTJ, 1000L, this));
            abstractC5667aAm.KWHzl.setType(0);
            abstractC5667aAm.KWHzl.setStatus(5);
            abstractC5667aAm.KWHzl.setTitleText(getString(C8206ayP.Dialog.DCUTEIddSDPG));
            abstractC5667aAm.KWHzl.setSubTitleText("");
            wYF wyfOLrzqt = abstractC5667aAm.KWHzl.OLrzqt();
            C52794wYp c52794wYpCopydefault = wyfOLrzqt.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.htlTjW));
            }
            C52794wYp c52794wYpCopydefault2 = wyfOLrzqt.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setOnClickListener(new StateListAnimator(c52794wYpCopydefault2, 1000L, abstractC5667aAm));
            }
            C52794wYp c52794wYpAEQbTJ = wyfOLrzqt.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aMB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6315aMy.OLrzqt((OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: o.aMy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC6315aMy KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC6315aMy activityC6315aMy) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = activityC6315aMy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.setResult(0);
                this.KWHzl.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.aMy$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ AbstractC5667aAm EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, AbstractC5667aAm abstractC5667aAm) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = abstractC5667aAm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl.AEQbTJ().performClick();
            }
        }
    }

    @Override // o.AbstractActivityC6316aMz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6316aMz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6316aMz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6316aMz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
