package com.okinc.business.defi.assets.utxo.utxomanagement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoAction implements Parcelable {
    public static final Parcelable.Creator<InvestUtxoAction> CREATOR = new Creator();
    public final List<UtxoItemIdentity> AEQbTJ;
    public final Integer KWHzl;
    public final String OLrzqt;
    public final long copydefault;

    public static final class Creator implements Parcelable.Creator<InvestUtxoAction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUtxoAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UtxoItemIdentity.CREATOR.createFromParcel(parcel));
            }
            return new InvestUtxoAction(j, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUtxoAction[] newArray(int i) {
            return new InvestUtxoAction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoAction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestUtxoAction copy$default(InvestUtxoAction investUtxoAction, long j, List list, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = investUtxoAction.copydefault;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            list = investUtxoAction.AEQbTJ;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = investUtxoAction.OLrzqt;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            num = investUtxoAction.KWHzl;
        }
        return investUtxoAction.KWHzl(j2, list2, str2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoItemIdentity> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUtxoAction KWHzl(long j, @NotNull List<UtxoItemIdentity> list, @NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestUtxoAction(j, list, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof InvestUtxoAction)) {
            return false;
        }
        InvestUtxoAction investUtxoAction = (InvestUtxoAction) obj;
        return this.copydefault == investUtxoAction.copydefault && Intrinsics.EZpvd(this.AEQbTJ, investUtxoAction.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) investUtxoAction.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, investUtxoAction.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.copydefault);
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        Integer num = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUtxoAction(tokenAmount=" + this.copydefault + ", selectedItems=" + this.AEQbTJ + ", symbol=" + this.OLrzqt + ", actionCode=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.copydefault);
        List<UtxoItemIdentity> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<UtxoItemIdentity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.OLrzqt);
        Integer num = this.KWHzl;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public InvestUtxoAction(long j, @NotNull List<UtxoItemIdentity> list, @NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = j;
        this.AEQbTJ = list;
        this.OLrzqt = str;
        this.KWHzl = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 long)
  (r9v0 java.util.List)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
 A[MD:(long, java.util.List<com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItemIdentity>, java.lang.String, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoAction.<init>(long, java.util.List, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ InvestUtxoAction(long j, List list, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : num);
    }
}
