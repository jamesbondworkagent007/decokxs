package o;

import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51967vwx {
    public final LinkedBlockingQueue<StateListAnimator> OLrzqt = new LinkedBlockingQueue<>();

    public final void copydefault() {
        this.OLrzqt.poll();
        StateListAnimator stateListAnimatorPeek = this.OLrzqt.peek();
        if (stateListAnimatorPeek != null) {
            EZpvd(stateListAnimatorPeek.copydefault());
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StateListAnimator stateListAnimatorPeek = this.OLrzqt.peek();
        if (stateListAnimatorPeek == null) {
            pUU.EZpvd("BotMarketPlacePopup", "Popup taskQueue is empty");
            return;
        }
        while (stateListAnimatorPeek != null && !Intrinsics.EZpvd((java.lang.Object) stateListAnimatorPeek.copydefault(), (java.lang.Object) str)) {
            this.OLrzqt.poll();
            stateListAnimatorPeek = this.OLrzqt.peek();
        }
        if (stateListAnimatorPeek == null) {
            pUU.EZpvd("BotMarketPlacePopup", "Popup task " + str + " is not initiated. Try register a new one by calling addTask()");
            return;
        }
        if (stateListAnimatorPeek.AEQbTJ().invoke().booleanValue()) {
            pUU.EZpvd("BotMarketPlacePopup", "Popup task " + str + " starts! Completion is supposed to be an asynchronous interaction.");
            stateListAnimatorPeek.OLrzqt().run();
            return;
        }
        pUU.EZpvd("BotMarketPlacePopup", "Popup task " + str + " is not allowed to show :(");
        copydefault();
    }

    /* JADX INFO: renamed from: o.vwx$StateListAnimator */
    public static final class StateListAnimator {
        public final Function0<java.lang.Boolean> EZpvd;
        public final java.lang.Runnable OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vwx$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.Runnable runnable, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                runnable = stateListAnimator.OLrzqt;
            }
            if ((i & 4) != 0) {
                function0 = stateListAnimator.EZpvd;
            }
            return stateListAnimator.KWHzl(str, runnable, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<java.lang.Boolean> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.lang.String str, @NotNull java.lang.Runnable runnable, @NotNull Function0<java.lang.Boolean> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(runnable, "");
            Intrinsics.checkNotNullParameter(function0, "");
            return new StateListAnimator(str, runnable, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Runnable OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PopupTask(tag=" + this.copydefault + ", runnable=" + this.OLrzqt + ", condition=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.Runnable runnable, @NotNull Function0<java.lang.Boolean> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(runnable, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.copydefault = str;
            this.OLrzqt = runnable;
            this.EZpvd = function0;
        }
    }

    public final void copydefault(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        LinkedBlockingQueue<StateListAnimator> linkedBlockingQueue = this.OLrzqt;
        if (!(linkedBlockingQueue instanceof java.util.Collection) || !linkedBlockingQueue.isEmpty()) {
            java.util.Iterator<T> it = linkedBlockingQueue.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((StateListAnimator) it.next()).copydefault(), (java.lang.Object) stateListAnimator.copydefault())) {
                    pUU.EZpvd("BotMarketPlacePopup", "Popup task " + stateListAnimator.copydefault() + " is already registered");
                    return;
                }
            }
        }
        this.OLrzqt.add(stateListAnimator);
    }
}
