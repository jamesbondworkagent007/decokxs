package aws.sdk.kotlin.services.translate.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C45943tC;
import o.C50346vL;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CreateParallelDataOperationSerializerKt$serializeCreateParallelDataOperationBody$1$5$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, C45943tC, Unit> {
    public static final CreateParallelDataOperationSerializerKt$serializeCreateParallelDataOperationBody$1$5$1 INSTANCE = new CreateParallelDataOperationSerializerKt$serializeCreateParallelDataOperationBody$1$5$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateParallelDataOperationSerializerKt$serializeCreateParallelDataOperationBody$1$5$1() {
        super(2, C50346vL.class, "serializeParallelDataConfigDocument", "serializeParallelDataConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/translate/model/ParallelDataConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, C45943tC c45943tC) {
        invoke2(interfaceC5106Ey, c45943tC);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C45943tC c45943tC) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c45943tC, "");
        C50346vL.copydefault(interfaceC5106Ey, c45943tC);
    }
}
