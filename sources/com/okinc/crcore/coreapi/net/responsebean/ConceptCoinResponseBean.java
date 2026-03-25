package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ConceptCoinResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String changePerDay;
    private final String hotIndex;
    private final String instName;
    private final String instType;
    private final String lastPrice;
    private final String marketCap;
    private final String volume;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConceptCoinResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConceptCoinResponseBean copy$default(ConceptCoinResponseBean conceptCoinResponseBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conceptCoinResponseBean.instName;
        }
        if ((i & 2) != 0) {
            str2 = conceptCoinResponseBean.instType;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = conceptCoinResponseBean.lastPrice;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = conceptCoinResponseBean.changePerDay;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = conceptCoinResponseBean.volume;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = conceptCoinResponseBean.hotIndex;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = conceptCoinResponseBean.marketCap;
        }
        return conceptCoinResponseBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.changePerDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConceptCoinResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ConceptCoinResponseBean(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConceptCoinResponseBean)) {
            return false;
        }
        ConceptCoinResponseBean conceptCoinResponseBean = (ConceptCoinResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.instName, (Object) conceptCoinResponseBean.instName) && Intrinsics.EZpvd((Object) this.instType, (Object) conceptCoinResponseBean.instType) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) conceptCoinResponseBean.lastPrice) && Intrinsics.EZpvd((Object) this.changePerDay, (Object) conceptCoinResponseBean.changePerDay) && Intrinsics.EZpvd((Object) this.volume, (Object) conceptCoinResponseBean.volume) && Intrinsics.EZpvd((Object) this.hotIndex, (Object) conceptCoinResponseBean.hotIndex) && Intrinsics.EZpvd((Object) this.marketCap, (Object) conceptCoinResponseBean.marketCap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDay() {
        return this.changePerDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHotIndex() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstName() {
        return this.instName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.instName.hashCode() * 31) + this.instType.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.changePerDay.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.hotIndex.hashCode()) * 31) + this.marketCap.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConceptCoinResponseBean(instName=" + this.instName + ", instType=" + this.instType + ", lastPrice=" + this.lastPrice + ", changePerDay=" + this.changePerDay + ", volume=" + this.volume + ", hotIndex=" + this.hotIndex + ", marketCap=" + this.marketCap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.ConceptCoinResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConceptCoinResponseBean> serializer() {
            return ConceptCoinResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConceptCoinResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instName = "";
        } else {
            this.instName = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str3;
        }
        if ((i & 8) == 0) {
            this.changePerDay = "";
        } else {
            this.changePerDay = str4;
        }
        if ((i & 16) == 0) {
            this.volume = "";
        } else {
            this.volume = str5;
        }
        if ((i & 32) == 0) {
            this.hotIndex = "";
        } else {
            this.hotIndex = str6;
        }
        if ((i & 64) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ConceptCoinResponseBean conceptCoinResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) conceptCoinResponseBean.instName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, conceptCoinResponseBean.instName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) conceptCoinResponseBean.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, conceptCoinResponseBean.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) conceptCoinResponseBean.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, conceptCoinResponseBean.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) conceptCoinResponseBean.changePerDay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, conceptCoinResponseBean.changePerDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) conceptCoinResponseBean.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, conceptCoinResponseBean.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) conceptCoinResponseBean.hotIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, conceptCoinResponseBean.hotIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) conceptCoinResponseBean.marketCap, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, conceptCoinResponseBean.marketCap);
    }

    public ConceptCoinResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.instName = str;
        this.instType = str2;
        this.lastPrice = str3;
        this.changePerDay = str4;
        this.volume = str5;
        this.hotIndex = str6;
        this.marketCap = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.ConceptCoinResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ConceptCoinResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
