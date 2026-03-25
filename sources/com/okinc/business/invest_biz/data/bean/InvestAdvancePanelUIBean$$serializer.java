package com.okinc.business.invest_biz.data.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class InvestAdvancePanelUIBean$$serializer implements GeneratedSerializer<InvestAdvancePanelUIBean> {
    public static final int $stable;
    public static final InvestAdvancePanelUIBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestAdvancePanelUIBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestAdvancePanelUIBean$$serializer investAdvancePanelUIBean$$serializer = new InvestAdvancePanelUIBean$$serializer();
        INSTANCE = investAdvancePanelUIBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestAdvancePanelUIBean", investAdvancePanelUIBean$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("subscriptionReceiveInfo", false);
        pluginGeneratedSerialDescriptor.addElement("slippageState", true);
        pluginGeneratedSerialDescriptor.addElement("slippageTips", true);
        pluginGeneratedSerialDescriptor.addElement("slippageWarn", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, BuiltinSerializersKt.getNullable(InvestSubscriptionReceiveInfo$$serializer.INSTANCE), intSerializer, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestAdvancePanelUIBean deserialize(@NotNull Decoder decoder) {
        int i;
        String strDecodeStringElement;
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo;
        boolean zDecodeBooleanElement;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = (InvestSubscriptionReceiveInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestSubscriptionReceiveInfo$$serializer.INSTANCE, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            i = iDecodeIntElement;
            investSubscriptionReceiveInfo = investSubscriptionReceiveInfo2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            i2 = iDecodeIntElement2;
            i3 = 31;
        } else {
            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo3 = null;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement4 = 0;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i4 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    investSubscriptionReceiveInfo3 = (InvestSubscriptionReceiveInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestSubscriptionReceiveInfo$$serializer.INSTANCE, investSubscriptionReceiveInfo3);
                    i4 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i4 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i4 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i4 |= 16;
                }
            }
            i = iDecodeIntElement3;
            strDecodeStringElement = strDecodeStringElement2;
            investSubscriptionReceiveInfo = investSubscriptionReceiveInfo3;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i2 = iDecodeIntElement4;
            i3 = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestAdvancePanelUIBean(i3, i, investSubscriptionReceiveInfo, i2, strDecodeStringElement, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestAdvancePanelUIBean investAdvancePanelUIBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investAdvancePanelUIBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestAdvancePanelUIBean.write$Self$OKDeFi_invest_biz(investAdvancePanelUIBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
