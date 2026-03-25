package o;

import aws.sdk.kotlin.services.rekognition.serde.StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$2$1;
import aws.sdk.kotlin.services.rekognition.serde.StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$5$1;
import aws.sdk.kotlin.services.rekognition.serde.StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$6$1;
import kotlin.Unit;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.kW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28292kW {
    public static final byte[] copydefault(DT dt, C10417bo c10417bo) {
        Unit unit;
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("Input"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("JobName"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("KmsKeyId"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("OperationsConfig"));
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
        java.lang.String strKWHzl = c10417bo.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ebEZpvd.AEQbTJ(c5101Et, C57419yi.EZpvd(dt).KWHzl());
        }
        X xCopydefault = c10417bo.copydefault();
        if (xCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, xCopydefault, StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strAEQbTJ = c10417bo.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        java.lang.String strOLrzqt = c10417bo.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        C7291ah c7291ahEZpvd = c10417bo.EZpvd();
        if (c7291ahEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c7291ahEZpvd, StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$5$1.INSTANCE);
        }
        C7185af c7185afValueOf = c10417bo.valueOf();
        if (c7185afValueOf != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c7185afValueOf, StartMediaAnalysisJobOperationSerializerKt$serializeStartMediaAnalysisJobOperationBody$1$6$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
