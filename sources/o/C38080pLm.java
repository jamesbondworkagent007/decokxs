package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.lifecycle.impl.deeplink.core.LinkStatus;
import com.okinc.modular.deeplinkv2.LinkSource;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38080pLm implements InterfaceC38081pLn {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public C38082pLo KWHzl;

    /* JADX INFO: renamed from: o.pLm$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AnalyticsLinkType.values().length];
            try {
                iArr[AnalyticsLinkType.SHORTCODE_LINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AnalyticsLinkType.DOWNLOAD_LINK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AnalyticsLinkType.CAMPAIGN_LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[LinkSource.values().length];
            try {
                iArr2[LinkSource.EXTERNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[LinkSource.NFC_TAG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[LinkSource.UNKNOWN_APP_LINK_HANDLER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[LinkSource.DOWNLOAD_HANDLER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[LinkSource.SHORTCODE_HANDLER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[LinkSource.CAMPAIGN_HANDLER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[LinkState.values().length];
            try {
                iArr3[LinkState.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[LinkState.NEW_LINK_TRIGGER_CANCELLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            EZpvd = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38081pLn
    public boolean AEQbTJ() {
        return this.KWHzl != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC38081pLn
    public void OLrzqt() {
        this.KWHzl = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public C38080pLm(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    @Override // o.InterfaceC38081pLn
    public boolean copydefault() {
        int i = StateListAnimator.OLrzqt[copydefault("isProcessingComplete").OLrzqt().ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    @Override // o.InterfaceC38081pLn
    public boolean OLrzqt(@NotNull LinkSource linkSource) {
        Intrinsics.checkNotNullParameter(linkSource, "");
        int i = StateListAnimator.copydefault[linkSource.ordinal()];
        return i == 1 || i == 2;
    }

    public final boolean copydefault(LinkSource linkSource) {
        int i = StateListAnimator.copydefault[linkSource.ordinal()];
        return (i == 3 || i == 4 || i == 5 || i == 6) ? false : true;
    }

    @Override // o.InterfaceC38081pLn
    public boolean EZpvd() {
        java.lang.String strAYXKKw = copydefault("isExternalLinkProcessing").AYXKKw();
        return Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) LinkSource.EXTERNAL.getSource()) || Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) LinkSource.NFC_TAG.getSource());
    }

    @Override // o.InterfaceC38081pLn
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull LinkSource linkSource, @NotNull AnalyticsLinkType analyticsLinkType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(linkSource, "");
        Intrinsics.checkNotNullParameter(analyticsLinkType, "");
        if (copydefault(linkSource)) {
            java.lang.String source = linkSource.getSource();
            java.lang.String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            this.KWHzl = new C38082pLo(source, string, str, analyticsLinkType, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            return;
        }
        copydefault("initialise").EZpvd(str);
    }

    @Override // o.InterfaceC38081pLn
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("setDeepLink-" + str).EZpvd(str);
    }

    @Override // o.InterfaceC38081pLn
    public void OLrzqt(@NotNull LinkState linkState) {
        LinkStatus linkStatus;
        Intrinsics.checkNotNullParameter(linkState, "");
        C38082pLo c38082pLoCopydefault = copydefault("setFailureReason-" + linkState);
        c38082pLoCopydefault.KWHzl(linkState);
        int i = StateListAnimator.EZpvd[linkState.ordinal()];
        if (i == 1) {
            linkStatus = LinkStatus.SUCCESS;
        } else if (i == 2) {
            linkStatus = LinkStatus.CANCEL;
        } else {
            linkStatus = LinkStatus.FAIL;
        }
        c38082pLoCopydefault.EZpvd(linkStatus);
    }

    @Override // o.InterfaceC38081pLn
    public EventParamsList KWHzl() {
        java.lang.String reason;
        C38082pLo c38082pLoCopydefault = copydefault("getAnalyticsParams");
        EventParamsList eventParamsList = new EventParamsList();
        EventParamsList.put$default(eventParamsList, "source", c38082pLoCopydefault.AYXKKw(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.PARAMS_SESSION_ID, c38082pLoCopydefault.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "lm_session_id", c38082pLoCopydefault.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "lm_source", c38082pLoCopydefault.AYXKKw(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "link", c38082pLoCopydefault.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "link_type", c38082pLoCopydefault.OLrzqt().getType(), false, 4, null);
        java.lang.String strCopydefault = c38082pLoCopydefault.copydefault();
        if (strCopydefault != null) {
            EventParamsList.put$default(eventParamsList, "deeplink", strCopydefault, false, 4, null);
        }
        LinkState linkStateAEQbTJ = c38082pLoCopydefault.AEQbTJ();
        if (linkStateAEQbTJ != null && (reason = linkStateAEQbTJ.getReason()) != null) {
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.REASON, reason, false, 4, null);
        }
        LinkStatus linkStatusDjBIcL = c38082pLoCopydefault.djBIcL();
        if (linkStatusDjBIcL != null) {
            EventParamsList.put$default(eventParamsList, "status", linkStatusDjBIcL.getStatus(), false, 4, null);
        }
        return eventParamsList;
    }

    public final C38082pLo copydefault(java.lang.String str) {
        C38082pLo c38082pLo = this.KWHzl;
        if (c38082pLo == null) {
            java.lang.String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return new C38082pLo(str, string, "", AnalyticsLinkType.UNKNOWN, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        }
        Intrinsics.copydefault(c38082pLo);
        return c38082pLo;
    }
}
