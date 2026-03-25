package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SmsMfaConfigTypeDocumentSerializerKt$serializeSmsMfaConfigTypeDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LongParcelable {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull UiModeManager uiModeManager) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(uiModeManager, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("SmsAuthenticationMessage"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("SmsConfiguration"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = uiModeManager.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        Vr2dDisplayProperties vr2dDisplayPropertiesCopydefault = uiModeManager.copydefault();
        if (vr2dDisplayPropertiesCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, vr2dDisplayPropertiesCopydefault, SmsMfaConfigTypeDocumentSerializerKt$serializeSmsMfaConfigTypeDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
