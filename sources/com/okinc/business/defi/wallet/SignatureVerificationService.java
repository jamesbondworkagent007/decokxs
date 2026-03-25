package com.okinc.business.defi.wallet;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.okinc.business.defi.wallet.SignatureVerificationService;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C14491dmU;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public class SignatureVerificationService extends Service {
    private static final int MSG_VERIFICATION_REQUEST = 1;
    private static final int MSG_VERIFICATION_RESPONSE = 2;
    private static final String TAG = "SecuritySignaturePermissionCheck";
    private final Messenger messenger = new Messenger(new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.dXb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message message) {
            return SignatureVerificationService.messenger$lambda$0(this.copydefault, message);
        }
    }));
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.SignatureVerificationService.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final boolean messenger$lambda$0(SignatureVerificationService signatureVerificationService, Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        if (message.what != 1) {
            return false;
        }
        pUU.KWHzl(TAG, "Received verification request, " + message.getData());
        signatureVerificationService.sendVerificationResponse(message.replyTo, message.getData().getString("clientPackageName"), message.getData().getString("clientVersion"));
        return true;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder binder = this.messenger.getBinder();
        Intrinsics.checkNotNullExpressionValue(binder, "");
        return binder;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #0 {Exception -> 0x0086, blocks: (B:5:0x0008, B:9:0x0011, B:12:0x0018, B:13:0x0053), top: B:19:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendVerificationResponse(Messenger messenger, String str, String str2) {
        if (messenger != null) {
            if (str != null) {
                try {
                    if (str.length() == 0 || str2 == null || str2.length() == 0) {
                        Message messageObtain = Message.obtain((Handler) null, 2);
                        Bundle bundle = new Bundle();
                        bundle.putString(EopTrackEvent.KEY_ERROR_MSG_HUMP, "params error");
                        messageObtain.setData(bundle);
                        messenger.send(messageObtain);
                        pUU.valueOf(TAG, "Verification response sent clientPackageName: " + str + ", clientVersion=" + str2);
                    } else {
                        C14491dmU.Application applicationKWHzl = C14491dmU.Companion.OLrzqt().KWHzl(str, str2);
                        Message messageObtain2 = Message.obtain((Handler) null, 2);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("token", applicationKWHzl.EZpvd());
                        messageObtain2.setData(bundle2);
                        messenger.send(messageObtain2);
                        pUU.KWHzl(TAG, "Verification response sent token: " + applicationKWHzl.EZpvd());
                    }
                } catch (Exception e) {
                    pUU.AEQbTJ(TAG, "Failed to send verification response", e);
                }
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
