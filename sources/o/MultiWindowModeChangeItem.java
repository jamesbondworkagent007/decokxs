package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$1$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$2$1;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$3$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class MultiWindowModeChangeItem {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull IntStream intStream) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(intStream, "");
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("HighAction"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("LowAction"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("MediumAction"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        BaseStream baseStreamAEQbTJ = intStream.AEQbTJ();
        if (baseStreamAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, baseStreamAEQbTJ, AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$1$1.INSTANCE);
        }
        BaseStream baseStreamEZpvd = intStream.EZpvd();
        if (baseStreamEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, baseStreamEZpvd, AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$2$1.INSTANCE);
        }
        BaseStream baseStreamOLrzqt = intStream.OLrzqt();
        if (baseStreamOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, baseStreamOLrzqt, AccountTakeoverActionsTypeDocumentSerializerKt$serializeAccountTakeoverActionsTypeDocument$1$3$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
