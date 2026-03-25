package com.okinc.unify_trade.biz;

import android.os.Parcelable;
import com.okinc.unify_trade.biz.BaseAShareBean;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C54589xNz;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public abstract class BaseAShareBean implements Parcelable {
    private String entry;
    private String footSubTitle;
    private String footTitle;
    private String from;
    private String imShareBizName;
    private String imShareContent;
    private Integer imShareCtaType;
    private String imShareDeepLink;
    private String imShareImage;
    private String imShareMessagePreview;
    private String imShareShortLink;
    private String imShareTicker;
    private String imShareTitle;
    private String imageUrl;
    private boolean isEnablePlanetShare;
    private boolean isSupportOrientationChange;
    private Boolean isTperson;
    private String planetShareModel;
    private String qRCode;
    private String tName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.xpW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BaseAShareBean._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntry() {
        return this.entry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFootSubTitle() {
        return this.footSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFootTitle() {
        return this.footTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImShareBizName() {
        return this.imShareBizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImShareContent() {
        return this.imShareContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getImShareCtaType() {
        return this.imShareCtaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImShareDeepLink() {
        return this.imShareDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImShareImage() {
        return this.imShareImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImShareMessagePreview() {
        return this.imShareMessagePreview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImShareShortLink() {
        return this.imShareShortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImShareTicker() {
        return this.imShareTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImShareTitle() {
        return this.imShareTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlanetShareModel() {
        return this.planetShareModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQRCode() {
        return this.qRCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTName() {
        return this.tName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEnablePlanetShare() {
        return this.isEnablePlanetShare;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportOrientationChange() {
        return this.isSupportOrientationChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isTperson() {
        return this.isTperson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnablePlanetShare(boolean z) {
        this.isEnablePlanetShare = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEntry(String str) {
        this.entry = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFootSubTitle(String str) {
        this.footSubTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFootTitle(String str) {
        this.footTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImShareBizName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imShareBizName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImShareContent(String str) {
        this.imShareContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImShareCtaType(Integer num) {
        this.imShareCtaType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImShareDeepLink(String str) {
        this.imShareDeepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImShareImage(String str) {
        this.imShareImage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImShareMessagePreview(String str) {
        this.imShareMessagePreview = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImShareShortLink(String str) {
        this.imShareShortLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImShareTicker(String str) {
        this.imShareTicker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImShareTitle(String str) {
        this.imShareTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlanetShareModel(String str) {
        this.planetShareModel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQRCode(String str) {
        this.qRCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportOrientationChange(boolean z) {
        this.isSupportOrientationChange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTName(String str) {
        this.tName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTperson(Boolean bool) {
        this.isTperson = bool;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BaseAShareBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) BaseAShareBean.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BaseAShareBean> serializer() {
            return EZpvd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseAShareBean() {
        boolean z;
        UserTradeConfigInfo userTradeConfigInfoGHZMYf;
        this.imageUrl = "";
        this.tName = "";
        this.isTperson = Boolean.FALSE;
        this.from = "";
        this.imShareBizName = "oktrade";
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (userTradeConfigInfoGHZMYf = interfaceC54581xNrOLrzqt.gHZMYf()) == null) {
            z = false;
        } else {
            z = true;
            if (userTradeConfigInfoGHZMYf.getRoleType() != 1) {
            }
        }
        this.isTperson = Boolean.valueOf(z);
    }

    public /* synthetic */ BaseAShareBean(int i, String str, String str2, Boolean bool, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, boolean z2, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        UserTradeConfigInfo userTradeConfigInfoGHZMYf;
        if ((i & 1) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str;
        }
        if ((i & 2) == 0) {
            this.tName = "";
        } else {
            this.tName = str2;
        }
        this.isTperson = (i & 4) == 0 ? Boolean.FALSE : bool;
        if ((i & 8) == 0) {
            this.entry = null;
        } else {
            this.entry = str3;
        }
        boolean z3 = false;
        if ((i & 16) == 0) {
            this.isSupportOrientationChange = false;
        } else {
            this.isSupportOrientationChange = z;
        }
        if ((i & 32) == 0) {
            this.from = "";
        } else {
            this.from = str4;
        }
        if ((i & 64) == 0) {
            this.qRCode = null;
        } else {
            this.qRCode = str5;
        }
        if ((i & 128) == 0) {
            this.footTitle = null;
        } else {
            this.footTitle = str6;
        }
        if ((i & 256) == 0) {
            this.footSubTitle = null;
        } else {
            this.footSubTitle = str7;
        }
        if ((i & 512) == 0) {
            this.imShareTitle = null;
        } else {
            this.imShareTitle = str8;
        }
        if ((i & 1024) == 0) {
            this.imShareContent = null;
        } else {
            this.imShareContent = str9;
        }
        if ((i & 2048) == 0) {
            this.imShareMessagePreview = null;
        } else {
            this.imShareMessagePreview = str10;
        }
        if ((i & 4096) == 0) {
            this.imShareImage = null;
        } else {
            this.imShareImage = str11;
        }
        if ((i & 8192) == 0) {
            this.imShareDeepLink = null;
        } else {
            this.imShareDeepLink = str12;
        }
        if ((i & 16384) == 0) {
            this.imShareShortLink = null;
        } else {
            this.imShareShortLink = str13;
        }
        if ((32768 & i) == 0) {
            this.imShareCtaType = null;
        } else {
            this.imShareCtaType = num;
        }
        this.imShareBizName = (65536 & i) == 0 ? "oktrade" : str14;
        if ((131072 & i) == 0) {
            this.imShareTicker = null;
        } else {
            this.imShareTicker = str15;
        }
        if ((262144 & i) == 0) {
            this.isEnablePlanetShare = false;
        } else {
            this.isEnablePlanetShare = z2;
        }
        if ((i & 524288) == 0) {
            this.planetShareModel = null;
        } else {
            this.planetShareModel = str16;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (userTradeConfigInfoGHZMYf = interfaceC54581xNrOLrzqt.gHZMYf()) != null && userTradeConfigInfoGHZMYf.getRoleType() == 1) {
            z3 = true;
        }
        this.isTperson = Boolean.valueOf(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new PolymorphicSerializer(C56524yIo.AEQbTJ(BaseAShareBean.class), new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(BaseAShareBean baseAShareBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) baseAShareBean.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, baseAShareBean.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) baseAShareBean.tName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, baseAShareBean.tName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(baseAShareBean.isTperson, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, baseAShareBean.isTperson);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || baseAShareBean.entry != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, baseAShareBean.entry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || baseAShareBean.isSupportOrientationChange) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, baseAShareBean.isSupportOrientationChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) baseAShareBean.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, baseAShareBean.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || baseAShareBean.qRCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, baseAShareBean.qRCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || baseAShareBean.footTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, baseAShareBean.footTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || baseAShareBean.footSubTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, baseAShareBean.footSubTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || baseAShareBean.imShareTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, baseAShareBean.imShareTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || baseAShareBean.imShareContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, baseAShareBean.imShareContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || baseAShareBean.imShareMessagePreview != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, baseAShareBean.imShareMessagePreview);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || baseAShareBean.imShareImage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, baseAShareBean.imShareImage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || baseAShareBean.imShareDeepLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, baseAShareBean.imShareDeepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || baseAShareBean.imShareShortLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, baseAShareBean.imShareShortLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || baseAShareBean.imShareCtaType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, baseAShareBean.imShareCtaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) baseAShareBean.imShareBizName, (Object) "oktrade")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, baseAShareBean.imShareBizName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || baseAShareBean.imShareTicker != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, baseAShareBean.imShareTicker);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || baseAShareBean.isEnablePlanetShare) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, baseAShareBean.isEnablePlanetShare);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && baseAShareBean.planetShareModel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, baseAShareBean.planetShareModel);
    }
}
