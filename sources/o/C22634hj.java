package o;

import aws.sdk.kotlin.services.rekognition.serde.GroundTruthManifestDocumentSerializerKt$serializeGroundTruthManifestDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C22634hj {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C13131d c13131d) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c13131d, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("S3Object"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C6582aS c6582aSKWHzl = c13131d.KWHzl();
        if (c6582aSKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c6582aSKWHzl, GroundTruthManifestDocumentSerializerKt$serializeGroundTruthManifestDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
