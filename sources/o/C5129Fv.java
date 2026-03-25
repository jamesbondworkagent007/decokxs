package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.InterfaceC5132Fy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5129Fv {
    public static /* synthetic */ void writeTag$default(InterfaceC5132Fy interfaceC5132Fy, java.lang.String str, EY ey, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            ey = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1<InterfaceC5132Fy, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlSerializerKt$writeTag$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5132Fy interfaceC5132Fy2) {
                    Intrinsics.checkNotNullParameter(interfaceC5132Fy2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5132Fy interfaceC5132Fy2) {
                    invoke2(interfaceC5132Fy2);
                    return Unit.INSTANCE;
                }
            };
        }
        EZpvd(interfaceC5132Fy, str, ey, function1);
    }

    public static final void EZpvd(InterfaceC5132Fy interfaceC5132Fy, java.lang.String str, EY ey, Function1<? super InterfaceC5132Fy, Unit> function1) {
        EZpvd(interfaceC5132Fy, str, ey);
        function1.invoke(interfaceC5132Fy);
        InterfaceC5132Fy.Application.endTag$default(interfaceC5132Fy, str, null, 2, null);
    }

    public static final void EZpvd(InterfaceC5132Fy interfaceC5132Fy, java.lang.String str, EY ey) {
        if (ey != null) {
            interfaceC5132Fy.AEQbTJ(ey.copydefault(), ey.OLrzqt());
        }
        InterfaceC5132Fy.Application.startTag$default(interfaceC5132Fy, str, null, 2, null);
    }

    public static final boolean OLrzqt(C5101Et c5101Et) {
        return Intrinsics.EZpvd(c5101Et.KWHzl(), AbstractC5105Ex.Fragment.KWHzl) || Intrinsics.EZpvd(c5101Et.KWHzl(), AbstractC5105Ex.Dialog.KWHzl);
    }
}
