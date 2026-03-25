package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore;
import com.okinc.ok_kyc_core.data.remote.networkmodel.EditableCopyModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.EditableListAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rLM extends android.widget.FrameLayout {
    public int AEQbTJ;
    public rQO KWHzl;
    public final AbstractC43898rxv OLrzqt;
    public ViewStatus copydefault;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
    public rLM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rLM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.rLM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rLM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rLM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = ViewStatus.Form;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.gasjUx, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC43898rxv) viewDataBindingInflate;
    }

    public void copydefault(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull final LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            final EditableListAppModel editableListAppModel = uIComponentAppModel instanceof EditableListAppModel ? (EditableListAppModel) uIComponentAppModel : null;
            if (editableListAppModel != null) {
                rGL rgl = (rGL) abstractC42074rFj;
                java.util.Iterator<T> it = rgl.dNCPSb().iterator();
                while (it.hasNext()) {
                    rAX rax = (rAX) it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) editableListAppModel.getId())) {
                        rax.setValue(null);
                    }
                }
                rgl.gasjUx().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rLL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rLM.OLrzqt(editableListAppModel, this, abstractC42074rFj, lifecycleOwner, (C42156rIk) obj);
                    }
                }));
                if (Intrinsics.EZpvd(editableListAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                    setVisibility(8);
                } else {
                    setVisibility(0);
                    AEQbTJ(editableListAppModel);
                    EZpvd(rgl, editableListAppModel, lifecycleOwner);
                }
                android.widget.TextView textView = this.OLrzqt.EZpvd;
                textView.setOnClickListener(new Application(textView, 1000L, this, editableListAppModel, abstractC42074rFj, lifecycleOwner));
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            return;
        }
        boolean z = abstractC42074rFj instanceof rIM;
    }

    public static final Unit OLrzqt(EditableListAppModel editableListAppModel, rLM rlm, AbstractC42074rFj abstractC42074rFj, LifecycleOwner lifecycleOwner, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(editableListAppModel.getId()) && rlm.getVisibility() == 8) {
            rlm.AEQbTJ = editableListAppModel.getCount();
            rlm.AEQbTJ(editableListAppModel);
            rlm.EZpvd((rGL) abstractC42074rFj, editableListAppModel, lifecycleOwner);
            rlm.setVisibility(0);
            editableListAppModel.setHidden(java.lang.Boolean.FALSE);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(editableListAppModel.getId()) && rlm.getVisibility() == 0) {
            rlm.setVisibility(8);
            editableListAppModel.setHidden(java.lang.Boolean.TRUE);
            rlm.OLrzqt.copydefault.removeAllViews();
            java.util.List<EditableCopyModel> copyModels = editableListAppModel.getCopyModels();
            if (copyModels != null) {
                java.util.Iterator<T> it = copyModels.iterator();
                while (it.hasNext()) {
                    ((rGL) abstractC42074rFj).flVtFt(((EditableCopyModel) it.next()).getGroupKey());
                }
            }
            java.util.Iterator<T> it2 = editableListAppModel.getDefaultModels().iterator();
            while (it2.hasNext()) {
                ((rGL) abstractC42074rFj).flVtFt(((EditableCopyModel) it2.next()).getGroupKey());
            }
            editableListAppModel.setCopyModels(null);
            editableListAppModel.setDefaultModels(new java.util.ArrayList());
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements Function1<android.view.View, Unit> {
        public final /* synthetic */ AbstractC42074rFj AEQbTJ;
        public final /* synthetic */ EditableListAppModel EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(AbstractC42074rFj abstractC42074rFj, java.lang.String str, EditableListAppModel editableListAppModel) {
            this.AEQbTJ = abstractC42074rFj;
            this.KWHzl = str;
            this.EZpvd = editableListAppModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(android.view.View view) {
            AEQbTJ(view);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            rLM.this.copydefault((rGL) this.AEQbTJ, this.KWHzl, view, this.EZpvd);
        }
    }

    public final void EZpvd(final rGL rgl, final EditableListAppModel editableListAppModel, LifecycleOwner lifecycleOwner) {
        if (editableListAppModel.getDefaultModels().size() > 0) {
            for (EditableCopyModel editableCopyModel : editableListAppModel.getDefaultModels()) {
                java.lang.Float deleteTopMargin = editableListAppModel.getDeleteTopMargin();
                addTemplate$default(this, deleteTopMargin != null ? deleteTopMargin.floatValue() : 0.0f, editableListAppModel.getId(), editableCopyModel.getItems(), rgl, lifecycleOwner, true, editableListAppModel.getCount(), null, 128, null);
            }
        }
        java.util.List<EditableCopyModel> copyModels = editableListAppModel.getCopyModels();
        if (copyModels != null) {
            for (final EditableCopyModel editableCopyModel2 : copyModels) {
                java.lang.Float deleteTopMargin2 = editableListAppModel.getDeleteTopMargin();
                OLrzqt(deleteTopMargin2 != null ? deleteTopMargin2.floatValue() : 0.0f, editableListAppModel.getId(), editableCopyModel2.getItems(), rgl, lifecycleOwner, false, editableListAppModel.getCount(), new Function1() { // from class: o.rLN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rLM.KWHzl(this.EZpvd, rgl, editableCopyModel2, editableListAppModel, (android.view.View) obj);
                    }
                });
            }
        }
    }

    public static final Unit KWHzl(rLM rlm, rGL rgl, EditableCopyModel editableCopyModel, EditableListAppModel editableListAppModel, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        rlm.copydefault(rgl, editableCopyModel.getGroupKey(), view, editableListAppModel);
        return Unit.INSTANCE;
    }

    public final void copydefault(rGL rgl, java.lang.String str, android.view.View view, EditableListAppModel editableListAppModel) {
        try {
            this.OLrzqt.copydefault.removeView(view);
            rgl.flVtFt(str);
            java.util.List<EditableCopyModel> copyModels = editableListAppModel.getCopyModels();
            if (copyModels != null) {
                java.util.Iterator<EditableCopyModel> it = copyModels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    EditableCopyModel next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) next.getGroupKey(), (java.lang.Object) str)) {
                        copyModels.remove(next);
                        break;
                    }
                }
                this.OLrzqt.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
                this.OLrzqt.EZpvd.setCompoundDrawableTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.Dmq));
                this.AEQbTJ--;
            }
        } catch (java.lang.Exception e) {
            pUU.OLrzqt("zhooulijuan->" + e.getMessage());
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ EditableListAppModel EZpvd;
        public final /* synthetic */ LifecycleOwner KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ AbstractC42074rFj copydefault;
        public final /* synthetic */ rLM gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, rLM rlm, EditableListAppModel editableListAppModel, AbstractC42074rFj abstractC42074rFj, LifecycleOwner lifecycleOwner) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.gEmmrt = rlm;
            this.EZpvd = editableListAppModel;
            this.copydefault = abstractC42074rFj;
            this.KWHzl = lifecycleOwner;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.gEmmrt.AEQbTJ < this.EZpvd.getCount()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (UIComponentAppModel uIComponentAppModel : this.EZpvd.getTemplate()) {
                        UIComponentAppModel uIComponentAppModelKWHzl = C43747rvC.KWHzl(uIComponentAppModel);
                        uIComponentAppModelKWHzl.setId(this.EZpvd.getId() + "-" + uIComponentAppModel.getId() + "-" + this.EZpvd.getIdNum());
                        arrayList.add(uIComponentAppModelKWHzl);
                    }
                    java.lang.String str = this.EZpvd.getId() + "-" + this.EZpvd.getIdNum();
                    if (this.EZpvd.getCopyModels() == null) {
                        this.EZpvd.setCopyModels(new java.util.ArrayList());
                    }
                    java.util.List<EditableCopyModel> copyModels = this.EZpvd.getCopyModels();
                    if (copyModels != null) {
                        copyModels.add(new EditableCopyModel(str, arrayList));
                        this.EZpvd.setIdNum(this.EZpvd.getIdNum() + 1);
                        rLM rlm = this.gEmmrt;
                        java.lang.Float deleteTopMargin = this.EZpvd.getDeleteTopMargin();
                        rlm.OLrzqt(deleteTopMargin != null ? deleteTopMargin.floatValue() : 0.0f, this.EZpvd.getId(), arrayList, (rGL) this.copydefault, this.KWHzl, false, this.EZpvd.getCount(), this.gEmmrt.new ActionBar(this.copydefault, str, this.EZpvd));
                    }
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ Function1 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function1 function1, android.view.View view2) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = function1;
            this.copydefault = view2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1 function1 = this.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(this.copydefault);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.rLM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addTemplate$default(rLM rlm, float f, java.lang.String str, java.util.List list, rGL rgl, LifecycleOwner lifecycleOwner, boolean z, int i, Function1 function1, int i2, java.lang.Object obj) {
        rlm.OLrzqt(f, str, list, rgl, lifecycleOwner, z, i, (i2 & 128) != 0 ? null : function1);
    }

    public final void OLrzqt(float f, java.lang.String str, java.util.List<? extends UIComponentAppModel> list, rGL rgl, LifecycleOwner lifecycleOwner, boolean z, int i, Function1<? super android.view.View, Unit> function1) {
        rQO rqo = this.KWHzl;
        if (rqo != null && (!list.isEmpty())) {
            rgl.copydefault(list, str);
            ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.giSNqX, this.OLrzqt.copydefault, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.util.List<android.view.View> listEZpvd = rqo.EZpvd(context, list, rgl, lifecycleOwner, this.copydefault);
            if (this.AEQbTJ == 0) {
                ((AbstractC43900rxx) viewDataBindingInflate).EZpvd.setVisibility(8);
            } else {
                AbstractC43900rxx abstractC43900rxx = (AbstractC43900rxx) viewDataBindingInflate;
                ViewGroup.LayoutParams layoutParams = abstractC43900rxx.EZpvd.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                rQR rqr = rQR.AEQbTJ;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                ViewStatus viewStatus = this.copydefault;
                UIComponentAppModel uIComponentAppModel = (UIComponentAppModel) CollectionsKt___CollectionsKt.AubY(list);
                C55296xhK.AEQbTJ(layoutParams2, 0, 0, 0, rqr.AEQbTJ(context2, viewStatus, uIComponentAppModel != null ? uIComponentAppModel.getBottomMargin() : null));
                abstractC43900rxx.EZpvd.setLayoutParams(layoutParams2);
                abstractC43900rxx.EZpvd.setVisibility(0);
            }
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                ((AbstractC43900rxx) viewDataBindingInflate).KWHzl.addView((android.view.View) it.next());
            }
            AbstractC43900rxx abstractC43900rxx2 = (AbstractC43900rxx) viewDataBindingInflate;
            android.view.View root = abstractC43900rxx2.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            this.OLrzqt.copydefault.addView(abstractC43900rxx2.getRoot());
            if (!z) {
                ViewGroup.LayoutParams layoutParams3 = abstractC43900rxx2.AEQbTJ.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                C55296xhK.AEQbTJ(layoutParams4, C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(f, null, 1, null), 0, 0);
                abstractC43900rxx2.AEQbTJ.setLayoutParams(layoutParams4);
                abstractC43900rxx2.AEQbTJ.setVisibility(0);
                android.widget.ImageView imageView = abstractC43900rxx2.AEQbTJ;
                imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, function1, root));
            }
            this.AEQbTJ++;
        }
        if (this.AEQbTJ == i) {
            this.OLrzqt.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
            this.OLrzqt.EZpvd.setCompoundDrawableTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
        } else {
            this.OLrzqt.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            this.OLrzqt.EZpvd.setCompoundDrawableTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.Dmq));
        }
    }

    public final void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull rQO rqo) {
        java.lang.String label;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(rqo, "");
        this.KWHzl = rqo;
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.copydefault, uIComponentAppModel.getBottomMargin()));
        EditableListAppModel editableListAppModel = uIComponentAppModel instanceof EditableListAppModel ? (EditableListAppModel) uIComponentAppModel : null;
        if (editableListAppModel != null) {
            this.OLrzqt.KWHzl.setVisibility(0);
            android.widget.TextView textView = this.OLrzqt.EZpvd;
            AddMore addMore = editableListAppModel.getAddMore();
            if (addMore != null && (label = addMore.getLabel()) != null) {
                str = label;
            }
            textView.setText(str);
        }
    }

    public final void AEQbTJ(EditableListAppModel editableListAppModel) {
        java.util.List<java.util.HashMap<java.lang.String, ValueAndName>> values;
        int size;
        if (editableListAppModel.getDefaultModels().isEmpty() && editableListAppModel.getDefaultCount() > 0) {
            int defaultCount = editableListAppModel.getDefaultCount();
            int i = 0;
            while (i < defaultCount) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (UIComponentAppModel uIComponentAppModel : editableListAppModel.getTemplate()) {
                    UIComponentAppModel uIComponentAppModelKWHzl = C43747rvC.KWHzl(uIComponentAppModel);
                    java.util.List<java.util.HashMap<java.lang.String, ValueAndName>> values2 = editableListAppModel.getValues();
                    if (values2 != null && i < values2.size()) {
                        ValueAndName valueAndName = values2.get(i).get(uIComponentAppModel.getId());
                        uIComponentAppModelKWHzl.setValue(valueAndName != null ? valueAndName.getValue() : null);
                        if (uIComponentAppModelKWHzl instanceof InputSelectAppModel) {
                            InputSelectAppModel inputSelectAppModel = (InputSelectAppModel) uIComponentAppModelKWHzl;
                            ValueAndName valueAndName2 = values2.get(i).get(uIComponentAppModel.getId());
                            inputSelectAppModel.setValueName(valueAndName2 != null ? valueAndName2.getValueName() : null);
                        }
                    }
                    uIComponentAppModelKWHzl.setId(editableListAppModel.getId() + "-" + uIComponentAppModel.getId() + "-" + (i + 1));
                    arrayList.add(uIComponentAppModelKWHzl);
                }
                i++;
                editableListAppModel.getDefaultModels().add(new EditableCopyModel(editableListAppModel.getId() + "-" + i, arrayList));
            }
        }
        if (editableListAppModel.getCopyModels() != null || (values = editableListAppModel.getValues()) == null || values.size() <= editableListAppModel.getDefaultCount() || (size = values.size() - editableListAppModel.getDefaultCount()) <= 0) {
            return;
        }
        editableListAppModel.setCopyModels(new java.util.ArrayList());
        java.util.List<EditableCopyModel> copyModels = editableListAppModel.getCopyModels();
        if (copyModels != null) {
            for (int i2 = 0; i2 < size; i2++) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (UIComponentAppModel uIComponentAppModel2 : editableListAppModel.getTemplate()) {
                    UIComponentAppModel uIComponentAppModelKWHzl2 = C43747rvC.KWHzl(uIComponentAppModel2);
                    ValueAndName valueAndName3 = values.get(editableListAppModel.getDefaultCount() + i2).get(uIComponentAppModel2.getId());
                    uIComponentAppModelKWHzl2.setValue(valueAndName3 != null ? valueAndName3.getValue() : null);
                    if (uIComponentAppModelKWHzl2 instanceof InputSelectAppModel) {
                        InputSelectAppModel inputSelectAppModel2 = (InputSelectAppModel) uIComponentAppModelKWHzl2;
                        ValueAndName valueAndName4 = values.get(editableListAppModel.getDefaultCount() + i2).get(uIComponentAppModel2.getId());
                        inputSelectAppModel2.setValueName(valueAndName4 != null ? valueAndName4.getValueName() : null);
                    }
                    uIComponentAppModelKWHzl2.setId(editableListAppModel.getId() + "-" + uIComponentAppModel2.getId() + "-" + editableListAppModel.getIdNum());
                    arrayList2.add(uIComponentAppModelKWHzl2);
                }
                copyModels.add(new EditableCopyModel(editableListAppModel.getId() + "-" + editableListAppModel.getIdNum(), arrayList2));
                editableListAppModel.setIdNum(editableListAppModel.getIdNum() + 1);
            }
        }
    }
}
