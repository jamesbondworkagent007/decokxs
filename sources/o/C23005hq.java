package o;

import aws.sdk.kotlin.services.rekognition.serde.ImageDocumentSerializerKt$serializeImageDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23005hq {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C25615j c25615j) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c25615j, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Application.KWHzl, new EX("Bytes"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("S3Object"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        byte[] bArrEZpvd = c25615j.EZpvd();
        if (bArrEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, C5162Hc.OLrzqt(bArrEZpvd));
        }
        C6582aS c6582aSCopydefault = c25615j.copydefault();
        if (c6582aSCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c6582aSCopydefault, ImageDocumentSerializerKt$serializeImageDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
