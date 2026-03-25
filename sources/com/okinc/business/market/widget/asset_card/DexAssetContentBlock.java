package com.okinc.business.market.widget.asset_card;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorRes;
import androidx.annotation.StyleRes;
import com.okinc.business.dexlogic.txs.TxType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DexAssetContentBlock implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.widget.asset_card.DexAssetContentBlock.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DexAssetContentBlock(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DexAssetContentBlock() {
    }

    public static final class Text extends DexAssetContentBlock {
        public static final Parcelable.Creator<Text> CREATOR = new Creator();
        public final int KWHzl;
        public final String OLrzqt;
        public final int copydefault;

        public static final class Creator implements Parcelable.Creator<Text> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Text(parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i) {
                return new Text[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Text copy$default(Text text, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = text.OLrzqt;
            }
            if ((i3 & 2) != 0) {
                i = text.KWHzl;
            }
            if ((i3 & 4) != 0) {
                i2 = text.copydefault;
            }
            return text.copydefault(str, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Text copydefault(@NotNull String str, @StyleRes int i, @ColorRes int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Text(str, i, i2);
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
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) text.OLrzqt) && this.KWHzl == text.KWHzl && this.copydefault == text.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Text(value=" + this.OLrzqt + ", style=" + this.KWHzl + ", color=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeInt(this.KWHzl);
            parcel.writeInt(this.copydefault);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(@NotNull String str, @StyleRes int i, @ColorRes int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.KWHzl = i;
            this.copydefault = i2;
        }
    }

    public static final class ProgressBar extends DexAssetContentBlock {
        public static final Parcelable.Creator<ProgressBar> CREATOR = new Creator();
        public final int AEQbTJ;
        public final float EZpvd;
        public final float copydefault;

        public static final class Creator implements Parcelable.Creator<ProgressBar> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProgressBar createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ProgressBar(parcel.readFloat(), parcel.readFloat(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProgressBar[] newArray(int i) {
                return new ProgressBar[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ProgressBar copy$default(ProgressBar progressBar, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = progressBar.EZpvd;
            }
            if ((i2 & 2) != 0) {
                f2 = progressBar.copydefault;
            }
            if ((i2 & 4) != 0) {
                i = progressBar.AEQbTJ;
            }
            return progressBar.copydefault(f, f2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProgressBar copydefault(float f, float f2, @ColorRes int i) {
            return new ProgressBar(f, f2, i);
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
            if (!(obj instanceof ProgressBar)) {
                return false;
            }
            ProgressBar progressBar = (ProgressBar) obj;
            return Float.compare(this.EZpvd, progressBar.EZpvd) == 0 && Float.compare(this.copydefault, progressBar.copydefault) == 0 && this.AEQbTJ == progressBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Float.hashCode(this.EZpvd) * 31) + Float.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ProgressBar(progress=" + this.EZpvd + ", max=" + this.copydefault + ", color=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeFloat(this.EZpvd);
            parcel.writeFloat(this.copydefault);
            parcel.writeInt(this.AEQbTJ);
        }

        public ProgressBar(float f, float f2, @ColorRes int i) {
            super(null);
            this.EZpvd = f;
            this.copydefault = f2;
            this.AEQbTJ = i;
        }
    }

    public static final class Trade extends DexAssetContentBlock {
        public static final Parcelable.Creator<Trade> CREATOR = new Creator();
        public final String AEQbTJ;
        public final int OLrzqt;
        public final TxType copydefault;

        public static final class Creator implements Parcelable.Creator<Trade> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Trade createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Trade(TxType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Trade[] newArray(int i) {
                return new Trade[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Trade copy$default(Trade trade, TxType txType, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                txType = trade.copydefault;
            }
            if ((i2 & 2) != 0) {
                str = trade.AEQbTJ;
            }
            if ((i2 & 4) != 0) {
                i = trade.OLrzqt;
            }
            return trade.AEQbTJ(txType, str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Trade AEQbTJ(@NotNull TxType txType, @NotNull String str, @ColorRes int i) {
            Intrinsics.checkNotNullParameter(txType, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Trade(txType, str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TxType OLrzqt() {
            return this.copydefault;
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
            if (!(obj instanceof Trade)) {
                return false;
            }
            Trade trade = (Trade) obj;
            return this.copydefault == trade.copydefault && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) trade.AEQbTJ) && this.OLrzqt == trade.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Trade(type=" + this.copydefault + ", value=" + this.AEQbTJ + ", color=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.copydefault.writeToParcel(parcel, i);
            parcel.writeString(this.AEQbTJ);
            parcel.writeInt(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Trade(@NotNull TxType txType, @NotNull String str, @ColorRes int i) {
            super(null);
            Intrinsics.checkNotNullParameter(txType, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = txType;
            this.AEQbTJ = str;
            this.OLrzqt = i;
        }
    }
}
