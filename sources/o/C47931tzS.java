package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.planet.biz_notifications.viewmodel.NotificationsViewModel$getDraftDetail$1;
import com.okinc.planet.biz_notifications.viewmodel.NotificationsViewModel$getUnreadMsgList$1;
import com.okinc.planet.domain.remote.dto.UnreadMsg;
import com.okinc.planet.domain.remote.dto.UnreadMsgListResp;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import com.okinc.uilab.stateful.StatefulView;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47931tzS extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final PlanetNotificationCategory AEQbTJ;
    public final MutableLiveData<java.lang.String> EZpvd;
    public final C46356tRh KWHzl;
    public final MutableLiveData<C47914tzB> OLrzqt;
    public final C46351tRc djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C47914tzB> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetNotificationCategory copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.SavedStateHandle)
  (wrap:o.tRc:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tRc:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:31) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.TarCU():o.tRc A[MD:():o.tRc (m), WRAPPED] (LINE:31)) : (r2v0 o.tRc))
  (wrap:o.tRh:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tRh:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:32) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.fHqPtx():o.tRh A[MD:():o.tRh (m), WRAPPED] (LINE:32)) : (r3v0 o.tRh))
 A[MD:(androidx.lifecycle.SavedStateHandle, o.tRc, o.tRh):void (m)] (LINE:29) call: o.tzS.<init>(androidx.lifecycle.SavedStateHandle, o.tRc, o.tRh):void type: THIS */
    public /* synthetic */ C47931tzS(SavedStateHandle savedStateHandle, C46351tRc c46351tRc, C46356tRh c46356tRh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? tPF.copydefault.TarCU() : c46351tRc, (i & 4) != 0 ? tPF.copydefault.fHqPtx() : c46356tRh);
    }

    public C47931tzS(@NotNull SavedStateHandle savedStateHandle, @NotNull C46351tRc c46351tRc, @NotNull C46356tRh c46356tRh) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c46351tRc, "");
        Intrinsics.checkNotNullParameter(c46356tRh, "");
        this.djBIcL = c46351tRc;
        this.KWHzl = c46356tRh;
        java.lang.Object obj = savedStateHandle.get("current_category");
        Intrinsics.copydefault(obj);
        this.AEQbTJ = (PlanetNotificationCategory) obj;
        this.OLrzqt = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: o.tzS$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tzS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void EZpvd(boolean z) {
        if (z) {
            this.OLrzqt.setValue(new C47914tzB(StatefulView.Status.Loading, yDY.AhwBna(), null, true));
        }
        OLrzqt(null, new Function1() { // from class: o.tzU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47931tzS.OLrzqt(this.AEQbTJ, (UnreadMsgListResp) obj);
            }
        }, new Function1() { // from class: o.tzQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47931tzS.copydefault(this.EZpvd, (java.lang.Exception) obj);
            }
        });
    }

    public static final Unit OLrzqt(C47931tzS c47931tzS, UnreadMsgListResp unreadMsgListResp) {
        C47914tzB c47914tzB;
        Intrinsics.checkNotNullParameter(unreadMsgListResp, "");
        java.util.List<java.lang.Object> listOLrzqt = c47931tzS.OLrzqt(unreadMsgListResp.getMsgList());
        if (listOLrzqt.isEmpty()) {
            c47914tzB = new C47914tzB(StatefulView.Status.Empty, yDY.AhwBna(), null, true);
        } else {
            c47914tzB = new C47914tzB(StatefulView.Status.Content, listOLrzqt, unreadMsgListResp.getNextCursor(), true);
        }
        c47931tzS.OLrzqt.setValue(c47914tzB);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C47931tzS c47931tzS, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c47931tzS.OLrzqt.setValue(new C47914tzB(StatefulView.Status.Error, yDY.AhwBna(), null, true));
        return Unit.INSTANCE;
    }

    public final boolean KWHzl() {
        C47914tzB value = this.OLrzqt.getValue();
        if (value == null || value.OLrzqt() != StatefulView.Status.Content || !value.KWHzl()) {
            return false;
        }
        OLrzqt(value.copydefault(), new Function1() { // from class: o.tzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47931tzS.AEQbTJ(this.EZpvd, (UnreadMsgListResp) obj);
            }
        }, new Function1() { // from class: o.tzR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47931tzS.KWHzl(this.EZpvd, (java.lang.Exception) obj);
            }
        });
        return true;
    }

    public static final Unit AEQbTJ(C47931tzS c47931tzS, UnreadMsgListResp unreadMsgListResp) {
        Intrinsics.checkNotNullParameter(unreadMsgListResp, "");
        C47914tzB value = c47931tzS.OLrzqt.getValue();
        Intrinsics.copydefault(value);
        c47931tzS.OLrzqt.setValue(new C47914tzB(StatefulView.Status.Content, C47936tzX.OLrzqt(value.AEQbTJ(), c47931tzS.OLrzqt(unreadMsgListResp.getMsgList())), unreadMsgListResp.getNextCursor(), false));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C47931tzS c47931tzS, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        pUU.KWHzl("PlanetNotification", "loadMoreMessageList-->error:" + exc.getMessage());
        c47931tzS.EZpvd.setValue(exc.getMessage());
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super DraftDataInfo, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationsViewModel$getDraftDetail$1(this, str, function12, function1, null), 3, null);
    }

    public final void OLrzqt(java.lang.String str, Function1<? super UnreadMsgListResp, Unit> function1, Function1<? super java.lang.Exception, Unit> function12) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NotificationsViewModel$getUnreadMsgList$1(this, str, function1, function12, null), 3, null);
    }

    /* JADX INFO: renamed from: o.tzS$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((UnreadMsg) t2).getEventTime()), java.lang.Long.valueOf(((UnreadMsg) t).getEventTime()));
        }
    }

    public final java.util.List<java.lang.Object> OLrzqt(java.util.List<UnreadMsg> list) {
        java.lang.String date$default;
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.List<UnreadMsg> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new ActionBar());
        java.util.ArrayList arrayList = new java.util.ArrayList(listEZpvd.size() * 2);
        java.lang.String str = null;
        for (UnreadMsg unreadMsg : listEZpvd) {
            long eventTime = unreadMsg.getEventTime();
            unreadMsg.setLocalFormatedTime(pTA.formatTime$default(new Date(eventTime), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
            if (android.text.format.DateUtils.isToday(eventTime)) {
                date$default = C32979mnm.EZpvd.OLrzqt().getString(C47501trL.Fragment.glVQsU);
            } else {
                date$default = pTA.formatDate$default(new Date(eventTime), OKDateEnum.DATE_FORMAT_STANDARD, null, null, 6, null);
            }
            Intrinsics.copydefault((java.lang.Object) date$default);
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) date$default)) {
                arrayList.add(date$default);
                str = date$default;
            }
            arrayList.add(unreadMsg);
        }
        return arrayList;
    }
}
