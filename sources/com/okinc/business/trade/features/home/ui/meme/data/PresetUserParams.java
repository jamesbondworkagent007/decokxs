package com.okinc.business.trade.features.home.ui.meme.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class PresetUserParams implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PresetUserParams> CREATOR = new Creator();
    private final String accountId;
    private final String chainId;
    private final List<Preset> presets;
    private final String sceneType;
    private final String userWalletAddress;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<PresetUserParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PresetUserParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Preset.CREATOR.createFromParcel(parcel));
            }
            return new PresetUserParams(string, string2, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PresetUserParams[] newArray(int i) {
            return new PresetUserParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PresetUserParams copy$default(PresetUserParams presetUserParams, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presetUserParams.accountId;
        }
        if ((i & 2) != 0) {
            str2 = presetUserParams.chainId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = presetUserParams.presets;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = presetUserParams.sceneType;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = presetUserParams.userWalletAddress;
        }
        return presetUserParams.copy(str, str5, list2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Preset> component3() {
        return this.presets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sceneType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetUserParams copy(@NotNull String str, @NotNull String str2, @NotNull List<Preset> list, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PresetUserParams(str, str2, list, str3, str4);
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
        if (!(obj instanceof PresetUserParams)) {
            return false;
        }
        PresetUserParams presetUserParams = (PresetUserParams) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) presetUserParams.accountId) && Intrinsics.EZpvd((Object) this.chainId, (Object) presetUserParams.chainId) && Intrinsics.EZpvd(this.presets, presetUserParams.presets) && Intrinsics.EZpvd((Object) this.sceneType, (Object) presetUserParams.sceneType) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) presetUserParams.userWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Preset> getPresets() {
        return this.presets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSceneType() {
        return this.sceneType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.accountId.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.presets.hashCode()) * 31) + this.sceneType.hashCode()) * 31) + this.userWalletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PresetUserParams(accountId=" + this.accountId + ", chainId=" + this.chainId + ", presets=" + this.presets + ", sceneType=" + this.sceneType + ", userWalletAddress=" + this.userWalletAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.chainId);
        List<Preset> list = this.presets;
        parcel.writeInt(list.size());
        Iterator<Preset> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.sceneType);
        parcel.writeString(this.userWalletAddress);
    }

    public PresetUserParams(@NotNull String str, @NotNull String str2, @NotNull List<Preset> list, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.accountId = str;
        this.chainId = str2;
        this.presets = list;
        this.sceneType = str3;
        this.userWalletAddress = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.util.List:0x0018: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r10v0 java.util.List))
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.trade.features.home.ui.meme.data.Preset>, java.lang.String, java.lang.String):void (m)] (LINE:20) call: com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PresetUserParams(String str, String str2, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list, str3, (i & 16) != 0 ? "" : str4);
    }

    public final boolean isInvalid(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        List<Preset> list = this.presets;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Preset preset : list) {
                if (preset.getBuyPreset().isInvalid(str, str2, str3, str4, str5, str6) || preset.getSellPreset().isInvalid(str, str2, str3, str4, str5, str6)) {
                    return true;
                }
            }
        }
        return false;
    }
}
