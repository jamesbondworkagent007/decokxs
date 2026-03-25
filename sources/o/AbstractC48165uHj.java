package o;

import androidx.core.view.KeyEventDispatcher;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48165uHj<Binding extends ViewDataBinding, Presenter extends BaseBotOrderPresenter> extends AbstractC54505xKx<Binding, Presenter> {
    public boolean AuCTel = true;
    public boolean fIwbmz = true;

    /* JADX INFO: renamed from: o.uHj$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public void AEQbTJ(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AuCTel = z;
    }

    public android.view.View gEmmrt() {
        return null;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        dxcTrN().EZpvd(getArguments());
        super.onViewCreated(view, bundle);
        AEQbTJ();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        android.view.ViewGroup viewGroupValues;
        super.onVisible();
        if (!this.AuCTel) {
            this.AuCTel = true;
            return;
        }
        android.view.View viewGEmmrt = gEmmrt();
        if (viewGEmmrt != null) {
            KeyEventDispatcher.Component activity = getActivity();
            InterfaceC55882xsN interfaceC55882xsN = activity instanceof InterfaceC55882xsN ? (InterfaceC55882xsN) activity : null;
            if (interfaceC55882xsN == null || (viewGroupValues = interfaceC55882xsN.values()) == null) {
                return;
            }
            viewGroupValues.addView(viewGEmmrt);
            if (AkhnZx()) {
                wPQ.OLrzqt(viewGroupValues);
            } else {
                viewGroupValues.setPadding(0, viewGroupValues.getPaddingTop(), 0, viewGroupValues.getPaddingBottom());
            }
            viewGEmmrt.invalidate();
        }
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        android.view.ViewGroup viewGroupValues;
        super.onInvisible();
        if (this.AuCTel) {
            KeyEventDispatcher.Component activity = getActivity();
            InterfaceC55882xsN interfaceC55882xsN = activity instanceof InterfaceC55882xsN ? (InterfaceC55882xsN) activity : null;
            if (interfaceC55882xsN == null || (viewGroupValues = interfaceC55882xsN.values()) == null) {
                return;
            }
            viewGroupValues.removeAllViews();
        }
    }

    private final void AEQbTJ() {
        Function1 function1 = new Function1() { // from class: o.uHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC48165uHj.AEQbTJ(this.AEQbTJ, (ParamBuilder) obj);
            }
        };
        ParamBuilder value = finit().values().getValue();
        if (value != null) {
            function1.invoke(value);
        }
        C56111xwe<ParamBuilder> c56111xweValues = finit().values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweValues.observe(viewLifecycleOwner, new ActionBar(function1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(AbstractC48165uHj abstractC48165uHj, ParamBuilder paramBuilder) {
        boolean zIsSwitchCoin = paramBuilder != null ? paramBuilder.isSwitchCoin() : false;
        if (abstractC48165uHj.EZpvd(paramBuilder)) {
            BaseBotOrderPresenter baseBotOrderPresenter = (BaseBotOrderPresenter) abstractC48165uHj.dxcTrN();
            java.lang.String instType = paramBuilder != null ? paramBuilder.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            java.lang.String instId = paramBuilder != null ? paramBuilder.getInstId() : null;
            baseBotOrderPresenter.OLrzqt(instType, instId != null ? instId : "");
        }
        abstractC48165uHj.AEQbTJ(zIsSwitchCoin);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(ParamBuilder paramBuilder) {
        return paramBuilder != null && paramBuilder.isSwitchCoin() && C33129mqd.OLrzqt((java.lang.CharSequence) paramBuilder.getInstType()) && C33129mqd.OLrzqt((java.lang.CharSequence) paramBuilder.getInstId());
    }
}
