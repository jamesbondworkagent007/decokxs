package o;

import aws.sdk.kotlin.services.rekognition.serde.StreamProcessingStartSelectorDocumentSerializerKt$serializeStreamProcessingStartSelectorDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C31598lx {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8827bK c8827bK) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8827bK, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("KVSStreamStartSelector"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C35687o c35687oOLrzqt = c8827bK.OLrzqt();
        if (c35687oOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c35687oOLrzqt, StreamProcessingStartSelectorDocumentSerializerKt$serializeStreamProcessingStartSelectorDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
