package com.okinc.business.dexlogic.bean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class MemeSimplePushBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final MemeSimpleDexData dexData;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeSimplePushBean() {
        this((MemeSimpleDexData) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeSimplePushBean copy$default(MemeSimplePushBean memeSimplePushBean, MemeSimpleDexData memeSimpleDexData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            memeSimpleDexData = memeSimplePushBean.dexData;
        }
        if ((i & 2) != 0) {
            str = memeSimplePushBean.type;
        }
        return memeSimplePushBean.copy(memeSimpleDexData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeSimpleDexData component1() {
        return this.dexData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeSimplePushBean copy(@NotNull MemeSimpleDexData memeSimpleDexData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(memeSimpleDexData, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new MemeSimplePushBean(memeSimpleDexData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeSimplePushBean)) {
            return false;
        }
        MemeSimplePushBean memeSimplePushBean = (MemeSimplePushBean) obj;
        return Intrinsics.EZpvd(this.dexData, memeSimplePushBean.dexData) && Intrinsics.EZpvd((Object) this.type, (Object) memeSimplePushBean.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeSimpleDexData getDexData() {
        return this.dexData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.dexData.hashCode() * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeSimplePushBean(dexData=" + this.dexData + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MemeSimplePushBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeSimplePushBean> serializer() {
            return MemeSimplePushBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeSimplePushBean(int i, MemeSimpleDexData memeSimpleDexData, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.dexData = (i & 1) == 0 ? new MemeSimpleDexData((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : memeSimpleDexData;
        this.type = (i & 2) == 0 ? "" : str;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeSimplePushBean memeSimplePushBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(memeSimplePushBean.dexData, new MemeSimpleDexData((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, MemeSimpleDexData$$serializer.INSTANCE, memeSimplePushBean.dexData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) memeSimplePushBean.type, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, memeSimplePushBean.type);
    }

    public MemeSimplePushBean(@NotNull MemeSimpleDexData memeSimpleDexData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(memeSimpleDexData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.dexData = memeSimpleDexData;
        this.type = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.MemeSimpleDexData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Boolean:?: CAST (java.lang.Boolean) (null java.lang.Boolean))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:int:SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:15) call: com.okinc.business.dexlogic.bean.MemeSimpleDexData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r14v0 com.okinc.business.dexlogic.bean.MemeSimpleDexData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
 A[MD:(com.okinc.business.dexlogic.bean.MemeSimpleDexData, java.lang.String):void (m)] (LINE:14) call: com.okinc.business.dexlogic.bean.MemeSimplePushBean.<init>(com.okinc.business.dexlogic.bean.MemeSimpleDexData, java.lang.String):void type: THIS */
    public /* synthetic */ MemeSimplePushBean(MemeSimpleDexData memeSimpleDexData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MemeSimpleDexData((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : memeSimpleDexData, (i & 2) != 0 ? "" : str);
    }
}
