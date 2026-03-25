package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappCheckUrlLevel implements Parcelable {
    private OKCheckLeveldappInfo dappInfo;
    private String newLevel;
    private String rule;
    private boolean searchHistoryUrlIsBlack;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappCheckUrlLevel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappCheckUrlLevel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappCheckUrlLevel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DappCheckUrlLevel(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : OKCheckLeveldappInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappCheckUrlLevel[] newArray(int i) {
            return new DappCheckUrlLevel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappCheckUrlLevel() {
        this((String) null, (String) null, false, (OKCheckLeveldappInfo) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DappCheckUrlLevel copy$default(DappCheckUrlLevel dappCheckUrlLevel, String str, String str2, boolean z, OKCheckLeveldappInfo oKCheckLeveldappInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dappCheckUrlLevel.newLevel;
        }
        if ((i & 2) != 0) {
            str2 = dappCheckUrlLevel.rule;
        }
        if ((i & 4) != 0) {
            z = dappCheckUrlLevel.searchHistoryUrlIsBlack;
        }
        if ((i & 8) != 0) {
            oKCheckLeveldappInfo = dappCheckUrlLevel.dappInfo;
        }
        return dappCheckUrlLevel.copy(str, str2, z, oKCheckLeveldappInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.newLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.searchHistoryUrlIsBlack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCheckLeveldappInfo component4() {
        return this.dappInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappCheckUrlLevel copy(@NotNull String str, String str2, boolean z, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DappCheckUrlLevel(str, str2, z, oKCheckLeveldappInfo);
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
        if (!(obj instanceof DappCheckUrlLevel)) {
            return false;
        }
        DappCheckUrlLevel dappCheckUrlLevel = (DappCheckUrlLevel) obj;
        return Intrinsics.EZpvd((Object) this.newLevel, (Object) dappCheckUrlLevel.newLevel) && Intrinsics.EZpvd((Object) this.rule, (Object) dappCheckUrlLevel.rule) && this.searchHistoryUrlIsBlack == dappCheckUrlLevel.searchHistoryUrlIsBlack && Intrinsics.EZpvd(this.dappInfo, dappCheckUrlLevel.dappInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCheckLeveldappInfo getDappInfo() {
        return this.dappInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewLevel() {
        return this.newLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRule() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSearchHistoryUrlIsBlack() {
        return this.searchHistoryUrlIsBlack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.newLevel.hashCode();
        String str = this.rule;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Boolean.hashCode(this.searchHistoryUrlIsBlack);
        OKCheckLeveldappInfo oKCheckLeveldappInfo = this.dappInfo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (oKCheckLeveldappInfo != null ? oKCheckLeveldappInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappInfo(OKCheckLeveldappInfo oKCheckLeveldappInfo) {
        this.dappInfo = oKCheckLeveldappInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.newLevel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRule(String str) {
        this.rule = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSearchHistoryUrlIsBlack(boolean z) {
        this.searchHistoryUrlIsBlack = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappCheckUrlLevel(newLevel=" + this.newLevel + ", rule=" + this.rule + ", searchHistoryUrlIsBlack=" + this.searchHistoryUrlIsBlack + ", dappInfo=" + this.dappInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.newLevel);
        parcel.writeString(this.rule);
        parcel.writeInt(this.searchHistoryUrlIsBlack ? 1 : 0);
        OKCheckLeveldappInfo oKCheckLeveldappInfo = this.dappInfo;
        if (oKCheckLeveldappInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oKCheckLeveldappInfo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.DappCheckUrlLevel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappCheckUrlLevel> serializer() {
            return DappCheckUrlLevel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappCheckUrlLevel(int i, String str, String str2, boolean z, OKCheckLeveldappInfo oKCheckLeveldappInfo, SerializationConstructorMarker serializationConstructorMarker) {
        this.newLevel = (i & 1) == 0 ? "SAFE" : str;
        if ((i & 2) == 0) {
            this.rule = "";
        } else {
            this.rule = str2;
        }
        if ((i & 4) == 0) {
            this.searchHistoryUrlIsBlack = false;
        } else {
            this.searchHistoryUrlIsBlack = z;
        }
        if ((i & 8) == 0) {
            this.dappInfo = null;
        } else {
            this.dappInfo = oKCheckLeveldappInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(DappCheckUrlLevel dappCheckUrlLevel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dappCheckUrlLevel.newLevel, (Object) "SAFE")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dappCheckUrlLevel.newLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dappCheckUrlLevel.rule, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dappCheckUrlLevel.rule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dappCheckUrlLevel.searchHistoryUrlIsBlack) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, dappCheckUrlLevel.searchHistoryUrlIsBlack);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && dappCheckUrlLevel.dappInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, OKCheckLeveldappInfo$$serializer.INSTANCE, dappCheckUrlLevel.dappInfo);
    }

    public DappCheckUrlLevel(@NotNull String str, String str2, boolean z, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        this.newLevel = str;
        this.rule = str2;
        this.searchHistoryUrlIsBlack = z;
        this.dappInfo = oKCheckLeveldappInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("SAFE") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo:?: TERNARY null = ((wrap:int:0x0011: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo) : (r4v0 com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo))
 A[MD:(java.lang.String, java.lang.String, boolean, com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo):void (m)] (LINE:70) call: com.okinc.business.defi.dapp.net.DappCheckUrlLevel.<init>(java.lang.String, java.lang.String, boolean, com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo):void type: THIS */
    public /* synthetic */ DappCheckUrlLevel(String str, String str2, boolean z, OKCheckLeveldappInfo oKCheckLeveldappInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "SAFE" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : oKCheckLeveldappInfo);
    }
}
