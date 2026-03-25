package o;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC37225opn extends AbstractActivityC33041mov {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public nOQ AEQbTJ;

    /* JADX INFO: renamed from: o.opn$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.opn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC37225opn.class);
            intent.putExtra("extra_image_url", str);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        nOQ noqKWHzl = nOQ.KWHzl(getLayoutInflater());
        this.AEQbTJ = noqKWHzl;
        if (noqKWHzl == null) {
            Intrinsics.gEmmrt("");
            noqKWHzl = null;
        }
        setContentView(noqKWHzl.getRoot());
        AEQbTJ();
        EZpvd();
        OLrzqt();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (!isFinishing()) {
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrCopydefault = Glide.copydefault((FragmentActivity) this);
            nOQ noq = this.AEQbTJ;
            if (noq == null) {
                Intrinsics.gEmmrt("");
                noq = null;
            }
            componentCallbacks2C5333NrCopydefault.AEQbTJ(noq.AEQbTJ);
        }
        super.onDestroy();
    }

    public final void AEQbTJ() {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        android.view.Window window = getWindow();
        nOQ noq = this.AEQbTJ;
        if (noq == null) {
            Intrinsics.gEmmrt("");
            noq = null;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, noq.getRoot());
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
        if (Build.VERSION.SDK_INT >= 28) {
            android.view.Window window2 = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window2.setAttributes(attributes);
        }
    }

    private final void EZpvd() {
        nOQ noq = this.AEQbTJ;
        nOQ noq2 = null;
        if (noq == null) {
            Intrinsics.gEmmrt("");
            noq = null;
        }
        noq.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.opr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC37225opn.OLrzqt(this.OLrzqt, view);
            }
        });
        nOQ noq3 = this.AEQbTJ;
        if (noq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            noq2 = noq3;
        }
        noq2.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.opo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC37225opn.copydefault(this.KWHzl, view);
            }
        });
    }

    public static final void OLrzqt(ActivityC37225opn activityC37225opn, android.view.View view) {
        activityC37225opn.finish();
    }

    public static final void copydefault(ActivityC37225opn activityC37225opn, android.view.View view) {
        activityC37225opn.finish();
    }

    public final void OLrzqt() {
        java.lang.String stringExtra = getIntent().getStringExtra("extra_image_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        pUU.EZpvd(getTAG(), "Loading portrait: url=" + C59454zhO.isConnected(stringExtra, 50));
        Glide.copydefault((FragmentActivity) this).EZpvd().copydefault(stringExtra).OLrzqt(new Activity());
    }

    /* JADX INFO: renamed from: o.opn$Activity */
    public static final class Activity extends AbstractC5449Sd<android.graphics.Bitmap> {
        public Activity() {
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void KWHzl(android.graphics.drawable.Drawable drawable) {
            pUU.EZpvd(ActivityC37225opn.this.getTAG(), "Image load started");
            nOQ noq = ActivityC37225opn.this.AEQbTJ;
            if (noq == null) {
                Intrinsics.gEmmrt("");
                noq = null;
            }
            C55113xdn c55113xdn = noq.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(0);
            android.widget.LinearLayout linearLayout = noq.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.Bitmap bitmap, InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            pUU.EZpvd(ActivityC37225opn.this.getTAG(), "Image loaded successfully: " + bitmap.getWidth() + "x" + bitmap.getHeight());
            nOQ noq = ActivityC37225opn.this.AEQbTJ;
            if (noq == null) {
                Intrinsics.gEmmrt("");
                noq = null;
            }
            C55113xdn c55113xdn = noq.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(8);
            android.widget.LinearLayout linearLayout = noq.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            SubsamplingScaleImageView subsamplingScaleImageView = noq.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView, "");
            subsamplingScaleImageView.setVisibility(0);
            noq.AEQbTJ.setImage(ImageSource.bitmap(bitmap));
            rVN.reportFullyDrawn$default((android.app.Activity) ActivityC37225opn.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            pUU.valueOf(ActivityC37225opn.this.getTAG(), "Image load failed");
            ActivityC37225opn.this.copydefault();
            rVN.reportFullyDrawn$default((android.app.Activity) ActivityC37225opn.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
            pUU.EZpvd(ActivityC37225opn.this.getTAG(), "Image load cleared");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        nOQ noq = this.AEQbTJ;
        if (noq == null) {
            Intrinsics.gEmmrt("");
            noq = null;
        }
        C55113xdn c55113xdn = noq.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
        android.widget.LinearLayout linearLayout = noq.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        SubsamplingScaleImageView subsamplingScaleImageView = noq.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView, "");
        subsamplingScaleImageView.setVisibility(4);
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
