package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateFaceLivenessSessionRequestSettingsDocumentSerializerKt$serializeCreateFaceLivenessSessionRequestSettingsDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13240dE {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull CalendarViewLegacyDelegate calendarViewLegacyDelegate) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(calendarViewLegacyDelegate, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("AuditImagesLimit"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("OutputConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        V vKWHzl = calendarViewLegacyDelegate.KWHzl();
        if (vKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, vKWHzl, CreateFaceLivenessSessionRequestSettingsDocumentSerializerKt$serializeCreateFaceLivenessSessionRequestSettingsDocument$1$1$1.INSTANCE);
        }
        java.lang.Integer numAEQbTJ = calendarViewLegacyDelegate.AEQbTJ();
        if (numAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et, numAEQbTJ.intValue());
        }
        ebEZpvd.AEQbTJ();
    }
}
