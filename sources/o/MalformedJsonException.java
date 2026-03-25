package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import o.NetworkViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MalformedJsonException {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final ServiceConnectionLeakedViolation serviceConnectionLeakedViolation) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(serviceConnectionLeakedViolation, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("MaskCharacter"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("MaskMode"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("PiiEntityTypes"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        if (serviceConnectionLeakedViolation.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.serde.RedactionConfigDocumentSerializerKt$serializeRedactionConfigDocument$1$1
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
                    Iterator<NetworkViolation> it = serviceConnectionLeakedViolation.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().AEQbTJ());
                    }
                }
            });
        }
        CustomViolation customViolationAEQbTJ = serviceConnectionLeakedViolation.AEQbTJ();
        if (customViolationAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, customViolationAEQbTJ.EZpvd());
        }
        java.lang.String strOLrzqt = serviceConnectionLeakedViolation.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
    }
}
