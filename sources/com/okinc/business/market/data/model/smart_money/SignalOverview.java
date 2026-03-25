package com.okinc.business.market.data.model.smart_money;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalOverview {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<String> firstSignalTimes;
    public final List<List<String>> klineData;
    public final String klineDefaultPeriod;
    public final long lastEventTime;
    public final String maxIncreaseMultiplier;
    public final List<String> maxIncreaseMultiplierList;
    public final String maxIncreasePercentage;
    public final List<String> maxIncreasePercentageList;
    public final List<SignalData> signals;
    public final String tokenKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalOverview() {
        this((List) null, (String) null, (List) null, 0L, (String) null, (String) null, (List) null, (List) null, (List) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalOverview AEQbTJ(@NotNull List<String> list, @NotNull String str, @NotNull List<? extends List<String>> list2, long j, @NotNull String str2, @NotNull String str3, @NotNull List<String> list3, @NotNull List<String> list4, @NotNull List<SignalData> list5, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SignalOverview(list, str, list2, j, str2, str3, list3, list4, list5, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AEQbTJ() {
        return this.firstSignalTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.maxIncreasePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AhwBna() {
        return this.maxIncreaseMultiplierList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> EZpvd() {
        return this.klineData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.klineDefaultPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.lastEventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> djBIcL() {
        return this.maxIncreasePercentageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalOverview)) {
            return false;
        }
        SignalOverview signalOverview = (SignalOverview) obj;
        return Intrinsics.EZpvd(this.firstSignalTimes, signalOverview.firstSignalTimes) && Intrinsics.EZpvd((Object) this.klineDefaultPeriod, (Object) signalOverview.klineDefaultPeriod) && Intrinsics.EZpvd(this.klineData, signalOverview.klineData) && this.lastEventTime == signalOverview.lastEventTime && Intrinsics.EZpvd((Object) this.maxIncreaseMultiplier, (Object) signalOverview.maxIncreaseMultiplier) && Intrinsics.EZpvd((Object) this.maxIncreasePercentage, (Object) signalOverview.maxIncreasePercentage) && Intrinsics.EZpvd(this.maxIncreaseMultiplierList, signalOverview.maxIncreaseMultiplierList) && Intrinsics.EZpvd(this.maxIncreasePercentageList, signalOverview.maxIncreasePercentageList) && Intrinsics.EZpvd(this.signals, signalOverview.signals) && Intrinsics.EZpvd((Object) this.tokenKey, (Object) signalOverview.tokenKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.tokenKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.maxIncreaseMultiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.firstSignalTimes.hashCode() * 31) + this.klineDefaultPeriod.hashCode()) * 31) + this.klineData.hashCode()) * 31) + Long.hashCode(this.lastEventTime)) * 31) + this.maxIncreaseMultiplier.hashCode()) * 31) + this.maxIncreasePercentage.hashCode()) * 31) + this.maxIncreaseMultiplierList.hashCode()) * 31) + this.maxIncreasePercentageList.hashCode()) * 31) + this.signals.hashCode()) * 31) + this.tokenKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalOverview(firstSignalTimes=" + this.firstSignalTimes + ", klineDefaultPeriod=" + this.klineDefaultPeriod + ", klineData=" + this.klineData + ", lastEventTime=" + this.lastEventTime + ", maxIncreaseMultiplier=" + this.maxIncreaseMultiplier + ", maxIncreasePercentage=" + this.maxIncreasePercentage + ", maxIncreaseMultiplierList=" + this.maxIncreaseMultiplierList + ", maxIncreasePercentageList=" + this.maxIncreasePercentageList + ", signals=" + this.signals + ", tokenKey=" + this.tokenKey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalData> valueOf() {
        return this.signals;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalOverview.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalOverview> serializer() {
            return SignalOverview$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(new ArrayListSerializer(stringSerializer)), null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(SignalData$$serializer.INSTANCE), null};
    }

    public /* synthetic */ SignalOverview(int i, List list, String str, List list2, long j, String str2, String str3, List list3, List list4, List list5, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.firstSignalTimes = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.klineDefaultPeriod = "15m";
        } else {
            this.klineDefaultPeriod = str;
        }
        if ((i & 4) == 0) {
            this.klineData = yDY.AhwBna();
        } else {
            this.klineData = list2;
        }
        if ((i & 8) == 0) {
            this.lastEventTime = 0L;
        } else {
            this.lastEventTime = j;
        }
        if ((i & 16) == 0) {
            this.maxIncreaseMultiplier = "";
        } else {
            this.maxIncreaseMultiplier = str2;
        }
        if ((i & 32) == 0) {
            this.maxIncreasePercentage = "";
        } else {
            this.maxIncreasePercentage = str3;
        }
        if ((i & 64) == 0) {
            this.maxIncreaseMultiplierList = yDY.AhwBna();
        } else {
            this.maxIncreaseMultiplierList = list3;
        }
        if ((i & 128) == 0) {
            this.maxIncreasePercentageList = yDY.AhwBna();
        } else {
            this.maxIncreasePercentageList = list4;
        }
        if ((i & 256) == 0) {
            this.signals = yDY.AhwBna();
        } else {
            this.signals = list5;
        }
        if ((i & 512) == 0) {
            this.tokenKey = "";
        } else {
            this.tokenKey = str4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=6] */
    public static final /* synthetic */ void OLrzqt(SignalOverview signalOverview, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(signalOverview.firstSignalTimes, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], signalOverview.firstSignalTimes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signalOverview.klineDefaultPeriod, (Object) "15m")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signalOverview.klineDefaultPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(signalOverview.klineData, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], signalOverview.klineData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signalOverview.lastEventTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, signalOverview.lastEventTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) signalOverview.maxIncreaseMultiplier, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, signalOverview.maxIncreaseMultiplier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signalOverview.maxIncreasePercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signalOverview.maxIncreasePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(signalOverview.maxIncreaseMultiplierList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], signalOverview.maxIncreaseMultiplierList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(signalOverview.maxIncreasePercentageList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], signalOverview.maxIncreasePercentageList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(signalOverview.signals, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], signalOverview.signals);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) signalOverview.tokenKey, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, signalOverview.tokenKey);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public SignalOverview(@NotNull List<String> list, @NotNull String str, @NotNull List<? extends List<String>> list2, long j, @NotNull String str2, @NotNull String str3, @NotNull List<String> list3, @NotNull List<String> list4, @NotNull List<SignalData> list5, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.firstSignalTimes = list;
        this.klineDefaultPeriod = str;
        this.klineData = list2;
        this.lastEventTime = j;
        this.maxIncreaseMultiplier = str2;
        this.maxIncreasePercentage = str3;
        this.maxIncreaseMultiplierList = list3;
        this.maxIncreasePercentageList = list4;
        this.signals = list5;
        this.tokenKey = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0074: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:47)) : (r13v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("15m") : (r14v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:51)) : (r15v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001e: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:59)) : (r20v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0044: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:61)) : (r21v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004f: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0053: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:63)) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r24v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.util.List<? extends java.util.List<java.lang.String>>, long, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<com.okinc.business.market.data.model.smart_money.SignalData>, java.lang.String):void (m)] (LINE:45) call: com.okinc.business.market.data.model.smart_money.SignalOverview.<init>(java.util.List, java.lang.String, java.util.List, long, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SignalOverview(List list, String str, List list2, long j, String str2, String str3, List list3, List list4, List list5, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "15m" : str, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? yDY.AhwBna() : list3, (i & 128) != 0 ? yDY.AhwBna() : list4, (i & 256) != 0 ? yDY.AhwBna() : list5, (i & 512) == 0 ? str4 : "");
    }
}
