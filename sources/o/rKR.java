package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopupTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rKR extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public ViewStatus AEQbTJ;
    public final AbstractC43883rxg KWHzl;
    public java.lang.String OLrzqt;
    public final C42519rVw copydefault;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
    public rKR(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rKR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:45) call: o.rKR.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rKR(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rKR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "";
        this.AEQbTJ = ViewStatus.Form;
        this.copydefault = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.RcXXUw, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC43883rxg) viewDataBindingInflate;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rKR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        java.lang.String value;
        java.lang.Boolean required;
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final CheckboxAppModel checkboxAppModel = uIComponentAppModel instanceof CheckboxAppModel ? (CheckboxAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.DTwDnp().iterator();
            while (it.hasNext()) {
                final rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (checkboxAppModel != null ? checkboxAppModel.getId() : null))) {
                    rax.setValue(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(checkboxAppModel != null ? checkboxAppModel.getValue() : null)));
                    boolean zBooleanValue = false;
                    if (checkboxAppModel != null && Intrinsics.EZpvd(checkboxAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                        setVisibility(8);
                        rax.EZpvd(false);
                        rax.setValue(null);
                    } else {
                        setVisibility(0);
                        if (checkboxAppModel != null && (required = checkboxAppModel.getRequired()) != null) {
                            zBooleanValue = required.booleanValue();
                        }
                        rax.EZpvd(zBooleanValue);
                        rax.setValue((checkboxAppModel == null || (value = checkboxAppModel.getValue()) == null) ? null : java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(value)));
                    }
                    rgl.gasjUx().observe(lifecycleOwner, new Application(new Function1() { // from class: o.rKX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rKR.EZpvd(checkboxAppModel, this, rax, abstractC42074rFj, (C42156rIk) obj);
                        }
                    }));
                    C41959rBc.observeKYCFormField$default(rax, lifecycleOwner, null, new Function1() { // from class: o.rLl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rKR.AkhnZx((java.lang.String) obj);
                        }
                    }, new Function1() { // from class: o.rLm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rKR.fetchVPNInfo((java.lang.String) obj);
                        }
                    }, new Function0() { // from class: o.rLr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return rKR.AhwBna();
                        }
                    }, 4, null);
                    this.KWHzl.OLrzqt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.rLa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(android.view.View view, boolean z) {
                            rKR.valueOf(rax, view, z);
                        }
                    });
                    this.KWHzl.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.rKZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                            rKR.copydefault(rax, this, abstractC42074rFj, checkboxAppModel, compoundButton, z);
                        }
                    });
                }
            }
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                java.util.Iterator<T> it2 = ((rIM) abstractC42074rFj).zLjUOn().iterator();
                while (it2.hasNext()) {
                    final rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (checkboxAppModel != null ? checkboxAppModel.getId() : null))) {
                        rax2.setValue(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(checkboxAppModel != null ? checkboxAppModel.getValue() : null)));
                        C41959rBc.observeKYCFormField$default(rax2, lifecycleOwner, null, new Function1() { // from class: o.rLh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rKR.AYXKKw((java.lang.String) obj);
                            }
                        }, new Function1() { // from class: o.rLj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rKR.valueOf((java.lang.String) obj);
                            }
                        }, new Function0() { // from class: o.rLn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return rKR.KWHzl();
                            }
                        }, 4, null);
                        this.KWHzl.OLrzqt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.rLp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(android.view.View view, boolean z) {
                                rKR.copydefault(rax2, view, z);
                            }
                        });
                        this.KWHzl.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.rLo
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                                rKR.OLrzqt(rax2, compoundButton, z);
                            }
                        });
                    }
                }
                return;
            }
            return;
        }
        java.util.Iterator<T> it3 = ((C42179rJg) abstractC42074rFj).AuCTelauCTel().iterator();
        while (it3.hasNext()) {
            final rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (checkboxAppModel != null ? checkboxAppModel.getId() : null))) {
                rax3.setValue(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(checkboxAppModel != null ? checkboxAppModel.getValue() : null)));
                C41959rBc.observeKYCFormField$default(rax3, lifecycleOwner, null, new Function1() { // from class: o.rKW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rKR.AhwBna((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rLe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rKR.gEmmrt((java.lang.String) obj);
                    }
                }, new Function0() { // from class: o.rLd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rKR.AEQbTJ();
                    }
                }, 4, null);
                this.KWHzl.OLrzqt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.rLf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(android.view.View view, boolean z) {
                        rKR.KWHzl(rax3, view, z);
                    }
                });
                this.KWHzl.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.rKY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        rKR.copydefault(rax3, compoundButton, z);
                    }
                });
            }
        }
    }

    public static final Unit EZpvd(CheckboxAppModel checkboxAppModel, rKR rkr, rAX rax, AbstractC42074rFj abstractC42074rFj, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> checkHiddenItemIds;
        java.util.List<java.lang.String> uncheckHiddenItemIds;
        java.lang.Boolean required;
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), checkboxAppModel != null ? checkboxAppModel.getId() : null) && rkr.getVisibility() == 8) {
                rkr.setVisibility(0);
                rax.EZpvd((checkboxAppModel == null || (required = checkboxAppModel.getRequired()) == null) ? false : required.booleanValue());
                rax.setValue(null);
                rkr.KWHzl.OLrzqt.setChecked(false);
                if (checkboxAppModel != null) {
                    checkboxAppModel.setHidden(java.lang.Boolean.FALSE);
                }
                if ((checkboxAppModel != null && (uncheckHiddenItemIds = checkboxAppModel.getUncheckHiddenItemIds()) != null && C33129mqd.KWHzl((java.util.Collection) uncheckHiddenItemIds)) || (checkboxAppModel != null && (checkHiddenItemIds = checkboxAppModel.getCheckHiddenItemIds()) != null && C33129mqd.KWHzl((java.util.Collection) checkHiddenItemIds))) {
                    ((rGL) abstractC42074rFj).gasjUx().setValue(new C42156rIk(checkboxAppModel.getUncheckHiddenItemIds(), checkboxAppModel.getCheckHiddenItemIds()));
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), checkboxAppModel != null ? checkboxAppModel.getId() : null) && rkr.getVisibility() == 0) {
                rkr.setVisibility(8);
                rax.EZpvd(false);
                rax.setValue(null);
                rkr.KWHzl.OLrzqt.setChecked(false);
                if (checkboxAppModel != null) {
                    checkboxAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public static final void valueOf(rAX rax, android.view.View view, boolean z) {
        if (z) {
            return;
        }
        rax.OLrzqt(true);
    }

    public static final void copydefault(rAX rax, rKR rkr, AbstractC42074rFj abstractC42074rFj, CheckboxAppModel checkboxAppModel, android.widget.CompoundButton compoundButton, boolean z) {
        rax.setValue(java.lang.Boolean.valueOf(z));
        if (rkr.getVisibility() == 0) {
            if (z) {
                ((rGL) abstractC42074rFj).gasjUx().setValue(new C42156rIk(checkboxAppModel != null ? checkboxAppModel.getCheckHiddenItemIds() : null, checkboxAppModel != null ? checkboxAppModel.getUncheckHiddenItemIds() : null));
            } else {
                ((rGL) abstractC42074rFj).gasjUx().setValue(new C42156rIk(checkboxAppModel != null ? checkboxAppModel.getUncheckHiddenItemIds() : null, checkboxAppModel != null ? checkboxAppModel.getCheckHiddenItemIds() : null));
            }
        }
    }

    public static final Unit AhwBna(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static final void KWHzl(rAX rax, android.view.View view, boolean z) {
        if (z) {
            return;
        }
        rax.OLrzqt(true);
    }

    public static final void copydefault(rAX rax, android.widget.CompoundButton compoundButton, boolean z) {
        rax.setValue(java.lang.Boolean.valueOf(z));
    }

    public static final Unit AYXKKw(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final void copydefault(rAX rax, android.view.View view, boolean z) {
        if (z) {
            return;
        }
        rax.OLrzqt(true);
    }

    public static final void OLrzqt(rAX rax, android.widget.CompoundButton compoundButton, boolean z) {
        rax.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull final FragmentActivity fragmentActivity, @NotNull final AbstractC42074rFj abstractC42074rFj, @NotNull UIComponentAppModel uIComponentAppModel) {
        java.lang.CharSequence text;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
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
        CheckboxAppModel checkboxAppModel = uIComponentAppModel instanceof CheckboxAppModel ? (CheckboxAppModel) uIComponentAppModel : null;
        if (checkboxAppModel != null) {
            CheckboxAppModel checkboxAppModel2 = (CheckboxAppModel) uIComponentAppModel;
            this.OLrzqt = checkboxAppModel2.getId();
            this.KWHzl.OLrzqt.setContentDescription(checkboxAppModel2.getId() + "_checkbox");
            this.KWHzl.OLrzqt.setChecked(java.lang.Boolean.parseBoolean(checkboxAppModel2.getValue()));
            this.KWHzl.OLrzqt(java.lang.Boolean.valueOf(checkboxAppModel.isCard()));
            if (checkboxAppModel.isCard()) {
                this.KWHzl.copydefault.setBackgroundResource(C43662rtX.Activity.gEmmrt);
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                int iCopydefault2 = C55298xhM.copydefault(16.0f, context3);
                this.KWHzl.copydefault.setPadding(iCopydefault2, iCopydefault2, iCopydefault2, iCopydefault2);
            }
            RichTextContent richContent = checkboxAppModel.getRichContent();
            if (richContent != null) {
                java.util.HashMap map = new java.util.HashMap();
                java.util.HashMap<java.lang.String, java.lang.String> bold = richContent.getBold();
                if (bold != null) {
                    for (Map.Entry<java.lang.String, java.lang.String> entry : bold.entrySet()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.HashMap<java.lang.String, LinkTextContent> link = richContent.getLink();
                if (link != null) {
                    for (Map.Entry<java.lang.String, LinkTextContent> entry2 : link.entrySet()) {
                        java.lang.String key = entry2.getKey();
                        java.lang.String text2 = entry2.getValue().getText();
                        if (text2 == null) {
                            text2 = "";
                        }
                        map.put(key, text2);
                    }
                }
                java.util.HashMap<java.lang.String, PopupTextContent> popup = richContent.getPopup();
                if (popup != null) {
                    for (Map.Entry<java.lang.String, PopupTextContent> entry3 : popup.entrySet()) {
                        java.lang.String key2 = entry3.getKey();
                        java.lang.String text3 = entry3.getValue().getText();
                        if (text3 == null) {
                            text3 = "";
                        }
                        map.put(key2, text3);
                    }
                }
                java.lang.String text4 = richContent.getText();
                if (text4 == null) {
                    text4 = "";
                }
                java.lang.CharSequence charSequenceOLrzqt = C33069mpW.OLrzqt(text4, map);
                java.util.HashMap<java.lang.String, java.lang.String> bold2 = richContent.getBold();
                if (bold2 != null) {
                    java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it = bold2.entrySet().iterator();
                    while (it.hasNext()) {
                        charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequenceOLrzqt, new java.lang.String[]{it.next().getValue()}, 0, null, false, new Function1() { // from class: o.rLg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rKR.EZpvd((java.util.List) obj);
                            }
                        }, 14, null);
                    }
                }
                java.util.HashMap<java.lang.String, LinkTextContent> link2 = richContent.getLink();
                if (link2 != null) {
                    for (final Map.Entry<java.lang.String, LinkTextContent> entry4 : link2.entrySet()) {
                        java.lang.String text5 = entry4.getValue().getText();
                        if (text5 == null) {
                            text5 = "";
                        }
                        java.lang.String str = text5 + " ";
                        java.lang.CharSequence charSequence = charSequenceOLrzqt;
                        java.lang.String[] strArr = new java.lang.String[1];
                        strArr[0] = Intrinsics.EZpvd((java.lang.Object) entry4.getValue().getRelativeUriType(), (java.lang.Object) "externalUrl") ? str : text5;
                        charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequence, strArr, 0, null, false, new Function1() { // from class: o.rLi
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rKR.OLrzqt(entry4, this, (java.util.List) obj);
                            }
                        }, 14, null);
                        if ((charSequenceOLrzqt instanceof android.text.Spannable) && Intrinsics.EZpvd((java.lang.Object) entry4.getValue().getRelativeUriType(), (java.lang.Object) "externalUrl")) {
                            android.text.Spannable spannable = (android.text.Spannable) charSequenceOLrzqt;
                            int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequenceOLrzqt, str, 0, false, 6, (java.lang.Object) null);
                            if (iIndexOf$default >= 0) {
                                int length = iIndexOf$default + text5.length();
                                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dNxZaP);
                                if (drawable != null) {
                                    int i = (int) (14 * getContext().getResources().getDisplayMetrics().density);
                                    drawable.setBounds(0, 0, i, i);
                                    spannable.setSpan(new android.text.style.ImageSpan(drawable, 0), length, length + 1, 33);
                                }
                            }
                        }
                    }
                }
                java.util.HashMap<java.lang.String, PopupTextContent> popup2 = richContent.getPopup();
                if (popup2 != null) {
                    for (final Map.Entry<java.lang.String, PopupTextContent> entry5 : popup2.entrySet()) {
                        java.lang.CharSequence charSequence2 = charSequenceOLrzqt;
                        java.lang.String[] strArr2 = new java.lang.String[1];
                        java.lang.String text6 = entry5.getValue().getText();
                        if (text6 == null) {
                            text6 = "";
                        }
                        strArr2[0] = text6;
                        charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequence2, strArr2, 0, null, false, new Function1() { // from class: o.rLk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rKR.AEQbTJ(entry5, this, fragmentActivity, abstractC42074rFj, (java.util.List) obj);
                            }
                        }, 14, null);
                    }
                }
                text = charSequenceOLrzqt;
                if (text == null) {
                    text = checkboxAppModel.getText();
                }
            }
            this.KWHzl.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.KWHzl.OLrzqt.setText(text);
            if (Intrinsics.EZpvd(checkboxAppModel.isBold(), java.lang.Boolean.TRUE)) {
                this.KWHzl.OLrzqt.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
            }
        }
    }

    public static final Unit EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.StyleSpan(1));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Map.Entry entry, rKR rkr, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkTextStyle style = ((LinkTextContent) entry.getValue()).getStyle();
        if (style != null && Intrinsics.EZpvd(style.isBold(), java.lang.Boolean.TRUE)) {
            list.add(new android.text.style.StyleSpan(1));
        }
        LinkTextStyle style2 = ((LinkTextContent) entry.getValue()).getStyle();
        if (style2 != null && Intrinsics.EZpvd(style2.isUnderLineBold(), java.lang.Boolean.TRUE)) {
            rQR rqr = rQR.AEQbTJ;
            LinkTextStyle style3 = ((LinkTextContent) entry.getValue()).getStyle();
            java.lang.Integer numAYXKKw = rqr.AYXKKw(style3 != null ? style3.getUnderLineColor() : null, rkr.copydefault);
            if (numAYXKKw != null) {
                int iIntValue = numAYXKKw.intValue();
                android.content.Context context = rkr.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                LinkTextStyle style4 = ((LinkTextContent) entry.getValue()).getStyle();
                java.lang.Integer numEZpvd = rqr.EZpvd(style4 != null ? style4.getLinkColor() : null, rkr.copydefault);
                list.add(new rVK(context, iIntValue, numEZpvd != null ? numEZpvd.intValue() : rkr.KWHzl.OLrzqt.getCurrentTextColor()));
            }
        } else {
            android.content.Context context2 = rkr.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            rQR rqr2 = rQR.AEQbTJ;
            LinkTextStyle style5 = ((LinkTextContent) entry.getValue()).getStyle();
            java.lang.Integer numAYXKKw2 = rqr2.AYXKKw(style5 != null ? style5.getUnderLineColor() : null, rkr.copydefault);
            LinkTextStyle style6 = ((LinkTextContent) entry.getValue()).getStyle();
            java.lang.Integer numEZpvd2 = rqr2.EZpvd(style6 != null ? style6.getLinkColor() : null, rkr.copydefault);
            java.lang.Boolean underline = ((LinkTextContent) entry.getValue()).getUnderline();
            list.add(new rVH(context2, numAYXKKw2, numEZpvd2, underline != null ? underline.booleanValue() : true, ((LinkTextContent) entry.getValue()).getRelativeUriType(), ((LinkTextContent) entry.getValue()).getUrl(), ((LinkTextContent) entry.getValue()).getDeeplink(), "checkbox", false, null, null, null, 3840, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Map.Entry entry, rKR rkr, final FragmentActivity fragmentActivity, final AbstractC42074rFj abstractC42074rFj, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkTextStyle style = ((PopupTextContent) entry.getValue()).getStyle();
        if (style != null && Intrinsics.EZpvd(style.isBold(), java.lang.Boolean.TRUE)) {
            list.add(new android.text.style.StyleSpan(1));
        }
        android.content.Context context = rkr.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        rQR rqr = rQR.AEQbTJ;
        LinkTextStyle style2 = ((PopupTextContent) entry.getValue()).getStyle();
        java.lang.Integer numAYXKKw = rqr.AYXKKw(style2 != null ? style2.getUnderLineColor() : null, rkr.copydefault);
        LinkTextStyle style3 = ((PopupTextContent) entry.getValue()).getStyle();
        java.lang.Integer numEZpvd = rqr.EZpvd(style3 != null ? style3.getLinkColor() : null, rkr.copydefault);
        java.lang.Boolean underline = ((PopupTextContent) entry.getValue()).getUnderline();
        list.add(new rVH(context, numAYXKKw, numEZpvd, underline != null ? underline.booleanValue() : true, null, null, null, "checkbox", false, null, ((PopupTextContent) entry.getValue()).getDialog(), new Function1() { // from class: o.rLb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rKR.EZpvd(fragmentActivity, abstractC42074rFj, (ButtonDialog) obj);
            }
        }, 864, null));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(FragmentActivity fragmentActivity, final AbstractC42074rFj abstractC42074rFj, ButtonDialog buttonDialog) {
        Intrinsics.checkNotNullParameter(buttonDialog, "");
        C43693ruB.OLrzqt("KYC_Check_Box_Popup");
        rQZ.KWHzl.AEQbTJ(fragmentActivity, buttonDialog, new Function1() { // from class: o.rLc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rKR.KWHzl(abstractC42074rFj, (CTAButtonAppModel) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        abstractC42074rFj.copydefault(cTAButtonAppModel);
        return Unit.INSTANCE;
    }
}
