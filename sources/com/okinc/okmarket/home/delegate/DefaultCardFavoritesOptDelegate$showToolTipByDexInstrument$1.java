package com.okinc.okmarket.home.delegate;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.market.discover.features.markets.sub.favorites.viewmodel.MarketsFavoritesOptViewModel;
import com.okinc.okmarket.home.delegate.DefaultCardFavoritesOptDelegate$showToolTipByDexInstrument$1;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC46751tdA;
import o.C38383pWt;
import o.C41431qqg;
import o.C46600taI;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultCardFavoritesOptDelegate$showToolTipByDexInstrument$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $anchor;
    final /* synthetic */ MarketsFavoritesOptViewModel $favoritesViewModel;
    final /* synthetic */ boolean $forceFragmentResult;
    final /* synthetic */ Fragment $host;
    final /* synthetic */ DexInstrument $instrument;
    final /* synthetic */ Fragment $lifecycleOwner;
    final /* synthetic */ FragmentManager $parentFragmentManager;
    final /* synthetic */ String $tokenPrice;
    boolean Z$0;
    int label;
    final /* synthetic */ C46600taI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCardFavoritesOptDelegate$showToolTipByDexInstrument$1(C46600taI c46600taI, DexInstrument dexInstrument, MarketsFavoritesOptViewModel marketsFavoritesOptViewModel, FragmentManager fragmentManager, Fragment fragment, View view, Fragment fragment2, boolean z, String str, Continuation<? super DefaultCardFavoritesOptDelegate$showToolTipByDexInstrument$1> continuation) {
        super(2, continuation);
        this.this$0 = c46600taI;
        this.$instrument = dexInstrument;
        this.$favoritesViewModel = marketsFavoritesOptViewModel;
        this.$parentFragmentManager = fragmentManager;
        this.$lifecycleOwner = fragment;
        this.$anchor = view;
        this.$host = fragment2;
        this.$forceFragmentResult = z;
        this.$tokenPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultCardFavoritesOptDelegate$showToolTipByDexInstrument$1(this.this$0, this.$instrument, this.$favoritesViewModel, this.$parentFragmentManager, this.$lifecycleOwner, this.$anchor, this.$host, this.$forceFragmentResult, this.$tokenPrice, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultCardFavoritesOptDelegate$showToolTipByDexInstrument$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C38383pWt c38383pWtEZpvd = this.this$0.EZpvd();
            DexInstrument dexInstrument = this.$instrument;
            this.label = 1;
            obj = c38383pWtEZpvd.AEQbTJ(dexInstrument, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z2 = this.Z$0;
                C56391yDq.AEQbTJ(obj);
                z = z2;
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.$parentFragmentManager.clearFragmentResultListener(MarketToolDialog.class.getName());
                FragmentManager fragmentManager = this.$parentFragmentManager;
                String name = MarketToolDialog.class.getName();
                Fragment fragment = this.$lifecycleOwner;
                final FragmentManager fragmentManager2 = this.$parentFragmentManager;
                final MarketsFavoritesOptViewModel marketsFavoritesOptViewModel = this.$favoritesViewModel;
                final DexInstrument dexInstrument2 = this.$instrument;
                final View view = this.$anchor;
                final String str = this.$tokenPrice;
                fragmentManager.setFragmentResultListener(name, fragment, new FragmentResultListener() { // from class: o.taK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                        DefaultCardFavoritesOptDelegate$showToolTipByDexInstrument$1.invokeSuspend$lambda$0(fragmentManager2, zBooleanValue, marketsFavoritesOptViewModel, dexInstrument2, view, str, str2, bundle);
                    }
                });
                int i2 = C41431qqg.EZpvd(this.$anchor).y;
                MarketToolDialog.Activity activity = MarketToolDialog.Companion;
                String name2 = MarketToolDialog.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "");
                activity.copydefault(this.$host, name2, i2, zBooleanValue, "market_list", z, this.$forceFragmentResult);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        MarketsFavoritesOptViewModel marketsFavoritesOptViewModel2 = this.$favoritesViewModel;
        DexInstrument dexInstrument3 = this.$instrument;
        this.Z$0 = zBooleanValue2;
        this.label = 2;
        Object objKWHzl = marketsFavoritesOptViewModel2.KWHzl(dexInstrument3, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        z = zBooleanValue2;
        obj = objKWHzl;
        final boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
        this.$parentFragmentManager.clearFragmentResultListener(MarketToolDialog.class.getName());
        FragmentManager fragmentManager3 = this.$parentFragmentManager;
        String name3 = MarketToolDialog.class.getName();
        Fragment fragment2 = this.$lifecycleOwner;
        final FragmentManager fragmentManager22 = this.$parentFragmentManager;
        final MarketsFavoritesOptViewModel marketsFavoritesOptViewModel3 = this.$favoritesViewModel;
        final DexInstrument dexInstrument22 = this.$instrument;
        final View view2 = this.$anchor;
        final String str2 = this.$tokenPrice;
        fragmentManager3.setFragmentResultListener(name3, fragment2, new FragmentResultListener() { // from class: o.taK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str22, android.os.Bundle bundle) {
                DefaultCardFavoritesOptDelegate$showToolTipByDexInstrument$1.invokeSuspend$lambda$0(fragmentManager22, zBooleanValue3, marketsFavoritesOptViewModel3, dexInstrument22, view2, str2, str22, bundle);
            }
        });
        int i22 = C41431qqg.EZpvd(this.$anchor).y;
        MarketToolDialog.Activity activity2 = MarketToolDialog.Companion;
        String name22 = MarketToolDialog.class.getName();
        Intrinsics.checkNotNullExpressionValue(name22, "");
        activity2.copydefault(this.$host, name22, i22, zBooleanValue3, "market_list", z, this.$forceFragmentResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(FragmentManager fragmentManager, boolean z, MarketsFavoritesOptViewModel marketsFavoritesOptViewModel, DexInstrument dexInstrument, View view, String str, String str2, Bundle bundle) {
        if (Intrinsics.EZpvd((Object) str2, (Object) MarketToolDialog.class.getName())) {
            fragmentManager.clearFragmentResultListener(MarketToolDialog.class.getName());
            int i = bundle.getInt(BotWebHook.KEY_ACTION);
            if (i == MarketToolDialog.Action.STAR.ordinal()) {
                if (z) {
                    marketsFavoritesOptViewModel.EZpvd(dexInstrument);
                    return;
                } else {
                    marketsFavoritesOptViewModel.OLrzqt(dexInstrument);
                    return;
                }
            }
            if (i == MarketToolDialog.Action.ALERT.ordinal()) {
                ActivityC46751tdA.Application application = ActivityC46751tdA.Companion;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ActivityC46751tdA.Application.startActivity$default(application, context, null, new TokenInfoForAlert(dexInstrument.getChainId(), dexInstrument.getChainName(), dexInstrument.getTokenContractAddress(), dexInstrument.getTokenLogoUrl(), dexInstrument.getChainLogoUrl(), dexInstrument.getTokenSymbol(), str, null, false, 0, FaceDetector.NUM_BOXES, null), 2, null);
            }
        }
    }
}
