package com.okinc.tradeapi.common_function.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class CommonFunctionItemBean {
    private int iconId;
    private final Boolean isAutoMirror;
    private boolean isSelect;
    private String title;
    private final String uniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonFunctionItemBean() {
        this((String) null, 0, false, (Boolean) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIconId() {
        return this.iconId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAutoMirror() {
        return this.isAutoMirror;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconId(int i) {
        this.iconId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeapi.common_function.bean.CommonFunctionItemBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonFunctionItemBean> serializer() {
            return CommonFunctionItemBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommonFunctionItemBean(int i, String str, int i2, boolean z, Boolean bool, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.iconId = 0;
        } else {
            this.iconId = i2;
        }
        if ((i & 4) == 0) {
            this.isSelect = false;
        } else {
            this.isSelect = z;
        }
        if ((i & 8) == 0) {
            this.isAutoMirror = null;
        } else {
            this.isAutoMirror = bool;
        }
        if ((i & 16) == 0) {
            this.uniqueId = null;
        } else {
            this.uniqueId = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTrade_trade_api(CommonFunctionItemBean commonFunctionItemBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) commonFunctionItemBean.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, commonFunctionItemBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || commonFunctionItemBean.iconId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, commonFunctionItemBean.iconId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || commonFunctionItemBean.isSelect) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, commonFunctionItemBean.isSelect);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || commonFunctionItemBean.isAutoMirror != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, commonFunctionItemBean.isAutoMirror);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && commonFunctionItemBean.uniqueId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, commonFunctionItemBean.uniqueId);
    }

    public CommonFunctionItemBean(@NotNull String str, int i, boolean z, Boolean bool, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.iconId = i;
        this.isSelect = z;
        this.isAutoMirror = bool;
        this.uniqueId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 boolean) : false)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
 A[MD:(java.lang.String, int, boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:12) call: com.okinc.tradeapi.common_function.bean.CommonFunctionItemBean.<init>(java.lang.String, int, boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CommonFunctionItemBean(String str, int i, boolean z, Boolean bool, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? z : false, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : str2);
    }
}
