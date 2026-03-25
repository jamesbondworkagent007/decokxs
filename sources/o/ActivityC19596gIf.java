package o;

import androidx.appcompat.app.AppCompatActivity;
import o.C13754dXa;

/* JADX INFO: renamed from: o.gIf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ActivityC19596gIf extends AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C13754dXa.TaskDescription.finit);
        OLrzqt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC19596gIf.copydefault(this.KWHzl);
            }
        });
    }

    public static final void copydefault(ActivityC19596gIf activityC19596gIf) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC19596gIf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        final C19600gIj c19600gIj = (C19600gIj) findViewById(C13754dXa.ActionBar.onPlayFromUri);
        c19600gIj.setSilverGradient();
        c19600gIj.post(new java.lang.Runnable() { // from class: o.gIi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC19596gIf.copydefault(c19600gIj);
            }
        });
        ((C19600gIj) findViewById(C13754dXa.ActionBar.v)).setGradientColors(-16711936, -16776961);
    }

    public static final void copydefault(C19600gIj c19600gIj) {
        c19600gIj.EZpvd();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C19600gIj) findViewById(C13754dXa.ActionBar.onPlayFromUri)).copydefault();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
