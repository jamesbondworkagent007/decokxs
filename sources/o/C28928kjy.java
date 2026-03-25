package o;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.meme.data.model.DiscordMediaWsData;
import com.okinc.business.market.features.meme.data.model.FacebookMediaWsData;
import com.okinc.business.market.features.meme.data.model.InstagramMediaWsData;
import com.okinc.business.market.features.meme.data.model.MediaWsData;
import com.okinc.business.market.features.meme.data.model.PublicMetricsWsData;
import com.okinc.business.market.features.meme.data.model.SameCarUpdateWsData;
import com.okinc.business.market.features.meme.data.model.TikTokMediaWsData;
import com.okinc.business.market.features.meme.data.model.TwitchMediaWsData;
import com.okinc.business.market.features.meme.data.model.XMediaWsData;
import com.okinc.business.market.features.meme.data.model.XPostType;
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
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28928kjy {
    public static final C28928kjy AEQbTJ = new C28928kjy();

    private C28928kjy() {
    }

    public static /* synthetic */ C28635keW updateMemePumpToken$default(C28928kjy c28928kjy, PublicMetricsWsData publicMetricsWsData, C28635keW c28635keW, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c28928kjy.AEQbTJ(publicMetricsWsData, c28635keW, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C28635keW AEQbTJ(@NotNull PublicMetricsWsData publicMetricsWsData, @NotNull C28635keW c28635keW, boolean z) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(publicMetricsWsData, "");
        Intrinsics.checkNotNullParameter(c28635keW, "");
        java.lang.String txs1h = publicMetricsWsData.getTxs1h();
        if (txs1h.length() <= 0) {
            txs1h = null;
        }
        if (txs1h == null) {
            txs1h = c28635keW.ORxRYg();
        }
        java.lang.String str = txs1h;
        java.lang.String txsb1h = publicMetricsWsData.getTxsb1h();
        if (txsb1h.length() <= 0) {
            txsb1h = null;
        }
        if (txsb1h == null) {
            txsb1h = c28635keW.QOLQEE();
        }
        java.lang.String str2 = txsb1h;
        java.lang.String txss1h = publicMetricsWsData.getTxss1h();
        if (txss1h.length() <= 0) {
            txss1h = null;
        }
        if (txss1h == null) {
            txss1h = c28635keW.QKVWgx();
        }
        java.lang.String str3 = txss1h;
        java.lang.String vol1h = publicMetricsWsData.getVol1h();
        if (vol1h.length() <= 0) {
            vol1h = null;
        }
        if (vol1h == null) {
            vol1h = c28635keW.QVAiDq();
        }
        java.lang.String str4 = vol1h;
        java.lang.String mcap = publicMetricsWsData.getMcap();
        if (mcap.length() <= 0) {
            mcap = null;
        }
        if (mcap == null) {
            mcap = c28635keW.values();
        }
        java.lang.String str5 = mcap;
        java.lang.String hold = publicMetricsWsData.getHold();
        if (hold.length() <= 0) {
            hold = null;
        }
        if (hold == null) {
            hold = c28635keW.DbNXlk();
        }
        java.lang.String str6 = hold;
        java.lang.String logo = publicMetricsWsData.getLogo();
        if (logo.length() <= 0) {
            logo = null;
        }
        if (logo == null) {
            logo = c28635keW.AxsJAY();
        }
        java.lang.String str7 = logo;
        java.lang.String strSSMYrx = (!Intrinsics.EZpvd((java.lang.Object) publicMetricsWsData.getLogoPass(), (java.lang.Object) "0") || publicMetricsWsData.getLogo().length() <= 0) ? c28635keW.sSMYrx() : "";
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) publicMetricsWsData.getLogoPass(), (java.lang.Object) "0");
        java.lang.String bigLogo = publicMetricsWsData.getBigLogo();
        if (bigLogo.length() <= 0) {
            bigLogo = null;
        }
        if (bigLogo == null) {
            bigLogo = c28635keW.OLrzqt();
        }
        java.lang.String str8 = bigLogo;
        java.lang.String name = publicMetricsWsData.getName();
        if (name.length() <= 0) {
            name = null;
        }
        if (name == null) {
            name = c28635keW.zuBGHE();
        }
        java.lang.String str9 = name;
        java.lang.String tokenSymbol = publicMetricsWsData.getTokenSymbol();
        if (tokenSymbol.length() <= 0) {
            tokenSymbol = null;
        }
        if (tokenSymbol == null) {
            tokenSymbol = c28635keW.DTwDnp();
        }
        java.lang.String str10 = tokenSymbol;
        java.lang.String top10HoldRto = publicMetricsWsData.getTop10HoldRto();
        if (top10HoldRto.length() <= 0) {
            top10HoldRto = null;
        }
        if (top10HoldRto == null) {
            top10HoldRto = c28635keW.OcIXYQ();
        }
        java.lang.String str11 = top10HoldRto;
        java.lang.String devHoldRto = publicMetricsWsData.getDevHoldRto();
        if (devHoldRto.length() <= 0) {
            devHoldRto = null;
        }
        if (devHoldRto == null) {
            devHoldRto = c28635keW.gEmmrt();
        }
        java.lang.String str12 = devHoldRto;
        java.lang.String suspHoldRto = publicMetricsWsData.getSuspHoldRto();
        if (suspHoldRto.length() <= 0) {
            suspHoldRto = null;
        }
        if (suspHoldRto == null) {
            suspHoldRto = c28635keW.zsXlph();
        }
        java.lang.String str13 = suspHoldRto;
        java.lang.String sniperBuy = publicMetricsWsData.getSniperBuy();
        if (sniperBuy.length() <= 0) {
            sniperBuy = null;
        }
        if (sniperBuy == null) {
            sniperBuy = c28635keW.AubY();
        }
        java.lang.String str14 = sniperBuy;
        java.lang.String sniperCnt = publicMetricsWsData.getSniperCnt();
        if (sniperCnt.length() <= 0) {
            sniperCnt = null;
        }
        if (sniperCnt == null) {
            sniperCnt = c28635keW.zLjUOn();
        }
        java.lang.String str15 = sniperCnt;
        java.lang.String sniperHoldingRatio = publicMetricsWsData.getSniperHoldingRatio();
        if (sniperHoldingRatio.length() <= 0) {
            sniperHoldingRatio = null;
        }
        if (sniperHoldingRatio == null) {
            sniperHoldingRatio = c28635keW.AuCTelauCTel();
        }
        java.lang.String str16 = sniperHoldingRatio;
        java.lang.String bundHoldRto = publicMetricsWsData.getBundHoldRto();
        if (bundHoldRto.length() <= 0) {
            bundHoldRto = null;
        }
        if (bundHoldRto == null) {
            bundHoldRto = c28635keW.EZpvd();
        }
        java.lang.String str17 = bundHoldRto;
        java.lang.String creator = publicMetricsWsData.getCreator();
        if (creator.length() <= 0) {
            creator = null;
        }
        if (creator == null) {
            creator = c28635keW.AYXKKw();
        }
        java.lang.String str18 = creator;
        java.lang.String fee = publicMetricsWsData.getFee();
        if (fee.length() <= 0) {
            fee = null;
        }
        if (fee == null) {
            fee = c28635keW.djBIcL();
        }
        java.lang.String str19 = fee;
        java.lang.String bots = publicMetricsWsData.getBots();
        if (bots.length() <= 0) {
            bots = null;
        }
        if (bots == null) {
            bots = c28635keW.copydefault();
        }
        java.lang.String str20 = bots;
        java.lang.String creatorMigrCnt = publicMetricsWsData.getCreatorMigrCnt();
        if (creatorMigrCnt.length() <= 0) {
            creatorMigrCnt = null;
        }
        if (creatorMigrCnt == null) {
            creatorMigrCnt = c28635keW.AhwBna();
        }
        java.lang.String str21 = creatorMigrCnt;
        java.lang.String migrBegin = publicMetricsWsData.getMigrBegin();
        if (migrBegin.length() <= 0) {
            migrBegin = null;
        }
        if (migrBegin == null) {
            migrBegin = c28635keW.fIwbmz();
        }
        java.lang.String str22 = migrBegin;
        java.lang.String migrEnd = publicMetricsWsData.getMigrEnd();
        if (migrEnd.length() <= 0) {
            migrEnd = null;
        }
        if (migrEnd == null) {
            migrEnd = c28635keW.ejfBZ();
        }
        java.lang.String str23 = migrEnd;
        java.lang.String progress = publicMetricsWsData.getProgress();
        if (progress.length() <= 0) {
            progress = null;
        }
        if (progress == null) {
            progress = c28635keW.fARcdN();
        }
        java.lang.String str24 = progress;
        java.lang.String protocolId = publicMetricsWsData.getProtocolId();
        if (protocolId.length() <= 0) {
            protocolId = null;
        }
        if (protocolId == null) {
            protocolId = c28635keW.fJNWhG();
        }
        java.lang.String str25 = protocolId;
        java.lang.String extProtocolId = publicMetricsWsData.getExtProtocolId();
        if (extProtocolId.length() <= 0) {
            extProtocolId = null;
        }
        if (extProtocolId == null) {
            extProtocolId = c28635keW.valueOf();
        }
        java.lang.String str26 = extProtocolId;
        java.lang.String projectLink = publicMetricsWsData.getProjectLink();
        if (projectLink.length() <= 0) {
            projectLink = null;
        }
        if (projectLink == null) {
            projectLink = c28635keW.AuCTel();
        }
        java.lang.String str27 = projectLink;
        if (z) {
            strAEQbTJ = c28635keW.AEQbTJ();
        } else {
            strAEQbTJ = publicMetricsWsData.getCreateTime();
            if (strAEQbTJ.length() <= 0) {
                strAEQbTJ = null;
            }
            if (strAEQbTJ == null) {
            }
        }
        java.lang.String str28 = strAEQbTJ;
        Media mediaEZpvd = EZpvd(publicMetricsWsData.getMedia(), c28635keW.AkhnZx());
        java.util.List<CompactTagData> tagData = publicMetricsWsData.getTagData();
        java.util.List<CompactTagData> list = tagData.isEmpty() ^ true ? tagData : null;
        return C28635keW.copy$default(c28635keW, null, str9, str10, str7, strSSMYrx, !zEZpvd, str8, null, str28, str18, str, str2, str3, str4, str5, str19, str20, str6, str11, str12, str13, str14, str15, str16, str17, null, null, str21, list == null ? c28635keW.gHZMYf() : list, str22, str23, str24, str25, str26, null, null, str27, mediaEZpvd, false, 0L, null, null, 100663425, 972, null);
    }

    public final C28635keW KWHzl(@NotNull SameCarUpdateWsData sameCarUpdateWsData, @NotNull C28635keW c28635keW) {
        int i;
        Intrinsics.checkNotNullParameter(sameCarUpdateWsData, "");
        Intrinsics.checkNotNullParameter(c28635keW, "");
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(c28635keW.iwGUEr());
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        java.lang.Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(c28635keW.getFieldNames());
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        if (sameCarUpdateWsData.isOpenPosition()) {
            i = 1;
        } else {
            i = sameCarUpdateWsData.isClosePosition() ? -1 : 0;
        }
        return C28635keW.copy$default(c28635keW, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, java.lang.String.valueOf(C56548yJl.copydefault(iIntValue + i, 0)), java.lang.String.valueOf(C56548yJl.copydefault(iIntValue2 + (sameCarUpdateWsData.isCollectedToken() ? i : 0), 0)), null, null, false, 0L, null, null, -1, 1011, null);
    }

    public final Media EZpvd(MediaWsData mediaWsData, Media media) {
        XMedia xMediaDjBIcL;
        YoutubeMedia youtubeMediaAYXKKw;
        FacebookMedia facebookMediaCopydefault;
        TwitchMedia twitchMediaValueOf;
        InstagramMedia instagramMediaAEQbTJ;
        TikTokMedia tikTokMediaEZpvd;
        DiscordMedia discordMediaOLrzqt;
        java.lang.String telegram = mediaWsData.getTelegram();
        if (telegram.length() <= 0) {
            telegram = null;
        }
        if (telegram == null) {
            telegram = media.KWHzl();
        }
        java.lang.String str = telegram;
        java.lang.String website = mediaWsData.getWebsite();
        if (website.length() <= 0) {
            website = null;
        }
        if (website == null) {
            website = media.gEmmrt();
        }
        java.lang.String str2 = website;
        XMediaWsData x = mediaWsData.getX();
        java.lang.String str3 = "";
        if (x != null) {
            java.lang.String url = x.getUrl();
            if (url.length() <= 0) {
                url = null;
            }
            if (url == null) {
                XMedia xMediaDjBIcL2 = media.djBIcL();
                url = xMediaDjBIcL2 != null ? xMediaDjBIcL2.KWHzl() : null;
                if (url == null) {
                    url = "";
                }
            }
            XPostType type = x.getType();
            if (type == null) {
                type = null;
            }
            if (type == null) {
                XMedia xMediaDjBIcL3 = media.djBIcL();
                type = xMediaDjBIcL3 != null ? xMediaDjBIcL3.OLrzqt() : null;
            }
            java.lang.String xrenameCnt = x.getXrenameCnt();
            if (xrenameCnt.length() <= 0) {
                xrenameCnt = null;
            }
            if (xrenameCnt == null) {
                XMedia xMediaDjBIcL4 = media.djBIcL();
                xrenameCnt = xMediaDjBIcL4 != null ? xMediaDjBIcL4.copydefault() : null;
                if (xrenameCnt == null) {
                    xrenameCnt = "";
                }
            }
            java.lang.String xTime = x.getXTime();
            if (xTime.length() <= 0) {
                xTime = null;
            }
            if (xTime == null) {
                XMedia xMediaDjBIcL5 = media.djBIcL();
                xTime = xMediaDjBIcL5 != null ? xMediaDjBIcL5.EZpvd() : null;
                if (xTime == null) {
                    xTime = "";
                }
            }
            xMediaDjBIcL = new XMedia(url, type, xTime, xrenameCnt);
        } else {
            xMediaDjBIcL = media.djBIcL();
        }
        YoutubeMediaWsData youtube = mediaWsData.getYoutube();
        if (youtube != null) {
            java.lang.String url2 = youtube.getUrl();
            if (url2.length() <= 0) {
                url2 = null;
            }
            if (url2 == null) {
                YoutubeMedia youtubeMediaAYXKKw2 = media.AYXKKw();
                url2 = youtubeMediaAYXKKw2 != null ? youtubeMediaAYXKKw2.OLrzqt() : null;
                if (url2 == null) {
                    url2 = "";
                }
            }
            java.lang.String type2 = youtube.getType();
            if (type2.length() <= 0) {
                type2 = null;
            }
            if (type2 == null) {
                YoutubeMedia youtubeMediaAYXKKw3 = media.AYXKKw();
                type2 = youtubeMediaAYXKKw3 != null ? youtubeMediaAYXKKw3.copydefault() : null;
                if (type2 == null) {
                    type2 = "";
                }
            }
            youtubeMediaAYXKKw = new YoutubeMedia(url2, type2);
        } else {
            youtubeMediaAYXKKw = media.AYXKKw();
        }
        FacebookMediaWsData facebook = mediaWsData.getFacebook();
        if (facebook != null) {
            java.lang.String url3 = facebook.getUrl();
            if (url3.length() <= 0) {
                url3 = null;
            }
            if (url3 == null) {
                FacebookMedia facebookMediaCopydefault2 = media.copydefault();
                url3 = facebookMediaCopydefault2 != null ? facebookMediaCopydefault2.AEQbTJ() : null;
                if (url3 == null) {
                    url3 = "";
                }
            }
            java.lang.String type3 = facebook.getType();
            if (type3.length() <= 0) {
                type3 = null;
            }
            if (type3 == null) {
                FacebookMedia facebookMediaCopydefault3 = media.copydefault();
                type3 = facebookMediaCopydefault3 != null ? facebookMediaCopydefault3.OLrzqt() : null;
                if (type3 == null) {
                    type3 = "";
                }
            }
            facebookMediaCopydefault = new FacebookMedia(url3, type3);
        } else {
            facebookMediaCopydefault = media.copydefault();
        }
        TwitchMediaWsData twitch = mediaWsData.getTwitch();
        if (twitch != null) {
            java.lang.String url4 = twitch.getUrl();
            if (url4.length() <= 0) {
                url4 = null;
            }
            if (url4 == null) {
                TwitchMedia twitchMediaValueOf2 = media.valueOf();
                url4 = twitchMediaValueOf2 != null ? twitchMediaValueOf2.EZpvd() : null;
                if (url4 == null) {
                    url4 = "";
                }
            }
            java.lang.String type4 = twitch.getType();
            if (type4.length() <= 0) {
                type4 = null;
            }
            if (type4 == null) {
                TwitchMedia twitchMediaValueOf3 = media.valueOf();
                type4 = twitchMediaValueOf3 != null ? twitchMediaValueOf3.AEQbTJ() : null;
                if (type4 == null) {
                    type4 = "";
                }
            }
            twitchMediaValueOf = new TwitchMedia(url4, type4);
        } else {
            twitchMediaValueOf = media.valueOf();
        }
        InstagramMediaWsData instagram = mediaWsData.getInstagram();
        if (instagram != null) {
            java.lang.String url5 = instagram.getUrl();
            if (url5.length() <= 0) {
                url5 = null;
            }
            if (url5 == null) {
                InstagramMedia instagramMediaAEQbTJ2 = media.AEQbTJ();
                url5 = instagramMediaAEQbTJ2 != null ? instagramMediaAEQbTJ2.copydefault() : null;
                if (url5 == null) {
                    url5 = "";
                }
            }
            java.lang.String type5 = instagram.getType();
            if (type5.length() <= 0) {
                type5 = null;
            }
            if (type5 == null) {
                InstagramMedia instagramMediaAEQbTJ3 = media.AEQbTJ();
                type5 = instagramMediaAEQbTJ3 != null ? instagramMediaAEQbTJ3.EZpvd() : null;
                if (type5 == null) {
                    type5 = "";
                }
            }
            instagramMediaAEQbTJ = new InstagramMedia(url5, type5);
        } else {
            instagramMediaAEQbTJ = media.AEQbTJ();
        }
        TikTokMediaWsData tiktok = mediaWsData.getTiktok();
        if (tiktok != null) {
            java.lang.String url6 = tiktok.getUrl();
            if (url6.length() <= 0) {
                url6 = null;
            }
            if (url6 == null) {
                TikTokMedia tikTokMediaEZpvd2 = media.EZpvd();
                url6 = tikTokMediaEZpvd2 != null ? tikTokMediaEZpvd2.KWHzl() : null;
                if (url6 == null) {
                    url6 = "";
                }
            }
            java.lang.String type6 = tiktok.getType();
            if (type6.length() <= 0) {
                type6 = null;
            }
            if (type6 == null) {
                TikTokMedia tikTokMediaEZpvd3 = media.EZpvd();
                type6 = tikTokMediaEZpvd3 != null ? tikTokMediaEZpvd3.copydefault() : null;
                if (type6 == null) {
                    type6 = "";
                }
            }
            tikTokMediaEZpvd = new TikTokMedia(url6, type6);
        } else {
            tikTokMediaEZpvd = media.EZpvd();
        }
        DiscordMediaWsData discord = mediaWsData.getDiscord();
        if (discord != null) {
            java.lang.String url7 = discord.getUrl();
            if (url7.length() <= 0) {
                url7 = null;
            }
            if (url7 == null) {
                DiscordMedia discordMediaOLrzqt2 = media.OLrzqt();
                url7 = discordMediaOLrzqt2 != null ? discordMediaOLrzqt2.EZpvd() : null;
                if (url7 == null) {
                    url7 = "";
                }
            }
            java.lang.String type7 = discord.getType();
            if (type7.length() <= 0) {
                type7 = null;
            }
            if (type7 == null) {
                DiscordMedia discordMediaOLrzqt3 = media.OLrzqt();
                java.lang.String strCopydefault = discordMediaOLrzqt3 != null ? discordMediaOLrzqt3.copydefault() : null;
                if (strCopydefault != null) {
                    str3 = strCopydefault;
                }
            } else {
                str3 = type7;
            }
            discordMediaOLrzqt = new DiscordMedia(url7, str3);
        } else {
            discordMediaOLrzqt = media.OLrzqt();
        }
        return new Media(str, str2, xMediaDjBIcL, youtubeMediaAYXKKw, facebookMediaCopydefault, twitchMediaValueOf, instagramMediaAEQbTJ, tikTokMediaEZpvd, discordMediaOLrzqt);
    }
}
