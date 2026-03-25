package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class RiskWarningButtons implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RiskWarningButtons> CREATOR = new Creator();
    private final List<RiskWarningLink> footButtons;
    private final List<RiskWarningLink> footLinks;

    public static final class Creator implements Parcelable.Creator<RiskWarningButtons> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskWarningButtons createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RiskWarningLink.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(RiskWarningLink.CREATOR.createFromParcel(parcel));
                }
            }
            return new RiskWarningButtons(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskWarningButtons[] newArray(int i) {
            return new RiskWarningButtons[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RiskWarningButtons() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.RiskWarningButtons */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RiskWarningButtons copy$default(RiskWarningButtons riskWarningButtons, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = riskWarningButtons.footLinks;
        }
        if ((i & 2) != 0) {
            list2 = riskWarningButtons.footButtons;
        }
        return riskWarningButtons.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskWarningLink> component1() {
        return this.footLinks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskWarningLink> component2() {
        return this.footButtons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskWarningButtons copy(List<RiskWarningLink> list, List<RiskWarningLink> list2) {
        return new RiskWarningButtons(list, list2);
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
        if (!(obj instanceof RiskWarningButtons)) {
            return false;
        }
        RiskWarningButtons riskWarningButtons = (RiskWarningButtons) obj;
        return Intrinsics.EZpvd(this.footLinks, riskWarningButtons.footLinks) && Intrinsics.EZpvd(this.footButtons, riskWarningButtons.footButtons);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskWarningLink> getFootButtons() {
        return this.footButtons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskWarningLink> getFootLinks() {
        return this.footLinks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<RiskWarningLink> list = this.footLinks;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<RiskWarningLink> list2 = this.footButtons;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskWarningButtons(footLinks=" + this.footLinks + ", footButtons=" + this.footButtons + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<RiskWarningLink> list = this.footLinks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RiskWarningLink> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<RiskWarningLink> list2 = this.footButtons;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<RiskWarningLink> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public RiskWarningButtons(List<RiskWarningLink> list, List<RiskWarningLink> list2) {
        this.footLinks = list;
        this.footButtons = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.assets.backend.api.model.RiskWarningLink>, java.util.List<com.okinc.assets.backend.api.model.RiskWarningLink>):void (m)] (LINE:50) call: com.okinc.assets.backend.api.model.RiskWarningButtons.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ RiskWarningButtons(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
