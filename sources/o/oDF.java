package o;

import com.okinc.im.usecase.group.info.ObserveGroupProfileInfoUseCase$invoke$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDF {
    public final CoroutineDispatcher AEQbTJ;
    public final C35780oDk EZpvd;
    public final oDI KWHzl;
    public final oCI OLrzqt;
    public final oDX copydefault;

    @yCM
    public oDF(@NotNull oDI odi, @NotNull oDX odx, @NotNull oCI oci, @NotNull C35780oDk c35780oDk, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(odx, "");
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(c35780oDk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = odi;
        this.copydefault = odx;
        this.OLrzqt = oci;
        this.EZpvd = c35780oDk;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        public final OKConversation AEQbTJ;
        public final GroupInfo OLrzqt;
        public final java.util.List<GroupMemberInfo> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oDF$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, GroupInfo groupInfo, java.util.List list, OKConversation oKConversation, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                groupInfo = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                list = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                oKConversation = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(groupInfo, list, oKConversation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversation AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupInfo KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull GroupInfo groupInfo, @NotNull java.util.List<GroupMemberInfo> list, @NotNull OKConversation oKConversation) {
            Intrinsics.checkNotNullParameter(groupInfo, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(oKConversation, "");
            return new StateListAnimator(groupInfo, list, oKConversation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<GroupMemberInfo> copydefault() {
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
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Result(groupInfo=" + this.OLrzqt + ", memberList=" + this.copydefault + ", conversation=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull GroupInfo groupInfo, @NotNull java.util.List<GroupMemberInfo> list, @NotNull OKConversation oKConversation) {
            Intrinsics.checkNotNullParameter(groupInfo, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(oKConversation, "");
            this.OLrzqt = groupInfo;
            this.copydefault = list;
            this.AEQbTJ = oKConversation;
        }
    }

    public final Flow<StateListAnimator> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.combine(FlowKt.filterNotNull(this.KWHzl.AEQbTJ(str)), this.copydefault.copydefault(str), FlowKt.filterNotNull(this.OLrzqt.KWHzl(str)), new ObserveGroupProfileInfoUseCase$invoke$1(this, null)), this.AEQbTJ);
    }
}
