package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.assets.utxo.utxoconfirmation.UTXOConfirmationUtil$handleUtxoConfirmation$1;
import com.okinc.business.defi.assets.utxo.utxoconfirmation.UTXOConfirmationUtil$onUtxoConfirmFinished$1;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationContext;
import com.okinc.business.invest_api.bean.InvestUtxoConfirmationItem;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10350bmm {
    public static final C10350bmm AEQbTJ = new C10350bmm();
    public static Activity EZpvd;
    public static SharedFlow<java.lang.Boolean> KWHzl;
    public static final int OLrzqt;
    public static MutableSharedFlow<java.lang.Boolean> copydefault;

    /* JADX INFO: renamed from: o.bmm$Activity */
    public interface Activity {
        void copydefault(@NotNull AbstractC10347bmj abstractC10347bmj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.Boolean> AEQbTJ() {
        return KWHzl;
    }

    private C10350bmm() {
    }

    static {
        MutableSharedFlow<java.lang.Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        copydefault = mutableSharedFlowMutableSharedFlow$default;
        KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        OLrzqt = 8;
    }

    public final AbstractC58185ywX<AbstractC10347bmj> EZpvd(@NotNull android.content.Context context, @NotNull C10314bmC c10314bmC, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c10314bmC, "");
        return KWHzl(context, c10314bmC.AEQbTJ(), c10314bmC.KWHzl(), c10314bmC.copydefault(), c10314bmC.EZpvd(), c10314bmC.djBIcL(), fragmentActivity, c10314bmC.OLrzqt());
    }

    public final AbstractC58185ywX<AbstractC10347bmj> KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, long j, java.lang.Integer num, @NotNull java.util.List<InvestUtxoConfirmationItem> list, boolean z, FragmentActivity fragmentActivity, @NotNull UtxoConfirmationContext utxoConfirmationContext) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(utxoConfirmationContext, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new UTXOConfirmationUtil$handleUtxoConfirmation$1(list, j, num, str, fragmentActivity, context, z, utxoConfirmationContext, null), 2, null);
        AbstractC58185ywX<AbstractC10347bmj> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C10350bmm.EZpvd(interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: renamed from: o.bmm$StateListAnimator */
    public static final class StateListAnimator implements Activity {
        public final /* synthetic */ InterfaceC58184ywW<AbstractC10347bmj> OLrzqt;

        public StateListAnimator(InterfaceC58184ywW<AbstractC10347bmj> interfaceC58184ywW) {
            this.OLrzqt = interfaceC58184ywW;
        }

        @Override // o.C10350bmm.Activity
        public void copydefault(AbstractC10347bmj abstractC10347bmj) {
            Intrinsics.checkNotNullParameter(abstractC10347bmj, "");
            this.OLrzqt.onNext(abstractC10347bmj);
            this.OLrzqt.onComplete();
        }
    }

    public static final void EZpvd(InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        EZpvd = new StateListAnimator(interfaceC58184ywW);
    }

    public final void AEQbTJ(@NotNull AbstractC10347bmj abstractC10347bmj) {
        Intrinsics.checkNotNullParameter(abstractC10347bmj, "");
        Activity activity = EZpvd;
        if (activity != null) {
            activity.copydefault(abstractC10347bmj);
        }
    }

    public final void copydefault(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new UTXOConfirmationUtil$onUtxoConfirmFinished$1(z, null), 3, null);
    }
}
