package com.okinc.business.defi.wallet.mine.walletbind.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CheckWalletBindStatusResponse implements Parcelable {
    private final List<CheckWalletBindStatusAccountResponse> accountList;
    private final String threshold;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CheckWalletBindStatusResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CheckWalletBindStatusAccountResponse$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CheckWalletBindStatusResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckWalletBindStatusResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CheckWalletBindStatusAccountResponse.CREATOR.createFromParcel(parcel));
            }
            return new CheckWalletBindStatusResponse(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckWalletBindStatusResponse[] newArray(int i) {
            return new CheckWalletBindStatusResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CheckWalletBindStatusResponse() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckWalletBindStatusResponse copy$default(CheckWalletBindStatusResponse checkWalletBindStatusResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkWalletBindStatusResponse.threshold;
        }
        if ((i & 2) != 0) {
            list = checkWalletBindStatusResponse.accountList;
        }
        return checkWalletBindStatusResponse.copy(str, list);
    }

    @SerialName("accountList")
    public static /* synthetic */ void getAccountList$annotations() {
    }

    @SerialName("threshold")
    public static /* synthetic */ void getThreshold$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CheckWalletBindStatusAccountResponse> component2() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckWalletBindStatusResponse copy(@NotNull String str, @NotNull List<CheckWalletBindStatusAccountResponse> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new CheckWalletBindStatusResponse(str, list);
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
        if (!(obj instanceof CheckWalletBindStatusResponse)) {
            return false;
        }
        CheckWalletBindStatusResponse checkWalletBindStatusResponse = (CheckWalletBindStatusResponse) obj;
        return Intrinsics.EZpvd((Object) this.threshold, (Object) checkWalletBindStatusResponse.threshold) && Intrinsics.EZpvd(this.accountList, checkWalletBindStatusResponse.accountList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CheckWalletBindStatusAccountResponse> getAccountList() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThreshold() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.threshold.hashCode() * 31) + this.accountList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckWalletBindStatusResponse(threshold=" + this.threshold + ", accountList=" + this.accountList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.threshold);
        List<CheckWalletBindStatusAccountResponse> list = this.accountList;
        parcel.writeInt(list.size());
        Iterator<CheckWalletBindStatusAccountResponse> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckWalletBindStatusResponse> serializer() {
            return CheckWalletBindStatusResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckWalletBindStatusResponse(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.threshold = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.accountList = new ArrayList();
        } else {
            this.accountList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckWalletBindStatusResponse checkWalletBindStatusResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) checkWalletBindStatusResponse.threshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, checkWalletBindStatusResponse.threshold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(checkWalletBindStatusResponse.accountList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], checkWalletBindStatusResponse.accountList);
    }

    public CheckWalletBindStatusResponse(@NotNull String str, @NotNull List<CheckWalletBindStatusAccountResponse> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.threshold = str;
        this.accountList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:21) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusAccountResponse>):void (m)] (LINE:19) call: com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusResponse.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CheckWalletBindStatusResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
