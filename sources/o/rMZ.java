package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxGroupedValues;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCheckboxSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.rMZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rMZ extends android.widget.FrameLayout {
    public final AbstractC43941ryl AEQbTJ;
    public boolean EZpvd;
    public final C43316rmw KWHzl;
    public final java.util.Map<java.lang.Integer, java.lang.String> OLrzqt;
    public InputCheckboxSelectAppModel copydefault;
    public ViewStatus djBIcL;
    public final java.util.ArrayList<CheckboxValue> valueOf;

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
    public rMZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rMZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: o.rMZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rMZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rMZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = new java.util.ArrayList<>();
        this.OLrzqt = new java.util.HashMap();
        this.KWHzl = new C43316rmw();
        this.djBIcL = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.zuWLRA, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC43941ryl) viewDataBindingInflate;
    }

    private final java.util.ArrayList<java.lang.String> EZpvd() {
        return (java.util.ArrayList) C59467zhb.OLrzqt(C59467zhb.fJNWhG(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(this.valueOf), new Function1() { // from class: o.rNa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rMZ.OLrzqt((CheckboxValue) obj));
            }
        }), new Function1() { // from class: o.rNf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rMZ.AEQbTJ((CheckboxValue) obj);
            }
        }), new java.util.ArrayList());
    }

    public static final boolean OLrzqt(CheckboxValue checkboxValue) {
        Intrinsics.checkNotNullParameter(checkboxValue, "");
        return Intrinsics.EZpvd(checkboxValue.isSelected(), java.lang.Boolean.TRUE);
    }

    public static final java.lang.String AEQbTJ(CheckboxValue checkboxValue) {
        Intrinsics.checkNotNullParameter(checkboxValue, "");
        return checkboxValue.getValue();
    }

    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final InputCheckboxSelectAppModel inputCheckboxSelectAppModel = uIComponentAppModel instanceof InputCheckboxSelectAppModel ? (InputCheckboxSelectAppModel) uIComponentAppModel : null;
        if (inputCheckboxSelectAppModel == null) {
            return;
        }
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.UeEOUB().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) inputCheckboxSelectAppModel.getId())) {
                    rax.setValue(EZpvd());
                    if (Intrinsics.EZpvd(inputCheckboxSelectAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(null);
                    } else {
                        setVisibility(0);
                        java.lang.Boolean required = inputCheckboxSelectAppModel.getRequired();
                        rax.EZpvd(required != null ? required.booleanValue() : false);
                        rax.setValue(EZpvd());
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new Application(new Function1() { // from class: o.rNe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rMZ.AEQbTJ(inputCheckboxSelectAppModel, this, rax, (C42156rIk) obj);
                        }
                    }));
                    if (!this.EZpvd) {
                        this.KWHzl.register(CheckboxValue.class, new TaskDescription(this, new Function1() { // from class: o.rNd
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rMZ.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
                            }
                        }, new Function0() { // from class: o.rNg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return rMZ.OLrzqt(rax, this, inputCheckboxSelectAppModel);
                            }
                        }));
                        this.EZpvd = true;
                    }
                    KWHzl(inputCheckboxSelectAppModel);
                    this.AEQbTJ.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.rNc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            rMZ.OLrzqt(this.copydefault, rax, inputCheckboxSelectAppModel, view);
                        }
                    });
                    KWHzl((java.util.List<java.lang.String>) rax.getValue());
                }
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    public static final Unit AEQbTJ(InputCheckboxSelectAppModel inputCheckboxSelectAppModel, rMZ rmz, rAX rax, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(inputCheckboxSelectAppModel.getId()) && rmz.getVisibility() != 0) {
            rmz.setVisibility(0);
            java.lang.Boolean required = inputCheckboxSelectAppModel.getRequired();
            rax.EZpvd(required != null ? required.booleanValue() : false);
            rax.setValue(null);
            rmz.KWHzl((java.util.List<java.lang.String>) rax.getValue());
            inputCheckboxSelectAppModel.setHidden(java.lang.Boolean.FALSE);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(inputCheckboxSelectAppModel.getId()) && rmz.getVisibility() == 0) {
            rmz.setVisibility(8);
            rax.EZpvd(false);
            rax.setValue(null);
            rmz.KWHzl((java.util.List<java.lang.String>) rax.getValue());
            inputCheckboxSelectAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String copydefault(rMZ rmz, int i) {
        return rmz.OLrzqt.get(java.lang.Integer.valueOf(i));
    }

    public static final Unit OLrzqt(rAX rax, rMZ rmz, InputCheckboxSelectAppModel inputCheckboxSelectAppModel) {
        rax.setValue(rmz.EZpvd());
        rmz.KWHzl(inputCheckboxSelectAppModel);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(rMZ rmz, rAX rax, InputCheckboxSelectAppModel inputCheckboxSelectAppModel, android.view.View view) {
        java.util.ArrayList<CheckboxValue> arrayList = rmz.valueOf;
        if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator<T> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if ((!Intrinsics.EZpvd(((CheckboxValue) it.next()).getDisabled(), java.lang.Boolean.TRUE)) && (i = i + 1) < 0) {
                yDY.djBIcL();
            }
        }
        if (i == 0) {
            return;
        }
        rmz.EZpvd(rmz.AEQbTJ.EZpvd.isChecked());
        rmz.OLrzqt();
        rax.setValue(rmz.EZpvd());
        rmz.KWHzl(inputCheckboxSelectAppModel);
        rmz.copydefault();
    }

    private final void KWHzl(java.util.List<java.lang.String> list) {
        java.util.Set setCopydefault;
        if (list == null || (setCopydefault = CollectionsKt___CollectionsKt.QKudOq(list)) == null) {
            setCopydefault = yEE.copydefault();
        }
        java.util.Iterator<CheckboxValue> it = this.valueOf.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            CheckboxValue next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            CheckboxValue checkboxValue = next;
            checkboxValue.setSelected(java.lang.Boolean.valueOf(setCopydefault.contains(checkboxValue.getValue())));
        }
        this.KWHzl.notifyDataSetChanged();
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
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.djBIcL, uIComponentAppModel.getBottomMargin()));
        InputCheckboxSelectAppModel inputCheckboxSelectAppModel = uIComponentAppModel instanceof InputCheckboxSelectAppModel ? (InputCheckboxSelectAppModel) uIComponentAppModel : null;
        if (inputCheckboxSelectAppModel != null) {
            this.copydefault = inputCheckboxSelectAppModel;
            C31695mAm c31695mAm = this.AEQbTJ.copydefault;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            c31695mAm.setAdapter(this.KWHzl);
            OLrzqt();
            this.KWHzl.setItems(this.valueOf);
            KWHzl(inputCheckboxSelectAppModel);
            this.KWHzl.notifyDataSetChanged();
        }
    }

    public final void copydefault() {
        this.KWHzl.setItems(new java.util.ArrayList(this.valueOf));
        this.AEQbTJ.copydefault.post(new java.lang.Runnable() { // from class: o.rNk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                rMZ.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(rMZ rmz) {
        rmz.KWHzl.notifyDataSetChanged();
    }

    public final void KWHzl(InputCheckboxSelectAppModel inputCheckboxSelectAppModel) {
        if (inputCheckboxSelectAppModel != null && Intrinsics.EZpvd(inputCheckboxSelectAppModel.getEnableSelectAll(), java.lang.Boolean.TRUE)) {
            LinearLayoutCompat linearLayoutCompat = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            android.widget.TextView textView = this.AEQbTJ.AEQbTJ;
            java.lang.String selectAllText = inputCheckboxSelectAppModel.getSelectAllText();
            if (selectAllText == null) {
                selectAllText = "Select All";
            }
            textView.setText(selectAllText);
            this.AEQbTJ.EZpvd.setChecked(KWHzl());
            return;
        }
        LinearLayoutCompat linearLayoutCompat2 = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(8);
    }

    public final void EZpvd(boolean z) {
        java.util.List<CheckboxGroupedValues> groupedValues;
        InputCheckboxSelectAppModel inputCheckboxSelectAppModel = this.copydefault;
        if (inputCheckboxSelectAppModel != null && (groupedValues = inputCheckboxSelectAppModel.getGroupedValues()) != null) {
            java.util.Iterator<T> it = groupedValues.iterator();
            while (it.hasNext()) {
                for (CheckboxValue checkboxValue : ((CheckboxGroupedValues) it.next()).getValues()) {
                    if (!Intrinsics.EZpvd(checkboxValue.getDisabled(), java.lang.Boolean.TRUE)) {
                        checkboxValue.setSelected(java.lang.Boolean.valueOf(z));
                    }
                }
            }
        }
        for (CheckboxValue checkboxValue2 : this.valueOf) {
            if (!Intrinsics.EZpvd(checkboxValue2.getDisabled(), java.lang.Boolean.TRUE)) {
                checkboxValue2.setSelected(java.lang.Boolean.valueOf(z));
            }
        }
    }

    public final void OLrzqt() {
        this.valueOf.clear();
        this.OLrzqt.clear();
        InputCheckboxSelectAppModel inputCheckboxSelectAppModel = this.copydefault;
        if (inputCheckboxSelectAppModel == null) {
            return;
        }
        for (CheckboxGroupedValues checkboxGroupedValues : inputCheckboxSelectAppModel.getGroupedValues()) {
            int size = this.valueOf.size();
            java.util.Iterator<T> it = checkboxGroupedValues.getValues().iterator();
            while (it.hasNext()) {
                this.valueOf.add((CheckboxValue) it.next());
            }
            if (!checkboxGroupedValues.getValues().isEmpty()) {
                this.OLrzqt.put(java.lang.Integer.valueOf(size), checkboxGroupedValues.getName());
            }
        }
    }

    public final class TaskDescription extends AbstractC43310rmq<CheckboxValue, AbstractC43938ryi> {
        public final Function1<java.lang.Integer, java.lang.String> AEQbTJ;
        public final /* synthetic */ rMZ OLrzqt;
        public final Function0<Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.DCUTEI;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull rMZ rmz, @NotNull Function1<? super java.lang.Integer, java.lang.String> function1, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.OLrzqt = rmz;
            this.AEQbTJ = function1;
            this.copydefault = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43938ryi> c43312rms, @NotNull final CheckboxValue checkboxValue) {
            java.lang.String strEZpvd;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(checkboxValue, "");
            super.onBindViewHolder((C43312rms) c43312rms, checkboxValue);
            java.lang.String strInvoke = this.AEQbTJ.invoke(java.lang.Integer.valueOf(getPosition(c43312rms)));
            boolean z = !(strInvoke == null || strInvoke.length() == 0);
            android.widget.TextView textView = ((AbstractC43938ryi) c43312rms.OLrzqt()).gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z ? 0 : 8);
            android.view.View view = ((AbstractC43938ryi) c43312rms.OLrzqt()).AYXKKw;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(z ? 0 : 8);
            if (z) {
                ((AbstractC43938ryi) c43312rms.OLrzqt()).gEmmrt.setText(strInvoke);
            }
            java.lang.String thumbnail = checkboxValue.getThumbnail();
            boolean z2 = (thumbnail == null || thumbnail.length() == 0 || (strEZpvd = C43386roM.EZpvd.EZpvd()) == null || strEZpvd.length() == 0) ? false : true;
            android.widget.ImageView imageView = ((AbstractC43938ryi) c43312rms.OLrzqt()).copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(z2 ? 0 : 8);
            if (z2) {
                Glide.AEQbTJ(((AbstractC43938ryi) c43312rms.OLrzqt()).copydefault.getContext()).EZpvd(C43386roM.EZpvd.EZpvd() + checkboxValue.getThumbnail()).KWHzl(C43662rtX.Activity.QOLQEE).copydefault(C43662rtX.Activity.QOLQEE).EZpvd(((AbstractC43938ryi) c43312rms.OLrzqt()).copydefault);
            }
            ((AbstractC43938ryi) c43312rms.OLrzqt()).AhwBna.setText(checkboxValue.getTitle());
            if (checkboxValue.getTag() != null) {
                C55251xgS c55251xgS = ((AbstractC43938ryi) c43312rms.OLrzqt()).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                c55251xgS.setVisibility(0);
                rQR rqr = rQR.AEQbTJ;
                C55251xgS c55251xgS2 = ((AbstractC43938ryi) c43312rms.OLrzqt()).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                rQR.setupTag$default(rqr, c55251xgS2, checkboxValue.getTag(), null, null, 12, null);
            } else {
                C55251xgS c55251xgS3 = ((AbstractC43938ryi) c43312rms.OLrzqt()).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
                c55251xgS3.setVisibility(8);
            }
            java.lang.String subtitle = checkboxValue.getSubtitle();
            boolean z3 = !(subtitle == null || subtitle.length() == 0);
            android.widget.TextView textView2 = ((AbstractC43938ryi) c43312rms.OLrzqt()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(z3 ? 0 : 8);
            if (z3) {
                ((AbstractC43938ryi) c43312rms.OLrzqt()).EZpvd.setText(checkboxValue.getSubtitle());
            }
            ((AbstractC43938ryi) c43312rms.OLrzqt()).valueOf.setText(checkboxValue.getRightText());
            wYK wyk = ((AbstractC43938ryi) c43312rms.OLrzqt()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(wyk, "");
            java.lang.Boolean boolIsCheckboxVisible = checkboxValue.isCheckboxVisible();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            wyk.setVisibility(Intrinsics.EZpvd(boolIsCheckboxVisible, bool) ? 0 : 8);
            ((AbstractC43938ryi) c43312rms.OLrzqt()).KWHzl.setChecked(Intrinsics.EZpvd(checkboxValue.isSelected(), bool));
            final boolean zEZpvd = Intrinsics.EZpvd(checkboxValue.getDisabled(), bool);
            ((AbstractC43938ryi) c43312rms.OLrzqt()).KWHzl.setEnabled(!zEZpvd);
            final rMZ rmz = this.OLrzqt;
            final Function0 function0 = new Function0() { // from class: o.rNh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return rMZ.TaskDescription.KWHzl(zEZpvd, checkboxValue, rmz, this);
                }
            };
            ((AbstractC43938ryi) c43312rms.OLrzqt()).KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rNj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    rMZ.TaskDescription.OLrzqt(function0, view2);
                }
            });
        }

        public static final Unit KWHzl(boolean z, CheckboxValue checkboxValue, rMZ rmz, TaskDescription taskDescription) {
            if (!z) {
                checkboxValue.setSelected(java.lang.Boolean.valueOf(!(checkboxValue.isSelected() != null ? r1.booleanValue() : false)));
                if (Intrinsics.EZpvd(checkboxValue.isSelected(), java.lang.Boolean.FALSE)) {
                    rmz.AEQbTJ.EZpvd.setChecked(false);
                }
                taskDescription.copydefault.invoke();
            }
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(Function0 function0, android.view.View view) {
            function0.invoke();
        }
    }

    public final boolean KWHzl() {
        java.util.ArrayList<CheckboxValue> arrayList = this.valueOf;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (true ^ Intrinsics.EZpvd(((CheckboxValue) obj).getDisabled(), java.lang.Boolean.TRUE)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (!Intrinsics.EZpvd(((CheckboxValue) it.next()).isSelected(), java.lang.Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }
}
