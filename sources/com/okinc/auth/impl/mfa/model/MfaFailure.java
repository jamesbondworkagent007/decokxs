package com.okinc.auth.impl.mfa.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class MfaFailure implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.MfaFailure.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MfaFailure(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MfaFailure() {
    }

    public static final class GenericFailure extends MfaFailure {
        public static final Parcelable.Creator<GenericFailure> CREATOR = new Creator();
        public final String EZpvd;
        public final String OLrzqt;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<GenericFailure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GenericFailure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new GenericFailure(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GenericFailure[] newArray(int i) {
                return new GenericFailure[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ GenericFailure copy$default(GenericFailure genericFailure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = genericFailure.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = genericFailure.OLrzqt;
            }
            return genericFailure.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GenericFailure copydefault(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new GenericFailure(str, str2);
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
            if (!(obj instanceof GenericFailure)) {
                return false;
            }
            GenericFailure genericFailure = (GenericFailure) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) genericFailure.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) genericFailure.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "GenericFailure(code=" + this.EZpvd + ", message=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericFailure(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.auth.impl.mfa.model.MfaFailure.GenericFailure.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ GenericFailure(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, str2);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class FailedToCreateSession extends MfaFailure {
        public static final Parcelable.Creator<FailedToCreateSession> CREATOR = new Creator();
        public final String KWHzl;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<FailedToCreateSession> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FailedToCreateSession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new FailedToCreateSession(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FailedToCreateSession[] newArray(int i) {
                return new FailedToCreateSession[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FailedToCreateSession copy$default(FailedToCreateSession failedToCreateSession, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failedToCreateSession.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = failedToCreateSession.KWHzl;
            }
            return failedToCreateSession.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FailedToCreateSession AEQbTJ(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new FailedToCreateSession(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
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
            if (!(obj instanceof FailedToCreateSession)) {
                return false;
            }
            FailedToCreateSession failedToCreateSession = (FailedToCreateSession) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) failedToCreateSession.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) failedToCreateSession.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FailedToCreateSession(code=" + this.copydefault + ", message=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.KWHzl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToCreateSession(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.KWHzl = str2;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SessionExpired extends MfaFailure {
        public static final Parcelable.Creator<SessionExpired> CREATOR = new Creator();
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<SessionExpired> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SessionExpired createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SessionExpired(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SessionExpired[] newArray(int i) {
                return new SessionExpired[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionExpired copy$default(SessionExpired sessionExpired, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionExpired.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = sessionExpired.OLrzqt;
            }
            return sessionExpired.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionExpired copydefault(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new SessionExpired(str, str2);
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
            if (!(obj instanceof SessionExpired)) {
                return false;
            }
            SessionExpired sessionExpired = (SessionExpired) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) sessionExpired.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) sessionExpired.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionExpired(code=" + this.copydefault + ", message=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionExpired(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.OLrzqt = str2;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SessionInvalid extends MfaFailure {
        public static final Parcelable.Creator<SessionInvalid> CREATOR = new Creator();
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<SessionInvalid> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SessionInvalid createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SessionInvalid(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SessionInvalid[] newArray(int i) {
                return new SessionInvalid[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionInvalid copy$default(SessionInvalid sessionInvalid, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionInvalid.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = sessionInvalid.copydefault;
            }
            return sessionInvalid.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionInvalid KWHzl(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new SessionInvalid(str, str2);
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
            if (!(obj instanceof SessionInvalid)) {
                return false;
            }
            SessionInvalid sessionInvalid = (SessionInvalid) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) sessionInvalid.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) sessionInvalid.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionInvalid(code=" + this.OLrzqt + ", message=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionInvalid(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class BusinessNotSupport extends MfaFailure {
        public static final Parcelable.Creator<BusinessNotSupport> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;

        public static final class Creator implements Parcelable.Creator<BusinessNotSupport> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BusinessNotSupport createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BusinessNotSupport(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BusinessNotSupport[] newArray(int i) {
                return new BusinessNotSupport[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BusinessNotSupport copy$default(BusinessNotSupport businessNotSupport, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = businessNotSupport.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = businessNotSupport.AEQbTJ;
            }
            return businessNotSupport.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BusinessNotSupport OLrzqt(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new BusinessNotSupport(str, str2);
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
            if (!(obj instanceof BusinessNotSupport)) {
                return false;
            }
            BusinessNotSupport businessNotSupport = (BusinessNotSupport) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) businessNotSupport.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) businessNotSupport.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BusinessNotSupport(code=" + this.EZpvd + ", message=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AEQbTJ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BusinessNotSupport(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.AEQbTJ = str2;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class VerificationFailure extends MfaFailure {
        public static final Parcelable.Creator<VerificationFailure> CREATOR = new Creator();
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<VerificationFailure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationFailure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new VerificationFailure(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationFailure[] newArray(int i) {
                return new VerificationFailure[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VerificationFailure copy$default(VerificationFailure verificationFailure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verificationFailure.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = verificationFailure.copydefault;
            }
            return verificationFailure.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerificationFailure EZpvd(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new VerificationFailure(str, str2);
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
            if (!(obj instanceof VerificationFailure)) {
                return false;
            }
            VerificationFailure verificationFailure = (VerificationFailure) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) verificationFailure.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) verificationFailure.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VerificationFailure(code=" + this.OLrzqt + ", message=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationFailure(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class MaximumRetry extends MfaFailure {
        public static final Parcelable.Creator<MaximumRetry> CREATOR = new Creator();
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<MaximumRetry> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MaximumRetry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new MaximumRetry(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MaximumRetry[] newArray(int i) {
                return new MaximumRetry[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MaximumRetry copy$default(MaximumRetry maximumRetry, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = maximumRetry.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = maximumRetry.copydefault;
            }
            return maximumRetry.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MaximumRetry KWHzl(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new MaximumRetry(str, str2);
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
            if (!(obj instanceof MaximumRetry)) {
                return false;
            }
            MaximumRetry maximumRetry = (MaximumRetry) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) maximumRetry.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) maximumRetry.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MaximumRetry(code=" + this.OLrzqt + ", message=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaximumRetry(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class FacialCanRetry extends MfaFailure {
        public static final Parcelable.Creator<FacialCanRetry> CREATOR = new Creator();
        public final String KWHzl;
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<FacialCanRetry> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FacialCanRetry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new FacialCanRetry(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FacialCanRetry[] newArray(int i) {
                return new FacialCanRetry[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FacialCanRetry copy$default(FacialCanRetry facialCanRetry, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = facialCanRetry.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = facialCanRetry.KWHzl;
            }
            return facialCanRetry.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FacialCanRetry KWHzl(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new FacialCanRetry(str, str2);
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
            if (!(obj instanceof FacialCanRetry)) {
                return false;
            }
            FacialCanRetry facialCanRetry = (FacialCanRetry) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) facialCanRetry.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) facialCanRetry.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FacialCanRetry(code=" + this.OLrzqt + ", message=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.KWHzl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacialCanRetry(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.KWHzl = str2;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class FacialMaximumRetry extends MfaFailure {
        public static final Parcelable.Creator<FacialMaximumRetry> CREATOR = new Creator();
        public final String EZpvd;
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<FacialMaximumRetry> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FacialMaximumRetry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new FacialMaximumRetry(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FacialMaximumRetry[] newArray(int i) {
                return new FacialMaximumRetry[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FacialMaximumRetry copy$default(FacialMaximumRetry facialMaximumRetry, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = facialMaximumRetry.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = facialMaximumRetry.EZpvd;
            }
            return facialMaximumRetry.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FacialMaximumRetry AEQbTJ(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new FacialMaximumRetry(str, str2);
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
            if (!(obj instanceof FacialMaximumRetry)) {
                return false;
            }
            FacialMaximumRetry facialMaximumRetry = (FacialMaximumRetry) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) facialMaximumRetry.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) facialMaximumRetry.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FacialMaximumRetry(code=" + this.OLrzqt + ", message=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.EZpvd);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacialMaximumRetry(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.EZpvd = str2;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class TooManyOtpRequest extends MfaFailure {
        public static final Parcelable.Creator<TooManyOtpRequest> CREATOR = new Creator();
        public final long AEQbTJ;

        public static final class Creator implements Parcelable.Creator<TooManyOtpRequest> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TooManyOtpRequest createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TooManyOtpRequest(parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TooManyOtpRequest[] newArray(int i) {
                return new TooManyOtpRequest[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TooManyOtpRequest copy$default(TooManyOtpRequest tooManyOtpRequest, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = tooManyOtpRequest.AEQbTJ;
            }
            return tooManyOtpRequest.AEQbTJ(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TooManyOtpRequest AEQbTJ(long j) {
            return new TooManyOtpRequest(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
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
            return (obj instanceof TooManyOtpRequest) && this.AEQbTJ == ((TooManyOtpRequest) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TooManyOtpRequest(remainingTime=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.AEQbTJ);
        }

        public TooManyOtpRequest(long j) {
            super(null);
            this.AEQbTJ = j;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class OtherException extends MfaFailure {
        public static final Parcelable.Creator<OtherException> CREATOR = new Creator();
        public final Exception EZpvd;

        public static final class Creator implements Parcelable.Creator<OtherException> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OtherException createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OtherException((Exception) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OtherException[] newArray(int i) {
                return new OtherException[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OtherException copy$default(OtherException otherException, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = otherException.EZpvd;
            }
            return otherException.EZpvd(exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OtherException EZpvd(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            return new OtherException(exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Exception copydefault() {
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
            return (obj instanceof OtherException) && Intrinsics.EZpvd(this.EZpvd, ((OtherException) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OtherException(exception=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable(this.EZpvd);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherException(@NotNull Exception exc) {
            super(null);
            Intrinsics.checkNotNullParameter(exc, "");
            this.EZpvd = exc;
        }
    }
}
