package o;

import aws.sdk.kotlin.services.textract.serde.StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$1$1;
import aws.sdk.kotlin.services.textract.serde.StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$3$1;
import aws.sdk.kotlin.services.textract.serde.StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$7$1;
import aws.sdk.kotlin.services.textract.serde.StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$8$1;
import aws.sdk.kotlin.services.textract.serde.StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$9$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33846nI;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44657sb {
    public static final byte[] EZpvd(DT dt, final C35904oI c35904oI) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("AdaptersConfig"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("DocumentLocation"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("FeatureTypes"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("JobTag"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("KMSKeyId"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("NotificationChannel"));
        C5101Et c5101Et8 = new C5101Et(pictureInPictureParams, new EX("OutputConfig"));
        C5101Et c5101Et9 = new C5101Et(pictureInPictureParams, new EX("QueriesConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        activity.EZpvd(c5101Et9);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C34331na c34331naCopydefault = c35904oI.copydefault();
        if (c34331naCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c34331naCopydefault, StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$1$1.INSTANCE);
        }
        java.lang.String strOLrzqt = c35904oI.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        C35634nz c35634nzKWHzl = c35904oI.KWHzl();
        if (c35634nzKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c35634nzKWHzl, StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$3$1.INSTANCE);
        }
        if (c35904oI.AEQbTJ() != null) {
            ebEZpvd.EZpvd(c5101Et4, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.textract.serde.StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5094Em interfaceC5094Em) {
                    invoke2(interfaceC5094Em);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<AbstractC33846nI> it = c35904oI.AEQbTJ().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().OLrzqt());
                    }
                }
            });
        }
        java.lang.String strEZpvd = c35904oI.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strEZpvd);
        }
        java.lang.String strValueOf = c35904oI.valueOf();
        if (strValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et6, strValueOf);
        }
        C37291or c37291orAhwBna = c35904oI.AhwBna();
        if (c37291orAhwBna != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et7, c37291orAhwBna, StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$7$1.INSTANCE);
        }
        C37344os c37344osAYXKKw = c35904oI.AYXKKw();
        if (c37344osAYXKKw != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et8, c37344osAYXKKw, StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$8$1.INSTANCE);
        }
        C37715oz c37715ozDjBIcL = c35904oI.djBIcL();
        if (c37715ozDjBIcL != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et9, c37715ozDjBIcL, StartDocumentAnalysisOperationSerializerKt$serializeStartDocumentAnalysisOperationBody$1$9$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
