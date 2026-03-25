package com.okinc.business.market.data.model;

import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class AddressTrackerNotificationData {
    public final List<AddressTrackerUserAction> actionList;
    public final StringBooleanType hasAlert;
    public final String targetAddress;
    public final String volumeMax;
    public final String volumeMin;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, StringBooleanType.Companion.serializer(), new ArrayListSerializer(AddressTrackerUserAction.Companion.serializer()), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressTrackerNotificationData() {
        this((String) null, (String) null, (StringBooleanType) null, (List) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.data.model.AddressTrackerNotificationData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressTrackerNotificationData copy$default(AddressTrackerNotificationData addressTrackerNotificationData, String str, String str2, StringBooleanType stringBooleanType, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressTrackerNotificationData.targetAddress;
        }
        if ((i & 2) != 0) {
            str2 = addressTrackerNotificationData.walletAddress;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            stringBooleanType = addressTrackerNotificationData.hasAlert;
        }
        StringBooleanType stringBooleanType2 = stringBooleanType;
        if ((i & 8) != 0) {
            list = addressTrackerNotificationData.actionList;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str3 = addressTrackerNotificationData.volumeMin;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = addressTrackerNotificationData.volumeMax;
        }
        return addressTrackerNotificationData.EZpvd(str, str5, stringBooleanType2, list2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType AEQbTJ() {
        return this.hasAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressTrackerNotificationData EZpvd(@NotNull String str, @NotNull String str2, @NotNull StringBooleanType stringBooleanType, @NotNull List<? extends AddressTrackerUserAction> list, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AddressTrackerNotificationData(str, str2, stringBooleanType, list, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.targetAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressTrackerUserAction> KWHzl() {
        return this.actionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.volumeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressTrackerNotificationData)) {
            return false;
        }
        AddressTrackerNotificationData addressTrackerNotificationData = (AddressTrackerNotificationData) obj;
        return Intrinsics.EZpvd((Object) this.targetAddress, (Object) addressTrackerNotificationData.targetAddress) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) addressTrackerNotificationData.walletAddress) && this.hasAlert == addressTrackerNotificationData.hasAlert && Intrinsics.EZpvd(this.actionList, addressTrackerNotificationData.actionList) && Intrinsics.EZpvd((Object) this.volumeMin, (Object) addressTrackerNotificationData.volumeMin) && Intrinsics.EZpvd((Object) this.volumeMax, (Object) addressTrackerNotificationData.volumeMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.volumeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.targetAddress.hashCode() * 31) + this.walletAddress.hashCode()) * 31) + this.hasAlert.hashCode()) * 31) + this.actionList.hashCode()) * 31) + this.volumeMin.hashCode()) * 31) + this.volumeMax.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressTrackerNotificationData(targetAddress=" + this.targetAddress + ", walletAddress=" + this.walletAddress + ", hasAlert=" + this.hasAlert + ", actionList=" + this.actionList + ", volumeMin=" + this.volumeMin + ", volumeMax=" + this.volumeMax + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.AddressTrackerNotificationData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressTrackerNotificationData> serializer() {
            return AddressTrackerNotificationData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressTrackerNotificationData(int i, String str, String str2, StringBooleanType stringBooleanType, List list, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.targetAddress = "";
        } else {
            this.targetAddress = str;
        }
        if ((i & 2) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str2;
        }
        if ((i & 4) == 0) {
            this.hasAlert = StringBooleanType.FALSE;
        } else {
            this.hasAlert = stringBooleanType;
        }
        if ((i & 8) == 0) {
            this.actionList = yDY.AhwBna();
        } else {
            this.actionList = list;
        }
        if ((i & 16) == 0) {
            this.volumeMin = "";
        } else {
            this.volumeMin = str3;
        }
        if ((i & 32) == 0) {
            this.volumeMax = "";
        } else {
            this.volumeMax = str4;
        }
    }

    public static final /* synthetic */ void OLrzqt(AddressTrackerNotificationData addressTrackerNotificationData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) addressTrackerNotificationData.targetAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, addressTrackerNotificationData.targetAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) addressTrackerNotificationData.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, addressTrackerNotificationData.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || addressTrackerNotificationData.hasAlert != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], addressTrackerNotificationData.hasAlert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(addressTrackerNotificationData.actionList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], addressTrackerNotificationData.actionList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) addressTrackerNotificationData.volumeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, addressTrackerNotificationData.volumeMin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) addressTrackerNotificationData.volumeMax, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, addressTrackerNotificationData.volumeMax);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.okinc.business.market.data.constant.AddressTrackerUserAction> */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressTrackerNotificationData(@NotNull String str, @NotNull String str2, @NotNull StringBooleanType stringBooleanType, @NotNull List<? extends AddressTrackerUserAction> list, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.targetAddress = str;
        this.walletAddress = str2;
        this.hasAlert = stringBooleanType;
        this.actionList = list;
        this.volumeMin = str3;
        this.volumeMax = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:0x0016: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.StringBooleanType:0x0014: SGET  A[WRAPPED] (LINE:15) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r8v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.util.List:0x001f: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r9v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.util.List<? extends com.okinc.business.market.data.constant.AddressTrackerUserAction>, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.data.model.AddressTrackerNotificationData.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AddressTrackerNotificationData(String str, String str2, StringBooleanType stringBooleanType, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? StringBooleanType.FALSE : stringBooleanType, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }
}
