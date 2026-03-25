package com.okinc.okex.center.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.viewmodel.SupportAllTopicViewModel;
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
import o.C45353soG;
import o.sxK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportAllTopicViewModel extends AbstractC33073mpa {
    public MutableLiveData<Boolean> AEQbTJ;
    public final StateFlow<TaskDescription> AhwBna;
    public final LiveData<Boolean> EZpvd;
    public final MutableLiveData<RatingResult> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableStateFlow<TaskDescription> copydefault;
    public final C45353soG gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<RatingResult> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.EZpvd;
    }

    @yCM
    public SupportAllTopicViewModel(@NotNull C45353soG c45353soG) {
        Intrinsics.checkNotNullParameter(c45353soG, "");
        this.gEmmrt = c45353soG;
        MutableStateFlow<TaskDescription> MutableStateFlow = StateFlowKt.MutableStateFlow(TaskDescription.ActionBar.KWHzl);
        this.copydefault = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        this.AEQbTJ = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.OLrzqt = mutableLiveData;
        MutableLiveData<RatingResult> mutableLiveData2 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData2;
        this.EZpvd = Transformations.map(C32942mnB.OLrzqt(mutableLiveData2, mutableLiveData), new Function1() { // from class: o.skS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SupportAllTopicViewModel.copydefault((kotlin.Pair) obj));
            }
        });
    }

    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportAllTopicViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ActionBar extends TaskDescription {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity extends TaskDescription {
            public final List<TopicListItem> EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.viewmodel.SupportAllTopicViewModel$TaskDescription$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Activity copy$default(Activity activity, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = activity.EZpvd;
                }
                return activity.AEQbTJ(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull List<? extends TopicListItem> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Activity(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<TopicListItem> AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(data=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.okex.center.bean.TopicListItem> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Activity(@NotNull List<? extends TopicListItem> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.EZpvd = list;
            }
        }

        /* JADX INFO: renamed from: com.okinc.okex.center.viewmodel.SupportAllTopicViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0542TaskDescription extends TaskDescription {
            public static final C0542TaskDescription EZpvd = new C0542TaskDescription();

            private C0542TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class StateListAnimator extends TaskDescription {
            public static final StateListAnimator copydefault = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }
    }

    public static final boolean copydefault(Pair pair) {
        return Intrinsics.EZpvd((Boolean) pair.component2(), Boolean.FALSE) && sxK.copydefault.OLrzqt((RatingResult) pair.component1());
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), C44711scA.EZpvd.KWHzl(), null, new SupportAllTopicViewModel$loadData$1(this, null), 2, null);
    }

    public final void copydefault() {
        this.OLrzqt.setValue(Boolean.TRUE);
    }
}
