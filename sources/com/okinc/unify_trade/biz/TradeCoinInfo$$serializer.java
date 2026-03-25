package com.okinc.unify_trade.biz;

import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class TradeCoinInfo$$serializer implements GeneratedSerializer<TradeCoinInfo> {
    public static final int $stable;
    public static final TradeCoinInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TradeCoinInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TradeCoinInfo$$serializer tradeCoinInfo$$serializer = new TradeCoinInfo$$serializer();
        INSTANCE = tradeCoinInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.TradeCoinInfo", tradeCoinInfo$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("sign", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.DISCOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("groups", true);
        pluginGeneratedSerialDescriptor.addElement("sizeDig", true);
        pluginGeneratedSerialDescriptor.addElement("tradeCoin", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("newTag", true);
        pluginGeneratedSerialDescriptor.addElement("sort", true);
        pluginGeneratedSerialDescriptor.addElement("newLabel", true);
        pluginGeneratedSerialDescriptor.addElement("supportSpotAvgCostFlag", true);
        pluginGeneratedSerialDescriptor.addElement("listTime", true);
        pluginGeneratedSerialDescriptor.addElement("collateralRestrict", true);
        pluginGeneratedSerialDescriptor.addElement("autoStakingApr", true);
        pluginGeneratedSerialDescriptor.addElement("manualLoan", true);
        pluginGeneratedSerialDescriptor.addElement("supportAutoLend", true);
        pluginGeneratedSerialDescriptor.addElement("supportAutoEarn", true);
        pluginGeneratedSerialDescriptor.addElement("supportAutoStaking", true);
        pluginGeneratedSerialDescriptor.addElement("tradFi", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TradeCoinInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[5], stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TradeCoinInfo deserialize(@NotNull Decoder decoder) {
        ArrayList arrayList;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Boolean bool;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TradeCoinInfo.$childSerializers;
        int i2 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            i = 2097151;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, null);
            str14 = strDecodeStringElement;
            str4 = strDecodeStringElement12;
            str17 = strDecodeStringElement17;
            str18 = strDecodeStringElement16;
            str19 = strDecodeStringElement15;
            str15 = strDecodeStringElement14;
            str16 = strDecodeStringElement13;
            str2 = str21;
            str13 = strDecodeStringElement2;
            arrayList = arrayList2;
            str3 = strDecodeStringElement9;
            str9 = strDecodeStringElement6;
            str8 = strDecodeStringElement7;
            str7 = strDecodeStringElement8;
            str = str20;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement10;
            str11 = strDecodeStringElement4;
            str10 = strDecodeStringElement5;
            str12 = strDecodeStringElement3;
        } else {
            int i3 = 20;
            ArrayList arrayList3 = null;
            String str22 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            boolean z = true;
            int i4 = 0;
            Boolean bool2 = null;
            String str23 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 20;
                        break;
                    case 0:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 20;
                        break;
                    case 1:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 6;
                        i3 = 20;
                        break;
                    case 2:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i2 = 6;
                        i3 = 20;
                        break;
                    case 3:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i2 = 6;
                        i3 = 20;
                        break;
                    case 4:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        i3 = 20;
                        break;
                    case 5:
                        arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], arrayList3);
                        i4 |= 32;
                        i2 = 6;
                        i3 = 20;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 = 20;
                        break;
                    case 7:
                        i4 |= 128;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 = 20;
                        break;
                    case 8:
                        i4 |= 256;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 = 20;
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 = 20;
                        break;
                    case 10:
                        i4 |= 1024;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str22);
                        i3 = 20;
                        break;
                    case 11:
                        i4 |= 2048;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 = 20;
                        break;
                    case 12:
                        i4 |= 4096;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str23);
                        i3 = 20;
                        break;
                    case 13:
                        i4 |= 8192;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 = 20;
                        break;
                    case 14:
                        i4 |= 16384;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 = 20;
                        break;
                    case 15:
                        i4 |= 32768;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 = 20;
                        break;
                    case 16:
                        i4 |= 65536;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 = 20;
                        break;
                    case 17:
                        i4 |= 131072;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 = 20;
                        break;
                    case 18:
                        i4 |= 262144;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i3 = 20;
                        break;
                    case 19:
                        i4 |= 524288;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i3 = 20;
                        break;
                    case 20:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool2);
                        i4 = 1048576 | i4;
                        i3 = 20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            arrayList = arrayList3;
            str = str22;
            i = i4;
            str2 = str23;
            str3 = strDecodeStringElement18;
            str4 = strDecodeStringElement24;
            str5 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            str7 = strDecodeStringElement27;
            str8 = strDecodeStringElement28;
            str9 = strDecodeStringElement29;
            str10 = strDecodeStringElement30;
            str11 = strDecodeStringElement31;
            str12 = strDecodeStringElement32;
            str13 = strDecodeStringElement33;
            str14 = strDecodeStringElement34;
            bool = bool2;
            String str24 = strDecodeStringElement20;
            str15 = strDecodeStringElement19;
            str16 = strDecodeStringElement23;
            str17 = str24;
            String str25 = strDecodeStringElement22;
            str18 = strDecodeStringElement21;
            str19 = str25;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TradeCoinInfo(i, str14, str13, str12, str11, str10, arrayList, str9, str8, str7, str3, str, str6, str2, str5, str4, str16, str15, str19, str18, str17, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TradeCoinInfo tradeCoinInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TradeCoinInfo.write$Self$OKTradeCore_trade_core(tradeCoinInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
