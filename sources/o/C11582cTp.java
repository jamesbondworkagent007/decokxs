package o;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.drive.Drive;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.business.defi.biz.core.error.OKWException;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C11582cTp {
    public final java.util.concurrent.Executor AEQbTJ;
    public Drive EZpvd;
    public java.lang.String KWHzl;
    public final java.lang.String copydefault = getClass().getSimpleName();
    public final java.lang.String OLrzqt = "okx";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Drive OLrzqt() {
        return this.EZpvd;
    }

    public C11582cTp() {
        ExecutorService executorServiceGEmmrt = ThreadUtils.gEmmrt();
        Intrinsics.checkNotNullExpressionValue(executorServiceGEmmrt, "");
        this.AEQbTJ = executorServiceGEmmrt;
        this.KWHzl = "";
    }

    public boolean KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C14392dkb.AEQbTJ.KWHzl(context);
    }

    public void AEQbTJ(@NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            this.AEQbTJ.execute(new java.lang.Runnable() { // from class: o.cTz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C11582cTp.copydefault(this.KWHzl, handler, function1);
                }
            });
        } catch (java.lang.Exception unused) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }

    public static final void copydefault(C11582cTp c11582cTp, android.os.Handler handler, final Function1 function1) {
        C43365rns c43365rns = C43365rns.OLrzqt;
        java.lang.String str = c11582cTp.copydefault;
        Intrinsics.checkNotNullExpressionValue(str, "");
        final boolean zCanAccessOKX$default = C43365rns.canAccessOKX$default(c43365rns, str, "www.googleapis.com", 0, 4, null);
        handler.post(new java.lang.Runnable() { // from class: o.cTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C11582cTp.OLrzqt(function1, zCanAccessOKX$default);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
    }

    public void EZpvd(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            Task<GoogleSignInAccount> taskSilentSignIn = EZpvd(fragmentActivity).silentSignIn();
            final Function1 function12 = new Function1() { // from class: o.cTr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11582cTp.AEQbTJ(this.EZpvd, fragmentActivity, function1, (GoogleSignInAccount) obj);
                }
            };
            Intrinsics.copydefault(taskSilentSignIn.addOnSuccessListener(fragmentActivity, new OnSuccessListener() { // from class: o.cTu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    C11582cTp.AEQbTJ(function12, obj);
                }
            }).addOnFailureListener(fragmentActivity, new OnFailureListener() { // from class: o.cTt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    C11582cTp.KWHzl(this.copydefault, function1, exc);
                }
            }));
        } catch (java.lang.Exception e) {
            java.lang.String str = this.copydefault;
            Intrinsics.checkNotNullExpressionValue(str, "");
            C10856bwO.EZpvd(str, new OKWException("signIn Exception", e));
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.onKeyShortcut, 0, 1, (java.lang.Object) null);
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C11582cTp c11582cTp, FragmentActivity fragmentActivity, Function1 function1, GoogleSignInAccount googleSignInAccount) {
        Intrinsics.copydefault(googleSignInAccount);
        c11582cTp.copydefault(fragmentActivity, googleSignInAccount);
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C11582cTp c11582cTp, Function1 function1, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (exc instanceof ApiException) {
            java.lang.String str = c11582cTp.copydefault;
            ((ApiException) exc).getStatusCode();
            exc.getMessage();
        } else {
            java.lang.String str2 = c11582cTp.copydefault;
            exc.getMessage();
        }
        function1.invoke(java.lang.Boolean.FALSE);
    }

    public final android.content.Intent OLrzqt(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        android.content.Intent signInIntent = EZpvd(fragmentActivity).getSignInIntent();
        Intrinsics.checkNotNullExpressionValue(signInIntent, "");
        return signInIntent;
    }

    public final void KWHzl(@NotNull final FragmentActivity fragmentActivity, @NotNull android.content.Intent intent, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(intent);
        final Function1 function12 = new Function1() { // from class: o.cTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11582cTp.copydefault(this.EZpvd, fragmentActivity, function1, (GoogleSignInAccount) obj);
            }
        };
        signedInAccountFromIntent.addOnSuccessListener(new OnSuccessListener() { // from class: o.cTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                C11582cTp.EZpvd(function12, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.cTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                C11582cTp.KWHzl(function1, this, exc);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C11582cTp c11582cTp, FragmentActivity fragmentActivity, Function1 function1, GoogleSignInAccount googleSignInAccount) {
        Intrinsics.checkNotNullParameter(googleSignInAccount, "");
        c11582cTp.copydefault(fragmentActivity, googleSignInAccount);
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, C11582cTp c11582cTp, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        function1.invoke(java.lang.Boolean.FALSE);
        java.lang.String str = c11582cTp.copydefault;
    }

    public final void copydefault(FragmentActivity fragmentActivity, GoogleSignInAccount googleSignInAccount) {
        java.lang.String email = googleSignInAccount.getEmail();
        if (email == null) {
            email = "";
        }
        this.KWHzl = email;
        GoogleAccountCredential googleAccountCredentialUsingOAuth2 = GoogleAccountCredential.usingOAuth2(fragmentActivity.getApplicationContext(), Collections.singleton("https://www.googleapis.com/auth/drive.file"));
        googleAccountCredentialUsingOAuth2.setSelectedAccount(googleSignInAccount.getAccount());
        this.EZpvd = new Drive.Builder(AndroidHttp.newCompatibleTransport(), new GsonFactory(), googleAccountCredentialUsingOAuth2).setApplicationName(this.OLrzqt).build();
    }

    public final GoogleSignInClient EZpvd(FragmentActivity fragmentActivity) {
        GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestScopes(new Scope("https://www.googleapis.com/auth/drive.file"), new Scope("https://www.googleapis.com/auth/drive.appdata")).build();
        Intrinsics.checkNotNullExpressionValue(googleSignInOptionsBuild, "");
        GoogleSignInClient client = GoogleSignIn.getClient((android.app.Activity) fragmentActivity, googleSignInOptionsBuild);
        Intrinsics.checkNotNullExpressionValue(client, "");
        return client;
    }
}
