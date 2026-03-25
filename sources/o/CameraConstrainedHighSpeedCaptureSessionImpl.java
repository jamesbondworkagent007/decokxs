package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.LogConfigurationTypeDocumentSerializerKt$serializeLogConfigurationTypeDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CameraConstrainedHighSpeedCaptureSessionImpl {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull LauncherActivity launcherActivity) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(launcherActivity, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("CloudWatchLogsConfiguration"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et2 = new C5101Et(stateListAnimator, new EX("EventSource"));
        C5101Et c5101Et3 = new C5101Et(stateListAnimator, new EX("LogLevel"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et3, launcherActivity.AEQbTJ().OLrzqt());
        ebEZpvd.AEQbTJ(c5101Et2, launcherActivity.EZpvd().KWHzl());
        AnimatorListenerAdapter animatorListenerAdapterOLrzqt = launcherActivity.OLrzqt();
        if (animatorListenerAdapterOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, animatorListenerAdapterOLrzqt, LogConfigurationTypeDocumentSerializerKt$serializeLogConfigurationTypeDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
