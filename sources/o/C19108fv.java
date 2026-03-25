package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectLabelsSettingsDocumentSerializerKt$serializeDetectLabelsSettingsDocument$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.DetectLabelsSettingsDocumentSerializerKt$serializeDetectLabelsSettingsDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C19108fv {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull RadioButton radioButton) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(radioButton, "");
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("GeneralLabels"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("ImageProperties"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        TextClock textClockOLrzqt = radioButton.OLrzqt();
        if (textClockOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, textClockOLrzqt, DetectLabelsSettingsDocumentSerializerKt$serializeDetectLabelsSettingsDocument$1$1$1.INSTANCE);
        }
        PopupMenu popupMenuCopydefault = radioButton.copydefault();
        if (popupMenuCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, popupMenuCopydefault, DetectLabelsSettingsDocumentSerializerKt$serializeDetectLabelsSettingsDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
