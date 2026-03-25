package com.okinc.business.invest_biz.data.bean.response;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class AdditionalData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final Info info;
    public final String key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdditionalData() {
        this((Info) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdditionalData copy$default(AdditionalData additionalData, Info info, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            info = additionalData.info;
        }
        if ((i & 2) != 0) {
            str = additionalData.key;
        }
        return additionalData.EZpvd(info, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdditionalData EZpvd(@NotNull Info info, @NotNull String str) {
        Intrinsics.checkNotNullParameter(info, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new AdditionalData(info, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Info copydefault() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalData)) {
            return false;
        }
        AdditionalData additionalData = (AdditionalData) obj;
        return Intrinsics.EZpvd(this.info, additionalData.info) && Intrinsics.EZpvd((Object) this.key, (Object) additionalData.key);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.info.hashCode() * 31) + this.key.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdditionalData(info=" + this.info + ", key=" + this.key + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.AdditionalData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdditionalData> serializer() {
            return AdditionalData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdditionalData(int i, Info info, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.info = (i & 1) == 0 ? new Info((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : info;
        if ((i & 2) == 0) {
            this.key = "";
        } else {
            this.key = str;
        }
    }

    public static final /* synthetic */ void KWHzl(AdditionalData additionalData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(additionalData.info, new Info((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, Info$$serializer.INSTANCE, additionalData.info);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) additionalData.key, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, additionalData.key);
    }

    public AdditionalData(@NotNull Info info, @NotNull String str) {
        Intrinsics.checkNotNullParameter(info, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.info = info;
        this.key = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.response.Info:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.bean.response.Info:0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:204) call: com.okinc.business.invest_biz.data.bean.response.Info.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.invest_biz.data.bean.response.Info))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.bean.response.Info, java.lang.String):void (m)] (LINE:202) call: com.okinc.business.invest_biz.data.bean.response.AdditionalData.<init>(com.okinc.business.invest_biz.data.bean.response.Info, java.lang.String):void type: THIS */
    public /* synthetic */ AdditionalData(Info info, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Info((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : info, (i & 2) != 0 ? "" : str);
    }
}
