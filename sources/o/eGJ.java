package o;

import android.graphics.Bitmap;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.core.widget.TextViewCompat;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.wallet.hardware.api.keystone.KeystoneSignResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C13754dXa;
import o.C52761wXj;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eGJ extends AbstractActivityC33013moT {
    public java.lang.Float AkhnZx;
    public android.graphics.Bitmap DbNXlk;
    public C16391eiz fJNWhG;
    public int fetchVPNInfo;
    public android.graphics.Bitmap isConnected;
    public ActivityResultLauncher<Unit> values;

    public abstract long EZpvd();

    public abstract java.lang.String KWHzl(@NotNull KeystoneSignResult keystoneSignResult);

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16391eiz c16391eizOLrzqt = C16391eiz.OLrzqt(getLayoutInflater());
        this.fJNWhG = c16391eizOLrzqt;
        C16391eiz c16391eiz = null;
        if (c16391eizOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c16391eizOLrzqt = null;
        }
        setContentView(c16391eizOLrzqt.getRoot());
        C16391eiz c16391eiz2 = this.fJNWhG;
        if (c16391eiz2 == null) {
            Intrinsics.gEmmrt("");
            c16391eiz2 = null;
        }
        c16391eiz2.OLrzqt.setTitle(C33069mpW.copydefault(C13754dXa.FragmentManager.gAnGwV, C56424yEw.gEmmrt(C56390yDp.OLrzqt("step", "1"), C56390yDp.OLrzqt("total", "2"))));
        C16391eiz c16391eiz3 = this.fJNWhG;
        if (c16391eiz3 == null) {
            Intrinsics.gEmmrt("");
            c16391eiz3 = null;
        }
        c16391eiz3.OLrzqt.setTitleTypeface("harmony_sans_bold.ttf");
        C16391eiz c16391eiz4 = this.fJNWhG;
        if (c16391eiz4 == null) {
            Intrinsics.gEmmrt("");
            c16391eiz4 = null;
        }
        TextViewCompat.setTextAppearance(c16391eiz4.OLrzqt.getTitle(), C52761wXj.LoaderManager.dUDNAs);
        AEQbTJ();
        C16391eiz c16391eiz5 = this.fJNWhG;
        if (c16391eiz5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16391eiz = c16391eiz5;
        }
        C52794wYp c52794wYp = c16391eiz.EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 500L, this));
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eGN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eGJ.AEQbTJ(this.OLrzqt);
            }
        });
        this.values = registerForActivityResult(ScannerActivity.Activity.getResultContract$default(ScannerActivity.Companion, new ScanConfig(false, C33069mpW.copydefault(C13754dXa.FragmentManager.gAnGwV, C56424yEw.gEmmrt(C56390yDp.OLrzqt("step", "2"), C56390yDp.OLrzqt("total", "2"))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.RLmrWm), C33070mpX.AYXKKw(C13754dXa.FragmentManager.QnnRaN), C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile), true, "OKWKeystoneSignScannerViewExtensionImpl", false, false, null, false, null, Utf8.MASK_2BYTES, null), null, BundleKt.bundleOf(C56390yDp.OLrzqt("chain_id", java.lang.Long.valueOf(EZpvd()))), 2, null), new ActivityResultCallback() { // from class: o.eGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                eGJ.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        });
    }

    public static final void AEQbTJ(eGJ egj) {
        rVN.reportFullyDrawn$default((android.app.Activity) egj, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void EZpvd(eGJ egj, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            C33489mxS c33489mxS = C33489mxS.KWHzl;
            KSerializer<KeystoneSignResult> kSerializerSerializer = KeystoneSignResult.Companion.serializer();
            Intrinsics.copydefault((java.lang.Object) str);
            objM7377constructorimpl = Result.m7377constructorimpl((KeystoneSignResult) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            egj.AEQbTJ(egj.KWHzl((KeystoneSignResult) objM7377constructorimpl));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(egj.getTAG(), "Failed to parse KeystoneSignResult", thM7380exceptionOrNullimpl);
        }
    }

    public final void AEQbTJ() {
        this.fetchVPNInfo = (C33570myu.AEQbTJ() * 287) / 375;
        C16391eiz c16391eiz = this.fJNWhG;
        C16391eiz c16391eiz2 = null;
        if (c16391eiz == null) {
            Intrinsics.gEmmrt("");
            c16391eiz = null;
        }
        ViewGroup.LayoutParams layoutParams = c16391eiz.copydefault.getLayoutParams();
        int i = this.fetchVPNInfo;
        layoutParams.width = i;
        layoutParams.height = i;
        C16391eiz c16391eiz3 = this.fJNWhG;
        if (c16391eiz3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16391eiz2 = c16391eiz3;
        }
        c16391eiz2.copydefault.setLayoutParams(layoutParams);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = this.isConnected;
        int i = this.fetchVPNInfo;
        this.isConnected = C6999aZv.AEQbTJ(str, i, i, (1948 & 4) != 0 ? -16777216 : 0, (1948 & 8) != 0 ? -1 : 0, (1948 & 16) != 0 ? 0 : 0, (1948 & 32) != 0 ? 0 : 2, (1948 & 64) != 0 ? 0 : 1, (1948 & 128) != 0 ? 1.0f : 0.0f, (1948 & 256) != 0 ? 1.0f : 0.0f, (1948 & 512) != 0 ? Bitmap.Config.RGB_565 : null, (1948 & 1024) != 0 ? 0.0f : 0.0f, (1948 & 2048) != 0 ? ErrorCorrectionLevel.H : ErrorCorrectionLevel.L);
        C16391eiz c16391eiz = this.fJNWhG;
        if (c16391eiz == null) {
            Intrinsics.gEmmrt("");
            c16391eiz = null;
        }
        c16391eiz.copydefault.setImageBitmap(this.isConnected);
        android.graphics.Bitmap bitmap = this.DbNXlk;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (C33129mqd.gEmmrt(java.lang.Float.valueOf(OLrzqt() / 255.0f), java.lang.Float.valueOf(0.65f))) {
            KWHzl(0.65f);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        java.lang.Float f = this.AkhnZx;
        if (f != null) {
            KWHzl(f != null ? f.floatValue() : -1.0f);
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C16391eiz c16391eiz = this.fJNWhG;
        if (c16391eiz == null) {
            Intrinsics.gEmmrt("");
            c16391eiz = null;
        }
        android.widget.ImageView imageView = c16391eiz.copydefault;
        if (imageView != null) {
            imageView.setImageResource(0);
        }
        android.graphics.Bitmap bitmap = this.isConnected;
        if (bitmap != null) {
            bitmap.recycle();
        }
        android.graphics.Bitmap bitmap2 = this.DbNXlk;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
    }

    private final void KWHzl(float f) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        Intrinsics.checkNotNullExpressionValue(attributes, "");
        if (this.AkhnZx == null) {
            this.AkhnZx = java.lang.Float.valueOf(attributes.screenBrightness);
        }
        attributes.screenBrightness = f;
        getWindow().setAttributes(attributes);
    }

    private final int OLrzqt() {
        try {
            return Settings.System.getInt(getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("result", str);
        setResult(-1, intent);
        finish();
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ eGJ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, eGJ egj) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = egj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                try {
                    ActivityResultLauncher activityResultLauncher = this.OLrzqt.values;
                    if (activityResultLauncher == null) {
                        Intrinsics.gEmmrt("");
                        activityResultLauncher = null;
                    }
                    activityResultLauncher.launch(Unit.INSTANCE);
                } catch (java.lang.Exception unused) {
                    pUU.copydefault(this.OLrzqt.getTAG(), "launch scanner failed");
                }
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
