package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.invest_biz.app.InvestHomePageStatusExtensionImpl$onHomeCreated$isHidden$1;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25507ixy extends AbstractC43215rlA implements InterfaceC9770bbp, InterfaceC23608iCr {
    public C23611iCu<InvestTransactionModel> EZpvd;
    public iBJ OLrzqt = new iBJ();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ixz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25507ixy.AEQbTJ();
        }
    });
    public final Observer<InvestTransactionModel> AEQbTJ = new Observer() { // from class: o.ixw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            C25507ixy.AEQbTJ(this.EZpvd, (InvestTransactionModel) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC23608iCr
    public iBJ EZpvd() {
        return this.OLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC9774bbt> OLrzqt() {
        return (java.util.List) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List AEQbTJ() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9774bbt.class));
    }

    public static final void AEQbTJ(C25507ixy c25507ixy, InvestTransactionModel investTransactionModel) {
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        if (C54819xWm.KWHzl().AEQbTJ() == null || C54819xWm.KWHzl().AEQbTJ().isDestroyed()) {
            return;
        }
        iBJ ibj = c25507ixy.OLrzqt;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        ibj.AEQbTJ(activityAEQbTJ, investTransactionModel);
    }

    @Override // o.InterfaceC9770bbp
    public void AEQbTJ(@NotNull FragmentActivity fragmentActivity) {
        C23614iCx<InvestTransactionModel> c23614iCxKWHzl;
        C23614iCx<InvestTransactionModel> c23614iCxKWHzl2;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        if (((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new InvestHomePageStatusExtensionImpl$onHomeCreated$isHidden$1(this, null), 1, null)).booleanValue()) {
            return;
        }
        C23611iCu<InvestTransactionModel> c23611iCu = this.EZpvd;
        if (c23611iCu != null) {
            if (c23611iCu != null && (c23614iCxKWHzl2 = c23611iCu.KWHzl()) != null) {
                c23614iCxKWHzl2.removeObserver(this.AEQbTJ);
            }
            C23611iCu<InvestTransactionModel> c23611iCu2 = this.EZpvd;
            if (c23611iCu2 != null) {
                c23611iCu2.OLrzqt();
            }
            this.EZpvd = null;
        }
        ViewModel viewModel = new ViewModelProvider(fragmentActivity, (ViewModelProvider.Factory) new StateListAnimator("invest-tx-status-toast", ActionBar.OLrzqt).invoke()).get(C23611iCu.class);
        Intrinsics.copydefault(viewModel, "");
        C23611iCu<InvestTransactionModel> c23611iCu3 = (C23611iCu) viewModel;
        this.EZpvd = c23611iCu3;
        if (c23611iCu3 == null || (c23614iCxKWHzl = c23611iCu3.KWHzl()) == null) {
            return;
        }
        c23614iCxKWHzl.observeForever(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.ixy$ActionBar */
    public static final class ActionBar implements Function1<java.lang.String, InvestTransactionModel> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final InvestTransactionModel invoke(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InvestTransactionModel.Companion.serializer(), str);
        }
    }

    @Override // o.InterfaceC9770bbp
    public void KWHzl(@NotNull FragmentActivity fragmentActivity) {
        C23614iCx<InvestTransactionModel> c23614iCxKWHzl;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        C23611iCu<InvestTransactionModel> c23611iCu = this.EZpvd;
        if (c23611iCu != null && (c23614iCxKWHzl = c23611iCu.KWHzl()) != null) {
            c23614iCxKWHzl.removeObserver(this.AEQbTJ);
        }
        C23611iCu<InvestTransactionModel> c23611iCu2 = this.EZpvd;
        if (c23611iCu2 != null) {
            c23611iCu2.OLrzqt();
        }
        this.EZpvd = null;
    }

    /* JADX INFO: renamed from: o.ixy$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator implements Function0<java.lang.Object> {
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.lang.String str, Function1 function1) {
            this.copydefault = str;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.ixy$StateListAnimator$4] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass4 invoke() {
            final java.lang.String str = this.copydefault;
            final Function1 function1 = this.KWHzl;
            return new ViewModelProvider.Factory() { // from class: o.ixy.StateListAnimator.4
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(java.lang.Class<T> cls) {
                    Intrinsics.checkNotNullParameter(cls, "");
                    return new C23611iCu(str, function1);
                }
            };
        }
    }
}
