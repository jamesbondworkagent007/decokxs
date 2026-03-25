package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupEntryCurrency {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String currencyCode;
    private final String currencyFullName;
    private final Integer currencyId;
    private final Integer decimalPoint;
    private final String icon;
    private final String maxAmount;
    private final String minAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupEntryCurrency() {
        this((String) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupEntryCurrency copy$default(GroupEntryCurrency groupEntryCurrency, String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupEntryCurrency.currencyCode;
        }
        if ((i & 2) != 0) {
            num = groupEntryCurrency.currencyId;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            str2 = groupEntryCurrency.currencyFullName;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = groupEntryCurrency.minAmount;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = groupEntryCurrency.maxAmount;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            num2 = groupEntryCurrency.decimalPoint;
        }
        Integer num4 = num2;
        if ((i & 64) != 0) {
            str5 = groupEntryCurrency.icon;
        }
        return groupEntryCurrency.copy(str, num3, str6, str7, str8, num4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.decimalPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryCurrency copy(String str, Integer num, String str2, String str3, String str4, Integer num2, String str5) {
        return new GroupEntryCurrency(str, num, str2, str3, str4, num2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupEntryCurrency)) {
            return false;
        }
        GroupEntryCurrency groupEntryCurrency = (GroupEntryCurrency) obj;
        return Intrinsics.EZpvd((Object) this.currencyCode, (Object) groupEntryCurrency.currencyCode) && Intrinsics.EZpvd(this.currencyId, groupEntryCurrency.currencyId) && Intrinsics.EZpvd((Object) this.currencyFullName, (Object) groupEntryCurrency.currencyFullName) && Intrinsics.EZpvd((Object) this.minAmount, (Object) groupEntryCurrency.minAmount) && Intrinsics.EZpvd((Object) this.maxAmount, (Object) groupEntryCurrency.maxAmount) && Intrinsics.EZpvd(this.decimalPoint, groupEntryCurrency.decimalPoint) && Intrinsics.EZpvd((Object) this.icon, (Object) groupEntryCurrency.icon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDecimalPoint() {
        return this.decimalPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmount() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currencyCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.currencyId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.currencyFullName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.minAmount;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.maxAmount;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.decimalPoint;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str5 = this.icon;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupEntryCurrency(currencyCode=" + this.currencyCode + ", currencyId=" + this.currencyId + ", currencyFullName=" + this.currencyFullName + ", minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + ", decimalPoint=" + this.decimalPoint + ", icon=" + this.icon + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupEntryCurrency.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupEntryCurrency> serializer() {
            return GroupEntryCurrency$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupEntryCurrency(int i, String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currencyCode = null;
        } else {
            this.currencyCode = str;
        }
        if ((i & 2) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 4) == 0) {
            this.currencyFullName = null;
        } else {
            this.currencyFullName = str2;
        }
        if ((i & 8) == 0) {
            this.minAmount = null;
        } else {
            this.minAmount = str3;
        }
        if ((i & 16) == 0) {
            this.maxAmount = null;
        } else {
            this.maxAmount = str4;
        }
        if ((i & 32) == 0) {
            this.decimalPoint = null;
        } else {
            this.decimalPoint = num2;
        }
        if ((i & 64) == 0) {
            this.icon = null;
        } else {
            this.icon = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupEntryCurrency groupEntryCurrency, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupEntryCurrency.currencyCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, groupEntryCurrency.currencyCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupEntryCurrency.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, groupEntryCurrency.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupEntryCurrency.currencyFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, groupEntryCurrency.currencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupEntryCurrency.minAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupEntryCurrency.minAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupEntryCurrency.maxAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, groupEntryCurrency.maxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || groupEntryCurrency.decimalPoint != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, groupEntryCurrency.decimalPoint);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && groupEntryCurrency.icon == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, groupEntryCurrency.icon);
    }

    public GroupEntryCurrency(String str, Integer num, String str2, String str3, String str4, Integer num2, String str5) {
        this.currencyCode = str;
        this.currencyId = num;
        this.currencyFullName = str2;
        this.minAmount = str3;
        this.maxAmount = str4;
        this.decimalPoint = num2;
        this.icon = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:104) call: com.okinc.okimcore.model.remote.GroupEntryCurrency.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ GroupEntryCurrency(String str, Integer num, String str2, String str3, String str4, Integer num2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str5);
    }
}
