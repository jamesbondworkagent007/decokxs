package o;

import aws.sdk.kotlin.services.comprehend.serde.ListPiiEntitiesDetectionJobsOperationSerializerKt$serializeListPiiEntitiesDetectionJobsOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class Config {
    public static final byte[] EZpvd(DT dt, HealthStatsParceler healthStatsParceler) {
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
        DiskWriteViolation diskWriteViolationAEQbTJ = healthStatsParceler.AEQbTJ();
        if (diskWriteViolationAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, diskWriteViolationAEQbTJ, ListPiiEntitiesDetectionJobsOperationSerializerKt$serializeListPiiEntitiesDetectionJobsOperationBody$1$1$1.INSTANCE);
        }
        java.lang.Integer numEZpvd = healthStatsParceler.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et2, numEZpvd.intValue());
        }
        java.lang.String strKWHzl = healthStatsParceler.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
