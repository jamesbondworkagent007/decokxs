package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.tradingbot.impl.order.strategy.data.BotModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnProperties;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vQB extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public uNB EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vQD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vQB.djBIcL(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vQA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vQB.AEQbTJ(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vQH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vQB.copydefault(this.EZpvd);
        }
    });

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vQB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final vQB EZpvd(@NotNull BotModel botModel, @NotNull SmartEarnProperties smartEarnProperties, @NotNull SmartEarnRequestParam smartEarnRequestParam) {
            Intrinsics.checkNotNullParameter(botModel, "");
            Intrinsics.checkNotNullParameter(smartEarnProperties, "");
            Intrinsics.checkNotNullParameter(smartEarnRequestParam, "");
            vQB vqb = new vQB();
            vqb.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_model", botModel), C56390yDp.OLrzqt("smart_earn_properties_key", smartEarnProperties), C56390yDp.OLrzqt(SmartEarnRequestParam.Key, smartEarnRequestParam)));
            return vqb;
        }
    }

    public final BotModel OLrzqt() {
        return (BotModel) this.KWHzl.getValue();
    }

    public static final BotModel djBIcL(vQB vqb) {
        android.os.Bundle arguments = vqb.getArguments();
        if (arguments != null) {
            return (BotModel) arguments.getParcelable("bot_model");
        }
        return null;
    }

    public final SmartEarnProperties copydefault() {
        return (SmartEarnProperties) this.copydefault.getValue();
    }

    public static final SmartEarnProperties AEQbTJ(vQB vqb) {
        android.os.Bundle arguments = vqb.getArguments();
        if (arguments != null) {
            return (SmartEarnProperties) arguments.getParcelable("smart_earn_properties_key");
        }
        return null;
    }

    public final SmartEarnProperties EZpvd() {
        return (SmartEarnProperties) this.AEQbTJ.getValue();
    }

    public static final SmartEarnProperties copydefault(vQB vqb) {
        android.os.Bundle arguments = vqb.getArguments();
        if (arguments != null) {
            return (SmartEarnProperties) arguments.getParcelable(SmartEarnRequestParam.Key);
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.ruDxL));
        wxq.setStyle(2);
        wxq.AYXKKw().setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        wxq.AYXKKw().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wYF wyf = new wYF(context, null, 2, null);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(getString(C55688xof.Application.PipHintTrackerKt));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        constraintLayout.addView(wyf, new ConstraintLayout.LayoutParams(-1, -2));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        uNB unbCopydefault = uNB.copydefault(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, true);
        this.EZpvd = unbCopydefault;
        if (unbCopydefault != null) {
            AEQbTJ(unbCopydefault);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setBinding(null);
        super.onDestroyView();
    }

    public final void AEQbTJ(uNB unb) {
        java.lang.String strEZpvd;
        BizInstrument suggestedInstrument$default;
        SmartEarnProperties smartEarnPropertiesCopydefault = copydefault();
        java.lang.String strEZpvd2 = "--";
        BizInstrument suggestedInstrument$default2 = null;
        if (smartEarnPropertiesCopydefault != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                BotModel botModelOLrzqt = OLrzqt();
                java.lang.String strKWHzl = botModelOLrzqt != null ? botModelOLrzqt.KWHzl() : null;
                java.lang.String str = strKWHzl == null ? "" : strKWHzl;
                BotModel botModelOLrzqt2 = OLrzqt();
                java.lang.String strOLrzqt = botModelOLrzqt2 != null ? botModelOLrzqt2.OLrzqt() : null;
                suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, strOLrzqt == null ? "" : strOLrzqt, null, null, 12, null);
            } else {
                suggestedInstrument$default = null;
            }
            if (suggestedInstrument$default == null || smartEarnPropertiesCopydefault.getEarnMinLimit() == null || smartEarnPropertiesCopydefault.getEarnMaxLimit() == null || smartEarnPropertiesCopydefault.getEarnType() == null) {
                strEZpvd = "--";
            } else {
                java.lang.String earnMinLimit = smartEarnPropertiesCopydefault.getEarnMinLimit();
                if (earnMinLimit == null) {
                    earnMinLimit = "";
                }
                java.lang.String earnMaxLimit = smartEarnPropertiesCopydefault.getEarnMaxLimit();
                if (earnMaxLimit == null) {
                    earnMaxLimit = "";
                }
                InterfaceC56538yJb interfaceC56538yJbEZpvd = C56547yJk.EZpvd(earnMinLimit, earnMaxLimit);
                EarnType earnType = smartEarnPropertiesCopydefault.getEarnType();
                if (earnType != null) {
                    strEZpvd = C56033xvF.EZpvd((InterfaceC56538yJb<java.lang.String>) interfaceC56538yJbEZpvd, earnType, suggestedInstrument$default);
                } else {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
            }
        } else {
            strEZpvd = null;
        }
        java.lang.String strCopydefault = C53418wlC.copydefault(strEZpvd);
        SmartEarnProperties smartEarnPropertiesEZpvd = EZpvd();
        if (smartEarnPropertiesEZpvd != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null) {
                BotModel botModelOLrzqt3 = OLrzqt();
                java.lang.String strKWHzl2 = botModelOLrzqt3 != null ? botModelOLrzqt3.KWHzl() : null;
                java.lang.String str2 = strKWHzl2 == null ? "" : strKWHzl2;
                BotModel botModelOLrzqt4 = OLrzqt();
                java.lang.String strOLrzqt2 = botModelOLrzqt4 != null ? botModelOLrzqt4.OLrzqt() : null;
                suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str2, strOLrzqt2 == null ? "" : strOLrzqt2, null, null, 12, null);
            }
            if (suggestedInstrument$default2 != null && smartEarnPropertiesEZpvd.getEarnMinLimit() != null && smartEarnPropertiesEZpvd.getEarnMaxLimit() != null && smartEarnPropertiesEZpvd.getEarnType() != null) {
                java.lang.String earnMinLimit2 = smartEarnPropertiesEZpvd.getEarnMinLimit();
                if (earnMinLimit2 == null) {
                    earnMinLimit2 = "";
                }
                java.lang.String earnMaxLimit2 = smartEarnPropertiesEZpvd.getEarnMaxLimit();
                InterfaceC56538yJb interfaceC56538yJbEZpvd2 = C56547yJk.EZpvd(earnMinLimit2, earnMaxLimit2 != null ? earnMaxLimit2 : "");
                EarnType earnType2 = smartEarnPropertiesEZpvd.getEarnType();
                if (earnType2 != null) {
                    strEZpvd2 = C56033xvF.EZpvd((InterfaceC56538yJb<java.lang.String>) interfaceC56538yJbEZpvd2, earnType2, suggestedInstrument$default2);
                } else {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
            }
        } else {
            strEZpvd2 = null;
        }
        java.lang.String strCopydefault2 = C53418wlC.copydefault(strEZpvd2);
        unb.copydefault.setTextAppearance(C52761wXj.LoaderManager.AxsJAY, C52761wXj.LoaderManager.AwvSrB);
        unb.AEQbTJ.setTextAppearance(C52761wXj.LoaderManager.AxsJAY, C52761wXj.LoaderManager.AwvSrB);
        unb.copydefault.setActiveContent(strCopydefault);
        unb.AEQbTJ.setActiveContent(strCopydefault2);
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        unb.copydefault.KWHzl().setTextColor(iCopydefault);
        unb.copydefault.AEQbTJ().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        unb.AEQbTJ.KWHzl().setTextColor(iCopydefault);
        unb.AEQbTJ.AEQbTJ().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ vQB KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vQB vqb) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = vqb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vQB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vQB vqb) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = vqb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                FragmentKt.setFragmentResult(this.copydefault, "result_key", BundleKt.bundleOf());
                this.copydefault.dismiss();
            }
        }
    }
}
