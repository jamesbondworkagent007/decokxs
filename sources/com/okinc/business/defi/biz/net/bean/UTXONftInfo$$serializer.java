package com.okinc.business.defi.biz.net.bean;

import com.huawei.hms.push.constant.RemoteMessageConst;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class UTXONftInfo$$serializer implements GeneratedSerializer<UTXONftInfo> {
    public static final int $stable;
    public static final UTXONftInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UTXONftInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UTXONftInfo$$serializer uTXONftInfo$$serializer = new UTXONftInfo$$serializer();
        INSTANCE = uTXONftInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.UTXONftInfo", uTXONftInfo$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("nftId", true);
        pluginGeneratedSerialDescriptor.addElement("nftLocation", true);
        pluginGeneratedSerialDescriptor.addElement("brc20Nft", true);
        pluginGeneratedSerialDescriptor.addElement("imgUrl", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.TICKER, true);
        pluginGeneratedSerialDescriptor.addElement("bizNftId", true);
        pluginGeneratedSerialDescriptor.addElement("platformSupport", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("tokenType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UTXONftInfo deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        int i;
        String str;
        String str2;
        Boolean bool2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            bool2 = bool5;
            str6 = str15;
            str7 = str14;
            str = str16;
            str5 = str13;
            str8 = str10;
            i = 1023;
            bool = bool4;
            str4 = str11;
            str3 = str12;
        } else {
            int i5 = 0;
            boolean z = true;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            bool = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str23;
                        z = false;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 0:
                        str9 = str23;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str24);
                        i5 |= 1;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        str9 = str23;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str22);
                        i5 |= 2;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 2:
                        str9 = str23;
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool);
                        i5 |= 4;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 3:
                        str9 = str23;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str21);
                        i5 |= 8;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 4:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str23);
                        i5 |= 16;
                        str9 = str23;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 5:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str18);
                        i5 |= 32;
                        str9 = str23;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 6:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str17);
                        i5 |= 64;
                        str9 = str23;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 7:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool3);
                        i5 |= 128;
                        break;
                    case 8:
                        i5 |= 256;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str19);
                        str9 = str23;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 9:
                        i5 |= 512;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str20);
                        str9 = str23;
                        str23 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = str19;
            str2 = str20;
            bool2 = bool3;
            str3 = str21;
            str4 = str22;
            str5 = str23;
            str6 = str17;
            str7 = str18;
            str8 = str24;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UTXONftInfo(i, str8, str4, bool, str3, str5, str7, str6, bool2, str, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UTXONftInfo uTXONftInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uTXONftInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UTXONftInfo.write$Self$OKWallet_wallet_impl(uTXONftInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
