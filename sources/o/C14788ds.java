package o;

import aws.sdk.kotlin.services.rekognition.serde.CopyProjectVersionOperationSerializerKt$serializeCopyProjectVersionOperationBody$1$3$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5097Ep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C14788ds {
    public static final byte[] OLrzqt(DT dt, final AppSecurityPermissions appSecurityPermissions) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("DestinationProjectArn"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("KmsKeyId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("OutputConfig"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("SourceProjectArn"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("SourceProjectVersionArn"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("Tags"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("VersionName"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strAEQbTJ = appSecurityPermissions.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
        }
        java.lang.String strEZpvd = appSecurityPermissions.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        C7609an c7609anKWHzl = appSecurityPermissions.KWHzl();
        if (c7609anKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c7609anKWHzl, CopyProjectVersionOperationSerializerKt$serializeCopyProjectVersionOperationBody$1$3$1.INSTANCE);
        }
        java.lang.String strCopydefault = appSecurityPermissions.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strCopydefault);
        }
        java.lang.String strOLrzqt = appSecurityPermissions.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strOLrzqt);
        }
        if (appSecurityPermissions.valueOf() != null) {
            ebEZpvd.OLrzqt(c5101Et6, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.CopyProjectVersionOperationSerializerKt$serializeCopyProjectVersionOperationBody$1$6
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5097Ep interfaceC5097Ep) {
                    invoke2(interfaceC5097Ep);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5097Ep interfaceC5097Ep) {
                    Intrinsics.checkNotNullParameter(interfaceC5097Ep, "");
                    for (Map.Entry<String, String> entry : appSecurityPermissions.valueOf().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        java.lang.String strDjBIcL = appSecurityPermissions.djBIcL();
        if (strDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strDjBIcL);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
