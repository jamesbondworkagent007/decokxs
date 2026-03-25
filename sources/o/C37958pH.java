package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33846nI;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import o.InterfaceC5097Ep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C37958pH {
    public static final byte[] AEQbTJ(DT dt, final C34947nm c34947nm) {
        Unit unit;
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AdapterName"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("AutoUpdate"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("ClientRequestToken"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Description"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("FeatureTypes"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("Tags"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = c34947nm.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        AbstractC34595nf abstractC34595nfOLrzqt = c34947nm.OLrzqt();
        if (abstractC34595nfOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, abstractC34595nfOLrzqt.KWHzl());
        }
        java.lang.String strEZpvd = c34947nm.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ebEZpvd.AEQbTJ(c5101Et3, C57419yi.EZpvd(dt).KWHzl());
        }
        java.lang.String strAEQbTJ = c34947nm.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        if (c34947nm.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et5, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.textract.serde.CreateAdapterOperationSerializerKt$serializeCreateAdapterOperationBody$1$5
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
                    Iterator<AbstractC33846nI> it = c34947nm.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().OLrzqt());
                    }
                }
            });
        }
        if (c34947nm.AYXKKw() != null) {
            ebEZpvd.OLrzqt(c5101Et6, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.textract.serde.CreateAdapterOperationSerializerKt$serializeCreateAdapterOperationBody$1$6
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
                    for (Map.Entry<String, String> entry : c34947nm.AYXKKw().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
