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
public final class PrioritySelectionBean {
    private final String contentDescription;
    private boolean isSelect;
    private int priorityType;
    private final String title;
    private String value;
    private String valueDisplayFormat;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PrioritySelectionBean copy$default(PrioritySelectionBean prioritySelectionBean, String str, String str2, boolean z, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = prioritySelectionBean.title;
        }
        if ((i2 & 2) != 0) {
            str2 = prioritySelectionBean.value;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            z = prioritySelectionBean.isSelect;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            i = prioritySelectionBean.priorityType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = prioritySelectionBean.valueDisplayFormat;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = prioritySelectionBean.contentDescription;
        }
        return prioritySelectionBean.copy(str, str5, z2, i3, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
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
    public final int component4() {
        return this.priorityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.valueDisplayFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.contentDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrioritySelectionBean copy(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PrioritySelectionBean(str, str2, z, i, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrioritySelectionBean)) {
            return false;
        }
        PrioritySelectionBean prioritySelectionBean = (PrioritySelectionBean) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) prioritySelectionBean.title) && Intrinsics.EZpvd((Object) this.value, (Object) prioritySelectionBean.value) && this.isSelect == prioritySelectionBean.isSelect && this.priorityType == prioritySelectionBean.priorityType && Intrinsics.EZpvd((Object) this.valueDisplayFormat, (Object) prioritySelectionBean.valueDisplayFormat) && Intrinsics.EZpvd((Object) this.contentDescription, (Object) prioritySelectionBean.contentDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriorityType() {
        return this.priorityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValueDisplayFormat() {
        return this.valueDisplayFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isSelect)) * 31) + Integer.hashCode(this.priorityType)) * 31) + this.valueDisplayFormat.hashCode()) * 31) + this.contentDescription.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityType(int i) {
        this.priorityType = i;
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
    public final void setValueDisplayFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueDisplayFormat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PrioritySelectionBean(title=" + this.title + ", value=" + this.value + ", isSelect=" + this.isSelect + ", priorityType=" + this.priorityType + ", valueDisplayFormat=" + this.valueDisplayFormat + ", contentDescription=" + this.contentDescription + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.PrioritySelectionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrioritySelectionBean> serializer() {
            return PrioritySelectionBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PrioritySelectionBean(int i, String str, String str2, boolean z, int i2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i, 9, PrioritySelectionBean$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.value = "";
        } else {
            this.value = str2;
        }
        if ((i & 4) == 0) {
            this.isSelect = false;
        } else {
            this.isSelect = z;
        }
        this.priorityType = i2;
        if ((i & 16) == 0) {
            this.valueDisplayFormat = "";
        } else {
            this.valueDisplayFormat = str3;
        }
        if ((i & 32) == 0) {
            this.contentDescription = "";
        } else {
            this.contentDescription = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PrioritySelectionBean prioritySelectionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, prioritySelectionBean.title);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) prioritySelectionBean.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, prioritySelectionBean.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || prioritySelectionBean.isSelect) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, prioritySelectionBean.isSelect);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, prioritySelectionBean.priorityType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) prioritySelectionBean.valueDisplayFormat, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, prioritySelectionBean.valueDisplayFormat);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) prioritySelectionBean.contentDescription, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, prioritySelectionBean.contentDescription);
    }

    public PrioritySelectionBean(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.title = str;
        this.value = str2;
        this.isSelect = z;
        this.priorityType = i;
        this.valueDisplayFormat = str3;
        this.contentDescription = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (r13v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.business.dexlogic.bean.PrioritySelectionBean.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PrioritySelectionBean(String str, String str2, boolean z, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z, i, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
    }
}
