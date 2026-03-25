package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PasskeySdkResult implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeySdkResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PasskeySdkResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PasskeySdkResult() {
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SuccessWithPublicKeyCredential extends PasskeySdkResult {
        public static final Parcelable.Creator<SuccessWithPublicKeyCredential> CREATOR = new Creator();
        public final byte[] OLrzqt;

        public static final class Creator implements Parcelable.Creator<SuccessWithPublicKeyCredential> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SuccessWithPublicKeyCredential createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SuccessWithPublicKeyCredential(parcel.createByteArray());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SuccessWithPublicKeyCredential[] newArray(int i) {
                return new SuccessWithPublicKeyCredential[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SuccessWithPublicKeyCredential copy$default(SuccessWithPublicKeyCredential successWithPublicKeyCredential, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = successWithPublicKeyCredential.OLrzqt;
            }
            return successWithPublicKeyCredential.OLrzqt(bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuccessWithPublicKeyCredential OLrzqt(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return new SuccessWithPublicKeyCredential(bArr);
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
            return (obj instanceof SuccessWithPublicKeyCredential) && Intrinsics.EZpvd(this.OLrzqt, ((SuccessWithPublicKeyCredential) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Arrays.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SuccessWithPublicKeyCredential(originalByteArray=" + Arrays.toString(this.OLrzqt) + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeByteArray(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessWithPublicKeyCredential(@NotNull byte[] bArr) {
            super(null);
            Intrinsics.checkNotNullParameter(bArr, "");
            this.OLrzqt = bArr;
        }

        public final PublicKeyCredential OLrzqt() {
            PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(this.OLrzqt);
            Intrinsics.checkNotNullExpressionValue(publicKeyCredentialDeserializeFromBytes, "");
            return publicKeyCredentialDeserializeFromBytes;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SuccessWithJson extends PasskeySdkResult {
        public static final Parcelable.Creator<SuccessWithJson> CREATOR = new Creator();
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<SuccessWithJson> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SuccessWithJson createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SuccessWithJson(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SuccessWithJson[] newArray(int i) {
                return new SuccessWithJson[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SuccessWithJson copy$default(SuccessWithJson successWithJson, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = successWithJson.OLrzqt;
            }
            return successWithJson.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuccessWithJson OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SuccessWithJson(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
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
            return (obj instanceof SuccessWithJson) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((SuccessWithJson) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SuccessWithJson(json=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessWithJson(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class CancelledOrVerifiedFail extends PasskeySdkResult {
        public static final Parcelable.Creator<CancelledOrVerifiedFail> CREATOR = new Creator();
        public final String EZpvd;

        public static final class Creator implements Parcelable.Creator<CancelledOrVerifiedFail> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelledOrVerifiedFail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CancelledOrVerifiedFail(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CancelledOrVerifiedFail[] newArray(int i) {
                return new CancelledOrVerifiedFail[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CancelledOrVerifiedFail copy$default(CancelledOrVerifiedFail cancelledOrVerifiedFail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cancelledOrVerifiedFail.EZpvd;
            }
            return cancelledOrVerifiedFail.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CancelledOrVerifiedFail EZpvd(String str) {
            return new CancelledOrVerifiedFail(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
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
            return (obj instanceof CancelledOrVerifiedFail) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((CancelledOrVerifiedFail) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.EZpvd;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CancelledOrVerifiedFail(errorMessage=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
        }

        public CancelledOrVerifiedFail(String str) {
            super(null);
            this.EZpvd = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class AlreadyExisted extends PasskeySdkResult {
        public static final Parcelable.Creator<AlreadyExisted> CREATOR = new Creator();
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<AlreadyExisted> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AlreadyExisted createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AlreadyExisted(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AlreadyExisted[] newArray(int i) {
                return new AlreadyExisted[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AlreadyExisted copy$default(AlreadyExisted alreadyExisted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alreadyExisted.OLrzqt;
            }
            return alreadyExisted.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AlreadyExisted AEQbTJ(String str) {
            return new AlreadyExisted(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
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
            return (obj instanceof AlreadyExisted) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((AlreadyExisted) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.OLrzqt;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AlreadyExisted(errorMessage=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
        }

        public AlreadyExisted(String str) {
            super(null);
            this.OLrzqt = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class NoValidPasskey extends PasskeySdkResult {
        public static final Parcelable.Creator<NoValidPasskey> CREATOR = new Creator();
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<NoValidPasskey> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoValidPasskey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new NoValidPasskey(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoValidPasskey[] newArray(int i) {
                return new NoValidPasskey[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NoValidPasskey copy$default(NoValidPasskey noValidPasskey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noValidPasskey.copydefault;
            }
            return noValidPasskey.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NoValidPasskey EZpvd(String str) {
            return new NoValidPasskey(str);
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
            return (obj instanceof NoValidPasskey) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((NoValidPasskey) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NoValidPasskey(errorMessage=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
        }

        public NoValidPasskey(String str) {
            super(null);
            this.copydefault = str;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Failure extends PasskeySdkResult {
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        public final ErrorCode AEQbTJ;
        public final String OLrzqt;
        public final boolean copydefault;

        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Failure((ErrorCode) parcel.readParcelable(Failure.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Failure copy$default(Failure failure, ErrorCode errorCode, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                errorCode = failure.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = failure.OLrzqt;
            }
            if ((i & 4) != 0) {
                z = failure.copydefault;
            }
            return failure.copydefault(errorCode, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ErrorCode AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Failure copydefault(ErrorCode errorCode, String str, boolean z) {
            return new Failure(errorCode, str, z);
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
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.AEQbTJ == failure.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) failure.OLrzqt) && this.copydefault == failure.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            ErrorCode errorCode = this.AEQbTJ;
            int iHashCode = errorCode == null ? 0 : errorCode.hashCode();
            String str = this.OLrzqt;
            return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Failure(errorCode=" + this.AEQbTJ + ", errorMessage=" + this.OLrzqt + ", fallbackFido2=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.AEQbTJ, i);
            parcel.writeString(this.OLrzqt);
            parcel.writeInt(this.copydefault ? 1 : 0);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.google.android.gms.fido.fido2.api.common.ErrorCode)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(com.google.android.gms.fido.fido2.api.common.ErrorCode, java.lang.String, boolean):void (m)] (LINE:256) call: com.okinc.auth.api.passkey.PasskeySdkResult.Failure.<init>(com.google.android.gms.fido.fido2.api.common.ErrorCode, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Failure(ErrorCode errorCode, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(errorCode, str, (i & 4) != 0 ? false : z);
        }

        public Failure(ErrorCode errorCode, String str, boolean z) {
            super(null);
            this.AEQbTJ = errorCode;
            this.OLrzqt = str;
            this.copydefault = z;
        }

        public final boolean copydefault() {
            String str = this.OLrzqt;
            return str != null && StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "50128", false, 2, (Object) null);
        }

        public final boolean djBIcL() {
            String str = this.OLrzqt;
            return str != null && StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "50162", false, 2, (Object) null);
        }

        public final boolean AhwBna() {
            List<String> listGEmmrt = yDY.gEmmrt("Connection reset", "/.well-known", "assetlinks", "asset_not_support");
            if (!(listGEmmrt instanceof Collection) || !listGEmmrt.isEmpty()) {
                for (String str : listGEmmrt) {
                    String str2 = this.OLrzqt;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (StringsKt__StringsKt.AhwBna((CharSequence) str2, (CharSequence) str, true)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final String EZpvd() {
        if (this instanceof SuccessWithPublicKeyCredential) {
            return "SuccessWithPublicKeyCredential";
        }
        if (this instanceof SuccessWithJson) {
            return "SuccessWithJson";
        }
        if (this instanceof CancelledOrVerifiedFail) {
            return "CancelledOrVerifiedFail: " + ((CancelledOrVerifiedFail) this).OLrzqt();
        }
        if (this instanceof AlreadyExisted) {
            return "AlreadyExisted: " + ((AlreadyExisted) this).KWHzl();
        }
        if (this instanceof NoValidPasskey) {
            return "NoValidPasskey: " + ((NoValidPasskey) this).copydefault();
        }
        if (!(this instanceof Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        Failure failure = (Failure) this;
        return "Failure: code=" + failure.AEQbTJ() + ", message=" + failure.KWHzl() + ", fallbackFido2=" + failure.OLrzqt();
    }
}
