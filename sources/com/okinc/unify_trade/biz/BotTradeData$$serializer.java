package com.okinc.unify_trade.biz;

import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class BotTradeData$$serializer implements GeneratedSerializer<BotTradeData> {
    public static final int $stable;
    public static final BotTradeData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BotTradeData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BotTradeData$$serializer botTradeData$$serializer = new BotTradeData$$serializer();
        INSTANCE = botTradeData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.BotTradeData", botTradeData$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("botType", false);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("instType", false);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.Direction.REQUEST, true);
        pluginGeneratedSerialDescriptor.addElement("isOneClickCopy", true);
        pluginGeneratedSerialDescriptor.addElement("recommendId", true);
        pluginGeneratedSerialDescriptor.addElement("instFamily", true);
        pluginGeneratedSerialDescriptor.addElement("isDeepLink", true);
        pluginGeneratedSerialDescriptor.addElement("reqList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = BotTradeData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[3]), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, kSerializerArr[8]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BotTradeData deserialize(@NotNull Decoder decoder) {
        boolean z;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        List list;
        boolean z2;
        String str5;
        Parcelable parcelable;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = BotTradeData.$childSerializers;
        int i3 = 7;
        int i4 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            Parcelable parcelable2 = (Parcelable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            i = FrameMetricsAggregator.EVERY_DURATION;
            list = list2;
            str4 = strDecodeStringElement;
            z = zDecodeBooleanElement2;
            str2 = str7;
            str = str6;
            z2 = zDecodeBooleanElement;
            str3 = strDecodeStringElement3;
            parcelable = parcelable2;
            str5 = strDecodeStringElement2;
        } else {
            boolean zDecodeBooleanElement3 = false;
            int i5 = 0;
            boolean z3 = true;
            String str8 = null;
            String str9 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            Parcelable parcelable3 = null;
            String strDecodeStringElement6 = null;
            List list3 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        parcelable3 = parcelable3;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        i5 |= 2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 2:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 3:
                        i5 |= 8;
                        parcelable3 = (Parcelable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], parcelable3);
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 4:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str8);
                        i2 = i5 | 32;
                        i5 = i2;
                        break;
                    case 6:
                        i5 |= 64;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str9);
                        break;
                    case 7:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i2 = i5 | 128;
                        i5 = i2;
                        break;
                    case 8:
                        i5 |= 256;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], list3);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Parcelable parcelable4 = parcelable3;
            z = zDecodeBooleanElement3;
            str = str8;
            str2 = str9;
            i = i5;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            list = list3;
            z2 = zDecodeBooleanElement4;
            str5 = strDecodeStringElement4;
            parcelable = parcelable4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BotTradeData(i, str4, str5, str3, parcelable, z2, str, str2, z, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BotTradeData botTradeData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(botTradeData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BotTradeData.write$Self$OKTradeCore_trade_core(botTradeData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
