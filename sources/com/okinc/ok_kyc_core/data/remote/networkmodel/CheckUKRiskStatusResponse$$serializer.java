package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.unify_trade.biz.BotWebHook;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class CheckUKRiskStatusResponse$$serializer implements GeneratedSerializer<CheckUKRiskStatusResponse> {
    public static final int $stable;
    public static final CheckUKRiskStatusResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CheckUKRiskStatusResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CheckUKRiskStatusResponse$$serializer checkUKRiskStatusResponse$$serializer = new CheckUKRiskStatusResponse$$serializer();
        INSTANCE = checkUKRiskStatusResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.CheckUKRiskStatusResponse", checkUKRiskStatusResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement(BotWebHook.KEY_ACTION, false);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("coolingPeriodTime", true);
        pluginGeneratedSerialDescriptor.addElement("pages", true);
        pluginGeneratedSerialDescriptor.addElement("playbook", true);
        pluginGeneratedSerialDescriptor.addElement("playbookParams", true);
        pluginGeneratedSerialDescriptor.addElement("actionParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = CheckUKRiskStatusResponse.$childSerializers;
        KSerializer kSerializer = kSerializerArr[0];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(kSerializerArr[6])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CheckUKRiskStatusResponse deserialize(@NotNull Decoder decoder) {
        HashMap map;
        HashMap map2;
        String str;
        String str2;
        int i;
        RiskStatus riskStatus;
        List list;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CheckUKRiskStatusResponse.$childSerializers;
        int i2 = 4;
        int i3 = 2;
        HashMap map3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            RiskStatus riskStatus2 = (RiskStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            HashMap map4 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            map = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            riskStatus = riskStatus2;
            str = str6;
            str3 = str5;
            i = 127;
            map2 = map4;
            list = list2;
            str2 = str4;
        } else {
            boolean z = true;
            int i4 = 0;
            String str7 = null;
            HashMap map5 = null;
            String str8 = null;
            List list3 = null;
            String str9 = null;
            RiskStatus riskStatus3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 4;
                        i3 = 2;
                        break;
                    case 0:
                        riskStatus3 = (RiskStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], riskStatus3);
                        i4 |= 1;
                        i2 = 4;
                        i3 = 2;
                        break;
                    case 1:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str9);
                        i4 |= 2;
                        i2 = 4;
                        i3 = 2;
                        break;
                    case 2:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str7);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list3);
                        i2 = 4;
                        i3 = 2;
                        break;
                    case 4:
                        i4 |= 16;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str8);
                        i2 = 4;
                        i3 = 2;
                        break;
                    case 5:
                        i4 |= 32;
                        map5 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], map5);
                        i2 = 4;
                        i3 = 2;
                        break;
                    case 6:
                        i4 |= 64;
                        map3 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], map3);
                        i2 = 4;
                        i3 = 2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            RiskStatus riskStatus4 = riskStatus3;
            map = map3;
            map2 = map5;
            str = str8;
            str2 = str9;
            i = i4;
            riskStatus = riskStatus4;
            list = list3;
            str3 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CheckUKRiskStatusResponse(i, riskStatus, str2, str3, list, str, map2, map, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CheckUKRiskStatusResponse checkUKRiskStatusResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(checkUKRiskStatusResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CheckUKRiskStatusResponse.write$Self$OKCompliance_ok_compliance_impl(checkUKRiskStatusResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
