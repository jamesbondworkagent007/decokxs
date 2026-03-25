package com.okinc.crcore.coreapi.net.responsebean;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class WaitOnlineRankResponseBean$$serializer implements GeneratedSerializer<WaitOnlineRankResponseBean> {
    public static final int $stable;
    public static final WaitOnlineRankResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WaitOnlineRankResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WaitOnlineRankResponseBean$$serializer waitOnlineRankResponseBean$$serializer = new WaitOnlineRankResponseBean$$serializer();
        INSTANCE = waitOnlineRankResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.WaitOnlineRankResponseBean", waitOnlineRankResponseBean$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("displayId", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("onlineTs", true);
        pluginGeneratedSerialDescriptor.addElement("waitOnlineTime", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("openMethod", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WaitOnlineRankResponseBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            str2 = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str = strDecodeStringElement7;
            str3 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
            str6 = strDecodeStringElement4;
            str4 = strDecodeStringElement3;
            i = 127;
        } else {
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = i3 | 2;
                        break;
                    case 2:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = i3 | 4;
                        break;
                    case 3:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                        break;
                    case 4:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                        break;
                    case 5:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = i3 | 32;
                        break;
                    case 6:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = i3 | 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i3 = i2;
            }
            strDecodeStringElement = strDecodeStringElement9;
            i = i3;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement8;
            String str7 = strDecodeStringElement13;
            str3 = strDecodeStringElement11;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement12;
            str6 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WaitOnlineRankResponseBean(i, str2, str4, str6, str3, str5, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WaitOnlineRankResponseBean waitOnlineRankResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(waitOnlineRankResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WaitOnlineRankResponseBean.write$Self$OKCRCore_cr_core(waitOnlineRankResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
