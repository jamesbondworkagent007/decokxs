package com.okinc.okpaymentapi.data.remote.model.management;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
public final /* synthetic */ class LimitInfo$$serializer implements GeneratedSerializer<LimitInfo> {
    public static final int $stable;
    public static final LimitInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LimitInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LimitInfo$$serializer limitInfo$$serializer = new LimitInfo$$serializer();
        INSTANCE = limitInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.management.LimitInfo", limitInfo$$serializer, 31);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("dailyLimit", true);
        pluginGeneratedSerialDescriptor.addElement("weeklyLimit", true);
        pluginGeneratedSerialDescriptor.addElement("monthlyLimit", true);
        pluginGeneratedSerialDescriptor.addElement("lifetimeLimit", true);
        pluginGeneratedSerialDescriptor.addElement("singleTransactionMax", true);
        pluginGeneratedSerialDescriptor.addElement("singleTransactionMin", true);
        pluginGeneratedSerialDescriptor.addElement("dailyLimitRemaining", true);
        pluginGeneratedSerialDescriptor.addElement("weeklyLimitRemaining", true);
        pluginGeneratedSerialDescriptor.addElement("monthlyLimitRemaining", true);
        pluginGeneratedSerialDescriptor.addElement("lifetimeLimitRemaining", true);
        pluginGeneratedSerialDescriptor.addElement("limitedByTradeFrequency", true);
        pluginGeneratedSerialDescriptor.addElement("frequencyCheckWindow", true);
        pluginGeneratedSerialDescriptor.addElement("tradeFrequencyLimit", true);
        pluginGeneratedSerialDescriptor.addElement("eddLimitLevel", true);
        pluginGeneratedSerialDescriptor.addElement("dailyFreqLimit", true);
        pluginGeneratedSerialDescriptor.addElement("weeklyFreqLimit", true);
        pluginGeneratedSerialDescriptor.addElement("monthlyFreqLimit", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedDailyFreqLimit", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedDailyLimit", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedDailyLimitRemaining", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedLifetimeLimit", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedLifetimeLimitRemaining", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedMonthlyFreqLimit", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedMonthlyLimit", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedMonthlyLimitRemaining", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedSingleTransactionMax", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedSingleTransactionMin", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedWeeklyFreqLimit", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedWeeklyLimit", true);
        pluginGeneratedSerialDescriptor.addElement("unlimitedWeeklyLimitRemaining", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(EddLimitLevel$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LimitInfo deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        EddLimitLevel eddLimitLevel;
        int i;
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
        String str11;
        String str12;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str13;
        String str14;
        boolean zDecodeBooleanElement2;
        String str15;
        boolean z8;
        String str16;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 5;
        int i4 = 3;
        int i5 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            EddLimitLevel eddLimitLevel2 = (EddLimitLevel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, EddLimitLevel$$serializer.INSTANCE, null);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 21);
            boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
            boolean zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
            boolean zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
            boolean zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
            boolean zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 26);
            boolean zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 27);
            boolean zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 28);
            boolean zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 29);
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 30);
            z6 = zDecodeBooleanElement11;
            z7 = zDecodeBooleanElement12;
            z3 = zDecodeBooleanElement13;
            z2 = zDecodeBooleanElement14;
            z8 = zDecodeBooleanElement15;
            z10 = zDecodeBooleanElement6;
            z4 = zDecodeBooleanElement5;
            z12 = zDecodeBooleanElement7;
            zDecodeBooleanElement = zDecodeBooleanElement8;
            z11 = zDecodeBooleanElement9;
            str5 = strDecodeStringElement9;
            str2 = strDecodeStringElement12;
            str16 = strDecodeStringElement16;
            eddLimitLevel = eddLimitLevel2;
            str12 = strDecodeStringElement3;
            z = zDecodeBooleanElement3;
            str = strDecodeStringElement11;
            str10 = strDecodeStringElement4;
            str9 = strDecodeStringElement5;
            i = Integer.MAX_VALUE;
            z9 = zDecodeBooleanElement10;
            z5 = zDecodeBooleanElement4;
            str4 = strDecodeStringElement10;
            str8 = strDecodeStringElement6;
            str15 = strDecodeStringElement15;
            str14 = strDecodeStringElement2;
            str11 = strDecodeStringElement;
            str3 = strDecodeStringElement14;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement7;
            str13 = strDecodeStringElement13;
        } else {
            boolean zDecodeBooleanElement16 = false;
            boolean zDecodeBooleanElement17 = false;
            boolean zDecodeBooleanElement18 = false;
            boolean zDecodeBooleanElement19 = false;
            boolean zDecodeBooleanElement20 = false;
            boolean zDecodeBooleanElement21 = false;
            boolean zDecodeBooleanElement22 = false;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement23 = false;
            boolean zDecodeBooleanElement24 = false;
            boolean zDecodeBooleanElement25 = false;
            boolean zDecodeBooleanElement26 = false;
            boolean zDecodeBooleanElement27 = false;
            boolean z13 = true;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            int i6 = 0;
            EddLimitLevel eddLimitLevel3 = null;
            boolean zDecodeBooleanElement28 = false;
            while (z13) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 0:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 1:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 2:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 3:
                        i6 |= 8;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 4:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i6 |= 16;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 5:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i6 |= 32;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 6:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 7:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i6 |= 128;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 8:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 |= 256;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 9:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 |= 512;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 10:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i6 |= 1024;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 11:
                        zDecodeBooleanElement27 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i6 |= 2048;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 12:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i6 |= 4096;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 13:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 |= 8192;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 14:
                        eddLimitLevel3 = (EddLimitLevel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, EddLimitLevel$$serializer.INSTANCE, eddLimitLevel3);
                        i6 |= 16384;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 15:
                        i6 |= 32768;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 16:
                        i6 |= 65536;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 17:
                        i6 |= 131072;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 18:
                        zDecodeBooleanElement26 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        i6 |= 262144;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 19:
                        zDecodeBooleanElement25 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        i6 |= 524288;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 20:
                        zDecodeBooleanElement24 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
                        i6 |= 1048576;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 21:
                        zDecodeBooleanElement23 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 21);
                        i2 = 2097152;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 22:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
                        i2 = 4194304;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 23:
                        zDecodeBooleanElement22 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
                        i2 = 8388608;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 24:
                        zDecodeBooleanElement21 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
                        i2 = 16777216;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 25:
                        zDecodeBooleanElement28 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 26:
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 26);
                        i2 = 67108864;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 27:
                        zDecodeBooleanElement20 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 27);
                        i2 = 134217728;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 28:
                        zDecodeBooleanElement19 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 28);
                        i2 = 268435456;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 29:
                        zDecodeBooleanElement18 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 29);
                        i2 = 536870912;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 30:
                        zDecodeBooleanElement17 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 30);
                        i2 = 1073741824;
                        i6 = i2 | i6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            eddLimitLevel = eddLimitLevel3;
            i = i6;
            str = strDecodeStringElement17;
            str2 = strDecodeStringElement18;
            str3 = strDecodeStringElement21;
            str4 = strDecodeStringElement23;
            str5 = strDecodeStringElement24;
            str6 = strDecodeStringElement25;
            str7 = strDecodeStringElement26;
            str8 = strDecodeStringElement27;
            str9 = strDecodeStringElement28;
            str10 = strDecodeStringElement29;
            str11 = strDecodeStringElement31;
            str12 = strDecodeStringElement32;
            z = zDecodeBooleanElement27;
            z2 = zDecodeBooleanElement19;
            z3 = zDecodeBooleanElement20;
            z4 = zDecodeBooleanElement25;
            z5 = zDecodeBooleanElement26;
            z6 = zDecodeBooleanElement28;
            z7 = zDecodeBooleanElement16;
            str13 = strDecodeStringElement22;
            str14 = strDecodeStringElement30;
            String str17 = strDecodeStringElement20;
            zDecodeBooleanElement2 = zDecodeBooleanElement17;
            str15 = str17;
            String str18 = strDecodeStringElement19;
            z8 = zDecodeBooleanElement18;
            str16 = str18;
            boolean z14 = zDecodeBooleanElement24;
            z9 = zDecodeBooleanElement21;
            z10 = z14;
            boolean z15 = zDecodeBooleanElement23;
            z11 = zDecodeBooleanElement22;
            z12 = z15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LimitInfo(i, str11, str14, str12, str10, str9, str8, str7, str6, str5, str4, str, z, str2, str13, eddLimitLevel, str3, str15, str16, z5, z4, z10, z12, zDecodeBooleanElement, z11, z9, z6, z7, z3, z2, z8, zDecodeBooleanElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LimitInfo limitInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(limitInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LimitInfo.write$Self$OKPayments_ok_payment_api(limitInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
