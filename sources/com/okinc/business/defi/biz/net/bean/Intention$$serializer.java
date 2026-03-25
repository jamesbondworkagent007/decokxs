package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Intention$$serializer implements GeneratedSerializer<Intention> {
    public static final int $stable;
    public static final Intention$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Intention$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Intention$$serializer intention$$serializer = new Intention$$serializer();
        INSTANCE = intention$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.Intention", intention$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("supportIntentionFlag", true);
        pluginGeneratedSerialDescriptor.addElement("intentionTypeIconUrlDay", true);
        pluginGeneratedSerialDescriptor.addElement("intentionTypeIconUrlNight", true);
        pluginGeneratedSerialDescriptor.addElement("intentionTypeLanguageText", true);
        pluginGeneratedSerialDescriptor.addElement("methodName", true);
        pluginGeneratedSerialDescriptor.addElement("methodParameter", true);
        pluginGeneratedSerialDescriptor.addElement("formatMethodNameAndParameter", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(JsonElementSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Intention deserialize(@NotNull Decoder decoder) {
        String str;
        JsonElement jsonElement;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            JsonElement jsonElement2 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, JsonElementSerializer.INSTANCE, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            i = 127;
            jsonElement = jsonElement2;
            str4 = str11;
            str2 = str12;
            str3 = str10;
            str5 = str8;
            str6 = str9;
        } else {
            int i3 = 0;
            boolean z = true;
            String str13 = null;
            JsonElement jsonElement3 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str15);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str13);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        i3 |= 4;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str17);
                        i2 = 6;
                        break;
                    case 3:
                        i3 |= 8;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str14);
                        i2 = 6;
                        break;
                    case 4:
                        i3 |= 16;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str16);
                        i2 = 6;
                        break;
                    case 5:
                        i3 |= 32;
                        jsonElement3 = (JsonElement) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, JsonElementSerializer.INSTANCE, jsonElement3);
                        i2 = 6;
                        break;
                    case 6:
                        i3 |= 64;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str7);
                        i2 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str7;
            jsonElement = jsonElement3;
            str2 = str16;
            str3 = str17;
            i = i3;
            str4 = str14;
            str5 = str15;
            str6 = str13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Intention(i, str5, str6, str3, str4, str2, jsonElement, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Intention intention) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(intention, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Intention.write$Self$OKWallet_wallet_api(intention, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
