package o;

import aws.sdk.kotlin.services.rekognition.serde.StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$5$1;
import aws.sdk.kotlin.services.rekognition.serde.StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$6$1;
import aws.sdk.kotlin.services.rekognition.serde.StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$7$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.AbstractC54210x;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28076kO {
    public static final byte[] AEQbTJ(DT dt, final C10523bq c10523bq) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Features"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("JobTag"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("MinConfidence"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("NotificationChannel"));
        C5101Et c5101Et6 = new C5101Et(pictureInPictureParams, new EX("Settings"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("Video"));
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
        java.lang.String strOLrzqt = c10523bq.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
        }
        if (c10523bq.copydefault() != null) {
            ebEZpvd.EZpvd(c5101Et2, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$2
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
                    Iterator<AbstractC54210x> it = c10523bq.copydefault().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().EZpvd());
                    }
                }
            });
        }
        java.lang.String strKWHzl = c10523bq.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strKWHzl);
        }
        java.lang.Float fEZpvd = c10523bq.EZpvd();
        if (fEZpvd != null) {
            ebEZpvd.copydefault(c5101Et4, fEZpvd.floatValue());
        }
        C7662ao c7662aoAEQbTJ = c10523bq.AEQbTJ();
        if (c7662aoAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c7662aoAEQbTJ, StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$5$1.INSTANCE);
        }
        C52129w c52129wValueOf = c10523bq.valueOf();
        if (c52129wValueOf != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et6, c52129wValueOf, StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$6$1.INSTANCE);
        }
        C11108cC c11108cCAhwBna = c10523bq.AhwBna();
        if (c11108cCAhwBna != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et7, c11108cCAhwBna, StartLabelDetectionOperationSerializerKt$serializeStartLabelDetectionOperationBody$1$7$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
