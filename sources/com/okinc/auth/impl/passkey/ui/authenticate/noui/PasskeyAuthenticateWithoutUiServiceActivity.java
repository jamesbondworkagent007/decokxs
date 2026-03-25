package com.okinc.auth.impl.passkey.ui.authenticate.noui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.impl.passkey.ui.authenticate.noui.PasskeyAuthenticateWithoutUiServiceActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC6032aHg;
import o.C5922aFc;
import o.C6038aHm;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateWithoutUiServiceActivity extends AbstractActivityC6032aHg {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public String valueOf = "PasskeyAuthenticateWithoutUiServiceActivity";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static abstract class Request implements Parcelable {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.authenticate.noui.PasskeyAuthenticateWithoutUiServiceActivity.Request.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Request(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Request() {
        }

        public static final class FIDO2 extends Request {
            public static final Parcelable.Creator<FIDO2> CREATOR = new Creator();
            public final PendingIntent KWHzl;

            public static final class Creator implements Parcelable.Creator<FIDO2> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FIDO2 createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new FIDO2((PendingIntent) parcel.readParcelable(FIDO2.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FIDO2[] newArray(int i) {
                    return new FIDO2[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FIDO2 copy$default(FIDO2 fido2, PendingIntent pendingIntent, int i, Object obj) {
                if ((i & 1) != 0) {
                    pendingIntent = fido2.KWHzl;
                }
                return fido2.AEQbTJ(pendingIntent);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PendingIntent AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FIDO2 AEQbTJ(@NotNull PendingIntent pendingIntent) {
                Intrinsics.checkNotNullParameter(pendingIntent, "");
                return new FIDO2(pendingIntent);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FIDO2) && Intrinsics.EZpvd(this.KWHzl, ((FIDO2) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FIDO2(pendingIntent=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.KWHzl, i);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FIDO2(@NotNull PendingIntent pendingIntent) {
                super(null);
                Intrinsics.checkNotNullParameter(pendingIntent, "");
                this.KWHzl = pendingIntent;
            }
        }

        public static final class CredentialManager extends Request {
            public static final Parcelable.Creator<CredentialManager> CREATOR = new Creator();
            public final String EZpvd;

            public static final class Creator implements Parcelable.Creator<CredentialManager> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CredentialManager createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new CredentialManager(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CredentialManager[] newArray(int i) {
                    return new CredentialManager[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CredentialManager copy$default(CredentialManager credentialManager, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = credentialManager.EZpvd;
                }
                return credentialManager.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialManager KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new CredentialManager(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.EZpvd;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CredentialManager) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((CredentialManager) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CredentialManager(credentialOption=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.EZpvd);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CredentialManager(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.authenticate.noui.PasskeyAuthenticateWithoutUiServiceActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Intent EZpvd(@NotNull Context context, @NotNull Request request) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(request, "");
            Intent intentPutExtra = new Intent(context.getApplicationContext(), (Class<?>) PasskeyAuthenticateWithoutUiServiceActivity.class).putExtra("KEY_REQUEST", request);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    @Override // o.AbstractActivityC6032aHg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C8206ayP.Application.OLrzqt);
        overridePendingTransition(0, 0);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            Request request = extras != null ? (Request) extras.getParcelable("KEY_REQUEST") : null;
            if (request != null) {
                C6038aHm.Activity activity = C6038aHm.Companion;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                activity.EZpvd(supportFragmentManager, this, new Function1() { // from class: o.aHe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return PasskeyAuthenticateWithoutUiServiceActivity.EZpvd(this.KWHzl, (PasskeySdkResult) obj);
                    }
                });
                getSupportFragmentManager().beginTransaction().replace(C8206ayP.StateListAnimator.hBpjJd, activity.EZpvd(request), C6038aHm.class.getName()).commitAllowingStateLoss();
            } else {
                AEQbTJ(new PasskeySdkResult.Failure(ErrorCode.UNKNOWN_ERR, "pendingIntent is null at activity", false));
            }
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aHi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PasskeyAuthenticateWithoutUiServiceActivity.OLrzqt(this.KWHzl, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    public static final Unit EZpvd(PasskeyAuthenticateWithoutUiServiceActivity passkeyAuthenticateWithoutUiServiceActivity, PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        passkeyAuthenticateWithoutUiServiceActivity.AEQbTJ(passkeySdkResult);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(PasskeyAuthenticateWithoutUiServiceActivity passkeyAuthenticateWithoutUiServiceActivity, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        passkeyAuthenticateWithoutUiServiceActivity.AEQbTJ(new PasskeySdkResult.Failure(ErrorCode.UNKNOWN_ERR, "User cancelled", false));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull PasskeySdkResult passkeySdkResult) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        C5922aFc.log$default(C5922aFc.KWHzl, "[AUTHENTICATE]", null, getTAG() + " finish with: " + passkeySdkResult.EZpvd(), 2, null);
        Intent intent = new Intent();
        if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithPublicKeyCredential) {
            intent.putExtra("KEY_SUCCESS_WITH_BYTE_ARRAY", ((PasskeySdkResult.SuccessWithPublicKeyCredential) passkeySdkResult).KWHzl());
        } else {
            intent.putExtra("KEY_RESPONSE", passkeySdkResult);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC6032aHg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6032aHg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6032aHg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC6032aHg, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
