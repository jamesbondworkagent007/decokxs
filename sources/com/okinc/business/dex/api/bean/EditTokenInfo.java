package com.okinc.business.dex.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class EditTokenInfo implements Parcelable {
    public static final int $stable = 0;
    private final String amount;
    private final CoinInfo coinInfo;
    private final boolean iconClick;
    private final boolean inputCanEdit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EditTokenInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EditTokenInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditTokenInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EditTokenInfo(CoinInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditTokenInfo[] newArray(int i) {
            return new EditTokenInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EditTokenInfo copy$default(EditTokenInfo editTokenInfo, CoinInfo coinInfo, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            coinInfo = editTokenInfo.coinInfo;
        }
        if ((i & 2) != 0) {
            str = editTokenInfo.amount;
        }
        if ((i & 4) != 0) {
            z = editTokenInfo.inputCanEdit;
        }
        if ((i & 8) != 0) {
            z2 = editTokenInfo.iconClick;
        }
        return editTokenInfo.copy(coinInfo, str, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo component1() {
        return this.coinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.inputCanEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.iconClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditTokenInfo copy(@NotNull CoinInfo coinInfo, @NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(coinInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new EditTokenInfo(coinInfo, str, z, z2);
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
        if (!(obj instanceof EditTokenInfo)) {
            return false;
        }
        EditTokenInfo editTokenInfo = (EditTokenInfo) obj;
        return Intrinsics.EZpvd(this.coinInfo, editTokenInfo.coinInfo) && Intrinsics.EZpvd((Object) this.amount, (Object) editTokenInfo.amount) && this.inputCanEdit == editTokenInfo.inputCanEdit && this.iconClick == editTokenInfo.iconClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfo getCoinInfo() {
        return this.coinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIconClick() {
        return this.iconClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getInputCanEdit() {
        return this.inputCanEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.coinInfo.hashCode() * 31) + this.amount.hashCode()) * 31) + Boolean.hashCode(this.inputCanEdit)) * 31) + Boolean.hashCode(this.iconClick);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditTokenInfo(coinInfo=" + this.coinInfo + ", amount=" + this.amount + ", inputCanEdit=" + this.inputCanEdit + ", iconClick=" + this.iconClick + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.coinInfo.writeToParcel(parcel, i);
        parcel.writeString(this.amount);
        parcel.writeInt(this.inputCanEdit ? 1 : 0);
        parcel.writeInt(this.iconClick ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.EditTokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditTokenInfo> serializer() {
            return EditTokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditTokenInfo(int i, CoinInfo coinInfo, String str, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EditTokenInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.coinInfo = coinInfo;
        this.amount = str;
        if ((i & 4) == 0) {
            this.inputCanEdit = false;
        } else {
            this.inputCanEdit = z;
        }
        if ((i & 8) == 0) {
            this.iconClick = false;
        } else {
            this.iconClick = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(EditTokenInfo editTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, CoinInfo$$serializer.INSTANCE, editTokenInfo.coinInfo);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, editTokenInfo.amount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || editTokenInfo.inputCanEdit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, editTokenInfo.inputCanEdit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || editTokenInfo.iconClick) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, editTokenInfo.iconClick);
        }
    }

    public EditTokenInfo(@NotNull CoinInfo coinInfo, @NotNull String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(coinInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.coinInfo = coinInfo;
        this.amount = str;
        this.inputCanEdit = z;
        this.iconClick = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.business.dex.api.bean.CoinInfo)
  (r3v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(com.okinc.business.dex.api.bean.CoinInfo, java.lang.String, boolean, boolean):void (m)] (LINE:340) call: com.okinc.business.dex.api.bean.EditTokenInfo.<init>(com.okinc.business.dex.api.bean.CoinInfo, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ EditTokenInfo(CoinInfo coinInfo, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coinInfo, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
