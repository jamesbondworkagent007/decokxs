package com.okinc.network.okg.log;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.network.okg.dns.DohTypeEnum;
import java.util.HashMap;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class NetEventData$$serializer implements GeneratedSerializer<NetEventData> {
    public static final int $stable;
    public static final NetEventData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NetEventData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NetEventData$$serializer netEventData$$serializer = new NetEventData$$serializer();
        INSTANCE = netEventData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.network.okg.log.NetEventData", netEventData$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("connect_type", false);
        pluginGeneratedSerialDescriptor.addElement("url_path", false);
        pluginGeneratedSerialDescriptor.addElement("dest_domain", true);
        pluginGeneratedSerialDescriptor.addElement("dest_ip", true);
        pluginGeneratedSerialDescriptor.addElement("error_code", true);
        pluginGeneratedSerialDescriptor.addElement("duration", true);
        pluginGeneratedSerialDescriptor.addElement("connect_duration", true);
        pluginGeneratedSerialDescriptor.addElement(CrashHianalyticsData.TIME, true);
        pluginGeneratedSerialDescriptor.addElement("operator_type", true);
        pluginGeneratedSerialDescriptor.addElement(MTCoreConstants.Protocol.KEY_PROTOCOL, true);
        pluginGeneratedSerialDescriptor.addElement("useDoh", true);
        pluginGeneratedSerialDescriptor.addElement("appStatus", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.EVENT_ATTRIBUTES, true);
        pluginGeneratedSerialDescriptor.addElement("startTime", true);
        pluginGeneratedSerialDescriptor.addElement("_startConnectTime", true);
        pluginGeneratedSerialDescriptor.addElement("_nano2Ms", true);
        pluginGeneratedSerialDescriptor.addElement("_dohType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = NetEventData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, longSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[12]), longSerializer, longSerializer, longSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[16])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NetEventData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long jDecodeLongElement;
        DohTypeEnum dohTypeEnum;
        HashMap map;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = NetEventData.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            HashMap map2 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
            long jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 14);
            z = zDecodeBooleanElement;
            str2 = strDecodeStringElement7;
            str7 = strDecodeStringElement;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
            str5 = strDecodeStringElement2;
            dohTypeEnum = (DohTypeEnum) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], null);
            str6 = strDecodeStringElement3;
            str4 = strDecodeStringElement6;
            str8 = strDecodeStringElement4;
            i = 131071;
            map = map2;
            str3 = strDecodeStringElement8;
            str = strDecodeStringElement5;
            j3 = jDecodeLongElement2;
            j5 = jDecodeLongElement5;
            j2 = jDecodeLongElement6;
            j4 = jDecodeLongElement4;
            j = jDecodeLongElement3;
        } else {
            int i2 = 16;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            boolean z2 = true;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            long jDecodeLongElement9 = 0;
            long jDecodeLongElement10 = 0;
            long jDecodeLongElement11 = 0;
            long jDecodeLongElement12 = 0;
            DohTypeEnum dohTypeEnum2 = null;
            HashMap map3 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            int i3 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 16;
                        break;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 16;
                        break;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = 16;
                        break;
                    case 2:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 16;
                        break;
                    case 3:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 16;
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 16;
                        break;
                    case 5:
                        jDecodeLongElement9 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 16;
                        break;
                    case 6:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 16;
                        break;
                    case 7:
                        jDecodeLongElement10 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 16;
                        break;
                    case 8:
                        i3 |= 256;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = 16;
                        break;
                    case 9:
                        i3 |= 512;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 = 16;
                        break;
                    case 10:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 16;
                        break;
                    case 11:
                        i3 |= 2048;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i2 = 16;
                        break;
                    case 12:
                        i3 |= 4096;
                        map3 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], map3);
                        i2 = 16;
                        break;
                    case 13:
                        jDecodeLongElement11 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
                        i3 |= 8192;
                        i2 = 16;
                        break;
                    case 14:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 14);
                        i3 |= 16384;
                        i2 = 16;
                        break;
                    case 15:
                        jDecodeLongElement12 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
                        i3 |= 32768;
                        i2 = 16;
                        break;
                    case 16:
                        dohTypeEnum2 = (DohTypeEnum) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kSerializerArr[i2], dohTypeEnum2);
                        i3 |= 65536;
                        i2 = 16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement15;
            str2 = strDecodeStringElement16;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement14;
            z = zDecodeBooleanElement2;
            j = jDecodeLongElement7;
            j2 = jDecodeLongElement8;
            j3 = jDecodeLongElement9;
            j4 = jDecodeLongElement10;
            j5 = jDecodeLongElement11;
            jDecodeLongElement = jDecodeLongElement12;
            dohTypeEnum = dohTypeEnum2;
            map = map3;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NetEventData(i, str7, str5, str6, str8, str, j3, j, j4, str4, str2, z, str3, map, j5, j2, jDecodeLongElement, dohTypeEnum, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NetEventData netEventData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(netEventData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NetEventData.write$Self$OKNetwork_network(netEventData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
