package o;

import aws.sdk.kotlin.services.translate.serde.UpdateParallelDataOperationSerializerKt$serializeUpdateParallelDataOperationBody$1$4$1;
import kotlin.Unit;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.wM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C52454wM {
    public static final byte[] KWHzl(DT dt, C49147uj c49147uj) {
        Unit unit;
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("Description"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("Name"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("ParallelDataConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c49147uj.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ebEZpvd.AEQbTJ(c5101Et, C57419yi.EZpvd(dt).KWHzl());
        }
        java.lang.String strCopydefault = c49147uj.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        java.lang.String strKWHzl = c49147uj.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strKWHzl);
        }
        C45943tC c45943tCAEQbTJ = c49147uj.AEQbTJ();
        if (c45943tCAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c45943tCAEQbTJ, UpdateParallelDataOperationSerializerKt$serializeUpdateParallelDataOperationBody$1$4$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
