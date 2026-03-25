package com.okinc.crcore.coreapi.net.requestbean;

import com.okinc.crcore.shared.net.requestbean.PriceRemindAddRequestBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PriceRemindAddApiRequestBean {
    private int bizType;
    private String instrumentName;
    private String promptThreshold;
    private int promptType;
    private int repeatType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriceRemindAddApiRequestBean copy$default(PriceRemindAddApiRequestBean priceRemindAddApiRequestBean, int i, String str, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = priceRemindAddApiRequestBean.bizType;
        }
        if ((i4 & 2) != 0) {
            str = priceRemindAddApiRequestBean.instrumentName;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            i2 = priceRemindAddApiRequestBean.promptType;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = priceRemindAddApiRequestBean.repeatType;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            str2 = priceRemindAddApiRequestBean.promptThreshold;
        }
        return priceRemindAddApiRequestBean.copy(i, str3, i5, i6, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instrumentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRemindAddApiRequestBean copy(int i, @NotNull String str, int i2, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PriceRemindAddApiRequestBean(i, str, i2, i3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceRemindAddApiRequestBean)) {
            return false;
        }
        PriceRemindAddApiRequestBean priceRemindAddApiRequestBean = (PriceRemindAddApiRequestBean) obj;
        return this.bizType == priceRemindAddApiRequestBean.bizType && Intrinsics.EZpvd((Object) this.instrumentName, (Object) priceRemindAddApiRequestBean.instrumentName) && this.promptType == priceRemindAddApiRequestBean.promptType && this.repeatType == priceRemindAddApiRequestBean.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) priceRemindAddApiRequestBean.promptThreshold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBizType() {
        return this.bizType;
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
    public int hashCode() {
        return (((((((Integer.hashCode(this.bizType) * 31) + this.instrumentName.hashCode()) * 31) + Integer.hashCode(this.promptType)) * 31) + Integer.hashCode(this.repeatType)) * 31) + this.promptThreshold.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(int i) {
        this.bizType = i;
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
    public String toString() {
        return "PriceRemindAddApiRequestBean(bizType=" + this.bizType + ", instrumentName=" + this.instrumentName + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ")";
    }

    public /* synthetic */ PriceRemindAddApiRequestBean(int i, int i2, String str, int i3, int i4, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, PriceRemindAddApiRequestBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.bizType = 0;
        } else {
            this.bizType = i2;
        }
        if ((i & 2) == 0) {
            this.instrumentName = "";
        } else {
            this.instrumentName = str;
        }
        if ((i & 4) == 0) {
            this.promptType = 0;
        } else {
            this.promptType = i3;
        }
        this.repeatType = i4;
        if ((i & 16) == 0) {
            this.promptThreshold = "";
        } else {
            this.promptThreshold = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PriceRemindAddApiRequestBean priceRemindAddApiRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceRemindAddApiRequestBean.bizType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, priceRemindAddApiRequestBean.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) priceRemindAddApiRequestBean.instrumentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, priceRemindAddApiRequestBean.instrumentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceRemindAddApiRequestBean.promptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, priceRemindAddApiRequestBean.promptType);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, priceRemindAddApiRequestBean.repeatType);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) priceRemindAddApiRequestBean.promptThreshold, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, priceRemindAddApiRequestBean.promptThreshold);
    }

    public PriceRemindAddApiRequestBean(int i, @NotNull String str, int i2, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bizType = i;
        this.instrumentName = str;
        this.promptType = i2;
        this.repeatType = i3;
        this.promptThreshold = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (r11v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(int, java.lang.String, int, int, java.lang.String):void (m)] (LINE:16) call: com.okinc.crcore.coreapi.net.requestbean.PriceRemindAddApiRequestBean.<init>(int, java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ PriceRemindAddApiRequestBean(int i, String str, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i2, i3, (i4 & 16) != 0 ? "" : str2);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.PriceRemindAddApiRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PriceRemindAddApiRequestBean> serializer() {
            return PriceRemindAddApiRequestBean$$serializer.INSTANCE;
        }

        public final PriceRemindAddApiRequestBean copydefault(@NotNull PriceRemindAddRequestBean priceRemindAddRequestBean) {
            Intrinsics.checkNotNullParameter(priceRemindAddRequestBean, "");
            return new PriceRemindAddApiRequestBean(priceRemindAddRequestBean.getBizType(), priceRemindAddRequestBean.getInstrumentName(), priceRemindAddRequestBean.getPromptType(), priceRemindAddRequestBean.getRepeatType(), priceRemindAddRequestBean.getPromptThreshold());
        }
    }
}
