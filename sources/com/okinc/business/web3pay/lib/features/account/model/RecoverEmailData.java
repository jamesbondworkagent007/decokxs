package com.okinc.business.web3pay.lib.features.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RecoverEmailData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecoverEmailData> CREATOR = new Creator();
    private final String email;
    private final List<String> emailSuffixList;
    private final boolean isValidEmail;
    private final boolean noEmail;

    public static final class Creator implements Parcelable.Creator<RecoverEmailData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecoverEmailData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecoverEmailData(parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecoverEmailData[] newArray(int i) {
            return new RecoverEmailData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecoverEmailData() {
        this(null, false, null, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.account.model.RecoverEmailData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecoverEmailData copy$default(RecoverEmailData recoverEmailData, String str, boolean z, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recoverEmailData.email;
        }
        if ((i & 2) != 0) {
            z = recoverEmailData.isValidEmail;
        }
        if ((i & 4) != 0) {
            list = recoverEmailData.emailSuffixList;
        }
        if ((i & 8) != 0) {
            z2 = recoverEmailData.noEmail;
        }
        return recoverEmailData.copy(str, z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isValidEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.emailSuffixList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecoverEmailData copy(@NotNull String str, boolean z, @NotNull List<String> list, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RecoverEmailData(str, z, list, z2);
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
        if (!(obj instanceof RecoverEmailData)) {
            return false;
        }
        RecoverEmailData recoverEmailData = (RecoverEmailData) obj;
        return Intrinsics.EZpvd((Object) this.email, (Object) recoverEmailData.email) && this.isValidEmail == recoverEmailData.isValidEmail && Intrinsics.EZpvd(this.emailSuffixList, recoverEmailData.emailSuffixList) && this.noEmail == recoverEmailData.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getEmailSuffixList() {
        return this.emailSuffixList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNoEmail() {
        return this.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.email.hashCode() * 31) + Boolean.hashCode(this.isValidEmail)) * 31) + this.emailSuffixList.hashCode()) * 31) + Boolean.hashCode(this.noEmail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isValidEmail() {
        return this.isValidEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecoverEmailData(email=" + this.email + ", isValidEmail=" + this.isValidEmail + ", emailSuffixList=" + this.emailSuffixList + ", noEmail=" + this.noEmail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.email);
        parcel.writeInt(this.isValidEmail ? 1 : 0);
        parcel.writeStringList(this.emailSuffixList);
        parcel.writeInt(this.noEmail ? 1 : 0);
    }

    public RecoverEmailData(@NotNull String str, boolean z, @NotNull List<String> list, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.email = str;
        this.isValidEmail = z;
        this.emailSuffixList = list;
        this.noEmail = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r3v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, boolean, java.util.List<java.lang.String>, boolean):void (m)] (LINE:21) call: com.okinc.business.web3pay.lib.features.account.model.RecoverEmailData.<init>(java.lang.String, boolean, java.util.List, boolean):void type: THIS */
    public /* synthetic */ RecoverEmailData(String str, boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? false : z2);
    }
}
