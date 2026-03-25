package o;

import aws.sdk.kotlin.services.rekognition.serde.StartFaceDetectionOperationSerializerKt$serializeStartFaceDetectionOperationBody$1$4$1;
import aws.sdk.kotlin.services.rekognition.serde.StartFaceDetectionOperationSerializerKt$serializeStartFaceDetectionOperationBody$1$5$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.kF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C27833kF {
    public static final byte[] EZpvd(DT dt, C10152bj c10152bj) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("FaceAttributes"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("JobTag"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
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
        java.lang.String strAEQbTJ = c10152bj.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
        }
        Spinner spinnerKWHzl = c10152bj.KWHzl();
        if (spinnerKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, spinnerKWHzl.EZpvd());
        }
        java.lang.String strCopydefault = c10152bj.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strCopydefault);
        }
        C7662ao c7662aoOLrzqt = c10152bj.OLrzqt();
        if (c7662aoOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c7662aoOLrzqt, StartFaceDetectionOperationSerializerKt$serializeStartFaceDetectionOperationBody$1$4$1.INSTANCE);
        }
        C11108cC c11108cCEZpvd = c10152bj.EZpvd();
        if (c11108cCEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c11108cCEZpvd, StartFaceDetectionOperationSerializerKt$serializeStartFaceDetectionOperationBody$1$5$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
