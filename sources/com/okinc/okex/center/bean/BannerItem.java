package com.okinc.okex.center.bean;

import com.okinc.okex.center.bean.enums.BannerType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class BannerItem {
    public static final int $stable = 0;
    private final BannerContent content;
    private final BannerType type;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {BannerType.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerItem() {
        this((BannerType) null, (BannerContent) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BannerItem copy$default(BannerItem bannerItem, BannerType bannerType, BannerContent bannerContent, int i, Object obj) {
        if ((i & 1) != 0) {
            bannerType = bannerItem.type;
        }
        if ((i & 2) != 0) {
            bannerContent = bannerItem.content;
        }
        return bannerItem.copy(bannerType, bannerContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerContent component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerItem copy(BannerType bannerType, BannerContent bannerContent) {
        return new BannerItem(bannerType, bannerContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerItem)) {
            return false;
        }
        BannerItem bannerItem = (BannerItem) obj;
        return this.type == bannerItem.type && Intrinsics.EZpvd(this.content, bannerItem.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerContent getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BannerType bannerType = this.type;
        int iHashCode = bannerType == null ? 0 : bannerType.hashCode();
        BannerContent bannerContent = this.content;
        return (iHashCode * 31) + (bannerContent != null ? bannerContent.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerItem(type=" + this.type + ", content=" + this.content + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.BannerItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerItem> serializer() {
            return BannerItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannerItem(int i, BannerType bannerType, BannerContent bannerContent, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = bannerType;
        }
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = bannerContent;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(BannerItem bannerItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bannerItem.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], bannerItem.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && bannerItem.content == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BannerContent$$serializer.INSTANCE, bannerItem.content);
    }

    public BannerItem(BannerType bannerType, BannerContent bannerContent) {
        this.type = bannerType;
        this.content = bannerContent;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.enums.BannerType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.enums.BannerType) : (r2v0 com.okinc.okex.center.bean.enums.BannerType))
  (wrap:com.okinc.okex.center.bean.BannerContent:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.BannerContent) : (r3v0 com.okinc.okex.center.bean.BannerContent))
 A[MD:(com.okinc.okex.center.bean.enums.BannerType, com.okinc.okex.center.bean.BannerContent):void (m)] (LINE:40) call: com.okinc.okex.center.bean.BannerItem.<init>(com.okinc.okex.center.bean.enums.BannerType, com.okinc.okex.center.bean.BannerContent):void type: THIS */
    public /* synthetic */ BannerItem(BannerType bannerType, BannerContent bannerContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bannerType, (i & 2) != 0 ? null : bannerContent);
    }
}
