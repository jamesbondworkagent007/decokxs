package o;

import aws.sdk.kotlin.services.rekognition.serde.VideoDocumentSerializerKt$serializeVideoDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C31763mD {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C11108cC c11108cC) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c11108cC, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("S3Object"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C6582aS c6582aSEZpvd = c11108cC.EZpvd();
        if (c6582aSEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c6582aSEZpvd, VideoDocumentSerializerKt$serializeVideoDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
