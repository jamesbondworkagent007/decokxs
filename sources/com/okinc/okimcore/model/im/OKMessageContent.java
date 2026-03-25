package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public abstract class OKMessageContent implements Parcelable {
    private String clientMessageId;
    private InHouseIMContentType contentType;
    private long destructTime;
    private boolean enableAppPushNotification;
    private String extra;
    private boolean isDestruct;
    private OKMentionedInfo mentionedInfo;
    private OKUserInfo userInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null};
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sOa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKMessageContent._init_$_anonymous_();
        }
    });

    @SerialName("clientMessageId")
    public static /* synthetic */ void getClientMessageId$annotations() {
    }

    @SerialName("burnDuration")
    public static /* synthetic */ void getDestructTime$annotations() {
    }

    @SerialName(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR)
    public static /* synthetic */ void getExtra$annotations() {
    }

    @SerialName("mentionedInfo")
    public static /* synthetic */ void getMentionedInfo$annotations() {
    }

    @SerialName("user")
    public static /* synthetic */ void getUserInfo$annotations() {
    }

    @SerialName("isBurnAfterRead")
    public static /* synthetic */ void isDestruct$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientMessageId() {
        return this.clientMessageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMContentType getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDestructTime() {
        return this.destructTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableAppPushNotification() {
        return this.enableAppPushNotification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMentionedInfo getMentionedInfo() {
        return this.mentionedInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKUserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDestruct() {
        return this.isDestruct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientMessageId(String str) {
        this.clientMessageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentType(InHouseIMContentType inHouseIMContentType) {
        this.contentType = inHouseIMContentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDestruct(boolean z) {
        this.isDestruct = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDestructTime(long j) {
        this.destructTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableAppPushNotification(boolean z) {
        this.enableAppPushNotification = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtra(String str) {
        this.extra = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMentionedInfo(OKMentionedInfo oKMentionedInfo) {
        this.mentionedInfo = oKMentionedInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserInfo(OKUserInfo oKUserInfo) {
        this.userInfo = oKUserInfo;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKMessageContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) OKMessageContent.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKMessageContent> serializer() {
            return OLrzqt();
        }
    }

    public /* synthetic */ OKMessageContent(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.clientMessageId = null;
        } else {
            this.clientMessageId = str;
        }
        if ((i & 2) == 0) {
            this.userInfo = null;
        } else {
            this.userInfo = oKUserInfo;
        }
        if ((i & 4) == 0) {
            this.mentionedInfo = null;
        } else {
            this.mentionedInfo = oKMentionedInfo;
        }
        if ((i & 8) == 0) {
            this.extra = null;
        } else {
            this.extra = str2;
        }
        if ((i & 16) == 0) {
            this.isDestruct = false;
        } else {
            this.isDestruct = z;
        }
        if ((i & 32) == 0) {
            this.destructTime = 0L;
        } else {
            this.destructTime = j;
        }
        if ((i & 64) == 0) {
            this.contentType = null;
        } else {
            this.contentType = inHouseIMContentType;
        }
        if ((i & 128) == 0) {
            this.enableAppPushNotification = true;
        } else {
            this.enableAppPushNotification = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new PolymorphicSerializer(C56524yIo.AEQbTJ(OKMessageContent.class), new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(OKMessageContent oKMessageContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || oKMessageContent.clientMessageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, oKMessageContent.clientMessageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || oKMessageContent.userInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, OKUserInfo$$serializer.INSTANCE, oKMessageContent.userInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || oKMessageContent.mentionedInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, OKMentionedInfo$$serializer.INSTANCE, oKMessageContent.mentionedInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || oKMessageContent.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, oKMessageContent.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || oKMessageContent.isDestruct) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, oKMessageContent.isDestruct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || oKMessageContent.destructTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, oKMessageContent.destructTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || oKMessageContent.contentType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], oKMessageContent.contentType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && oKMessageContent.enableAppPushNotification) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, oKMessageContent.enableAppPushNotification);
    }

    public OKMessageContent() {
        this.enableAppPushNotification = true;
    }

    public OKMessageContent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.enableAppPushNotification = true;
        this.userInfo = (OKUserInfo) parcel.readParcelable(OKUserInfo.class.getClassLoader());
        this.mentionedInfo = (OKMentionedInfo) parcel.readParcelable(OKMentionedInfo.class.getClassLoader());
        this.extra = parcel.readString();
        this.isDestruct = parcel.readInt() == 1;
        this.destructTime = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.userInfo, i);
        parcel.writeParcelable(this.mentionedInfo, i);
        parcel.writeString(this.extra);
        parcel.writeInt(this.isDestruct ? 1 : 0);
        parcel.writeLong(this.destructTime);
    }
}
