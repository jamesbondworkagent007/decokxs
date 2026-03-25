package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CheckUKRiskStatusResponse implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final RiskStatus action;
    private final HashMap<String, String> actionParams;
    private final String coolingPeriodTime;
    private final String name;
    private final List<Page> pages;
    private final String playbook;
    private final HashMap<String, String> playbookParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CheckUKRiskStatusResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CheckUKRiskStatusResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckUKRiskStatusResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            HashMap map;
            HashMap map2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RiskStatus riskStatusCreateFromParcel = RiskStatus.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Page.CREATOR.createFromParcel(parcel));
                }
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i3 = parcel.readInt();
                HashMap map3 = new HashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    map3.put(parcel.readString(), parcel.readString());
                }
                map = map3;
            }
            if (parcel.readInt() == 0) {
                map2 = null;
            } else {
                int i5 = parcel.readInt();
                map2 = new HashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    map2.put(parcel.readString(), parcel.readString());
                }
            }
            return new CheckUKRiskStatusResponse(riskStatusCreateFromParcel, string, string2, arrayList, string3, map, map2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckUKRiskStatusResponse[] newArray(int i) {
            return new CheckUKRiskStatusResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckUKRiskStatusResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckUKRiskStatusResponse copy$default(CheckUKRiskStatusResponse checkUKRiskStatusResponse, RiskStatus riskStatus, String str, String str2, List list, String str3, HashMap map, HashMap map2, int i, Object obj) {
        if ((i & 1) != 0) {
            riskStatus = checkUKRiskStatusResponse.action;
        }
        if ((i & 2) != 0) {
            str = checkUKRiskStatusResponse.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = checkUKRiskStatusResponse.coolingPeriodTime;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            list = checkUKRiskStatusResponse.pages;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str3 = checkUKRiskStatusResponse.playbook;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            map = checkUKRiskStatusResponse.playbookParams;
        }
        HashMap map3 = map;
        if ((i & 64) != 0) {
            map2 = checkUKRiskStatusResponse.actionParams;
        }
        return checkUKRiskStatusResponse.copy(riskStatus, str4, str5, list2, str6, map3, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskStatus component1() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coolingPeriodTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Page> component4() {
        return this.pages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component6() {
        return this.playbookParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component7() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckUKRiskStatusResponse copy(@NotNull RiskStatus riskStatus, String str, String str2, List<Page> list, String str3, HashMap<String, String> map, HashMap<String, String> map2) {
        Intrinsics.checkNotNullParameter(riskStatus, "");
        return new CheckUKRiskStatusResponse(riskStatus, str, str2, list, str3, map, map2);
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
        if (!(obj instanceof CheckUKRiskStatusResponse)) {
            return false;
        }
        CheckUKRiskStatusResponse checkUKRiskStatusResponse = (CheckUKRiskStatusResponse) obj;
        return this.action == checkUKRiskStatusResponse.action && Intrinsics.EZpvd((Object) this.name, (Object) checkUKRiskStatusResponse.name) && Intrinsics.EZpvd((Object) this.coolingPeriodTime, (Object) checkUKRiskStatusResponse.coolingPeriodTime) && Intrinsics.EZpvd(this.pages, checkUKRiskStatusResponse.pages) && Intrinsics.EZpvd((Object) this.playbook, (Object) checkUKRiskStatusResponse.playbook) && Intrinsics.EZpvd(this.playbookParams, checkUKRiskStatusResponse.playbookParams) && Intrinsics.EZpvd(this.actionParams, checkUKRiskStatusResponse.actionParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskStatus getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getActionParams() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoolingPeriodTime() {
        return this.coolingPeriodTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Page> getPages() {
        return this.pages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getPlaybookParams() {
        return this.playbookParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.action.hashCode();
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.coolingPeriodTime;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<Page> list = this.pages;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str3 = this.playbook;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        HashMap<String, String> map = this.playbookParams;
        int iHashCode6 = map == null ? 0 : map.hashCode();
        HashMap<String, String> map2 = this.actionParams;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckUKRiskStatusResponse(action=" + this.action + ", name=" + this.name + ", coolingPeriodTime=" + this.coolingPeriodTime + ", pages=" + this.pages + ", playbook=" + this.playbook + ", playbookParams=" + this.playbookParams + ", actionParams=" + this.actionParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.action.writeToParcel(parcel, i);
        parcel.writeString(this.name);
        parcel.writeString(this.coolingPeriodTime);
        List<Page> list = this.pages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Page> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.playbook);
        HashMap<String, String> map = this.playbookParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        HashMap<String, String> map2 = this.actionParams;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckUKRiskStatusResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckUKRiskStatusResponse> serializer() {
            return CheckUKRiskStatusResponse$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{RiskStatus.Companion.serializer(), null, null, new ArrayListSerializer(Page$$serializer.INSTANCE), null, new HashMapSerializer(stringSerializer, stringSerializer), new HashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ CheckUKRiskStatusResponse(int i, RiskStatus riskStatus, String str, String str2, List list, String str3, HashMap map, HashMap map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CheckUKRiskStatusResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.action = riskStatus;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.coolingPeriodTime = "";
        } else {
            this.coolingPeriodTime = str2;
        }
        if ((i & 8) == 0) {
            this.pages = yDY.AhwBna();
        } else {
            this.pages = list;
        }
        if ((i & 16) == 0) {
            this.playbook = "";
        } else {
            this.playbook = str3;
        }
        if ((i & 32) == 0) {
            this.playbookParams = new HashMap<>();
        } else {
            this.playbookParams = map;
        }
        if ((i & 64) == 0) {
            this.actionParams = new HashMap<>();
        } else {
            this.actionParams = map2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [12=4] */
    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CheckUKRiskStatusResponse checkUKRiskStatusResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], checkUKRiskStatusResponse.action);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) checkUKRiskStatusResponse.name, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, checkUKRiskStatusResponse.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) checkUKRiskStatusResponse.coolingPeriodTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, checkUKRiskStatusResponse.coolingPeriodTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(checkUKRiskStatusResponse.pages, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], checkUKRiskStatusResponse.pages);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) checkUKRiskStatusResponse.playbook, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, checkUKRiskStatusResponse.playbook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(checkUKRiskStatusResponse.playbookParams, new HashMap())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], checkUKRiskStatusResponse.playbookParams);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd(checkUKRiskStatusResponse.actionParams, new HashMap())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], checkUKRiskStatusResponse.actionParams);
    }

    public CheckUKRiskStatusResponse(@NotNull RiskStatus riskStatus, String str, String str2, List<Page> list, String str3, HashMap<String, String> map, HashMap<String, String> map2) {
        Intrinsics.checkNotNullParameter(riskStatus, "");
        this.action = riskStatus;
        this.name = str;
        this.coolingPeriodTime = str2;
        this.pages = list;
        this.playbook = str3;
        this.playbookParams = map;
        this.actionParams = map2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (r7v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r14v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0020: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:24) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r12v0 java.util.HashMap))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:25) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r13v0 java.util.HashMap))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus, java.lang.String, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Page>, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:15) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckUKRiskStatusResponse.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.HashMap, java.util.HashMap):void type: THIS */
    public /* synthetic */ CheckUKRiskStatusResponse(RiskStatus riskStatus, String str, String str2, List list, String str3, HashMap map, HashMap map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(riskStatus, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? new HashMap() : map, (i & 64) != 0 ? new HashMap() : map2);
    }
}
