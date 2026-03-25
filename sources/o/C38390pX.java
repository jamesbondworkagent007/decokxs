package o;

import aws.sdk.kotlin.services.textract.serde.DetectDocumentTextOperationSerializerKt$serializeDetectDocumentTextOperationBody$1$1$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.pX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38390pX {
    public static final byte[] OLrzqt(DT dt, C35371nu c35371nu) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Document"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C35318nt c35318ntCopydefault = c35371nu.copydefault();
        if (c35318ntCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c35318ntCopydefault, DetectDocumentTextOperationSerializerKt$serializeDetectDocumentTextOperationBody$1$1$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
