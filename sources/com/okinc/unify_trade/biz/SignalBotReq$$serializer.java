package com.okinc.unify_trade.biz;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
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
public final /* synthetic */ class SignalBotReq$$serializer implements GeneratedSerializer<SignalBotReq> {
    public static final int $stable;
    public static final SignalBotReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignalBotReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignalBotReq$$serializer signalBotReq$$serializer = new SignalBotReq$$serializer();
        INSTANCE = signalBotReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SignalBotReq", signalBotReq$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("signalChanId", true);
        pluginGeneratedSerialDescriptor.addElement("ordType", true);
        pluginGeneratedSerialDescriptor.addElement("instIds", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, true);
        pluginGeneratedSerialDescriptor.addElement("totalAmt", true);
        pluginGeneratedSerialDescriptor.addElement("subOrdType", true);
        pluginGeneratedSerialDescriptor.addElement("ratio", true);
        pluginGeneratedSerialDescriptor.addElement("signalOrderAmtParam", true);
        pluginGeneratedSerialDescriptor.addElement("signalBotOrderStopParam", true);
        pluginGeneratedSerialDescriptor.addElement("allowMultipleEntry", true);
        pluginGeneratedSerialDescriptor.addElement("signalItem", true);
        pluginGeneratedSerialDescriptor.addElement("containsUnSupportPair", true);
        pluginGeneratedSerialDescriptor.addElement("totalCoinPairs", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("vipProfit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SignalBotReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializerArr[2], stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(EntrySignalOrderAmtParam$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ExitSignalOrderAmtParam$$serializer.INSTANCE), booleanSerializer, BuiltinSerializersKt.getNullable(ThirdSignalDetail$$serializer.INSTANCE), booleanSerializer, kSerializerArr[12], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(AutoVipProfitInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignalBotReq deserialize(@NotNull Decoder decoder) {
        AutoVipProfitInfo autoVipProfitInfo;
        ThirdSignalDetail thirdSignalDetail;
        String str;
        ArrayList arrayList;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        boolean z2;
        ExitSignalOrderAmtParam exitSignalOrderAmtParam;
        EntrySignalOrderAmtParam entrySignalOrderAmtParam;
        ArrayList arrayList2;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SignalBotReq.$childSerializers;
        int i4 = 9;
        char c = 7;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            ArrayList arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            EntrySignalOrderAmtParam entrySignalOrderAmtParam2 = (EntrySignalOrderAmtParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, EntrySignalOrderAmtParam$$serializer.INSTANCE, null);
            ExitSignalOrderAmtParam exitSignalOrderAmtParam2 = (ExitSignalOrderAmtParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ExitSignalOrderAmtParam$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            ThirdSignalDetail thirdSignalDetail2 = (ThirdSignalDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, ThirdSignalDetail$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            arrayList = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            autoVipProfitInfo = (AutoVipProfitInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, AutoVipProfitInfo$$serializer.INSTANCE, null);
            arrayList2 = arrayList3;
            z = zDecodeBooleanElement;
            exitSignalOrderAmtParam = exitSignalOrderAmtParam2;
            str2 = str9;
            z2 = zDecodeBooleanElement2;
            str4 = strDecodeStringElement4;
            str6 = strDecodeStringElement2;
            thirdSignalDetail = thirdSignalDetail2;
            str7 = strDecodeStringElement;
            entrySignalOrderAmtParam = entrySignalOrderAmtParam2;
            str5 = strDecodeStringElement5;
            str3 = strDecodeStringElement3;
            i = 32767;
        } else {
            int i5 = 14;
            int i6 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            boolean z3 = true;
            AutoVipProfitInfo autoVipProfitInfo2 = null;
            ThirdSignalDetail thirdSignalDetail3 = null;
            ExitSignalOrderAmtParam exitSignalOrderAmtParam3 = null;
            ArrayList arrayList4 = null;
            String str10 = null;
            EntrySignalOrderAmtParam entrySignalOrderAmtParam3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            ArrayList arrayList5 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 0:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 1:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 2:
                        arrayList5 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], arrayList5);
                        i6 |= 4;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 3:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 4:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 5:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 6:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str10);
                        i2 = i6 | 64;
                        i6 = i2;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 7:
                        entrySignalOrderAmtParam3 = (EntrySignalOrderAmtParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, EntrySignalOrderAmtParam$$serializer.INSTANCE, entrySignalOrderAmtParam3);
                        i2 = i6 | 128;
                        i6 = i2;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 8:
                        exitSignalOrderAmtParam3 = (ExitSignalOrderAmtParam) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ExitSignalOrderAmtParam$$serializer.INSTANCE, exitSignalOrderAmtParam3);
                        i6 |= 256;
                        i5 = 14;
                        c = 7;
                        break;
                    case 9:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i6 |= 512;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 10:
                        thirdSignalDetail3 = (ThirdSignalDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, ThirdSignalDetail$$serializer.INSTANCE, thirdSignalDetail3);
                        i2 = i6 | 1024;
                        i6 = i2;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 11:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i6 |= 2048;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 12:
                        arrayList4 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], arrayList4);
                        i2 = i6 | 4096;
                        i6 = i2;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 13:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str8);
                        i3 = i6 | 8192;
                        i6 = i3;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    case 14:
                        autoVipProfitInfo2 = (AutoVipProfitInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, AutoVipProfitInfo$$serializer.INSTANCE, autoVipProfitInfo2);
                        i3 = i6 | 16384;
                        i6 = i3;
                        i5 = 14;
                        i4 = 9;
                        c = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            ArrayList arrayList6 = arrayList5;
            autoVipProfitInfo = autoVipProfitInfo2;
            thirdSignalDetail = thirdSignalDetail3;
            str = str8;
            arrayList = arrayList4;
            str2 = str10;
            i = i6;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement8;
            str6 = strDecodeStringElement9;
            str7 = strDecodeStringElement10;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
            exitSignalOrderAmtParam = exitSignalOrderAmtParam3;
            entrySignalOrderAmtParam = entrySignalOrderAmtParam3;
            arrayList2 = arrayList6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignalBotReq(i, str7, str6, arrayList2, str3, str4, str5, str2, entrySignalOrderAmtParam, exitSignalOrderAmtParam, z, thirdSignalDetail, z2, arrayList, str, autoVipProfitInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignalBotReq signalBotReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signalBotReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignalBotReq.write$Self$OKTradeCore_trade_core(signalBotReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
