package com.okinc.okmarket.home.delegate;

import android.content.Context;
import android.os.Bundle;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.market.discover.features.markets.sub.favorites.viewmodel.MarketsFavoritesOptViewModel;
import com.okinc.okmarket.home.delegate.DefaultCardFavoritesOptDelegate$showToolTipByInstrument$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C27619jyc;
import o.C27858kFy;
import o.C38382pWs;
import o.C38383pWt;
import o.C46600taI;
import o.C46688tbr;
import o.C55608xnE;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultCardFavoritesOptDelegate$showToolTipByInstrument$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MarketsFavoritesOptViewModel $favoritesViewModel;
    final /* synthetic */ boolean $forceFragmentResult;
    final /* synthetic */ Fragment $host;
    final /* synthetic */ String $instId;
    final /* synthetic */ String $instType;
    final /* synthetic */ BizInstrument $instrument;
    final /* synthetic */ Fragment $lifecycleOwner;
    final /* synthetic */ FragmentManager $parentFragmentManager;
    final /* synthetic */ int $positionY;
    boolean Z$0;
    int label;
    final /* synthetic */ C46600taI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCardFavoritesOptDelegate$showToolTipByInstrument$1(C46600taI c46600taI, String str, String str2, MarketsFavoritesOptViewModel marketsFavoritesOptViewModel, BizInstrument bizInstrument, FragmentManager fragmentManager, Fragment fragment, Fragment fragment2, int i, boolean z, Context context, Continuation<? super DefaultCardFavoritesOptDelegate$showToolTipByInstrument$1> continuation) {
        super(2, continuation);
        this.this$0 = c46600taI;
        this.$instId = str;
        this.$instType = str2;
        this.$favoritesViewModel = marketsFavoritesOptViewModel;
        this.$instrument = bizInstrument;
        this.$parentFragmentManager = fragmentManager;
        this.$lifecycleOwner = fragment;
        this.$host = fragment2;
        this.$positionY = i;
        this.$forceFragmentResult = z;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultCardFavoritesOptDelegate$showToolTipByInstrument$1(this.this$0, this.$instId, this.$instType, this.$favoritesViewModel, this.$instrument, this.$parentFragmentManager, this.$lifecycleOwner, this.$host, this.$positionY, this.$forceFragmentResult, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultCardFavoritesOptDelegate$showToolTipByInstrument$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2;
        boolean z;
        String str;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C38383pWt c38383pWtEZpvd = this.this$0.EZpvd();
            String str2 = this.$instId;
            String strOLrzqt = C38382pWs.copydefault.OLrzqt(this.$instType);
            this.label = 1;
            objCopydefault = c38383pWtEZpvd.copydefault(str2, strOLrzqt, this);
            if (objCopydefault == objCopydefault3) {
                return objCopydefault3;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z2 = this.Z$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault2 = obj;
                z = z2;
                final boolean zBooleanValue = ((Boolean) objCopydefault2).booleanValue();
                this.$parentFragmentManager.clearFragmentResultListener(MarketToolDialog.class.getName());
                FragmentManager fragmentManager = this.$parentFragmentManager;
                String name = MarketToolDialog.class.getName();
                Fragment fragment = this.$lifecycleOwner;
                final FragmentManager fragmentManager2 = this.$parentFragmentManager;
                final MarketsFavoritesOptViewModel marketsFavoritesOptViewModel = this.$favoritesViewModel;
                final BizInstrument bizInstrument = this.$instrument;
                final String str3 = this.$instId;
                final String str4 = this.$instType;
                final Context context = this.$context;
                fragmentManager.setFragmentResultListener(name, fragment, new FragmentResultListener() { // from class: o.taL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(java.lang.String str5, android.os.Bundle bundle) {
                        DefaultCardFavoritesOptDelegate$showToolTipByInstrument$1.invokeSuspend$lambda$0(fragmentManager2, zBooleanValue, marketsFavoritesOptViewModel, bizInstrument, str3, str4, context, str5, bundle);
                    }
                });
                if (!(this.$instrument instanceof OptionInstrument) || C55608xnE.OLrzqt()) {
                    str = "option_list";
                } else {
                    BizInstrument bizInstrument2 = this.$instrument;
                    if (!(bizInstrument2 instanceof SpotInstrument) || ((SpotInstrument) bizInstrument2).getCountDownInfo() == null) {
                        str = "market_list";
                    }
                }
                MarketToolDialog.Activity activity = MarketToolDialog.Companion;
                String name2 = MarketToolDialog.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "");
                activity.copydefault(this.$host, name2, this.$positionY, zBooleanValue, str, z, this.$forceFragmentResult);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        boolean zBooleanValue2 = ((Boolean) objCopydefault).booleanValue();
        MarketsFavoritesOptViewModel marketsFavoritesOptViewModel2 = this.$favoritesViewModel;
        BizInstrument bizInstrument3 = this.$instrument;
        this.Z$0 = zBooleanValue2;
        this.label = 2;
        objCopydefault2 = marketsFavoritesOptViewModel2.copydefault(bizInstrument3, this);
        if (objCopydefault2 == objCopydefault3) {
            return objCopydefault3;
        }
        z = zBooleanValue2;
        final boolean zBooleanValue3 = ((Boolean) objCopydefault2).booleanValue();
        this.$parentFragmentManager.clearFragmentResultListener(MarketToolDialog.class.getName());
        FragmentManager fragmentManager3 = this.$parentFragmentManager;
        String name3 = MarketToolDialog.class.getName();
        Fragment fragment2 = this.$lifecycleOwner;
        final FragmentManager fragmentManager22 = this.$parentFragmentManager;
        final MarketsFavoritesOptViewModel marketsFavoritesOptViewModel3 = this.$favoritesViewModel;
        final BizInstrument bizInstrument4 = this.$instrument;
        final String str32 = this.$instId;
        final String str42 = this.$instType;
        final Context context2 = this.$context;
        fragmentManager3.setFragmentResultListener(name3, fragment2, new FragmentResultListener() { // from class: o.taL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str5, android.os.Bundle bundle) {
                DefaultCardFavoritesOptDelegate$showToolTipByInstrument$1.invokeSuspend$lambda$0(fragmentManager22, zBooleanValue3, marketsFavoritesOptViewModel3, bizInstrument4, str32, str42, context2, str5, bundle);
            }
        });
        if (this.$instrument instanceof OptionInstrument) {
            str = "option_list";
        }
        MarketToolDialog.Activity activity2 = MarketToolDialog.Companion;
        String name22 = MarketToolDialog.class.getName();
        Intrinsics.checkNotNullExpressionValue(name22, "");
        activity2.copydefault(this.$host, name22, this.$positionY, zBooleanValue3, str, z, this.$forceFragmentResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(FragmentManager fragmentManager, boolean z, MarketsFavoritesOptViewModel marketsFavoritesOptViewModel, BizInstrument bizInstrument, String str, String str2, Context context, String str3, Bundle bundle) {
        if (Intrinsics.EZpvd((Object) str3, (Object) MarketToolDialog.class.getName())) {
            fragmentManager.clearFragmentResultListener(MarketToolDialog.class.getName());
            int i = bundle.getInt(BotWebHook.KEY_ACTION);
            if (i != MarketToolDialog.Action.STAR.ordinal()) {
                if (i == MarketToolDialog.Action.ALERT.ordinal()) {
                    C27858kFy c27858kFy = C27858kFy.EZpvd;
                    CoinQuote coinQuoteOLrzqt = C27619jyc.OLrzqt();
                    c27858kFy.copydefault(context, coinQuoteOLrzqt.copy((67102719 & 1) != 0 ? coinQuoteOLrzqt.quoteCurrency : null, (67102719 & 2) != 0 ? coinQuoteOLrzqt.baseCurrency : null, (67102719 & 4) != 0 ? coinQuoteOLrzqt.price : null, (67102719 & 8) != 0 ? coinQuoteOLrzqt.changePercent : AudioStats.AUDIO_AMPLITUDE_NONE, (67102719 & 16) != 0 ? coinQuoteOLrzqt.changePercentDisplay : null, (67102719 & 32) != 0 ? coinQuoteOLrzqt.subPrice : null, (67102719 & 64) != 0 ? coinQuoteOLrzqt.showSubPrice : false, (67102719 & 128) != 0 ? coinQuoteOLrzqt.leverageRatio : null, (67102719 & 256) != 0 ? coinQuoteOLrzqt.turnover : null, (67102719 & 512) != 0 ? coinQuoteOLrzqt.voulum : null, (67102719 & 1024) != 0 ? coinQuoteOLrzqt.isWatch : false, (67102719 & 2048) != 0 ? coinQuoteOLrzqt.instType : str2, (67102719 & 4096) != 0 ? coinQuoteOLrzqt.instId : str, (67102719 & 8192) != 0 ? coinQuoteOLrzqt.icon : null, (67102719 & 16384) != 0 ? coinQuoteOLrzqt.quoteCcyUSDPrice : null, (67102719 & 32768) != 0 ? coinQuoteOLrzqt.turnoverNumber : AudioStats.AUDIO_AMPLITUDE_NONE, (67102719 & 65536) != 0 ? coinQuoteOLrzqt.volumeNumber : AudioStats.AUDIO_AMPLITUDE_NONE, (67102719 & 131072) != 0 ? coinQuoteOLrzqt.priceNumber : AudioStats.AUDIO_AMPLITUDE_NONE, (67102719 & 262144) != 0 ? coinQuoteOLrzqt.alias : null, (524288 & 67102719) != 0 ? coinQuoteOLrzqt.countDownInfo : null, (67102719 & 1048576) != 0 ? coinQuoteOLrzqt.isPreMarket : false, (67102719 & 2097152) != 0 ? coinQuoteOLrzqt.isRebase : false, (67102719 & 4194304) != 0 ? coinQuoteOLrzqt.isHot : false, (67102719 & 8388608) != 0 ? coinQuoteOLrzqt.isNewLabel : false, (67102719 & 16777216) != 0 ? coinQuoteOLrzqt.displayId : null, (67102719 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? coinQuoteOLrzqt.displayQuoteSymbol : null), "markets_discover");
                    return;
                }
                return;
            }
            if (z) {
                marketsFavoritesOptViewModel.copydefault(bizInstrument);
                C46688tbr.KWHzl.KWHzl("Discover_Market", C56423yEv.EZpvd(C56390yDp.OLrzqt("remove fav", str + "-" + str2)));
                return;
            }
            marketsFavoritesOptViewModel.AEQbTJ(bizInstrument);
            C46688tbr.KWHzl.KWHzl("Discover_Market", C56423yEv.EZpvd(C56390yDp.OLrzqt("add fav", str + "-" + str2)));
        }
    }
}
