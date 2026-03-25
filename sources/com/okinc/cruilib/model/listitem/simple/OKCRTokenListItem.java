package com.okinc.cruilib.model.listitem.simple;

import androidx.camera.video.AudioStats;
import com.google.android.gms.wallet.WalletConstants;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.cruilib.model.listitem.OKCRListItem;
import com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public abstract class OKCRTokenListItem extends OKCRListItem {
    public static final int $stable = 0;
    private final String id;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mHL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKCRTokenListItem._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public String getId() {
        return this.id;
    }

    public abstract String getTokenId();

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) OKCRTokenListItem.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKCRTokenListItem> serializer() {
            return copydefault();
        }
    }

    public /* synthetic */ OKCRTokenListItem(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        this.id = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new PolymorphicSerializer(C56524yIo.AEQbTJ(OKCRTokenListItem.class), new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(OKCRTokenListItem oKCRTokenListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCRListItem.write$Self(oKCRTokenListItem, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, oKCRTokenListItem.getId());
    }

    public OKCRTokenListItem(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    @Serializable
    public static final class HorizontalCardItem extends OKCRTokenListItem {
        public String percentage;
        public String price;
        public final ItemRank rank;
        public final String tokenId;
        public final String tokenImageUrl;
        public final String tokenName;
        public OKCRTrend trend;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final KSerializer<Object>[] $childSerializers = {null, null, ItemRank.Companion.serializer(), null, null, null, null, OKCRTrend.Companion.serializer()};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HorizontalCardItem copy$default(HorizontalCardItem horizontalCardItem, String str, ItemRank itemRank, String str2, String str3, String str4, String str5, OKCRTrend oKCRTrend, int i, Object obj) {
            if ((i & 1) != 0) {
                str = horizontalCardItem.tokenId;
            }
            if ((i & 2) != 0) {
                itemRank = horizontalCardItem.rank;
            }
            ItemRank itemRank2 = itemRank;
            if ((i & 4) != 0) {
                str2 = horizontalCardItem.tokenImageUrl;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = horizontalCardItem.tokenName;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = horizontalCardItem.price;
            }
            String str8 = str4;
            if ((i & 32) != 0) {
                str5 = horizontalCardItem.percentage;
            }
            String str9 = str5;
            if ((i & 64) != 0) {
                oKCRTrend = horizontalCardItem.trend;
            }
            return horizontalCardItem.OLrzqt(str, itemRank2, str6, str7, str8, str9, oKCRTrend);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HorizontalCardItem OLrzqt(@NotNull String str, @NotNull ItemRank itemRank, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull OKCRTrend oKCRTrend) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(itemRank, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            return new HorizontalCardItem(str, itemRank, str2, str3, str4, str5, oKCRTrend);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalCardItem)) {
                return false;
            }
            HorizontalCardItem horizontalCardItem = (HorizontalCardItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) horizontalCardItem.tokenId) && this.rank == horizontalCardItem.rank && Intrinsics.EZpvd((Object) this.tokenImageUrl, (Object) horizontalCardItem.tokenImageUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) horizontalCardItem.tokenName) && Intrinsics.EZpvd((Object) this.price, (Object) horizontalCardItem.price) && Intrinsics.EZpvd((Object) this.percentage, (Object) horizontalCardItem.percentage) && this.trend == horizontalCardItem.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.tokenId.hashCode() * 31) + this.rank.hashCode()) * 31) + this.tokenImageUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.price.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.trend.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HorizontalCardItem(tokenId=" + this.tokenId + ", rank=" + this.rank + ", tokenImageUrl=" + this.tokenImageUrl + ", tokenName=" + this.tokenName + ", price=" + this.price + ", percentage=" + this.percentage + ", trend=" + this.trend + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.HorizontalCardItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<HorizontalCardItem> serializer() {
                return OKCRTokenListItem$HorizontalCardItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HorizontalCardItem(int i, String str, String str2, ItemRank itemRank, String str3, String str4, String str5, String str6, OKCRTrend oKCRTrend, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (255 != (i & 255)) {
                PluginExceptionsKt.throwMissingFieldException(i, 255, OKCRTokenListItem$HorizontalCardItem$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenId = str2;
            this.rank = itemRank;
            this.tokenImageUrl = str3;
            this.tokenName = str4;
            this.price = str5;
            this.percentage = str6;
            this.trend = oKCRTrend;
        }

        public static final /* synthetic */ void EZpvd(HorizontalCardItem horizontalCardItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) horizontalCardItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, horizontalCardItem.getTokenId());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], horizontalCardItem.rank);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, horizontalCardItem.tokenImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, horizontalCardItem.tokenName);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, horizontalCardItem.price);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, horizontalCardItem.percentage);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], horizontalCardItem.trend);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HorizontalCardItem(@NotNull String str, @NotNull ItemRank itemRank, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull OKCRTrend oKCRTrend) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(itemRank, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            this.tokenId = str;
            this.rank = itemRank;
            this.tokenImageUrl = str2;
            this.tokenName = str3;
            this.price = str4;
            this.percentage = str5;
            this.trend = oKCRTrend;
        }
    }

    @Serializable
    public static final class PillItem extends OKCRTokenListItem {
        public String percentage;
        public String price;
        public final String tokenId;
        public final String tokenName;
        public OKCRTrend trend;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, OKCRTrend.Companion.serializer()};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PillItem copy$default(PillItem pillItem, String str, String str2, String str3, String str4, OKCRTrend oKCRTrend, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pillItem.tokenId;
            }
            if ((i & 2) != 0) {
                str2 = pillItem.tokenName;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = pillItem.price;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = pillItem.percentage;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                oKCRTrend = pillItem.trend;
            }
            return pillItem.OLrzqt(str, str5, str6, str7, oKCRTrend);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PillItem OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull OKCRTrend oKCRTrend) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            return new PillItem(str, str2, str3, str4, oKCRTrend);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PillItem)) {
                return false;
            }
            PillItem pillItem = (PillItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) pillItem.tokenId) && Intrinsics.EZpvd((Object) this.tokenName, (Object) pillItem.tokenName) && Intrinsics.EZpvd((Object) this.price, (Object) pillItem.price) && Intrinsics.EZpvd((Object) this.percentage, (Object) pillItem.percentage) && this.trend == pillItem.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.tokenId.hashCode() * 31) + this.tokenName.hashCode()) * 31) + this.price.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.trend.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PillItem(tokenId=" + this.tokenId + ", tokenName=" + this.tokenName + ", price=" + this.price + ", percentage=" + this.percentage + ", trend=" + this.trend + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.PillItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PillItem> serializer() {
                return OKCRTokenListItem$PillItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PillItem(int i, String str, String str2, String str3, String str4, String str5, OKCRTrend oKCRTrend, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (63 != (i & 63)) {
                PluginExceptionsKt.throwMissingFieldException(i, 63, OKCRTokenListItem$PillItem$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenId = str2;
            this.tokenName = str3;
            this.price = str4;
            this.percentage = str5;
            this.trend = oKCRTrend;
        }

        public static final /* synthetic */ void KWHzl(PillItem pillItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) pillItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, pillItem.getTokenId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, pillItem.tokenName);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, pillItem.price);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, pillItem.percentage);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], pillItem.trend);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PillItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull OKCRTrend oKCRTrend) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            this.tokenId = str;
            this.tokenName = str2;
            this.price = str3;
            this.percentage = str4;
            this.trend = oKCRTrend;
        }
    }

    @Serializable
    public static final class VerticalCardItem extends OKCRTokenListItem {
        public boolean isStablecoin;
        public String percentage;
        public String price;
        public final String tokenId;
        public final String tokenImageUrl;
        public final String tokenName;
        public OKCRTrend trend;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, OKCRTrend.Companion.serializer(), null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VerticalCardItem copy$default(VerticalCardItem verticalCardItem, String str, String str2, String str3, String str4, String str5, OKCRTrend oKCRTrend, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verticalCardItem.tokenId;
            }
            if ((i & 2) != 0) {
                str2 = verticalCardItem.tokenImageUrl;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = verticalCardItem.tokenName;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = verticalCardItem.price;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = verticalCardItem.percentage;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                oKCRTrend = verticalCardItem.trend;
            }
            OKCRTrend oKCRTrend2 = oKCRTrend;
            if ((i & 64) != 0) {
                z = verticalCardItem.isStablecoin;
            }
            return verticalCardItem.AEQbTJ(str, str6, str7, str8, str9, oKCRTrend2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerticalCardItem AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull OKCRTrend oKCRTrend, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            return new VerticalCardItem(str, str2, str3, str4, str5, oKCRTrend, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalCardItem)) {
                return false;
            }
            VerticalCardItem verticalCardItem = (VerticalCardItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) verticalCardItem.tokenId) && Intrinsics.EZpvd((Object) this.tokenImageUrl, (Object) verticalCardItem.tokenImageUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) verticalCardItem.tokenName) && Intrinsics.EZpvd((Object) this.price, (Object) verticalCardItem.price) && Intrinsics.EZpvd((Object) this.percentage, (Object) verticalCardItem.percentage) && this.trend == verticalCardItem.trend && this.isStablecoin == verticalCardItem.isStablecoin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.tokenId.hashCode() * 31) + this.tokenImageUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.price.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.trend.hashCode()) * 31) + Boolean.hashCode(this.isStablecoin);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VerticalCardItem(tokenId=" + this.tokenId + ", tokenImageUrl=" + this.tokenImageUrl + ", tokenName=" + this.tokenName + ", price=" + this.price + ", percentage=" + this.percentage + ", trend=" + this.trend + ", isStablecoin=" + this.isStablecoin + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.VerticalCardItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<VerticalCardItem> serializer() {
                return OKCRTokenListItem$VerticalCardItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ VerticalCardItem(int i, String str, String str2, String str3, String str4, String str5, String str6, OKCRTrend oKCRTrend, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (255 != (i & 255)) {
                PluginExceptionsKt.throwMissingFieldException(i, 255, OKCRTokenListItem$VerticalCardItem$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenId = str2;
            this.tokenImageUrl = str3;
            this.tokenName = str4;
            this.price = str5;
            this.percentage = str6;
            this.trend = oKCRTrend;
            this.isStablecoin = z;
        }

        public static final /* synthetic */ void AEQbTJ(VerticalCardItem verticalCardItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) verticalCardItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, verticalCardItem.getTokenId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, verticalCardItem.tokenImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, verticalCardItem.tokenName);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, verticalCardItem.price);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, verticalCardItem.percentage);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], verticalCardItem.trend);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, verticalCardItem.isStablecoin);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerticalCardItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull OKCRTrend oKCRTrend, boolean z) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            this.tokenId = str;
            this.tokenImageUrl = str2;
            this.tokenName = str3;
            this.price = str4;
            this.percentage = str5;
            this.trend = oKCRTrend;
            this.isStablecoin = z;
        }
    }

    @Serializable
    public static final class SimplePillItem extends OKCRTokenListItem {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final String tokenId;
        public final Integer tokenImage;
        public final String tokenImageUrl;
        public final String tokenName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SimplePillItem copy$default(SimplePillItem simplePillItem, String str, String str2, String str3, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = simplePillItem.tokenId;
            }
            if ((i & 2) != 0) {
                str2 = simplePillItem.tokenName;
            }
            if ((i & 4) != 0) {
                str3 = simplePillItem.tokenImageUrl;
            }
            if ((i & 8) != 0) {
                num = simplePillItem.tokenImage;
            }
            return simplePillItem.KWHzl(str, str2, str3, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SimplePillItem KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new SimplePillItem(str, str2, str3, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimplePillItem)) {
                return false;
            }
            SimplePillItem simplePillItem = (SimplePillItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) simplePillItem.tokenId) && Intrinsics.EZpvd((Object) this.tokenName, (Object) simplePillItem.tokenName) && Intrinsics.EZpvd((Object) this.tokenImageUrl, (Object) simplePillItem.tokenImageUrl) && Intrinsics.EZpvd(this.tokenImage, simplePillItem.tokenImage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.tokenId.hashCode();
            int iHashCode2 = this.tokenName.hashCode();
            int iHashCode3 = this.tokenImageUrl.hashCode();
            Integer num = this.tokenImage;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SimplePillItem(tokenId=" + this.tokenId + ", tokenName=" + this.tokenName + ", tokenImageUrl=" + this.tokenImageUrl + ", tokenImage=" + this.tokenImage + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.SimplePillItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SimplePillItem> serializer() {
                return OKCRTokenListItem$SimplePillItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SimplePillItem(int i, String str, String str2, String str3, String str4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, OKCRTokenListItem$SimplePillItem$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenId = str2;
            this.tokenName = str3;
            if ((i & 8) == 0) {
                this.tokenImageUrl = "";
            } else {
                this.tokenImageUrl = str4;
            }
            if ((i & 16) == 0) {
                this.tokenImage = null;
            } else {
                this.tokenImage = num;
            }
        }

        public static final /* synthetic */ void OLrzqt(SimplePillItem simplePillItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) simplePillItem, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, simplePillItem.getTokenId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, simplePillItem.tokenName);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) simplePillItem.tokenImageUrl, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, simplePillItem.tokenImageUrl);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && simplePillItem.tokenImage == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, simplePillItem.tokenImage);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimplePillItem(@NotNull String str, @NotNull String str2, @NotNull String str3, Integer num) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.tokenId = str;
            this.tokenName = str2;
            this.tokenImageUrl = str3;
            this.tokenImage = num;
        }
    }

    @Serializable
    public static final class CategoryCardItem extends OKCRTokenListItem {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final String categoryDescription;
        public final int categoryIconResId;
        public final String categoryName;
        public final String tokenId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CategoryCardItem copy$default(CategoryCardItem categoryCardItem, String str, String str2, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = categoryCardItem.tokenId;
            }
            if ((i2 & 2) != 0) {
                str2 = categoryCardItem.categoryName;
            }
            if ((i2 & 4) != 0) {
                i = categoryCardItem.categoryIconResId;
            }
            if ((i2 & 8) != 0) {
                str3 = categoryCardItem.categoryDescription;
            }
            return categoryCardItem.EZpvd(str, str2, i, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CategoryCardItem EZpvd(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new CategoryCardItem(str, str2, i, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryCardItem)) {
                return false;
            }
            CategoryCardItem categoryCardItem = (CategoryCardItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) categoryCardItem.tokenId) && Intrinsics.EZpvd((Object) this.categoryName, (Object) categoryCardItem.categoryName) && this.categoryIconResId == categoryCardItem.categoryIconResId && Intrinsics.EZpvd((Object) this.categoryDescription, (Object) categoryCardItem.categoryDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.tokenId.hashCode() * 31) + this.categoryName.hashCode()) * 31) + Integer.hashCode(this.categoryIconResId)) * 31) + this.categoryDescription.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CategoryCardItem(tokenId=" + this.tokenId + ", categoryName=" + this.categoryName + ", categoryIconResId=" + this.categoryIconResId + ", categoryDescription=" + this.categoryDescription + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.CategoryCardItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CategoryCardItem> serializer() {
                return OKCRTokenListItem$CategoryCardItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CategoryCardItem(int i, String str, String str2, String str3, int i2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (31 != (i & 31)) {
                PluginExceptionsKt.throwMissingFieldException(i, 31, OKCRTokenListItem$CategoryCardItem$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenId = str2;
            this.categoryName = str3;
            this.categoryIconResId = i2;
            this.categoryDescription = str4;
        }

        public static final /* synthetic */ void KWHzl(CategoryCardItem categoryCardItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) categoryCardItem, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, categoryCardItem.getTokenId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, categoryCardItem.categoryName);
            compositeEncoder.encodeIntElement(serialDescriptor, 3, categoryCardItem.categoryIconResId);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, categoryCardItem.categoryDescription);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CategoryCardItem(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.tokenId = str;
            this.categoryName = str2;
            this.categoryIconResId = i;
            this.categoryDescription = str3;
        }
    }

    @Serializable
    public static final class SimpleCategoryCardItem extends OKCRTokenListItem {
        public final String categoryDarkIcon;
        public final String categoryDescription;
        public final String categoryId;
        public final String categoryLightIcon;
        public final String categoryPriceChange;
        public final String categoryShortDescription;
        public final String categoryTitle;
        public final String tokenId;
        public final List<TokenListItem> tokenList;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(OKCRTokenListItem$TokenListItem$$serializer.INSTANCE), null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SimpleCategoryCardItem EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<TokenListItem> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new SimpleCategoryCardItem(str, str2, str3, str4, str5, str6, str7, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimpleCategoryCardItem)) {
                return false;
            }
            SimpleCategoryCardItem simpleCategoryCardItem = (SimpleCategoryCardItem) obj;
            return Intrinsics.EZpvd((Object) this.categoryId, (Object) simpleCategoryCardItem.categoryId) && Intrinsics.EZpvd((Object) this.categoryTitle, (Object) simpleCategoryCardItem.categoryTitle) && Intrinsics.EZpvd((Object) this.categoryDescription, (Object) simpleCategoryCardItem.categoryDescription) && Intrinsics.EZpvd((Object) this.categoryShortDescription, (Object) simpleCategoryCardItem.categoryShortDescription) && Intrinsics.EZpvd((Object) this.categoryDarkIcon, (Object) simpleCategoryCardItem.categoryDarkIcon) && Intrinsics.EZpvd((Object) this.categoryLightIcon, (Object) simpleCategoryCardItem.categoryLightIcon) && Intrinsics.EZpvd((Object) this.categoryPriceChange, (Object) simpleCategoryCardItem.categoryPriceChange) && Intrinsics.EZpvd(this.tokenList, simpleCategoryCardItem.tokenList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.categoryId.hashCode() * 31) + this.categoryTitle.hashCode()) * 31) + this.categoryDescription.hashCode()) * 31) + this.categoryShortDescription.hashCode()) * 31) + this.categoryDarkIcon.hashCode()) * 31) + this.categoryLightIcon.hashCode()) * 31) + this.categoryPriceChange.hashCode()) * 31) + this.tokenList.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SimpleCategoryCardItem(categoryId=" + this.categoryId + ", categoryTitle=" + this.categoryTitle + ", categoryDescription=" + this.categoryDescription + ", categoryShortDescription=" + this.categoryShortDescription + ", categoryDarkIcon=" + this.categoryDarkIcon + ", categoryLightIcon=" + this.categoryLightIcon + ", categoryPriceChange=" + this.categoryPriceChange + ", tokenList=" + this.tokenList + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.SimpleCategoryCardItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SimpleCategoryCardItem> serializer() {
                return OKCRTokenListItem$SimpleCategoryCardItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SimpleCategoryCardItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (415 != (i & WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE)) {
                PluginExceptionsKt.throwMissingFieldException(i, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, OKCRTokenListItem$SimpleCategoryCardItem$$serializer.INSTANCE.getDescriptor());
            }
            this.categoryId = str2;
            this.categoryTitle = str3;
            this.categoryDescription = str4;
            this.categoryShortDescription = str5;
            if ((i & 32) == 0) {
                this.categoryDarkIcon = "";
            } else {
                this.categoryDarkIcon = str6;
            }
            if ((i & 64) == 0) {
                this.categoryLightIcon = "";
            } else {
                this.categoryLightIcon = str7;
            }
            this.categoryPriceChange = str8;
            this.tokenList = list;
            if ((i & 512) == 0) {
                this.tokenId = str2;
            } else {
                this.tokenId = str9;
            }
        }

        public static final /* synthetic */ void copydefault(SimpleCategoryCardItem simpleCategoryCardItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) simpleCategoryCardItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, simpleCategoryCardItem.categoryId);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, simpleCategoryCardItem.categoryTitle);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, simpleCategoryCardItem.categoryDescription);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, simpleCategoryCardItem.categoryShortDescription);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) simpleCategoryCardItem.categoryDarkIcon, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 5, simpleCategoryCardItem.categoryDarkIcon);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) simpleCategoryCardItem.categoryLightIcon, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 6, simpleCategoryCardItem.categoryLightIcon);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 7, simpleCategoryCardItem.categoryPriceChange);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], simpleCategoryCardItem.tokenList);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) simpleCategoryCardItem.getTokenId(), (Object) simpleCategoryCardItem.categoryId)) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 9, simpleCategoryCardItem.getTokenId());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleCategoryCardItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<TokenListItem> list) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.categoryId = str;
            this.categoryTitle = str2;
            this.categoryDescription = str3;
            this.categoryShortDescription = str4;
            this.categoryDarkIcon = str5;
            this.categoryLightIcon = str6;
            this.categoryPriceChange = str7;
            this.tokenList = list;
            this.tokenId = str;
        }
    }

    @Serializable
    public static final class SimpleSearchExplorePillItem extends OKCRTokenListItem {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final String categoryContentType;
        public final int categoryIcon;
        public final int categoryIconTint;
        public final String categoryName;
        public final String tokenId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SimpleSearchExplorePillItem copy$default(SimpleSearchExplorePillItem simpleSearchExplorePillItem, String str, String str2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = simpleSearchExplorePillItem.categoryContentType;
            }
            if ((i3 & 2) != 0) {
                str2 = simpleSearchExplorePillItem.categoryName;
            }
            if ((i3 & 4) != 0) {
                i = simpleSearchExplorePillItem.categoryIcon;
            }
            if ((i3 & 8) != 0) {
                i2 = simpleSearchExplorePillItem.categoryIconTint;
            }
            return simpleSearchExplorePillItem.AEQbTJ(str, str2, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SimpleSearchExplorePillItem AEQbTJ(@NotNull String str, @NotNull String str2, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new SimpleSearchExplorePillItem(str, str2, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimpleSearchExplorePillItem)) {
                return false;
            }
            SimpleSearchExplorePillItem simpleSearchExplorePillItem = (SimpleSearchExplorePillItem) obj;
            return Intrinsics.EZpvd((Object) this.categoryContentType, (Object) simpleSearchExplorePillItem.categoryContentType) && Intrinsics.EZpvd((Object) this.categoryName, (Object) simpleSearchExplorePillItem.categoryName) && this.categoryIcon == simpleSearchExplorePillItem.categoryIcon && this.categoryIconTint == simpleSearchExplorePillItem.categoryIconTint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.categoryContentType.hashCode() * 31) + this.categoryName.hashCode()) * 31) + Integer.hashCode(this.categoryIcon)) * 31) + Integer.hashCode(this.categoryIconTint);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SimpleSearchExplorePillItem(categoryContentType=" + this.categoryContentType + ", categoryName=" + this.categoryName + ", categoryIcon=" + this.categoryIcon + ", categoryIconTint=" + this.categoryIconTint + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.SimpleSearchExplorePillItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SimpleSearchExplorePillItem> serializer() {
                return OKCRTokenListItem$SimpleSearchExplorePillItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SimpleSearchExplorePillItem(int i, String str, String str2, String str3, int i2, int i3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (31 != (i & 31)) {
                PluginExceptionsKt.throwMissingFieldException(i, 31, OKCRTokenListItem$SimpleSearchExplorePillItem$$serializer.INSTANCE.getDescriptor());
            }
            this.categoryContentType = str2;
            this.categoryName = str3;
            this.categoryIcon = i2;
            this.categoryIconTint = i3;
            if ((i & 32) == 0) {
                this.tokenId = str2;
            } else {
                this.tokenId = str4;
            }
        }

        public static final /* synthetic */ void KWHzl(SimpleSearchExplorePillItem simpleSearchExplorePillItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) simpleSearchExplorePillItem, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, simpleSearchExplorePillItem.categoryContentType);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, simpleSearchExplorePillItem.categoryName);
            compositeEncoder.encodeIntElement(serialDescriptor, 3, simpleSearchExplorePillItem.categoryIcon);
            compositeEncoder.encodeIntElement(serialDescriptor, 4, simpleSearchExplorePillItem.categoryIconTint);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) simpleSearchExplorePillItem.getTokenId(), (Object) simpleSearchExplorePillItem.categoryContentType)) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 5, simpleSearchExplorePillItem.getTokenId());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleSearchExplorePillItem(@NotNull String str, @NotNull String str2, int i, int i2) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.categoryContentType = str;
            this.categoryName = str2;
            this.categoryIcon = i;
            this.categoryIconTint = i2;
            this.tokenId = str;
        }
    }

    @Serializable
    public static final class TokenListItem extends OKCRTokenListItem {
        private boolean isBuidl;
        private boolean isStablecoin;
        private boolean isWatch;
        private String percentage;
        private String price;
        private String priceAsDouble;
        private double primarySimilarity;
        private double secondarySimilarity;
        private final String tokenFullName;
        private final String tokenId;
        private final String tokenImageUrl;
        private final String tokenName;
        private OKCRTrend trend;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, OKCRTrend.Companion.serializer(), null, null, null, null, null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double component10() {
            return this.primarySimilarity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double component11() {
            return this.secondarySimilarity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component12() {
            return this.isStablecoin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component13() {
            return this.isBuidl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenFullName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.priceAsDouble;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.percentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCRTrend component8() {
            return this.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull OKCRTrend oKCRTrend, boolean z, double d, double d2, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            return new TokenListItem(str, str2, str3, str4, str5, str6, str7, oKCRTrend, z, d, d2, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenListItem)) {
                return false;
            }
            TokenListItem tokenListItem = (TokenListItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) tokenListItem.tokenId) && Intrinsics.EZpvd((Object) this.tokenImageUrl, (Object) tokenListItem.tokenImageUrl) && Intrinsics.EZpvd((Object) this.tokenFullName, (Object) tokenListItem.tokenFullName) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenListItem.tokenName) && Intrinsics.EZpvd((Object) this.priceAsDouble, (Object) tokenListItem.priceAsDouble) && Intrinsics.EZpvd((Object) this.price, (Object) tokenListItem.price) && Intrinsics.EZpvd((Object) this.percentage, (Object) tokenListItem.percentage) && this.trend == tokenListItem.trend && this.isWatch == tokenListItem.isWatch && Double.compare(this.primarySimilarity, tokenListItem.primarySimilarity) == 0 && Double.compare(this.secondarySimilarity, tokenListItem.secondarySimilarity) == 0 && this.isStablecoin == tokenListItem.isStablecoin && this.isBuidl == tokenListItem.isBuidl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPercentage() {
            return this.percentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPrice() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriceAsDouble() {
            return this.priceAsDouble;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getPrimarySimilarity() {
            return this.primarySimilarity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getSecondarySimilarity() {
            return this.secondarySimilarity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenFullName() {
            return this.tokenFullName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenImageUrl() {
            return this.tokenImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenName() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCRTrend getTrend() {
            return this.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((this.tokenId.hashCode() * 31) + this.tokenImageUrl.hashCode()) * 31) + this.tokenFullName.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.priceAsDouble.hashCode()) * 31) + this.price.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.trend.hashCode()) * 31) + Boolean.hashCode(this.isWatch)) * 31) + Double.hashCode(this.primarySimilarity)) * 31) + Double.hashCode(this.secondarySimilarity)) * 31) + Boolean.hashCode(this.isStablecoin)) * 31) + Boolean.hashCode(this.isBuidl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isBuidl() {
            return this.isBuidl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isStablecoin() {
            return this.isStablecoin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isWatch() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBuidl(boolean z) {
            this.isBuidl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPercentage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.percentage = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPrice(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.price = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPriceAsDouble(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.priceAsDouble = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPrimarySimilarity(double d) {
            this.primarySimilarity = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSecondarySimilarity(double d) {
            this.secondarySimilarity = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setStablecoin(boolean z) {
            this.isStablecoin = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTrend(@NotNull OKCRTrend oKCRTrend) {
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            this.trend = oKCRTrend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setWatch(boolean z) {
            this.isWatch = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenListItem(tokenId=" + this.tokenId + ", tokenImageUrl=" + this.tokenImageUrl + ", tokenFullName=" + this.tokenFullName + ", tokenName=" + this.tokenName + ", priceAsDouble=" + this.priceAsDouble + ", price=" + this.price + ", percentage=" + this.percentage + ", trend=" + this.trend + ", isWatch=" + this.isWatch + ", primarySimilarity=" + this.primarySimilarity + ", secondarySimilarity=" + this.secondarySimilarity + ", isStablecoin=" + this.isStablecoin + ", isBuidl=" + this.isBuidl + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.TokenListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TokenListItem> serializer() {
                return OKCRTokenListItem$TokenListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TokenListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, OKCRTrend oKCRTrend, boolean z, double d, double d2, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (4607 != (i & 4607)) {
                PluginExceptionsKt.throwMissingFieldException(i, 4607, OKCRTokenListItem$TokenListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenId = str2;
            this.tokenImageUrl = str3;
            this.tokenFullName = str4;
            this.tokenName = str5;
            this.priceAsDouble = str6;
            this.price = str7;
            this.percentage = str8;
            this.trend = oKCRTrend;
            if ((i & 512) == 0) {
                this.isWatch = false;
            } else {
                this.isWatch = z;
            }
            int i2 = i & 1024;
            double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
            if (i2 == 0) {
                this.primarySimilarity = AudioStats.AUDIO_AMPLITUDE_NONE;
            } else {
                this.primarySimilarity = d;
            }
            this.secondarySimilarity = (i & 2048) != 0 ? d2 : d3;
            this.isStablecoin = z2;
            if ((i & 8192) == 0) {
                this.isBuidl = false;
            } else {
                this.isBuidl = z3;
            }
        }

        public static final /* synthetic */ void write$Self$OKCRUILib_cr_uilib(TokenListItem tokenListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) tokenListItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenListItem.getTokenId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenListItem.tokenImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenListItem.tokenFullName);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenListItem.tokenName);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenListItem.priceAsDouble);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenListItem.price);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tokenListItem.percentage);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], tokenListItem.trend);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tokenListItem.isWatch) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 9, tokenListItem.isWatch);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || Double.compare(tokenListItem.primarySimilarity, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
                compositeEncoder.encodeDoubleElement(serialDescriptor, 10, tokenListItem.primarySimilarity);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || Double.compare(tokenListItem.secondarySimilarity, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
                compositeEncoder.encodeDoubleElement(serialDescriptor, 11, tokenListItem.secondarySimilarity);
            }
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, tokenListItem.isStablecoin);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || tokenListItem.isBuidl) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 13, tokenListItem.isBuidl);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 com.okinc.cruilib.view.listitem.share.OKCRTrend)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:double:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r29v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0015: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r31v0 double))
  (r33v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean, double, double, boolean, boolean):void (m)] (LINE:90) call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.TokenListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean, double, double, boolean, boolean):void type: THIS */
        public /* synthetic */ TokenListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, OKCRTrend oKCRTrend, boolean z, double d, double d2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, oKCRTrend, (i & 256) != 0 ? false : z, (i & 512) != 0 ? 0.0d : d, (i & 1024) != 0 ? 0.0d : d2, z2, (i & 4096) != 0 ? false : z3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull OKCRTrend oKCRTrend, boolean z, double d, double d2, boolean z2, boolean z3) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            this.tokenId = str;
            this.tokenImageUrl = str2;
            this.tokenFullName = str3;
            this.tokenName = str4;
            this.priceAsDouble = str5;
            this.price = str6;
            this.percentage = str7;
            this.trend = oKCRTrend;
            this.isWatch = z;
            this.primarySimilarity = d;
            this.secondarySimilarity = d2;
            this.isStablecoin = z2;
            this.isBuidl = z3;
        }
    }

    @Serializable
    public static final class DexTokenListItem extends OKCRTokenListItem {
        public final String chainId;
        public String chainImageUrl;
        public String chainName;
        public String changePercent;
        public String changePercentToDisplay;
        public boolean communityRecognized;
        public boolean isWatch;
        public String liquidity;
        public String liquidityToDisplay;
        public String marketCap;
        public String marketCapToDisplay;
        public String price;
        public String priceToDisplay;
        public double primarySimilarity;
        public String riskLevel;
        public double secondarySimilarity;
        public boolean showCommunityRecognizedIcon;
        public final String tokenContractAddress;
        public String tokenFullName;
        public final String tokenId;
        public String tokenImageUrl;
        public final String tokenName;
        public String tokenNameToDisplay;
        public OKCRTrend trend;
        public String turnOver;
        public String turnOverToDisplay;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, OKCRTrend.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexTokenListItem KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull OKCRTrend oKCRTrend, boolean z, double d, double d2, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z2, boolean z3, @NotNull String str20) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            Intrinsics.checkNotNullParameter(str13, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            Intrinsics.checkNotNullParameter(str14, "");
            Intrinsics.checkNotNullParameter(str15, "");
            Intrinsics.checkNotNullParameter(str16, "");
            Intrinsics.checkNotNullParameter(str17, "");
            Intrinsics.checkNotNullParameter(str18, "");
            Intrinsics.checkNotNullParameter(str19, "");
            Intrinsics.checkNotNullParameter(str20, "");
            return new DexTokenListItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, oKCRTrend, z, d, d2, str14, str15, str16, str17, str18, str19, z2, z3, str20);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DexTokenListItem)) {
                return false;
            }
            DexTokenListItem dexTokenListItem = (DexTokenListItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) dexTokenListItem.tokenId) && Intrinsics.EZpvd((Object) this.chainId, (Object) dexTokenListItem.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) dexTokenListItem.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenImageUrl, (Object) dexTokenListItem.tokenImageUrl) && Intrinsics.EZpvd((Object) this.chainImageUrl, (Object) dexTokenListItem.chainImageUrl) && Intrinsics.EZpvd((Object) this.tokenFullName, (Object) dexTokenListItem.tokenFullName) && Intrinsics.EZpvd((Object) this.tokenName, (Object) dexTokenListItem.tokenName) && Intrinsics.EZpvd((Object) this.tokenNameToDisplay, (Object) dexTokenListItem.tokenNameToDisplay) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexTokenListItem.chainName) && Intrinsics.EZpvd((Object) this.price, (Object) dexTokenListItem.price) && Intrinsics.EZpvd((Object) this.priceToDisplay, (Object) dexTokenListItem.priceToDisplay) && Intrinsics.EZpvd((Object) this.changePercent, (Object) dexTokenListItem.changePercent) && Intrinsics.EZpvd((Object) this.changePercentToDisplay, (Object) dexTokenListItem.changePercentToDisplay) && this.trend == dexTokenListItem.trend && this.isWatch == dexTokenListItem.isWatch && Double.compare(this.primarySimilarity, dexTokenListItem.primarySimilarity) == 0 && Double.compare(this.secondarySimilarity, dexTokenListItem.secondarySimilarity) == 0 && Intrinsics.EZpvd((Object) this.liquidity, (Object) dexTokenListItem.liquidity) && Intrinsics.EZpvd((Object) this.liquidityToDisplay, (Object) dexTokenListItem.liquidityToDisplay) && Intrinsics.EZpvd((Object) this.turnOver, (Object) dexTokenListItem.turnOver) && Intrinsics.EZpvd((Object) this.turnOverToDisplay, (Object) dexTokenListItem.turnOverToDisplay) && Intrinsics.EZpvd((Object) this.marketCap, (Object) dexTokenListItem.marketCap) && Intrinsics.EZpvd((Object) this.marketCapToDisplay, (Object) dexTokenListItem.marketCapToDisplay) && this.communityRecognized == dexTokenListItem.communityRecognized && this.showCommunityRecognizedIcon == dexTokenListItem.showCommunityRecognizedIcon && Intrinsics.EZpvd((Object) this.riskLevel, (Object) dexTokenListItem.riskLevel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((this.tokenId.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenImageUrl.hashCode()) * 31) + this.chainImageUrl.hashCode()) * 31) + this.tokenFullName.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenNameToDisplay.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceToDisplay.hashCode()) * 31) + this.changePercent.hashCode()) * 31) + this.changePercentToDisplay.hashCode()) * 31) + this.trend.hashCode()) * 31) + Boolean.hashCode(this.isWatch)) * 31) + Double.hashCode(this.primarySimilarity)) * 31) + Double.hashCode(this.secondarySimilarity)) * 31) + this.liquidity.hashCode()) * 31) + this.liquidityToDisplay.hashCode()) * 31) + this.turnOver.hashCode()) * 31) + this.turnOverToDisplay.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.marketCapToDisplay.hashCode()) * 31) + Boolean.hashCode(this.communityRecognized)) * 31) + Boolean.hashCode(this.showCommunityRecognizedIcon)) * 31) + this.riskLevel.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DexTokenListItem(tokenId=" + this.tokenId + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenImageUrl=" + this.tokenImageUrl + ", chainImageUrl=" + this.chainImageUrl + ", tokenFullName=" + this.tokenFullName + ", tokenName=" + this.tokenName + ", tokenNameToDisplay=" + this.tokenNameToDisplay + ", chainName=" + this.chainName + ", price=" + this.price + ", priceToDisplay=" + this.priceToDisplay + ", changePercent=" + this.changePercent + ", changePercentToDisplay=" + this.changePercentToDisplay + ", trend=" + this.trend + ", isWatch=" + this.isWatch + ", primarySimilarity=" + this.primarySimilarity + ", secondarySimilarity=" + this.secondarySimilarity + ", liquidity=" + this.liquidity + ", liquidityToDisplay=" + this.liquidityToDisplay + ", turnOver=" + this.turnOver + ", turnOverToDisplay=" + this.turnOverToDisplay + ", marketCap=" + this.marketCap + ", marketCapToDisplay=" + this.marketCapToDisplay + ", communityRecognized=" + this.communityRecognized + ", showCommunityRecognizedIcon=" + this.showCommunityRecognizedIcon + ", riskLevel=" + this.riskLevel + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.DexTokenListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<DexTokenListItem> serializer() {
                return OKCRTokenListItem$DexTokenListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DexTokenListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, OKCRTrend oKCRTrend, boolean z, double d, double d2, String str15, String str16, String str17, String str18, String str19, String str20, boolean z2, boolean z3, String str21, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (100433407 != (i & 100433407)) {
                PluginExceptionsKt.throwMissingFieldException(i, 100433407, OKCRTokenListItem$DexTokenListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenId = str2;
            this.chainId = str3;
            this.tokenContractAddress = str4;
            this.tokenImageUrl = str5;
            this.chainImageUrl = str6;
            this.tokenFullName = str7;
            this.tokenName = str8;
            this.tokenNameToDisplay = str9;
            this.chainName = (i & 512) == 0 ? "" : str10;
            this.price = str11;
            this.priceToDisplay = str12;
            this.changePercent = str13;
            this.changePercentToDisplay = str14;
            this.trend = oKCRTrend;
            this.isWatch = (32768 & i) == 0 ? false : z;
            if ((65536 & i) == 0) {
                this.primarySimilarity = AudioStats.AUDIO_AMPLITUDE_NONE;
            } else {
                this.primarySimilarity = d;
            }
            if ((131072 & i) == 0) {
                this.secondarySimilarity = AudioStats.AUDIO_AMPLITUDE_NONE;
            } else {
                this.secondarySimilarity = d2;
            }
            this.liquidity = str15;
            this.liquidityToDisplay = str16;
            this.turnOver = str17;
            this.turnOverToDisplay = str18;
            this.marketCap = str19;
            this.marketCapToDisplay = str20;
            this.communityRecognized = z2;
            this.showCommunityRecognizedIcon = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? true : z3;
            this.riskLevel = str21;
        }

        public static final /* synthetic */ void OLrzqt(DexTokenListItem dexTokenListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) dexTokenListItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexTokenListItem.getTokenId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexTokenListItem.chainId);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexTokenListItem.tokenContractAddress);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexTokenListItem.tokenImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexTokenListItem.chainImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexTokenListItem.tokenFullName);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexTokenListItem.tokenName);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexTokenListItem.tokenNameToDisplay);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexTokenListItem.chainName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 9, dexTokenListItem.chainName);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexTokenListItem.price);
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexTokenListItem.priceToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexTokenListItem.changePercent);
            compositeEncoder.encodeStringElement(serialDescriptor, 13, dexTokenListItem.changePercentToDisplay);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], dexTokenListItem.trend);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || dexTokenListItem.isWatch) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 15, dexTokenListItem.isWatch);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || Double.compare(dexTokenListItem.primarySimilarity, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
                compositeEncoder.encodeDoubleElement(serialDescriptor, 16, dexTokenListItem.primarySimilarity);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || Double.compare(dexTokenListItem.secondarySimilarity, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
                compositeEncoder.encodeDoubleElement(serialDescriptor, 17, dexTokenListItem.secondarySimilarity);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 18, dexTokenListItem.liquidity);
            compositeEncoder.encodeStringElement(serialDescriptor, 19, dexTokenListItem.liquidityToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 20, dexTokenListItem.turnOver);
            compositeEncoder.encodeStringElement(serialDescriptor, 21, dexTokenListItem.turnOverToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 22, dexTokenListItem.marketCap);
            compositeEncoder.encodeStringElement(serialDescriptor, 23, dexTokenListItem.marketCapToDisplay);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, dexTokenListItem.communityRecognized);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !dexTokenListItem.showCommunityRecognizedIcon) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 25, dexTokenListItem.showCommunityRecognizedIcon);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 26, dexTokenListItem.riskLevel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DexTokenListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull OKCRTrend oKCRTrend, boolean z, double d, double d2, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z2, boolean z3, @NotNull String str20) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            Intrinsics.checkNotNullParameter(str13, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            Intrinsics.checkNotNullParameter(str14, "");
            Intrinsics.checkNotNullParameter(str15, "");
            Intrinsics.checkNotNullParameter(str16, "");
            Intrinsics.checkNotNullParameter(str17, "");
            Intrinsics.checkNotNullParameter(str18, "");
            Intrinsics.checkNotNullParameter(str19, "");
            Intrinsics.checkNotNullParameter(str20, "");
            this.tokenId = str;
            this.chainId = str2;
            this.tokenContractAddress = str3;
            this.tokenImageUrl = str4;
            this.chainImageUrl = str5;
            this.tokenFullName = str6;
            this.tokenName = str7;
            this.tokenNameToDisplay = str8;
            this.chainName = str9;
            this.price = str10;
            this.priceToDisplay = str11;
            this.changePercent = str12;
            this.changePercentToDisplay = str13;
            this.trend = oKCRTrend;
            this.isWatch = z;
            this.primarySimilarity = d;
            this.secondarySimilarity = d2;
            this.liquidity = str14;
            this.liquidityToDisplay = str15;
            this.turnOver = str16;
            this.turnOverToDisplay = str17;
            this.marketCap = str18;
            this.marketCapToDisplay = str19;
            this.communityRecognized = z2;
            this.showCommunityRecognizedIcon = z3;
            this.riskLevel = str20;
        }
    }

    @Serializable
    public static final class TokenEarnCardItem extends OKCRTokenListItem {
        public static final int $stable = 0;
        public final String currencyId;
        public final String earnPercentage;
        public final ItemRank rank;
        public final String tokenId;
        public final String tokenImageUrl;
        public final String tokenName;
        public static final Companion Companion = new Companion(null);
        public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, ItemRank.Companion.serializer(), null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TokenEarnCardItem copy$default(TokenEarnCardItem tokenEarnCardItem, String str, String str2, String str3, String str4, ItemRank itemRank, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tokenEarnCardItem.tokenId;
            }
            if ((i & 2) != 0) {
                str2 = tokenEarnCardItem.tokenImageUrl;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = tokenEarnCardItem.tokenName;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = tokenEarnCardItem.earnPercentage;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                itemRank = tokenEarnCardItem.rank;
            }
            ItemRank itemRank2 = itemRank;
            if ((i & 32) != 0) {
                str5 = tokenEarnCardItem.currencyId;
            }
            return tokenEarnCardItem.AEQbTJ(str, str6, str7, str8, itemRank2, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenEarnCardItem AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ItemRank itemRank, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(itemRank, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new TokenEarnCardItem(str, str2, str3, str4, itemRank, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenEarnCardItem)) {
                return false;
            }
            TokenEarnCardItem tokenEarnCardItem = (TokenEarnCardItem) obj;
            return Intrinsics.EZpvd((Object) this.tokenId, (Object) tokenEarnCardItem.tokenId) && Intrinsics.EZpvd((Object) this.tokenImageUrl, (Object) tokenEarnCardItem.tokenImageUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenEarnCardItem.tokenName) && Intrinsics.EZpvd((Object) this.earnPercentage, (Object) tokenEarnCardItem.earnPercentage) && this.rank == tokenEarnCardItem.rank && Intrinsics.EZpvd((Object) this.currencyId, (Object) tokenEarnCardItem.currencyId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.tokenId.hashCode() * 31) + this.tokenImageUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.earnPercentage.hashCode()) * 31) + this.rank.hashCode()) * 31) + this.currencyId.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenEarnCardItem(tokenId=" + this.tokenId + ", tokenImageUrl=" + this.tokenImageUrl + ", tokenName=" + this.tokenName + ", earnPercentage=" + this.earnPercentage + ", rank=" + this.rank + ", currencyId=" + this.currencyId + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.TokenEarnCardItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TokenEarnCardItem> serializer() {
                return OKCRTokenListItem$TokenEarnCardItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TokenEarnCardItem(int i, String str, String str2, String str3, String str4, String str5, ItemRank itemRank, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (127 != (i & 127)) {
                PluginExceptionsKt.throwMissingFieldException(i, 127, OKCRTokenListItem$TokenEarnCardItem$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenId = str2;
            this.tokenImageUrl = str3;
            this.tokenName = str4;
            this.earnPercentage = str5;
            this.rank = itemRank;
            this.currencyId = str6;
        }

        public static final /* synthetic */ void KWHzl(TokenEarnCardItem tokenEarnCardItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) tokenEarnCardItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenEarnCardItem.getTokenId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenEarnCardItem.tokenImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenEarnCardItem.tokenName);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenEarnCardItem.earnPercentage);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], tokenEarnCardItem.rank);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenEarnCardItem.currencyId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenEarnCardItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ItemRank itemRank, @NotNull String str5) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(itemRank, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.tokenId = str;
            this.tokenImageUrl = str2;
            this.tokenName = str3;
            this.earnPercentage = str4;
            this.rank = itemRank;
            this.currencyId = str5;
        }
    }

    @Serializable
    public static final class FeatureCardItem extends OKCRTokenListItem {
        public final String cardName;
        public final String cardTitle;
        public final String ctaContent;
        public final String ctaDeeplink;
        public final String darkBackground;
        public final String description;
        public final List<String> iconList;
        public final boolean isFrHide;
        public final String lightBackground;
        public final String preHeader;
        public final String restrictionTag;
        public final String submode;
        public final String tokenId;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.ctaContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> AYXKKw() {
            return this.iconList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.preHeader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.darkBackground;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.cardTitle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FeatureCardItem copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<String> list, @NotNull String str10, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str10, "");
            return new FeatureCardItem(str, str2, str3, str4, str5, str6, str7, str8, str9, list, str10, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.lightBackground;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeatureCardItem)) {
                return false;
            }
            FeatureCardItem featureCardItem = (FeatureCardItem) obj;
            return Intrinsics.EZpvd((Object) this.cardName, (Object) featureCardItem.cardName) && Intrinsics.EZpvd((Object) this.restrictionTag, (Object) featureCardItem.restrictionTag) && Intrinsics.EZpvd((Object) this.preHeader, (Object) featureCardItem.preHeader) && Intrinsics.EZpvd((Object) this.cardTitle, (Object) featureCardItem.cardTitle) && Intrinsics.EZpvd((Object) this.description, (Object) featureCardItem.description) && Intrinsics.EZpvd((Object) this.darkBackground, (Object) featureCardItem.darkBackground) && Intrinsics.EZpvd((Object) this.lightBackground, (Object) featureCardItem.lightBackground) && Intrinsics.EZpvd((Object) this.ctaContent, (Object) featureCardItem.ctaContent) && Intrinsics.EZpvd((Object) this.ctaDeeplink, (Object) featureCardItem.ctaDeeplink) && Intrinsics.EZpvd(this.iconList, featureCardItem.iconList) && Intrinsics.EZpvd((Object) this.submode, (Object) featureCardItem.submode) && this.isFrHide == featureCardItem.isFrHide;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem
        public String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((this.cardName.hashCode() * 31) + this.restrictionTag.hashCode()) * 31) + this.preHeader.hashCode()) * 31) + this.cardTitle.hashCode()) * 31) + this.description.hashCode()) * 31) + this.darkBackground.hashCode()) * 31) + this.lightBackground.hashCode()) * 31) + this.ctaContent.hashCode()) * 31) + this.ctaDeeplink.hashCode()) * 31) + this.iconList.hashCode()) * 31) + this.submode.hashCode()) * 31) + Boolean.hashCode(this.isFrHide);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FeatureCardItem(cardName=" + this.cardName + ", restrictionTag=" + this.restrictionTag + ", preHeader=" + this.preHeader + ", cardTitle=" + this.cardTitle + ", description=" + this.description + ", darkBackground=" + this.darkBackground + ", lightBackground=" + this.lightBackground + ", ctaContent=" + this.ctaContent + ", ctaDeeplink=" + this.ctaDeeplink + ", iconList=" + this.iconList + ", submode=" + this.submode + ", isFrHide=" + this.isFrHide + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.FeatureCardItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<FeatureCardItem> serializer() {
                return OKCRTokenListItem$FeatureCardItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FeatureCardItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, boolean z, String str12, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (8191 != (i & 8191)) {
                PluginExceptionsKt.throwMissingFieldException(i, 8191, OKCRTokenListItem$FeatureCardItem$$serializer.INSTANCE.getDescriptor());
            }
            this.cardName = str2;
            this.restrictionTag = str3;
            this.preHeader = str4;
            this.cardTitle = str5;
            this.description = str6;
            this.darkBackground = str7;
            this.lightBackground = str8;
            this.ctaContent = str9;
            this.ctaDeeplink = str10;
            this.iconList = list;
            this.submode = str11;
            this.isFrHide = z;
            if ((i & 8192) == 0) {
                this.tokenId = str2;
            } else {
                this.tokenId = str12;
            }
        }

        public static final /* synthetic */ void KWHzl(FeatureCardItem featureCardItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRTokenListItem.write$Self((OKCRTokenListItem) featureCardItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, featureCardItem.cardName);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, featureCardItem.restrictionTag);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, featureCardItem.preHeader);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, featureCardItem.cardTitle);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, featureCardItem.description);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, featureCardItem.darkBackground);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, featureCardItem.lightBackground);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, featureCardItem.ctaContent);
            compositeEncoder.encodeStringElement(serialDescriptor, 9, featureCardItem.ctaDeeplink);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], featureCardItem.iconList);
            compositeEncoder.encodeStringElement(serialDescriptor, 11, featureCardItem.submode);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, featureCardItem.isFrHide);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) featureCardItem.getTokenId(), (Object) featureCardItem.cardName)) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 13, featureCardItem.getTokenId());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeatureCardItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull List<String> list, @NotNull String str10, boolean z) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str10, "");
            this.cardName = str;
            this.restrictionTag = str2;
            this.preHeader = str3;
            this.cardTitle = str4;
            this.description = str5;
            this.darkBackground = str6;
            this.lightBackground = str7;
            this.ctaContent = str8;
            this.ctaDeeplink = str9;
            this.iconList = list;
            this.submode = str10;
            this.isFrHide = z;
            this.tokenId = str;
        }
    }
}
