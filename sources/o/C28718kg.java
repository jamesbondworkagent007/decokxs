package o;

import aws.sdk.kotlin.services.rekognition.serde.SearchUsersByImageOperationSerializerKt$serializeSearchUsersByImageOperationBody$1$2$1;
import com.immomo.mls.fun.ud.UDImageInfo;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28718kg {
    public static final byte[] KWHzl(DT dt, C6792aW c6792aW) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("CollectionId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxUsers"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("QualityFilter"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("UserMatchThreshold"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c6792aW.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        C25615j c25615jKWHzl = c6792aW.KWHzl();
        if (c25615jKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c25615jKWHzl, SearchUsersByImageOperationSerializerKt$serializeSearchUsersByImageOperationBody$1$2$1.INSTANCE);
        }
        java.lang.Integer numAEQbTJ = c6792aW.AEQbTJ();
        if (numAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et3, numAEQbTJ.intValue());
        }
        AbstractC6105aJ abstractC6105aJCopydefault = c6792aW.copydefault();
        if (abstractC6105aJCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et4, abstractC6105aJCopydefault.copydefault());
        }
        java.lang.Float fOLrzqt = c6792aW.OLrzqt();
        if (fOLrzqt != null) {
            ebEZpvd.copydefault(c5101Et5, fOLrzqt.floatValue());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
