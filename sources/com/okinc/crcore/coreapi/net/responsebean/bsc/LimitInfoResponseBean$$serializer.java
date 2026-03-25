package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class LimitInfoResponseBean$$serializer implements GeneratedSerializer<LimitInfoResponseBean> {
    public static final int $stable;
    public static final LimitInfoResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LimitInfoResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LimitInfoResponseBean$$serializer limitInfoResponseBean$$serializer = new LimitInfoResponseBean$$serializer();
        INSTANCE = limitInfoResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.LimitInfoResponseBean", limitInfoResponseBean$$serializer, 30);
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
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(EddLimitLevelResponseBean$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LimitInfoResponseBean deserialize(@NotNull Decoder decoder) {
        int i;
        boolean zDecodeBooleanElement;
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
        String str13;
        EddLimitLevelResponseBean eddLimitLevelResponseBean;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String str14;
        boolean z11;
        String str15;
        boolean z12;
        boolean z13;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 5;
        int i6 = 3;
        int i7 = 4;
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
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            EddLimitLevelResponseBean eddLimitLevelResponseBean2 = (EddLimitLevelResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, EddLimitLevelResponseBean$$serializer.INSTANCE, null);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
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
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 29);
            z12 = zDecodeBooleanElement7;
            z6 = zDecodeBooleanElement8;
            z9 = zDecodeBooleanElement9;
            z2 = zDecodeBooleanElement10;
            z4 = zDecodeBooleanElement11;
            z11 = zDecodeBooleanElement12;
            z10 = zDecodeBooleanElement13;
            z3 = zDecodeBooleanElement14;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement12;
            z = zDecodeBooleanElement2;
            str14 = strDecodeStringElement14;
            z7 = zDecodeBooleanElement5;
            z5 = zDecodeBooleanElement4;
            z8 = zDecodeBooleanElement3;
            str15 = strDecodeStringElement15;
            str9 = strDecodeStringElement2;
            i = 1073741823;
            z13 = zDecodeBooleanElement6;
            str6 = strDecodeStringElement6;
            str5 = strDecodeStringElement9;
            str7 = strDecodeStringElement5;
            str11 = strDecodeStringElement7;
            str13 = strDecodeStringElement11;
            str = strDecodeStringElement8;
            str10 = strDecodeStringElement;
            str8 = strDecodeStringElement4;
            eddLimitLevelResponseBean = eddLimitLevelResponseBean2;
            str4 = strDecodeStringElement10;
            str12 = strDecodeStringElement3;
        } else {
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            boolean zDecodeBooleanElement17 = false;
            boolean zDecodeBooleanElement18 = false;
            boolean zDecodeBooleanElement19 = false;
            boolean zDecodeBooleanElement20 = false;
            boolean zDecodeBooleanElement21 = false;
            boolean zDecodeBooleanElement22 = false;
            boolean zDecodeBooleanElement23 = false;
            boolean zDecodeBooleanElement24 = false;
            boolean zDecodeBooleanElement25 = false;
            boolean zDecodeBooleanElement26 = false;
            boolean zDecodeBooleanElement27 = false;
            String strDecodeStringElement16 = null;
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
            boolean z14 = true;
            int i8 = 0;
            EddLimitLevelResponseBean eddLimitLevelResponseBean3 = null;
            boolean zDecodeBooleanElement28 = false;
            while (z14) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i2 = i7;
                        z14 = false;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 0:
                        i2 = i7;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i8 |= 1;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 1:
                        i2 = i7;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 |= 2;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 2:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 |= 4;
                        i7 = i7;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 3:
                        int i9 = i6;
                        i2 = i7;
                        i8 |= 8;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i9);
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 4:
                        i2 = i7;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i8 |= 16;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 5:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i3 = i8 | 32;
                        i8 = i3;
                        i2 = 4;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 6:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 = i8 | 64;
                        i8 = i3;
                        i2 = 4;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 7:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 = i8 | 128;
                        i8 = i3;
                        i2 = 4;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 8:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 = i8 | 256;
                        i8 = i3;
                        i2 = 4;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 9:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 = i8 | 512;
                        i8 = i3;
                        i2 = 4;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 10:
                        zDecodeBooleanElement27 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i3 = i8 | 1024;
                        i8 = i3;
                        i2 = 4;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 11:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 = i8 | 2048;
                        i8 = i3;
                        i2 = 4;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 12:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 = i8 | 4096;
                        i8 = i3;
                        i2 = 4;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 13:
                        eddLimitLevelResponseBean3 = (EddLimitLevelResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, EddLimitLevelResponseBean$$serializer.INSTANCE, eddLimitLevelResponseBean3);
                        i3 = i8 | 8192;
                        i8 = i3;
                        i2 = 4;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 14:
                        i8 |= 16384;
                        i2 = i7;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 15:
                        i8 |= 32768;
                        i2 = i7;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 16:
                        i8 |= 65536;
                        i2 = i7;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 17:
                        zDecodeBooleanElement26 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
                        i8 |= 131072;
                        i2 = i7;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 18:
                        zDecodeBooleanElement25 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        i8 |= 262144;
                        i2 = i7;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 19:
                        zDecodeBooleanElement20 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        i8 |= 524288;
                        i2 = i7;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 20:
                        zDecodeBooleanElement24 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
                        i8 |= 1048576;
                        i2 = i7;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 21:
                        zDecodeBooleanElement23 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 21);
                        i4 = 2097152;
                        i2 = i7;
                        i8 = i4 | i8;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 22:
                        zDecodeBooleanElement22 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
                        i4 = 4194304;
                        i2 = i7;
                        i8 = i4 | i8;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 23:
                        zDecodeBooleanElement28 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
                        i4 = 8388608;
                        i2 = i7;
                        i8 = i4 | i8;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 24:
                        zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
                        i4 = 16777216;
                        i2 = i7;
                        i8 = i4 | i8;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 25:
                        zDecodeBooleanElement21 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
                        i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i2 = i7;
                        i8 = i4 | i8;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 26:
                        zDecodeBooleanElement19 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 26);
                        i4 = 67108864;
                        i2 = i7;
                        i8 = i4 | i8;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 27:
                        zDecodeBooleanElement18 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 27);
                        i4 = 134217728;
                        i2 = i7;
                        i8 = i4 | i8;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 28:
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 28);
                        i4 = 268435456;
                        i2 = i7;
                        i8 = i4 | i8;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 29:
                        zDecodeBooleanElement17 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 29);
                        i4 = 536870912;
                        i2 = i7;
                        i8 = i4 | i8;
                        i7 = i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i8;
            zDecodeBooleanElement = zDecodeBooleanElement17;
            str = strDecodeStringElement16;
            str2 = strDecodeStringElement20;
            str3 = strDecodeStringElement21;
            str4 = strDecodeStringElement22;
            str5 = strDecodeStringElement23;
            str6 = strDecodeStringElement24;
            str7 = strDecodeStringElement25;
            str8 = strDecodeStringElement26;
            str9 = strDecodeStringElement27;
            str10 = strDecodeStringElement28;
            str11 = strDecodeStringElement29;
            str12 = strDecodeStringElement30;
            z = zDecodeBooleanElement27;
            z2 = zDecodeBooleanElement15;
            z3 = zDecodeBooleanElement16;
            str13 = strDecodeStringElement17;
            eddLimitLevelResponseBean = eddLimitLevelResponseBean3;
            z4 = zDecodeBooleanElement21;
            z5 = zDecodeBooleanElement25;
            z6 = zDecodeBooleanElement22;
            z7 = zDecodeBooleanElement20;
            z8 = zDecodeBooleanElement26;
            z9 = zDecodeBooleanElement28;
            String str16 = strDecodeStringElement19;
            z10 = zDecodeBooleanElement18;
            str14 = str16;
            String str17 = strDecodeStringElement18;
            z11 = zDecodeBooleanElement19;
            str15 = str17;
            boolean z15 = zDecodeBooleanElement24;
            z12 = zDecodeBooleanElement23;
            z13 = z15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LimitInfoResponseBean(i, str10, str9, str12, str8, str7, str6, str11, str, str5, str4, z, str13, str3, eddLimitLevelResponseBean, str2, str14, str15, z8, z5, z7, z13, z12, z6, z9, z2, z4, z11, z10, z3, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LimitInfoResponseBean limitInfoResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(limitInfoResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LimitInfoResponseBean.write$Self$OKCRCore_cr_core(limitInfoResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
