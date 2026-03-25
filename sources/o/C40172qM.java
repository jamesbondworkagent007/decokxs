package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC34841nk;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C40172qM {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final C36602oe c36602oe) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c36602oe, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("ContentClassifiers"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        if (c36602oe.AEQbTJ() != null) {
            ebEZpvd.EZpvd(c5101Et, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.textract.serde.HumanLoopDataAttributesDocumentSerializerKt$serializeHumanLoopDataAttributesDocument$1$1
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
                    Iterator<AbstractC34841nk> it = c36602oe.AEQbTJ().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().copydefault());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
    }
}
