package o;

import aws.sdk.kotlin.services.rekognition.serde.StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$2$1;
import aws.sdk.kotlin.services.rekognition.serde.StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$4$1;
import aws.sdk.kotlin.services.rekognition.serde.StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$5$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C31334ls {
    public static final byte[] KWHzl(DT dt, C8615bG c8615bG) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("Filters"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("JobTag"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("NotificationChannel"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("Video"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strAEQbTJ = c8615bG.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
        }
        C8509bE c8509bEKWHzl = c8615bG.KWHzl();
        if (c8509bEKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c8509bEKWHzl, StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strEZpvd = c8615bG.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        C7662ao c7662aoCopydefault = c8615bG.copydefault();
        if (c7662aoCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c7662aoCopydefault, StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$4$1.INSTANCE);
        }
        C11108cC c11108cCOLrzqt = c8615bG.OLrzqt();
        if (c11108cCOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c11108cCOLrzqt, StartTextDetectionOperationSerializerKt$serializeStartTextDetectionOperationBody$1$5$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
