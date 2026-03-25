package o;

import android.animation.Animator;
import android.content.DialogInterface;
import android.os.Build;
import android.os.VibratorManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.collection.ArrayMapKt;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.okinc.business.defi.api.bean.DexFeature;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.api.bean.BridgeRedeemStatus;
import com.okinc.business.dex.api.bean.CoinDetailRedirection;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.error.OrderParamJsonParsingError;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.trade.bean.BridgeClaimData;
import com.okinc.business.dexlogic.main.swap.trade.bean.LimitStateData;
import com.okinc.business.dexlogic.main.swap.trade.bean.StateData;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.DexDialogException;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsFullPageClick;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsPageView;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.dexui.utils.UiUtilsKt$showToastSafe$2;
import com.okinc.business.market.features.coindetail.ui.image_view.TokenImageParams;
import com.okinc.business.market.features.watch_list_groups.GroupEditParams;
import com.okinc.business.market.features.watch_list_groups.GroupType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import o.C6777aVl;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25352ivB {

    /* JADX INFO: renamed from: o.ivB$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BridgeClaimData.NotificationType.values().length];
            try {
                iArr[BridgeClaimData.NotificationType.BRIDGE_READY_TO_CLAIM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BridgeClaimData.NotificationType.BRIDGE_CLAIM_SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BridgeClaimData.NotificationType.BRIDGE_CLAIM_FAIL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AYXKKw() {
        return "-9223372036854775808";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String isConnected() {
        return "--";
    }

    public static /* synthetic */ void setCompoundDrawables$default(android.widget.TextView textView, int i, int i2, boolean z, java.lang.Integer num, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            num = null;
        }
        KWHzl(textView, i, i2, z, num);
    }

    public static final void KWHzl(@NotNull android.widget.TextView textView, int i, int i2, boolean z, java.lang.Integer num) {
        android.graphics.drawable.Drawable drawableKWHzl;
        Intrinsics.checkNotNullParameter(textView, "");
        if (z) {
            drawableKWHzl = C33070mpX.KWHzl(i);
            if (drawableKWHzl != null) {
                drawableKWHzl.setBounds(0, 0, i2, i2);
                if (num != null) {
                    C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(num.intValue()));
                }
            }
        } else {
            drawableKWHzl = null;
        }
        textView.setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
    }

    public static final void KWHzl(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, int i) {
        if (textView == null) {
            return;
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i);
        }
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public static final void KWHzl(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, int i) {
        if (textView == null) {
            return;
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i);
        }
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, i, i);
        }
        textView.setCompoundDrawablesRelative(drawable, null, drawable2, null);
    }

    public static final float OLrzqt(int i) {
        if (C23313hvq.valueOf(java.lang.Integer.valueOf(i), 10)) {
            return 24.0f;
        }
        if (C23313hvq.OLrzqt(java.lang.Integer.valueOf(i), 10) && C23313hvq.KWHzl(java.lang.Integer.valueOf(i), 14)) {
            return 20.0f;
        }
        if (C23313hvq.EZpvd(java.lang.Integer.valueOf(i), 14) && C23313hvq.KWHzl(java.lang.Integer.valueOf(i), 16)) {
            return 18.0f;
        }
        return C23313hvq.KWHzl(java.lang.Integer.valueOf(i), 18) & C23313hvq.EZpvd(java.lang.Integer.valueOf(i), 16) ? 16.0f : 14.0f;
    }

    public static final float KWHzl(int i) {
        if (C23313hvq.valueOf(java.lang.Integer.valueOf(i), 10)) {
            return 24.0f;
        }
        if (C23313hvq.OLrzqt(java.lang.Integer.valueOf(i), 10) && C23313hvq.KWHzl(java.lang.Integer.valueOf(i), 14)) {
            return 20.0f;
        }
        if (C23313hvq.EZpvd(java.lang.Integer.valueOf(i), 14) && C23313hvq.KWHzl(java.lang.Integer.valueOf(i), 16)) {
            return 18.0f;
        }
        return C23313hvq.KWHzl(java.lang.Integer.valueOf(i), 17) & C23313hvq.EZpvd(java.lang.Integer.valueOf(i), 16) ? 16.0f : 14.0f;
    }

    public static /* synthetic */ java.lang.String formatAddress$default(java.lang.String str, int i, int i2, java.lang.String str2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            str2 = "...";
        }
        return OLrzqt(str, i, i2, str2);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, int i2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() <= i + i2 + 1) {
            return str;
        }
        return C59454zhO.AkhnZx(str, i) + str2 + C59454zhO.isConnected(str, i2);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C23313hvq.EZpvd(java.lang.Integer.valueOf(str.length()), 11)) {
            return str;
        }
        return C59454zhO.AkhnZx(str, 6) + "..." + C59454zhO.isConnected(str, 4);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 2 || str.length() <= i) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, i - 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + "...";
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 8) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, 9);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + "...";
    }

    public static /* synthetic */ void setOnDoubleCheckClickListener$default(android.view.View view, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        OLrzqt(view, j, (Function1<? super android.view.View, Unit>) function1);
    }

    public static final void OLrzqt(android.view.View view, final long j, @NotNull final Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.ivT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C25352ivB.AEQbTJ(j, function1, view2);
                }
            });
        }
    }

    public static final void AEQbTJ(long j, Function1 function1, android.view.View view) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Object tag = view.getTag(C23274hvD.Application.DBAlnt);
        java.lang.Long l = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
        if (jElapsedRealtime - (l != null ? l.longValue() : 0L) > j) {
            view.setTag(C23274hvD.Application.DBAlnt, java.lang.Long.valueOf(jElapsedRealtime));
            Intrinsics.copydefault(view);
            function1.invoke(view);
        }
    }

    public static final void KWHzl(@NotNull StateData stateData) {
        Intrinsics.checkNotNullParameter(stateData, "");
        try {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null) {
                final java.lang.String userWalletAddress = stateData.getUserWalletAddress();
                copydefault(activityAEQbTJ, stateData);
                if (stateData.getSuccess()) {
                    C32866mlf.onEvent$default("app_swap_transaction_success_toast", (TrackChannel[]) null, new Function1() { // from class: o.ivI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C25352ivB.EZpvd(userWalletAddress, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                } else {
                    C32866mlf.onEvent$default("app_swap_transaction_failed_toast", (TrackChannel[]) null, new Function1() { // from class: o.ivJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C25352ivB.gEmmrt(userWalletAddress, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
            }
        } catch (java.lang.Exception e) {
            java.lang.String userWalletAddress2 = stateData.getUserWalletAddress();
            C6777aVl.Companion.EZpvd(new DexDialogException(userWalletAddress2 + e + C23307hvk.KWHzl()));
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", str, false);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", str, false);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull final BridgeClaimData bridgeClaimData) {
        Intrinsics.checkNotNullParameter(bridgeClaimData, "");
        try {
            final android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null) {
                C55097xdX c55097xdX = new C55097xdX(activityAEQbTJ, null, 0, 4, null);
                int i = ActionBar.AEQbTJ[bridgeClaimData.AEQbTJ().ordinal()];
                if (i == 1) {
                    c55097xdX.setState(2);
                    android.content.Context context = c55097xdX.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c55097xdX.setTitle(C33069mpW.KWHzl(context, C23274hvD.Fragment.UccSpe, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainName", bridgeClaimData.EZpvd()), C56390yDp.OLrzqt("token", bridgeClaimData.KWHzl()))));
                    c55097xdX.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.AuCTelauCTel), new Function0() { // from class: o.ivV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C25352ivB.KWHzl(activityAEQbTJ, bridgeClaimData);
                        }
                    });
                } else if (i == 2) {
                    c55097xdX.setState(2);
                    c55097xdX.setTitle(C33069mpW.copydefault(C23274hvD.Fragment.invokespecialDPHOMC, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt", bridgeClaimData.copydefault()), C56390yDp.OLrzqt("token", bridgeClaimData.KWHzl()))));
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c55097xdX.setState(3);
                    c55097xdX.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.invokespecialODCBUN));
                }
                C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
            }
        } catch (java.lang.Exception e) {
            C6777aVl.Companion.EZpvd(new DexDialogException(bridgeClaimData.valueOf() + e + C23307hvk.KWHzl()));
        }
    }

    public static final Unit KWHzl(android.app.Activity activity, BridgeClaimData bridgeClaimData) {
        C32866mlf.onEvent$default("DEXTrade_Full_Toast_Click", (TrackChannel[]) null, new Function1() { // from class: o.ivZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25352ivB.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC22009hUn.class);
        C31200lpY.EZpvd(intent, "default_trade");
        intent.putExtra(OtcExtraKeys.ORDER_ID, bridgeClaimData.OLrzqt());
        intent.putExtra("source", DexHistoryDetailsPageView.Source.DEX.getValue());
        activity.startActivity(intent);
        C57656ymY.OLrzqt.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "bridge_claim_reward_toast", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.BRIDGE_CLAIM_CLICK.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_direction", "na", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull LimitStateData limitStateData) {
        Intrinsics.checkNotNullParameter(limitStateData, "");
        try {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null) {
                OLrzqt(activityAEQbTJ, limitStateData);
            }
        } catch (java.lang.Exception e) {
            java.lang.String userWalletAddress = limitStateData.getUserWalletAddress();
            C6777aVl.Companion.EZpvd(new DexDialogException(userWalletAddress + e + C23307hvk.KWHzl()));
        }
    }

    public static final void EZpvd(@NotNull android.app.Activity activity, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
        c55097xdX.setState(3);
        c55097xdX.setTitle(str);
        c55097xdX.setCloseBtnShow(true);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public static final void OLrzqt(@NotNull android.app.Activity activity, @NotNull LimitStateData limitStateData) {
        int i;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(limitStateData, "");
        C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
        java.lang.String status = limitStateData.getStatus();
        int iHashCode = status.hashCode();
        if (iHashCode == 1567) {
            i = status.equals("10") ? 1 : 0;
        } else if (iHashCode != 1629) {
            if (iHashCode != 1660) {
                if (iHashCode != 1691) {
                    if (iHashCode == 1722 && status.equals("60")) {
                        i = 3;
                    }
                } else if (status.equals("50")) {
                    i = 2;
                }
            } else if (status.equals("40")) {
                c55097xdX.setLeadingIcon(C33070mpX.EZpvd(C52761wXj.TaskDescription.FSMca, activity));
                i = 4;
            }
        } else {
            if (status.equals("30")) {
                c55097xdX.setLeadingIcon(C33070mpX.EZpvd(C23274hvD.ActionBar.ejfBZ, activity));
                i = 4;
            }
        }
        c55097xdX.setState(i);
        c55097xdX.setTitle(limitStateData.getContent());
        c55097xdX.setCloseBtnShow(false);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public static final void copydefault(@NotNull android.app.Activity activity, @NotNull StateData stateData) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(stateData, "");
        C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
        int noticeState = 4;
        c55097xdX.setState(4);
        if (stateData.isOtherState()) {
            noticeState = stateData.getNoticeState();
        } else if (stateData.isSolanaPost()) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(activity, C52761wXj.TaskDescription.RXzakW);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(activity, C52761wXj.Activity.fdOvFl));
            } else {
                drawable = null;
            }
            c55097xdX.setLeadingIcon(drawable);
            noticeState = 1;
        } else if (stateData.getSuccess() || Intrinsics.EZpvd((java.lang.Object) stateData.getStatus(), (java.lang.Object) "5")) {
            noticeState = 2;
        } else if (Intrinsics.EZpvd((java.lang.Object) stateData.getStatus(), (java.lang.Object) "-2")) {
            c55097xdX.setLeadingIcon(c55097xdX.getContext().getDrawable(C52761wXj.TaskDescription.ORWKdN));
        } else {
            noticeState = (Intrinsics.EZpvd((java.lang.Object) stateData.getStatus(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) || Intrinsics.EZpvd((java.lang.Object) stateData.getStatus(), (java.lang.Object) "-5")) ? 3 : 0;
        }
        c55097xdX.setState(noticeState);
        if (stateData.getHasSurplus() && stateData.getSuccess() && C22416heu.zsXlph()) {
            C25353ivC.EZpvd(c55097xdX, stateData.getSurplusAmount(), stateData.getFromTokenSymbol(), stateData.getToTokenSymbol());
        } else {
            c55097xdX.setTitle(stateData.getContent());
            c55097xdX.setCloseBtnShow(false);
        }
        C43296rmc.KWHzl("LMH-Tag11", stateData.getContent() + activity.getClass().getSimpleName());
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public static /* synthetic */ java.lang.String findEclipsePlace$default(android.widget.TextView textView, java.lang.String str, int i, java.lang.String str2, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            str2 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = 3;
        }
        return AEQbTJ(textView, str, i, str2, i2);
    }

    public static final java.lang.String AEQbTJ(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, int i, @NotNull java.lang.String str2, int i2) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (textView.getPaint().measureText(str) < i) {
            return str;
        }
        int length = str.length();
        android.text.TextPaint paint = textView.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        java.lang.String strSubstring = str.substring(0, EZpvd(str, length - 1, i, paint, str2, i2) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + "..." + str2;
    }

    public static final int EZpvd(java.lang.String str, int i, int i2, android.graphics.Paint paint, java.lang.String str2, int i3) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = ((i4 + i) + 1) / 2;
            java.lang.String strSubstring = str.substring(0, i5 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            float fMeasureText = i2 - paint.measureText(strSubstring + "..." + str2);
            if (fMeasureText > i3) {
                i4 = i5;
            } else {
                if (fMeasureText >= 0.0f) {
                    return i5;
                }
                i = i5 - 1;
            }
        }
        return i4;
    }

    public static /* synthetic */ android.animation.AnimatorSet starScaleLessenAnim$default(android.view.View view, float f, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.95f;
        }
        return AEQbTJ(view, f, (Function0<Unit>) function0);
    }

    public static final android.animation.AnimatorSet AEQbTJ(@NotNull android.view.View view, float f, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.widget.LinearLayout.SCALE_X, 1.0f, f);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.widget.LinearLayout.SCALE_Y, 1.0f, f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new TaskDescription(function0));
        animatorSet.start();
        return animatorSet;
    }

    /* JADX INFO: renamed from: o.ivB$TaskDescription */
    public static final class TaskDescription implements Animator.AnimatorListener {
        public final /* synthetic */ Function0<Unit> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription(Function0<Unit> function0) {
            this.AEQbTJ = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.AEQbTJ.invoke();
        }
    }

    public static /* synthetic */ kotlin.Pair starScaleMagnifyAnim$default(android.view.View view, float f, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.95f;
        }
        return KWHzl(view, f, (Function0<Unit>) function0);
    }

    public static final kotlin.Pair<android.animation.AnimatorSet, kotlin.Pair<android.animation.ObjectAnimator, android.animation.ObjectAnimator>> KWHzl(@NotNull android.view.View view, float f, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.widget.LinearLayout.SCALE_X, f, 1.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.widget.LinearLayout.SCALE_Y, f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new StateListAnimator(function0));
        return C56390yDp.OLrzqt(animatorSet, C56390yDp.OLrzqt(objectAnimatorOfFloat, objectAnimatorOfFloat2));
    }

    /* JADX INFO: renamed from: o.ivB$StateListAnimator */
    public static final class StateListAnimator implements Animator.AnimatorListener {
        public final /* synthetic */ Function0<Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public StateListAnimator(Function0<Unit> function0) {
            this.OLrzqt = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.invoke();
        }
    }

    public static /* synthetic */ kotlin.Pair setOnAnimTouchListener$default(android.view.View view, boolean z, float f, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = 0.95f;
        }
        return KWHzl(view, z, f, (Function1<? super android.view.MotionEvent, Unit>) function1);
    }

    public static final kotlin.Pair<android.animation.AnimatorSet, android.animation.AnimatorSet> KWHzl(@NotNull final android.view.View view, final boolean z, final float f, @NotNull final Function1<? super android.view.MotionEvent, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: o.ivG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return C25352ivB.copydefault(view, booleanRef, z, objectRef, f, objectRef2, function1, view2, motionEvent);
            }
        });
        return C56390yDp.OLrzqt(objectRef.element, objectRef2.element);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Object] */
    public static final boolean copydefault(android.view.View view, Ref.BooleanRef booleanRef, boolean z, Ref.ObjectRef objectRef, float f, Ref.ObjectRef objectRef2, final Function1 function1, android.view.View view2, final android.view.MotionEvent motionEvent) {
        if (C23313hvq.copydefault(java.lang.Integer.valueOf(motionEvent.getAction()), 0)) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object tag = view.getTag(C23274hvD.Application.DBAlnt);
            java.lang.Long l = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
            if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) > 500) {
                booleanRef.element = true;
                view.setTag(C23274hvD.Application.DBAlnt, java.lang.Long.valueOf(jCurrentTimeMillis));
            } else {
                booleanRef.element = false;
            }
        }
        if (z && booleanRef.element) {
            view.setClickable(true);
            int action = motionEvent.getAction();
            if (action == 0) {
                objectRef.element = AEQbTJ(view, f, (Function0<Unit>) new Function0() { // from class: o.ivN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C25352ivB.DbNXlk();
                    }
                });
            } else if (action == 1) {
                ?? first = KWHzl(view, f, (Function0<Unit>) new Function0() { // from class: o.ivO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C25352ivB.EZpvd(function1, motionEvent);
                    }
                }).getFirst();
                objectRef2.element = first;
                android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) first;
                if (animatorSet != null) {
                    animatorSet.start();
                }
                view.performClick();
            } else if (action == 3) {
                ?? first2 = KWHzl(view, f, (Function0<Unit>) new Function0() { // from class: o.ivK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C25352ivB.values();
                    }
                }).getFirst();
                objectRef2.element = first2;
                android.animation.AnimatorSet animatorSet2 = (android.animation.AnimatorSet) first2;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                }
            }
        } else if (!z && booleanRef.element) {
            view.setClickable(true);
            if (motionEvent.getAction() == 1) {
                Intrinsics.copydefault(motionEvent);
                function1.invoke(motionEvent);
            }
        }
        return false;
    }

    public static final Unit DbNXlk() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, android.view.MotionEvent motionEvent) {
        Intrinsics.copydefault(motionEvent);
        function1.invoke(motionEvent);
        return Unit.INSTANCE;
    }

    public static final Unit values() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ android.animation.ObjectAnimator startAlphaAnim$default(android.view.View view, boolean z, long j, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 200;
        }
        return AEQbTJ(view, z, j, (Function0<Unit>) function0);
    }

    public static final android.animation.ObjectAnimator AEQbTJ(@NotNull android.view.View view, boolean z, long j, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.animation.ObjectAnimator objectAnimatorEZpvd = EZpvd(view, z);
        objectAnimatorEZpvd.setDuration(j);
        objectAnimatorEZpvd.setInterpolator(new android.view.animation.LinearInterpolator());
        objectAnimatorEZpvd.addListener(new FragmentManager(function0));
        return objectAnimatorEZpvd;
    }

    /* JADX INFO: renamed from: o.ivB$FragmentManager */
    public static final class FragmentManager extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ Function0<Unit> OLrzqt;

        public FragmentManager(Function0<Unit> function0) {
            this.OLrzqt = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator);
            this.OLrzqt.invoke();
        }
    }

    public static final android.animation.ObjectAnimator EZpvd(@NotNull android.view.View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        if (z) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
            Intrinsics.copydefault(objectAnimatorOfFloat);
            return objectAnimatorOfFloat;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
        Intrinsics.copydefault(objectAnimatorOfFloat2);
        return objectAnimatorOfFloat2;
    }

    public static /* synthetic */ android.view.animation.Animation expand$default(android.view.View view, long j, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 200;
        }
        return EZpvd(view, j, (Function0<Unit>) function0);
    }

    public static final android.view.animation.Animation EZpvd(@NotNull android.view.View view, long j, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = 0;
        Application application = new Application(view, measuredHeight);
        application.setDuration(j);
        application.setInterpolator(new android.view.animation.LinearInterpolator());
        AEQbTJ(view, true, j, (Function0<Unit>) new Function0() { // from class: o.ivW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25352ivB.valueOf();
            }
        }).start();
        view.startAnimation(application);
        return application;
    }

    /* JADX INFO: renamed from: o.ivB$Application */
    public static final class Application extends android.view.animation.Animation {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ int KWHzl;

        public Application(android.view.View view, int i) {
            this.AEQbTJ = view;
            this.KWHzl = i;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, android.view.animation.Transformation transformation) {
            Intrinsics.checkNotNullParameter(transformation, "");
            if (f == 1.0f) {
                this.AEQbTJ.getLayoutParams().height = -2;
            } else {
                this.AEQbTJ.getLayoutParams().height = (int) (this.KWHzl * f);
            }
            this.AEQbTJ.requestLayout();
        }
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ android.view.animation.Animation collapse$default(android.view.View view, long j, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 200;
        }
        return KWHzl(view, j, (Function0<Unit>) function0);
    }

    public static final android.view.animation.Animation KWHzl(@NotNull android.view.View view, long j, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        Activity activity = new Activity(function0, view, view.getMeasuredHeight());
        activity.setDuration(j);
        activity.setInterpolator(new android.view.animation.LinearInterpolator());
        AEQbTJ(view, false, j, (Function0<Unit>) new Function0() { // from class: o.ivH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25352ivB.AhwBna();
            }
        }).start();
        view.startAnimation(activity);
        return activity;
    }

    /* JADX INFO: renamed from: o.ivB$Activity */
    public static final class Activity extends android.view.animation.Animation {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Function0<Unit> copydefault;

        public Activity(Function0<Unit> function0, android.view.View view, int i) {
            this.copydefault = function0;
            this.OLrzqt = view;
            this.AEQbTJ = i;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, android.view.animation.Transformation transformation) {
            Intrinsics.checkNotNullParameter(transformation, "");
            if (f == 1.0f) {
                this.copydefault.invoke();
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.OLrzqt.getLayoutParams();
            int i = this.AEQbTJ;
            layoutParams.height = i - ((int) (i * f));
            this.OLrzqt.requestLayout();
        }
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void startVibrator$default(long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 10;
        }
        copydefault(j);
    }

    public static final void copydefault(long j) {
        if (((xWJ) C43251rlk.copydefault(xWJ.class)).AYXKKw()) {
            int i = Build.VERSION.SDK_INT;
            android.os.Vibrator defaultVibrator = null;
            if (i >= 31) {
                java.lang.Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("vibrator_manager");
                VibratorManager vibratorManagerCI_ = C25354ivD.OLrzqt(systemService) ? C7514alK.cI_(systemService) : null;
                if (vibratorManagerCI_ != null) {
                    defaultVibrator = vibratorManagerCI_.getDefaultVibrator();
                }
            } else {
                java.lang.Object systemService2 = C32979mnm.EZpvd.OLrzqt().getSystemService("vibrator");
                if (systemService2 instanceof android.os.Vibrator) {
                    defaultVibrator = (android.os.Vibrator) systemService2;
                }
            }
            if (i < 28 || defaultVibrator == null) {
                return;
            }
            defaultVibrator.vibrate(android.os.VibrationEffect.createOneShot(j, -1));
        }
    }

    public static final <T extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> void EZpvd(@NotNull android.content.Context context, @NotNull BarLineChartBase<T> barLineChartBase) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(barLineChartBase, "");
        barLineChartBase.setExtraOffsets(0.0f, 6.0f, 0.0f, 6.0f);
        barLineChartBase.setMinOffset(0.0f);
        barLineChartBase.setLogEnabled(false);
        XAxis xAxis = barLineChartBase.getXAxis();
        if (xAxis != null) {
            xAxis.setEnabled(false);
        }
        YAxis axisLeft = barLineChartBase.getAxisLeft();
        if (axisLeft != null) {
            axisLeft.setEnabled(false);
        }
        YAxis axisRight = barLineChartBase.getAxisRight();
        if (axisRight != null) {
            axisRight.setDrawGridLines(false);
        }
        YAxis axisRight2 = barLineChartBase.getAxisRight();
        if (axisRight2 != null) {
            axisRight2.setDrawAxisLine(false);
        }
        barLineChartBase.getAxisRight().setEnabled(true);
        barLineChartBase.getAxisRight().resetAxisMinimum();
        barLineChartBase.getAxisRight().setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        barLineChartBase.getAxisRight().setXOffset(8.0f);
        barLineChartBase.getAxisRight().setLabelCount(6, true);
        barLineChartBase.getAxisRight().setTextColor(C25382ivf.KWHzl(context, C32113mPz.ActionBar.iwGUEr));
        barLineChartBase.setNoDataText(C33070mpX.AYXKKw(C23274hvD.Fragment.akftKQ));
        barLineChartBase.setNoDataTextColor(C25382ivf.KWHzl(context, C32113mPz.ActionBar.iwGUEr));
        barLineChartBase.setTouchEnabled(true);
        barLineChartBase.setDrawGridBackground(false);
        barLineChartBase.setScaleEnabled(false);
        barLineChartBase.setPinchZoom(false);
        Legend legend = barLineChartBase.getLegend();
        if (legend != null) {
            legend.setEnabled(false);
        }
        Description description = barLineChartBase.getDescription();
        if (description != null) {
            description.setEnabled(false);
        }
        barLineChartBase.setDragEnabled(true);
        barLineChartBase.getLegend().setForm(Legend.LegendForm.NONE);
    }

    public static final float OLrzqt(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        return new android.text.TextPaint(textView.getPaint()).measureText(textView.getText().toString());
    }

    public static final void OLrzqt(@NotNull C52781wYc c52781wYc, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        Intrinsics.checkNotNullParameter(str, "");
        LinearLayoutCompat linearLayoutCompatEZpvd = c52781wYc.EZpvd();
        if (linearLayoutCompatEZpvd != null) {
            linearLayoutCompatEZpvd.setOrientation(0);
            linearLayoutCompatEZpvd.setGravity(16);
            linearLayoutCompatEZpvd.addView(new android.view.View(linearLayoutCompatEZpvd.getContext()), new LinearLayoutCompat.LayoutParams(C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
            AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayoutCompatEZpvd.getContext());
            appCompatTextView.setText(str);
            appCompatTextView.setMaxLines(1);
            appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
            appCompatTextView.setBackground(ContextCompat.getDrawable(appCompatTextView.getContext(), C52761wXj.TaskDescription.DrqXHJ));
            android.content.Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView.setTextColor(C25382ivf.KWHzl(context, C52761wXj.Activity.aappFQ));
            TextViewCompat.setTextAppearance(appCompatTextView, C23274hvD.Dialog.KWHzl);
            appCompatTextView.setPaddingRelative(C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            appCompatTextView.setIncludeFontPadding(false);
            linearLayoutCompatEZpvd.addView(appCompatTextView);
        }
    }

    public static final void OLrzqt(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        if (str == null || str.length() == 0) {
            return;
        }
        KWHzl(context, str);
    }

    public static /* synthetic */ void setRiseDownPercentColorAndValue$default(android.widget.TextView textView, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 2;
        }
        AEQbTJ(textView, str, z, i);
    }

    public static /* synthetic */ java.lang.String getSwapText$default(boolean z, boolean z2, DeFiPlatformForSwap deFiPlatformForSwap, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            deFiPlatformForSwap = null;
        }
        return OLrzqt(z, z2, deFiPlatformForSwap);
    }

    public static final java.lang.String OLrzqt(boolean z, boolean z2, DeFiPlatformForSwap deFiPlatformForSwap) {
        java.lang.String strAYXKKw;
        if (!z) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.onPrepareFromMediaId);
        }
        if (z2) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.OLrzqt);
        }
        if (deFiPlatformForSwap != null) {
            if (Intrinsics.EZpvd((java.lang.Object) deFiPlatformForSwap.getDefiPlatformId(), (java.lang.Object) "11")) {
                strAYXKKw = C33069mpW.copydefault(C23274hvD.Fragment.rewind, C56423yEv.EZpvd(C56390yDp.OLrzqt(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, C33070mpX.AYXKKw(C23274hvD.Fragment.Rid))));
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) deFiPlatformForSwap.getName())) {
                int i = C23274hvD.Fragment.rewind;
                java.lang.String name = deFiPlatformForSwap.getName();
                if (name == null) {
                    name = "";
                }
                strAYXKKw = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, name)));
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.RVsVBY);
            }
            if (strAYXKKw != null) {
                return strAYXKKw;
            }
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.RVsVBY);
    }

    public static final java.lang.String OLrzqt(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return C33070mpX.AYXKKw(C23274hvD.Fragment.DsfknC);
            }
            return C33070mpX.AYXKKw(C23274hvD.Fragment.setProfilesSinceInitCount);
        }
        if (z2) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatMediaControllerImplApi21);
    }

    public static final boolean AhwBna(java.lang.String str) {
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) && C23313hvq.OLrzqt(str, 0);
    }

    public static /* synthetic */ void showRouteTag$default(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        EZpvd(appCompatTextView, appCompatTextView2, appCompatTextView3, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1011=8] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void EZpvd(@NotNull AppCompatTextView appCompatTextView, @NotNull AppCompatTextView appCompatTextView2, @NotNull AppCompatTextView appCompatTextView3, @NotNull java.lang.String str, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        Intrinsics.checkNotNullParameter(appCompatTextView2, "");
        Intrinsics.checkNotNullParameter(appCompatTextView3, "");
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    appCompatTextView2.setVisibility(8);
                    appCompatTextView.setVisibility(8);
                    appCompatTextView3.setVisibility(8);
                    return;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    appCompatTextView.setVisibility(0);
                    appCompatTextView2.setVisibility(8);
                    appCompatTextView3.setVisibility(8);
                    return;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    appCompatTextView2.setVisibility(0);
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = appCompatTextView2.getLayoutParams();
                        marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMarginStart(0);
                            appCompatTextView2.setLayoutParams(marginLayoutParams);
                        }
                    }
                    appCompatTextView.setVisibility(8);
                    appCompatTextView3.setVisibility(8);
                    return;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    appCompatTextView2.setVisibility(8);
                    appCompatTextView.setVisibility(8);
                    appCompatTextView3.setVisibility(0);
                    if (z) {
                        ViewGroup.LayoutParams layoutParams2 = appCompatTextView3.getLayoutParams();
                        marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMarginStart(0);
                            appCompatTextView3.setLayoutParams(marginLayoutParams);
                            return;
                        }
                        return;
                    }
                    return;
                }
                break;
            case 48503:
                if (str.equals("1,2")) {
                    appCompatTextView.setVisibility(0);
                    appCompatTextView2.setVisibility(z ? 0 : 8);
                    appCompatTextView3.setVisibility(8);
                    return;
                }
                break;
            case 48504:
                if (str.equals("1,3")) {
                    appCompatTextView2.setVisibility(8);
                    appCompatTextView.setVisibility(0);
                    appCompatTextView3.setVisibility(z ? 0 : 8);
                    return;
                }
                break;
            case 49465:
                if (str.equals("2,3")) {
                    appCompatTextView2.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams3 = appCompatTextView2.getLayoutParams();
                    marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginStart(0);
                        appCompatTextView2.setLayoutParams(marginLayoutParams);
                    }
                    appCompatTextView.setVisibility(8);
                    appCompatTextView3.setVisibility(z ? 0 : 8);
                    return;
                }
                break;
            case 46612798:
                if (str.equals("1,2,3")) {
                    appCompatTextView2.setVisibility(z ? 0 : 8);
                    appCompatTextView.setVisibility(0);
                    appCompatTextView3.setVisibility(z ? 0 : 8);
                    return;
                }
                break;
        }
        appCompatTextView2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        appCompatTextView3.setVisibility(8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1091=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r1.equals("5") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r1.equals("4") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r1.equals("3") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r1.equals("2") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return o.C33070mpX.AYXKKw(o.C23274hvD.Fragment.QezThh);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return o.C33070mpX.AYXKKw(o.C23274hvD.Fragment.gvFztT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    return (i == TradeMode.SimpleBuyMode.getType() || i == TradeMode.SimpleSellMode.getType()) ? C33070mpX.AYXKKw(C23274hvD.Fragment.OeawrHRnVkix) : i == TradeMode.AdvancedMode.getType() ? C33070mpX.AYXKKw(C23274hvD.Fragment.QSusPL) : C33070mpX.AYXKKw(C23274hvD.Fragment.RidNCX);
                }
                return C33070mpX.AYXKKw(C23274hvD.Fragment.QYvkLl);
            case 50:
                break;
            case 51:
                break;
            case 52:
                break;
            case 53:
                break;
            case 54:
            default:
                return C33070mpX.AYXKKw(C23274hvD.Fragment.QYvkLl);
            case 55:
                if (str.equals("7")) {
                    return i == TradeMode.QuickMode.getType() ? C33070mpX.AYXKKw(C23274hvD.Fragment.unregisterCallback) : C33070mpX.AYXKKw(C23274hvD.Fragment.OmYuqg);
                }
                return C33070mpX.AYXKKw(C23274hvD.Fragment.QYvkLl);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1131=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r3.equals("5") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r3.equals("4") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r2 = r2.getString(o.C23274hvD.Fragment.QezThh);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r3.equals("3") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r3.equals("2") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        r2 = r2.getString(o.C23274hvD.Fragment.gvFztT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) java.lang.String.valueOf(OrderStrategyType.CopyTrade.getType()))) {
                        return C33070mpX.AYXKKw(C23274hvD.Fragment.GiPPlL);
                    }
                    java.lang.String string = context.getString(C23274hvD.Fragment.sendState);
                    Intrinsics.copydefault((java.lang.Object) string);
                    return string;
                }
                java.lang.String string2 = context.getString(C23274hvD.Fragment.QYvkLl);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return string2;
            case 50:
                break;
            case 51:
                break;
            case 52:
                break;
            case 53:
                break;
            case 54:
            default:
                java.lang.String string22 = context.getString(C23274hvD.Fragment.QYvkLl);
                Intrinsics.checkNotNullExpressionValue(string22, "");
                return string22;
            case 55:
                if (str.equals("7")) {
                    java.lang.String string3 = context.getString(C23274hvD.Fragment.sendState);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    return string3;
                }
                java.lang.String string222 = context.getString(C23274hvD.Fragment.QYvkLl);
                Intrinsics.checkNotNullExpressionValue(string222, "");
                return string222;
        }
    }

    public static final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.StringRes int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, i, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static /* synthetic */ void showOKDialogWithCallback$default(android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.Integer num, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        EZpvd(context, str, str2, i, str3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : function0);
    }

    public static final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.StringRes int i, @NotNull java.lang.String str3, @androidx.annotation.ColorRes java.lang.Integer num, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.EZpvd(i, new View.OnClickListener() { // from class: o.ivM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C25352ivB.AEQbTJ(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        if (num != null) {
            viewOnClickListenerC54939xaY.OLrzqt(num.intValue());
        }
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        if (str3.length() > 0) {
            ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, str3, (View.OnClickListener) null, 2, (java.lang.Object) null);
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ void showOKDialogCheckboxWithCallback$default(android.content.Context context, java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, int i, java.lang.String str3, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        java.lang.String str4 = str3;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        KWHzl(context, str, charSequence, str2, i, str4, function1);
    }

    public static final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str2, @androidx.annotation.StringRes int i, @NotNull java.lang.String str3, final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(charSequence);
        android.content.Context context2 = viewOnClickListenerC54939xaY.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        final wYK wyk = new wYK(context2, null, 0, 6, null);
        wyk.setText(str2);
        viewOnClickListenerC54939xaY.EZpvd(wyk);
        viewOnClickListenerC54939xaY.EZpvd(i, new View.OnClickListener() { // from class: o.ivF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C25352ivB.copydefault(function1, wyk, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        if (str3.length() > 0) {
            ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, str3, (View.OnClickListener) null, 2, (java.lang.Object) null);
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(Function1 function1, wYK wyk, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(wyk.isChecked()));
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C23313hvq.OLrzqt(java.lang.Integer.valueOf(str.length()), 6)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + "...";
    }

    public static /* synthetic */ boolean checkSaveOrderParam$default(DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, java.lang.String str, QuotePriceRes quotePriceRes, DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            defiMultiSwapOrderInfoReq2 = null;
        }
        return copydefault(defiMultiSwapOrderInfoReq, str, quotePriceRes, defiMultiSwapOrderInfoReq2);
    }

    public static final boolean copydefault(DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, @NotNull java.lang.String str, @NotNull QuotePriceRes quotePriceRes, DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq2) {
        java.lang.String str2;
        java.lang.String chainId;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        java.lang.String userWalletAddress = defiMultiSwapOrderInfoReq != null ? defiMultiSwapOrderInfoReq.getUserWalletAddress() : null;
        if (userWalletAddress == null || userWalletAddress.length() == 0) {
            if (defiMultiSwapOrderInfoReq2 == null) {
                InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(str).fARcdN();
                if (defiMultiSwapOrderInfoReq != null && (chainId = defiMultiSwapOrderInfoReq.getChainId()) != null) {
                    str3 = chainId;
                }
                str2 = "old error userWalletAddress is null: userWalletAddress = " + interfaceC23194htdFARcdN.KWHzl(str3) + " chainId = " + (defiMultiSwapOrderInfoReq != null ? defiMultiSwapOrderInfoReq.getChainId() : null) + " buildSwapOrderInfoReq.dexMultiMetaSaveOrderParam = " + (defiMultiSwapOrderInfoReq != null ? C23316hvt.OLrzqt(defiMultiSwapOrderInfoReq) : null);
            } else {
                java.lang.String strKWHzl = C22380heK.OLrzqt.copydefault(str).fARcdN().KWHzl(defiMultiSwapOrderInfoReq2.getChainId());
                str2 = "new error userWalletAddress is null: callData userWalletAddress = " + defiMultiSwapOrderInfoReq2.getUserWalletAddress() + " userWalletAddress = " + strKWHzl + " chainId = " + defiMultiSwapOrderInfoReq2.getChainId() + " buildSwapOrderInfoReq.dexMultiMetaSaveOrderParam = " + (defiMultiSwapOrderInfoReq != null ? C23316hvt.OLrzqt(defiMultiSwapOrderInfoReq) : null);
            }
            pUU.copydefault("buildSwapOrderInfoReq saveOrderBroadCast ", str2);
            C6777aVl.Companion.EZpvd(new OrderParamJsonParsingError(str2));
        } else {
            java.lang.String chainId2 = defiMultiSwapOrderInfoReq != null ? defiMultiSwapOrderInfoReq.getChainId() : null;
            DexMultiTokenInfoBean fromToken = quotePriceRes.getCommonDexInfo().getFromToken();
            if (!Intrinsics.EZpvd((java.lang.Object) chainId2, (java.lang.Object) (fromToken != null ? fromToken.getChainId() : null))) {
                C6777aVl.Companion.EZpvd(new java.lang.Exception("quote chainId is different from request chainId"));
            } else {
                java.lang.String fromTokenAddress = defiMultiSwapOrderInfoReq != null ? defiMultiSwapOrderInfoReq.getFromTokenAddress() : null;
                DexMultiTokenInfoBean fromToken2 = quotePriceRes.getCommonDexInfo().getFromToken();
                if (Intrinsics.EZpvd((java.lang.Object) fromTokenAddress, (java.lang.Object) (fromToken2 != null ? fromToken2.getTokenContractAddress() : null))) {
                    java.lang.String toTokenAddress = defiMultiSwapOrderInfoReq != null ? defiMultiSwapOrderInfoReq.getToTokenAddress() : null;
                    DexMultiTokenInfoBean toToken = quotePriceRes.getCommonDexInfo().getToToken();
                    if (Intrinsics.EZpvd((java.lang.Object) toTokenAddress, (java.lang.Object) (toToken != null ? toToken.getTokenContractAddress() : null))) {
                        return false;
                    }
                }
                C6777aVl.Companion.EZpvd(new java.lang.Exception("quote token address  is different from request token address"));
            }
        }
        return true;
    }

    public static final java.lang.String OLrzqt(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        androidx.collection.ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt(TabTitleInfo.KEY_BRIDGE, str), C56390yDp.OLrzqt("chain", str2));
        if (z) {
            return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.fdazkH, arrayMapArrayMapOf);
        }
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.QVMIlx, arrayMapArrayMapOf);
    }

    public static final java.lang.String copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        androidx.collection.ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("chain", str), C56390yDp.OLrzqt("tokenSymbol1", str2), C56390yDp.OLrzqt("tokenSymbol2", str3));
        if (z) {
            return EZpvd(z2, true);
        }
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ruDxL, arrayMapArrayMapOf);
    }

    public static final java.lang.String EZpvd(boolean z, boolean z2) {
        if (!z2) {
            return "";
        }
        if (z) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.RcLksq);
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.QVMIlxQVMIlx);
    }

    public static final java.lang.String AEQbTJ(boolean z) {
        if (z) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.RcLksq);
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.QVMIlxQVMIlx);
    }

    public static /* synthetic */ int getShowChainCount$default(int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return OLrzqt(i, i2);
    }

    public static final int OLrzqt(int i, int i2) {
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        java.lang.String strSubCheckS$default = C23313hvq.subCheckS$default(java.lang.Integer.valueOf(C55298xhM.EZpvd(MS.AEQbTJ(c32979mnm.OLrzqt()), (android.content.Context) c32979mnm.OLrzqt())), java.lang.Float.valueOf(32.0f), null, null, null, 14, null);
        java.lang.Float fValueOf = java.lang.Float.valueOf(46.0f);
        int iAhwBna = C33129mqd.AhwBna(C23313hvq.divCheckS$default(C23313hvq.subCheckS$default(C23313hvq.subCheckS$default(strSubCheckS$default, C23313hvq.mulCheckS$default(fValueOf, java.lang.Integer.valueOf(i2), null, null, null, 14, null), null, null, null, 14, null), java.lang.Float.valueOf(40.0f), null, null, null, 14, null), fValueOf, null, null, null, 14, null));
        return C23313hvq.OLrzqt(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iAhwBna)) ? iAhwBna : i;
    }

    public static final void KWHzl(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ibnZAm));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(z ? C23274hvD.Fragment.itxZVF : C23274hvD.Fragment.fromMediaItem));
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.setRccState, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C25382ivf.copydefault(context), BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        }
    }

    public static final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        java.lang.String message;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            context.startActivity(intent);
        } catch (java.lang.Exception e) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            java.lang.Throwable cause = e.getCause();
            if (cause != null && (message = cause.getMessage()) != null) {
                str2 = message;
            }
            taskDescription.EZpvd(new java.lang.Exception("openSystemWebView:" + str2 + ">>>>>>>>" + str));
        }
    }

    public static /* synthetic */ boolean setErrorCodeMsgView$default(C22073hWx c22073hWx, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, Function2 function2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return KWHzl(c22073hWx, dexMultiChildOrderInfoVo, (Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit>) function2, z);
    }

    public static final boolean KWHzl(@NotNull C22073hWx c22073hWx, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull final Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2, boolean z) {
        Intrinsics.checkNotNullParameter(c22073hWx, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C22034hVl errorCodeMsg = dexMultiChildOrderInfoVo.getErrorCodeMsg();
        if (!errorCodeMsg.djBIcL()) {
            errorCodeMsg.KWHzl(dexMultiChildOrderInfoVo.getToastGuideUrl());
        }
        c22073hWx.copydefault(errorCodeMsg, z, new Function0() { // from class: o.ivL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25352ivB.copydefault(function2, dexMultiChildOrderInfoVo);
            }
        });
        boolean zGEmmrt = errorCodeMsg.gEmmrt();
        c22073hWx.setVisibility(zGEmmrt ? 0 : 8);
        return zGEmmrt;
    }

    public static final Unit copydefault(Function2 function2, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        function2.invoke("2", dexMultiChildOrderInfoVo);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1412=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode == 1444) {
            return str.equals(MultiTransferSignData.DEFAULT_INTERVAL) ? DexHistoryDetailsFullPageClick.ButtonName.CUSTOMER_SUPPORT_SINGLE_CHAIN_SWAP.getValue() : "";
        }
        switch (iHashCode) {
            case 48:
                return !str.equals("0") ? "" : DexHistoryDetailsFullPageClick.ButtonName.CUSTOMER_SUPPORT_FROM_SWAP.getValue();
            case 49:
                return !str.equals("1") ? "" : DexHistoryDetailsFullPageClick.ButtonName.CUSTOMER_SUPPORT_BRIDGE.getValue();
            case 50:
                return !str.equals("2") ? "" : DexHistoryDetailsFullPageClick.ButtonName.CUSTOMER_SUPPORT_TO_SWAP.getValue();
            default:
                return "";
        }
    }

    public static /* synthetic */ void showSwapConfirmSlipPage$default(android.app.Activity activity, java.lang.String str, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            function02 = null;
        }
        EZpvd(activity, str, function0, function02);
    }

    public static final void EZpvd(android.app.Activity activity, @NotNull java.lang.String str, final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(str, "");
        if (activity != null) {
            C25335iul c25335iul = new C25335iul(activity);
            c25335iul.copydefault(str);
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            wYK wykAEQbTJ = c25335iul.AEQbTJ();
            if (wykAEQbTJ != null) {
                wykAEQbTJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.ivY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        C25352ivB.AEQbTJ(viewOnClickListenerC54939xaY, compoundButton, z);
                    }
                });
            }
            viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.QFTsTN);
            viewOnClickListenerC54939xaY.EZpvd(c25335iul);
            viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.glVQsU, new View.OnClickListener() { // from class: o.ivX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C25352ivB.EZpvd(function0, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.DwQSDd, new View.OnClickListener() { // from class: o.ivU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C25352ivB.EZpvd(viewOnClickListenerC54939xaY, function02, view);
                }
            });
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
            android.widget.TextView textViewEZpvd = viewOnClickListenerC54939xaY.EZpvd();
            if (textViewEZpvd != null) {
                textViewEZpvd.setEnabled(false);
            }
            android.widget.TextView textViewEZpvd2 = viewOnClickListenerC54939xaY.EZpvd();
            if (textViewEZpvd2 != null) {
                textViewEZpvd2.setTextColor(C25382ivf.KWHzl(C32113mPz.ActionBar.getFieldNames));
            }
        }
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.widget.CompoundButton compoundButton, boolean z) {
        android.widget.TextView textViewEZpvd = viewOnClickListenerC54939xaY.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setEnabled(z);
        }
        if (z) {
            android.widget.TextView textViewEZpvd2 = viewOnClickListenerC54939xaY.EZpvd();
            if (textViewEZpvd2 != null) {
                textViewEZpvd2.setTextColor(C25382ivf.KWHzl(C32113mPz.ActionBar.zLjUOn));
                return;
            }
            return;
        }
        android.widget.TextView textViewEZpvd3 = viewOnClickListenerC54939xaY.EZpvd();
        if (textViewEZpvd3 != null) {
            textViewEZpvd3.setTextColor(C25382ivf.KWHzl(C32113mPz.ActionBar.getFieldNames));
        }
    }

    public static final void EZpvd(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objEZpvd = C6832aWn.EZpvd("clipboard");
        android.content.ClipboardManager clipboardManager = objEZpvd instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) objEZpvd : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        }
    }

    public static final java.lang.CharSequence djBIcL() {
        java.lang.CharSequence text;
        android.content.ClipData primaryClip;
        java.lang.Object objEZpvd = C6832aWn.EZpvd("clipboard");
        android.content.ClipboardManager clipboardManager = objEZpvd instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) objEZpvd : null;
        if (clipboardManager != null && clipboardManager.hasPrimaryClip() && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0).getText() != null) {
            text = primaryClip.getItemAt(0).getText();
        } else {
            text = "";
        }
        return text;
    }

    public static /* synthetic */ void setNetworkError$default(C55173xeu c55173xeu, boolean z, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        AEQbTJ(c55173xeu, z, str, (Function0<Unit>) function0);
    }

    public static final void AEQbTJ(@NotNull C55173xeu c55173xeu, boolean z, java.lang.String str, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(c55173xeu, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            c55173xeu.setVisibility(0);
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            if (str == null) {
                str = C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu);
            }
            c55173xeu.setSubTitle((java.lang.CharSequence) str);
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.ivQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C25352ivB.OLrzqt(function0, view);
                }
            });
            return;
        }
        c55173xeu.setVisibility(8);
    }

    public static final void OLrzqt(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static final void OLrzqt(@NotNull DefiBridgeOrderInfo defiBridgeOrderInfo, @NotNull final java.lang.String str, @NotNull final C52794wYp c52794wYp, @NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner) {
        java.lang.String strEZpvd;
        java.lang.String strDbNXlk;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(defiBridgeOrderInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(str).fARcdN().AEQbTJ();
        if (yDY.gEmmrt("200", "202").contains(defiBridgeOrderInfo.getStatus())) {
            C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.ivP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25352ivB.copydefault(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            c52794wYp.OLrzqt(100L);
            c52794wYp.setText("");
            c52794wYp.setEnabled(false);
            ((gKO) C43248rlh.KWHzl.AEQbTJ(gKO.class)).copydefault(context, lifecycleOwner, defiBridgeOrderInfo.getOrderId(), defiBridgeOrderInfo.getToChainId(), true, new Function1() { // from class: o.ivS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25352ivB.KWHzl(c52794wYp, (BridgeRedeemStatus) obj);
                }
            });
            return;
        }
        java.lang.String orderId = defiBridgeOrderInfo.getOrderId();
        java.lang.String chainId = defiBridgeOrderInfo.getChainId();
        if (interfaceC9738bbJAEQbTJ == null || (strEZpvd = interfaceC9738bbJAEQbTJ.EZpvd(C33129mqd.valueOf(defiBridgeOrderInfo.getChainId()))) == null) {
            strEZpvd = "";
        }
        if (interfaceC9738bbJAEQbTJ != null && (strDbNXlk = interfaceC9738bbJAEQbTJ.DbNXlk()) != null) {
            str2 = strDbNXlk;
        }
        TransactionBean transactionBean = new TransactionBean((java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (QuotePriceRes) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, TransactionType.ORDER_TYPE, new OrderIdTypeData(orderId, chainId, strEZpvd, str2), C33070mpX.AYXKKw(C23274hvD.Fragment.dkJJWw), (java.lang.String) null, (java.lang.Integer) null, false, false, 0L, (java.lang.String) null, (TransactionBean.SwapType) null, (MergeCallData) null, (ServiceFeeInfo) null, (SlippageMode) null, (java.lang.String) null, (SlippageFeeType) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AccountInfo) null, (PresetRouteType) null, (TeeSaStatus) null, false, -3585, 0, (DefaultConstructorMarker) null);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC25050ipR.class);
        C31200lpY.EZpvd(intent, str);
        intent.putExtra("data", transactionBean);
        context.startActivity(intent);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "history_main", false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, DexTrackEventParameter.ButtonName.BRIDGE_CLAIM_CLICK.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_direction", "na", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52794wYp c52794wYp, BridgeRedeemStatus bridgeRedeemStatus) {
        Intrinsics.checkNotNullParameter(bridgeRedeemStatus, "");
        c52794wYp.fIwbmz();
        c52794wYp.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.AuCTelauCTel));
        c52794wYp.setEnabled(true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void openMarketDetailPage$default(android.content.Context context, java.lang.String str, TokenBase tokenBase, java.lang.String str2, CoinDetailRedirection coinDetailRedirection, int[] iArr, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            coinDetailRedirection = null;
        }
        copydefault(context, str, tokenBase, str2, coinDetailRedirection, iArr);
    }

    public static final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull TokenBase tokenBase, @NotNull java.lang.String str2, CoinDetailRedirection coinDetailRedirection, @NotNull int... iArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (C22416heu.EZpvd(context, DexFeature.MARKET)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC21875hPo.class);
        C31200lpY.EZpvd(intent, str);
        intent.putExtra("token_base", tokenBase);
        intent.putExtra("key.page_from", str2);
        intent.putExtra("coin_detail_redirection", coinDetailRedirection);
        for (int i : iArr) {
            intent.addFlags(i);
        }
        context.startActivity(intent);
    }

    public static /* synthetic */ void openWalletAssetsPage$default(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        EZpvd(abstractActivityC33041mov, str, str2);
    }

    public static final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        xWS xws;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (abstractActivityC33041mov == null || (xws = (xWS) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWS.class))) == null) {
            return;
        }
        xws.AEQbTJ(abstractActivityC33041mov, str, C33129mqd.valueOf(C31256lqb.KWHzl(str2, (Function0<java.lang.String>) new Function0() { // from class: o.ivR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25352ivB.AYXKKw();
            }
        })));
    }

    public static final void OLrzqt(@NotNull android.view.View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public static final int EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context contextCopydefault = C25382ivf.copydefault(context);
        return str.length() == 0 ? C25382ivf.copydefault(C52761wXj.ActionBar.getPostValueLengthLimit, contextCopydefault) : C23313hvq.KWHzl(str, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, contextCopydefault, 0.0f, 2, null) : C23313hvq.OLrzqt(str, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, contextCopydefault, 0.0f, 2, null) : C25382ivf.copydefault(C52761wXj.ActionBar.getPostValueLengthLimit, contextCopydefault);
    }

    public static final void AEQbTJ(@NotNull android.widget.TextView textView, @androidx.annotation.StyleRes int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        TextViewCompat.setTextAppearance(textView, i);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iaS.loadingAnim$default(android.view.ViewGroup, com.okinc.business.dex.utils.CDNSourceManager$LottieSource, boolean, boolean, boolean, int, java.lang.Object):void */
    public static final void AEQbTJ(@NotNull android.view.ViewGroup viewGroup, @NotNull CDNSourceManager.LottieSource lottieSource) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(lottieSource, "");
        C24257iaS.loadingAnim$default(viewGroup, lottieSource, false, false, false, 14, null);
    }

    public static /* synthetic */ void openWatchlistGroupPage$default(android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        AEQbTJ(context, z);
    }

    public static final void AEQbTJ(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) kBV.class);
        intent.putExtra("group_params", new GroupEditParams(GroupType.FAVOURITE, z));
        context.startActivity(intent);
    }

    public static final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC24696iih.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("chain_id", str2);
        bundle.putBoolean("extra_universal_1", z);
        C31200lpY.EZpvd(bundle, str);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    public static /* synthetic */ void toggleSelectionState$default(android.widget.ImageView imageView, boolean z, boolean z2, android.graphics.drawable.Drawable drawable, int i, android.graphics.drawable.Drawable drawable2, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i3 & 4) != 0) {
            drawable = C33070mpX.KWHzl(C52761wXj.TaskDescription.gqESXP);
        }
        android.graphics.drawable.Drawable drawable3 = drawable;
        if ((i3 & 8) != 0) {
            i = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            drawable2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.QqiRNA);
        }
        android.graphics.drawable.Drawable drawable4 = drawable2;
        if ((i3 & 32) != 0) {
            i2 = C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe);
        }
        OLrzqt(imageView, z, z3, drawable3, i4, drawable4, i2);
    }

    public static /* synthetic */ void openTokenLogoImageView$default(android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        copydefault(context, str, z);
    }

    public static final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC26025jPd.class);
        intent.putExtra("key.token_image_url", new TokenImageParams(str, z));
        context.startActivity(intent);
    }

    public static final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(context, C33070mpX.AYXKKw(C23274hvD.Fragment.cancelNotification) + str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iiQ.TaskDescription.newInstance$default(o.iiQ$TaskDescription, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, android.widget.CompoundButton$OnCheckedChangeListener, int, java.lang.Object):o.iiQ */
    public static final void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull final Function1<? super java.lang.Boolean, Unit> function1, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02, @NotNull final Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "11") && !C23317hvu.AEQbTJ(true)) {
            C24679iiQ c24679iiQKWHzl = C24679iiQ.Companion.KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.getQueue), C33070mpX.AYXKKw(C23274hvD.Fragment.fastForward), (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? java.lang.Boolean.FALSE : null, C33070mpX.AYXKKw(C23274hvD.Fragment.onPlayFromUri), C33070mpX.AYXKKw(C23274hvD.Fragment.onPlayFromSearch), (12 & 64) != 0 ? "" : C33070mpX.AYXKKw(C23274hvD.Fragment.sendRequest), new Function0() { // from class: o.iwa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25352ivB.copydefault(function0, function02);
                }
            }, function03, (12 & 512) != 0 ? null : new CompoundButton.OnCheckedChangeListener() { // from class: o.iwd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C25352ivB.copydefault(function1, compoundButton, z);
                }
            });
            c24679iiQKWHzl.setCancelable(true);
            c24679iiQKWHzl.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.iwc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(android.content.DialogInterface dialogInterface) {
                    C25352ivB.EZpvd(function03, dialogInterface);
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c24679iiQKWHzl.show(supportFragmentManager);
            return;
        }
        function02.invoke();
    }

    public static final Unit copydefault(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, android.widget.CompoundButton compoundButton, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
    }

    public static final void EZpvd(Function0 function0, android.content.DialogInterface dialogInterface) {
        function0.invoke();
    }

    public static /* synthetic */ java.lang.Object showToastSafe$default(java.lang.String str, android.graphics.drawable.Drawable drawable, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            drawable = null;
        }
        return AEQbTJ(str, drawable, (Continuation<? super Unit>) continuation);
    }

    public static final java.lang.Object AEQbTJ(@NotNull java.lang.String str, android.graphics.drawable.Drawable drawable, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new UiUtilsKt$showToastSafe$2(str, drawable, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static final java.lang.String OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return C22380heK.OLrzqt.copydefault("default_trade").fARcdN().KWHzl(str, str2);
    }

    public static final void AEQbTJ(@NotNull gLQ glq) {
        int i;
        Intrinsics.checkNotNullParameter(glq, "");
        if (glq instanceof gLQ.FragmentManager) {
            i = C23274hvD.Fragment.resume;
        } else if ((glq instanceof gLQ.AssistContent) || (glq instanceof gLQ.Activity)) {
            i = C23274hvD.Fragment.fhUrPt;
        } else if (glq instanceof gLQ.Dialog) {
            i = C23274hvD.Fragment.resume;
        } else {
            i = glq instanceof gLQ.LoaderManager ? C23274hvD.Fragment.QMuEJi : C23274hvD.Fragment.RihMUf;
        }
        C55326xho.toastWithFailedIcon$default(i, 0, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kLY.formatPercentage$default(java.lang.String, com.okinc.localization.util.format.DisplaySign, boolean, java.lang.Float, java.lang.Float, int, java.lang.Object):java.lang.String */
    public static final void AEQbTJ(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? kLY.formatPercentage$default(str, DisplaySign.EXCEPT_ZERO, z, null, null, 12, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.iwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25352ivB.isConnected();
            }
        });
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = EZpvd(context, str);
        textView.setText(strKWHzl);
        textView.setTextColor(iEZpvd);
    }

    public static final void OLrzqt(@NotNull android.widget.ImageView imageView, boolean z, boolean z2, android.graphics.drawable.Drawable drawable, int i, android.graphics.drawable.Drawable drawable2, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (z) {
            imageView.setVisibility(0);
            if (drawable != null) {
                drawable.setTint(i);
            } else {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        if (!z2) {
            imageView.setVisibility(8);
        }
        if (drawable2 != null) {
            drawable2.setTint(i2);
        } else {
            drawable2 = null;
        }
        imageView.setImageDrawable(drawable2);
    }
}
