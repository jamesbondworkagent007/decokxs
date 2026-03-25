package com.okinc.business.defi.biz.core.tx.speedup.bean;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.wallet.core.sign.utxo.BRC20Buyer;
import com.okinc.wallet.core.sign.utxo.BRC20Buyer$$serializer;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.DummyInfo$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class UTXOSpeedUpInfoJsonBean$$serializer implements GeneratedSerializer<UTXOSpeedUpInfoJsonBean> {
    public static final int $stable;
    public static final UTXOSpeedUpInfoJsonBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UTXOSpeedUpInfoJsonBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UTXOSpeedUpInfoJsonBean$$serializer uTXOSpeedUpInfoJsonBean$$serializer = new UTXOSpeedUpInfoJsonBean$$serializer();
        INSTANCE = uTXOSpeedUpInfoJsonBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.tx.speedup.bean.UTXOSpeedUpInfoJsonBean", uTXOSpeedUpInfoJsonBean$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("feeRate", true);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.Operation.KEY_SEQUENCE, true);
        pluginGeneratedSerialDescriptor.addElement("changeAddress", true);
        pluginGeneratedSerialDescriptor.addElement("utxoNewList", true);
        pluginGeneratedSerialDescriptor.addElement("utxoList", true);
        pluginGeneratedSerialDescriptor.addElement("dummyInfo", true);
        pluginGeneratedSerialDescriptor.addElement("brc20Buyer", true);
        pluginGeneratedSerialDescriptor.addElement("cpfpSpeedUpUtxo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = UTXOSpeedUpInfoJsonBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(DummyInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BRC20Buyer$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[7])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UTXOSpeedUpInfoJsonBean deserialize(@NotNull Decoder decoder) {
        BRC20Buyer bRC20Buyer;
        int i;
        String str;
        List list;
        List list2;
        DummyInfo dummyInfo;
        List list3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = UTXOSpeedUpInfoJsonBean.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 7;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            DummyInfo dummyInfo2 = (DummyInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DummyInfo$$serializer.INSTANCE, null);
            BRC20Buyer bRC20Buyer2 = (BRC20Buyer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BRC20Buyer$$serializer.INSTANCE, null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            str = str8;
            bRC20Buyer = bRC20Buyer2;
            dummyInfo = dummyInfo2;
            list = list4;
            list3 = list5;
            i = 255;
        } else {
            int i5 = 0;
            boolean z = true;
            DummyInfo dummyInfo3 = null;
            List list6 = null;
            List list7 = null;
            List list8 = null;
            bRC20Buyer = null;
            String str9 = null;
            String str10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str4 = str9;
                        str5 = str10;
                        z = false;
                        str9 = str4;
                        str10 = str5;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 0:
                        str6 = str9;
                        i5 |= 1;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str10);
                        str9 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 1:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str9);
                        i5 |= 2;
                        str9 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 2:
                        i5 |= 4;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str7);
                        str6 = str9;
                        str9 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 3:
                        i5 |= 8;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list7);
                        str6 = str9;
                        str9 = str6;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 4:
                        i5 |= 16;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list6);
                        str4 = str9;
                        str5 = str10;
                        str9 = str4;
                        str10 = str5;
                        i2 = 6;
                        i3 = 5;
                        i4 = 7;
                        break;
                    case 5:
                        i5 |= 32;
                        dummyInfo3 = (DummyInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, DummyInfo$$serializer.INSTANCE, dummyInfo3);
                        break;
                    case 6:
                        i5 |= 64;
                        bRC20Buyer = (BRC20Buyer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BRC20Buyer$$serializer.INSTANCE, bRC20Buyer);
                        break;
                    case 7:
                        i5 |= 128;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kSerializerArr[i4], list8);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = str7;
            list = list7;
            list2 = list8;
            dummyInfo = dummyInfo3;
            list3 = list6;
            str2 = str9;
            str3 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UTXOSpeedUpInfoJsonBean(i, str3, str2, str, list, list3, dummyInfo, bRC20Buyer, list2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UTXOSpeedUpInfoJsonBean uTXOSpeedUpInfoJsonBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uTXOSpeedUpInfoJsonBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UTXOSpeedUpInfoJsonBean.write$Self$OKWallet_wallet_impl(uTXOSpeedUpInfoJsonBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
