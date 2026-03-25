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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class PresetLevelBean {
    private String formatValue;
    private boolean isSelect;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PresetLevelBean copy$default(PresetLevelBean presetLevelBean, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presetLevelBean.formatValue;
        }
        if ((i & 2) != 0) {
            str2 = presetLevelBean.value;
        }
        if ((i & 4) != 0) {
            z = presetLevelBean.isSelect;
        }
        return presetLevelBean.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.formatValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetLevelBean copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PresetLevelBean(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresetLevelBean)) {
            return false;
        }
        PresetLevelBean presetLevelBean = (PresetLevelBean) obj;
        return Intrinsics.EZpvd((Object) this.formatValue, (Object) presetLevelBean.formatValue) && Intrinsics.EZpvd((Object) this.value, (Object) presetLevelBean.value) && this.isSelect == presetLevelBean.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormatValue() {
        return this.formatValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.formatValue.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isSelect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormatValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.formatValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PresetLevelBean(formatValue=" + this.formatValue + ", value=" + this.value + ", isSelect=" + this.isSelect + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.PresetLevelBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PresetLevelBean> serializer() {
            return PresetLevelBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PresetLevelBean(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PresetLevelBean$$serializer.INSTANCE.getDescriptor());
        }
        this.formatValue = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.isSelect = false;
        } else {
            this.isSelect = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PresetLevelBean presetLevelBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, presetLevelBean.formatValue);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, presetLevelBean.value);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || presetLevelBean.isSelect) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, presetLevelBean.isSelect);
        }
    }

    public PresetLevelBean(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.formatValue = str;
        this.value = str2;
        this.isSelect = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:15) call: com.okinc.business.dexlogic.bean.PresetLevelBean.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ PresetLevelBean(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
