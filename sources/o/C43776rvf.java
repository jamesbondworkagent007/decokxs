package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.Alert;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Card;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Checkbox;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Cta;
import com.okinc.ok_kyc_core.data.remote.networkmodel.EditableList;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Form;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Hyperlink;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDate;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormatText;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelect;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputText;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Result;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.PolymorphicModuleBuilder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;

/* JADX INFO: renamed from: o.rvf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43776rvf {
    public static final SerializersModule AEQbTJ;
    public static final SerializersModule AYXKKw;
    public static final C43776rvf EZpvd = new C43776rvf();
    public static final Json KWHzl;
    public static final int OLrzqt;
    public static final Json copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Json AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Json copydefault() {
        return KWHzl;
    }

    private C43776rvf() {
    }

    public static final Unit KWHzl(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setSerializersModule(AEQbTJ);
        jsonBuilder.setClassDiscriminator("type");
        jsonBuilder.setExplicitNulls(false);
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setPrettyPrint(true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setSerializersModule(AYXKKw);
        jsonBuilder.setClassDiscriminator("type");
        jsonBuilder.setExplicitNulls(false);
        jsonBuilder.setEncodeDefaults(true);
        return Unit.INSTANCE;
    }

    static {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(C56524yIo.AEQbTJ(UIComponent.class), null);
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(Cta.class), Cta.CREATOR.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(TextContent.class), TextContent.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(InputDate.class), InputDate.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(InputSelect.class), InputSelect.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(InputText.class), InputText.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(CTAButton.class), CTAButton.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(Alert.class), Alert.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(Card.class), Card.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(Checkbox.class), Checkbox.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(Hyperlink.class), Hyperlink.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(EditableList.class), EditableList.Companion.serializer());
        polymorphicModuleBuilder.subclass(C56524yIo.AEQbTJ(InputFormatText.class), InputFormatText.Companion.serializer());
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
        AEQbTJ = serializersModuleBuilder.build();
        KWHzl = JsonKt.Json$default(null, new Function1() { // from class: o.rve
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43776rvf.KWHzl((JsonBuilder) obj);
            }
        }, 1, null);
        SerializersModuleBuilder serializersModuleBuilder2 = new SerializersModuleBuilder();
        PolymorphicModuleBuilder polymorphicModuleBuilder2 = new PolymorphicModuleBuilder(C56524yIo.AEQbTJ(PageComponent.class), null);
        polymorphicModuleBuilder2.subclass(C56524yIo.AEQbTJ(Form.class), Form.Companion.serializer());
        polymorphicModuleBuilder2.subclass(C56524yIo.AEQbTJ(Result.class), Result.Companion.serializer());
        polymorphicModuleBuilder2.buildTo(serializersModuleBuilder2);
        AYXKKw = serializersModuleBuilder2.build();
        copydefault = JsonKt.Json$default(null, new Function1() { // from class: o.rvd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43776rvf.copydefault((JsonBuilder) obj);
            }
        }, 1, null);
        OLrzqt = 8;
    }
}
