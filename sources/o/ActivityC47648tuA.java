package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;

/* JADX INFO: renamed from: o.tuA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC47648tuA extends AbstractActivityC33041mov {
    public boolean AEQbTJ;
    public C46264tNx KWHzl;

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46264tNx c46264tNxCopydefault = C46264tNx.copydefault(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c46264tNxCopydefault, "");
        setContentView(c46264tNxCopydefault.getRoot());
        this.KWHzl = c46264tNxCopydefault;
        C33537myN c33537myN = c46264tNxCopydefault.copydefault;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C46264tNx c46264tNx = null;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.tuw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47648tuA.OLrzqt(this.OLrzqt, view);
                }
            });
            AEQbTJ(c46264tNxCopydefault);
            C46264tNx c46264tNx2 = this.KWHzl;
            if (c46264tNx2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46264tNx = c46264tNx2;
            }
            c46264tNx.getRoot().post(new java.lang.Runnable() { // from class: o.tuy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC47648tuA.KWHzl(this.AEQbTJ);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void OLrzqt(ActivityC47648tuA activityC47648tuA, android.view.View view) {
        activityC47648tuA.finish();
    }

    public static final void KWHzl(ActivityC47648tuA activityC47648tuA) {
        if (activityC47648tuA.AEQbTJ) {
            return;
        }
        activityC47648tuA.AEQbTJ = true;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC47648tuA, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(C46264tNx c46264tNx) {
        c46264tNx.KWHzl.setText(KWHzl(C47501trL.Fragment.DGUQLIdZmdUa, C47501trL.Fragment.gtCCJH, "{unlockOrbiterPlus}"));
        c46264tNx.AEQbTJ.setText(KWHzl(C47501trL.Fragment.zSsVtY, C47501trL.Fragment.fBE, "{increaseCredibility}"));
        c46264tNx.OLrzqt.setText(KWHzl(C47501trL.Fragment.DGUQLIOvDItG, C47501trL.Fragment.DGUQLIDGUQLI, "{focusOnResults}"));
    }

    public final java.lang.CharSequence KWHzl(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, java.lang.String str) {
        java.lang.String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String strReplace$default = C59449zhJ.replace$default(string2, str, "", false, 4, (java.lang.Object) null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) string);
        spannableStringBuilder.setSpan(new android.text.style.TextAppearanceSpan(this, C52761wXj.LoaderManager.sSMYrx), 0, spannableStringBuilder.length(), 33);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) strReplace$default);
        spannableStringBuilder.setSpan(new android.text.style.TextAppearanceSpan(this, C52761wXj.LoaderManager.valueOf), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
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
