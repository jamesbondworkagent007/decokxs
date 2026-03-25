package com.okinc.business.defi.wallet.transfer.batch.multiTransferBean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ErrorMessage implements Parcelable {
    public static final Parcelable.Creator<ErrorMessage> CREATOR = new Creator();
    public final int AEQbTJ;
    public final Map<String, String> KWHzl;

    public static final class Creator implements Parcelable.Creator<ErrorMessage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorMessage createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ErrorMessage(i, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorMessage[] newArray(int i) {
            return new ErrorMessage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ErrorMessage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = errorMessage.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            map = errorMessage.KWHzl;
        }
        return errorMessage.copydefault(i, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ErrorMessage copydefault(@StringRes int i, Map<String, String> map) {
        return new ErrorMessage(i, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> copydefault() {
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
        if (!(obj instanceof ErrorMessage)) {
            return false;
        }
        ErrorMessage errorMessage = (ErrorMessage) obj;
        return this.AEQbTJ == errorMessage.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, errorMessage.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.AEQbTJ);
        Map<String, String> map = this.KWHzl;
        return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ErrorMessage(id=" + this.AEQbTJ + ", arguments=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AEQbTJ);
        Map<String, String> map = this.KWHzl;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public ErrorMessage(@StringRes int i, Map<String, String> map) {
        this.AEQbTJ = i;
        this.KWHzl = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r2v0 java.util.Map))
 A[MD:(int, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:21) call: com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ErrorMessage.<init>(int, java.util.Map):void type: THIS */
    public /* synthetic */ ErrorMessage(int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : map);
    }
}
