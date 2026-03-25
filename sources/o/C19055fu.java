package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectLabelsOperationSerializerKt$serializeDetectLabelsOperationBody$1$2$1;
import aws.sdk.kotlin.services.rekognition.serde.DetectLabelsOperationSerializerKt$serializeDetectLabelsOperationBody$1$5$1;
import com.immomo.mls.fun.ud.UDImageInfo;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import o.ProgressBar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C19055fu {
    public static final byte[] AEQbTJ(DT dt, final RatingBar ratingBar) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Features"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxLabels"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("MinConfidence"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("Settings"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        if (ratingBar.EZpvd() != null) {
            ebEZpvd.EZpvd(c5101Et, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.DetectLabelsOperationSerializerKt$serializeDetectLabelsOperationBody$1$1
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
                    Iterator<ProgressBar> it = ratingBar.EZpvd().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().AEQbTJ());
                    }
                }
            });
        }
        C25615j c25615jAEQbTJ = ratingBar.AEQbTJ();
        if (c25615jAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c25615jAEQbTJ, DetectLabelsOperationSerializerKt$serializeDetectLabelsOperationBody$1$2$1.INSTANCE);
        }
        java.lang.Integer numCopydefault = ratingBar.copydefault();
        if (numCopydefault != null) {
            ebEZpvd.OLrzqt(c5101Et3, numCopydefault.intValue());
        }
        java.lang.Float fKWHzl = ratingBar.KWHzl();
        if (fKWHzl != null) {
            ebEZpvd.copydefault(c5101Et4, fKWHzl.floatValue());
        }
        RadioButton radioButtonOLrzqt = ratingBar.OLrzqt();
        if (radioButtonOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, radioButtonOLrzqt, DetectLabelsOperationSerializerKt$serializeDetectLabelsOperationBody$1$5$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
