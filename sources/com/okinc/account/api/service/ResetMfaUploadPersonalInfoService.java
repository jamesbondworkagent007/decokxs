package com.okinc.account.api.service;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43217rlC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public interface ResetMfaUploadPersonalInfoService extends InterfaceC43217rlC {
    public static final Application Companion = Application.EZpvd;

    ActivityResultContract<Args, Activity> OLrzqt();

    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public final UploadPersonalInfoEntryPointReset2fa EZpvd;
        public final boolean KWHzl;
        public final UploadPersonalInfoRequestReset2fa OLrzqt;

        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Args(UploadPersonalInfoRequestReset2fa.CREATOR.createFromParcel(parcel), UploadPersonalInfoEntryPointReset2fa.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Args copy$default(Args args, UploadPersonalInfoRequestReset2fa uploadPersonalInfoRequestReset2fa, UploadPersonalInfoEntryPointReset2fa uploadPersonalInfoEntryPointReset2fa, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uploadPersonalInfoRequestReset2fa = args.OLrzqt;
            }
            if ((i & 2) != 0) {
                uploadPersonalInfoEntryPointReset2fa = args.EZpvd;
            }
            if ((i & 4) != 0) {
                z = args.KWHzl;
            }
            return args.OLrzqt(uploadPersonalInfoRequestReset2fa, uploadPersonalInfoEntryPointReset2fa, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Args OLrzqt(@NotNull UploadPersonalInfoRequestReset2fa uploadPersonalInfoRequestReset2fa, @NotNull UploadPersonalInfoEntryPointReset2fa uploadPersonalInfoEntryPointReset2fa, boolean z) {
            Intrinsics.checkNotNullParameter(uploadPersonalInfoRequestReset2fa, "");
            Intrinsics.checkNotNullParameter(uploadPersonalInfoEntryPointReset2fa, "");
            return new Args(uploadPersonalInfoRequestReset2fa, uploadPersonalInfoEntryPointReset2fa, z);
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
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return Intrinsics.EZpvd(this.OLrzqt, args.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, args.EZpvd) && this.KWHzl == args.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Args(personalInfo=" + this.OLrzqt + ", entryPoint=" + this.EZpvd + ", isWithSelfie=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.OLrzqt.writeToParcel(parcel, i);
            this.EZpvd.writeToParcel(parcel, i);
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        public Args(@NotNull UploadPersonalInfoRequestReset2fa uploadPersonalInfoRequestReset2fa, @NotNull UploadPersonalInfoEntryPointReset2fa uploadPersonalInfoEntryPointReset2fa, boolean z) {
            Intrinsics.checkNotNullParameter(uploadPersonalInfoRequestReset2fa, "");
            Intrinsics.checkNotNullParameter(uploadPersonalInfoEntryPointReset2fa, "");
            this.OLrzqt = uploadPersonalInfoRequestReset2fa;
            this.EZpvd = uploadPersonalInfoEntryPointReset2fa;
            this.KWHzl = z;
        }
    }

    public static final class UploadPersonalInfoRequestReset2fa implements Parcelable {
        public static final Parcelable.Creator<UploadPersonalInfoRequestReset2fa> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<UploadPersonalInfoRequestReset2fa> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UploadPersonalInfoRequestReset2fa createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UploadPersonalInfoRequestReset2fa(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UploadPersonalInfoRequestReset2fa[] newArray(int i) {
                return new UploadPersonalInfoRequestReset2fa[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UploadPersonalInfoRequestReset2fa() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UploadPersonalInfoRequestReset2fa copy$default(UploadPersonalInfoRequestReset2fa uploadPersonalInfoRequestReset2fa, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploadPersonalInfoRequestReset2fa.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = uploadPersonalInfoRequestReset2fa.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = uploadPersonalInfoRequestReset2fa.KWHzl;
            }
            if ((i & 8) != 0) {
                str4 = uploadPersonalInfoRequestReset2fa.AEQbTJ;
            }
            return uploadPersonalInfoRequestReset2fa.copydefault(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadPersonalInfoRequestReset2fa copydefault(String str, String str2, String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str4, "");
            return new UploadPersonalInfoRequestReset2fa(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
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
            if (!(obj instanceof UploadPersonalInfoRequestReset2fa)) {
                return false;
            }
            UploadPersonalInfoRequestReset2fa uploadPersonalInfoRequestReset2fa = (UploadPersonalInfoRequestReset2fa) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) uploadPersonalInfoRequestReset2fa.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) uploadPersonalInfoRequestReset2fa.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) uploadPersonalInfoRequestReset2fa.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) uploadPersonalInfoRequestReset2fa.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.EZpvd;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.copydefault;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.KWHzl;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UploadPersonalInfoRequestReset2fa(email=" + this.EZpvd + ", areaCode=" + this.copydefault + ", phone=" + this.KWHzl + ", token=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.AEQbTJ);
        }

        public UploadPersonalInfoRequestReset2fa(String str, String str2, String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str4, "");
            this.EZpvd = str;
            this.copydefault = str2;
            this.KWHzl = str3;
            this.AEQbTJ = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.account.api.service.ResetMfaUploadPersonalInfoService.UploadPersonalInfoRequestReset2fa.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ UploadPersonalInfoRequestReset2fa(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    public static final class UploadPersonalInfoEntryPointReset2fa implements Parcelable {
        public static final Parcelable.Creator<UploadPersonalInfoEntryPointReset2fa> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String KWHzl;
        public final Integer OLrzqt;
        public final boolean copydefault;

        public static final class Creator implements Parcelable.Creator<UploadPersonalInfoEntryPointReset2fa> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UploadPersonalInfoEntryPointReset2fa createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UploadPersonalInfoEntryPointReset2fa(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UploadPersonalInfoEntryPointReset2fa[] newArray(int i) {
                return new UploadPersonalInfoEntryPointReset2fa[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UploadPersonalInfoEntryPointReset2fa copy$default(UploadPersonalInfoEntryPointReset2fa uploadPersonalInfoEntryPointReset2fa, String str, Integer num, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploadPersonalInfoEntryPointReset2fa.AEQbTJ;
            }
            if ((i & 2) != 0) {
                num = uploadPersonalInfoEntryPointReset2fa.OLrzqt;
            }
            if ((i & 4) != 0) {
                str2 = uploadPersonalInfoEntryPointReset2fa.KWHzl;
            }
            if ((i & 8) != 0) {
                z = uploadPersonalInfoEntryPointReset2fa.copydefault;
            }
            return uploadPersonalInfoEntryPointReset2fa.AEQbTJ(str, num, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadPersonalInfoEntryPointReset2fa AEQbTJ(@NotNull String str, Integer num, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UploadPersonalInfoEntryPointReset2fa(str, num, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
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
            if (!(obj instanceof UploadPersonalInfoEntryPointReset2fa)) {
                return false;
            }
            UploadPersonalInfoEntryPointReset2fa uploadPersonalInfoEntryPointReset2fa = (UploadPersonalInfoEntryPointReset2fa) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) uploadPersonalInfoEntryPointReset2fa.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, uploadPersonalInfoEntryPointReset2fa.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) uploadPersonalInfoEntryPointReset2fa.KWHzl) && this.copydefault == uploadPersonalInfoEntryPointReset2fa.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            Integer num = this.OLrzqt;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            String str = this.KWHzl;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UploadPersonalInfoEntryPointReset2fa(type=" + this.AEQbTJ + ", businessId=" + this.OLrzqt + ", workflowToken=" + this.KWHzl + ", isWithSelfie=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            Integer num = this.OLrzqt;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.KWHzl);
            parcel.writeInt(this.copydefault ? 1 : 0);
        }

        public UploadPersonalInfoEntryPointReset2fa(@NotNull String str, Integer num, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.OLrzqt = num;
            this.KWHzl = str2;
            this.copydefault = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, boolean):void (m)] (LINE:27) call: com.okinc.account.api.service.ResetMfaUploadPersonalInfoService.UploadPersonalInfoEntryPointReset2fa.<init>(java.lang.String, java.lang.Integer, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ UploadPersonalInfoEntryPointReset2fa(String str, Integer num, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z);
        }
    }

    public static final class Activity {
        public final boolean AEQbTJ;
        public final String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = activity.EZpvd;
            }
            return activity.KWHzl(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(boolean z, String str) {
            return new Activity(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd((Object) this.EZpvd, (Object) activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.AEQbTJ);
            String str = this.EZpvd;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Result(isSuccess=" + this.AEQbTJ + ", nextStep=" + this.EZpvd + ")";
        }

        public Activity(boolean z, String str) {
            this.AEQbTJ = z;
            this.EZpvd = str;
        }
    }

    public static final class Application {
        public static final /* synthetic */ Application EZpvd = new Application();

        private Application() {
        }
    }
}
