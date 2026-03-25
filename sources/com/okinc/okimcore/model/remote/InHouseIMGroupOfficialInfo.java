package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMGroupOfficialInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int deleted;
    private final Integer officialCurrencyId;
    private final String officialLang;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMGroupOfficialInfo() {
        this(0, (Integer) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMGroupOfficialInfo copy$default(InHouseIMGroupOfficialInfo inHouseIMGroupOfficialInfo, int i, Integer num, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = inHouseIMGroupOfficialInfo.type;
        }
        if ((i3 & 2) != 0) {
            num = inHouseIMGroupOfficialInfo.officialCurrencyId;
        }
        if ((i3 & 4) != 0) {
            str = inHouseIMGroupOfficialInfo.officialLang;
        }
        if ((i3 & 8) != 0) {
            i2 = inHouseIMGroupOfficialInfo.deleted;
        }
        return inHouseIMGroupOfficialInfo.copy(i, num, str, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.officialCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.officialLang;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.deleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupOfficialInfo copy(int i, Integer num, @NotNull String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InHouseIMGroupOfficialInfo(i, num, str, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMGroupOfficialInfo)) {
            return false;
        }
        InHouseIMGroupOfficialInfo inHouseIMGroupOfficialInfo = (InHouseIMGroupOfficialInfo) obj;
        return this.type == inHouseIMGroupOfficialInfo.type && Intrinsics.EZpvd(this.officialCurrencyId, inHouseIMGroupOfficialInfo.officialCurrencyId) && Intrinsics.EZpvd((Object) this.officialLang, (Object) inHouseIMGroupOfficialInfo.officialLang) && this.deleted == inHouseIMGroupOfficialInfo.deleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDeleted() {
        return this.deleted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOfficialCurrencyId() {
        return this.officialCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfficialLang() {
        return this.officialLang;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type);
        Integer num = this.officialCurrencyId;
        return (((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.officialLang.hashCode()) * 31) + Integer.hashCode(this.deleted);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGroupOfficialInfo(type=" + this.type + ", officialCurrencyId=" + this.officialCurrencyId + ", officialLang=" + this.officialLang + ", deleted=" + this.deleted + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMGroupOfficialInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupOfficialInfo> serializer() {
            return InHouseIMGroupOfficialInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMGroupOfficialInfo(int i, int i2, Integer num, String str, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = 0;
        } else {
            this.type = i2;
        }
        if ((i & 2) == 0) {
            this.officialCurrencyId = null;
        } else {
            this.officialCurrencyId = num;
        }
        if ((i & 4) == 0) {
            this.officialLang = "";
        } else {
            this.officialLang = str;
        }
        if ((i & 8) == 0) {
            this.deleted = 0;
        } else {
            this.deleted = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupOfficialInfo inHouseIMGroupOfficialInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inHouseIMGroupOfficialInfo.type != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, inHouseIMGroupOfficialInfo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMGroupOfficialInfo.officialCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, inHouseIMGroupOfficialInfo.officialCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) inHouseIMGroupOfficialInfo.officialLang, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, inHouseIMGroupOfficialInfo.officialLang);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && inHouseIMGroupOfficialInfo.deleted == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, inHouseIMGroupOfficialInfo.deleted);
    }

    public InHouseIMGroupOfficialInfo(int i, Integer num, @NotNull String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = i;
        this.officialCurrencyId = num;
        this.officialLang = str;
        this.deleted = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(int, java.lang.Integer, java.lang.String, int):void (m)] (LINE:134) call: com.okinc.okimcore.model.remote.InHouseIMGroupOfficialInfo.<init>(int, java.lang.Integer, java.lang.String, int):void type: THIS */
    public /* synthetic */ InHouseIMGroupOfficialInfo(int i, Integer num, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 0 : i2);
    }
}
