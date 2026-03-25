package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.BackStackRecord;
import o.C5098Eq;
import o.C5104Ew;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import o.SQLiteStatement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class OperationApplicationException {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final IntEvaluator intEvaluator) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(intEvaluator, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("EncodedData"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("HttpHeaders"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("IpAddress"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("ServerName"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("ServerPath"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et3, intEvaluator.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et4, intEvaluator.OLrzqt());
        ebEZpvd.AEQbTJ(c5101Et5, intEvaluator.AEQbTJ());
        ebEZpvd.EZpvd(c5101Et2, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.serde.ContextDataTypeDocumentSerializerKt$serializeContextDataTypeDocument$1$1
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

            /* JADX INFO: renamed from: aws.sdk.kotlin.services.cognitoidentityprovider.serde.ContextDataTypeDocumentSerializerKt$serializeContextDataTypeDocument$1$1$1, reason: invalid class name */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, BackStackRecord, Unit> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass1() {
                    super(2, SQLiteStatement.class, "serializeHttpHeaderDocument", "serializeHttpHeaderDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/HttpHeader;)V", 1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, BackStackRecord backStackRecord) {
                    invoke2(interfaceC5106Ey, backStackRecord);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull BackStackRecord backStackRecord) {
                    Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                    Intrinsics.checkNotNullParameter(backStackRecord, "");
                    SQLiteStatement.copydefault(interfaceC5106Ey, backStackRecord);
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                Iterator<BackStackRecord> it = intEvaluator.EZpvd().iterator();
                while (it.hasNext()) {
                    interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                }
            }
        });
        java.lang.String strCopydefault = intEvaluator.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        ebEZpvd.AEQbTJ();
    }
}
