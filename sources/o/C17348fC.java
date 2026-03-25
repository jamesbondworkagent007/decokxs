package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectModerationLabelsOperationSerializerKt$serializeDetectModerationLabelsOperationBody$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.DetectModerationLabelsOperationSerializerKt$serializeDetectModerationLabelsOperationBody$1$2$1;
import com.immomo.mls.fun.ud.UDImageInfo;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.fC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C17348fC {
    public static final byte[] copydefault(DT dt, QuickContactBadge quickContactBadge) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("HumanLoopConfig"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("MinConfidence"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ProjectVersion"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C23535i c23535iEZpvd = quickContactBadge.EZpvd();
        if (c23535iEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c23535iEZpvd, DetectModerationLabelsOperationSerializerKt$serializeDetectModerationLabelsOperationBody$1$1$1.INSTANCE);
        }
        C25615j c25615jOLrzqt = quickContactBadge.OLrzqt();
        if (c25615jOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c25615jOLrzqt, DetectModerationLabelsOperationSerializerKt$serializeDetectModerationLabelsOperationBody$1$2$1.INSTANCE);
        }
        java.lang.Float fCopydefault = quickContactBadge.copydefault();
        if (fCopydefault != null) {
            ebEZpvd.copydefault(c5101Et3, fCopydefault.floatValue());
        }
        java.lang.String strKWHzl = quickContactBadge.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
