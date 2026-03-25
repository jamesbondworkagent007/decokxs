package com.okinc.crcore.coreapi.net.responsebean.bsc;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.localization2.bean.AppLocaleInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class BaseCurrencyResponseBean$$serializer implements GeneratedSerializer<BaseCurrencyResponseBean> {
    public static final int $stable;
    public static final BaseCurrencyResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BaseCurrencyResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BaseCurrencyResponseBean$$serializer baseCurrencyResponseBean$$serializer = new BaseCurrencyResponseBean$$serializer();
        INSTANCE = baseCurrencyResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.BaseCurrencyResponseBean", baseCurrencyResponseBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("scale", true);
        pluginGeneratedSerialDescriptor.addElement("currencyName", true);
        pluginGeneratedSerialDescriptor.addElement("nightIcon", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("availableBalance", true);
        pluginGeneratedSerialDescriptor.addElement("usdRate", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement(AppLocaleInfo.KEY_DISPLAY_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("dexInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, DoubleSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(DexInfoResponseBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BaseCurrencyResponseBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        DexInfoResponseBean dexInfoResponseBean;
        String str;
        String str2;
        String str3;
        double d;
        int i;
        String str4;
        String str5;
        int i2;
        String str6;
        String str7;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            i = iDecodeIntElement;
            dexInfoResponseBean = (DexInfoResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DexInfoResponseBean$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement9;
            str = strDecodeStringElement8;
            str5 = strDecodeStringElement7;
            str4 = strDecodeStringElement6;
            strDecodeStringElement = strDecodeStringElement4;
            i2 = 2047;
            str6 = strDecodeStringElement5;
            str7 = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            d = dDecodeDoubleElement;
        } else {
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            int iDecodeIntElement2 = 0;
            boolean z2 = true;
            double dDecodeDoubleElement2 = 0.0d;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            int i3 = 0;
            DexInfoResponseBean dexInfoResponseBean2 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = z;
                        break;
                    case 0:
                        i3 |= 1;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        break;
                    case 1:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        z = z2;
                        z2 = z;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        z = z2;
                        z2 = z;
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        z = z2;
                        z2 = z;
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        z = z2;
                        z2 = z;
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        z = z2;
                        z2 = z;
                        break;
                    case 7:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 7);
                        i3 |= 128;
                        z = z2;
                        z2 = z;
                        break;
                    case 8:
                        i3 |= 256;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        z = z2;
                        z2 = z;
                        break;
                    case 9:
                        i3 |= 512;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        z = z2;
                        z2 = z;
                        break;
                    case 10:
                        dexInfoResponseBean2 = (DexInfoResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DexInfoResponseBean$$serializer.INSTANCE, dexInfoResponseBean2);
                        i3 |= 1024;
                        z = z2;
                        z2 = z;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            dexInfoResponseBean = dexInfoResponseBean2;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement14;
            d = dDecodeDoubleElement2;
            i = iDecodeIntElement2;
            str4 = strDecodeStringElement15;
            str5 = strDecodeStringElement16;
            i2 = i3;
            String str8 = strDecodeStringElement13;
            str6 = strDecodeStringElement12;
            str7 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BaseCurrencyResponseBean(i2, i, str3, str7, strDecodeStringElement, str6, str4, str5, d, str, str2, dexInfoResponseBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BaseCurrencyResponseBean baseCurrencyResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(baseCurrencyResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BaseCurrencyResponseBean.write$Self$OKCRCore_cr_core(baseCurrencyResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
