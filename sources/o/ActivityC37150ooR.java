package o;

import android.graphics.Bitmap;
import android.view.View;
import androidx.core.os.BundleKt;
import com.bumptech.glide.Glide;
import com.okinc.im.imui.picker.ConfirmationDialogConfig;
import com.okinc.im.imui.picker.ImageCropConfig;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ooR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ActivityC37150ooR extends AbstractActivityC33044moy<AbstractC33870nIx> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final int EZpvd = C35399nuc.Dialog.AuCTelauCTel;
    public ImageCropConfig KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageCropConfig EZpvd() {
        return this.KWHzl;
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ImageCropConfig imageCropConfig = (ImageCropConfig) getIntent().getParcelableExtra("extra_crop_config");
        this.KWHzl = imageCropConfig;
        if (imageCropConfig == null) {
            pUU.copydefault("ImageCropActivity", "ImageCropConfig is null, finishing activity");
            finish();
        } else {
            AYXKKw();
            OLrzqt();
        }
    }

    private final void AYXKKw() {
        AbstractC33870nIx abstractC33870nIxKWHzl = KWHzl();
        ImageCropConfig imageCropConfig = this.KWHzl;
        if (imageCropConfig == null) {
            return;
        }
        abstractC33870nIxKWHzl.djBIcL.setSquareSize(imageCropConfig.AEQbTJ());
        abstractC33870nIxKWHzl.AEQbTJ.setSquareSize(imageCropConfig.AEQbTJ());
        abstractC33870nIxKWHzl.AEQbTJ.setCropShape(imageCropConfig.OLrzqt());
        java.lang.String strKWHzl = imageCropConfig.KWHzl();
        if (strKWHzl != null) {
            abstractC33870nIxKWHzl.copydefault.setText(strKWHzl);
        }
        java.lang.String strCopydefault = imageCropConfig.copydefault();
        if (strCopydefault != null) {
            abstractC33870nIxKWHzl.KWHzl.setText(strCopydefault);
        }
        android.widget.TextView textView = abstractC33870nIxKWHzl.copydefault;
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, this));
        android.widget.TextView textView2 = abstractC33870nIxKWHzl.KWHzl;
        textView2.setOnClickListener(new Activity(textView2, 1000L, this, abstractC33870nIxKWHzl, imageCropConfig));
    }

    public void KWHzl(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageCropConfig imageCropConfig = this.KWHzl;
        if (imageCropConfig == null) {
            return;
        }
        if (imageCropConfig.EZpvd() != null) {
            KWHzl(file, imageCropConfig.EZpvd());
        } else {
            EZpvd(file);
        }
    }

    public final void KWHzl(@NotNull final java.io.File file, @NotNull ConfirmationDialogConfig confirmationDialogConfig) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(confirmationDialogConfig, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(confirmationDialogConfig.OLrzqt());
        viewOnClickListenerC54939xaY.copydefault(confirmationDialogConfig.KWHzl());
        viewOnClickListenerC54939xaY.EZpvd(confirmationDialogConfig.EZpvd(), new View.OnClickListener() { // from class: o.ooQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC37150ooR.AEQbTJ(this.EZpvd, file, viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, confirmationDialogConfig.copydefault(), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ActivityC37150ooR activityC37150ooR, java.io.File file, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        activityC37150ooR.EZpvd(file);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_result_uri", android.net.Uri.fromFile(file));
        setResult(-1, intent);
        finish();
    }

    public final void OLrzqt() {
        android.net.Uri uriValueOf;
        ImageCropConfig imageCropConfig = this.KWHzl;
        if (imageCropConfig == null || (uriValueOf = imageCropConfig.valueOf()) == null) {
            return;
        }
        Glide.KWHzl(KWHzl().djBIcL).EZpvd().EZpvd(uriValueOf).OLrzqt(new ActionBar());
    }

    /* JADX INFO: renamed from: o.ooR$ActionBar */
    public static final class ActionBar extends AbstractC5449Sd<android.graphics.Bitmap> {
        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.Bitmap bitmap, InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            C37212opa c37212opa = ActivityC37150ooR.this.KWHzl().djBIcL;
            c37212opa.setImageBitmap(bitmap);
            c37212opa.copydefault(bitmap);
            rVN.reportFullyDrawn$default((android.app.Activity) ActivityC37150ooR.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final android.graphics.Bitmap EZpvd(android.view.View view, android.content.Context context, float f) {
        int iCopydefault = C55298xhM.copydefault(f, context);
        int width = view.getWidth();
        int height = view.getHeight();
        int i = iCopydefault / 2;
        int i2 = (width / 2) - i;
        int i3 = (height / 2) - i;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        view.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        int iMax = java.lang.Math.max(0, i2);
        int iMax2 = java.lang.Math.max(0, i3);
        int iMin = java.lang.Math.min(width, i2 + iCopydefault) - iMax;
        int iMin2 = java.lang.Math.min(height, i3 + iCopydefault) - iMax2;
        if (iMin > 0 && iMin2 > 0) {
            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, iMax, iMax2, iMin, iMin2);
            Intrinsics.copydefault(bitmapCreateBitmap2);
            return bitmapCreateBitmap2;
        }
        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapCreateBitmap, iCopydefault, iCopydefault, true);
        Intrinsics.copydefault(bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
    }

    /* JADX INFO: renamed from: o.ooR$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ImageCropConfig AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AbstractC33870nIx OLrzqt;
        public final /* synthetic */ ActivityC37150ooR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC37150ooR activityC37150ooR, AbstractC33870nIx abstractC33870nIx, ImageCropConfig imageCropConfig) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = activityC37150ooR;
            this.OLrzqt = abstractC33870nIx;
            this.AEQbTJ = imageCropConfig;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) throws java.io.IOException {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActivityC37150ooR activityC37150ooR = this.copydefault;
                C37212opa c37212opa = this.OLrzqt.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c37212opa, "");
                android.graphics.Bitmap bitmapEZpvd = activityC37150ooR.EZpvd(c37212opa, this.copydefault, this.AEQbTJ.AEQbTJ());
                pUU.EZpvd("ImageCropActivity", "Cropped bitmap size: " + bitmapEZpvd.getWidth() + "x" + bitmapEZpvd.getHeight());
                android.graphics.Bitmap bitmapCopydefault = this.copydefault.copydefault(bitmapEZpvd, this.AEQbTJ.AhwBna(), this.AEQbTJ.AYXKKw());
                if (bitmapCopydefault != null) {
                    pUU.EZpvd("ImageCropActivity", "Resized bitmap: " + bitmapCopydefault.getWidth() + "x" + bitmapCopydefault.getHeight());
                    ActivityC37150ooR activityC37150ooR2 = this.copydefault;
                    android.content.Context context = this.OLrzqt.KWHzl.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    this.copydefault.KWHzl(activityC37150ooR2.EZpvd(context, bitmapCopydefault));
                    return;
                }
                pUU.copydefault("ImageCropActivity", "Failed to resize bitmap");
                this.copydefault.setResult(0);
                this.copydefault.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.ooR$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC37150ooR AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC37150ooR activityC37150ooR) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = activityC37150ooR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.setResult(0);
                this.AEQbTJ.finish();
            }
        }
    }

    public final android.graphics.Bitmap copydefault(android.graphics.Bitmap bitmap, int i, int i2) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float fMin = java.lang.Math.min(i / width, i2 / height);
            objM7377constructorimpl = Result.m7377constructorimpl(android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (width * fMin), (int) (height * fMin), true));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("ImageCropActivity", "Error resizing bitmap: " + thM7380exceptionOrNullimpl.getMessage());
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (android.graphics.Bitmap) objM7377constructorimpl;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.io.File EZpvd(android.content.Context context, android.graphics.Bitmap bitmap) throws java.io.IOException {
        java.io.File fileCreateTempFile = java.io.File.createTempFile("crop_image_", ".png", context.getCacheDir());
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            yFA.copydefault(fileOutputStream, null);
            Intrinsics.copydefault(fileCreateTempFile);
            return fileCreateTempFile;
        } finally {
        }
    }

    /* JADX INFO: renamed from: o.ooR$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ooR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull ImageCropConfig imageCropConfig) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(imageCropConfig, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC37150ooR.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("extra_crop_config", imageCropConfig)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
