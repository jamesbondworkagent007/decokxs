package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ProfitDetailData implements Parcelable {
    private String algoId;
    private final String exceptionMsg;
    private final String instId;
    private final String instType;
    private final ArrayList<ProDetailData> list;
    private final Pair<String, Integer> pnl;
    private final String quoteAmt;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProfitDetailData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(ProDetailData$$serializer.INSTANCE), null, null, null, new PairSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<ProfitDetailData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitDetailData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ProDetailData.CREATOR.createFromParcel(parcel));
            }
            return new ProfitDetailData(string, string2, string3, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), (Pair) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProfitDetailData[] newArray(int i) {
            return new ProfitDetailData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProfitDetailData() {
        this((String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (Pair) null, 255, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExceptionMsg() {
        return this.exceptionMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ProDetailData> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, Integer> getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmt() {
        return this.quoteAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.title);
        parcel.writeString(this.quoteAmt);
        ArrayList<ProDetailData> arrayList = this.list;
        parcel.writeInt(arrayList.size());
        Iterator<ProDetailData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.exceptionMsg);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeSerializable(this.pnl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.ProfitDetailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProfitDetailData> serializer() {
            return ProfitDetailData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProfitDetailData(int i, String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, Pair pair, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.quoteAmt = "";
        } else {
            this.quoteAmt = str3;
        }
        if ((i & 8) == 0) {
            this.list = new ArrayList<>();
        } else {
            this.list = arrayList;
        }
        if ((i & 16) == 0) {
            this.exceptionMsg = "";
        } else {
            this.exceptionMsg = str4;
        }
        if ((i & 32) == 0) {
            this.instId = "";
        } else {
            this.instId = str5;
        }
        if ((i & 64) == 0) {
            this.instType = "";
        } else {
            this.instType = str6;
        }
        if ((i & 128) == 0) {
            this.pnl = null;
        } else {
            this.pnl = pair;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ProfitDetailData profitDetailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) profitDetailData.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, profitDetailData.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) profitDetailData.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, profitDetailData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) profitDetailData.quoteAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, profitDetailData.quoteAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(profitDetailData.list, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], profitDetailData.list);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) profitDetailData.exceptionMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, profitDetailData.exceptionMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) profitDetailData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, profitDetailData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) profitDetailData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, profitDetailData.instType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && profitDetailData.pnl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], profitDetailData.pnl);
    }

    public ProfitDetailData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ArrayList<ProDetailData> arrayList, @NotNull String str4, @NotNull String str5, @NotNull String str6, Pair<String, Integer> pair) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.algoId = str;
        this.title = str2;
        this.quoteAmt = str3;
        this.list = arrayList;
        this.exceptionMsg = str4;
        this.instId = str5;
        this.instType = str6;
        this.pnl = pair;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1275) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r13v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.String) : (""))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0039: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r17v0 kotlin.Pair))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.bot.data.ProDetailData>, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.String, java.lang.Integer>):void (m)] (LINE:1273) call: com.okinc.unify_trade.bot.data.ProfitDetailData.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair):void type: THIS */
    public /* synthetic */ ProfitDetailData(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, Pair pair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new ArrayList() : arrayList, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? null : pair);
    }
}
