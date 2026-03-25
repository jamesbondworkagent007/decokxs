package com.okinc.business.market.features.meme.filter.social;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.meme.domain.model.Media;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.filter.social.SocialMediaType;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.C56444yFp;
import o.C57406yhn;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SocialMediaType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SocialMediaType[] $VALUES;
    public static final SocialMediaType COMMUNITY_TAKEOVER;
    public static final Activity Companion;
    public static final SocialMediaType DEX_SCREENER_PAID;
    public static final SocialMediaType DISCORD;
    public static final SocialMediaType FACEBOOK;
    public static final SocialMediaType INSTAGRAM;
    public static final SocialMediaType MEDIA = new SocialMediaType("MEDIA", 0, "media", C23274hvD.Fragment.MediaControllerCompatTransportControlsApi24, null, C52761wXj.TaskDescription.cancel, new Function1() { // from class: o.kfC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$0((MemeUiModel) obj));
        }
    }, null, 36, null);
    public static final SocialMediaType PUMP_LIVE;
    public static final SocialMediaType TELEGRAM;
    public static final SocialMediaType TIKTOK;
    public static final SocialMediaType TWITCH;
    public static final SocialMediaType TWITTER_X;
    public static final SocialMediaType WEBSITE;
    public static final SocialMediaType YOUTUBE;
    private final String apiKey;
    private final CDNSourceManager.Activity filterIconCdn;
    private final int iconResId;
    private final int labelResId;
    private final String tagDataKey;
    private final Function1<MemeUiModel, Boolean> validator;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SocialMediaType[] $values() {
        return new SocialMediaType[]{MEDIA, YOUTUBE, TWITTER_X, INSTAGRAM, TELEGRAM, TIKTOK, FACEBOOK, TWITCH, DISCORD, WEBSITE, DEX_SCREENER_PAID, COMMUNITY_TAKEOVER, PUMP_LIVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SocialMediaType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CDNSourceManager.Activity getFilterIconCdn() {
        return this.filterIconCdn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLabelResId() {
        return this.labelResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagDataKey() {
        return this.tagDataKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<MemeUiModel, Boolean> getValidator() {
        return this.validator;
    }

    private SocialMediaType(String str, int i, String str2, int i2, CDNSourceManager.Activity activity, int i3, Function1 function1, String str3) {
        this.apiKey = str2;
        this.labelResId = i2;
        this.filterIconCdn = activity;
        this.iconResId = i3;
        this.validator = function1;
        this.tagDataKey = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 int)
  (r14v0 java.lang.String)
  (r15v0 int)
  (wrap:com.okinc.business.dex.utils.CDNSourceManager$Activity:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.utils.CDNSourceManager$Activity) : (r16v0 com.okinc.business.dex.utils.CDNSourceManager$Activity))
  (r17v0 int)
  (r18v0 kotlin.jvm.functions.Function1)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, int, com.okinc.business.dex.utils.CDNSourceManager$Activity, int, kotlin.jvm.functions.Function1, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.filter.social.SocialMediaType.<init>(java.lang.String, int, java.lang.String, int, com.okinc.business.dex.utils.CDNSourceManager$Activity, int, kotlin.jvm.functions.Function1, java.lang.String):void type: THIS */
    public /* synthetic */ SocialMediaType(String str, int i, String str2, int i2, CDNSourceManager.Activity activity, int i3, Function1 function1, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, i2, (i4 & 4) != 0 ? null : activity, i3, function1, (i4 & 32) != 0 ? null : str3);
    }

    static {
        String str = null;
        int i = 32;
        DefaultConstructorMarker defaultConstructorMarker = null;
        YOUTUBE = new SocialMediaType("YOUTUBE", 1, "youtb", C23274hvD.Fragment.addReporter, CDNSourceManager.ImageSource.MemeSocialYoutube, C52761wXj.TaskDescription.ICustomTabsServiceStub, new Function1() { // from class: o.kfL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$1((MemeUiModel) obj));
            }
        }, str, i, defaultConstructorMarker);
        String str2 = null;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        TWITTER_X = new SocialMediaType("TWITTER_X", 2, "x", C23274hvD.Fragment.bindRcKey, null, C52761wXj.TaskDescription.ICustomTabsServiceDefault, new Function1() { // from class: o.kfN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$2((MemeUiModel) obj));
            }
        }, str2, 36, defaultConstructorMarker2);
        INSTAGRAM = new SocialMediaType("INSTAGRAM", 3, "insta", C23274hvD.Fragment.getOnBackPressedDispatcherannotations, CDNSourceManager.ImageSource.MemeSocialInstagram, C52761wXj.TaskDescription.dbUqJD, new Function1() { // from class: o.kfK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$3((MemeUiModel) obj));
            }
        }, str, i, defaultConstructorMarker);
        int i2 = 32;
        TELEGRAM = new SocialMediaType("TELEGRAM", 4, "tg", C23274hvD.Fragment.onStart, CDNSourceManager.ImageSource.MemeSocialTelegram, C52761wXj.TaskDescription.SaJVGb, new Function1() { // from class: o.kfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$4((MemeUiModel) obj));
            }
        }, str2, i2, defaultConstructorMarker2);
        TIKTOK = new SocialMediaType("TIKTOK", 5, TtmlNode.TAG_TT, C23274hvD.Fragment.ComponentDialogExternalSyntheticApiModelOutline0, CDNSourceManager.ImageSource.MemeSocialTiktok, C52761wXj.TaskDescription.ScLVFT, new Function1() { // from class: o.kfQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$5((MemeUiModel) obj));
            }
        }, str, i, defaultConstructorMarker);
        FACEBOOK = new SocialMediaType("FACEBOOK", 6, "facebook", C23274hvD.Fragment.ComponentDialog, CDNSourceManager.ImageSource.MemeSocialFacebook, C52761wXj.TaskDescription.invokespecialsiEkQe, new Function1() { // from class: o.kfO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$6((MemeUiModel) obj));
            }
        }, str2, i2, defaultConstructorMarker2);
        TWITCH = new SocialMediaType("TWITCH", 7, "twitch", C23274hvD.Fragment.FullyDrawnReporter, CDNSourceManager.ImageSource.MemeSocialTwitch, C52761wXj.TaskDescription.zUtmHU, new Function1() { // from class: o.kfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$7((MemeUiModel) obj));
            }
        }, str, i, defaultConstructorMarker);
        DISCORD = new SocialMediaType("DISCORD", 8, "discord", C23274hvD.Fragment.r8lambdaKrBLxNpMJdSxVU3Lsj65hn0UyA, CDNSourceManager.ImageSource.MemeSocialDiscord, C52761wXj.TaskDescription.cBPFI, new Function1() { // from class: o.kfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$8((MemeUiModel) obj));
            }
        }, str2, i2, defaultConstructorMarker2);
        CDNSourceManager.Activity activity = null;
        WEBSITE = new SocialMediaType("WEBSITE", 9, "web", C23274hvD.Fragment.lambdaexecute0, activity, C52761wXj.TaskDescription.ikIEnW, new Function1() { // from class: o.kfE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$9((MemeUiModel) obj));
            }
        }, str, 36, defaultConstructorMarker);
        CDNSourceManager.Activity activity2 = null;
        DEX_SCREENER_PAID = new SocialMediaType("DEX_SCREENER_PAID", 10, "dsPaid", C23274hvD.Fragment.setCaptioningEnabled, activity2, C23274hvD.ActionBar.getFieldNames, new Function1() { // from class: o.kfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$11((MemeUiModel) obj));
            }
        }, "ds_paid", 4, defaultConstructorMarker2);
        COMMUNITY_TAKEOVER = new SocialMediaType("COMMUNITY_TAKEOVER", 11, "dsTokenCommunityTakeOver", C23274hvD.Fragment.setShuffleModeEnabledRemoved, activity, C23274hvD.ActionBar.AxsJAY, new Function1() { // from class: o.kfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$13((MemeUiModel) obj));
            }
        }, "dexScreener_tokenCommunityTakeOver", 4, defaultConstructorMarker);
        PUMP_LIVE = new SocialMediaType("PUMP_LIVE", 12, "tokenPumpLive", C23274hvD.Fragment.getMediaController, activity2, C57406yhn.Activity.AubY, new Function1() { // from class: o.kfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SocialMediaType._init_$lambda$15((MemeUiModel) obj));
            }
        }, null, 36, defaultConstructorMarker2);
        SocialMediaType[] socialMediaTypeArr$values = $values();
        $VALUES = socialMediaTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(socialMediaTypeArr$values);
        Companion = new Activity(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Media mediaIsConnected = memeUiModel.isConnected();
        return (mediaIsConnected.AYXKKw() != null && mediaIsConnected.AYXKKw().OLrzqt().length() > 0) || (mediaIsConnected.djBIcL() != null && mediaIsConnected.djBIcL().KWHzl().length() > 0) || ((mediaIsConnected.AEQbTJ() != null && mediaIsConnected.AEQbTJ().copydefault().length() > 0) || mediaIsConnected.KWHzl().length() > 0 || ((mediaIsConnected.EZpvd() != null && mediaIsConnected.EZpvd().KWHzl().length() > 0) || ((mediaIsConnected.copydefault() != null && mediaIsConnected.copydefault().AEQbTJ().length() > 0) || ((mediaIsConnected.valueOf() != null && mediaIsConnected.valueOf().EZpvd().length() > 0) || ((mediaIsConnected.OLrzqt() != null && mediaIsConnected.OLrzqt().EZpvd().length() > 0) || mediaIsConnected.gEmmrt().length() > 0)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Media mediaIsConnected = memeUiModel.isConnected();
        return mediaIsConnected.AYXKKw() != null && mediaIsConnected.AYXKKw().OLrzqt().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Media mediaIsConnected = memeUiModel.isConnected();
        return mediaIsConnected.djBIcL() != null && mediaIsConnected.djBIcL().KWHzl().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Media mediaIsConnected = memeUiModel.isConnected();
        return mediaIsConnected.AEQbTJ() != null && mediaIsConnected.AEQbTJ().copydefault().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$4(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        return memeUiModel.isConnected().KWHzl().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$5(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Media mediaIsConnected = memeUiModel.isConnected();
        return mediaIsConnected.EZpvd() != null && mediaIsConnected.EZpvd().KWHzl().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$6(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Media mediaIsConnected = memeUiModel.isConnected();
        return mediaIsConnected.copydefault() != null && mediaIsConnected.copydefault().AEQbTJ().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$7(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Media mediaIsConnected = memeUiModel.isConnected();
        return mediaIsConnected.valueOf() != null && mediaIsConnected.valueOf().EZpvd().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$8(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Media mediaIsConnected = memeUiModel.isConnected();
        return mediaIsConnected.OLrzqt() != null && mediaIsConnected.OLrzqt().EZpvd().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$9(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        return memeUiModel.isConnected().gEmmrt().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$11(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        List<TagWrapper> listAhwBna = memeUiModel.AhwBna();
        if (!(listAhwBna instanceof Collection) || !listAhwBna.isEmpty()) {
            Iterator<T> it = listAhwBna.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((TagWrapper) it.next()).OLrzqt(), (Object) "ds_paid")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$13(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        List<TagWrapper> listAhwBna = memeUiModel.AhwBna();
        if (!(listAhwBna instanceof Collection) || !listAhwBna.isEmpty()) {
            Iterator<T> it = listAhwBna.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((TagWrapper) it.next()).OLrzqt(), (Object) "dexScreener_tokenCommunityTakeOver")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$15(MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        List<CompactTagData> listCopydefault = memeUiModel.copydefault();
        if (!(listCopydefault instanceof Collection) || !listCopydefault.isEmpty()) {
            for (CompactTagData compactTagData : listCopydefault) {
                if (Intrinsics.EZpvd((Object) compactTagData.copydefault(), (Object) "live_open") || Intrinsics.EZpvd((Object) compactTagData.copydefault(), (Object) "live_closed")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.filter.social.SocialMediaType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final SocialMediaType OLrzqt(@NotNull String str) {
            SocialMediaType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<SocialMediaType> it = SocialMediaType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getApiKey(), (Object) str)) {
                    break;
                }
            }
            return next;
        }

        public final boolean AEQbTJ(@NotNull MemeUiModel memeUiModel, @NotNull SocialMediaType socialMediaType) {
            Intrinsics.checkNotNullParameter(memeUiModel, "");
            Intrinsics.checkNotNullParameter(socialMediaType, "");
            if (socialMediaType.getTagDataKey() != null) {
                List<CompactTagData> listCopydefault = memeUiModel.copydefault();
                if (!(listCopydefault instanceof Collection) || !listCopydefault.isEmpty()) {
                    Iterator<T> it = listCopydefault.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((Object) ((CompactTagData) it.next()).copydefault(), (Object) socialMediaType.getTagDataKey())) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return socialMediaType.getValidator().invoke(memeUiModel).booleanValue();
        }
    }

    public static SocialMediaType valueOf(String str) {
        return (SocialMediaType) Enum.valueOf(SocialMediaType.class, str);
    }

    public static SocialMediaType[] values() {
        return (SocialMediaType[]) $VALUES.clone();
    }
}
