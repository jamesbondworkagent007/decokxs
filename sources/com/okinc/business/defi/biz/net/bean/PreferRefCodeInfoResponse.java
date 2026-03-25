package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C13921dbh;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class PreferRefCodeInfoResponse implements Parcelable {
    private boolean allowed;
    private int codeStatus;
    private String discountRate;
    private String discountRateThreshold;
    private String inviterAddr;
    private List<InviterAddress> inviterAddresses;
    private int inviterStatus;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PreferRefCodeInfoResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(InviterAddress$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<PreferRefCodeInfoResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreferRefCodeInfoResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(InviterAddress.CREATOR.createFromParcel(parcel));
            }
            return new PreferRefCodeInfoResponse(string, string2, i, i2, z, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreferRefCodeInfoResponse[] newArray(int i) {
            return new PreferRefCodeInfoResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PreferRefCodeInfoResponse() {
        this((String) null, (String) null, 0, 0, false, (String) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.biz.net.bean.PreferRefCodeInfoResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreferRefCodeInfoResponse copy$default(PreferRefCodeInfoResponse preferRefCodeInfoResponse, String str, String str2, int i, int i2, boolean z, String str3, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = preferRefCodeInfoResponse.discountRate;
        }
        if ((i3 & 2) != 0) {
            str2 = preferRefCodeInfoResponse.inviterAddr;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = preferRefCodeInfoResponse.inviterStatus;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = preferRefCodeInfoResponse.codeStatus;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z = preferRefCodeInfoResponse.allowed;
        }
        boolean z2 = z;
        if ((i3 & 32) != 0) {
            str3 = preferRefCodeInfoResponse.discountRateThreshold;
        }
        String str5 = str3;
        if ((i3 & 64) != 0) {
            list = preferRefCodeInfoResponse.inviterAddresses;
        }
        return preferRefCodeInfoResponse.copy(str, str4, i4, i5, z2, str5, list);
    }

    @Serializable(with = C13921dbh.class)
    public static /* synthetic */ void getDiscountRate$annotations() {
    }

    @Serializable(with = C13921dbh.class)
    public static /* synthetic */ void getDiscountRateThreshold$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inviterAddr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.inviterStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.codeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.allowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.discountRateThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InviterAddress> component7() {
        return this.inviterAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreferRefCodeInfoResponse copy(@NotNull String str, @NotNull String str2, int i, int i2, boolean z, @NotNull String str3, @NotNull List<InviterAddress> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PreferRefCodeInfoResponse(str, str2, i, i2, z, str3, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowed() {
        return this.allowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCodeStatus() {
        return this.codeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountRate() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountRateThreshold() {
        return this.discountRateThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterAddr() {
        return this.inviterAddr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InviterAddress> getInviterAddresses() {
        return this.inviterAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInviterStatus() {
        return this.inviterStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowed(boolean z) {
        this.allowed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCodeStatus(int i) {
        this.codeStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDiscountRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.discountRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDiscountRateThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.discountRateThreshold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviterAddr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inviterAddr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviterAddresses(@NotNull List<InviterAddress> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inviterAddresses = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviterStatus(int i) {
        this.inviterStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreferRefCodeInfoResponse(discountRate=" + this.discountRate + ", inviterAddr=" + this.inviterAddr + ", inviterStatus=" + this.inviterStatus + ", codeStatus=" + this.codeStatus + ", allowed=" + this.allowed + ", discountRateThreshold=" + this.discountRateThreshold + ", inviterAddresses=" + this.inviterAddresses + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.discountRate);
        parcel.writeString(this.inviterAddr);
        parcel.writeInt(this.inviterStatus);
        parcel.writeInt(this.codeStatus);
        parcel.writeInt(this.allowed ? 1 : 0);
        parcel.writeString(this.discountRateThreshold);
        List<InviterAddress> list = this.inviterAddresses;
        parcel.writeInt(list.size());
        Iterator<InviterAddress> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.PreferRefCodeInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PreferRefCodeInfoResponse> serializer() {
            return PreferRefCodeInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PreferRefCodeInfoResponse(int i, String str, String str2, int i2, int i3, boolean z, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.discountRate = "";
        } else {
            this.discountRate = str;
        }
        if ((i & 2) == 0) {
            this.inviterAddr = "";
        } else {
            this.inviterAddr = str2;
        }
        if ((i & 4) == 0) {
            this.inviterStatus = 0;
        } else {
            this.inviterStatus = i2;
        }
        if ((i & 8) == 0) {
            this.codeStatus = 0;
        } else {
            this.codeStatus = i3;
        }
        if ((i & 16) == 0) {
            this.allowed = true;
        } else {
            this.allowed = z;
        }
        if ((i & 32) == 0) {
            this.discountRateThreshold = "";
        } else {
            this.discountRateThreshold = str3;
        }
        if ((i & 64) == 0) {
            this.inviterAddresses = yDY.AhwBna();
        } else {
            this.inviterAddresses = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PreferRefCodeInfoResponse preferRefCodeInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) preferRefCodeInfoResponse.discountRate, (Object) "")) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C13921dbh.copydefault, preferRefCodeInfoResponse.discountRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) preferRefCodeInfoResponse.inviterAddr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, preferRefCodeInfoResponse.inviterAddr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || preferRefCodeInfoResponse.inviterStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, preferRefCodeInfoResponse.inviterStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || preferRefCodeInfoResponse.codeStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, preferRefCodeInfoResponse.codeStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !preferRefCodeInfoResponse.allowed) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, preferRefCodeInfoResponse.allowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) preferRefCodeInfoResponse.discountRateThreshold, (Object) "")) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, C13921dbh.copydefault, preferRefCodeInfoResponse.discountRateThreshold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd(preferRefCodeInfoResponse.inviterAddresses, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], preferRefCodeInfoResponse.inviterAddresses);
    }

    public PreferRefCodeInfoResponse(@NotNull String str, @NotNull String str2, int i, int i2, boolean z, @NotNull String str3, @NotNull List<InviterAddress> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.discountRate = str;
        this.inviterAddr = str2;
        this.inviterStatus = i;
        this.codeStatus = i2;
        this.allowed = z;
        this.discountRateThreshold = str3;
        this.inviterAddresses = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:boolean:0x0024: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:87)) : (r12v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, int, int, boolean, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.InviterAddress>):void (m)] (LINE:78) call: com.okinc.business.defi.biz.net.bean.PreferRefCodeInfoResponse.<init>(java.lang.String, java.lang.String, int, int, boolean, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ PreferRefCodeInfoResponse(String str, String str2, int i, int i2, boolean z, String str3, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? true : z, (i3 & 32) == 0 ? str3 : "", (i3 & 64) != 0 ? yDY.AhwBna() : list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferRefCodeInfoResponse)) {
            return false;
        }
        PreferRefCodeInfoResponse preferRefCodeInfoResponse = (PreferRefCodeInfoResponse) obj;
        return Intrinsics.EZpvd((Object) this.discountRate, (Object) preferRefCodeInfoResponse.discountRate) && Intrinsics.EZpvd((Object) this.inviterAddr, (Object) preferRefCodeInfoResponse.inviterAddr) && this.inviterStatus == preferRefCodeInfoResponse.inviterStatus && this.codeStatus == preferRefCodeInfoResponse.codeStatus && this.allowed == preferRefCodeInfoResponse.allowed && Intrinsics.EZpvd((Object) this.discountRateThreshold, (Object) preferRefCodeInfoResponse.discountRateThreshold) && Intrinsics.EZpvd(this.inviterAddresses, preferRefCodeInfoResponse.inviterAddresses);
    }

    public int hashCode() {
        int iHashCode = this.discountRate.hashCode();
        int iHashCode2 = this.inviterAddr.hashCode();
        int i = this.inviterStatus;
        int i2 = this.codeStatus;
        int iHashCode3 = Boolean.hashCode(this.allowed);
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + i2) * 31) + iHashCode3) * 31) + this.discountRateThreshold.hashCode()) * 31) + this.inviterAddresses.hashCode();
    }
}
