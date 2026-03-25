package o;

import aws.sdk.kotlin.services.comprehend.serde.UpdateDataSecurityConfigDocumentSerializerKt$serializeUpdateDataSecurityConfigDocument$1$3$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ScaleGestureDetector {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull BrowserContract browserContract) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(browserContract, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ModelKmsKeyId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("VolumeKmsKeyId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("VpcConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = browserContract.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
        }
        java.lang.String strOLrzqt = browserContract.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        ContactsContract contactsContractEZpvd = browserContract.EZpvd();
        if (contactsContractEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, contactsContractEZpvd, UpdateDataSecurityConfigDocumentSerializerKt$serializeUpdateDataSecurityConfigDocument$1$3$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
