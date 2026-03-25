package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_notifications.viewmodel.FollowersNotificationsViewModel$registerContentMinLuaEvent$1$call$1;
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

/* JADX INFO: renamed from: o.tzA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C47913tzA extends AbstractC33073mpa {
    public final C46203tLq AEQbTJ;
    public final SharedFlow<Application> KWHzl;
    public final MutableSharedFlow<Application> OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47913tzA() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:22)) : (r1v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:o.tLq:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tLq:0x000e: INVOKE (wrap:o.tPF:0x000c: SGET  A[WRAPPED] (LINE:23) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.UrRBLY():o.tLq A[MD:():o.tLq (m), WRAPPED] (LINE:23)) : (r2v0 o.tLq))
 A[MD:(kotlinx.coroutines.CoroutineDispatcher, o.tLq):void (m)] (LINE:21) call: o.tzA.<init>(kotlinx.coroutines.CoroutineDispatcher, o.tLq):void type: THIS */
    public /* synthetic */ C47913tzA(CoroutineDispatcher coroutineDispatcher, C46203tLq c46203tLq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getDefault() : coroutineDispatcher, (i & 2) != 0 ? tPF.copydefault.UrRBLY() : c46203tLq);
    }

    public C47913tzA(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C46203tLq c46203tLq) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c46203tLq, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c46203tLq;
        MutableSharedFlow<Application> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        copydefault();
    }

    public final InterfaceC7298ahG OLrzqt() {
        return C7323ahf.KWHzl();
    }

    public final void copydefault() {
        InterfaceC7298ahG interfaceC7298ahGOLrzqt = OLrzqt();
        if (interfaceC7298ahGOLrzqt != null) {
            interfaceC7298ahGOLrzqt.EZpvd("follow_button_update_status_listener", new ActionBar(), "FollowersNotificationsViewModel");
        }
    }

    /* JADX INFO: renamed from: o.tzA$ActionBar */
    public static final class ActionBar implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public ActionBar() {
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
                        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(C47913tzA.this), C47913tzA.this.copydefault, null, new FollowersNotificationsViewModel$registerContentMinLuaEvent$1$call$1(C47913tzA.this, str, bool, str2, null), 2, null);
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: o.tzA$Application */
    public interface Application {

        /* JADX INFO: renamed from: o.tzA$Application$Activity */
        public static final class Activity implements Application {
            public final java.lang.String EZpvd;
            public final boolean OLrzqt;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.copydefault;
                }
                if ((i & 2) != 0) {
                    z = activity.OLrzqt;
                }
                if ((i & 4) != 0) {
                    str2 = activity.EZpvd;
                }
                return activity.EZpvd(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(@NotNull java.lang.String str, boolean z, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.copydefault.hashCode();
                int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
                java.lang.String str = this.EZpvd;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FollowedUser(authorId=" + this.copydefault + ", hasFollowed=" + this.OLrzqt + ", followStatusV2=" + this.EZpvd + ")";
            }

            public Activity(@NotNull java.lang.String str, boolean z, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
                this.OLrzqt = z;
                this.EZpvd = str2;
            }
        }
    }
}
