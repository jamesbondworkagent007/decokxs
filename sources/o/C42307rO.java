package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C35688oA;
import o.C42280rN;
import o.C5098Eq;
import o.C5104Ew;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C42307rO {
    public static final void KWHzl(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final C37715oz c37715oz) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c37715oz, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Queries"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.EZpvd(c5101Et, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.textract.serde.QueriesConfigDocumentSerializerKt$serializeQueriesConfigDocument$1$1
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

            /* JADX INFO: renamed from: aws.sdk.kotlin.services.textract.serde.QueriesConfigDocumentSerializerKt$serializeQueriesConfigDocument$1$1$1, reason: invalid class name */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C35688oA, Unit> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass1() {
                    super(2, C42280rN.class, "serializeQueryDocument", "serializeQueryDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/textract/model/Query;)V", 1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C35688oA c35688oA) {
                    invoke2(interfaceC5106Ey, c35688oA);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C35688oA c35688oA) {
                    Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                    Intrinsics.checkNotNullParameter(c35688oA, "");
                    C42280rN.KWHzl(interfaceC5106Ey, c35688oA);
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                Iterator<C35688oA> it = c37715oz.copydefault().iterator();
                while (it.hasNext()) {
                    interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                }
            }
        });
        ebEZpvd.AEQbTJ();
    }
}
