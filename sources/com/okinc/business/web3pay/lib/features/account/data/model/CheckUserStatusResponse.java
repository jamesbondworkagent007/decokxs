package com.okinc.business.web3pay.lib.features.account.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CheckUserStatusResponse {
    private final List<Integer> freezeCodes;
    private final Boolean hasEmail;
    private final String ipCountry;
    private final Boolean validCefiStatus;
    private final Boolean validEmail;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CheckUserStatusResponse() {
        this((List) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.web3pay.lib.features.account.data.model.CheckUserStatusResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckUserStatusResponse copy$default(CheckUserStatusResponse checkUserStatusResponse, List list, Boolean bool, Boolean bool2, Boolean bool3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = checkUserStatusResponse.freezeCodes;
        }
        if ((i & 2) != 0) {
            bool = checkUserStatusResponse.validCefiStatus;
        }
        Boolean bool4 = bool;
        if ((i & 4) != 0) {
            bool2 = checkUserStatusResponse.validEmail;
        }
        Boolean bool5 = bool2;
        if ((i & 8) != 0) {
            bool3 = checkUserStatusResponse.hasEmail;
        }
        Boolean bool6 = bool3;
        if ((i & 16) != 0) {
            str = checkUserStatusResponse.ipCountry;
        }
        return checkUserStatusResponse.copy(list, bool4, bool5, bool6, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.freezeCodes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.validCefiStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.validEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.hasEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ipCountry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckUserStatusResponse copy(List<Integer> list, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        return new CheckUserStatusResponse(list, bool, bool2, bool3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckUserStatusResponse)) {
            return false;
        }
        CheckUserStatusResponse checkUserStatusResponse = (CheckUserStatusResponse) obj;
        return Intrinsics.EZpvd(this.freezeCodes, checkUserStatusResponse.freezeCodes) && Intrinsics.EZpvd(this.validCefiStatus, checkUserStatusResponse.validCefiStatus) && Intrinsics.EZpvd(this.validEmail, checkUserStatusResponse.validEmail) && Intrinsics.EZpvd(this.hasEmail, checkUserStatusResponse.hasEmail) && Intrinsics.EZpvd((Object) this.ipCountry, (Object) checkUserStatusResponse.ipCountry);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getFreezeCodes() {
        return this.freezeCodes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasEmail() {
        return this.hasEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIpCountry() {
        return this.ipCountry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getValidCefiStatus() {
        return this.validCefiStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getValidEmail() {
        return this.validEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Integer> list = this.freezeCodes;
        int iHashCode = list == null ? 0 : list.hashCode();
        Boolean bool = this.validCefiStatus;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.validEmail;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.hasEmail;
        int iHashCode4 = bool3 == null ? 0 : bool3.hashCode();
        String str = this.ipCountry;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckUserStatusResponse(freezeCodes=" + this.freezeCodes + ", validCefiStatus=" + this.validCefiStatus + ", validEmail=" + this.validEmail + ", hasEmail=" + this.hasEmail + ", ipCountry=" + this.ipCountry + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.data.model.CheckUserStatusResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckUserStatusResponse> serializer() {
            return CheckUserStatusResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckUserStatusResponse(int i, List list, Boolean bool, Boolean bool2, Boolean bool3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.freezeCodes = null;
        } else {
            this.freezeCodes = list;
        }
        if ((i & 2) == 0) {
            this.validCefiStatus = null;
        } else {
            this.validCefiStatus = bool;
        }
        if ((i & 4) == 0) {
            this.validEmail = null;
        } else {
            this.validEmail = bool2;
        }
        if ((i & 8) == 0) {
            this.hasEmail = null;
        } else {
            this.hasEmail = bool3;
        }
        if ((i & 16) == 0) {
            this.ipCountry = null;
        } else {
            this.ipCountry = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CheckUserStatusResponse checkUserStatusResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || checkUserStatusResponse.freezeCodes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], checkUserStatusResponse.freezeCodes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || checkUserStatusResponse.validCefiStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, checkUserStatusResponse.validCefiStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || checkUserStatusResponse.validEmail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, checkUserStatusResponse.validEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || checkUserStatusResponse.hasEmail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, checkUserStatusResponse.hasEmail);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && checkUserStatusResponse.ipCountry == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, checkUserStatusResponse.ipCountry);
    }

    public CheckUserStatusResponse(List<Integer> list, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.freezeCodes = list;
        this.validCefiStatus = bool;
        this.validEmail = bool2;
        this.hasEmail = bool3;
        this.ipCountry = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.util.List<java.lang.Integer>, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.web3pay.lib.features.account.data.model.CheckUserStatusResponse.<init>(java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CheckUserStatusResponse(List list, Boolean bool, Boolean bool2, Boolean bool3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : str);
    }
}
