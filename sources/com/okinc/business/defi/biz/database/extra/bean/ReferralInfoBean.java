package com.okinc.business.defi.biz.database.extra.bean;

import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ReferralInfoBean {
    private static final KSerializer<Object>[] $childSerializers;
    private final boolean disconnected;
    private final String discountRate;
    private final String inviter;
    private final Map<String, String> inviterAddressMap;
    private final String referralCode;
    private final String signMsg;
    private final String signature;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferralInfoBean copy$default(ReferralInfoBean referralInfoBean, String str, String str2, Map map, boolean z, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = referralInfoBean.referralCode;
        }
        if ((i & 2) != 0) {
            str2 = referralInfoBean.inviter;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            map = referralInfoBean.inviterAddressMap;
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            z = referralInfoBean.disconnected;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = referralInfoBean.discountRate;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = referralInfoBean.signMsg;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = referralInfoBean.signature;
        }
        return referralInfoBean.copy(str, str6, map2, z2, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inviter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.inviterAddressMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.disconnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralInfoBean copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, boolean z, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new ReferralInfoBean(str, str2, map, z, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralInfoBean)) {
            return false;
        }
        ReferralInfoBean referralInfoBean = (ReferralInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.referralCode, (Object) referralInfoBean.referralCode) && Intrinsics.EZpvd((Object) this.inviter, (Object) referralInfoBean.inviter) && Intrinsics.EZpvd(this.inviterAddressMap, referralInfoBean.inviterAddressMap) && this.disconnected == referralInfoBean.disconnected && Intrinsics.EZpvd((Object) this.discountRate, (Object) referralInfoBean.discountRate) && Intrinsics.EZpvd((Object) this.signMsg, (Object) referralInfoBean.signMsg) && Intrinsics.EZpvd((Object) this.signature, (Object) referralInfoBean.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisconnected() {
        return this.disconnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountRate() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviter() {
        return this.inviter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getInviterAddressMap() {
        return this.inviterAddressMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignMsg() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.referralCode.hashCode();
        int iHashCode2 = this.inviter.hashCode();
        int iHashCode3 = this.inviterAddressMap.hashCode();
        int iHashCode4 = Boolean.hashCode(this.disconnected);
        String str = this.discountRate;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.signMsg;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.signature;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReferralInfoBean(referralCode=" + this.referralCode + ", inviter=" + this.inviter + ", inviterAddressMap=" + this.inviterAddressMap + ", disconnected=" + this.disconnected + ", discountRate=" + this.discountRate + ", signMsg=" + this.signMsg + ", signature=" + this.signature + ")";
    }

    public /* synthetic */ ReferralInfoBean(int i, String str, String str2, Map map, boolean z, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ReferralInfoBean$$serializer.INSTANCE.getDescriptor());
        }
        this.referralCode = str;
        this.inviter = str2;
        this.inviterAddressMap = map;
        this.disconnected = z;
        if ((i & 16) == 0) {
            this.discountRate = "";
        } else {
            this.discountRate = str3;
        }
        if ((i & 32) == 0) {
            this.signMsg = "";
        } else {
            this.signMsg = str4;
        }
        if ((i & 64) == 0) {
            this.signature = "";
        } else {
            this.signature = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ReferralInfoBean referralInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, referralInfoBean.referralCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, referralInfoBean.inviter);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], referralInfoBean.inviterAddressMap);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, referralInfoBean.disconnected);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) referralInfoBean.discountRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, referralInfoBean.discountRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) referralInfoBean.signMsg, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, referralInfoBean.signMsg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) referralInfoBean.signature, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, referralInfoBean.signature);
    }

    public ReferralInfoBean(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, boolean z, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.referralCode = str;
        this.inviter = str2;
        this.inviterAddressMap = map;
        this.disconnected = z;
        this.discountRate = str3;
        this.signMsg = str4;
        this.signature = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.util.Map)
  (r14v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean.<init>(java.lang.String, java.lang.String, java.util.Map, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ReferralInfoBean(String str, String str2, Map map, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, z, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
    }

    public final String toJson() {
        Json.Default r0 = Json.Default;
        r0.getSerializersModule();
        return r0.encodeToString(Companion.serializer(), this);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ReferralInfoBean> serializer() {
            return ReferralInfoBean$$serializer.INSTANCE;
        }

        public final ReferralInfoBean AEQbTJ(@NotNull String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                Json.Default r0 = Json.Default;
                r0.getSerializersModule();
                objM7377constructorimpl = Result.m7377constructorimpl((ReferralInfoBean) r0.decodeFromString(ReferralInfoBean.Companion.serializer(), str));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            return (ReferralInfoBean) objM7377constructorimpl;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, null};
    }
}
