package com.okinc.unify_trade.biz;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class SmartArbPlanLeg$$serializer implements GeneratedSerializer<SmartArbPlanLeg> {
    public static final int $stable;
    public static final SmartArbPlanLeg$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SmartArbPlanLeg$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SmartArbPlanLeg$$serializer smartArbPlanLeg$$serializer = new SmartArbPlanLeg$$serializer();
        INSTANCE = smartArbPlanLeg$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SmartArbPlanLeg", smartArbPlanLeg$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, true);
        pluginGeneratedSerialDescriptor.addElement("amt", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, true);
        pluginGeneratedSerialDescriptor.addElement("avgPx", true);
        pluginGeneratedSerialDescriptor.addElement("pos", true);
        pluginGeneratedSerialDescriptor.addElement("posCcy", true);
        pluginGeneratedSerialDescriptor.addElement("mgnRatio", true);
        pluginGeneratedSerialDescriptor.addElement("feeList", true);
        pluginGeneratedSerialDescriptor.addElement(CrashHianalyticsData.TIME, true);
        pluginGeneratedSerialDescriptor.addElement("stakePos", true);
        pluginGeneratedSerialDescriptor.addElement("stakeReward", true);
        pluginGeneratedSerialDescriptor.addElement("liquidPrice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SmartArbPlanLeg.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[10]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SmartArbPlanLeg deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i;
        String str11;
        String str12;
        String str13;
        String str14;
        KSerializer[] kSerializerArr;
        String str15;
        String str16;
        String str17;
        String str18;
        KSerializer[] kSerializerArr2;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = SmartArbPlanLeg.$childSerializers;
        int i2 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr3[10], null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str3 = str36;
            str8 = str35;
            str10 = str34;
            str6 = str28;
            str4 = str37;
            arrayList = arrayList2;
            str = str33;
            str7 = str32;
            str13 = str30;
            i = 32767;
            str12 = str29;
            str14 = str27;
            str2 = str31;
            str9 = str26;
        } else {
            int i3 = 14;
            boolean z = true;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            ArrayList arrayList3 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            int i4 = 0;
            String str51 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        str19 = str51;
                        str20 = str45;
                        str21 = str46;
                        str22 = str47;
                        str23 = str48;
                        str24 = str50;
                        str25 = str49;
                        z = false;
                        str46 = str21;
                        str47 = str22;
                        str48 = str23;
                        kSerializerArr3 = kSerializerArr2;
                        str49 = str25;
                        i2 = 10;
                        i3 = 14;
                        str50 = str24;
                        str45 = str20;
                        str51 = str19;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        str19 = str51;
                        str20 = str45;
                        str21 = str46;
                        str22 = str47;
                        str23 = str48;
                        String str52 = str50;
                        str25 = str49;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str52);
                        i4 |= 1;
                        str46 = str21;
                        str47 = str22;
                        str48 = str23;
                        kSerializerArr3 = kSerializerArr2;
                        str49 = str25;
                        i2 = 10;
                        i3 = 14;
                        str50 = str24;
                        str45 = str20;
                        str51 = str19;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        str19 = str51;
                        String str53 = str45;
                        str21 = str46;
                        str22 = str47;
                        str23 = str48;
                        str20 = str53;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str49);
                        i4 |= 2;
                        str24 = str50;
                        str25 = str49;
                        str46 = str21;
                        str47 = str22;
                        str48 = str23;
                        kSerializerArr3 = kSerializerArr2;
                        str49 = str25;
                        i2 = 10;
                        i3 = 14;
                        str50 = str24;
                        str45 = str20;
                        str51 = str19;
                        break;
                    case 2:
                        kSerializerArr2 = kSerializerArr3;
                        str19 = str51;
                        str21 = str46;
                        str22 = str47;
                        String str54 = str45;
                        str23 = str48;
                        i4 |= 4;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str54);
                        str24 = str50;
                        str25 = str49;
                        str46 = str21;
                        str47 = str22;
                        str48 = str23;
                        kSerializerArr3 = kSerializerArr2;
                        str49 = str25;
                        i2 = 10;
                        i3 = 14;
                        str50 = str24;
                        str45 = str20;
                        str51 = str19;
                        break;
                    case 3:
                        kSerializerArr2 = kSerializerArr3;
                        str19 = str51;
                        str21 = str46;
                        str22 = str47;
                        i4 |= 8;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str44);
                        str20 = str45;
                        str24 = str50;
                        str23 = str48;
                        str25 = str49;
                        str46 = str21;
                        str47 = str22;
                        str48 = str23;
                        kSerializerArr3 = kSerializerArr2;
                        str49 = str25;
                        i2 = 10;
                        i3 = 14;
                        str50 = str24;
                        str45 = str20;
                        str51 = str19;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr3;
                        str15 = str51;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str42);
                        i4 |= 16;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr3;
                        str15 = str51;
                        str16 = str46;
                        str17 = str47;
                        str18 = str48;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str38);
                        i4 |= 32;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr3;
                        str16 = str46;
                        str17 = str47;
                        str15 = str51;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str48);
                        i4 |= 64;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 7:
                        str16 = str46;
                        kSerializerArr = kSerializerArr3;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str47);
                        i4 |= 128;
                        str15 = str51;
                        str18 = str48;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 8:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str46);
                        i4 |= 256;
                        kSerializerArr = kSerializerArr3;
                        str15 = str51;
                        str17 = str47;
                        str18 = str48;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 9:
                        i4 |= 512;
                        kSerializerArr = kSerializerArr3;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str51);
                        str16 = str46;
                        str17 = str47;
                        str18 = str48;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 10:
                        i4 |= 1024;
                        kSerializerArr = kSerializerArr3;
                        str15 = str51;
                        arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kSerializerArr3[i2], arrayList3);
                        str16 = str46;
                        str17 = str47;
                        str18 = str48;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 11:
                        i4 |= 2048;
                        kSerializerArr = kSerializerArr3;
                        str15 = str51;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str39);
                        str16 = str46;
                        str17 = str47;
                        str18 = str48;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 12:
                        i4 |= 4096;
                        kSerializerArr = kSerializerArr3;
                        str15 = str51;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str40);
                        str16 = str46;
                        str17 = str47;
                        str18 = str48;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 13:
                        i4 |= 8192;
                        kSerializerArr = kSerializerArr3;
                        str15 = str51;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str41);
                        str16 = str46;
                        str17 = str47;
                        str18 = str48;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    case 14:
                        i4 |= 16384;
                        kSerializerArr = kSerializerArr3;
                        str15 = str51;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str43);
                        str16 = str46;
                        str17 = str47;
                        str18 = str48;
                        str48 = str18;
                        str46 = str16;
                        str47 = str17;
                        str51 = str15;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str47;
            str2 = str38;
            str3 = str39;
            str4 = str40;
            str5 = str41;
            arrayList = arrayList3;
            str6 = str45;
            str7 = str48;
            str8 = str51;
            str9 = str50;
            str10 = str46;
            i = i4;
            str11 = str43;
            str12 = str44;
            str13 = str42;
            str14 = str49;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SmartArbPlanLeg(i, str9, str14, str6, str12, str13, str2, str7, str, str10, str8, arrayList, str3, str4, str5, str11, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SmartArbPlanLeg smartArbPlanLeg) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(smartArbPlanLeg, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SmartArbPlanLeg.write$Self$OKTradeCore_trade_core(smartArbPlanLeg, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
