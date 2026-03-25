package com.okinc.business.dexui.main.swap.route.dag.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DexEdgeItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DexEdgeItem> CREATOR = new Creator();
    private final String fromIndex;
    private final UiTokenInfoModel fromToken;
    private final String toIndex;
    private final UiTokenInfoModel toToken;
    private final UiPoolInfoModel uiPoolInfoModel;
    private final String weight;

    public static final class Creator implements Parcelable.Creator<DexEdgeItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexEdgeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator<UiTokenInfoModel> creator = UiTokenInfoModel.CREATOR;
            return new DexEdgeItem(string, string2, string3, creator.createFromParcel(parcel), creator.createFromParcel(parcel), UiPoolInfoModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexEdgeItem[] newArray(int i) {
            return new DexEdgeItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexEdgeItem copy$default(DexEdgeItem dexEdgeItem, String str, String str2, String str3, UiTokenInfoModel uiTokenInfoModel, UiTokenInfoModel uiTokenInfoModel2, UiPoolInfoModel uiPoolInfoModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexEdgeItem.weight;
        }
        if ((i & 2) != 0) {
            str2 = dexEdgeItem.fromIndex;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = dexEdgeItem.toIndex;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            uiTokenInfoModel = dexEdgeItem.fromToken;
        }
        UiTokenInfoModel uiTokenInfoModel3 = uiTokenInfoModel;
        if ((i & 16) != 0) {
            uiTokenInfoModel2 = dexEdgeItem.toToken;
        }
        UiTokenInfoModel uiTokenInfoModel4 = uiTokenInfoModel2;
        if ((i & 32) != 0) {
            uiPoolInfoModel = dexEdgeItem.uiPoolInfoModel;
        }
        return dexEdgeItem.copy(str, str4, str5, uiTokenInfoModel3, uiTokenInfoModel4, uiPoolInfoModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.weight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiTokenInfoModel component4() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiTokenInfoModel component5() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiPoolInfoModel component6() {
        return this.uiPoolInfoModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexEdgeItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull UiTokenInfoModel uiTokenInfoModel, @NotNull UiTokenInfoModel uiTokenInfoModel2, @NotNull UiPoolInfoModel uiPoolInfoModel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(uiTokenInfoModel, "");
        Intrinsics.checkNotNullParameter(uiTokenInfoModel2, "");
        Intrinsics.checkNotNullParameter(uiPoolInfoModel, "");
        return new DexEdgeItem(str, str2, str3, uiTokenInfoModel, uiTokenInfoModel2, uiPoolInfoModel);
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
        if (!(obj instanceof DexEdgeItem)) {
            return false;
        }
        DexEdgeItem dexEdgeItem = (DexEdgeItem) obj;
        return Intrinsics.EZpvd((Object) this.weight, (Object) dexEdgeItem.weight) && Intrinsics.EZpvd((Object) this.fromIndex, (Object) dexEdgeItem.fromIndex) && Intrinsics.EZpvd((Object) this.toIndex, (Object) dexEdgeItem.toIndex) && Intrinsics.EZpvd(this.fromToken, dexEdgeItem.fromToken) && Intrinsics.EZpvd(this.toToken, dexEdgeItem.toToken) && Intrinsics.EZpvd(this.uiPoolInfoModel, dexEdgeItem.uiPoolInfoModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromIndex() {
        return this.fromIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiTokenInfoModel getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToIndex() {
        return this.toIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiTokenInfoModel getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiPoolInfoModel getUiPoolInfoModel() {
        return this.uiPoolInfoModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeight() {
        return this.weight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.weight.hashCode() * 31) + this.fromIndex.hashCode()) * 31) + this.toIndex.hashCode()) * 31) + this.fromToken.hashCode()) * 31) + this.toToken.hashCode()) * 31) + this.uiPoolInfoModel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexEdgeItem(weight=" + this.weight + ", fromIndex=" + this.fromIndex + ", toIndex=" + this.toIndex + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", uiPoolInfoModel=" + this.uiPoolInfoModel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.weight);
        parcel.writeString(this.fromIndex);
        parcel.writeString(this.toIndex);
        this.fromToken.writeToParcel(parcel, i);
        this.toToken.writeToParcel(parcel, i);
        this.uiPoolInfoModel.writeToParcel(parcel, i);
    }

    public DexEdgeItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull UiTokenInfoModel uiTokenInfoModel, @NotNull UiTokenInfoModel uiTokenInfoModel2, @NotNull UiPoolInfoModel uiPoolInfoModel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(uiTokenInfoModel, "");
        Intrinsics.checkNotNullParameter(uiTokenInfoModel2, "");
        Intrinsics.checkNotNullParameter(uiPoolInfoModel, "");
        this.weight = str;
        this.fromIndex = str2;
        this.toIndex = str3;
        this.fromToken = uiTokenInfoModel;
        this.toToken = uiTokenInfoModel2;
        this.uiPoolInfoModel = uiPoolInfoModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r16v0 java.lang.String))
  (r17v0 com.okinc.business.dexui.main.swap.route.dag.model.UiTokenInfoModel)
  (r18v0 com.okinc.business.dexui.main.swap.route.dag.model.UiTokenInfoModel)
  (wrap:com.okinc.business.dexui.main.swap.route.dag.model.UiPoolInfoModel:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (15 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:40) call: com.okinc.business.dexui.main.swap.route.dag.model.UiPoolInfoModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.business.dexui.main.swap.route.dag.model.UiPoolInfoModel))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexui.main.swap.route.dag.model.UiTokenInfoModel, com.okinc.business.dexui.main.swap.route.dag.model.UiTokenInfoModel, com.okinc.business.dexui.main.swap.route.dag.model.UiPoolInfoModel):void (m)] (LINE:34) call: com.okinc.business.dexui.main.swap.route.dag.model.DexEdgeItem.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexui.main.swap.route.dag.model.UiTokenInfoModel, com.okinc.business.dexui.main.swap.route.dag.model.UiTokenInfoModel, com.okinc.business.dexui.main.swap.route.dag.model.UiPoolInfoModel):void type: THIS */
    public /* synthetic */ DexEdgeItem(String str, String str2, String str3, UiTokenInfoModel uiTokenInfoModel, UiTokenInfoModel uiTokenInfoModel2, UiPoolInfoModel uiPoolInfoModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "0" : str3, uiTokenInfoModel, uiTokenInfoModel2, (i & 32) != 0 ? new UiPoolInfoModel(null, null, null, null, 15, null) : uiPoolInfoModel);
    }
}
