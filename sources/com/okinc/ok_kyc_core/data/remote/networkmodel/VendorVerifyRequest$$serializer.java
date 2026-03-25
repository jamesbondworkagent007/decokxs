package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class VendorVerifyRequest$$serializer implements GeneratedSerializer<VendorVerifyRequest> {
    public static final int $stable;
    public static final VendorVerifyRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private VendorVerifyRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        VendorVerifyRequest$$serializer vendorVerifyRequest$$serializer = new VendorVerifyRequest$$serializer();
        INSTANCE = vendorVerifyRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest", vendorVerifyRequest$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("bizId", true);
        pluginGeneratedSerialDescriptor.addElement("imageFiles", true);
        pluginGeneratedSerialDescriptor.addElement("vendorType", true);
        pluginGeneratedSerialDescriptor.addElement("verifyType", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SESSIONID, true);
        pluginGeneratedSerialDescriptor.addElement("resultId", false);
        pluginGeneratedSerialDescriptor.addElement("resultTarget", false);
        pluginGeneratedSerialDescriptor.addElement("ctaValue", false);
        pluginGeneratedSerialDescriptor.addElement("playbook", false);
        pluginGeneratedSerialDescriptor.addElement("featureUri", false);
        pluginGeneratedSerialDescriptor.addElement(MetricsSQLiteCacheKt.METRICS_PARAMS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = VendorVerifyRequest.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{LongSerializer.INSTANCE, kSerializerArr[1], BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, kSerializerArr[7], stringSerializer, stringSerializer, kSerializerArr[10]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final VendorVerifyRequest deserialize(@NotNull Decoder decoder) {
        int i;
        ArrayList arrayList;
        HashMap map;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        Map map2;
        long j;
        Integer num2;
        Integer num3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = VendorVerifyRequest.$childSerializers;
        int i2 = 9;
        int i3 = 6;
        int i4 = 5;
        HashMap map3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            Map map4 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            map = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            str = strDecodeStringElement4;
            num = num5;
            str4 = strDecodeStringElement3;
            str3 = str6;
            num2 = num4;
            i = 2047;
            map2 = map4;
            j = jDecodeLongElement;
            arrayList = arrayList2;
            str5 = strDecodeStringElement2;
            str2 = strDecodeStringElement;
        } else {
            int i5 = 0;
            boolean z = true;
            Integer num6 = null;
            Map map5 = null;
            String str7 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            Integer num7 = null;
            ArrayList arrayList3 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num3 = num7;
                        z = false;
                        num7 = num3;
                        i2 = 9;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 0:
                        num3 = num7;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i5 |= 1;
                        num7 = num3;
                        i2 = 9;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        num3 = num7;
                        arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], arrayList3);
                        i5 |= 2;
                        num7 = num3;
                        i2 = 9;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 2:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num7);
                        i5 |= 4;
                        num3 = num7;
                        num7 = num3;
                        i2 = 9;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 3:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num6);
                        i5 |= 8;
                        num3 = num7;
                        num7 = num3;
                        i2 = 9;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 4:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str7);
                        i5 |= 16;
                        num3 = num7;
                        num7 = num3;
                        i2 = 9;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 5:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 32;
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 7:
                        i5 |= 128;
                        map5 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], map5);
                        break;
                    case 8:
                        i5 |= 256;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        break;
                    case 9:
                        i5 |= 512;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    case 10:
                        i5 |= 1024;
                        map3 = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], map3);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            arrayList = arrayList3;
            map = map3;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement6;
            str3 = str7;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement5;
            num = num6;
            map2 = map5;
            j = jDecodeLongElement2;
            num2 = num7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new VendorVerifyRequest(i, j, arrayList, num2, num, str3, str2, str5, map2, str4, str, map, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull VendorVerifyRequest vendorVerifyRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(vendorVerifyRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        VendorVerifyRequest.write$Self$OKCompliance_ok_compliance_impl(vendorVerifyRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
