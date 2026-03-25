package o;

import aws.sdk.kotlin.services.textract.serde.CreateAdapterVersionOperationSerializerKt$serializeCreateAdapterVersionOperationBody$1$3$1;
import aws.sdk.kotlin.services.textract.serde.CreateAdapterVersionOperationSerializerKt$serializeCreateAdapterVersionOperationBody$1$5$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5097Ep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38067pL {
    public static final byte[] copydefault(DT dt, final C35265ns c35265ns) {
        Unit unit;
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AdapterId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("DatasetConfig"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("KMSKeyId"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("OutputConfig"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("Tags"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = c35265ns.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        java.lang.String strKWHzl = c35265ns.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ebEZpvd.AEQbTJ(c5101Et2, C57419yi.EZpvd(dt).KWHzl());
        }
        C32249mV c32249mVAEQbTJ = c35265ns.AEQbTJ();
        if (c32249mVAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c32249mVAEQbTJ, CreateAdapterVersionOperationSerializerKt$serializeCreateAdapterVersionOperationBody$1$3$1.INSTANCE);
        }
        java.lang.String strEZpvd = c35265ns.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strEZpvd);
        }
        C37344os c37344osOLrzqt = c35265ns.OLrzqt();
        if (c37344osOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c37344osOLrzqt, CreateAdapterVersionOperationSerializerKt$serializeCreateAdapterVersionOperationBody$1$5$1.INSTANCE);
        }
        if (c35265ns.valueOf() != null) {
            ebEZpvd.OLrzqt(c5101Et6, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.textract.serde.CreateAdapterVersionOperationSerializerKt$serializeCreateAdapterVersionOperationBody$1$6
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
                    for (Map.Entry<String, String> entry : c35265ns.valueOf().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
