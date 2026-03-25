package com.okinc.unify_trade.biz;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OldCoinInfo {
    private String changePercentage;
    private String classification;
    private String classificationId;
    private String dayHigh;
    private String dayLow;
    private String flowTotal;
    private String fullName;
    private String fullNameSeo;
    private String icon;
    private int index_postion;
    private String last;
    private String open;
    private String openUtc0;
    private String openUtc8;
    private String project;
    private String symbol;
    private String volume;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePercentage() {
        return this.changePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClassification() {
        return this.classification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClassificationId() {
        return this.classificationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDayHigh() {
        return this.dayHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDayLow() {
        return this.dayLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlowTotal() {
        return this.flowTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullNameSeo() {
        return this.fullNameSeo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex_postion() {
        return this.index_postion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen() {
        return this.open;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenUtc0() {
        return this.openUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenUtc8() {
        return this.openUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProject() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUtc0() {
        return this.openUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUtc8() {
        return this.openUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseChange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseOpen(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangePercentage(String str) {
        this.changePercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClassification(String str) {
        this.classification = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClassificationId(String str) {
        this.classificationId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDayHigh(String str) {
        this.dayHigh = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDayLow(String str) {
        this.dayLow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlowTotal(String str) {
        this.flowTotal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(String str) {
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullNameSeo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fullNameSeo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex_postion(int i) {
        this.index_postion = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLast(String str) {
        this.last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpen(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.open = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenUtc0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openUtc0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenUtc8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openUtc8 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProject(String str) {
        this.project = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolume(String str) {
        this.volume = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OldCoinInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OldCoinInfo> serializer() {
            return OldCoinInfo$$serializer.INSTANCE;
        }
    }

    public OldCoinInfo() {
        this.classification = "";
        this.classificationId = "";
        this.flowTotal = "";
        this.fullName = "";
        this.fullNameSeo = "";
        this.icon = "";
        this.project = "";
        this.last = "";
        this.dayHigh = "";
        this.dayLow = "";
        this.changePercentage = "";
        this.symbol = "";
        this.volume = "";
        this.open = MultiTransferSignData.DEFAULT_INTERVAL;
        this.openUtc0 = MultiTransferSignData.DEFAULT_INTERVAL;
        this.openUtc8 = MultiTransferSignData.DEFAULT_INTERVAL;
    }

    public /* synthetic */ OldCoinInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.classification = "";
        } else {
            this.classification = str;
        }
        if ((i & 2) == 0) {
            this.classificationId = "";
        } else {
            this.classificationId = str2;
        }
        if ((i & 4) == 0) {
            this.flowTotal = "";
        } else {
            this.flowTotal = str3;
        }
        if ((i & 8) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str4;
        }
        if ((i & 16) == 0) {
            this.fullNameSeo = "";
        } else {
            this.fullNameSeo = str5;
        }
        if ((i & 32) == 0) {
            this.icon = "";
        } else {
            this.icon = str6;
        }
        if ((i & 64) == 0) {
            this.project = "";
        } else {
            this.project = str7;
        }
        if ((i & 128) == 0) {
            this.last = "";
        } else {
            this.last = str8;
        }
        if ((i & 256) == 0) {
            this.dayHigh = "";
        } else {
            this.dayHigh = str9;
        }
        if ((i & 512) == 0) {
            this.dayLow = "";
        } else {
            this.dayLow = str10;
        }
        if ((i & 1024) == 0) {
            this.changePercentage = "";
        } else {
            this.changePercentage = str11;
        }
        if ((i & 2048) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str12;
        }
        if ((i & 4096) == 0) {
            this.volume = "";
        } else {
            this.volume = str13;
        }
        this.index_postion = (i & 8192) == 0 ? 0 : i2;
        if ((i & 16384) == 0) {
            this.open = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.open = str14;
        }
        if ((32768 & i) == 0) {
            this.openUtc0 = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.openUtc0 = str15;
        }
        if ((i & 65536) == 0) {
            this.openUtc8 = MultiTransferSignData.DEFAULT_INTERVAL;
        } else {
            this.openUtc8 = str16;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OldCoinInfo oldCoinInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) oldCoinInfo.classification, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, oldCoinInfo.classification);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oldCoinInfo.classificationId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, oldCoinInfo.classificationId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) oldCoinInfo.flowTotal, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, oldCoinInfo.flowTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) oldCoinInfo.fullName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, oldCoinInfo.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) oldCoinInfo.fullNameSeo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, oldCoinInfo.fullNameSeo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) oldCoinInfo.icon, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, oldCoinInfo.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) oldCoinInfo.project, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, oldCoinInfo.project);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) oldCoinInfo.last, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, oldCoinInfo.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) oldCoinInfo.dayHigh, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oldCoinInfo.dayHigh);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) oldCoinInfo.dayLow, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, oldCoinInfo.dayLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) oldCoinInfo.changePercentage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, oldCoinInfo.changePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) oldCoinInfo.symbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, oldCoinInfo.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) oldCoinInfo.volume, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, oldCoinInfo.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oldCoinInfo.index_postion != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, oldCoinInfo.index_postion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) oldCoinInfo.open, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, oldCoinInfo.open);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) oldCoinInfo.openUtc0, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, oldCoinInfo.openUtc0);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) oldCoinInfo.openUtc8, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, oldCoinInfo.openUtc8);
    }

    public final String getTheLast() {
        return C33129mqd.gEmmrt(this.last);
    }
}
