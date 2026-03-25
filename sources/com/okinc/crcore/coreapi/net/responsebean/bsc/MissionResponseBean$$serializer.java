package com.okinc.crcore.coreapi.net.responsebean.bsc;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class MissionResponseBean$$serializer implements GeneratedSerializer<MissionResponseBean> {
    public static final int $stable;
    public static final MissionResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MissionResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MissionResponseBean$$serializer missionResponseBean$$serializer = new MissionResponseBean$$serializer();
        INSTANCE = missionResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.MissionResponseBean", missionResponseBean$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("campaignCode", true);
        pluginGeneratedSerialDescriptor.addElement("endTime", true);
        pluginGeneratedSerialDescriptor.addElement("inactiveCode", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_METADATA, true);
        pluginGeneratedSerialDescriptor.addElement("missionCode", true);
        pluginGeneratedSerialDescriptor.addElement("nextAction", true);
        pluginGeneratedSerialDescriptor.addElement("recordKey", true);
        pluginGeneratedSerialDescriptor.addElement("relatedRewards", true);
        pluginGeneratedSerialDescriptor.addElement("startTime", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = MissionResponseBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, longSerializer, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(MissionMetadataResponseBean$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, kSerializerArr[7], longSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MissionResponseBean deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        List list;
        String str;
        MissionMetadataResponseBean missionMetadataResponseBean;
        String str2;
        String str3;
        long j;
        String str4;
        String strDecodeStringElement;
        long j2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = MissionResponseBean.$childSerializers;
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            MissionMetadataResponseBean missionMetadataResponseBean2 = (MissionMetadataResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MissionMetadataResponseBean$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            list = list2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str4 = strDecodeStringElement5;
            str2 = strDecodeStringElement4;
            missionMetadataResponseBean = missionMetadataResponseBean2;
            str3 = strDecodeStringElement3;
            i2 = iDecodeIntElement;
            j2 = jDecodeLongElement2;
            j = jDecodeLongElement;
            str = strDecodeStringElement2;
            i = 1023;
        } else {
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int i4 = 0;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            MissionMetadataResponseBean missionMetadataResponseBean3 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            int iDecodeIntElement2 = 0;
            List list3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 9;
                        break;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 9;
                        break;
                    case 1:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 9;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        missionMetadataResponseBean3 = (MissionMetadataResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MissionMetadataResponseBean$$serializer.INSTANCE, missionMetadataResponseBean3);
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        i4 |= 128;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list3);
                        break;
                    case 8:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i4 |= 256;
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            String str5 = strDecodeStringElement10;
            i2 = iDecodeIntElement2;
            String str6 = strDecodeStringElement8;
            list = list3;
            str = str6;
            String str7 = strDecodeStringElement6;
            missionMetadataResponseBean = missionMetadataResponseBean3;
            long j3 = jDecodeLongElement3;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement7;
            j = jDecodeLongElement4;
            str4 = str5;
            strDecodeStringElement = str7;
            j2 = j3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MissionResponseBean(i, str, j, i2, missionMetadataResponseBean, str3, str2, str4, list, j2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MissionResponseBean missionResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(missionResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MissionResponseBean.write$Self$OKCRCore_cr_core(missionResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
