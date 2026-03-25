package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyDAppDomainUrlResponse implements Parcelable {
    public static final int $stable = 0;
    public static final String LEVEL_EXTREMELY_HIGH = "EXTREMELY_HIGH";
    public static final String LEVEL_HIGH = "HIGH";
    public static final String LEVEL_LOW = "LOW";
    public static final String LEVEL_MEDIUM = "MEDIUM";
    private final String newLevel;
    private final String rule;
    private final String ruleType;
    public static final Application Companion = new Application(null);
    public static final Parcelable.Creator<VerifyDAppDomainUrlResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VerifyDAppDomainUrlResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyDAppDomainUrlResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VerifyDAppDomainUrlResponse(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyDAppDomainUrlResponse[] newArray(int i) {
            return new VerifyDAppDomainUrlResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VerifyDAppDomainUrlResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyDAppDomainUrlResponse copy$default(VerifyDAppDomainUrlResponse verifyDAppDomainUrlResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyDAppDomainUrlResponse.newLevel;
        }
        if ((i & 2) != 0) {
            str2 = verifyDAppDomainUrlResponse.rule;
        }
        if ((i & 4) != 0) {
            str3 = verifyDAppDomainUrlResponse.ruleType;
        }
        return verifyDAppDomainUrlResponse.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.newLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyDAppDomainUrlResponse copy(String str, String str2, String str3) {
        return new VerifyDAppDomainUrlResponse(str, str2, str3);
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
        if (!(obj instanceof VerifyDAppDomainUrlResponse)) {
            return false;
        }
        VerifyDAppDomainUrlResponse verifyDAppDomainUrlResponse = (VerifyDAppDomainUrlResponse) obj;
        return Intrinsics.EZpvd((Object) this.newLevel, (Object) verifyDAppDomainUrlResponse.newLevel) && Intrinsics.EZpvd((Object) this.rule, (Object) verifyDAppDomainUrlResponse.rule) && Intrinsics.EZpvd((Object) this.ruleType, (Object) verifyDAppDomainUrlResponse.ruleType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewLevel() {
        return this.newLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRule() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleType() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.newLevel;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.rule;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ruleType;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyDAppDomainUrlResponse(newLevel=" + this.newLevel + ", rule=" + this.rule + ", ruleType=" + this.ruleType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.newLevel);
        parcel.writeString(this.rule);
        parcel.writeString(this.ruleType);
    }

    public VerifyDAppDomainUrlResponse(String str, String str2, String str3) {
        this.newLevel = str;
        this.rule = str2;
        this.ruleType = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:595) call: com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VerifyDAppDomainUrlResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final boolean getHasRisk() {
        return Intrinsics.EZpvd((Object) LEVEL_EXTREMELY_HIGH, (Object) this.newLevel) || Intrinsics.EZpvd((Object) LEVEL_HIGH, (Object) this.newLevel);
    }
}
