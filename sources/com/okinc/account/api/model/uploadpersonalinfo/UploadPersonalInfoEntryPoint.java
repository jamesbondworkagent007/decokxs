package com.okinc.account.api.model.uploadpersonalinfo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class UploadPersonalInfoEntryPoint implements Parcelable {
    public static final int $stable = 0;
    private final int businessId;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint.<init>(int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UploadPersonalInfoEntryPoint(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getBusinessId() {
        return this.businessId;
    }

    private UploadPersonalInfoEntryPoint(int i) {
        this.businessId = i;
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class ForgetPassword extends UploadPersonalInfoEntryPoint {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ForgetPassword> CREATOR = new Creator();
        private final int businessId;
        private final boolean isFromFacialMaxOutPage;

        public static final class Creator implements Parcelable.Creator<ForgetPassword> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForgetPassword createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ForgetPassword(parcel.readInt(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForgetPassword[] newArray(int i) {
                return new ForgetPassword[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ForgetPassword copy$default(ForgetPassword forgetPassword, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = forgetPassword.businessId;
            }
            if ((i2 & 2) != 0) {
                z = forgetPassword.isFromFacialMaxOutPage;
            }
            return forgetPassword.copy(i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.isFromFacialMaxOutPage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ForgetPassword copy(int i, boolean z) {
            return new ForgetPassword(i, z);
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
            if (!(obj instanceof ForgetPassword)) {
                return false;
            }
            ForgetPassword forgetPassword = (ForgetPassword) obj;
            return this.businessId == forgetPassword.businessId && this.isFromFacialMaxOutPage == forgetPassword.isFromFacialMaxOutPage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint
        public int getBusinessId() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.businessId) * 31) + Boolean.hashCode(this.isFromFacialMaxOutPage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isFromFacialMaxOutPage() {
            return this.isFromFacialMaxOutPage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ForgetPassword(businessId=" + this.businessId + ", isFromFacialMaxOutPage=" + this.isFromFacialMaxOutPage + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.businessId);
            parcel.writeInt(this.isFromFacialMaxOutPage ? 1 : 0);
        }

        public ForgetPassword(int i, boolean z) {
            super(i, null);
            this.businessId = i;
            this.isFromFacialMaxOutPage = z;
        }
    }

    public static final class Rebind2fa extends UploadPersonalInfoEntryPoint {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Rebind2fa> CREATOR = new Creator();
        private final int businessId;
        private final String workflowToken;

        public static final class Creator implements Parcelable.Creator<Rebind2fa> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rebind2fa createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Rebind2fa(parcel.readInt(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rebind2fa[] newArray(int i) {
                return new Rebind2fa[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Rebind2fa copy$default(Rebind2fa rebind2fa, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rebind2fa.businessId;
            }
            if ((i2 & 2) != 0) {
                str = rebind2fa.workflowToken;
            }
            return rebind2fa.copy(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.workflowToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Rebind2fa copy(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Rebind2fa(i, str);
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
            if (!(obj instanceof Rebind2fa)) {
                return false;
            }
            Rebind2fa rebind2fa = (Rebind2fa) obj;
            return this.businessId == rebind2fa.businessId && Intrinsics.EZpvd((Object) this.workflowToken, (Object) rebind2fa.workflowToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint
        public int getBusinessId() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWorkflowToken() {
            return this.workflowToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.businessId) * 31) + this.workflowToken.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Rebind2fa(businessId=" + this.businessId + ", workflowToken=" + this.workflowToken + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.businessId);
            parcel.writeString(this.workflowToken);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rebind2fa(int i, @NotNull String str) {
            super(i, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.businessId = i;
            this.workflowToken = str;
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class ResetPasskey extends UploadPersonalInfoEntryPoint {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ResetPasskey> CREATOR = new Creator();
        private final int businessId;
        private final String reminderContent;
        private final UploadPersonalInfoSource source;
        private final String workflowToken;

        public static final class Creator implements Parcelable.Creator<ResetPasskey> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResetPasskey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ResetPasskey(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UploadPersonalInfoSource.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResetPasskey[] newArray(int i) {
                return new ResetPasskey[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResetPasskey copy$default(ResetPasskey resetPasskey, int i, String str, String str2, UploadPersonalInfoSource uploadPersonalInfoSource, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = resetPasskey.businessId;
            }
            if ((i2 & 2) != 0) {
                str = resetPasskey.workflowToken;
            }
            if ((i2 & 4) != 0) {
                str2 = resetPasskey.reminderContent;
            }
            if ((i2 & 8) != 0) {
                uploadPersonalInfoSource = resetPasskey.source;
            }
            return resetPasskey.copy(i, str, str2, uploadPersonalInfoSource);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.workflowToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.reminderContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadPersonalInfoSource component4() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResetPasskey copy(int i, @NotNull String str, String str2, UploadPersonalInfoSource uploadPersonalInfoSource) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ResetPasskey(i, str, str2, uploadPersonalInfoSource);
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
            if (!(obj instanceof ResetPasskey)) {
                return false;
            }
            ResetPasskey resetPasskey = (ResetPasskey) obj;
            return this.businessId == resetPasskey.businessId && Intrinsics.EZpvd((Object) this.workflowToken, (Object) resetPasskey.workflowToken) && Intrinsics.EZpvd((Object) this.reminderContent, (Object) resetPasskey.reminderContent) && this.source == resetPasskey.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint
        public int getBusinessId() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReminderContent() {
            return this.reminderContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadPersonalInfoSource getSource() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWorkflowToken() {
            return this.workflowToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.businessId);
            int iHashCode2 = this.workflowToken.hashCode();
            String str = this.reminderContent;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            UploadPersonalInfoSource uploadPersonalInfoSource = this.source;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (uploadPersonalInfoSource != null ? uploadPersonalInfoSource.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResetPasskey(businessId=" + this.businessId + ", workflowToken=" + this.workflowToken + ", reminderContent=" + this.reminderContent + ", source=" + this.source + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.businessId);
            parcel.writeString(this.workflowToken);
            parcel.writeString(this.reminderContent);
            UploadPersonalInfoSource uploadPersonalInfoSource = this.source;
            if (uploadPersonalInfoSource == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uploadPersonalInfoSource.name());
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 int)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource) : (r5v0 com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource))
 A[MD:(int, java.lang.String, java.lang.String, com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource):void (m)] (LINE:20) call: com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint.ResetPasskey.<init>(int, java.lang.String, java.lang.String, com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource):void type: THIS */
        public /* synthetic */ ResetPasskey(int i, String str, String str2, UploadPersonalInfoSource uploadPersonalInfoSource, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : uploadPersonalInfoSource);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResetPasskey(int i, @NotNull String str, String str2, UploadPersonalInfoSource uploadPersonalInfoSource) {
            super(i, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.businessId = i;
            this.workflowToken = str;
            this.reminderContent = str2;
            this.source = uploadPersonalInfoSource;
        }
    }

    public static final class NonAuthRebind2fa extends UploadPersonalInfoEntryPoint {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NonAuthRebind2fa> CREATOR = new Creator();
        private final int businessId;
        private final String workflowToken;

        public static final class Creator implements Parcelable.Creator<NonAuthRebind2fa> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NonAuthRebind2fa createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new NonAuthRebind2fa(parcel.readInt(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NonAuthRebind2fa[] newArray(int i) {
                return new NonAuthRebind2fa[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NonAuthRebind2fa copy$default(NonAuthRebind2fa nonAuthRebind2fa, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nonAuthRebind2fa.businessId;
            }
            if ((i2 & 2) != 0) {
                str = nonAuthRebind2fa.workflowToken;
            }
            return nonAuthRebind2fa.copy(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.workflowToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NonAuthRebind2fa copy(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NonAuthRebind2fa(i, str);
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
            if (!(obj instanceof NonAuthRebind2fa)) {
                return false;
            }
            NonAuthRebind2fa nonAuthRebind2fa = (NonAuthRebind2fa) obj;
            return this.businessId == nonAuthRebind2fa.businessId && Intrinsics.EZpvd((Object) this.workflowToken, (Object) nonAuthRebind2fa.workflowToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint
        public int getBusinessId() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWorkflowToken() {
            return this.workflowToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.businessId) * 31) + this.workflowToken.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NonAuthRebind2fa(businessId=" + this.businessId + ", workflowToken=" + this.workflowToken + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.businessId);
            parcel.writeString(this.workflowToken);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonAuthRebind2fa(int i, @NotNull String str) {
            super(i, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.businessId = i;
            this.workflowToken = str;
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class OkAuthMfa extends UploadPersonalInfoEntryPoint {
        public static final int $stable = 0;
        public static final Parcelable.Creator<OkAuthMfa> CREATOR = new Creator();
        private final int businessId;
        private final AccountMfaScenario mfaScenario;
        private final String reminderContent;
        private final String sessionId;
        private final UploadPersonalInfoSource source;

        public static final class Creator implements Parcelable.Creator<OkAuthMfa> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OkAuthMfa createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OkAuthMfa(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UploadPersonalInfoSource.valueOf(parcel.readString()), AccountMfaScenario.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OkAuthMfa[] newArray(int i) {
                return new OkAuthMfa[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OkAuthMfa copy$default(OkAuthMfa okAuthMfa, int i, String str, String str2, UploadPersonalInfoSource uploadPersonalInfoSource, AccountMfaScenario accountMfaScenario, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = okAuthMfa.businessId;
            }
            if ((i2 & 2) != 0) {
                str = okAuthMfa.sessionId;
            }
            String str3 = str;
            if ((i2 & 4) != 0) {
                str2 = okAuthMfa.reminderContent;
            }
            String str4 = str2;
            if ((i2 & 8) != 0) {
                uploadPersonalInfoSource = okAuthMfa.source;
            }
            UploadPersonalInfoSource uploadPersonalInfoSource2 = uploadPersonalInfoSource;
            if ((i2 & 16) != 0) {
                accountMfaScenario = okAuthMfa.mfaScenario;
            }
            return okAuthMfa.copy(i, str3, str4, uploadPersonalInfoSource2, accountMfaScenario);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.sessionId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.reminderContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadPersonalInfoSource component4() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountMfaScenario component5() {
            return this.mfaScenario;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OkAuthMfa copy(int i, @NotNull String str, String str2, UploadPersonalInfoSource uploadPersonalInfoSource, @NotNull AccountMfaScenario accountMfaScenario) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(accountMfaScenario, "");
            return new OkAuthMfa(i, str, str2, uploadPersonalInfoSource, accountMfaScenario);
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
            if (!(obj instanceof OkAuthMfa)) {
                return false;
            }
            OkAuthMfa okAuthMfa = (OkAuthMfa) obj;
            return this.businessId == okAuthMfa.businessId && Intrinsics.EZpvd((Object) this.sessionId, (Object) okAuthMfa.sessionId) && Intrinsics.EZpvd((Object) this.reminderContent, (Object) okAuthMfa.reminderContent) && this.source == okAuthMfa.source && this.mfaScenario == okAuthMfa.mfaScenario;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint
        public int getBusinessId() {
            return this.businessId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountMfaScenario getMfaScenario() {
            return this.mfaScenario;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReminderContent() {
            return this.reminderContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadPersonalInfoSource getSource() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.businessId);
            int iHashCode2 = this.sessionId.hashCode();
            String str = this.reminderContent;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            UploadPersonalInfoSource uploadPersonalInfoSource = this.source;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (uploadPersonalInfoSource != null ? uploadPersonalInfoSource.hashCode() : 0)) * 31) + this.mfaScenario.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OkAuthMfa(businessId=" + this.businessId + ", sessionId=" + this.sessionId + ", reminderContent=" + this.reminderContent + ", source=" + this.source + ", mfaScenario=" + this.mfaScenario + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.businessId);
            parcel.writeString(this.sessionId);
            parcel.writeString(this.reminderContent);
            UploadPersonalInfoSource uploadPersonalInfoSource = this.source;
            if (uploadPersonalInfoSource == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uploadPersonalInfoSource.name());
            }
            this.mfaScenario.writeToParcel(parcel, i);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 int)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource) : (r11v0 com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource))
  (wrap:com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario:0x0013: SGET  A[WRAPPED] (LINE:37) com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario.IsPostLogin com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario) : (r12v0 com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario))
 A[MD:(int, java.lang.String, java.lang.String, com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource, com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario):void (m)] (LINE:32) call: com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint.OkAuthMfa.<init>(int, java.lang.String, java.lang.String, com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource, com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario):void type: THIS */
        public /* synthetic */ OkAuthMfa(int i, String str, String str2, UploadPersonalInfoSource uploadPersonalInfoSource, AccountMfaScenario accountMfaScenario, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : uploadPersonalInfoSource, (i2 & 16) != 0 ? AccountMfaScenario.IsPostLogin : accountMfaScenario);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OkAuthMfa(int i, @NotNull String str, String str2, UploadPersonalInfoSource uploadPersonalInfoSource, @NotNull AccountMfaScenario accountMfaScenario) {
            super(i, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(accountMfaScenario, "");
            this.businessId = i;
            this.sessionId = str;
            this.reminderContent = str2;
            this.source = uploadPersonalInfoSource;
            this.mfaScenario = accountMfaScenario;
        }
    }
}
