package com.okinc.planet_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.tWQ;
import o.tWT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface PlanetProfileSettingsActions extends Parcelable {
    public static final Activity Companion = Activity.OLrzqt;

    String EZpvd();

    public static final class Settings implements PlanetProfileSettingsActions, tWT {
        public static final Settings KWHzl = new Settings();
        public static final String EZpvd = "settings";
        public static final Parcelable.Creator<Settings> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Settings> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Settings createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Settings.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Settings[] newArray(int i) {
                return new Settings[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet_api.model.PlanetProfileSettingsActions
        public String EZpvd() {
            return EZpvd;
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

        private Settings() {
        }
    }

    public static final class ChangeNickname implements PlanetProfileSettingsActions, tWQ {
        public static final ChangeNickname KWHzl = new ChangeNickname();
        public static final String AEQbTJ = "nickname";
        public static final Parcelable.Creator<ChangeNickname> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ChangeNickname> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeNickname createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ChangeNickname.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeNickname[] newArray(int i) {
                return new ChangeNickname[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet_api.model.PlanetProfileSettingsActions
        public String EZpvd() {
            return AEQbTJ;
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

        private ChangeNickname() {
        }
    }

    public static final class ChangeEnNickname implements PlanetProfileSettingsActions, tWQ {
        public static final ChangeEnNickname EZpvd = new ChangeEnNickname();
        public static final String OLrzqt = "ennickname";
        public static final Parcelable.Creator<ChangeEnNickname> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ChangeEnNickname> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeEnNickname createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ChangeEnNickname.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeEnNickname[] newArray(int i) {
                return new ChangeEnNickname[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet_api.model.PlanetProfileSettingsActions
        public String EZpvd() {
            return OLrzqt;
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

        private ChangeEnNickname() {
        }
    }

    public static final class ChangeBio implements PlanetProfileSettingsActions, tWQ {
        public static final ChangeBio EZpvd = new ChangeBio();
        public static final String copydefault = "introduction";
        public static final Parcelable.Creator<ChangeBio> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ChangeBio> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeBio createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ChangeBio.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeBio[] newArray(int i) {
                return new ChangeBio[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet_api.model.PlanetProfileSettingsActions
        public String EZpvd() {
            return copydefault;
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

        private ChangeBio() {
        }
    }

    public static final class ChangeProfilePrivacyMode implements PlanetProfileSettingsActions, tWT {
        public static final ChangeProfilePrivacyMode OLrzqt = new ChangeProfilePrivacyMode();
        public static final String AEQbTJ = "profilemode";
        public static final Parcelable.Creator<ChangeProfilePrivacyMode> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ChangeProfilePrivacyMode> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeProfilePrivacyMode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ChangeProfilePrivacyMode.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeProfilePrivacyMode[] newArray(int i) {
                return new ChangeProfilePrivacyMode[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet_api.model.PlanetProfileSettingsActions
        public String EZpvd() {
            return AEQbTJ;
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

        private ChangeProfilePrivacyMode() {
        }
    }

    public static final class ChangeCopyModeRestriction implements PlanetProfileSettingsActions, tWT {
        public static final ChangeCopyModeRestriction AEQbTJ = new ChangeCopyModeRestriction();
        public static final String OLrzqt = "copyModeRestriction";
        public static final Parcelable.Creator<ChangeCopyModeRestriction> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ChangeCopyModeRestriction> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeCopyModeRestriction createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ChangeCopyModeRestriction.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangeCopyModeRestriction[] newArray(int i) {
                return new ChangeCopyModeRestriction[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet_api.model.PlanetProfileSettingsActions
        public String EZpvd() {
            return OLrzqt;
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

        private ChangeCopyModeRestriction() {
        }
    }

    public static final class EnableInviteCodePrivateCopy implements PlanetProfileSettingsActions {
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public static final Activity Companion = new Activity(null);
        public static final Parcelable.Creator<EnableInviteCodePrivateCopy> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<EnableInviteCodePrivateCopy> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnableInviteCodePrivateCopy createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new EnableInviteCodePrivateCopy(null, parcel.readString(), parcel.readString(), 1, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnableInviteCodePrivateCopy[] newArray(int i) {
                return new EnableInviteCodePrivateCopy[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public EnableInviteCodePrivateCopy() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ EnableInviteCodePrivateCopy copy$default(EnableInviteCodePrivateCopy enableInviteCodePrivateCopy, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = enableInviteCodePrivateCopy.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = enableInviteCodePrivateCopy.KWHzl;
            }
            if ((i & 4) != 0) {
                str3 = enableInviteCodePrivateCopy.OLrzqt;
            }
            return enableInviteCodePrivateCopy.copydefault(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.planet_api.model.PlanetProfileSettingsActions
        public String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EnableInviteCodePrivateCopy copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new EnableInviteCodePrivateCopy(str, str2, str3);
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
            if (!(obj instanceof EnableInviteCodePrivateCopy)) {
                return false;
            }
            EnableInviteCodePrivateCopy enableInviteCodePrivateCopy = (EnableInviteCodePrivateCopy) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) enableInviteCodePrivateCopy.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) enableInviteCodePrivateCopy.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) enableInviteCodePrivateCopy.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EnableInviteCodePrivateCopy(key=" + this.EZpvd + ", inviteCode=" + this.KWHzl + ", privateLinkId=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.OLrzqt);
        }

        public EnableInviteCodePrivateCopy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd = str;
            this.KWHzl = str2;
            this.OLrzqt = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("enable_invite_code_private_copy") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:56) call: com.okinc.planet_api.model.PlanetProfileSettingsActions.EnableInviteCodePrivateCopy.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ EnableInviteCodePrivateCopy(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "enable_invite_code_private_copy" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.model.PlanetProfileSettingsActions.EnableInviteCodePrivateCopy.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }
        }
    }

    public static final class Activity {
        public static final /* synthetic */ Activity OLrzqt = new Activity();

        private Activity() {
        }

        public static /* synthetic */ PlanetProfileSettingsActions fromKey$default(Activity activity, String str, String str2, String str3, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            return activity.copydefault(str, str2, str3);
        }

        public final PlanetProfileSettingsActions copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Settings settings = Settings.KWHzl;
            if (Intrinsics.EZpvd((Object) str, (Object) settings.EZpvd())) {
                return settings;
            }
            ChangeNickname changeNickname = ChangeNickname.KWHzl;
            if (Intrinsics.EZpvd((Object) str, (Object) changeNickname.EZpvd())) {
                return changeNickname;
            }
            ChangeEnNickname changeEnNickname = ChangeEnNickname.EZpvd;
            if (Intrinsics.EZpvd((Object) str, (Object) changeEnNickname.EZpvd())) {
                return changeEnNickname;
            }
            ChangeBio changeBio = ChangeBio.EZpvd;
            if (Intrinsics.EZpvd((Object) str, (Object) changeBio.EZpvd())) {
                return changeBio;
            }
            ChangeProfilePrivacyMode changeProfilePrivacyMode = ChangeProfilePrivacyMode.OLrzqt;
            if (Intrinsics.EZpvd((Object) str, (Object) changeProfilePrivacyMode.EZpvd())) {
                return changeProfilePrivacyMode;
            }
            ChangeCopyModeRestriction changeCopyModeRestriction = ChangeCopyModeRestriction.AEQbTJ;
            if (Intrinsics.EZpvd((Object) str, (Object) changeCopyModeRestriction.EZpvd())) {
                return changeCopyModeRestriction;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) "enable_invite_code_private_copy")) {
                return new EnableInviteCodePrivateCopy(null, str2, str3, 1, null);
            }
            return null;
        }
    }
}
