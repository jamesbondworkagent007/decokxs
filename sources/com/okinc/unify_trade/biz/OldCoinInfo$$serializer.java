package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class OldCoinInfo$$serializer implements GeneratedSerializer<OldCoinInfo> {
    public static final int $stable;
    public static final OldCoinInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OldCoinInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OldCoinInfo$$serializer oldCoinInfo$$serializer = new OldCoinInfo$$serializer();
        INSTANCE = oldCoinInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.OldCoinInfo", oldCoinInfo$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("classification", true);
        pluginGeneratedSerialDescriptor.addElement("classificationId", true);
        pluginGeneratedSerialDescriptor.addElement("flowTotal", true);
        pluginGeneratedSerialDescriptor.addElement("fullName", true);
        pluginGeneratedSerialDescriptor.addElement("fullNameSeo", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("project", true);
        pluginGeneratedSerialDescriptor.addElement("last", true);
        pluginGeneratedSerialDescriptor.addElement("dayHigh", true);
        pluginGeneratedSerialDescriptor.addElement("dayLow", true);
        pluginGeneratedSerialDescriptor.addElement("changePercentage", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("volume", true);
        pluginGeneratedSerialDescriptor.addElement("index_postion", true);
        pluginGeneratedSerialDescriptor.addElement("open", true);
        pluginGeneratedSerialDescriptor.addElement("openUtc0", true);
        pluginGeneratedSerialDescriptor.addElement("openUtc8", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OldCoinInfo deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str8;
        String str9;
        int i2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 11;
        int i5 = 10;
        char c = '\t';
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str11 = str23;
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            i2 = iDecodeIntElement;
            str6 = str22;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            str7 = strDecodeStringElement4;
            str4 = str31;
            str2 = str30;
            str5 = str29;
            str12 = str27;
            str8 = str26;
            str10 = str25;
            str14 = str24;
            str13 = strDecodeStringElement3;
            str3 = str28;
            str9 = str32;
            i = 131071;
            str = str21;
        } else {
            int i6 = 16;
            int i7 = 0;
            boolean z = true;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str15 = str44;
                        str16 = str39;
                        str17 = str40;
                        str18 = str42;
                        str19 = str43;
                        str20 = str33;
                        z = false;
                        i3 = i7;
                        str33 = str20;
                        str40 = str17;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 0:
                        str15 = str44;
                        str16 = str39;
                        String str45 = str40;
                        str18 = str42;
                        str19 = str43;
                        str20 = str33;
                        str17 = str45;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str41);
                        i7 |= 1;
                        i3 = i7;
                        str33 = str20;
                        str40 = str17;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 1:
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        i3 = i7 | 2;
                        str33 = str33;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str40);
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 2:
                        str16 = str39;
                        str19 = str43;
                        str15 = str44;
                        i3 = i7 | 4;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str42);
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 3:
                        str16 = str39;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str43);
                        i3 = i7 | 8;
                        str15 = str44;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 4:
                        str16 = str39;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        str15 = str44;
                        i3 = i7 | 16;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 5:
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str39);
                        i3 = i7 | 32;
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 6:
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str44);
                        i3 = i7 | 64;
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 7:
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str35);
                        i3 = i7 | 128;
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 8:
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str36);
                        i3 = i7 | 256;
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 9:
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str38);
                        i3 = i7 | 512;
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 10:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str34);
                        i3 = i7 | 1024;
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 11:
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str37);
                        i3 = i7 | 2048;
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 12:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str33);
                        i3 = i7 | 4096;
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        i7 = i3;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 13:
                        i7 |= 8192;
                        str15 = str44;
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 14:
                        i7 |= 16384;
                        str15 = str44;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 15:
                        i7 |= 32768;
                        str15 = str44;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        str16 = str39;
                        str18 = str42;
                        str19 = str43;
                        str39 = str16;
                        str43 = str19;
                        str42 = str18;
                        str44 = str15;
                        i6 = 16;
                        i4 = 11;
                        i5 = 10;
                        c = '\t';
                        break;
                    case 16:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 65536;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str46 = str39;
            String str47 = str42;
            String str48 = str43;
            str = str41;
            str2 = str34;
            i = i7;
            str3 = str36;
            str4 = str37;
            str5 = str38;
            str6 = str40;
            str7 = strDecodeStringElement6;
            strDecodeStringElement = strDecodeStringElement7;
            strDecodeStringElement2 = strDecodeStringElement8;
            str8 = str44;
            str9 = str33;
            i2 = iDecodeIntElement2;
            str10 = str46;
            str11 = str47;
            str12 = str35;
            str13 = strDecodeStringElement5;
            str14 = str48;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OldCoinInfo(i, str, str6, str11, str14, str13, str10, str8, str12, str3, str5, str2, str4, str9, i2, str7, strDecodeStringElement2, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OldCoinInfo oldCoinInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oldCoinInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OldCoinInfo.write$Self$OKTradeCore_trade_core(oldCoinInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
