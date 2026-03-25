package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.RecommendedInvestment;
import com.okinc.business.defi.wallet.home.hotyield.HotYieldViewModel$fetchHotYieldList$1;
import com.okinc.business.defi.wallet.home.hotyield.HotYieldViewModel$queryYieldRecommendedList$1;
import com.okinc.business.defi.wallet.home.hotyield.HotYieldViewModel$special$$inlined$map$1$2$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC13827dZt;
import o.InterfaceC18092fbq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18093fbr extends ViewModel {
    public final C18192fdk AEQbTJ;
    public final StateFlow<java.util.List<InterfaceC18092fbq>> OLrzqt;
    public final MutableStateFlow<InterfaceC13827dZt<java.util.List<RecommendedInvestment>>> copydefault;

    public C18093fbr(@NotNull C18192fdk c18192fdk) {
        Intrinsics.checkNotNullParameter(c18192fdk, "");
        this.AEQbTJ = c18192fdk;
        DefaultConstructorMarker defaultConstructorMarker = null;
        MutableStateFlow<InterfaceC13827dZt<java.util.List<RecommendedInvestment>>> MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC13827dZt.StateListAnimator(defaultConstructorMarker, 1, defaultConstructorMarker));
        this.copydefault = MutableStateFlow;
        Activity activity = new Activity(MutableStateFlow);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted sharingStartedWhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null);
        InterfaceC18092fbq.Application application = InterfaceC18092fbq.Application.KWHzl;
        this.OLrzqt = FlowKt.stateIn(activity, viewModelScope, sharingStartedWhileSubscribed$default, yDY.gEmmrt(application, application));
    }

    public static /* synthetic */ void fetchHotYieldList$default(C18093fbr c18093fbr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c18093fbr.copydefault(z);
    }

    public final void copydefault(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HotYieldViewModel$fetchHotYieldList$1(z, this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.fbr$Activity */
    public static final class Activity implements Flow<java.util.List<? extends InterfaceC18092fbq>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.fbr$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HotYieldViewModel$special$$inlined$map$1$2$1 hotYieldViewModel$special$$inlined$map$1$2$1;
                java.util.Collection collectionEZpvd;
                if (continuation instanceof HotYieldViewModel$special$$inlined$map$1$2$1) {
                    hotYieldViewModel$special$$inlined$map$1$2$1 = (HotYieldViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = hotYieldViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hotYieldViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        hotYieldViewModel$special$$inlined$map$1$2$1 = new HotYieldViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = hotYieldViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = hotYieldViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    InterfaceC13827dZt interfaceC13827dZt = (InterfaceC13827dZt) obj;
                    if (interfaceC13827dZt instanceof InterfaceC13827dZt.ActionBar) {
                        java.lang.Iterable iterable = (java.lang.Iterable) ((InterfaceC13827dZt.ActionBar) interfaceC13827dZt).copydefault();
                        collectionEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                        java.util.Iterator<T> it = iterable.iterator();
                        while (it.hasNext()) {
                            collectionEZpvd.add(new InterfaceC18092fbq.TaskDescription((RecommendedInvestment) it.next()));
                        }
                    } else if (interfaceC13827dZt instanceof InterfaceC13827dZt.StateListAnimator) {
                        InterfaceC18092fbq.Application application = InterfaceC18092fbq.Application.KWHzl;
                        collectionEZpvd = yDY.gEmmrt(application, application);
                    } else {
                        if (!(interfaceC13827dZt instanceof InterfaceC13827dZt.Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        java.util.List list = (java.util.List) ((InterfaceC13827dZt.Application) interfaceC13827dZt).copydefault();
                        if (list == null) {
                            collectionEZpvd = C56402yEa.EZpvd(InterfaceC18092fbq.ActionBar.EZpvd);
                        } else {
                            collectionEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                            java.util.Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                collectionEZpvd.add(new InterfaceC18092fbq.TaskDescription((RecommendedInvestment) it2.next()));
                            }
                        }
                    }
                    hotYieldViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(collectionEZpvd, hotYieldViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC18092fbq>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Continuation<? super java.util.List<RecommendedInvestment>> continuation) throws java.lang.Throwable {
        HotYieldViewModel$queryYieldRecommendedList$1 hotYieldViewModel$queryYieldRecommendedList$1;
        if (continuation instanceof HotYieldViewModel$queryYieldRecommendedList$1) {
            hotYieldViewModel$queryYieldRecommendedList$1 = (HotYieldViewModel$queryYieldRecommendedList$1) continuation;
            int i = hotYieldViewModel$queryYieldRecommendedList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hotYieldViewModel$queryYieldRecommendedList$1.label = i - Integer.MIN_VALUE;
            } else {
                hotYieldViewModel$queryYieldRecommendedList$1 = new HotYieldViewModel$queryYieldRecommendedList$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = hotYieldViewModel$queryYieldRecommendedList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = hotYieldViewModel$queryYieldRecommendedList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                C18192fdk c18192fdk = this.AEQbTJ;
                hotYieldViewModel$queryYieldRecommendedList$1.label = 1;
                objAEQbTJ = c18192fdk.AEQbTJ(hotYieldViewModel$queryYieldRecommendedList$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return (java.util.List) ((AbstractC43419rot) objAEQbTJ).AEQbTJ();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
