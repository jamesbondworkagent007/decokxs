package com.okinc.business.rewards.wholesale;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class VipLandingPageBean$$serializer implements GeneratedSerializer<VipLandingPageBean> {
    public static final int $stable;
    public static final VipLandingPageBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private VipLandingPageBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        VipLandingPageBean$$serializer vipLandingPageBean$$serializer = new VipLandingPageBean$$serializer();
        INSTANCE = vipLandingPageBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.rewards.wholesale.VipLandingPageBean", vipLandingPageBean$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("vipLevel", true);
        pluginGeneratedSerialDescriptor.addElement("vipLevelName", true);
        pluginGeneratedSerialDescriptor.addElement("userUid", true);
        pluginGeneratedSerialDescriptor.addElement("bizId", true);
        pluginGeneratedSerialDescriptor.addElement("discountPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        pluginGeneratedSerialDescriptor.addElement("shareInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, VipLandingPageButton$$serializer.INSTANCE, VipLandingPageShareInfo$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final VipLandingPageBean deserialize(@NotNull Decoder decoder) {
        VipLandingPageButton vipLandingPageButton;
        VipLandingPageShareInfo vipLandingPageShareInfo;
        String str;
        Integer num;
        String str2;
        int i;
        String str3;
        String str4;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        int i3 = 5;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            VipLandingPageButton vipLandingPageButton2 = (VipLandingPageButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, VipLandingPageButton$$serializer.INSTANCE, null);
            num = num2;
            vipLandingPageShareInfo = (VipLandingPageShareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, VipLandingPageShareInfo$$serializer.INSTANCE, null);
            vipLandingPageButton = vipLandingPageButton2;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str4 = strDecodeStringElement3;
            str = strDecodeStringElement2;
            i = 127;
        } else {
            int i4 = 0;
            boolean z2 = true;
            VipLandingPageButton vipLandingPageButton3 = null;
            VipLandingPageShareInfo vipLandingPageShareInfo2 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            Integer num3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 0:
                        z = false;
                        i4 |= 1;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 1:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        i4 |= 4;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i4 |= 32;
                        vipLandingPageButton3 = (VipLandingPageButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, VipLandingPageButton$$serializer.INSTANCE, vipLandingPageButton3);
                        break;
                    case 6:
                        i4 |= 64;
                        vipLandingPageShareInfo2 = (VipLandingPageShareInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, VipLandingPageShareInfo$$serializer.INSTANCE, vipLandingPageShareInfo2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num4 = num3;
            vipLandingPageButton = vipLandingPageButton3;
            vipLandingPageShareInfo = vipLandingPageShareInfo2;
            str = strDecodeStringElement8;
            num = num4;
            str2 = strDecodeStringElement;
            i = i4;
            String str5 = strDecodeStringElement7;
            str3 = strDecodeStringElement6;
            str4 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new VipLandingPageBean(i, num, str, str4, str3, str2, vipLandingPageButton, vipLandingPageShareInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull VipLandingPageBean vipLandingPageBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(vipLandingPageBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        VipLandingPageBean.write$Self$OKGrowthTools_rewards_api(vipLandingPageBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
