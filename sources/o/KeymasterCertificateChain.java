package o;

import aws.sdk.kotlin.services.comprehend.serde.ClassifyDocumentOperationSerializerKt$serializeClassifyDocumentOperationBody$1$2$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class KeymasterCertificateChain {
    public static final byte[] OLrzqt(DT dt, SSLCertificateSocketFactory sSLCertificateSocketFactory) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Application.KWHzl, new EX("Bytes"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DocumentReaderConfig"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("EndpointArn"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Text"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        byte[] bArrCopydefault = sSLCertificateSocketFactory.copydefault();
        if (bArrCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, C5162Hc.OLrzqt(bArrCopydefault));
        }
        HandlerThread handlerThreadAEQbTJ = sSLCertificateSocketFactory.AEQbTJ();
        if (handlerThreadAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, handlerThreadAEQbTJ, ClassifyDocumentOperationSerializerKt$serializeClassifyDocumentOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strOLrzqt = sSLCertificateSocketFactory.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strOLrzqt);
        }
        java.lang.String strKWHzl = sSLCertificateSocketFactory.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
