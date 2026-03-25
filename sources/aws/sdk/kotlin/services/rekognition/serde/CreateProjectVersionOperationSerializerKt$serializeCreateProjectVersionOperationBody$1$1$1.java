package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C13807dZ;
import o.DatePickerController;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, DatePickerController, Unit> {
    public static final CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$1$1 INSTANCE = new CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateProjectVersionOperationSerializerKt$serializeCreateProjectVersionOperationBody$1$1$1() {
        super(2, C13807dZ.class, "serializeCustomizationFeatureConfigDocument", "serializeCustomizationFeatureConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/CustomizationFeatureConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, DatePickerController datePickerController) {
        invoke2(interfaceC5106Ey, datePickerController);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull DatePickerController datePickerController) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(datePickerController, "");
        C13807dZ.KWHzl(interfaceC5106Ey, datePickerController);
    }
}
