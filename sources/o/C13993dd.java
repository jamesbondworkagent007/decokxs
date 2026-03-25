package o;

import aws.sdk.kotlin.services.rekognition.serde.CompareFacesOperationSerializerKt$serializeCompareFacesOperationBody$1$3$1;
import aws.sdk.kotlin.services.rekognition.serde.CompareFacesOperationSerializerKt$serializeCompareFacesOperationBody$1$4$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13993dd {
    public static final byte[] copydefault(DT dt, AbsoluteLayout absoluteLayout) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("QualityFilter"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("SimilarityThreshold"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("SourceImage"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("TargetImage"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        AbstractC6105aJ abstractC6105aJKWHzl = absoluteLayout.KWHzl();
        if (abstractC6105aJKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, abstractC6105aJKWHzl.copydefault());
        }
        java.lang.Float fOLrzqt = absoluteLayout.OLrzqt();
        if (fOLrzqt != null) {
            ebEZpvd.copydefault(c5101Et2, fOLrzqt.floatValue());
        }
        C25615j c25615jCopydefault = absoluteLayout.copydefault();
        if (c25615jCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c25615jCopydefault, CompareFacesOperationSerializerKt$serializeCompareFacesOperationBody$1$3$1.INSTANCE);
        }
        C25615j c25615jAEQbTJ = absoluteLayout.AEQbTJ();
        if (c25615jAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c25615jAEQbTJ, CompareFacesOperationSerializerKt$serializeCompareFacesOperationBody$1$4$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
