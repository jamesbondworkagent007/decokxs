package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputMultipleChoicesAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42331rOx;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rOx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42331rOx extends android.widget.FrameLayout {
    public ViewStatus AEQbTJ;
    public final java.util.ArrayList<Value> KWHzl;
    public final C43316rmw OLrzqt;
    public final AbstractC43952ryw copydefault;

    /* JADX INFO: renamed from: o.rOx$Activity */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42331rOx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42331rOx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:34) call: o.rOx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42331rOx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42331rOx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = ViewStatus.Form;
        this.KWHzl = new java.util.ArrayList<>();
        this.OLrzqt = new C43316rmw();
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.gwTjWJ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43952ryw) viewDataBindingInflate;
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.lang.Boolean required;
        java.lang.String maxNumOfOptions;
        Choices choices;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final InputMultipleChoicesAppModel inputMultipleChoicesAppModel = uIComponentAppModel instanceof InputMultipleChoicesAppModel ? (InputMultipleChoicesAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.UeEOUB().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (inputMultipleChoicesAppModel != null ? inputMultipleChoicesAppModel.getId() : null))) {
                    rax.setValue(OLrzqt());
                    boolean zBooleanValue = false;
                    if (inputMultipleChoicesAppModel != null && Intrinsics.EZpvd(inputMultipleChoicesAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(null);
                    } else {
                        setVisibility(0);
                        if (inputMultipleChoicesAppModel != null && (required = inputMultipleChoicesAppModel.getRequired()) != null) {
                            zBooleanValue = required.booleanValue();
                        }
                        rax.EZpvd(zBooleanValue);
                        rax.setValue(OLrzqt());
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new Activity(new Function1() { // from class: o.rOz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42331rOx.OLrzqt(inputMultipleChoicesAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    C43316rmw c43316rmw = this.OLrzqt;
                    if (inputMultipleChoicesAppModel == null || (choices = inputMultipleChoicesAppModel.getChoices()) == null || (maxNumOfOptions = choices.getMaxNumOfOptions()) == null) {
                        maxNumOfOptions = "1";
                    }
                    c43316rmw.register(Value.class, new Application(this, C33129mqd.AhwBna(maxNumOfOptions), new Function1() { // from class: o.rOC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42331rOx.OLrzqt(rax, this, (Value) obj);
                        }
                    }));
                    AEQbTJ((java.util.List<java.lang.String>) rax.getValue());
                }
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    public static final Unit OLrzqt(InputMultipleChoicesAppModel inputMultipleChoicesAppModel, C42331rOx c42331rOx, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), inputMultipleChoicesAppModel != null ? inputMultipleChoicesAppModel.getId() : null) && c42331rOx.getVisibility() == 8) {
                c42331rOx.setVisibility(0);
                rax.EZpvd((inputMultipleChoicesAppModel == null || (required = inputMultipleChoicesAppModel.getRequired()) == null) ? false : required.booleanValue());
                rax.setValue(null);
                c42331rOx.AEQbTJ((java.util.List<java.lang.String>) rax.getValue());
                if (inputMultipleChoicesAppModel != null) {
                    inputMultipleChoicesAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), inputMultipleChoicesAppModel != null ? inputMultipleChoicesAppModel.getId() : null) && c42331rOx.getVisibility() == 0) {
                c42331rOx.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(null);
                c42331rOx.AEQbTJ((java.util.List<java.lang.String>) rax.getValue());
                if (inputMultipleChoicesAppModel != null) {
                    inputMultipleChoicesAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(rAX rax, C42331rOx c42331rOx, Value value) {
        rax.setValue(c42331rOx.OLrzqt());
        return Unit.INSTANCE;
    }

    private final java.util.ArrayList<java.lang.String> OLrzqt() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<Value> it = this.KWHzl.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Value next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            Value value = next;
            if (Intrinsics.EZpvd(value.getSelected(), java.lang.Boolean.TRUE)) {
                arrayList.add(value.getValue());
            }
        }
        return arrayList;
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel) {
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
        InputMultipleChoicesAppModel inputMultipleChoicesAppModel = uIComponentAppModel instanceof InputMultipleChoicesAppModel ? (InputMultipleChoicesAppModel) uIComponentAppModel : null;
        if (inputMultipleChoicesAppModel != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inputMultipleChoicesAppModel.getLabel())) {
                this.copydefault.OLrzqt.setText(inputMultipleChoicesAppModel.getLabel());
                this.copydefault.OLrzqt.setVisibility(0);
            } else {
                this.copydefault.OLrzqt.setVisibility(8);
            }
            C31695mAm c31695mAm = this.copydefault.copydefault;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            c31695mAm.setAdapter(this.OLrzqt);
            Choices choices = inputMultipleChoicesAppModel.getChoices();
            if (choices != null) {
                java.util.List<Value> values = choices.getValues();
                if (values != null) {
                    this.KWHzl.addAll(values);
                }
                this.OLrzqt.setItems(this.KWHzl);
                this.OLrzqt.notifyDataSetChanged();
            }
        }
    }

    public final void AEQbTJ(@NotNull Value value) {
        Intrinsics.checkNotNullParameter(value, "");
        java.util.Iterator<Value> it = this.KWHzl.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Value next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            Value value2 = next;
            value2.setSelected(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) value.getValue(), (java.lang.Object) value2.getValue())));
        }
        this.OLrzqt.notifyDataSetChanged();
    }

    public final void EZpvd(boolean z, @NotNull Value value) {
        Intrinsics.checkNotNullParameter(value, "");
        if (z && Intrinsics.EZpvd(value.isExclusive(), java.lang.Boolean.TRUE)) {
            java.util.Iterator<Value> it = this.KWHzl.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                Value next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                Value value2 = next;
                if (!Intrinsics.EZpvd((java.lang.Object) value2.getValue(), (java.lang.Object) value.getValue())) {
                    value2.setSelected(java.lang.Boolean.FALSE);
                }
            }
        } else if (z && !Intrinsics.EZpvd(value.isExclusive(), java.lang.Boolean.TRUE)) {
            java.util.Iterator<Value> it2 = this.KWHzl.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "");
            while (it2.hasNext()) {
                Value next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "");
                Value value3 = next2;
                if (Intrinsics.EZpvd(value3.isExclusive(), java.lang.Boolean.TRUE)) {
                    value3.setSelected(java.lang.Boolean.FALSE);
                }
            }
        }
        value.setSelected(java.lang.Boolean.valueOf(z));
        this.OLrzqt.notifyDataSetChanged();
    }

    private final void AEQbTJ(java.util.List<java.lang.String> list) {
        java.util.Iterator<Value> it = this.KWHzl.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Value next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            Value value = next;
            value.setSelected(list != null ? java.lang.Boolean.valueOf(list.contains(value.getValue())) : null);
        }
        this.OLrzqt.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.rOx$Application */
    public final class Application extends AbstractC43310rmq<Value, AbstractC43951ryv> {
        public final /* synthetic */ C42331rOx AEQbTJ;
        public final Function1<Value, Unit> KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.OBJEWx;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.Value, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(C42331rOx c42331rOx, @NotNull int i, Function1<? super Value, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = c42331rOx;
            this.OLrzqt = i;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43951ryv> c43312rms, @NotNull final Value value) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(value, "");
            super.onBindViewHolder((C43312rms) c43312rms, value);
            ((AbstractC43951ryv) c43312rms.OLrzqt()).copydefault.setText(value.getText());
            final boolean zKWHzl = this.AEQbTJ.KWHzl();
            java.lang.Boolean boolIsExclusive = value.isExclusive();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(boolIsExclusive, bool)) {
                zKWHzl = false;
            }
            if (Intrinsics.EZpvd(value.getSelected(), bool)) {
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.fdt);
                if (drawableKWHzl != null) {
                    DrawableCompat.setTint(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
                    ((AbstractC43951ryv) c43312rms.OLrzqt()).AEQbTJ.setImageDrawable(drawableKWHzl);
                }
                ((AbstractC43951ryv) c43312rms.OLrzqt()).KWHzl.setBackgroundResource(C43662rtX.Activity.DbNXlk);
                ((AbstractC43951ryv) c43312rms.OLrzqt()).copydefault.setAlpha(1.0f);
                ((AbstractC43951ryv) c43312rms.OLrzqt()).KWHzl.setEnabled(true);
            } else if (zKWHzl) {
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.FHvxmb);
                if (drawableKWHzl2 != null) {
                    DrawableCompat.setTint(drawableKWHzl2, C33070mpX.copydefault(C52761wXj.Activity.GiPPlLgiPPlL));
                    ((AbstractC43951ryv) c43312rms.OLrzqt()).AEQbTJ.setImageDrawable(drawableKWHzl2);
                }
                ((AbstractC43951ryv) c43312rms.OLrzqt()).KWHzl.setBackgroundResource(C43662rtX.Activity.isConnected);
                ((AbstractC43951ryv) c43312rms.OLrzqt()).copydefault.setAlpha(0.4f);
                ((AbstractC43951ryv) c43312rms.OLrzqt()).KWHzl.setEnabled(false);
            } else {
                android.graphics.drawable.Drawable drawableKWHzl3 = C33070mpX.KWHzl(C52761wXj.TaskDescription.FHvxmb);
                if (drawableKWHzl3 != null) {
                    DrawableCompat.setTint(drawableKWHzl3, C33070mpX.copydefault(C52761wXj.Activity.GiPPlLgiPPlL));
                    ((AbstractC43951ryv) c43312rms.OLrzqt()).AEQbTJ.setImageDrawable(drawableKWHzl3);
                }
                ((AbstractC43951ryv) c43312rms.OLrzqt()).KWHzl.setBackgroundResource(C43662rtX.Activity.isConnected);
                ((AbstractC43951ryv) c43312rms.OLrzqt()).copydefault.setAlpha(1.0f);
                ((AbstractC43951ryv) c43312rms.OLrzqt()).KWHzl.setEnabled(true);
            }
            LinearLayoutCompat linearLayoutCompat = ((AbstractC43951ryv) c43312rms.OLrzqt()).KWHzl;
            final C42331rOx c42331rOx = this.AEQbTJ;
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: o.rOA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42331rOx.Application.copydefault(zKWHzl, value, this, c42331rOx, view);
                }
            });
            if (getPosition(c43312rms) == 0) {
                ((AbstractC43951ryv) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
            } else {
                ((AbstractC43951ryv) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
            }
        }

        public static final void copydefault(boolean z, Value value, Application application, C42331rOx c42331rOx, android.view.View view) {
            if (z) {
                return;
            }
            if (Intrinsics.EZpvd(value.getSelected(), java.lang.Boolean.FALSE)) {
                if (application.OLrzqt > 1) {
                    c42331rOx.EZpvd(true, value);
                } else {
                    c42331rOx.AEQbTJ(value);
                }
                application.KWHzl.invoke(value);
                return;
            }
            if (application.OLrzqt > 1) {
                c42331rOx.EZpvd(false, value);
                application.KWHzl.invoke(value);
            }
        }
    }

    public final boolean KWHzl() {
        java.util.ArrayList<Value> arrayList = this.KWHzl;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            for (Value value : arrayList) {
                java.lang.Boolean selected = value.getSelected();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (Intrinsics.EZpvd(selected, bool) && Intrinsics.EZpvd(value.isExclusive(), bool)) {
                    return true;
                }
            }
        }
        return false;
    }
}
