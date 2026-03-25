package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.Article;
import com.okinc.business.defi.wallet.home.cryptoreads.CryptoReadsViewModel$fetchArticleList$1;
import com.okinc.business.defi.wallet.home.cryptoreads.CryptoReadsViewModel$special$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC18036fan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fam, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18035fam extends ViewModel {
    public final StateFlow<java.util.List<InterfaceC18036fan>> EZpvd;
    public final C18192fdk OLrzqt;
    public final MutableStateFlow<ActionBar> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<InterfaceC18036fan>> KWHzl() {
        return this.EZpvd;
    }

    public C18035fam(@NotNull C18192fdk c18192fdk) {
        Intrinsics.checkNotNullParameter(c18192fdk, "");
        this.OLrzqt = c18192fdk;
        ActionBar.C0847ActionBar c0847ActionBar = ActionBar.C0847ActionBar.EZpvd;
        MutableStateFlow<ActionBar> MutableStateFlow = StateFlowKt.MutableStateFlow(c0847ActionBar);
        this.copydefault = MutableStateFlow;
        this.EZpvd = FlowKt.stateIn(new StateListAnimator(MutableStateFlow), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null), c0847ActionBar.OLrzqt());
    }

    /* JADX INFO: renamed from: o.fam$ActionBar */
    public interface ActionBar {
        java.util.List<InterfaceC18036fan> OLrzqt();

        /* JADX INFO: renamed from: o.fam$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0847ActionBar implements ActionBar {
            public static final C0847ActionBar EZpvd = new C0847ActionBar();
            public static final java.util.List<InterfaceC18036fan.ActionBar> copydefault = yDY.gEmmrt(new InterfaceC18036fan.ActionBar(true), new InterfaceC18036fan.ActionBar(true));
            public static final int KWHzl = 8;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C18035fam.ActionBar
            public java.util.List<InterfaceC18036fan.ActionBar> OLrzqt() {
                return copydefault;
            }

            private C0847ActionBar() {
            }
        }

        /* JADX INFO: renamed from: o.fam$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements ActionBar {
            public static final StateListAnimator OLrzqt = new StateListAnimator();
            public static final java.util.List<InterfaceC18036fan.ActionBar> KWHzl = yDY.gEmmrt(new InterfaceC18036fan.ActionBar(false), new InterfaceC18036fan.ActionBar(false));
            public static final int AEQbTJ = 8;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C18035fam.ActionBar
            public java.util.List<InterfaceC18036fan.ActionBar> OLrzqt() {
                return KWHzl;
            }

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.fam$ActionBar$Activity */
        public static final class Activity implements ActionBar {
            public final java.util.List<InterfaceC18036fan.TaskDescription> AEQbTJ;
            public final java.util.List<Article> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fam$ActionBar$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = activity.copydefault;
                }
                return activity.OLrzqt(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C18035fam.ActionBar
            public java.util.List<InterfaceC18036fan.TaskDescription> OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(@NotNull java.util.List<Article> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Activity(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.copydefault, ((Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(articles=" + this.copydefault + ")";
            }

            public Activity(@NotNull java.util.List<Article> list) {
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InterfaceC18036fan.TaskDescription((Article) it.next()));
                }
                this.AEQbTJ = arrayList;
            }
        }
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CryptoReadsViewModel$fetchArticleList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.fam$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.List<? extends InterfaceC18036fan>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.fam$StateListAnimator$2, reason: invalid class name */
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
                CryptoReadsViewModel$special$$inlined$map$1$2$1 cryptoReadsViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof CryptoReadsViewModel$special$$inlined$map$1$2$1) {
                    cryptoReadsViewModel$special$$inlined$map$1$2$1 = (CryptoReadsViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = cryptoReadsViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cryptoReadsViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        cryptoReadsViewModel$special$$inlined$map$1$2$1 = new CryptoReadsViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = cryptoReadsViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = cryptoReadsViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List<InterfaceC18036fan> listOLrzqt = ((ActionBar) obj).OLrzqt();
                    cryptoReadsViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listOLrzqt, cryptoReadsViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends InterfaceC18036fan>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
