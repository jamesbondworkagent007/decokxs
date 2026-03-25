package o;

import aws.sdk.kotlin.services.rekognition.serde.StartCelebrityRecognitionOperationSerializerKt$serializeStartCelebrityRecognitionOperationBody$1$3$1;
import aws.sdk.kotlin.services.rekognition.serde.StartCelebrityRecognitionOperationSerializerKt$serializeStartCelebrityRecognitionOperationBody$1$4$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.kC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C27751kC {
    public static final byte[] EZpvd(DT dt, C9993bg c9993bg) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("JobTag"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("NotificationChannel"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("Video"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = c9993bg.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        java.lang.String strOLrzqt = c9993bg.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        C7662ao c7662aoEZpvd = c9993bg.EZpvd();
        if (c7662aoEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c7662aoEZpvd, StartCelebrityRecognitionOperationSerializerKt$serializeStartCelebrityRecognitionOperationBody$1$3$1.INSTANCE);
        }
        C11108cC c11108cCKWHzl = c9993bg.KWHzl();
        if (c11108cCKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c11108cCKWHzl, StartCelebrityRecognitionOperationSerializerKt$serializeStartCelebrityRecognitionOperationBody$1$4$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
