package o;

import aws.sdk.kotlin.services.textract.serde.AdapterVersionDatasetConfigDocumentSerializerKt$serializeAdapterVersionDatasetConfigDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38842ph {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C32249mV c32249mV) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c32249mV, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("ManifestS3Object"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C35796oE c35796oEAEQbTJ = c32249mV.AEQbTJ();
        if (c35796oEAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c35796oEAEQbTJ, AdapterVersionDatasetConfigDocumentSerializerKt$serializeAdapterVersionDatasetConfigDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
