package com.okinc.unify_trade.biz.subscribe;

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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class FundingRateAllData {
    private ArrayList<FundingRateItem> fundingList;
    private String fundingTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(FundingRateItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FundingRateAllData() {
        this((String) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.FundingRateAllData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FundingRateAllData copy$default(FundingRateAllData fundingRateAllData, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingRateAllData.fundingTime;
        }
        if ((i & 2) != 0) {
            arrayList = fundingRateAllData.fundingList;
        }
        return fundingRateAllData.copy(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FundingRateItem> component2() {
        return this.fundingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingRateAllData copy(@NotNull String str, @NotNull ArrayList<FundingRateItem> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new FundingRateAllData(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingRateAllData)) {
            return false;
        }
        FundingRateAllData fundingRateAllData = (FundingRateAllData) obj;
        return Intrinsics.EZpvd((Object) this.fundingTime, (Object) fundingRateAllData.fundingTime) && Intrinsics.EZpvd(this.fundingList, fundingRateAllData.fundingList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FundingRateItem> getFundingList() {
        return this.fundingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingTime() {
        return this.fundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.fundingTime.hashCode() * 31) + this.fundingList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingList(@NotNull ArrayList<FundingRateItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.fundingList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fundingTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingRateAllData(fundingTime=" + this.fundingTime + ", fundingList=" + this.fundingList + ")";
    }

    public /* synthetic */ FundingRateAllData(int i, String str, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        this.fundingTime = (i & 1) == 0 ? "0" : str;
        if ((i & 2) == 0) {
            this.fundingList = new ArrayList<>();
        } else {
            this.fundingList = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FundingRateAllData fundingRateAllData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fundingRateAllData.fundingTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fundingRateAllData.fundingTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(fundingRateAllData.fundingList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], fundingRateAllData.fundingList);
    }

    public FundingRateAllData(@NotNull String str, @NotNull ArrayList<FundingRateItem> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.fundingTime = str;
        this.fundingList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r1v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:148) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.subscribe.FundingRateItem>):void (m)] (LINE:146) call: com.okinc.unify_trade.biz.subscribe.FundingRateAllData.<init>(java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ FundingRateAllData(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.FundingRateAllData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FundingRateAllData> serializer() {
            return FundingRateAllData$$serializer.INSTANCE;
        }
    }
}
