package o;

import aws.sdk.kotlin.services.rekognition.serde.LabelDetectionSettingsDocumentSerializerKt$serializeLabelDetectionSettingsDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C22049hW {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C52129w c52129w) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c52129w, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("GeneralLabels"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        TextClock textClockKWHzl = c52129w.KWHzl();
        if (textClockKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, textClockKWHzl, LabelDetectionSettingsDocumentSerializerKt$serializeLabelDetectionSettingsDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
