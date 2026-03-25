package com.okinc.unify_find.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class NewCoinGroupResponse {
    private static final KSerializer<Object>[] $childSerializers;
    private List<NewCoinFuturesRankPo> futuresOnline;
    private final List<WaitOnlineRank> futuresWaitOnline;
    private final ArrayList<NewCoinRank> online;
    private final ArrayList<WaitOnlineRank> waitOnline;
    private final ArrayList<WaitOnlineRank> waitOnlineNew;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewCoinGroupResponse() {
        this((ArrayList) null, (ArrayList) null, (ArrayList) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_find.data.NewCoinGroupResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewCoinGroupResponse copy$default(NewCoinGroupResponse newCoinGroupResponse, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = newCoinGroupResponse.online;
        }
        if ((i & 2) != 0) {
            arrayList2 = newCoinGroupResponse.waitOnlineNew;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i & 4) != 0) {
            arrayList3 = newCoinGroupResponse.waitOnline;
        }
        ArrayList arrayList5 = arrayList3;
        if ((i & 8) != 0) {
            list = newCoinGroupResponse.futuresOnline;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = newCoinGroupResponse.futuresWaitOnline;
        }
        return newCoinGroupResponse.copy(arrayList, arrayList4, arrayList5, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NewCoinRank> component1() {
        return this.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WaitOnlineRank> component2() {
        return this.waitOnlineNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WaitOnlineRank> component3() {
        return this.waitOnline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NewCoinFuturesRankPo> component4() {
        return this.futuresOnline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WaitOnlineRank> component5() {
        return this.futuresWaitOnline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinGroupResponse copy(@NotNull ArrayList<NewCoinRank> arrayList, @NotNull ArrayList<WaitOnlineRank> arrayList2, @NotNull ArrayList<WaitOnlineRank> arrayList3, List<NewCoinFuturesRankPo> list, List<WaitOnlineRank> list2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        return new NewCoinGroupResponse(arrayList, arrayList2, arrayList3, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCoinGroupResponse)) {
            return false;
        }
        NewCoinGroupResponse newCoinGroupResponse = (NewCoinGroupResponse) obj;
        return Intrinsics.EZpvd(this.online, newCoinGroupResponse.online) && Intrinsics.EZpvd(this.waitOnlineNew, newCoinGroupResponse.waitOnlineNew) && Intrinsics.EZpvd(this.waitOnline, newCoinGroupResponse.waitOnline) && Intrinsics.EZpvd(this.futuresOnline, newCoinGroupResponse.futuresOnline) && Intrinsics.EZpvd(this.futuresWaitOnline, newCoinGroupResponse.futuresWaitOnline);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NewCoinFuturesRankPo> getFuturesOnline() {
        return this.futuresOnline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WaitOnlineRank> getFuturesWaitOnline() {
        return this.futuresWaitOnline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NewCoinRank> getOnline() {
        return this.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WaitOnlineRank> getWaitOnline() {
        return this.waitOnline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WaitOnlineRank> getWaitOnlineNew() {
        return this.waitOnlineNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.online.hashCode();
        int iHashCode2 = this.waitOnlineNew.hashCode();
        int iHashCode3 = this.waitOnline.hashCode();
        List<NewCoinFuturesRankPo> list = this.futuresOnline;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<WaitOnlineRank> list2 = this.futuresWaitOnline;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFuturesOnline(List<NewCoinFuturesRankPo> list) {
        this.futuresOnline = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCoinGroupResponse(online=" + this.online + ", waitOnlineNew=" + this.waitOnlineNew + ", waitOnline=" + this.waitOnline + ", futuresOnline=" + this.futuresOnline + ", futuresWaitOnline=" + this.futuresWaitOnline + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.NewCoinGroupResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewCoinGroupResponse> serializer() {
            return NewCoinGroupResponse$$serializer.INSTANCE;
        }
    }

    static {
        WaitOnlineRank$$serializer waitOnlineRank$$serializer = WaitOnlineRank$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(NewCoinRank$$serializer.INSTANCE), new ArrayListSerializer(waitOnlineRank$$serializer), new ArrayListSerializer(waitOnlineRank$$serializer), new ArrayListSerializer(NewCoinFuturesRankPo$$serializer.INSTANCE), new ArrayListSerializer(waitOnlineRank$$serializer)};
    }

    public /* synthetic */ NewCoinGroupResponse(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.online = (i & 1) == 0 ? new ArrayList() : arrayList;
        if ((i & 2) == 0) {
            this.waitOnlineNew = new ArrayList<>();
        } else {
            this.waitOnlineNew = arrayList2;
        }
        if ((i & 4) == 0) {
            this.waitOnline = new ArrayList<>();
        } else {
            this.waitOnline = arrayList3;
        }
        if ((i & 8) == 0) {
            this.futuresOnline = new ArrayList();
        } else {
            this.futuresOnline = list;
        }
        if ((i & 16) == 0) {
            this.futuresWaitOnline = new ArrayList();
        } else {
            this.futuresWaitOnline = list2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [236=6] */
    public static final /* synthetic */ void write$Self$OKMarket_market_impl(NewCoinGroupResponse newCoinGroupResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(newCoinGroupResponse.online, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], newCoinGroupResponse.online);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(newCoinGroupResponse.waitOnlineNew, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], newCoinGroupResponse.waitOnlineNew);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(newCoinGroupResponse.waitOnline, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], newCoinGroupResponse.waitOnline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(newCoinGroupResponse.futuresOnline, new ArrayList())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], newCoinGroupResponse.futuresOnline);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(newCoinGroupResponse.futuresWaitOnline, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], newCoinGroupResponse.futuresWaitOnline);
    }

    public NewCoinGroupResponse(@NotNull ArrayList<NewCoinRank> arrayList, @NotNull ArrayList<WaitOnlineRank> arrayList2, @NotNull ArrayList<WaitOnlineRank> arrayList3, List<NewCoinFuturesRankPo> list, List<WaitOnlineRank> list2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        this.online = arrayList;
        this.waitOnlineNew = arrayList2;
        this.waitOnline = arrayList3;
        this.futuresOnline = list;
        this.futuresWaitOnline = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:239) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:0x0012: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:240) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r5v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:0x001c: TERNARY null = ((wrap:int:0x0013: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0019: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:241) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r6v0 java.util.ArrayList))
  (wrap:java.util.List:0x0026: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0023: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:246) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r7v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002d: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:250) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.List))
 A[MD:(java.util.ArrayList<com.okinc.unify_find.data.NewCoinRank>, java.util.ArrayList<com.okinc.unify_find.data.WaitOnlineRank>, java.util.ArrayList<com.okinc.unify_find.data.WaitOnlineRank>, java.util.List<com.okinc.unify_find.data.NewCoinFuturesRankPo>, java.util.List<com.okinc.unify_find.data.WaitOnlineRank>):void (m)] (LINE:238) call: com.okinc.unify_find.data.NewCoinGroupResponse.<init>(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ NewCoinGroupResponse(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? new ArrayList() : arrayList3, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? new ArrayList() : list2);
    }
}
