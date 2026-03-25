package com.okinc.business.market.features.address_tracker.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AddressTrackerNotification implements Parcelable {
    public static final Parcelable.Creator<AddressTrackerNotification> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final List<AddressTrackerUserAction> OLrzqt;
    public final String copydefault;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<AddressTrackerNotification> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressTrackerNotification createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (true) {
                String string4 = parcel.readString();
                if (i == i2) {
                    return new AddressTrackerNotification(string, string2, string3, z, arrayList, string4, parcel.readString());
                }
                arrayList.add(AddressTrackerUserAction.valueOf(string4));
                i++;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressTrackerNotification[] newArray(int i) {
            return new AddressTrackerNotification[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressTrackerNotification() {
        this(null, null, null, false, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotification */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressTrackerNotification copy$default(AddressTrackerNotification addressTrackerNotification, String str, String str2, String str3, boolean z, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressTrackerNotification.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = addressTrackerNotification.gEmmrt;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = addressTrackerNotification.EZpvd;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            z = addressTrackerNotification.AEQbTJ;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            list = addressTrackerNotification.OLrzqt;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            str4 = addressTrackerNotification.AhwBna;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = addressTrackerNotification.copydefault;
        }
        return addressTrackerNotification.copydefault(str, str6, str7, z2, list2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressTrackerUserAction> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressTrackerNotification copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull List<? extends AddressTrackerUserAction> list, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new AddressTrackerNotification(str, str2, str3, z, list, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof AddressTrackerNotification)) {
            return false;
        }
        AddressTrackerNotification addressTrackerNotification = (AddressTrackerNotification) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) addressTrackerNotification.KWHzl) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) addressTrackerNotification.gEmmrt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) addressTrackerNotification.EZpvd) && this.AEQbTJ == addressTrackerNotification.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, addressTrackerNotification.OLrzqt) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) addressTrackerNotification.AhwBna) && Intrinsics.EZpvd((Object) this.copydefault, (Object) addressTrackerNotification.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.KWHzl.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressTrackerNotification(targetAddress=" + this.KWHzl + ", walletAddress=" + this.gEmmrt + ", addressAlias=" + this.EZpvd + ", hasAlert=" + this.AEQbTJ + ", actionList=" + this.OLrzqt + ", volumeMin=" + this.AhwBna + ", volumeMax=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        List<AddressTrackerUserAction> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<AddressTrackerUserAction> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.copydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.okinc.business.market.data.constant.AddressTrackerUserAction> */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressTrackerNotification(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull List<? extends AddressTrackerUserAction> list, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = str;
        this.gEmmrt = str2;
        this.EZpvd = str3;
        this.AEQbTJ = z;
        this.OLrzqt = list;
        this.AhwBna = str4;
        this.copydefault = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:boolean:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.util.List:0x0025: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0021: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r11v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<? extends com.okinc.business.market.data.constant.AddressTrackerUserAction>, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.business.market.features.address_tracker.domain.AddressTrackerNotification.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AddressTrackerNotification(String str, String str2, String str3, boolean z, List list, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? yDY.AhwBna() : list, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
    }
}
