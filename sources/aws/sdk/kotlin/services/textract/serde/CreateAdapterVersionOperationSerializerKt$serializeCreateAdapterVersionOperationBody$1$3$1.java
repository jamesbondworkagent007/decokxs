package aws.sdk.kotlin.services.textract.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C32249mV;
import o.C38842ph;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CreateAdapterVersionOperationSerializerKt$serializeCreateAdapterVersionOperationBody$1$3$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C32249mV, Unit> {
    public static final CreateAdapterVersionOperationSerializerKt$serializeCreateAdapterVersionOperationBody$1$3$1 INSTANCE = new CreateAdapterVersionOperationSerializerKt$serializeCreateAdapterVersionOperationBody$1$3$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateAdapterVersionOperationSerializerKt$serializeCreateAdapterVersionOperationBody$1$3$1() {
        super(2, C38842ph.class, "serializeAdapterVersionDatasetConfigDocument", "serializeAdapterVersionDatasetConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/textract/model/AdapterVersionDatasetConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C32249mV c32249mV) {
        invoke2(interfaceC5106Ey, c32249mV);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C32249mV c32249mV) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c32249mV, "");
        C38842ph.OLrzqt(interfaceC5106Ey, c32249mV);
    }
}
