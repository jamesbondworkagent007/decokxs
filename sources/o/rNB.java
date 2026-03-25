package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputConditionalTextOrSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.InputConditionalTextOrSelectItemView$observe$1$1$9$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import o.C43662rtX;
import o.rRH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rNB extends android.widget.FrameLayout {
    public final java.lang.String AEQbTJ;
    public ViewStatus AYXKKw;
    public java.lang.String AhwBna;
    public final AbstractC43953ryx EZpvd;
    public java.lang.String KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.AYXKKw = viewStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rNB(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.dHguZz, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43953ryx) viewDataBindingInflate;
        this.AYXKKw = ViewStatus.Form;
        java.lang.String string = getResources().getString(C43662rtX.Dialog.KWHzl);
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.AEQbTJ = string;
        this.copydefault = true;
        this.OLrzqt = true;
        this.KWHzl = "";
        this.AhwBna = "";
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x0195 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    public final void EZpvd(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        rGL rgl;
        java.util.List<rAX<java.lang.String>> listDNCPSb;
        InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel;
        final Ref.ObjectRef objectRef;
        java.lang.String str;
        rAX rax;
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        final AbstractC42074rFj abstractC42074rFj2 = abstractC42074rFj;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj2, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj2 instanceof rGL) {
            java.lang.String str2 = null;
            final InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel2 = uIComponentAppModel instanceof InputConditionalTextOrSelectAppModel ? (InputConditionalTextOrSelectAppModel) uIComponentAppModel : null;
            if (inputConditionalTextOrSelectAppModel2 == null || (listDNCPSb = (rgl = (rGL) abstractC42074rFj2).dNCPSb()) == null) {
                return;
            }
            java.util.Iterator<T> it = listDNCPSb.iterator();
            while (it.hasNext()) {
                final rAX rax2 = (rAX) it.next();
                final java.lang.String id = inputConditionalTextOrSelectAppModel2.getId();
                if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) id)) {
                    C55009xbp c55009xbpFIwbmz = this.EZpvd.copydefault.fIwbmz();
                    if (c55009xbpFIwbmz != null) {
                        c55009xbpFIwbmz.setContentDescription(id);
                    }
                    if (Intrinsics.EZpvd(inputConditionalTextOrSelectAppModel2.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax2.EZpvd(false);
                        if (!Intrinsics.EZpvd(inputConditionalTextOrSelectAppModel2.getEnabled(), java.lang.Boolean.FALSE)) {
                            rax2.setValue(str2);
                        }
                    } else {
                        setVisibility(0);
                        java.lang.Boolean required = inputConditionalTextOrSelectAppModel2.getRequired();
                        rax2.EZpvd(required != null ? required.booleanValue() : false);
                        java.lang.String value = inputConditionalTextOrSelectAppModel2.getValue();
                        if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                            value = str2;
                        }
                        rax2.setValue(value);
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rNF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rNB.KWHzl(inputConditionalTextOrSelectAppModel2, this, rax2, (C42156rIk) obj);
                        }
                    }));
                    C41959rBc.EZpvd(rax2, lifecycleOwner, new Function1() { // from class: o.rNC
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rNB.AEQbTJ(inputConditionalTextOrSelectAppModel2, rax2, abstractC42074rFj2, id, (java.lang.String) obj);
                        }
                    }, new Function1() { // from class: o.rND
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rNB.KWHzl((java.lang.String) obj);
                        }
                    }, new Function1() { // from class: o.rNH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rNB.OLrzqt((java.lang.String) obj);
                        }
                    }, new Function0() { // from class: o.rNK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return rNB.OLrzqt();
                        }
                    });
                    java.lang.String value2 = inputConditionalTextOrSelectAppModel2.getValue();
                    if (value2 != null) {
                        this.KWHzl = value2;
                        rax2.setValue(value2);
                    }
                    java.lang.String valueName = inputConditionalTextOrSelectAppModel2.getValueName();
                    if (valueName != null) {
                        this.AhwBna = valueName;
                    }
                    C55008xbo c55008xbo = this.EZpvd.copydefault;
                    java.lang.String placeholder = inputConditionalTextOrSelectAppModel2.getPlaceholder();
                    if (placeholder == null) {
                        placeholder = this.AEQbTJ;
                    }
                    c55008xbo.setHintText(placeholder);
                    if (Intrinsics.EZpvd(inputConditionalTextOrSelectAppModel2.getEnabled(), java.lang.Boolean.FALSE)) {
                        C55009xbp c55009xbpFIwbmz2 = this.EZpvd.copydefault.fIwbmz();
                        if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                            c55001xbh.setText(inputConditionalTextOrSelectAppModel2.getValue());
                        }
                        this.EZpvd.copydefault.setState(3);
                        inputConditionalTextOrSelectAppModel = inputConditionalTextOrSelectAppModel2;
                    } else {
                        C55001xbh c55001xbhAkhnZx = this.EZpvd.copydefault.AkhnZx();
                        if (c55001xbhAkhnZx != null) {
                            c55001xbhAkhnZx.addTextChangedListener(new ActionBar(this, rax2));
                        }
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        objectRef2.element = yDY.AhwBna();
                        final Choices choices = inputConditionalTextOrSelectAppModel2.getChoices();
                        if (choices == null || choices.getParams() == null || choices.getUri() == null) {
                            objectRef = objectRef2;
                            str = id;
                            rax = rax2;
                            inputConditionalTextOrSelectAppModel = inputConditionalTextOrSelectAppModel2;
                        } else {
                            final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                            objectRef3.element = "";
                            final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                            objectRef4.element = "";
                            for (java.lang.String str3 : choices.getParams().keySet()) {
                                objectRef3.element = str3;
                                java.lang.String str4 = choices.getParams().get(str3);
                                if (str4 == 0) {
                                    str4 = "";
                                }
                                objectRef4.element = str4;
                            }
                            final InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel3 = inputConditionalTextOrSelectAppModel2;
                            objectRef = objectRef2;
                            str = id;
                            rax = rax2;
                            inputConditionalTextOrSelectAppModel = inputConditionalTextOrSelectAppModel2;
                            rgl.sSMYrx().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rNI
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return rNB.OLrzqt(objectRef4, choices, objectRef3, rax2, inputConditionalTextOrSelectAppModel3, this, objectRef, abstractC42074rFj, fragmentManager, (java.util.Map) obj);
                                }
                            }));
                        }
                        final java.lang.String str5 = str;
                        final rAX rax3 = rax;
                        final Ref.ObjectRef objectRef5 = objectRef;
                        final InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel4 = inputConditionalTextOrSelectAppModel;
                        rgl.AuCTelauCTel().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rNG
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rNB.copydefault(str5, this, rax3, objectRef5, inputConditionalTextOrSelectAppModel4, (java.util.Map) obj);
                            }
                        }));
                        C55009xbp c55009xbpFIwbmz3 = this.EZpvd.copydefault.fIwbmz();
                        if (c55009xbpFIwbmz3 != null) {
                            final rAX rax4 = rax;
                            c55009xbpFIwbmz3.setOnFocusChangeCallback(new Function1() { // from class: o.rNJ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return rNB.copydefault(rax4, ((java.lang.Boolean) obj).booleanValue());
                                }
                            });
                        }
                    }
                } else {
                    inputConditionalTextOrSelectAppModel = inputConditionalTextOrSelectAppModel2;
                }
                abstractC42074rFj2 = abstractC42074rFj;
                inputConditionalTextOrSelectAppModel2 = inputConditionalTextOrSelectAppModel;
                str2 = null;
            }
        }
    }

    public static final Unit KWHzl(InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel, rNB rnb, rAX rax, C42156rIk c42156rIk) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(inputConditionalTextOrSelectAppModel.getId()) && rnb.getVisibility() == 8) {
            rnb.setVisibility(0);
            java.lang.Boolean required = inputConditionalTextOrSelectAppModel.getRequired();
            rax.EZpvd(required != null ? required.booleanValue() : false);
            java.lang.Boolean enabled = inputConditionalTextOrSelectAppModel.getEnabled();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (!Intrinsics.EZpvd(enabled, bool)) {
                rax.setValue(null);
                C55009xbp c55009xbpFIwbmz = rnb.EZpvd.copydefault.fIwbmz();
                if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                    c55001xbh2.setText("");
                }
            }
            inputConditionalTextOrSelectAppModel.setHidden(bool);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(inputConditionalTextOrSelectAppModel.getId()) && rnb.getVisibility() == 0) {
            rnb.setVisibility(8);
            rax.EZpvd(false);
            if (!Intrinsics.EZpvd(inputConditionalTextOrSelectAppModel.getEnabled(), java.lang.Boolean.FALSE)) {
                rax.setValue(null);
                C55009xbp c55009xbpFIwbmz2 = rnb.EZpvd.copydefault.fIwbmz();
                if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                    c55001xbh.setText("");
                }
            }
            inputConditionalTextOrSelectAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel, rAX rax, AbstractC42074rFj abstractC42074rFj, java.lang.String str, java.lang.String str2) {
        inputConditionalTextOrSelectAppModel.setValue((java.lang.String) rax.getValue());
        java.util.Map<java.lang.String, java.lang.String> mapAubY = ((rGL) abstractC42074rFj).AubY();
        java.lang.String str3 = (java.lang.String) rax.getValue();
        if (str3 == null) {
            str3 = "";
        }
        mapAubY.put(str, str3);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, Choices choices, Ref.ObjectRef objectRef2, rAX rax, InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel, rNB rnb, Ref.ObjectRef objectRef3, AbstractC42074rFj abstractC42074rFj, androidx.fragment.app.FragmentManager fragmentManager, java.util.Map map) {
        java.lang.String str;
        java.util.Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            if (Intrinsics.EZpvd(str2, objectRef.element)) {
                kotlin.Pair pair = (kotlin.Pair) map.get(str2);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (pair != null ? (java.lang.String) pair.getFirst() : null))) {
                    Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                    objectRef4.element = choices.getUri();
                    T t = objectRef2.element;
                    kotlin.Pair pair2 = (kotlin.Pair) map.get(str2);
                    if (pair2 == null || (str = (java.lang.String) pair2.getSecond()) == null) {
                        str = "";
                    }
                    java.util.Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(t, str));
                    rax.setValue(null);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null))), null, null, new InputConditionalTextOrSelectItemView$observe$1$1$9$1$1(inputConditionalTextOrSelectAppModel, rnb, objectRef3, rax, abstractC42074rFj, objectRef4, mapEZpvd, fragmentManager, null), 3, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, rNB rnb, rAX rax, Ref.ObjectRef objectRef, InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel, java.util.Map map) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55001xbh c55001xbhEZpvd;
        kotlin.Pair pair = (kotlin.Pair) map.get(str);
        if (pair != null) {
            if (rnb.copydefault) {
                rax.setValue(pair.getFirst());
                C55009xbp c55009xbpFIwbmz = rnb.EZpvd.copydefault.fIwbmz();
                if (c55009xbpFIwbmz != null && (c55001xbhEZpvd = c55009xbpFIwbmz.EZpvd()) != null) {
                    c55001xbhEZpvd.setText((java.lang.CharSequence) pair.getSecond());
                }
            } else {
                for (rRH.TaskDescription taskDescription : (java.util.List) objectRef.element) {
                    if (Intrinsics.EZpvd(taskDescription.fetchVPNInfo(), pair.getFirst())) {
                        if (taskDescription.AEQbTJ()) {
                            rax.setValue(pair.getFirst());
                            C55009xbp c55009xbpFIwbmz2 = rnb.EZpvd.copydefault.fIwbmz();
                            if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                                c55001xbh.setText((java.lang.CharSequence) pair.getSecond());
                            }
                        } else {
                            rax.setValue(null);
                            C55008xbo c55008xbo = rnb.EZpvd.copydefault;
                            java.lang.String placeholder = inputConditionalTextOrSelectAppModel.getPlaceholder();
                            if (placeholder == null) {
                                placeholder = rnb.AEQbTJ;
                            }
                            c55008xbo.setHintText(placeholder);
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(rAX rax, boolean z) {
        if (!z) {
            rax.OLrzqt(true);
        }
        return Unit.INSTANCE;
    }

    public final class ActionBar implements android.text.TextWatcher {
        public final rAX<java.lang.String> EZpvd;
        public final /* synthetic */ rNB KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(@NotNull rNB rnb, rAX<java.lang.String> rax) {
            Intrinsics.checkNotNullParameter(rax, "");
            this.KWHzl = rnb;
            this.EZpvd = rax;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (this.KWHzl.copydefault) {
                this.EZpvd.setValue(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(editable)).toString());
            }
        }
    }

    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.AYXKKw, uIComponentAppModel.getBottomMargin()));
        InputConditionalTextOrSelectAppModel inputConditionalTextOrSelectAppModel = uIComponentAppModel instanceof InputConditionalTextOrSelectAppModel ? (InputConditionalTextOrSelectAppModel) uIComponentAppModel : null;
        if (inputConditionalTextOrSelectAppModel != null) {
            this.EZpvd.copydefault.setSaveEnabled(false);
            C55009xbp c55009xbpFIwbmz = this.EZpvd.copydefault.fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.setSaveEnabled(false);
            }
            C55009xbp c55009xbpFIwbmz2 = this.EZpvd.copydefault.fIwbmz();
            if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz2.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                c55001xbh.setSaveEnabled(false);
            }
            java.lang.String label = inputConditionalTextOrSelectAppModel.getLabel();
            if (label != null) {
                this.EZpvd.copydefault.setLabelText(label);
            }
        }
    }
}
