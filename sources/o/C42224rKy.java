package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.google.firebase.messaging.Constants;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.AlertCardItemView$callSupportEntrance$1;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rKy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42224rKy extends android.widget.FrameLayout {
    public ViewStatus EZpvd;
    public final AbstractC43813rwP KWHzl;
    public final C42519rVw OLrzqt;
    public Function1<? super CTAButtonAppModel, Unit> copydefault;

    /* JADX INFO: renamed from: o.rKy$Application */
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
    public C42224rKy(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42224rKy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, kotlin.Unit> */
    public final Function1<CTAButtonAppModel, Unit> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDialogBtClickCallBack(Function1<? super CTAButtonAppModel, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.EZpvd = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:46) call: o.rKy.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42224rKy(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42224rKy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = ViewStatus.Form;
        this.OLrzqt = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.ORxRYg, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC43813rwP) viewDataBindingInflate;
    }

    public void OLrzqt(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final AlertCardAppModel alertCardAppModel = uIComponentAppModel instanceof AlertCardAppModel ? (AlertCardAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (alertCardAppModel != null ? alertCardAppModel.getId() : null))) {
                    rax.setValue(null);
                }
            }
            if (alertCardAppModel != null && Intrinsics.EZpvd(alertCardAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            rgl.gasjUx().observe(lifecycleOwner, new Application(new Function1() { // from class: o.rKB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42224rKy.OLrzqt(alertCardAppModel, this, (C42156rIk) obj);
                }
            }));
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                java.util.Iterator<T> it2 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (alertCardAppModel != null ? alertCardAppModel.getId() : null))) {
                        rax2.setValue(null);
                    }
                }
                return;
            }
            return;
        }
        java.util.Iterator<T> it3 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
        while (it3.hasNext()) {
            rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (alertCardAppModel != null ? alertCardAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public static final Unit OLrzqt(AlertCardAppModel alertCardAppModel, C42224rKy c42224rKy, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), alertCardAppModel != null ? alertCardAppModel.getId() : null) && c42224rKy.getVisibility() == 8) {
                c42224rKy.setVisibility(0);
                if (alertCardAppModel != null) {
                    alertCardAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), alertCardAppModel != null ? alertCardAppModel.getId() : null) && c42224rKy.getVisibility() == 0) {
                c42224rKy.setVisibility(8);
                if (alertCardAppModel != null) {
                    alertCardAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull FragmentActivity fragmentActivity, final AbstractC42074rFj abstractC42074rFj, @NotNull UIComponentAppModel uIComponentAppModel) {
        java.lang.String str;
        int i;
        java.lang.String extranceId;
        ButtonDialog dialog;
        java.lang.String extranceId2;
        str = "";
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.EZpvd, uIComponentAppModel.getBottomMargin()));
        final AlertCardAppModel alertCardAppModel = uIComponentAppModel instanceof AlertCardAppModel ? (AlertCardAppModel) uIComponentAppModel : null;
        if (alertCardAppModel != null) {
            OKAlertBanner oKAlertBanner = this.KWHzl.copydefault;
            java.lang.String title = alertCardAppModel.getTitle();
            if (title == null) {
                title = "";
            }
            oKAlertBanner.setTitle(title);
            OKAlertBanner oKAlertBanner2 = this.KWHzl.copydefault;
            java.lang.String desc = alertCardAppModel.getDesc();
            if (desc == null) {
                desc = "";
            }
            oKAlertBanner2.setMessage(desc);
            OKAlertBanner oKAlertBanner3 = this.KWHzl.copydefault;
            java.lang.String style = alertCardAppModel.getStyle();
            if (style != null) {
                switch (style.hashCode()) {
                    case 3237038:
                        style.equals("info");
                        break;
                    case 3641990:
                        i = !style.equals("warn") ? 0 : 2;
                        break;
                    case 96784904:
                        if (style.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                            i = 3;
                            break;
                        }
                        break;
                    case 1945384475:
                        if (style.equals("infoAlt")) {
                            i = 4;
                            break;
                        }
                        break;
                }
            }
            oKAlertBanner3.setType(i);
            OKAlertBanner oKAlertBanner4 = this.KWHzl.copydefault;
            java.lang.Boolean showIcon = alertCardAppModel.getShowIcon();
            oKAlertBanner4.setLeadingIconVisibility(showIcon != null ? showIcon.booleanValue() : true);
            java.lang.Float cornerRadius = alertCardAppModel.getCornerRadius();
            if (cornerRadius != null) {
                float fFloatValue2 = cornerRadius.floatValue();
                android.graphics.drawable.Drawable background = this.KWHzl.copydefault.getBackground();
                int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : ContextCompat.getColor(getContext(), C52761wXj.Activity.scanPackages);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(color);
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                gradientDrawable.setCornerRadius(C55298xhM.EZpvd(fFloatValue2, context3));
                this.KWHzl.copydefault.setBackground(gradientDrawable);
            }
            java.lang.Boolean closable = alertCardAppModel.getClosable();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(closable, bool)) {
                this.KWHzl.copydefault.setStyle(0);
                android.widget.ImageView imageViewOLrzqt = this.KWHzl.copydefault.OLrzqt();
                imageViewOLrzqt.setOnClickListener(new ActionBar(imageViewOLrzqt, 1000L, this, alertCardAppModel));
            } else {
                CTAButtonAppModel ctaArrow = alertCardAppModel.getCtaArrow();
                if (ctaArrow != null) {
                    this.KWHzl.copydefault.setStyle(1);
                    android.widget.ImageView imageViewOLrzqt2 = this.KWHzl.copydefault.OLrzqt();
                    imageViewOLrzqt2.setOnClickListener(new TaskDescription(imageViewOLrzqt2, 1000L, abstractC42074rFj, alertCardAppModel, ctaArrow, this));
                } else {
                    this.KWHzl.copydefault.setStyle(-1);
                }
            }
            CtaPopUp cta = alertCardAppModel.getCta();
            if (cta != null) {
                final CTAButtonAppModel primaryButton = cta.getPrimaryButton();
                if (primaryButton != null) {
                    if (primaryButton.getAction() == ButtonAction.ContactSupport) {
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivity);
                        ActionParams actionParams = primaryButton.getActionParams();
                        if (actionParams == null || (extranceId2 = actionParams.getExtranceId()) == null) {
                            extranceId2 = "";
                        }
                        copydefault(lifecycleScope, extranceId2, true);
                    } else {
                        if (primaryButton.getAction() == ButtonAction.Dialog && (dialog = primaryButton.getDialog()) != null && Intrinsics.EZpvd(dialog.getShowOnPageLoad(), bool)) {
                            if (abstractC42074rFj != null) {
                                abstractC42074rFj.copydefault(primaryButton);
                            } else {
                                Function1<? super CTAButtonAppModel, Unit> function1 = this.copydefault;
                                if (function1 != null) {
                                    function1.invoke(primaryButton);
                                }
                            }
                            ButtonDialog dialog2 = primaryButton.getDialog();
                            if (dialog2 != null) {
                                dialog2.setShowOnPageLoad(java.lang.Boolean.FALSE);
                            }
                        }
                        OKAlertBanner oKAlertBanner5 = this.KWHzl.copydefault;
                        java.lang.String text = primaryButton.getText();
                        if (text == null) {
                            text = "";
                        }
                        oKAlertBanner5.setPrimaryAction(text, new Function0() { // from class: o.rKA
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C42224rKy.EZpvd(abstractC42074rFj, alertCardAppModel, primaryButton, this);
                            }
                        });
                    }
                }
                final CTAButtonAppModel secondaryButton = cta.getSecondaryButton();
                if (secondaryButton != null) {
                    if (secondaryButton.getAction() == ButtonAction.ContactSupport) {
                        LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(fragmentActivity);
                        ActionParams actionParams2 = secondaryButton.getActionParams();
                        if (actionParams2 != null && (extranceId = actionParams2.getExtranceId()) != null) {
                            str = extranceId;
                        }
                        copydefault(lifecycleScope2, str, false);
                        return;
                    }
                    OKAlertBanner oKAlertBanner6 = this.KWHzl.copydefault;
                    java.lang.String text2 = secondaryButton.getText();
                    oKAlertBanner6.setSecondaryAction(text2 != null ? text2 : "", new Function0() { // from class: o.rKG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C42224rKy.KWHzl(abstractC42074rFj, alertCardAppModel, secondaryButton, this);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.rKy$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C42224rKy AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AlertCardAppModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42224rKy c42224rKy, AlertCardAppModel alertCardAppModel) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c42224rKy;
            this.copydefault = alertCardAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.setVisibility(8);
                this.copydefault.setHidden(java.lang.Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: o.rKy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ CTAButtonAppModel AEQbTJ;
        public final /* synthetic */ C42224rKy AhwBna;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AbstractC42074rFj OLrzqt;
        public final /* synthetic */ AlertCardAppModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AbstractC42074rFj abstractC42074rFj, AlertCardAppModel alertCardAppModel, CTAButtonAppModel cTAButtonAppModel, C42224rKy c42224rKy) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = abstractC42074rFj;
            this.copydefault = alertCardAppModel;
            this.AEQbTJ = cTAButtonAppModel;
            this.AhwBna = c42224rKy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                AbstractC42074rFj abstractC42074rFj = this.OLrzqt;
                if (abstractC42074rFj != null) {
                    abstractC42074rFj.copydefault(this.AEQbTJ);
                    return;
                }
                Function1<CTAButtonAppModel, Unit> function1Copydefault = this.AhwBna.copydefault();
                if (function1Copydefault != null) {
                    function1Copydefault.invoke(this.AEQbTJ);
                }
            }
        }
    }

    public static final Unit EZpvd(AbstractC42074rFj abstractC42074rFj, AlertCardAppModel alertCardAppModel, CTAButtonAppModel cTAButtonAppModel, C42224rKy c42224rKy) {
        if (abstractC42074rFj != null) {
            abstractC42074rFj.copydefault(cTAButtonAppModel);
        } else {
            Function1<? super CTAButtonAppModel, Unit> function1 = c42224rKy.copydefault;
            if (function1 != null) {
                function1.invoke(cTAButtonAppModel);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC42074rFj abstractC42074rFj, AlertCardAppModel alertCardAppModel, CTAButtonAppModel cTAButtonAppModel, C42224rKy c42224rKy) {
        if (abstractC42074rFj != null) {
            abstractC42074rFj.copydefault(cTAButtonAppModel);
        } else {
            Function1<? super CTAButtonAppModel, Unit> function1 = c42224rKy.copydefault;
            if (function1 != null) {
                function1.invoke(cTAButtonAppModel);
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(LifecycleCoroutineScope lifecycleCoroutineScope, java.lang.String str, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new AlertCardItemView$callSupportEntrance$1(str, z, this, lifecycleCoroutineScope, null), 3, null);
    }
}
