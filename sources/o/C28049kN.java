package o;

import aws.sdk.kotlin.services.rekognition.serde.StartFaceSearchOperationSerializerKt$serializeStartFaceSearchOperationBody$1$5$1;
import aws.sdk.kotlin.services.rekognition.serde.StartFaceSearchOperationSerializerKt$serializeStartFaceSearchOperationBody$1$6$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.kN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28049kN {
    public static final byte[] OLrzqt(DT dt, C10099bi c10099bi) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("CollectionId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("FaceMatchThreshold"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("JobTag"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("NotificationChannel"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("Video"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = c10099bi.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        java.lang.String strOLrzqt = c10099bi.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        java.lang.Float fKWHzl = c10099bi.KWHzl();
        if (fKWHzl != null) {
            ebEZpvd.copydefault(c5101Et3, fKWHzl.floatValue());
        }
        java.lang.String strAEQbTJ = c10099bi.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        C7662ao c7662aoEZpvd = c10099bi.EZpvd();
        if (c7662aoEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c7662aoEZpvd, StartFaceSearchOperationSerializerKt$serializeStartFaceSearchOperationBody$1$5$1.INSTANCE);
        }
        C11108cC c11108cCAhwBna = c10099bi.AhwBna();
        if (c11108cCAhwBna != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c11108cCAhwBna, StartFaceSearchOperationSerializerKt$serializeStartFaceSearchOperationBody$1$6$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
