package com.okinc.cruilib.model.listitem.advance;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.cruilib.model.listitem.OKCRListItem;
import com.okinc.cruilib.model.listitem.advance.OKCRPairListItem;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public abstract class OKCRPairListItem extends OKCRListItem {
    public static final int $stable = 0;
    private final String id;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mHN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKCRPairListItem._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OKCRPairListItem(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public String getId() {
        return this.id;
    }

    public abstract String getInstId();

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) OKCRPairListItem.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKCRPairListItem> serializer() {
            return OLrzqt();
        }
    }

    public /* synthetic */ OKCRPairListItem(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        this.id = str;
    }

    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.cruilib.model.listitem.advance.OKCRPairListItem", C56524yIo.AEQbTJ(OKCRPairListItem.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(BotListItem.class), C56524yIo.AEQbTJ(FuturesListItem.class), C56524yIo.AEQbTJ(NewCountDownPairListItem.class), C56524yIo.AEQbTJ(NewUpcomingPairListItem.class), C56524yIo.AEQbTJ(OptionsChainListItem.class), C56524yIo.AEQbTJ(PairListItem.class), C56524yIo.AEQbTJ(StockListItem.class), C56524yIo.AEQbTJ(TraderListItem.class)}, new KSerializer[]{OKCRPairListItem$BotListItem$$serializer.INSTANCE, OKCRPairListItem$FuturesListItem$$serializer.INSTANCE, OKCRPairListItem$NewCountDownPairListItem$$serializer.INSTANCE, OKCRPairListItem$NewUpcomingPairListItem$$serializer.INSTANCE, OKCRPairListItem$OptionsChainListItem$$serializer.INSTANCE, OKCRPairListItem$PairListItem$$serializer.INSTANCE, OKCRPairListItem$StockListItem$$serializer.INSTANCE, OKCRPairListItem$TraderListItem$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(OKCRPairListItem oKCRPairListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCRListItem.write$Self(oKCRPairListItem, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, oKCRPairListItem.getId());
    }

    public OKCRPairListItem(String str) {
        this.id = str;
    }

    @Serializable
    public static final class PairListItem extends OKCRPairListItem {
        private String baseImageUrl;
        private final String baseName;
        private String description;
        private final String instId;
        private boolean isWatch;
        private String marginLevel;
        private String percentage;
        private String price;
        private String quoteImageUrl;
        private final String quoteName;
        private OKCRTrend trend;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, OKCRTrend.Companion.serializer(), null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCRTrend component10() {
            return this.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component11() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.marginLevel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.percentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PairListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull OKCRTrend oKCRTrend, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            return new PairListItem(str, str2, str3, str4, str5, str6, str7, str8, str9, oKCRTrend, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PairListItem)) {
                return false;
            }
            PairListItem pairListItem = (PairListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) pairListItem.instId) && Intrinsics.EZpvd((Object) this.baseImageUrl, (Object) pairListItem.baseImageUrl) && Intrinsics.EZpvd((Object) this.quoteImageUrl, (Object) pairListItem.quoteImageUrl) && Intrinsics.EZpvd((Object) this.baseName, (Object) pairListItem.baseName) && Intrinsics.EZpvd((Object) this.quoteName, (Object) pairListItem.quoteName) && Intrinsics.EZpvd((Object) this.marginLevel, (Object) pairListItem.marginLevel) && Intrinsics.EZpvd((Object) this.description, (Object) pairListItem.description) && Intrinsics.EZpvd((Object) this.price, (Object) pairListItem.price) && Intrinsics.EZpvd((Object) this.percentage, (Object) pairListItem.percentage) && this.trend == pairListItem.trend && this.isWatch == pairListItem.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseImageUrl() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseName() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescription() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.advance.OKCRPairListItem
        public String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMarginLevel() {
            return this.marginLevel;
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
        public final String getQuoteImageUrl() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteName() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCRTrend getTrend() {
            return this.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((this.instId.hashCode() * 31) + this.baseImageUrl.hashCode()) * 31) + this.quoteImageUrl.hashCode()) * 31) + this.baseName.hashCode()) * 31) + this.quoteName.hashCode()) * 31) + this.marginLevel.hashCode()) * 31) + this.description.hashCode()) * 31) + this.price.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.trend.hashCode()) * 31) + Boolean.hashCode(this.isWatch);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isWatch() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBaseImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.baseImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDescription(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMarginLevel(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.marginLevel = str;
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
        public final void setQuoteImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.quoteImageUrl = str;
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
            return "PairListItem(instId=" + this.instId + ", baseImageUrl=" + this.baseImageUrl + ", quoteImageUrl=" + this.quoteImageUrl + ", baseName=" + this.baseName + ", quoteName=" + this.quoteName + ", marginLevel=" + this.marginLevel + ", description=" + this.description + ", price=" + this.price + ", percentage=" + this.percentage + ", trend=" + this.trend + ", isWatch=" + this.isWatch + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.PairListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PairListItem> serializer() {
                return OKCRPairListItem$PairListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PairListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, OKCRTrend oKCRTrend, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (2047 != (i & 2047)) {
                PluginExceptionsKt.throwMissingFieldException(i, 2047, OKCRPairListItem$PairListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.instId = str2;
            this.baseImageUrl = str3;
            this.quoteImageUrl = str4;
            this.baseName = str5;
            this.quoteName = str6;
            this.marginLevel = str7;
            this.description = str8;
            this.price = str9;
            this.percentage = str10;
            this.trend = oKCRTrend;
            this.isWatch = (i & 2048) == 0 ? false : z;
        }

        public static final /* synthetic */ void write$Self$OKCRUILib_cr_uilib(PairListItem pairListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRPairListItem.write$Self((OKCRPairListItem) pairListItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, pairListItem.getInstId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, pairListItem.baseImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, pairListItem.quoteImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, pairListItem.baseName);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, pairListItem.quoteName);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, pairListItem.marginLevel);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, pairListItem.description);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, pairListItem.price);
            compositeEncoder.encodeStringElement(serialDescriptor, 9, pairListItem.percentage);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], pairListItem.trend);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || pairListItem.isWatch) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 11, pairListItem.isWatch);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 com.okinc.cruilib.view.listitem.share.OKCRTrend)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean):void (m)] (LINE:16) call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.PairListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean):void type: THIS */
        public /* synthetic */ PairListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, OKCRTrend oKCRTrend, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, str8, str9, oKCRTrend, (i & 1024) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PairListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull OKCRTrend oKCRTrend, boolean z) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            this.instId = str;
            this.baseImageUrl = str2;
            this.quoteImageUrl = str3;
            this.baseName = str4;
            this.quoteName = str5;
            this.marginLevel = str6;
            this.description = str7;
            this.price = str8;
            this.percentage = str9;
            this.trend = oKCRTrend;
            this.isWatch = z;
        }
    }

    @Serializable
    public static final class BotListItem extends OKCRPairListItem {
        private final String bizType;
        private final String description;
        private final String displayId;
        private final String imageUrl;
        private final String instId;
        private boolean isShowAPR;
        private String percentage;
        private final String strategyToDisplay;
        private final String strategyType;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.displayId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.strategyToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.percentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.bizType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.strategyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.isShowAPR;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BotListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new BotListItem(str, str2, str3, str4, str5, str6, str7, str8, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BotListItem)) {
                return false;
            }
            BotListItem botListItem = (BotListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) botListItem.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) botListItem.displayId) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) botListItem.imageUrl) && Intrinsics.EZpvd((Object) this.strategyToDisplay, (Object) botListItem.strategyToDisplay) && Intrinsics.EZpvd((Object) this.description, (Object) botListItem.description) && Intrinsics.EZpvd((Object) this.percentage, (Object) botListItem.percentage) && Intrinsics.EZpvd((Object) this.bizType, (Object) botListItem.bizType) && Intrinsics.EZpvd((Object) this.strategyType, (Object) botListItem.strategyType) && this.isShowAPR == botListItem.isShowAPR;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBizType() {
            return this.bizType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescription() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayId() {
            return this.displayId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.advance.OKCRPairListItem
        public String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPercentage() {
            return this.percentage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStrategyToDisplay() {
            return this.strategyToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStrategyType() {
            return this.strategyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.strategyToDisplay.hashCode()) * 31) + this.description.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.bizType.hashCode()) * 31) + this.strategyType.hashCode()) * 31) + Boolean.hashCode(this.isShowAPR);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isShowAPR() {
            return this.isShowAPR;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPercentage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.percentage = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShowAPR(boolean z) {
            this.isShowAPR = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BotListItem(instId=" + this.instId + ", displayId=" + this.displayId + ", imageUrl=" + this.imageUrl + ", strategyToDisplay=" + this.strategyToDisplay + ", description=" + this.description + ", percentage=" + this.percentage + ", bizType=" + this.bizType + ", strategyType=" + this.strategyType + ", isShowAPR=" + this.isShowAPR + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.BotListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<BotListItem> serializer() {
                return OKCRPairListItem$BotListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BotListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (1023 != (i & 1023)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1023, OKCRPairListItem$BotListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.instId = str2;
            this.displayId = str3;
            this.imageUrl = str4;
            this.strategyToDisplay = str5;
            this.description = str6;
            this.percentage = str7;
            this.bizType = str8;
            this.strategyType = str9;
            this.isShowAPR = z;
        }

        public static final /* synthetic */ void write$Self$OKCRUILib_cr_uilib(BotListItem botListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRPairListItem.write$Self((OKCRPairListItem) botListItem, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, botListItem.getInstId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, botListItem.displayId);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, botListItem.imageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, botListItem.strategyToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, botListItem.description);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, botListItem.percentage);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, botListItem.bizType);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, botListItem.strategyType);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, botListItem.isShowAPR);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BotListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.instId = str;
            this.displayId = str2;
            this.imageUrl = str3;
            this.strategyToDisplay = str4;
            this.description = str5;
            this.percentage = str6;
            this.bizType = str7;
            this.strategyType = str8;
            this.isShowAPR = z;
        }
    }

    @Serializable
    public static final class TraderListItem extends OKCRPairListItem {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String aum;
        private final String defaultHeadPictureId;
        private final String description;
        private final String imageUrl;
        private final String instId;
        private final String jumpParam;
        private final String name;
        private final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.defaultHeadPictureId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.aum;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.jumpParam;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TraderListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new TraderListItem(str, str2, str3, str4, str5, str6, str7, str8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TraderListItem)) {
                return false;
            }
            TraderListItem traderListItem = (TraderListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) traderListItem.instId) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) traderListItem.imageUrl) && Intrinsics.EZpvd((Object) this.defaultHeadPictureId, (Object) traderListItem.defaultHeadPictureId) && Intrinsics.EZpvd((Object) this.name, (Object) traderListItem.name) && Intrinsics.EZpvd((Object) this.aum, (Object) traderListItem.aum) && Intrinsics.EZpvd((Object) this.description, (Object) traderListItem.description) && Intrinsics.EZpvd((Object) this.jumpParam, (Object) traderListItem.jumpParam) && Intrinsics.EZpvd((Object) this.type, (Object) traderListItem.type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAum() {
            return this.aum;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDefaultHeadPictureId() {
            return this.defaultHeadPictureId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescription() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.advance.OKCRPairListItem
        public String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getJumpParam() {
            return this.jumpParam;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.instId.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.defaultHeadPictureId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.aum.hashCode()) * 31) + this.description.hashCode()) * 31) + this.jumpParam.hashCode()) * 31) + this.type.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TraderListItem(instId=" + this.instId + ", imageUrl=" + this.imageUrl + ", defaultHeadPictureId=" + this.defaultHeadPictureId + ", name=" + this.name + ", aum=" + this.aum + ", description=" + this.description + ", jumpParam=" + this.jumpParam + ", type=" + this.type + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.TraderListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TraderListItem> serializer() {
                return OKCRPairListItem$TraderListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TraderListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, OKCRPairListItem$TraderListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.instId = str2;
            this.imageUrl = str3;
            this.defaultHeadPictureId = str4;
            this.name = str5;
            this.aum = str6;
            this.description = str7;
            this.jumpParam = str8;
            this.type = str9;
        }

        public static final /* synthetic */ void write$Self$OKCRUILib_cr_uilib(TraderListItem traderListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRPairListItem.write$Self((OKCRPairListItem) traderListItem, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, traderListItem.getInstId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, traderListItem.imageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, traderListItem.defaultHeadPictureId);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, traderListItem.name);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, traderListItem.aum);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, traderListItem.description);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, traderListItem.jumpParam);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, traderListItem.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TraderListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.instId = str;
            this.imageUrl = str2;
            this.defaultHeadPictureId = str3;
            this.name = str4;
            this.aum = str5;
            this.description = str6;
            this.jumpParam = str7;
            this.type = str8;
        }
    }

    @Serializable
    public static final class NewCountDownPairListItem extends OKCRPairListItem {
        private String baseImageUrl;
        private final String baseName;
        private String countDown;
        private final String instId;
        private boolean isWatch;
        private String onlineTime;
        private String openMethod;
        private String quoteImageUrl;
        private final String quoteName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.countDown;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.onlineTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.openMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NewCountDownPairListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new NewCountDownPairListItem(str, str2, str3, str4, str5, str6, str7, str8, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewCountDownPairListItem)) {
                return false;
            }
            NewCountDownPairListItem newCountDownPairListItem = (NewCountDownPairListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) newCountDownPairListItem.instId) && Intrinsics.EZpvd((Object) this.baseImageUrl, (Object) newCountDownPairListItem.baseImageUrl) && Intrinsics.EZpvd((Object) this.quoteImageUrl, (Object) newCountDownPairListItem.quoteImageUrl) && Intrinsics.EZpvd((Object) this.baseName, (Object) newCountDownPairListItem.baseName) && Intrinsics.EZpvd((Object) this.quoteName, (Object) newCountDownPairListItem.quoteName) && Intrinsics.EZpvd((Object) this.countDown, (Object) newCountDownPairListItem.countDown) && Intrinsics.EZpvd((Object) this.onlineTime, (Object) newCountDownPairListItem.onlineTime) && Intrinsics.EZpvd((Object) this.openMethod, (Object) newCountDownPairListItem.openMethod) && this.isWatch == newCountDownPairListItem.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseImageUrl() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseName() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCountDown() {
            return this.countDown;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.advance.OKCRPairListItem
        public String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOnlineTime() {
            return this.onlineTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOpenMethod() {
            return this.openMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteImageUrl() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteName() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((this.instId.hashCode() * 31) + this.baseImageUrl.hashCode()) * 31) + this.quoteImageUrl.hashCode()) * 31) + this.baseName.hashCode()) * 31) + this.quoteName.hashCode()) * 31) + this.countDown.hashCode()) * 31) + this.onlineTime.hashCode()) * 31) + this.openMethod.hashCode()) * 31) + Boolean.hashCode(this.isWatch);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isWatch() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBaseImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.baseImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCountDown(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.countDown = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOnlineTime(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onlineTime = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOpenMethod(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.openMethod = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setQuoteImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.quoteImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setWatch(boolean z) {
            this.isWatch = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NewCountDownPairListItem(instId=" + this.instId + ", baseImageUrl=" + this.baseImageUrl + ", quoteImageUrl=" + this.quoteImageUrl + ", baseName=" + this.baseName + ", quoteName=" + this.quoteName + ", countDown=" + this.countDown + ", onlineTime=" + this.onlineTime + ", openMethod=" + this.openMethod + ", isWatch=" + this.isWatch + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.NewCountDownPairListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<NewCountDownPairListItem> serializer() {
                return OKCRPairListItem$NewCountDownPairListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NewCountDownPairListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, OKCRPairListItem$NewCountDownPairListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.instId = str2;
            this.baseImageUrl = str3;
            this.quoteImageUrl = str4;
            this.baseName = str5;
            this.quoteName = str6;
            this.countDown = str7;
            this.onlineTime = str8;
            this.openMethod = str9;
            if ((i & 512) == 0) {
                this.isWatch = false;
            } else {
                this.isWatch = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKCRUILib_cr_uilib(NewCountDownPairListItem newCountDownPairListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRPairListItem.write$Self((OKCRPairListItem) newCountDownPairListItem, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, newCountDownPairListItem.getInstId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, newCountDownPairListItem.baseImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, newCountDownPairListItem.quoteImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, newCountDownPairListItem.baseName);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, newCountDownPairListItem.quoteName);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, newCountDownPairListItem.countDown);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, newCountDownPairListItem.onlineTime);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, newCountDownPairListItem.openMethod);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || newCountDownPairListItem.isWatch) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 9, newCountDownPairListItem.isWatch);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:59) call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.NewCountDownPairListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ NewCountDownPairListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewCountDownPairListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.instId = str;
            this.baseImageUrl = str2;
            this.quoteImageUrl = str3;
            this.baseName = str4;
            this.quoteName = str5;
            this.countDown = str6;
            this.onlineTime = str7;
            this.openMethod = str8;
            this.isWatch = z;
        }
    }

    @Serializable
    public static final class NewUpcomingPairListItem extends OKCRPairListItem {
        private String baseImageUrl;
        private final String baseName;
        private final String instId;
        private boolean isWatch;
        private String openMethod;
        private String quoteImageUrl;
        private final String quoteName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NewUpcomingPairListItem copy$default(NewUpcomingPairListItem newUpcomingPairListItem, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newUpcomingPairListItem.instId;
            }
            if ((i & 2) != 0) {
                str2 = newUpcomingPairListItem.baseImageUrl;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = newUpcomingPairListItem.quoteImageUrl;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = newUpcomingPairListItem.baseName;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = newUpcomingPairListItem.quoteName;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = newUpcomingPairListItem.openMethod;
            }
            String str11 = str6;
            if ((i & 64) != 0) {
                z = newUpcomingPairListItem.isWatch;
            }
            return newUpcomingPairListItem.copy(str, str7, str8, str9, str10, str11, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.openMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component7() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NewUpcomingPairListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new NewUpcomingPairListItem(str, str2, str3, str4, str5, str6, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewUpcomingPairListItem)) {
                return false;
            }
            NewUpcomingPairListItem newUpcomingPairListItem = (NewUpcomingPairListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) newUpcomingPairListItem.instId) && Intrinsics.EZpvd((Object) this.baseImageUrl, (Object) newUpcomingPairListItem.baseImageUrl) && Intrinsics.EZpvd((Object) this.quoteImageUrl, (Object) newUpcomingPairListItem.quoteImageUrl) && Intrinsics.EZpvd((Object) this.baseName, (Object) newUpcomingPairListItem.baseName) && Intrinsics.EZpvd((Object) this.quoteName, (Object) newUpcomingPairListItem.quoteName) && Intrinsics.EZpvd((Object) this.openMethod, (Object) newUpcomingPairListItem.openMethod) && this.isWatch == newUpcomingPairListItem.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseImageUrl() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseName() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.advance.OKCRPairListItem
        public String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOpenMethod() {
            return this.openMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteImageUrl() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteName() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.instId.hashCode() * 31) + this.baseImageUrl.hashCode()) * 31) + this.quoteImageUrl.hashCode()) * 31) + this.baseName.hashCode()) * 31) + this.quoteName.hashCode()) * 31) + this.openMethod.hashCode()) * 31) + Boolean.hashCode(this.isWatch);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isWatch() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBaseImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.baseImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOpenMethod(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.openMethod = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setQuoteImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.quoteImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setWatch(boolean z) {
            this.isWatch = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NewUpcomingPairListItem(instId=" + this.instId + ", baseImageUrl=" + this.baseImageUrl + ", quoteImageUrl=" + this.quoteImageUrl + ", baseName=" + this.baseName + ", quoteName=" + this.quoteName + ", openMethod=" + this.openMethod + ", isWatch=" + this.isWatch + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.NewUpcomingPairListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<NewUpcomingPairListItem> serializer() {
                return OKCRPairListItem$NewUpcomingPairListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NewUpcomingPairListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (127 != (i & 127)) {
                PluginExceptionsKt.throwMissingFieldException(i, 127, OKCRPairListItem$NewUpcomingPairListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.instId = str2;
            this.baseImageUrl = str3;
            this.quoteImageUrl = str4;
            this.baseName = str5;
            this.quoteName = str6;
            this.openMethod = str7;
            if ((i & 128) == 0) {
                this.isWatch = false;
            } else {
                this.isWatch = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKCRUILib_cr_uilib(NewUpcomingPairListItem newUpcomingPairListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRPairListItem.write$Self((OKCRPairListItem) newUpcomingPairListItem, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, newUpcomingPairListItem.getInstId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, newUpcomingPairListItem.baseImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, newUpcomingPairListItem.quoteImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, newUpcomingPairListItem.baseName);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, newUpcomingPairListItem.quoteName);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, newUpcomingPairListItem.openMethod);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || newUpcomingPairListItem.isWatch) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 7, newUpcomingPairListItem.isWatch);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:73) call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.NewUpcomingPairListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ NewUpcomingPairListItem(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewUpcomingPairListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.instId = str;
            this.baseImageUrl = str2;
            this.quoteImageUrl = str3;
            this.baseName = str4;
            this.quoteName = str5;
            this.openMethod = str6;
            this.isWatch = z;
        }
    }

    @Serializable
    public static final class FuturesListItem extends OKCRPairListItem {
        private String baseImageUrl;
        private final String baseName;
        private String changePercent;
        private String changePercentToDisplay;
        private String descriptionToDisplay;
        private String expiryDate;
        private String fullNameToDisplay;
        private final String instId;
        private boolean isWatch;
        private String price;
        private String priceToDisplay;
        private String quoteImageUrl;
        private final String quoteName;
        private boolean showPerpTag;
        private OKCRTrend trend;
        private String turnover;
        private String volume;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, OKCRTrend.Companion.serializer(), null, null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.descriptionToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.priceToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.changePercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component14() {
            return this.changePercentToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCRTrend component15() {
            return this.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component16() {
            return this.showPerpTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component17() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.expiryDate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.fullNameToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.volume;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.turnover;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FuturesListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull OKCRTrend oKCRTrend, boolean z, boolean z2) {
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
            Intrinsics.checkNotNullParameter(str14, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            return new FuturesListItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, oKCRTrend, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FuturesListItem)) {
                return false;
            }
            FuturesListItem futuresListItem = (FuturesListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) futuresListItem.instId) && Intrinsics.EZpvd((Object) this.baseImageUrl, (Object) futuresListItem.baseImageUrl) && Intrinsics.EZpvd((Object) this.quoteImageUrl, (Object) futuresListItem.quoteImageUrl) && Intrinsics.EZpvd((Object) this.baseName, (Object) futuresListItem.baseName) && Intrinsics.EZpvd((Object) this.quoteName, (Object) futuresListItem.quoteName) && Intrinsics.EZpvd((Object) this.expiryDate, (Object) futuresListItem.expiryDate) && Intrinsics.EZpvd((Object) this.fullNameToDisplay, (Object) futuresListItem.fullNameToDisplay) && Intrinsics.EZpvd((Object) this.volume, (Object) futuresListItem.volume) && Intrinsics.EZpvd((Object) this.turnover, (Object) futuresListItem.turnover) && Intrinsics.EZpvd((Object) this.descriptionToDisplay, (Object) futuresListItem.descriptionToDisplay) && Intrinsics.EZpvd((Object) this.price, (Object) futuresListItem.price) && Intrinsics.EZpvd((Object) this.priceToDisplay, (Object) futuresListItem.priceToDisplay) && Intrinsics.EZpvd((Object) this.changePercent, (Object) futuresListItem.changePercent) && Intrinsics.EZpvd((Object) this.changePercentToDisplay, (Object) futuresListItem.changePercentToDisplay) && this.trend == futuresListItem.trend && this.showPerpTag == futuresListItem.showPerpTag && this.isWatch == futuresListItem.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseImageUrl() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseName() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChangePercent() {
            return this.changePercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChangePercentToDisplay() {
            return this.changePercentToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescriptionToDisplay() {
            return this.descriptionToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExpiryDate() {
            return this.expiryDate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFullNameToDisplay() {
            return this.fullNameToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.advance.OKCRPairListItem
        public String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPrice() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriceToDisplay() {
            return this.priceToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteImageUrl() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteName() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getShowPerpTag() {
            return this.showPerpTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCRTrend getTrend() {
            return this.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTurnover() {
            return this.turnover;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getVolume() {
            return this.volume;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.instId.hashCode() * 31) + this.baseImageUrl.hashCode()) * 31) + this.quoteImageUrl.hashCode()) * 31) + this.baseName.hashCode()) * 31) + this.quoteName.hashCode()) * 31) + this.expiryDate.hashCode()) * 31) + this.fullNameToDisplay.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.turnover.hashCode()) * 31) + this.descriptionToDisplay.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceToDisplay.hashCode()) * 31) + this.changePercent.hashCode()) * 31) + this.changePercentToDisplay.hashCode()) * 31) + this.trend.hashCode()) * 31) + Boolean.hashCode(this.showPerpTag)) * 31) + Boolean.hashCode(this.isWatch);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isWatch() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBaseImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.baseImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChangePercent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.changePercent = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChangePercentToDisplay(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.changePercentToDisplay = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDescriptionToDisplay(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.descriptionToDisplay = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setExpiryDate(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.expiryDate = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFullNameToDisplay(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.fullNameToDisplay = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPrice(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.price = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPriceToDisplay(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.priceToDisplay = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setQuoteImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.quoteImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShowPerpTag(boolean z) {
            this.showPerpTag = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTrend(@NotNull OKCRTrend oKCRTrend) {
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            this.trend = oKCRTrend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTurnover(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.turnover = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setVolume(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.volume = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setWatch(boolean z) {
            this.isWatch = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FuturesListItem(instId=" + this.instId + ", baseImageUrl=" + this.baseImageUrl + ", quoteImageUrl=" + this.quoteImageUrl + ", baseName=" + this.baseName + ", quoteName=" + this.quoteName + ", expiryDate=" + this.expiryDate + ", fullNameToDisplay=" + this.fullNameToDisplay + ", volume=" + this.volume + ", turnover=" + this.turnover + ", descriptionToDisplay=" + this.descriptionToDisplay + ", price=" + this.price + ", priceToDisplay=" + this.priceToDisplay + ", changePercent=" + this.changePercent + ", changePercentToDisplay=" + this.changePercentToDisplay + ", trend=" + this.trend + ", showPerpTag=" + this.showPerpTag + ", isWatch=" + this.isWatch + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.FuturesListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<FuturesListItem> serializer() {
                return OKCRPairListItem$FuturesListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FuturesListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, OKCRTrend oKCRTrend, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (65535 != (i & 65535)) {
                PluginExceptionsKt.throwMissingFieldException(i, 65535, OKCRPairListItem$FuturesListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.instId = str2;
            this.baseImageUrl = str3;
            this.quoteImageUrl = str4;
            this.baseName = str5;
            this.quoteName = str6;
            this.expiryDate = str7;
            this.fullNameToDisplay = str8;
            this.volume = str9;
            this.turnover = str10;
            this.descriptionToDisplay = str11;
            this.price = str12;
            this.priceToDisplay = str13;
            this.changePercent = str14;
            this.changePercentToDisplay = str15;
            this.trend = oKCRTrend;
            if ((65536 & i) == 0) {
                this.showPerpTag = false;
            } else {
                this.showPerpTag = z;
            }
            if ((i & 131072) == 0) {
                this.isWatch = false;
            } else {
                this.isWatch = z2;
            }
        }

        public static final /* synthetic */ void write$Self$OKCRUILib_cr_uilib(FuturesListItem futuresListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRPairListItem.write$Self((OKCRPairListItem) futuresListItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, futuresListItem.getInstId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, futuresListItem.baseImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, futuresListItem.quoteImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, futuresListItem.baseName);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, futuresListItem.quoteName);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, futuresListItem.expiryDate);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, futuresListItem.fullNameToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, futuresListItem.volume);
            compositeEncoder.encodeStringElement(serialDescriptor, 9, futuresListItem.turnover);
            compositeEncoder.encodeStringElement(serialDescriptor, 10, futuresListItem.descriptionToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 11, futuresListItem.price);
            compositeEncoder.encodeStringElement(serialDescriptor, 12, futuresListItem.priceToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 13, futuresListItem.changePercent);
            compositeEncoder.encodeStringElement(serialDescriptor, 14, futuresListItem.changePercentToDisplay);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], futuresListItem.trend);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || futuresListItem.showPerpTag) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 16, futuresListItem.showPerpTag);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || futuresListItem.isWatch) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 17, futuresListItem.isWatch);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (r35v0 com.okinc.cruilib.view.listitem.share.OKCRTrend)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0003: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean, boolean):void (m)] (LINE:85) call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.FuturesListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean, boolean):void type: THIS */
        public /* synthetic */ FuturesListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, OKCRTrend oKCRTrend, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, oKCRTrend, (i & 32768) != 0 ? false : z, (i & 65536) != 0 ? false : z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FuturesListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull OKCRTrend oKCRTrend, boolean z, boolean z2) {
            super(str, null);
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
            Intrinsics.checkNotNullParameter(str14, "");
            Intrinsics.checkNotNullParameter(oKCRTrend, "");
            this.instId = str;
            this.baseImageUrl = str2;
            this.quoteImageUrl = str3;
            this.baseName = str4;
            this.quoteName = str5;
            this.expiryDate = str6;
            this.fullNameToDisplay = str7;
            this.volume = str8;
            this.turnover = str9;
            this.descriptionToDisplay = str10;
            this.price = str11;
            this.priceToDisplay = str12;
            this.changePercent = str13;
            this.changePercentToDisplay = str14;
            this.trend = oKCRTrend;
            this.showPerpTag = z;
            this.isWatch = z2;
        }
    }

    @Serializable
    public static final class StockListItem extends OKCRPairListItem {
        private String baseImageUrl;
        private final String baseName;
        private String changePercent;
        private String changePercentToDisplay;
        private String companyName;
        private String descriptionToDisplay;
        private String fullNameToDisplay;
        private final String instId;
        private String instType;
        private boolean isWatch;
        private String price;
        private String priceToDisplay;
        private String quoteImageUrl;
        private final String quoteName;
        private OKCRTrend trend;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, OKCRTrend.Companion.serializer(), null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.priceToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.changePercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.changePercentToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCRTrend component14() {
            return this.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component15() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.instType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.fullNameToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.companyName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.descriptionToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StockListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull OKCRTrend oKCRTrend, boolean z) {
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
            return new StockListItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, oKCRTrend, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StockListItem)) {
                return false;
            }
            StockListItem stockListItem = (StockListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) stockListItem.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) stockListItem.instType) && Intrinsics.EZpvd((Object) this.baseImageUrl, (Object) stockListItem.baseImageUrl) && Intrinsics.EZpvd((Object) this.quoteImageUrl, (Object) stockListItem.quoteImageUrl) && Intrinsics.EZpvd((Object) this.baseName, (Object) stockListItem.baseName) && Intrinsics.EZpvd((Object) this.quoteName, (Object) stockListItem.quoteName) && Intrinsics.EZpvd((Object) this.fullNameToDisplay, (Object) stockListItem.fullNameToDisplay) && Intrinsics.EZpvd((Object) this.companyName, (Object) stockListItem.companyName) && Intrinsics.EZpvd((Object) this.descriptionToDisplay, (Object) stockListItem.descriptionToDisplay) && Intrinsics.EZpvd((Object) this.price, (Object) stockListItem.price) && Intrinsics.EZpvd((Object) this.priceToDisplay, (Object) stockListItem.priceToDisplay) && Intrinsics.EZpvd((Object) this.changePercent, (Object) stockListItem.changePercent) && Intrinsics.EZpvd((Object) this.changePercentToDisplay, (Object) stockListItem.changePercentToDisplay) && this.trend == stockListItem.trend && this.isWatch == stockListItem.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseImageUrl() {
            return this.baseImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseName() {
            return this.baseName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChangePercent() {
            return this.changePercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChangePercentToDisplay() {
            return this.changePercentToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCompanyName() {
            return this.companyName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescriptionToDisplay() {
            return this.descriptionToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFullNameToDisplay() {
            return this.fullNameToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.advance.OKCRPairListItem
        public String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstType() {
            return this.instType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPrice() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriceToDisplay() {
            return this.priceToDisplay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteImageUrl() {
            return this.quoteImageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteName() {
            return this.quoteName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKCRTrend getTrend() {
            return this.trend;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((((this.instId.hashCode() * 31) + this.instType.hashCode()) * 31) + this.baseImageUrl.hashCode()) * 31) + this.quoteImageUrl.hashCode()) * 31) + this.baseName.hashCode()) * 31) + this.quoteName.hashCode()) * 31) + this.fullNameToDisplay.hashCode()) * 31) + this.companyName.hashCode()) * 31) + this.descriptionToDisplay.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceToDisplay.hashCode()) * 31) + this.changePercent.hashCode()) * 31) + this.changePercentToDisplay.hashCode()) * 31) + this.trend.hashCode()) * 31) + Boolean.hashCode(this.isWatch);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isWatch() {
            return this.isWatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBaseImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.baseImageUrl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChangePercent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.changePercent = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChangePercentToDisplay(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.changePercentToDisplay = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCompanyName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.companyName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDescriptionToDisplay(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.descriptionToDisplay = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFullNameToDisplay(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.fullNameToDisplay = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setInstType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.instType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPrice(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.price = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPriceToDisplay(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.priceToDisplay = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setQuoteImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.quoteImageUrl = str;
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
            return "StockListItem(instId=" + this.instId + ", instType=" + this.instType + ", baseImageUrl=" + this.baseImageUrl + ", quoteImageUrl=" + this.quoteImageUrl + ", baseName=" + this.baseName + ", quoteName=" + this.quoteName + ", fullNameToDisplay=" + this.fullNameToDisplay + ", companyName=" + this.companyName + ", descriptionToDisplay=" + this.descriptionToDisplay + ", price=" + this.price + ", priceToDisplay=" + this.priceToDisplay + ", changePercent=" + this.changePercent + ", changePercentToDisplay=" + this.changePercentToDisplay + ", trend=" + this.trend + ", isWatch=" + this.isWatch + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.StockListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StockListItem> serializer() {
                return OKCRPairListItem$StockListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StockListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, OKCRTrend oKCRTrend, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (32763 != (i & 32763)) {
                PluginExceptionsKt.throwMissingFieldException(i, 32763, OKCRPairListItem$StockListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.instId = str2;
            this.instType = (i & 4) == 0 ? "" : str3;
            this.baseImageUrl = str4;
            this.quoteImageUrl = str5;
            this.baseName = str6;
            this.quoteName = str7;
            this.fullNameToDisplay = str8;
            this.companyName = str9;
            this.descriptionToDisplay = str10;
            this.price = str11;
            this.priceToDisplay = str12;
            this.changePercent = str13;
            this.changePercentToDisplay = str14;
            this.trend = oKCRTrend;
            this.isWatch = (i & 32768) == 0 ? false : z;
        }

        public static final /* synthetic */ void write$Self$OKCRUILib_cr_uilib(StockListItem stockListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRPairListItem.write$Self((OKCRPairListItem) stockListItem, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 1, stockListItem.getInstId());
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) stockListItem.instType, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, stockListItem.instType);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 3, stockListItem.baseImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, stockListItem.quoteImageUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, stockListItem.baseName);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, stockListItem.quoteName);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, stockListItem.fullNameToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, stockListItem.companyName);
            compositeEncoder.encodeStringElement(serialDescriptor, 9, stockListItem.descriptionToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 10, stockListItem.price);
            compositeEncoder.encodeStringElement(serialDescriptor, 11, stockListItem.priceToDisplay);
            compositeEncoder.encodeStringElement(serialDescriptor, 12, stockListItem.changePercent);
            compositeEncoder.encodeStringElement(serialDescriptor, 13, stockListItem.changePercentToDisplay);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], stockListItem.trend);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || stockListItem.isWatch) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 15, stockListItem.isWatch);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 com.okinc.cruilib.view.listitem.share.OKCRTrend)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean):void (m)] (LINE:107) call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.StockListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend, boolean):void type: THIS */
        public /* synthetic */ StockListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, OKCRTrend oKCRTrend, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, oKCRTrend, (i & 16384) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StockListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull OKCRTrend oKCRTrend, boolean z) {
            super(str, null);
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
            this.instId = str;
            this.instType = str2;
            this.baseImageUrl = str3;
            this.quoteImageUrl = str4;
            this.baseName = str5;
            this.quoteName = str6;
            this.fullNameToDisplay = str7;
            this.companyName = str8;
            this.descriptionToDisplay = str9;
            this.price = str10;
            this.priceToDisplay = str11;
            this.changePercent = str12;
            this.changePercentToDisplay = str13;
            this.trend = oKCRTrend;
            this.isWatch = z;
        }
    }

    @Serializable
    public static final class OptionsChainListItem extends OKCRPairListItem {
        private String displayName;
        private final String instId;
        private boolean isContractList;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OptionsChainListItem copy$default(OptionsChainListItem optionsChainListItem, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optionsChainListItem.instId;
            }
            if ((i & 2) != 0) {
                str2 = optionsChainListItem.displayName;
            }
            if ((i & 4) != 0) {
                z = optionsChainListItem.isContractList;
            }
            return optionsChainListItem.copy(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.displayName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.isContractList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OptionsChainListItem copy(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new OptionsChainListItem(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptionsChainListItem)) {
                return false;
            }
            OptionsChainListItem optionsChainListItem = (OptionsChainListItem) obj;
            return Intrinsics.EZpvd((Object) this.instId, (Object) optionsChainListItem.instId) && Intrinsics.EZpvd((Object) this.displayName, (Object) optionsChainListItem.displayName) && this.isContractList == optionsChainListItem.isContractList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.cruilib.model.listitem.advance.OKCRPairListItem
        public String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.instId.hashCode() * 31) + this.displayName.hashCode()) * 31) + Boolean.hashCode(this.isContractList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isContractList() {
            return this.isContractList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContractList(boolean z) {
            this.isContractList = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDisplayName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.displayName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OptionsChainListItem(instId=" + this.instId + ", displayName=" + this.displayName + ", isContractList=" + this.isContractList + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.OptionsChainListItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<OptionsChainListItem> serializer() {
                return OKCRPairListItem$OptionsChainListItem$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OptionsChainListItem(int i, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, str, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, OKCRPairListItem$OptionsChainListItem$$serializer.INSTANCE.getDescriptor());
            }
            this.instId = str2;
            this.displayName = str3;
            if ((i & 8) == 0) {
                this.isContractList = false;
            } else {
                this.isContractList = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKCRUILib_cr_uilib(OptionsChainListItem optionsChainListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            OKCRPairListItem.write$Self((OKCRPairListItem) optionsChainListItem, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, optionsChainListItem.getInstId());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, optionsChainListItem.displayName);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || optionsChainListItem.isContractList) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 3, optionsChainListItem.isContractList);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:127) call: com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.OptionsChainListItem.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ OptionsChainListItem(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionsChainListItem(@NotNull String str, @NotNull String str2, boolean z) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.instId = str;
            this.displayName = str2;
            this.isContractList = z;
        }
    }
}
