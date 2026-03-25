package o;

import com.okinc.im.bean.ContactType;
import com.okinc.im.usecase.relationlist.ObserveFriendListUseCase$execute$$inlined$map$1$2$1;
import com.okinc.im.usecase.relationlist.ObserveFriendListUseCase$execute$$inlined$map$2$2$1;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35869oGs {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC44177sGd AEQbTJ;

    @yCM
    public C35869oGs(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.AEQbTJ = interfaceC44177sGd;
    }

    /* JADX INFO: renamed from: o.oGs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final Flow<java.util.List<RelationInfo>> AEQbTJ(@NotNull ContactType contactType) {
        Intrinsics.checkNotNullParameter(contactType, "");
        pUU.KWHzl("ObserveFriendListUseCase", "Observe friend list with contactType:" + contactType);
        return new Application(new Activity(this.AEQbTJ.OLrzqt(), contactType));
    }

    /* JADX INFO: renamed from: o.oGs$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity implements Flow<java.util.List<? extends RelationInfo>> {
        public final /* synthetic */ ContactType AEQbTJ;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.oGs$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ ContactType KWHzl;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, ContactType contactType) {
                this.OLrzqt = flowCollector;
                this.KWHzl = contactType;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveFriendListUseCase$execute$$inlined$map$1$2$1 observeFriendListUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof ObserveFriendListUseCase$execute$$inlined$map$1$2$1) {
                    observeFriendListUseCase$execute$$inlined$map$1$2$1 = (ObserveFriendListUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeFriendListUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeFriendListUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeFriendListUseCase$execute$$inlined$map$1$2$1 = new ObserveFriendListUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeFriendListUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeFriendListUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.util.List list = (java.util.List) obj;
                    pUU.KWHzl("ObserveFriendListUseCase", "Initial relation size:" + list.size());
                    java.util.List listFilterRelationList$default = C35667nzg.filterRelationList$default(C35667nzg.EZpvd, list, this.KWHzl, false, null, 6, null);
                    observeFriendListUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listFilterRelationList$default, observeFriendListUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow, ContactType contactType) {
            this.copydefault = flow;
            this.AEQbTJ = contactType;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends RelationInfo>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.oGs$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements Flow<java.util.List<? extends RelationInfo>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.oGs$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveFriendListUseCase$execute$$inlined$map$2$2$1 observeFriendListUseCase$execute$$inlined$map$2$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof ObserveFriendListUseCase$execute$$inlined$map$2$2$1) {
                    observeFriendListUseCase$execute$$inlined$map$2$2$1 = (ObserveFriendListUseCase$execute$$inlined$map$2$2$1) continuation;
                    int i = observeFriendListUseCase$execute$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeFriendListUseCase$execute$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeFriendListUseCase$execute$$inlined$map$2$2$1 = new ObserveFriendListUseCase$execute$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeFriendListUseCase$execute$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeFriendListUseCase$execute$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.OLrzqt;
                    java.util.List<RelationInfo> list = (java.util.List) obj;
                    pUU.KWHzl("ObserveFriendListUseCase", "Filtered list size:" + list.size());
                    C35551nxW c35551nxW = C35551nxW.copydefault;
                    observeFriendListUseCase$execute$$inlined$map$2$2$1.L$0 = flowCollector2;
                    observeFriendListUseCase$execute$$inlined$map$2$2$1.label = 1;
                    java.lang.Object objEZpvd = c35551nxW.EZpvd(list, observeFriendListUseCase$execute$$inlined$map$2$2$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objEZpvd;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) observeFriendListUseCase$execute$$inlined$map$2$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                observeFriendListUseCase$execute$$inlined$map$2$2$1.L$0 = null;
                observeFriendListUseCase$execute$$inlined$map$2$2$1.label = 2;
                if (flowCollector.emit(obj2, observeFriendListUseCase$execute$$inlined$map$2$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends RelationInfo>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
