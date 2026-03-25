package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class SearchPhoneRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer areaCode;
    private final int from;
    private final String phone;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchPhoneRequestBody copy$default(SearchPhoneRequestBody searchPhoneRequestBody, String str, Integer num, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchPhoneRequestBody.phone;
        }
        if ((i2 & 2) != 0) {
            num = searchPhoneRequestBody.areaCode;
        }
        if ((i2 & 4) != 0) {
            i = searchPhoneRequestBody.from;
        }
        return searchPhoneRequestBody.copy(str, num, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchPhoneRequestBody copy(String str, Integer num, int i) {
        return new SearchPhoneRequestBody(str, num, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPhoneRequestBody)) {
            return false;
        }
        SearchPhoneRequestBody searchPhoneRequestBody = (SearchPhoneRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.phone, (Object) searchPhoneRequestBody.phone) && Intrinsics.EZpvd(this.areaCode, searchPhoneRequestBody.areaCode) && this.from == searchPhoneRequestBody.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.phone;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.areaCode;
        return (((iHashCode * 31) + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.from);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchPhoneRequestBody(phone=" + this.phone + ", areaCode=" + this.areaCode + ", from=" + this.from + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.SearchPhoneRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchPhoneRequestBody> serializer() {
            return SearchPhoneRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchPhoneRequestBody(int i, String str, Integer num, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, SearchPhoneRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.phone = null;
        } else {
            this.phone = str;
        }
        if ((i & 2) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = num;
        }
        this.from = i2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(SearchPhoneRequestBody searchPhoneRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchPhoneRequestBody.phone != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, searchPhoneRequestBody.phone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || searchPhoneRequestBody.areaCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, searchPhoneRequestBody.areaCode);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, searchPhoneRequestBody.from);
    }

    public SearchPhoneRequestBody(String str, Integer num, int i) {
        this.phone = str;
        this.areaCode = num;
        this.from = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (r4v0 int)
 A[MD:(java.lang.String, java.lang.Integer, int):void (m)] (LINE:39) call: com.okinc.okimcore.model.remote.SearchPhoneRequestBody.<init>(java.lang.String, java.lang.Integer, int):void type: THIS */
    public /* synthetic */ SearchPhoneRequestBody(String str, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : num, i);
    }
}
