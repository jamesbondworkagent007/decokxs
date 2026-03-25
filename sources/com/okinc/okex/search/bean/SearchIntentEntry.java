package com.okinc.okex.search.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchIntentEntry {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String answer;
    private final String standardQuestion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchIntentEntry() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchIntentEntry copy$default(SearchIntentEntry searchIntentEntry, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchIntentEntry.standardQuestion;
        }
        if ((i & 2) != 0) {
            str2 = searchIntentEntry.answer;
        }
        return searchIntentEntry.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.standardQuestion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.answer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchIntentEntry copy(String str, String str2) {
        return new SearchIntentEntry(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchIntentEntry)) {
            return false;
        }
        SearchIntentEntry searchIntentEntry = (SearchIntentEntry) obj;
        return Intrinsics.EZpvd((Object) this.standardQuestion, (Object) searchIntentEntry.standardQuestion) && Intrinsics.EZpvd((Object) this.answer, (Object) searchIntentEntry.answer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnswer() {
        return this.answer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStandardQuestion() {
        return this.standardQuestion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.standardQuestion;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.answer;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchIntentEntry(standardQuestion=" + this.standardQuestion + ", answer=" + this.answer + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.bean.SearchIntentEntry.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchIntentEntry> serializer() {
            return SearchIntentEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchIntentEntry(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.standardQuestion = null;
        } else {
            this.standardQuestion = str;
        }
        if ((i & 2) == 0) {
            this.answer = null;
        } else {
            this.answer = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SearchIntentEntry searchIntentEntry, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchIntentEntry.standardQuestion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, searchIntentEntry.standardQuestion);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && searchIntentEntry.answer == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, searchIntentEntry.answer);
    }

    public SearchIntentEntry(String str, String str2) {
        this.standardQuestion = str;
        this.answer = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.okex.search.bean.SearchIntentEntry.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SearchIntentEntry(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
