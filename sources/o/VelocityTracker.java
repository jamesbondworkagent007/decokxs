package o;

import aws.sdk.kotlin.services.comprehend.serde.UpdateFlywheelOperationSerializerKt$serializeUpdateFlywheelOperationBody$1$3$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class VelocityTracker {
    public static final byte[] EZpvd(DT dt, Browser browser) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ActiveModelArn"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DataAccessRoleArn"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DataSecurityConfig"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("FlywheelArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = browser.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        java.lang.String strAEQbTJ = browser.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        BrowserContract browserContractOLrzqt = browser.OLrzqt();
        if (browserContractOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, browserContractOLrzqt, UpdateFlywheelOperationSerializerKt$serializeUpdateFlywheelOperationBody$1$3$1.INSTANCE);
        }
        java.lang.String strEZpvd = browser.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
