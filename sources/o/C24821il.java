package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C24821il {
    public static final byte[] EZpvd(DT dt, final F f) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("ContainsLabels"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DatasetArn"));
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et3 = new C5101Et(taskDescription, new EX("HasErrors"));
        C5101Et c5101Et4 = new C5101Et(taskDescription, new EX("Labeled"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("NextToken"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("SourceRefContains"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        if (f.OLrzqt() != null) {
            ebEZpvd.EZpvd(c5101Et, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.serde.ListDatasetEntriesOperationSerializerKt$serializeListDatasetEntriesOperationBody$1$1
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
                    Iterator<String> it = f.OLrzqt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        java.lang.String strCopydefault = f.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        java.lang.Boolean boolKWHzl = f.KWHzl();
        if (boolKWHzl != null) {
            ebEZpvd.OLrzqt(c5101Et3, boolKWHzl.booleanValue());
        }
        java.lang.Boolean boolAEQbTJ = f.AEQbTJ();
        if (boolAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et4, boolAEQbTJ.booleanValue());
        }
        java.lang.Integer numEZpvd = f.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et5, numEZpvd.intValue());
        }
        java.lang.String strValueOf = f.valueOf();
        if (strValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et6, strValueOf);
        }
        java.lang.String strGEmmrt = f.gEmmrt();
        if (strGEmmrt != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strGEmmrt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
