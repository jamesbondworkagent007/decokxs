package o;

import aws.sdk.kotlin.services.rekognition.serde.StreamProcessorSettingsForUpdateDocumentSerializerKt$serializeStreamProcessorSettingsForUpdateDocument$1$1$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30103lM {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C9251bS c9251bS) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c9251bS, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("ConnectedHomeForUpdate"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ActivityChooserView activityChooserViewKWHzl = c9251bS.KWHzl();
        if (activityChooserViewKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, activityChooserViewKWHzl, StreamProcessorSettingsForUpdateDocumentSerializerKt$serializeStreamProcessorSettingsForUpdateDocument$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
