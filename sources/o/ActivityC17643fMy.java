package o;

import android.graphics.Bitmap;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.view.ViewCompat;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fMy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC17643fMy extends AbstractActivityC33041mov {
    public final ActivityResultLauncher<EmailRecoveryInput> EZpvd;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    public static final void OLrzqt(EmailRecoveryResult emailRecoveryResult) {
    }

    /* JADX INFO: renamed from: o.fMy$TaskDescription */
    public static final class TaskDescription implements View.OnLayoutChangeListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C16251egR OLrzqt;

        public TaskDescription(java.lang.String str, C16251egR c16251egR) {
            this.AEQbTJ = str;
            this.OLrzqt = c16251egR;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x006c  */
        @Override // android.view.View.OnLayoutChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws java.lang.Exception {
            android.graphics.Bitmap bitmapCreateBitmap;
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            int measuredWidth = view.getMeasuredWidth();
            int iDpInt$default = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
            int iDpInt$default2 = C55298xhM.dpInt$default(64, (android.content.Context) null, 1, (java.lang.Object) null);
            int i9 = (iDpInt$default * 2) + iDpInt$default2;
            C6996aZs c6996aZs = C6996aZs.OLrzqt;
            java.lang.String str = "okx_passkey_wallet:scan_passkey?chain_index=" + this.AEQbTJ;
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.Q;
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPOKBmQNaCIdOM);
            if (drawableKWHzl != null) {
                drawableKWHzl.setBounds(0, 0, iDpInt$default2, iDpInt$default2);
                drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
                android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(i9, i9, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "");
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap2);
                float f = iDpInt$default;
                canvas.translate(f, f);
                drawableKWHzl.draw(canvas);
                if (bitmapCreateBitmap2 != null) {
                    bitmapCreateBitmap = bitmapCreateBitmap2;
                } else {
                    bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                }
            }
            this.OLrzqt.OLrzqt.setImageBitmap(c6996aZs.KWHzl(str, measuredWidth, measuredWidth, (2848 & 8) != 0 ? -16777216 : iCopydefault, (2848 & 16) != 0 ? -1 : 0, (2848 & 32) != 0 ? 0 : 0, (2848 & 64) != 0 ? 0 : 0, (2848 & 128) != 0 ? 0 : 0, (2848 & 256) != 0 ? 1.0f : 0.0f, (2848 & 512) != 0 ? 1.0f : 0.0f, (2848 & 1024) != 0 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888, (2848 & 2048) != 0 ? 0.0f : 0.0f, (2848 & 4096) != 0 ? ErrorCorrectionLevel.H : errorCorrectionLevel, bitmapCreateBitmap, i9, i9, C55298xhM.dp$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(0.75f, (android.content.Context) null, 1, (java.lang.Object) null), 0.0f));
        }
    }

    public ActivityC17643fMy() {
        ActivityResultLauncher<EmailRecoveryInput> activityResultLauncherRegisterForActivityResult = registerForActivityResult(((InterfaceC9916bec) C43251rlk.copydefault(InterfaceC9916bec.class)).EZpvd(), new ActivityResultCallback() { // from class: o.fMB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC17643fMy.OLrzqt((EmailRecoveryResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.fMy$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.fMy$Application */
    public static final class Application extends ActivityResultContract<java.lang.String, java.lang.Boolean> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17643fMy.class);
            intent.putExtra("extra_chain_index", str);
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean parseResult(int i, android.content.Intent intent) {
            return java.lang.Boolean.valueOf(i == -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) throws java.lang.Exception {
        android.graphics.Bitmap bitmapCreateBitmap;
        super.onCreate(bundle);
        C32866mlf.onEvent$default("Wallet_PasskeyAdd_Authorize_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        java.lang.String stringExtra = getIntent().getStringExtra("extra_chain_index");
        if (stringExtra == null) {
            stringExtra = "";
        }
        C16251egR c16251egREZpvd = C16251egR.EZpvd(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c16251egREZpvd, "");
        setContentView(c16251egREZpvd.getRoot());
        android.widget.ImageView imageView = c16251egREZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (ViewCompat.isLaidOut(imageView) && !imageView.isLayoutRequested()) {
            int measuredWidth = imageView.getMeasuredWidth();
            int iDpInt$default = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
            int iDpInt$default2 = C55298xhM.dpInt$default(64, (android.content.Context) null, 1, (java.lang.Object) null);
            int i = iDpInt$default2 + (iDpInt$default * 2);
            C6996aZs c6996aZs = C6996aZs.OLrzqt;
            java.lang.String str = "okx_passkey_wallet:scan_passkey?chain_index=" + stringExtra;
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.Q;
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPOKBmQNaCIdOM);
            if (drawableKWHzl != null) {
                drawableKWHzl.setBounds(0, 0, iDpInt$default2, iDpInt$default2);
                drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
                android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "");
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap2);
                float f = iDpInt$default;
                canvas.translate(f, f);
                drawableKWHzl.draw(canvas);
                if (bitmapCreateBitmap2 != null) {
                    bitmapCreateBitmap = bitmapCreateBitmap2;
                } else {
                    bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                }
                c16251egREZpvd.OLrzqt.setImageBitmap(c6996aZs.KWHzl(str, measuredWidth, measuredWidth, (2848 & 8) != 0 ? -16777216 : iCopydefault, (2848 & 16) != 0 ? -1 : 0, (2848 & 32) != 0 ? 0 : 0, (2848 & 64) != 0 ? 0 : 0, (2848 & 128) != 0 ? 0 : 0, (2848 & 256) != 0 ? 1.0f : 0.0f, (2848 & 512) != 0 ? 1.0f : 0.0f, (2848 & 1024) != 0 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888, (2848 & 2048) != 0 ? 0.0f : 0.0f, (2848 & 4096) != 0 ? ErrorCorrectionLevel.H : errorCorrectionLevel, bitmapCreateBitmap, i, i, C55298xhM.dp$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dp$default(0.75f, (android.content.Context) null, 1, (java.lang.Object) null), 0.0f));
            }
        } else {
            imageView.addOnLayoutChangeListener(new TaskDescription(stringExtra, c16251egREZpvd));
        }
        C52794wYp c52794wYp = c16251egREZpvd.copydefault;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        android.widget.TextView textView = c16251egREZpvd.djBIcL;
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.content.res.Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        int i2 = C13754dXa.FragmentManager.OGitdB;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        StateListAnimator stateListAnimator = new StateListAnimator();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ardYFU));
        spannableStringBuilder.setSpan(stateListAnimator, length, spannableStringBuilder.length(), 17);
        Unit unit = Unit.INSTANCE;
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        textView.setText(C33069mpW.KWHzl(resources, i2, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("recoverPasskey", spannableStringValueOf))));
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fMA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17643fMy.KWHzl(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.fMy$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public StateListAnimator() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            ActivityC17643fMy.this.EZpvd.launch(new EmailRecoveryInput(ProjectSource.CeDeFi));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    public static final void KWHzl(ActivityC17643fMy activityC17643fMy) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17643fMy, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.fMy$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC17643fMy copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC17643fMy activityC17643fMy) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = activityC17643fMy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.setResult(-1);
                this.copydefault.finish();
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
