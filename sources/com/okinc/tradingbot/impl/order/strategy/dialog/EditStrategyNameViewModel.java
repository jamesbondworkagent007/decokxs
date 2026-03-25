package com.okinc.tradingbot.impl.order.strategy.dialog;

import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC50055vAf;
import o.uLN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class EditStrategyNameViewModel extends uLN<TaskDescription> {
    public final InterfaceC50055vAf AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    @yCM
    public EditStrategyNameViewModel(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC50055vAf;
        this.EZpvd = coroutineDispatcher;
    }

    public final void EZpvd(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.EZpvd, null, new EditStrategyNameViewModel$auditStrategyName$1(this, str, z, null), 2, null);
    }

    public interface TaskDescription {

        public static final class ActionBar implements TaskDescription {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
            }
        }

        public static final class Activity implements TaskDescription {
            public final boolean EZpvd;
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.KWHzl;
                }
                if ((i & 2) != 0) {
                    z = activity.EZpvd;
                }
                return activity.KWHzl(str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) activity.KWHzl) && this.EZpvd == activity.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AuditSuccess(strategyName=" + this.KWHzl + ", isNameEdited=" + this.EZpvd + ")";
            }

            public Activity(@NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
                this.EZpvd = z;
            }
        }

        public static final class StateListAnimator implements TaskDescription {
            public final String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.EZpvd;
                }
                return stateListAnimator.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AuditError(errorMessage=" + this.EZpvd + ")";
            }

            public StateListAnimator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }
    }
}
