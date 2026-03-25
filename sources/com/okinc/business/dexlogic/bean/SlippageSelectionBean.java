package com.okinc.business.dexlogic.bean;

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
public final class SlippageSelectionBean {
    private final String displayValue;
    private boolean isSelect;
    private int slippageType;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SlippageSelectionBean copy$default(SlippageSelectionBean slippageSelectionBean, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = slippageSelectionBean.displayValue;
        }
        if ((i2 & 2) != 0) {
            str2 = slippageSelectionBean.value;
        }
        if ((i2 & 4) != 0) {
            i = slippageSelectionBean.slippageType;
        }
        if ((i2 & 8) != 0) {
            z = slippageSelectionBean.isSelect;
        }
        return slippageSelectionBean.copy(str, str2, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.displayValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageSelectionBean copy(@NotNull String str, @NotNull String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SlippageSelectionBean(str, str2, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlippageSelectionBean)) {
            return false;
        }
        SlippageSelectionBean slippageSelectionBean = (SlippageSelectionBean) obj;
        return Intrinsics.EZpvd((Object) this.displayValue, (Object) slippageSelectionBean.displayValue) && Intrinsics.EZpvd((Object) this.value, (Object) slippageSelectionBean.value) && this.slippageType == slippageSelectionBean.slippageType && this.isSelect == slippageSelectionBean.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayValue() {
        return this.displayValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.displayValue.hashCode() * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.slippageType)) * 31) + Boolean.hashCode(this.isSelect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageType(int i) {
        this.slippageType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SlippageSelectionBean(displayValue=" + this.displayValue + ", value=" + this.value + ", slippageType=" + this.slippageType + ", isSelect=" + this.isSelect + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.SlippageSelectionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SlippageSelectionBean> serializer() {
            return SlippageSelectionBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SlippageSelectionBean(int i, String str, String str2, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SlippageSelectionBean$$serializer.INSTANCE.getDescriptor());
        }
        this.displayValue = str;
        this.value = str2;
        this.slippageType = i2;
        if ((i & 8) == 0) {
            this.isSelect = false;
        } else {
            this.isSelect = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SlippageSelectionBean slippageSelectionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, slippageSelectionBean.displayValue);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, slippageSelectionBean.value);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, slippageSelectionBean.slippageType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || slippageSelectionBean.isSelect) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, slippageSelectionBean.isSelect);
        }
    }

    public SlippageSelectionBean(@NotNull String str, @NotNull String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.displayValue = str;
        this.value = str2;
        this.slippageType = i;
        this.isSelect = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, int, boolean):void (m)] (LINE:14) call: com.okinc.business.dexlogic.bean.SlippageSelectionBean.<init>(java.lang.String, java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ SlippageSelectionBean(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? false : z);
    }
}
