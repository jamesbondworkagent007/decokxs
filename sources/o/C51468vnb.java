package o;

import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vnb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51468vnb {
    public static /* synthetic */ C51469vnc convertSelectBotConfig$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return AEQbTJ(str, z);
    }

    public static final C51469vnc AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return C51412vmY.AEQbTJ.EZpvd(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [225=13] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.util.ArrayList<BotGuideData> AkhnZx() {
        xOU xouWlaJM;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strOLrzqt = (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
        if (strOLrzqt != null) {
            switch (strOLrzqt.hashCode()) {
                case -1831183611:
                    if (strOLrzqt.equals("spot_dca")) {
                        return values();
                    }
                    break;
                case -1418042064:
                    if (strOLrzqt.equals("ai_bot")) {
                        return gEmmrt();
                    }
                    break;
                case -1402017003:
                    if (strOLrzqt.equals("contract_dca")) {
                        return OLrzqt();
                    }
                    break;
                case -1216369070:
                    if (strOLrzqt.equals("smart_portfolio")) {
                        return AhwBna();
                    }
                    break;
                case -1148661171:
                    if (strOLrzqt.equals("smart_iceberg")) {
                        return KWHzl();
                    }
                    break;
                case -1086683216:
                    if (strOLrzqt.equals("signal_bot")) {
                        return AYXKKw();
                    }
                    break;
                case -557961837:
                    if (strOLrzqt.equals("smart_arbitrage")) {
                        return valueOf();
                    }
                    break;
                case -512749997:
                    if (strOLrzqt.equals("contract_grid")) {
                        return AEQbTJ();
                    }
                    break;
                case 3181382:
                    if (strOLrzqt.equals("grid")) {
                        return isConnected();
                    }
                    break;
                case 3573234:
                    if (strOLrzqt.equals("twap")) {
                        return fetchVPNInfo();
                    }
                    break;
                case 1165749981:
                    if (strOLrzqt.equals("recurring")) {
                        return djBIcL();
                    }
                    break;
                case 1485620813:
                    if (strOLrzqt.equals("dcd_bot")) {
                        return EZpvd();
                    }
                    break;
                case 1780188297:
                    if (strOLrzqt.equals("arbitrage")) {
                        return copydefault();
                    }
                    break;
            }
        }
        return new java.util.ArrayList<>();
    }

    public static final java.util.ArrayList<BotGuideData> EZpvd(java.lang.String str, Function1<? super C51467vna, Unit> function1) {
        C51467vna c51467vna = new C51467vna(str);
        function1.invoke(c51467vna);
        return c51467vna.EZpvd();
    }

    public static final java.util.ArrayList<BotGuideData> isConnected() {
        return EZpvd("grid", new Function1() { // from class: o.vnm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.iwGUEr((C51467vna) obj);
            }
        });
    }

    public static final Unit iwGUEr(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatToken1, C55688xof.Application.setSessionToken2Bundle, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C55688xof.Application.onSessionReady, (32 & 16) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.ActivityResultLauncherHolder), (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.toBundle, C55688xof.Application.setExtraBinder, C55688xof.Application.canTextInput, C55688xof.Application.onShuffleModeChangedRemoved, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.copydefault(C55688xof.Application.hasCallback, C55688xof.Application.MediaSessionCompatApi21, C55688xof.Application.AlertController, C55688xof.Application.onVolumeInfoChanged, C33070mpX.AYXKKw(C34703nhO.AEQbTJ() ? C55688xof.Application.setLauncher : C55688xof.Application.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner1));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> AhwBna() {
        return EZpvd("smart_portfolio", new Function1() { // from class: o.vmZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.hDKMBd((C51467vna) obj);
            }
        });
    }

    public static final Unit hDKMBd(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.getQueueItem, C55688xof.Application.fromQueueItem, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C55688xof.Application.MediaBrowserCompatMediaBrowserImplBase3, (32 & 16) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.isAttachedToWindow), (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatSessionFlags, C55688xof.Application.MediaSessionCompatResultReceiverWrapper, C55688xof.Application.canTextInput, C55688xof.Application.getStateLabel, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatQueueItem1, C55688xof.Application.MediaSessionCompatResultReceiverWrapper1, C55688xof.Application.AlertController, C55688xof.Application.UnZVfqExternalSyntheticApiModelOutline0, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.ActivityViewModelLazyKtviewModels1));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> values() {
        return EZpvd("spot_dca", new Function1() { // from class: o.vnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.uzCIH((C51467vna) obj);
            }
        });
    }

    public static final Unit uzCIH(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.fromBundle, C55688xof.Application.getToken, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C55688xof.Application.gmHjFq, (32 & 16) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.dLBcXg), (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.getExtraBinder, C55688xof.Application.equals, C55688xof.Application.canTextInput, C55688xof.Application.fXHmeK, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.hashCode, C55688xof.Application.MediaSessionCompatToken, C55688xof.Application.AlertController, C55688xof.Application.gSBher, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.startActivityForResult));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> OLrzqt() {
        return EZpvd("contract_dca", new Function1() { // from class: o.vnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.fetchVPNInfo((C51467vna) obj);
            }
        });
    }

    public static final Unit fetchVPNInfo(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatMediaSessionImplApi191, C55688xof.Application.onPlaybackPositionUpdate, C55688xof.Application.ActionBarDrawerToggleHoneycomb, C55688xof.Application.sILrnl, (32 & 16) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.GLcwwN), (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatMediaSessionImplApi181, C55688xof.Application.buildRccMetadata, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C55688xof.Application.zeUYeG, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.onMetadataUpdate, C55688xof.Application.MediaSessionCompatMediaSessionImplApi19, C55688xof.Application.canTextInput, C55688xof.Application.OzhFjl, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatMediaSessionImplApi28ExternalSyntheticApiModelOutline0, C55688xof.Application.MediaSessionCompatMediaSessionImplApi21, C55688xof.Application.AlertController, C55688xof.Application.QiTXOm, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.isFullyDrawnReported));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> AEQbTJ() {
        return EZpvd("contract_grid", new Function1() { // from class: o.vnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.isConnected((C51467vna) obj);
            }
        });
    }

    public static final Unit isConnected(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatMediaSessionImplApi28, C55688xof.Application.MediaSessionCompatMediaSessionImplApi21ExtraSession, C55688xof.Application.ActionBarDrawerToggleHoneycomb, C55688xof.Application.GzAsTt, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.sendEvent, C55688xof.Application.sendMetadata, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C55688xof.Application.HJWChP, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.sendCaptioningEnabled, C55688xof.Application.sendExtras, C55688xof.Application.canTextInput, C55688xof.Application.aappFQ, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.sendQueueTitle, C55688xof.Application.MediaSessionCompatMediaSessionImplBase, C55688xof.Application.AlertController, C55688xof.Application.onVolumeInfoChanged, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.getEnabledChangedCallbackactivity_release));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> KWHzl() {
        return EZpvd("smart_iceberg", new Function1() { // from class: o.vni
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.ejfBZ((C51467vna) obj);
            }
        });
    }

    public static final Unit ejfBZ(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.sendRepeatMode, C55688xof.Application.sendSessionDestroyed, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C55688xof.Application.onScrollChange, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.sendShuffleMode, C55688xof.Application.sendQueue, C55688xof.Application.canTextInput, C55688xof.Application.setView, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.getRccStateFromState, C55688xof.Application.sendState, C55688xof.Application.readTypedObject, C55688xof.Application.UnZVfqExternalSyntheticApiModelOutline0, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.ReportDrawnKtReportDrawnWhen1invokeinlinedonDispose2));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> fetchVPNInfo() {
        return EZpvd("twap", new Function1() { // from class: o.vnp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.getNewProxyInstance((C51467vna) obj);
            }
        });
    }

    public static final Unit getNewProxyInstance(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.createSession, C55688xof.Application.verifySession, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C55688xof.Application.BVXAa, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatApi21CallbackProxy, C55688xof.Application.verifyToken, C55688xof.Application.canTextInput, C55688xof.Application.HJWChPUUMfbK, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.createItem, C55688xof.Application.MediaSessionCompatApi21Callback, C55688xof.Application.readTypedObject, C55688xof.Application.UnZVfqExternalSyntheticApiModelOutline0, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.ActionBarDrawerToggleHoneycombSetIndicatorInfo));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> valueOf() {
        return EZpvd("smart_arbitrage", new Function1() { // from class: o.vnd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.fJNWhG((C51467vna) obj);
            }
        });
    }

    public static final Unit fJNWhG(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.MediaBrowserCompatItemReceiver, C55688xof.Application.MediaBrowserCompatItemCallbackItemCallbackApi23, C55688xof.Application.INotificationSideChannelDefault, C55688xof.Application.INotificationSideChannelStub, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.MediaBrowserCompatMediaBrowserImpl, C55688xof.Application.onProgressUpdate, C55688xof.Application.access000, C55688xof.Application.INotificationSideChannel_Parcel, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.onItemLoaded, C55688xof.Application.MediaBrowserCompatItemCallback, C55688xof.Application.readTypedObject, C55688xof.Application.notify, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.INotificationSideChannelStubProxy));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> copydefault() {
        return yDY.copydefault(new BotGuideData(null, null, null, "arbitrage", null, new BotGuideLinkItem(null, C33070mpX.AYXKKw(C55688xof.Application.fastForward), 1, null), null, 0, C33070mpX.AYXKKw(C55688xof.Application.getRatingType), null, 727, null));
    }

    public static final java.util.ArrayList<BotGuideData> djBIcL() {
        return EZpvd("recurring", new Function1() { // from class: o.vnl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.fIwbmz((C51467vna) obj);
            }
        });
    }

    public static final Unit fIwbmz(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatMediaSessionImplBase1, C55688xof.Application.update, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C55688xof.Application.fOrBHg, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatMediaSessionImplBaseMediaSessionStub, C55688xof.Application.sendVolumeInfoChanged, C55688xof.Application.canTextInput, C55688xof.Application.UvfnWv, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.onVolumeChanged, C55688xof.Application.MediaSessionCompatMediaSessionImplBaseMessageHandler, C55688xof.Application.AlertController, C55688xof.Application.UnZVfqExternalSyntheticApiModelOutline0, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.DoNotInline));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> AYXKKw() {
        return EZpvd("signal_bot", new Function1() { // from class: o.vnk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.AuCTel((C51467vna) obj);
            }
        });
    }

    public static final Unit AuCTel(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.MediaSessionCompatOnActiveChangeListener, C55688xof.Application.MediaSessionCompatMediaSessionImplBaseCommand, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C55688xof.Application.ICustomTabsServiceStub, (32 & 16) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.warmup), (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.onActiveChanged, C55688xof.Application.fromQueueItemList, C55688xof.Application.canTextInput, C55688xof.Application.ICustomTabsServiceStubProxy, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.getQueueId, C55688xof.Application.MediaSessionCompatQueueItem, C55688xof.Application.AlertController, C55688xof.Application.ICustomTabsServiceDefault, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.arDRxL));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> EZpvd() {
        return EZpvd("dcd_bot", new Function1() { // from class: o.vng
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.values((C51467vna) obj);
            }
        });
    }

    public static final Unit values(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C55688xof.Application.DPHOMC, C55688xof.Application.ROgMPW, C55688xof.Application.dPnHjp, C55688xof.Application.dIjzlO, (32 & 16) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.deregisterUser), (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.invokespecialsiEkQe, C55688xof.Application.DaTmkG, C55688xof.Application.aVhqwO, C55688xof.Application.fupbxE, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.ODCBUN, C55688xof.Application.invokespecialdPnHjp, C55688xof.Application.Rtjmuc, C55688xof.Application.RuDPQV, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C55688xof.Application.aGOrKO, C55688xof.Application.YFmri, C55688xof.Application.aKhcqp, C55688xof.Application.atDTRm, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C55688xof.Application.aCSzUz));
        return Unit.INSTANCE;
    }

    public static final java.util.ArrayList<BotGuideData> gEmmrt() {
        return EZpvd("ai_bot", new Function1() { // from class: o.vne
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51468vnb.fARcdN((C51467vna) obj);
            }
        });
    }

    public static final Unit fARcdN(C51467vna c51467vna) {
        Intrinsics.checkNotNullParameter(c51467vna, "");
        c51467vna.OLrzqt(C48033uCm.Fragment.OFqMGB, C48033uCm.Fragment.seuMaA, C48033uCm.Fragment.RjCdvp, C48033uCm.Fragment.QhsCdEQhsCdE, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C48033uCm.Fragment.dYepVG, C48033uCm.Fragment.znKlvJ, C55688xof.Application.ActionBarDrawerToggleToolbarCompatDelegate, C48033uCm.Fragment.RjCdvpRjCdvp, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C48033uCm.Fragment.avCqka, C48033uCm.Fragment.adevsa, C55688xof.Application.canTextInput, C48033uCm.Fragment.RsCxkX, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
        c51467vna.OLrzqt(C48033uCm.Fragment.zbGDDc, C48033uCm.Fragment.OGitdB, C55688xof.Application.AlertController, C55688xof.Application.onVolumeInfoChanged, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Integer.valueOf(C48033uCm.Fragment.dxcTrN));
        return Unit.INSTANCE;
    }

    public static final java.util.List<java.lang.String> DbNXlk() {
        return yDY.gEmmrt("arbitrage", "smart_iceberg", "twap");
    }

    public static final java.util.List<java.lang.String> fARcdN() {
        return yDY.AhwBna();
    }
}
