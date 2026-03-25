package o;

import aws.sdk.kotlin.services.textract.serde.DocumentDocumentSerializerKt$serializeDocumentDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38363pW {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C35318nt c35318nt) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c35318nt, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Application.KWHzl, new EX("Bytes"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("S3Object"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        byte[] bArrCopydefault = c35318nt.copydefault();
        if (bArrCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, C5162Hc.OLrzqt(bArrCopydefault));
        }
        C35796oE c35796oEOLrzqt = c35318nt.OLrzqt();
        if (c35796oEOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c35796oEOLrzqt, DocumentDocumentSerializerKt$serializeDocumentDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
