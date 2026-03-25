package o;

import aws.sdk.kotlin.services.rekognition.serde.CustomizationFeatureConfigDocumentSerializerKt$serializeCustomizationFeatureConfigDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13807dZ {
    public static final void KWHzl(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull DatePickerController datePickerController) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(datePickerController, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("ContentModeration"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        CursorTreeAdapter cursorTreeAdapterAEQbTJ = datePickerController.AEQbTJ();
        if (cursorTreeAdapterAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, cursorTreeAdapterAEQbTJ, CustomizationFeatureConfigDocumentSerializerKt$serializeCustomizationFeatureConfigDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
