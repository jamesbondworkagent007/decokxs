package com.okinc.business.market.features.meme.preview.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterPreviewData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AccountVOData accountVO;
    private final CommunityVOData communityVO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterPreviewData() {
        this((AccountVOData) null, (CommunityVOData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TwitterPreviewData copy$default(TwitterPreviewData twitterPreviewData, AccountVOData accountVOData, CommunityVOData communityVOData, int i, Object obj) {
        if ((i & 1) != 0) {
            accountVOData = twitterPreviewData.accountVO;
        }
        if ((i & 2) != 0) {
            communityVOData = twitterPreviewData.communityVO;
        }
        return twitterPreviewData.copy(accountVOData, communityVOData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountVOData component1() {
        return this.accountVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityVOData component2() {
        return this.communityVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterPreviewData copy(AccountVOData accountVOData, CommunityVOData communityVOData) {
        return new TwitterPreviewData(accountVOData, communityVOData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterPreviewData)) {
            return false;
        }
        TwitterPreviewData twitterPreviewData = (TwitterPreviewData) obj;
        return Intrinsics.EZpvd(this.accountVO, twitterPreviewData.accountVO) && Intrinsics.EZpvd(this.communityVO, twitterPreviewData.communityVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountVOData getAccountVO() {
        return this.accountVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityVOData getCommunityVO() {
        return this.communityVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AccountVOData accountVOData = this.accountVO;
        int iHashCode = accountVOData == null ? 0 : accountVOData.hashCode();
        CommunityVOData communityVOData = this.communityVO;
        return (iHashCode * 31) + (communityVOData != null ? communityVOData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterPreviewData(accountVO=" + this.accountVO + ", communityVO=" + this.communityVO + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterPreviewData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwitterPreviewData> serializer() {
            return TwitterPreviewData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwitterPreviewData(int i, AccountVOData accountVOData, CommunityVOData communityVOData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountVO = null;
        } else {
            this.accountVO = accountVOData;
        }
        if ((i & 2) == 0) {
            this.communityVO = null;
        } else {
            this.communityVO = communityVOData;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TwitterPreviewData twitterPreviewData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || twitterPreviewData.accountVO != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AccountVOData$$serializer.INSTANCE, twitterPreviewData.accountVO);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && twitterPreviewData.communityVO == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CommunityVOData$$serializer.INSTANCE, twitterPreviewData.communityVO);
    }

    public TwitterPreviewData(AccountVOData accountVOData, CommunityVOData communityVOData) {
        this.accountVO = accountVOData;
        this.communityVO = communityVOData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.AccountVOData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.AccountVOData) : (r2v0 com.okinc.business.market.features.meme.preview.domain.model.AccountVOData))
  (wrap:com.okinc.business.market.features.meme.preview.domain.model.CommunityVOData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.preview.domain.model.CommunityVOData) : (r3v0 com.okinc.business.market.features.meme.preview.domain.model.CommunityVOData))
 A[MD:(com.okinc.business.market.features.meme.preview.domain.model.AccountVOData, com.okinc.business.market.features.meme.preview.domain.model.CommunityVOData):void (m)] (LINE:8) call: com.okinc.business.market.features.meme.preview.domain.model.TwitterPreviewData.<init>(com.okinc.business.market.features.meme.preview.domain.model.AccountVOData, com.okinc.business.market.features.meme.preview.domain.model.CommunityVOData):void type: THIS */
    public /* synthetic */ TwitterPreviewData(AccountVOData accountVOData, CommunityVOData communityVOData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountVOData, (i & 2) != 0 ? null : communityVOData);
    }
}
