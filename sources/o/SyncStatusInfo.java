package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C5104Ew;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import o.Marshaler;
import o.ProgressDialog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SyncStatusInfo {
    public static final byte[] EZpvd(DT dt, final Keyframes keyframes) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("Identifier"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("Name"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Scopes"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strOLrzqt = keyframes.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
        }
        java.lang.String strEZpvd = keyframes.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        if (keyframes.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateResourceServerOperationSerializerKt$serializeCreateResourceServerOperationBody$1$3
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.cognitoidentityprovider.serde.CreateResourceServerOperationSerializerKt$serializeCreateResourceServerOperationBody$1$3$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, ProgressDialog, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, Marshaler.class, "serializeResourceServerScopeTypeDocument", "serializeResourceServerScopeTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceServerScopeType;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, ProgressDialog progressDialog) {
                        invoke2(interfaceC5106Ey, progressDialog);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ProgressDialog progressDialog) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(progressDialog, "");
                        Marshaler.EZpvd(interfaceC5106Ey, progressDialog);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<ProgressDialog> it = keyframes.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        java.lang.String strAEQbTJ = keyframes.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
