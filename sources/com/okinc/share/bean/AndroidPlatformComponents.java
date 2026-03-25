package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AndroidPlatformComponents implements Parcelable {
    private final PlatformComponentInfo discord;
    private final PlatformComponentInfo facebook;
    private final PlatformComponentInfo facebookMessenger;
    private final PlatformComponentInfo instagram;
    private final PlatformComponentInfo kaokao;
    private final PlatformComponentInfo line;
    private final PlatformComponentInfo qq;
    private final PlatformComponentInfo sinaWeibo;
    private final PlatformComponentInfo telegram;
    private final PlatformComponentInfo twitter;
    private final PlatformComponentInfo viber;
    private final PlatformComponentInfo vk;
    private final PlatformComponentInfo wechat;
    private final PlatformComponentInfo wechatMoments;
    private final PlatformComponentInfo whatsapp;
    private final PlatformComponentInfo zalo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AndroidPlatformComponents> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AndroidPlatformComponents> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AndroidPlatformComponents createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AndroidPlatformComponents(parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PlatformComponentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PlatformComponentInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AndroidPlatformComponents[] newArray(int i) {
            return new AndroidPlatformComponents[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AndroidPlatformComponents() {
        this((PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, (PlatformComponentInfo) null, 65535, (DefaultConstructorMarker) null);
    }

    @SerialName("11")
    public static /* synthetic */ void getDiscord$annotations() {
    }

    @SerialName("4")
    public static /* synthetic */ void getFacebook$annotations() {
    }

    @SerialName("10")
    public static /* synthetic */ void getFacebookMessenger$annotations() {
    }

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static /* synthetic */ void getInstagram$annotations() {
    }

    @SerialName("12")
    public static /* synthetic */ void getKaokao$annotations() {
    }

    @SerialName("14")
    public static /* synthetic */ void getLine$annotations() {
    }

    @SerialName("16")
    public static /* synthetic */ void getQq$annotations() {
    }

    @SerialName("8")
    public static /* synthetic */ void getSinaWeibo$annotations() {
    }

    @SerialName("2")
    public static /* synthetic */ void getTelegram$annotations() {
    }

    @SerialName("1")
    public static /* synthetic */ void getTwitter$annotations() {
    }

    @SerialName("13")
    public static /* synthetic */ void getViber$annotations() {
    }

    @SerialName("17")
    public static /* synthetic */ void getVk$annotations() {
    }

    @SerialName("9")
    public static /* synthetic */ void getWechat$annotations() {
    }

    @SerialName("7")
    public static /* synthetic */ void getWechatMoments$annotations() {
    }

    @SerialName("3")
    public static /* synthetic */ void getWhatsapp$annotations() {
    }

    @SerialName("15")
    public static /* synthetic */ void getZalo$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component1() {
        return this.twitter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component10() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component11() {
        return this.kaokao;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component12() {
        return this.viber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component13() {
        return this.line;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component14() {
        return this.zalo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component15() {
        return this.qq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component16() {
        return this.vk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component2() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component3() {
        return this.whatsapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component4() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component5() {
        return this.instagram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component6() {
        return this.wechatMoments;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component7() {
        return this.sinaWeibo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component8() {
        return this.wechat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo component9() {
        return this.facebookMessenger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AndroidPlatformComponents copy(PlatformComponentInfo platformComponentInfo, PlatformComponentInfo platformComponentInfo2, PlatformComponentInfo platformComponentInfo3, PlatformComponentInfo platformComponentInfo4, PlatformComponentInfo platformComponentInfo5, PlatformComponentInfo platformComponentInfo6, PlatformComponentInfo platformComponentInfo7, PlatformComponentInfo platformComponentInfo8, PlatformComponentInfo platformComponentInfo9, PlatformComponentInfo platformComponentInfo10, PlatformComponentInfo platformComponentInfo11, PlatformComponentInfo platformComponentInfo12, PlatformComponentInfo platformComponentInfo13, PlatformComponentInfo platformComponentInfo14, PlatformComponentInfo platformComponentInfo15, PlatformComponentInfo platformComponentInfo16) {
        return new AndroidPlatformComponents(platformComponentInfo, platformComponentInfo2, platformComponentInfo3, platformComponentInfo4, platformComponentInfo5, platformComponentInfo6, platformComponentInfo7, platformComponentInfo8, platformComponentInfo9, platformComponentInfo10, platformComponentInfo11, platformComponentInfo12, platformComponentInfo13, platformComponentInfo14, platformComponentInfo15, platformComponentInfo16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidPlatformComponents)) {
            return false;
        }
        AndroidPlatformComponents androidPlatformComponents = (AndroidPlatformComponents) obj;
        return Intrinsics.EZpvd(this.twitter, androidPlatformComponents.twitter) && Intrinsics.EZpvd(this.telegram, androidPlatformComponents.telegram) && Intrinsics.EZpvd(this.whatsapp, androidPlatformComponents.whatsapp) && Intrinsics.EZpvd(this.facebook, androidPlatformComponents.facebook) && Intrinsics.EZpvd(this.instagram, androidPlatformComponents.instagram) && Intrinsics.EZpvd(this.wechatMoments, androidPlatformComponents.wechatMoments) && Intrinsics.EZpvd(this.sinaWeibo, androidPlatformComponents.sinaWeibo) && Intrinsics.EZpvd(this.wechat, androidPlatformComponents.wechat) && Intrinsics.EZpvd(this.facebookMessenger, androidPlatformComponents.facebookMessenger) && Intrinsics.EZpvd(this.discord, androidPlatformComponents.discord) && Intrinsics.EZpvd(this.kaokao, androidPlatformComponents.kaokao) && Intrinsics.EZpvd(this.viber, androidPlatformComponents.viber) && Intrinsics.EZpvd(this.line, androidPlatformComponents.line) && Intrinsics.EZpvd(this.zalo, androidPlatformComponents.zalo) && Intrinsics.EZpvd(this.qq, androidPlatformComponents.qq) && Intrinsics.EZpvd(this.vk, androidPlatformComponents.vk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getDiscord() {
        return this.discord;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getFacebook() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getFacebookMessenger() {
        return this.facebookMessenger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getInstagram() {
        return this.instagram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getKaokao() {
        return this.kaokao;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getLine() {
        return this.line;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getQq() {
        return this.qq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getSinaWeibo() {
        return this.sinaWeibo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getTelegram() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getTwitter() {
        return this.twitter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getViber() {
        return this.viber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getVk() {
        return this.vk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getWechat() {
        return this.wechat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getWechatMoments() {
        return this.wechatMoments;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getWhatsapp() {
        return this.whatsapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformComponentInfo getZalo() {
        return this.zalo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PlatformComponentInfo platformComponentInfo = this.twitter;
        int iHashCode = platformComponentInfo == null ? 0 : platformComponentInfo.hashCode();
        PlatformComponentInfo platformComponentInfo2 = this.telegram;
        int iHashCode2 = platformComponentInfo2 == null ? 0 : platformComponentInfo2.hashCode();
        PlatformComponentInfo platformComponentInfo3 = this.whatsapp;
        int iHashCode3 = platformComponentInfo3 == null ? 0 : platformComponentInfo3.hashCode();
        PlatformComponentInfo platformComponentInfo4 = this.facebook;
        int iHashCode4 = platformComponentInfo4 == null ? 0 : platformComponentInfo4.hashCode();
        PlatformComponentInfo platformComponentInfo5 = this.instagram;
        int iHashCode5 = platformComponentInfo5 == null ? 0 : platformComponentInfo5.hashCode();
        PlatformComponentInfo platformComponentInfo6 = this.wechatMoments;
        int iHashCode6 = platformComponentInfo6 == null ? 0 : platformComponentInfo6.hashCode();
        PlatformComponentInfo platformComponentInfo7 = this.sinaWeibo;
        int iHashCode7 = platformComponentInfo7 == null ? 0 : platformComponentInfo7.hashCode();
        PlatformComponentInfo platformComponentInfo8 = this.wechat;
        int iHashCode8 = platformComponentInfo8 == null ? 0 : platformComponentInfo8.hashCode();
        PlatformComponentInfo platformComponentInfo9 = this.facebookMessenger;
        int iHashCode9 = platformComponentInfo9 == null ? 0 : platformComponentInfo9.hashCode();
        PlatformComponentInfo platformComponentInfo10 = this.discord;
        int iHashCode10 = platformComponentInfo10 == null ? 0 : platformComponentInfo10.hashCode();
        PlatformComponentInfo platformComponentInfo11 = this.kaokao;
        int iHashCode11 = platformComponentInfo11 == null ? 0 : platformComponentInfo11.hashCode();
        PlatformComponentInfo platformComponentInfo12 = this.viber;
        int iHashCode12 = platformComponentInfo12 == null ? 0 : platformComponentInfo12.hashCode();
        PlatformComponentInfo platformComponentInfo13 = this.line;
        int iHashCode13 = platformComponentInfo13 == null ? 0 : platformComponentInfo13.hashCode();
        PlatformComponentInfo platformComponentInfo14 = this.zalo;
        int iHashCode14 = platformComponentInfo14 == null ? 0 : platformComponentInfo14.hashCode();
        PlatformComponentInfo platformComponentInfo15 = this.qq;
        int iHashCode15 = platformComponentInfo15 == null ? 0 : platformComponentInfo15.hashCode();
        PlatformComponentInfo platformComponentInfo16 = this.vk;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (platformComponentInfo16 == null ? 0 : platformComponentInfo16.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AndroidPlatformComponents(twitter=" + this.twitter + ", telegram=" + this.telegram + ", whatsapp=" + this.whatsapp + ", facebook=" + this.facebook + ", instagram=" + this.instagram + ", wechatMoments=" + this.wechatMoments + ", sinaWeibo=" + this.sinaWeibo + ", wechat=" + this.wechat + ", facebookMessenger=" + this.facebookMessenger + ", discord=" + this.discord + ", kaokao=" + this.kaokao + ", viber=" + this.viber + ", line=" + this.line + ", zalo=" + this.zalo + ", qq=" + this.qq + ", vk=" + this.vk + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PlatformComponentInfo platformComponentInfo = this.twitter;
        if (platformComponentInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo2 = this.telegram;
        if (platformComponentInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo2.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo3 = this.whatsapp;
        if (platformComponentInfo3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo3.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo4 = this.facebook;
        if (platformComponentInfo4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo4.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo5 = this.instagram;
        if (platformComponentInfo5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo5.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo6 = this.wechatMoments;
        if (platformComponentInfo6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo6.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo7 = this.sinaWeibo;
        if (platformComponentInfo7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo7.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo8 = this.wechat;
        if (platformComponentInfo8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo8.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo9 = this.facebookMessenger;
        if (platformComponentInfo9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo9.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo10 = this.discord;
        if (platformComponentInfo10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo10.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo11 = this.kaokao;
        if (platformComponentInfo11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo11.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo12 = this.viber;
        if (platformComponentInfo12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo12.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo13 = this.line;
        if (platformComponentInfo13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo13.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo14 = this.zalo;
        if (platformComponentInfo14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo14.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo15 = this.qq;
        if (platformComponentInfo15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo15.writeToParcel(parcel, i);
        }
        PlatformComponentInfo platformComponentInfo16 = this.vk;
        if (platformComponentInfo16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            platformComponentInfo16.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.AndroidPlatformComponents.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AndroidPlatformComponents> serializer() {
            return AndroidPlatformComponents$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AndroidPlatformComponents(int i, PlatformComponentInfo platformComponentInfo, PlatformComponentInfo platformComponentInfo2, PlatformComponentInfo platformComponentInfo3, PlatformComponentInfo platformComponentInfo4, PlatformComponentInfo platformComponentInfo5, PlatformComponentInfo platformComponentInfo6, PlatformComponentInfo platformComponentInfo7, PlatformComponentInfo platformComponentInfo8, PlatformComponentInfo platformComponentInfo9, PlatformComponentInfo platformComponentInfo10, PlatformComponentInfo platformComponentInfo11, PlatformComponentInfo platformComponentInfo12, PlatformComponentInfo platformComponentInfo13, PlatformComponentInfo platformComponentInfo14, PlatformComponentInfo platformComponentInfo15, PlatformComponentInfo platformComponentInfo16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.twitter = null;
        } else {
            this.twitter = platformComponentInfo;
        }
        if ((i & 2) == 0) {
            this.telegram = null;
        } else {
            this.telegram = platformComponentInfo2;
        }
        if ((i & 4) == 0) {
            this.whatsapp = null;
        } else {
            this.whatsapp = platformComponentInfo3;
        }
        if ((i & 8) == 0) {
            this.facebook = null;
        } else {
            this.facebook = platformComponentInfo4;
        }
        if ((i & 16) == 0) {
            this.instagram = null;
        } else {
            this.instagram = platformComponentInfo5;
        }
        if ((i & 32) == 0) {
            this.wechatMoments = null;
        } else {
            this.wechatMoments = platformComponentInfo6;
        }
        if ((i & 64) == 0) {
            this.sinaWeibo = null;
        } else {
            this.sinaWeibo = platformComponentInfo7;
        }
        if ((i & 128) == 0) {
            this.wechat = null;
        } else {
            this.wechat = platformComponentInfo8;
        }
        if ((i & 256) == 0) {
            this.facebookMessenger = null;
        } else {
            this.facebookMessenger = platformComponentInfo9;
        }
        if ((i & 512) == 0) {
            this.discord = null;
        } else {
            this.discord = platformComponentInfo10;
        }
        if ((i & 1024) == 0) {
            this.kaokao = null;
        } else {
            this.kaokao = platformComponentInfo11;
        }
        if ((i & 2048) == 0) {
            this.viber = null;
        } else {
            this.viber = platformComponentInfo12;
        }
        if ((i & 4096) == 0) {
            this.line = null;
        } else {
            this.line = platformComponentInfo13;
        }
        if ((i & 8192) == 0) {
            this.zalo = null;
        } else {
            this.zalo = platformComponentInfo14;
        }
        if ((i & 16384) == 0) {
            this.qq = null;
        } else {
            this.qq = platformComponentInfo15;
        }
        if ((i & 32768) == 0) {
            this.vk = null;
        } else {
            this.vk = platformComponentInfo16;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(AndroidPlatformComponents androidPlatformComponents, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || androidPlatformComponents.twitter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.twitter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || androidPlatformComponents.telegram != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.telegram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || androidPlatformComponents.whatsapp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.whatsapp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || androidPlatformComponents.facebook != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.facebook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || androidPlatformComponents.instagram != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.instagram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || androidPlatformComponents.wechatMoments != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.wechatMoments);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || androidPlatformComponents.sinaWeibo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.sinaWeibo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || androidPlatformComponents.wechat != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.wechat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || androidPlatformComponents.facebookMessenger != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.facebookMessenger);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || androidPlatformComponents.discord != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.discord);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || androidPlatformComponents.kaokao != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.kaokao);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || androidPlatformComponents.viber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.viber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || androidPlatformComponents.line != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.line);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || androidPlatformComponents.zalo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.zalo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || androidPlatformComponents.qq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.qq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && androidPlatformComponents.vk == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, PlatformComponentInfo$$serializer.INSTANCE, androidPlatformComponents.vk);
    }

    public AndroidPlatformComponents(PlatformComponentInfo platformComponentInfo, PlatformComponentInfo platformComponentInfo2, PlatformComponentInfo platformComponentInfo3, PlatformComponentInfo platformComponentInfo4, PlatformComponentInfo platformComponentInfo5, PlatformComponentInfo platformComponentInfo6, PlatformComponentInfo platformComponentInfo7, PlatformComponentInfo platformComponentInfo8, PlatformComponentInfo platformComponentInfo9, PlatformComponentInfo platformComponentInfo10, PlatformComponentInfo platformComponentInfo11, PlatformComponentInfo platformComponentInfo12, PlatformComponentInfo platformComponentInfo13, PlatformComponentInfo platformComponentInfo14, PlatformComponentInfo platformComponentInfo15, PlatformComponentInfo platformComponentInfo16) {
        this.twitter = platformComponentInfo;
        this.telegram = platformComponentInfo2;
        this.whatsapp = platformComponentInfo3;
        this.facebook = platformComponentInfo4;
        this.instagram = platformComponentInfo5;
        this.wechatMoments = platformComponentInfo6;
        this.sinaWeibo = platformComponentInfo7;
        this.wechat = platformComponentInfo8;
        this.facebookMessenger = platformComponentInfo9;
        this.discord = platformComponentInfo10;
        this.kaokao = platformComponentInfo11;
        this.viber = platformComponentInfo12;
        this.line = platformComponentInfo13;
        this.zalo = platformComponentInfo14;
        this.qq = platformComponentInfo15;
        this.vk = platformComponentInfo16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r18v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r19v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x0012: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r20v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x001a: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r21v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x0022: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r22v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x002a: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r23v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x0032: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r24v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x003a: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r25v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x0042: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r26v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x004a: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r27v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x0052: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r28v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x005a: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r29v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x0062: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r30v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x006a: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r31v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x0072: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r32v0 com.okinc.share.bean.PlatformComponentInfo))
  (wrap:com.okinc.share.bean.PlatformComponentInfo:?: TERNARY null = ((wrap:int:0x007d: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.PlatformComponentInfo) : (r33v0 com.okinc.share.bean.PlatformComponentInfo))
 A[MD:(com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo):void (m)] (LINE:18) call: com.okinc.share.bean.AndroidPlatformComponents.<init>(com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo, com.okinc.share.bean.PlatformComponentInfo):void type: THIS */
    public /* synthetic */ AndroidPlatformComponents(PlatformComponentInfo platformComponentInfo, PlatformComponentInfo platformComponentInfo2, PlatformComponentInfo platformComponentInfo3, PlatformComponentInfo platformComponentInfo4, PlatformComponentInfo platformComponentInfo5, PlatformComponentInfo platformComponentInfo6, PlatformComponentInfo platformComponentInfo7, PlatformComponentInfo platformComponentInfo8, PlatformComponentInfo platformComponentInfo9, PlatformComponentInfo platformComponentInfo10, PlatformComponentInfo platformComponentInfo11, PlatformComponentInfo platformComponentInfo12, PlatformComponentInfo platformComponentInfo13, PlatformComponentInfo platformComponentInfo14, PlatformComponentInfo platformComponentInfo15, PlatformComponentInfo platformComponentInfo16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : platformComponentInfo, (i & 2) != 0 ? null : platformComponentInfo2, (i & 4) != 0 ? null : platformComponentInfo3, (i & 8) != 0 ? null : platformComponentInfo4, (i & 16) != 0 ? null : platformComponentInfo5, (i & 32) != 0 ? null : platformComponentInfo6, (i & 64) != 0 ? null : platformComponentInfo7, (i & 128) != 0 ? null : platformComponentInfo8, (i & 256) != 0 ? null : platformComponentInfo9, (i & 512) != 0 ? null : platformComponentInfo10, (i & 1024) != 0 ? null : platformComponentInfo11, (i & 2048) != 0 ? null : platformComponentInfo12, (i & 4096) != 0 ? null : platformComponentInfo13, (i & 8192) != 0 ? null : platformComponentInfo14, (i & 16384) != 0 ? null : platformComponentInfo15, (i & 32768) != 0 ? null : platformComponentInfo16);
    }
}
