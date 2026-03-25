package com.okinc.okx.paymentapi.educationinfo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public abstract class InfoAction implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.educationinfo.InfoAction.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InfoAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InfoAction() {
    }

    public static final class VaCreation extends InfoAction {
        public static final Parcelable.Creator<VaCreation> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String KWHzl;
        public final String OLrzqt;
        public final int copydefault;

        public static final class Creator implements Parcelable.Creator<VaCreation> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VaCreation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new VaCreation(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VaCreation[] newArray(int i) {
                return new VaCreation[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VaCreation copy$default(VaCreation vaCreation, String str, String str2, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = vaCreation.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                str2 = vaCreation.KWHzl;
            }
            if ((i2 & 4) != 0) {
                i = vaCreation.copydefault;
            }
            if ((i2 & 8) != 0) {
                str3 = vaCreation.OLrzqt;
            }
            return vaCreation.copydefault(str, str2, i, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VaCreation copydefault(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new VaCreation(str, str2, i, str3);
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
            if (!(obj instanceof VaCreation)) {
                return false;
            }
            VaCreation vaCreation = (VaCreation) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) vaCreation.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) vaCreation.KWHzl) && this.copydefault == vaCreation.copydefault && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) vaCreation.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + Integer.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VaCreation(platformCode=" + this.AEQbTJ + ", paymentMethod=" + this.KWHzl + ", categoryCode=" + this.copydefault + ", currency=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.KWHzl);
            parcel.writeInt(this.copydefault);
            parcel.writeString(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VaCreation(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.copydefault = i;
            this.OLrzqt = str3;
        }
    }
}
