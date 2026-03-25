package com.amplifyframework.auth.cognito.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.amplifyframework.core.Amplify;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomTabsManagerActivity extends Activity {
    public static final String CUSTOM_TABS_INTENT_KEY = "customTabsIntent";
    public static final String CUSTOM_TABS_LAUNCHED_KEY = "customTabsLaunched";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AuthClient";
    private Intent customTabsIntent;
    private boolean customTabsLaunched;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Intent createResponseHandlingIntent(@NotNull Context context, Uri uri) {
        return Companion.createResponseHandlingIntent(context, uri);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            extractState(getIntent().getExtras());
        } else {
            extractState(bundle);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.customTabsLaunched) {
            startActivity(this.customTabsIntent);
            this.customTabsLaunched = true;
        } else {
            if (getIntent().getData() != null) {
                handleAuthorizationComplete();
            } else {
                handleAuthorizationCanceled();
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(CUSTOM_TABS_LAUNCHED_KEY, this.customTabsLaunched);
        bundle.putParcelable(CUSTOM_TABS_INTENT_KEY, this.customTabsIntent);
    }

    private final void handleAuthorizationComplete() {
        setResult(-1, getIntent());
    }

    private final void handleAuthorizationCanceled() {
        setResult(0);
        Amplify.Auth.handleWebUISignInResponse(null);
    }

    private final void extractState(Bundle bundle) {
        if (bundle == null) {
            finish();
        } else {
            this.customTabsIntent = (Intent) bundle.getParcelable(CUSTOM_TABS_INTENT_KEY);
            this.customTabsLaunched = bundle.getBoolean(CUSTOM_TABS_LAUNCHED_KEY, false);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.activities.CustomTabsManagerActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createStartIntent(@NotNull Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentCreateBaseIntent = createBaseIntent(context);
            intentCreateBaseIntent.putExtra(CustomTabsManagerActivity.CUSTOM_TABS_INTENT_KEY, intent);
            return intentCreateBaseIntent;
        }

        public final Intent createResponseHandlingIntent(@NotNull Context context, Uri uri) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentCreateBaseIntent = createBaseIntent(context);
            intentCreateBaseIntent.setData(uri);
            intentCreateBaseIntent.addFlags(603979776);
            return intentCreateBaseIntent;
        }

        private final Intent createBaseIntent(Context context) {
            return new Intent(context, (Class<?>) CustomTabsManagerActivity.class);
        }
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
