package com.okinc.business.invest_biz.data.bean;

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
public final class BonusRewards {
    public final String subTitle;
    public final List<InvestTokenWithAmount> tokens;
    public final String total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(InvestTokenWithAmount$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BonusRewards() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.BonusRewards */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BonusRewards copy$default(BonusRewards bonusRewards, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bonusRewards.total;
        }
        if ((i & 2) != 0) {
            str2 = bonusRewards.subTitle;
        }
        if ((i & 4) != 0) {
            list = bonusRewards.tokens;
        }
        return bonusRewards.EZpvd(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BonusRewards EZpvd(@NotNull String str, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BonusRewards(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> OLrzqt() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusRewards)) {
            return false;
        }
        BonusRewards bonusRewards = (BonusRewards) obj;
        return Intrinsics.EZpvd((Object) this.total, (Object) bonusRewards.total) && Intrinsics.EZpvd((Object) this.subTitle, (Object) bonusRewards.subTitle) && Intrinsics.EZpvd(this.tokens, bonusRewards.tokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.total.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.tokens.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BonusRewards(total=" + this.total + ", subTitle=" + this.subTitle + ", tokens=" + this.tokens + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.BonusRewards.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BonusRewards> serializer() {
            return BonusRewards$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BonusRewards(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void OLrzqt(BonusRewards bonusRewards, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bonusRewards.total, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bonusRewards.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bonusRewards.subTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bonusRewards.subTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(bonusRewards.tokens, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], bonusRewards.tokens);
    }

    public BonusRewards(@NotNull String str, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list) {
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
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:517)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>):void (m)] (LINE:511) call: com.okinc.business.invest_biz.data.bean.BonusRewards.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ BonusRewards(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
