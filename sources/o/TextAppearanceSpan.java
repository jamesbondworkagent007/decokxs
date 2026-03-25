package o;

import aws.sdk.kotlin.services.comprehend.serde.ListDocumentClassificationJobsOperationSerializerKt$serializeListDocumentClassificationJobsOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class TextAppearanceSpan {
    public static final byte[] OLrzqt(DT dt, SystemVibrator systemVibrator) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Filter"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        CountDownTimer countDownTimerCopydefault = systemVibrator.copydefault();
        if (countDownTimerCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, countDownTimerCopydefault, ListDocumentClassificationJobsOperationSerializerKt$serializeListDocumentClassificationJobsOperationBody$1$1$1.INSTANCE);
        }
        java.lang.Integer numAEQbTJ = systemVibrator.AEQbTJ();
        if (numAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et2, numAEQbTJ.intValue());
        }
        java.lang.String strEZpvd = systemVibrator.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
