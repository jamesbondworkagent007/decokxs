package uniffi.growth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class SharePlatform {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SharePlatform[] $VALUES;
    private final int value;
    public static final SharePlatform WECHAT = new SharePlatform("WECHAT", 0, 9);
    public static final SharePlatform WECHAT_MOMENTS = new SharePlatform("WECHAT_MOMENTS", 1, 7);
    public static final SharePlatform SMS = new SharePlatform("SMS", 2, 103);
    public static final SharePlatform QQ = new SharePlatform("QQ", 3, 16);
    public static final SharePlatform TELEGRAM = new SharePlatform("TELEGRAM", 4, 2);
    public static final SharePlatform TWITTER = new SharePlatform("TWITTER", 5, 1);
    public static final SharePlatform FACEBOOK = new SharePlatform("FACEBOOK", 6, 4);
    public static final SharePlatform SINA_WEIBO = new SharePlatform("SINA_WEIBO", 7, 8);
    public static final SharePlatform WHATS_APP = new SharePlatform("WHATS_APP", 8, 3);
    public static final SharePlatform FACEBOOK_MESSENGER = new SharePlatform("FACEBOOK_MESSENGER", 9, 10);
    public static final SharePlatform INSTAGRAM = new SharePlatform("INSTAGRAM", 10, 6);
    public static final SharePlatform LINE = new SharePlatform("LINE", 11, 14);
    public static final SharePlatform KAKAO = new SharePlatform("KAKAO", 12, 12);
    public static final SharePlatform DISCORD = new SharePlatform("DISCORD", 13, 11);
    public static final SharePlatform VIBER = new SharePlatform("VIBER", 14, 13);
    public static final SharePlatform ZALO = new SharePlatform("ZALO", 15, 15);
    public static final SharePlatform VK = new SharePlatform("VK", 16, 17);
    public static final SharePlatform QRCODE = new SharePlatform("QRCODE", 17, -1);
    public static final SharePlatform SAVE_IMAGE = new SharePlatform("SAVE_IMAGE", 18, 99);
    public static final SharePlatform COPY_LINK = new SharePlatform("COPY_LINK", 19, 100);
    public static final SharePlatform INVITE_CONTACTS = new SharePlatform("INVITE_CONTACTS", 20, -2);
    public static final SharePlatform SHARE_TO_IM = new SharePlatform("SHARE_TO_IM", 21, 102);
    public static final SharePlatform SHARE_TO_PLANET = new SharePlatform("SHARE_TO_PLANET", 22, 104);
    public static final SharePlatform MORE = new SharePlatform("MORE", 23, 101);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SharePlatform[] $values() {
        return new SharePlatform[]{WECHAT, WECHAT_MOMENTS, SMS, QQ, TELEGRAM, TWITTER, FACEBOOK, SINA_WEIBO, WHATS_APP, FACEBOOK_MESSENGER, INSTAGRAM, LINE, KAKAO, DISCORD, VIBER, ZALO, VK, QRCODE, SAVE_IMAGE, COPY_LINK, INVITE_CONTACTS, SHARE_TO_IM, SHARE_TO_PLANET, MORE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SharePlatform> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SharePlatform(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SharePlatform[] sharePlatformArr$values = $values();
        $VALUES = sharePlatformArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sharePlatformArr$values);
    }

    public static SharePlatform valueOf(String str) {
        return (SharePlatform) Enum.valueOf(SharePlatform.class, str);
    }

    public static SharePlatform[] values() {
        return (SharePlatform[]) $VALUES.clone();
    }
}
