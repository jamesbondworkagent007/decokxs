package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DappSignArgs implements Parcelable {
    public static final String APTOS_SIGN_NONCE_MESSAGE = "aptosSignNonceMessage";
    public static final String BTC_MESSAGE = "btc_message";
    public static final String BTC_PSBT = "btc_psbt";
    public static final String BTC_PSBTS = "btc_psbts";
    public static final String ETH_SIGN = "eth_sign";
    public static final String SIGN_PERSONALMESSAGE = "signPersonalMessage";
    public static final String SIGN_TYPEDMESSAGE = "signTypedMessage";
    private final boolean addPrefix;
    private final String chainId;
    private final PlatformItem dapp;
    private String data;
    private final DexDappSubSignArgs dexDappSubSignArgs;
    private final String from;
    private boolean isPersonSign;
    private final String method;
    private MpcSignType mpcSignType;
    private Boolean needBroadcast;
    private final NostrSignType nostrSignType;
    private final String raw;
    private final SignType signType;
    private final String signTypedDataVersion;
    private final boolean solSignDappMessages;
    private final Integer source;
    private final boolean useNewCallback;
    private final TronSignMethodVersion version;
    private final String walletId;
    private final String wcAuthRequestIssuer;
    private final Long wcId;
    private final String wcTopic;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappSignArgs> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappSignArgs> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappSignArgs createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            PlatformItem platformItemCreateFromParcel = parcel.readInt() == 0 ? null : PlatformItem.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            MpcSignType mpcSignTypeValueOf = MpcSignType.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            SignType signTypeValueOf = parcel.readInt() == 0 ? null : SignType.valueOf(parcel.readString());
            DexDappSubSignArgs dexDappSubSignArgsCreateFromParcel = parcel.readInt() == 0 ? null : DexDappSubSignArgs.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            TronSignMethodVersion tronSignMethodVersionValueOf = parcel.readInt() == 0 ? null : TronSignMethodVersion.valueOf(parcel.readString());
            boolean z4 = parcel.readInt() != 0;
            NostrSignType nostrSignTypeValueOf = NostrSignType.valueOf(parcel.readString());
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DappSignArgs(string, string2, platformItemCreateFromParcel, string3, mpcSignTypeValueOf, z, numValueOf, string4, lValueOf, string5, z2, z3, string6, signTypeValueOf, dexDappSubSignArgsCreateFromParcel, string7, string8, tronSignMethodVersionValueOf, z4, nostrSignTypeValueOf, string9, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappSignArgs[] newArray(int i) {
            return new DappSignArgs[i];
        }
    }

    public static /* synthetic */ void isPersonSign$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.wcTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.useNewCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.solSignDappMessages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignType component14() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexDappSubSignArgs component15() {
        return this.dexDappSubSignArgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.raw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.wcAuthRequestIssuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronSignMethodVersion component18() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.addPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NostrSignType component20() {
        return this.nostrSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.signTypedDataVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component22() {
        return this.needBroadcast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem component3() {
        return this.dapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcSignType component5() {
        return this.mpcSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isPersonSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.wcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappSignArgs copy(@NotNull String str, @NotNull String str2, PlatformItem platformItem, @NotNull String str3, @NotNull MpcSignType mpcSignType, boolean z, Integer num, String str4, Long l, String str5, boolean z2, boolean z3, String str6, SignType signType, DexDappSubSignArgs dexDappSubSignArgs, String str7, String str8, TronSignMethodVersion tronSignMethodVersion, boolean z4, @NotNull NostrSignType nostrSignType, String str9, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(mpcSignType, "");
        Intrinsics.checkNotNullParameter(nostrSignType, "");
        return new DappSignArgs(str, str2, platformItem, str3, mpcSignType, z, num, str4, l, str5, z2, z3, str6, signType, dexDappSubSignArgs, str7, str8, tronSignMethodVersion, z4, nostrSignType, str9, bool);
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
        if (!(obj instanceof DappSignArgs)) {
            return false;
        }
        DappSignArgs dappSignArgs = (DappSignArgs) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) dappSignArgs.walletId) && Intrinsics.EZpvd((Object) this.chainId, (Object) dappSignArgs.chainId) && Intrinsics.EZpvd(this.dapp, dappSignArgs.dapp) && Intrinsics.EZpvd((Object) this.data, (Object) dappSignArgs.data) && this.mpcSignType == dappSignArgs.mpcSignType && this.isPersonSign == dappSignArgs.isPersonSign && Intrinsics.EZpvd(this.source, dappSignArgs.source) && Intrinsics.EZpvd((Object) this.from, (Object) dappSignArgs.from) && Intrinsics.EZpvd(this.wcId, dappSignArgs.wcId) && Intrinsics.EZpvd((Object) this.wcTopic, (Object) dappSignArgs.wcTopic) && this.useNewCallback == dappSignArgs.useNewCallback && this.solSignDappMessages == dappSignArgs.solSignDappMessages && Intrinsics.EZpvd((Object) this.method, (Object) dappSignArgs.method) && this.signType == dappSignArgs.signType && Intrinsics.EZpvd(this.dexDappSubSignArgs, dappSignArgs.dexDappSubSignArgs) && Intrinsics.EZpvd((Object) this.raw, (Object) dappSignArgs.raw) && Intrinsics.EZpvd((Object) this.wcAuthRequestIssuer, (Object) dappSignArgs.wcAuthRequestIssuer) && this.version == dappSignArgs.version && this.addPrefix == dappSignArgs.addPrefix && this.nostrSignType == dappSignArgs.nostrSignType && Intrinsics.EZpvd((Object) this.signTypedDataVersion, (Object) dappSignArgs.signTypedDataVersion) && Intrinsics.EZpvd(this.needBroadcast, dappSignArgs.needBroadcast);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAddPrefix() {
        return this.addPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem getDapp() {
        return this.dapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexDappSubSignArgs getDexDappSubSignArgs() {
        return this.dexDappSubSignArgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcSignType getMpcSignType() {
        return this.mpcSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedBroadcast() {
        return this.needBroadcast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NostrSignType getNostrSignType() {
        return this.nostrSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRaw() {
        return this.raw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignType getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignTypedDataVersion() {
        return this.signTypedDataVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSolSignDappMessages() {
        return this.solSignDappMessages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseNewCallback() {
        return this.useNewCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronSignMethodVersion getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWcAuthRequestIssuer() {
        return this.wcAuthRequestIssuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getWcId() {
        return this.wcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWcTopic() {
        return this.wcTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletId.hashCode();
        int iHashCode2 = this.chainId.hashCode();
        PlatformItem platformItem = this.dapp;
        int iHashCode3 = platformItem == null ? 0 : platformItem.hashCode();
        int iHashCode4 = this.data.hashCode();
        int iHashCode5 = this.mpcSignType.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isPersonSign);
        Integer num = this.source;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        String str = this.from;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        Long l = this.wcId;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        String str2 = this.wcTopic;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        int iHashCode11 = Boolean.hashCode(this.useNewCallback);
        int iHashCode12 = Boolean.hashCode(this.solSignDappMessages);
        String str3 = this.method;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        SignType signType = this.signType;
        int iHashCode14 = signType == null ? 0 : signType.hashCode();
        DexDappSubSignArgs dexDappSubSignArgs = this.dexDappSubSignArgs;
        int iHashCode15 = dexDappSubSignArgs == null ? 0 : dexDappSubSignArgs.hashCode();
        String str4 = this.raw;
        int iHashCode16 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.wcAuthRequestIssuer;
        int iHashCode17 = str5 == null ? 0 : str5.hashCode();
        TronSignMethodVersion tronSignMethodVersion = this.version;
        int iHashCode18 = tronSignMethodVersion == null ? 0 : tronSignMethodVersion.hashCode();
        int iHashCode19 = Boolean.hashCode(this.addPrefix);
        int iHashCode20 = this.nostrSignType.hashCode();
        String str6 = this.signTypedDataVersion;
        int iHashCode21 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.needBroadcast;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPersonSign() {
        return this.isPersonSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMpcSignType(@NotNull MpcSignType mpcSignType) {
        Intrinsics.checkNotNullParameter(mpcSignType, "");
        this.mpcSignType = mpcSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedBroadcast(Boolean bool) {
        this.needBroadcast = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPersonSign(boolean z) {
        this.isPersonSign = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappSignArgs(walletId=" + this.walletId + ", chainId=" + this.chainId + ", dapp=" + this.dapp + ", data=" + this.data + ", mpcSignType=" + this.mpcSignType + ", isPersonSign=" + this.isPersonSign + ", source=" + this.source + ", from=" + this.from + ", wcId=" + this.wcId + ", wcTopic=" + this.wcTopic + ", useNewCallback=" + this.useNewCallback + ", solSignDappMessages=" + this.solSignDappMessages + ", method=" + this.method + ", signType=" + this.signType + ", dexDappSubSignArgs=" + this.dexDappSubSignArgs + ", raw=" + this.raw + ", wcAuthRequestIssuer=" + this.wcAuthRequestIssuer + ", version=" + this.version + ", addPrefix=" + this.addPrefix + ", nostrSignType=" + this.nostrSignType + ", signTypedDataVersion=" + this.signTypedDataVersion + ", needBroadcast=" + this.needBroadcast + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletId);
        parcel.writeString(this.chainId);
        PlatformItem platformItem = this.dapp;
        if (platformItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformItem.writeToParcel(parcel, i);
        }
        parcel.writeString(this.data);
        parcel.writeString(this.mpcSignType.name());
        parcel.writeInt(this.isPersonSign ? 1 : 0);
        Integer num = this.source;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.from);
        Long l = this.wcId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.wcTopic);
        parcel.writeInt(this.useNewCallback ? 1 : 0);
        parcel.writeInt(this.solSignDappMessages ? 1 : 0);
        parcel.writeString(this.method);
        SignType signType = this.signType;
        if (signType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(signType.name());
        }
        DexDappSubSignArgs dexDappSubSignArgs = this.dexDappSubSignArgs;
        if (dexDappSubSignArgs == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexDappSubSignArgs.writeToParcel(parcel, i);
        }
        parcel.writeString(this.raw);
        parcel.writeString(this.wcAuthRequestIssuer);
        TronSignMethodVersion tronSignMethodVersion = this.version;
        if (tronSignMethodVersion == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tronSignMethodVersion.name());
        }
        parcel.writeInt(this.addPrefix ? 1 : 0);
        parcel.writeString(this.nostrSignType.name());
        parcel.writeString(this.signTypedDataVersion);
        Boolean bool = this.needBroadcast;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public DappSignArgs(@NotNull String str, @NotNull String str2, PlatformItem platformItem, @NotNull String str3, @NotNull MpcSignType mpcSignType, boolean z, Integer num, String str4, Long l, String str5, boolean z2, boolean z3, String str6, SignType signType, DexDappSubSignArgs dexDappSubSignArgs, String str7, String str8, TronSignMethodVersion tronSignMethodVersion, boolean z4, @NotNull NostrSignType nostrSignType, String str9, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(mpcSignType, "");
        Intrinsics.checkNotNullParameter(nostrSignType, "");
        this.walletId = str;
        this.chainId = str2;
        this.dapp = platformItem;
        this.data = str3;
        this.mpcSignType = mpcSignType;
        this.isPersonSign = z;
        this.source = num;
        this.from = str4;
        this.wcId = l;
        this.wcTopic = str5;
        this.useNewCallback = z2;
        this.solSignDappMessages = z3;
        this.method = str6;
        this.signType = signType;
        this.dexDappSubSignArgs = dexDappSubSignArgs;
        this.raw = str7;
        this.wcAuthRequestIssuer = str8;
        this.version = tronSignMethodVersion;
        this.addPrefix = z4;
        this.nostrSignType = nostrSignType;
        this.signTypedDataVersion = str9;
        this.needBroadcast = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00cd: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r49v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (r28v0 java.lang.String)
  (wrap:com.okinc.business.defi.api.bean.PlatformItem:?: TERNARY null = ((wrap:int:0x000c: ARITH (r49v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.PlatformItem) : (r29v0 com.okinc.business.defi.api.bean.PlatformItem))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r49v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.MpcSignType:?: TERNARY null = ((wrap:int:0x001d: ARITH (r49v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] (LINE:228) com.okinc.business.defi.api.bean.MpcSignType.NORMAL com.okinc.business.defi.api.bean.MpcSignType) : (r31v0 com.okinc.business.defi.api.bean.MpcSignType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r49v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r32v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0030: ARITH (r49v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r33v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r49v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0040: ARITH (r49v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r35v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r49v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r49v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0059: ARITH (r49v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r38v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r49v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.SignType:?: TERNARY null = ((wrap:int:0x006a: ARITH (r49v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.SignType) : (r40v0 com.okinc.business.defi.api.bean.SignType))
  (wrap:com.okinc.business.defi.api.bean.DexDappSubSignArgs:?: TERNARY null = ((wrap:int:0x0073: ARITH (r49v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.DexDappSubSignArgs) : (r41v0 com.okinc.business.defi.api.bean.DexDappSubSignArgs))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007f: ARITH (32768 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (65536 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.TronSignMethodVersion:?: TERNARY null = ((wrap:int:0x0093: ARITH (131072 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.TronSignMethodVersion) : (r44v0 com.okinc.business.defi.api.bean.TronSignMethodVersion))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009d: ARITH (262144 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:com.okinc.business.defi.api.bean.NostrSignType:?: TERNARY null = ((wrap:int:0x00a7: ARITH (524288 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ac: SGET  A[WRAPPED] (LINE:244) com.okinc.business.defi.api.bean.NostrSignType.MESSAGE com.okinc.business.defi.api.bean.NostrSignType) : (r46v0 com.okinc.business.defi.api.bean.NostrSignType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (1048576 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? ("V4") : (r47v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r49v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c4: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r48v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, com.okinc.business.defi.api.bean.MpcSignType, boolean, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, boolean, boolean, java.lang.String, com.okinc.business.defi.api.bean.SignType, com.okinc.business.defi.api.bean.DexDappSubSignArgs, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.TronSignMethodVersion, boolean, com.okinc.business.defi.api.bean.NostrSignType, java.lang.String, java.lang.Boolean):void (m)] (LINE:223) call: com.okinc.business.defi.api.bean.DappSignArgs.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, com.okinc.business.defi.api.bean.MpcSignType, boolean, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, boolean, boolean, java.lang.String, com.okinc.business.defi.api.bean.SignType, com.okinc.business.defi.api.bean.DexDappSubSignArgs, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.TronSignMethodVersion, boolean, com.okinc.business.defi.api.bean.NostrSignType, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ DappSignArgs(String str, String str2, PlatformItem platformItem, String str3, MpcSignType mpcSignType, boolean z, Integer num, String str4, Long l, String str5, boolean z2, boolean z3, String str6, SignType signType, DexDappSubSignArgs dexDappSubSignArgs, String str7, String str8, TronSignMethodVersion tronSignMethodVersion, boolean z4, NostrSignType nostrSignType, String str9, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? null : platformItem, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? MpcSignType.NORMAL : mpcSignType, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : signType, (i & 16384) != 0 ? null : dexDappSubSignArgs, (32768 & i) != 0 ? "" : str7, (65536 & i) != 0 ? null : str8, (131072 & i) != 0 ? null : tronSignMethodVersion, (262144 & i) != 0 ? false : z4, (524288 & i) != 0 ? NostrSignType.MESSAGE : nostrSignType, (1048576 & i) != 0 ? "V4" : str9, (i & 2097152) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0095: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (r23v0 java.lang.String)
  (wrap:com.okinc.business.defi.api.bean.PlatformItem:?: TERNARY null = ((wrap:int:0x000c: ARITH (r39v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.PlatformItem) : (r24v0 com.okinc.business.defi.api.bean.PlatformItem))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r39v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r39v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r39v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r27v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r39v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r29v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r39v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.SignType:?: TERNARY null = ((wrap:int:0x0057: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.SignType) : (r33v0 com.okinc.business.defi.api.bean.SignType))
  (wrap:com.okinc.business.defi.api.bean.DexDappSubSignArgs:?: TERNARY null = ((wrap:int:0x005f: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.DexDappSubSignArgs) : (r34v0 com.okinc.business.defi.api.bean.DexDappSubSignArgs))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r39v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.TronSignMethodVersion:?: TERNARY null = ((wrap:int:0x0071: ARITH (r39v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.TronSignMethodVersion) : (r36v0 com.okinc.business.defi.api.bean.TronSignMethodVersion))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (32768 int) & (r39v0 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:com.okinc.business.defi.api.bean.MpcSignType:?: TERNARY null = ((wrap:int:0x0087: ARITH (r39v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008c: SGET  A[WRAPPED] (LINE:266) com.okinc.business.defi.api.bean.MpcSignType.NORMAL com.okinc.business.defi.api.bean.MpcSignType) : (r38v0 com.okinc.business.defi.api.bean.MpcSignType))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.Long, boolean, boolean, java.lang.String, com.okinc.business.defi.api.bean.SignType, com.okinc.business.defi.api.bean.DexDappSubSignArgs, java.lang.String, com.okinc.business.defi.api.bean.TronSignMethodVersion, boolean, com.okinc.business.defi.api.bean.MpcSignType):void (m)] (LINE:248) call: com.okinc.business.defi.api.bean.DappSignArgs.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.PlatformItem, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.Long, boolean, boolean, java.lang.String, com.okinc.business.defi.api.bean.SignType, com.okinc.business.defi.api.bean.DexDappSubSignArgs, java.lang.String, com.okinc.business.defi.api.bean.TronSignMethodVersion, boolean, com.okinc.business.defi.api.bean.MpcSignType):void type: THIS */
    public /* synthetic */ DappSignArgs(String str, String str2, PlatformItem platformItem, String str3, boolean z, Integer num, String str4, Long l, boolean z2, boolean z3, String str5, SignType signType, DexDappSubSignArgs dexDappSubSignArgs, String str6, TronSignMethodVersion tronSignMethodVersion, boolean z4, MpcSignType mpcSignType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? null : platformItem, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : l, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : signType, (i & 4096) != 0 ? null : dexDappSubSignArgs, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : tronSignMethodVersion, (32768 & i) != 0 ? false : z4, (i & 65536) != 0 ? MpcSignType.NORMAL : mpcSignType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DappSignArgs(@NotNull String str, @NotNull String str2, PlatformItem platformItem, @NotNull String str3, boolean z, Integer num, String str4, Long l, boolean z2, boolean z3, String str5, SignType signType, DexDappSubSignArgs dexDappSubSignArgs, String str6, TronSignMethodVersion tronSignMethodVersion, boolean z4, @NotNull MpcSignType mpcSignType) {
        this(str, str2, platformItem, str3, mpcSignType, z, num, str4, l, null, z2, z3, str5, signType, dexDappSubSignArgs, str6, null, tronSignMethodVersion, z4, null, null, null, 3670016, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(mpcSignType, "");
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.DappSignArgs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
