package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardChoicesAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.rMP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rMP extends android.widget.FrameLayout {
    public final C42519rVw AEQbTJ;
    public final AbstractC43952ryw EZpvd;
    public final java.util.ArrayList<CardChoicesValue> KWHzl;
    public final C43316rmw OLrzqt;
    public rQO copydefault;
    public ViewStatus djBIcL;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rMP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rMP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.djBIcL = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:43) call: o.rMP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rMP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rMP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = ViewStatus.Form;
        this.KWHzl = new java.util.ArrayList<>();
        this.OLrzqt = new C43316rmw();
        this.AEQbTJ = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.gwTjWJ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43952ryw) viewDataBindingInflate;
    }

    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.lang.Boolean required;
        java.lang.String maxNumOfOptions;
        CardChoices choices;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final InputCardChoicesAppModel inputCardChoicesAppModel = uIComponentAppModel instanceof InputCardChoicesAppModel ? (InputCardChoicesAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.UeEOUB().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputCardChoicesAppModel != null ? inputCardChoicesAppModel.getId() : null))) {
                    rax.setValue(EZpvd());
                    boolean zBooleanValue = false;
                    if (inputCardChoicesAppModel != null && Intrinsics.EZpvd(inputCardChoicesAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(null);
                    } else {
                        setVisibility(0);
                        if (inputCardChoicesAppModel != null && (required = inputCardChoicesAppModel.getRequired()) != null) {
                            zBooleanValue = required.booleanValue();
                        }
                        rax.EZpvd(zBooleanValue);
                        rax.setValue(EZpvd());
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rMQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rMP.EZpvd(inputCardChoicesAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    C43316rmw c43316rmw = this.OLrzqt;
                    if (inputCardChoicesAppModel == null || (choices = inputCardChoicesAppModel.getChoices()) == null || (maxNumOfOptions = choices.getMaxNumOfOptions()) == null) {
                        maxNumOfOptions = "1";
                    }
                    c43316rmw.register(CardChoicesValue.class, new StateListAnimator(this, abstractC42074rFj, lifecycleOwner, C33129mqd.AhwBna(maxNumOfOptions), new Function1() { // from class: o.rMO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rMP.OLrzqt(rax, this, (CardChoicesValue) obj);
                        }
                    }));
                    OLrzqt((java.util.List<java.lang.String>) rax.getValue());
                }
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    public static final Unit EZpvd(InputCardChoicesAppModel inputCardChoicesAppModel, rMP rmp, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputCardChoicesAppModel != null ? inputCardChoicesAppModel.getId() : null) && rmp.getVisibility() == 8) {
                rmp.setVisibility(0);
                rax.EZpvd((inputCardChoicesAppModel == null || (required = inputCardChoicesAppModel.getRequired()) == null) ? false : required.booleanValue());
                rax.setValue(null);
                rmp.OLrzqt((java.util.List<java.lang.String>) rax.getValue());
                if (inputCardChoicesAppModel != null) {
                    inputCardChoicesAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputCardChoicesAppModel != null ? inputCardChoicesAppModel.getId() : null) && rmp.getVisibility() == 0) {
                rmp.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(null);
                rmp.OLrzqt((java.util.List<java.lang.String>) rax.getValue());
                if (inputCardChoicesAppModel != null) {
                    inputCardChoicesAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(rAX rax, rMP rmp, CardChoicesValue cardChoicesValue) {
        rax.setValue(rmp.EZpvd());
        return Unit.INSTANCE;
    }

    private final java.util.ArrayList<java.lang.String> EZpvd() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<CardChoicesValue> it = this.KWHzl.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            CardChoicesValue next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            CardChoicesValue cardChoicesValue = next;
            if (Intrinsics.EZpvd(cardChoicesValue.getSelected(), java.lang.Boolean.TRUE)) {
                arrayList.add(cardChoicesValue.getValue());
            }
        }
        return arrayList;
    }

    public final void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull rQO rqo) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(rqo, "");
        this.copydefault = rqo;
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.djBIcL, uIComponentAppModel.getBottomMargin()));
        InputCardChoicesAppModel inputCardChoicesAppModel = uIComponentAppModel instanceof InputCardChoicesAppModel ? (InputCardChoicesAppModel) uIComponentAppModel : null;
        if (inputCardChoicesAppModel != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inputCardChoicesAppModel.getLabel())) {
                this.EZpvd.OLrzqt.setText(inputCardChoicesAppModel.getLabel());
                this.EZpvd.OLrzqt.setVisibility(0);
            } else {
                this.EZpvd.OLrzqt.setVisibility(8);
            }
            C31695mAm c31695mAm = this.EZpvd.copydefault;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            android.content.Context context3 = c31695mAm.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c31695mAm.addItemDecoration(new C42521rVy(context3));
            c31695mAm.setAdapter(this.OLrzqt);
            CardChoices choices = inputCardChoicesAppModel.getChoices();
            if (choices != null) {
                java.util.List<CardChoicesValue> values = choices.getValues();
                if (values != null) {
                    this.KWHzl.addAll(values);
                }
                this.OLrzqt.setItems(this.KWHzl);
                this.OLrzqt.notifyDataSetChanged();
            }
        }
    }

    public final void EZpvd(@NotNull CardChoicesValue cardChoicesValue) {
        Intrinsics.checkNotNullParameter(cardChoicesValue, "");
        java.util.Iterator<CardChoicesValue> it = this.KWHzl.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            CardChoicesValue next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            CardChoicesValue cardChoicesValue2 = next;
            cardChoicesValue2.setSelected(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) cardChoicesValue.getValue(), (java.lang.Object) cardChoicesValue2.getValue())));
        }
        this.OLrzqt.notifyDataSetChanged();
    }

    public final void copydefault(boolean z, @NotNull CardChoicesValue cardChoicesValue) {
        Intrinsics.checkNotNullParameter(cardChoicesValue, "");
        cardChoicesValue.setSelected(java.lang.Boolean.valueOf(z));
        this.OLrzqt.notifyDataSetChanged();
    }

    public final void OLrzqt(java.util.List<java.lang.String> list) {
        java.util.Iterator<CardChoicesValue> it = this.KWHzl.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            CardChoicesValue next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            CardChoicesValue cardChoicesValue = next;
            cardChoicesValue.setSelected(list != null ? java.lang.Boolean.valueOf(list.contains(cardChoicesValue.getValue())) : null);
        }
        this.OLrzqt.notifyDataSetChanged();
    }

    public final ViewGroup.LayoutParams OLrzqt(android.view.View view, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = C55298xhM.dp2px$default(24.0f, null, 1, null);
        layoutParams2.height = C55298xhM.dp2px$default(24.0f, null, 1, null);
        if (str != null) {
            layoutParams2.width = C55298xhM.dp2px$default(C33129mqd.djBIcL(str), null, 1, null);
        }
        if (str2 != null) {
            layoutParams2.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(str2), null, 1, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "top")) {
            i = 48;
        } else {
            i = Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "bottom") ? 80 : 17;
        }
        layoutParams2.gravity = i;
        view.setLayoutParams(layoutParams2);
        return layoutParams2;
    }

    public final class StateListAnimator extends AbstractC43310rmq<CardChoicesValue, AbstractC43876rxZ> {
        public final LifecycleOwner AEQbTJ;
        public final Function1<CardChoicesValue, Unit> EZpvd;
        public final /* synthetic */ rMP KWHzl;
        public final AbstractC42074rFj OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.DXXBbs;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValue, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(rMP rmp, AbstractC42074rFj abstractC42074rFj, LifecycleOwner lifecycleOwner, @NotNull int i, Function1<? super CardChoicesValue, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = rmp;
            this.OLrzqt = abstractC42074rFj;
            this.AEQbTJ = lifecycleOwner;
            this.copydefault = i;
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43876rxZ> c43312rms, @NotNull final CardChoicesValue cardChoicesValue) {
            AbstractC42074rFj abstractC42074rFj;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(cardChoicesValue, "");
            super.onBindViewHolder((C43312rms) c43312rms, cardChoicesValue);
            if (Intrinsics.EZpvd(cardChoicesValue.getSelected(), java.lang.Boolean.TRUE)) {
                ((AbstractC43876rxZ) c43312rms.OLrzqt()).OLrzqt.setBackgroundResource(C43662rtX.Activity.DbNXlk);
            } else {
                ((AbstractC43876rxZ) c43312rms.OLrzqt()).OLrzqt.setBackgroundResource(C43662rtX.Activity.isConnected);
            }
            LinearLayoutCompat linearLayoutCompat = ((AbstractC43876rxZ) c43312rms.OLrzqt()).EZpvd;
            if (linearLayoutCompat != null) {
                linearLayoutCompat.removeAllViews();
            }
            rQR rqr = rQR.AEQbTJ;
            CardChoicesIcon icon = cardChoicesValue.getIcon();
            java.util.List<android.view.View> listEZpvd = null;
            android.graphics.drawable.Drawable drawableKWHzl = rqr.KWHzl(icon != null ? icon.getGraphic() : null, this.KWHzl.AEQbTJ);
            if (drawableKWHzl != null) {
                rMP rmp = this.KWHzl;
                ((AbstractC43876rxZ) c43312rms.OLrzqt()).copydefault.setVisibility(0);
                android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(drawableKWHzl.mutate());
                Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
                CardChoicesIcon icon2 = cardChoicesValue.getIcon();
                java.lang.Integer numCopydefault = rqr.copydefault(icon2 != null ? icon2.getRenderColor() : null, rmp.AEQbTJ);
                if (numCopydefault != null) {
                    DrawableCompat.setTint(drawableWrap, numCopydefault.intValue());
                }
                ((AbstractC43876rxZ) c43312rms.OLrzqt()).copydefault.setImageDrawable(drawableWrap);
                android.widget.ImageView imageView = ((AbstractC43876rxZ) c43312rms.OLrzqt()).copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                CardChoicesIcon icon3 = cardChoicesValue.getIcon();
                java.lang.String width = icon3 != null ? icon3.getWidth() : null;
                CardChoicesIcon icon4 = cardChoicesValue.getIcon();
                java.lang.String height = icon4 != null ? icon4.getHeight() : null;
                CardChoicesIcon icon5 = cardChoicesValue.getIcon();
                if (rmp.OLrzqt(imageView, width, height, icon5 != null ? icon5.getPosition() : null) == null) {
                    ((AbstractC43876rxZ) c43312rms.OLrzqt()).copydefault.setVisibility(8);
                    Unit unit = Unit.INSTANCE;
                }
            }
            java.util.List<UIComponentAppModel> contentList = cardChoicesValue.getContentList();
            if (contentList != null && !contentList.isEmpty() && (abstractC42074rFj = this.OLrzqt) != null && (abstractC42074rFj instanceof rGL) && this.AEQbTJ != null) {
                rGL.setUpFormWithAppModel$default((rGL) abstractC42074rFj, cardChoicesValue.getContentList(), null, 2, null);
                ((UIComponentAppModel) CollectionsKt___CollectionsKt.AubY(cardChoicesValue.getContentList())).setBottomMargin(java.lang.Float.valueOf(0.0f));
                rQO rqo = this.KWHzl.copydefault;
                if (rqo != null) {
                    android.content.Context context = this.KWHzl.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    listEZpvd = rqo.EZpvd(context, cardChoicesValue.getContentList(), this.OLrzqt, this.AEQbTJ, ViewStatus.Card);
                }
                if (listEZpvd != null) {
                    for (android.view.View view : listEZpvd) {
                        LinearLayoutCompat linearLayoutCompat2 = ((AbstractC43876rxZ) c43312rms.OLrzqt()).EZpvd;
                        if (linearLayoutCompat2 != null) {
                            linearLayoutCompat2.addView(view);
                        }
                    }
                }
            }
            LinearLayoutCompat linearLayoutCompat3 = ((AbstractC43876rxZ) c43312rms.OLrzqt()).OLrzqt;
            final rMP rmp2 = this.KWHzl;
            linearLayoutCompat3.setOnClickListener(new View.OnClickListener() { // from class: o.rMN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    rMP.StateListAnimator.EZpvd(cardChoicesValue, this, rmp2, view2);
                }
            });
        }

        public static final void EZpvd(CardChoicesValue cardChoicesValue, StateListAnimator stateListAnimator, rMP rmp, android.view.View view) {
            if (Intrinsics.EZpvd(cardChoicesValue.getSelected(), java.lang.Boolean.FALSE)) {
                if (stateListAnimator.copydefault > 1) {
                    rmp.copydefault(true, cardChoicesValue);
                } else {
                    rmp.EZpvd(cardChoicesValue);
                }
                stateListAnimator.EZpvd.invoke(cardChoicesValue);
                return;
            }
            if (stateListAnimator.copydefault > 1) {
                rmp.copydefault(false, cardChoicesValue);
                stateListAnimator.EZpvd.invoke(cardChoicesValue);
            }
        }
    }
}
