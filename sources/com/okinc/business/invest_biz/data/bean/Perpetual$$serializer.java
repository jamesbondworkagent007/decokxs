package com.okinc.business.invest_biz.data.bean;

import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Perpetual$$serializer implements GeneratedSerializer<Perpetual> {
    public static final int $stable;
    public static final Perpetual$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Perpetual$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Perpetual$$serializer perpetual$$serializer = new Perpetual$$serializer();
        INSTANCE = perpetual$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.Perpetual", perpetual$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, true);
        pluginGeneratedSerialDescriptor.addElement("leverage", true);
        pluginGeneratedSerialDescriptor.addElement("pnl", true);
        pluginGeneratedSerialDescriptor.addElement("tradePair", true);
        pluginGeneratedSerialDescriptor.addElement("margin", true);
        pluginGeneratedSerialDescriptor.addElement("position", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = Perpetual.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(kSerializerArr[5])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Perpetual deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        String str;
        List list2;
        String str2;
        String str3;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Perpetual.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            i2 = iDecodeIntElement;
            str3 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            i = 63;
            str = strDecodeStringElement;
            list2 = list3;
        } else {
            String strDecodeStringElement4 = null;
            List list4 = null;
            List list5 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement2 = 0;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i3 |= 16;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list5);
                        break;
                    case 5:
                        i3 |= 32;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], list4);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            list = list4;
            str = strDecodeStringElement6;
            list2 = list5;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Perpetual(i, i2, str, str2, str3, list2, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Perpetual perpetual) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(perpetual, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Perpetual.write$Self$OKDeFi_invest_biz(perpetual, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
