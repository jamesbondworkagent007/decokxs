package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.C45716svX;

/* JADX INFO: renamed from: o.sxx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC45804sxx extends AbstractActivityC33009moP<AbstractC45717svY> {
    public final int copydefault = C45716svX.StateListAnimator.OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33009moP
    public int bd_() {
        return this.copydefault;
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt();
        AhwBna().copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.sxz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC45804sxx.OLrzqt(this.OLrzqt, view);
            }
        });
        AhwBna().OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.sxB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC45804sxx.copydefault(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(ActivityC45804sxx activityC45804sxx, android.view.View view) {
        activityC45804sxx.finish();
    }

    public static final void copydefault(ActivityC45804sxx activityC45804sxx, android.view.View view) {
        activityC45804sxx.finish();
    }

    public final void OLrzqt() {
        java.lang.String string = getString(C45716svX.TaskDescription.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = getString(C45716svX.TaskDescription.KWHzl);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = getString(C45716svX.TaskDescription.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        java.lang.String string4 = getString(C45716svX.TaskDescription.copydefault);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        android.text.SpannableString spannableString2 = new android.text.SpannableString(string2);
        android.text.SpannableString spannableString3 = new android.text.SpannableString(string3);
        android.text.SpannableString spannableString4 = new android.text.SpannableString(string4);
        spannableString.setSpan(new StateListAnimator(string, this), 0, string.length(), 33);
        spannableString2.setSpan(new Application(string2, this), 0, string2.length(), 33);
        spannableString3.setSpan(new ActionBar(string3, this), 0, string3.length(), 33);
        spannableString4.setSpan(new TaskDescription(string4, this), 0, string4.length(), 33);
        AhwBna().gEmmrt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        AhwBna().djBIcL.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        AhwBna().fARcdN.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        AhwBna().fIwbmz.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        AhwBna().gEmmrt.setText(spannableString);
        AhwBna().djBIcL.setText(spannableString2);
        AhwBna().fARcdN.setText(spannableString3);
        AhwBna().fIwbmz.setText(spannableString4);
    }

    /* JADX INFO: renamed from: o.sxx$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ ActivityC45804sxx KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        public StateListAnimator(java.lang.String str, ActivityC45804sxx activityC45804sxx) {
            this.copydefault = str;
            this.KWHzl = activityC45804sxx;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(this.copydefault));
            this.KWHzl.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: o.sxx$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ ActivityC45804sxx KWHzl;

        public Application(java.lang.String str, ActivityC45804sxx activityC45804sxx) {
            this.EZpvd = str;
            this.KWHzl = activityC45804sxx;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(this.EZpvd));
            this.KWHzl.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: o.sxx$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ ActivityC45804sxx OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        public ActionBar(java.lang.String str, ActivityC45804sxx activityC45804sxx) {
            this.copydefault = str;
            this.OLrzqt = activityC45804sxx;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(this.copydefault));
            this.OLrzqt.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: o.sxx$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ ActivityC45804sxx EZpvd;

        public TaskDescription(java.lang.String str, ActivityC45804sxx activityC45804sxx) {
            this.AEQbTJ = str;
            this.EZpvd = activityC45804sxx;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(this.AEQbTJ));
            this.EZpvd.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
