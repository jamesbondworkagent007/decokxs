package o;

import aws.sdk.kotlin.services.textract.serde.StartLendingAnalysisOperationSerializerKt$serializeStartLendingAnalysisOperationBody$1$2$1;
import aws.sdk.kotlin.services.textract.serde.StartLendingAnalysisOperationSerializerKt$serializeStartLendingAnalysisOperationBody$1$5$1;
import aws.sdk.kotlin.services.textract.serde.StartLendingAnalysisOperationSerializerKt$serializeStartLendingAnalysisOperationBody$1$6$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C45293sn {
    public static final byte[] AEQbTJ(DT dt, C36093oP c36093oP) {
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
        java.lang.String strCopydefault = c36093oP.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        C35634nz c35634nzEZpvd = c36093oP.EZpvd();
        if (c35634nzEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c35634nzEZpvd, StartLendingAnalysisOperationSerializerKt$serializeStartLendingAnalysisOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strKWHzl = c36093oP.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strKWHzl);
        }
        java.lang.String strAEQbTJ = c36093oP.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        C37291or c37291orOLrzqt = c36093oP.OLrzqt();
        if (c37291orOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c37291orOLrzqt, StartLendingAnalysisOperationSerializerKt$serializeStartLendingAnalysisOperationBody$1$5$1.INSTANCE);
        }
        C37344os c37344osValueOf = c36093oP.valueOf();
        if (c37344osValueOf != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c37344osValueOf, StartLendingAnalysisOperationSerializerKt$serializeStartLendingAnalysisOperationBody$1$6$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
