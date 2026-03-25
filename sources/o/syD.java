package o;

import android.view.View;
import com.okinc.biz.model.RatingDisplayStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class syD extends AbstractActivityC33041mov {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public AbstractC47330tnx OLrzqt;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) syD.class);
            intent.putExtra(RatingDisplayStatus.RATING_DISPLAY_STATUS, RatingDisplayStatus.RatingSubmitted.getValue());
            return intent;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC47330tnx abstractC47330tnxAEQbTJ = AbstractC47330tnx.AEQbTJ(getLayoutInflater());
        this.OLrzqt = abstractC47330tnxAEQbTJ;
        AbstractC47330tnx abstractC47330tnx = null;
        if (abstractC47330tnxAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC47330tnxAEQbTJ = null;
        }
        setContentView(abstractC47330tnxAEQbTJ.getRoot());
        AbstractC47330tnx abstractC47330tnx2 = this.OLrzqt;
        if (abstractC47330tnx2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC47330tnx = abstractC47330tnx2;
        }
        C55178xez c55178xez = abstractC47330tnx.AEQbTJ;
        c55178xez.AEQbTJ().setVisibility(8);
        c55178xez.OLrzqt().setVisibility(8);
        android.widget.ImageView imageView = abstractC47330tnx.copydefault;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this));
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.syC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                syD.copydefault(this.copydefault);
            }
        });
    }

    public static final void copydefault(syD syd) {
        rVN.reportFullyDrawn$default((android.app.Activity) syd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ syD KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, syD syd) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = syd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
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
