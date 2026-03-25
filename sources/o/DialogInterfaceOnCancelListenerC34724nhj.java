package o;

import android.content.DialogInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C34669ngU;
import o.DialogInterfaceOnCancelListenerC34724nhj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nhj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class DialogInterfaceOnCancelListenerC34724nhj extends AbstractActivityC33041mov implements DialogInterface.OnCancelListener {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static AbstractC34734nhv copydefault;
    public C34725nhk AEQbTJ;
    public C34719nhe OLrzqt;

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = C34669ngU.Application.copydefault;
        overridePendingTransition(i, i);
        if (bundle != null) {
            AbstractC34734nhv abstractC34734nhv = copydefault;
            if (abstractC34734nhv != null) {
                abstractC34734nhv.AEQbTJ();
            }
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("MODULE_NAME");
        this.OLrzqt = new C34719nhe(this, stringExtra == null ? "" : stringExtra, new Application(), getIntent().getLongExtra("TIMEOUT", 0L));
        if (!getIntent().getBooleanExtra("DISABLE_LOADING", false)) {
            C34725nhk c34725nhkCopydefault = C34725nhk.Companion.copydefault();
            this.AEQbTJ = c34725nhkCopydefault;
            if (c34725nhkCopydefault != null) {
                androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c34725nhkCopydefault.show(supportFragmentManager, getTAG());
            }
        }
        C34719nhe c34719nhe = this.OLrzqt;
        if (c34719nhe == null) {
            Intrinsics.gEmmrt("");
            c34719nhe = null;
        }
        c34719nhe.KWHzl();
    }

    /* JADX INFO: renamed from: o.nhj$Application */
    public static final class Application extends AbstractC34734nhv {
        public Application() {
        }

        @Override // o.AbstractC34734nhv
        public void EZpvd() {
            super.EZpvd();
            Activity activity = DialogInterfaceOnCancelListenerC34724nhj.Companion;
            AbstractC34734nhv abstractC34734nhvAEQbTJ = activity.AEQbTJ();
            if (abstractC34734nhvAEQbTJ != null) {
                abstractC34734nhvAEQbTJ.EZpvd();
            }
            activity.EZpvd(null);
            DialogInterfaceOnCancelListenerC34724nhj.this.finish();
        }

        @Override // o.AbstractC34734nhv
        public void OLrzqt(final int i) {
            super.OLrzqt(i);
            final DialogInterfaceOnCancelListenerC34724nhj dialogInterfaceOnCancelListenerC34724nhj = DialogInterfaceOnCancelListenerC34724nhj.this;
            dialogInterfaceOnCancelListenerC34724nhj.runOnUiThread(new java.lang.Runnable() { // from class: o.nhm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceOnCancelListenerC34724nhj.Application.OLrzqt(dialogInterfaceOnCancelListenerC34724nhj, i);
                }
            });
            AbstractC34734nhv abstractC34734nhvAEQbTJ = DialogInterfaceOnCancelListenerC34724nhj.Companion.AEQbTJ();
            if (abstractC34734nhvAEQbTJ != null) {
                abstractC34734nhvAEQbTJ.OLrzqt(i);
            }
        }

        public static final void OLrzqt(DialogInterfaceOnCancelListenerC34724nhj dialogInterfaceOnCancelListenerC34724nhj, int i) {
            C34725nhk c34725nhk = dialogInterfaceOnCancelListenerC34724nhj.AEQbTJ;
            if (c34725nhk != null) {
                c34725nhk.EZpvd(i + " %");
            }
        }

        @Override // o.AbstractC34734nhv
        public void EZpvd(java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            super.EZpvd(exc);
            Activity activity = DialogInterfaceOnCancelListenerC34724nhj.Companion;
            AbstractC34734nhv abstractC34734nhvAEQbTJ = activity.AEQbTJ();
            if (abstractC34734nhvAEQbTJ != null) {
                abstractC34734nhvAEQbTJ.EZpvd(exc);
            }
            activity.EZpvd(null);
            DialogInterfaceOnCancelListenerC34724nhj.this.finish();
        }

        @Override // o.AbstractC34734nhv
        public void AEQbTJ() {
            super.AEQbTJ();
            Activity activity = DialogInterfaceOnCancelListenerC34724nhj.Companion;
            AbstractC34734nhv abstractC34734nhvAEQbTJ = activity.AEQbTJ();
            if (abstractC34734nhvAEQbTJ != null) {
                abstractC34734nhvAEQbTJ.AEQbTJ();
            }
            activity.EZpvd(null);
            DialogInterfaceOnCancelListenerC34724nhj.this.finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        C34719nhe c34719nhe = this.OLrzqt;
        if (c34719nhe == null) {
            Intrinsics.gEmmrt("");
            c34719nhe = null;
        }
        c34719nhe.OLrzqt(i, i2, intent);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.nhe.cancel$default(o.nhe, boolean, int, java.lang.Object):void */
    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        C34719nhe c34719nhe = this.OLrzqt;
        if (c34719nhe == null) {
            Intrinsics.gEmmrt("");
            c34719nhe = null;
        }
        C34719nhe.cancel$default(c34719nhe, false, 1, null);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        int i = C34669ngU.Application.copydefault;
        overridePendingTransition(i, i);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        onCancel(null);
    }

    /* JADX INFO: renamed from: o.nhj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nhj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final AbstractC34734nhv AEQbTJ() {
            return DialogInterfaceOnCancelListenerC34724nhj.copydefault;
        }

        public final void EZpvd(AbstractC34734nhv abstractC34734nhv) {
            DialogInterfaceOnCancelListenerC34724nhj.copydefault = abstractC34734nhv;
        }

        public static /* synthetic */ void startActivity$default(Activity activity, android.content.Context context, java.lang.String str, boolean z, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                l = null;
            }
            activity.OLrzqt(context, str, z, l);
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) DialogInterfaceOnCancelListenerC34724nhj.class);
            intent.addFlags(268435456);
            intent.putExtra("MODULE_NAME", str);
            intent.putExtra("DISABLE_LOADING", z);
            if (l != null) {
                intent.putExtra("TIMEOUT", l.longValue());
            }
            context.startActivity(intent);
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
