package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class SocialAccountChannel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SocialAccountChannel[] $VALUES;
    public static final SocialAccountChannel GOOGLE = new SocialAccountChannel("GOOGLE", 0);
    public static final SocialAccountChannel APPLE = new SocialAccountChannel("APPLE", 1);
    public static final SocialAccountChannel TELEGRAM = new SocialAccountChannel("TELEGRAM", 2);
    public static final SocialAccountChannel X = new SocialAccountChannel("X", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SocialAccountChannel[] $values() {
        return new SocialAccountChannel[]{GOOGLE, APPLE, TELEGRAM, X};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SocialAccountChannel> getEntries() {
        return $ENTRIES;
    }

    private SocialAccountChannel(String str, int i) {
    }

    static {
        SocialAccountChannel[] socialAccountChannelArr$values = $values();
        $VALUES = socialAccountChannelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(socialAccountChannelArr$values);
    }

    public static SocialAccountChannel valueOf(String str) {
        return (SocialAccountChannel) Enum.valueOf(SocialAccountChannel.class, str);
    }

    public static SocialAccountChannel[] values() {
        return (SocialAccountChannel[]) $VALUES.clone();
    }
}
