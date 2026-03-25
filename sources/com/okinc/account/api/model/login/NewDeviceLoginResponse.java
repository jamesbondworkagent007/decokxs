package com.okinc.account.api.model.login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class NewDeviceLoginResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String _tk;
    private final Integer pastDue;
    private final String token;
    private final String uid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewDeviceLoginResponse() {
        this((String) null, (Integer) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewDeviceLoginResponse copy$default(NewDeviceLoginResponse newDeviceLoginResponse, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newDeviceLoginResponse.token;
        }
        if ((i & 2) != 0) {
            num = newDeviceLoginResponse.pastDue;
        }
        if ((i & 4) != 0) {
            str2 = newDeviceLoginResponse._tk;
        }
        if ((i & 8) != 0) {
            str3 = newDeviceLoginResponse.uid;
        }
        return newDeviceLoginResponse.copy(str, num, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.pastDue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this._tk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewDeviceLoginResponse copy(String str, Integer num, String str2, String str3) {
        return new NewDeviceLoginResponse(str, num, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewDeviceLoginResponse)) {
            return false;
        }
        NewDeviceLoginResponse newDeviceLoginResponse = (NewDeviceLoginResponse) obj;
        return Intrinsics.EZpvd((Object) this.token, (Object) newDeviceLoginResponse.token) && Intrinsics.EZpvd(this.pastDue, newDeviceLoginResponse.pastDue) && Intrinsics.EZpvd((Object) this._tk, (Object) newDeviceLoginResponse._tk) && Intrinsics.EZpvd((Object) this.uid, (Object) newDeviceLoginResponse.uid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPastDue() {
        return this.pastDue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String get_tk() {
        return this._tk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.token;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.pastDue;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this._tk;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.uid;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewDeviceLoginResponse(token=" + this.token + ", pastDue=" + this.pastDue + ", _tk=" + this._tk + ", uid=" + this.uid + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.NewDeviceLoginResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewDeviceLoginResponse> serializer() {
            return NewDeviceLoginResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewDeviceLoginResponse(int i, String str, Integer num, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.token = null;
        } else {
            this.token = str;
        }
        if ((i & 2) == 0) {
            this.pastDue = null;
        } else {
            this.pastDue = num;
        }
        if ((i & 4) == 0) {
            this._tk = null;
        } else {
            this._tk = str2;
        }
        if ((i & 8) == 0) {
            this.uid = null;
        } else {
            this.uid = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(NewDeviceLoginResponse newDeviceLoginResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || newDeviceLoginResponse.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, newDeviceLoginResponse.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || newDeviceLoginResponse.pastDue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, newDeviceLoginResponse.pastDue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || newDeviceLoginResponse._tk != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, newDeviceLoginResponse._tk);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && newDeviceLoginResponse.uid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, newDeviceLoginResponse.uid);
    }

    public NewDeviceLoginResponse(String str, Integer num, String str2, String str3) {
        this.token = str;
        this.pastDue = num;
        this._tk = str2;
        this.uid = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:57) call: com.okinc.account.api.model.login.NewDeviceLoginResponse.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewDeviceLoginResponse(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
