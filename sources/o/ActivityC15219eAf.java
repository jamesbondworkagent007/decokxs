package o;

import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.eBD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eAf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15219eAf extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public AbstractC16327eho AEQbTJ;
    public java.lang.String EZpvd = "";

    /* JADX INFO: renamed from: o.eAf$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eAf.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC15219eAf.class);
            intent.putExtra("wallet_id", str);
            context.startActivity(intent);
        }
    }

    private final void AEQbTJ() {
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.EZpvd = stringExtra;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eBD.TaskDescription.newInstance$default(o.eBD$TaskDescription, java.lang.String, int, int, java.lang.Object):o.eBD */
    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.AEQbTJ = (AbstractC16327eho) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.AubY);
        AEQbTJ();
        AbstractC16327eho abstractC16327eho = this.AEQbTJ;
        if (abstractC16327eho == null) {
            Intrinsics.gEmmrt("");
            abstractC16327eho = null;
        }
        abstractC16327eho.OLrzqt.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSession));
        AbstractC16327eho abstractC16327eho2 = this.AEQbTJ;
        if (abstractC16327eho2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16327eho2 = null;
        }
        abstractC16327eho2.OLrzqt.setTitleTypeface("harmony_sans_bold.ttf");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.getSessionActivity, eBD.TaskDescription.newInstance$default(eBD.Companion, this.EZpvd, 0, 2, null));
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC15219eAf.copydefault(this.KWHzl);
            }
        });
    }

    public static final void copydefault(ActivityC15219eAf activityC15219eAf) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC15219eAf, true, (java.lang.String) null, 2, (java.lang.Object) null);
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
