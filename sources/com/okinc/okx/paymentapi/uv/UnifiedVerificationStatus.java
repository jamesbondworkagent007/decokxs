package com.okinc.okx.paymentapi.uv;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class UnifiedVerificationStatus implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.uv.UnifiedVerificationStatus.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UnifiedVerificationStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UnifiedVerificationStatus() {
    }

    public static final class UnifiedVerificationSuccess extends UnifiedVerificationStatus {
        public static final Parcelable.Creator<UnifiedVerificationSuccess> CREATOR = new Creator();
        public final PreVerifiedResult EZpvd;
        public final PreloadResult OLrzqt;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<UnifiedVerificationSuccess> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnifiedVerificationSuccess createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UnifiedVerificationSuccess(PreVerifiedResult.CREATOR.createFromParcel(parcel), PreloadResult.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnifiedVerificationSuccess[] newArray(int i) {
                return new UnifiedVerificationSuccess[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnifiedVerificationSuccess copy$default(UnifiedVerificationSuccess unifiedVerificationSuccess, PreVerifiedResult preVerifiedResult, PreloadResult preloadResult, int i, Object obj) {
            if ((i & 1) != 0) {
                preVerifiedResult = unifiedVerificationSuccess.EZpvd;
            }
            if ((i & 2) != 0) {
                preloadResult = unifiedVerificationSuccess.OLrzqt;
            }
            return unifiedVerificationSuccess.OLrzqt(preVerifiedResult, preloadResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PreVerifiedResult EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PreloadResult OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnifiedVerificationSuccess OLrzqt(@NotNull PreVerifiedResult preVerifiedResult, @NotNull PreloadResult preloadResult) {
            Intrinsics.checkNotNullParameter(preVerifiedResult, "");
            Intrinsics.checkNotNullParameter(preloadResult, "");
            return new UnifiedVerificationSuccess(preVerifiedResult, preloadResult);
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
            if (!(obj instanceof UnifiedVerificationSuccess)) {
                return false;
            }
            UnifiedVerificationSuccess unifiedVerificationSuccess = (UnifiedVerificationSuccess) obj;
            return Intrinsics.EZpvd(this.EZpvd, unifiedVerificationSuccess.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, unifiedVerificationSuccess.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnifiedVerificationSuccess(preVerifiedResult=" + this.EZpvd + ", preloadResult=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.EZpvd.writeToParcel(parcel, i);
            this.OLrzqt.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnifiedVerificationSuccess(@NotNull PreVerifiedResult preVerifiedResult, @NotNull PreloadResult preloadResult) {
            super(null);
            Intrinsics.checkNotNullParameter(preVerifiedResult, "");
            Intrinsics.checkNotNullParameter(preloadResult, "");
            this.EZpvd = preVerifiedResult;
            this.OLrzqt = preloadResult;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class UnifiedVerificationFailed extends UnifiedVerificationStatus {
        public static final Parcelable.Creator<UnifiedVerificationFailed> CREATOR = new Creator();
        public final UnifiedVerificationType AEQbTJ;
        public final boolean KWHzl;
        public final boolean OLrzqt;

        public static final class Creator implements Parcelable.Creator<UnifiedVerificationFailed> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnifiedVerificationFailed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UnifiedVerificationFailed(UnifiedVerificationType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnifiedVerificationFailed[] newArray(int i) {
                return new UnifiedVerificationFailed[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnifiedVerificationFailed copy$default(UnifiedVerificationFailed unifiedVerificationFailed, UnifiedVerificationType unifiedVerificationType, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                unifiedVerificationType = unifiedVerificationFailed.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = unifiedVerificationFailed.OLrzqt;
            }
            if ((i & 4) != 0) {
                z2 = unifiedVerificationFailed.KWHzl;
            }
            return unifiedVerificationFailed.copydefault(unifiedVerificationType, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnifiedVerificationType OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnifiedVerificationFailed copydefault(@NotNull UnifiedVerificationType unifiedVerificationType, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(unifiedVerificationType, "");
            return new UnifiedVerificationFailed(unifiedVerificationType, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
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
            if (!(obj instanceof UnifiedVerificationFailed)) {
                return false;
            }
            UnifiedVerificationFailed unifiedVerificationFailed = (UnifiedVerificationFailed) obj;
            return this.AEQbTJ == unifiedVerificationFailed.AEQbTJ && this.OLrzqt == unifiedVerificationFailed.OLrzqt && this.KWHzl == unifiedVerificationFailed.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnifiedVerificationFailed(uvType=" + this.AEQbTJ + ", onErrorScreenDisplayed=" + this.OLrzqt + ", enablePayback=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ.name());
            parcel.writeInt(this.OLrzqt ? 1 : 0);
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnifiedVerificationFailed(@NotNull UnifiedVerificationType unifiedVerificationType, boolean z, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(unifiedVerificationType, "");
            this.AEQbTJ = unifiedVerificationType;
            this.OLrzqt = z;
            this.KWHzl = z2;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class UnifiedVerificationApiError extends UnifiedVerificationStatus {
        public static final Parcelable.Creator<UnifiedVerificationApiError> CREATOR = new Creator();
        public final boolean AEQbTJ;

        public static final class Creator implements Parcelable.Creator<UnifiedVerificationApiError> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnifiedVerificationApiError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UnifiedVerificationApiError(parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnifiedVerificationApiError[] newArray(int i) {
                return new UnifiedVerificationApiError[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UnifiedVerificationApiError() {
            this(false, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnifiedVerificationApiError copy$default(UnifiedVerificationApiError unifiedVerificationApiError, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = unifiedVerificationApiError.AEQbTJ;
            }
            return unifiedVerificationApiError.KWHzl(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnifiedVerificationApiError KWHzl(boolean z) {
            return new UnifiedVerificationApiError(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
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
            return (obj instanceof UnifiedVerificationApiError) && this.AEQbTJ == ((UnifiedVerificationApiError) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnifiedVerificationApiError(onErrorScreenDisplayed=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.AEQbTJ ? 1 : 0);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:22) call: com.okinc.okx.paymentapi.uv.UnifiedVerificationStatus.UnifiedVerificationApiError.<init>(boolean):void type: THIS */
        public /* synthetic */ UnifiedVerificationApiError(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public UnifiedVerificationApiError(boolean z) {
            super(null);
            this.AEQbTJ = z;
        }
    }
}
