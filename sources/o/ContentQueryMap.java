package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ConfirmDeviceOperationSerializerKt$serializeConfirmDeviceOperationBody$1$4$1;
import com.amplifyframework.auth.cognito.asf.BuildDataCollector;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentQueryMap {
    public static final byte[] EZpvd(DT dt, ArgbEvaluator argbEvaluator) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AccessToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DeviceKey"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX(BuildDataCollector.MODEL));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DeviceSecretVerifierConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = argbEvaluator.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        java.lang.String strKWHzl = argbEvaluator.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        java.lang.String strCopydefault = argbEvaluator.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strCopydefault);
        }
        PluralsRes pluralsResOLrzqt = argbEvaluator.OLrzqt();
        if (pluralsResOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, pluralsResOLrzqt, ConfirmDeviceOperationSerializerKt$serializeConfirmDeviceOperationBody$1$4$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
