package com.okinc.business.defi.assets.utxo.utxomanagement;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BrcNftItem$$serializer implements GeneratedSerializer<BrcNftItem> {
    public static final int $stable;
    public static final BrcNftItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BrcNftItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BrcNftItem$$serializer brcNftItem$$serializer = new BrcNftItem$$serializer();
        INSTANCE = brcNftItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.assets.utxo.utxomanagement.BrcNftItem", brcNftItem$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("nftId", true);
        pluginGeneratedSerialDescriptor.addElement("nftLocation", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("brc20Nft", true);
        pluginGeneratedSerialDescriptor.addElement("imgUrl", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.TICKER, true);
        pluginGeneratedSerialDescriptor.addElement("bizNftId", true);
        pluginGeneratedSerialDescriptor.addElement("platformSupport", true);
        pluginGeneratedSerialDescriptor.addElement("isValuable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BrcNftItem deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        boolean zDecodeBooleanElement;
        String str;
        String str2;
        String str3;
        Boolean bool2;
        String str4;
        String str5;
        Long l;
        int i;
        String str6;
        String str7;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            str3 = str14;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            bool2 = bool4;
            str4 = str13;
            str2 = str12;
            bool = bool3;
            str = str11;
            l = l2;
            str6 = str10;
            str5 = str9;
            i = 1023;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z = true;
            String str15 = null;
            String str16 = null;
            Boolean bool5 = null;
            String str17 = null;
            bool = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            Long l3 = null;
            int i6 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str18;
                        str8 = str19;
                        z = false;
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 0:
                        str7 = str18;
                        str8 = str19;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str20);
                        i6 |= 1;
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 1:
                        str8 = str19;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str18);
                        i6 |= 2;
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 2:
                        str8 = str19;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, l3);
                        i6 |= 4;
                        str7 = str18;
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 3:
                        str8 = str19;
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool);
                        i6 |= 8;
                        str7 = str18;
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 4:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str19);
                        i6 |= 16;
                        str7 = str18;
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 5:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str15);
                        i6 |= 32;
                        str7 = str18;
                        str8 = str19;
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 6:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str17);
                        i6 |= 64;
                        str7 = str18;
                        str8 = str19;
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 7:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str16);
                        i6 |= 128;
                        break;
                    case 8:
                        i6 |= 256;
                        str7 = str18;
                        str8 = str19;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool5);
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 9:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i6 |= 512;
                        str7 = str18;
                        str8 = str19;
                        str19 = str8;
                        str18 = str7;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str21 = str18;
            String str22 = str20;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = str19;
            str2 = str15;
            str3 = str16;
            bool2 = bool5;
            str4 = str17;
            str5 = str22;
            l = l3;
            i = i6;
            str6 = str21;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BrcNftItem(i, str5, str6, l, bool, str, str2, str4, str3, bool2, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BrcNftItem brcNftItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(brcNftItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BrcNftItem.AEQbTJ(brcNftItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
