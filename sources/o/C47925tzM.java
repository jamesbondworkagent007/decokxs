package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_notifications.viewmodel.NotificationsActivityViewModel$followUser$1;
import com.okinc.planet.biz_notifications.viewmodel.NotificationsActivityViewModel$registerContentMinLuaEvent$1$call$1;
import com.okinc.planet.domain.remote.dto.UnreadMsgCountResp;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47925tzM extends AbstractC33073mpa {
    public PlanetNotificationCategory AYXKKw;
    public final C46203tLq AhwBna;
    public final java.util.HashSet<java.lang.Long> AkhnZx;
    public final SharedFlow<java.lang.Long> DbNXlk;
    public final CoroutineDispatcher EZpvd;
    public final MutableSharedFlow<java.lang.Long> KWHzl;
    public final UnreadMsgCountResp OLrzqt;
    public final MutableSharedFlow<StateListAnimator> copydefault;
    public final boolean djBIcL;
    public final SharedFlow<StateListAnimator> gEmmrt;
    public final MutableLiveData<UnreadMsgCountResp> isConnected;
    public final InterfaceC46387tSl valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<StateListAnimator> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetNotificationCategory KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<java.lang.Long> OLrzqt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(PlanetNotificationCategory planetNotificationCategory) {
        this.AYXKKw = planetNotificationCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<UnreadMsgCountResp> copydefault() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.Long> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.SavedStateHandle)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:30)) : (r2v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:o.tLq:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tLq:0x000e: INVOKE (wrap:o.tPF:0x000c: SGET  A[WRAPPED] (LINE:31) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.UrRBLY():o.tLq A[MD:():o.tLq (m), WRAPPED] (LINE:31)) : (r3v0 o.tLq))
  (wrap:o.tSl:?: TERNARY null = ((wrap:int:0x0012: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tSl:0x0018: INVOKE (wrap:o.tPF:0x0016: SGET  A[WRAPPED] (LINE:32) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.alsFma():o.tSm A[MD:():o.tSm (m), WRAPPED] (LINE:32)) : (r4v0 o.tSl))
 A[MD:(androidx.lifecycle.SavedStateHandle, kotlinx.coroutines.CoroutineDispatcher, o.tLq, o.tSl):void (m)] (LINE:28) call: o.tzM.<init>(androidx.lifecycle.SavedStateHandle, kotlinx.coroutines.CoroutineDispatcher, o.tLq, o.tSl):void type: THIS */
    public /* synthetic */ C47925tzM(SavedStateHandle savedStateHandle, CoroutineDispatcher coroutineDispatcher, C46203tLq c46203tLq, InterfaceC46387tSl interfaceC46387tSl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? Dispatchers.getDefault() : coroutineDispatcher, (i & 4) != 0 ? tPF.copydefault.UrRBLY() : c46203tLq, (i & 8) != 0 ? tPF.copydefault.alsFma() : interfaceC46387tSl);
    }

    public C47925tzM(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C46203tLq c46203tLq, @NotNull InterfaceC46387tSl interfaceC46387tSl) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c46203tLq, "");
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        this.EZpvd = coroutineDispatcher;
        this.AhwBna = c46203tLq;
        this.valueOf = interfaceC46387tSl;
        MutableSharedFlow<StateListAnimator> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<java.lang.Long> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        AhwBna();
        this.djBIcL = interfaceC46387tSl.AhwBna();
        this.AYXKKw = (PlanetNotificationCategory) savedStateHandle.get("selected_category");
        UnreadMsgCountResp unreadMsgCountResp = new UnreadMsgCountResp(0, 0, 0, 0);
        this.OLrzqt = unreadMsgCountResp;
        this.isConnected = new MutableLiveData<>(unreadMsgCountResp);
        this.AkhnZx = new java.util.HashSet<>();
    }

    /* JADX INFO: renamed from: o.tzM$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tzM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7298ahG AYXKKw() {
        return C7323ahf.KWHzl();
    }

    private final void AhwBna() {
        InterfaceC7298ahG interfaceC7298ahGAYXKKw = AYXKKw();
        if (interfaceC7298ahGAYXKKw != null) {
            interfaceC7298ahGAYXKKw.EZpvd("follow_button_update_status_listener", new Application(), "NotificationsActivityViewModel");
        }
    }

    /* JADX INFO: renamed from: o.tzM$Application */
    public static final class Application implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public Application() {
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            if (!(objArr.length == 0)) {
                java.lang.Object obj = objArr[0];
                if (obj instanceof java.util.Map) {
                    Intrinsics.copydefault(obj, "");
                    java.util.Map map = (java.util.Map) obj;
                    java.lang.Object obj2 = map.get("authorId");
                    java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    java.lang.Object obj3 = map.get("isFollowing");
                    java.lang.Boolean bool = obj3 instanceof java.lang.Boolean ? (java.lang.Boolean) obj3 : null;
                    java.lang.Object obj4 = map.get("followStatusV2");
                    java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    if (str != null && bool != null) {
                        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(C47925tzM.this), C47925tzM.this.EZpvd, null, new NotificationsActivityViewModel$registerContentMinLuaEvent$1$call$1(C47925tzM.this, str, bool, str2, null), 2, null);
                    }
                }
            }
            return true;
        }
    }

    public final void KWHzl(boolean z, @NotNull java.lang.String str, java.lang.String str2, @NotNull Function2<? super java.lang.Boolean, ? super OKServerException, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationsActivityViewModel$followUser$1(this, z, str, function2, str2, null), 3, null);
    }

    /* JADX INFO: renamed from: o.tzM$StateListAnimator */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: o.tzM$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0971StateListAnimator implements StateListAnimator {
            public final java.lang.String AEQbTJ;
            public final boolean EZpvd;
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0971StateListAnimator copy$default(C0971StateListAnimator c0971StateListAnimator, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0971StateListAnimator.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z = c0971StateListAnimator.EZpvd;
                }
                if ((i & 4) != 0) {
                    str2 = c0971StateListAnimator.OLrzqt;
                }
                return c0971StateListAnimator.KWHzl(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0971StateListAnimator KWHzl(@NotNull java.lang.String str, boolean z, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0971StateListAnimator(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0971StateListAnimator)) {
                    return false;
                }
                C0971StateListAnimator c0971StateListAnimator = (C0971StateListAnimator) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c0971StateListAnimator.AEQbTJ) && this.EZpvd == c0971StateListAnimator.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c0971StateListAnimator.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.AEQbTJ.hashCode();
                int iHashCode2 = java.lang.Boolean.hashCode(this.EZpvd);
                java.lang.String str = this.OLrzqt;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FollowedUser(authorId=" + this.AEQbTJ + ", hasFollowed=" + this.EZpvd + ", followStatusV2=" + this.OLrzqt + ")";
            }

            public C0971StateListAnimator(@NotNull java.lang.String str, boolean z, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
                this.EZpvd = z;
                this.OLrzqt = str2;
            }
        }
    }

    public final java.util.List<PlanetNotificationCategory> AEQbTJ() {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(PlanetNotificationCategory.All);
        listOLrzqt.add(PlanetNotificationCategory.Comments);
        listOLrzqt.add(PlanetNotificationCategory.Likes);
        if (this.djBIcL) {
            listOLrzqt.add(PlanetNotificationCategory.Followers);
        }
        listOLrzqt.add(PlanetNotificationCategory.System);
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final void copydefault(long j) {
        if (this.AkhnZx.remove(java.lang.Long.valueOf(j))) {
            this.KWHzl.tryEmit(java.lang.Long.valueOf(j));
        }
    }

    public final int copydefault(@NotNull PlanetNotificationCategory planetNotificationCategory) {
        Intrinsics.checkNotNullParameter(planetNotificationCategory, "");
        return AEQbTJ().indexOf(planetNotificationCategory);
    }
}
