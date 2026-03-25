package com.okinc.crcore.shared.net.responsebean;

import com.okinc.crcore.coreapi.net.responsebean.DexRiskResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.mDA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class DexRiskBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int chain;
    private final String contractAddress;
    private final String newRiskTotalLevel;
    private final String uniqueId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexRiskBean copy$default(DexRiskBean dexRiskBean, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dexRiskBean.uniqueId;
        }
        if ((i2 & 2) != 0) {
            i = dexRiskBean.chain;
        }
        if ((i2 & 4) != 0) {
            str2 = dexRiskBean.contractAddress;
        }
        if ((i2 & 8) != 0) {
            str3 = dexRiskBean.newRiskTotalLevel;
        }
        return dexRiskBean.copy(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.newRiskTotalLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexRiskBean copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DexRiskBean(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexRiskBean)) {
            return false;
        }
        DexRiskBean dexRiskBean = (DexRiskBean) obj;
        return Intrinsics.EZpvd((Object) this.uniqueId, (Object) dexRiskBean.uniqueId) && this.chain == dexRiskBean.chain && Intrinsics.EZpvd((Object) this.contractAddress, (Object) dexRiskBean.contractAddress) && Intrinsics.EZpvd((Object) this.newRiskTotalLevel, (Object) dexRiskBean.newRiskTotalLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChain() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewRiskTotalLevel() {
        return this.newRiskTotalLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.uniqueId.hashCode() * 31) + Integer.hashCode(this.chain)) * 31) + this.contractAddress.hashCode()) * 31) + this.newRiskTotalLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexRiskBean(uniqueId=" + this.uniqueId + ", chain=" + this.chain + ", contractAddress=" + this.contractAddress + ", newRiskTotalLevel=" + this.newRiskTotalLevel + ")";
    }

    public /* synthetic */ DexRiskBean(int i, String str, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, DexRiskBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.uniqueId = "";
        } else {
            this.uniqueId = str;
        }
        this.chain = i2;
        this.contractAddress = str2;
        this.newRiskTotalLevel = str3;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexRiskBean dexRiskBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexRiskBean.uniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexRiskBean.uniqueId);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, dexRiskBean.chain);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dexRiskBean.contractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, dexRiskBean.newRiskTotalLevel);
    }

    public DexRiskBean(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.uniqueId = str;
        this.chain = i;
        this.contractAddress = str2;
        this.newRiskTotalLevel = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 int)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.DexRiskBean.<init>(java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexRiskBean(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, i, str2, str3);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.DexRiskBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DexRiskBean> serializer() {
            return DexRiskBean$$serializer.INSTANCE;
        }

        public final DexRiskBean copydefault(@NotNull DexRiskResponseBean dexRiskResponseBean) {
            Intrinsics.checkNotNullParameter(dexRiskResponseBean, "");
            mDA mda = mDA.EZpvd;
            int chain = dexRiskResponseBean.getChain();
            return new DexRiskBean(mda.EZpvd(String.valueOf(chain), dexRiskResponseBean.getContractAddress()), dexRiskResponseBean.getChain(), dexRiskResponseBean.getContractAddress(), dexRiskResponseBean.getNewRiskTotalLevel());
        }
    }

    public final boolean isHighRisk() {
        try {
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.newRiskTotalLevel);
            if (intOrNull != null) {
                if (intOrNull.intValue() >= 6) {
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
        }
        return false;
    }

    public final boolean isLowRisk() {
        try {
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.newRiskTotalLevel);
            if (intOrNull != null) {
                if (intOrNull.intValue() <= 3) {
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
        }
        return false;
    }

    public final boolean isMediumRisk() {
        try {
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.newRiskTotalLevel);
            if (intOrNull != null) {
                int iIntValue = intOrNull.intValue();
                if (4 <= iIntValue && iIntValue < 6) {
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
        }
        return false;
    }

    public final String getRiskDescription() {
        return isLowRisk() ? "Low Risk" : isMediumRisk() ? "Medium Risk" : isHighRisk() ? "High Risk" : "Unknown Risk";
    }
}
