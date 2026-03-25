package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.im.imui.share.model.SelectionStatus;
import com.okinc.im.imui.share.viewmodel.ShareMessageViewModel$fetchData$1;
import com.okinc.okimcore.model.share.ShareTarget;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC37636oxa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37656oxu extends ViewModel {
    public final MutableStateFlow<java.util.List<C37580owX>> AEQbTJ;
    public final StateFlow<java.util.Set<ShareTarget>> AYXKKw;
    public final StateFlow<InterfaceC37636oxa> AhwBna;
    public final InterfaceC44379sNq EZpvd;
    public Activity KWHzl;
    public final MutableStateFlow<java.util.Set<ShareTarget>> OLrzqt;
    public MutableStateFlow<InterfaceC37636oxa> copydefault;
    public final InterfaceC44376sNn djBIcL;
    public MutableStateFlow<java.lang.String> gEmmrt;
    public final InterfaceC44380sNr valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.Set<ShareTarget>> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC37636oxa> copydefault() {
        return this.AhwBna;
    }

    public C37656oxu(@NotNull InterfaceC44380sNr interfaceC44380sNr, @NotNull InterfaceC44379sNq interfaceC44379sNq, @NotNull InterfaceC44376sNn interfaceC44376sNn) {
        Intrinsics.checkNotNullParameter(interfaceC44380sNr, "");
        Intrinsics.checkNotNullParameter(interfaceC44379sNq, "");
        Intrinsics.checkNotNullParameter(interfaceC44376sNn, "");
        this.valueOf = interfaceC44380sNr;
        this.EZpvd = interfaceC44379sNq;
        this.djBIcL = interfaceC44376sNn;
        this.KWHzl = Activity.StateListAnimator.copydefault;
        this.AEQbTJ = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        MutableStateFlow<java.util.Set<ShareTarget>> MutableStateFlow = StateFlowKt.MutableStateFlow(yEE.copydefault());
        this.OLrzqt = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        this.gEmmrt = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<InterfaceC37636oxa> MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC37636oxa.ActionBar.EZpvd);
        this.copydefault = MutableStateFlow2;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow2);
        EZpvd();
    }

    /* JADX INFO: renamed from: o.oxu$Activity */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oxu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.oxu$Activity$TaskDescription */
        public static final class TaskDescription extends Activity {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.oxu$Activity$StateListAnimator */
        public static final class StateListAnimator extends Activity {
            public static final StateListAnimator copydefault = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }
    }

    public final void KWHzl(java.lang.String str) {
        this.gEmmrt.setValue(str);
    }

    private final void EZpvd() {
        this.copydefault.tryEmit(InterfaceC37636oxa.ActionBar.EZpvd);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ShareMessageViewModel$fetchData$1(this, null), 3, null);
    }

    public final SelectionStatus KWHzl(java.util.Set<ShareTarget> set, ShareTarget shareTarget) {
        if (set.contains(shareTarget)) {
            return SelectionStatus.SELECTED;
        }
        if (set.size() >= 10) {
            return SelectionStatus.DISABLED;
        }
        return SelectionStatus.UNSELECTED;
    }

    public final void OLrzqt(@NotNull ShareTarget shareTarget, boolean z) {
        Intrinsics.checkNotNullParameter(shareTarget, "");
        java.util.Set<ShareTarget> setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(this.OLrzqt.getValue());
        if (z) {
            if (setDXXBbs.size() >= 10) {
                pUU.AEQbTJ("Update relation Selection: Reached selection limit");
                return;
            } else {
                this.KWHzl = Activity.TaskDescription.EZpvd;
                setDXXBbs.add(shareTarget);
            }
        } else {
            this.KWHzl = Activity.StateListAnimator.copydefault;
            setDXXBbs.remove(shareTarget);
        }
        this.OLrzqt.setValue(setDXXBbs);
    }

    public final void OLrzqt() {
        this.KWHzl = Activity.StateListAnimator.copydefault;
    }

    public final java.lang.Object KWHzl(@NotNull java.util.Set<ShareTarget> set, @NotNull IMMessageShareModel iMMessageShareModel, @NotNull Continuation<? super sQV> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (ShareTarget shareTarget : set) {
            if (shareTarget.copydefault() != null) {
                java.lang.String strCopydefault = shareTarget.copydefault();
                Intrinsics.copydefault((java.lang.Object) strCopydefault);
                arrayList.add(strCopydefault);
            } else if (shareTarget.OLrzqt() != null) {
                java.lang.String strOLrzqt = shareTarget.OLrzqt();
                Intrinsics.copydefault((java.lang.Object) strOLrzqt);
                arrayList2.add(strOLrzqt);
            }
        }
        return this.djBIcL.OLrzqt(new sQX(arrayList, arrayList2, C35181nqV.copydefault(iMMessageShareModel)), continuation);
    }
}
