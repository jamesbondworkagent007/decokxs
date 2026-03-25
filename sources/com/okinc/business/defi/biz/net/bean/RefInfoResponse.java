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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class RefInfoResponse implements Parcelable {
    private String discountRate;
    private String inviter;
    private List<InviterAddress> inviterAddresses;
    private String refCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RefInfoResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(InviterAddress$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<RefInfoResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RefInfoResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InviterAddress.CREATOR.createFromParcel(parcel));
            }
            return new RefInfoResponse(string, string2, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RefInfoResponse[] newArray(int i) {
            return new RefInfoResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.RefInfoResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RefInfoResponse copy$default(RefInfoResponse refInfoResponse, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refInfoResponse.refCode;
        }
        if ((i & 2) != 0) {
            str2 = refInfoResponse.inviter;
        }
        if ((i & 4) != 0) {
            str3 = refInfoResponse.discountRate;
        }
        if ((i & 8) != 0) {
            list = refInfoResponse.inviterAddresses;
        }
        return refInfoResponse.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inviter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InviterAddress> component4() {
        return this.inviterAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RefInfoResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<InviterAddress> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RefInfoResponse(str, str2, str3, list);
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
        if (!(obj instanceof RefInfoResponse)) {
            return false;
        }
        RefInfoResponse refInfoResponse = (RefInfoResponse) obj;
        return Intrinsics.EZpvd((Object) this.refCode, (Object) refInfoResponse.refCode) && Intrinsics.EZpvd((Object) this.inviter, (Object) refInfoResponse.inviter) && Intrinsics.EZpvd((Object) this.discountRate, (Object) refInfoResponse.discountRate) && Intrinsics.EZpvd(this.inviterAddresses, refInfoResponse.inviterAddresses);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountRate() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviter() {
        return this.inviter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InviterAddress> getInviterAddresses() {
        return this.inviterAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefCode() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.refCode.hashCode() * 31) + this.inviter.hashCode()) * 31) + this.discountRate.hashCode()) * 31) + this.inviterAddresses.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDiscountRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.discountRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inviter = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviterAddresses(@NotNull List<InviterAddress> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inviterAddresses = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRefCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.refCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RefInfoResponse(refCode=" + this.refCode + ", inviter=" + this.inviter + ", discountRate=" + this.discountRate + ", inviterAddresses=" + this.inviterAddresses + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.refCode);
        parcel.writeString(this.inviter);
        parcel.writeString(this.discountRate);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.RefInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RefInfoResponse> serializer() {
            return RefInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RefInfoResponse(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, RefInfoResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.refCode = str;
        if ((i & 2) == 0) {
            this.inviter = "";
        } else {
            this.inviter = str2;
        }
        if ((i & 4) == 0) {
            this.discountRate = "";
        } else {
            this.discountRate = str3;
        }
        if ((i & 8) == 0) {
            this.inviterAddresses = yDY.AhwBna();
        } else {
            this.inviterAddresses = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RefInfoResponse refInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, refInfoResponse.refCode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) refInfoResponse.inviter, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, refInfoResponse.inviter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) refInfoResponse.discountRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, refInfoResponse.discountRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(refInfoResponse.inviterAddresses, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], refInfoResponse.inviterAddresses);
    }

    public RefInfoResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<InviterAddress> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.refCode = str;
        this.inviter = str2;
        this.discountRate = str3;
        this.inviterAddresses = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:72)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.InviterAddress>):void (m)] (LINE:68) call: com.okinc.business.defi.biz.net.bean.RefInfoResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ RefInfoResponse(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
