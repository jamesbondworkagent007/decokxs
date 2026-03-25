package com.okinc.ok_kyc_core.extension.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class TestAccountData implements Parcelable {
    private String accountList;
    private List<TestRegion> regionList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TestAccountData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TestRegion$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<TestAccountData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TestAccountData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(TestRegion.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TestAccountData(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TestAccountData[] newArray(int i) {
            return new TestAccountData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TestAccountData() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.extension.bean.TestAccountData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestAccountData copy$default(TestAccountData testAccountData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testAccountData.accountList;
        }
        if ((i & 2) != 0) {
            list = testAccountData.regionList;
        }
        return testAccountData.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TestRegion> component2() {
        return this.regionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TestAccountData copy(@NotNull String str, List<TestRegion> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TestAccountData(str, list);
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
        if (!(obj instanceof TestAccountData)) {
            return false;
        }
        TestAccountData testAccountData = (TestAccountData) obj;
        return Intrinsics.EZpvd((Object) this.accountList, (Object) testAccountData.accountList) && Intrinsics.EZpvd(this.regionList, testAccountData.regionList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountList() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TestRegion> getRegionList() {
        return this.regionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountList.hashCode();
        List<TestRegion> list = this.regionList;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountList = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRegionList(List<TestRegion> list) {
        this.regionList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TestAccountData(accountList=" + this.accountList + ", regionList=" + this.regionList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountList);
        List<TestRegion> list = this.regionList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<TestRegion> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.extension.bean.TestAccountData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TestAccountData> serializer() {
            return TestAccountData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TestAccountData(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountList = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.regionList = null;
        } else {
            this.regionList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(TestAccountData testAccountData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) testAccountData.accountList, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, testAccountData.accountList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && testAccountData.regionList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], testAccountData.regionList);
    }

    public TestAccountData(@NotNull String str, List<TestRegion> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountList = str;
        this.regionList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.ok_kyc_core.extension.bean.TestRegion>):void (m)] (LINE:16) call: com.okinc.ok_kyc_core.extension.bean.TestAccountData.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TestAccountData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
