package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolDomainOperationSerializerKt$serializeUpdateUserPoolDomainOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class UsbDevice {
    public static final byte[] KWHzl(DT dt, FileBackupHelper fileBackupHelper) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("CustomDomainConfig"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("Domain"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        AnimRes animResEZpvd = fileBackupHelper.EZpvd();
        if (animResEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, animResEZpvd, UpdateUserPoolDomainOperationSerializerKt$serializeUpdateUserPoolDomainOperationBody$1$1$1.INSTANCE);
        }
        java.lang.String strCopydefault = fileBackupHelper.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        java.lang.String strOLrzqt = fileBackupHelper.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
