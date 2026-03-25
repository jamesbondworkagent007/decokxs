package o;

import aws.sdk.kotlin.services.rekognition.serde.DatasetSourceDocumentSerializerKt$serializeDatasetSourceDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C16233eg {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull EdgeEffect edgeEffect) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(edgeEffect, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("DatasetArn"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("GroundTruthManifest"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C13131d c13131dOLrzqt = edgeEffect.OLrzqt();
        if (c13131dOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c13131dOLrzqt, DatasetSourceDocumentSerializerKt$serializeDatasetSourceDocument$1$1$1.INSTANCE);
        }
        java.lang.String strEZpvd = edgeEffect.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
    }
}
