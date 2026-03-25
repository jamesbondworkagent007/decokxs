package com.okinc.wallet.hardware.api.onekey;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C56996yaA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class EVMSignTypedDataParams$$serializer implements GeneratedSerializer<EVMSignTypedDataParams> {
    public static final int $stable;
    public static final EVMSignTypedDataParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EVMSignTypedDataParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EVMSignTypedDataParams$$serializer eVMSignTypedDataParams$$serializer = new EVMSignTypedDataParams$$serializer();
        INSTANCE = eVMSignTypedDataParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.api.onekey.EVMSignTypedDataParams", eVMSignTypedDataParams$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("path", false);
        pluginGeneratedSerialDescriptor.addElement("metamaskV4Compat", false);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        pluginGeneratedSerialDescriptor.addElement("domainHash", true);
        pluginGeneratedSerialDescriptor.addElement("messageHash", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{C56996yaA.KWHzl, BooleanSerializer.INSTANCE, JsonObjectSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EVMSignTypedDataParams deserialize(@NotNull Decoder decoder) {
        int i;
        Long l;
        String str;
        String str2;
        Path path;
        JsonObject jsonObject;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Path path2 = (Path) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, C56996yaA.KWHzl, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            JsonObject jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, JsonObjectSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            path = path2;
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, null);
            str = str3;
            str2 = str4;
            jsonObject = jsonObject2;
            z = zDecodeBooleanElement;
            i = 63;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z3 = true;
            String str5 = null;
            JsonObject jsonObject3 = null;
            Path path3 = null;
            Long l2 = null;
            String str6 = null;
            i = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        z3 = false;
                        i2 = 5;
                        break;
                    case 0:
                        z2 = false;
                        i |= 1;
                        path3 = (Path) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, C56996yaA.KWHzl, path3);
                        i2 = 5;
                        break;
                    case 1:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        i |= 4;
                        jsonObject3 = (JsonObject) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, JsonObjectSerializer.INSTANCE, jsonObject3);
                        break;
                    case 3:
                        i |= 8;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str6);
                        break;
                    case 4:
                        i |= 16;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str5);
                        break;
                    case 5:
                        i |= 32;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, LongSerializer.INSTANCE, l2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            l = l2;
            str = str6;
            str2 = str5;
            path = path3;
            jsonObject = jsonObject3;
            z = zDecodeBooleanElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EVMSignTypedDataParams(i, path, z, jsonObject, str, str2, l, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EVMSignTypedDataParams eVMSignTypedDataParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(eVMSignTypedDataParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EVMSignTypedDataParams.OLrzqt(eVMSignTypedDataParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
