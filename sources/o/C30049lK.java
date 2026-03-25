package o;

import aws.sdk.kotlin.services.rekognition.serde.StreamProcessorOutputDocumentSerializerKt$serializeStreamProcessorOutputDocument$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.StreamProcessorOutputDocumentSerializerKt$serializeStreamProcessorOutputDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30049lK {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8933bM c8933bM) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8933bM, "");
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("KinesisDataStream"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("S3Destination"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C33629n c33629nCopydefault = c8933bM.copydefault();
        if (c33629nCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c33629nCopydefault, StreamProcessorOutputDocumentSerializerKt$serializeStreamProcessorOutputDocument$1$1$1.INSTANCE);
        }
        C6529aR c6529aRAEQbTJ = c8933bM.AEQbTJ();
        if (c6529aRAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c6529aRAEQbTJ, StreamProcessorOutputDocumentSerializerKt$serializeStreamProcessorOutputDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
