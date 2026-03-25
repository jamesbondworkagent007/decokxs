package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy.AdvancedMarketStrategy$initUI$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC30595leC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30793lhp extends AbstractC30796lhs {
    public final kRE AEQbTJ;
    public final C19700gMb copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C30793lhp(@NotNull kRE kre, @NotNull C19700gMb c19700gMb) {
        super(c19700gMb);
        Intrinsics.checkNotNullParameter(kre, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.AEQbTJ = kre;
        this.copydefault = c19700gMb;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC30796lhs, o.InterfaceC30792lho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C21668hHx c21668hHx, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdvancedMarketStrategy$initUI$1 advancedMarketStrategy$initUI$1;
        if (continuation instanceof AdvancedMarketStrategy$initUI$1) {
            advancedMarketStrategy$initUI$1 = (AdvancedMarketStrategy$initUI$1) continuation;
            int i = advancedMarketStrategy$initUI$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketStrategy$initUI$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketStrategy$initUI$1 = new AdvancedMarketStrategy$initUI$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedMarketStrategy$initUI$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketStrategy$initUI$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            advancedMarketStrategy$initUI$1.L$0 = c21668hHx;
            advancedMarketStrategy$initUI$1.label = 1;
            if (super.EZpvd(c21668hHx, advancedMarketStrategy$initUI$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21668hHx = (C21668hHx) advancedMarketStrategy$initUI$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C30795lhr c30795lhr = c21668hHx.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c30795lhr, "");
        c30795lhr.setVisibility(0);
        android.widget.ImageView imageView = c21668hHx.isConnected;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        C30800lhw c30800lhw = c21668hHx.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c30800lhw, "");
        c30800lhw.setVisibility(8);
        C30755lhD c30755lhD = c21668hHx.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c30755lhD, "");
        c30755lhD.setVisibility(8);
        c21668hHx.EZpvd.copydefault(AdvancedOrderType.MARKET);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC30792lho
    public java.lang.Object KWHzl(@NotNull C21668hHx c21668hHx, InterfaceC30595leC interfaceC30595leC, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        boolean z = (interfaceC30595leC instanceof InterfaceC30595leC.ContextWrapper) && !((InterfaceC30595leC.ContextWrapper) interfaceC30595leC).OLrzqt().AEQbTJ();
        int i = z ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl;
        ConstraintLayout constraintLayout = c21668hHx.values;
        boolean z2 = !z;
        constraintLayout.setEnabled(z2);
        constraintLayout.setClickable(z2);
        c21668hHx.AYXKKw.setTextColor(C25382ivf.KWHzl(i));
        DrawableCompat.setTint(c21668hHx.AkhnZx.getDrawable(), ContextCompat.getColor(constraintLayout.getContext(), i));
        c21668hHx.AEQbTJ.setDisabled(z);
        c21668hHx.djBIcL.setDisabled(z);
        c21668hHx.valueOf.setEnable(z2);
        return C56443yFo.KWHzl(false);
    }

    @Override // o.InterfaceC30792lho
    public boolean OLrzqt(@NotNull C30626leh c30626leh) {
        Intrinsics.checkNotNullParameter(c30626leh, "");
        return this.AEQbTJ.EZpvd(c30626leh);
    }
}
