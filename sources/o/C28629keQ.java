package o;

import com.okinc.business.market.features.meme.data.model.DiscordMediaWsData;
import com.okinc.business.market.features.meme.data.model.FacebookMediaWsData;
import com.okinc.business.market.features.meme.data.model.InstagramMediaWsData;
import com.okinc.business.market.features.meme.data.model.MediaWsData;
import com.okinc.business.market.features.meme.data.model.TikTokMediaWsData;
import com.okinc.business.market.features.meme.data.model.TwitchMediaWsData;
import com.okinc.business.market.features.meme.data.model.XMediaWsData;
import com.okinc.business.market.features.meme.data.model.YoutubeMediaWsData;
import com.okinc.business.market.features.meme.domain.model.DiscordMedia;
import com.okinc.business.market.features.meme.domain.model.FacebookMedia;
import com.okinc.business.market.features.meme.domain.model.InstagramMedia;
import com.okinc.business.market.features.meme.domain.model.Media;
import com.okinc.business.market.features.meme.domain.model.TikTokMedia;
import com.okinc.business.market.features.meme.domain.model.TwitchMedia;
import com.okinc.business.market.features.meme.domain.model.XMedia;
import com.okinc.business.market.features.meme.domain.model.YoutubeMedia;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28629keQ {
    public static final C28629keQ KWHzl = new C28629keQ();

    private C28629keQ() {
    }

    public final Media copydefault(@NotNull MediaWsData mediaWsData) {
        Intrinsics.checkNotNullParameter(mediaWsData, "");
        java.lang.String telegram = mediaWsData.getTelegram();
        java.lang.String website = mediaWsData.getWebsite();
        XMediaWsData x = mediaWsData.getX();
        XMedia xMedia = x != null ? new XMedia(x.getUrl(), x.getType(), x.getXTime(), x.getXrenameCnt()) : null;
        YoutubeMediaWsData youtube = mediaWsData.getYoutube();
        YoutubeMedia youtubeMedia = youtube != null ? new YoutubeMedia(youtube.getUrl(), youtube.getType()) : null;
        FacebookMediaWsData facebook = mediaWsData.getFacebook();
        FacebookMedia facebookMedia = facebook != null ? new FacebookMedia(facebook.getUrl(), facebook.getType()) : null;
        TwitchMediaWsData twitch = mediaWsData.getTwitch();
        TwitchMedia twitchMedia = twitch != null ? new TwitchMedia(twitch.getUrl(), twitch.getType()) : null;
        InstagramMediaWsData instagram = mediaWsData.getInstagram();
        InstagramMedia instagramMedia = instagram != null ? new InstagramMedia(instagram.getUrl(), instagram.getType()) : null;
        TikTokMediaWsData tiktok = mediaWsData.getTiktok();
        TikTokMedia tikTokMedia = tiktok != null ? new TikTokMedia(tiktok.getUrl(), tiktok.getType()) : null;
        DiscordMediaWsData discord = mediaWsData.getDiscord();
        return new Media(telegram, website, xMedia, youtubeMedia, facebookMedia, twitchMedia, instagramMedia, tikTokMedia, discord != null ? new DiscordMedia(discord.getUrl(), discord.getType()) : null);
    }
}
