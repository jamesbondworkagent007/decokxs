package com.okinc.core.ok_app.api.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Scenario implements Parcelable {
    public final String AEQbTJ;
    public final boolean KWHzl;
    public final Integer OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 boolean), (r2v0 java.lang.String), (r3v0 java.lang.Integer) A[MD:(boolean, java.lang.String, java.lang.Integer):void (m)] call: com.okinc.core.ok_app.api.configuration.Scenario.<init>(boolean, java.lang.String, java.lang.Integer):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Scenario(boolean z, String str, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    public Scenario(boolean z, String str, Integer num) {
        this.KWHzl = z;
        this.AEQbTJ = str;
        this.OLrzqt = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(boolean, java.lang.String, java.lang.Integer, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:9) call: com.okinc.core.ok_app.api.configuration.Scenario.<init>(boolean, java.lang.String, java.lang.Integer, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ Scenario(boolean z, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : num, null);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class ColdLaunch extends Scenario {
        public static final ColdLaunch EZpvd = new ColdLaunch();
        public static final Parcelable.Creator<ColdLaunch> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Creator implements Parcelable.Creator<ColdLaunch> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ColdLaunch createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ColdLaunch.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ColdLaunch[] newArray(int i) {
                return new ColdLaunch[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private ColdLaunch() {
            super(false, null, null, 6, null);
        }
    }

    public static final class Login extends Scenario {
        public static final Parcelable.Creator<Login> CREATOR = new Creator();
        public final String EZpvd;
        public final Integer copydefault;

        public static final class Creator implements Parcelable.Creator<Login> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Login createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Login(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Login[] newArray(int i) {
                return new Login[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Login() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Login copy$default(Login login, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = login.EZpvd;
            }
            if ((i & 2) != 0) {
                num = login.copydefault;
            }
            return login.OLrzqt(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.core.ok_app.api.configuration.Scenario
        public Integer AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.core.ok_app.api.configuration.Scenario
        public String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Login OLrzqt(@NotNull String str, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Login(str, num);
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
            if (!(obj instanceof Login)) {
                return false;
            }
            Login login = (Login) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) login.EZpvd) && Intrinsics.EZpvd(this.copydefault, login.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            Integer num = this.copydefault;
            return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Login(deepLink=" + this.EZpvd + ", preferredMode=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
            Integer num = this.copydefault;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Login(@NotNull String str, Integer num) {
            super(true, null, null, 6, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.copydefault = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer):void (m)] (LINE:15) call: com.okinc.core.ok_app.api.configuration.Scenario.Login.<init>(java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ Login(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num);
        }
    }

    public static final class SwitchAccount extends Scenario {
        public static final Parcelable.Creator<SwitchAccount> CREATOR = new Creator();
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<SwitchAccount> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwitchAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SwitchAccount(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwitchAccount[] newArray(int i) {
                return new SwitchAccount[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SwitchAccount() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SwitchAccount copy$default(SwitchAccount switchAccount, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = switchAccount.copydefault;
            }
            return switchAccount.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.core.ok_app.api.configuration.Scenario
        public String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SwitchAccount copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SwitchAccount(str);
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
            return (obj instanceof SwitchAccount) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((SwitchAccount) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SwitchAccount(deepLink=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchAccount(@NotNull String str) {
            super(true, null, null, 6, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:18) call: com.okinc.core.ok_app.api.configuration.Scenario.SwitchAccount.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SwitchAccount(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Logout extends Scenario {
        public static final Parcelable.Creator<Logout> CREATOR = new Creator();
        public final boolean EZpvd;

        public static final class Creator implements Parcelable.Creator<Logout> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Logout createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Logout(parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Logout[] newArray(int i) {
                return new Logout[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Logout() {
            this(false, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Logout copy$default(Logout logout, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = logout.EZpvd;
            }
            return logout.EZpvd(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Logout EZpvd(boolean z) {
            return new Logout(z);
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
            return (obj instanceof Logout) && this.EZpvd == ((Logout) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Logout(startLoading=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.EZpvd ? 1 : 0);
        }

        public Logout(boolean z) {
            super(z, null, null, 6, null);
            this.EZpvd = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:21) call: com.okinc.core.ok_app.api.configuration.Scenario.Logout.<init>(boolean):void type: THIS */
        public /* synthetic */ Logout(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class FeatureRestrictionUpdated extends Scenario {
        public static final FeatureRestrictionUpdated EZpvd = new FeatureRestrictionUpdated();
        public static final Parcelable.Creator<FeatureRestrictionUpdated> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Creator implements Parcelable.Creator<FeatureRestrictionUpdated> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FeatureRestrictionUpdated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return FeatureRestrictionUpdated.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FeatureRestrictionUpdated[] newArray(int i) {
                return new FeatureRestrictionUpdated[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private FeatureRestrictionUpdated() {
            super(false, null, null, 6, null);
        }
    }

    public static final class Register extends Scenario {
        public static final Parcelable.Creator<Register> CREATOR = new Creator();
        public final Integer EZpvd;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<Register> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Register createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Register(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Register[] newArray(int i) {
                return new Register[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Register() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Register copy$default(Register register, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = register.copydefault;
            }
            if ((i & 2) != 0) {
                num = register.EZpvd;
            }
            return register.KWHzl(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.core.ok_app.api.configuration.Scenario
        public Integer AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.core.ok_app.api.configuration.Scenario
        public String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Register KWHzl(@NotNull String str, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Register(str, num);
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
            if (!(obj instanceof Register)) {
                return false;
            }
            Register register = (Register) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) register.copydefault) && Intrinsics.EZpvd(this.EZpvd, register.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            Integer num = this.EZpvd;
            return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Register(deepLink=" + this.copydefault + ", preferredMode=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            Integer num = this.EZpvd;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer):void (m)] (LINE:27) call: com.okinc.core.ok_app.api.configuration.Scenario.Register.<init>(java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ Register(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Register(@NotNull String str, Integer num) {
            super(true, null, null, 6, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.EZpvd = num;
        }
    }

    public static /* synthetic */ Scenario copy$default(Scenario scenario, boolean z, String str, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            z = scenario.KWHzl;
        }
        if ((i & 2) != 0) {
            str = scenario.EZpvd();
        }
        if ((i & 4) != 0) {
            num = scenario.AEQbTJ();
        }
        return scenario.copydefault(z, str, num);
    }

    public final Scenario copydefault(boolean z, @NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        ColdLaunch coldLaunch = ColdLaunch.EZpvd;
        if (Intrinsics.EZpvd(this, coldLaunch)) {
            return coldLaunch;
        }
        FeatureRestrictionUpdated featureRestrictionUpdated = FeatureRestrictionUpdated.EZpvd;
        if (Intrinsics.EZpvd(this, featureRestrictionUpdated)) {
            return featureRestrictionUpdated;
        }
        if (this instanceof Login) {
            return new Login(str, num);
        }
        if (this instanceof Logout) {
            return new Logout(z);
        }
        if (this instanceof Register) {
            return new Register(str, num);
        }
        if (this instanceof SwitchAccount) {
            return new SwitchAccount(str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
