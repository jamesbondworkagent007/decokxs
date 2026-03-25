package o;

import aws.sdk.kotlin.services.rekognition.serde.AssetDocumentSerializerKt$serializeAssetDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11351cL {
    public static final void KWHzl(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull WebViewDelegate webViewDelegate) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(webViewDelegate, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("GroundTruthManifest"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C13131d c13131dCopydefault = webViewDelegate.copydefault();
        if (c13131dCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c13131dCopydefault, AssetDocumentSerializerKt$serializeAssetDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
