package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.RoleMappingDocumentSerializerKt$serializeRoleMappingDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class RSAPrivateCrtKeySpec {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull NullPointerException nullPointerException) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(nullPointerException, "");
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et = new C5101Et(stateListAnimator, new EX("AmbiguousRoleResolution"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("RulesConfiguration"));
        C5101Et c5101Et3 = new C5101Et(stateListAnimator, new EX("Type"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et3, nullPointerException.OLrzqt().EZpvd());
        ClassNotFoundException classNotFoundExceptionEZpvd = nullPointerException.EZpvd();
        if (classNotFoundExceptionEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, classNotFoundExceptionEZpvd.KWHzl());
        }
        ProcessBuilder processBuilderKWHzl = nullPointerException.KWHzl();
        if (processBuilderKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, processBuilderKWHzl, RoleMappingDocumentSerializerKt$serializeRoleMappingDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
