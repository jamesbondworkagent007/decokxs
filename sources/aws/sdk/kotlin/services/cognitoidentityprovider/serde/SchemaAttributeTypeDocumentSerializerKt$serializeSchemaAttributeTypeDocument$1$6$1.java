package aws.sdk.kotlin.services.cognitoidentityprovider.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.GLThreadManager;
import o.InterfaceC5106Ey;
import o.NativeActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class SchemaAttributeTypeDocumentSerializerKt$serializeSchemaAttributeTypeDocument$1$6$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, NativeActivity, Unit> {
    public static final SchemaAttributeTypeDocumentSerializerKt$serializeSchemaAttributeTypeDocument$1$6$1 INSTANCE = new SchemaAttributeTypeDocumentSerializerKt$serializeSchemaAttributeTypeDocument$1$6$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SchemaAttributeTypeDocumentSerializerKt$serializeSchemaAttributeTypeDocument$1$6$1() {
        super(2, GLThreadManager.class, "serializeNumberAttributeConstraintsTypeDocument", "serializeNumberAttributeConstraintsTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/NumberAttributeConstraintsType;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, NativeActivity nativeActivity) {
        invoke2(interfaceC5106Ey, nativeActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull NativeActivity nativeActivity) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(nativeActivity, "");
        GLThreadManager.KWHzl(interfaceC5106Ey, nativeActivity);
    }
}
