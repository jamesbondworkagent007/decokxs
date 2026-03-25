package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoInputChoiceAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rKN extends android.widget.FrameLayout {
    public final C43316rmw AEQbTJ;
    public rQO EZpvd;
    public ViewStatus KWHzl;
    public final java.util.ArrayList<CardChoicesValue> OLrzqt;
    public final AbstractC43821rwX copydefault;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rKN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rKN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.KWHzl = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:47) call: o.rKN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rKN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rKN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new java.util.ArrayList<>();
        this.AEQbTJ = new C43316rmw();
        this.KWHzl = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.QfsBiF, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43821rwX) viewDataBindingInflate;
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.lang.Boolean required;
        java.lang.String id;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final AutoInputChoiceAppModel autoInputChoiceAppModel = uIComponentAppModel instanceof AutoInputChoiceAppModel ? (AutoInputChoiceAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (autoInputChoiceAppModel != null ? autoInputChoiceAppModel.getId() : null))) {
                    if (autoInputChoiceAppModel != null && Intrinsics.EZpvd(autoInputChoiceAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(null);
                    } else {
                        setVisibility(0);
                        rax.EZpvd((autoInputChoiceAppModel == null || (required = autoInputChoiceAppModel.getRequired()) == null) ? false : required.booleanValue());
                        java.lang.String value = autoInputChoiceAppModel != null ? autoInputChoiceAppModel.getValue() : null;
                        if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                            value = null;
                        }
                        rax.setValue(value);
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new Application(new Function1() { // from class: o.rKO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rKN.OLrzqt(autoInputChoiceAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    this.AEQbTJ.register(CardChoicesValue.class, new StateListAnimator(this, abstractC42074rFj, lifecycleOwner, (autoInputChoiceAppModel == null || (id = autoInputChoiceAppModel.getId()) == null) ? "" : id, new Function1() { // from class: o.rKS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rKN.KWHzl(rax, autoInputChoiceAppModel, abstractC42074rFj, (CardChoicesValue) obj);
                        }
                    }));
                    this.AEQbTJ.notifyDataSetChanged();
                }
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ rKN KWHzl;
        public final /* synthetic */ AutoInputChoiceAppModel OLrzqt;
        public final /* synthetic */ CardChoices copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(AutoInputChoiceAppModel autoInputChoiceAppModel, rKN rkn, CardChoices cardChoices) {
            this.OLrzqt = autoInputChoiceAppModel;
            this.KWHzl = rkn;
            this.copydefault = cardChoices;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) throws java.io.IOException {
            this.OLrzqt.setSearchText(java.lang.String.valueOf(editable));
            this.KWHzl.KWHzl(this.copydefault, this.OLrzqt.getSearchText());
            if (this.KWHzl.OLrzqt.isEmpty()) {
                this.KWHzl.copydefault.OLrzqt.setVisibility(0);
                this.KWHzl.copydefault.EZpvd.setVisibility(8);
            } else {
                this.KWHzl.copydefault.OLrzqt.setVisibility(8);
                this.KWHzl.copydefault.EZpvd.setVisibility(0);
            }
        }
    }

    public static final Unit OLrzqt(AutoInputChoiceAppModel autoInputChoiceAppModel, rKN rkn, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), autoInputChoiceAppModel != null ? autoInputChoiceAppModel.getId() : null) && rkn.getVisibility() == 8) {
                rkn.setVisibility(0);
                rax.EZpvd((autoInputChoiceAppModel == null || (required = autoInputChoiceAppModel.getRequired()) == null) ? false : required.booleanValue());
                rax.setValue(null);
                if (autoInputChoiceAppModel != null) {
                    autoInputChoiceAppModel.setValue(null);
                }
                if (autoInputChoiceAppModel != null) {
                    autoInputChoiceAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), autoInputChoiceAppModel != null ? autoInputChoiceAppModel.getId() : null) && rkn.getVisibility() == 0) {
                rkn.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(null);
                if (autoInputChoiceAppModel != null) {
                    autoInputChoiceAppModel.setValue(null);
                }
                if (autoInputChoiceAppModel != null) {
                    autoInputChoiceAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(rAX rax, AutoInputChoiceAppModel autoInputChoiceAppModel, AbstractC42074rFj abstractC42074rFj, CardChoicesValue cardChoicesValue) {
        CTAButtonAppModel cta;
        CTAButtonAppModel ctaOnClick = null;
        rax.setValue(cardChoicesValue != null ? cardChoicesValue.getValue() : null);
        if (autoInputChoiceAppModel != null) {
            autoInputChoiceAppModel.setValue(cardChoicesValue != null ? cardChoicesValue.getValue() : null);
        }
        if (cardChoicesValue != null && (cta = cardChoicesValue.getCta()) != null) {
            ctaOnClick = cta;
        } else if (autoInputChoiceAppModel != null) {
            ctaOnClick = autoInputChoiceAppModel.getCtaOnClick();
        }
        if (ctaOnClick != null) {
            abstractC42074rFj.AYXKKw().setValue(new C43734ruq<>(new kotlin.Pair(ctaOnClick, new DialogInformation("", false, null, 4, null))));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull rQO rqo) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(rqo, "");
        this.EZpvd = rqo;
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.KWHzl, uIComponentAppModel.getBottomMargin()));
        final AutoInputChoiceAppModel autoInputChoiceAppModel = uIComponentAppModel instanceof AutoInputChoiceAppModel ? (AutoInputChoiceAppModel) uIComponentAppModel : null;
        if (autoInputChoiceAppModel != null) {
            C31695mAm c31695mAm = this.copydefault.EZpvd;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            android.content.Context context3 = c31695mAm.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c31695mAm.addItemDecoration(new C42521rVy(context3));
            c31695mAm.setAdapter(this.AEQbTJ);
            final CardChoices choices = autoInputChoiceAppModel.getChoices();
            if (choices != null) {
                KWHzl(choices, autoInputChoiceAppModel.getSearchText());
                if (Intrinsics.EZpvd(choices.getSearch(), java.lang.Boolean.TRUE)) {
                    this.copydefault.KWHzl.setVisibility(0);
                    this.copydefault.KWHzl.EZpvd().setHint(getContext().getString(C43662rtX.Dialog.call));
                    this.copydefault.KWHzl.setClearCallback(new Function0() { // from class: o.rKT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return rKN.KWHzl(this.copydefault, autoInputChoiceAppModel, choices);
                        }
                    });
                    this.copydefault.KWHzl.EZpvd().addTextChangedListener(new Activity(autoInputChoiceAppModel, this, choices));
                    return;
                }
                this.copydefault.KWHzl.setVisibility(8);
            }
        }
    }

    public static final Unit KWHzl(rKN rkn, AutoInputChoiceAppModel autoInputChoiceAppModel, CardChoices cardChoices) throws java.io.IOException {
        rkn.copydefault.OLrzqt.setVisibility(8);
        rkn.copydefault.EZpvd.setVisibility(0);
        autoInputChoiceAppModel.setSearchText("");
        rkn.KWHzl(cardChoices, autoInputChoiceAppModel.getSearchText());
        return Unit.INSTANCE;
    }

    public final class StateListAnimator extends AbstractC43310rmq<CardChoicesValue, AbstractC43823rwZ> {
        public final java.lang.String AEQbTJ;
        public final Function1<CardChoicesValue, Unit> EZpvd;
        public final AbstractC42074rFj KWHzl;
        public final LifecycleOwner OLrzqt;
        public final /* synthetic */ rKN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<CardChoicesValue, Unit> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.QUSxYX;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ CardChoicesValue AEQbTJ;
            public final /* synthetic */ StateListAnimator EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, StateListAnimator stateListAnimator, CardChoicesValue cardChoicesValue) {
                this.KWHzl = view;
                this.OLrzqt = j;
                this.EZpvd = stateListAnimator;
                this.AEQbTJ = cardChoicesValue;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    new C43739ruv().copydefault(this.EZpvd.AEQbTJ, C33129mqd.gEmmrt(this.AEQbTJ.getValue()), C33129mqd.gEmmrt(this.AEQbTJ.getText()));
                    this.EZpvd.copydefault().invoke(this.AEQbTJ);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValue, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(rKN rkn, AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, Function1<? super CardChoicesValue, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = rkn;
            this.KWHzl = abstractC42074rFj;
            this.OLrzqt = lifecycleOwner;
            this.AEQbTJ = str;
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43823rwZ> c43312rms, @NotNull CardChoicesValue cardChoicesValue) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(cardChoicesValue, "");
            super.onBindViewHolder((C43312rms) c43312rms, cardChoicesValue);
            ((AbstractC43823rwZ) c43312rms.OLrzqt()).EZpvd.setContentDescription("auto_input_choice_item_view_" + c43312rms.getLayoutPosition());
            ((AbstractC43823rwZ) c43312rms.OLrzqt()).AYXKKw.removeAllViews();
            java.util.List<UIComponentAppModel> contentList = cardChoicesValue.getContentList();
            if (contentList != null && !contentList.isEmpty()) {
                ((AbstractC43823rwZ) c43312rms.OLrzqt()).AYXKKw.setVisibility(0);
                ((AbstractC43823rwZ) c43312rms.OLrzqt()).AEQbTJ.setVisibility(8);
                AbstractC42074rFj abstractC42074rFj = this.KWHzl;
                if (abstractC42074rFj != null && (abstractC42074rFj instanceof rGL) && this.OLrzqt != null) {
                    java.util.List<android.view.View> listEZpvd = null;
                    rGL.setUpFormWithAppModel$default((rGL) abstractC42074rFj, cardChoicesValue.getContentList(), null, 2, null);
                    ((UIComponentAppModel) CollectionsKt___CollectionsKt.AubY(cardChoicesValue.getContentList())).setBottomMargin(java.lang.Float.valueOf(0.0f));
                    rQO rqo = this.copydefault.EZpvd;
                    if (rqo != null) {
                        android.content.Context context = this.copydefault.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        listEZpvd = rqo.EZpvd(context, cardChoicesValue.getContentList(), this.KWHzl, this.OLrzqt, ViewStatus.Card);
                    }
                    if (listEZpvd != null) {
                        java.util.Iterator<T> it = listEZpvd.iterator();
                        while (it.hasNext()) {
                            ((AbstractC43823rwZ) c43312rms.OLrzqt()).AYXKKw.addView((android.view.View) it.next());
                        }
                    }
                }
            } else {
                android.widget.LinearLayout linearLayout = ((AbstractC43823rwZ) c43312rms.OLrzqt()).AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(0);
                ((AbstractC43823rwZ) c43312rms.OLrzqt()).AYXKKw.setVisibility(8);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) cardChoicesValue.getTip())) {
                    ((AbstractC43823rwZ) c43312rms.OLrzqt()).copydefault.setVisibility(0);
                    ((AbstractC43823rwZ) c43312rms.OLrzqt()).copydefault.setText(cardChoicesValue.getTip());
                } else {
                    ((AbstractC43823rwZ) c43312rms.OLrzqt()).copydefault.setVisibility(8);
                }
                android.widget.TextView textView = ((AbstractC43823rwZ) c43312rms.OLrzqt()).OLrzqt;
                java.lang.String text = cardChoicesValue.getText();
                if (text == null) {
                    text = "";
                }
                textView.setText(text);
                if (cardChoicesValue.getTag() != null) {
                    C55251xgS c55251xgS = ((AbstractC43823rwZ) c43312rms.OLrzqt()).KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                    c55251xgS.setVisibility(0);
                    rQR rqr = rQR.AEQbTJ;
                    C55251xgS c55251xgS2 = ((AbstractC43823rwZ) c43312rms.OLrzqt()).KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                    rQR.setupTag$default(rqr, c55251xgS2, cardChoicesValue.getTag(), null, null, 12, null);
                } else {
                    C55251xgS c55251xgS3 = ((AbstractC43823rwZ) c43312rms.OLrzqt()).KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
                    c55251xgS3.setVisibility(8);
                }
            }
            LinearLayoutCompat linearLayoutCompat = ((AbstractC43823rwZ) c43312rms.OLrzqt()).EZpvd;
            linearLayoutCompat.setOnClickListener(new Activity(linearLayoutCompat, 1000L, this, cardChoicesValue));
        }
    }

    public final void KWHzl(CardChoices cardChoices, java.lang.String str) throws java.io.IOException {
        this.OLrzqt.clear();
        java.util.List<CardChoicesValue> values = cardChoices.getValues();
        if (values != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                this.OLrzqt.addAll(EZpvd(values, str));
            } else {
                this.OLrzqt.addAll(values);
            }
        }
        this.AEQbTJ.setItems(this.OLrzqt);
        this.AEQbTJ.notifyDataSetChanged();
    }

    public final java.util.ArrayList<CardChoicesValue> EZpvd(java.util.List<CardChoicesValue> list, java.lang.String str) throws java.io.IOException {
        java.util.ArrayList<CardChoicesValue> arrayList = new java.util.ArrayList<>();
        for (CardChoicesValue cardChoicesValue : list) {
            if (cardChoicesValue.getSearchKey() != null && (!r4.isEmpty())) {
                java.util.Iterator<java.lang.String> it = cardChoicesValue.getSearchKey().iterator();
                while (it.hasNext()) {
                    java.lang.String lowerCase = it.next().toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    int length = lowerCase.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = lowerCase.charAt(i);
                        if (!CharsKt__CharJVMKt.EZpvd(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    java.lang.String string = sb.toString();
                    java.lang.String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    int length2 = lowerCase2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char cCharAt2 = lowerCase2.charAt(i2);
                        if (!CharsKt__CharJVMKt.EZpvd(cCharAt2)) {
                            sb2.append(cCharAt2);
                        }
                    }
                    if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) sb2.toString(), false, 2, (java.lang.Object) null)) {
                        arrayList.add(cardChoicesValue);
                    }
                }
            } else {
                java.lang.String text = cardChoicesValue.getText();
                if (text == null) {
                    text = "";
                }
                java.lang.String lowerCase3 = text.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                int length3 = lowerCase3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    char cCharAt3 = lowerCase3.charAt(i3);
                    if (!CharsKt__CharJVMKt.EZpvd(cCharAt3)) {
                        sb3.append(cCharAt3);
                    }
                }
                java.lang.String string2 = sb3.toString();
                java.lang.String lowerCase4 = str.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                int length4 = lowerCase4.length();
                for (int i4 = 0; i4 < length4; i4++) {
                    char cCharAt4 = lowerCase4.charAt(i4);
                    if (!CharsKt__CharJVMKt.EZpvd(cCharAt4)) {
                        sb4.append(cCharAt4);
                    }
                }
                if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) string2, (java.lang.CharSequence) sb4.toString(), false, 2, (java.lang.Object) null)) {
                    java.lang.String tip = cardChoicesValue.getTip();
                    if (tip == null) {
                        tip = "";
                    }
                    java.lang.String lowerCase5 = tip.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "");
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    int length5 = lowerCase5.length();
                    for (int i5 = 0; i5 < length5; i5++) {
                        char cCharAt5 = lowerCase5.charAt(i5);
                        if (!CharsKt__CharJVMKt.EZpvd(cCharAt5)) {
                            sb5.append(cCharAt5);
                        }
                    }
                    java.lang.String string3 = sb5.toString();
                    java.lang.String lowerCase6 = str.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase6, "");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    int length6 = lowerCase6.length();
                    for (int i6 = 0; i6 < length6; i6++) {
                        char cCharAt6 = lowerCase6.charAt(i6);
                        if (!CharsKt__CharJVMKt.EZpvd(cCharAt6)) {
                            sb6.append(cCharAt6);
                        }
                    }
                    if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) string3, (java.lang.CharSequence) sb6.toString(), false, 2, (java.lang.Object) null)) {
                    }
                }
                arrayList.add(cardChoicesValue);
            }
        }
        return arrayList;
    }
}
