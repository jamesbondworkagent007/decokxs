package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public abstract class CedefiOrderResult implements Parcelable {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.presentation.CedefiOrderResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CedefiOrderResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CedefiOrderResult() {
    }

    public static final class Success extends CedefiOrderResult {
        public static final Success copydefault = new Success();
        public static final Parcelable.Creator<Success> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Success.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
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
            if (!(obj instanceof Success)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1996866549;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Success() {
            super(null);
        }
    }

    public static final class Failure extends CedefiOrderResult {
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        public final String EZpvd;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Failure(parcel.readString(), parcel.readString());
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
        public Failure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = failure.EZpvd;
            }
            return failure.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Failure EZpvd(String str, String str2) {
            return new Failure(str, str2);
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
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) failure.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) failure.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Failure(errorCode=" + this.copydefault + ", errorMsg=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.EZpvd);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:132) call: com.okinc.okx.paymentapi.presentation.CedefiOrderResult.Failure.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Failure(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public Failure(String str, String str2) {
            super(null);
            this.copydefault = str;
            this.EZpvd = str2;
        }
    }

    public static final class Cancel extends CedefiOrderResult {
        public static final Cancel copydefault = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Cancel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Cancel.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
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
            if (!(obj instanceof Cancel)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -688888760;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Cancel";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Cancel() {
            super(null);
        }
    }

    public static final class SignDEXTransactionFailed extends CedefiOrderResult {
        public static final Parcelable.Creator<SignDEXTransactionFailed> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<SignDEXTransactionFailed> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignDEXTransactionFailed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SignDEXTransactionFailed(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignDEXTransactionFailed[] newArray(int i) {
                return new SignDEXTransactionFailed[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SignDEXTransactionFailed() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SignDEXTransactionFailed copy$default(SignDEXTransactionFailed signDEXTransactionFailed, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signDEXTransactionFailed.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = signDEXTransactionFailed.EZpvd;
            }
            if ((i & 4) != 0) {
                str3 = signDEXTransactionFailed.OLrzqt;
            }
            return signDEXTransactionFailed.AEQbTJ(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignDEXTransactionFailed AEQbTJ(String str, String str2, String str3) {
            return new SignDEXTransactionFailed(str, str2, str3);
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
            if (!(obj instanceof SignDEXTransactionFailed)) {
                return false;
            }
            SignDEXTransactionFailed signDEXTransactionFailed = (SignDEXTransactionFailed) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) signDEXTransactionFailed.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) signDEXTransactionFailed.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signDEXTransactionFailed.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.AEQbTJ;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SignDEXTransactionFailed(mainOrderId=" + this.AEQbTJ + ", baseAmount=" + this.EZpvd + ", baseCurrency=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.OLrzqt);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:141) call: com.okinc.okx.paymentapi.presentation.CedefiOrderResult.SignDEXTransactionFailed.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SignDEXTransactionFailed(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public SignDEXTransactionFailed(String str, String str2, String str3) {
            super(null);
            this.AEQbTJ = str;
            this.EZpvd = str2;
            this.OLrzqt = str3;
        }
    }

    public static final class SignDEXTransactionCancelled extends CedefiOrderResult {
        public static final Parcelable.Creator<SignDEXTransactionCancelled> CREATOR = new Creator();
        public final String EZpvd;
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<SignDEXTransactionCancelled> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignDEXTransactionCancelled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SignDEXTransactionCancelled(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignDEXTransactionCancelled[] newArray(int i) {
                return new SignDEXTransactionCancelled[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SignDEXTransactionCancelled() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SignDEXTransactionCancelled copy$default(SignDEXTransactionCancelled signDEXTransactionCancelled, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signDEXTransactionCancelled.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = signDEXTransactionCancelled.OLrzqt;
            }
            if ((i & 4) != 0) {
                str3 = signDEXTransactionCancelled.EZpvd;
            }
            return signDEXTransactionCancelled.AEQbTJ(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignDEXTransactionCancelled AEQbTJ(String str, String str2, String str3) {
            return new SignDEXTransactionCancelled(str, str2, str3);
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
            if (!(obj instanceof SignDEXTransactionCancelled)) {
                return false;
            }
            SignDEXTransactionCancelled signDEXTransactionCancelled = (SignDEXTransactionCancelled) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) signDEXTransactionCancelled.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signDEXTransactionCancelled.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) signDEXTransactionCancelled.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.OLrzqt;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.EZpvd;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SignDEXTransactionCancelled(mainOrderId=" + this.copydefault + ", baseAmount=" + this.OLrzqt + ", baseCurrency=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.EZpvd);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:148) call: com.okinc.okx.paymentapi.presentation.CedefiOrderResult.SignDEXTransactionCancelled.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SignDEXTransactionCancelled(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public SignDEXTransactionCancelled(String str, String str2, String str3) {
            super(null);
            this.copydefault = str;
            this.OLrzqt = str2;
            this.EZpvd = str3;
        }
    }

    public static final class DexQuoteNotFound extends CedefiOrderResult {
        public static final Parcelable.Creator<DexQuoteNotFound> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<DexQuoteNotFound> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DexQuoteNotFound createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DexQuoteNotFound(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DexQuoteNotFound[] newArray(int i) {
                return new DexQuoteNotFound[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DexQuoteNotFound() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DexQuoteNotFound copy$default(DexQuoteNotFound dexQuoteNotFound, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dexQuoteNotFound.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = dexQuoteNotFound.EZpvd;
            }
            if ((i & 4) != 0) {
                str3 = dexQuoteNotFound.AEQbTJ;
            }
            if ((i & 8) != 0) {
                str4 = dexQuoteNotFound.copydefault;
            }
            return dexQuoteNotFound.copydefault(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexQuoteNotFound copydefault(String str, String str2, String str3, String str4) {
            return new DexQuoteNotFound(str, str2, str3, str4);
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
            if (!(obj instanceof DexQuoteNotFound)) {
                return false;
            }
            DexQuoteNotFound dexQuoteNotFound = (DexQuoteNotFound) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) dexQuoteNotFound.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) dexQuoteNotFound.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dexQuoteNotFound.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) dexQuoteNotFound.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.AEQbTJ;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DexQuoteNotFound(mainOrderId=" + this.OLrzqt + ", subOrderId=" + this.EZpvd + ", baseAmount=" + this.AEQbTJ + ", baseCurrency=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.copydefault);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:155) call: com.okinc.okx.paymentapi.presentation.CedefiOrderResult.DexQuoteNotFound.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ DexQuoteNotFound(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }

        public DexQuoteNotFound(String str, String str2, String str3, String str4) {
            super(null);
            this.OLrzqt = str;
            this.EZpvd = str2;
            this.AEQbTJ = str3;
            this.copydefault = str4;
        }
    }

    public static final class AuthenticationApiFailed extends CedefiOrderResult {
        public static final Parcelable.Creator<AuthenticationApiFailed> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;

        public static final class Creator implements Parcelable.Creator<AuthenticationApiFailed> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuthenticationApiFailed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AuthenticationApiFailed(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuthenticationApiFailed[] newArray(int i) {
                return new AuthenticationApiFailed[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AuthenticationApiFailed() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AuthenticationApiFailed copy$default(AuthenticationApiFailed authenticationApiFailed, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authenticationApiFailed.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = authenticationApiFailed.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = authenticationApiFailed.KWHzl;
            }
            return authenticationApiFailed.EZpvd(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationApiFailed EZpvd(String str, String str2, String str3) {
            return new AuthenticationApiFailed(str, str2, str3);
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
            if (!(obj instanceof AuthenticationApiFailed)) {
                return false;
            }
            AuthenticationApiFailed authenticationApiFailed = (AuthenticationApiFailed) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) authenticationApiFailed.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) authenticationApiFailed.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) authenticationApiFailed.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.EZpvd;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.AEQbTJ;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.KWHzl;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AuthenticationApiFailed(mainOrderId=" + this.EZpvd + ", baseAmount=" + this.AEQbTJ + ", baseCurrency=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.KWHzl);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:163) call: com.okinc.okx.paymentapi.presentation.CedefiOrderResult.AuthenticationApiFailed.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ AuthenticationApiFailed(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public AuthenticationApiFailed(String str, String str2, String str3) {
            super(null);
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.presentation.CedefiOrderResult.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
