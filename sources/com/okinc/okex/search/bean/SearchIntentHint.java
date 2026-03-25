package com.okinc.okex.search.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchIntentHint {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean confident;
    private final String id;
    private final Double score;
    private final String standardQuestion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchIntentHint() {
        this((String) null, (String) null, (Boolean) null, (Double) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchIntentHint copy$default(SearchIntentHint searchIntentHint, String str, String str2, Boolean bool, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchIntentHint.id;
        }
        if ((i & 2) != 0) {
            str2 = searchIntentHint.standardQuestion;
        }
        if ((i & 4) != 0) {
            bool = searchIntentHint.confident;
        }
        if ((i & 8) != 0) {
            d = searchIntentHint.score;
        }
        return searchIntentHint.copy(str, str2, bool, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.standardQuestion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.confident;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component4() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchIntentHint copy(String str, String str2, Boolean bool, Double d) {
        return new SearchIntentHint(str, str2, bool, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchIntentHint)) {
            return false;
        }
        SearchIntentHint searchIntentHint = (SearchIntentHint) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) searchIntentHint.id) && Intrinsics.EZpvd((Object) this.standardQuestion, (Object) searchIntentHint.standardQuestion) && Intrinsics.EZpvd(this.confident, searchIntentHint.confident) && Intrinsics.EZpvd(this.score, searchIntentHint.score);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getConfident() {
        return this.confident;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getScore() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStandardQuestion() {
        return this.standardQuestion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.standardQuestion;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.confident;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Double d = this.score;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (d != null ? d.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchIntentHint(id=" + this.id + ", standardQuestion=" + this.standardQuestion + ", confident=" + this.confident + ", score=" + this.score + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.bean.SearchIntentHint.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchIntentHint> serializer() {
            return SearchIntentHint$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchIntentHint(int i, String str, String str2, Boolean bool, Double d, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.standardQuestion = null;
        } else {
            this.standardQuestion = str2;
        }
        if ((i & 4) == 0) {
            this.confident = null;
        } else {
            this.confident = bool;
        }
        if ((i & 8) == 0) {
            this.score = null;
        } else {
            this.score = d;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SearchIntentHint searchIntentHint, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchIntentHint.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, searchIntentHint.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || searchIntentHint.standardQuestion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, searchIntentHint.standardQuestion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || searchIntentHint.confident != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, searchIntentHint.confident);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && searchIntentHint.score == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, DoubleSerializer.INSTANCE, searchIntentHint.score);
    }

    public SearchIntentHint(String str, String str2, Boolean bool, Double d) {
        this.id = str;
        this.standardQuestion = str2;
        this.confident = bool;
        this.score = d;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r5v0 java.lang.Double))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Double):void (m)] (LINE:15) call: com.okinc.okex.search.bean.SearchIntentHint.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Double):void type: THIS */
    public /* synthetic */ SearchIntentHint(String str, String str2, Boolean bool, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : d);
    }
}
