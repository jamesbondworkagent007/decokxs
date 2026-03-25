package o;

import com.okinc.business.defi.api.bean.SignCheckResponseBean;
import com.okinc.business.defi.api.bean.SignRequestBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9856bdV extends InterfaceC43217rlC {
    AbstractC58185ywX<java.lang.Integer> AEQbTJ(int i);

    AbstractC58185ywX<SignCheckResponseBean> AEQbTJ(@NotNull java.lang.String str, int i);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull SignRequestBean signRequestBean, @NotNull Function1<? super SignCheckResponseBean, Unit> function1);

    void KWHzl(@NotNull android.content.Context context, @NotNull SignRequestBean signRequestBean, @NotNull Function1<? super SignCheckResponseBean, Unit> function1);

    void copydefault(@NotNull android.content.Context context, @NotNull SignRequestBean signRequestBean, @NotNull Function1<? super SignCheckResponseBean, Unit> function1);
}
