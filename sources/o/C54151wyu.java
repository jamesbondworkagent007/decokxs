package o;

import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter;
import kotlin.jvm.internal.Intrinsics;
import o.C54143wym;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54151wyu implements InterfaceC54501xKt<C54143wym.Activity, AutoEarnProfitPresenter.TaskDescription> {
    public java.lang.String OLrzqt = "auto_education_single_earn";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    @yCM
    public C54151wyu() {
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    public AutoEarnProfitPresenter.TaskDescription KWHzl(@NotNull C54143wym.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.util.List<AutoEarnOverView> listOLrzqt = activity.OLrzqt();
        java.util.List<AutoEarnOverView> listOLrzqt2 = activity.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
        java.util.Iterator<T> it = listOLrzqt2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AutoEarnOverView) it.next()).getCcy());
        }
        return new AutoEarnProfitPresenter.TaskDescription(listOLrzqt, arrayList);
    }
}
