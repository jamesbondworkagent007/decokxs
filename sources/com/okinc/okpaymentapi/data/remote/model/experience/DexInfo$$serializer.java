package com.okinc.okpaymentapi.data.remote.model.experience;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class DexInfo$$serializer implements GeneratedSerializer<DexInfo> {
    public static final int $stable;
    public static final DexInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexInfo$$serializer dexInfo$$serializer = new DexInfo$$serializer();
        INSTANCE = dexInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.experience.DexInfo", dexInfo$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("uniqueId", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("liquidity", true);
        pluginGeneratedSerialDescriptor.addElement("marketCap", true);
        pluginGeneratedSerialDescriptor.addElement("riskLevel", true);
        pluginGeneratedSerialDescriptor.addElement("balanceTag", true);
        pluginGeneratedSerialDescriptor.addElement("decimal", true);
        pluginGeneratedSerialDescriptor.addElement("balance", true);
        pluginGeneratedSerialDescriptor.addElement("balanceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("communityRecognized", true);
        pluginGeneratedSerialDescriptor.addElement("cexListing", true);
        pluginGeneratedSerialDescriptor.addElement("cefiId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexInfo deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        int i3;
        String str6;
        String str7;
        String strDecodeStringElement2;
        String str8;
        String str9;
        boolean z;
        boolean zDecodeBooleanElement;
        String str10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 2;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            str10 = strDecodeStringElement12;
            z = zDecodeBooleanElement2;
            i = 65535;
            str5 = strDecodeStringElement11;
            str9 = strDecodeStringElement10;
            str = strDecodeStringElement3;
            i2 = iDecodeIntElement2;
            str6 = strDecodeStringElement9;
            str4 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            i3 = iDecodeIntElement;
            str2 = strDecodeStringElement5;
            str7 = strDecodeStringElement8;
            str8 = strDecodeStringElement7;
        } else {
            int i5 = 0;
            int i6 = 15;
            String strDecodeStringElement13 = null;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean z2 = true;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 0:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 1:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 2:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 4;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 3:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 4:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 5:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 6:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 7:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 8:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 9:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i5 |= 512;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 10:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i5 |= 1024;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 11:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 |= 2048;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 12:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i5 |= 4096;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 13:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i5 |= 8192;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 14:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        i5 |= 16384;
                        i4 = 2;
                        i6 = 15;
                        break;
                    case 15:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i5 |= 32768;
                        i4 = 2;
                        i6 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = strDecodeStringElement13;
            str2 = strDecodeStringElement14;
            str3 = strDecodeStringElement15;
            str4 = strDecodeStringElement16;
            str5 = strDecodeStringElement18;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement4;
            str6 = strDecodeStringElement19;
            str7 = strDecodeStringElement20;
            strDecodeStringElement2 = strDecodeStringElement21;
            str8 = strDecodeStringElement22;
            str9 = strDecodeStringElement23;
            z = zDecodeBooleanElement4;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            str10 = strDecodeStringElement17;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexInfo(i, str, str3, str2, str4, str8, strDecodeStringElement2, str7, str6, str9, i3, i2, str5, str10, z, zDecodeBooleanElement, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexInfo dexInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexInfo.write$Self$OKPayments_ok_payment_api(dexInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
