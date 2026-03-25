package o;

import aws.sdk.kotlin.services.textract.serde.AnalyzeExpenseOperationSerializerKt$serializeAnalyzeExpenseOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39476pt {
    public static final byte[] copydefault(DT dt, C32357mZ c32357mZ) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Document"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C35318nt c35318ntCopydefault = c32357mZ.copydefault();
        if (c35318ntCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c35318ntCopydefault, AnalyzeExpenseOperationSerializerKt$serializeAnalyzeExpenseOperationBody$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
