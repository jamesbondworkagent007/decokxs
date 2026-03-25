package o;

import aws.sdk.kotlin.services.rekognition.serde.StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$2$1;
import aws.sdk.kotlin.services.rekognition.serde.StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$4$1;
import aws.sdk.kotlin.services.rekognition.serde.StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$6$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.AbstractC9728bb;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30698lg {
    public static final byte[] copydefault(DT dt, final C11000bz c11000bz) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("Filters"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("JobTag"));
        C5101Et c5101Et4 = new C5101Et(pictureInPictureParams, new EX("NotificationChannel"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("SegmentTypes"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("Video"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c11000bz.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        C10841bw c10841bwKWHzl = c11000bz.KWHzl();
        if (c10841bwKWHzl != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c10841bwKWHzl, StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$2$1.INSTANCE);
        }
        java.lang.String strCopydefault = c11000bz.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strCopydefault);
        }
        C7662ao c7662aoAEQbTJ = c11000bz.AEQbTJ();
        if (c7662aoAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c7662aoAEQbTJ, StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$4$1.INSTANCE);
        }
        if (c11000bz.OLrzqt() != null) {
            ebEZpvd.EZpvd(c5101Et5, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$5
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
                    Iterator<AbstractC9728bb> it = c11000bz.OLrzqt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().copydefault());
                    }
                }
            });
        }
        C11108cC c11108cCDjBIcL = c11000bz.djBIcL();
        if (c11108cCDjBIcL != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c11108cCDjBIcL, StartSegmentDetectionOperationSerializerKt$serializeStartSegmentDetectionOperationBody$1$6$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
