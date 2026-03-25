package o;

import aws.sdk.kotlin.services.rekognition.serde.SearchFacesByImageOperationSerializerKt$serializeSearchFacesByImageOperationBody$1$3$1;
import com.immomo.mls.fun.ud.UDImageInfo;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.jZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C26291jZ {
    public static final byte[] AEQbTJ(DT dt, C6423aP c6423aP) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("CollectionId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("FaceMatchThreshold"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxFaces"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("QualityFilter"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strAEQbTJ = c6423aP.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
        }
        java.lang.Float fCopydefault = c6423aP.copydefault();
        if (fCopydefault != null) {
            ebEZpvd.copydefault(c5101Et2, fCopydefault.floatValue());
        }
        C25615j c25615jEZpvd = c6423aP.EZpvd();
        if (c25615jEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c25615jEZpvd, SearchFacesByImageOperationSerializerKt$serializeSearchFacesByImageOperationBody$1$3$1.INSTANCE);
        }
        java.lang.Integer numOLrzqt = c6423aP.OLrzqt();
        if (numOLrzqt != null) {
            ebEZpvd.OLrzqt(c5101Et4, numOLrzqt.intValue());
        }
        AbstractC6105aJ abstractC6105aJKWHzl = c6423aP.KWHzl();
        if (abstractC6105aJKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et5, abstractC6105aJKWHzl.copydefault());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
