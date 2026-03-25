package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetUserMFAPreferenceOperationSerializerKt$serializeSetUserMFAPreferenceOperationBody$1$2$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetUserMFAPreferenceOperationSerializerKt$serializeSetUserMFAPreferenceOperationBody$1$3$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class OutputConfiguration {
    public static final byte[] copydefault(DT dt, TimePickerDialog timePickerDialog) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("AccessToken"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("SMSMfaSettings"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("SoftwareTokenMfaSettings"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = timePickerDialog.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        WaitResult waitResultKWHzl = timePickerDialog.KWHzl();
        if (waitResultKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, waitResultKWHzl, SetUserMFAPreferenceOperationSerializerKt$serializeSetUserMFAPreferenceOperationBody$1$2$1.INSTANCE);
        }
        WindowConfiguration windowConfigurationOLrzqt = timePickerDialog.OLrzqt();
        if (windowConfigurationOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, windowConfigurationOLrzqt, SetUserMFAPreferenceOperationSerializerKt$serializeSetUserMFAPreferenceOperationBody$1$3$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
