package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_notifications.viewmodel.MineCommentsViewModel$requestMineComments$1;
import com.okinc.planet.domain.remote.dto.MineCommentBean;
import com.okinc.planet.domain.remote.dto.MineCommentsResp;
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

/* JADX INFO: renamed from: o.tzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47916tzD extends AbstractC33073mpa implements InterfaceC47918tzF {
    public final MutableLiveData<C47914tzB> AEQbTJ;
    public final MutableLiveData<java.lang.String> EZpvd;
    public final tQW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47916tzD() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47918tzF
    public MutableLiveData<C47914tzB> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47918tzF
    public MutableLiveData<java.lang.String> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.tQW:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tQW:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:23) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DGgnkA():o.tQW A[MD:():o.tQW (m), WRAPPED] (LINE:23)) : (r1v0 o.tQW))
 A[MD:(o.tQW):void (m)] (LINE:22) call: o.tzD.<init>(o.tQW):void type: THIS */
    public /* synthetic */ C47916tzD(tQW tqw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.DGgnkA() : tqw);
    }

    public C47916tzD(@NotNull tQW tqw) {
        Intrinsics.checkNotNullParameter(tqw, "");
        this.copydefault = tqw;
        this.AEQbTJ = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
    }

    @Override // o.InterfaceC47918tzF
    public void EZpvd(boolean z) {
        if (z) {
            EZpvd().setValue(new C47914tzB(StatefulView.Status.Loading, yDY.AhwBna(), null, true));
        }
        EZpvd(null, new Function1() { // from class: o.tzJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47916tzD.KWHzl(this.KWHzl, (MineCommentsResp) obj);
            }
        }, new Function1() { // from class: o.tzH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47916tzD.EZpvd(this.KWHzl, (java.lang.Exception) obj);
            }
        });
    }

    public static final Unit KWHzl(C47916tzD c47916tzD, MineCommentsResp mineCommentsResp) {
        C47914tzB c47914tzB;
        Intrinsics.checkNotNullParameter(mineCommentsResp, "");
        java.util.List<java.lang.Object> listEZpvd = c47916tzD.EZpvd(mineCommentsResp.getMyReplyList());
        if (listEZpvd.isEmpty()) {
            c47914tzB = new C47914tzB(StatefulView.Status.Empty, yDY.AhwBna(), null, true);
        } else {
            c47914tzB = new C47914tzB(StatefulView.Status.Content, listEZpvd, mineCommentsResp.getCursor(), true);
        }
        c47916tzD.EZpvd().setValue(c47914tzB);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C47916tzD c47916tzD, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c47916tzD.EZpvd().setValue(new C47914tzB(StatefulView.Status.Error, yDY.AhwBna(), null, true));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC47918tzF
    public boolean OLrzqt() {
        C47914tzB value = EZpvd().getValue();
        if (value == null || value.OLrzqt() != StatefulView.Status.Content || !value.KWHzl()) {
            return false;
        }
        EZpvd(value.copydefault(), new Function1() { // from class: o.tzK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47916tzD.OLrzqt(this.AEQbTJ, (MineCommentsResp) obj);
            }
        }, new Function1() { // from class: o.tzG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47916tzD.KWHzl(this.KWHzl, (java.lang.Exception) obj);
            }
        });
        return true;
    }

    public static final Unit OLrzqt(C47916tzD c47916tzD, MineCommentsResp mineCommentsResp) {
        Intrinsics.checkNotNullParameter(mineCommentsResp, "");
        C47914tzB value = c47916tzD.EZpvd().getValue();
        Intrinsics.copydefault(value);
        c47916tzD.EZpvd().setValue(new C47914tzB(StatefulView.Status.Content, C47917tzE.AEQbTJ(value.AEQbTJ(), c47916tzD.EZpvd(mineCommentsResp.getMyReplyList())), mineCommentsResp.getCursor(), false));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C47916tzD c47916tzD, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c47916tzD.copydefault().setValue(exc.getMessage());
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str, Function1<? super MineCommentsResp, Unit> function1, Function1<? super java.lang.Exception, Unit> function12) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MineCommentsViewModel$requestMineComments$1(this, str, function1, function12, null), 3, null);
    }

    public final java.util.List<java.lang.Object> EZpvd(@NotNull java.util.List<MineCommentBean> list) {
        java.lang.String date$default;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.List<MineCommentBean> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new Activity());
        java.util.ArrayList arrayList = new java.util.ArrayList(listEZpvd.size() * 2);
        java.lang.String str = null;
        for (MineCommentBean mineCommentBean : listEZpvd) {
            long replyTime = mineCommentBean.getReplyTime();
            mineCommentBean.setLocalFormatedTime(pTA.formatTime$default(new Date(replyTime), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
            if (android.text.format.DateUtils.isToday(replyTime)) {
                date$default = C32979mnm.EZpvd.OLrzqt().getString(C47501trL.Fragment.glVQsU);
            } else {
                date$default = pTA.formatDate$default(new Date(replyTime), OKDateEnum.DATE_FORMAT_STANDARD, null, null, 6, null);
            }
            Intrinsics.copydefault((java.lang.Object) date$default);
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) date$default)) {
                arrayList.add(date$default);
                str = date$default;
            }
            arrayList.add(mineCommentBean);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.tzD$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((MineCommentBean) t2).getReplyTime()), java.lang.Long.valueOf(((MineCommentBean) t).getReplyTime()));
        }
    }
}
