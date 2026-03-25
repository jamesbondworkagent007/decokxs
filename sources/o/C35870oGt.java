package o;

import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.usecase.relationlist.ObserveRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.sKN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35870oGt {
    public final sKN OLrzqt;

    /* JADX INFO: renamed from: o.oGt$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChatOrigin.values().length];
            try {
                iArr[ChatOrigin.P2P.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    @yCM
    public C35870oGt(@NotNull sKN skn) {
        Intrinsics.checkNotNullParameter(skn, "");
        this.OLrzqt = skn;
    }

    public final Flow<java.util.List<C37246oqH>> KWHzl(ChatOrigin chatOrigin, int i) {
        if (chatOrigin != null && TaskDescription.AEQbTJ[chatOrigin.ordinal()] == 1) {
            return FlowKt.flowOf(yDY.AhwBna());
        }
        return new StateListAnimator(sKN.ActionBar.getRandomPhoneRelationGroupsNoOkxRelationAsFlow$default(this.OLrzqt, i, false, 2, null));
    }

    /* JADX INFO: renamed from: o.oGt$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator implements Flow<java.util.List<? extends C37246oqH>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.oGt$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1 observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof ObserveRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1) {
                    observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1 = (ObserveRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1 = new ObserveRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.KWHzl;
                    java.util.List<PhoneRelationGroup> list = (java.util.List) obj;
                    C35551nxW c35551nxW = C35551nxW.copydefault;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (PhoneRelationGroup phoneRelationGroup : list) {
                        arrayList.add(new C37246oqH(phoneRelationGroup.getContactId(), phoneRelationGroup.getDisplayName(), phoneRelationGroup.getLocalRelationList()));
                    }
                    observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1.L$0 = flowCollector2;
                    observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objCopydefault2 = c35551nxW.copydefault(arrayList, observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objCopydefault2;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1.L$0 = null;
                observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, observeRandomSuggestedPhoneRelationsUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends C37246oqH>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
