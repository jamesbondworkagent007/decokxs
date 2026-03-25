package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.TextColor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import o.rMT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rMT extends android.widget.FrameLayout {
    public final java.util.ArrayList<Value> AEQbTJ;
    public final C42519rVw EZpvd;
    public final C43316rmw KWHzl;
    public final AbstractC43936ryg OLrzqt;
    public ViewStatus copydefault;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rMT(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rMT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:50) call: o.rMT.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rMT(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rMT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new java.util.ArrayList<>();
        this.KWHzl = new C43316rmw();
        this.copydefault = ViewStatus.Form;
        this.EZpvd = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.OuxcSI, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC43936ryg) viewDataBindingInflate;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.lang.Boolean required;
        java.lang.String id;
        java.lang.Boolean alwaysShowTip;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final InputCardSelectAppModel inputCardSelectAppModel = uIComponentAppModel instanceof InputCardSelectAppModel ? (InputCardSelectAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputCardSelectAppModel != null ? inputCardSelectAppModel.getId() : null))) {
                    rax.setValue(inputCardSelectAppModel != null ? inputCardSelectAppModel.getValue() : null);
                    boolean zBooleanValue = false;
                    if (inputCardSelectAppModel != null && Intrinsics.EZpvd(inputCardSelectAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(null);
                    } else {
                        setVisibility(0);
                        rax.EZpvd((inputCardSelectAppModel == null || (required = inputCardSelectAppModel.getRequired()) == null) ? false : required.booleanValue());
                        java.lang.String value = inputCardSelectAppModel != null ? inputCardSelectAppModel.getValue() : null;
                        if (!java.lang.Boolean.valueOf(true ^ (value == null || value.length() == 0)).booleanValue()) {
                            value = null;
                        }
                        rax.setValue(value);
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.rMU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rMT.EZpvd(inputCardSelectAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    C43316rmw c43316rmw = this.KWHzl;
                    if (inputCardSelectAppModel == null || (id = inputCardSelectAppModel.getId()) == null) {
                        id = "";
                    }
                    if (inputCardSelectAppModel != null && (alwaysShowTip = inputCardSelectAppModel.getAlwaysShowTip()) != null) {
                        zBooleanValue = alwaysShowTip.booleanValue();
                    }
                    c43316rmw.register(Value.class, new StateListAnimator(this, id, zBooleanValue, new Function1() { // from class: o.rMY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rMT.AEQbTJ(rax, inputCardSelectAppModel, (Value) obj);
                        }
                    }));
                    KWHzl((java.lang.String) rax.getValue());
                }
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(InputCardSelectAppModel inputCardSelectAppModel, rMT rmt, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputCardSelectAppModel != null ? inputCardSelectAppModel.getId() : null) && rmt.getVisibility() == 8) {
                rmt.setVisibility(0);
                rax.EZpvd((inputCardSelectAppModel == null || (required = inputCardSelectAppModel.getRequired()) == null) ? false : required.booleanValue());
                rax.setValue(null);
                if (inputCardSelectAppModel != null) {
                    inputCardSelectAppModel.setValue(null);
                }
                rmt.KWHzl((java.lang.String) rax.getValue());
                if (inputCardSelectAppModel != null) {
                    inputCardSelectAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputCardSelectAppModel != null ? inputCardSelectAppModel.getId() : null) && rmt.getVisibility() == 0) {
                rmt.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(null);
                if (inputCardSelectAppModel != null) {
                    inputCardSelectAppModel.setValue(null);
                }
                rmt.KWHzl((java.lang.String) rax.getValue());
                if (inputCardSelectAppModel != null) {
                    inputCardSelectAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(rAX rax, InputCardSelectAppModel inputCardSelectAppModel, Value value) {
        rax.setValue(value != null ? value.getValue() : null);
        if (inputCardSelectAppModel != null) {
            inputCardSelectAppModel.setValue(value != null ? value.getValue() : null);
        }
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.copydefault, uIComponentAppModel.getBottomMargin()));
        InputCardSelectAppModel inputCardSelectAppModel = uIComponentAppModel instanceof InputCardSelectAppModel ? (InputCardSelectAppModel) uIComponentAppModel : null;
        if (inputCardSelectAppModel != null) {
            C31695mAm c31695mAm = this.OLrzqt.OLrzqt;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            c31695mAm.setAdapter(this.KWHzl);
            Choices choices = inputCardSelectAppModel.getChoices();
            if (choices != null) {
                java.util.List<Value> values = choices.getValues();
                if (values != null) {
                    this.AEQbTJ.addAll(values);
                }
                this.KWHzl.setItems(this.AEQbTJ);
                this.KWHzl.notifyDataSetChanged();
            }
        }
    }

    public final void KWHzl(java.lang.String str) {
        java.util.Iterator<Value> it = this.AEQbTJ.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Value next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            Value value = next;
            value.setSelected(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) value.getValue())));
        }
        this.KWHzl.notifyDataSetChanged();
    }

    public final class StateListAnimator extends AbstractC43310rmq<Value, AbstractC43935ryf> {
        public final /* synthetic */ rMT AEQbTJ;
        public final boolean EZpvd;
        public final java.lang.String OLrzqt;
        public final Function1<Value, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.getPostValueLengthLimit;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.Value, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull rMT rmt, java.lang.String str, @NotNull boolean z, Function1<? super Value, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = rmt;
            this.OLrzqt = str;
            this.EZpvd = z;
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43935ryf> c43312rms, @NotNull final Value value) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(value, "");
            super.onBindViewHolder((C43312rms) c43312rms, value);
            ((AbstractC43935ryf) c43312rms.OLrzqt()).OLrzqt.setContentDescription("input_choice_item_view_" + c43312rms.getLayoutPosition());
            rQR rqr = rQR.AEQbTJ;
            android.graphics.drawable.Drawable drawableKWHzl = rqr.KWHzl(value.getImage(), this.AEQbTJ.EZpvd);
            if (drawableKWHzl != null) {
                ((AbstractC43935ryf) c43312rms.OLrzqt()).EZpvd.setVisibility(0);
                ((AbstractC43935ryf) c43312rms.OLrzqt()).AEQbTJ.setVisibility(8);
                ((AbstractC43935ryf) c43312rms.OLrzqt()).EZpvd.setImageDrawable(drawableKWHzl);
            } else {
                ((AbstractC43935ryf) c43312rms.OLrzqt()).AEQbTJ.setVisibility(0);
                ((AbstractC43935ryf) c43312rms.OLrzqt()).EZpvd.setVisibility(8);
                ((AbstractC43935ryf) c43312rms.OLrzqt()).AEQbTJ.setText(value.getText());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) value.getIcon())) {
                ((AbstractC43935ryf) c43312rms.OLrzqt()).AYXKKw.setText(value.getIcon());
                ((AbstractC43935ryf) c43312rms.OLrzqt()).AYXKKw.setVisibility(0);
                ((AbstractC43935ryf) c43312rms.OLrzqt()).AYXKKw.setTextColor(rqr.AEQbTJ(value.getIconTextColor(), TextColor.WHITE, this.AEQbTJ.EZpvd));
                java.lang.Integer numOLrzqt = rqr.OLrzqt(value.getIconBackgroundColor(), this.AEQbTJ.EZpvd);
                int iIntValue = numOLrzqt != null ? numOLrzqt.intValue() : this.AEQbTJ.EZpvd.EZpvd(TextColor.BLACK.getColorId());
                android.widget.TextView textView = ((AbstractC43935ryf) c43312rms.OLrzqt()).AYXKKw;
                GradientDrawable gradientDrawable = new GradientDrawable();
                rMT rmt = this.AEQbTJ;
                gradientDrawable.setColor(iIntValue);
                android.content.Context context = rmt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                float fEZpvd = C55298xhM.EZpvd(8.0f, context);
                android.content.Context context2 = rmt.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                float fEZpvd2 = C55298xhM.EZpvd(8.0f, context2);
                android.content.Context context3 = rmt.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                float fEZpvd3 = C55298xhM.EZpvd(8.0f, context3);
                android.content.Context context4 = rmt.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, fEZpvd, fEZpvd2, 0.0f, 0.0f, fEZpvd3, C55298xhM.EZpvd(8.0f, context4)});
                textView.setBackground(gradientDrawable);
            } else {
                ((AbstractC43935ryf) c43312rms.OLrzqt()).AYXKKw.setVisibility(8);
            }
            ((AbstractC43935ryf) c43312rms.OLrzqt()).AEQbTJ.setTextAppearance(this.AEQbTJ.getContext(), C52761wXj.LoaderManager.AxsJAY);
            if (Intrinsics.EZpvd(value.getSelected(), java.lang.Boolean.TRUE)) {
                ((AbstractC43935ryf) c43312rms.OLrzqt()).OLrzqt.setBackgroundResource(C43662rtX.Activity.DbNXlk);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) value.getTip())) {
                    ((AbstractC43935ryf) c43312rms.OLrzqt()).copydefault.setText(value.getTip());
                    ((AbstractC43935ryf) c43312rms.OLrzqt()).copydefault.setVisibility(0);
                } else {
                    ((AbstractC43935ryf) c43312rms.OLrzqt()).copydefault.setVisibility(8);
                }
            } else {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) value.getTip()) && this.EZpvd) {
                    ((AbstractC43935ryf) c43312rms.OLrzqt()).copydefault.setText(value.getTip());
                    ((AbstractC43935ryf) c43312rms.OLrzqt()).copydefault.setVisibility(0);
                } else {
                    ((AbstractC43935ryf) c43312rms.OLrzqt()).copydefault.setVisibility(8);
                }
                ((AbstractC43935ryf) c43312rms.OLrzqt()).OLrzqt.setBackgroundResource(C43662rtX.Activity.isConnected);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) value.getThumbnail())) {
                ((AbstractC43935ryf) c43312rms.OLrzqt()).KWHzl.setVisibility(0);
                java.lang.String strKWHzl = C55297xhL.KWHzl(value.getThumbnail(), "lfit", C55298xhM.dp2px$default(40.0f, null, 1, null), C55298xhM.dp2px$default(62.0f, null, 1, null));
                if (strKWHzl == null) {
                    strKWHzl = value.getThumbnail();
                }
                Intrinsics.copydefault(Glide.AEQbTJ(((AbstractC43935ryf) c43312rms.OLrzqt()).KWHzl.getContext()).EZpvd(strKWHzl).KWHzl(C43662rtX.Activity.QOLQEE).copydefault(C43662rtX.Activity.QOLQEE).EZpvd(((AbstractC43935ryf) c43312rms.OLrzqt()).KWHzl));
            } else {
                ((AbstractC43935ryf) c43312rms.OLrzqt()).KWHzl.setVisibility(8);
            }
            LinearLayoutCompat linearLayoutCompat = ((AbstractC43935ryf) c43312rms.OLrzqt()).OLrzqt;
            final rMT rmt2 = this.AEQbTJ;
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: o.rNb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rMT.StateListAnimator.EZpvd(value, rmt2, this, view);
                }
            });
            if (getPosition(c43312rms) == 0) {
                ((AbstractC43935ryf) c43312rms.OLrzqt()).gEmmrt.setVisibility(8);
            } else {
                ((AbstractC43935ryf) c43312rms.OLrzqt()).gEmmrt.setVisibility(0);
            }
        }

        public static final void EZpvd(final Value value, rMT rmt, StateListAnimator stateListAnimator, android.view.View view) {
            if (Intrinsics.EZpvd(value.getSelected(), java.lang.Boolean.FALSE)) {
                rmt.KWHzl(value.getValue());
                if (Intrinsics.EZpvd((java.lang.Object) stateListAnimator.OLrzqt, (java.lang.Object) "certificateType")) {
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("KYC_Select_Id_Type", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rMX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rMT.StateListAnimator.AEQbTJ(value, (EventParamsList) obj);
                        }
                    });
                } else {
                    C43693ruB.copydefault("KYC_card_select_Click", C56424yEw.AYXKKw(C56390yDp.OLrzqt("viewId", stateListAnimator.OLrzqt), C56390yDp.OLrzqt("value", C33129mqd.gEmmrt(value.getValue())), C56390yDp.OLrzqt("text", C33129mqd.gEmmrt(value.getText()))));
                }
                stateListAnimator.copydefault.invoke(value);
            }
        }

        public static final Unit AEQbTJ(Value value, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("value", C33129mqd.gEmmrt(value.getValue()), true);
            eventParamsList.put("text", C33129mqd.gEmmrt(value.getText()), true);
            eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
            return Unit.INSTANCE;
        }
    }
}
