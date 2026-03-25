package o;

import com.okinc.business.dex.trade.order.domain.model.OrderFilterStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsPageView;
import com.okinc.business.dexui.main.limitorder.orderdetail.LimitOrderDetailActivity;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.ChainInfoResult;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C31176lpA;
import o.hTL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.haw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22206haw {
    public static final C22206haw copydefault = new C22206haw();

    /* JADX INFO: renamed from: o.haw$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderStrategyType.values().length];
            try {
                iArr[OrderStrategyType.Market.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderStrategyType.Limit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderStrategyType.Tp.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderStrategyType.Sl.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderStrategyType.CopyTrade.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    private C22206haw() {
    }

    public final void EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        C25352ivB.KWHzl(context, str + AEQbTJ(context, str2));
    }

    public final java.lang.String AEQbTJ(android.content.Context context, java.lang.String str) {
        return EZpvd(context).OLrzqt(C33129mqd.valueOf(str));
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, @NotNull java.lang.String str, @NotNull Function1<? super ChainInfoResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        NetworkSource networkSource = z ? NetworkSource.Bridge : NetworkSource.Swap;
        hTL.ActionBar actionBar = hTL.Companion;
        if (str.length() == 0) {
            str = "chain_id_all_network";
        }
        actionBar.OLrzqt(fragmentManager, new C21997hUb(networkSource, str, true, null, true, null, false, false, 224, null), function1);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull C20066gZq c20066gZq, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c20066gZq, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i = Application.OLrzqt[c20066gZq.EZpvd().ordinal()];
        if (i == 1) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC22009hUn.class);
            kotlin.Pair<java.lang.String, java.lang.Object> pairEZpvd = C31200lpY.EZpvd("default_trade");
            java.lang.String first = pairEZpvd.getFirst();
            java.lang.Object second = pairEZpvd.getSecond();
            intent.putExtra(first, second instanceof java.lang.String ? (java.lang.String) second : null);
            intent.putExtra(OtcExtraKeys.ORDER_ID, c20066gZq.OLrzqt());
            intent.putExtra("extra_universal_1", false);
            intent.putExtra("source", DexHistoryDetailsPageView.Source.TRANSACTION_HISTORY.getValue());
            context.startActivity(intent);
            C32866mlf.onEvent$default("DEXSwapHistory_Full_List_Click", (TrackChannel[]) null, new Function1() { // from class: o.haC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22206haw.AEQbTJ(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            return;
        }
        if (i != 2 && i != 3 && i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) LimitOrderDetailActivity.class);
        C31200lpY.EZpvd(intent2, "default_trade");
        intent2.putExtra(OtcExtraKeys.ORDER_ID, c20066gZq.OLrzqt());
        intent2.putExtra(OtcExtraKeys.CRYPTO_ORDER_TYPE, c20066gZq.EZpvd().getType());
        intent2.putExtra("limit_strategy_type", c20066gZq.copydefault());
        context.startActivity(intent2);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", C22877hne.getBusinessType$default(C22877hne.OLrzqt, "default_trade", false, 2, null), false, 4, null);
        eventParamsList.put("wallet_address", str, false);
        return Unit.INSTANCE;
    }

    public final kYC EZpvd(android.content.Context context) {
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        return ((InterfaceC28125kPv) C58114yvF.OLrzqt(context, InterfaceC28125kPv.class)).dNCPSb();
    }

    public static /* synthetic */ void showOrderTypeSelectionDialog$default(C22206haw c22206haw, androidx.fragment.app.FragmentManager fragmentManager, OrderFilterStrategyType orderFilterStrategyType, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 2;
        }
        c22206haw.KWHzl(fragmentManager, orderFilterStrategyType, i, function1);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, OrderFilterStrategyType orderFilterStrategyType, int i, @NotNull Function1<? super C31176lpA.ActionBar<java.lang.Object>, Unit> function1) {
        java.lang.Iterable<OrderFilterStrategyType> entries;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.Object obj = new java.lang.Object();
        if (C22416heu.zLjUOn()) {
            entries = OrderFilterStrategyType.getEntries();
        } else {
            InterfaceC56445yFq<OrderFilterStrategyType> entries2 = OrderFilterStrategyType.getEntries();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (OrderFilterStrategyType orderFilterStrategyType2 : entries2) {
                if (!orderFilterStrategyType2.getOnlySupportTee()) {
                    arrayList.add(orderFilterStrategyType2);
                }
            }
            entries = arrayList;
        }
        C31176lpA.StateListAnimator stateListAnimator = C31176lpA.Companion;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatQueueItem1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        for (OrderFilterStrategyType orderFilterStrategyType3 : entries) {
            arrayList2.add(new C31176lpA.ActionBar(C33070mpX.AYXKKw(orderFilterStrategyType3.getTextRes()), orderFilterStrategyType3, "web3_dex_transactions_filterBar_types_" + orderFilterStrategyType3.getTrackValue()));
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
        listFJNWhG.add(0, new C31176lpA.ActionBar(C33070mpX.AYXKKw(C23274hvD.Fragment.AEQbTJ), obj, "web3_dex_transactions_filterBar_types_all"));
        Unit unit = Unit.INSTANCE;
        stateListAnimator.AEQbTJ(fragmentManager, new C31176lpA.Activity(listFJNWhG, orderFilterStrategyType == null ? obj : orderFilterStrategyType, strAYXKKw, null, null, i, 24, null), function1);
    }
}
