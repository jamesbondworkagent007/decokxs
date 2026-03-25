package o;

import aws.sdk.kotlin.services.comprehend.serde.InputDataConfigDocumentSerializerKt$serializeInputDataConfigDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LineHeightSpan {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ServiceManagerNative serviceManagerNative) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(serviceManagerNative, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DocumentReaderConfig"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("InputFormat"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("S3Uri"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et3, serviceManagerNative.KWHzl());
        ShellCommand shellCommandCopydefault = serviceManagerNative.copydefault();
        if (shellCommandCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, shellCommandCopydefault.EZpvd());
        }
        HandlerThread handlerThreadOLrzqt = serviceManagerNative.OLrzqt();
        if (handlerThreadOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, handlerThreadOLrzqt, InputDataConfigDocumentSerializerKt$serializeInputDataConfigDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
