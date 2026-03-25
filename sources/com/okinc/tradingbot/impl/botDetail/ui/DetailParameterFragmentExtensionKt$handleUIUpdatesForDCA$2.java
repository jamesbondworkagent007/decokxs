package com.okinc.tradingbot.impl.botDetail.ui;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.tradingbot.impl.botDetail.ui.DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48457uSc;
import o.C43251rlk;
import o.C48170uHo;
import o.C52207wCw;
import o.C52705wVh;
import o.C55296xhK;
import o.C55804xqp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC48173uHr;
import o.oKA;
import o.uHW;

/* JADX INFO: loaded from: classes19.dex */
public final class DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2 extends SuspendLambda implements Function2<Pair<? extends C55804xqp<StrategyDetailsResponse>, ? extends List<? extends StgySourceInfo>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC48457uSc $binding;
    final /* synthetic */ TacticsDetailPresenter $botDetailPresenter;
    final /* synthetic */ BotOperatorButtonDisposer $botOperatorButtonDisposer;
    final /* synthetic */ Function0<TacticsData> $tacticsData;
    final /* synthetic */ C52207wCw $this_handleUIUpdatesForDCA;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2(AbstractC48457uSc abstractC48457uSc, TacticsDetailPresenter tacticsDetailPresenter, C52207wCw c52207wCw, BotOperatorButtonDisposer botOperatorButtonDisposer, Function0<TacticsData> function0, Continuation<? super DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2> continuation) {
        super(2, continuation);
        this.$binding = abstractC48457uSc;
        this.$botDetailPresenter = tacticsDetailPresenter;
        this.$this_handleUIUpdatesForDCA = c52207wCw;
        this.$botOperatorButtonDisposer = botOperatorButtonDisposer;
        this.$tacticsData = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2 detailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2 = new DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2(this.$binding, this.$botDetailPresenter, this.$this_handleUIUpdatesForDCA, this.$botOperatorButtonDisposer, this.$tacticsData, continuation);
        detailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2.L$0 = obj;
        return detailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends C55804xqp<StrategyDetailsResponse>, ? extends List<? extends StgySourceInfo>> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<C55804xqp<StrategyDetailsResponse>, ? extends List<StgySourceInfo>>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<C55804xqp<StrategyDetailsResponse>, ? extends List<StgySourceInfo>> pair, Continuation<? super Unit> continuation) {
        return ((DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        StrategyDetailsResponse strategyDetailsResponse;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            C55804xqp c55804xqp = (C55804xqp) pair.component1();
            List list = (List) pair.component2();
            if (c55804xqp == null || (strategyDetailsResponse = (StrategyDetailsResponse) c55804xqp.copydefault()) == null) {
                return Unit.INSTANCE;
            }
            if (!Intrinsics.EZpvd((Object) strategyDetailsResponse.getOrderType(), (Object) "spot_dca") && !Intrinsics.EZpvd((Object) strategyDetailsResponse.getOrderType(), (Object) "contract_dca")) {
                return Unit.INSTANCE;
            }
            AbstractC48457uSc abstractC48457uSc = this.$binding;
            LinearLayoutCompat linearLayoutCompat = abstractC48457uSc.values;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(8);
            LinearLayoutCompat linearLayoutCompat2 = abstractC48457uSc.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(8);
            LinearLayoutCompat linearLayoutCompat3 = abstractC48457uSc.AuCTel;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
            linearLayoutCompat3.setVisibility(8);
            LinearLayoutCompat linearLayoutCompat4 = abstractC48457uSc.AxsJAY;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
            linearLayoutCompat4.setVisibility(8);
            LinearLayoutCompat linearLayoutCompat5 = abstractC48457uSc.isConnected;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat5, "");
            linearLayoutCompat5.setVisibility(8);
            LinearLayoutCompat linearLayoutCompat6 = abstractC48457uSc.QVAiDq;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat6, "");
            linearLayoutCompat6.setVisibility(8);
            ComposeView composeView = this.$binding.copydefault;
            Intrinsics.checkNotNullExpressionValue(composeView, "");
            composeView.setVisibility(0);
            boolean z = this.$botDetailPresenter.AubY() || this.$botDetailPresenter.AwvSrB() || Intrinsics.EZpvd((Object) "stopped", (Object) strategyDetailsResponse.getState());
            this.$binding.copydefault.setContent(ComposableLambdaKt.composableLambdaInstance(-230821604, true, new AnonymousClass2(z, list, this.$botDetailPresenter, strategyDetailsResponse, this.$this_handleUIUpdatesForDCA, this.$botOperatorButtonDisposer, this.$tacticsData)));
            boolean z2 = !Intrinsics.EZpvd((Object) strategyDetailsResponse.getCopyType(), (Object) "2");
            C52705wVh c52705wVh = this.$binding.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c52705wVh, "");
            c52705wVh.setVisibility(z2 ? 0 : 8);
            if (z2) {
                C52705wVh c52705wVh2 = this.$binding.djBIcL;
                c52705wVh2.setOnClickListener(new StateListAnimator(c52705wVh2, 1000L, this.$botOperatorButtonDisposer, this.$tacticsData));
            }
            boolean z3 = !z;
            C52705wVh c52705wVh3 = this.$binding.sSMYrx;
            Intrinsics.checkNotNullExpressionValue(c52705wVh3, "");
            c52705wVh3.setVisibility(z3 ? 0 : 8);
            if (z3) {
                C52705wVh c52705wVh4 = this.$binding.sSMYrx;
                c52705wVh4.setOnClickListener(new ActionBar(c52705wVh4, 1000L, this.$botOperatorButtonDisposer, this.$tacticsData));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.botDetail.ui.DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2$2, reason: invalid class name */
    public static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TacticsDetailPresenter AEQbTJ;
        public final /* synthetic */ Function0<TacticsData> AhwBna;
        public final /* synthetic */ BotOperatorButtonDisposer EZpvd;
        public final /* synthetic */ List<StgySourceInfo> KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ StrategyDetailsResponse copydefault;
        public final /* synthetic */ C52207wCw gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(boolean z, List<StgySourceInfo> list, TacticsDetailPresenter tacticsDetailPresenter, StrategyDetailsResponse strategyDetailsResponse, C52207wCw c52207wCw, BotOperatorButtonDisposer botOperatorButtonDisposer, Function0<TacticsData> function0) {
            this.OLrzqt = z;
            this.KWHzl = list;
            this.AEQbTJ = tacticsDetailPresenter;
            this.copydefault = strategyDetailsResponse;
            this.gEmmrt = c52207wCw;
            this.EZpvd = botOperatorButtonDisposer;
            this.AhwBna = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            StgySourceInfo stgySourceInfo;
            StgySourceInfo stgySourceInfo2;
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-230821604, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.handleUIUpdatesForDCA.<anonymous>.<anonymous> (DetailParameterFragmentExtension.kt:67)");
                }
                C48170uHo c48170uHo = C48170uHo.copydefault;
                boolean z = this.OLrzqt;
                List<StgySourceInfo> list = this.KWHzl;
                String avatar = null;
                String username = (list == null || (stgySourceInfo2 = (StgySourceInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : stgySourceInfo2.getUsername();
                String str = username == null ? "" : username;
                List<StgySourceInfo> list2 = this.KWHzl;
                if (list2 != null && (stgySourceInfo = (StgySourceInfo) CollectionsKt___CollectionsKt.firstOrNull(list2)) != null) {
                    avatar = stgySourceInfo.getAvatar();
                }
                InterfaceC48173uHr interfaceC48173uHrOLrzqt = c48170uHo.OLrzqt(this.copydefault, this.AEQbTJ.fetchVPNInfo(), str, avatar == null ? "" : avatar, !z);
                composer.startReplaceableGroup(203729541);
                boolean zChangedInstance = composer.changedInstance(this.gEmmrt);
                final C52207wCw c52207wCw = this.gEmmrt;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.uIj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2.AnonymousClass2.KWHzl(c52207wCw, (InterfaceC48173uHr) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(203742165);
                boolean zChangedInstance2 = composer.changedInstance(this.gEmmrt);
                boolean zChanged = composer.changed(this.copydefault);
                boolean zChangedInstance3 = composer.changedInstance(this.EZpvd);
                boolean zChanged2 = composer.changed(this.AhwBna);
                final C52207wCw c52207wCw2 = this.gEmmrt;
                final StrategyDetailsResponse strategyDetailsResponse = this.copydefault;
                final BotOperatorButtonDisposer botOperatorButtonDisposer = this.EZpvd;
                final Function0<TacticsData> function0 = this.AhwBna;
                Object objRememberedValue2 = composer.rememberedValue();
                if ((zChangedInstance2 | zChanged | zChangedInstance3 | zChanged2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: o.uIh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2.AnonymousClass2.KWHzl(c52207wCw2, strategyDetailsResponse, botOperatorButtonDisposer, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(203756229);
                boolean zChangedInstance4 = composer.changedInstance(this.EZpvd);
                boolean zChanged3 = composer.changed(this.AhwBna);
                final BotOperatorButtonDisposer botOperatorButtonDisposer2 = this.EZpvd;
                final Function0<TacticsData> function03 = this.AhwBna;
                Object objRememberedValue3 = composer.rememberedValue();
                if ((zChangedInstance4 | zChanged3) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: o.uIi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2.AnonymousClass2.copydefault(botOperatorButtonDisposer2, function03, (InterfaceC48173uHr) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                uHW.OLrzqt(null, interfaceC48173uHrOLrzqt, function1, function02, (Function1) objRememberedValue3, composer, 0, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit KWHzl(C52207wCw c52207wCw, InterfaceC48173uHr interfaceC48173uHr) {
            Intrinsics.checkNotNullParameter(interfaceC48173uHr, "");
            oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
            if (oka != null) {
                Context contextRequireContext = c52207wCw.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                oKA.TaskDescription.gotoNewKlinePage$default(oka, contextRequireContext, new MarketCoinInfo(interfaceC48173uHr.djBIcL(), interfaceC48173uHr.gEmmrt(), (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 2044, null);
            }
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(C52207wCw c52207wCw, StrategyDetailsResponse strategyDetailsResponse, BotOperatorButtonDisposer botOperatorButtonDisposer, Function0 function0) {
            if (c52207wCw.AEQbTJ(strategyDetailsResponse)) {
                BotOperatorButtonDisposer.dispose$default(botOperatorButtonDisposer, "strategy_modify_stop_condition", (TacticsData) function0.invoke(), new Function0() { // from class: o.uIf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2.AnonymousClass2.OLrzqt();
                    }
                }, null, null, null, 56, null);
            }
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt() {
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(BotOperatorButtonDisposer botOperatorButtonDisposer, Function0 function0, InterfaceC48173uHr interfaceC48173uHr) {
            Intrinsics.checkNotNullParameter(interfaceC48173uHr, "");
            BotOperatorButtonDisposer.dispose$default(botOperatorButtonDisposer, "strategy_edit_dca_parameter", (TacticsData) function0.invoke(), new Function0() { // from class: o.uIg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DetailParameterFragmentExtensionKt$handleUIUpdatesForDCA$2.AnonymousClass2.copydefault();
                }
            }, null, null, null, 56, null);
            return Unit.INSTANCE;
        }

        public static final Unit copydefault() {
            return Unit.INSTANCE;
        }
    }

    public static final class Activity implements Function0<Unit> {
        public static final Activity KWHzl = new Activity();

        public final void OLrzqt() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }
    }

    public static final class Application implements Function0<Unit> {
        public static final Application copydefault = new Application();

        public final void copydefault() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ BotOperatorButtonDisposer EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, BotOperatorButtonDisposer botOperatorButtonDisposer, Function0 function0) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = botOperatorButtonDisposer;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                BotOperatorButtonDisposer.dispose$default(this.EZpvd, "strategy_button_stop", (TacticsData) this.copydefault.invoke(), Application.copydefault, null, null, null, 56, null);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ BotOperatorButtonDisposer KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, BotOperatorButtonDisposer botOperatorButtonDisposer, Function0 function0) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = botOperatorButtonDisposer;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                BotOperatorButtonDisposer.dispose$default(this.KWHzl, "strategy_button_recreate", (TacticsData) this.EZpvd.invoke(), Activity.KWHzl, null, null, null, 56, null);
            }
        }
    }
}
