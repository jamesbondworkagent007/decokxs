package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CheckServiceOfflineBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String isLimitRegion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CheckServiceOfflineBean() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckServiceOfflineBean copy$default(CheckServiceOfflineBean checkServiceOfflineBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkServiceOfflineBean.isLimitRegion;
        }
        return checkServiceOfflineBean.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.isLimitRegion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckServiceOfflineBean copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckServiceOfflineBean(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckServiceOfflineBean) && Intrinsics.EZpvd((Object) this.isLimitRegion, (Object) ((CheckServiceOfflineBean) obj).isLimitRegion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.isLimitRegion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isLimitRegion() {
        return this.isLimitRegion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckServiceOfflineBean(isLimitRegion=" + this.isLimitRegion + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CheckServiceOfflineBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckServiceOfflineBean> serializer() {
            return CheckServiceOfflineBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckServiceOfflineBean(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isLimitRegion = LimitRegion.NOT_LIMIT.getValue();
        } else {
            this.isLimitRegion = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CheckServiceOfflineBean checkServiceOfflineBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) checkServiceOfflineBean.isLimitRegion, (Object) LimitRegion.NOT_LIMIT.getValue())) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, checkServiceOfflineBean.isLimitRegion);
    }

    public CheckServiceOfflineBean(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isLimitRegion = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0006: INVOKE 
  (wrap:com.okinc.business.dexlogic.bean.LimitRegion:0x0004: SGET  A[WRAPPED] (LINE:17) com.okinc.business.dexlogic.bean.LimitRegion.NOT_LIMIT com.okinc.business.dexlogic.bean.LimitRegion)
 VIRTUAL call: com.okinc.business.dexlogic.bean.LimitRegion.getValue():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:17)) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:16) call: com.okinc.business.dexlogic.bean.CheckServiceOfflineBean.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ CheckServiceOfflineBean(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LimitRegion.NOT_LIMIT.getValue() : str);
    }

    public final boolean getIsLimitRegion() {
        return Intrinsics.EZpvd((Object) this.isLimitRegion, (Object) LimitRegion.LIMIT.getValue());
    }
}
