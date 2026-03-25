package com.okinc.okmarket.home.delegate;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import com.okinc.account.api.model.login.LoginRoute;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.market.discover.features.markets.sub.favorites.viewmodel.MarketsFavoritesOptViewModel;
import com.okinc.okmarket.home.delegate.DefaultCardFavoritesOptDelegate$showToolTipCoinQuote$1;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC26135jTf;
import o.C27858kFy;
import o.C38382pWs;
import o.C38383pWt;
import o.C43251rlk;
import o.C46600taI;
import o.C46688tbr;
import o.C55608xnE;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC8104awT;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultCardFavoritesOptDelegate$showToolTipCoinQuote$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MarketsFavoritesOptViewModel $favoritesViewModel;
    final /* synthetic */ String $groupName;
    final /* synthetic */ Fragment $host;
    final /* synthetic */ CoinQuote $item;
    final /* synthetic */ Fragment $lifecycleOwner;
    final /* synthetic */ FragmentManager $parentFragmentManager;
    final /* synthetic */ int $positionY;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46600taI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCardFavoritesOptDelegate$showToolTipCoinQuote$1(CoinQuote coinQuote, C46600taI c46600taI, FragmentManager fragmentManager, Fragment fragment, Fragment fragment2, int i, MarketsFavoritesOptViewModel marketsFavoritesOptViewModel, String str, Context context, Continuation<? super DefaultCardFavoritesOptDelegate$showToolTipCoinQuote$1> continuation) {
        super(2, continuation);
        this.$item = coinQuote;
        this.this$0 = c46600taI;
        this.$parentFragmentManager = fragmentManager;
        this.$lifecycleOwner = fragment;
        this.$host = fragment2;
        this.$positionY = i;
        this.$favoritesViewModel = marketsFavoritesOptViewModel;
        this.$groupName = str;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultCardFavoritesOptDelegate$showToolTipCoinQuote$1 defaultCardFavoritesOptDelegate$showToolTipCoinQuote$1 = new DefaultCardFavoritesOptDelegate$showToolTipCoinQuote$1(this.$item, this.this$0, this.$parentFragmentManager, this.$lifecycleOwner, this.$host, this.$positionY, this.$favoritesViewModel, this.$groupName, this.$context, continuation);
        defaultCardFavoritesOptDelegate$showToolTipCoinQuote$1.L$0 = obj;
        return defaultCardFavoritesOptDelegate$showToolTipCoinQuote$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultCardFavoritesOptDelegate$showToolTipCoinQuote$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        boolean zBooleanValue;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            if (Intrinsics.EZpvd((Object) this.$item.getInstType(), (Object) "COIN")) {
                C38383pWt c38383pWtEZpvd = this.this$0.EZpvd();
                String str = this.$item.getInstId() + "-USDT";
                String strOLrzqt = C38382pWs.copydefault.OLrzqt("SPOT");
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objCopydefault2 = c38383pWtEZpvd.copydefault(str, strOLrzqt, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope = coroutineScope2;
                obj = objCopydefault2;
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                C38383pWt c38383pWtEZpvd2 = this.this$0.EZpvd();
                String instId = this.$item.getInstId();
                String strOLrzqt2 = C38382pWs.copydefault.OLrzqt(this.$item.getInstType());
                this.L$0 = coroutineScope2;
                this.label = 2;
                Object objCopydefault3 = c38383pWtEZpvd2.copydefault(instId, strOLrzqt2, this);
                if (objCopydefault3 == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope = coroutineScope2;
                obj = objCopydefault3;
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        boolean z = zBooleanValue;
        this.$parentFragmentManager.clearFragmentResultListener(MarketToolDialog.class.getName());
        FragmentManager fragmentManager = this.$parentFragmentManager;
        String name = MarketToolDialog.class.getName();
        Fragment fragment = this.$lifecycleOwner;
        final FragmentManager fragmentManager2 = this.$parentFragmentManager;
        final CoinQuote coinQuote = this.$item;
        final MarketsFavoritesOptViewModel marketsFavoritesOptViewModel = this.$favoritesViewModel;
        final String str2 = this.$groupName;
        final Context context = this.$context;
        fragmentManager.setFragmentResultListener(name, fragment, new FragmentResultListener() { // from class: o.taM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str3, android.os.Bundle bundle) {
                DefaultCardFavoritesOptDelegate$showToolTipCoinQuote$1.invokeSuspend$lambda$0(fragmentManager2, coinQuote, marketsFavoritesOptViewModel, str2, context, str3, bundle);
            }
        });
        MarketToolDialog.Activity activity = MarketToolDialog.Companion;
        Fragment fragment2 = this.$host;
        String name2 = coroutineScope.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        activity.copydefault(fragment2, name2, this.$positionY, this.$item.isWatch(), this.this$0.KWHzl(this.$item) ? "inst_list" : "watch_list", (96 & 32) != 0 ? false : z, (96 & 64) != 0 ? false : false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(FragmentManager fragmentManager, CoinQuote coinQuote, MarketsFavoritesOptViewModel marketsFavoritesOptViewModel, String str, Context context, String str2, Bundle bundle) {
        if (Intrinsics.EZpvd((Object) str2, (Object) MarketToolDialog.class.getName())) {
            fragmentManager.clearFragmentResultListener(MarketToolDialog.class.getName());
            int i = bundle.getInt(BotWebHook.KEY_ACTION);
            if (i == MarketToolDialog.Action.STAR.ordinal()) {
                if (coinQuote.isWatch()) {
                    marketsFavoritesOptViewModel.OLrzqt(coinQuote, str);
                    C46688tbr.KWHzl.KWHzl("Discover_Fav", C56423yEv.EZpvd(C56390yDp.OLrzqt("remove fav", coinQuote.getInstId() + "-" + coinQuote.getInstType())));
                    return;
                }
                return;
            }
            if (i == MarketToolDialog.Action.ALERT.ordinal()) {
                C27858kFy.EZpvd.copydefault(context, coinQuote, "markets_discover");
                return;
            }
            if (i == MarketToolDialog.Action.EDIT.ordinal()) {
                if (C55608xnE.isLogin$default(null, 1, null)) {
                    ActivityC26135jTf.Companion.KWHzl(context);
                    C46688tbr.KWHzl.KWHzl("Discover_Fav", C56423yEv.EZpvd(C56390yDp.OLrzqt("edit fav", coinQuote.getInstId() + "-" + coinQuote.getInstType())));
                    return;
                }
                ((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class)).OLrzqt(context, new LoginRoute(null, null, null, null, null, null, null, null, null, false, false, 2047, null));
            }
        }
    }
}
