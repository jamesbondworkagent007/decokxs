package com.okinc.okex.center.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.viewmodel.SupportRecommendTopicViewModel;
import com.okinc.okex.rating.net.RatingResult;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C32942mnB;
import o.C44711scA;
import o.C45398soz;
import o.sxK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportRecommendTopicViewModel extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final MutableLiveData<String> AEQbTJ;
    public final MutableLiveData<RatingResult> EZpvd;
    public final MutableStateFlow<StateListAnimator> KWHzl;
    public final MutableLiveData<Boolean> copydefault;
    public final StateFlow<StateListAnimator> djBIcL;
    public final LiveData<Boolean> gEmmrt;
    public final C45398soz valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<RatingResult> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<RatingResult> copydefault() {
        return this.EZpvd;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportRecommendTopicViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @yCM
    public SupportRecommendTopicViewModel(@NotNull C45398soz c45398soz) {
        Intrinsics.checkNotNullParameter(c45398soz, "");
        this.valueOf = c45398soz;
        MutableStateFlow<StateListAnimator> MutableStateFlow = StateFlowKt.MutableStateFlow(StateListAnimator.Activity.KWHzl);
        this.KWHzl = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.copydefault = mutableLiveData;
        this.AEQbTJ = new MutableLiveData<>();
        MutableLiveData<RatingResult> mutableLiveData2 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData2;
        this.gEmmrt = Transformations.map(C32942mnB.OLrzqt(mutableLiveData2, mutableLiveData), new Function1() { // from class: o.sll
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SupportRecommendTopicViewModel.copydefault((kotlin.Pair) obj));
            }
        });
    }

    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportRecommendTopicViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends StateListAnimator {
            public static final Activity KWHzl = new Activity();

            private Activity() {
                super(null);
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application extends StateListAnimator {
            public final List<TopicListItem> AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.viewmodel.SupportRecommendTopicViewModel$StateListAnimator$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = application.AEQbTJ;
                }
                return application.copydefault(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<TopicListItem> OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull List<? extends TopicListItem> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Application(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(data=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.okex.center.bean.TopicListItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Application(@NotNull List<? extends TopicListItem> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar extends StateListAnimator {
            public static final ActionBar AEQbTJ = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.okex.center.viewmodel.SupportRecommendTopicViewModel$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0543StateListAnimator extends StateListAnimator {
            public static final C0543StateListAnimator OLrzqt = new C0543StateListAnimator();

            private C0543StateListAnimator() {
                super(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean copydefault(Pair pair) {
        return Intrinsics.EZpvd((Boolean) pair.component2(), Boolean.FALSE) && sxK.copydefault.OLrzqt((RatingResult) pair.component1());
    }

    public final void KWHzl() {
        this.KWHzl.setValue(StateListAnimator.Activity.KWHzl);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), C44711scA.EZpvd.KWHzl(), null, new SupportRecommendTopicViewModel$fetchData$1(this, null), 2, null);
    }

    public final void gEmmrt() {
        this.copydefault.setValue(Boolean.TRUE);
    }
}
