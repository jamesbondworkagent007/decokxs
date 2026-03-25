package aws.sdk.kotlin.services.cognitoidentity.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5106Ey;
import o.NullPointerException;
import o.RSAPrivateCrtKeySpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class SetIdentityPoolRolesOperationSerializerKt$serializeSetIdentityPoolRolesOperationBody$1$2$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, NullPointerException, Unit> {
    public static final SetIdentityPoolRolesOperationSerializerKt$serializeSetIdentityPoolRolesOperationBody$1$2$1$1 INSTANCE = new SetIdentityPoolRolesOperationSerializerKt$serializeSetIdentityPoolRolesOperationBody$1$2$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SetIdentityPoolRolesOperationSerializerKt$serializeSetIdentityPoolRolesOperationBody$1$2$1$1() {
        super(2, RSAPrivateCrtKeySpec.class, "serializeRoleMappingDocument", "serializeRoleMappingDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentity/model/RoleMapping;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, NullPointerException nullPointerException) {
        invoke2(interfaceC5106Ey, nullPointerException);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull NullPointerException nullPointerException) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(nullPointerException, "");
        RSAPrivateCrtKeySpec.OLrzqt(interfaceC5106Ey, nullPointerException);
    }
}
