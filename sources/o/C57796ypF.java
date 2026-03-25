package o;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.OneSignal;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: o.ypF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57796ypF extends AbstractC57795ypE {
    public final TaskDescription AhwBna;
    public FirebaseApp djBIcL;
    public final android.content.Context gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57795ypE
    public java.lang.String EZpvd() {
        return FirebaseMessaging.INSTANCE_ID_SCOPE;
    }

    /* JADX INFO: renamed from: o.ypF$TaskDescription */
    public static class TaskDescription {
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        public TaskDescription() {
            this(null, null, null);
        }

        public TaskDescription(@androidx.annotation.Nullable java.lang.String str, @androidx.annotation.Nullable java.lang.String str2, @androidx.annotation.Nullable java.lang.String str3) {
            this.EZpvd = str == null ? "onesignal-shared-public" : str;
            this.copydefault = str2 == null ? "1:754795614042:android:c682b8144a8dd52bc1ad63" : str2;
            this.OLrzqt = str3 == null ? new java.lang.String(android.util.Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0)) : str3;
        }
    }

    public C57796ypF(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable TaskDescription taskDescription) {
        this.gEmmrt = context;
        if (taskDescription == null) {
            this.AhwBna = new TaskDescription();
        } else {
            this.AhwBna = taskDescription;
        }
    }

    @Override // o.AbstractC57795ypE
    public java.lang.String OLrzqt(java.lang.String str) throws java.lang.Exception {
        AEQbTJ(str);
        try {
            return KWHzl();
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodError unused) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return EZpvd(str);
        }
    }

    @java.lang.Deprecated
    public final java.lang.String EZpvd(java.lang.String str) throws java.io.IOException {
        try {
            java.lang.Object objInvoke = java.lang.Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", FirebaseApp.class).invoke(null, this.djBIcL);
            return (java.lang.String) objInvoke.getClass().getMethod("getToken", java.lang.String.class, java.lang.String.class).invoke(objInvoke, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | InvocationTargetException e) {
            throw new java.lang.Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e);
        }
    }

    public final java.lang.String KWHzl() throws java.lang.Exception {
        Task<java.lang.String> token = ((FirebaseMessaging) this.djBIcL.get(FirebaseMessaging.class)).getToken();
        try {
            return (java.lang.String) Tasks.await(token);
        } catch (ExecutionException unused) {
            throw token.getException();
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        if (this.djBIcL != null) {
            return;
        }
        this.djBIcL = FirebaseApp.initializeApp(this.gEmmrt, new FirebaseOptions.Builder().setGcmSenderId(str).setApplicationId(this.AhwBna.copydefault).setApiKey(this.AhwBna.OLrzqt).setProjectId(this.AhwBna.EZpvd).build(), "ONESIGNAL_SDK_FCM_APP_NAME");
    }
}
