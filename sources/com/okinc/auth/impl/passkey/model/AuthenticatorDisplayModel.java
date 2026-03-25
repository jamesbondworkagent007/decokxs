package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticatorDisplayModel implements Parcelable {
    public static final List<AuthenticatorDisplayModel> OLrzqt;
    public final List<GetAuthenticatorListResponse.Chain> AEQbTJ;
    public final CredentialType AYXKKw;
    public final boolean AhwBna;
    public final String AkhnZx;
    public final boolean DbNXlk;
    public final int EZpvd;
    public final List<String> KWHzl;
    public final boolean djBIcL;
    public final boolean fARcdN;
    public final boolean fIwbmz;
    public final boolean fetchVPNInfo;
    public final String gEmmrt;
    public final String isConnected;
    public final String valueOf;
    public final boolean values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<AuthenticatorDisplayModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AuthenticatorDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticatorDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            CredentialType credentialTypeValueOf = CredentialType.valueOf(parcel.readString());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(GetAuthenticatorListResponse.Chain.CREATOR.createFromParcel(parcel));
            }
            return new AuthenticatorDisplayModel(string, string2, string3, string4, z, credentialTypeValueOf, arrayListCreateStringArrayList, i, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticatorDisplayModel[] newArray(int i) {
            return new AuthenticatorDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthenticatorDisplayModel() {
        this(null, null, null, null, false, null, null, 0, null, false, false, false, false, false, false, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GetAuthenticatorListResponse.Chain> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CredentialType KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticatorDisplayModel copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull CredentialType credentialType, @NotNull List<String> list, int i, @NotNull List<GetAuthenticatorListResponse.Chain> list2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(credentialType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new AuthenticatorDisplayModel(str, str2, str3, str4, z, credentialType, list, i, list2, z2, z3, z4, z5, z6, z7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.valueOf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticatorDisplayModel)) {
            return false;
        }
        AuthenticatorDisplayModel authenticatorDisplayModel = (AuthenticatorDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.valueOf, (Object) authenticatorDisplayModel.valueOf) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) authenticatorDisplayModel.gEmmrt) && Intrinsics.EZpvd((Object) this.isConnected, (Object) authenticatorDisplayModel.isConnected) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) authenticatorDisplayModel.AkhnZx) && this.AhwBna == authenticatorDisplayModel.AhwBna && this.AYXKKw == authenticatorDisplayModel.AYXKKw && Intrinsics.EZpvd(this.KWHzl, authenticatorDisplayModel.KWHzl) && this.EZpvd == authenticatorDisplayModel.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, authenticatorDisplayModel.AEQbTJ) && this.djBIcL == authenticatorDisplayModel.djBIcL && this.fARcdN == authenticatorDisplayModel.fARcdN && this.fIwbmz == authenticatorDisplayModel.fIwbmz && this.fetchVPNInfo == authenticatorDisplayModel.fetchVPNInfo && this.DbNXlk == authenticatorDisplayModel.DbNXlk && this.values == authenticatorDisplayModel.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.valueOf.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Integer.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + Boolean.hashCode(this.fARcdN)) * 31) + Boolean.hashCode(this.fIwbmz)) * 31) + Boolean.hashCode(this.fetchVPNInfo)) * 31) + Boolean.hashCode(this.DbNXlk)) * 31) + Boolean.hashCode(this.values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AuthenticatorDisplayModel(credentialId=" + this.valueOf + ", displayName=" + this.gEmmrt + ", lastUsedTimeDisplay=" + this.isConnected + ", registrationTimeDisplay=" + this.AkhnZx + ", isInHouse=" + this.AhwBna + ", credentialType=" + this.AYXKKw + ", chainIconUrlList=" + this.KWHzl + ", chainActiveCount=" + this.EZpvd + ", chainList=" + this.AEQbTJ + ", isManagementEnabled=" + this.djBIcL + ", showNotSyncOnDevice=" + this.fARcdN + ", showNotAvailableOnDevice=" + this.fIwbmz + ", isOkxPay=" + this.fetchVPNInfo + ", showCedefiTitle=" + this.DbNXlk + ", showCefiTitle=" + this.values + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.valueOf);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.AkhnZx);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeString(this.AYXKKw.name());
        parcel.writeStringList(this.KWHzl);
        parcel.writeInt(this.EZpvd);
        List<GetAuthenticatorListResponse.Chain> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<GetAuthenticatorListResponse.Chain> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeInt(this.fARcdN ? 1 : 0);
        parcel.writeInt(this.fIwbmz ? 1 : 0);
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
        parcel.writeInt(this.DbNXlk ? 1 : 0);
        parcel.writeInt(this.values ? 1 : 0);
    }

    public AuthenticatorDisplayModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull CredentialType credentialType, @NotNull List<String> list, int i, @NotNull List<GetAuthenticatorListResponse.Chain> list2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(credentialType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.valueOf = str;
        this.gEmmrt = str2;
        this.isConnected = str3;
        this.AkhnZx = str4;
        this.AhwBna = z;
        this.AYXKKw = credentialType;
        this.KWHzl = list;
        this.EZpvd = i;
        this.AEQbTJ = list2;
        this.djBIcL = z2;
        this.fARcdN = z3;
        this.fIwbmz = z4;
        this.fetchVPNInfo = z5;
        this.DbNXlk = z6;
        this.values = z7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:com.okinc.auth.impl.passkey.model.CredentialType:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: SGET  A[WRAPPED] (LINE:162) com.okinc.auth.impl.passkey.model.CredentialType.UNKNOWN com.okinc.auth.impl.passkey.model.CredentialType) : (r22v0 com.okinc.auth.impl.passkey.model.CredentialType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:163)) : (r23v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0040: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0048: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:165)) : (r25v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006b: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0073: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007b: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.auth.impl.passkey.model.CredentialType, java.util.List<java.lang.String>, int, java.util.List<com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse$Chain>, boolean, boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:156) call: com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.auth.impl.passkey.model.CredentialType, java.util.List, int, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ AuthenticatorDisplayModel(String str, String str2, String str3, String str4, boolean z, CredentialType credentialType, List list, int i, List list2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? CredentialType.UNKNOWN : credentialType, (i2 & 64) != 0 ? yDY.AhwBna() : list, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? yDY.AhwBna() : list2, (i2 & 512) != 0 ? true : z2, (i2 & 1024) != 0 ? false : z3, (i2 & 2048) != 0 ? false : z4, (i2 & 4096) != 0 ? false : z5, (i2 & 8192) != 0 ? false : z6, (i2 & 16384) == 0 ? z7 : false);
    }

    public final boolean DbNXlk() {
        return fetchVPNInfo() || this.fetchVPNInfo;
    }

    public final boolean fetchVPNInfo() {
        return !this.fetchVPNInfo && (this.AEQbTJ.isEmpty() ^ true) && this.EZpvd > 0;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    static {
        CredentialType credentialType = CredentialType.HYBRID;
        OLrzqt = yDY.gEmmrt(new AuthenticatorDisplayModel("credentialId", "Samsung (Android)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null), new AuthenticatorDisplayModel("credentialId", "Iphone 14 (iOS)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null), new AuthenticatorDisplayModel("credentialId", "Sony Xperia 1 IV (Android)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null), new AuthenticatorDisplayModel("credentialId", "Iphone 12 pro (iOS)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null), new AuthenticatorDisplayModel("credentialId", "Iphone 11 (iOS)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null), new AuthenticatorDisplayModel("credentialId", "Samsung Galaxy M33 (Android)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null), new AuthenticatorDisplayModel("credentialId", "Iphone 14 (iOS)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null), new AuthenticatorDisplayModel("credentialId", "OPPO Reno8 Z(Android)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null), new AuthenticatorDisplayModel("credentialId", "Google Pixel 7 (Android)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null), new AuthenticatorDisplayModel("credentialId", "Google Pixel 6a (iOS)", "Apr 24, 2023", "Apr 24, 2023", false, credentialType, null, 0, null, false, false, false, false, false, false, 32704, null));
    }
}
