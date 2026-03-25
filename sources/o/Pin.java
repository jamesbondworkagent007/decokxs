package o;

import aws.sdk.kotlin.services.comprehend.serde.DataSecurityConfigDocumentSerializerKt$serializeDataSecurityConfigDocument$1$4$1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Pin {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ApfProgramEvent apfProgramEvent) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(apfProgramEvent, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("DataLakeKmsKeyId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ModelKmsKeyId"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("VolumeKmsKeyId"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("VpcConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strOLrzqt = apfProgramEvent.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        java.lang.String strKWHzl = apfProgramEvent.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strKWHzl);
        }
        java.lang.String strEZpvd = apfProgramEvent.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        ContactsContract contactsContractCopydefault = apfProgramEvent.copydefault();
        if (contactsContractCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, contactsContractCopydefault, DataSecurityConfigDocumentSerializerKt$serializeDataSecurityConfigDocument$1$4$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
    }
}
