package o;

import aws.sdk.kotlin.services.rekognition.serde.StreamProcessorSettingsDocumentSerializerKt$serializeStreamProcessorSettingsDocument$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.StreamProcessorSettingsDocumentSerializerKt$serializeStreamProcessorSettingsDocument$1$2$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30157lO {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C9304bT c9304bT) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c9304bT, "");
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("ConnectedHome"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("FaceSearch"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        TabHost tabHostKWHzl = c9304bT.KWHzl();
        if (tabHostKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, tabHostKWHzl, StreamProcessorSettingsDocumentSerializerKt$serializeStreamProcessorSettingsDocument$1$1$1.INSTANCE);
        }
        AdapterView adapterViewOLrzqt = c9304bT.OLrzqt();
        if (adapterViewOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, adapterViewOLrzqt, StreamProcessorSettingsDocumentSerializerKt$serializeStreamProcessorSettingsDocument$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
