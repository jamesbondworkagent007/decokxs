package o;

import android.view.View;
import android.view.ViewGroup;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public final class tGE extends AbstractActivityC33041mov {
    public boolean AEQbTJ;
    public C46256tNp copydefault;

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46256tNp c46256tNpOLrzqt = C46256tNp.OLrzqt(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c46256tNpOLrzqt, "");
        setContentView(c46256tNpOLrzqt.getRoot());
        this.copydefault = c46256tNpOLrzqt;
        C33537myN c33537myN = c46256tNpOLrzqt.AEQbTJ;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C46256tNp c46256tNp = null;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.tGC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    tGE.AEQbTJ(this.KWHzl, view);
                }
            });
            c33537myN.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.zYHWMc));
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(getIntent().getStringExtra(JwtUtilsKt.DID_METHOD_KEY));
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(getIntent().getStringExtra("pageSource"));
            getSupportFragmentManager().beginTransaction().replace(C47501trL.TaskDescription.DfrfUJ, C46083tHe.Companion.AEQbTJ(strGEmmrt, C33129mqd.gEmmrt(getIntent().getStringExtra("content")), strGEmmrt2)).commit();
            C46256tNp c46256tNp2 = this.copydefault;
            if (c46256tNp2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46256tNp = c46256tNp2;
            }
            c46256tNp.getRoot().post(new java.lang.Runnable() { // from class: o.tGD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    tGE.KWHzl(this.copydefault);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void AEQbTJ(tGE tge, android.view.View view) {
        tge.finish();
    }

    public static final void KWHzl(tGE tge) {
        if (tge.AEQbTJ) {
            return;
        }
        tge.AEQbTJ = true;
        rVN.reportFullyDrawn$default((android.app.Activity) tge, true, (java.lang.String) null, 2, (java.lang.Object) null);
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
