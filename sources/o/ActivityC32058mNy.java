package o;

/* JADX INFO: renamed from: o.mNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ActivityC32058mNy extends android.app.Activity {
    public static java.util.List<mNK> AEQbTJ;
    public static mNK EZpvd;

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
    }

    public final void KWHzl() {
        android.content.Intent intent = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(android.net.Uri.parse("package:" + getPackageName()));
        startActivityForResult(intent, 756232212);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 756232212) {
            if (mNI.AEQbTJ(this)) {
                mNK mnk = EZpvd;
                if (mnk != null) {
                    mnk.bj_();
                }
            } else {
                mNK mnk2 = EZpvd;
                if (mnk2 != null) {
                    mnk2.AEQbTJ();
                }
            }
        }
        finish();
    }

    public static void EZpvd(android.content.Context context, mNK mnk) {
        synchronized (ActivityC32058mNy.class) {
            if (mNI.EZpvd(context)) {
                mnk.bj_();
                return;
            }
            if (AEQbTJ == null) {
                AEQbTJ = new java.util.ArrayList();
                EZpvd = new mNK() { // from class: o.mNy.4
                    @Override // o.mNK
                    public void bj_() {
                        java.util.Iterator it = ActivityC32058mNy.AEQbTJ.iterator();
                        while (it.hasNext()) {
                            ((mNK) it.next()).bj_();
                        }
                        ActivityC32058mNy.AEQbTJ.clear();
                    }

                    @Override // o.mNK
                    public void AEQbTJ() {
                        java.util.Iterator it = ActivityC32058mNy.AEQbTJ.iterator();
                        while (it.hasNext()) {
                            ((mNK) it.next()).AEQbTJ();
                        }
                        ActivityC32058mNy.AEQbTJ.clear();
                    }
                };
            }
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC32058mNy.class);
            intent.setFlags(268435456);
            context.startActivity(intent);
            AEQbTJ.add(mnk);
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
