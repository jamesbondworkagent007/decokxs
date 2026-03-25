package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotUserConfigInfo {
    private String defaultProfitSharingRatio;
    private Boolean isStgyPublic;
    private List<String> profitSharingRange;
    private String signalUserRole;
    private String userRole;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotUserConfigInfo() {
        this((Boolean) null, (String) null, (List) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.BotUserConfigInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotUserConfigInfo copy$default(BotUserConfigInfo botUserConfigInfo, Boolean bool, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = botUserConfigInfo.isStgyPublic;
        }
        if ((i & 2) != 0) {
            str = botUserConfigInfo.userRole;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            list = botUserConfigInfo.profitSharingRange;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = botUserConfigInfo.defaultProfitSharingRatio;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = botUserConfigInfo.signalUserRole;
        }
        return botUserConfigInfo.copy(bool, str4, list2, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isStgyPublic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.profitSharingRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.defaultProfitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.signalUserRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotUserConfigInfo copy(Boolean bool, String str, List<String> list, String str2, String str3) {
        return new BotUserConfigInfo(bool, str, list, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotUserConfigInfo)) {
            return false;
        }
        BotUserConfigInfo botUserConfigInfo = (BotUserConfigInfo) obj;
        return Intrinsics.EZpvd(this.isStgyPublic, botUserConfigInfo.isStgyPublic) && Intrinsics.EZpvd((Object) this.userRole, (Object) botUserConfigInfo.userRole) && Intrinsics.EZpvd(this.profitSharingRange, botUserConfigInfo.profitSharingRange) && Intrinsics.EZpvd((Object) this.defaultProfitSharingRatio, (Object) botUserConfigInfo.defaultProfitSharingRatio) && Intrinsics.EZpvd((Object) this.signalUserRole, (Object) botUserConfigInfo.signalUserRole);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultProfitSharingRatio() {
        return this.defaultProfitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getProfitSharingRange() {
        return this.profitSharingRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalUserRole() {
        return this.signalUserRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserRole() {
        return this.userRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isStgyPublic;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.userRole;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<String> list = this.profitSharingRange;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str2 = this.defaultProfitSharingRatio;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.signalUserRole;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isStgyPublic() {
        return this.isStgyPublic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultProfitSharingRatio(String str) {
        this.defaultProfitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRange(List<String> list) {
        this.profitSharingRange = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalUserRole(String str) {
        this.signalUserRole = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyPublic(Boolean bool) {
        this.isStgyPublic = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserRole(String str) {
        this.userRole = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotUserConfigInfo(isStgyPublic=" + this.isStgyPublic + ", userRole=" + this.userRole + ", profitSharingRange=" + this.profitSharingRange + ", defaultProfitSharingRatio=" + this.defaultProfitSharingRatio + ", signalUserRole=" + this.signalUserRole + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotUserConfigInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotUserConfigInfo> serializer() {
            return BotUserConfigInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotUserConfigInfo(int i, Boolean bool, String str, List list, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isStgyPublic = null;
        } else {
            this.isStgyPublic = bool;
        }
        if ((i & 2) == 0) {
            this.userRole = null;
        } else {
            this.userRole = str;
        }
        if ((i & 4) == 0) {
            this.profitSharingRange = null;
        } else {
            this.profitSharingRange = list;
        }
        if ((i & 8) == 0) {
            this.defaultProfitSharingRatio = null;
        } else {
            this.defaultProfitSharingRatio = str2;
        }
        if ((i & 16) == 0) {
            this.signalUserRole = null;
        } else {
            this.signalUserRole = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotUserConfigInfo botUserConfigInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botUserConfigInfo.isStgyPublic != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, botUserConfigInfo.isStgyPublic);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botUserConfigInfo.userRole != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botUserConfigInfo.userRole);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || botUserConfigInfo.profitSharingRange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], botUserConfigInfo.profitSharingRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || botUserConfigInfo.defaultProfitSharingRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botUserConfigInfo.defaultProfitSharingRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && botUserConfigInfo.signalUserRole == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, botUserConfigInfo.signalUserRole);
    }

    public BotUserConfigInfo(Boolean bool, String str, List<String> list, String str2, String str3) {
        this.isStgyPublic = bool;
        this.userRole = str;
        this.profitSharingRange = list;
        this.defaultProfitSharingRatio = str2;
        this.signalUserRole = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:1473) call: com.okinc.unify_trade.biz.BotUserConfigInfo.<init>(java.lang.Boolean, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotUserConfigInfo(Boolean bool, String str, List list, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
