package o;

import aws.sdk.kotlin.services.comprehend.serde.DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$1$1;
import aws.sdk.kotlin.services.comprehend.serde.DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$2$1;
import aws.sdk.kotlin.services.comprehend.serde.DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$3$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SystemCertificateSource {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull IpReachabilityEvent ipReachabilityEvent) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(ipReachabilityEvent, "");
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("Annotations"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("Documents"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("EntityList"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ApfStats apfStatsOLrzqt = ipReachabilityEvent.OLrzqt();
        if (apfStatsOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, apfStatsOLrzqt, DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$1$1.INSTANCE);
        }
        ConnectStats connectStatsAEQbTJ = ipReachabilityEvent.AEQbTJ();
        if (connectStatsAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, connectStatsAEQbTJ, DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$2$1.INSTANCE);
        }
        DefaultNetworkEvent defaultNetworkEventEZpvd = ipReachabilityEvent.EZpvd();
        if (defaultNetworkEventEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, defaultNetworkEventEZpvd, DatasetEntityRecognizerInputDataConfigDocumentSerializerKt$serializeDatasetEntityRecognizerInputDataConfigDocument$1$3$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
