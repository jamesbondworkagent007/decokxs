package com.okinc.oklive.app.sdk;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32989mnw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class LiveModuleViewModel extends ViewModel {
    public final SavedStateHandle EZpvd;
    public final MutableLiveData<C32989mnw<Action>> KWHzl;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public LiveModuleViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = savedStateHandle;
        this.KWHzl = new MutableLiveData<>();
        Action action = (Action) savedStateHandle.get("LIVE_KEY_ACTION");
        if (action == null) {
            OLrzqt(Action.SetupLiveSDK);
        } else {
            OLrzqt(action);
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.sdk.LiveModuleViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Action {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action SetupLiveSDK = new Action("SetupLiveSDK", 0);
        public static final Action TerminateWithFailedToDownloadLiveSDK = new Action("TerminateWithFailedToDownloadLiveSDK", 1);
        public static final Action Complete = new Action("Complete", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Action[] $values() {
            return new Action[]{SetupLiveSDK, TerminateWithFailedToDownloadLiveSDK, Complete};
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

    public final void OLrzqt(Action action) {
        this.KWHzl.setValue(new C32989mnw<>(action));
        this.EZpvd.set("LIVE_KEY_ACTION", action);
    }
}
