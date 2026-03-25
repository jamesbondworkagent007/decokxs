package o;

import aws.sdk.kotlin.services.rekognition.serde.CreateFaceLivenessSessionOperationSerializerKt$serializeCreateFaceLivenessSessionOperationBody$1$3$1;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.dF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13267dF {
    public static final byte[] KWHzl(DT dt, Checkable checkable) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("KmsKeyId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Settings"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = checkable.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        java.lang.String strAEQbTJ = checkable.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        CalendarViewLegacyDelegate calendarViewLegacyDelegateCopydefault = checkable.copydefault();
        if (calendarViewLegacyDelegateCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, calendarViewLegacyDelegateCopydefault, CreateFaceLivenessSessionOperationSerializerKt$serializeCreateFaceLivenessSessionOperationBody$1$3$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
