package com.okinc.share.mln.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class LuaImageInfo$$serializer implements GeneratedSerializer<LuaImageInfo> {
    public static final int $stable;
    public static final LuaImageInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LuaImageInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LuaImageInfo$$serializer luaImageInfo$$serializer = new LuaImageInfo$$serializer();
        INSTANCE = luaImageInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.share.mln.bean.LuaImageInfo", luaImageInfo$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("isLocal", false);
        pluginGeneratedSerialDescriptor.addElement("isTemp", false);
        pluginGeneratedSerialDescriptor.addElement("isThemed", false);
        pluginGeneratedSerialDescriptor.addElement("tintColor", true);
        pluginGeneratedSerialDescriptor.addElement("imagePath", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("autoMirrored", true);
        pluginGeneratedSerialDescriptor.addElement("absolutePath", true);
        pluginGeneratedSerialDescriptor.addElement("miniAppResourceLoader", true);
        pluginGeneratedSerialDescriptor.addElement("okIcon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(LuaTintColor$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LuaSize$$serializer.INSTANCE), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LuaMiniAppResourceLoader$$serializer.INSTANCE), IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LuaImageInfo deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String str;
        LuaMiniAppResourceLoader luaMiniAppResourceLoader;
        boolean z;
        LuaSize luaSize;
        boolean zDecodeBooleanElement;
        boolean z2;
        LuaTintColor luaTintColor;
        String str2;
        int i;
        boolean z3;
        String str3;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            LuaTintColor luaTintColor2 = (LuaTintColor) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LuaTintColor$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            LuaSize luaSize2 = (LuaSize) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LuaSize$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            LuaMiniAppResourceLoader luaMiniAppResourceLoader2 = (LuaMiniAppResourceLoader) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LuaMiniAppResourceLoader$$serializer.INSTANCE, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            luaMiniAppResourceLoader = luaMiniAppResourceLoader2;
            z2 = zDecodeBooleanElement4;
            luaSize = luaSize2;
            str2 = str4;
            str3 = str5;
            str = strDecodeStringElement;
            z = zDecodeBooleanElement3;
            i = 2047;
            luaTintColor = luaTintColor2;
            z3 = zDecodeBooleanElement2;
        } else {
            boolean z4 = true;
            String str6 = null;
            String str7 = null;
            LuaSize luaSize3 = null;
            LuaMiniAppResourceLoader luaMiniAppResourceLoader3 = null;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement2 = 0;
            int i4 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            LuaTintColor luaTintColor3 = null;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i3 = 10;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 10;
                        break;
                    case 1:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 10;
                        break;
                    case 2:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 10;
                        break;
                    case 3:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i4 |= 8;
                        i3 = 10;
                        break;
                    case 4:
                        luaTintColor3 = (LuaTintColor) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LuaTintColor$$serializer.INSTANCE, luaTintColor3);
                        i4 |= 16;
                        i3 = 10;
                        break;
                    case 5:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str7);
                        i4 |= 32;
                        i3 = 10;
                        break;
                    case 6:
                        luaSize3 = (LuaSize) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LuaSize$$serializer.INSTANCE, luaSize3);
                        i4 |= 64;
                        i3 = 10;
                        break;
                    case 7:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i2 = i4 | 128;
                        i4 = i2;
                        i3 = 10;
                        break;
                    case 8:
                        i4 |= 256;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str6);
                        i3 = 10;
                        break;
                    case 9:
                        i4 |= 512;
                        luaMiniAppResourceLoader3 = (LuaMiniAppResourceLoader) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LuaMiniAppResourceLoader$$serializer.INSTANCE, luaMiniAppResourceLoader3);
                        i3 = 10;
                        break;
                    case 10:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i3);
                        i2 = i4 | 1024;
                        i4 = i2;
                        i3 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            str = strDecodeStringElement2;
            luaMiniAppResourceLoader = luaMiniAppResourceLoader3;
            z = zDecodeBooleanElement5;
            luaSize = luaSize3;
            zDecodeBooleanElement = zDecodeBooleanElement6;
            z2 = zDecodeBooleanElement8;
            luaTintColor = luaTintColor3;
            str2 = str7;
            i = i4;
            z3 = zDecodeBooleanElement7;
            str3 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LuaImageInfo(i, str, z3, zDecodeBooleanElement, z, luaTintColor, str2, luaSize, z2, str3, luaMiniAppResourceLoader, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LuaImageInfo luaImageInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(luaImageInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LuaImageInfo.write$Self$OKShare_sdk_share_impl(luaImageInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
