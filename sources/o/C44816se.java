package o;

import aws.sdk.kotlin.services.textract.serde.StartExpenseAnalysisOperationSerializerKt$serializeStartExpenseAnalysisOperationBody$1$2$1;
import aws.sdk.kotlin.services.textract.serde.StartExpenseAnalysisOperationSerializerKt$serializeStartExpenseAnalysisOperationBody$1$5$1;
import aws.sdk.kotlin.services.textract.serde.StartExpenseAnalysisOperationSerializerKt$serializeStartExpenseAnalysisOperationBody$1$6$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44816se {
    public static final byte[] AEQbTJ(DT dt, C36012oM c36012oM) {
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
        java.lang.String strEZpvd = c36012oM.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        C35634nz c35634nzKWHzl = c36012oM.KWHzl();
        if (c35634nzKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c35634nzKWHzl, StartExpenseAnalysisOperationSerializerKt$serializeStartExpenseAnalysisOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strCopydefault = c36012oM.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strCopydefault);
        }
        java.lang.String strAEQbTJ = c36012oM.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        C37291or c37291orOLrzqt = c36012oM.OLrzqt();
        if (c37291orOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c37291orOLrzqt, StartExpenseAnalysisOperationSerializerKt$serializeStartExpenseAnalysisOperationBody$1$5$1.INSTANCE);
        }
        C37344os c37344osAYXKKw = c36012oM.AYXKKw();
        if (c37344osAYXKKw != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c37344osAYXKKw, StartExpenseAnalysisOperationSerializerKt$serializeStartExpenseAnalysisOperationBody$1$6$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
