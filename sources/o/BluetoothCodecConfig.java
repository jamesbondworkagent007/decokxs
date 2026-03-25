package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminLinkProviderForUserOperationSerializerKt$serializeAdminLinkProviderForUserOperationBody$1$1$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminLinkProviderForUserOperationSerializerKt$serializeAdminLinkProviderForUserOperationBody$1$2$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes20.dex */
public final class BluetoothCodecConfig {
    public static final byte[] KWHzl(DT dt, ShortBufferException shortBufferException) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("DestinationUser"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("SourceUser"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        PackageInstallObserver packageInstallObserverOLrzqt = shortBufferException.OLrzqt();
        if (packageInstallObserverOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, packageInstallObserverOLrzqt, AdminLinkProviderForUserOperationSerializerKt$serializeAdminLinkProviderForUserOperationBody$1$1$1.INSTANCE);
        }
        PackageInstallObserver packageInstallObserverCopydefault = shortBufferException.copydefault();
        if (packageInstallObserverCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, packageInstallObserverCopydefault, AdminLinkProviderForUserOperationSerializerKt$serializeAdminLinkProviderForUserOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strEZpvd = shortBufferException.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
