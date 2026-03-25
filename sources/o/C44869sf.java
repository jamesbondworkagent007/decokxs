package o;

import aws.sdk.kotlin.services.textract.serde.StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$2$1;
import aws.sdk.kotlin.services.textract.serde.StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$5$1;
import aws.sdk.kotlin.services.textract.serde.StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$6$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44869sf {
    public static final byte[] AEQbTJ(DT dt, C35931oJ c35931oJ) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("DocumentLocation"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("JobTag"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("KMSKeyId"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("NotificationChannel"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("OutputConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = c35931oJ.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
        }
        C35634nz c35634nzEZpvd = c35931oJ.EZpvd();
        if (c35634nzEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c35634nzEZpvd, StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strOLrzqt = c35931oJ.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strOLrzqt);
        }
        java.lang.String strAEQbTJ = c35931oJ.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        C37291or c37291orCopydefault = c35931oJ.copydefault();
        if (c37291orCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c37291orCopydefault, StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$5$1.INSTANCE);
        }
        C37344os c37344osValueOf = c35931oJ.valueOf();
        if (c37344osValueOf != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c37344osValueOf, StartDocumentTextDetectionOperationSerializerKt$serializeStartDocumentTextDetectionOperationBody$1$6$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
