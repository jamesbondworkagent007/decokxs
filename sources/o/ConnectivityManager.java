package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UserPoolPolicyTypeDocumentSerializerKt$serializeUserPoolPolicyTypeDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ConnectivityManager {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull SharedPreferencesBackupHelper sharedPreferencesBackupHelper) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(sharedPreferencesBackupHelper, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("PasswordPolicy"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        NotificationChannel notificationChannelOLrzqt = sharedPreferencesBackupHelper.OLrzqt();
        if (notificationChannelOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, notificationChannelOLrzqt, UserPoolPolicyTypeDocumentSerializerKt$serializeUserPoolPolicyTypeDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
