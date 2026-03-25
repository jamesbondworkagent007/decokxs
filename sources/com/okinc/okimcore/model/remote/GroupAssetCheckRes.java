package com.okinc.okimcore.model.remote;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class GroupAssetCheckRes {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Double assetCurrencyAmount;
    private final String assetCurrencySymbol;
    private final Double payCurrencyAmount;
    private final String payCurrencySymbol;
    private final Integer result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupAssetCheckRes() {
        this((Integer) null, (String) null, (String) null, (Double) null, (Double) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupAssetCheckRes copy$default(GroupAssetCheckRes groupAssetCheckRes, Integer num, String str, String str2, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = groupAssetCheckRes.result;
        }
        if ((i & 2) != 0) {
            str = groupAssetCheckRes.assetCurrencySymbol;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = groupAssetCheckRes.payCurrencySymbol;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            d = groupAssetCheckRes.assetCurrencyAmount;
        }
        Double d3 = d;
        if ((i & 16) != 0) {
            d2 = groupAssetCheckRes.payCurrencyAmount;
        }
        return groupAssetCheckRes.copy(num, str3, str4, d3, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.assetCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.payCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component4() {
        return this.assetCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component5() {
        return this.payCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupAssetCheckRes copy(Integer num, String str, String str2, Double d, Double d2) {
        return new GroupAssetCheckRes(num, str, str2, d, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupAssetCheckRes)) {
            return false;
        }
        GroupAssetCheckRes groupAssetCheckRes = (GroupAssetCheckRes) obj;
        return Intrinsics.EZpvd(this.result, groupAssetCheckRes.result) && Intrinsics.EZpvd((Object) this.assetCurrencySymbol, (Object) groupAssetCheckRes.assetCurrencySymbol) && Intrinsics.EZpvd((Object) this.payCurrencySymbol, (Object) groupAssetCheckRes.payCurrencySymbol) && Intrinsics.EZpvd(this.assetCurrencyAmount, groupAssetCheckRes.assetCurrencyAmount) && Intrinsics.EZpvd(this.payCurrencyAmount, groupAssetCheckRes.payCurrencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getAssetCurrencyAmount() {
        return this.assetCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetCurrencySymbol() {
        return this.assetCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getPayCurrencyAmount() {
        return this.payCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCurrencySymbol() {
        return this.payCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResult() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.result;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.assetCurrencySymbol;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.payCurrencySymbol;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Double d = this.assetCurrencyAmount;
        int iHashCode4 = d == null ? 0 : d.hashCode();
        Double d2 = this.payCurrencyAmount;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (d2 != null ? d2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupAssetCheckRes(result=" + this.result + ", assetCurrencySymbol=" + this.assetCurrencySymbol + ", payCurrencySymbol=" + this.payCurrencySymbol + ", assetCurrencyAmount=" + this.assetCurrencyAmount + ", payCurrencyAmount=" + this.payCurrencyAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupAssetCheckRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupAssetCheckRes> serializer() {
            return GroupAssetCheckRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupAssetCheckRes(int i, Integer num, String str, String str2, Double d, Double d2, SerializationConstructorMarker serializationConstructorMarker) {
        this.result = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.assetCurrencySymbol = null;
        } else {
            this.assetCurrencySymbol = str;
        }
        if ((i & 4) == 0) {
            this.payCurrencySymbol = null;
        } else {
            this.payCurrencySymbol = str2;
        }
        if ((i & 8) == 0) {
            this.assetCurrencyAmount = Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        } else {
            this.assetCurrencyAmount = d;
        }
        if ((i & 16) == 0) {
            this.payCurrencyAmount = Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        } else {
            this.payCurrencyAmount = d2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupAssetCheckRes groupAssetCheckRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = groupAssetCheckRes.result) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, groupAssetCheckRes.result);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupAssetCheckRes.assetCurrencySymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, groupAssetCheckRes.assetCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupAssetCheckRes.payCurrencySymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, groupAssetCheckRes.payCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(groupAssetCheckRes.assetCurrencyAmount, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, DoubleSerializer.INSTANCE, groupAssetCheckRes.assetCurrencyAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(groupAssetCheckRes.payCurrencyAmount, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, DoubleSerializer.INSTANCE, groupAssetCheckRes.payCurrencyAmount);
    }

    public GroupAssetCheckRes(Integer num, String str, String str2, Double d, Double d2) {
        this.result = num;
        this.assetCurrencySymbol = str;
        this.payCurrencySymbol = str2;
        this.assetCurrencyAmount = d;
        this.payCurrencyAmount = d2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Double:0x0021: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Double:0x001d: INVOKE (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) STATIC call: java.lang.Double.valueOf(double):java.lang.Double A[MD:(double):java.lang.Double (c), WRAPPED] (LINE:137)) : (r8v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0022: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Double:0x0026: INVOKE (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) STATIC call: java.lang.Double.valueOf(double):java.lang.Double A[MD:(double):java.lang.Double (c), WRAPPED] (LINE:138)) : (r9v0 java.lang.Double))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double):void (m)] (LINE:133) call: com.okinc.okimcore.model.remote.GroupAssetCheckRes.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double):void type: THIS */
    public /* synthetic */ GroupAssetCheckRes(Integer num, String str, String str2, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : str, (i & 4) == 0 ? str2 : null, (i & 8) != 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d, (i & 16) != 0 ? Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE) : d2);
    }
}
