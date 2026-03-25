package o;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.okimcore.usecase.phonerelations.GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1;
import com.okinc.okimcore.usecase.phonerelations.GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1;
import com.okinc.okimcore.usecase.phonerelations.GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1;
import com.okinc.okimcore.usecase.phonerelations.GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1;
import com.okinc.okimcore.usecase.phonerelations.GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44517sSt {
    public final C44358sMw OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C44517sSt(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.OLrzqt = c44358sMw;
    }

    public final Flow<java.util.List<PhoneRelationGroup>> KWHzl(int i, boolean z) {
        return new Application(FlowKt.flatMapConcat(new Activity(new ActionBar(FlowKt.distinctUntilChanged(new TaskDescription(this.OLrzqt.getRandomPhoneRelationsNoOkxRelationAsFlow(1))), z, this, i)), new GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$4(this, null)));
    }

    /* JADX INFO: renamed from: o.sSt$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final boolean KWHzl() {
        java.lang.Long lOLrzqt = sGG.copydefault.OLrzqt();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z = lOLrzqt == null || lOLrzqt.longValue() + sEJ.KWHzl.EZpvd() < jCurrentTimeMillis;
        pUU.KWHzl("GetRandomPhoneRelationGroupNoOkxRelation", "isCacheExpired => result:" + z + ", lastCacheTimeStamp:" + lOLrzqt + ", currentTimeStamp:" + jCurrentTimeMillis);
        return z;
    }

    /* JADX INFO: renamed from: o.sSt$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar implements Flow<java.util.List<? extends PhoneRelationEntity>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ C44517sSt copydefault;

        public ActionBar(Flow flow, boolean z, C44517sSt c44517sSt, int i) {
            this.AEQbTJ = flow;
            this.OLrzqt = z;
            this.copydefault = c44517sSt;
            this.KWHzl = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends PhoneRelationEntity>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.OLrzqt, this.copydefault, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sSt$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ boolean AEQbTJ;
            public final /* synthetic */ int EZpvd;
            public final /* synthetic */ C44517sSt KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, boolean z, C44517sSt c44517sSt, int i) {
                this.copydefault = flowCollector;
                this.AEQbTJ = z;
                this.KWHzl = c44517sSt;
                this.EZpvd = i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00dd A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Exception {
                GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1 getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1;
                FlowCollector flowCollector;
                java.util.List<PhoneRelationEntity> listAhwBna;
                FlowCollector flowCollector2;
                if (continuation instanceof GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1) {
                    getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1 = (GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1) continuation;
                    int i = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1 = new GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = this.copydefault;
                    boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                    pUU.KWHzl("GetRandomPhoneRelationGroupNoOkxRelation", "isNotEmpty:" + zBooleanValue + ", cacheFirst:" + this.AEQbTJ);
                    if (zBooleanValue) {
                        if (this.KWHzl.KWHzl()) {
                            pUU.KWHzl("GetRandomPhoneRelationGroupNoOkxRelation", "cache expired");
                            sGG.copydefault.copydefault((java.util.List<PhoneRelationEntity>) null);
                        }
                        if (this.AEQbTJ) {
                            sGG sgg = sGG.copydefault;
                            if (C33129mqd.KWHzl((java.util.Collection) sgg.EZpvd())) {
                                pUU.KWHzl("GetRandomPhoneRelationGroupNoOkxRelation", "use cached random phone suggested list");
                                listAhwBna = sgg.EZpvd();
                                if (listAhwBna == null) {
                                    listAhwBna = yDY.AhwBna();
                                }
                            }
                        }
                        pUU.KWHzl("GetRandomPhoneRelationGroupNoOkxRelation", "get new random list");
                        C44358sMw c44358sMw = this.KWHzl.OLrzqt;
                        int i3 = this.EZpvd;
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.L$0 = flowCollector;
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.label = 1;
                        java.lang.Object randomPhoneRelationsNoOkxRelation = c44358sMw.getRandomPhoneRelationsNoOkxRelation(i3, getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1);
                        if (randomPhoneRelationsNoOkxRelation == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = randomPhoneRelationsNoOkxRelation;
                        flowCollector2 = flowCollector;
                    } else {
                        listAhwBna = yDY.AhwBna();
                    }
                    getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.L$0 = null;
                    getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.label = 2;
                    if (flowCollector.emit(listAhwBna, getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                    return Unit.INSTANCE;
                }
                flowCollector2 = (FlowCollector) getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                java.util.List<PhoneRelationEntity> list = (java.util.List) obj2;
                sGG sgg2 = sGG.copydefault;
                sgg2.copydefault(list);
                sgg2.OLrzqt(C56443yFo.KWHzl(java.lang.System.currentTimeMillis()));
                flowCollector = flowCollector2;
                listAhwBna = list;
                getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.L$0 = null;
                getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1.label = 2;
                if (flowCollector.emit(listAhwBna, getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$2$2$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: o.sSt$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity implements Flow<java.util.Set<? extends java.lang.String>> {
        public final /* synthetic */ Flow EZpvd;

        public Activity(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.Set<? extends java.lang.String>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sSt$Activity$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1 getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1;
                if (continuation instanceof GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1) {
                    getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1 = (GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1) continuation;
                    int i = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1 = new GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.List list = (java.util.List) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PhoneRelationEntity) it.next()).getHash());
                    }
                    java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                    getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(setOqFWZa, getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$3$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: o.sSt$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application implements Flow<java.util.List<? extends PhoneRelationGroup>> {
        public final /* synthetic */ Flow copydefault;

        public Application(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends PhoneRelationGroup>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sSt$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1 getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1;
                if (continuation instanceof GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1) {
                    getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1 = (GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1) continuation;
                    int i = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1 = new GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.List<PhoneRelationGroup> listCopydefault = C44523sSz.copydefault((java.util.List) obj);
                    getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1.label = 1;
                    if (flowCollector.emit(listCopydefault, getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$4$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: o.sSt$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow OLrzqt;

        public TaskDescription(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.lang.Boolean> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sSt$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1 getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1) {
                    getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1 = (GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1 = new GetRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List list = (java.util.List) obj;
                    pUU.KWHzl("GetRandomPhoneRelationGroupNoOkxRelation", "filter: " + list.size());
                    java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(list.isEmpty() ^ true);
                    getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, getRandomPhoneRelationGroupNoOkxRelationFlowUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }
}
