package o;

import com.okinc.business.invest_biz.repository.InvestIndependentCheckFlowRepository$startSignalCheckInvestFlow$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23944iPc {
    public final iGF AEQbTJ;
    public final C23946iPe EZpvd;

    @yCM
    public C23944iPc(@NotNull C23946iPe c23946iPe, @NotNull iGF igf) {
        Intrinsics.checkNotNullParameter(c23946iPe, "");
        Intrinsics.checkNotNullParameter(igf, "");
        this.EZpvd = c23946iPe;
        this.AEQbTJ = igf;
    }

    public static /* synthetic */ void startSignalCheckInvestFlow$default(C23944iPc c23944iPc, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, long j, boolean z, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            coroutineScope = GlobalScope.INSTANCE;
        }
        c23944iPc.copydefault(context, fragmentManager, j, z2, coroutineScope);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, long j, boolean z, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new InvestIndependentCheckFlowRepository$startSignalCheckInvestFlow$1(this, j, context, fragmentManager, coroutineScope, z, null), 3, null);
    }
}
