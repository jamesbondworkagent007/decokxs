package o;

import com.okinc.share.bean.AndroidPlatformComponents;
import com.okinc.share.bean.PlatformComponentInfo;
import com.okinc.share.bean.SharePlatformComponents;
import com.okinc.share.platforms.SharePlatform;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.uhZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49067uhZ {
    public static AndroidPlatformComponents OLrzqt;
    public static final C49067uhZ AEQbTJ = new C49067uhZ();
    public static AtomicBoolean KWHzl = new AtomicBoolean(false);
    public static final int EZpvd = 8;

    private C49067uhZ() {
    }

    public void AEQbTJ() {
        if (OLrzqt != null || KWHzl.get()) {
            return;
        }
        KWHzl.set(true);
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) C49129uii.AEQbTJ.djBIcL());
        final Function1 function1 = new Function1() { // from class: o.uig
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49067uhZ.KWHzl((SharePlatformComponents) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49067uhZ.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49067uhZ.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uid
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49067uhZ.EZpvd(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(SharePlatformComponents sharePlatformComponents) {
        OLrzqt = sharePlatformComponents.getAndroidComponents();
        AEQbTJ.OLrzqt(sharePlatformComponents.getAndroidComponents());
        KWHzl.set(false);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        KWHzl.set(false);
        pUU.copydefault("OKShare", "asyncLoadComponents occur error: " + th.getMessage());
        return Unit.INSTANCE;
    }

    public void OLrzqt() {
        if (KWHzl.get()) {
            return;
        }
        OLrzqt = null;
        pUU.EZpvd("OKShare", "reloadComponents -->");
        AEQbTJ();
    }

    public final void OLrzqt(AndroidPlatformComponents androidPlatformComponents) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        PlatformComponentInfo twitter = androidPlatformComponents.getTwitter();
        if (twitter != null) {
            AEQbTJ.KWHzl(twitter, SharePlatform.TWITTER);
        }
        PlatformComponentInfo telegram = androidPlatformComponents.getTelegram();
        if (telegram != null) {
            AEQbTJ.KWHzl(telegram, SharePlatform.TELEGRAM);
        }
        PlatformComponentInfo whatsapp = androidPlatformComponents.getWhatsapp();
        if (whatsapp != null) {
            AEQbTJ.KWHzl(whatsapp, SharePlatform.WHATS_APP);
        }
        PlatformComponentInfo facebook = androidPlatformComponents.getFacebook();
        if (facebook != null) {
            AEQbTJ.KWHzl(facebook, SharePlatform.FACEBOOK);
        }
        PlatformComponentInfo instagram = androidPlatformComponents.getInstagram();
        if (instagram != null) {
            AEQbTJ.KWHzl(instagram, SharePlatform.INSTAGRAM);
        }
        PlatformComponentInfo wechatMoments = androidPlatformComponents.getWechatMoments();
        if (wechatMoments != null) {
            AEQbTJ.KWHzl(wechatMoments, SharePlatform.WECHAT_MOMENTS);
        }
        PlatformComponentInfo sinaWeibo = androidPlatformComponents.getSinaWeibo();
        if (sinaWeibo != null) {
            AEQbTJ.KWHzl(sinaWeibo, SharePlatform.SINA_WEIBO);
        }
        PlatformComponentInfo wechat = androidPlatformComponents.getWechat();
        if (wechat != null) {
            AEQbTJ.KWHzl(wechat, SharePlatform.WECHAT);
        }
        PlatformComponentInfo facebookMessenger = androidPlatformComponents.getFacebookMessenger();
        if (facebookMessenger != null) {
            AEQbTJ.KWHzl(facebookMessenger, SharePlatform.FACEBOOK_MESSENGER);
        }
        PlatformComponentInfo kaokao = androidPlatformComponents.getKaokao();
        if (kaokao != null) {
            AEQbTJ.KWHzl(kaokao, SharePlatform.KAKAO);
        }
        PlatformComponentInfo viber = androidPlatformComponents.getViber();
        if (viber != null) {
            AEQbTJ.KWHzl(viber, SharePlatform.VIBER);
        }
        PlatformComponentInfo line = androidPlatformComponents.getLine();
        if (line != null) {
            AEQbTJ.KWHzl(line, SharePlatform.LINE);
        }
        PlatformComponentInfo zalo = androidPlatformComponents.getZalo();
        if (zalo != null) {
            AEQbTJ.KWHzl(zalo, SharePlatform.ZALO);
        }
        PlatformComponentInfo qq = androidPlatformComponents.getQq();
        if (qq != null) {
            AEQbTJ.KWHzl(qq, SharePlatform.QQ);
        }
        PlatformComponentInfo vk = androidPlatformComponents.getVk();
        if (vk != null) {
            AEQbTJ.KWHzl(vk, SharePlatform.VK);
        }
        pUU.EZpvd("OKShare", "installAllPlatformComponents->costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }

    public final void KWHzl(PlatformComponentInfo platformComponentInfo, SharePlatform sharePlatform) {
        InterfaceC49121uia interfaceC49121uiaAEQbTJ = C49098uiD.OLrzqt.AEQbTJ(sharePlatform);
        if (interfaceC49121uiaAEQbTJ != null) {
            interfaceC49121uiaAEQbTJ.KWHzl(platformComponentInfo.getPkg());
            interfaceC49121uiaAEQbTJ.OLrzqt(platformComponentInfo.getComponents());
            pUU.EZpvd("OKShare", "installComponentInfo->sharePlatform:" + sharePlatform + " pkg:" + platformComponentInfo.getPkg() + " components:" + platformComponentInfo.getComponents());
        }
    }
}
