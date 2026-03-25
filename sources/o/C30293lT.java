package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5097Ep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30293lT {
    public static final byte[] copydefault(DT dt, final C11755ca c11755ca) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ResourceArn"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("Tags"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c11755ca.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        if (c11755ca.copydefault() != null) {
            ebEZpvd.OLrzqt(c5101Et2, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.TagResourceOperationSerializerKt$serializeTagResourceOperationBody$1$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5097Ep interfaceC5097Ep) {
                    invoke2(interfaceC5097Ep);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5097Ep interfaceC5097Ep) {
                    Intrinsics.checkNotNullParameter(interfaceC5097Ep, "");
                    for (Map.Entry<String, String> entry : c11755ca.copydefault().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
