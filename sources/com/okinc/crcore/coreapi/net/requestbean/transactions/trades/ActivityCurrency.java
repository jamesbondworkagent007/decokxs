package com.okinc.crcore.coreapi.net.requestbean.transactions.trades;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ActivityCurrency {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer chainIndex;
    private final Integer currencyId;
    private final int currencySource;
    private final String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ActivityCurrency copy$default(ActivityCurrency activityCurrency, int i, Integer num, Integer num2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = activityCurrency.currencySource;
        }
        if ((i2 & 2) != 0) {
            num = activityCurrency.currencyId;
        }
        if ((i2 & 4) != 0) {
            num2 = activityCurrency.chainIndex;
        }
        if ((i2 & 8) != 0) {
            str = activityCurrency.tokenAddress;
        }
        return activityCurrency.copy(i, num, num2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCurrency copy(int i, Integer num, Integer num2, String str) {
        return new ActivityCurrency(i, num, num2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityCurrency)) {
            return false;
        }
        ActivityCurrency activityCurrency = (ActivityCurrency) obj;
        return this.currencySource == activityCurrency.currencySource && Intrinsics.EZpvd(this.currencyId, activityCurrency.currencyId) && Intrinsics.EZpvd(this.chainIndex, activityCurrency.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) activityCurrency.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencySource() {
        return this.currencySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currencySource);
        Integer num = this.currencyId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.chainIndex;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        String str = this.tokenAddress;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivityCurrency(currencySource=" + this.currencySource + ", currencyId=" + this.currencyId + ", chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.requestbean.transactions.trades.ActivityCurrency.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityCurrency> serializer() {
            return ActivityCurrency$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivityCurrency(int i, int i2, Integer num, Integer num2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ActivityCurrency$$serializer.INSTANCE.getDescriptor());
        }
        this.currencySource = i2;
        if ((i & 2) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 4) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = num2;
        }
        if ((i & 8) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ActivityCurrency activityCurrency, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, activityCurrency.currencySource);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || activityCurrency.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, activityCurrency.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || activityCurrency.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, activityCurrency.chainIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && activityCurrency.tokenAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, activityCurrency.tokenAddress);
    }

    public ActivityCurrency(int i, Integer num, Integer num2, String str) {
        this.currencySource = i;
        this.currencyId = num;
        this.chainIndex = num2;
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(int, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:30) call: com.okinc.crcore.coreapi.net.requestbean.transactions.trades.ActivityCurrency.<init>(int, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ ActivityCurrency(int i, Integer num, Integer num2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : str);
    }
}
