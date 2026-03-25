package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_notifications.viewmodel.MineLikesViewModel$requestMineLikes$1;
import com.okinc.planet.domain.remote.dto.MineLikesBean;
import com.okinc.planet.domain.remote.dto.MineLikesResp;
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

/* JADX INFO: renamed from: o.tzI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47921tzI extends AbstractC33073mpa implements InterfaceC47918tzF {
    public final MutableLiveData<java.lang.String> KWHzl;
    public final MutableLiveData<C47914tzB> OLrzqt;
    public final tQY copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47921tzI() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47918tzF
    public MutableLiveData<C47914tzB> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47918tzF
    public MutableLiveData<java.lang.String> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.tQY:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tQY:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:23) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DaRZkR():o.tQY A[MD:():o.tQY (m), WRAPPED] (LINE:23)) : (r1v0 o.tQY))
 A[MD:(o.tQY):void (m)] (LINE:22) call: o.tzI.<init>(o.tQY):void type: THIS */
    public /* synthetic */ C47921tzI(tQY tqy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.DaRZkR() : tqy);
    }

    public C47921tzI(@NotNull tQY tqy) {
        Intrinsics.checkNotNullParameter(tqy, "");
        this.copydefault = tqy;
        this.OLrzqt = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
    }

    @Override // o.InterfaceC47918tzF
    public void EZpvd(boolean z) {
        if (z) {
            EZpvd().setValue(new C47914tzB(StatefulView.Status.Loading, yDY.AhwBna(), null, true));
        }
        KWHzl(null, new Function1() { // from class: o.tzL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47921tzI.OLrzqt(this.AEQbTJ, (MineLikesResp) obj);
            }
        }, new Function1() { // from class: o.tzP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47921tzI.AEQbTJ(this.KWHzl, (java.lang.Exception) obj);
            }
        });
    }

    public static final Unit OLrzqt(C47921tzI c47921tzI, MineLikesResp mineLikesResp) {
        C47914tzB c47914tzB;
        Intrinsics.checkNotNullParameter(mineLikesResp, "");
        java.util.List<java.lang.Object> listOLrzqt = c47921tzI.OLrzqt(mineLikesResp.getMyLikeList());
        if (listOLrzqt.isEmpty()) {
            c47914tzB = new C47914tzB(StatefulView.Status.Empty, yDY.AhwBna(), null, true);
        } else {
            c47914tzB = new C47914tzB(StatefulView.Status.Content, listOLrzqt, mineLikesResp.getCursor(), true);
        }
        c47921tzI.EZpvd().setValue(c47914tzB);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C47921tzI c47921tzI, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c47921tzI.EZpvd().setValue(new C47914tzB(StatefulView.Status.Error, yDY.AhwBna(), null, true));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC47918tzF
    public boolean OLrzqt() {
        C47914tzB value = EZpvd().getValue();
        if (value == null || value.OLrzqt() != StatefulView.Status.Content || !value.KWHzl()) {
            return false;
        }
        KWHzl(value.copydefault(), new Function1() { // from class: o.tzN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47921tzI.EZpvd(this.AEQbTJ, (MineLikesResp) obj);
            }
        }, new Function1() { // from class: o.tzO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47921tzI.KWHzl(this.AEQbTJ, (java.lang.Exception) obj);
            }
        });
        return true;
    }

    public static final Unit EZpvd(C47921tzI c47921tzI, MineLikesResp mineLikesResp) {
        Intrinsics.checkNotNullParameter(mineLikesResp, "");
        C47914tzB value = c47921tzI.EZpvd().getValue();
        Intrinsics.copydefault(value);
        c47921tzI.EZpvd().setValue(new C47914tzB(StatefulView.Status.Content, C47917tzE.AEQbTJ(value.AEQbTJ(), c47921tzI.OLrzqt(mineLikesResp.getMyLikeList())), mineLikesResp.getCursor(), false));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C47921tzI c47921tzI, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c47921tzI.copydefault().setValue(exc.getMessage());
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, Function1<? super MineLikesResp, Unit> function1, Function1<? super java.lang.Exception, Unit> function12) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MineLikesViewModel$requestMineLikes$1(this, str, function1, function12, null), 3, null);
    }

    public final java.util.List<java.lang.Object> OLrzqt(@NotNull java.util.List<MineLikesBean> list) {
        java.lang.String date$default;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.List<MineLikesBean> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator());
        java.util.ArrayList arrayList = new java.util.ArrayList(listEZpvd.size() * 2);
        java.lang.String str = null;
        for (MineLikesBean mineLikesBean : listEZpvd) {
            long likeTime = mineLikesBean.getLikeTime();
            mineLikesBean.setLocalFormatedTime(pTA.formatTime$default(new Date(likeTime), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
            if (android.text.format.DateUtils.isToday(likeTime)) {
                date$default = C32979mnm.EZpvd.OLrzqt().getString(C47501trL.Fragment.glVQsU);
            } else {
                date$default = pTA.formatDate$default(new Date(likeTime), OKDateEnum.DATE_FORMAT_STANDARD, null, null, 6, null);
            }
            Intrinsics.copydefault((java.lang.Object) date$default);
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) date$default)) {
                arrayList.add(date$default);
                str = date$default;
            }
            arrayList.add(mineLikesBean);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.tzI$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((MineLikesBean) t2).getLikeTime()), java.lang.Long.valueOf(((MineLikesBean) t).getLikeTime()));
        }
    }
}
