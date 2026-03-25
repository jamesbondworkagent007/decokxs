package com.okinc.business.trade.features.home.ui.meme.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class PresetUserConfigBean implements Parcelable {
    private final BuySellPreset buyPreset;
    private final String chainId;
    private final int id;
    private String name;
    private final String presetType;
    private final BuySellPreset sellPreset;
    private final boolean supportChangeName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PresetUserConfigBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PresetUserConfigBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PresetUserConfigBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<BuySellPreset> creator = BuySellPreset.CREATOR;
            return new PresetUserConfigBean(creator.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), creator.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PresetUserConfigBean[] newArray(int i) {
            return new PresetUserConfigBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PresetUserConfigBean() {
        this((BuySellPreset) null, (String) null, 0, (String) null, (String) null, (BuySellPreset) null, false, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PresetUserConfigBean copy$default(PresetUserConfigBean presetUserConfigBean, BuySellPreset buySellPreset, String str, int i, String str2, String str3, BuySellPreset buySellPreset2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            buySellPreset = presetUserConfigBean.buyPreset;
        }
        if ((i2 & 2) != 0) {
            str = presetUserConfigBean.chainId;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            i = presetUserConfigBean.id;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = presetUserConfigBean.name;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = presetUserConfigBean.presetType;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            buySellPreset2 = presetUserConfigBean.sellPreset;
        }
        BuySellPreset buySellPreset3 = buySellPreset2;
        if ((i2 & 64) != 0) {
            z = presetUserConfigBean.supportChangeName;
        }
        return presetUserConfigBean.copy(buySellPreset, str4, i3, str5, str6, buySellPreset3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPreset component1() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.presetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPreset component6() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.supportChangeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetUserConfigBean copy(@NotNull BuySellPreset buySellPreset, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull BuySellPreset buySellPreset2, boolean z) {
        Intrinsics.checkNotNullParameter(buySellPreset, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(buySellPreset2, "");
        return new PresetUserConfigBean(buySellPreset, str, i, str2, str3, buySellPreset2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresetUserConfigBean)) {
            return false;
        }
        PresetUserConfigBean presetUserConfigBean = (PresetUserConfigBean) obj;
        return Intrinsics.EZpvd(this.buyPreset, presetUserConfigBean.buyPreset) && Intrinsics.EZpvd((Object) this.chainId, (Object) presetUserConfigBean.chainId) && this.id == presetUserConfigBean.id && Intrinsics.EZpvd((Object) this.name, (Object) presetUserConfigBean.name) && Intrinsics.EZpvd((Object) this.presetType, (Object) presetUserConfigBean.presetType) && Intrinsics.EZpvd(this.sellPreset, presetUserConfigBean.sellPreset) && this.supportChangeName == presetUserConfigBean.supportChangeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPreset getBuyPreset() {
        return this.buyPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPresetType() {
        return this.presetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPreset getSellPreset() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportChangeName() {
        return this.supportChangeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.buyPreset.hashCode() * 31) + this.chainId.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + this.presetType.hashCode()) * 31) + this.sellPreset.hashCode()) * 31) + Boolean.hashCode(this.supportChangeName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PresetUserConfigBean(buyPreset=" + this.buyPreset + ", chainId=" + this.chainId + ", id=" + this.id + ", name=" + this.name + ", presetType=" + this.presetType + ", sellPreset=" + this.sellPreset + ", supportChangeName=" + this.supportChangeName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.buyPreset.writeToParcel(parcel, i);
        parcel.writeString(this.chainId);
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.presetType);
        this.sellPreset.writeToParcel(parcel, i);
        parcel.writeInt(this.supportChangeName ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PresetUserConfigBean> serializer() {
            return PresetUserConfigBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PresetUserConfigBean(int i, BuySellPreset buySellPreset, String str, int i2, String str2, String str3, BuySellPreset buySellPreset2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.buyPreset = (i & 1) == 0 ? new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null) : buySellPreset;
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 4) == 0) {
            this.id = 0;
        } else {
            this.id = i2;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 16) == 0) {
            this.presetType = "";
        } else {
            this.presetType = str3;
        }
        if ((i & 32) == 0) {
            this.sellPreset = new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.sellPreset = buySellPreset2;
        }
        if ((i & 64) == 0) {
            this.supportChangeName = false;
        } else {
            this.supportChangeName = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PresetUserConfigBean presetUserConfigBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(presetUserConfigBean.buyPreset, new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BuySellPreset$$serializer.INSTANCE, presetUserConfigBean.buyPreset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) presetUserConfigBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, presetUserConfigBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || presetUserConfigBean.id != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, presetUserConfigBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) presetUserConfigBean.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, presetUserConfigBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) presetUserConfigBean.presetType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, presetUserConfigBean.presetType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(presetUserConfigBean.sellPreset, new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, BuySellPreset$$serializer.INSTANCE, presetUserConfigBean.sellPreset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || presetUserConfigBean.supportChangeName) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, presetUserConfigBean.supportChangeName);
        }
    }

    public PresetUserConfigBean(@NotNull BuySellPreset buySellPreset, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull BuySellPreset buySellPreset2, boolean z) {
        Intrinsics.checkNotNullParameter(buySellPreset, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(buySellPreset2, "");
        this.buyPreset = buySellPreset;
        this.chainId = str;
        this.id = i;
        this.name = str2;
        this.presetType = str3;
        this.sellPreset = buySellPreset2;
        this.supportChangeName = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005f: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000c: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.FeeConfig:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.FeeConfig) (null com.okinc.business.trade.features.home.ui.meme.data.FeeConfig))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.RouteConfig:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.RouteConfig) (null com.okinc.business.trade.features.home.ui.meme.data.RouteConfig))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset) (null com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:43) call: com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset.<init>(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r13v0 com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r20v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset:?: TERNARY null = ((wrap:int:0x0031: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.FeeConfig:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.FeeConfig) (null com.okinc.business.trade.features.home.ui.meme.data.FeeConfig))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.RouteConfig:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.RouteConfig) (null com.okinc.business.trade.features.home.ui.meme.data.RouteConfig))
  (wrap:com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset:?: CAST (com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset) (null com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:48) call: com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset.<init>(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r20v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
 A[MD:(com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset, java.lang.String, int, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset, boolean):void (m)] (LINE:42) call: com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean.<init>(com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset, java.lang.String, int, java.lang.String, java.lang.String, com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset, boolean):void type: THIS */
    public /* synthetic */ PresetUserConfigBean(BuySellPreset buySellPreset, String str, int i, String str2, String str3, BuySellPreset buySellPreset2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null) : buySellPreset, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2, (i2 & 16) == 0 ? str3 : "", (i2 & 32) != 0 ? new BuySellPreset((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null) : buySellPreset2, (i2 & 64) == 0 ? z : false);
    }
}
