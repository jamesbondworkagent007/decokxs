package o;

import com.okinc.business.invest_biz.data.bean.LearnCardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26471jcu extends C43316rmw {
    public C26471jcu(@NotNull Function1<? super LearnCardItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        register(LearnCardItem.class, new C26444jcT(function1));
    }
}
