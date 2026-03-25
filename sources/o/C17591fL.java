package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectTextOperationSerializerKt$serializeDetectTextOperationBody$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.DetectTextOperationSerializerKt$serializeDetectTextOperationBody$1$2$1;
import com.immomo.mls.fun.ud.UDImageInfo;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.fL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C17591fL {
    public static final byte[] KWHzl(DT dt, RemoteViewsAdapter remoteViewsAdapter) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("Filters"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        RemoteViews remoteViewsCopydefault = remoteViewsAdapter.copydefault();
        if (remoteViewsCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, remoteViewsCopydefault, DetectTextOperationSerializerKt$serializeDetectTextOperationBody$1$1$1.INSTANCE);
        }
        C25615j c25615jAEQbTJ = remoteViewsAdapter.AEQbTJ();
        if (c25615jAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c25615jAEQbTJ, DetectTextOperationSerializerKt$serializeDetectTextOperationBody$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
