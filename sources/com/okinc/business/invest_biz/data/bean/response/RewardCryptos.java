package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class RewardCryptos {
    public final String subTitle;
    public final List<InvestTokenWithAmount> tokens;
    public final String total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(InvestTokenWithAmount$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RewardCryptos() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.response.RewardCryptos */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardCryptos copy$default(RewardCryptos rewardCryptos, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardCryptos.total;
        }
        if ((i & 2) != 0) {
            str2 = rewardCryptos.subTitle;
        }
        if ((i & 4) != 0) {
            list = rewardCryptos.tokens;
        }
        return rewardCryptos.OLrzqt(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> AEQbTJ() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardCryptos OLrzqt(@NotNull String str, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RewardCryptos(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardCryptos)) {
            return false;
        }
        RewardCryptos rewardCryptos = (RewardCryptos) obj;
        return Intrinsics.EZpvd((Object) this.total, (Object) rewardCryptos.total) && Intrinsics.EZpvd((Object) this.subTitle, (Object) rewardCryptos.subTitle) && Intrinsics.EZpvd(this.tokens, rewardCryptos.tokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.total.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.tokens.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RewardCryptos(total=" + this.total + ", subTitle=" + this.subTitle + ", tokens=" + this.tokens + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.RewardCryptos.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RewardCryptos> serializer() {
            return RewardCryptos$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RewardCryptos(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.total = "";
        } else {
            this.total = str;
        }
        if ((i & 2) == 0) {
            this.subTitle = "";
        } else {
            this.subTitle = str2;
        }
        if ((i & 4) == 0) {
            this.tokens = yDY.AhwBna();
        } else {
            this.tokens = list;
        }
    }

    public static final /* synthetic */ void KWHzl(RewardCryptos rewardCryptos, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rewardCryptos.total, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rewardCryptos.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rewardCryptos.subTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rewardCryptos.subTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(rewardCryptos.tokens, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], rewardCryptos.tokens);
    }

    public RewardCryptos(@NotNull String str, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.total = str;
        this.subTitle = str2;
        this.tokens = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>):void (m)] (LINE:8) call: com.okinc.business.invest_biz.data.bean.response.RewardCryptos.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ RewardCryptos(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
