package com.okinc.tradingbot.impl.strategy.view.helper;

import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorViewModel;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C54507xKz;
import o.C56235xyw;
import o.C56391yDq;
import o.C56547yJk;
import o.pUU;
import o.uCG;
import o.uCI;
import o.uCJ;
import o.uCN;
import o.xKK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOperatorViewModel extends ViewModel {
    public SmartEarnConfig AEQbTJ;
    public final C56235xyw AYXKKw;
    public final uCN AhwBna;
    public final TradeLiveData<StrategyConfigInfo> EZpvd;
    public final MutableSharedFlow<ActionBar> KWHzl;
    public final uCI OLrzqt;
    public SmartEarnParamsCheckUseCase.Result copydefault;
    public final SmartEarnParamsCheckUseCase djBIcL;
    public final uCJ gEmmrt;
    public final SharedFlow<ActionBar> isConnected;
    public final uCG valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ActionBar> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnConfig OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParamsCheckUseCase.Result copydefault() {
        return this.copydefault;
    }

    @yCM
    public BotOperatorViewModel(@NotNull uCG ucg, @NotNull uCJ ucj, @NotNull uCN ucn, @NotNull uCI uci) {
        Intrinsics.checkNotNullParameter(ucg, "");
        Intrinsics.checkNotNullParameter(ucj, "");
        Intrinsics.checkNotNullParameter(ucn, "");
        Intrinsics.checkNotNullParameter(uci, "");
        this.valueOf = ucg;
        this.gEmmrt = ucj;
        this.AhwBna = ucn;
        this.OLrzqt = uci;
        this.AYXKKw = new C56235xyw();
        this.EZpvd = new TradeLiveData<>();
        this.djBIcL = new SmartEarnParamsCheckUseCase(Dispatchers.getDefault());
        MutableSharedFlow<ActionBar> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void copydefault(final TacticsData tacticsData, final Function2<? super TacticsData, ? super SmartEarnParamsCheckUseCase.Result, Unit> function2) {
        final C56235xyw c56235xyw = this.AYXKKw;
        c56235xyw.KWHzl("grid");
        c56235xyw.AEQbTJ(tacticsData.getInstId());
        c56235xyw.OLrzqt(tacticsData.getTradeQuoteCcy());
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.EZpvd, new C54507xKz());
        c56235xyw.KWHzl(new Function1() { // from class: o.wSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotOperatorViewModel.AEQbTJ(c56235xyw, function2, tacticsData, this, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public static final Unit AEQbTJ(C56235xyw c56235xyw, Function2 function2, TacticsData tacticsData, BotOperatorViewModel botOperatorViewModel, ResponseData responseData) {
        AbstractC43419rot actionBar;
        Intrinsics.checkNotNullParameter(responseData, "");
        try {
            Result.Application application = Result.Companion;
            try {
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            SmartEarnConfig earnConfig = ((StrategyConfigInfo) CollectionsKt___CollectionsKt.AuCTelauCTel((List) actionBar.AEQbTJ())).getEarnConfig();
            if (earnConfig == null) {
                function2.invoke(tacticsData, null);
            } else {
                SmartEarnParamsCheckUseCase.Result resultEZpvd = botOperatorViewModel.djBIcL.EZpvd(new SmartEarnParamsCheckUseCase.ActionBar(earnConfig, tacticsData.getGridNum(), C56547yJk.EZpvd(tacticsData.getMinPx(), tacticsData.getMaxPx()), tacticsData.getTrailingDownConfig(), tacticsData.getTrailingUpConfig(), null, null, 96, null), tacticsData.getInstId(), tacticsData.getInstType());
                botOperatorViewModel.AEQbTJ = earnConfig;
                botOperatorViewModel.copydefault = resultEZpvd;
                function2.invoke(tacticsData, resultEZpvd);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "grid") && Intrinsics.EZpvd((Object) tacticsData.getInstType(), (Object) "SPOT")) {
            copydefault(tacticsData, new Function2() { // from class: o.wSR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BotOperatorViewModel.OLrzqt(this.EZpvd, (TacticsData) obj, (SmartEarnParamsCheckUseCase.Result) obj2);
                }
            });
        } else {
            this.KWHzl.tryEmit(new ActionBar.PendingIntent(tacticsData));
        }
    }

    public static final Unit OLrzqt(BotOperatorViewModel botOperatorViewModel, TacticsData tacticsData, SmartEarnParamsCheckUseCase.Result result) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        botOperatorViewModel.KWHzl.tryEmit(new ActionBar.PendingIntent(tacticsData));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull TacticsData tacticsData, @NotNull Function2<? super TacticsData, ? super SmartEarnParamsCheckUseCase.Result, Unit> function2) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "grid") && Intrinsics.EZpvd((Object) tacticsData.getInstType(), (Object) "SPOT")) {
            copydefault(tacticsData, function2);
        }
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotOperatorViewModel$fetchBacktestCopyConfig$1(this, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotOperatorViewModel$fetchAiBotRecreateConfig$1(this, str, z, null), 3, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotOperatorViewModel$fetchRerunBacktestConfig$1(this, str, null), 3, null);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BotOperatorViewModel$editBacktestStrategyName$1(this, str, str2, null), 3, null);
    }

    public interface ActionBar {

        public static final class PendingIntent implements ActionBar {
            public final TacticsData AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, TacticsData tacticsData, int i, Object obj) {
                if ((i & 1) != 0) {
                    tacticsData = pendingIntent.AEQbTJ;
                }
                return pendingIntent.EZpvd(tacticsData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PendingIntent EZpvd(@NotNull TacticsData tacticsData) {
                Intrinsics.checkNotNullParameter(tacticsData, "");
                return new PendingIntent(tacticsData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TacticsData copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingIntent) && Intrinsics.EZpvd(this.AEQbTJ, ((PendingIntent) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowMoreBottomSheet(data=" + this.AEQbTJ + ")";
            }

            public PendingIntent(@NotNull TacticsData tacticsData) {
                Intrinsics.checkNotNullParameter(tacticsData, "");
                this.AEQbTJ = tacticsData;
            }
        }

        public static final class Activity implements ActionBar {
            public final uCG.Activity EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, uCG.Activity activity2, int i, Object obj) {
                if ((i & 1) != 0) {
                    activity2 = activity.EZpvd;
                }
                return activity.copydefault(activity2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(@NotNull uCG.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                return new Activity(activity);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final uCG.Activity copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "BacktestCopyConfigSuccess(data=" + this.EZpvd + ")";
            }

            public Activity(@NotNull uCG.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                this.EZpvd = activity;
            }
        }

        public static final class TaskDescription implements ActionBar {
            public static final int copydefault = AiOrderReq.$stable;
            public final uCJ.StateListAnimator OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, uCJ.StateListAnimator stateListAnimator, int i, Object obj) {
                if ((i & 1) != 0) {
                    stateListAnimator = taskDescription.OLrzqt;
                }
                return taskDescription.copydefault(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final uCJ.StateListAnimator KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(@NotNull uCJ.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                return new TaskDescription(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AiBotRecreateConfigSuccess(data=" + this.OLrzqt + ")";
            }

            public TaskDescription(@NotNull uCJ.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                this.OLrzqt = stateListAnimator;
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0676ActionBar implements ActionBar {
            public static final int AEQbTJ = AiOrderReq.$stable;
            public final uCN.StateListAnimator EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0676ActionBar copy$default(C0676ActionBar c0676ActionBar, uCN.StateListAnimator stateListAnimator, int i, Object obj) {
                if ((i & 1) != 0) {
                    stateListAnimator = c0676ActionBar.EZpvd;
                }
                return c0676ActionBar.AEQbTJ(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0676ActionBar AEQbTJ(@NotNull uCN.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                return new C0676ActionBar(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final uCN.StateListAnimator copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0676ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((C0676ActionBar) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AiBotRerunConfigSuccess(data=" + this.EZpvd + ")";
            }

            public C0676ActionBar(@NotNull uCN.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                this.EZpvd = stateListAnimator;
            }
        }

        public static final class Application implements ActionBar {
            public final String AEQbTJ;
            public final boolean OLrzqt;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = application.copydefault;
                }
                if ((i & 4) != 0) {
                    z = application.OLrzqt;
                }
                return application.copydefault(str, str2, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull String str, @NotNull String str2, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Application(str, str2, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && this.OLrzqt == application.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "BacktestNameEditSuccess(algoId=" + this.AEQbTJ + ", newName=" + this.copydefault + ", isRestore=" + this.OLrzqt + ")";
            }

            public Application(@NotNull String str, @NotNull String str2, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ = str;
                this.copydefault = str2;
                this.OLrzqt = z;
            }
        }

        public static final class StateListAnimator implements ActionBar {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.copydefault;
                }
                return stateListAnimator.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowErrorToast(message=" + this.copydefault + ")";
            }

            public StateListAnimator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }
    }
}
