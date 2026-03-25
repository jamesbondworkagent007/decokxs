package o;

import aws.sdk.kotlin.services.comprehend.serde.ListFlywheelIterationHistoryOperationSerializerKt$serializeListFlywheelIterationHistoryOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class TransitionValuesMaps {
    public static final byte[] AEQbTJ(DT dt, WorkSource workSource) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Filter"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("FlywheelArn"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        RemoteCallback remoteCallbackOLrzqt = workSource.OLrzqt();
        if (remoteCallbackOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, remoteCallbackOLrzqt, ListFlywheelIterationHistoryOperationSerializerKt$serializeListFlywheelIterationHistoryOperationBody$1$1$1.INSTANCE);
        }
        java.lang.String strEZpvd = workSource.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        java.lang.Integer numAEQbTJ = workSource.AEQbTJ();
        if (numAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et3, numAEQbTJ.intValue());
        }
        java.lang.String strKWHzl = workSource.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
