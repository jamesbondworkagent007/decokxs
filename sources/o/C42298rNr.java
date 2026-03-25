package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceWithSubInputAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C42298rNr;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42298rNr extends android.widget.FrameLayout {
    public ViewStatus AEQbTJ;
    public final AbstractC43944ryo EZpvd;
    public final C43316rmw KWHzl;
    public final MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> OLrzqt;
    public final java.util.ArrayList<Value> copydefault;

    /* JADX INFO: renamed from: o.rNr$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
    public C42298rNr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42298rNr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.AEQbTJ = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:43) call: o.rNr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42298rNr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42298rNr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = ViewStatus.Form;
        this.copydefault = new java.util.ArrayList<>();
        this.KWHzl = new C43316rmw();
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.QHmsKR, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43944ryo) viewDataBindingInflate;
        this.OLrzqt = new MutableLiveData<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.lang.Boolean required;
        java.lang.String id;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
        Value value = null;
        final InputChoiceWithSubInputAppModel inputChoiceWithSubInputAppModel = uIComponentAppModel instanceof InputChoiceWithSubInputAppModel ? (InputChoiceWithSubInputAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.QUSxYX().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputChoiceWithSubInputAppModel != null ? inputChoiceWithSubInputAppModel.getId() : value))) {
                    rax.setValue(inputChoiceWithSubInputAppModel != null ? inputChoiceWithSubInputAppModel.getSelectValue() : value);
                    boolean zBooleanValue = false;
                    if (inputChoiceWithSubInputAppModel != null && Intrinsics.EZpvd(inputChoiceWithSubInputAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(value);
                    } else {
                        setVisibility(0);
                        if (inputChoiceWithSubInputAppModel != null && (required = inputChoiceWithSubInputAppModel.getRequired()) != null) {
                            zBooleanValue = required.booleanValue();
                        }
                        rax.EZpvd(zBooleanValue);
                        rax.setValue(inputChoiceWithSubInputAppModel != null ? inputChoiceWithSubInputAppModel.getSelectValue() : value);
                    }
                    rgl.gasjUx().observe(lifecycleOwner2, new Application(new Function1() { // from class: o.rNs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42298rNr.KWHzl(inputChoiceWithSubInputAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    this.KWHzl.register(Value.class, new Activity(this, (inputChoiceWithSubInputAppModel == null || (id = inputChoiceWithSubInputAppModel.getId()) == null) ? "" : id, rax, rgl, lifecycleOwner, new Function1() { // from class: o.rNu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42298rNr.OLrzqt(rax, (Value) obj);
                        }
                    }));
                    AEQbTJ((Value) rax.getValue());
                    C41959rBc.EZpvd(rax, lifecycleOwner, new Function1() { // from class: o.rNw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42298rNr.AEQbTJ(inputChoiceWithSubInputAppModel, rax, (Value) obj);
                        }
                    }, new Function1() { // from class: o.rNy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42298rNr.OLrzqt((java.lang.String) obj);
                        }
                    }, new Function1() { // from class: o.rNA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42298rNr.OLrzqt(this.copydefault, rax, (java.lang.String) obj);
                        }
                    }, new Function0() { // from class: o.rNz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C42298rNr.copydefault();
                        }
                    });
                    lifecycleOwner2 = lifecycleOwner;
                    value = null;
                } else {
                    lifecycleOwner2 = lifecycleOwner;
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
    public static final Unit KWHzl(InputChoiceWithSubInputAppModel inputChoiceWithSubInputAppModel, C42298rNr c42298rNr, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputChoiceWithSubInputAppModel != null ? inputChoiceWithSubInputAppModel.getId() : null) && c42298rNr.getVisibility() == 8) {
                c42298rNr.setVisibility(0);
                rax.EZpvd((inputChoiceWithSubInputAppModel == null || (required = inputChoiceWithSubInputAppModel.getRequired()) == null) ? false : required.booleanValue());
                rax.setValue(null);
                if (inputChoiceWithSubInputAppModel != null) {
                    inputChoiceWithSubInputAppModel.setSelectValue(null);
                }
                c42298rNr.AEQbTJ((Value) rax.getValue());
                if (inputChoiceWithSubInputAppModel != null) {
                    inputChoiceWithSubInputAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputChoiceWithSubInputAppModel != null ? inputChoiceWithSubInputAppModel.getId() : null) && c42298rNr.getVisibility() == 0) {
                c42298rNr.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(null);
                if (inputChoiceWithSubInputAppModel != null) {
                    inputChoiceWithSubInputAppModel.setSelectValue(null);
                }
                c42298rNr.AEQbTJ((Value) rax.getValue());
                if (inputChoiceWithSubInputAppModel != null) {
                    inputChoiceWithSubInputAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(rAX rax, Value value) {
        rax.setValue(value);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(InputChoiceWithSubInputAppModel inputChoiceWithSubInputAppModel, rAX rax, Value value) {
        if (inputChoiceWithSubInputAppModel != null) {
            inputChoiceWithSubInputAppModel.setSelectValue((Value) rax.getValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C42298rNr c42298rNr, rAX rax, java.lang.String str) {
        java.lang.String value;
        MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> mutableLiveData = c42298rNr.OLrzqt;
        Value value2 = (Value) rax.getValue();
        if (value2 == null || (value = value2.getValue()) == null) {
            value = "";
        }
        mutableLiveData.setValue(new kotlin.Pair<>(str, value));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.AEQbTJ, uIComponentAppModel.getBottomMargin()));
        InputChoiceWithSubInputAppModel inputChoiceWithSubInputAppModel = uIComponentAppModel instanceof InputChoiceWithSubInputAppModel ? (InputChoiceWithSubInputAppModel) uIComponentAppModel : null;
        if (inputChoiceWithSubInputAppModel != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inputChoiceWithSubInputAppModel.getLabel())) {
                this.EZpvd.OLrzqt.setText(inputChoiceWithSubInputAppModel.getLabel());
                this.EZpvd.OLrzqt.setVisibility(0);
            } else {
                this.EZpvd.OLrzqt.setVisibility(8);
            }
            C31695mAm c31695mAm = this.EZpvd.copydefault;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            c31695mAm.setAdapter(this.KWHzl);
            Choices choices = inputChoiceWithSubInputAppModel.getChoices();
            if (choices != null) {
                java.util.List<Value> values = choices.getValues();
                if (values != null) {
                    this.copydefault.addAll(values);
                }
                this.KWHzl.setItems(this.copydefault);
                this.KWHzl.notifyDataSetChanged();
            }
        }
    }

    public final void AEQbTJ(Value value) {
        java.util.Iterator<Value> it = this.copydefault.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Value next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            Value value2 = next;
            value2.setSelected(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) (value != null ? value.getValue() : null), (java.lang.Object) value2.getValue())));
        }
        this.KWHzl.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.rNr$Activity */
    public final class Activity extends AbstractC43310rmq<Value, AbstractC43942rym> {
        public final LifecycleOwner AEQbTJ;
        public ActionBar EZpvd;
        public final /* synthetic */ C42298rNr KWHzl;
        public final rAX<Value> OLrzqt;
        public final Function1<Value, Unit> copydefault;
        public final rGL djBIcL;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.RKDWNf;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.Value, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull C42298rNr c42298rNr, @NotNull java.lang.String str, @NotNull rAX<Value> rax, @NotNull rGL rgl, @NotNull LifecycleOwner lifecycleOwner, Function1<? super Value, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rax, "");
            Intrinsics.checkNotNullParameter(rgl, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = c42298rNr;
            this.valueOf = str;
            this.OLrzqt = rax;
            this.djBIcL = rgl;
            this.AEQbTJ = lifecycleOwner;
            this.copydefault = function1;
            this.EZpvd = new ActionBar(c42298rNr, rax, false, null);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        /* JADX WARN: Removed duplicated region for block: B:97:0x022f  */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull final C43312rms<AbstractC43942rym> c43312rms, @NotNull final Value value) {
            Unit unit;
            java.lang.String placeholder;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(value, "");
            super.onBindViewHolder((C43312rms) c43312rms, value);
            ((AbstractC43942rym) c43312rms.OLrzqt()).EZpvd.setText(value.getText());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) value.getTip())) {
                ((AbstractC43942rym) c43312rms.OLrzqt()).OLrzqt.setText(value.getTip());
                ((AbstractC43942rym) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
            } else {
                ((AbstractC43942rym) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
            }
            SubInput subInput = value.getSubInput();
            if (subInput != null) {
                C42298rNr c42298rNr = this.KWHzl;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) subInput.getLabel())) {
                    android.widget.TextView textView = ((AbstractC43942rym) c43312rms.OLrzqt()).AEQbTJ;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    android.widget.TextView textView2 = ((AbstractC43942rym) c43312rms.OLrzqt()).AEQbTJ;
                    if (textView2 != null) {
                        java.lang.String label = subInput.getLabel();
                        if (label == null) {
                            label = "";
                        }
                        textView2.setText(label);
                    }
                } else {
                    android.widget.TextView textView3 = ((AbstractC43942rym) c43312rms.OLrzqt()).AEQbTJ;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) subInput.getPrefix())) {
                    android.widget.TextView textView4 = ((AbstractC43942rym) c43312rms.OLrzqt()).valueOf;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                    android.widget.TextView textView5 = ((AbstractC43942rym) c43312rms.OLrzqt()).valueOf;
                    if (textView5 != null) {
                        textView5.setText(subInput.getPrefix());
                    }
                } else {
                    android.widget.TextView textView6 = ((AbstractC43942rym) c43312rms.OLrzqt()).valueOf;
                    if (textView6 != null) {
                        textView6.setVisibility(8);
                    }
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) subInput.getSuffix())) {
                    android.widget.TextView textView7 = ((AbstractC43942rym) c43312rms.OLrzqt()).AYXKKw;
                    if (textView7 != null) {
                        textView7.setVisibility(0);
                    }
                    android.widget.TextView textView8 = ((AbstractC43942rym) c43312rms.OLrzqt()).AYXKKw;
                    if (textView8 != null) {
                        textView8.setText(subInput.getSuffix());
                    }
                } else {
                    android.widget.TextView textView9 = ((AbstractC43942rym) c43312rms.OLrzqt()).AYXKKw;
                    if (textView9 != null) {
                        textView9.setVisibility(8);
                    }
                }
                C55001xbh c55001xbh = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                if (c55001xbh != null) {
                    rAX<Value> rax = this.OLrzqt;
                    rGL rgl = this.djBIcL;
                    android.widget.LinearLayout linearLayout = ((AbstractC43942rym) c43312rms.OLrzqt()).copydefault;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    c55001xbh.setOnFocusChangeListener(new TaskDescription(c42298rNr, rax, rgl, linearLayout));
                }
                C55001xbh c55001xbh2 = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                SubInput subInput2 = value.getSubInput();
                if (subInput2 == null || (placeholder = subInput2.getPlaceholder()) == null) {
                    placeholder = "";
                }
                c55001xbh2.setHintText(placeholder);
            } else {
                ((AbstractC43942rym) c43312rms.OLrzqt()).AhwBna.setVisibility(8);
            }
            java.lang.Boolean selected = value.getSelected();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(selected, bool)) {
                SubInput subInput3 = value.getSubInput();
                if (subInput3 != null) {
                    C42298rNr c42298rNr2 = this.KWHzl;
                    C55001xbh c55001xbh3 = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                    if (c55001xbh3 != null) {
                        if (Intrinsics.EZpvd(subInput3.isNumber(), bool)) {
                            c55001xbh3.setInputType(2);
                            java.lang.Integer precision = subInput3.getPrecision();
                            c55001xbh3.setMaxDecimalValue(precision != null ? precision.intValue() : 0);
                            c55001xbh3.setShowThousandsSeparator(true);
                            c55001xbh3.setKeyListener(c55001xbh3.AYXKKw());
                            c55001xbh3.setSingleLine(true);
                        } else {
                            c55001xbh3.setInputType(1);
                            c55001xbh3.setSingleLine(false);
                            c55001xbh3.setMaxLines(5);
                        }
                    }
                    rAX<Value> rax2 = this.OLrzqt;
                    java.lang.Boolean boolIsNumber = subInput3.isNumber();
                    this.EZpvd = new ActionBar(c42298rNr2, rax2, boolIsNumber != null ? boolIsNumber.booleanValue() : false, ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl);
                    C55001xbh c55001xbh4 = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                    if (c55001xbh4 != null) {
                        c55001xbh4.addTextChangedListener(this.EZpvd);
                    }
                    if (Intrinsics.EZpvd(subInput3.isNumber(), bool)) {
                        C55001xbh c55001xbh5 = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                        if (c55001xbh5 != null) {
                            java.lang.String value2 = subInput3.getValue();
                            c55001xbh5.setLocalizedNumericText(value2 != null ? value2 : "");
                        }
                    } else {
                        C55001xbh c55001xbh6 = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                        if (c55001xbh6 != null) {
                            java.lang.String value3 = subInput3.getValue();
                            c55001xbh6.setText(value3 != null ? value3 : "");
                        }
                    }
                    c42298rNr2.OLrzqt.removeObservers(this.AEQbTJ);
                    c42298rNr2.OLrzqt.observe(this.AEQbTJ, new Application(new Function1() { // from class: o.rNx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42298rNr.Activity.KWHzl(value, c43312rms, (kotlin.Pair) obj);
                        }
                    }));
                    ((AbstractC43942rym) c43312rms.OLrzqt()).AhwBna.setVisibility(0);
                    C55001xbh c55001xbh7 = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                    if (c55001xbh7 != null) {
                        c55001xbh7.clearFocus();
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        ((AbstractC43942rym) c43312rms.OLrzqt()).AhwBna.setVisibility(8);
                        C55001xbh c55001xbh8 = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                        if (c55001xbh8 != null) {
                            c55001xbh8.removeTextChangedListener(this.EZpvd);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    ((AbstractC43942rym) c43312rms.OLrzqt()).djBIcL.setBackgroundResource(C43662rtX.Activity.DbNXlk);
                }
            } else {
                C55001xbh c55001xbh9 = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                if (c55001xbh9 != null) {
                    c55001xbh9.removeTextChangedListener(this.EZpvd);
                }
                C55001xbh c55001xbh10 = ((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl;
                if (c55001xbh10 != null) {
                    c55001xbh10.clearFocus();
                }
                ((AbstractC43942rym) c43312rms.OLrzqt()).AhwBna.setVisibility(8);
                ((AbstractC43942rym) c43312rms.OLrzqt()).djBIcL.setBackgroundResource(C43662rtX.Activity.isConnected);
            }
            LinearLayoutCompat linearLayoutCompat = ((AbstractC43942rym) c43312rms.OLrzqt()).djBIcL;
            final C42298rNr c42298rNr3 = this.KWHzl;
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: o.rNE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42298rNr.Activity.AEQbTJ(c42298rNr3, value, this, view);
                }
            });
            if (getPosition(c43312rms) == 0) {
                ((AbstractC43942rym) c43312rms.OLrzqt()).values.setVisibility(8);
            } else {
                ((AbstractC43942rym) c43312rms.OLrzqt()).values.setVisibility(0);
            }
        }

        public static final Unit KWHzl(Value value, C43312rms c43312rms, kotlin.Pair pair) {
            if (Intrinsics.EZpvd(pair.getSecond(), (java.lang.Object) value.getValue())) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) pair.getFirst())) {
                    ((AbstractC43942rym) c43312rms.OLrzqt()).gEmmrt.setVisibility(0);
                    ((AbstractC43942rym) c43312rms.OLrzqt()).gEmmrt.setText((java.lang.CharSequence) pair.getFirst());
                    ((AbstractC43942rym) c43312rms.OLrzqt()).copydefault.setBackgroundResource(C43662rtX.Activity.ejfBZ);
                } else {
                    ((AbstractC43942rym) c43312rms.OLrzqt()).gEmmrt.setVisibility(8);
                    ((AbstractC43942rym) c43312rms.OLrzqt()).gEmmrt.setText("");
                    if (((AbstractC43942rym) c43312rms.OLrzqt()).KWHzl.hasFocus()) {
                        ((AbstractC43942rym) c43312rms.OLrzqt()).copydefault.setBackgroundResource(C43662rtX.Activity.fIwbmz);
                    } else {
                        ((AbstractC43942rym) c43312rms.OLrzqt()).copydefault.setBackgroundResource(C43662rtX.Activity.getFieldNames);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        public static final void AEQbTJ(C42298rNr c42298rNr, Value value, Activity activity, android.view.View view) {
            C43699ruH c43699ruH = C43699ruH.KWHzl;
            if (c43699ruH.OLrzqt(c42298rNr)) {
                c43699ruH.copydefault();
            }
            if (Intrinsics.EZpvd(value.getSelected(), java.lang.Boolean.FALSE)) {
                new C43739ruv().copydefault(activity.valueOf, C33129mqd.gEmmrt(value.getValue()), C33129mqd.gEmmrt(value.getText()));
                c42298rNr.AEQbTJ(value);
                activity.copydefault.invoke(value);
            }
        }
    }

    /* JADX INFO: renamed from: o.rNr$TaskDescription */
    public final class TaskDescription implements View.OnFocusChangeListener {
        public final /* synthetic */ C42298rNr EZpvd;
        public final android.view.View KWHzl;
        public final rAX<Value> OLrzqt;
        public final rGL copydefault;

        public TaskDescription(@NotNull C42298rNr c42298rNr, @NotNull rAX<Value> rax, @NotNull rGL rgl, android.view.View view) {
            Intrinsics.checkNotNullParameter(rax, "");
            Intrinsics.checkNotNullParameter(rgl, "");
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = c42298rNr;
            this.OLrzqt = rax;
            this.copydefault = rgl;
            this.KWHzl = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View view, boolean z) {
            if (view != null) {
                C42298rNr c42298rNr = this.EZpvd;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (!z) {
                    this.KWHzl.setBackgroundResource(C43662rtX.Activity.getFieldNames);
                    this.copydefault.AwvSrB().setValue(0);
                    this.OLrzqt.OLrzqt(true);
                } else {
                    this.KWHzl.setBackgroundResource(C43662rtX.Activity.fIwbmz);
                    this.copydefault.OLrzqt(c42298rNr.getContext().getResources().getDimensionPixelSize(C43662rtX.StateListAnimator.copydefault));
                    this.copydefault.AwvSrB().setValue(java.lang.Integer.valueOf(iArr[1] + view.getMeasuredHeight()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.rNr$ActionBar */
    public final class ActionBar implements android.text.TextWatcher {
        public final rAX<Value> AEQbTJ;
        public final C55001xbh EZpvd;
        public final /* synthetic */ C42298rNr OLrzqt;
        public final boolean copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(@NotNull C42298rNr c42298rNr, rAX<Value> rax, boolean z, C55001xbh c55001xbh) {
            Intrinsics.checkNotNullParameter(rax, "");
            this.OLrzqt = c42298rNr;
            this.AEQbTJ = rax;
            this.copydefault = z;
            this.EZpvd = c55001xbh;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            SubInput subInput;
            SubInput subInput2;
            Value value = this.AEQbTJ.getValue();
            if (this.copydefault) {
                if (value != null && (subInput2 = value.getSubInput()) != null) {
                    C55001xbh c55001xbh = this.EZpvd;
                    subInput2.setValue(c55001xbh != null ? c55001xbh.isConnected() : null);
                }
            } else if (value != null && (subInput = value.getSubInput()) != null) {
                subInput.setValue(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(editable)).toString());
            }
            this.AEQbTJ.setValue(value);
        }
    }
}
