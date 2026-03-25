package o;

import aws.sdk.kotlin.services.comprehend.serde.TaskConfigDocumentSerializerKt$serializeTaskConfigDocument$1$1$1;
import aws.sdk.kotlin.services.comprehend.serde.TaskConfigDocumentSerializerKt$serializeTaskConfigDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InputEventSender {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull RecommendationService recommendationService) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(recommendationService, "");
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("DocumentClassificationConfig"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("EntityRecognitionConfig"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("LanguageCode"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et3, recommendationService.AEQbTJ().OLrzqt());
        CpuUsageInfo cpuUsageInfoOLrzqt = recommendationService.OLrzqt();
        if (cpuUsageInfoOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, cpuUsageInfoOLrzqt, TaskConfigDocumentSerializerKt$serializeTaskConfigDocument$1$1$1.INSTANCE);
        }
        NetworkOnMainThreadException networkOnMainThreadExceptionKWHzl = recommendationService.KWHzl();
        if (networkOnMainThreadExceptionKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, networkOnMainThreadExceptionKWHzl, TaskConfigDocumentSerializerKt$serializeTaskConfigDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
