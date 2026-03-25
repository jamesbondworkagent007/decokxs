package o;

import aws.sdk.kotlin.services.rekognition.serde.RecognizeCelebritiesOperationSerializerKt$serializeRecognizeCelebritiesOperationBody$1$1$1;
import com.immomo.mls.fun.ud.UDImageInfo;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.jJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C25859jJ {
    public static final byte[] AEQbTJ(DT dt, C6317aN c6317aN) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C25615j c25615jCopydefault = c6317aN.copydefault();
        if (c25615jCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c25615jCopydefault, RecognizeCelebritiesOperationSerializerKt$serializeRecognizeCelebritiesOperationBody$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
