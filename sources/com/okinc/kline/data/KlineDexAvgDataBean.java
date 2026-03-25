package com.okinc.kline.data;

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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class KlineDexAvgDataBean implements Parcelable {
    private String accAvgPx;
    private String filterAddress;
    private String pnlAmount;
    private String pnlRate;
    private String positionAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KlineDexAvgDataBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KlineDexAvgDataBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineDexAvgDataBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new KlineDexAvgDataBean();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineDexAvgDataBean[] newArray(int i) {
            return new KlineDexAvgDataBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccAvgPx() {
        return this.accAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilterAddress() {
        return this.filterAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlAmount() {
        return this.pnlAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRate() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPositionAmount() {
        return this.positionAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.filterAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.positionAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.data.KlineDexAvgDataBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KlineDexAvgDataBean> serializer() {
            return KlineDexAvgDataBean$$serializer.INSTANCE;
        }
    }

    public KlineDexAvgDataBean() {
        this.accAvgPx = "";
        this.filterAddress = "";
        this.pnlAmount = "";
        this.pnlRate = "";
        this.positionAmount = "";
    }

    public /* synthetic */ KlineDexAvgDataBean(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accAvgPx = "";
        } else {
            this.accAvgPx = str;
        }
        if ((i & 2) == 0) {
            this.filterAddress = "";
        } else {
            this.filterAddress = str2;
        }
        if ((i & 4) == 0) {
            this.pnlAmount = "";
        } else {
            this.pnlAmount = str3;
        }
        if ((i & 8) == 0) {
            this.pnlRate = "";
        } else {
            this.pnlRate = str4;
        }
        if ((i & 16) == 0) {
            this.positionAmount = "";
        } else {
            this.positionAmount = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCandleStickChart_chart_impl(KlineDexAvgDataBean klineDexAvgDataBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) klineDexAvgDataBean.accAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, klineDexAvgDataBean.accAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) klineDexAvgDataBean.filterAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, klineDexAvgDataBean.filterAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) klineDexAvgDataBean.pnlAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, klineDexAvgDataBean.pnlAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) klineDexAvgDataBean.pnlRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, klineDexAvgDataBean.pnlRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) klineDexAvgDataBean.positionAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, klineDexAvgDataBean.positionAmount);
    }

    public final String getFormatFilterAddress() {
        if (this.filterAddress.length() <= 8) {
            return this.filterAddress;
        }
        String strSubstring = this.filterAddress.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String str = this.filterAddress;
        String strSubstring2 = str.substring(str.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return strSubstring + "..." + strSubstring2;
    }
}
