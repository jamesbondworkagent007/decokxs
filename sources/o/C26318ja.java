package o;

import aws.sdk.kotlin.services.rekognition.serde.MediaAnalysisOperationsConfigDocumentSerializerKt$serializeMediaAnalysisOperationsConfigDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C26318ja {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C7291ah c7291ah) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c7291ah, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DetectModerationLabels"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        Y yOLrzqt = c7291ah.OLrzqt();
        if (yOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, yOLrzqt, MediaAnalysisOperationsConfigDocumentSerializerKt$serializeMediaAnalysisOperationsConfigDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
