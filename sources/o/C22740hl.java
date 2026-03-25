package o;

import aws.sdk.kotlin.services.rekognition.serde.HumanLoopConfigDocumentSerializerKt$serializeHumanLoopConfigDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C22740hl {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C23535i c23535i) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c23535i, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DataAttributes"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("FlowDefinitionArn"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("HumanLoopName"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et3, c23535i.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et2, c23535i.OLrzqt());
        C21454h c21454hEZpvd = c23535i.EZpvd();
        if (c21454hEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c21454hEZpvd, HumanLoopConfigDocumentSerializerKt$serializeHumanLoopConfigDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
