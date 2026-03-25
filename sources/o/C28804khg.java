package o;

import com.google.android.exoplayer2.util.MimeTypes;
import com.okinc.business.market.features.meme.data.model.XPostType;
import com.okinc.business.market.features.meme.preview.domain.model.AccountVOData;
import com.okinc.business.market.features.meme.preview.domain.model.CommunityVOData;
import com.okinc.business.market.features.meme.preview.domain.model.SourceData;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterPreviewData;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Cashtag;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Entities;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Hashtag;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2MediaDetail;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2QuotedTweet;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Response;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Tweet;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Url;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2User;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2UserMention;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoInfo;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2VideoVariant;
import com.okinc.business.market.features.meme.preview.ui.TwitterMediaItem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C38307pTy;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28804khg {
    public final java.lang.String KWHzl = "https://x.com/";

    /* JADX INFO: renamed from: o.khg$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[XPostType.values().length];
            try {
                iArr[XPostType.POST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[XPostType.PROFILE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[XPostType.COMMUNITY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C28804khg() {
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C28807khj EZpvd(@NotNull TwitterPreviewData twitterPreviewData) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String translatedBio;
        SourceData source;
        java.lang.String username;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(twitterPreviewData, "");
        XPostType xPostType = twitterPreviewData.getCommunityVO() != null ? XPostType.COMMUNITY : twitterPreviewData.getAccountVO() != null ? XPostType.PROFILE : XPostType.POST;
        int i = Application.OLrzqt[xPostType.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            AccountVOData accountVO = twitterPreviewData.getAccountVO();
            CommunityVOData communityVO = twitterPreviewData.getCommunityVO();
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (communityVO != null ? communityVO.getSourceLanguage() : null), (java.lang.Object) (communityVO != null ? communityVO.getTranslatedLanguage() : null));
            java.lang.String portrait = accountVO != null ? accountVO.getPortrait() : null;
            if (portrait == null) {
                portrait = "";
            }
            java.lang.String name = communityVO != null ? communityVO.getName() : null;
            if (name == null) {
                name = "";
            }
            java.lang.String iCUCompact$default = communityVO != null ? pTB.formatICUCompact$default(java.lang.Long.valueOf(communityVO.getMemberCount()), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null) : null;
            java.lang.String str6 = iCUCompact$default == null ? "" : iCUCompact$default;
            java.lang.String description = communityVO != null ? communityVO.getDescription() : null;
            java.lang.String str7 = description == null ? "" : description;
            java.lang.String url = communityVO != null ? communityVO.getUrl() : null;
            java.lang.String str8 = url == null ? "" : url;
            if (!zEZpvd) {
                java.lang.String contentId = communityVO != null ? communityVO.getContentId() : null;
                str3 = contentId == null ? "" : contentId;
            }
            if (!zEZpvd) {
                translatedBio = communityVO != null ? communityVO.getTranslatedDescription() : null;
                str4 = translatedBio == null ? "" : translatedBio;
            }
            return new C28807khj(xPostType, null, portrait, name, null, false, null, null, str7, null, str6, null, null, null, null, null, null, null, null, null, null, str8, null, null, null, null, str3, str4, 65010418, null);
        }
        AccountVOData accountVO2 = twitterPreviewData.getAccountVO();
        boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) (accountVO2 != null ? accountVO2.getSourceLanguage() : null), (java.lang.Object) (accountVO2 != null ? accountVO2.getTranslatedLanguage() : null));
        java.lang.String profileBannerUrl = accountVO2 != null ? accountVO2.getProfileBannerUrl() : null;
        java.lang.String str9 = profileBannerUrl == null ? "" : profileBannerUrl;
        java.lang.String portrait2 = accountVO2 != null ? accountVO2.getPortrait() : null;
        java.lang.String str10 = portrait2 == null ? "" : portrait2;
        java.lang.String nickName = accountVO2 != null ? accountVO2.getNickName() : null;
        java.lang.String str11 = nickName == null ? "" : nickName;
        if (accountVO2 == null || (username = accountVO2.getUsername()) == null) {
            str = null;
        } else {
            str = "@" + username;
        }
        java.lang.String str12 = str == null ? "" : str;
        boolean verified = accountVO2 != null ? accountVO2.getVerified() : false;
        java.lang.String bio = accountVO2 != null ? accountVO2.getBio() : null;
        java.lang.String str13 = bio == null ? "" : bio;
        C25322iuY c25322iuY = C25322iuY.OLrzqt;
        java.lang.String joinTime = accountVO2 != null ? accountVO2.getJoinTime() : null;
        if (joinTime == null) {
            joinTime = "";
        }
        java.lang.String strAhwBna = c25322iuY.AhwBna(joinTime);
        java.lang.String iCUCompact$default2 = accountVO2 != null ? pTB.formatICUCompact$default(java.lang.Long.valueOf(accountVO2.getFollowingCount()), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null) : null;
        java.lang.String str14 = iCUCompact$default2 == null ? "" : iCUCompact$default2;
        java.lang.String iCUCompact$default3 = accountVO2 != null ? pTB.formatICUCompact$default(java.lang.Long.valueOf(accountVO2.getFollowerCount()), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null) : null;
        java.lang.String str15 = iCUCompact$default3 == null ? "" : iCUCompact$default3;
        java.lang.String url2 = (accountVO2 == null || (source = accountVO2.getSource()) == null) ? null : source.getUrl();
        java.lang.String str16 = url2 == null ? "" : url2;
        if (!zEZpvd2) {
            java.lang.String contentId2 = accountVO2 != null ? accountVO2.getContentId() : null;
            str2 = contentId2 == null ? "" : contentId2;
        }
        if (!zEZpvd2) {
            translatedBio = accountVO2 != null ? accountVO2.getTranslatedBio() : null;
            if (translatedBio != null) {
                str5 = translatedBio;
            }
        }
        return new C28807khj(xPostType, str9, str10, str11, str12, verified, null, null, str13, strAhwBna, str14, str15, null, null, null, null, null, null, null, null, null, str16, null, null, null, null, str2, str5, 65007808, null);
    }

    public final C28807khj copydefault(@NotNull TwitterV2Response twitterV2Response) {
        Intrinsics.checkNotNullParameter(twitterV2Response, "");
        TwitterV2Tweet tweetVO = twitterV2Response.getTweetVO();
        return tweetVO == null ? new C28807khj(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null) : KWHzl(tweetVO);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C28807khj KWHzl(TwitterV2Tweet twitterV2Tweet) {
        C28803khf c28803khfEZpvd;
        C28803khf c28803khf;
        java.lang.CharSequence charSequence;
        java.lang.String profileImageUrlHttps;
        java.lang.String name;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String translatedText;
        java.lang.String contentId;
        java.lang.String screenName;
        java.lang.String screenName2;
        java.lang.String joinTime;
        java.lang.String mediaUrlHttps;
        TwitterMediaItem.MediaType mediaType;
        java.util.List<TwitterV2VideoVariant> variants;
        java.lang.Object next;
        TwitterV2User user = twitterV2Tweet.getUser();
        java.lang.CharSequence charSequenceOLrzqt = OLrzqt(twitterV2Tweet);
        java.util.List<TwitterV2MediaDetail> mediaDetails = twitterV2Tweet.getMediaDetails();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = mediaDetails.iterator();
        while (true) {
            TwitterMediaItem twitterMediaItem = null;
            if (!it.hasNext()) {
                break;
            }
            TwitterV2MediaDetail twitterV2MediaDetail = (TwitterV2MediaDetail) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) twitterV2MediaDetail.getType(), (java.lang.Object) MimeTypes.BASE_TYPE_VIDEO)) {
                TwitterV2VideoInfo videoInfo = twitterV2MediaDetail.getVideoInfo();
                if (videoInfo == null || (variants = videoInfo.getVariants()) == null) {
                    mediaUrlHttps = null;
                } else {
                    java.util.Iterator<T> it2 = variants.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            java.lang.Long bitrate = ((TwitterV2VideoVariant) next).getBitrate();
                            long jLongValue = bitrate != null ? bitrate.longValue() : 0L;
                            do {
                                java.lang.Object next2 = it2.next();
                                java.lang.Long bitrate2 = ((TwitterV2VideoVariant) next2).getBitrate();
                                long jLongValue2 = bitrate2 != null ? bitrate2.longValue() : 0L;
                                if (jLongValue < jLongValue2) {
                                    next = next2;
                                    jLongValue = jLongValue2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    TwitterV2VideoVariant twitterV2VideoVariant = (TwitterV2VideoVariant) next;
                    if (twitterV2VideoVariant != null) {
                        mediaUrlHttps = twitterV2VideoVariant.getUrl();
                    }
                }
            } else {
                mediaUrlHttps = twitterV2MediaDetail.getMediaUrlHttps();
            }
            if (mediaUrlHttps != null) {
                if (Intrinsics.EZpvd((java.lang.Object) twitterV2MediaDetail.getType(), (java.lang.Object) MimeTypes.BASE_TYPE_VIDEO)) {
                    mediaType = TwitterMediaItem.MediaType.VIDEO;
                } else {
                    mediaType = TwitterMediaItem.MediaType.PHOTO;
                }
                twitterMediaItem = new TwitterMediaItem(mediaUrlHttps, mediaType, Intrinsics.EZpvd((java.lang.Object) twitterV2MediaDetail.getType(), (java.lang.Object) MimeTypes.BASE_TYPE_VIDEO) ? twitterV2MediaDetail.getMediaUrlHttps() : null);
            }
            if (twitterMediaItem != null) {
                arrayList.add(twitterMediaItem);
            }
        }
        if ((twitterV2Tweet.getReferencedType() == TwitterReferenceType.QUOTED || twitterV2Tweet.getReferencedType() == TwitterReferenceType.REPLIED_TO) && twitterV2Tweet.getQuotedTweet() != null) {
            c28803khfEZpvd = EZpvd(twitterV2Tweet.getQuotedTweet());
            if (twitterV2Tweet.getReferencedType() == TwitterReferenceType.REPLIED_TO) {
                TwitterV2User user2 = twitterV2Tweet.getQuotedTweet().getUser();
                java.lang.String screenName3 = user2 != null ? user2.getScreenName() : null;
                if (screenName3 == null) {
                    screenName3 = "";
                }
                android.text.SpannableString spannableString = new android.text.SpannableString("replied to @" + screenName3);
                spannableString.setSpan(new LoaderManager(this.KWHzl + screenName3), C56548yJl.copydefault((spannableString.length() - screenName3.length()) - 1, 0), spannableString.length(), 17);
                c28803khf = c28803khfEZpvd;
                charSequence = spannableString;
            }
            java.lang.String strAhwBna = (user != null || (joinTime = user.getJoinTime()) == null) ? null : C25322iuY.OLrzqt.AhwBna(joinTime);
            java.lang.String str3 = strAhwBna != null ? "" : strAhwBna;
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) twitterV2Tweet.getSourceLanguage(), (java.lang.Object) twitterV2Tweet.getTranslatedLanguage());
            XPostType xPostType = XPostType.POST;
            profileImageUrlHttps = user == null ? user.getProfileImageUrlHttps() : null;
            if (profileImageUrlHttps == null) {
                profileImageUrlHttps = "";
            }
            name = user == null ? user.getName() : null;
            if (name == null) {
                name = "";
            }
            if (user != null || (screenName2 = user.getScreenName()) == null) {
                str = null;
            } else {
                str = "@" + screenName2;
            }
            if (str == null) {
                str = "";
            }
            boolean verified = user == null ? user.getVerified() : false;
            java.lang.String createdAt = twitterV2Tweet.getCreatedAt();
            java.lang.String strAEQbTJ = createdAt == null ? AEQbTJ(createdAt) : null;
            java.lang.String str4 = strAEQbTJ != null ? "" : strAEQbTJ;
            java.lang.String iCUCompact$default = user == null ? pTB.formatICUCompact$default(java.lang.Long.valueOf(user.getFollowersCount()), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null) : null;
            java.lang.String str5 = iCUCompact$default != null ? "" : iCUCompact$default;
            long viewCount = twitterV2Tweet.getViewCount();
            C38307pTy.Application application = C38307pTy.Companion;
            java.lang.String iCUCompact$default2 = pTB.formatICUCompact$default(java.lang.Long.valueOf(viewCount), null, application.EZpvd(0), null, null, 13, null);
            java.lang.String iCUCompact$default3 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getLikeCount()), null, application.EZpvd(0), null, null, 13, null);
            java.lang.String iCUCompact$default4 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getReplyCount()), null, application.EZpvd(0), null, null, 13, null);
            java.lang.String iCUCompact$default5 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getQuoteCount()), null, application.EZpvd(0), null, null, 13, null);
            java.lang.String iCUCompact$default6 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getRetweetCount()), null, application.EZpvd(0), null, null, 13, null);
            java.lang.String iCUCompact$default7 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getBookmarkCount()), null, application.EZpvd(0), null, null, 13, null);
            java.lang.String url = twitterV2Tweet.getUrl();
            java.lang.String str6 = url != null ? "" : url;
            if (user != null || (screenName = user.getScreenName()) == null) {
                str2 = null;
            } else {
                str2 = this.KWHzl + screenName;
            }
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String createdAt2 = twitterV2Tweet.getCreatedAt();
            java.lang.Long lEZpvd = createdAt2 == null ? EZpvd(createdAt2) : null;
            java.lang.String str7 = (zEZpvd && (contentId = twitterV2Tweet.getContentId()) != null) ? contentId : "";
            java.lang.String str8 = (zEZpvd && (translatedText = twitterV2Tweet.getTranslatedText()) != null) ? translatedText : "";
            java.lang.String createdAt3 = twitterV2Tweet.getCreatedAt();
            return new C28807khj(xPostType, null, profileImageUrlHttps, name, str, verified, charSequence, str4, null, str3, null, str5, charSequenceOLrzqt, arrayList, createdAt3 == null ? EZpvd(createdAt3) : null, iCUCompact$default2, iCUCompact$default3, iCUCompact$default4, iCUCompact$default5, iCUCompact$default6, iCUCompact$default7, str6, str2, null, c28803khf, lEZpvd, str7, str8, 8389890, null);
        }
        c28803khfEZpvd = null;
        c28803khf = c28803khfEZpvd;
        charSequence = "";
        if (user != null) {
        }
        if (strAhwBna != null) {
        }
        boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) twitterV2Tweet.getSourceLanguage(), (java.lang.Object) twitterV2Tweet.getTranslatedLanguage());
        XPostType xPostType2 = XPostType.POST;
        if (user == null) {
        }
        if (profileImageUrlHttps == null) {
        }
        if (user == null) {
        }
        if (name == null) {
        }
        if (user != null) {
            str = null;
        }
        if (str == null) {
        }
        if (user == null) {
        }
        java.lang.String createdAt4 = twitterV2Tweet.getCreatedAt();
        if (createdAt4 == null) {
        }
        if (strAEQbTJ != null) {
        }
        if (user == null) {
        }
        if (iCUCompact$default != null) {
        }
        long viewCount2 = twitterV2Tweet.getViewCount();
        C38307pTy.Application application2 = C38307pTy.Companion;
        java.lang.String iCUCompact$default22 = pTB.formatICUCompact$default(java.lang.Long.valueOf(viewCount2), null, application2.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default32 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getLikeCount()), null, application2.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default42 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getReplyCount()), null, application2.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default52 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getQuoteCount()), null, application2.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default62 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getRetweetCount()), null, application2.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default72 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2Tweet.getBookmarkCount()), null, application2.EZpvd(0), null, null, 13, null);
        java.lang.String url2 = twitterV2Tweet.getUrl();
        if (url2 != null) {
        }
        if (user != null) {
            str2 = null;
        }
        if (str2 == null) {
        }
        java.lang.String createdAt22 = twitterV2Tweet.getCreatedAt();
        if (createdAt22 == null) {
        }
        if (zEZpvd2) {
        }
        if (zEZpvd2) {
        }
        java.lang.String createdAt32 = twitterV2Tweet.getCreatedAt();
        return new C28807khj(xPostType2, null, profileImageUrlHttps, name, str, verified, charSequence, str4, null, str3, null, str5, charSequenceOLrzqt, arrayList, createdAt32 == null ? EZpvd(createdAt32) : null, iCUCompact$default22, iCUCompact$default32, iCUCompact$default42, iCUCompact$default52, iCUCompact$default62, iCUCompact$default72, str6, str2, null, c28803khf, lEZpvd, str7, str8, 8389890, null);
    }

    /* JADX INFO: renamed from: o.khg$LoaderManager */
    public static final class LoaderManager extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.lang.String EZpvd;

        public LoaderManager(java.lang.String str) {
            this.EZpvd = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            try {
                android.content.Context context = view.getContext();
                if (context != null) {
                    java.lang.String str = this.EZpvd;
                    C28840kiP.EZpvd("x_post_url");
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                    intent.setData(android.net.Uri.parse(str));
                    context.startActivity(intent);
                }
            } catch (java.lang.Exception unused) {
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C25382ivf.KWHzl(C52761wXj.ActionBar.OcIXYQ));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C28803khf EZpvd(TwitterV2QuotedTweet twitterV2QuotedTweet) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String translatedText;
        java.lang.String contentId;
        java.lang.String screenName;
        java.lang.String screenName2;
        java.lang.String mediaUrlHttps;
        TwitterMediaItem.MediaType mediaType;
        java.util.List<TwitterV2VideoVariant> variants;
        java.lang.Object next;
        TwitterV2User user = twitterV2QuotedTweet.getUser();
        java.lang.CharSequence charSequenceCopydefault = copydefault(twitterV2QuotedTweet);
        java.util.List<TwitterV2MediaDetail> mediaDetails = twitterV2QuotedTweet.getMediaDetails();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = mediaDetails.iterator();
        while (true) {
            str = null;
            TwitterMediaItem twitterMediaItem = null;
            str = null;
            if (!it.hasNext()) {
                break;
            }
            TwitterV2MediaDetail twitterV2MediaDetail = (TwitterV2MediaDetail) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) twitterV2MediaDetail.getType(), (java.lang.Object) MimeTypes.BASE_TYPE_VIDEO)) {
                TwitterV2VideoInfo videoInfo = twitterV2MediaDetail.getVideoInfo();
                if (videoInfo == null || (variants = videoInfo.getVariants()) == null) {
                    mediaUrlHttps = null;
                } else {
                    java.util.Iterator<T> it2 = variants.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            java.lang.Long bitrate = ((TwitterV2VideoVariant) next).getBitrate();
                            long jLongValue = bitrate != null ? bitrate.longValue() : 0L;
                            do {
                                java.lang.Object next2 = it2.next();
                                java.lang.Long bitrate2 = ((TwitterV2VideoVariant) next2).getBitrate();
                                long jLongValue2 = bitrate2 != null ? bitrate2.longValue() : 0L;
                                if (jLongValue < jLongValue2) {
                                    next = next2;
                                    jLongValue = jLongValue2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    TwitterV2VideoVariant twitterV2VideoVariant = (TwitterV2VideoVariant) next;
                    if (twitterV2VideoVariant != null) {
                        mediaUrlHttps = twitterV2VideoVariant.getUrl();
                    }
                }
            } else {
                mediaUrlHttps = twitterV2MediaDetail.getMediaUrlHttps();
            }
            if (mediaUrlHttps != null) {
                if (Intrinsics.EZpvd((java.lang.Object) twitterV2MediaDetail.getType(), (java.lang.Object) MimeTypes.BASE_TYPE_VIDEO)) {
                    mediaType = TwitterMediaItem.MediaType.VIDEO;
                } else {
                    mediaType = TwitterMediaItem.MediaType.PHOTO;
                }
                twitterMediaItem = new TwitterMediaItem(mediaUrlHttps, mediaType, Intrinsics.EZpvd((java.lang.Object) twitterV2MediaDetail.getType(), (java.lang.Object) MimeTypes.BASE_TYPE_VIDEO) ? twitterV2MediaDetail.getMediaUrlHttps() : null);
            }
            if (twitterMediaItem != null) {
                arrayList.add(twitterMediaItem);
            }
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) twitterV2QuotedTweet.getSourceLanguage(), (java.lang.Object) twitterV2QuotedTweet.getTranslatedLanguage());
        java.lang.String profileImageUrlHttps = user != null ? user.getProfileImageUrlHttps() : null;
        if (profileImageUrlHttps == null) {
            profileImageUrlHttps = "";
        }
        java.lang.String name = user != null ? user.getName() : null;
        if (name == null) {
            name = "";
        }
        if (user == null || (screenName2 = user.getScreenName()) == null) {
            str2 = null;
        } else {
            str2 = "@" + screenName2;
        }
        if (str2 == null) {
            str2 = "";
        }
        boolean verified = user != null ? user.getVerified() : false;
        java.lang.String createdAt = twitterV2QuotedTweet.getCreatedAt();
        java.lang.String strAEQbTJ = createdAt != null ? AEQbTJ(createdAt) : null;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        long viewCount = twitterV2QuotedTweet.getViewCount();
        C38307pTy.Application application = C38307pTy.Companion;
        java.lang.String iCUCompact$default = pTB.formatICUCompact$default(java.lang.Long.valueOf(viewCount), null, application.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default2 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2QuotedTweet.getLikeCount()), null, application.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default3 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2QuotedTweet.getReplyCount()), null, application.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default4 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2QuotedTweet.getQuoteCount()), null, application.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default5 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2QuotedTweet.getRetweetCount()), null, application.EZpvd(0), null, null, 13, null);
        java.lang.String iCUCompact$default6 = pTB.formatICUCompact$default(java.lang.Long.valueOf(twitterV2QuotedTweet.getBookmarkCount()), null, application.EZpvd(0), null, null, 13, null);
        if (user != null && (screenName = user.getScreenName()) != null) {
            str = this.KWHzl + screenName;
        }
        return new C28803khf(profileImageUrlHttps, name, str2, verified, charSequenceCopydefault, arrayList, strAEQbTJ, iCUCompact$default, iCUCompact$default2, iCUCompact$default3, iCUCompact$default4, iCUCompact$default5, iCUCompact$default6, str == null ? "" : str, (zEZpvd || (contentId = twitterV2QuotedTweet.getContentId()) == null) ? "" : contentId, (zEZpvd || (translatedText = twitterV2QuotedTweet.getTranslatedText()) == null) ? "" : translatedText);
    }

    public final java.lang.CharSequence copydefault(TwitterV2QuotedTweet twitterV2QuotedTweet) {
        java.lang.String text = twitterV2QuotedTweet.getText();
        if (text == null) {
            text = "";
        }
        TwitterV2Entities entities = twitterV2QuotedTweet.getEntities();
        if (entities == null) {
            return text;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(text);
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.OcIXYQ);
        java.util.ArrayList<StateListAnimator> arrayList = new java.util.ArrayList();
        for (TwitterV2Hashtag twitterV2Hashtag : entities.getHashtags()) {
            java.util.List<java.lang.Integer> indices = twitterV2Hashtag.getIndices();
            if (indices.size() >= 2) {
                int iCopydefault = C56548yJl.copydefault(indices.get(0).intValue(), 0);
                int iValueOf = C56548yJl.valueOf(indices.get(1).intValue(), text.length());
                if (iCopydefault >= 0 && iCopydefault < iValueOf) {
                    arrayList.add(new StateListAnimator(iCopydefault, iValueOf, this.KWHzl + "hashtag/" + twitterV2Hashtag.getText()));
                }
            }
        }
        for (TwitterV2UserMention twitterV2UserMention : entities.getUserMentions()) {
            java.util.List<java.lang.Integer> indices2 = twitterV2UserMention.getIndices();
            if (indices2.size() >= 2) {
                int iCopydefault2 = C56548yJl.copydefault(indices2.get(0).intValue(), 0);
                int iValueOf2 = C56548yJl.valueOf(indices2.get(1).intValue(), text.length());
                if (iCopydefault2 >= 0 && iCopydefault2 < iValueOf2) {
                    arrayList.add(new StateListAnimator(iCopydefault2, iValueOf2, this.KWHzl + twitterV2UserMention.getScreenName()));
                }
            }
        }
        for (TwitterV2Url twitterV2Url : entities.getUrls()) {
            java.util.List<java.lang.Integer> indices3 = twitterV2Url.getIndices();
            if (indices3.size() >= 2) {
                int iIntValue = indices3.get(0).intValue();
                int iIntValue2 = indices3.get(1).intValue();
                if (iIntValue >= 0 && iIntValue2 <= text.length() && iIntValue < iIntValue2) {
                    java.lang.String expandedUrl = twitterV2Url.getExpandedUrl();
                    if (expandedUrl == null) {
                        expandedUrl = "";
                    }
                    arrayList.add(new StateListAnimator(iIntValue, iIntValue2, expandedUrl));
                }
            }
        }
        for (TwitterV2Cashtag twitterV2Cashtag : entities.getCashtags()) {
            java.util.List<java.lang.Integer> indices4 = twitterV2Cashtag.getIndices();
            if (indices4.size() >= 2) {
                int iCopydefault3 = C56548yJl.copydefault(indices4.get(0).intValue(), 0);
                int iValueOf3 = C56548yJl.valueOf(indices4.get(1).intValue(), text.length());
                if (iCopydefault3 >= 0 && iCopydefault3 < iValueOf3) {
                    arrayList.add(new StateListAnimator(iCopydefault3, iValueOf3, this.KWHzl + "search?q=%24" + twitterV2Cashtag.getText()));
                }
            }
        }
        for (StateListAnimator stateListAnimator : arrayList) {
            if (stateListAnimator.KWHzl() < spannableString.length() && stateListAnimator.AEQbTJ() <= spannableString.length()) {
                spannableString.setSpan(new Activity(stateListAnimator, iKWHzl), stateListAnimator.KWHzl(), stateListAnimator.AEQbTJ(), 17);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), stateListAnimator.KWHzl(), stateListAnimator.AEQbTJ(), 17);
            }
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: o.khg$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = stateListAnimator.OLrzqt;
            }
            if ((i3 & 2) != 0) {
                i2 = stateListAnimator.copydefault;
            }
            if ((i3 & 4) != 0) {
                str = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(i, i2, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(int i, int i2, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(i, i2, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.OLrzqt == stateListAnimator.OLrzqt && this.copydefault == stateListAnimator.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EntityInfo(start=" + this.OLrzqt + ", end=" + this.copydefault + ", url=" + this.KWHzl + ")";
        }

        public StateListAnimator(int i, int i2, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = i;
            this.copydefault = i2;
            this.KWHzl = str;
        }
    }

    /* JADX INFO: renamed from: o.khg$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ StateListAnimator KWHzl;

        public Activity(StateListAnimator stateListAnimator, int i) {
            this.KWHzl = stateListAnimator;
            this.AEQbTJ = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            try {
                android.content.Context context = view.getContext();
                if (context != null) {
                    StateListAnimator stateListAnimator = this.KWHzl;
                    C28840kiP.EZpvd("x_post_url");
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                    intent.setData(android.net.Uri.parse(stateListAnimator.copydefault()));
                    context.startActivity(intent);
                }
            } catch (java.lang.Exception unused) {
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.AEQbTJ);
            textPaint.setUnderlineText(false);
        }
    }

    public final java.lang.CharSequence OLrzqt(TwitterV2Tweet twitterV2Tweet) {
        java.lang.String text = twitterV2Tweet.getText();
        if (text == null) {
            text = "";
        }
        TwitterV2Entities entities = twitterV2Tweet.getEntities();
        if (entities == null) {
            return text;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(text);
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.OcIXYQ);
        java.util.ArrayList<TaskDescription> arrayList = new java.util.ArrayList();
        for (TwitterV2Hashtag twitterV2Hashtag : entities.getHashtags()) {
            java.util.List<java.lang.Integer> indices = twitterV2Hashtag.getIndices();
            if (indices.size() >= 2) {
                int iCopydefault = C56548yJl.copydefault(indices.get(0).intValue(), 0);
                int iValueOf = C56548yJl.valueOf(indices.get(1).intValue(), text.length());
                if (iCopydefault >= 0 && iCopydefault < iValueOf) {
                    arrayList.add(new TaskDescription(iCopydefault, iValueOf, this.KWHzl + "hashtag/" + twitterV2Hashtag.getText(), null, 8, null));
                }
            }
        }
        for (TwitterV2UserMention twitterV2UserMention : entities.getUserMentions()) {
            java.util.List<java.lang.Integer> indices2 = twitterV2UserMention.getIndices();
            if (indices2.size() >= 2) {
                int iCopydefault2 = C56548yJl.copydefault(indices2.get(0).intValue(), 0);
                int iValueOf2 = C56548yJl.valueOf(indices2.get(1).intValue(), text.length());
                if (iCopydefault2 >= 0 && iCopydefault2 < iValueOf2) {
                    arrayList.add(new TaskDescription(iCopydefault2, iValueOf2, this.KWHzl + twitterV2UserMention.getScreenName(), null, 8, null));
                }
            }
        }
        for (TwitterV2Url twitterV2Url : entities.getUrls()) {
            java.util.List<java.lang.Integer> indices3 = twitterV2Url.getIndices();
            if (indices3.size() >= 2) {
                int iIntValue = indices3.get(0).intValue();
                int iIntValue2 = indices3.get(1).intValue();
                if (iIntValue >= 0 && iIntValue2 <= text.length() && iIntValue < iIntValue2) {
                    java.lang.String expandedUrl = twitterV2Url.getExpandedUrl();
                    if (expandedUrl == null) {
                        expandedUrl = "";
                    }
                    arrayList.add(new TaskDescription(iIntValue, iIntValue2, expandedUrl, twitterV2Url.getDisplayUrl()));
                }
            }
        }
        for (TwitterV2Cashtag twitterV2Cashtag : entities.getCashtags()) {
            java.util.List<java.lang.Integer> indices4 = twitterV2Cashtag.getIndices();
            if (indices4.size() >= 2) {
                int iCopydefault3 = C56548yJl.copydefault(indices4.get(0).intValue(), 0);
                int iValueOf3 = C56548yJl.valueOf(indices4.get(1).intValue(), text.length());
                if (iCopydefault3 >= 0 && iCopydefault3 < iValueOf3) {
                    arrayList.add(new TaskDescription(iCopydefault3, iValueOf3, this.KWHzl + "search?q=%24" + twitterV2Cashtag.getText(), null, 8, null));
                }
            }
        }
        for (TaskDescription taskDescription : arrayList) {
            if (taskDescription.copydefault() < spannableString.length() && taskDescription.OLrzqt() <= spannableString.length()) {
                spannableString.setSpan(new ActionBar(taskDescription, iKWHzl), taskDescription.copydefault(), taskDescription.OLrzqt(), 33);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), taskDescription.copydefault(), taskDescription.OLrzqt(), 33);
            }
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: o.khg$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final int KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = taskDescription.copydefault;
            }
            if ((i3 & 2) != 0) {
                i2 = taskDescription.KWHzl;
            }
            if ((i3 & 4) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i3 & 8) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            return taskDescription.EZpvd(i, i2, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(int i, int i2, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(i, i2, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.copydefault == taskDescription.copydefault && this.KWHzl == taskDescription.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.copydefault);
            int iHashCode2 = java.lang.Integer.hashCode(this.KWHzl);
            int iHashCode3 = this.EZpvd.hashCode();
            java.lang.String str = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EntityInfo(start=" + this.copydefault + ", end=" + this.KWHzl + ", url=" + this.EZpvd + ", text=" + this.AEQbTJ + ")";
        }

        public TaskDescription(int i, int i2, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = i;
            this.KWHzl = i2;
            this.EZpvd = str;
            this.AEQbTJ = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(int, int, java.lang.String, java.lang.String):void (m)] (LINE:447) call: o.khg.TaskDescription.<init>(int, int, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(int i, int i2, java.lang.String str, java.lang.String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, str, (i3 & 8) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: o.khg$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ TaskDescription OLrzqt;

        public ActionBar(TaskDescription taskDescription, int i) {
            this.OLrzqt = taskDescription;
            this.EZpvd = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            try {
                android.content.Context context = view.getContext();
                if (context != null) {
                    TaskDescription taskDescription = this.OLrzqt;
                    C28840kiP.EZpvd("x_post_url");
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                    intent.setData(android.net.Uri.parse(taskDescription.AEQbTJ()));
                    context.startActivity(intent);
                }
            } catch (java.lang.Exception unused) {
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.EZpvd);
            textPaint.setUnderlineText(false);
        }
    }

    public final java.lang.Long EZpvd(java.lang.String str) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        TimeZone timeZoneOLrzqt = yCN.OLrzqt("GMT");
        Intrinsics.checkNotNullExpressionValue(timeZoneOLrzqt, "");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
        simpleDateFormat.setTimeZone(timeZoneOLrzqt);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date != null) {
                return java.lang.Long.valueOf(date.getTime());
            }
            return null;
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        TimeZone timeZoneOLrzqt = yCN.OLrzqt("GMT");
        Intrinsics.checkNotNullExpressionValue(timeZoneOLrzqt, "");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZoneOLrzqt);
        try {
            Date date = simpleDateFormat.parse(str);
            java.lang.String str2 = date != null ? new SimpleDateFormat("MMM d, yyyy, hh:mm:ss a", java.util.Locale.getDefault()).format(date) : null;
            return str2 == null ? "" : str2;
        } catch (java.text.ParseException unused) {
            return "";
        }
    }
}
