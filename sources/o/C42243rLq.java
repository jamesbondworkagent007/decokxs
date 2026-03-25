package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ColumnsAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rLq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42243rLq extends android.widget.FrameLayout {
    public rQO AEQbTJ;
    public final AbstractC43882rxf EZpvd;
    public ViewStatus copydefault;

    /* JADX INFO: renamed from: o.rLq$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42243rLq(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42243rLq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.copydefault = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.rLq.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42243rLq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42243rLq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.djSkpj, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43882rxf) viewDataBindingInflate;
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            final ColumnsAppModel columnsAppModel = uIComponentAppModel instanceof ColumnsAppModel ? (ColumnsAppModel) uIComponentAppModel : null;
            if (columnsAppModel != null) {
                rGL rgl = (rGL) abstractC42074rFj;
                java.util.Iterator<T> it = rgl.dNCPSb().iterator();
                while (it.hasNext()) {
                    rAX rax = (rAX) it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) columnsAppModel.getId())) {
                        java.lang.String value = columnsAppModel.getValue();
                        if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                            value = null;
                        }
                        rax.setValue(value);
                        rgl.gasjUx().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.rLu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42243rLq.EZpvd(columnsAppModel, this, (C42156rIk) obj);
                            }
                        }));
                        if (Intrinsics.EZpvd(columnsAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                            setVisibility(8);
                        } else {
                            setVisibility(0);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            ColumnsAppModel columnsAppModel2 = uIComponentAppModel instanceof ColumnsAppModel ? (ColumnsAppModel) uIComponentAppModel : null;
            if (columnsAppModel2 != null) {
                java.util.Iterator<T> it2 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) columnsAppModel2.getId())) {
                        java.lang.String value2 = columnsAppModel2.getValue();
                        if (!java.lang.Boolean.valueOf(!(value2 == null || value2.length() == 0)).booleanValue()) {
                            value2 = null;
                        }
                        rax2.setValue(value2);
                    }
                }
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof rIM) {
            ColumnsAppModel columnsAppModel3 = uIComponentAppModel instanceof ColumnsAppModel ? (ColumnsAppModel) uIComponentAppModel : null;
            if (columnsAppModel3 != null) {
                java.util.Iterator<T> it3 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it3.hasNext()) {
                    rAX rax3 = (rAX) it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) columnsAppModel3.getId())) {
                        java.lang.String value3 = columnsAppModel3.getValue();
                        if (!java.lang.Boolean.valueOf(!(value3 == null || value3.length() == 0)).booleanValue()) {
                            value3 = null;
                        }
                        rax3.setValue(value3);
                    }
                }
            }
        }
    }

    public static final Unit EZpvd(ColumnsAppModel columnsAppModel, C42243rLq c42243rLq, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(columnsAppModel.getId()) && c42243rLq.getVisibility() == 8) {
            c42243rLq.setVisibility(0);
            columnsAppModel.setHidden(java.lang.Boolean.FALSE);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(columnsAppModel.getId()) && c42243rLq.getVisibility() == 0) {
            c42243rLq.setVisibility(8);
            columnsAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull UIComponentAppModel uIComponentAppModel, AbstractC42074rFj abstractC42074rFj, LifecycleOwner lifecycleOwner, @NotNull rQO rqo) {
        java.util.List<android.view.View> listAEQbTJ;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(rqo, "");
        this.AEQbTJ = rqo;
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.copydefault, uIComponentAppModel.getBottomMargin()));
        if ((uIComponentAppModel instanceof ColumnsAppModel ? (ColumnsAppModel) uIComponentAppModel : null) != null) {
            ConstraintLayout constraintLayout = this.EZpvd.KWHzl;
            constraintLayout.setVisibility(0);
            ColumnsAppModel columnsAppModel = (ColumnsAppModel) uIComponentAppModel;
            constraintLayout.setContentDescription(columnsAppModel.getId());
            constraintLayout.removeAllViews();
            if (columnsAppModel.getItems().isEmpty()) {
                return;
            }
            java.util.List<? extends UIComponentAppModel> listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) columnsAppModel.getItems(), 5);
            if (abstractC42074rFj != null && lifecycleOwner != null) {
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                listAEQbTJ = rqo.EZpvd(context3, listAhwBna, abstractC42074rFj, lifecycleOwner, ViewStatus.Card);
            } else {
                listAEQbTJ = rqo.AEQbTJ(fragmentActivity, listAhwBna, ViewStatus.Card);
            }
            if (listAEQbTJ == null || listAEQbTJ.isEmpty()) {
                return;
            }
            int size = listAEQbTJ.size();
            int[] iArr = new int[size];
            boolean z = columnsAppModel.getAlign() == UIAlignment.Leading;
            int i = 0;
            for (java.lang.Object obj : listAEQbTJ) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                android.view.View view = (android.view.View) obj;
                view.setId(android.view.View.generateViewId());
                iArr[i] = view.getId();
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.constrainedWidth = true;
                if (z && i > 0) {
                    android.content.Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    layoutParams.setMarginStart(C55298xhM.copydefault(8.0f, context4));
                }
                this.EZpvd.KWHzl.addView(view, layoutParams);
                i++;
            }
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this.EZpvd.KWHzl);
            int i2 = iArr[0];
            for (int i3 = 0; i3 < size; i3++) {
                constraintSet.centerVertically(iArr[i3], i2);
            }
            constraintSet.centerVertically(i2, 0);
            if (z) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < size) {
                    constraintSet.connect(iArr[i4], 6, i5 == 0 ? 0 : iArr[i5 - 1], i5 == 0 ? 6 : 7);
                    i4++;
                    i5++;
                }
            } else {
                int i6 = 0;
                int i7 = 0;
                while (i6 < size) {
                    int i8 = iArr[i6];
                    int i9 = i7 + 1;
                    constraintSet.connect(i8, 6, i7 == 0 ? 0 : iArr[i7 - 1], i7 == 0 ? 6 : 7);
                    int i10 = size - 1;
                    constraintSet.connect(i8, 7, i7 == i10 ? 0 : iArr[i9], i7 == i10 ? 7 : 6);
                    i6++;
                    i7 = i9;
                }
                constraintSet.setHorizontalChainStyle(iArr[0], 1);
            }
            constraintSet.applyTo(this.EZpvd.KWHzl);
        }
    }
}
