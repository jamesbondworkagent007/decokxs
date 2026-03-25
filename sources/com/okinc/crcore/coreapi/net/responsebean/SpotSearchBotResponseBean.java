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
public final class SpotSearchBotResponseBean {
    private final String apy;
    private final String bizType;
    private String displayId;
    private final String icon;
    private final String instName;
    private final String strategyType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotSearchBotResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotSearchBotResponseBean copy$default(SpotSearchBotResponseBean spotSearchBotResponseBean, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotSearchBotResponseBean.apy;
        }
        if ((i & 2) != 0) {
            str2 = spotSearchBotResponseBean.bizType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = spotSearchBotResponseBean.instName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = spotSearchBotResponseBean.displayId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = spotSearchBotResponseBean.strategyType;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = spotSearchBotResponseBean.icon;
        }
        return spotSearchBotResponseBean.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotSearchBotResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new SpotSearchBotResponseBean(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotSearchBotResponseBean)) {
            return false;
        }
        SpotSearchBotResponseBean spotSearchBotResponseBean = (SpotSearchBotResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.apy, (Object) spotSearchBotResponseBean.apy) && Intrinsics.EZpvd((Object) this.bizType, (Object) spotSearchBotResponseBean.bizType) && Intrinsics.EZpvd((Object) this.instName, (Object) spotSearchBotResponseBean.instName) && Intrinsics.EZpvd((Object) this.displayId, (Object) spotSearchBotResponseBean.displayId) && Intrinsics.EZpvd((Object) this.strategyType, (Object) spotSearchBotResponseBean.strategyType) && Intrinsics.EZpvd((Object) this.icon, (Object) spotSearchBotResponseBean.icon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstName() {
        return this.instName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.apy.hashCode() * 31) + this.bizType.hashCode()) * 31) + this.instName.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.strategyType.hashCode()) * 31) + this.icon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotSearchBotResponseBean(apy=" + this.apy + ", bizType=" + this.bizType + ", instName=" + this.instName + ", displayId=" + this.displayId + ", strategyType=" + this.strategyType + ", icon=" + this.icon + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.SpotSearchBotResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotSearchBotResponseBean> serializer() {
            return SpotSearchBotResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotSearchBotResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.apy = "";
        } else {
            this.apy = str;
        }
        if ((i & 2) == 0) {
            this.bizType = "";
        } else {
            this.bizType = str2;
        }
        if ((i & 4) == 0) {
            this.instName = "";
        } else {
            this.instName = str3;
        }
        if ((i & 8) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str4;
        }
        if ((i & 16) == 0) {
            this.strategyType = "";
        } else {
            this.strategyType = str5;
        }
        if ((i & 32) == 0) {
            this.icon = "";
        } else {
            this.icon = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SpotSearchBotResponseBean spotSearchBotResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) spotSearchBotResponseBean.apy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, spotSearchBotResponseBean.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotSearchBotResponseBean.bizType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotSearchBotResponseBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotSearchBotResponseBean.instName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotSearchBotResponseBean.instName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) spotSearchBotResponseBean.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, spotSearchBotResponseBean.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) spotSearchBotResponseBean.strategyType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, spotSearchBotResponseBean.strategyType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) spotSearchBotResponseBean.icon, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, spotSearchBotResponseBean.icon);
    }

    public SpotSearchBotResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.apy = str;
        this.bizType = str2;
        this.instName = str3;
        this.displayId = str4;
        this.strategyType = str5;
        this.icon = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.SpotSearchBotResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotSearchBotResponseBean(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
