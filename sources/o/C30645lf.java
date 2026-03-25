package o;

import aws.sdk.kotlin.services.rekognition.serde.StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30645lf {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C10841bw c10841bw) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c10841bw, "");
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("ShotFilter"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("TechnicalCueFilter"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C8456bD c8456bDOLrzqt = c10841bw.OLrzqt();
        if (c8456bDOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c8456bDOLrzqt, StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$1$1.INSTANCE);
        }
        C8297bA c8297bAKWHzl = c10841bw.KWHzl();
        if (c8297bAKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c8297bAKWHzl, StartSegmentDetectionFiltersDocumentSerializerKt$serializeStartSegmentDetectionFiltersDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
