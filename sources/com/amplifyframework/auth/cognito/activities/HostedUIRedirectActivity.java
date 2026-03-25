package com.amplifyframework.auth.cognito.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.amplifyframework.core.Amplify;

/* JADX INFO: loaded from: classes21.dex */
public final class HostedUIRedirectActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(CustomTabsManagerActivity.Companion.createResponseHandlingIntent(this, getIntent().getData()));
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Amplify.Auth.handleWebUISignInResponse(getIntent());
        finish();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
