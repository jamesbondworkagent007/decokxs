package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminCreateUserConfigTypeDocumentSerializerKt$serializeAdminCreateUserConfigTypeDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SliceProvider {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull CipherOutputStream cipherOutputStream) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(cipherOutputStream, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.TaskDescription.OLrzqt, new EX("AllowAdminCreateUserOnly"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("InviteMessageTemplate"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("UnusedAccountValidityDays"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        if (cipherOutputStream.EZpvd()) {
            ebEZpvd.OLrzqt(c5101Et, cipherOutputStream.EZpvd());
        }
        if (cipherOutputStream.KWHzl() != 0) {
            ebEZpvd.OLrzqt(c5101Et3, cipherOutputStream.KWHzl());
        }
        MediaRouteButton mediaRouteButtonCopydefault = cipherOutputStream.copydefault();
        if (mediaRouteButtonCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, mediaRouteButtonCopydefault, AdminCreateUserConfigTypeDocumentSerializerKt$serializeAdminCreateUserConfigTypeDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
