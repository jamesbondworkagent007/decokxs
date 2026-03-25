package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AccountTakeoverRiskConfigurationTypeDocumentSerializerKt$serializeAccountTakeoverRiskConfigurationTypeDocument$1$1$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AccountTakeoverRiskConfigurationTypeDocumentSerializerKt$serializeAccountTakeoverRiskConfigurationTypeDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class DestroyActivityItem {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull LongStream longStream) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(longStream, "");
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("Actions"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("NotifyConfiguration"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        MediaRouteActionProvider mediaRouteActionProviderCopydefault = longStream.copydefault();
        if (mediaRouteActionProviderCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, mediaRouteActionProviderCopydefault, AccountTakeoverRiskConfigurationTypeDocumentSerializerKt$serializeAccountTakeoverRiskConfigurationTypeDocument$1$1$1.INSTANCE);
        }
        IntStream intStreamKWHzl = longStream.KWHzl();
        if (intStreamKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, intStreamKWHzl, AccountTakeoverRiskConfigurationTypeDocumentSerializerKt$serializeAccountTakeoverRiskConfigurationTypeDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
