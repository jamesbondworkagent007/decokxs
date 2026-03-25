package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InstrumentItemResponseBean {
    private int active;
    private int bizType;
    private long createTime;
    private String instrumentName;
    private String promptThreshold;
    private int promptType;
    private int repeatType;
    private String ruleId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InstrumentItemResponseBean() {
        this((String) null, 0, (String) null, 0, 0, (String) null, 0L, 0, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstrumentItemResponseBean copy(@NotNull String str, int i, @NotNull String str2, int i2, int i3, @NotNull String str3, long j, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InstrumentItemResponseBean(str, i, str2, i2, i3, str3, j, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentItemResponseBean)) {
            return false;
        }
        InstrumentItemResponseBean instrumentItemResponseBean = (InstrumentItemResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.ruleId, (Object) instrumentItemResponseBean.ruleId) && this.bizType == instrumentItemResponseBean.bizType && Intrinsics.EZpvd((Object) this.instrumentName, (Object) instrumentItemResponseBean.instrumentName) && this.promptType == instrumentItemResponseBean.promptType && this.repeatType == instrumentItemResponseBean.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) instrumentItemResponseBean.promptThreshold) && this.createTime == instrumentItemResponseBean.createTime && this.active == instrumentItemResponseBean.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActive() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPromptThreshold() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPromptType() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatType() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.ruleId.hashCode() * 31) + Integer.hashCode(this.bizType)) * 31) + this.instrumentName.hashCode()) * 31) + Integer.hashCode(this.promptType)) * 31) + Integer.hashCode(this.repeatType)) * 31) + this.promptThreshold.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.active);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActive(int i) {
        this.active = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(int i) {
        this.bizType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrumentName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.promptThreshold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptType(int i) {
        this.promptType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatType(int i) {
        this.repeatType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ruleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InstrumentItemResponseBean(ruleId=" + this.ruleId + ", bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ", createTime=" + this.createTime + ", active=" + this.active + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.InstrumentItemResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstrumentItemResponseBean> serializer() {
            return InstrumentItemResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstrumentItemResponseBean(int i, String str, int i2, String str2, int i3, int i4, String str3, long j, int i5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ruleId = "";
        } else {
            this.ruleId = str;
        }
        if ((i & 2) == 0) {
            this.bizType = 0;
        } else {
            this.bizType = i2;
        }
        if ((i & 4) == 0) {
            this.instrumentName = "";
        } else {
            this.instrumentName = str2;
        }
        if ((i & 8) == 0) {
            this.promptType = 0;
        } else {
            this.promptType = i3;
        }
        if ((i & 16) == 0) {
            this.repeatType = 0;
        } else {
            this.repeatType = i4;
        }
        if ((i & 32) == 0) {
            this.promptThreshold = "";
        } else {
            this.promptThreshold = str3;
        }
        if ((i & 64) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j;
        }
        if ((i & 128) == 0) {
            this.active = 1;
        } else {
            this.active = i5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(InstrumentItemResponseBean instrumentItemResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) instrumentItemResponseBean.ruleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, instrumentItemResponseBean.ruleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || instrumentItemResponseBean.bizType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, instrumentItemResponseBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) instrumentItemResponseBean.instrumentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, instrumentItemResponseBean.instrumentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || instrumentItemResponseBean.promptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, instrumentItemResponseBean.promptType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || instrumentItemResponseBean.repeatType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, instrumentItemResponseBean.repeatType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) instrumentItemResponseBean.promptThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, instrumentItemResponseBean.promptThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || instrumentItemResponseBean.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, instrumentItemResponseBean.createTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && instrumentItemResponseBean.active == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 7, instrumentItemResponseBean.active);
    }

    public InstrumentItemResponseBean(@NotNull String str, int i, @NotNull String str2, int i2, int i3, @NotNull String str3, long j, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ruleId = str;
        this.bizType = i;
        this.instrumentName = str2;
        this.promptType = i2;
        this.repeatType = i3;
        this.promptThreshold = str3;
        this.createTime = j;
        this.active = i4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r19v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r19v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002d: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r18v0 int))
 A[MD:(java.lang.String, int, java.lang.String, int, int, java.lang.String, long, int):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.InstrumentItemResponseBean.<init>(java.lang.String, int, java.lang.String, int, int, java.lang.String, long, int):void type: THIS */
    public /* synthetic */ InstrumentItemResponseBean(String str, int i, String str2, int i2, int i3, String str3, long j, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) == 0 ? i3 : 0, (i5 & 32) == 0 ? str3 : "", (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 1 : i4);
    }
}
