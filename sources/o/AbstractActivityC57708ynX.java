package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: renamed from: o.ynX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractActivityC57708ynX extends android.app.Activity {
    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        C57704ynT.AEQbTJ(this, getIntent());
        finish();
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) throws JSONException {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        C57704ynT.AEQbTJ(this, getIntent());
        finish();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
