package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class C2CSwapPriceBean implements Parcelable {
    private String baseColorfulIconUrl;
    private String price;
    private String quoteSymbol;
    private String swapAmount;
    private String swapBaseColorfulIconUrl;
    private String swapBaseScale;
    private String swapQuoteId;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseColorfulIconUrl() {
        return this.baseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapAmount() {
        return this.swapAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapBaseColorfulIconUrl() {
        return this.swapBaseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapBaseScale() {
        return this.swapBaseScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapQuoteId() {
        return this.swapQuoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseColorfulIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseColorfulIconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwapAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.swapAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwapBaseColorfulIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.swapBaseColorfulIconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwapBaseScale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.swapBaseScale = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwapQuoteId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.swapQuoteId = str;
    }

    public C2CSwapPriceBean() {
        this.price = "";
        this.swapQuoteId = "";
        this.swapAmount = "";
        this.swapBaseScale = "";
        this.baseColorfulIconUrl = "";
        this.swapBaseColorfulIconUrl = "";
        this.quoteSymbol = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2CSwapPriceBean(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        this.price = string == null ? "" : string;
        String string2 = parcel.readString();
        this.swapQuoteId = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.swapAmount = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        this.swapBaseScale = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        this.baseColorfulIconUrl = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        this.swapBaseColorfulIconUrl = string6 == null ? "" : string6;
        String string7 = parcel.readString();
        this.quoteSymbol = string7 != null ? string7 : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.price);
        parcel.writeString(this.swapQuoteId);
        parcel.writeString(this.swapAmount);
        parcel.writeString(this.swapBaseScale);
        parcel.writeString(this.baseColorfulIconUrl);
        parcel.writeString(this.swapBaseColorfulIconUrl);
        parcel.writeString(this.quoteSymbol);
    }

    public static final class CREATOR implements Parcelable.Creator<C2CSwapPriceBean> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.C2CSwapPriceBean.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C2CSwapPriceBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new C2CSwapPriceBean(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public C2CSwapPriceBean[] newArray(int i) {
            return new C2CSwapPriceBean[i];
        }
    }
}
