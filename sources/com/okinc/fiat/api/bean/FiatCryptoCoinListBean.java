package com.okinc.fiat.api.bean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class FiatCryptoCoinListBean {
    private static final KSerializer<Object>[] $childSerializers;
    private ArrayList<FiatCryptoCoinBean> baseCurrencies;
    private ArrayList<FiatCryptoCoinBean> quoteCurrencies;
    private ArrayList<FiatCryptoCoinBean> sellSupportQuoteCurrencies;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FiatCryptoCoinBean> getBaseCurrencies() {
        return this.baseCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FiatCryptoCoinBean> getQuoteCurrencies() {
        return this.quoteCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FiatCryptoCoinBean> getSellSupportQuoteCurrencies() {
        return this.sellSupportQuoteCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencies(@NotNull ArrayList<FiatCryptoCoinBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.baseCurrencies = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrencies(@NotNull ArrayList<FiatCryptoCoinBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.quoteCurrencies = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellSupportQuoteCurrencies(@NotNull ArrayList<FiatCryptoCoinBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.sellSupportQuoteCurrencies = arrayList;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.FiatCryptoCoinListBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FiatCryptoCoinListBean> serializer() {
            return FiatCryptoCoinListBean$$serializer.INSTANCE;
        }
    }

    static {
        FiatCryptoCoinBean$$serializer fiatCryptoCoinBean$$serializer = FiatCryptoCoinBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(fiatCryptoCoinBean$$serializer), new ArrayListSerializer(fiatCryptoCoinBean$$serializer), new ArrayListSerializer(fiatCryptoCoinBean$$serializer)};
    }

    public FiatCryptoCoinListBean() {
        this.quoteCurrencies = new ArrayList<>();
        this.baseCurrencies = new ArrayList<>();
        this.sellSupportQuoteCurrencies = new ArrayList<>();
    }

    public /* synthetic */ FiatCryptoCoinListBean(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SerializationConstructorMarker serializationConstructorMarker) {
        this.quoteCurrencies = (i & 1) == 0 ? new ArrayList() : arrayList;
        if ((i & 2) == 0) {
            this.baseCurrencies = new ArrayList<>();
        } else {
            this.baseCurrencies = arrayList2;
        }
        if ((i & 4) == 0) {
            this.sellSupportQuoteCurrencies = new ArrayList<>();
        } else {
            this.sellSupportQuoteCurrencies = arrayList3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [114=4] */
    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(FiatCryptoCoinListBean fiatCryptoCoinListBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(fiatCryptoCoinListBean.quoteCurrencies, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], fiatCryptoCoinListBean.quoteCurrencies);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(fiatCryptoCoinListBean.baseCurrencies, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], fiatCryptoCoinListBean.baseCurrencies);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(fiatCryptoCoinListBean.sellSupportQuoteCurrencies, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], fiatCryptoCoinListBean.sellSupportQuoteCurrencies);
    }
}
