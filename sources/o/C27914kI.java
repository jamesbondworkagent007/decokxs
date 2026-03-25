package o;

import aws.sdk.kotlin.services.rekognition.serde.StartContentModerationOperationSerializerKt$serializeStartContentModerationOperationBody$1$4$1;
import aws.sdk.kotlin.services.rekognition.serde.StartContentModerationOperationSerializerKt$serializeStartContentModerationOperationBody$1$5$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.kI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C27914kI {
    public static final byte[] copydefault(DT dt, C10311bm c10311bm) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("JobTag"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("MinConfidence"));
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
        java.lang.String strEZpvd = c10311bm.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        java.lang.String strCopydefault = c10311bm.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        java.lang.Float fOLrzqt = c10311bm.OLrzqt();
        if (fOLrzqt != null) {
            ebEZpvd.copydefault(c5101Et3, fOLrzqt.floatValue());
        }
        C7662ao c7662aoAEQbTJ = c10311bm.AEQbTJ();
        if (c7662aoAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c7662aoAEQbTJ, StartContentModerationOperationSerializerKt$serializeStartContentModerationOperationBody$1$4$1.INSTANCE);
        }
        C11108cC c11108cCKWHzl = c10311bm.KWHzl();
        if (c11108cCKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c11108cCKWHzl, StartContentModerationOperationSerializerKt$serializeStartContentModerationOperationBody$1$5$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
