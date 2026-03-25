package com.okinc.business.market.data.model;

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
public final class SupportMemeModeBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String supportMemeMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportMemeModeBean() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportMemeModeBean copy$default(SupportMemeModeBean supportMemeModeBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportMemeModeBean.supportMemeMode;
        }
        return supportMemeModeBean.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.supportMemeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportMemeModeBean copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SupportMemeModeBean(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportMemeModeBean) && Intrinsics.EZpvd((Object) this.supportMemeMode, (Object) ((SupportMemeModeBean) obj).supportMemeMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportMemeMode() {
        return this.supportMemeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.supportMemeMode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportMemeModeBean(supportMemeMode=" + this.supportMemeMode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.SupportMemeModeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportMemeModeBean> serializer() {
            return SupportMemeModeBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportMemeModeBean(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.supportMemeMode = "";
        } else {
            this.supportMemeMode = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SupportMemeModeBean supportMemeModeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) supportMemeModeBean.supportMemeMode, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, supportMemeModeBean.supportMemeMode);
    }

    public SupportMemeModeBean(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.supportMemeMode = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:57) call: com.okinc.business.market.data.model.SupportMemeModeBean.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ SupportMemeModeBean(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
