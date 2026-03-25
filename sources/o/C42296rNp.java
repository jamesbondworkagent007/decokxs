package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
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

/* JADX INFO: renamed from: o.rNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42296rNp extends android.widget.FrameLayout {
    public final C43316rmw EZpvd;
    public final AbstractC43944ryo KWHzl;
    public final java.util.ArrayList<Value> OLrzqt;
    public ViewStatus copydefault;

    /* JADX INFO: renamed from: o.rNp$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42296rNp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42296rNp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.rNp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42296rNp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42296rNp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new java.util.ArrayList<>();
        this.EZpvd = new C43316rmw();
        this.copydefault = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.QHmsKR, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC43944ryo) viewDataBindingInflate;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.lang.Boolean required;
        java.lang.String id;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final InputChoiceAppModel inputChoiceAppModel = uIComponentAppModel instanceof InputChoiceAppModel ? (InputChoiceAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputChoiceAppModel != null ? inputChoiceAppModel.getId() : null))) {
                    if (inputChoiceAppModel != null && Intrinsics.EZpvd(inputChoiceAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(null);
                    } else {
                        setVisibility(0);
                        rax.EZpvd((inputChoiceAppModel == null || (required = inputChoiceAppModel.getRequired()) == null) ? false : required.booleanValue());
                        java.lang.String value = inputChoiceAppModel != null ? inputChoiceAppModel.getValue() : null;
                        if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                            value = null;
                        }
                        rax.setValue(value);
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rNq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42296rNp.copydefault(inputChoiceAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    C43316rmw c43316rmw = this.EZpvd;
                    if (inputChoiceAppModel == null || (id = inputChoiceAppModel.getId()) == null) {
                        id = "";
                    }
                    c43316rmw.register(Value.class, new Application(this, id, inputChoiceAppModel != null ? inputChoiceAppModel.getChoices() : null, new Function1() { // from class: o.rNv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42296rNp.EZpvd(rax, inputChoiceAppModel, (Value) obj);
                        }
                    }));
                    EZpvd((java.lang.String) rax.getValue(), inputChoiceAppModel != null ? inputChoiceAppModel.getChoices() : null);
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
    public static final Unit copydefault(InputChoiceAppModel inputChoiceAppModel, C42296rNp c42296rNp, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputChoiceAppModel != null ? inputChoiceAppModel.getId() : null) && c42296rNp.getVisibility() == 8) {
                c42296rNp.setVisibility(0);
                rax.EZpvd((inputChoiceAppModel == null || (required = inputChoiceAppModel.getRequired()) == null) ? false : required.booleanValue());
                rax.setValue(null);
                if (inputChoiceAppModel != null) {
                    inputChoiceAppModel.setValue(null);
                }
                c42296rNp.EZpvd((java.lang.String) rax.getValue(), inputChoiceAppModel != null ? inputChoiceAppModel.getChoices() : null);
                if (inputChoiceAppModel != null) {
                    inputChoiceAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputChoiceAppModel != null ? inputChoiceAppModel.getId() : null) && c42296rNp.getVisibility() == 0) {
                c42296rNp.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(null);
                if (inputChoiceAppModel != null) {
                    inputChoiceAppModel.setValue(null);
                }
                c42296rNp.EZpvd((java.lang.String) rax.getValue(), inputChoiceAppModel != null ? inputChoiceAppModel.getChoices() : null);
                if (inputChoiceAppModel != null) {
                    inputChoiceAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(rAX rax, InputChoiceAppModel inputChoiceAppModel, Value value) {
        rax.setValue(value != null ? value.getValue() : null);
        if (inputChoiceAppModel != null) {
            inputChoiceAppModel.setValue(value != null ? value.getValue() : null);
        }
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull UIComponentAppModel uIComponentAppModel) {
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
        final InputChoiceAppModel inputChoiceAppModel = uIComponentAppModel instanceof InputChoiceAppModel ? (InputChoiceAppModel) uIComponentAppModel : null;
        if (inputChoiceAppModel != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inputChoiceAppModel.getLabel())) {
                this.KWHzl.OLrzqt.setText(inputChoiceAppModel.getLabel());
                this.KWHzl.OLrzqt.setVisibility(0);
            } else {
                this.KWHzl.OLrzqt.setVisibility(8);
            }
            C31695mAm c31695mAm = this.KWHzl.copydefault;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            c31695mAm.setAdapter(this.EZpvd);
            final Choices choices = inputChoiceAppModel.getChoices();
            if (choices != null) {
                EZpvd(choices, inputChoiceAppModel.getSearchText());
                if (Intrinsics.EZpvd(choices.getSearch(), java.lang.Boolean.TRUE)) {
                    this.KWHzl.KWHzl.setVisibility(0);
                    this.KWHzl.KWHzl.EZpvd().setHint(getContext().getString(C43662rtX.Dialog.call));
                    this.KWHzl.KWHzl.setClearCallback(new Function0() { // from class: o.rNt
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C42296rNp.OLrzqt(this.KWHzl, inputChoiceAppModel, choices);
                        }
                    });
                    this.KWHzl.KWHzl.EZpvd().addTextChangedListener(new StateListAnimator(inputChoiceAppModel, this, choices));
                    return;
                }
                this.KWHzl.KWHzl.setVisibility(8);
            }
        }
    }

    public static final Unit OLrzqt(C42296rNp c42296rNp, InputChoiceAppModel inputChoiceAppModel, Choices choices) throws java.io.IOException {
        c42296rNp.KWHzl.EZpvd.setVisibility(8);
        c42296rNp.KWHzl.copydefault.setVisibility(0);
        inputChoiceAppModel.setSearchText("");
        c42296rNp.EZpvd(choices, inputChoiceAppModel.getSearchText());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rNp$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ C42296rNp AEQbTJ;
        public final /* synthetic */ Choices EZpvd;
        public final /* synthetic */ InputChoiceAppModel OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(InputChoiceAppModel inputChoiceAppModel, C42296rNp c42296rNp, Choices choices) {
            this.OLrzqt = inputChoiceAppModel;
            this.AEQbTJ = c42296rNp;
            this.EZpvd = choices;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) throws java.io.IOException {
            this.OLrzqt.setSearchText(java.lang.String.valueOf(editable));
            this.AEQbTJ.EZpvd(this.EZpvd, this.OLrzqt.getSearchText());
            if (this.AEQbTJ.OLrzqt.isEmpty()) {
                this.AEQbTJ.KWHzl.EZpvd.setVisibility(0);
                this.AEQbTJ.KWHzl.copydefault.setVisibility(8);
            } else {
                this.AEQbTJ.KWHzl.EZpvd.setVisibility(8);
                this.AEQbTJ.KWHzl.copydefault.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: o.rNp$Application */
    public final class Application extends AbstractC43310rmq<Value, AbstractC43945ryp> {
        public final /* synthetic */ C42296rNp AEQbTJ;
        public final java.lang.String EZpvd;
        public final Choices KWHzl;
        public final Function1<Value, Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<Value, Unit> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.QkdxfA;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX INFO: renamed from: o.rNp$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0930Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ Application EZpvd;
            public final /* synthetic */ Value KWHzl;
            public final /* synthetic */ C42296rNp OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0930Application(android.view.View view, long j, Value value, C42296rNp c42296rNp, Application application) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.KWHzl = value;
                this.OLrzqt = c42296rNp;
                this.EZpvd = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    if (Intrinsics.EZpvd(this.KWHzl.getSelected(), java.lang.Boolean.FALSE)) {
                        this.OLrzqt.EZpvd(this.KWHzl.getValue(), this.EZpvd.KWHzl);
                        new C43739ruv().copydefault(this.EZpvd.EZpvd, C33129mqd.gEmmrt(this.KWHzl.getValue()), C33129mqd.gEmmrt(this.KWHzl.getText()));
                        this.EZpvd.copydefault().invoke(this.KWHzl);
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.Value, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull C42296rNp c42296rNp, java.lang.String str, @NotNull Choices choices, Function1<? super Value, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = c42296rNp;
            this.EZpvd = str;
            this.KWHzl = choices;
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43945ryp> c43312rms, @NotNull Value value) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(value, "");
            super.onBindViewHolder((C43312rms) c43312rms, value);
            ((AbstractC43945ryp) c43312rms.OLrzqt()).OLrzqt.setContentDescription("input_choice_item_view_" + c43312rms.getLayoutPosition());
            ((AbstractC43945ryp) c43312rms.OLrzqt()).EZpvd.setText(value.getText());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) value.getTip())) {
                ((AbstractC43945ryp) c43312rms.OLrzqt()).KWHzl.setText(value.getTip());
                ((AbstractC43945ryp) c43312rms.OLrzqt()).KWHzl.setVisibility(0);
            } else {
                ((AbstractC43945ryp) c43312rms.OLrzqt()).KWHzl.setVisibility(8);
            }
            if (Intrinsics.EZpvd(value.getSelected(), java.lang.Boolean.TRUE)) {
                ((AbstractC43945ryp) c43312rms.OLrzqt()).OLrzqt.setBackgroundResource(C43662rtX.Activity.DbNXlk);
            } else {
                ((AbstractC43945ryp) c43312rms.OLrzqt()).OLrzqt.setBackgroundResource(C43662rtX.Activity.isConnected);
            }
            LinearLayoutCompat linearLayoutCompat = ((AbstractC43945ryp) c43312rms.OLrzqt()).OLrzqt;
            linearLayoutCompat.setOnClickListener(new ViewOnClickListenerC0930Application(linearLayoutCompat, 1000L, value, this.AEQbTJ, this));
            if (getPosition(c43312rms) == 0) {
                ((AbstractC43945ryp) c43312rms.OLrzqt()).copydefault.setVisibility(8);
            } else {
                ((AbstractC43945ryp) c43312rms.OLrzqt()).copydefault.setVisibility(0);
            }
        }
    }

    public final void EZpvd(Choices choices, java.lang.String str) throws java.io.IOException {
        this.OLrzqt.clear();
        java.util.List<Value> values = choices.getValues();
        if (values != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                this.OLrzqt.addAll(KWHzl(values, str));
            } else {
                this.OLrzqt.addAll(values);
            }
        }
        this.EZpvd.setItems(this.OLrzqt);
        this.EZpvd.notifyDataSetChanged();
    }

    private final java.util.ArrayList<Value> KWHzl(java.util.List<Value> list, java.lang.String str) throws java.io.IOException {
        java.util.ArrayList<Value> arrayList = new java.util.ArrayList<>();
        for (Value value : list) {
            if (value.getSearchKey() != null && (!r4.isEmpty())) {
                java.util.Iterator<java.lang.String> it = value.getSearchKey().iterator();
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
                        arrayList.add(value);
                    }
                }
            } else {
                java.lang.String lowerCase3 = value.getText().toLowerCase(java.util.Locale.ROOT);
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
                    java.lang.String tip = value.getTip();
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
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    public final void EZpvd(java.lang.String str, Choices choices) {
        java.util.List<Value> values;
        if (choices != null && (values = choices.getValues()) != null) {
            for (Value value : values) {
                value.setSelected(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) value.getValue())));
            }
        }
        java.util.Iterator<Value> it = this.OLrzqt.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Value next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            Value value2 = next;
            value2.setSelected(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) value2.getValue())));
        }
        this.EZpvd.notifyDataSetChanged();
    }
}
