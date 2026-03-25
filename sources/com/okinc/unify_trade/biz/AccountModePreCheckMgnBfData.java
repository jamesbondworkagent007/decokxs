package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class AccountModePreCheckMgnBfData implements Parcelable {
    private final String acctAdjEq;
    private final String acctAvailEq;
    private final List<AccountModePreCheckMgnBfDetailData> details;
    private final String mgnRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountModePreCheckMgnBfData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(AccountModePreCheckMgnBfDetailData$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<AccountModePreCheckMgnBfData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckMgnBfData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(AccountModePreCheckMgnBfDetailData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AccountModePreCheckMgnBfData(string, string2, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckMgnBfData[] newArray(int i) {
            return new AccountModePreCheckMgnBfData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountModePreCheckMgnBfData() {
        this((String) null, (String) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountModePreCheckMgnBfData copy$default(AccountModePreCheckMgnBfData accountModePreCheckMgnBfData, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountModePreCheckMgnBfData.acctAvailEq;
        }
        if ((i & 2) != 0) {
            str2 = accountModePreCheckMgnBfData.mgnRatio;
        }
        if ((i & 4) != 0) {
            list = accountModePreCheckMgnBfData.details;
        }
        if ((i & 8) != 0) {
            str3 = accountModePreCheckMgnBfData.acctAdjEq;
        }
        return accountModePreCheckMgnBfData.copy(str, str2, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.acctAvailEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountModePreCheckMgnBfDetailData> component3() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.acctAdjEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckMgnBfData copy(String str, String str2, List<AccountModePreCheckMgnBfDetailData> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new AccountModePreCheckMgnBfData(str, str2, list, str3);
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
        if (!(obj instanceof AccountModePreCheckMgnBfData)) {
            return false;
        }
        AccountModePreCheckMgnBfData accountModePreCheckMgnBfData = (AccountModePreCheckMgnBfData) obj;
        return Intrinsics.EZpvd((Object) this.acctAvailEq, (Object) accountModePreCheckMgnBfData.acctAvailEq) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) accountModePreCheckMgnBfData.mgnRatio) && Intrinsics.EZpvd(this.details, accountModePreCheckMgnBfData.details) && Intrinsics.EZpvd((Object) this.acctAdjEq, (Object) accountModePreCheckMgnBfData.acctAdjEq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctAdjEq() {
        return this.acctAdjEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctAvailEq() {
        return this.acctAvailEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountModePreCheckMgnBfDetailData> getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.acctAvailEq;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mgnRatio;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<AccountModePreCheckMgnBfDetailData> list = this.details;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.acctAdjEq.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountModePreCheckMgnBfData(acctAvailEq=" + this.acctAvailEq + ", mgnRatio=" + this.mgnRatio + ", details=" + this.details + ", acctAdjEq=" + this.acctAdjEq + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.acctAvailEq);
        parcel.writeString(this.mgnRatio);
        List<AccountModePreCheckMgnBfDetailData> list = this.details;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AccountModePreCheckMgnBfDetailData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.acctAdjEq);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountModePreCheckMgnBfData> serializer() {
            return AccountModePreCheckMgnBfData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountModePreCheckMgnBfData(int i, String str, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.acctAvailEq = "";
        } else {
            this.acctAvailEq = str;
        }
        if ((i & 2) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str2;
        }
        if ((i & 4) == 0) {
            this.details = null;
        } else {
            this.details = list;
        }
        if ((i & 8) == 0) {
            this.acctAdjEq = "";
        } else {
            this.acctAdjEq = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountModePreCheckMgnBfData accountModePreCheckMgnBfData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountModePreCheckMgnBfData.acctAvailEq, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, accountModePreCheckMgnBfData.acctAvailEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountModePreCheckMgnBfData.mgnRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, accountModePreCheckMgnBfData.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || accountModePreCheckMgnBfData.details != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], accountModePreCheckMgnBfData.details);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) accountModePreCheckMgnBfData.acctAdjEq, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, accountModePreCheckMgnBfData.acctAdjEq);
    }

    public AccountModePreCheckMgnBfData(String str, String str2, List<AccountModePreCheckMgnBfDetailData> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.acctAvailEq = str;
        this.mgnRatio = str2;
        this.details = list;
        this.acctAdjEq = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.AccountModePreCheckMgnBfDetailData>, java.lang.String):void (m)] (LINE:4806) call: com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AccountModePreCheckMgnBfData(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? "" : str3);
    }
}
