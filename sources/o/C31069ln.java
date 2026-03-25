package o;

import aws.sdk.kotlin.services.rekognition.serde.StartTechnicalCueDetectionFilterDocumentSerializerKt$serializeStartTechnicalCueDetectionFilterDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C31069ln {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8456bD c8456bD) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8456bD, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("BlackFrame"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("MinSegmentConfidence"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Float fAEQbTJ = c8456bD.AEQbTJ();
        if (fAEQbTJ != null) {
            ebEZpvd.copydefault(c5101Et2, fAEQbTJ.floatValue());
        }
        WebViewLibraryLoader webViewLibraryLoaderKWHzl = c8456bD.KWHzl();
        if (webViewLibraryLoaderKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, webViewLibraryLoaderKWHzl, StartTechnicalCueDetectionFilterDocumentSerializerKt$serializeStartTechnicalCueDetectionFilterDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
