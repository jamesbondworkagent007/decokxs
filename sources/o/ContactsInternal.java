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
public final class ContactsInternal {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final NetworkConfig networkConfig) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(networkConfig, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AnnotationDataS3Uri"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("AttributeNames"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et3 = new C5101Et(stateListAnimator, new EX("DocumentType"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("S3Uri"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("SourceDocumentsS3Uri"));
        C5101Et c5101Et6 = new C5101Et(stateListAnimator, new EX("Split"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et4, networkConfig.copydefault());
        RuntimePermissionPresenterService runtimePermissionPresenterServiceAhwBna = networkConfig.AhwBna();
        if (runtimePermissionPresenterServiceAhwBna != null) {
            ebEZpvd.AEQbTJ(c5101Et6, runtimePermissionPresenterServiceAhwBna.OLrzqt());
        }
        ebEZpvd.EZpvd(c5101Et2, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.serde.AugmentedManifestsListItemDocumentSerializerKt$serializeAugmentedManifestsListItemDocument$1$2
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
                Iterator<String> it = networkConfig.KWHzl().iterator();
                while (it.hasNext()) {
                    interfaceC5094Em.KWHzl(it.next());
                }
            }
        });
        java.lang.String strAEQbTJ = networkConfig.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
        }
        java.lang.String strOLrzqt = networkConfig.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strOLrzqt);
        }
        NetworkKey networkKeyEZpvd = networkConfig.EZpvd();
        if (networkKeyEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, networkKeyEZpvd.AEQbTJ());
        }
        ebEZpvd.AEQbTJ();
    }
}
