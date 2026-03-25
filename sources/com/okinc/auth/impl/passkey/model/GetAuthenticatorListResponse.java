package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.okinc.localization2.bean.AppLocaleInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.C5988aGp;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAuthenticatorListResponse {
    public static final int $stable = 8;

    @SerializedName("allowUnlink")
    private final Boolean allowUnlink;

    @SerializedName("authenticators")
    private final List<TaskDescription> authenticators;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAuthenticatorListResponse copy$default(GetAuthenticatorListResponse getAuthenticatorListResponse, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getAuthenticatorListResponse.authenticators;
        }
        if ((i & 2) != 0) {
            bool = getAuthenticatorListResponse.allowUnlink;
        }
        return getAuthenticatorListResponse.copy(list, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TaskDescription> component1() {
        return this.authenticators;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.allowUnlink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetAuthenticatorListResponse copy(@NotNull List<TaskDescription> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        return new GetAuthenticatorListResponse(list, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthenticatorListResponse)) {
            return false;
        }
        GetAuthenticatorListResponse getAuthenticatorListResponse = (GetAuthenticatorListResponse) obj;
        return Intrinsics.EZpvd(this.authenticators, getAuthenticatorListResponse.authenticators) && Intrinsics.EZpvd(this.allowUnlink, getAuthenticatorListResponse.allowUnlink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowUnlink() {
        return this.allowUnlink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TaskDescription> getAuthenticators() {
        return this.authenticators;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.authenticators.hashCode();
        Boolean bool = this.allowUnlink;
        return (iHashCode * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetAuthenticatorListResponse(authenticators=" + this.authenticators + ", allowUnlink=" + this.allowUnlink + ")";
    }

    public GetAuthenticatorListResponse(@NotNull List<TaskDescription> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        this.authenticators = list;
        this.allowUnlink = bool;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public static final int $stable = 8;

        @SerializedName("chainList")
        private final List<Chain> chainList;

        @SerializedName("credentialId")
        private final String credentialId;

        @SerializedName("credentialType")
        private final String credentialType;

        @SerializedName("currentDevice")
        private final Boolean currentDevice;

        @SerializedName("dexChainList")
        private final List<Chain> dexChainList;

        @SerializedName(AppLocaleInfo.KEY_DISPLAY_NAME)
        private final String displayName;

        @SerializedName("inHouse")
        private final Boolean inHouse;

        @SerializedName("inHouseVer")
        private final Integer inHouseVer;

        @SerializedName("lastUsedTimestamp")
        private final Long lastUsedTimestamp;

        @SerializedName("registrationTimestamp")
        private final Long registrationTimestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Chain> AEQbTJ() {
            return this.dexChainList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.displayName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long AhwBna() {
            return this.lastUsedTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(String str, String str2, String str3, Long l, Long l2, List<Chain> list, List<Chain> list2, Boolean bool, Boolean bool2, Integer num) {
            return new TaskDescription(str, str2, str3, l, l2, list, list2, bool, bool2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.credentialId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Chain> KWHzl() {
            return this.chainList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean OLrzqt() {
            return this.currentDevice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.credentialType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer djBIcL() {
            return this.inHouseVer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((Object) this.credentialId, (Object) taskDescription.credentialId) && Intrinsics.EZpvd((Object) this.displayName, (Object) taskDescription.displayName) && Intrinsics.EZpvd((Object) this.credentialType, (Object) taskDescription.credentialType) && Intrinsics.EZpvd(this.lastUsedTimestamp, taskDescription.lastUsedTimestamp) && Intrinsics.EZpvd(this.registrationTimestamp, taskDescription.registrationTimestamp) && Intrinsics.EZpvd(this.dexChainList, taskDescription.dexChainList) && Intrinsics.EZpvd(this.chainList, taskDescription.chainList) && Intrinsics.EZpvd(this.currentDevice, taskDescription.currentDevice) && Intrinsics.EZpvd(this.inHouse, taskDescription.inHouse) && Intrinsics.EZpvd(this.inHouseVer, taskDescription.inHouseVer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean gEmmrt() {
            return this.inHouse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.credentialId;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.displayName;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.credentialType;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            Long l = this.lastUsedTimestamp;
            int iHashCode4 = l == null ? 0 : l.hashCode();
            Long l2 = this.registrationTimestamp;
            int iHashCode5 = l2 == null ? 0 : l2.hashCode();
            List<Chain> list = this.dexChainList;
            int iHashCode6 = list == null ? 0 : list.hashCode();
            List<Chain> list2 = this.chainList;
            int iHashCode7 = list2 == null ? 0 : list2.hashCode();
            Boolean bool = this.currentDevice;
            int iHashCode8 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.inHouse;
            int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
            Integer num = this.inHouseVer;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Authenticator(credentialId=" + this.credentialId + ", displayName=" + this.displayName + ", credentialType=" + this.credentialType + ", lastUsedTimestamp=" + this.lastUsedTimestamp + ", registrationTimestamp=" + this.registrationTimestamp + ", dexChainList=" + this.dexChainList + ", chainList=" + this.chainList + ", currentDevice=" + this.currentDevice + ", inHouse=" + this.inHouse + ", inHouseVer=" + this.inHouseVer + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long valueOf() {
            return this.registrationTimestamp;
        }

        public TaskDescription(String str, String str2, String str3, Long l, Long l2, List<Chain> list, List<Chain> list2, Boolean bool, Boolean bool2, Integer num) {
            this.credentialId = str;
            this.displayName = str2;
            this.credentialType = str3;
            this.lastUsedTimestamp = l;
            this.registrationTimestamp = l2;
            this.dexChainList = list;
            this.chainList = list2;
            this.currentDevice = bool;
            this.inHouse = bool2;
            this.inHouseVer = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.util.List<com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse$Chain>, java.util.List<com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse$Chain>, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:24) call: com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse.TaskDescription.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void type: THIS */
        public /* synthetic */ TaskDescription(String str, String str2, String str3, Long l, Long l2, List list, List list2, Boolean bool, Boolean bool2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) == 0 ? num : null);
        }

        public final boolean fetchVPNInfo() {
            if (this.dexChainList != null && (!r0.isEmpty())) {
                List<Chain> list = this.dexChainList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((Object) ((Chain) it.next()).getStatus(), (Object) "1")) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static final class Chain implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Chain> CREATOR = new Creator();

        @SerializedName("chainIndex")
        private final String chainIndex;

        @SerializedName("chainName")
        private final String chainName;

        @SerializedName("darkChainLogo")
        private final String darkChainLogo;

        @SerializedName("lightChainLogo")
        private final String lightChainLogo;

        @SerializedName("status")
        private final String status;

        public static final class Creator implements Parcelable.Creator<Chain> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Chain createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Chain(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Chain[] newArray(int i) {
                return new Chain[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Chain() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Chain copy$default(Chain chain, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chain.chainIndex;
            }
            if ((i & 2) != 0) {
                str2 = chain.chainName;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = chain.lightChainLogo;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = chain.darkChainLogo;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = chain.status;
            }
            return chain.copy(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.lightChainLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.darkChainLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Chain copy(String str, String str2, String str3, String str4, String str5) {
            return new Chain(str, str2, str3, str4, str5);
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
            if (!(obj instanceof Chain)) {
                return false;
            }
            Chain chain = (Chain) obj;
            return Intrinsics.EZpvd((Object) this.chainIndex, (Object) chain.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) chain.chainName) && Intrinsics.EZpvd((Object) this.lightChainLogo, (Object) chain.lightChainLogo) && Intrinsics.EZpvd((Object) this.darkChainLogo, (Object) chain.darkChainLogo) && Intrinsics.EZpvd((Object) this.status, (Object) chain.status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainIndex() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainName() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDarkChainLogo() {
            return this.darkChainLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLightChainLogo() {
            return this.lightChainLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.chainIndex;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.chainName;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.lightChainLogo;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.darkChainLogo;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.status;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Chain(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", lightChainLogo=" + this.lightChainLogo + ", darkChainLogo=" + this.darkChainLogo + ", status=" + this.status + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.chainIndex);
            parcel.writeString(this.chainName);
            parcel.writeString(this.lightChainLogo);
            parcel.writeString(this.darkChainLogo);
            parcel.writeString(this.status);
        }

        public Chain(String str, String str2, String str3, String str4, String str5) {
            this.chainIndex = str;
            this.chainName = str2;
            this.lightChainLogo = str3;
            this.darkChainLogo = str4;
            this.status = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:52) call: com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse.Chain.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Chain(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }
    }

    public static /* synthetic */ List toDisplayModelList$default(GetAuthenticatorListResponse getAuthenticatorListResponse, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        return getAuthenticatorListResponse.toDisplayModelList(z, z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }

    public final List<AuthenticatorDisplayModel> toDisplayModelList(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        AuthenticatorDisplayModel authenticatorDisplayModelAEQbTJ;
        List<TaskDescription> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(this.authenticators, new Application());
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        boolean z9 = false;
        for (TaskDescription taskDescription : listEZpvd) {
            boolean z10 = taskDescription != null && taskDescription.fetchVPNInfo();
            boolean z11 = z10 && !z8;
            boolean z12 = (z10 || z9) ? false : true;
            if (z10) {
                z7 = z9;
                z6 = true;
            } else {
                z6 = z8;
                z7 = true;
            }
            if (taskDescription != null) {
                boolean z13 = z2 ? false : z11;
                if (z2) {
                    z12 = false;
                }
                authenticatorDisplayModelAEQbTJ = C5988aGp.AEQbTJ(taskDescription, z13, z12, z, z2, z5, z3 && Intrinsics.EZpvd(taskDescription.gEmmrt(), Boolean.FALSE) && z4);
            } else {
                authenticatorDisplayModelAEQbTJ = null;
            }
            if (authenticatorDisplayModelAEQbTJ != null) {
                arrayList.add(authenticatorDisplayModelAEQbTJ);
            }
            z8 = z6;
            z9 = z7;
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public static final class Application<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            TaskDescription taskDescription = (TaskDescription) t;
            Integer num = 1;
            Integer num2 = taskDescription == null ? null : taskDescription.fetchVPNInfo() ? 0 : num;
            TaskDescription taskDescription2 = (TaskDescription) t2;
            if (taskDescription2 == null) {
                num = null;
            } else if (taskDescription2.fetchVPNInfo()) {
                num = 0;
            }
            return yET.KWHzl(num2, num);
        }
    }

    public final List<AuthenticatorSelectModel> toSelectionList(boolean z) {
        List displayModelList$default = toDisplayModelList$default(this, z, false, false, false, false, 28, null);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(displayModelList$default, 10));
        Iterator it = displayModelList$default.iterator();
        while (it.hasNext()) {
            arrayList.add(new AuthenticatorSelectModel(false, (AuthenticatorDisplayModel) it.next()));
        }
        return arrayList;
    }
}
