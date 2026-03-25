package o;

import aws.sdk.kotlin.services.translate.serde.ListTextTranslationJobsOperationSerializerKt$serializeListTextTranslationJobsOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.vD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50130vD {
    public static final byte[] copydefault(DT dt, C46024tF c46024tF) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Filter"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C46483tW c46483tWKWHzl = c46024tF.KWHzl();
        if (c46483tWKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c46483tWKWHzl, ListTextTranslationJobsOperationSerializerKt$serializeListTextTranslationJobsOperationBody$1$1$1.INSTANCE);
        }
        java.lang.Integer numEZpvd = c46024tF.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et2, numEZpvd.intValue());
        }
        java.lang.String strAEQbTJ = c46024tF.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
