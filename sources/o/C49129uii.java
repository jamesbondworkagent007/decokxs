package o;

import com.okinc.rxutils.RxBus;
import com.okinc.share.bean.PlatformListConfig;
import com.okinc.share.bean.ShareChannelsResp;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.SharePlatformComponents;
import com.okinc.share.bean.ShortLinkReq;
import com.okinc.share.bean.ShortLinkResp;
import com.okinc.share.platforms.PlatformCategory;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.share.platforms.SharePlatformHub$RustSharePlatformHubImpl$createShortLink$2;
import com.okinc.share.platforms.SharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1;
import com.okinc.share.platforms.SharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxFlowableKt;
import o.C49122uib;
import o.C49129uii;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49129uii {
    public static final C49129uii AEQbTJ = new C49129uii();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.uij
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49129uii.AEQbTJ();
        }
    });
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uil
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49129uii.OLrzqt();
        }
    });
    public static final int KWHzl = 8;

    private C49129uii() {
    }

    public static final StateListAnimator AEQbTJ() {
        return new StateListAnimator();
    }

    public final StateListAnimator EZpvd() {
        return (StateListAnimator) OLrzqt.getValue();
    }

    public static final ActionBar OLrzqt() {
        return new ActionBar();
    }

    public final ActionBar AhwBna() {
        return (ActionBar) EZpvd.getValue();
    }

    public AbstractC58185ywX<java.util.List<SharePlatform>> OLrzqt(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        if (C49289ulj.copydefault.OLrzqt()) {
            return AhwBna().EZpvd(shareConfig);
        }
        return EZpvd().copydefault(shareConfig);
    }

    public AbstractC58185ywX<SharePlatformComponents> djBIcL() {
        if (C49289ulj.copydefault.OLrzqt()) {
            return AhwBna().EZpvd();
        }
        return EZpvd().EZpvd();
    }

    public AbstractC58185ywX<C48887ueE> copydefault(@NotNull java.lang.String str, @NotNull C48891ueI c48891ueI) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c48891ueI, "");
        if (C49289ulj.copydefault.OLrzqt()) {
            return AhwBna().OLrzqt(str, c48891ueI);
        }
        return EZpvd().copydefault(str, c48891ueI);
    }

    /* JADX INFO: renamed from: o.uii$StateListAnimator */
    public static final class StateListAnimator {
        public AtomicReference<PlatformListConfig> AEQbTJ;

        /* JADX INFO: renamed from: o.uii$StateListAnimator$Application */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PlatformCategory.values().length];
                try {
                    iArr[PlatformCategory.SOCIAL.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[PlatformCategory.INTERNAL.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[PlatformCategory.FUNCTION.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                copydefault = iArr;
            }
        }

        public StateListAnimator() {
            KWHzl();
            this.AEQbTJ = new AtomicReference<>(null);
        }

        public final void KWHzl() {
            RxBus.AEQbTJ("EVENT_CHANGE_LANGUAGE", "ev_account_change", "ev_account_login", "ev_account_logout").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.share.platforms.SharePlatformHub$NativeSharePlatformHubImpl$onInit$1
                {
                    super(this.this$0);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str) {
                    pUU.KWHzl("SharePlatformHub", "onEvent:" + str);
                    this.this$0.AEQbTJ.set(null);
                }
            });
            C49122uib.OLrzqt.copydefault(new Activity());
        }

        /* JADX INFO: renamed from: o.uii$StateListAnimator$Activity */
        public static final class Activity implements C49122uib.Application {
            public Activity() {
            }

            @Override // o.C49122uib.Application
            public void EZpvd(SharePlatform sharePlatform, java.lang.String str, boolean z) {
                Intrinsics.checkNotNullParameter(sharePlatform, "");
                Intrinsics.checkNotNullParameter(str, "");
                pUU.KWHzl("SharePlatformHub", "onPackageChanged-->packageName:" + str + " isInstalled:" + z);
                StateListAnimator.this.AEQbTJ.set(null);
            }
        }

        public AbstractC58185ywX<java.util.List<SharePlatform>> copydefault(@NotNull final ShareConfig shareConfig) {
            AbstractC58185ywX abstractC58185ywXAEQbTJ;
            Intrinsics.checkNotNullParameter(shareConfig, "");
            PlatformListConfig platformListConfig = this.AEQbTJ.get();
            if (C33129mqd.KWHzl((java.util.Collection) (platformListConfig != null ? platformListConfig.getPlatformList() : null))) {
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(platformListConfig);
                final Function1 function1 = new Function1() { // from class: o.uik
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49129uii.StateListAnimator.OLrzqt(this.KWHzl, shareConfig, (PlatformListConfig) obj);
                    }
                };
                AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.uih
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C49129uii.StateListAnimator.valueOf(function1, obj);
                    }
                });
                AbstractC58185ywX<PlatformListConfig> abstractC58185ywXAEQbTJ3 = AEQbTJ();
                final Function1 function12 = new Function1() { // from class: o.uip
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49129uii.StateListAnimator.AEQbTJ(this.OLrzqt, shareConfig, (PlatformListConfig) obj);
                    }
                };
                abstractC58185ywXAEQbTJ = AbstractC58185ywX.KWHzl(abstractC58185ywXAEQbTJ2, abstractC58185ywXAEQbTJ3.AEQbTJ(new InterfaceC58229yxO() { // from class: o.uit
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C49129uii.StateListAnimator.AkhnZx(function12, obj);
                    }
                }));
            } else {
                pUU.KWHzl("SharePlatformHub", "getDisplaySharePlatforms:-->requestNetworkSharePlatformsList");
                AbstractC58185ywX<PlatformListConfig> abstractC58185ywXAEQbTJ4 = AEQbTJ();
                final Function1 function13 = new Function1() { // from class: o.uir
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49129uii.StateListAnimator.AYXKKw(this.OLrzqt, shareConfig, (PlatformListConfig) obj);
                    }
                };
                abstractC58185ywXAEQbTJ = abstractC58185ywXAEQbTJ4.AEQbTJ(new InterfaceC58229yxO() { // from class: o.uis
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C49129uii.StateListAnimator.values(function13, obj);
                    }
                });
            }
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return C33024moe.KWHzl(abstractC58185ywXAEQbTJ);
        }

        public static final java.util.List valueOf(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (java.util.List) function1.invoke(obj);
        }

        public static final java.util.List OLrzqt(StateListAnimator stateListAnimator, ShareConfig shareConfig, PlatformListConfig platformListConfig) {
            Intrinsics.checkNotNullParameter(platformListConfig, "");
            pUU.KWHzl("SharePlatformHub", "getDisplaySharePlatforms:-->cachedSharePlatforms");
            return stateListAnimator.copydefault(platformListConfig, shareConfig);
        }

        public static final java.util.List AkhnZx(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (java.util.List) function1.invoke(obj);
        }

        public static final java.util.List AEQbTJ(StateListAnimator stateListAnimator, ShareConfig shareConfig, PlatformListConfig platformListConfig) {
            Intrinsics.checkNotNullParameter(platformListConfig, "");
            stateListAnimator.AEQbTJ.set(platformListConfig);
            return stateListAnimator.copydefault(platformListConfig, shareConfig);
        }

        public static final java.util.List values(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (java.util.List) function1.invoke(obj);
        }

        public static final java.util.List AYXKKw(StateListAnimator stateListAnimator, ShareConfig shareConfig, PlatformListConfig platformListConfig) {
            Intrinsics.checkNotNullParameter(platformListConfig, "");
            stateListAnimator.AEQbTJ.set(platformListConfig);
            return stateListAnimator.copydefault(platformListConfig, shareConfig);
        }

        public AbstractC58185ywX<SharePlatformComponents> EZpvd() {
            return C33024moe.KWHzl(C43423rox.unwrapResponseData$default(InterfaceC49179ujf.Companion.AEQbTJ().AEQbTJ(), (Function1) null, 1, (java.lang.Object) null));
        }

        public AbstractC58185ywX<C48887ueE> copydefault(@NotNull final java.lang.String str, @NotNull final C48891ueI c48891ueI) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c48891ueI, "");
            if (C49004ugP.OLrzqt.EZpvd().isUserInDemoTrading()) {
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(str);
                final Function1 function1 = new Function1() { // from class: o.uiq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49129uii.StateListAnimator.AEQbTJ((java.lang.String) obj);
                    }
                };
                AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.uio
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C49129uii.StateListAnimator.AYXKKw(function1, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
                return abstractC58185ywXAEQbTJ;
            }
            InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
            boolean zFZBcTu = android.text.TextUtils.equals(interfaceC48893ueK.DTwDnp().djBIcL(), str) ? false : interfaceC48893ueK.fZBcTu();
            java.lang.String strOLrzqt = c48891ueI.OLrzqt();
            final ShortLinkReq shortLinkReq = new ShortLinkReq(str, c48891ueI.copydefault(), c48891ueI.EZpvd(), zFZBcTu, java.lang.Integer.valueOf(c48891ueI.KWHzl().getBehavior()), strOLrzqt == null ? interfaceC48893ueK.iwGUEr() : strOLrzqt);
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C33024moe.KWHzl((AbstractC58185ywX) InterfaceC49179ujf.Companion.AEQbTJ().KWHzl(shortLinkReq)), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function12 = new Function1() { // from class: o.uin
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49129uii.StateListAnimator.AEQbTJ(shortLinkReq, str, c48891ueI, (ShortLinkResp) obj);
                }
            };
            AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ2 = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.uim
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C49129uii.StateListAnimator.gEmmrt(function12, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
            return abstractC58185ywXAEQbTJ2;
        }

        public static final C48887ueE AYXKKw(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (C48887ueE) function1.invoke(obj);
        }

        public static final C48887ueE AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            throw new java.lang.IllegalStateException("create short link is not available in demo trading mode");
        }

        public static final C48887ueE gEmmrt(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (C48887ueE) function1.invoke(obj);
        }

        public static final C48887ueE AEQbTJ(ShortLinkReq shortLinkReq, java.lang.String str, C48891ueI c48891ueI, ShortLinkResp shortLinkResp) {
            Intrinsics.checkNotNullParameter(shortLinkResp, "");
            pUU.EZpvd("OKShare", "createShortLink->params:" + shortLinkReq + " result:" + shortLinkResp);
            java.lang.String shortLink = shortLinkResp.getShortLink();
            if (shortLink == null || shortLink.length() == 0) {
                throw new java.lang.UnsupportedOperationException("short link is empty");
            }
            C49003ugO.AEQbTJ.copydefault(str, c48891ueI.copydefault(), shortLinkResp.getShortLink());
            return new C48887ueE(shortLinkResp.getShortLink(), shortLinkResp.getFullLink());
        }

        public final AbstractC58185ywX<PlatformListConfig> AEQbTJ() {
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(InterfaceC49179ujf.Companion.AEQbTJ().OLrzqt(), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.uiv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49129uii.StateListAnimator.OLrzqt((ShareChannelsResp) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.uiu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C49129uii.StateListAnimator.DbNXlk(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.uiz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49129uii.StateListAnimator.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.uiy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C49129uii.StateListAnimator.isConnected(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
            return C33024moe.KWHzl(abstractC58185ywXDjBIcL);
        }

        public static final PlatformListConfig DbNXlk(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (PlatformListConfig) function1.invoke(obj);
        }

        public static final PlatformListConfig OLrzqt(ShareChannelsResp shareChannelsResp) {
            Intrinsics.checkNotNullParameter(shareChannelsResp, "");
            pUU.KWHzl("OKShare", "getSharePlatformsV3->" + shareChannelsResp);
            java.util.List<java.lang.Integer> channels = shareChannelsResp.getChannels();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = channels.iterator();
            while (it.hasNext()) {
                SharePlatform sharePlatformValueOf = SharePlatform.CREATOR.valueOf(((java.lang.Number) it.next()).intValue());
                if (sharePlatformValueOf != null) {
                    arrayList.add(sharePlatformValueOf);
                }
            }
            return new PlatformListConfig(arrayList, shareChannelsResp.getSocialMaxLimit(), shareChannelsResp.getInternalMaxLimit(), shareChannelsResp.getFunctionMaxLimit());
        }

        public static final PlatformListConfig isConnected(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (PlatformListConfig) function1.invoke(obj);
        }

        public static final PlatformListConfig copydefault(StateListAnimator stateListAnimator, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return stateListAnimator.copydefault();
        }

        public final java.util.List<SharePlatform> copydefault(@NotNull PlatformListConfig platformListConfig, @NotNull ShareConfig shareConfig) {
            Intrinsics.checkNotNullParameter(platformListConfig, "");
            Intrinsics.checkNotNullParameter(shareConfig, "");
            java.util.List<SharePlatform> platformList = platformListConfig.getPlatformList();
            pUU.EZpvd("OKShare", "filterSharePlatformsByShareConfig->source:" + CollectionsKt___CollectionsKt.joinToString$default(platformList, ",", null, null, 0, null, null, 62, null));
            java.util.ArrayList<SharePlatform> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : platformList) {
                if (EZpvd((SharePlatform) obj, shareConfig)) {
                    arrayList.add(obj);
                }
            }
            pUU.EZpvd("OKShare", "filterSharePlatformsByShareConfig->isAvailableFiltered:" + CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (SharePlatform sharePlatform : arrayList) {
                int i4 = Application.copydefault[sharePlatform.getPlatformCategory().ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (platformListConfig.getInternalMaxLimit() < 0 || i2 < platformListConfig.getInternalMaxLimit()) {
                            arrayList2.add(sharePlatform);
                            i2++;
                        }
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (platformListConfig.getFunctionMaxLimit() < 0 || i3 < platformListConfig.getFunctionMaxLimit()) {
                            arrayList2.add(sharePlatform);
                            i3++;
                        }
                    }
                } else if (platformListConfig.getSocialMaxLimit() < 0 || i < platformListConfig.getSocialMaxLimit()) {
                    arrayList2.add(sharePlatform);
                    i++;
                }
            }
            pUU.EZpvd("OKShare", "filterSharePlatformsByShareConfig->maxLimitFiltered:" + CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null));
            return arrayList2;
        }

        public final boolean EZpvd(SharePlatform sharePlatform, ShareConfig shareConfig) {
            C49098uiD c49098uiD = C49098uiD.OLrzqt;
            InterfaceC49121uia interfaceC49121uiaAEQbTJ = c49098uiD.AEQbTJ(sharePlatform);
            if (interfaceC49121uiaAEQbTJ != null) {
                if (interfaceC49121uiaAEQbTJ.AEQbTJ().contains(shareConfig.getShareParams().getShareType()) && c49098uiD.copydefault(sharePlatform) && interfaceC49121uiaAEQbTJ.EZpvd(shareConfig)) {
                    return true;
                }
            } else {
                pUU.valueOf("SharePlatformHub", "isAvailableSharePlatform-->platform:" + sharePlatform + " not register");
            }
            return false;
        }

        public final PlatformListConfig copydefault() {
            PlatformListConfig platformListConfig;
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            boolean zOLrzqt = C38303pTu.OLrzqt(locale);
            if (zOLrzqt) {
                platformListConfig = new PlatformListConfig(yDY.gEmmrt(SharePlatform.WECHAT, SharePlatform.WECHAT_MOMENTS, SharePlatform.SINA_WEIBO, SharePlatform.QQ, SharePlatform.SAVE_IMAGE, SharePlatform.LINK, SharePlatform.MORE), 0, 0, 0, 14, null);
            } else {
                platformListConfig = new PlatformListConfig(yDY.gEmmrt(SharePlatform.WHATS_APP, SharePlatform.TELEGRAM, SharePlatform.FACEBOOK, SharePlatform.FACEBOOK_MESSENGER, SharePlatform.TWITTER, SharePlatform.LINE, SharePlatform.DISCORD, SharePlatform.SAVE_IMAGE, SharePlatform.LINK, SharePlatform.MORE), 0, 0, 0, 14, null);
            }
            pUU.KWHzl("SharePlatformHub", "getDefaultSharePlatforms->isSimplifiedChinese:" + zOLrzqt + " Platforms:" + platformListConfig);
            return platformListConfig;
        }
    }

    /* JADX INFO: renamed from: o.uii$ActionBar */
    public static final class ActionBar {
        public final APK copydefault = ANQ.getSharedSharePlatformManager();

        public AbstractC58185ywX<java.util.List<SharePlatform>> EZpvd(@NotNull ShareConfig shareConfig) {
            Intrinsics.checkNotNullParameter(shareConfig, "");
            return C33024moe.KWHzl(RxFlowableKt.rxFlowable$default(null, new SharePlatformHub$RustSharePlatformHubImpl$getDisplaySharePlatformList$1(this, C48889ueG.KWHzl.copydefault(shareConfig), null), 1, null));
        }

        public AbstractC58185ywX<SharePlatformComponents> EZpvd() {
            return RxFlowableKt.rxFlowable$default(null, new SharePlatformHub$RustSharePlatformHubImpl$getShareComponentConfig$1(this, null), 1, null);
        }

        public AbstractC58185ywX<C48887ueE> OLrzqt(@NotNull final java.lang.String str, @NotNull final C48891ueI c48891ueI) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c48891ueI, "");
            if (C49004ugP.OLrzqt.EZpvd().isUserInDemoTrading()) {
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(str);
                final Function1 function1 = new Function1() { // from class: o.uix
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49129uii.ActionBar.OLrzqt((java.lang.String) obj);
                    }
                };
                AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.uiA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C49129uii.ActionBar.copydefault(function1, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
                return abstractC58185ywXAEQbTJ;
            }
            InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
            boolean zFZBcTu = android.text.TextUtils.equals(interfaceC48893ueK.DTwDnp().djBIcL(), str) ? false : interfaceC48893ueK.fZBcTu();
            java.lang.String strOLrzqt = c48891ueI.OLrzqt();
            final ShortLinkReq shortLinkReq = new ShortLinkReq(str, c48891ueI.copydefault(), c48891ueI.EZpvd(), zFZBcTu, java.lang.Integer.valueOf(c48891ueI.KWHzl().getBehavior()), strOLrzqt == null ? interfaceC48893ueK.iwGUEr() : strOLrzqt);
            java.lang.String originalLink = shortLinkReq.getOriginalLink();
            java.lang.String shareFrom = shortLinkReq.getShareFrom();
            java.lang.String str2 = shareFrom == null ? "" : shareFrom;
            java.lang.String deeplink = shortLinkReq.getDeeplink();
            boolean attachChannelCode = shortLinkReq.getAttachChannelCode();
            java.lang.Integer redirectBehavior = shortLinkReq.getRedirectBehavior();
            AbstractC58185ywX abstractC58185ywXKWHzl2 = C33024moe.KWHzl(RxFlowableKt.rxFlowable$default(null, new SharePlatformHub$RustSharePlatformHubImpl$createShortLink$2(this, new AQB(originalLink, str2, deeplink, attachChannelCode, redirectBehavior != null ? redirectBehavior.intValue() : 1, shortLinkReq.getUtmScene()), null), 1, null));
            final Function1 function12 = new Function1() { // from class: o.uiw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49129uii.ActionBar.copydefault(shortLinkReq, str, c48891ueI, (ShortLinkResp) obj);
                }
            };
            AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.uiE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C49129uii.ActionBar.KWHzl(function12, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
            return abstractC58185ywXAEQbTJ2;
        }

        public static final C48887ueE copydefault(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (C48887ueE) function1.invoke(obj);
        }

        public static final C48887ueE OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            throw new java.lang.IllegalStateException("create short link is not available in demo trading mode");
        }

        public static final C48887ueE KWHzl(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (C48887ueE) function1.invoke(obj);
        }

        public static final C48887ueE copydefault(ShortLinkReq shortLinkReq, java.lang.String str, C48891ueI c48891ueI, ShortLinkResp shortLinkResp) {
            Intrinsics.checkNotNullParameter(shortLinkResp, "");
            pUU.EZpvd("OKShare", "createShortLink->params:" + shortLinkReq + " result:" + shortLinkResp);
            java.lang.String shortLink = shortLinkResp.getShortLink();
            if (shortLink == null || shortLink.length() == 0) {
                throw new java.lang.UnsupportedOperationException("short link is empty");
            }
            C49003ugO.AEQbTJ.copydefault(str, c48891ueI.copydefault(), shortLinkResp.getShortLink());
            return new C48887ueE(shortLinkResp.getShortLink(), shortLinkResp.getFullLink());
        }
    }
}
