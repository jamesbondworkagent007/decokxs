package o;

import aws.sdk.kotlin.services.rekognition.serde.MediaAnalysisInputDocumentSerializerKt$serializeMediaAnalysisInputDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C24103iV {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull X x) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(x, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("S3Object"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C6582aS c6582aSCopydefault = x.copydefault();
        if (c6582aSCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c6582aSCopydefault, MediaAnalysisInputDocumentSerializerKt$serializeMediaAnalysisInputDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
