package o;

import com.onesignal.OneSignal;
import o.C57712ynb;
import o.C57720ynj;
import o.C57792ypB;

/* JADX INFO: renamed from: o.ypx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ActivityC57840ypx extends android.app.Activity {
    public static boolean AEQbTJ = false;
    public static boolean AhwBna = false;
    public static final java.util.HashMap<java.lang.String, TaskDescription> EZpvd = new java.util.HashMap<>();
    public static final java.lang.String KWHzl = "com.onesignal.PermissionsActivity";
    public static C57712ynb.TaskDescription OLrzqt;
    public static boolean copydefault;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX INFO: renamed from: o.ypx$TaskDescription */
    public interface TaskDescription {
        void AEQbTJ(boolean z);

        void KWHzl();
    }

    public static void KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull TaskDescription taskDescription) {
        EZpvd.put(str, taskDescription);
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OneSignal.fetchVPNInfo(this);
        EZpvd(getIntent().getExtras());
    }

    @Override // android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        EZpvd(intent.getExtras());
    }

    public final void EZpvd(android.os.Bundle bundle) {
        OLrzqt(bundle);
        this.gEmmrt = bundle.getString("INTENT_EXTRA_PERMISSION_TYPE");
        java.lang.String string = bundle.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
        this.valueOf = string;
        KWHzl(string);
    }

    public final void OLrzqt(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            java.lang.Class.forName(string);
        } catch (java.lang.ClassNotFoundException unused) {
            throw new java.lang.RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    public final void KWHzl(java.lang.String str) {
        if (AhwBna) {
            return;
        }
        AhwBna = true;
        copydefault = true ^ C57720ynj.TaskDescription.KWHzl(this, str);
        C57720ynj.TaskDescription.KWHzl(this, new java.lang.String[]{str}, 2);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, @androidx.annotation.NonNull java.lang.String[] strArr, @androidx.annotation.NonNull final int[] iArr) {
        AhwBna = false;
        if (i == 2) {
            new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: o.ypx.2
                @Override // java.lang.Runnable
                public void run() {
                    int[] iArr2 = iArr;
                    boolean z = false;
                    if (iArr2.length > 0 && iArr2[0] == 0) {
                        z = true;
                    }
                    TaskDescription taskDescription = (TaskDescription) ActivityC57840ypx.EZpvd.get(ActivityC57840ypx.this.gEmmrt);
                    if (taskDescription == null) {
                        throw new java.lang.RuntimeException("Missing handler for permissionRequestType: " + ActivityC57840ypx.this.gEmmrt);
                    }
                    if (!z) {
                        taskDescription.AEQbTJ(ActivityC57840ypx.this.EZpvd());
                    } else {
                        taskDescription.KWHzl();
                    }
                }
            }, 500L);
        }
        C57712ynb c57712ynbCopydefault = C57714ynd.copydefault();
        if (c57712ynbCopydefault != null) {
            c57712ynbCopydefault.OLrzqt(KWHzl);
        }
        finish();
        overridePendingTransition(C57792ypB.StateListAnimator.KWHzl, C57792ypB.StateListAnimator.copydefault);
    }

    public final boolean EZpvd() {
        return AEQbTJ && copydefault && !C57720ynj.TaskDescription.KWHzl(this, this.valueOf);
    }

    public static void EZpvd(boolean z, final java.lang.String str, final java.lang.String str2, final java.lang.Class<?> cls) {
        if (AhwBna) {
            return;
        }
        AEQbTJ = z;
        OLrzqt = new C57712ynb.TaskDescription() { // from class: o.ypx.4
            @Override // o.C57712ynb.TaskDescription
            public void OLrzqt(@androidx.annotation.NonNull android.app.Activity activity) {
                if (activity.getClass().equals(ActivityC57840ypx.class)) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC57840ypx.class);
                intent.setFlags(131072);
                intent.putExtra("INTENT_EXTRA_PERMISSION_TYPE", str).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", str2).putExtra("INTENT_EXTRA_CALLBACK_CLASS", cls.getName());
                activity.startActivity(intent);
                activity.overridePendingTransition(C57792ypB.StateListAnimator.KWHzl, C57792ypB.StateListAnimator.copydefault);
            }
        };
        C57712ynb c57712ynbCopydefault = C57714ynd.copydefault();
        if (c57712ynbCopydefault != null) {
            c57712ynbCopydefault.KWHzl(KWHzl, OLrzqt);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
