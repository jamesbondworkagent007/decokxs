package o;

import aws.sdk.kotlin.services.rekognition.serde.StreamProcessorInputDocumentSerializerKt$serializeStreamProcessorInputDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30076lL {
    public static final void KWHzl(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8986bN c8986bN) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8986bN, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("KinesisVideoStream"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C31679m c31679mAEQbTJ = c8986bN.AEQbTJ();
        if (c31679mAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c31679mAEQbTJ, StreamProcessorInputDocumentSerializerKt$serializeStreamProcessorInputDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
