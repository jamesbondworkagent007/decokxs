package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class MpStgyCopyProfitChangeData implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String maxDrawdown;
    private boolean needRefreshChart;
    private final Pair<String, Integer> pnlRatio;
    private final List<StrategyProfitResponse> profitList;
    private final boolean useUsdtMargin;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MpStgyCopyProfitChangeData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new PairSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), null, new ArrayListSerializer(StrategyProfitResponse$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<MpStgyCopyProfitChangeData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpStgyCopyProfitChangeData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            Pair pair = (Pair) parcel.readSerializable();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(StrategyProfitResponse.CREATOR.createFromParcel(parcel));
                }
            }
            return new MpStgyCopyProfitChangeData(pair, string, arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpStgyCopyProfitChangeData[] newArray(int i) {
            return new MpStgyCopyProfitChangeData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MpStgyCopyProfitChangeData copy$default(MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, Pair pair, String str, List list, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            pair = mpStgyCopyProfitChangeData.pnlRatio;
        }
        if ((i & 2) != 0) {
            str = mpStgyCopyProfitChangeData.maxDrawdown;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            list = mpStgyCopyProfitChangeData.profitList;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = mpStgyCopyProfitChangeData.algoId;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = mpStgyCopyProfitChangeData.needRefreshChart;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = mpStgyCopyProfitChangeData.useUsdtMargin;
        }
        return mpStgyCopyProfitChangeData.copy(pair, str3, list2, str4, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, Integer> component1() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxDrawdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> component3() {
        return this.profitList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.needRefreshChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.useUsdtMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpStgyCopyProfitChangeData copy(@NotNull Pair<String, Integer> pair, @NotNull String str, List<StrategyProfitResponse> list, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MpStgyCopyProfitChangeData(pair, str, list, str2, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MpStgyCopyProfitChangeData)) {
            return false;
        }
        MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData = (MpStgyCopyProfitChangeData) obj;
        return Intrinsics.EZpvd(this.pnlRatio, mpStgyCopyProfitChangeData.pnlRatio) && Intrinsics.EZpvd((Object) this.maxDrawdown, (Object) mpStgyCopyProfitChangeData.maxDrawdown) && Intrinsics.EZpvd(this.profitList, mpStgyCopyProfitChangeData.profitList) && Intrinsics.EZpvd((Object) this.algoId, (Object) mpStgyCopyProfitChangeData.algoId) && this.needRefreshChart == mpStgyCopyProfitChangeData.needRefreshChart && this.useUsdtMargin == mpStgyCopyProfitChangeData.useUsdtMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxDrawdown() {
        return this.maxDrawdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedRefreshChart() {
        return this.needRefreshChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, Integer> getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StrategyProfitResponse> getProfitList() {
        return this.profitList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseUsdtMargin() {
        return this.useUsdtMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.pnlRatio.hashCode();
        int iHashCode2 = this.maxDrawdown.hashCode();
        List<StrategyProfitResponse> list = this.profitList;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.algoId.hashCode()) * 31) + Boolean.hashCode(this.needRefreshChart)) * 31) + Boolean.hashCode(this.useUsdtMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedRefreshChart(boolean z) {
        this.needRefreshChart = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpStgyCopyProfitChangeData(pnlRatio=" + this.pnlRatio + ", maxDrawdown=" + this.maxDrawdown + ", profitList=" + this.profitList + ", algoId=" + this.algoId + ", needRefreshChart=" + this.needRefreshChart + ", useUsdtMargin=" + this.useUsdtMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeSerializable(this.pnlRatio);
        parcel.writeString(this.maxDrawdown);
        List<StrategyProfitResponse> list = this.profitList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<StrategyProfitResponse> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.algoId);
        parcel.writeInt(this.needRefreshChart ? 1 : 0);
        parcel.writeInt(this.useUsdtMargin ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MpStgyCopyProfitChangeData> serializer() {
            return MpStgyCopyProfitChangeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MpStgyCopyProfitChangeData(int i, Pair pair, String str, List list, String str2, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, MpStgyCopyProfitChangeData$$serializer.INSTANCE.getDescriptor());
        }
        this.pnlRatio = pair;
        if ((i & 2) == 0) {
            this.maxDrawdown = "";
        } else {
            this.maxDrawdown = str;
        }
        this.profitList = list;
        if ((i & 8) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str2;
        }
        if ((i & 16) == 0) {
            this.needRefreshChart = true;
        } else {
            this.needRefreshChart = z;
        }
        if ((i & 32) == 0) {
            this.useUsdtMargin = false;
        } else {
            this.useUsdtMargin = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], mpStgyCopyProfitChangeData.pnlRatio);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) mpStgyCopyProfitChangeData.maxDrawdown, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, mpStgyCopyProfitChangeData.maxDrawdown);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], mpStgyCopyProfitChangeData.profitList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) mpStgyCopyProfitChangeData.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, mpStgyCopyProfitChangeData.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !mpStgyCopyProfitChangeData.needRefreshChart) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, mpStgyCopyProfitChangeData.needRefreshChart);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || mpStgyCopyProfitChangeData.useUsdtMargin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, mpStgyCopyProfitChangeData.useUsdtMargin);
        }
    }

    public MpStgyCopyProfitChangeData(@NotNull Pair<String, Integer> pair, @NotNull String str, List<StrategyProfitResponse> list, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.pnlRatio = pair;
        this.maxDrawdown = str;
        this.profitList = list;
        this.algoId = str2;
        this.needRefreshChart = z;
        this.useUsdtMargin = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r10v0 kotlin.Pair)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (r12v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
 A[MD:(kotlin.Pair<java.lang.String, java.lang.Integer>, java.lang.String, java.util.List<com.okinc.unify_trade.biz.StrategyProfitResponse>, java.lang.String, boolean, boolean):void (m)] (LINE:433) call: com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData.<init>(kotlin.Pair, java.lang.String, java.util.List, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ MpStgyCopyProfitChangeData(Pair pair, String str, List list, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pair, (i & 2) != 0 ? "" : str, list, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2);
    }
}
