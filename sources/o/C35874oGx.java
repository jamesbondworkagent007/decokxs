package o;

import com.okinc.im.bean.IMRelationInfo;
import com.okinc.im.usecase.relationlist.ObserveIMRelationListUseCase$execute$$inlined$map$1$2$1;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: o.oGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35874oGx {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC44177sGd AEQbTJ;

    /* JADX INFO: renamed from: o.oGx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.oGx$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.List<? extends IMRelationInfo>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.oGx$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveIMRelationListUseCase$execute$$inlined$map$1$2$1 observeIMRelationListUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof ObserveIMRelationListUseCase$execute$$inlined$map$1$2$1) {
                    observeIMRelationListUseCase$execute$$inlined$map$1$2$1 = (ObserveIMRelationListUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeIMRelationListUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeIMRelationListUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeIMRelationListUseCase$execute$$inlined$map$1$2$1 = new ObserveIMRelationListUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeIMRelationListUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeIMRelationListUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.List list = (java.util.List) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C35667nzg.toIMRelationInfo$default(C35667nzg.EZpvd, (RelationInfo) it.next(), null, 1, null));
                    }
                    observeIMRelationListUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, observeIMRelationListUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends IMRelationInfo>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
