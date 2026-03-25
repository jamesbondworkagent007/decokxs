package o;

import com.okinc.buysell.analytics.PaymentsBannerTrackerAttrType;
import com.okinc.buysell.analytics.PaymentsTrackerAttrType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31354lsT {
    public static final C31354lsT KWHzl = new C31354lsT();

    /* JADX INFO: renamed from: o.lsT$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TargetTab.values().length];
            try {
                iArr[TargetTab.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TargetTab.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetTab.CONVERT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[TradeType.values().length];
            try {
                iArr2[TradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[TradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[PaymentsBannerTrackerAttrType.values().length];
            try {
                iArr3[PaymentsBannerTrackerAttrType.PILL_BUTTON_CLICK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[PaymentsBannerTrackerAttrType.BANNER_V2_OK_BUTTON_CLICK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[PaymentsBannerTrackerAttrType.BANNER_V2_AUTOMATIC_POPUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[PaymentsBannerTrackerAttrType.PILL_BUTTON_VIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[PaymentsBannerTrackerAttrType.CTA_BUTTON_BANNER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[PaymentsBannerTrackerAttrType.PILL_BUTTON_VIEW_HIDDEN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            EZpvd = iArr3;
        }
    }

    private C31354lsT() {
    }

    public final void copydefault(@NotNull TargetTab targetTab, @NotNull OKPaymentSource oKPaymentSource, @NotNull final BSCLevel bSCLevel, @NotNull final OrderType orderType, @NotNull final OrderFrequency orderFrequency, final java.lang.String str, final boolean z) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(targetTab, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        Intrinsics.checkNotNullParameter(bSCLevel, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        int i = TaskDescription.AEQbTJ[targetTab.ordinal()];
        if (i == 1) {
            str2 = "Simpletrade_Buy_FullPage_View";
        } else if (i == 2) {
            str2 = "Simpletrade_Sell_FullPage_View";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "Simpletrade_Convert_FullPage_View";
        }
        if (bSCLevel == BSCLevel.LEVEL1) {
            oKPaymentSource = OKPaymentSource.SIMPLE_TRADE_TAB;
        }
        final OKPaymentSource oKPaymentSource2 = oKPaymentSource;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str2, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lsW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.EZpvd(str, oKPaymentSource2, orderType, orderFrequency, z, bSCLevel, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, OKPaymentSource oKPaymentSource, OrderType orderType, OrderFrequency orderFrequency, boolean z, BSCLevel bSCLevel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.EXTRA_PAYMENT_METHOD, str, false, 4, null);
        }
        eventParamsList.put("source", oKPaymentSource.getTag(), true);
        if (orderType != OrderType.OTHERS && orderType != OrderType.NONE) {
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, orderType.getTxt(), false, 4, null);
        }
        if (orderFrequency != OrderFrequency.NO_FREQ) {
            EventParamsList.put$default(eventParamsList, "cadence", orderFrequency.getTxt(), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "token_type", z ? "dex" : "cex", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, bSCLevel == BSCLevel.LEVEL1 ? "l1" : "l2", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull TradeType tradeType, @NotNull java.lang.String str) {
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = TaskDescription.copydefault[tradeType.ordinal()];
        if (i == 1) {
            str2 = "Simpletrade_Buy_FullButton_Click";
        } else if (i == 2) {
            str2 = "Simpletrade_Sell_FullButton_Click";
        }
        if (str2.length() <= 0) {
            str2 = null;
        }
        if (str2 != null) {
            KWHzl.EZpvd(str2, str, true);
        }
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Simpletrade_Buy_Chip_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ltf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.KWHzl(str, str2, str3, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.EXTRA_PAYMENT_METHOD, str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackBuyFlowDepositBottomSheetViewOrButtonClick$default(C31354lsT c31354lsT, PaymentsTrackerAttrType paymentsTrackerAttrType, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            paymentsTrackerAttrType = PaymentsTrackerAttrType.STARTED_FULL_PAGE_VIEW;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c31354lsT.KWHzl(paymentsTrackerAttrType, str, str2, z);
    }

    public final void KWHzl(@NotNull PaymentsTrackerAttrType paymentsTrackerAttrType, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(paymentsTrackerAttrType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = paymentsTrackerAttrType == PaymentsTrackerAttrType.BUTTON_CLICK ? z ? "Simpletrade_Buy_TransferButton_click" : "Simpletrade_Buy_DepositButton_Click" : "Simpletrade_Buy_DepositButton_View";
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str3, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lta
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.AEQbTJ(str, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final TargetTab targetTab, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final OrderType orderType, @NotNull final OrderFrequency orderFrequency, @NotNull final BSCLevel bSCLevel) {
        java.lang.String str6;
        Intrinsics.checkNotNullParameter(targetTab, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        Intrinsics.checkNotNullParameter(bSCLevel, "");
        int i = TaskDescription.AEQbTJ[targetTab.ordinal()];
        if (i == 1) {
            str6 = "Simpletrade_Buy_PreviewOrder_Click";
        } else if (i == 2) {
            str6 = "Simpletrade_Sell_PreviewOrder_Click";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str6 = "Simpletrade_Convert_Preview_Click";
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str6, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lsX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.AEQbTJ(targetTab, str4, str5, str, str2, str3, orderType, orderFrequency, bSCLevel, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(TargetTab targetTab, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, OrderType orderType, OrderFrequency orderFrequency, BSCLevel bSCLevel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (targetTab == TargetTab.CONVERT) {
            EventParamsList.put$default(eventParamsList, "from_token", str, false, 4, null);
            EventParamsList.put$default(eventParamsList, "to_token", str2, false, 4, null);
        } else {
            EventParamsList.put$default(eventParamsList, "currency", str3, false, 4, null);
            EventParamsList.put$default(eventParamsList, "token", str4, false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.EXTRA_PAYMENT_METHOD, str5, false, 4, null);
            if (orderType != OrderType.OTHERS && orderType != OrderType.NONE) {
                EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, orderType.getTxt(), false, 4, null);
            }
            if (orderFrequency != OrderFrequency.NO_FREQ) {
                EventParamsList.put$default(eventParamsList, "cadence", orderFrequency.getTxt(), false, 4, null);
            }
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, bSCLevel == BSCLevel.LEVEL1 ? "l1" : "l2", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Simpletrade_Sell_Chip_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ltb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.gEmmrt(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit gEmmrt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final C30350lVc c30350lVc) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c30350lVc, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lsV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.EZpvd(str2, c30350lVc, str3, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, C30350lVc c30350lVc, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c30350lVc.copydefault())) {
            EventParamsList.put$default(eventParamsList, "fiat_currency", c30350lVc.copydefault(), false, 4, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c30350lVc.AhwBna())) {
            EventParamsList.put$default(eventParamsList, "token", c30350lVc.AhwBna(), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "token_type", c30350lVc.djBIcL() ? "dex" : "cex", false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_type", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, Web3SecurityTrackEvent.VALUE_INPUT, c30350lVc.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "primary_similarity", c30350lVc.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "secondary_similarity", c30350lVc.AYXKKw(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "results_clicked", c30350lVc.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "results_rec_viewed", c30350lVc.valueOf(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "results_clicked_order", c30350lVc.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "session_duration", c30350lVc.gEmmrt(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull TradeType tradeType, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6, @NotNull final java.lang.String str7, @NotNull final java.lang.String str8) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        if (tradeType == TradeType.SELL) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("SellError_Full_Api_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lsU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C31354lsT.AEQbTJ(str3, str, str2, str4, str5, str7, str6, str8, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            EventParamsList.put$default(eventParamsList, "payment_channel", str, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "token", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", str3, false, 4, null);
        eventParamsList.put(OtcExtraKeys.MODE, str4, true);
        eventParamsList.put("result", str5, true);
        EventParamsList.put$default(eventParamsList, "error_code", str6, false, 4, null);
        EventParamsList.put$default(eventParamsList, "endpoint", str7, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MESSAGE, str8, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Simpletrade_Buy_Notification_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.valueOf(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit valueOf(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "user_select_order_type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Simpletrade_Buy_Notification_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ltg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.djBIcL(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit djBIcL(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "user_select_order_type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Simpletrade_Currency_Toggle_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.AEQbTJ(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackButtonClick$default(C31354lsT c31354lsT, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c31354lsT.EZpvd(str, str2, z);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lsZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.EZpvd(str2, z, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, z);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull TradeType tradeType, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i = TaskDescription.copydefault[tradeType.ordinal()];
        if (i == 1) {
            str4 = "Simpletrade_Buy_PaymentMethod_Click";
        } else if (i == 2) {
            str4 = "Simpletrade_Sell_PaymentMethod_Click";
        }
        if (str4.length() <= 0) {
            str4 = null;
        }
        if (str4 != null) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(str4, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ltd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C31354lsT.AEQbTJ(str, str2, str3, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "currency", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.EXTRA_PAYMENT_METHOD, str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull PaymentsBannerTrackerAttrType paymentsBannerTrackerAttrType, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.Integer num) {
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(paymentsBannerTrackerAttrType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (TaskDescription.EZpvd[paymentsBannerTrackerAttrType.ordinal()]) {
            case 1:
                str3 = "BannerV2_Events_Pill_Click";
                break;
            case 2:
                str3 = "BannerV2_Events_Popup_Click";
                break;
            case 3:
                str3 = "BannerV2_Events_Popup_View";
                break;
            case 4:
                str3 = "BannerV2_Events_Pill_View";
                break;
            case 5:
                str3 = "BannerV2_Events_CTA_Click";
                break;
            case 6:
                str3 = "BannerV2_Events_PillEnd_View";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(str3, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ltc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C31354lsT.copydefault(num, str, str2, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit copydefault(java.lang.Integer num, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (num != null) {
            num.intValue();
            EventParamsList.put$default(eventParamsList, "banner_id", num.toString(), false, 4, null);
        }
        eventParamsList.put("flow", str, true);
        eventParamsList.put("page_name", str2, true);
        eventParamsList.put("terminal_type", "app", true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final TradeType tradeType, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Simpletrade_PaymentMethod_FullPage_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lsY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31354lsT.AEQbTJ(tradeType, str, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(TradeType tradeType, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("flow", tradeType == TradeType.BUY ? "buy" : "sell", true);
        EventParamsList.put$default(eventParamsList, "currency", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token", str2, false, 4, null);
        return Unit.INSTANCE;
    }
}
