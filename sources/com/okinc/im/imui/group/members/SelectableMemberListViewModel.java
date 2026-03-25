package com.okinc.im.imui.group.members;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C35859oGi;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectableMemberListViewModel extends ViewModel {
    public final SharedFlow<ActionBar> EZpvd;
    public final MutableSharedFlow<ActionBar> OLrzqt;
    public final C35859oGi copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<ActionBar> OLrzqt() {
        return this.EZpvd;
    }

    @yCM
    public SelectableMemberListViewModel(@NotNull C35859oGi c35859oGi) {
        Intrinsics.checkNotNullParameter(c35859oGi, "");
        this.copydefault = c35859oGi;
        MutableSharedFlow<ActionBar> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void KWHzl(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectableMemberListViewModel$getUserInfo$1(this, str, str2, null), 3, null);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription implements ActionBar {
            public static final TaskDescription OLrzqt = new TaskDescription();

            private TaskDescription() {
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.SelectableMemberListViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0438ActionBar implements ActionBar {
            public static final int OLrzqt = RelationInfo.$stable;
            public final RelationInfo AEQbTJ;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0438ActionBar copy$default(C0438ActionBar c0438ActionBar, RelationInfo relationInfo, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = c0438ActionBar.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str = c0438ActionBar.copydefault;
                }
                return c0438ActionBar.KWHzl(relationInfo, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0438ActionBar KWHzl(@NotNull RelationInfo relationInfo, String str) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new C0438ActionBar(relationInfo, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0438ActionBar)) {
                    return false;
                }
                C0438ActionBar c0438ActionBar = (C0438ActionBar) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, c0438ActionBar.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) c0438ActionBar.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.AEQbTJ.hashCode();
                String str = this.copydefault;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowProfile(userInfo=" + this.AEQbTJ + ", memberOfGroup=" + this.copydefault + ")";
            }

            public C0438ActionBar(@NotNull RelationInfo relationInfo, String str) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.AEQbTJ = relationInfo;
                this.copydefault = str;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator implements ActionBar {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.AEQbTJ;
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
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((StateListAnimator) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(message=" + this.AEQbTJ + ")";
            }

            public StateListAnimator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }
    }
}
