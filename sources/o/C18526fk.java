package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectCustomLabelsOperationSerializerKt$serializeDetectCustomLabelsOperationBody$1$1$1;
import com.immomo.mls.fun.ud.UDImageInfo;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C18526fk {
    public static final byte[] EZpvd(DT dt, NumberPicker numberPicker) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("MinConfidence"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ProjectVersionArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C25615j c25615jAEQbTJ = numberPicker.AEQbTJ();
        if (c25615jAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c25615jAEQbTJ, DetectCustomLabelsOperationSerializerKt$serializeDetectCustomLabelsOperationBody$1$1$1.INSTANCE);
        }
        java.lang.Integer numOLrzqt = numberPicker.OLrzqt();
        if (numOLrzqt != null) {
            ebEZpvd.OLrzqt(c5101Et2, numOLrzqt.intValue());
        }
        java.lang.Float fCopydefault = numberPicker.copydefault();
        if (fCopydefault != null) {
            ebEZpvd.copydefault(c5101Et3, fCopydefault.floatValue());
        }
        java.lang.String strEZpvd = numberPicker.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
