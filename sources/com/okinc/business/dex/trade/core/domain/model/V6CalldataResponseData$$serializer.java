package com.okinc.business.dex.trade.core.domain.model;

import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData$$serializer;
import com.okinc.business.dexlogic.bean.JitoData;
import com.okinc.business.dexlogic.bean.JitoData$$serializer;
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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class V6CalldataResponseData$$serializer implements GeneratedSerializer<V6CalldataResponseData> {
    public static final int $stable;
    public static final V6CalldataResponseData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private V6CalldataResponseData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        V6CalldataResponseData$$serializer v6CalldataResponseData$$serializer = new V6CalldataResponseData$$serializer();
        INSTANCE = v6CalldataResponseData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData", v6CalldataResponseData$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("callData", true);
        pluginGeneratedSerialDescriptor.addElement("mevConfig", true);
        pluginGeneratedSerialDescriptor.addElement("unsignedTx", true);
        pluginGeneratedSerialDescriptor.addElement("hasReferralCommission", true);
        pluginGeneratedSerialDescriptor.addElement("jitoData", true);
        pluginGeneratedSerialDescriptor.addElement("approveTxInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(V6CallData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(MevConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(JitoData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ApproveUnsignedData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final V6CalldataResponseData deserialize(@NotNull Decoder decoder) {
        MevConfig mevConfig;
        Boolean bool;
        ApproveUnsignedData approveUnsignedData;
        JitoData jitoData;
        String str;
        int i;
        V6CallData v6CallData;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        String str3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            V6CallData v6CallData2 = (V6CallData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, V6CallData$$serializer.INSTANCE, null);
            MevConfig mevConfig2 = (MevConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, MevConfig$$serializer.INSTANCE, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, null);
            JitoData jitoData2 = (JitoData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, JitoData$$serializer.INSTANCE, null);
            str2 = str5;
            approveUnsignedData = (ApproveUnsignedData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ApproveUnsignedData$$serializer.INSTANCE, null);
            jitoData = jitoData2;
            bool = bool2;
            i = 127;
            mevConfig = mevConfig2;
            str = str4;
            v6CallData = v6CallData2;
        } else {
            int i3 = 0;
            boolean z = true;
            V6CallData v6CallData3 = null;
            Boolean bool3 = null;
            ApproveUnsignedData approveUnsignedData2 = null;
            JitoData jitoData3 = null;
            mevConfig = null;
            String str6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str6);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        v6CallData3 = (V6CallData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, V6CallData$$serializer.INSTANCE, v6CallData3);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        i3 |= 4;
                        mevConfig = (MevConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, MevConfig$$serializer.INSTANCE, mevConfig);
                        i2 = 6;
                        break;
                    case 3:
                        i3 |= 8;
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str3);
                        i2 = 6;
                        break;
                    case 4:
                        i3 |= 16;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool3);
                        i2 = 6;
                        break;
                    case 5:
                        i3 |= 32;
                        jitoData3 = (JitoData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, JitoData$$serializer.INSTANCE, jitoData3);
                        i2 = 6;
                        break;
                    case 6:
                        i3 |= 64;
                        approveUnsignedData2 = (ApproveUnsignedData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, ApproveUnsignedData$$serializer.INSTANCE, approveUnsignedData2);
                        i2 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool = bool3;
            approveUnsignedData = approveUnsignedData2;
            jitoData = jitoData3;
            str = str6;
            i = i3;
            v6CallData = v6CallData3;
            str2 = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new V6CalldataResponseData(i, str, v6CallData, mevConfig, str2, bool, jitoData, approveUnsignedData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull V6CalldataResponseData v6CalldataResponseData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(v6CalldataResponseData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        V6CalldataResponseData.write$Self$OKDex_dex_impl(v6CalldataResponseData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
