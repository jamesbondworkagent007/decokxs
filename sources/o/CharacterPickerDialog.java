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
import o.ProxyFileDescriptorCallback;
import o.QwertyKeyListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CharacterPickerDialog {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull final NetworkOnMainThreadException networkOnMainThreadException) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(networkOnMainThreadException, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("EntityTypes"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.EZpvd(c5101Et, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.serde.EntityRecognitionConfigDocumentSerializerKt$serializeEntityRecognitionConfigDocument$1$1
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

            /* JADX INFO: renamed from: aws.sdk.kotlin.services.comprehend.serde.EntityRecognitionConfigDocumentSerializerKt$serializeEntityRecognitionConfigDocument$1$1$1, reason: invalid class name */
            public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, ProxyFileDescriptorCallback, Unit> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass1() {
                    super(2, QwertyKeyListener.class, "serializeEntityTypesListItemDocument", "serializeEntityTypesListItemDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/comprehend/model/EntityTypesListItem;)V", 1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, ProxyFileDescriptorCallback proxyFileDescriptorCallback) {
                    invoke2(interfaceC5106Ey, proxyFileDescriptorCallback);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ProxyFileDescriptorCallback proxyFileDescriptorCallback) {
                    Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                    Intrinsics.checkNotNullParameter(proxyFileDescriptorCallback, "");
                    QwertyKeyListener.OLrzqt(interfaceC5106Ey, proxyFileDescriptorCallback);
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                Iterator<ProxyFileDescriptorCallback> it = networkOnMainThreadException.OLrzqt().iterator();
                while (it.hasNext()) {
                    interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                }
            }
        });
        ebEZpvd.AEQbTJ();
    }
}
