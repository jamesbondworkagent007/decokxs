package com.okinc.share.platforms;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class SharePlatform implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SharePlatform[] $VALUES;
    public static final CREATOR CREATOR;
    public static final SharePlatform DISCORD;
    public static final SharePlatform FACEBOOK;
    public static final SharePlatform FACEBOOK_MESSENGER;
    public static final SharePlatform INSTAGRAM;
    public static final SharePlatform INVITE_CONTACTS;
    public static final SharePlatform KAKAO;
    public static final SharePlatform LINE;
    public static final SharePlatform LINK;
    public static final SharePlatform MORE;
    public static final SharePlatform QQ;
    public static final SharePlatform QRCODE;
    public static final SharePlatform SAVE_IMAGE;
    public static final SharePlatform SHARE_TO_IM;
    public static final SharePlatform SHARE_TO_PLANET;
    public static final SharePlatform SINA_WEIBO;
    public static final SharePlatform SMS;
    public static final SharePlatform TELEGRAM;
    public static final SharePlatform TWITTER;
    public static final SharePlatform VIBER;
    public static final SharePlatform VK;
    public static final SharePlatform WECHAT;
    public static final SharePlatform WECHAT_MOMENTS;
    public static final SharePlatform WHATS_APP;
    public static final SharePlatform ZALO;
    private final PlatformCategory platformCategory;
    private final int platformId;
    private final String platformName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SharePlatform[] $values() {
        return new SharePlatform[]{WECHAT, WECHAT_MOMENTS, SMS, QQ, TELEGRAM, TWITTER, FACEBOOK, SINA_WEIBO, WHATS_APP, FACEBOOK_MESSENGER, INSTAGRAM, LINE, KAKAO, DISCORD, VIBER, ZALO, VK, QRCODE, SAVE_IMAGE, LINK, INVITE_CONTACTS, SHARE_TO_IM, SHARE_TO_PLANET, MORE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SharePlatform> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformCategory getPlatformCategory() {
        return this.platformCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPlatformId() {
        return this.platformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    private SharePlatform(String str, int i, String str2, int i2, PlatformCategory platformCategory) {
        this.platformName = str2;
        this.platformId = i2;
        this.platformCategory = platformCategory;
    }

    static {
        PlatformCategory platformCategory = PlatformCategory.SOCIAL;
        WECHAT = new SharePlatform("WECHAT", 0, "Wechat", 9, platformCategory);
        WECHAT_MOMENTS = new SharePlatform("WECHAT_MOMENTS", 1, "WechatMoments", 7, platformCategory);
        SMS = new SharePlatform("SMS", 2, "ShortMessage", 103, platformCategory);
        QQ = new SharePlatform("QQ", 3, "QQ", 16, platformCategory);
        TELEGRAM = new SharePlatform("TELEGRAM", 4, "Telegram", 2, platformCategory);
        TWITTER = new SharePlatform("TWITTER", 5, "Twitter", 1, platformCategory);
        FACEBOOK = new SharePlatform("FACEBOOK", 6, "Facebook", 4, platformCategory);
        SINA_WEIBO = new SharePlatform("SINA_WEIBO", 7, "SinaWeibo", 8, platformCategory);
        WHATS_APP = new SharePlatform("WHATS_APP", 8, "WhatsApp", 3, platformCategory);
        FACEBOOK_MESSENGER = new SharePlatform("FACEBOOK_MESSENGER", 9, "FacebookMessenger", 10, platformCategory);
        INSTAGRAM = new SharePlatform("INSTAGRAM", 10, "Instagram", 6, platformCategory);
        LINE = new SharePlatform("LINE", 11, "Line", 14, platformCategory);
        KAKAO = new SharePlatform("KAKAO", 12, "Kakao", 12, platformCategory);
        DISCORD = new SharePlatform("DISCORD", 13, "Discord", 11, platformCategory);
        VIBER = new SharePlatform("VIBER", 14, "Viber", 13, platformCategory);
        ZALO = new SharePlatform("ZALO", 15, "Zalo", 15, platformCategory);
        VK = new SharePlatform("VK", 16, "VK", 17, platformCategory);
        PlatformCategory platformCategory2 = PlatformCategory.FUNCTION;
        QRCODE = new SharePlatform("QRCODE", 17, "Qrcode", -1, platformCategory2);
        SAVE_IMAGE = new SharePlatform("SAVE_IMAGE", 18, "save_img", 99, platformCategory2);
        LINK = new SharePlatform("LINK", 19, "link", 100, platformCategory2);
        PlatformCategory platformCategory3 = PlatformCategory.INTERNAL;
        INVITE_CONTACTS = new SharePlatform("INVITE_CONTACTS", 20, "invite_contacts", -1, platformCategory3);
        SHARE_TO_IM = new SharePlatform("SHARE_TO_IM", 21, OtcExtraKeys.IM, 102, platformCategory3);
        SHARE_TO_PLANET = new SharePlatform("SHARE_TO_PLANET", 22, "Planet", 104, platformCategory3);
        MORE = new SharePlatform("MORE", 23, "more", 101, platformCategory2);
        SharePlatform[] sharePlatformArr$values = $values();
        $VALUES = sharePlatformArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sharePlatformArr$values);
        CREATOR = new CREATOR(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.platformName);
        parcel.writeInt(this.platformId);
    }

    public static final class CREATOR implements Parcelable.Creator<SharePlatform> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.platforms.SharePlatform.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final SharePlatform valueOf(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            for (SharePlatform sharePlatform : SharePlatform.values()) {
                if (Intrinsics.EZpvd((Object) sharePlatform.getPlatformName(), (Object) str)) {
                    return sharePlatform;
                }
            }
            return null;
        }

        public final SharePlatform valueOf(int i) {
            for (SharePlatform sharePlatform : SharePlatform.values()) {
                if (sharePlatform.getPlatformId() == i) {
                    return sharePlatform;
                }
            }
            return null;
        }

        public final boolean isValid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return valueOf(str) != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharePlatform createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readString();
            SharePlatform sharePlatformValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(sharePlatformValueOf);
            return sharePlatformValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharePlatform[] newArray(int i) {
            return new SharePlatform[i];
        }
    }

    public static SharePlatform valueOf(String str) {
        return (SharePlatform) Enum.valueOf(SharePlatform.class, str);
    }

    public static SharePlatform[] values() {
        return (SharePlatform[]) $VALUES.clone();
    }
}
