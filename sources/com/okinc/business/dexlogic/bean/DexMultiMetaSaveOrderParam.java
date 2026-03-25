package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class DexMultiMetaSaveOrderParam {
    private final DexAutoSlippageInfoParam autoSlippageInfo;
    private final String customSlippage;
    private final String maxSlippage;
    private final String slippage;
    private final int tradeMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexMultiMetaSaveOrderParam copy$default(DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dexAutoSlippageInfoParam = dexMultiMetaSaveOrderParam.autoSlippageInfo;
        }
        if ((i2 & 2) != 0) {
            str = dexMultiMetaSaveOrderParam.customSlippage;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            i = dexMultiMetaSaveOrderParam.tradeMode;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = dexMultiMetaSaveOrderParam.maxSlippage;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = dexMultiMetaSaveOrderParam.slippage;
        }
        return dexMultiMetaSaveOrderParam.copy(dexAutoSlippageInfoParam, str4, i3, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam component1() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiMetaSaveOrderParam copy(DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str, int i, String str2, String str3) {
        return new DexMultiMetaSaveOrderParam(dexAutoSlippageInfoParam, str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexMultiMetaSaveOrderParam)) {
            return false;
        }
        DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam = (DexMultiMetaSaveOrderParam) obj;
        return Intrinsics.EZpvd(this.autoSlippageInfo, dexMultiMetaSaveOrderParam.autoSlippageInfo) && Intrinsics.EZpvd((Object) this.customSlippage, (Object) dexMultiMetaSaveOrderParam.customSlippage) && this.tradeMode == dexMultiMetaSaveOrderParam.tradeMode && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) dexMultiMetaSaveOrderParam.maxSlippage) && Intrinsics.EZpvd((Object) this.slippage, (Object) dexMultiMetaSaveOrderParam.slippage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAutoSlippageInfoParam getAutoSlippageInfo() {
        return this.autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomSlippage() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DexAutoSlippageInfoParam dexAutoSlippageInfoParam = this.autoSlippageInfo;
        int iHashCode = dexAutoSlippageInfoParam == null ? 0 : dexAutoSlippageInfoParam.hashCode();
        String str = this.customSlippage;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Integer.hashCode(this.tradeMode);
        String str2 = this.maxSlippage;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.slippage;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexMultiMetaSaveOrderParam(autoSlippageInfo=" + this.autoSlippageInfo + ", customSlippage=" + this.customSlippage + ", tradeMode=" + this.tradeMode + ", maxSlippage=" + this.maxSlippage + ", slippage=" + this.slippage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexMultiMetaSaveOrderParam> serializer() {
            return DexMultiMetaSaveOrderParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexMultiMetaSaveOrderParam(int i, DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, DexMultiMetaSaveOrderParam$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.autoSlippageInfo = null;
        } else {
            this.autoSlippageInfo = dexAutoSlippageInfoParam;
        }
        if ((i & 2) == 0) {
            this.customSlippage = null;
        } else {
            this.customSlippage = str;
        }
        this.tradeMode = i2;
        if ((i & 8) == 0) {
            this.maxSlippage = null;
        } else {
            this.maxSlippage = str2;
        }
        if ((i & 16) == 0) {
            this.slippage = null;
        } else {
            this.slippage = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dexMultiMetaSaveOrderParam.autoSlippageInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DexAutoSlippageInfoParam$$serializer.INSTANCE, dexMultiMetaSaveOrderParam.autoSlippageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dexMultiMetaSaveOrderParam.customSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dexMultiMetaSaveOrderParam.customSlippage);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, dexMultiMetaSaveOrderParam.tradeMode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dexMultiMetaSaveOrderParam.maxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dexMultiMetaSaveOrderParam.maxSlippage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && dexMultiMetaSaveOrderParam.slippage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, dexMultiMetaSaveOrderParam.slippage);
    }

    public DexMultiMetaSaveOrderParam(DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str, int i, String str2, String str3) {
        this.autoSlippageInfo = dexAutoSlippageInfoParam;
        this.customSlippage = str;
        this.tradeMode = i;
        this.maxSlippage = str2;
        this.slippage = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam) : (r8v0 com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (r10v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:2245) call: com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam.<init>(com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexMultiMetaSaveOrderParam(DexAutoSlippageInfoParam dexAutoSlippageInfoParam, String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : dexAutoSlippageInfoParam, (i2 & 2) != 0 ? null : str, i, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3);
    }
}
