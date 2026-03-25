package o;

import aws.sdk.kotlin.services.rekognition.serde.RegionOfInterestDocumentSerializerKt$serializeRegionOfInterestDocument$1$1$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C27113jp;
import o.C5098Eq;
import o.C5104Ew;
import o.C7980au;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C25778jG {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final C6158aK c6158aK) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c6158aK, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("BoundingBox"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Polygon"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        WebViewZygote webViewZygoteCopydefault = c6158aK.copydefault();
        if (webViewZygoteCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, webViewZygoteCopydefault, RegionOfInterestDocumentSerializerKt$serializeRegionOfInterestDocument$1$1$1.INSTANCE);
        }
        if (c6158aK.AEQbTJ() != null) {
            ebEZpvd.EZpvd(c5101Et2, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.RegionOfInterestDocumentSerializerKt$serializeRegionOfInterestDocument$1$2
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.rekognition.serde.RegionOfInterestDocumentSerializerKt$serializeRegionOfInterestDocument$1$2$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C7980au, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, C27113jp.class, "serializePointDocument", "serializePointDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/Point;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C7980au c7980au) {
                        invoke2(interfaceC5106Ey, c7980au);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C7980au c7980au) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(c7980au, "");
                        C27113jp.OLrzqt(interfaceC5106Ey, c7980au);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<C7980au> it = c6158aK.AEQbTJ().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
    }
}
