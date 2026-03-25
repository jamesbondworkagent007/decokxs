package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.NotifyConfigurationTypeDocumentSerializerKt$serializeNotifyConfigurationTypeDocument$1$3$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.NotifyConfigurationTypeDocumentSerializerKt$serializeNotifyConfigurationTypeDocument$1$4$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.NotifyConfigurationTypeDocumentSerializerKt$serializeNotifyConfigurationTypeDocument$1$5$1;
import com.google.common.net.HttpHeaders;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CameraDeviceState {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull MediaRouteActionProvider mediaRouteActionProvider) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(mediaRouteActionProvider, "");
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("BlockEmail"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX(HttpHeaders.FROM));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("MfaEmail"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("NoActionEmail"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("ReplyTo"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("SourceArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = mediaRouteActionProvider.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        java.lang.String strOLrzqt = mediaRouteActionProvider.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strOLrzqt);
        }
        ebEZpvd.AEQbTJ(c5101Et6, mediaRouteActionProvider.AhwBna());
        Notification notificationAEQbTJ = mediaRouteActionProvider.AEQbTJ();
        if (notificationAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, notificationAEQbTJ, NotifyConfigurationTypeDocumentSerializerKt$serializeNotifyConfigurationTypeDocument$1$3$1.INSTANCE);
        }
        Notification notificationKWHzl = mediaRouteActionProvider.KWHzl();
        if (notificationKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, notificationKWHzl, NotifyConfigurationTypeDocumentSerializerKt$serializeNotifyConfigurationTypeDocument$1$4$1.INSTANCE);
        }
        Notification notificationEZpvd = mediaRouteActionProvider.EZpvd();
        if (notificationEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, notificationEZpvd, NotifyConfigurationTypeDocumentSerializerKt$serializeNotifyConfigurationTypeDocument$1$5$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
