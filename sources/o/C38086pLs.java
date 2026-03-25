package o;

import com.okinc.components.track.bean.EventParamsList;
import com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.modular.deeplinkv2.LinkSource;
import dagger.Lazy;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38086pLs implements InterfaceC38081pLn {
    public final C38080pLm KWHzl;
    public final Lazy<C2660AUh> OLrzqt;

    /* JADX INFO: renamed from: o.pLs$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LinkSource.values().length];
            try {
                iArr[LinkSource.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LinkSource.IN_APP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkSource.EXTERNAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[LinkSource.WEB3_QR_SCAN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[LinkSource.NFC_TAG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[LinkSource.DOWNLOAD_HANDLER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[LinkSource.SHORTCODE_HANDLER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[LinkSource.CAMPAIGN_HANDLER.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[LinkSource.H5_INTERCEPTION.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[LinkSource.UNKNOWN_APP_LINK_HANDLER.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[AnalyticsLinkType.values().length];
            try {
                iArr2[AnalyticsLinkType.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[AnalyticsLinkType.DEEPLINK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[AnalyticsLinkType.DOWNLOAD_LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[AnalyticsLinkType.SHORTCODE_LINK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[AnalyticsLinkType.CAMPAIGN_LINK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[AnalyticsLinkType.OTHER_UNIVERSAL_LINK.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[AnalyticsLinkType.NON_OKX_UNIVERSAL_LINK.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[AnalyticsLinkType.CUSTOM_SCHEME.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[AnalyticsLinkType.PROCESS_EXTERNAL_LINK.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[LinkState.values().length];
            try {
                iArr3[LinkState.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr3[LinkState.EMPTY_LINK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr3[LinkState.SHORTCODE_API_FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr3[LinkState.NO_DEEPLINK_PRESENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr3[LinkState.AUTH_FAILED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr3[LinkState.UNLOCK_FAILED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr3[LinkState.MODE_NOT_SUPPORTED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr3[LinkState.NO_SUPPORTED_HANDLER.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr3[LinkState.LINK_OPENED_EXTERNALLY.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr3[LinkState.MODE_SWITCH_CANCELLED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr3[LinkState.NEW_LINK_TRIGGER_CANCELLED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr3[LinkState.DEEPLINK_NOT_SUPPORTED_IN_WALLET_APP.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr3[LinkState.DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr3[LinkState.DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            OLrzqt = iArr3;
        }
    }

    @yCM
    public C38086pLs(@NotNull C38080pLm c38080pLm, @NotNull Lazy<C2660AUh> lazy) {
        Intrinsics.checkNotNullParameter(c38080pLm, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        this.KWHzl = c38080pLm;
        this.OLrzqt = lazy;
    }

    public final boolean gEmmrt() {
        return C38174pOz.copydefault.EZpvd();
    }

    @Override // o.InterfaceC38081pLn
    public boolean OLrzqt(@NotNull LinkSource linkSource) {
        Intrinsics.checkNotNullParameter(linkSource, "");
        if (gEmmrt()) {
            return this.OLrzqt.get().AEQbTJ(EZpvd(linkSource));
        }
        return this.KWHzl.OLrzqt(linkSource);
    }

    @Override // o.InterfaceC38081pLn
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull LinkSource linkSource, @NotNull AnalyticsLinkType analyticsLinkType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(linkSource, "");
        Intrinsics.checkNotNullParameter(analyticsLinkType, "");
        if (gEmmrt()) {
            this.OLrzqt.get().copydefault(str, EZpvd(linkSource), copydefault(analyticsLinkType));
        } else {
            this.KWHzl.AEQbTJ(str, linkSource, analyticsLinkType);
        }
    }

    @Override // o.InterfaceC38081pLn
    public void OLrzqt() {
        if (gEmmrt()) {
            this.OLrzqt.get().EZpvd();
        } else {
            this.KWHzl.OLrzqt();
        }
    }

    @Override // o.InterfaceC38081pLn
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (gEmmrt()) {
            this.OLrzqt.get().EZpvd(str);
        } else {
            this.KWHzl.OLrzqt(str);
        }
    }

    @Override // o.InterfaceC38081pLn
    public void OLrzqt(@NotNull LinkState linkState) {
        Intrinsics.checkNotNullParameter(linkState, "");
        if (gEmmrt()) {
            this.OLrzqt.get().copydefault(copydefault(linkState));
        } else {
            this.KWHzl.OLrzqt(linkState);
        }
    }

    @Override // o.InterfaceC38081pLn
    public EventParamsList KWHzl() {
        if (gEmmrt()) {
            return OLrzqt(this.OLrzqt.get().OLrzqt());
        }
        return this.KWHzl.KWHzl();
    }

    @Override // o.InterfaceC38081pLn
    public boolean copydefault() {
        if (gEmmrt()) {
            return this.OLrzqt.get().AEQbTJ();
        }
        return this.KWHzl.copydefault();
    }

    @Override // o.InterfaceC38081pLn
    public boolean AEQbTJ() {
        if (gEmmrt()) {
            return this.OLrzqt.get().copydefault();
        }
        return this.KWHzl.AEQbTJ();
    }

    @Override // o.InterfaceC38081pLn
    public boolean EZpvd() {
        if (gEmmrt()) {
            return this.OLrzqt.get().KWHzl();
        }
        return this.KWHzl.EZpvd();
    }

    public final uniffi.lifecycle.LinkSource EZpvd(LinkSource linkSource) {
        switch (ActionBar.EZpvd[linkSource.ordinal()]) {
            case 1:
                return uniffi.lifecycle.LinkSource.UNKNOWN;
            case 2:
                return uniffi.lifecycle.LinkSource.IN_APP;
            case 3:
                return uniffi.lifecycle.LinkSource.EXTERNAL;
            case 4:
                return uniffi.lifecycle.LinkSource.WEB3_QR_SCAN;
            case 5:
                return uniffi.lifecycle.LinkSource.NFC_TAG;
            case 6:
                return uniffi.lifecycle.LinkSource.DOWNLOAD_HANDLER;
            case 7:
                return uniffi.lifecycle.LinkSource.SHORTCODE_HANDLER;
            case 8:
                return uniffi.lifecycle.LinkSource.CAMPAIGN_HANDLER;
            case 9:
                return uniffi.lifecycle.LinkSource.H5_INTERCEPTION;
            case 10:
                return uniffi.lifecycle.LinkSource.UNKNOWN_APP_LINK_HANDLER;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final uniffi.lifecycle.AnalyticsLinkType copydefault(AnalyticsLinkType analyticsLinkType) {
        switch (ActionBar.copydefault[analyticsLinkType.ordinal()]) {
            case 1:
                return uniffi.lifecycle.AnalyticsLinkType.UNKNOWN;
            case 2:
                return uniffi.lifecycle.AnalyticsLinkType.DEEPLINK;
            case 3:
                return uniffi.lifecycle.AnalyticsLinkType.DOWNLOAD_LINK;
            case 4:
                return uniffi.lifecycle.AnalyticsLinkType.SHORTCODE_LINK;
            case 5:
                return uniffi.lifecycle.AnalyticsLinkType.CAMPAIGN_LINK;
            case 6:
                return uniffi.lifecycle.AnalyticsLinkType.OTHER_UNIVERSAL_LINK;
            case 7:
                return uniffi.lifecycle.AnalyticsLinkType.NON_OKX_UNIVERSAL_LINK;
            case 8:
                return uniffi.lifecycle.AnalyticsLinkType.CUSTOM_SCHEME;
            case 9:
                return uniffi.lifecycle.AnalyticsLinkType.PROCESS_EXTERNAL_LINK;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final uniffi.lifecycle.LinkState copydefault(LinkState linkState) {
        switch (ActionBar.OLrzqt[linkState.ordinal()]) {
            case 1:
                return uniffi.lifecycle.LinkState.SUCCESS;
            case 2:
                return uniffi.lifecycle.LinkState.EMPTY_LINK;
            case 3:
                return uniffi.lifecycle.LinkState.SHORTCODE_API_FAILED;
            case 4:
                return uniffi.lifecycle.LinkState.NO_DEEPLINK_PRESENT;
            case 5:
                return uniffi.lifecycle.LinkState.AUTH_FAILED;
            case 6:
                return uniffi.lifecycle.LinkState.UNLOCK_FAILED;
            case 7:
                return uniffi.lifecycle.LinkState.MODE_NOT_SUPPORTED;
            case 8:
                return uniffi.lifecycle.LinkState.NO_SUPPORTED_HANDLER;
            case 9:
                return uniffi.lifecycle.LinkState.LINK_OPENED_EXTERNALLY;
            case 10:
                return uniffi.lifecycle.LinkState.MODE_SWITCH_CANCELLED;
            case 11:
                return uniffi.lifecycle.LinkState.NEW_LINK_TRIGGER_CANCELLED;
            case 12:
                return uniffi.lifecycle.LinkState.DEEPLINK_NOT_SUPPORTED_IN_WALLET_APP;
            case 13:
                return uniffi.lifecycle.LinkState.DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT;
            case 14:
                return uniffi.lifecycle.LinkState.DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final EventParamsList OLrzqt(java.util.Map<java.lang.String, java.lang.String> map) {
        EventParamsList eventParamsList = new EventParamsList();
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            EventParamsList.put$default(eventParamsList, entry.getKey(), entry.getValue(), false, 4, null);
        }
        return eventParamsList;
    }
}
