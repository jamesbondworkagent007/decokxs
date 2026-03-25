package o;

import aws.sdk.kotlin.services.rekognition.serde.StartStreamProcessorOperationSerializerKt$serializeStartStreamProcessorOperationBody$1$2$1;
import aws.sdk.kotlin.services.rekognition.serde.StartStreamProcessorOperationSerializerKt$serializeStartStreamProcessorOperationBody$1$3$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30857lj {
    public static final byte[] copydefault(DT dt, C10947by c10947by) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Name"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("StartSelector"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("StopSelector"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strAEQbTJ = c10947by.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
        }
        C8827bK c8827bKKWHzl = c10947by.KWHzl();
        if (c8827bKKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c8827bKKWHzl, StartStreamProcessorOperationSerializerKt$serializeStartStreamProcessorOperationBody$1$2$1.INSTANCE);
        }
        C8721bI c8721bIEZpvd = c10947by.EZpvd();
        if (c8721bIEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c8721bIEZpvd, StartStreamProcessorOperationSerializerKt$serializeStartStreamProcessorOperationBody$1$3$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
