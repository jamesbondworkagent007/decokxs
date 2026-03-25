package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectProtectiveEquipmentOperationSerializerKt$serializeDetectProtectiveEquipmentOperationBody$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.DetectProtectiveEquipmentOperationSerializerKt$serializeDetectProtectiveEquipmentOperationBody$1$2$1;
import com.immomo.mls.fun.ud.UDImageInfo;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.fF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C17429fF {
    public static final byte[] EZpvd(DT dt, RemoteViewsListAdapter remoteViewsListAdapter) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("SummarizationAttributes"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C25615j c25615jEZpvd = remoteViewsListAdapter.EZpvd();
        if (c25615jEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c25615jEZpvd, DetectProtectiveEquipmentOperationSerializerKt$serializeDetectProtectiveEquipmentOperationBody$1$1$1.INSTANCE);
        }
        C6052aI c6052aICopydefault = remoteViewsListAdapter.copydefault();
        if (c6052aICopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c6052aICopydefault, DetectProtectiveEquipmentOperationSerializerKt$serializeDetectProtectiveEquipmentOperationBody$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
