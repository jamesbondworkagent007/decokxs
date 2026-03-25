package com.okinc.business.defi.wallet.home;

import android.os.Handler;
import android.os.Looper;
import com.okinc.business.defi.wallet.home.WalletHomeDialogQueueManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHomeDialogQueueManager {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public boolean EZpvd;
    public Runnable KWHzl;
    public final List<StateListAnimator> OLrzqt = new ArrayList();
    public final Handler AEQbTJ = new Handler(Looper.getMainLooper());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DialogPriority {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DialogPriority[] $VALUES;
        private final int value;
        public static final DialogPriority TERMS_VERSION = new DialogPriority("TERMS_VERSION", 0, 0);
        public static final DialogPriority VERIFY_WALLET = new DialogPriority("VERIFY_WALLET", 1, 1);
        public static final DialogPriority BACKUP_REMINDER = new DialogPriority("BACKUP_REMINDER", 2, 2);
        public static final DialogPriority SA_GUIDE = new DialogPriority("SA_GUIDE", 3, 3);
        public static final DialogPriority MALICIOUS_RISKY_APPROVAL = new DialogPriority("MALICIOUS_RISKY_APPROVAL", 4, 4);
        public static final DialogPriority RISKY_APPROVAL = new DialogPriority("RISKY_APPROVAL", 5, 5);
        public static final DialogPriority MANUAL_BACKUP = new DialogPriority("MANUAL_BACKUP", 6, 6);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DialogPriority[] $values() {
            return new DialogPriority[]{TERMS_VERSION, VERIFY_WALLET, BACKUP_REMINDER, SA_GUIDE, MALICIOUS_RISKY_APPROVAL, RISKY_APPROVAL, MANUAL_BACKUP};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DialogPriority> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private DialogPriority(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            DialogPriority[] dialogPriorityArr$values = $values();
            $VALUES = dialogPriorityArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(dialogPriorityArr$values);
        }

        public static DialogPriority valueOf(String str) {
            return (DialogPriority) Enum.valueOf(DialogPriority.class, str);
        }

        public static DialogPriority[] values() {
            return (DialogPriority[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator {
        public final Function0<Unit> AEQbTJ;
        public final String EZpvd;
        public final DialogPriority KWHzl;
        public final Function0<Boolean> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.WalletHomeDialogQueueManager$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, DialogPriority dialogPriority, String str, Function0 function0, Function0 function02, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogPriority = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 4) != 0) {
                function0 = stateListAnimator.OLrzqt;
            }
            if ((i & 8) != 0) {
                function02 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(dialogPriority, str, function0, function02);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Boolean> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DialogPriority OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull DialogPriority dialogPriority, @NotNull String str, @NotNull Function0<Boolean> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(dialogPriority, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            return new StateListAnimator(dialogPriority, str, function0, function02);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DialogRequest(priority=" + this.KWHzl + ", tag=" + this.EZpvd + ", shouldShow=" + this.OLrzqt + ", show=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull DialogPriority dialogPriority, @NotNull String str, @NotNull Function0<Boolean> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(dialogPriority, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            this.KWHzl = dialogPriority;
            this.EZpvd = str;
            this.OLrzqt = function0;
            this.AEQbTJ = function02;
        }
    }

    public final boolean OLrzqt(@NotNull DialogPriority dialogPriority, @NotNull String str, @NotNull Function0<Boolean> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(dialogPriority, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        try {
            Result.Application application = Result.Companion;
            List<StateListAnimator> list = this.OLrzqt;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((Object) ((StateListAnimator) it.next()).AEQbTJ(), (Object) str)) {
                        pUU.EZpvd("DialogQueueManager", "Skipped duplicate: " + str);
                        return false;
                    }
                }
            }
            if (!function0.invoke().booleanValue()) {
                pUU.EZpvd("DialogQueueManager", "ShouldShow returned false: " + str);
                return false;
            }
            this.OLrzqt.add(new StateListAnimator(dialogPriority, str, function0, function02));
            pUU.EZpvd("DialogQueueManager", "Enqueued: " + str + " with priority " + dialogPriority.getValue());
            EZpvd();
            return true;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("enqueue failed : ", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = Boolean.FALSE;
            }
            return ((Boolean) objM7377constructorimpl).booleanValue();
        }
    }

    public final Object EZpvd() {
        Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            Runnable runnable = this.KWHzl;
            if (runnable != null) {
                this.AEQbTJ.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: o.eUn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    WalletHomeDialogQueueManager.KWHzl(this.OLrzqt);
                }
            };
            this.KWHzl = runnable2;
            Handler handler = this.AEQbTJ;
            Intrinsics.copydefault(runnable2);
            objM7377constructorimpl = Result.m7377constructorimpl(Boolean.valueOf(handler.postDelayed(runnable2, 500L)));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("scheduleProcessQueue failed : ", thM7380exceptionOrNullimpl);
        }
        return objM7377constructorimpl;
    }

    public static final void KWHzl(WalletHomeDialogQueueManager walletHomeDialogQueueManager) {
        walletHomeDialogQueueManager.copydefault();
    }

    public final Object copydefault() {
        Object objM7377constructorimpl;
        Object obj;
        try {
            Result.Application application = Result.Companion;
            if (this.EZpvd) {
                pUU.EZpvd("DialogQueueManager", "Already showing a dialog, skipping processQueue");
            } else {
                List<StateListAnimator> list = this.OLrzqt;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((StateListAnimator) obj2).EZpvd().invoke().booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        int value = ((StateListAnimator) next).OLrzqt().getValue();
                        do {
                            Object next2 = it.next();
                            int value2 = ((StateListAnimator) next2).OLrzqt().getValue();
                            if (value > value2) {
                                next = next2;
                                value = value2;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                if (stateListAnimator != null) {
                    this.OLrzqt.remove(stateListAnimator);
                    this.EZpvd = true;
                    pUU.EZpvd("DialogQueueManager", "Showing: " + stateListAnimator.AEQbTJ() + " (priority " + stateListAnimator.OLrzqt().getValue() + ")");
                    stateListAnimator.copydefault().invoke();
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("processQueue failed : ", thM7380exceptionOrNullimpl);
        }
        return objM7377constructorimpl;
    }

    public final void KWHzl() {
        this.EZpvd = false;
        pUU.EZpvd("DialogQueueManager", "Dialog dismissed, processing next in queue");
        copydefault();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.WalletHomeDialogQueueManager.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
