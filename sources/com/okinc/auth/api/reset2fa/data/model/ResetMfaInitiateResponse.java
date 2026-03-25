package com.okinc.auth.api.reset2fa.data.model;

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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class ResetMfaInitiateResponse implements java.io.Serializable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String business;
    private final List<String> new2FaType;
    private final String nextStep;
    private final List<String> previous2FaType;
    private final String reminderContent;
    private final String workflowToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ResetMfaInitiateResponse() {
        this((String) null, (String) null, (List) null, (List) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResetMfaInitiateResponse copy$default(ResetMfaInitiateResponse resetMfaInitiateResponse, String str, String str2, List list, List list2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetMfaInitiateResponse.nextStep;
        }
        if ((i & 2) != 0) {
            str2 = resetMfaInitiateResponse.workflowToken;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = resetMfaInitiateResponse.new2FaType;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = resetMfaInitiateResponse.previous2FaType;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            str3 = resetMfaInitiateResponse.reminderContent;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = resetMfaInitiateResponse.business;
        }
        return resetMfaInitiateResponse.copy(str, str5, list3, list4, str6, str4);
    }

    @SerialName("business")
    public static /* synthetic */ void getBusiness$annotations() {
    }

    @SerialName("requiredNewMfa")
    public static /* synthetic */ void getNew2FaType$annotations() {
    }

    @SerialName("nextStep")
    public static /* synthetic */ void getNextStep$annotations() {
    }

    @SerialName("requiredOldMfa")
    public static /* synthetic */ void getPrevious2FaType$annotations() {
    }

    @SerialName("reminderContent")
    public static /* synthetic */ void getReminderContent$annotations() {
    }

    @SerialName("workflowToken")
    public static /* synthetic */ void getWorkflowToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.workflowToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.new2FaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.previous2FaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResetMfaInitiateResponse copy(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        return new ResetMfaInitiateResponse(str, str2, list, list2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResetMfaInitiateResponse)) {
            return false;
        }
        ResetMfaInitiateResponse resetMfaInitiateResponse = (ResetMfaInitiateResponse) obj;
        return Intrinsics.EZpvd((Object) this.nextStep, (Object) resetMfaInitiateResponse.nextStep) && Intrinsics.EZpvd((Object) this.workflowToken, (Object) resetMfaInitiateResponse.workflowToken) && Intrinsics.EZpvd(this.new2FaType, resetMfaInitiateResponse.new2FaType) && Intrinsics.EZpvd(this.previous2FaType, resetMfaInitiateResponse.previous2FaType) && Intrinsics.EZpvd((Object) this.reminderContent, (Object) resetMfaInitiateResponse.reminderContent) && Intrinsics.EZpvd((Object) this.business, (Object) resetMfaInitiateResponse.business);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusiness() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getNew2FaType() {
        return this.new2FaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextStep() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPrevious2FaType() {
        return this.previous2FaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReminderContent() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWorkflowToken() {
        return this.workflowToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nextStep;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.workflowToken;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.new2FaType;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.previous2FaType;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        String str3 = this.reminderContent;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.business;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResetMfaInitiateResponse(nextStep=" + this.nextStep + ", workflowToken=" + this.workflowToken + ", new2FaType=" + this.new2FaType + ", previous2FaType=" + this.previous2FaType + ", reminderContent=" + this.reminderContent + ", business=" + this.business + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResetMfaInitiateResponse> serializer() {
            return ResetMfaInitiateResponse$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null};
    }

    public /* synthetic */ ResetMfaInitiateResponse(int i, String str, String str2, List list, List list2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nextStep = null;
        } else {
            this.nextStep = str;
        }
        if ((i & 2) == 0) {
            this.workflowToken = null;
        } else {
            this.workflowToken = str2;
        }
        if ((i & 4) == 0) {
            this.new2FaType = null;
        } else {
            this.new2FaType = list;
        }
        if ((i & 8) == 0) {
            this.previous2FaType = null;
        } else {
            this.previous2FaType = list2;
        }
        if ((i & 16) == 0) {
            this.reminderContent = null;
        } else {
            this.reminderContent = str3;
        }
        if ((i & 32) == 0) {
            this.business = null;
        } else {
            this.business = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_api(ResetMfaInitiateResponse resetMfaInitiateResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || resetMfaInitiateResponse.nextStep != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, resetMfaInitiateResponse.nextStep);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || resetMfaInitiateResponse.workflowToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, resetMfaInitiateResponse.workflowToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || resetMfaInitiateResponse.new2FaType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], resetMfaInitiateResponse.new2FaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || resetMfaInitiateResponse.previous2FaType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], resetMfaInitiateResponse.previous2FaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || resetMfaInitiateResponse.reminderContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, resetMfaInitiateResponse.reminderContent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && resetMfaInitiateResponse.business == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, resetMfaInitiateResponse.business);
    }

    public ResetMfaInitiateResponse(String str, String str2, List<String> list, List<String> list2, String str3, String str4) {
        this.nextStep = str;
        this.workflowToken = str2;
        this.new2FaType = list;
        this.previous2FaType = list2;
        this.reminderContent = str3;
        this.business = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:48) call: com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ResetMfaInitiateResponse(String str, String str2, List list, List list2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
