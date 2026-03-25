package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class AssetCommonInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final int helpLabelType;
    private final boolean showPendingTag;
    private final String subDesc;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetCommonInfoData() {
        this((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AssetCommonInfoData copy$default(AssetCommonInfoData assetCommonInfoData, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = assetCommonInfoData.title;
        }
        if ((i2 & 2) != 0) {
            str2 = assetCommonInfoData.content;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = assetCommonInfoData.subDesc;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = assetCommonInfoData.helpLabelType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = assetCommonInfoData.showPendingTag;
        }
        return assetCommonInfoData.copy(str, str4, str5, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.helpLabelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.showPendingTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetCommonInfoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AssetCommonInfoData(str, str2, str3, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetCommonInfoData)) {
            return false;
        }
        AssetCommonInfoData assetCommonInfoData = (AssetCommonInfoData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) assetCommonInfoData.title) && Intrinsics.EZpvd((Object) this.content, (Object) assetCommonInfoData.content) && Intrinsics.EZpvd((Object) this.subDesc, (Object) assetCommonInfoData.subDesc) && this.helpLabelType == assetCommonInfoData.helpLabelType && this.showPendingTag == assetCommonInfoData.showPendingTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHelpLabelType() {
        return this.helpLabelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowPendingTag() {
        return this.showPendingTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubDesc() {
        return this.subDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.subDesc.hashCode()) * 31) + Integer.hashCode(this.helpLabelType)) * 31) + Boolean.hashCode(this.showPendingTag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetCommonInfoData(title=" + this.title + ", content=" + this.content + ", subDesc=" + this.subDesc + ", helpLabelType=" + this.helpLabelType + ", showPendingTag=" + this.showPendingTag + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AssetCommonInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetCommonInfoData> serializer() {
            return AssetCommonInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetCommonInfoData(int i, String str, String str2, String str3, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i & 4) == 0) {
            this.subDesc = "";
        } else {
            this.subDesc = str3;
        }
        if ((i & 8) == 0) {
            this.helpLabelType = 2;
        } else {
            this.helpLabelType = i2;
        }
        if ((i & 16) == 0) {
            this.showPendingTag = false;
        } else {
            this.showPendingTag = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AssetCommonInfoData assetCommonInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetCommonInfoData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, assetCommonInfoData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetCommonInfoData.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, assetCommonInfoData.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetCommonInfoData.subDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, assetCommonInfoData.subDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || assetCommonInfoData.helpLabelType != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, assetCommonInfoData.helpLabelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || assetCommonInfoData.showPendingTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, assetCommonInfoData.showPendingTag);
        }
    }

    public AssetCommonInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.content = str2;
        this.subDesc = str3;
        this.helpLabelType = i;
        this.showPendingTag = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:int:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r7v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, boolean):void (m)] (LINE:92) call: com.okinc.unify_trade.biz.AssetCommonInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ AssetCommonInfoData(String str, String str2, String str3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? 2 : i, (i2 & 16) != 0 ? false : z);
    }
}
