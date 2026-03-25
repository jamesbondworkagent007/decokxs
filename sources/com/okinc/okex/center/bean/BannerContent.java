package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class BannerContent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String details;
    private final String title;
    private final Long withdrawOpenTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerContent() {
        this((String) null, (String) null, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BannerContent copy$default(BannerContent bannerContent, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerContent.title;
        }
        if ((i & 2) != 0) {
            str2 = bannerContent.details;
        }
        if ((i & 4) != 0) {
            l = bannerContent.withdrawOpenTime;
        }
        return bannerContent.copy(str, str2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.withdrawOpenTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerContent copy(String str, String str2, Long l) {
        return new BannerContent(str, str2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerContent)) {
            return false;
        }
        BannerContent bannerContent = (BannerContent) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) bannerContent.title) && Intrinsics.EZpvd((Object) this.details, (Object) bannerContent.details) && Intrinsics.EZpvd(this.withdrawOpenTime, bannerContent.withdrawOpenTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getWithdrawOpenTime() {
        return this.withdrawOpenTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.details;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.withdrawOpenTime;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerContent(title=" + this.title + ", details=" + this.details + ", withdrawOpenTime=" + this.withdrawOpenTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.BannerContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerContent> serializer() {
            return BannerContent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannerContent(int i, String str, String str2, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.details = null;
        } else {
            this.details = str2;
        }
        if ((i & 4) == 0) {
            this.withdrawOpenTime = null;
        } else {
            this.withdrawOpenTime = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(BannerContent bannerContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bannerContent.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bannerContent.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bannerContent.details != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bannerContent.details);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && bannerContent.withdrawOpenTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, bannerContent.withdrawOpenTime);
    }

    public BannerContent(String str, String str2, Long l) {
        this.title = str;
        this.details = str2;
        this.withdrawOpenTime = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r4v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:47) call: com.okinc.okex.center.bean.BannerContent.<init>(java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ BannerContent(String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l);
    }
}
