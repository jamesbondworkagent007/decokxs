package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyDetails implements Parcelable {
    public static final Parcelable.Creator<RecurringBuyDetails> CREATOR = new Creator();
    public final String AEQbTJ;
    public final List<RecurringListItem> AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final RecurringBuyDto OLrzqt;
    public final String copydefault;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<RecurringBuyDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RecurringListItem.CREATOR.createFromParcel(parcel));
            }
            return new RecurringBuyDetails(string, string2, string3, string4, arrayList, parcel.readInt() == 0 ? null : RecurringBuyDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyDetails[] newArray(int i) {
            return new RecurringBuyDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.unify_trade.biz.RecurringBuyDetails */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringBuyDetails copy$default(RecurringBuyDetails recurringBuyDetails, String str, String str2, String str3, String str4, List list, RecurringBuyDto recurringBuyDto, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringBuyDetails.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = recurringBuyDetails.copydefault;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = recurringBuyDetails.EZpvd;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = recurringBuyDetails.valueOf;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            list = recurringBuyDetails.AhwBna;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            recurringBuyDto = recurringBuyDetails.OLrzqt;
        }
        RecurringBuyDto recurringBuyDto2 = recurringBuyDto;
        if ((i & 64) != 0) {
            str5 = recurringBuyDetails.AEQbTJ;
        }
        return recurringBuyDetails.EZpvd(str, str6, str7, str8, list2, recurringBuyDto2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyDto AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyDetails EZpvd(String str, String str2, String str3, String str4, @NotNull List<RecurringListItem> list, RecurringBuyDto recurringBuyDto, String str5) {
        Intrinsics.checkNotNullParameter(list, "");
        return new RecurringBuyDetails(str, str2, str3, str4, list, recurringBuyDto, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof RecurringBuyDetails)) {
            return false;
        }
        RecurringBuyDetails recurringBuyDetails = (RecurringBuyDetails) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) recurringBuyDetails.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) recurringBuyDetails.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) recurringBuyDetails.EZpvd) && Intrinsics.EZpvd((Object) this.valueOf, (Object) recurringBuyDetails.valueOf) && Intrinsics.EZpvd(this.AhwBna, recurringBuyDetails.AhwBna) && Intrinsics.EZpvd(this.OLrzqt, recurringBuyDetails.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) recurringBuyDetails.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.EZpvd;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.valueOf;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        int iHashCode5 = this.AhwBna.hashCode();
        RecurringBuyDto recurringBuyDto = this.OLrzqt;
        int iHashCode6 = recurringBuyDto == null ? 0 : recurringBuyDto.hashCode();
        String str5 = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyDetails(period=" + this.KWHzl + ", recurringDay=" + this.copydefault + ", recurringHour=" + this.EZpvd + ", recurringTime=" + this.valueOf + ", recurringListItem=" + this.AhwBna + ", recurringBuyDto=" + this.OLrzqt + ", amountPerPeriod=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.valueOf);
        List<RecurringListItem> list = this.AhwBna;
        parcel.writeInt(list.size());
        Iterator<RecurringListItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        RecurringBuyDto recurringBuyDto = this.OLrzqt;
        if (recurringBuyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recurringBuyDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.AEQbTJ);
    }

    public RecurringBuyDetails(String str, String str2, String str3, String str4, @NotNull List<RecurringListItem> list, RecurringBuyDto recurringBuyDto, String str5) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = str3;
        this.valueOf = str4;
        this.AhwBna = list;
        this.OLrzqt = recurringBuyDto;
        this.AEQbTJ = str5;
    }
}
