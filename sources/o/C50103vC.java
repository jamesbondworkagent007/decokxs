package o;

import aws.sdk.kotlin.services.translate.serde.OutputDataConfigDocumentSerializerKt$serializeOutputDataConfigDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50103vC {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C45916tB c45916tB) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c45916tB, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("EncryptionKey"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("S3Uri"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et2, c45916tB.KWHzl());
        C46697tc c46697tcCopydefault = c45916tB.copydefault();
        if (c46697tcCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c46697tcCopydefault, OutputDataConfigDocumentSerializerKt$serializeOutputDataConfigDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
