package com.okinc.business.market.features.meme.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class XMediaWsData {
    public static final int $stable = 0;
    private final XPostType type;
    private final String url;
    private final String xTime;
    private final String xrenameCnt;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, XPostType.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XMediaWsData() {
        this((String) null, (XPostType) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ XMediaWsData copy$default(XMediaWsData xMediaWsData, String str, XPostType xPostType, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xMediaWsData.url;
        }
        if ((i & 2) != 0) {
            xPostType = xMediaWsData.type;
        }
        if ((i & 4) != 0) {
            str2 = xMediaWsData.xTime;
        }
        if ((i & 8) != 0) {
            str3 = xMediaWsData.xrenameCnt;
        }
        return xMediaWsData.copy(str, xPostType, str2, str3);
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @SerialName("xTime")
    public static /* synthetic */ void getXTime$annotations() {
    }

    @SerialName("xrenameCnt")
    public static /* synthetic */ void getXrenameCnt$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XPostType component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.xTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.xrenameCnt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XMediaWsData copy(@NotNull String str, XPostType xPostType, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new XMediaWsData(str, xPostType, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XMediaWsData)) {
            return false;
        }
        XMediaWsData xMediaWsData = (XMediaWsData) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) xMediaWsData.url) && this.type == xMediaWsData.type && Intrinsics.EZpvd((Object) this.xTime, (Object) xMediaWsData.xTime) && Intrinsics.EZpvd((Object) this.xrenameCnt, (Object) xMediaWsData.xrenameCnt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XPostType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXTime() {
        return this.xTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXrenameCnt() {
        return this.xrenameCnt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.url.hashCode();
        XPostType xPostType = this.type;
        return (((((iHashCode * 31) + (xPostType == null ? 0 : xPostType.hashCode())) * 31) + this.xTime.hashCode()) * 31) + this.xrenameCnt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "XMediaWsData(url=" + this.url + ", type=" + this.type + ", xTime=" + this.xTime + ", xrenameCnt=" + this.xrenameCnt + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.XMediaWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<XMediaWsData> serializer() {
            return XMediaWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XMediaWsData(int i, String str, XPostType xPostType, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = xPostType;
        }
        if ((i & 4) == 0) {
            this.xTime = "";
        } else {
            this.xTime = str2;
        }
        if ((i & 8) == 0) {
            this.xrenameCnt = "";
        } else {
            this.xrenameCnt = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(XMediaWsData xMediaWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) xMediaWsData.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, xMediaWsData.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || xMediaWsData.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], xMediaWsData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) xMediaWsData.xTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, xMediaWsData.xTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) xMediaWsData.xrenameCnt, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, xMediaWsData.xrenameCnt);
    }

    public XMediaWsData(@NotNull String str, XPostType xPostType, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.url = str;
        this.type = xPostType;
        this.xTime = str2;
        this.xrenameCnt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.data.model.XPostType:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.XPostType) : (r3v0 com.okinc.business.market.features.meme.data.model.XPostType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.market.features.meme.data.model.XPostType, java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.business.market.features.meme.data.model.XMediaWsData.<init>(java.lang.String, com.okinc.business.market.features.meme.data.model.XPostType, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ XMediaWsData(String str, XPostType xPostType, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : xPostType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
