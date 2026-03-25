package com.okinc.account.api.model.subaccount;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class SubAccount {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int deletedFlag;
    private final String email;
    private final String realName;
    private final String remark;
    private final long userId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubAccount() {
        this(0, 0L, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SubAccount copy$default(SubAccount subAccount, int i, long j, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = subAccount.deletedFlag;
        }
        if ((i2 & 2) != 0) {
            j = subAccount.userId;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str = subAccount.email;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = subAccount.realName;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = subAccount.remark;
        }
        return subAccount.copy(i, j2, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.deletedFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubAccount copy(int i, long j, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SubAccount(i, j, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubAccount)) {
            return false;
        }
        SubAccount subAccount = (SubAccount) obj;
        return this.deletedFlag == subAccount.deletedFlag && this.userId == subAccount.userId && Intrinsics.EZpvd((Object) this.email, (Object) subAccount.email) && Intrinsics.EZpvd((Object) this.realName, (Object) subAccount.realName) && Intrinsics.EZpvd((Object) this.remark, (Object) subAccount.remark);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDeletedFlag() {
        return this.deletedFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealName() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.deletedFlag) * 31) + Long.hashCode(this.userId)) * 31) + this.email.hashCode()) * 31) + this.realName.hashCode()) * 31) + this.remark.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubAccount(deletedFlag=" + this.deletedFlag + ", userId=" + this.userId + ", email=" + this.email + ", realName=" + this.realName + ", remark=" + this.remark + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.subaccount.SubAccount.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubAccount> serializer() {
            return SubAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubAccount(int i, int i2, long j, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.deletedFlag = (i & 1) == 0 ? Integer.MIN_VALUE : i2;
        if ((i & 2) == 0) {
            this.userId = Long.MIN_VALUE;
        } else {
            this.userId = j;
        }
        if ((i & 4) == 0) {
            this.email = "";
        } else {
            this.email = str;
        }
        if ((i & 8) == 0) {
            this.realName = "";
        } else {
            this.realName = str2;
        }
        if ((i & 16) == 0) {
            this.remark = "";
        } else {
            this.remark = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(SubAccount subAccount, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subAccount.deletedFlag != Integer.MIN_VALUE) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, subAccount.deletedFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subAccount.userId != Long.MIN_VALUE) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, subAccount.userId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) subAccount.email, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, subAccount.email);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) subAccount.realName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, subAccount.realName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) subAccount.remark, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, subAccount.remark);
    }

    public SubAccount(int i, long j, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.deletedFlag = i;
        this.userId = j;
        this.email = str;
        this.realName = str2;
        this.remark = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r5v0 int))
  (wrap:long:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (Long.MIN_VALUE long) : (r6v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(int, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.account.api.model.subaccount.SubAccount.<init>(int, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SubAccount(int i, long j, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MIN_VALUE : i, (i2 & 2) != 0 ? Long.MIN_VALUE : j, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3);
    }
}
