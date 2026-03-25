package o;

import aws.sdk.kotlin.services.textract.serde.AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$1$1;
import aws.sdk.kotlin.services.textract.serde.AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$2$1;
import aws.sdk.kotlin.services.textract.serde.AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$4$1;
import aws.sdk.kotlin.services.textract.serde.AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$5$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33846nI;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39213po {
    public static final byte[] KWHzl(DT dt, final C34437nc c34437nc) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("AdaptersConfig"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("Document"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("FeatureTypes"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("HumanLoopConfig"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("QueriesConfig"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C34331na c34331naCopydefault = c34437nc.copydefault();
        if (c34331naCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c34331naCopydefault, AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$1$1.INSTANCE);
        }
        C35318nt c35318ntKWHzl = c34437nc.KWHzl();
        if (c35318ntKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c35318ntKWHzl, AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$2$1.INSTANCE);
        }
        if (c34437nc.AEQbTJ() != null) {
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.textract.serde.AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$3
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
                    Iterator<AbstractC33846nI> it = c34437nc.AEQbTJ().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().OLrzqt());
                    }
                }
            });
        }
        C34250nX c34250nXOLrzqt = c34437nc.OLrzqt();
        if (c34250nXOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c34250nXOLrzqt, AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$4$1.INSTANCE);
        }
        C37715oz c37715ozEZpvd = c34437nc.EZpvd();
        if (c37715ozEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c37715ozEZpvd, AnalyzeDocumentOperationSerializerKt$serializeAnalyzeDocumentOperationBody$1$5$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
