package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class RechargeNavigationBean$$serializer implements GeneratedSerializer<RechargeNavigationBean> {
    public static final int $stable;
    public static final RechargeNavigationBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RechargeNavigationBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RechargeNavigationBean$$serializer rechargeNavigationBean$$serializer = new RechargeNavigationBean$$serializer();
        INSTANCE = rechargeNavigationBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.RechargeNavigationBean", rechargeNavigationBean$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("walletId", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        pluginGeneratedSerialDescriptor.addElement("coinAddress", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("isCoin", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("subCurrencyId", true);
        pluginGeneratedSerialDescriptor.addElement("walletDisplayName", true);
        pluginGeneratedSerialDescriptor.addElement("isTrackingWallet", true);
        pluginGeneratedSerialDescriptor.addElement("fromFullScreen", true);
        pluginGeneratedSerialDescriptor.addElement("addCustomToken", true);
        pluginGeneratedSerialDescriptor.addElement("needCustomToken", true);
        pluginGeneratedSerialDescriptor.addElement("tip", true);
        pluginGeneratedSerialDescriptor.addElement("sourceType", true);
        pluginGeneratedSerialDescriptor.addElement("addressType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, intSerializer, intSerializer, stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RechargeNavigationBean deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3;
        boolean z;
        String str6;
        String str7;
        boolean z2;
        boolean z3;
        long j;
        String strDecodeStringElement;
        String str8;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
            z2 = zDecodeBooleanElement4;
            z3 = zDecodeBooleanElement5;
            str8 = strDecodeStringElement9;
            i2 = iDecodeIntElement2;
            str6 = strDecodeStringElement7;
            str7 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            z = zDecodeBooleanElement;
            j = jDecodeLongElement;
            z4 = zDecodeBooleanElement3;
            z5 = zDecodeBooleanElement2;
            str = strDecodeStringElement2;
            i = 262143;
            str5 = strDecodeStringElement8;
            i3 = iDecodeIntElement3;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
        } else {
            int i5 = 0;
            int i6 = 17;
            String strDecodeStringElement10 = null;
            int iDecodeIntElement4 = 0;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            int iDecodeIntElement5 = 0;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            boolean z6 = true;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 0:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 1:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 2:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 3:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i5 |= 8;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 4:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 5:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 6:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 7:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 8:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i5 |= 256;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 9:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i5 |= 512;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 10:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i5 |= 1024;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 11:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i5 |= 2048;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 12:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i5 |= 4096;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 13:
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i5 |= 8192;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 14:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        i5 |= 16384;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 15:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i5 |= 32768;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 16:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i5 |= 65536;
                        i4 = 8;
                        i6 = 17;
                        break;
                    case 17:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i6);
                        i5 |= 131072;
                        i4 = 8;
                        i6 = 17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = strDecodeStringElement18;
            i2 = iDecodeIntElement4;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement13;
            str5 = strDecodeStringElement14;
            i3 = iDecodeIntElement5;
            z = zDecodeBooleanElement8;
            str6 = strDecodeStringElement15;
            str7 = strDecodeStringElement16;
            z2 = zDecodeBooleanElement9;
            z3 = zDecodeBooleanElement10;
            j = jDecodeLongElement2;
            strDecodeStringElement = strDecodeStringElement10;
            str8 = strDecodeStringElement17;
            z4 = zDecodeBooleanElement6;
            z5 = zDecodeBooleanElement7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RechargeNavigationBean(i, str, str3, str2, j, str4, str7, str6, z, i2, i3, str5, z5, z4, z2, z3, str8, strDecodeStringElement, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RechargeNavigationBean rechargeNavigationBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(rechargeNavigationBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RechargeNavigationBean.write$Self$OKWallet_wallet_impl(rechargeNavigationBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
