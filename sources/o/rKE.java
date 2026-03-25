package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rKE extends android.widget.FrameLayout {
    public final AbstractC43814rwQ EZpvd;
    public ViewStatus OLrzqt;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AlertStyle.values().length];
            try {
                iArr[AlertStyle.Warning.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AlertStyle.Error.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertStyle.Info.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.OLrzqt = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rKE(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.OcIXYQ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43814rwQ) viewDataBindingInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rKE(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.OcIXYQ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43814rwQ) viewDataBindingInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rKE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.OcIXYQ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43814rwQ) viewDataBindingInflate;
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final AlertAppModel alertAppModel = uIComponentAppModel instanceof AlertAppModel ? (AlertAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (alertAppModel != null ? alertAppModel.getId() : null))) {
                    rax.setValue(null);
                }
            }
            if (alertAppModel != null && Intrinsics.EZpvd(alertAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            rgl.gasjUx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rKF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rKE.EZpvd(alertAppModel, this, (C42156rIk) obj);
                }
            }));
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                java.util.Iterator<T> it2 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (alertAppModel != null ? alertAppModel.getId() : null))) {
                        rax2.setValue(null);
                    }
                }
                return;
            }
            return;
        }
        java.util.Iterator<T> it3 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
        while (it3.hasNext()) {
            rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (alertAppModel != null ? alertAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public static final Unit EZpvd(AlertAppModel alertAppModel, rKE rke, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), alertAppModel != null ? alertAppModel.getId() : null) && rke.getVisibility() == 8) {
                rke.setVisibility(0);
                if (alertAppModel != null) {
                    alertAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), alertAppModel != null ? alertAppModel.getId() : null) && rke.getVisibility() == 0) {
                rke.setVisibility(8);
                if (alertAppModel != null) {
                    alertAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.OLrzqt, uIComponentAppModel.getBottomMargin()));
        AlertAppModel alertAppModel = uIComponentAppModel instanceof AlertAppModel ? (AlertAppModel) uIComponentAppModel : null;
        if (alertAppModel != null) {
            C55097xdX c55097xdX = this.EZpvd.OLrzqt;
            c55097xdX.setType(4);
            c55097xdX.setState(2);
            c55097xdX.setTitle("This is successful!");
            c55097xdX.setMessage("Withdrawal successful: the process has been completed.");
            c55097xdX.setCloseBtnShow(false);
            C55097xdX c55097xdX2 = this.EZpvd.OLrzqt;
            java.lang.Boolean showBg = alertAppModel.getShowBg();
            if (showBg != null) {
                if (showBg.booleanValue()) {
                    AlertStyle style = alertAppModel.getStyle();
                    int i = style == null ? -1 : Application.EZpvd[style.ordinal()];
                    if (i == -1) {
                        c55097xdX2.setType(0);
                    } else if (i == 1) {
                        c55097xdX2.setType(2);
                    } else if (i == 2) {
                        c55097xdX2.setType(3);
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c55097xdX2.setType(1);
                    }
                } else {
                    c55097xdX2.setType(0);
                }
            }
            java.lang.Boolean showIcon = alertAppModel.getShowIcon();
            if (showIcon != null) {
                if (showIcon.booleanValue()) {
                    AlertStyle style2 = alertAppModel.getStyle();
                    int i2 = style2 == null ? -1 : Application.EZpvd[style2.ordinal()];
                    if (i2 == -1) {
                        c55097xdX2.setState(0);
                    } else if (i2 == 1) {
                        c55097xdX2.setState(5);
                    } else if (i2 == 2) {
                        c55097xdX2.setState(3);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c55097xdX2.setState(4);
                    }
                } else {
                    c55097xdX2.setState(0);
                }
            }
            java.lang.String message = alertAppModel.getMessage();
            if (message != null) {
                c55097xdX2.setTitle(message);
            }
            java.lang.String description = alertAppModel.getDescription();
            if (description != null) {
                c55097xdX2.setMessage(description);
            }
        }
    }
}
