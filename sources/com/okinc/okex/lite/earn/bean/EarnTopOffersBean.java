package com.okinc.okex.lite.earn.bean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EarnTopOffersBean {
    private ArrayList<EarnTopOfferBean> earningOffers;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(EarnTopOfferBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnTopOffersBean() {
        this((ArrayList) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.lite.earn.bean.EarnTopOffersBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarnTopOffersBean copy$default(EarnTopOffersBean earnTopOffersBean, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = earnTopOffersBean.earningOffers;
        }
        return earnTopOffersBean.copy(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EarnTopOfferBean> component1() {
        return this.earningOffers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnTopOffersBean copy(@NotNull ArrayList<EarnTopOfferBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new EarnTopOffersBean(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarnTopOffersBean) && Intrinsics.EZpvd(this.earningOffers, ((EarnTopOffersBean) obj).earningOffers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EarnTopOfferBean> getEarningOffers() {
        return this.earningOffers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.earningOffers.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarningOffers(@NotNull ArrayList<EarnTopOfferBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.earningOffers = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnTopOffersBean(earningOffers=" + this.earningOffers + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.earn.bean.EarnTopOffersBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnTopOffersBean> serializer() {
            return EarnTopOffersBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnTopOffersBean(int i, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.earningOffers = new ArrayList<>();
        } else {
            this.earningOffers = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(EarnTopOffersBean earnTopOffersBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(earnTopOffersBean.earningOffers, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], earnTopOffersBean.earningOffers);
    }

    public EarnTopOffersBean(@NotNull ArrayList<EarnTopOfferBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.earningOffers = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:11) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.okex.lite.earn.bean.EarnTopOfferBean>):void (m)] (LINE:10) call: com.okinc.okex.lite.earn.bean.EarnTopOffersBean.<init>(java.util.ArrayList):void type: THIS */
    public /* synthetic */ EarnTopOffersBean(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }
}
