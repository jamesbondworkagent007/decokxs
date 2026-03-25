package com.okinc.unify_trade.biz;

import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class BizModifyOrderReq$$serializer implements GeneratedSerializer<BizModifyOrderReq> {
    public static final int $stable;
    public static final BizModifyOrderReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BizModifyOrderReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BizModifyOrderReq$$serializer bizModifyOrderReq$$serializer = new BizModifyOrderReq$$serializer();
        INSTANCE = bizModifyOrderReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.BizModifyOrderReq", bizModifyOrderReq$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("ordId", false);
        pluginGeneratedSerialDescriptor.addElement("newSz", true);
        pluginGeneratedSerialDescriptor.addElement("newPx", true);
        pluginGeneratedSerialDescriptor.addElement("newTpTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("newTpOrdPx", true);
        pluginGeneratedSerialDescriptor.addElement("newSlTriggerPx", true);
        pluginGeneratedSerialDescriptor.addElement("newSlOrdPx", true);
        pluginGeneratedSerialDescriptor.addElement("newTpTriggerPxType", true);
        pluginGeneratedSerialDescriptor.addElement("newSlTriggerPxType", true);
        pluginGeneratedSerialDescriptor.addElement("attachAlgoOrds", true);
        pluginGeneratedSerialDescriptor.addElement("newPxUsd", true);
        pluginGeneratedSerialDescriptor.addElement("newPxVol", true);
        pluginGeneratedSerialDescriptor.addElement("isChasePrice", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = BizModifyOrderReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[10]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BizModifyOrderReq deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List list;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i;
        KSerializer[] kSerializerArr;
        List list2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = BizModifyOrderReq.$childSerializers;
        int i2 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            str14 = str28;
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str9 = str27;
            str = str26;
            str8 = str20;
            str4 = str29;
            list = list3;
            str2 = str25;
            str3 = str24;
            str11 = str22;
            i = 32767;
            str6 = str21;
            str13 = strDecodeStringElement2;
            str7 = str23;
            str12 = strDecodeStringElement;
        } else {
            int i3 = 14;
            boolean z = true;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String strDecodeStringElement3 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String strDecodeStringElement4 = null;
            int i4 = 0;
            List list4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str15 = str38;
                        str16 = str39;
                        str17 = str40;
                        z = false;
                        str38 = str15;
                        str39 = str16;
                        str40 = str17;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str15 = str38;
                        str16 = str39;
                        str17 = str40;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        str38 = str15;
                        str39 = str16;
                        str40 = str17;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str15 = str38;
                        str16 = str39;
                        str17 = str40;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        str38 = str15;
                        str39 = str16;
                        str40 = str17;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str15 = str38;
                        str16 = str39;
                        str17 = str40;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str41);
                        i4 |= 4;
                        str38 = str15;
                        str39 = str16;
                        str40 = str17;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str15 = str38;
                        str16 = str39;
                        i4 |= 8;
                        str17 = str40;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str37);
                        str38 = str15;
                        str39 = str16;
                        str40 = str17;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str34);
                        i4 |= 16;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr2;
                        str18 = str38;
                        str19 = str39;
                        list2 = list4;
                        i4 |= 32;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str40);
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr2;
                        str18 = str38;
                        str19 = str39;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str30);
                        i4 |= 64;
                        list2 = list4;
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 7:
                        str18 = str38;
                        kSerializerArr = kSerializerArr2;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str39);
                        i4 |= 128;
                        list2 = list4;
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 8:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str38);
                        i4 |= 256;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str19 = str39;
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 9:
                        i4 |= 512;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str31);
                        str18 = str38;
                        str19 = str39;
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 10:
                        i4 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kSerializerArr2[i2], list4);
                        str18 = str38;
                        str19 = str39;
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 11:
                        i4 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str32);
                        str18 = str38;
                        str19 = str39;
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 12:
                        i4 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str35);
                        str18 = str38;
                        str19 = str39;
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 13:
                        i4 |= 8192;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str33);
                        str18 = str38;
                        str19 = str39;
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 14:
                        i4 |= 16384;
                        kSerializerArr = kSerializerArr2;
                        list2 = list4;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str36);
                        str18 = str38;
                        str19 = str39;
                        str38 = str18;
                        str39 = str19;
                        list4 = list2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str38;
            str2 = str39;
            str3 = str30;
            str4 = str35;
            str5 = str36;
            str6 = str37;
            str7 = str40;
            list = list4;
            str8 = str41;
            str9 = str31;
            str10 = str33;
            str11 = str34;
            str12 = strDecodeStringElement3;
            str13 = strDecodeStringElement4;
            str14 = str32;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BizModifyOrderReq(i, str12, str13, str8, str6, str11, str7, str3, str2, str, str9, list, str14, str4, str10, str5, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BizModifyOrderReq bizModifyOrderReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bizModifyOrderReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BizModifyOrderReq.write$Self$OKTradeCore_trade_core(bizModifyOrderReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
