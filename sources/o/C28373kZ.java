package o;

import aws.sdk.kotlin.services.rekognition.serde.StartPersonTrackingOperationSerializerKt$serializeStartPersonTrackingOperationBody$1$3$1;
import aws.sdk.kotlin.services.rekognition.serde.StartPersonTrackingOperationSerializerKt$serializeStartPersonTrackingOperationBody$1$4$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.kZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28373kZ {
    public static final byte[] copydefault(DT dt, C10788bv c10788bv) {
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
        java.lang.String strOLrzqt = c10788bv.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
        }
        java.lang.String strKWHzl = c10788bv.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        C7662ao c7662aoAEQbTJ = c10788bv.AEQbTJ();
        if (c7662aoAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c7662aoAEQbTJ, StartPersonTrackingOperationSerializerKt$serializeStartPersonTrackingOperationBody$1$3$1.INSTANCE);
        }
        C11108cC c11108cCCopydefault = c10788bv.copydefault();
        if (c11108cCCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c11108cCCopydefault, StartPersonTrackingOperationSerializerKt$serializeStartPersonTrackingOperationBody$1$4$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
