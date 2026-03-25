package o;

import aws.sdk.kotlin.services.translate.serde.TranslateDocumentOperationSerializerKt$serializeTranslateDocumentOperationBody$1$1$1;
import aws.sdk.kotlin.services.translate.serde.TranslateDocumentOperationSerializerKt$serializeTranslateDocumentOperationBody$1$2$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C53892wu {
    public static final byte[] EZpvd(DT dt, final C46564tZ c46564tZ) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("Document"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("Settings"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("SourceLanguageCode"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("TargetLanguageCode"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("TerminologyNames"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C46803te c46803teEZpvd = c46564tZ.EZpvd();
        if (c46803teEZpvd != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c46803teEZpvd, TranslateDocumentOperationSerializerKt$serializeTranslateDocumentOperationBody$1$1$1.INSTANCE);
        }
        C48882ue c48882ueAEQbTJ = c46564tZ.AEQbTJ();
        if (c48882ueAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c48882ueAEQbTJ, TranslateDocumentOperationSerializerKt$serializeTranslateDocumentOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strCopydefault = c46564tZ.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strCopydefault);
        }
        java.lang.String strKWHzl = c46564tZ.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        if (c46564tZ.OLrzqt() != null) {
            ebEZpvd.EZpvd(c5101Et5, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.translate.serde.TranslateDocumentOperationSerializerKt$serializeTranslateDocumentOperationBody$1$5
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
                    Iterator<String> it = c46564tZ.OLrzqt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
