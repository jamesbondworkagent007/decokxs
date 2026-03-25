package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ProtocolRewards {
    public final List<InvestUserRewardInfoByInvestment> availableRewards;
    public final List<String> tokenLogoList;
    public final String totalReward;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InvestUserRewardInfoByInvestment$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProtocolRewards() {
        this((List) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.response.ProtocolRewards */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtocolRewards copy$default(ProtocolRewards protocolRewards, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = protocolRewards.availableRewards;
        }
        if ((i & 2) != 0) {
            list2 = protocolRewards.tokenLogoList;
        }
        if ((i & 4) != 0) {
            str = protocolRewards.totalReward;
        }
        return protocolRewards.copydefault(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> KWHzl() {
        return this.availableRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> OLrzqt() {
        return this.tokenLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolRewards copydefault(@NotNull List<InvestUserRewardInfoByInvestment> list, @NotNull List<String> list2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ProtocolRewards(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.totalReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolRewards)) {
            return false;
        }
        ProtocolRewards protocolRewards = (ProtocolRewards) obj;
        return Intrinsics.EZpvd(this.availableRewards, protocolRewards.availableRewards) && Intrinsics.EZpvd(this.tokenLogoList, protocolRewards.tokenLogoList) && Intrinsics.EZpvd((Object) this.totalReward, (Object) protocolRewards.totalReward);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.availableRewards.hashCode() * 31) + this.tokenLogoList.hashCode()) * 31) + this.totalReward.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolRewards(availableRewards=" + this.availableRewards + ", tokenLogoList=" + this.tokenLogoList + ", totalReward=" + this.totalReward + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.ProtocolRewards.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProtocolRewards> serializer() {
            return ProtocolRewards$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProtocolRewards(int i, List list, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.availableRewards = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.tokenLogoList = yDY.AhwBna();
        } else {
            this.tokenLogoList = list2;
        }
        if ((i & 4) == 0) {
            this.totalReward = "";
        } else {
            this.totalReward = str;
        }
    }

    public static final /* synthetic */ void KWHzl(ProtocolRewards protocolRewards, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(protocolRewards.availableRewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], protocolRewards.availableRewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(protocolRewards.tokenLogoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], protocolRewards.tokenLogoList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) protocolRewards.totalReward, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, protocolRewards.totalReward);
    }

    public ProtocolRewards(@NotNull List<InvestUserRewardInfoByInvestment> list, @NotNull List<String> list2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.availableRewards = list;
        this.tokenLogoList = list2;
        this.totalReward = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:233)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:235)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:231) call: com.okinc.business.invest_biz.data.bean.response.ProtocolRewards.<init>(java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ ProtocolRewards(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? "" : str);
    }
}
