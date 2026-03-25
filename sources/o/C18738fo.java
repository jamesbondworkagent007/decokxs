package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectFacesOperationSerializerKt$serializeDetectFacesOperationBody$1$2$1;
import com.immomo.mls.fun.ud.UDImageInfo;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import o.WebViewProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C18738fo {
    public static final byte[] copydefault(DT dt, final MediaControlView2 mediaControlView2) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Attributes"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        if (mediaControlView2.copydefault() != null) {
            ebEZpvd.EZpvd(c5101Et, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.DetectFacesOperationSerializerKt$serializeDetectFacesOperationBody$1$1
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
                    Iterator<WebViewProvider> it = mediaControlView2.copydefault().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().OLrzqt());
                    }
                }
            });
        }
        C25615j c25615jOLrzqt = mediaControlView2.OLrzqt();
        if (c25615jOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et2, c25615jOLrzqt, DetectFacesOperationSerializerKt$serializeDetectFacesOperationBody$1$2$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
