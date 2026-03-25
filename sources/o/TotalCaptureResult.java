package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TotalCaptureResult {
    public static final byte[] EZpvd(DT dt, final IntentService intentService) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("AttributesToGet"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("Filter"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("Limit"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("PaginationToken"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        if (intentService.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.ListUsersOperationSerializerKt$serializeListUsersOperationBody$1$1
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
                    Iterator<String> it = intentService.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        java.lang.String strAEQbTJ = intentService.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        java.lang.Integer numCopydefault = intentService.copydefault();
        if (numCopydefault != null) {
            ebEZpvd.OLrzqt(c5101Et3, numCopydefault.intValue());
        }
        java.lang.String strOLrzqt = intentService.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        java.lang.String strEZpvd = intentService.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
