package aws.sdk.kotlin.services.cognitoidentity.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractList;
import o.InterfaceC5106Ey;
import o.ProcessBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class RoleMappingDocumentSerializerKt$serializeRoleMappingDocument$1$2$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, ProcessBuilder, Unit> {
    public static final RoleMappingDocumentSerializerKt$serializeRoleMappingDocument$1$2$1 INSTANCE = new RoleMappingDocumentSerializerKt$serializeRoleMappingDocument$1$2$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RoleMappingDocumentSerializerKt$serializeRoleMappingDocument$1$2$1() {
        super(2, AbstractList.class, "serializeRulesConfigurationTypeDocument", "serializeRulesConfigurationTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentity/model/RulesConfigurationType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, ProcessBuilder processBuilder) {
        invoke2(interfaceC5106Ey, processBuilder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ProcessBuilder processBuilder) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(processBuilder, "");
        AbstractList.copydefault(interfaceC5106Ey, processBuilder);
    }
}
