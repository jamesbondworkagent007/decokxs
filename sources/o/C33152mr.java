package o;

import aws.sdk.kotlin.services.rekognition.serde.UpdateDatasetEntriesOperationSerializerKt$serializeUpdateDatasetEntriesOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.mr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33152mr {
    public static final byte[] EZpvd(DT dt, C12707cs c12707cs) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Changes"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("DatasetArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        DayPickerView dayPickerViewCopydefault = c12707cs.copydefault();
        if (dayPickerViewCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, dayPickerViewCopydefault, UpdateDatasetEntriesOperationSerializerKt$serializeUpdateDatasetEntriesOperationBody$1$1$1.INSTANCE);
        }
        java.lang.String strAEQbTJ = c12707cs.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
