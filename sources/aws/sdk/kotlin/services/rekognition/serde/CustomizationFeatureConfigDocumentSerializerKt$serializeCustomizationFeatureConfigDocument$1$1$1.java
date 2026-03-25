package aws.sdk.kotlin.services.rekognition.serde;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C15915ea;
import o.CursorTreeAdapter;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class CustomizationFeatureConfigDocumentSerializerKt$serializeCustomizationFeatureConfigDocument$1$1$1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, CursorTreeAdapter, Unit> {
    public static final CustomizationFeatureConfigDocumentSerializerKt$serializeCustomizationFeatureConfigDocument$1$1$1 INSTANCE = new CustomizationFeatureConfigDocumentSerializerKt$serializeCustomizationFeatureConfigDocument$1$1$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomizationFeatureConfigDocumentSerializerKt$serializeCustomizationFeatureConfigDocument$1$1$1() {
        super(2, C15915ea.class, "serializeCustomizationFeatureContentModerationConfigDocument", "serializeCustomizationFeatureContentModerationConfigDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/rekognition/model/CustomizationFeatureContentModerationConfig;)V", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, CursorTreeAdapter cursorTreeAdapter) {
        invoke2(interfaceC5106Ey, cursorTreeAdapter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull CursorTreeAdapter cursorTreeAdapter) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(cursorTreeAdapter, "");
        C15915ea.AEQbTJ(interfaceC5106Ey, cursorTreeAdapter);
    }
}
