package o;

import aws.sdk.kotlin.services.comprehend.serde.DetectEntitiesOperationSerializerKt$serializeDetectEntitiesOperationBody$1$2$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class AbstractEventLogger {
    public static final byte[] KWHzl(DT dt, BatteryProperty batteryProperty) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Application.KWHzl, new EX("Bytes"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DocumentReaderConfig"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("EndpointArn"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("LanguageCode"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("Text"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        byte[] bArrOLrzqt = batteryProperty.OLrzqt();
        if (bArrOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, C5162Hc.OLrzqt(bArrOLrzqt));
        }
        HandlerThread handlerThreadKWHzl = batteryProperty.KWHzl();
        if (handlerThreadKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, handlerThreadKWHzl, DetectEntitiesOperationSerializerKt$serializeDetectEntitiesOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strEZpvd = batteryProperty.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        SynchronousResultReceiver synchronousResultReceiverAEQbTJ = batteryProperty.AEQbTJ();
        if (synchronousResultReceiverAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, synchronousResultReceiverAEQbTJ.OLrzqt());
        }
        java.lang.String strCopydefault = batteryProperty.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strCopydefault);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
