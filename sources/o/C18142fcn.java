package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.NftCollection;
import com.okinc.business.defi.wallet.home.nfttopcollections.NftTopCollectionsViewModel$fetchNftTopCollectionList$1;
import com.okinc.business.defi.wallet.home.nfttopcollections.NftTopCollectionsViewModel$queryNftTopProjects$1;
import com.okinc.business.defi.wallet.home.nfttopcollections.NftTopCollectionsViewModel$special$$inlined$map$1$2$1;
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
import o.InterfaceC18139fck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18142fcn extends ViewModel {
    public final StateFlow<java.util.List<InterfaceC18139fck>> EZpvd;
    public final MutableStateFlow<InterfaceC13827dZt<java.util.List<NftCollection>>> OLrzqt;
    public final C18192fdk copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<InterfaceC18139fck>> KWHzl() {
        return this.EZpvd;
    }

    public C18142fcn(@NotNull C18192fdk c18192fdk) {
        Intrinsics.checkNotNullParameter(c18192fdk, "");
        this.copydefault = c18192fdk;
        DefaultConstructorMarker defaultConstructorMarker = null;
        MutableStateFlow<InterfaceC13827dZt<java.util.List<NftCollection>>> MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC13827dZt.StateListAnimator(defaultConstructorMarker, 1, defaultConstructorMarker));
        this.OLrzqt = MutableStateFlow;
        TaskDescription taskDescription = new TaskDescription(MutableStateFlow);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted sharingStartedWhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null);
        InterfaceC18139fck.ActionBar actionBar = InterfaceC18139fck.ActionBar.AEQbTJ;
        this.EZpvd = FlowKt.stateIn(taskDescription, viewModelScope, sharingStartedWhileSubscribed$default, yDY.gEmmrt(actionBar, actionBar));
    }

    public final void EZpvd() {
        this.copydefault.copydefault(ViewModelKt.getViewModelScope(this));
        OLrzqt(true);
    }

    public static /* synthetic */ void fetchNftTopCollectionList$default(C18142fcn c18142fcn, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c18142fcn.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NftTopCollectionsViewModel$fetchNftTopCollectionList$1(z, this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.fcn$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends InterfaceC18139fck>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.fcn$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
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
                NftTopCollectionsViewModel$special$$inlined$map$1$2$1 nftTopCollectionsViewModel$special$$inlined$map$1$2$1;
                java.util.Collection collectionEZpvd;
                if (continuation instanceof NftTopCollectionsViewModel$special$$inlined$map$1$2$1) {
                    nftTopCollectionsViewModel$special$$inlined$map$1$2$1 = (NftTopCollectionsViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = nftTopCollectionsViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nftTopCollectionsViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        nftTopCollectionsViewModel$special$$inlined$map$1$2$1 = new NftTopCollectionsViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = nftTopCollectionsViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = nftTopCollectionsViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    InterfaceC13827dZt interfaceC13827dZt = (InterfaceC13827dZt) obj;
                    if (interfaceC13827dZt instanceof InterfaceC13827dZt.ActionBar) {
                        java.lang.Iterable iterable = (java.lang.Iterable) ((InterfaceC13827dZt.ActionBar) interfaceC13827dZt).copydefault();
                        collectionEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                        java.util.Iterator<T> it = iterable.iterator();
                        while (it.hasNext()) {
                            collectionEZpvd.add(new InterfaceC18139fck.StateListAnimator((NftCollection) it.next()));
                        }
                    } else if (interfaceC13827dZt instanceof InterfaceC13827dZt.StateListAnimator) {
                        InterfaceC18139fck.ActionBar actionBar = InterfaceC18139fck.ActionBar.AEQbTJ;
                        collectionEZpvd = yDY.gEmmrt(actionBar, actionBar);
                    } else {
                        if (!(interfaceC13827dZt instanceof InterfaceC13827dZt.Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        java.util.List list = (java.util.List) ((InterfaceC13827dZt.Application) interfaceC13827dZt).copydefault();
                        if (list == null) {
                            collectionEZpvd = C56402yEa.EZpvd(InterfaceC18139fck.TaskDescription.EZpvd);
                        } else {
                            collectionEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                            java.util.Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                collectionEZpvd.add(new InterfaceC18139fck.StateListAnimator((NftCollection) it2.next()));
                            }
                        }
                    }
                    nftTopCollectionsViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(collectionEZpvd, nftTopCollectionsViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC18139fck>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super java.util.List<NftCollection>> continuation) throws java.lang.Throwable {
        NftTopCollectionsViewModel$queryNftTopProjects$1 nftTopCollectionsViewModel$queryNftTopProjects$1;
        if (continuation instanceof NftTopCollectionsViewModel$queryNftTopProjects$1) {
            nftTopCollectionsViewModel$queryNftTopProjects$1 = (NftTopCollectionsViewModel$queryNftTopProjects$1) continuation;
            int i = nftTopCollectionsViewModel$queryNftTopProjects$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nftTopCollectionsViewModel$queryNftTopProjects$1.label = i - Integer.MIN_VALUE;
            } else {
                nftTopCollectionsViewModel$queryNftTopProjects$1 = new NftTopCollectionsViewModel$queryNftTopProjects$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = nftTopCollectionsViewModel$queryNftTopProjects$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = nftTopCollectionsViewModel$queryNftTopProjects$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                C18192fdk c18192fdk = this.copydefault;
                nftTopCollectionsViewModel$queryNftTopProjects$1.label = 1;
                objCopydefault = c18192fdk.copydefault(nftTopCollectionsViewModel$queryNftTopProjects$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return (java.util.List) ((AbstractC43419rot) objCopydefault).AEQbTJ();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
