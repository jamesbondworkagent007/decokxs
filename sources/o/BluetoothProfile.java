package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminSetUserMFAPreferenceOperationSerializerKt$serializeAdminSetUserMFAPreferenceOperationBody$1$1$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminSetUserMFAPreferenceOperationSerializerKt$serializeAdminSetUserMFAPreferenceOperationBody$1$2$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class BluetoothProfile {
    public static final byte[] AEQbTJ(DT dt, SecretKeySpec secretKeySpec) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("SMSMfaSettings"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("SoftwareTokenMfaSettings"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Username"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        WaitResult waitResultCopydefault = secretKeySpec.copydefault();
        if (waitResultCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, waitResultCopydefault, AdminSetUserMFAPreferenceOperationSerializerKt$serializeAdminSetUserMFAPreferenceOperationBody$1$1$1.INSTANCE);
        }
        WindowConfiguration windowConfigurationAEQbTJ = secretKeySpec.AEQbTJ();
        if (windowConfigurationAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, windowConfigurationAEQbTJ, AdminSetUserMFAPreferenceOperationSerializerKt$serializeAdminSetUserMFAPreferenceOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strEZpvd = secretKeySpec.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        java.lang.String strKWHzl = secretKeySpec.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
