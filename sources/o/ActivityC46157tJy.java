package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.biz_userprofile.LinkXSuccessActivity$linkX$1;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;

/* JADX INFO: renamed from: o.tJy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC46157tJy extends AbstractActivityC33041mov {
    public AbstractC46226tMm AEQbTJ;
    public boolean EZpvd;
    public boolean copydefault;

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        android.widget.ImageView imageView;
        android.view.View root;
        super.onCreate(bundle);
        KWHzl(false);
        AbstractC46226tMm abstractC46226tMmOLrzqt = AbstractC46226tMm.OLrzqt(getLayoutInflater());
        this.AEQbTJ = abstractC46226tMmOLrzqt;
        setContentView(abstractC46226tMmOLrzqt != null ? abstractC46226tMmOLrzqt.getRoot() : null);
        AEQbTJ();
        AbstractC46226tMm abstractC46226tMm = this.AEQbTJ;
        if (abstractC46226tMm != null && (root = abstractC46226tMm.getRoot()) != null) {
            root.post(new java.lang.Runnable() { // from class: o.tJA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC46157tJy.copydefault(this.AEQbTJ);
                }
            });
        }
        AbstractC46226tMm abstractC46226tMm2 = this.AEQbTJ;
        if (abstractC46226tMm2 != null && (imageView = abstractC46226tMm2.EZpvd) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.tJw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC46157tJy.copydefault(this.copydefault, view);
                }
            });
        }
        AbstractC46226tMm abstractC46226tMm3 = this.AEQbTJ;
        if (abstractC46226tMm3 != null && (c52794wYp = abstractC46226tMm3.OLrzqt) != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.tJx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC46157tJy.KWHzl(this.copydefault, view);
                }
            });
        }
        C32866mlf.onEvent$default("Twitter_AccountLink_Successfully_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public static final void copydefault(ActivityC46157tJy activityC46157tJy) {
        if (activityC46157tJy.EZpvd) {
            return;
        }
        activityC46157tJy.EZpvd = true;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC46157tJy, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void copydefault(ActivityC46157tJy activityC46157tJy, android.view.View view) {
        activityC46157tJy.finish();
    }

    public static final void KWHzl(ActivityC46157tJy activityC46157tJy, android.view.View view) {
        C52794wYp c52794wYp;
        if (activityC46157tJy.copydefault) {
            activityC46157tJy.setResult(-1);
            activityC46157tJy.finish();
        } else {
            AbstractC46226tMm abstractC46226tMm = activityC46157tJy.AEQbTJ;
            if (abstractC46226tMm != null && (c52794wYp = abstractC46226tMm.OLrzqt) != null) {
                C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
            }
            activityC46157tJy.KWHzl(true);
        }
        C32866mlf.onEvent$default("Twitter_AccountLink_Successfully_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public final void KWHzl(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LinkXSuccessActivity$linkX$1(z, this, null), 3, null);
    }

    public final void AEQbTJ() {
        LottieCompositionFactory.fromRawRes(this, C52761wXj.PendingIntent.uzCIH).addListener(new LottieListener() { // from class: o.tJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                ActivityC46157tJy.KWHzl(this.KWHzl, (LottieComposition) obj);
            }
        });
    }

    public static final void KWHzl(ActivityC46157tJy activityC46157tJy, LottieComposition lottieComposition) {
        android.widget.ImageView imageView;
        AbstractC46226tMm abstractC46226tMm = activityC46157tJy.AEQbTJ;
        if (abstractC46226tMm == null || (imageView = abstractC46226tMm.copydefault) == null) {
            return;
        }
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(0);
        lottieDrawable.playAnimation();
        imageView.performHapticFeedback(0);
        imageView.setImageDrawable(lottieDrawable);
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
