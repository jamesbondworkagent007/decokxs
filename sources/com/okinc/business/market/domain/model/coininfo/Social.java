package com.okinc.business.market.domain.model.coininfo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class Social implements Parcelable {
    public final int AEQbTJ;
    public final int EZpvd;
    public final String KWHzl;
    public final String copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<Social> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Social> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Social createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Social(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Social[] newArray(int i) {
            return new Social[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Social copy$default(Social social, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = social.copydefault;
        }
        if ((i3 & 2) != 0) {
            str2 = social.KWHzl;
        }
        if ((i3 & 4) != 0) {
            i = social.EZpvd;
        }
        if ((i3 & 8) != 0) {
            i2 = social.AEQbTJ;
        }
        return social.OLrzqt(str, str2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Social OLrzqt(@NotNull String str, @NotNull String str2, @DrawableRes int i, @StringRes int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Social(str, str2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof Social)) {
            return false;
        }
        Social social = (Social) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) social.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) social.KWHzl) && this.EZpvd == social.EZpvd && this.AEQbTJ == social.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Social(key=" + this.copydefault + ", link=" + this.KWHzl + ", icon=" + this.EZpvd + ", desc=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.AEQbTJ);
    }

    public Social(@NotNull String str, @NotNull String str2, @DrawableRes int i, @StringRes int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.EZpvd = i;
        this.AEQbTJ = i2;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.domain.model.coininfo.Social.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final Social AEQbTJ(@NotNull List<Social> list, @NotNull String str) {
            Object next;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((Social) next).OLrzqt(), (Object) str)) {
                    break;
                }
            }
            return (Social) next;
        }
    }
}
