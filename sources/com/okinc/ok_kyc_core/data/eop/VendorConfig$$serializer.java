package com.okinc.ok_kyc_core.data.eop;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class VendorConfig$$serializer implements GeneratedSerializer<VendorConfig> {
    public static final int $stable;
    public static final VendorConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private VendorConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        VendorConfig$$serializer vendorConfig$$serializer = new VendorConfig$$serializer();
        INSTANCE = vendorConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.eop.VendorConfig", vendorConfig$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("scanTitle", true);
        pluginGeneratedSerialDescriptor.addElement("document", true);
        pluginGeneratedSerialDescriptor.addElement("msg", true);
        pluginGeneratedSerialDescriptor.addElement("highlightWords", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("countryOfResidence", true);
        pluginGeneratedSerialDescriptor.addElement("vendorType", true);
        pluginGeneratedSerialDescriptor.addElement("certificateType", true);
        pluginGeneratedSerialDescriptor.addElement("captureMode", true);
        pluginGeneratedSerialDescriptor.addElement("photoNumbers", true);
        pluginGeneratedSerialDescriptor.addElement("certificateTypeOnboarding", true);
        pluginGeneratedSerialDescriptor.addElement("source", true);
        pluginGeneratedSerialDescriptor.addElement("sourceCode", true);
        pluginGeneratedSerialDescriptor.addElement("dataCenter", true);
        pluginGeneratedSerialDescriptor.addElement("token", true);
        pluginGeneratedSerialDescriptor.addElement("nfcToken", true);
        pluginGeneratedSerialDescriptor.addElement("nfcServerUrl", true);
        pluginGeneratedSerialDescriptor.addElement("nfcType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final VendorConfig deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        String str5;
        String str6;
        int iDecodeIntElement;
        int i3;
        int i4;
        int i5;
        String str7;
        String str8;
        String strDecodeStringElement2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i6 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 19);
            str11 = strDecodeStringElement12;
            str6 = strDecodeStringElement8;
            str12 = strDecodeStringElement16;
            str9 = strDecodeStringElement15;
            strDecodeStringElement = strDecodeStringElement14;
            str10 = strDecodeStringElement13;
            i2 = iDecodeIntElement2;
            i4 = iDecodeIntElement4;
            i5 = iDecodeIntElement3;
            str7 = strDecodeStringElement10;
            str8 = strDecodeStringElement9;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
            str13 = strDecodeStringElement11;
            i = 1048575;
            i3 = iDecodeIntElement5;
            str = strDecodeStringElement3;
        } else {
            int i7 = 0;
            int i8 = 19;
            String strDecodeStringElement17 = null;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            boolean z = true;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            strDecodeStringElement = null;
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
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 0:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 1:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 2:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 3:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 8;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 4:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 5:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 6:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 |= 64;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 7:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 8:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i7 |= 256;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 9:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i7 |= 512;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 10:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i7 |= 1024;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 11:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i7 |= 2048;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 12:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 13:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i7 |= 8192;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 14:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 |= 16384;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 15:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i7 |= 32768;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 16:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i7 |= 65536;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 17:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i7 |= 131072;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 18:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i7 |= 262144;
                        i6 = 3;
                        i8 = 19;
                        break;
                    case 19:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i8);
                        i7 |= 524288;
                        i6 = 3;
                        i8 = 19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            str = strDecodeStringElement20;
            str2 = strDecodeStringElement22;
            str3 = strDecodeStringElement23;
            i2 = iDecodeIntElement6;
            str4 = strDecodeStringElement24;
            str5 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            iDecodeIntElement = iDecodeIntElement7;
            i3 = iDecodeIntElement8;
            i4 = iDecodeIntElement9;
            i5 = iDecodeIntElement10;
            str7 = strDecodeStringElement28;
            str8 = strDecodeStringElement29;
            strDecodeStringElement2 = strDecodeStringElement18;
            str9 = strDecodeStringElement19;
            str10 = strDecodeStringElement21;
            str11 = strDecodeStringElement30;
            str12 = strDecodeStringElement17;
            str13 = strDecodeStringElement27;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new VendorConfig(i, str, str5, str4, str2, str3, str6, str8, str7, i2, i5, i4, i3, str13, str11, str10, strDecodeStringElement, str9, str12, strDecodeStringElement2, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull VendorConfig vendorConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(vendorConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        VendorConfig.write$Self$OKCompliance_ok_compliance_impl(vendorConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
