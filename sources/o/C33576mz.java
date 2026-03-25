package o;

import aws.sdk.kotlin.services.rekognition.serde.UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$1$1;
import aws.sdk.kotlin.services.rekognition.serde.UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$5$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.AbstractC9357bU;
import o.C25778jG;
import o.C5098Eq;
import o.C5104Ew;
import o.C6158aK;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33576mz {
    public static final byte[] copydefault(DT dt, final C12919cw c12919cw) {
        EW ew = new EW();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("DataSharingPreferenceForUpdate"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Name"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("ParametersToDelete"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("RegionsOfInterestForUpdate"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("SettingsForUpdate"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C9145bQ c9145bQAEQbTJ = c12919cw.AEQbTJ();
        if (c9145bQAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et, c9145bQAEQbTJ, UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$1$1.INSTANCE);
        }
        java.lang.String strOLrzqt = c12919cw.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        if (c12919cw.EZpvd() != null) {
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$3
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
                    Iterator<AbstractC9357bU> it = c12919cw.EZpvd().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().KWHzl());
                    }
                }
            });
        }
        if (c12919cw.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et4, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$4
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.rekognition.serde.UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$4$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C6158aK, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, C25778jG.class, "serializeRegionOfInterestDocument", "serializeRegionOfInterestDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/RegionOfInterest;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C6158aK c6158aK) {
                        invoke2(interfaceC5106Ey, c6158aK);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C6158aK c6158aK) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(c6158aK, "");
                        C25778jG.EZpvd(interfaceC5106Ey, c6158aK);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<C6158aK> it = c12919cw.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        C9251bS c9251bSCopydefault = c12919cw.copydefault();
        if (c9251bSCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c9251bSCopydefault, UpdateStreamProcessorOperationSerializerKt$serializeUpdateStreamProcessorOperationBody$1$5$1.INSTANCE);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
