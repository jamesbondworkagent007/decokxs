package com.okinc.tradingbot.impl.order.strategy.grid.dialog;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnProperties;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C48033uCm;
import o.C48338uNu;
import o.C50503vQv;
import o.C50546vSk;
import o.C52794wYp;
import o.C53418wlC;
import o.C53465wlx;
import o.C53573wnz;
import o.C54536xML;
import o.C55001xbh;
import o.C55018xby;
import o.C55276xgr;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.xMS;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartEarnAllocationBottomSheet$startCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C48338uNu $this_startCollection;
    int label;
    final /* synthetic */ SmartEarnAllocationBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartEarnAllocationBottomSheet$startCollection$1(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C48338uNu c48338uNu, Continuation<? super SmartEarnAllocationBottomSheet$startCollection$1> continuation) {
        super(2, continuation);
        this.this$0 = smartEarnAllocationBottomSheet;
        this.$this_startCollection = c48338uNu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartEarnAllocationBottomSheet$startCollection$1(this.this$0, this.$this_startCollection, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartEarnAllocationBottomSheet$startCollection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C48338uNu $this_startCollection;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SmartEarnAllocationBottomSheet this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C48338uNu c48338uNu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = smartEarnAllocationBottomSheet;
            this.$this_startCollection = c48338uNu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_startCollection, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C06481(this.this$0, this.$this_startCollection, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$this_startCollection, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, this.$this_startCollection, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.this$0, this.$this_startCollection, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this.this$0, this.$this_startCollection, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C48338uNu $this_startCollection;
            int label;
            final /* synthetic */ SmartEarnAllocationBottomSheet this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06481(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C48338uNu c48338uNu, Continuation<? super C06481> continuation) {
                super(2, continuation);
                this.this$0 = smartEarnAllocationBottomSheet;
                this.$this_startCollection = c48338uNu;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06481(this.this$0, this.$this_startCollection, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<C50503vQv.FragmentManager> stateFlowKWHzl = this.this$0.AYXKKw().KWHzl();
                    final SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet = this.this$0;
                    final C48338uNu c48338uNu = this.$this_startCollection;
                    FlowCollector<? super C50503vQv.FragmentManager> flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet.startCollection.1.1.1.2
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public final Object emit(C50503vQv.FragmentManager fragmentManager, Continuation<? super Unit> continuation) {
                            String str;
                            C54536xML c54536xMLAYXKKw;
                            C54536xML c54536xMLDjBIcL;
                            smartEarnAllocationBottomSheet.EZpvd(c48338uNu, fragmentManager.OLrzqt());
                            xMS xmsDbNXlk = smartEarnAllocationBottomSheet.DbNXlk();
                            String safeString$default = null;
                            if (xmsDbNXlk != null && (c54536xMLAYXKKw = xmsDbNXlk.AYXKKw(fragmentManager.copydefault())) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null) {
                                safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
                            }
                            c48338uNu.valueOf.setActiveContent(C53418wlC.copydefault(safeString$default));
                            AppCompatTextView appCompatTextView = c48338uNu.AEQbTJ;
                            if (((CharSequence) fragmentManager.AEQbTJ().getEndInclusive()).length() == 0 || ((CharSequence) fragmentManager.AEQbTJ().getStart()).length() == 0) {
                                str = "--";
                            } else {
                                str = fragmentManager.AEQbTJ().getStart() + "-" + fragmentManager.AEQbTJ().getEndInclusive() + " " + smartEarnAllocationBottomSheet.AkhnZx();
                            }
                            appCompatTextView.setText(str);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C48338uNu $this_startCollection;
            int label;
            final /* synthetic */ SmartEarnAllocationBottomSheet this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C48338uNu c48338uNu, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = smartEarnAllocationBottomSheet;
                this.$this_startCollection = c48338uNu;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$this_startCollection, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.this$0.AYXKKw().EZpvd(), new Function1() { // from class: o.vQp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return java.lang.Long.valueOf(((C50503vQv.ActionBar) obj2).copydefault());
                        }
                    });
                    final SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet = this.this$0;
                    final C48338uNu c48338uNu = this.$this_startCollection;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet.startCollection.1.1.2.3

                        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1$1$2$3$ActionBar */
                        public final /* synthetic */ class ActionBar {
                            public static final /* synthetic */ int[] EZpvd;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            static {
                                int[] iArr = new int[EarnType.values().length];
                                try {
                                    iArr[EarnType.Ratio.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[EarnType.Absolute.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                EZpvd = iArr;
                            }
                        }

                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                        public final Object emit(C50503vQv.ActionBar actionBar, Continuation<? super Unit> continuation) {
                            C53573wnz c53573wnz;
                            int i2 = ActionBar.EZpvd[actionBar.KWHzl().ordinal()];
                            int iAhwBna = 2;
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    xMS xmsDbNXlk = smartEarnAllocationBottomSheet.DbNXlk();
                                    iAhwBna = C33129mqd.AhwBna(xmsDbNXlk != null ? xmsDbNXlk.AEQbTJ() : null);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            c48338uNu.AYXKKw.setMaxDecimal(iAhwBna);
                            c48338uNu.EZpvd.setMaxDecimal(iAhwBna);
                            smartEarnAllocationBottomSheet.copydefault(c48338uNu, actionBar.OLrzqt(), actionBar.AEQbTJ());
                            C48338uNu c48338uNu2 = smartEarnAllocationBottomSheet.values;
                            if (c48338uNu2 != null && (c53573wnz = c48338uNu2.DbNXlk) != null && c53573wnz.copydefault() != actionBar.EZpvd()) {
                                c53573wnz.setSwitchChecked(actionBar.EZpvd());
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChangedBy.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C48338uNu $this_startCollection;
            int label;
            final /* synthetic */ SmartEarnAllocationBottomSheet this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C48338uNu c48338uNu, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = smartEarnAllocationBottomSheet;
                this.$this_startCollection = c48338uNu;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$this_startCollection, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.this$0.AYXKKw().KWHzl(), new Function1() { // from class: o.vQq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return ((C50503vQv.FragmentManager) obj2).OLrzqt();
                        }
                    });
                    final C48338uNu c48338uNu = this.$this_startCollection;
                    final SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet.startCollection.1.1.3.3

                        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1$1$3$3$Activity */
                        public final /* synthetic */ class Activity {
                            public static final /* synthetic */ int[] copydefault;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            static {
                                int[] iArr = new int[EarnType.values().length];
                                try {
                                    iArr[EarnType.Ratio.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[EarnType.Absolute.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                copydefault = iArr;
                            }
                        }

                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                        public final Object emit(C50503vQv.FragmentManager fragmentManager, Continuation<? super Unit> continuation) {
                            C55018xby c55018xby = c48338uNu.AhwBna;
                            c55018xby.setText(C33070mpX.AYXKKw(C53465wlx.copydefault(fragmentManager.OLrzqt())));
                            C55001xbh c55001xbhAkhnZx = c55018xby.AkhnZx();
                            if (c55001xbhAkhnZx != null) {
                                c55001xbhAkhnZx.setTextSize(14.0f);
                            }
                            EarnType[] earnTypeArrValues = EarnType.values();
                            ArrayList arrayList = new ArrayList(earnTypeArrValues.length);
                            int length = earnTypeArrValues.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                EarnType earnType = earnTypeArrValues[i2];
                                arrayList.add(new C55276xgr(C33070mpX.AYXKKw(C53465wlx.copydefault(earnType)), earnType, null, earnType == fragmentManager.OLrzqt(), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                            }
                            c55018xby.setItems(CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList));
                            int i3 = Activity.copydefault[fragmentManager.OLrzqt().ordinal()];
                            int iAhwBna = 2;
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    xMS xmsDbNXlk = smartEarnAllocationBottomSheet.DbNXlk();
                                    iAhwBna = C33129mqd.AhwBna(xmsDbNXlk != null ? xmsDbNXlk.AEQbTJ() : null);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            c48338uNu.AYXKKw.setMaxDecimal(iAhwBna);
                            c48338uNu.EZpvd.setMaxDecimal(iAhwBna);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChangedBy.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C48338uNu $this_startCollection;
            int label;
            final /* synthetic */ SmartEarnAllocationBottomSheet this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C48338uNu c48338uNu, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = smartEarnAllocationBottomSheet;
                this.$this_startCollection = c48338uNu;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$this_startCollection, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.this$0.AYXKKw().KWHzl(), new Function1() { // from class: o.vQr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return SmartEarnAllocationBottomSheet$startCollection$1.AnonymousClass1.AnonymousClass4.invokeSuspend$lambda$0((C50503vQv.FragmentManager) obj2);
                        }
                    });
                    final C48338uNu c48338uNu = this.$this_startCollection;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet.startCollection.1.1.4.2
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                        public final Object emit(C50503vQv.FragmentManager fragmentManager, Continuation<? super Unit> continuation) {
                            String strCopydefault;
                            C50503vQv.TaskDescription taskDescriptionKWHzl = fragmentManager.KWHzl();
                            C50546vSk c50546vSkEZpvd = taskDescriptionKWHzl.EZpvd();
                            String strCopydefault2 = null;
                            if (c50546vSkEZpvd != null && !c50546vSkEZpvd.copydefault()) {
                                strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.gLWkOL, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", fragmentManager.AhwBna().getStart())));
                            } else {
                                C50546vSk c50546vSkEZpvd2 = taskDescriptionKWHzl.EZpvd();
                                strCopydefault = (c50546vSkEZpvd2 == null || c50546vSkEZpvd2.EZpvd()) ? null : C33069mpW.copydefault(C48033uCm.Fragment.iRgjgR, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", fragmentManager.AhwBna().getEndInclusive())));
                            }
                            if (strCopydefault == null) {
                                c48338uNu.AYXKKw.copydefault();
                            } else {
                                c48338uNu.AYXKKw.setInputErrorMsg(strCopydefault);
                            }
                            C50546vSk c50546vSkKWHzl = taskDescriptionKWHzl.KWHzl();
                            if (c50546vSkKWHzl != null && !c50546vSkKWHzl.copydefault()) {
                                strCopydefault2 = C33069mpW.copydefault(C48033uCm.Fragment.gLWkOL, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", fragmentManager.AhwBna().getStart())));
                            } else {
                                C50546vSk c50546vSkKWHzl2 = taskDescriptionKWHzl.KWHzl();
                                if (c50546vSkKWHzl2 != null && !c50546vSkKWHzl2.EZpvd()) {
                                    strCopydefault2 = C33069mpW.copydefault(C48033uCm.Fragment.iRgjgR, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", fragmentManager.AhwBna().getEndInclusive())));
                                }
                            }
                            if (strCopydefault2 == null) {
                                c48338uNu.EZpvd.copydefault();
                            } else {
                                c48338uNu.EZpvd.setInputErrorMsg(strCopydefault2);
                            }
                            boolean z = !(taskDescriptionKWHzl.EZpvd() == null && taskDescriptionKWHzl.KWHzl() == null);
                            if (c48338uNu.OLrzqt.EZpvd() != z) {
                                c48338uNu.OLrzqt.setClear(z);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChangedBy.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Triple invokeSuspend$lambda$0(C50503vQv.FragmentManager fragmentManager) {
                return new Triple(fragmentManager.KWHzl(), fragmentManager.OLrzqt(), Boolean.valueOf(fragmentManager.gEmmrt()));
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C48338uNu $this_startCollection;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SmartEarnAllocationBottomSheet this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet, C48338uNu c48338uNu, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = smartEarnAllocationBottomSheet;
                this.$this_startCollection = c48338uNu;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$this_startCollection, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    StateFlow<C50503vQv.ActionBar> stateFlowEZpvd = this.this$0.AYXKKw().EZpvd();
                    final SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet = this.this$0;
                    final C48338uNu c48338uNu = this.$this_startCollection;
                    FlowCollector<? super C50503vQv.ActionBar> flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet.startCollection.1.1.5.4

                        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet$startCollection$1$1$5$4$ActionBar */
                        public final /* synthetic */ class ActionBar {
                            public static final /* synthetic */ int[] copydefault;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            static {
                                int[] iArr = new int[EarnType.values().length];
                                try {
                                    iArr[EarnType.Ratio.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[EarnType.Absolute.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                copydefault = iArr;
                            }
                        }

                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                        public final Object emit(C50503vQv.ActionBar actionBar, Continuation<? super Unit> continuation) {
                            Pair pairOLrzqt;
                            if (smartEarnAllocationBottomSheet.AhwBna()) {
                                SmartEarnProperties smartEarnPropertiesCopydefault = smartEarnAllocationBottomSheet.copydefault();
                                boolean z = true;
                                if (smartEarnPropertiesCopydefault == null) {
                                    C52794wYp c52794wYp = smartEarnAllocationBottomSheet.KWHzl;
                                    if (c52794wYp != null) {
                                        c52794wYp.setEnabled(true);
                                    }
                                    return Unit.INSTANCE;
                                }
                                EarnType earnType = smartEarnPropertiesCopydefault.getEarnType();
                                int i2 = earnType == null ? -1 : ActionBar.copydefault[earnType.ordinal()];
                                if (i2 == -1) {
                                    pairOLrzqt = C56390yDp.OLrzqt("", "");
                                } else if (i2 == 1) {
                                    String earnMinLimit = smartEarnPropertiesCopydefault.getEarnMinLimit();
                                    String strMulS$default = earnMinLimit != null ? C33129mqd.mulS$default(earnMinLimit, C56443yFo.AEQbTJ(100), null, null, null, 14, null) : null;
                                    String earnMaxLimit = smartEarnPropertiesCopydefault.getEarnMaxLimit();
                                    pairOLrzqt = C56390yDp.OLrzqt(strMulS$default, earnMaxLimit != null ? C33129mqd.mulS$default(earnMaxLimit, C56443yFo.AEQbTJ(100), null, null, null, 14, null) : null);
                                } else {
                                    if (i2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    pairOLrzqt = C56390yDp.OLrzqt(smartEarnPropertiesCopydefault.getEarnMinLimit(), smartEarnPropertiesCopydefault.getEarnMaxLimit());
                                }
                                String str = (String) pairOLrzqt.component1();
                                String str2 = (String) pairOLrzqt.component2();
                                if (Intrinsics.EZpvd((Object) c48338uNu.AYXKKw.AkhnZx(), (Object) str) && Intrinsics.EZpvd((Object) c48338uNu.EZpvd.AkhnZx(), (Object) str2) && actionBar.EZpvd() == smartEarnPropertiesCopydefault.getEnabled() && actionBar.KWHzl() == smartEarnPropertiesCopydefault.getEarnType()) {
                                    z = false;
                                }
                                C52794wYp c52794wYp2 = smartEarnAllocationBottomSheet.KWHzl;
                                if (c52794wYp2 != null) {
                                    c52794wYp2.setEnabled(z);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SmartEarnAllocationBottomSheet smartEarnAllocationBottomSheet = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(smartEarnAllocationBottomSheet, this.$this_startCollection, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(smartEarnAllocationBottomSheet, state, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
