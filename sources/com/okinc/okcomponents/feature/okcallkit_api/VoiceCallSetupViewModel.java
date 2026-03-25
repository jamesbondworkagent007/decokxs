package com.okinc.okcomponents.feature.okcallkit_api;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.just.agentweb.ActionActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32989mnw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class VoiceCallSetupViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final SavedStateHandle EZpvd;
    public final MutableLiveData<C32989mnw<Action>> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Action>> copydefault() {
        return this.KWHzl;
    }

    public VoiceCallSetupViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = savedStateHandle;
        this.KWHzl = new MutableLiveData<>();
        Action action = (Action) savedStateHandle.get(ActionActivity.KEY_ACTION);
        if (action == null) {
            KWHzl(Action.SetupPermission);
        } else {
            KWHzl(action);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.okcallkit_api.VoiceCallSetupViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Action {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action SetupPermission = new Action("SetupPermission", 0);
        public static final Action SetupCallKit = new Action("SetupCallKit", 1);
        public static final Action TerminateWithFailedToDownloadCallkit = new Action("TerminateWithFailedToDownloadCallkit", 2);
        public static final Action TerminateWithFailedToGetPermission = new Action("TerminateWithFailedToGetPermission", 3);
        public static final Action Complete = new Action("Complete", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Action[] $values() {
            return new Action[]{SetupPermission, SetupCallKit, TerminateWithFailedToDownloadCallkit, TerminateWithFailedToGetPermission, Complete};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i) {
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(actionArr$values);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public final void KWHzl(Action action) {
        this.KWHzl.setValue(new C32989mnw<>(action));
        this.EZpvd.set(ActionActivity.KEY_ACTION, action);
    }

    public final void EZpvd(boolean z) {
        if (z) {
            KWHzl(Action.SetupCallKit);
        } else {
            KWHzl(Action.TerminateWithFailedToGetPermission);
        }
    }

    public final void copydefault(boolean z) {
        if (z) {
            KWHzl(Action.Complete);
        } else {
            KWHzl(Action.TerminateWithFailedToDownloadCallkit);
        }
    }
}
