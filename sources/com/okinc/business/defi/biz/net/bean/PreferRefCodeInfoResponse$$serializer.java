package com.okinc.business.defi.biz.net.bean;

import java.util.List;
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
import o.C13921dbh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class PreferRefCodeInfoResponse$$serializer implements GeneratedSerializer<PreferRefCodeInfoResponse> {
    public static final int $stable;
    public static final PreferRefCodeInfoResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PreferRefCodeInfoResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PreferRefCodeInfoResponse$$serializer preferRefCodeInfoResponse$$serializer = new PreferRefCodeInfoResponse$$serializer();
        INSTANCE = preferRefCodeInfoResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.PreferRefCodeInfoResponse", preferRefCodeInfoResponse$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("discountRate", true);
        pluginGeneratedSerialDescriptor.addElement("inviterAddr", true);
        pluginGeneratedSerialDescriptor.addElement("inviterStatus", true);
        pluginGeneratedSerialDescriptor.addElement("codeStatus", true);
        pluginGeneratedSerialDescriptor.addElement("allowed", true);
        pluginGeneratedSerialDescriptor.addElement("discountRateThreshold", true);
        pluginGeneratedSerialDescriptor.addElement("inviterAddresses", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PreferRefCodeInfoResponse.$childSerializers;
        C13921dbh c13921dbh = C13921dbh.copydefault;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{c13921dbh, StringSerializer.INSTANCE, intSerializer, intSerializer, BooleanSerializer.INSTANCE, c13921dbh, kSerializerArr[6]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PreferRefCodeInfoResponse deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        int i2;
        List list;
        boolean z;
        int i3;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PreferRefCodeInfoResponse.$childSerializers;
        int i4 = 5;
        int i5 = 3;
        int i6 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            C13921dbh c13921dbh = C13921dbh.copydefault;
            String str4 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, c13921dbh, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            String str5 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, c13921dbh, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            str3 = str5;
            i = 127;
            str = str4;
            str2 = strDecodeStringElement;
            i2 = iDecodeIntElement2;
            i3 = iDecodeIntElement;
            z = zDecodeBooleanElement;
        } else {
            String strDecodeStringElement2 = null;
            String str6 = null;
            String str7 = null;
            int i7 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement3 = 0;
            boolean z2 = true;
            int iDecodeIntElement4 = 0;
            List list2 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 5;
                        i5 = 3;
                        i6 = 4;
                        break;
                    case 0:
                        i7 |= 1;
                        str7 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, C13921dbh.copydefault, str7);
                        i4 = 5;
                        i5 = 3;
                        i6 = 4;
                        break;
                    case 1:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i7 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i5);
                        i7 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i7 |= 16;
                        break;
                    case 5:
                        i7 |= 32;
                        str6 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, C13921dbh.copydefault, str6);
                        break;
                    case 6:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], list2);
                        i7 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            str = str7;
            i2 = iDecodeIntElement4;
            list = list2;
            z = zDecodeBooleanElement2;
            i3 = iDecodeIntElement3;
            str2 = strDecodeStringElement2;
            str3 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PreferRefCodeInfoResponse(i, str, str2, i3, i2, z, str3, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PreferRefCodeInfoResponse preferRefCodeInfoResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(preferRefCodeInfoResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PreferRefCodeInfoResponse.write$Self$OKWallet_wallet_impl(preferRefCodeInfoResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
