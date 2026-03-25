package com.okinc.okex.feedback.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45618stT;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedbackBountyViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final C45618stT AEQbTJ;
    public final MutableLiveData<Integer> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public FeedbackBountyViewModel(@NotNull C45618stT c45618stT) {
        Intrinsics.checkNotNullParameter(c45618stT, "");
        this.AEQbTJ = c45618stT;
        this.copydefault = new MutableLiveData<>();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.viewmodel.FeedbackBountyViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void KWHzl(boolean z) {
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FeedbackBountyViewModel$loadTotalOfPendingApproveFeedback$1(this, null), 3, null);
        } else {
            this.copydefault.setValue(0);
        }
    }
}
