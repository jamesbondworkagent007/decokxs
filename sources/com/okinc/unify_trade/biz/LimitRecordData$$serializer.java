package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class LimitRecordData$$serializer implements GeneratedSerializer<LimitRecordData> {
    public static final int $stable;
    public static final LimitRecordData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LimitRecordData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LimitRecordData$$serializer limitRecordData$$serializer = new LimitRecordData$$serializer();
        INSTANCE = limitRecordData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.LimitRecordData", limitRecordData$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("rate", true);
        pluginGeneratedSerialDescriptor.addElement("apr", true);
        pluginGeneratedSerialDescriptor.addElement("coinBorrowLimit", true);
        pluginGeneratedSerialDescriptor.addElement("surplusLimit", true);
        pluginGeneratedSerialDescriptor.addElement("usedLimit", true);
        pluginGeneratedSerialDescriptor.addElement("interest", true);
        pluginGeneratedSerialDescriptor.addElement("posLoan", true);
        pluginGeneratedSerialDescriptor.addElement("availLoan", true);
        pluginGeneratedSerialDescriptor.addElement("usedLoan", true);
        pluginGeneratedSerialDescriptor.addElement("avgRate", true);
        pluginGeneratedSerialDescriptor.addElement("userFlexLoanInterestFreeBorrowAmt", true);
        pluginGeneratedSerialDescriptor.addElement("coinRealBorrowAmt", true);
        pluginGeneratedSerialDescriptor.addElement("surplusLmtDetails", true);
        pluginGeneratedSerialDescriptor.addElement("masterFlexLoanQuotaMode", true);
        pluginGeneratedSerialDescriptor.addElement("dnaSupportedCoin", true);
        pluginGeneratedSerialDescriptor.addElement("masterFlexLoanQuota", true);
        pluginGeneratedSerialDescriptor.addElement("dnaMasterFlexLoanQuota", true);
        pluginGeneratedSerialDescriptor.addElement("dnaMasterFlexLoanAvaQuota", true);
        pluginGeneratedSerialDescriptor.addElement("masterFlexLoanAvaQuota", true);
        pluginGeneratedSerialDescriptor.addElement("hourRates", true);
        pluginGeneratedSerialDescriptor.addElement("yearRates", true);
        pluginGeneratedSerialDescriptor.addElement("rateType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(SurplusLmtDetails$$serializer.INSTANCE), stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LimitRecordData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        String str;
        SurplusLmtDetails surplusLmtDetails;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String strDecodeStringElement3;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 5;
        int i4 = 3;
        int i5 = 4;
        String strDecodeStringElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            SurplusLmtDetails surplusLmtDetails2 = (SurplusLmtDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, SurplusLmtDetails$$serializer.INSTANCE, null);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            str16 = strDecodeStringElement23;
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            z = zDecodeBooleanElement;
            str18 = strDecodeStringElement22;
            strDecodeStringElement2 = strDecodeStringElement21;
            str17 = strDecodeStringElement20;
            str4 = strDecodeStringElement19;
            str3 = strDecodeStringElement24;
            str14 = strDecodeStringElement5;
            str7 = strDecodeStringElement13;
            str9 = strDecodeStringElement11;
            str2 = strDecodeStringElement16;
            str6 = strDecodeStringElement14;
            str8 = strDecodeStringElement12;
            surplusLmtDetails = surplusLmtDetails2;
            i = 8388607;
            str12 = strDecodeStringElement8;
            str11 = strDecodeStringElement9;
            str15 = strDecodeStringElement6;
            str5 = strDecodeStringElement15;
            str = strDecodeStringElement17;
            str10 = strDecodeStringElement10;
            strDecodeStringElement = strDecodeStringElement18;
            str13 = strDecodeStringElement7;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String strDecodeStringElement25 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            strDecodeStringElement2 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            i = 0;
            SurplusLmtDetails surplusLmtDetails3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 1:
                        i |= 2;
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 2:
                        i |= 4;
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 4:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i |= 16;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 5:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i |= 32;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 6:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 7:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 8:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 9:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 10:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i |= 1024;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 11:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 12:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 13:
                        surplusLmtDetails3 = (SurplusLmtDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, SurplusLmtDetails$$serializer.INSTANCE, surplusLmtDetails3);
                        i |= 8192;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 14:
                        i |= 16384;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 15:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                        i |= 32768;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 17:
                        i |= 131072;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 18:
                        i |= 262144;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 19:
                        i |= 524288;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 20:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i |= 1048576;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 21:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i2 = 2097152;
                        i = i2 | i;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 22:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i2 = 4194304;
                        i = i2 | i;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement25;
            surplusLmtDetails = surplusLmtDetails3;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement27;
            str4 = strDecodeStringElement30;
            str5 = strDecodeStringElement31;
            str6 = strDecodeStringElement32;
            str7 = strDecodeStringElement33;
            str8 = strDecodeStringElement34;
            str9 = strDecodeStringElement35;
            str10 = strDecodeStringElement36;
            str11 = strDecodeStringElement37;
            str12 = strDecodeStringElement38;
            strDecodeStringElement3 = strDecodeStringElement39;
            str13 = strDecodeStringElement40;
            str14 = strDecodeStringElement41;
            str15 = strDecodeStringElement42;
            str16 = strDecodeStringElement28;
            str17 = strDecodeStringElement29;
            str18 = strDecodeStringElement26;
            z = zDecodeBooleanElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LimitRecordData(i, str14, str15, str13, str12, str11, str10, str9, str8, str7, str6, str5, str2, str, surplusLmtDetails, strDecodeStringElement, z, str4, str17, strDecodeStringElement2, str18, str16, str3, strDecodeStringElement3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LimitRecordData limitRecordData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(limitRecordData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LimitRecordData.write$Self$OKTradeCore_trade_core(limitRecordData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
