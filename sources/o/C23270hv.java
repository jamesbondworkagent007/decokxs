package o;

import aws.sdk.kotlin.services.rekognition.serde.IndexFacesOperationSerializerKt$serializeIndexFacesOperationBody$1$4$1;
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

/* JADX INFO: renamed from: o.hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23270hv {
    public static final byte[] copydefault(DT dt, final C29778l c29778l) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("CollectionId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("DetectionAttributes"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("ExternalImageId"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX(UDImageInfo.LUA_CLASS_NAME));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxFaces"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("QualityFilter"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = c29778l.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
        }
        if (c29778l.EZpvd() != null) {
            ebEZpvd.EZpvd(c5101Et2, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.IndexFacesOperationSerializerKt$serializeIndexFacesOperationBody$1$2
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
                    Iterator<WebViewProvider> it = c29778l.EZpvd().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().OLrzqt());
                    }
                }
            });
        }
        java.lang.String strCopydefault = c29778l.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strCopydefault);
        }
        C25615j c25615jOLrzqt = c29778l.OLrzqt();
        if (c25615jOLrzqt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et4, c25615jOLrzqt, IndexFacesOperationSerializerKt$serializeIndexFacesOperationBody$1$4$1.INSTANCE);
        }
        java.lang.Integer numAEQbTJ = c29778l.AEQbTJ();
        if (numAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et5, numAEQbTJ.intValue());
        }
        AbstractC6105aJ abstractC6105aJDjBIcL = c29778l.djBIcL();
        if (abstractC6105aJDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et6, abstractC6105aJDjBIcL.copydefault());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
