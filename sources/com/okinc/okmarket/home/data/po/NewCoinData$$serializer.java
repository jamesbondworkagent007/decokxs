package com.okinc.okmarket.home.data.po;

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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class NewCoinData$$serializer implements GeneratedSerializer<NewCoinData> {
    public static final int $stable;
    public static final NewCoinData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NewCoinData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NewCoinData$$serializer newCoinData$$serializer = new NewCoinData$$serializer();
        INSTANCE = newCoinData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okmarket.home.data.po.NewCoinData", newCoinData$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("onlineTs", true);
        pluginGeneratedSerialDescriptor.addElement("displayId", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("canTrade", true);
        pluginGeneratedSerialDescriptor.addElement("waitOnlineTime", true);
        pluginGeneratedSerialDescriptor.addElement("noticeUrlCn", true);
        pluginGeneratedSerialDescriptor.addElement("noticeUrlEn", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("tradeReady", true);
        pluginGeneratedSerialDescriptor.addElement("openMethod", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NewCoinData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i;
        Boolean bool;
        String str11;
        String str12;
        Boolean bool2;
        String str13;
        String str14;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        String str15 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str3 = str25;
            str5 = str24;
            str = str22;
            str10 = str21;
            str2 = str23;
            i = 4095;
            str11 = str17;
            bool = bool3;
            str7 = str19;
            str4 = str16;
            str9 = str20;
            str8 = str18;
        } else {
            int i5 = 11;
            int i6 = 0;
            boolean z = true;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            Boolean bool4 = null;
            String str34 = null;
            String str35 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        str34 = str34;
                        i4 = 8;
                        break;
                    case 0:
                        str12 = str33;
                        bool2 = bool4;
                        i6 |= 1;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str34);
                        str13 = str35;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 1:
                        bool2 = bool4;
                        str14 = str35;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str33);
                        i6 |= 2;
                        str13 = str14;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 2:
                        bool2 = bool4;
                        str14 = str35;
                        i6 |= 4;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str32);
                        str12 = str33;
                        str13 = str14;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 3:
                        bool2 = bool4;
                        str14 = str35;
                        i6 |= 8;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str31);
                        str12 = str33;
                        str13 = str14;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 4:
                        bool2 = bool4;
                        str14 = str35;
                        i6 |= 16;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str15);
                        str12 = str33;
                        str13 = str14;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 5:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool4);
                        i6 |= 32;
                        str13 = str35;
                        str12 = str33;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 6:
                        i6 |= 64;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str35);
                        str12 = str33;
                        bool2 = bool4;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str26);
                        str12 = str33;
                        bool2 = bool4;
                        str13 = str35;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str27);
                        str12 = str33;
                        bool2 = bool4;
                        str13 = str35;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 9:
                        i6 |= 512;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str29);
                        str12 = str33;
                        bool2 = bool4;
                        str13 = str35;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    case 10:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str28);
                        i6 |= 1024;
                        break;
                    case 11:
                        i6 |= 2048;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str30);
                        str12 = str33;
                        bool2 = bool4;
                        str13 = str35;
                        bool4 = bool2;
                        str33 = str12;
                        str35 = str13;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str36 = str33;
            str = str26;
            str2 = str27;
            str3 = str28;
            str4 = str34;
            str5 = str29;
            str6 = str30;
            str7 = str31;
            str8 = str32;
            str9 = str15;
            str10 = str35;
            i = i6;
            bool = bool4;
            str11 = str36;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NewCoinData(i, str4, str11, str8, str7, str9, bool, str10, str, str2, str5, str3, str6, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NewCoinData newCoinData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(newCoinData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NewCoinData.write$Self$OKMarket_market_impl(newCoinData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
