package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetail;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetListAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C43662rtX;
import o.C52761wXj;
import o.rRH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rKK extends android.widget.FrameLayout {
    public final C43316rmw AEQbTJ;
    public final AbstractC43822rwY KWHzl;
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
    public rKK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rKK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:42) call: o.rKK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rKK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rKK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = ViewStatus.Form;
        this.AEQbTJ = new C43316rmw();
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.QbewEr, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC43822rwY) viewDataBindingInflate;
    }

    public final void AEQbTJ(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.List<rAX<AssetValue>> listORxRYg = rgl.ORxRYg();
            if (listORxRYg != null) {
                java.util.Iterator<T> it = listORxRYg.iterator();
                while (it.hasNext()) {
                    final rAX rax = (rAX) it.next();
                    final AssetListAppModel assetListAppModel = uIComponentAppModel instanceof AssetListAppModel ? (AssetListAppModel) uIComponentAppModel : null;
                    if (assetListAppModel != null && Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) assetListAppModel.getId())) {
                        if (Intrinsics.EZpvd(assetListAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                            setVisibility(8);
                            rax.EZpvd(false);
                            rax.setValue(null);
                        } else {
                            setVisibility(0);
                            java.lang.Boolean required = assetListAppModel.getRequired();
                            rax.EZpvd(required != null ? required.booleanValue() : false);
                            rax.setValue(EZpvd(assetListAppModel));
                        }
                        rgl.gasjUx().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.rKM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rKK.EZpvd(assetListAppModel, this, rax, (C42156rIk) obj);
                            }
                        }));
                        this.AEQbTJ.register(AssetDetail.class, new TaskDescription(this, new Function1() { // from class: o.rKQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rKK.copydefault(abstractC42074rFj, (AssetDetail) obj);
                            }
                        }));
                        this.AEQbTJ.register(C42218rKs.class, new Activity(this, new Function0() { // from class: o.rKP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return rKK.OLrzqt(assetListAppModel, this, fragmentManager, abstractC42074rFj);
                            }
                        }));
                    }
                }
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    public static final Unit EZpvd(AssetListAppModel assetListAppModel, rKK rkk, rAX rax, C42156rIk c42156rIk) {
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(assetListAppModel.getId()) && rkk.getVisibility() == 8) {
            rkk.setVisibility(0);
            rax.EZpvd((assetListAppModel == null || (required = assetListAppModel.getRequired()) == null) ? false : required.booleanValue());
            assetListAppModel.setHidden(java.lang.Boolean.FALSE);
            assetListAppModel.setCurrent("0");
            assetListAppModel.setFieldValue(new java.util.ArrayList<>());
            rax.setValue(null);
            rkk.KWHzl.OLrzqt.removeAllViews();
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(assetListAppModel.getId()) && rkk.getVisibility() == 0) {
            rkk.setVisibility(8);
            rax.EZpvd(false);
            assetListAppModel.setCurrent("0");
            assetListAppModel.setFieldValue(new java.util.ArrayList<>());
            assetListAppModel.setHidden(java.lang.Boolean.TRUE);
            rax.setValue(null);
            rkk.KWHzl.OLrzqt.removeAllViews();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC42074rFj abstractC42074rFj, AssetDetail assetDetail) {
        Intrinsics.checkNotNullParameter(assetDetail, "");
        CTAButtonAppModel editCta = assetDetail.getEditCta();
        if (editCta != null) {
            abstractC42074rFj.copydefault(editCta);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final AssetListAppModel assetListAppModel, rKK rkk, androidx.fragment.app.FragmentManager fragmentManager, final AbstractC42074rFj abstractC42074rFj) {
        java.util.List<Value> values;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C43693ruB.OLrzqt("KYC_PEP_InfoForm_Add_More_Click");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Choices choices = assetListAppModel.getChoices();
        if (choices != null && (values = choices.getValues()) != null) {
            for (Value value : values) {
                java.lang.String text = value.getText();
                java.lang.String tip = value.getTip();
                java.lang.String icon = value.getIcon();
                java.lang.String value2 = value.getValue();
                java.lang.String helperText = value.getHelperText();
                java.lang.Boolean enabled = value.getEnabled();
                arrayList.add(new rRH.TaskDescription(text, tip, icon, value2, helperText, enabled != null ? enabled.booleanValue() : true, false, value.getHiddenItemIds(), value.getDisplayedItemIds(), null, null, null, value.getReminder(), value.getPicture(), null, value.getCountryFlagUrl(), null, value.getPictureMeta(), value.getHasArrow(), 85504, null));
            }
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList) && !booleanRef.element) {
            booleanRef.element = true;
            android.content.Context context = rkk.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            rRH rrh = new rRH(context, "", null, false, null, false, new Function0() { // from class: o.rKJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return rKK.copydefault(booleanRef);
                }
            }, new Function1() { // from class: o.rKI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rKK.EZpvd(booleanRef, assetListAppModel, abstractC42074rFj, (rRH.TaskDescription) obj);
                }
            });
            rrh.showNow(fragmentManager, rRH.class.getCanonicalName());
            rRH.updateDataSet$default(rrh, arrayList, null, null, null, 14, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Ref.BooleanRef booleanRef) {
        booleanRef.element = false;
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Ref.BooleanRef booleanRef, AssetListAppModel assetListAppModel, AbstractC42074rFj abstractC42074rFj, rRH.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        booleanRef.element = false;
        java.lang.String strFetchVPNInfo = taskDescription.fetchVPNInfo();
        CTAButtonAppModel createCta = assetListAppModel.getCreateCta();
        if (createCta != null) {
            java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
            map.put("assetType", strFetchVPNInfo);
            if (createCta.getActionParams() == null) {
                createCta.setActionParams(new ActionParams((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.HashMap) null, (java.lang.Integer) null, (java.lang.Integer) null, 0, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.util.HashMap) null, (java.util.HashMap) null, (java.lang.Integer) null, (VerificationPayload) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (CallApiModel) null, (CallApiModel) null, (CallApiModel) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -1, 16383, (DefaultConstructorMarker) null));
            }
            ActionParams actionParams = createCta.getActionParams();
            Intrinsics.copydefault(actionParams);
            actionParams.setLocalParams(map);
            abstractC42074rFj.copydefault(createCta);
        }
        return Unit.INSTANCE;
    }

    public final class Activity extends AbstractC43310rmq<C42218rKs, AbstractC43824rwa> {
        public final Function0<Unit> AEQbTJ;
        public final /* synthetic */ rKK EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.DbNXlk;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ Activity KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, Activity activity) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.KWHzl = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.KWHzl.AEQbTJ.invoke();
                }
            }
        }

        public Activity(@NotNull rKK rkk, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.EZpvd = rkk;
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43824rwa> c43312rms, @NotNull C42218rKs c42218rKs) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c42218rKs, "");
            super.onBindViewHolder((C43312rms) c43312rms, c42218rKs);
            if (c42218rKs.OLrzqt()) {
                ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt.setText(c42218rKs.AEQbTJ());
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onLocationChanged);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
                }
                ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt.setCompoundDrawables(drawableKWHzl, null, null, null);
                ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt.setBackgroundResource(C43662rtX.Activity.KWHzl);
                ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
                ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt.setTextAppearance(this.EZpvd.getContext(), C52761wXj.LoaderManager.AxsJAY);
                android.widget.TextView textView = ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                int iDp2px$default = C55298xhM.dp2px$default(16.0f, null, 1, null);
                textView.setPadding(iDp2px$default, iDp2px$default, iDp2px$default, iDp2px$default);
                android.widget.TextView textView2 = ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt;
                textView2.setOnClickListener(new TaskDescription(textView2, 1000L, this));
                return;
            }
            ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt.setText(c42218rKs.EZpvd());
            ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt.setBackground(null);
            ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt.setTextColor(ContextCompat.getColor(this.EZpvd.getContext(), C52761wXj.Activity.UlJrfe));
            ((AbstractC43824rwa) c43312rms.OLrzqt()).OLrzqt.setTextAppearance(this.EZpvd.getContext(), C52761wXj.LoaderManager.KWHzl);
        }
    }

    public final class TaskDescription extends AbstractC43310rmq<AssetDetail, AbstractC43820rwW> {
        public final Function1<AssetDetail, Unit> EZpvd;
        public final /* synthetic */ rKK OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.QVAiDq;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ TaskDescription AEQbTJ;
            public final /* synthetic */ AssetDetail EZpvd;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, AssetDetail assetDetail, TaskDescription taskDescription) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.EZpvd = assetDetail;
                this.AEQbTJ = taskDescription;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd.getStatus(), (java.lang.Object) "4")) {
                        return;
                    }
                    this.AEQbTJ.EZpvd.invoke(this.EZpvd);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.AssetDetail, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull rKK rkk, Function1<? super AssetDetail, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = rkk;
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43820rwW> c43312rms, @NotNull AssetDetail assetDetail) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(assetDetail, "");
            super.onBindViewHolder((C43312rms) c43312rms, assetDetail);
            if (Intrinsics.EZpvd((java.lang.Object) assetDetail.getStatus(), (java.lang.Object) "4")) {
                ((AbstractC43820rwW) c43312rms.OLrzqt()).KWHzl.setVisibility(8);
                ((AbstractC43820rwW) c43312rms.OLrzqt()).copydefault.setBackgroundResource(C43662rtX.Activity.AEQbTJ);
            } else {
                ((AbstractC43820rwW) c43312rms.OLrzqt()).KWHzl.setVisibility(0);
                ((AbstractC43820rwW) c43312rms.OLrzqt()).copydefault.setBackgroundResource(C43662rtX.Activity.AhwBna);
            }
            java.lang.String status = assetDetail.getStatus();
            if (status == null) {
                ((AbstractC43820rwW) c43312rms.OLrzqt()).EZpvd.setImageResource(C52761wXj.TaskDescription.gqESXP);
            } else {
                int iHashCode = status.hashCode();
                if (iHashCode != 49) {
                    if (iHashCode != 51) {
                        if (iHashCode == 52 && status.equals("4")) {
                            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gqESXP);
                            if (drawableKWHzl != null) {
                                DrawableCompat.setTint(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                                ((AbstractC43820rwW) c43312rms.OLrzqt()).EZpvd.setImageDrawable(drawableKWHzl);
                            }
                        }
                    } else if (status.equals("3")) {
                        android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.shErWi);
                        if (drawableKWHzl2 != null) {
                            DrawableCompat.setTint(drawableKWHzl2, C33070mpX.copydefault(C52761wXj.Activity.gsvlRV));
                            ((AbstractC43820rwW) c43312rms.OLrzqt()).EZpvd.setImageDrawable(drawableKWHzl2);
                        }
                    }
                } else if (status.equals("1")) {
                    ((AbstractC43820rwW) c43312rms.OLrzqt()).EZpvd.setImageResource(C52761wXj.TaskDescription.gqESXP);
                }
            }
            ((AbstractC43820rwW) c43312rms.OLrzqt()).AEQbTJ.removeAllViews();
            java.lang.String title = assetDetail.getTitle();
            if (title != null) {
                ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(this.OLrzqt.getContext()), C43662rtX.TaskDescription.DarRvM, ((AbstractC43820rwW) c43312rms.OLrzqt()).AEQbTJ, false);
                Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
                AbstractC43871rxU abstractC43871rxU = (AbstractC43871rxU) viewDataBindingInflate;
                abstractC43871rxU.EZpvd.setText(title);
                if (Intrinsics.EZpvd((java.lang.Object) assetDetail.getStatus(), (java.lang.Object) "4")) {
                    abstractC43871rxU.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                } else {
                    abstractC43871rxU.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                }
                ((AbstractC43820rwW) c43312rms.OLrzqt()).AEQbTJ.addView(abstractC43871rxU.getRoot());
            }
            java.util.ArrayList<java.lang.String> contentList = assetDetail.getContentList();
            if (contentList != null) {
                rKK rkk = this.OLrzqt;
                for (java.lang.String str : contentList) {
                    ViewDataBinding viewDataBindingInflate2 = DataBindingUtil.inflate(android.view.LayoutInflater.from(rkk.getContext()), C43662rtX.TaskDescription.DarRvM, ((AbstractC43820rwW) c43312rms.OLrzqt()).AEQbTJ, false);
                    Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate2, "");
                    AbstractC43871rxU abstractC43871rxU2 = (AbstractC43871rxU) viewDataBindingInflate2;
                    abstractC43871rxU2.EZpvd.setTextAppearance(rkk.getContext(), C52761wXj.LoaderManager.valueOf);
                    abstractC43871rxU2.EZpvd.setTextSize(14.0f);
                    abstractC43871rxU2.EZpvd.setPadding(0, C55298xhM.dp2px$default(4.0f, null, 1, null), 0, 0);
                    if (Intrinsics.EZpvd((java.lang.Object) assetDetail.getStatus(), (java.lang.Object) "4")) {
                        abstractC43871rxU2.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                    } else {
                        abstractC43871rxU2.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
                    }
                    abstractC43871rxU2.EZpvd.setText(str);
                    ((AbstractC43820rwW) c43312rms.OLrzqt()).AEQbTJ.addView(abstractC43871rxU2.getRoot());
                }
            }
            android.widget.LinearLayout linearLayout = ((AbstractC43820rwW) c43312rms.OLrzqt()).copydefault;
            linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, assetDetail, this));
        }
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
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.copydefault, uIComponentAppModel.getBottomMargin()));
        AssetListAppModel assetListAppModel = uIComponentAppModel instanceof AssetListAppModel ? (AssetListAppModel) uIComponentAppModel : null;
        if (assetListAppModel != null) {
            if (C33129mqd.AEQbTJ(assetListAppModel.getCurrent(), 0)) {
                this.KWHzl.copydefault.setVisibility(0);
                android.widget.TextView textView = this.KWHzl.copydefault;
                java.lang.String str = assetListAppModel.getCurrent() + "/" + assetListAppModel.getTotal();
                java.lang.String[] strArr = new java.lang.String[1];
                java.lang.String current = assetListAppModel.getCurrent();
                if (current == null) {
                    current = "";
                }
                strArr[0] = current;
                java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(str, strArr, 0, null, false, new Function1() { // from class: o.rKL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rKK.EZpvd((java.util.List) obj);
                    }
                }, 14, null);
                java.lang.String[] strArr2 = new java.lang.String[1];
                java.lang.String total = assetListAppModel.getTotal();
                if (total == null) {
                    total = "";
                }
                strArr2[0] = total;
                textView.setText(C33061mpO.setupSpanStyles$default(charSequence, strArr2, 0, null, false, new Function1() { // from class: o.rKH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rKK.AEQbTJ((java.util.List) obj);
                    }
                }, 14, null));
                android.widget.ProgressBar progressBar = this.KWHzl.EZpvd;
                java.lang.String total2 = assetListAppModel.getTotal();
                progressBar.setMax(total2 != null ? C33129mqd.AhwBna(total2) : 100);
                android.widget.ProgressBar progressBar2 = this.KWHzl.EZpvd;
                java.lang.String current2 = assetListAppModel.getCurrent();
                progressBar2.setProgress(current2 != null ? C33129mqd.AhwBna(current2) : 0);
                this.KWHzl.EZpvd.setVisibility(0);
            } else {
                this.KWHzl.copydefault.setVisibility(8);
                this.KWHzl.EZpvd.setVisibility(8);
            }
            C31695mAm c31695mAm = this.KWHzl.OLrzqt;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            android.content.Context context3 = c31695mAm.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c31695mAm.addItemDecoration(new Application(context3));
            c31695mAm.setAdapter(this.AEQbTJ);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            AssetListAppModel assetListAppModel2 = (AssetListAppModel) uIComponentAppModel;
            arrayList.addAll(assetListAppModel2.getFieldValue());
            java.lang.String buttonText = assetListAppModel.getButtonText();
            arrayList.add(new C42218rKs(buttonText != null ? buttonText : "", assetListAppModel2.getMaxSizeWarning(), assetListAppModel2.getFieldValue().size() < assetListAppModel2.getMaxSize()));
            this.AEQbTJ.setItems(arrayList);
            this.AEQbTJ.notifyDataSetChanged();
        }
    }

    public static final Unit EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }

    public final AssetValue EZpvd(AssetListAppModel assetListAppModel) {
        java.lang.String total = assetListAppModel.getTotal();
        if (total == null) {
            total = "";
        }
        java.lang.String current = assetListAppModel.getCurrent();
        return new AssetValue(total, current != null ? current : "", assetListAppModel.getFieldValue());
    }

    public static final class Application extends RecyclerView.ItemDecoration {
        public final android.content.Context OLrzqt;

        public Application(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.OLrzqt = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = this.OLrzqt.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuBGHE);
            }
        }
    }
}
