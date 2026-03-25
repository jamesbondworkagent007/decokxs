package com.okinc.auth.api.reset2fa.data.model;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class ResetMfaInitiateRequest {
    public final String areaCode;
    public final String loginName;
    public final List<String> resetType;
    public final String token;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ResetMfaInitiateRequest() {
        this((List) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResetMfaInitiateRequest copy$default(ResetMfaInitiateRequest resetMfaInitiateRequest, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = resetMfaInitiateRequest.resetType;
        }
        if ((i & 2) != 0) {
            str = resetMfaInitiateRequest.areaCode;
        }
        if ((i & 4) != 0) {
            str2 = resetMfaInitiateRequest.loginName;
        }
        if ((i & 8) != 0) {
            str3 = resetMfaInitiateRequest.token;
        }
        return resetMfaInitiateRequest.copydefault(list, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResetMfaInitiateRequest copydefault(@NotNull List<String> list, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ResetMfaInitiateRequest(list, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResetMfaInitiateRequest)) {
            return false;
        }
        ResetMfaInitiateRequest resetMfaInitiateRequest = (ResetMfaInitiateRequest) obj;
        return Intrinsics.EZpvd(this.resetType, resetMfaInitiateRequest.resetType) && Intrinsics.EZpvd((Object) this.areaCode, (Object) resetMfaInitiateRequest.areaCode) && Intrinsics.EZpvd((Object) this.loginName, (Object) resetMfaInitiateRequest.loginName) && Intrinsics.EZpvd((Object) this.token, (Object) resetMfaInitiateRequest.token);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.resetType.hashCode();
        String str = this.areaCode;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.loginName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.token;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResetMfaInitiateRequest(resetType=" + this.resetType + ", areaCode=" + this.areaCode + ", loginName=" + this.loginName + ", token=" + this.token + ")";
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResetMfaInitiateRequest> serializer() {
            return ResetMfaInitiateRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ResetMfaInitiateRequest(int i, List list, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.resetType = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str;
        }
        if ((i & 4) == 0) {
            this.loginName = null;
        } else {
            this.loginName = str2;
        }
        if ((i & 8) == 0) {
            this.token = null;
        } else {
            this.token = str3;
        }
    }

    public static final /* synthetic */ void KWHzl(ResetMfaInitiateRequest resetMfaInitiateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(resetMfaInitiateRequest.resetType, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], resetMfaInitiateRequest.resetType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || resetMfaInitiateRequest.areaCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, resetMfaInitiateRequest.areaCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || resetMfaInitiateRequest.loginName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, resetMfaInitiateRequest.loginName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && resetMfaInitiateRequest.token == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, resetMfaInitiateRequest.token);
    }

    public ResetMfaInitiateRequest(@NotNull List<String> list, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.resetType = list;
        this.areaCode = str;
        this.loginName = str2;
        this.token = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:38)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:36) call: com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateRequest.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ResetMfaInitiateRequest(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
