package com.okinc.localization2.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LocalizeEvent {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.LocalizeEvent.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LocalizeEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LocalizeEvent() {
    }

    public static final class ActionBar extends LocalizeEvent {
        public final AppLocale OLrzqt;
        public final AppLocale copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, AppLocale appLocale, AppLocale appLocale2, int i, Object obj) {
            if ((i & 1) != 0) {
                appLocale = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                appLocale2 = actionBar.copydefault;
            }
            return actionBar.AEQbTJ(appLocale, appLocale2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppLocale AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(AppLocale appLocale, @NotNull AppLocale appLocale2) {
            Intrinsics.checkNotNullParameter(appLocale2, "");
            return new ActionBar(appLocale, appLocale2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppLocale KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            AppLocale appLocale = this.OLrzqt;
            return ((appLocale == null ? 0 : appLocale.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LanguageChange(old=" + this.OLrzqt + ", new=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(AppLocale appLocale, @NotNull AppLocale appLocale2) {
            super(null);
            Intrinsics.checkNotNullParameter(appLocale2, "");
            this.OLrzqt = appLocale;
            this.copydefault = appLocale2;
        }
    }

    public static final class StateListAnimator extends LocalizeEvent {
        public final List<AppLocale> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.localization2.bean.LocalizeEvent$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.KWHzl;
            }
            return stateListAnimator.EZpvd(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull List<AppLocale> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LangPackUpdate(changedList=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull List<AppLocale> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }
    }
}
