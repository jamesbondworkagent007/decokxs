package com.okinc.okpaymentapi.data.remote.model.experience;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.localization2.bean.AppLocaleInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class BuySellCurrency$$serializer implements GeneratedSerializer<BuySellCurrency> {
    public static final int $stable;
    public static final BuySellCurrency$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BuySellCurrency$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BuySellCurrency$$serializer buySellCurrency$$serializer = new BuySellCurrency$$serializer();
        INSTANCE = buySellCurrency$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency", buySellCurrency$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("availableBalance", true);
        pluginGeneratedSerialDescriptor.addElement("channelAvailable", true);
        pluginGeneratedSerialDescriptor.addElement("countryNames", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("currencyName", true);
        pluginGeneratedSerialDescriptor.addElement(AppLocaleInfo.KEY_DISPLAY_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("hidden", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("nightIcon", true);
        pluginGeneratedSerialDescriptor.addElement("priceScale", true);
        pluginGeneratedSerialDescriptor.addElement("quickAmountList", true);
        pluginGeneratedSerialDescriptor.addElement("scale", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("tradeRange", true);
        pluginGeneratedSerialDescriptor.addElement("usdRate", true);
        pluginGeneratedSerialDescriptor.addElement("valuation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = BuySellCurrency.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, booleanSerializer, kSerializerArr[2], stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer, intSerializer, kSerializerArr[11], intSerializer, stringSerializer, stringSerializer, DoubleSerializer.INSTANCE, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BuySellCurrency deserialize(@NotNull Decoder decoder) {
        List list;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        double d;
        List list2;
        String str5;
        String str6;
        String str7;
        int i2;
        String strDecodeStringElement;
        int i3;
        String str8;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = BuySellCurrency.$childSerializers;
        int i4 = 10;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 15);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            i3 = iDecodeIntElement2;
            i2 = iDecodeIntElement;
            str8 = strDecodeStringElement9;
            z2 = zDecodeBooleanElement2;
            str9 = strDecodeStringElement7;
            str7 = strDecodeStringElement6;
            str6 = strDecodeStringElement8;
            str5 = strDecodeStringElement10;
            i = 131071;
            str = strDecodeStringElement11;
            list2 = list4;
            d = dDecodeDoubleElement;
            str4 = strDecodeStringElement3;
            z = zDecodeBooleanElement;
            list = list3;
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
        } else {
            int i5 = 16;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            int i6 = 0;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean z3 = true;
            double dDecodeDoubleElement2 = 0.0d;
            List list5 = null;
            List list6 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i5 = 16;
                        i4 = 10;
                        break;
                    case 0:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 16;
                        i4 = 10;
                        break;
                    case 1:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 16;
                        i4 = 10;
                        break;
                    case 2:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list6);
                        i6 |= 4;
                        i5 = 16;
                        i4 = 10;
                        break;
                    case 3:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 16;
                        break;
                    case 4:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 16;
                        break;
                    case 5:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        i5 = 16;
                        break;
                    case 6:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 |= 64;
                        i5 = 16;
                        break;
                    case 7:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i6 |= 128;
                        i5 = 16;
                        break;
                    case 8:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i6 |= 256;
                        i5 = 16;
                        break;
                    case 9:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 |= 512;
                        i5 = 16;
                        break;
                    case 10:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i6 |= 1024;
                        i5 = 16;
                        break;
                    case 11:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], list5);
                        i6 |= 2048;
                        i5 = 16;
                        break;
                    case 12:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i6 |= 4096;
                        i5 = 16;
                        break;
                    case 13:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 |= 8192;
                        i5 = 16;
                        break;
                    case 14:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i6 |= 16384;
                        i5 = 16;
                        break;
                    case 15:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 15);
                        i6 |= 32768;
                        i5 = 16;
                        break;
                    case 16:
                        i6 |= 65536;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i5 = 16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list6;
            i = i6;
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement15;
            str3 = strDecodeStringElement17;
            str4 = strDecodeStringElement18;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
            d = dDecodeDoubleElement2;
            list2 = list5;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement19;
            str7 = strDecodeStringElement14;
            i2 = iDecodeIntElement4;
            strDecodeStringElement = strDecodeStringElement16;
            i3 = iDecodeIntElement3;
            str8 = strDecodeStringElement20;
            str9 = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BuySellCurrency(i, str4, z, list, str3, str2, str7, str9, z2, str6, str8, i2, list2, i3, str5, str, d, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BuySellCurrency buySellCurrency) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(buySellCurrency, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BuySellCurrency.write$Self$OKPayments_ok_payment_api(buySellCurrency, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
