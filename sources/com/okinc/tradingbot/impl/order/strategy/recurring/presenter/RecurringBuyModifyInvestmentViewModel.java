package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.tradingbot.impl.balance.dto.AccountBalance;
import com.okinc.tradingbot.impl.balance.dto.AccountType;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel;
import com.okinc.tradingbot.impl.strategy.view.CoinPriceItem;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.RecurringBuyDetails;
import com.okinc.unify_trade.biz.RecurringBuyDto;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.websocket.v5config.WsArgV5;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.AbstractC33073mpa;
import o.C33129mqd;
import o.C43417ror;
import o.C48159uHd;
import o.C52680wUj;
import o.C53418wlC;
import o.C54282xCq;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C55887xsS;
import o.C56033xvF;
import o.C56183xxx;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56442yFn;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC48160uHe;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pTB;
import o.uLP;
import o.wUL;
import o.xMR;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyModifyInvestmentViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<List<AccountBalance>> AEQbTJ;
    public final StateFlow<String> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final StateFlow<String> AkhnZx;
    public final StateFlow<List<CoinPriceItem>> AuCTel;
    public final C52680wUj AuCTelauCTel;
    public final StateFlow<InputValidationError> AubY;
    public final InterfaceC56387yDm DbNXlk;
    public final MutableStateFlow<String> EZpvd;
    public final MutableStateFlow<MinInvestResp> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final StateFlow<List<CoinPriceItem>> djBIcL;
    public final SavedStateHandle ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final StateFlow<uLP> fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final StateFlow<String> fetchVPNInfo;
    public final StateFlow<String> gEmmrt;
    public final InterfaceC56387yDm getFieldNames;
    public Job getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public final CoroutineDispatcher isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public final StateFlow<uLP> uzCIH;
    public final MutableStateFlow<List<TickersData>> valueOf;
    public final StateFlow<Boolean> values;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.MODIFY_AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.INVEST_MORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<CoinPriceItem>> AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLP> ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InputValidationError> getFieldNames() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> hDKMBd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLP> iwGUEr() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<CoinPriceItem>> values() {
        return this.AuCTel;
    }

    public static final class Application implements Flow<uLP> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                RecurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1 recurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1;
                String str;
                String minInvestment;
                if (continuation instanceof RecurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1) {
                    recurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1 = (RecurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = recurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        recurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        recurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1 = new RecurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = recurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = recurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    MinInvestResp minInvestResp = (MinInvestResp) obj;
                    if (minInvestResp == null || (minInvestment = minInvestResp.getMinInvestment()) == null) {
                        str = null;
                    } else {
                        str = "≥" + xMR.copydefault.copydefault(minInvestment);
                    }
                    String strCopydefault = C53418wlC.copydefault(str);
                    String minInvestment2 = minInvestResp != null ? minInvestResp.getMinInvestment() : null;
                    if (minInvestment2 == null) {
                        minInvestment2 = "";
                    }
                    uLP ulpCopydefault = uLP.copydefault(uLP.EZpvd(strCopydefault, minInvestment2));
                    recurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(ulpCopydefault, recurringBuyModifyInvestmentViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super uLP> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Dialog implements Flow<String> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ RecurringBuyModifyInvestmentViewModel copydefault;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel$Dialog$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ RecurringBuyModifyInvestmentViewModel EZpvd;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
                this.copydefault = flowCollector;
                this.EZpvd = recurringBuyModifyInvestmentViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                RecurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1 recurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1;
                if (continuation instanceof RecurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1) {
                    recurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1 = (RecurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1) continuation;
                    int i = recurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        recurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        recurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1 = new RecurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1(this, continuation);
                    }
                }
                Object obj2 = recurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = recurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    String strAEQbTJ = this.EZpvd.AEQbTJ((List<TickersData>) obj);
                    recurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(strAEQbTJ, recurringBuyModifyInvestmentViewModel$special$$inlined$map$3$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Dialog(Flow flow, RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
            this.EZpvd = flow;
            this.copydefault = recurringBuyModifyInvestmentViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass1(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class FragmentManager implements Flow<List<? extends CoinPriceItem>> {
        public final /* synthetic */ RecurringBuyModifyInvestmentViewModel OLrzqt;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel$FragmentManager$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ RecurringBuyModifyInvestmentViewModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
                this.KWHzl = flowCollector;
                this.copydefault = recurringBuyModifyInvestmentViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                RecurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1 recurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1;
                if (continuation instanceof RecurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1) {
                    recurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1 = (RecurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1) continuation;
                    int i = recurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        recurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        recurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1 = new RecurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1(this, continuation);
                    }
                }
                Object obj2 = recurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = recurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    List listCopydefault = this.copydefault.copydefault((List<TickersData>) obj);
                    recurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1.label = 1;
                    if (flowCollector.emit(listCopydefault, recurringBuyModifyInvestmentViewModel$special$$inlined$map$4$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public FragmentManager(Flow flow, RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
            this.copydefault = flow;
            this.OLrzqt = recurringBuyModifyInvestmentViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends CoinPriceItem>> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Flow<uLP> {
        public final /* synthetic */ RecurringBuyModifyInvestmentViewModel OLrzqt;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ RecurringBuyModifyInvestmentViewModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
                this.AEQbTJ = flowCollector;
                this.copydefault = recurringBuyModifyInvestmentViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                RecurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1 recurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof RecurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1) {
                    recurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1 = (RecurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = recurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        recurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        recurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1 = new RecurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = recurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = recurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel = this.copydefault;
                    uLP ulpCopydefault = uLP.copydefault(recurringBuyModifyInvestmentViewModel.EZpvd((List<AccountBalance>) obj, (Set<? extends AccountType>) recurringBuyModifyInvestmentViewModel.AuCTel()));
                    recurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(ulpCopydefault, recurringBuyModifyInvestmentViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
            this.copydefault = flow;
            this.OLrzqt = recurringBuyModifyInvestmentViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super uLP> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class ActionBar implements Function1<List<? extends TickersData>, TickersData> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.okinc.unify_trade.biz.subscribe.TickersData, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final TickersData invoke(List<? extends TickersData> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        }
    }

    @yCM
    public RecurringBuyModifyInvestmentViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull SavedStateHandle savedStateHandle, @NotNull C52680wUj c52680wUj) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c52680wUj, "");
        this.isConnected = coroutineDispatcher;
        this.ejfBZ = savedStateHandle;
        this.AuCTelauCTel = c52680wUj;
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.vUy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecurringBuyModifyInvestmentViewModel.copydefault();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.vUA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecurringBuyModifyInvestmentViewModel.AkhnZx(this.EZpvd);
            }
        });
        this.getFieldNames = C56392yDr.copydefault(new Function0() { // from class: o.vUx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecurringBuyModifyInvestmentViewModel.OLrzqt();
            }
        });
        MutableStateFlow<MinInvestResp> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        MutableStateFlow<List<TickersData>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.valueOf = MutableStateFlow2;
        MutableStateFlow<List<AccountBalance>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow3;
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.vUB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecurringBuyModifyInvestmentViewModel.ejfBZ(this.AEQbTJ);
            }
        });
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow("");
        this.EZpvd = MutableStateFlow4;
        this.OLrzqt = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow4);
        this.hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.vUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecurringBuyModifyInvestmentViewModel.fJNWhG(this.AEQbTJ);
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.vUE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecurringBuyModifyInvestmentViewModel.AuCTel(this.AEQbTJ);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.vUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecurringBuyModifyInvestmentViewModel.DbNXlk(this.KWHzl);
            }
        });
        uzCIH();
        StateListAnimator stateListAnimator = new StateListAnimator(MutableStateFlow3, this);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted lazily = companion.getLazily();
        uLP.Application application = uLP.Companion;
        StateFlow<uLP> stateFlowStateIn = FlowKt.stateIn(stateListAnimator, viewModelScope, lazily, uLP.copydefault(application.OLrzqt()));
        this.uzCIH = stateFlowStateIn;
        this.gEmmrt = FlowKt.stateIn(FlowKt.combine(MutableStateFlow4, stateFlowStateIn, MutableStateFlow, new RecurringBuyModifyInvestmentViewModel$estimateCount$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), "--");
        this.fIwbmz = FlowKt.stateIn(new Application(MutableStateFlow), ViewModelKt.getViewModelScope(this), companion.getLazily(), uLP.copydefault(application.OLrzqt()));
        this.AYXKKw = FlowKt.stateIn(FlowKt.combine(MutableStateFlow4, MutableStateFlow2, new RecurringBuyModifyInvestmentViewModel$averagePriceDisplay$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), "--");
        this.djBIcL = FlowKt.stateIn(FlowKt.combine(MutableStateFlow4, MutableStateFlow2, new RecurringBuyModifyInvestmentViewModel$averagePriceItems$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), yDY.AhwBna());
        this.AkhnZx = FlowKt.stateIn(new Dialog(MutableStateFlow2, this), ViewModelKt.getViewModelScope(this), companion.getLazily(), "--");
        this.AuCTel = FlowKt.stateIn(new FragmentManager(MutableStateFlow2, this), ViewModelKt.getViewModelScope(this), companion.getLazily(), yDY.AhwBna());
        this.AubY = FlowKt.stateIn(FlowKt.combine(MutableStateFlow4, MutableStateFlow, stateFlowStateIn, new RecurringBuyModifyInvestmentViewModel$validationError$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), null);
        this.values = FlowKt.stateIn(FlowKt.combine(MutableStateFlow4, MutableStateFlow, stateFlowStateIn, new RecurringBuyModifyInvestmentViewModel$isConfirmEnabled$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getLazily(), Boolean.FALSE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Parcelable.Creator<Mode> CREATOR;
        public static final Mode MODIFY_AMOUNT = new Mode("MODIFY_AMOUNT", 0);
        public static final Mode INVEST_MORE = new Mode("INVEST_MORE", 1);

        public static final class Creator implements Parcelable.Creator<Mode> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Mode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return Mode.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Mode[] newArray(int i) {
                return new Mode[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{MODIFY_AMOUNT, INVEST_MORE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Mode> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private Mode(String str, int i) {
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(modeArr$values);
            CREATOR = new Creator();
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InputValidationError {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InputValidationError[] $VALUES;
        public static final InputValidationError BELOW_MINIMUM = new InputValidationError("BELOW_MINIMUM", 0);
        public static final InputValidationError EXCEEDS_AVAILABLE = new InputValidationError("EXCEEDS_AVAILABLE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InputValidationError[] $values() {
            return new InputValidationError[]{BELOW_MINIMUM, EXCEEDS_AVAILABLE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InputValidationError> getEntries() {
            return $ENTRIES;
        }

        private InputValidationError(String str, int i) {
        }

        static {
            InputValidationError[] inputValidationErrorArr$values = $values();
            $VALUES = inputValidationErrorArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(inputValidationErrorArr$values);
        }

        public static InputValidationError valueOf(String str) {
            return (InputValidationError) Enum.valueOf(InputValidationError.class, str);
        }

        public static InputValidationError[] values() {
            return (InputValidationError[]) $VALUES.clone();
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final C56183xxx copydefault() {
        return new C56183xxx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C56183xxx sSMYrx() {
        return (C56183xxx) this.fJNWhG.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C48159uHd AuCTelauCTel() {
        return (C48159uHd) this.AhwBna.getValue();
    }

    public static final C48159uHd AkhnZx(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
        return new C48159uHd(recurringBuyModifyInvestmentViewModel.isConnected, (InterfaceC48160uHe) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC48160uHe.class)));
    }

    public static final C54282xCq OLrzqt() {
        return new C54282xCq();
    }

    public final C54282xCq fARcdN() {
        return (C54282xCq) this.getFieldNames.getValue();
    }

    public final Set<AccountType> AuCTel() {
        return (Set) this.iwGUEr.getValue();
    }

    public static final Set ejfBZ(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
        RecurringBuyDetails recurringBuyDetails;
        RecurringBuyDto recurringBuyDtoAEQbTJ;
        List<Integer> availableAccountList;
        AccountType next;
        TacticsData tacticsDataAwvSrB = recurringBuyModifyInvestmentViewModel.AwvSrB();
        if (tacticsDataAwvSrB != null && (recurringBuyDetails = tacticsDataAwvSrB.getRecurringBuyDetails()) != null && (recurringBuyDtoAEQbTJ = recurringBuyDetails.AEQbTJ()) != null && (availableAccountList = recurringBuyDtoAEQbTJ.getAvailableAccountList()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = availableAccountList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Iterator<AccountType> it2 = AccountType.getEntries().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.EZpvd((Object) next.getValue(), (Object) String.valueOf(iIntValue))) {
                        break;
                    }
                }
                AccountType accountType = next;
                if (accountType != null) {
                    arrayList.add(accountType);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((AccountType) obj) != AccountType.UNKNOW) {
                    arrayList2.add(obj);
                }
            }
            Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
            if (setOqFWZa != null) {
                return setOqFWZa;
            }
        }
        return yEE.copydefault();
    }

    private final TacticsData AwvSrB() {
        return (TacticsData) this.hDKMBd.getValue();
    }

    public static final TacticsData fJNWhG(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
        Object obj = recurringBuyModifyInvestmentViewModel.ejfBZ.get("arg_tactics_data");
        if (obj instanceof TacticsData) {
            return (TacticsData) obj;
        }
        return null;
    }

    public final Mode fIwbmz() {
        return (Mode) this.fARcdN.getValue();
    }

    public static final Mode AuCTel(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
        Mode mode = (Mode) recurringBuyModifyInvestmentViewModel.ejfBZ.get("arg_mode");
        return mode == null ? Mode.MODIFY_AMOUNT : mode;
    }

    private final C55887xsS zsXlph() {
        return (C55887xsS) this.DbNXlk.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C55887xsS DbNXlk(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel) {
        String str;
        RecurringListItem recurringListItem;
        TacticsData tacticsDataAwvSrB = recurringBuyModifyInvestmentViewModel.AwvSrB();
        if (tacticsDataAwvSrB == null) {
            return null;
        }
        String instId = tacticsDataAwvSrB.getInstId();
        if (instId.length() == 0) {
            ArrayList<RecurringListItem> recItemList = tacticsDataAwvSrB.getRecItemList();
            if (recItemList == null || (recurringListItem = (RecurringListItem) CollectionsKt___CollectionsKt.firstOrNull(recItemList)) == null) {
                str = "";
                instId = str;
            } else {
                str = recurringListItem.getCcy() + "-" + recurringBuyModifyInvestmentViewModel.isConnected();
                if (str == null) {
                }
                instId = str;
            }
        }
        return new C55887xsS(tacticsDataAwvSrB.getInstType(), instId);
    }

    public final void AubY() {
        zLjUOn();
        OLrzqt(true);
        if (fIwbmz() == Mode.INVEST_MORE) {
            KWHzl();
        }
    }

    public final void uzCIH() {
        this.EZpvd.setValue(fIwbmz() == Mode.MODIFY_AMOUNT ? valueOf() : "");
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setValue(str);
    }

    public final String OLrzqt(float f) {
        String strKWHzl = uLP.KWHzl(this.uzCIH.getValue().OLrzqt());
        if (strKWHzl.length() == 0) {
            return null;
        }
        try {
            return C33129mqd.mulS$default(strKWHzl, String.valueOf(f), 2, null, null, 12, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void zLjUOn() {
        ArrayList<RecurringListItem> recItemList;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        if (tacticsDataAwvSrB == null || (recItemList = tacticsDataAwvSrB.getRecItemList()) == null) {
            return;
        }
        String strIsConnected = isConnected();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(recItemList, 10));
        for (RecurringListItem recurringListItem : recItemList) {
            arrayList.add(new CoinRatioParam(recurringListItem.getCcy(), recurringListItem.getRatio(), (String) null, (String) null, 12, (DefaultConstructorMarker) null));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.isConnected, null, new RecurringBuyModifyInvestmentViewModel$requestMinInvest$1(this, strIsConnected, arrayList, null), 2, null);
    }

    public static /* synthetic */ void fetchAccountGroupData$default(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        recurringBuyModifyInvestmentViewModel.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        String id = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(isConnected())) == null) ? null : tradeCoinInfoAhwBna.getId();
        if (id == null) {
            id = "";
        }
        if (id.length() == 0) {
            return;
        }
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.isConnected, null, new RecurringBuyModifyInvestmentViewModel$fetchAccountGroupData$1(this, id, z ? CacheStrategy.NO_CACHE : CacheStrategy.FIRST_CACHE, null), 2, null);
    }

    public final void KWHzl() {
        ArrayList<RecurringListItem> recItemList;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        if (tacticsDataAwvSrB == null || (recItemList = tacticsDataAwvSrB.getRecItemList()) == null || recItemList.isEmpty()) {
            return;
        }
        AxsJAY();
        ArrayList<String> arrayList = new ArrayList(C56403yEb.AYXKKw(recItemList, 10));
        Iterator<T> it = recItemList.iterator();
        while (it.hasNext()) {
            arrayList.add(((RecurringListItem) it.next()).getCcy() + "-" + isConnected());
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.isConnected, null, new RecurringBuyModifyInvestmentViewModel$fetchTickerData$1(this, arrayList, null), 2, null);
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (String str : arrayList) {
            C52680wUj c52680wUj = this.AuCTelauCTel;
            arrayList2.add(c52680wUj.AEQbTJ(BuiltinSerializersKt.ListSerializer(TickersData.Companion.serializer()), new WsArgV5("tickers-3s", str, null, "SPOT", null, null, null, null, 244, null), c52680wUj.copydefault(), ActionBar.OLrzqt));
        }
        this.getNewProxyInstance = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new RecurringBuyModifyInvestmentViewModel$fetchTickerData$2(arrayList2, this, null), 2, null);
    }

    private final void AxsJAY() {
        fARcdN().AYXKKw();
        Job job = this.getNewProxyInstance;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.getNewProxyInstance = null;
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        AxsJAY();
    }

    public final String djBIcL() {
        TacticsData tacticsDataAwvSrB = AwvSrB();
        String algoId = tacticsDataAwvSrB != null ? tacticsDataAwvSrB.getAlgoId() : null;
        return algoId == null ? "" : algoId;
    }

    public final String fetchVPNInfo() {
        return this.EZpvd.getValue();
    }

    public final String isConnected() {
        String investCcy;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        if (tacticsDataAwvSrB != null && (investCcy = tacticsDataAwvSrB.getInvestCcy()) != null) {
            return investCcy;
        }
        C55887xsS c55887xsSZsXlph = zsXlph();
        String strCopydefault = c55887xsSZsXlph != null ? c55887xsSZsXlph.copydefault("recurring") : null;
        return strCopydefault == null ? "" : strCopydefault;
    }

    public final List<RecurringListItem> fJNWhG() {
        ArrayList<RecurringListItem> recItemList;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        return (tacticsDataAwvSrB == null || (recItemList = tacticsDataAwvSrB.getRecItemList()) == null) ? yDY.AhwBna() : recItemList;
    }

    public final boolean wlaJM() {
        ArrayList<RecurringListItem> recItemList;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        return (tacticsDataAwvSrB == null || (recItemList = tacticsDataAwvSrB.getRecItemList()) == null || recItemList.size() <= 2) ? false : true;
    }

    public final String valueOf() {
        RecurringBuyDetails recurringBuyDetails;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        String strKWHzl = (tacticsDataAwvSrB == null || (recurringBuyDetails = tacticsDataAwvSrB.getRecurringBuyDetails()) == null) ? null : recurringBuyDetails.KWHzl();
        return strKWHzl == null ? "" : strKWHzl;
    }

    public final Pair<? extends String, ? extends String> EZpvd(List<AccountBalance> list, Set<? extends AccountType> set) {
        if (list.isEmpty()) {
            return uLP.Companion.OLrzqt();
        }
        String strAddS$default = "0";
        for (AccountBalance accountBalance : list) {
            Set<? extends AccountType> set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.EZpvd((Object) ((AccountType) it.next()).getValue(), (Object) accountBalance.getTarget())) {
                        strAddS$default = C33129mqd.addS$default(strAddS$default, accountBalance.getAvailable(), null, null, null, 14, null);
                        break;
                    }
                }
            }
        }
        return uLP.EZpvd(EZpvd(strAddS$default, isConnected()), strAddS$default);
    }

    public final String OLrzqt(String str, String str2, String str3) {
        if (str3 == null) {
            str3 = "0";
        }
        return (C33129mqd.gEmmrt(str, str3) || str.length() == 0 || str2.length() == 0) ? "--" : pTB.formatLocalized$default(C33129mqd.divS$default(str2, str, 0, null, null, 12, null), null, 1, null);
    }

    public final String OLrzqt(final String str, final List<TickersData> list) {
        ArrayList<RecurringListItem> recItemList;
        TacticsData tacticsDataAwvSrB;
        final String instType;
        TacticsData tacticsDataAwvSrB2 = AwvSrB();
        if (tacticsDataAwvSrB2 == null || (recItemList = tacticsDataAwvSrB2.getRecItemList()) == null || (tacticsDataAwvSrB = AwvSrB()) == null || (instType = tacticsDataAwvSrB.getInstType()) == null || recItemList.isEmpty()) {
            return "--";
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(recItemList, ", ", null, null, 2, "...", new Function1() { // from class: o.vUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringBuyModifyInvestmentViewModel.KWHzl(list, this, str, instType, (RecurringListItem) obj);
            }
        }, 6, null);
        return strJoinToString$default.length() == 0 ? "--" : strJoinToString$default;
    }

    public static final CharSequence KWHzl(List list, RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, String str, String str2, RecurringListItem recurringListItem) {
        Object next;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(recurringListItem, "");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) recurringBuyModifyInvestmentViewModel.KWHzl((TickersData) next), (Object) recurringListItem.getCcy())) {
                break;
            }
        }
        TickersData tickersData = (TickersData) next;
        String instId = tickersData != null ? tickersData.getInstId() : null;
        if (instId == null) {
            str3 = str;
            str4 = "";
        } else {
            str3 = str;
            str4 = instId;
        }
        String botPrice$default = C56033xvF.getBotPrice$default(str2, str4, recurringBuyModifyInvestmentViewModel.AEQbTJ(recurringListItem, str3, (List<TickersData>) list), false, false, RoundingMode.HALF_UP, null, 88, null);
        return recurringListItem.getCcy() + " " + botPrice$default;
    }

    public final List<CoinPriceItem> AEQbTJ(String str, List<TickersData> list) {
        ArrayList<RecurringListItem> recItemList;
        String instType;
        Object next;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        if (tacticsDataAwvSrB == null || (recItemList = tacticsDataAwvSrB.getRecItemList()) == null) {
            return yDY.AhwBna();
        }
        TacticsData tacticsDataAwvSrB2 = AwvSrB();
        if (tacticsDataAwvSrB2 == null || (instType = tacticsDataAwvSrB2.getInstType()) == null) {
            return yDY.AhwBna();
        }
        if (recItemList.isEmpty()) {
            return yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(recItemList, 10));
        for (RecurringListItem recurringListItem : recItemList) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) KWHzl((TickersData) next), (Object) recurringListItem.getCcy())) {
                    break;
                }
            }
            TickersData tickersData = (TickersData) next;
            String instId = tickersData != null ? tickersData.getInstId() : null;
            String str2 = "";
            String botPrice$default = C56033xvF.getBotPrice$default(instType, instId == null ? "" : instId, AEQbTJ(recurringListItem, str, list), false, false, RoundingMode.HALF_UP, null, 88, null);
            String ccy = recurringListItem.getCcy();
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(recurringListItem.getCcy()) : null;
            if (strValueOf != null) {
                str2 = strValueOf;
            }
            arrayList.add(new CoinPriceItem(ccy, str2, botPrice$default));
        }
        return arrayList;
    }

    public final String AEQbTJ(RecurringListItem recurringListItem, String str, List<TickersData> list) {
        Object next;
        if (StringsKt__StringsKt.fARcdN((CharSequence) str) || !C33129mqd.AEQbTJ(C33129mqd.EZpvd(str), 0)) {
            return recurringListItem.getAvgPx();
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) KWHzl((TickersData) next), (Object) recurringListItem.getCcy())) {
                break;
            }
        }
        TickersData tickersData = (TickersData) next;
        String last = tickersData != null ? tickersData.getLast() : null;
        if (last == null || StringsKt__StringsKt.fARcdN((CharSequence) last) || !C33129mqd.AEQbTJ(C33129mqd.EZpvd(last), 0)) {
            return recurringListItem.getAvgPx();
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(recurringListItem.getTotalAmt());
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(recurringListItem.getAvgPx());
        BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(recurringListItem.getRatio());
        BigDecimal bigDecimalEZpvd4 = C33129mqd.EZpvd(str);
        BigDecimal bigDecimalEZpvd5 = C33129mqd.EZpvd(last);
        if (!C33129mqd.AEQbTJ(bigDecimalEZpvd2, 0)) {
            return last;
        }
        BigDecimal bigDecimalMultiply = bigDecimalEZpvd3.multiply(bigDecimalEZpvd4);
        BigDecimal bigDecimalEZpvd6 = C33129mqd.EZpvd(C33129mqd.divS$default(bigDecimalMultiply, C33129mqd.gEmmrt(bigDecimalEZpvd5), null, null, null, 14, null));
        BigDecimal bigDecimalAdd = bigDecimalMultiply.add(bigDecimalEZpvd.multiply(bigDecimalEZpvd2));
        BigDecimal bigDecimalAdd2 = bigDecimalEZpvd6.add(bigDecimalEZpvd);
        if (C33129mqd.AEQbTJ(bigDecimalAdd2, 0)) {
            return C33129mqd.divS$default(bigDecimalAdd, C33129mqd.gEmmrt(bigDecimalAdd2), null, null, null, 14, null);
        }
        return recurringListItem.getAvgPx();
    }

    public final String AEQbTJ(final List<TickersData> list) {
        ArrayList<RecurringListItem> recItemList;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        if (tacticsDataAwvSrB != null && (recItemList = tacticsDataAwvSrB.getRecItemList()) != null && !recItemList.isEmpty() && !list.isEmpty()) {
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(recItemList, ", ", null, null, 2, "...", new Function1() { // from class: o.vUG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return RecurringBuyModifyInvestmentViewModel.AEQbTJ(list, this, (RecurringListItem) obj);
                }
            }, 6, null);
            if (strJoinToString$default.length() != 0) {
                return strJoinToString$default;
            }
        }
        return "--";
    }

    public static final CharSequence AEQbTJ(List list, RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, RecurringListItem recurringListItem) {
        Object next;
        Intrinsics.checkNotNullParameter(recurringListItem, "");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) recurringBuyModifyInvestmentViewModel.KWHzl((TickersData) next), (Object) recurringListItem.getCcy())) {
                break;
            }
        }
        TickersData tickersData = (TickersData) next;
        String instId = tickersData != null ? tickersData.getInstId() : null;
        String str = instId == null ? "" : instId;
        String last = tickersData != null ? tickersData.getLast() : null;
        String botPrice$default = C56033xvF.getBotPrice$default("SPOT", str, last == null ? "" : last, false, false, null, null, 120, null);
        return recurringListItem.getCcy() + " " + botPrice$default;
    }

    public final List<CoinPriceItem> copydefault(List<TickersData> list) {
        ArrayList<RecurringListItem> recItemList;
        Object next;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        if (tacticsDataAwvSrB == null || (recItemList = tacticsDataAwvSrB.getRecItemList()) == null) {
            return yDY.AhwBna();
        }
        if (recItemList.isEmpty() || list.isEmpty()) {
            return yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(recItemList, 10));
        for (RecurringListItem recurringListItem : recItemList) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) KWHzl((TickersData) next), (Object) recurringListItem.getCcy())) {
                    break;
                }
            }
            TickersData tickersData = (TickersData) next;
            String instId = tickersData != null ? tickersData.getInstId() : null;
            String str = "";
            String str2 = instId == null ? "" : instId;
            String last = tickersData != null ? tickersData.getLast() : null;
            String botPrice$default = C56033xvF.getBotPrice$default("SPOT", str2, last == null ? "" : last, false, false, null, null, 120, null);
            String ccy = recurringListItem.getCcy();
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(recurringListItem.getCcy()) : null;
            if (strValueOf != null) {
                str = strValueOf;
            }
            arrayList.add(new CoinPriceItem(ccy, str, botPrice$default));
        }
        return arrayList;
    }

    public final String EZpvd(String str, String str2) {
        C54571xNh c54571xNhEZpvd;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C55887xsS c55887xsSZsXlph = zsXlph();
        String safeString$default = null;
        if (c55887xsSZsXlph != null && (c54571xNhEZpvd = c55887xsSZsXlph.EZpvd(str, true, str2)) != null && (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        return safeString$default == null ? "" : safeString$default;
    }

    public final InputValidationError EZpvd(String str, String str2, String str3) {
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return null;
        }
        if (str2 == null) {
            str2 = "0";
        }
        if (!C33129mqd.copydefault(str, str2)) {
            return InputValidationError.BELOW_MINIMUM;
        }
        if (fIwbmz() == Mode.INVEST_MORE && (!StringsKt__StringsKt.fARcdN((CharSequence) str3)) && C33129mqd.AEQbTJ(str, str3)) {
            return InputValidationError.EXCEEDS_AVAILABLE;
        }
        return null;
    }

    public final boolean KWHzl(String str, String str2, String str3) {
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return false;
        }
        if (str2 == null) {
            str2 = "0";
        }
        if (!C33129mqd.copydefault(str, str2)) {
            return false;
        }
        int i = TaskDescription.KWHzl[fIwbmz().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if ((!StringsKt__StringsKt.fARcdN((CharSequence) str3)) && C33129mqd.AEQbTJ(str, str3)) {
                return false;
            }
        } else if (Intrinsics.EZpvd((Object) str, (Object) valueOf())) {
            return false;
        }
        return true;
    }

    public final String KWHzl(TickersData tickersData) {
        BizInstrument suggestedInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SPOT", tickersData.getInstId(), null, null, 12, null)) == null) {
            return null;
        }
        return suggestedInstrument$default.getTradeSymbol();
    }

    public final boolean getNewProxyInstance() {
        ArrayList<RecurringListItem> recItemList;
        TacticsData tacticsDataAwvSrB = AwvSrB();
        if (tacticsDataAwvSrB != null && (recItemList = tacticsDataAwvSrB.getRecItemList()) != null) {
            List<TickersData> value = this.valueOf.getValue();
            if (!recItemList.isEmpty() && !value.isEmpty() && !recItemList.isEmpty()) {
                Iterator<T> it = recItemList.iterator();
                while (it.hasNext()) {
                    if (EZpvd((RecurringListItem) it.next(), value)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean EZpvd(RecurringListItem recurringListItem, List<TickersData> list) {
        Object next;
        String minPrice = recurringListItem.getMinPrice();
        String maxPrice = recurringListItem.getMaxPrice();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) KWHzl((TickersData) next), (Object) recurringListItem.getCcy())) {
                break;
            }
        }
        TickersData tickersData = (TickersData) next;
        String last = tickersData != null ? tickersData.getLast() : null;
        if (last == null || StringsKt__StringsKt.fARcdN((CharSequence) last)) {
            return false;
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(last);
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) minPrice)) && C33129mqd.gEmmrt(bigDecimalEZpvd, C33129mqd.EZpvd(minPrice).toString())) {
            return true;
        }
        return (StringsKt__StringsKt.fARcdN((CharSequence) maxPrice) ^ true) && C33129mqd.AEQbTJ(bigDecimalEZpvd, C33129mqd.EZpvd(maxPrice).toString());
    }
}
