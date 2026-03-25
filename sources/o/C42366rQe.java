package o;

import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rQe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42366rQe extends android.widget.FrameLayout {
    public final AbstractC43983rza EZpvd;
    public rQO KWHzl;
    public ViewStatus copydefault;

    /* JADX INFO: renamed from: o.rQe$TaskDescription */
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
    public C42366rQe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42366rQe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.rQe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42366rQe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42366rQe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.aUsmxb, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC43983rza) viewDataBindingInflate;
        this.copydefault = ViewStatus.Form;
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        if (abstractC42074rFj instanceof rGL) {
            final NotificationReminderAppModel notificationReminderAppModel = uIComponentAppModel instanceof NotificationReminderAppModel ? (NotificationReminderAppModel) uIComponentAppModel : null;
            if (notificationReminderAppModel != null) {
                rGL rgl = (rGL) abstractC42074rFj;
                java.util.Iterator<T> it = rgl.dNCPSb().iterator();
                while (it.hasNext()) {
                    rAX rax = (rAX) it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) notificationReminderAppModel.getId())) {
                        java.lang.String value = notificationReminderAppModel.getValue();
                        if (!java.lang.Boolean.valueOf(!(value == null || value.length() == 0)).booleanValue()) {
                            value = null;
                        }
                        rax.setValue(value);
                        rgl.gasjUx().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.rQg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42366rQe.AEQbTJ(notificationReminderAppModel, this, (C42156rIk) obj);
                            }
                        }));
                        if (Intrinsics.EZpvd(notificationReminderAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                            setVisibility(8);
                        } else {
                            setVisibility(0);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof C42179rJg) {
            NotificationReminderAppModel notificationReminderAppModel2 = uIComponentAppModel instanceof NotificationReminderAppModel ? (NotificationReminderAppModel) uIComponentAppModel : null;
            if (notificationReminderAppModel2 != null) {
                java.util.Iterator<T> it2 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) notificationReminderAppModel2.getId())) {
                        java.lang.String value2 = notificationReminderAppModel2.getValue();
                        if (!java.lang.Boolean.valueOf(!(value2 == null || value2.length() == 0)).booleanValue()) {
                            value2 = null;
                        }
                        rax2.setValue(value2);
                    }
                }
                return;
            }
            return;
        }
        if (abstractC42074rFj instanceof rIM) {
            NotificationReminderAppModel notificationReminderAppModel3 = uIComponentAppModel instanceof NotificationReminderAppModel ? (NotificationReminderAppModel) uIComponentAppModel : null;
            if (notificationReminderAppModel3 != null) {
                java.util.Iterator<T> it3 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it3.hasNext()) {
                    rAX rax3 = (rAX) it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) notificationReminderAppModel3.getId())) {
                        java.lang.String value3 = notificationReminderAppModel3.getValue();
                        if (!java.lang.Boolean.valueOf(!(value3 == null || value3.length() == 0)).booleanValue()) {
                            value3 = null;
                        }
                        rax3.setValue(value3);
                    }
                }
            }
        }
    }

    public static final Unit AEQbTJ(NotificationReminderAppModel notificationReminderAppModel, C42366rQe c42366rQe, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null && listCopydefault.contains(notificationReminderAppModel.getId()) && c42366rQe.getVisibility() == 8) {
            c42366rQe.setVisibility(0);
            notificationReminderAppModel.setHidden(java.lang.Boolean.FALSE);
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null && listKWHzl.contains(notificationReminderAppModel.getId()) && c42366rQe.getVisibility() == 0) {
            c42366rQe.setVisibility(8);
            notificationReminderAppModel.setHidden(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [117=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull UIComponentAppModel uIComponentAppModel, final AbstractC42074rFj abstractC42074rFj, LifecycleOwner lifecycleOwner, @NotNull rQO rqo) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
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
        int iAEQbTJ = rqr.AEQbTJ(context2, this.copydefault, uIComponentAppModel.getBottomMargin());
        boolean z = false;
        setPaddingRelative(iCopydefault, 0, 0, iAEQbTJ);
        final NotificationReminderAppModel notificationReminderAppModel = uIComponentAppModel instanceof NotificationReminderAppModel ? (NotificationReminderAppModel) uIComponentAppModel : null;
        if (notificationReminderAppModel != null) {
            setContentDescription(notificationReminderAppModel.getId());
            java.lang.Boolean boolIsHidden = notificationReminderAppModel.isHidden();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            setVisibility(Intrinsics.EZpvd(boolIsHidden, bool) ? 8 : 0);
            final OKReminder oKReminder = this.EZpvd.copydefault;
            java.lang.String style = notificationReminderAppModel.getStyle();
            switch (style.hashCode()) {
                case -196794451:
                    if (!style.equals("alternative")) {
                        oKReminder.setStyle(0);
                    } else {
                        oKReminder.setStyle(4);
                    }
                    break;
                case 747805177:
                    if (style.equals("positive")) {
                        oKReminder.setStyle(1);
                        break;
                    }
                    break;
                case 1124446108:
                    if (style.equals("warning")) {
                        oKReminder.setStyle(2);
                        break;
                    }
                    break;
                case 1844321735:
                    if (style.equals("neutral")) {
                        oKReminder.setStyle(0);
                        break;
                    }
                    break;
                case 1952151455:
                    if (style.equals("critical")) {
                        oKReminder.setStyle(3);
                        break;
                    }
                    break;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) notificationReminderAppModel.getTitle())) {
                oKReminder.setTitle(notificationReminderAppModel.getTitle());
            }
            oKReminder.setCloseIconVisibility(Intrinsics.EZpvd(notificationReminderAppModel.getClosable(), bool));
            oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.rQf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C42366rQe.EZpvd(oKReminder, notificationReminderAppModel);
                }
            });
            oKReminder.setLeadingIconVisibility(true);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) notificationReminderAppModel.getDesc())) {
                oKReminder.setMessage(notificationReminderAppModel.getDesc());
            }
            CtaPopUp cta = notificationReminderAppModel.getCta();
            if (cta != null) {
                boolean z2 = (cta.getPrimaryButton() == null || Intrinsics.EZpvd(cta.getPrimaryButton().isHidden(), bool)) ? false : true;
                if (cta.getSecondaryButton() != null && !Intrinsics.EZpvd(cta.getSecondaryButton().isHidden(), bool)) {
                    z = true;
                }
                if (z2 && z) {
                    final CTAButtonAppModel primaryButton = cta.getPrimaryButton();
                    if (primaryButton != null) {
                        oKReminder.setPrimaryAction(primaryButton.getText(), new Function0() { // from class: o.rQd
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C42366rQe.EZpvd(abstractC42074rFj, primaryButton);
                            }
                        });
                    }
                    final CTAButtonAppModel secondaryButton = cta.getSecondaryButton();
                    if (secondaryButton != null) {
                        oKReminder.setSecondaryAction(secondaryButton.getText(), new Function0() { // from class: o.rQc
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C42366rQe.KWHzl(abstractC42074rFj, secondaryButton);
                            }
                        });
                        return;
                    }
                    return;
                }
                final CTAButtonAppModel primaryButton2 = cta.getPrimaryButton();
                if (primaryButton2 != null) {
                    oKReminder.setPrimaryAction(primaryButton2.getText(), new Function0() { // from class: o.rQb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C42366rQe.AYXKKw(abstractC42074rFj, primaryButton2);
                        }
                    });
                    CtaButtonStyle ctaButtonStyle = notificationReminderAppModel.getCtaButtonStyle();
                    if ((ctaButtonStyle != null ? ctaButtonStyle.getPrimaryButton() : null) == NotificationButtonStyle.FULL_WIDTH) {
                        oKReminder.AYXKKw().setOKDSType(259);
                        oKReminder.AYXKKw().post(new java.lang.Runnable() { // from class: o.rQj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                C42366rQe.OLrzqt(oKReminder);
                            }
                        });
                    }
                }
            }
        }
    }

    public static final Unit EZpvd(OKReminder oKReminder, NotificationReminderAppModel notificationReminderAppModel) {
        oKReminder.setVisibility(8);
        notificationReminderAppModel.setHidden(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel) {
        if (abstractC42074rFj != null) {
            abstractC42074rFj.copydefault(cTAButtonAppModel);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel) {
        if (abstractC42074rFj != null) {
            abstractC42074rFj.copydefault(cTAButtonAppModel);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(AbstractC42074rFj abstractC42074rFj, CTAButtonAppModel cTAButtonAppModel) {
        if (abstractC42074rFj != null) {
            abstractC42074rFj.copydefault(cTAButtonAppModel);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(OKReminder oKReminder) {
        ViewGroup.LayoutParams layoutParams = oKReminder.copydefault().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            oKReminder.copydefault().setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = oKReminder.AYXKKw().getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = -1;
            oKReminder.AYXKKw().setLayoutParams(layoutParams2);
        }
        oKReminder.AYXKKw().setEllipsize(null);
    }
}
