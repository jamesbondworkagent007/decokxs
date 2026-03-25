package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateDatasetOperationSerializerKt$serializeCreateDatasetOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.dB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13159dB {
    public static final byte[] OLrzqt(DT dt, BaseExpandableListAdapter baseExpandableListAdapter) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DatasetSource"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("DatasetType"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ProjectArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        EdgeEffect edgeEffectOLrzqt = baseExpandableListAdapter.OLrzqt();
        if (edgeEffectOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, edgeEffectOLrzqt, CreateDatasetOperationSerializerKt$serializeCreateDatasetOperationBody$1$1$1.INSTANCE);
        }
        DigitalClock digitalClockAEQbTJ = baseExpandableListAdapter.AEQbTJ();
        if (digitalClockAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, digitalClockAEQbTJ.KWHzl());
        }
        java.lang.String strEZpvd = baseExpandableListAdapter.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
