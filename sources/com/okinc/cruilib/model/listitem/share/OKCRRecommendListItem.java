package com.okinc.cruilib.model.listitem.share;

import com.okinc.cruilib.model.listitem.OKCRListItem;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OKCRRecommendListItem extends OKCRListItem {
    public String baseImageUrl;
    public final String baseName;
    public final String fullName;
    public final String id;
    public final String instId;
    public final String instType;
    public boolean isSelected;
    public String percentage;
    public String price;
    public String quoteImageUrl;
    public final String quoteName;
    public OKCRTrend trend;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, OKCRTrend.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCRRecommendListItem KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull OKCRTrend oKCRTrend, boolean z) {
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
        return new OKCRRecommendListItem(str, str2, str3, str4, str5, str6, str7, str8, str9, oKCRTrend, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKCRRecommendListItem)) {
            return false;
        }
        OKCRRecommendListItem oKCRRecommendListItem = (OKCRRecommendListItem) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) oKCRRecommendListItem.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) oKCRRecommendListItem.instType) && Intrinsics.EZpvd((Object) this.baseImageUrl, (Object) oKCRRecommendListItem.baseImageUrl) && Intrinsics.EZpvd((Object) this.quoteImageUrl, (Object) oKCRRecommendListItem.quoteImageUrl) && Intrinsics.EZpvd((Object) this.baseName, (Object) oKCRRecommendListItem.baseName) && Intrinsics.EZpvd((Object) this.quoteName, (Object) oKCRRecommendListItem.quoteName) && Intrinsics.EZpvd((Object) this.fullName, (Object) oKCRRecommendListItem.fullName) && Intrinsics.EZpvd((Object) this.price, (Object) oKCRRecommendListItem.price) && Intrinsics.EZpvd((Object) this.percentage, (Object) oKCRRecommendListItem.percentage) && this.trend == oKCRRecommendListItem.trend && this.isSelected == oKCRRecommendListItem.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.instId.hashCode() * 31) + this.instType.hashCode()) * 31) + this.baseImageUrl.hashCode()) * 31) + this.quoteImageUrl.hashCode()) * 31) + this.baseName.hashCode()) * 31) + this.quoteName.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.price.hashCode()) * 31) + this.percentage.hashCode()) * 31) + this.trend.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKCRRecommendListItem(instId=" + this.instId + ", instType=" + this.instType + ", baseImageUrl=" + this.baseImageUrl + ", quoteImageUrl=" + this.quoteImageUrl + ", baseName=" + this.baseName + ", quoteName=" + this.quoteName + ", fullName=" + this.fullName + ", price=" + this.price + ", percentage=" + this.percentage + ", trend=" + this.trend + ", isSelected=" + this.isSelected + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.share.OKCRRecommendListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKCRRecommendListItem> serializer() {
            return OKCRRecommendListItem$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OKCRRecommendListItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, OKCRTrend oKCRTrend, boolean z, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, OKCRRecommendListItem$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.instType = str2;
        this.baseImageUrl = str3;
        this.quoteImageUrl = str4;
        this.baseName = str5;
        this.quoteName = str6;
        this.fullName = str7;
        this.price = str8;
        this.percentage = str9;
        this.trend = oKCRTrend;
        this.isSelected = z;
        if ((i & 2048) == 0) {
            this.id = str;
        } else {
            this.id = str10;
        }
    }

    public static final /* synthetic */ void KWHzl(OKCRRecommendListItem oKCRRecommendListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCRListItem.write$Self(oKCRRecommendListItem, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, oKCRRecommendListItem.instId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, oKCRRecommendListItem.instType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, oKCRRecommendListItem.baseImageUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, oKCRRecommendListItem.quoteImageUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, oKCRRecommendListItem.baseName);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, oKCRRecommendListItem.quoteName);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, oKCRRecommendListItem.fullName);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, oKCRRecommendListItem.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, oKCRRecommendListItem.percentage);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], oKCRRecommendListItem.trend);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 10, oKCRRecommendListItem.isSelected);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) oKCRRecommendListItem.getId(), (Object) oKCRRecommendListItem.instId)) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, oKCRRecommendListItem.getId());
    }

    public OKCRRecommendListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull OKCRTrend oKCRTrend, boolean z) {
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
        this.instType = str2;
        this.baseImageUrl = str3;
        this.quoteImageUrl = str4;
        this.baseName = str5;
        this.quoteName = str6;
        this.fullName = str7;
        this.price = str8;
        this.percentage = str9;
        this.trend = oKCRTrend;
        this.isSelected = z;
        this.id = str;
    }
}
