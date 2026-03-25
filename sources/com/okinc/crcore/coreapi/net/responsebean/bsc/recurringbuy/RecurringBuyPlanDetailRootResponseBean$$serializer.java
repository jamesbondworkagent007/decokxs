package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.Unit;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class RecurringBuyPlanDetailRootResponseBean$$serializer implements GeneratedSerializer<RecurringBuyPlanDetailRootResponseBean> {
    public static final int $stable;
    public static final RecurringBuyPlanDetailRootResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecurringBuyPlanDetailRootResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecurringBuyPlanDetailRootResponseBean$$serializer recurringBuyPlanDetailRootResponseBean$$serializer = new RecurringBuyPlanDetailRootResponseBean$$serializer();
        INSTANCE = recurringBuyPlanDetailRootResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyPlanDetailRootResponseBean", recurringBuyPlanDetailRootResponseBean$$serializer, 33);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("planId", false);
        pluginGeneratedSerialDescriptor.addElement("baseCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("quoteAmount", false);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrencySymbol", false);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrencyIcon", false);
        pluginGeneratedSerialDescriptor.addElement("firstOrder", true);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("lowBalance", false);
        pluginGeneratedSerialDescriptor.addElement("planAutoPaused", false);
        pluginGeneratedSerialDescriptor.addElement("recurringBuyErrorType", true);
        pluginGeneratedSerialDescriptor.addElement("pnl", false);
        pluginGeneratedSerialDescriptor.addElement("createTime", false);
        pluginGeneratedSerialDescriptor.addElement("frequency", false);
        pluginGeneratedSerialDescriptor.addElement("placedOrderList", false);
        pluginGeneratedSerialDescriptor.addElement("showViewAllButton", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethod", false);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodUrl", true);
        pluginGeneratedSerialDescriptor.addElement("paymentMethodNightUrl", true);
        pluginGeneratedSerialDescriptor.addElement("last4", true);
        pluginGeneratedSerialDescriptor.addElement("categoryCode", true);
        pluginGeneratedSerialDescriptor.addElement("displayQuoteCurrencyAfterAmount", true);
        pluginGeneratedSerialDescriptor.addElement("purchaseTimes", false);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyIcon", false);
        pluginGeneratedSerialDescriptor.addElement("roi", false);
        pluginGeneratedSerialDescriptor.addElement("totalBaseAmount", false);
        pluginGeneratedSerialDescriptor.addElement("totalQuoteAmount", false);
        pluginGeneratedSerialDescriptor.addElement("editPlanAmountLimit", false);
        pluginGeneratedSerialDescriptor.addElement("nextPurchaseTime", false);
        pluginGeneratedSerialDescriptor.addElement("lastPurchaseTime", false);
        pluginGeneratedSerialDescriptor.addElement("nextPurchase", false);
        pluginGeneratedSerialDescriptor.addElement("roiStatus", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = RecurringBuyPlanDetailRootResponseBean.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, BuiltinSerializersKt.getNullable(RecurringBuyPlanDetailPnlResponseBean$$serializer.INSTANCE), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[15]), booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, booleanSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(RecurringBuyEditPlanAmountResponseBean$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, longSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecurringBuyPlanDetailRootResponseBean deserialize(@NotNull Decoder decoder) {
        RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j;
        int i;
        RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean;
        int i2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        long j2;
        List list;
        int i3;
        String str14;
        String str15;
        String str16;
        boolean z;
        long jDecodeLongElement;
        String str17;
        boolean z2;
        String str18;
        String str19;
        String str20;
        String str21;
        boolean z3;
        String strDecodeStringElement;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RecurringBuyPlanDetailRootResponseBean.$childSerializers;
        int i9 = 6;
        int i10 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean2 = (RecurringBuyPlanDetailPnlResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, RecurringBuyPlanDetailPnlResponseBean$$serializer.INSTANCE, null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 23);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean2 = (RecurringBuyEditPlanAmountResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 28, RecurringBuyEditPlanAmountResponseBean$$serializer.INSTANCE, null);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            str9 = strDecodeStringElement21;
            i3 = -1;
            str2 = strDecodeStringElement22;
            str3 = strDecodeStringElement8;
            str15 = strDecodeStringElement16;
            i2 = iDecodeIntElement;
            recurringBuyEditPlanAmountResponseBean = recurringBuyEditPlanAmountResponseBean2;
            z3 = zDecodeBooleanElement4;
            j2 = jDecodeLongElement3;
            str17 = strDecodeStringElement17;
            str11 = strDecodeStringElement18;
            str10 = strDecodeStringElement19;
            str19 = strDecodeStringElement20;
            str6 = strDecodeStringElement3;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 32);
            str21 = strDecodeStringElement15;
            str8 = strDecodeStringElement13;
            str12 = strDecodeStringElement9;
            recurringBuyPlanDetailPnlResponseBean = recurringBuyPlanDetailPnlResponseBean2;
            str13 = strDecodeStringElement10;
            z4 = zDecodeBooleanElement2;
            z = zDecodeBooleanElement;
            str20 = strDecodeStringElement11;
            str = strDecodeStringElement14;
            str14 = strDecodeStringElement12;
            str18 = strDecodeStringElement4;
            str7 = strDecodeStringElement2;
            j = jDecodeLongElement2;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement5;
            str16 = strDecodeStringElement7;
            z2 = zDecodeBooleanElement3;
            list = list2;
            i = 1;
        } else {
            int i11 = 0;
            int i12 = 32;
            RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean3 = null;
            List list3 = null;
            RecurringBuyPlanDetailPnlResponseBean recurringBuyPlanDetailPnlResponseBean3 = null;
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
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            String strDecodeStringElement43 = null;
            int iDecodeIntElement2 = 0;
            boolean z5 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int i13 = 0;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            boolean z6 = true;
            String strDecodeStringElement44 = null;
            boolean zDecodeBooleanElement7 = false;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i4 = i9;
                        Unit unit = Unit.INSTANCE;
                        z6 = false;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 0:
                        i4 = i9;
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i11 |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 1:
                        i4 = i9;
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i11 |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 2:
                        i4 = i9;
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i11 |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 3:
                        i4 = i9;
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i11 |= 8;
                        Unit unit42 = Unit.INSTANCE;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 4:
                        i4 = i9;
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i11 |= 16;
                        Unit unit422 = Unit.INSTANCE;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 5:
                        i4 = i9;
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i11 |= 32;
                        Unit unit4222 = Unit.INSTANCE;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 6:
                        i4 = i9;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i11 |= 64;
                        Unit unit5 = Unit.INSTANCE;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 7:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 = i11 | 128;
                        Unit unit6 = Unit.INSTANCE;
                        i11 = i5;
                        i4 = 6;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 8:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i10);
                        i5 = i11 | 256;
                        Unit unit62 = Unit.INSTANCE;
                        i11 = i5;
                        i4 = 6;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 9:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i5 = i11 | 512;
                        Unit unit622 = Unit.INSTANCE;
                        i11 = i5;
                        i4 = 6;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 10:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i5 = i11 | 1024;
                        Unit unit6222 = Unit.INSTANCE;
                        i11 = i5;
                        i4 = 6;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 11:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 = i11 | 2048;
                        Unit unit62222 = Unit.INSTANCE;
                        i11 = i5;
                        i4 = 6;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 12:
                        recurringBuyPlanDetailPnlResponseBean3 = (RecurringBuyPlanDetailPnlResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, RecurringBuyPlanDetailPnlResponseBean$$serializer.INSTANCE, recurringBuyPlanDetailPnlResponseBean3);
                        i11 |= 4096;
                        Unit unit7 = Unit.INSTANCE;
                        i4 = 6;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 13:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i11 |= 8192;
                        Unit unit8 = Unit.INSTANCE;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 14:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i11 |= 16384;
                        Unit unit9 = Unit.INSTANCE;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 15:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], list3);
                        i6 = 32768;
                        i11 |= i6;
                        Unit unit10 = Unit.INSTANCE;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 16:
                        boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                        i11 |= 65536;
                        Unit unit11 = Unit.INSTANCE;
                        z5 = zDecodeBooleanElement8;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 17:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i7 = 131072;
                        i11 |= i7;
                        Unit unit12 = Unit.INSTANCE;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 18:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i7 = 262144;
                        i11 |= i7;
                        Unit unit122 = Unit.INSTANCE;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 19:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i6 = 524288;
                        i11 |= i6;
                        Unit unit102 = Unit.INSTANCE;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 20:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i8 = 1048576;
                        int i14 = i8 | i11;
                        Unit unit13 = Unit.INSTANCE;
                        i11 = i14;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 21:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
                        i8 = 2097152;
                        int i142 = i8 | i11;
                        Unit unit132 = Unit.INSTANCE;
                        i11 = i142;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 22:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 22);
                        i8 = 4194304;
                        int i1422 = i8 | i11;
                        Unit unit1322 = Unit.INSTANCE;
                        i11 = i1422;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 23:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 23);
                        i8 = 8388608;
                        int i14222 = i8 | i11;
                        Unit unit13222 = Unit.INSTANCE;
                        i11 = i14222;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 24:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i8 = 16777216;
                        int i142222 = i8 | i11;
                        Unit unit132222 = Unit.INSTANCE;
                        i11 = i142222;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 25:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i8 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        int i1422222 = i8 | i11;
                        Unit unit1322222 = Unit.INSTANCE;
                        i11 = i1422222;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 26:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i8 = 67108864;
                        int i14222222 = i8 | i11;
                        Unit unit13222222 = Unit.INSTANCE;
                        i11 = i14222222;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 27:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i8 = 134217728;
                        int i142222222 = i8 | i11;
                        Unit unit132222222 = Unit.INSTANCE;
                        i11 = i142222222;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 28:
                        recurringBuyEditPlanAmountResponseBean3 = (RecurringBuyEditPlanAmountResponseBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 28, RecurringBuyEditPlanAmountResponseBean$$serializer.INSTANCE, recurringBuyEditPlanAmountResponseBean3);
                        i8 = 268435456;
                        int i1422222222 = i8 | i11;
                        Unit unit1322222222 = Unit.INSTANCE;
                        i11 = i1422222222;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 29:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i6 = 536870912;
                        i11 |= i6;
                        Unit unit1022 = Unit.INSTANCE;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 30:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i6 = 1073741824;
                        i11 |= i6;
                        Unit unit10222 = Unit.INSTANCE;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 31:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i6 = Integer.MIN_VALUE;
                        i11 |= i6;
                        Unit unit102222 = Unit.INSTANCE;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    case 32:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i12);
                        Unit unit14 = Unit.INSTANCE;
                        i13 = 1;
                        i4 = i9;
                        i9 = i4;
                        i10 = 8;
                        i12 = 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            recurringBuyPlanDetailPnlResponseBean = recurringBuyPlanDetailPnlResponseBean3;
            str = strDecodeStringElement31;
            str2 = strDecodeStringElement34;
            str3 = strDecodeStringElement37;
            str4 = strDecodeStringElement39;
            str5 = strDecodeStringElement40;
            str6 = strDecodeStringElement42;
            str7 = strDecodeStringElement43;
            j = jDecodeLongElement4;
            i = i13;
            recurringBuyEditPlanAmountResponseBean = recurringBuyEditPlanAmountResponseBean3;
            i2 = iDecodeIntElement2;
            str8 = strDecodeStringElement23;
            str9 = strDecodeStringElement26;
            str10 = strDecodeStringElement28;
            str11 = strDecodeStringElement29;
            str12 = strDecodeStringElement33;
            str13 = strDecodeStringElement36;
            j2 = jDecodeLongElement5;
            list = list3;
            i3 = i11;
            str14 = strDecodeStringElement44;
            str15 = strDecodeStringElement24;
            str16 = strDecodeStringElement38;
            z = zDecodeBooleanElement6;
            jDecodeLongElement = jDecodeLongElement6;
            str17 = strDecodeStringElement30;
            z2 = z5;
            str18 = strDecodeStringElement41;
            str19 = strDecodeStringElement27;
            str20 = strDecodeStringElement32;
            str21 = strDecodeStringElement35;
            z3 = zDecodeBooleanElement7;
            boolean z7 = zDecodeBooleanElement5;
            strDecodeStringElement = strDecodeStringElement25;
            z4 = z7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecurringBuyPlanDetailRootResponseBean(i3, i, j, str7, str6, str18, str5, str4, str16, str3, str12, z, z4, str13, recurringBuyPlanDetailPnlResponseBean, str20, str14, list, z2, str8, str, str21, str15, i2, z3, j2, str17, str11, str10, str19, recurringBuyEditPlanAmountResponseBean, str9, str2, strDecodeStringElement, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecurringBuyPlanDetailRootResponseBean recurringBuyPlanDetailRootResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailRootResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecurringBuyPlanDetailRootResponseBean.write$Self$OKCRCore_cr_core(recurringBuyPlanDetailRootResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
