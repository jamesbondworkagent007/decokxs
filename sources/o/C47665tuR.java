package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_content.leaderboard.bean.FollowingUser;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetFollowingViewModel$addUserToList$1;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetFollowingViewModel$loadFollowingList$1;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetFollowingViewModel$markUserAsRead$1;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetFollowingViewModel$refreshFollowingListAfterLastRemoval$1;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetFollowingViewModel$removeUserFromList$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47665tuR extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final MutableSharedFlow<java.util.List<FollowingUser>> AEQbTJ;
    public final C47662tuO KWHzl = tPF.copydefault.hCLrkq();
    public final MutableSharedFlow<java.lang.Boolean> OLrzqt;
    public final SharedFlow<java.lang.Boolean> copydefault;
    public final SharedFlow<java.util.List<FollowingUser>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.List<FollowingUser>> EZpvd() {
        return this.gEmmrt;
    }

    public C47665tuR() {
        MutableSharedFlow<java.util.List<FollowingUser>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 1, null, 4, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<java.lang.Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 1, null, 4, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    /* JADX INFO: renamed from: o.tuR$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tuR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void loadFollowingList$default(C47665tuR c47665tuR, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        c47665tuR.KWHzl(num);
    }

    public final void KWHzl(java.lang.Integer num) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetFollowingViewModel$loadFollowingList$1(this, num, null), 3, null);
    }

    public final void OLrzqt(@NotNull FollowingUser followingUser) {
        java.util.List arrayList;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(followingUser, "");
        java.util.List list = (java.util.List) CollectionsKt___CollectionsKt.wlaJM(this.AEQbTJ.getReplayCache());
        if (list == null || (arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)) == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((FollowingUser) next).getAuthorId(), (java.lang.Object) followingUser.getAuthorId())) {
                    break;
                }
            }
        }
        if (((FollowingUser) next) == null) {
            arrayList.add(followingUser);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetFollowingViewModel$addUserToList$1(this, arrayList, null), 3, null);
            pUU.EZpvd("PlanetFollowingViewModel", "Added user " + followingUser.getAuthorId() + " to following list, new size: " + arrayList.size());
            return;
        }
        pUU.EZpvd("PlanetFollowingViewModel", "User " + followingUser.getAuthorId() + " already exists in following list, skipping add");
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List list = (java.util.List) CollectionsKt___CollectionsKt.wlaJM(this.AEQbTJ.getReplayCache());
        boolean z = false;
        if (list == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (true ^ Intrinsics.EZpvd((java.lang.Object) ((FollowingUser) obj).getAuthorId(), (java.lang.Object) str)) {
                arrayList.add(obj);
            }
        }
        if ((!list.isEmpty()) && arrayList.isEmpty()) {
            z = true;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetFollowingViewModel$removeUserFromList$1(this, arrayList, null), 3, null);
        pUU.EZpvd("PlanetFollowingViewModel", "Removed user " + str + " from following list, new size: " + arrayList.size() + ", list became empty: " + z);
        return z;
    }

    public static /* synthetic */ void refreshFollowingListAfterLastRemoval$default(C47665tuR c47665tuR, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        c47665tuR.AEQbTJ(num);
    }

    public final void AEQbTJ(java.lang.Integer num) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetFollowingViewModel$refreshFollowingListAfterLastRemoval$1(this, num, null), 3, null);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List list = (java.util.List) CollectionsKt___CollectionsKt.wlaJM(this.AEQbTJ.getReplayCache());
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((FollowingUser) next).getAuthorId(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        FollowingUser followingUser = (FollowingUser) next;
        if (followingUser == null) {
            return;
        }
        java.lang.Integer unread = followingUser.getUnread();
        if (unread == null || unread.intValue() != 1) {
            pUU.EZpvd("PlanetFollowingViewModel", "User " + str + " already read, skipping");
            return;
        }
        followingUser.setUnread(0);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetFollowingViewModel$markUserAsRead$1(this, list, null), 3, null);
        pUU.EZpvd("PlanetFollowingViewModel", "Marked user " + str + " as read and moved to end of list");
    }
}
