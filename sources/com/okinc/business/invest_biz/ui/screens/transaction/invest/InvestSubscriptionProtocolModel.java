package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestSubscriptionProtocolModel {
    public static final KSerializer<Object>[] $childSerializers;

    @SerializedName("moreList")
    private final List<InvestItem> moreList;

    @SerializedName("popularList")
    private final List<InvestItem> popularList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestSubscriptionProtocolModel() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestSubscriptionProtocolModel copy$default(InvestSubscriptionProtocolModel investSubscriptionProtocolModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investSubscriptionProtocolModel.popularList;
        }
        if ((i & 2) != 0) {
            list2 = investSubscriptionProtocolModel.moreList;
        }
        return investSubscriptionProtocolModel.KWHzl(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestItem> EZpvd() {
        return this.popularList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionProtocolModel KWHzl(List<InvestItem> list, List<InvestItem> list2) {
        return new InvestSubscriptionProtocolModel(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestItem> OLrzqt() {
        return this.moreList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestSubscriptionProtocolModel)) {
            return false;
        }
        InvestSubscriptionProtocolModel investSubscriptionProtocolModel = (InvestSubscriptionProtocolModel) obj;
        return Intrinsics.EZpvd(this.popularList, investSubscriptionProtocolModel.popularList) && Intrinsics.EZpvd(this.moreList, investSubscriptionProtocolModel.moreList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<InvestItem> list = this.popularList;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<InvestItem> list2 = this.moreList;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSubscriptionProtocolModel(popularList=" + this.popularList + ", moreList=" + this.moreList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSubscriptionProtocolModel> serializer() {
            return InvestSubscriptionProtocolModel$$serializer.INSTANCE;
        }
    }

    static {
        InvestItem$$serializer investItem$$serializer = InvestItem$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(investItem$$serializer), new ArrayListSerializer(investItem$$serializer)};
    }

    public /* synthetic */ InvestSubscriptionProtocolModel(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.popularList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.moreList = yDY.AhwBna();
        } else {
            this.moreList = list2;
        }
    }

    public static final /* synthetic */ void EZpvd(InvestSubscriptionProtocolModel investSubscriptionProtocolModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investSubscriptionProtocolModel.popularList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investSubscriptionProtocolModel.popularList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(investSubscriptionProtocolModel.moreList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], investSubscriptionProtocolModel.moreList);
    }

    public InvestSubscriptionProtocolModel(List<InvestItem> list, List<InvestItem> list2) {
        this.popularList = list;
        this.moreList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestItem>, java.util.List<com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestItem>):void (m)] (LINE:10) call: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ InvestSubscriptionProtocolModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
