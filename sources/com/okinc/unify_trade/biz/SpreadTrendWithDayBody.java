package com.okinc.unify_trade.biz;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SpreadTrendWithDayBody {
    private String queryDays;
    private ArrayList<SpreadTrendWithDaySubBody> spreadTrends;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SpreadTrendWithDaySubBody$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpreadTrendWithDayBody() {
        this((String) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SpreadTrendWithDayBody */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpreadTrendWithDayBody copy$default(SpreadTrendWithDayBody spreadTrendWithDayBody, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spreadTrendWithDayBody.queryDays;
        }
        if ((i & 2) != 0) {
            arrayList = spreadTrendWithDayBody.spreadTrends;
        }
        return spreadTrendWithDayBody.copy(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.queryDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SpreadTrendWithDaySubBody> component2() {
        return this.spreadTrends;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpreadTrendWithDayBody copy(String str, ArrayList<SpreadTrendWithDaySubBody> arrayList) {
        return new SpreadTrendWithDayBody(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpreadTrendWithDayBody)) {
            return false;
        }
        SpreadTrendWithDayBody spreadTrendWithDayBody = (SpreadTrendWithDayBody) obj;
        return Intrinsics.EZpvd((Object) this.queryDays, (Object) spreadTrendWithDayBody.queryDays) && Intrinsics.EZpvd(this.spreadTrends, spreadTrendWithDayBody.spreadTrends);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQueryDays() {
        return this.queryDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SpreadTrendWithDaySubBody> getSpreadTrends() {
        return this.spreadTrends;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.queryDays;
        int iHashCode = str == null ? 0 : str.hashCode();
        ArrayList<SpreadTrendWithDaySubBody> arrayList = this.spreadTrends;
        return (iHashCode * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQueryDays(String str) {
        this.queryDays = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpreadTrends(ArrayList<SpreadTrendWithDaySubBody> arrayList) {
        this.spreadTrends = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpreadTrendWithDayBody(queryDays=" + this.queryDays + ", spreadTrends=" + this.spreadTrends + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpreadTrendWithDayBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpreadTrendWithDayBody> serializer() {
            return SpreadTrendWithDayBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpreadTrendWithDayBody(int i, String str, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.queryDays = null;
        } else {
            this.queryDays = str;
        }
        if ((i & 2) == 0) {
            this.spreadTrends = null;
        } else {
            this.spreadTrends = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpreadTrendWithDayBody spreadTrendWithDayBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spreadTrendWithDayBody.queryDays != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spreadTrendWithDayBody.queryDays);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && spreadTrendWithDayBody.spreadTrends == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], spreadTrendWithDayBody.spreadTrends);
    }

    public SpreadTrendWithDayBody(String str, ArrayList<SpreadTrendWithDaySubBody> arrayList) {
        this.queryDays = str;
        this.spreadTrends = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r3v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.SpreadTrendWithDaySubBody>):void (m)] (LINE:29) call: com.okinc.unify_trade.biz.SpreadTrendWithDayBody.<init>(java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ SpreadTrendWithDayBody(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : arrayList);
    }
}
