package o;

import androidx.core.os.BundleKt;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxStatusSubManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C9678baC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gKu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19665gKu {
    public static final InterfaceC56387yDm AEQbTJ;
    public static final InterfaceC56387yDm EZpvd;
    public static final TaskDescription KWHzl;
    public static final C19665gKu OLrzqt;
    public static final int copydefault;

    private C19665gKu() {
    }

    static {
        C19665gKu c19665gKu = new C19665gKu();
        OLrzqt = c19665gKu;
        AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gKz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19665gKu.KWHzl();
            }
        });
        KWHzl = new TaskDescription(android.os.Looper.getMainLooper());
        EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.gKF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19665gKu.EZpvd();
            }
        });
        c19665gKu.gEmmrt().copydefault(1, C13754dXa.FragmentManager.apply, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"tokenName"}, 1), 1, null);
        c19665gKu.gEmmrt().copydefault(1, C13754dXa.FragmentManager.QOjuYg, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        c19665gKu.gEmmrt().copydefault(2, C13754dXa.FragmentManager.QMuEJi, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"coin"}, 1), -1, null);
        int i = C13754dXa.FragmentManager.BVXAa;
        java.util.HashMap map = new java.util.HashMap();
        map.put("count", new Function1() { // from class: o.gKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.AuCTel((java.lang.String) obj);
            }
        });
        c19665gKu.gEmmrt().copydefault(3, i, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"count", "coin"}, 2), -1, map);
        c19665gKu.gEmmrt().copydefault(4, C13754dXa.FragmentManager.pauseLocationServices, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"coin"}, 1), -1, null);
        c19665gKu.gEmmrt().copydefault(5, C13754dXa.FragmentManager.invokespecialdPnHjp, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"coin"}, 1), -1, null);
        c19665gKu.gEmmrt().copydefault(6, C13754dXa.FragmentManager.DPHOMC, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        int i2 = C13754dXa.FragmentManager.RcvFxC;
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("fromCount", new Function1() { // from class: o.gKK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.fIwbmz((java.lang.String) obj);
            }
        });
        map2.put("toCount", new Function1() { // from class: o.gKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.getNewProxyInstance((java.lang.String) obj);
            }
        });
        c19665gKu.gEmmrt().copydefault(7, i2, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"fromCount", "fromCoin", "toCount", "toCoin"}, 4), -1, map2);
        c19665gKu.gEmmrt().copydefault(8, C13754dXa.FragmentManager.dSJNDS, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        int i3 = C13754dXa.FragmentManager.invokespecialhlXVux;
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put("count", new Function1() { // from class: o.gKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.getFieldNames((java.lang.String) obj);
            }
        });
        c19665gKu.gEmmrt().copydefault(9, i3, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"count", "coin"}, 2), -1, map3);
        c19665gKu.gEmmrt().copydefault(10, C13754dXa.FragmentManager.invokespecialgBtXYZ, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        int i4 = C13754dXa.FragmentManager.invokespecialatDTRm;
        java.util.HashMap map4 = new java.util.HashMap();
        map4.put("fromCount", new Function1() { // from class: o.gKB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.DbNXlk((java.lang.String) obj);
            }
        });
        map4.put("toCount", new Function1() { // from class: o.gKA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.values((java.lang.String) obj);
            }
        });
        c19665gKu.gEmmrt().copydefault(11, i4, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"fromCount", "fromCoin", "toCount", "toCoin"}, 4), -1, map4);
        c19665gKu.gEmmrt().copydefault(12, C13754dXa.FragmentManager.QWpYiD, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        c19665gKu.gEmmrt().copydefault(13, C13754dXa.FragmentManager.DuXjdv, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"coin"}, 1), -1, null);
        c19665gKu.gEmmrt().copydefault(14, C13754dXa.FragmentManager.DQzvGN, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"coin"}, 1), -1, null);
        c19665gKu.gEmmrt().copydefault(15, C13754dXa.FragmentManager.setOnCancelListener, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        c19665gKu.gEmmrt().copydefault(16, C13754dXa.FragmentManager.newView, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        int i5 = C13754dXa.FragmentManager.setNegativeButton;
        java.lang.String[] strArr = {OtcExtraKeys.AMOUNT, "currency"};
        java.util.HashMap map5 = new java.util.HashMap();
        map5.put(OtcExtraKeys.AMOUNT, new Function1() { // from class: o.gKC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.fetchVPNInfo((java.lang.String) obj);
            }
        });
        c19665gKu.gEmmrt().copydefault(17, i5, (java.lang.String[]) java.util.Arrays.copyOf(strArr, 2), -1, map5);
        c19665gKu.gEmmrt().copydefault(18, C13754dXa.FragmentManager.AlertControllerButtonHandler, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        int i6 = C13754dXa.FragmentManager.fromRating;
        java.util.HashMap map6 = new java.util.HashMap();
        map6.put("num", new Function1() { // from class: o.gKy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.isConnected((java.lang.String) obj);
            }
        });
        c19665gKu.gEmmrt().copydefault(19, i6, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"num", "unit"}, 2), -1, map6);
        int i7 = C13754dXa.FragmentManager.AppCompatDelegateImplActionBarMenuCallback;
        java.lang.String[] strArr2 = {OtcExtraKeys.AMOUNT, OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK};
        java.util.HashMap map7 = new java.util.HashMap();
        map7.put(OtcExtraKeys.AMOUNT, new Function1() { // from class: o.gKG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.fJNWhG((java.lang.String) obj);
            }
        });
        c19665gKu.gEmmrt().copydefault(20, i7, (java.lang.String[]) java.util.Arrays.copyOf(strArr2, 2), -1, map7);
        int i8 = C13754dXa.FragmentManager.AppCompatDelegateImpl6;
        java.lang.String[] strArr3 = {OtcExtraKeys.AMOUNT, OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK};
        java.util.HashMap map8 = new java.util.HashMap();
        map8.put(OtcExtraKeys.AMOUNT, new Function1() { // from class: o.gKD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.fARcdN((java.lang.String) obj);
            }
        });
        c19665gKu.gEmmrt().copydefault(21, i8, (java.lang.String[]) java.util.Arrays.copyOf(strArr3, 2), -1, map8);
        int i9 = C13754dXa.FragmentManager.fromRating;
        java.util.HashMap map9 = new java.util.HashMap();
        map9.put("num", new Function1() { // from class: o.gKE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.ejfBZ((java.lang.String) obj);
            }
        });
        c19665gKu.gEmmrt().copydefault(22, i9, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"num", "unit"}, 2), -1, map9);
        c19665gKu.gEmmrt().copydefault(24, C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplApi28, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        c19665gKu.gEmmrt().copydefault(25, C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplApi181, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        c19665gKu.gEmmrt().copydefault(26, C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplApi21ExtraSession, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        c19665gKu.gEmmrt().copydefault(27, C13754dXa.FragmentManager.onMetadataUpdate, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        c19665gKu.gEmmrt().copydefault(28, C13754dXa.FragmentManager.buildRccMetadata, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        c19665gKu.gEmmrt().copydefault(29, C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplApi191, (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[0], 0), -1, null);
        copydefault = 8;
    }

    public final gKJ<WalletTxStatusSubManager.SubResponse> copydefault() {
        return (gKJ) AEQbTJ.getValue();
    }

    public static final gKJ KWHzl() {
        return new gKJ();
    }

    /* JADX INFO: renamed from: o.gKu$TaskDescription */
    public static final class TaskDescription extends android.os.Handler {
        public TaskDescription(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            super.handleMessage(message);
            if (message.what == 2) {
                C19665gKu.OLrzqt.EZpvd((WalletTxStatusSubManager.SubResponse) null);
            }
        }
    }

    public final C19667gKw gEmmrt() {
        return (C19667gKw) EZpvd.getValue();
    }

    public static final C19667gKw EZpvd() {
        return new C19667gKw();
    }

    public static final java.lang.String AuCTel(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String fIwbmz(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String getNewProxyInstance(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String getFieldNames(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String DbNXlk(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String values(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String fetchVPNInfo(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String isConnected(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String fJNWhG(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String fARcdN(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static final java.lang.String ejfBZ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54870xYj.OLrzqt(str, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gKw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addType$default(C19665gKu c19665gKu, int i, int i2, java.lang.String[] strArr, int i3, java.util.Map map, int i4, java.lang.Object obj) {
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        int i5 = i3;
        if ((i4 & 16) != 0) {
            map = null;
        }
        c19665gKu.gEmmrt().copydefault(i, i2, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), i5, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(WalletTxStatusSubManager.SubResponse subResponse) {
        final java.lang.String str;
        if (C54819xWm.KWHzl().AEQbTJ() != null && !C54819xWm.KWHzl().AEQbTJ().isDestroyed()) {
            if (!copydefault().copydefault()) {
                if (subResponse != null) {
                    OLrzqt.copydefault().OLrzqt(subResponse);
                }
                while (!copydefault().copydefault()) {
                    WalletTxStatusSubManager.SubResponse subResponseAEQbTJ = copydefault().AEQbTJ();
                    if (subResponseAEQbTJ != null) {
                        C19665gKu c19665gKu = OLrzqt;
                        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
                        c19665gKu.AEQbTJ(activityAEQbTJ, subResponseAEQbTJ);
                    }
                }
            } else if (subResponse != null) {
                C19665gKu c19665gKu2 = OLrzqt;
                android.app.Activity activityAEQbTJ2 = C54819xWm.KWHzl().AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(activityAEQbTJ2, "");
                c19665gKu2.AEQbTJ(activityAEQbTJ2, subResponse);
            }
        } else {
            if (subResponse != null) {
                OLrzqt.copydefault().OLrzqt(subResponse);
            }
            KWHzl.sendEmptyMessage(2);
        }
        java.lang.Integer pushToastCode = subResponse != null ? subResponse.getPushToastCode() : null;
        if (pushToastCode == null || pushToastCode.intValue() != 1) {
            if (pushToastCode != null && pushToastCode.intValue() == 3) {
                str = "send_success";
            } else if (pushToastCode != null && pushToastCode.intValue() == 9) {
                str = "send_fail";
            } else if (pushToastCode != null && pushToastCode.intValue() == 17) {
                str = "withdraw_exchange_success";
            } else if (pushToastCode != null && pushToastCode.intValue() == 18) {
                str = "withdraw_exchange_fail";
            }
        } else {
            java.lang.Integer txType = subResponse.getTxType();
            str = (txType != null && txType.intValue() == 1) ? "other" : "send_submit";
        }
        C32866mlf.onEvent$default("WalletTransactionslFeedback_Top_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.gKH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19665gKu.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("feedback_prompt", str, true));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(final android.content.Context context, final WalletTxStatusSubManager.SubResponse subResponse) {
        int i;
        android.app.Activity activeActivity$default = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
        if (activeActivity$default == null) {
            return;
        }
        C55097xdX c55097xdX = new C55097xdX(activeActivity$default, null, 0, 4, null);
        C19667gKw c19667gKwGEmmrt = gEmmrt();
        java.lang.Integer pushToastCode = subResponse.getPushToastCode();
        int iIntValue = pushToastCode != null ? pushToastCode.intValue() : 1;
        java.util.List<java.lang.String> pushToastParams = subResponse.getPushToastParams();
        if (pushToastParams == null) {
            pushToastParams = yDY.AhwBna();
        }
        c55097xdX.setTitle(C19667gKw.getNotifyStr$default(c19667gKwGEmmrt, context, iIntValue, pushToastParams, 0, 8, null));
        java.lang.String url = subResponse.getUrl();
        if (url != null && C33129mqd.OLrzqt((java.lang.CharSequence) url)) {
            c55097xdX.OLrzqt(context.getString(C13754dXa.FragmentManager.ODCBUN), new Function0() { // from class: o.gKt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19665gKu.copydefault(context, subResponse);
                }
            });
            c55097xdX.copydefault((java.lang.String) null, (Function0<Unit>) null);
        }
        java.lang.Integer txStatus = subResponse.getTxStatus();
        if (txStatus != null && txStatus.intValue() == 1) {
            i = 1;
        } else {
            i = 2;
            if (txStatus == null || txStatus.intValue() != 2) {
                if (txStatus != null && txStatus.intValue() == 3) {
                    i = 3;
                } else if (txStatus == null || txStatus.intValue() != 4) {
                }
            }
        }
        c55097xdX.setState(i);
        c55097xdX.setType(1);
        c55097xdX.setCloseBtnShow(false);
        c55097xdX.setMessage(null);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public static final Unit copydefault(android.content.Context context, WalletTxStatusSubManager.SubResponse subResponse) {
        C19665gKu c19665gKu = OLrzqt;
        Intrinsics.copydefault(context, "");
        c19665gKu.EZpvd((android.app.Activity) context, java.lang.String.valueOf(subResponse.getUrl()));
        C57656ymY.OLrzqt.valueOf();
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.app.Activity activity, java.lang.String str) {
        if (activity != null) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        }
    }

    public final void OLrzqt(@NotNull java.util.List<WalletTxStatusSubManager.SubResponse> list, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            OLrzqt.EZpvd((WalletTxStatusSubManager.SubResponse) it.next());
        }
    }
}
