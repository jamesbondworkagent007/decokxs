package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.feg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC18241feg extends AbstractActivityC18255feu {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public AbstractC17002eua copydefault;

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    /* JADX INFO: renamed from: o.feg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.feg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull java.util.ArrayList<java.lang.Long> arrayList, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18241feg.class);
            intent.putExtra("coin_id_list", arrayList);
            intent.putExtra("banner_id", l);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC18255feu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC17002eua abstractC17002eua = (AbstractC17002eua) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.BVXAa);
        this.copydefault = abstractC17002eua;
        if (abstractC17002eua == null) {
            Intrinsics.gEmmrt("");
            abstractC17002eua = null;
        }
        AppCompatImageView appCompatImageView = abstractC17002eua.copydefault;
        Intrinsics.copydefault(appCompatImageView);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C33570myu.OLrzqt() + C55298xhM.dp2px$default(12.0f, null, 1, null);
            layoutParams2.leftMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
            appCompatImageView.setLayoutParams(layoutParams2);
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.fef
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC18241feg.KWHzl(this.EZpvd, view);
                }
            });
            if (bundle == null) {
                androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, C18254fet.class, null, null), "");
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            }
            getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fec
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC18241feg.KWHzl(this.KWHzl);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public static final void KWHzl(ActivityC18241feg activityC18241feg, android.view.View view) {
        activityC18241feg.finish();
    }

    public static final void KWHzl(ActivityC18241feg activityC18241feg) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18241feg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC18255feu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC18255feu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC18255feu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC18255feu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
