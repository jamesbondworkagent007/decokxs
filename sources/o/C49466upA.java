package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.tradeuilib.available.AvailableOption;
import com.okinc.tradeuilib.available.AvailableSettingBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49466upA extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public Function1<? super AvailableSettingBean, Unit> KWHzl;
    public AvailableSettingBean OLrzqt;
    public AbstractC49563uqs copydefault;

    /* JADX INFO: renamed from: o.upA$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.upA.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.upA$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C49466upA newInstance$default(TaskDescription taskDescription, AvailableSettingBean availableSettingBean, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            return taskDescription.OLrzqt(availableSettingBean, function1);
        }

        public final C49466upA OLrzqt(@NotNull AvailableSettingBean availableSettingBean, Function1<? super AvailableSettingBean, Unit> function1) {
            Intrinsics.checkNotNullParameter(availableSettingBean, "");
            C49466upA c49466upA = new C49466upA();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("trade_available", availableSettingBean);
            c49466upA.setArguments(bundle);
            c49466upA.KWHzl = function1;
            return c49466upA;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        AvailableSettingBean availableSettingBean = arguments != null ? (AvailableSettingBean) arguments.getParcelable("trade_available") : null;
        this.OLrzqt = availableSettingBean;
        pUU.KWHzl("AvailableSettingDialog", "settingBean: " + availableSettingBean);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(67);
        c52781wYc.setTitle(C33070mpX.AYXKKw(C49511upt.Activity.DbNXlk));
        c52781wYc.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        AbstractC49563uqs abstractC49563uqs = (AbstractC49563uqs) DataBindingUtil.inflate(android.view.LayoutInflater.from(requireContext()), C49511upt.StateListAnimator.copydefault, constraintLayout, false);
        this.copydefault = abstractC49563uqs;
        if (abstractC49563uqs == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs = null;
        }
        constraintLayout.addView(abstractC49563uqs.getRoot());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.util.ArrayList<AvailableOption> extraOptionList;
        C52781wYc c52781wYc;
        android.widget.ImageView imageViewOLrzqt;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C54946xaf binding = getBinding();
        if (binding != null && (c52781wYc = binding.EZpvd) != null && (imageViewOLrzqt = c52781wYc.OLrzqt()) != null) {
            imageViewOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.upy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C49466upA.AEQbTJ(this.EZpvd, view2);
                }
            });
        }
        AbstractC49563uqs abstractC49563uqs = this.copydefault;
        AbstractC49563uqs abstractC49563uqs2 = null;
        if (abstractC49563uqs == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs = null;
        }
        abstractC49563uqs.copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.upz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C49466upA.AEQbTJ(this.OLrzqt, compoundButton, z);
            }
        });
        AbstractC49563uqs abstractC49563uqs3 = this.copydefault;
        if (abstractC49563uqs3 == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs3 = null;
        }
        abstractC49563uqs3.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.upx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C49466upA.copydefault(this.copydefault, compoundButton, z);
            }
        });
        AbstractC49563uqs abstractC49563uqs4 = this.copydefault;
        if (abstractC49563uqs4 == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs4 = null;
        }
        abstractC49563uqs4.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.upC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49466upA.copydefault(this.EZpvd, view2);
            }
        });
        AbstractC49563uqs abstractC49563uqs5 = this.copydefault;
        if (abstractC49563uqs5 == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs5 = null;
        }
        abstractC49563uqs5.EZpvd.setChecked(true);
        AbstractC49563uqs abstractC49563uqs6 = this.copydefault;
        if (abstractC49563uqs6 == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs6 = null;
        }
        abstractC49563uqs6.copydefault.setChecked(C49469upD.copydefault());
        AbstractC49563uqs abstractC49563uqs7 = this.copydefault;
        if (abstractC49563uqs7 == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs7 = null;
        }
        abstractC49563uqs7.OLrzqt.setChecked(C49469upD.OLrzqt());
        AvailableSettingBean availableSettingBean = this.OLrzqt;
        boolean z = !((availableSettingBean == null || (extraOptionList = availableSettingBean.getExtraOptionList()) == null || extraOptionList.contains(AvailableOption.SimpleEarnFlexible)) ? false : true);
        AbstractC49563uqs abstractC49563uqs8 = this.copydefault;
        if (abstractC49563uqs8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49563uqs2 = abstractC49563uqs8;
        }
        android.widget.LinearLayout linearLayout = abstractC49563uqs2.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(z ? 0 : 8);
        if (!z) {
            C49469upD.AEQbTJ(false);
        }
        OLrzqt();
    }

    public static final void AEQbTJ(C49466upA c49466upA, android.view.View view) {
        c49466upA.dismissAllowingStateLoss();
    }

    public static final void AEQbTJ(C49466upA c49466upA, android.widget.CompoundButton compoundButton, boolean z) {
        pUU.KWHzl("AvailableSettingDialog", "asset setOnCheckedChangeListener selected: " + z);
        c49466upA.AEQbTJ();
    }

    public static final void copydefault(C49466upA c49466upA, android.widget.CompoundButton compoundButton, boolean z) {
        pUU.KWHzl("AvailableSettingDialog", "earn setOnCheckedChangeListener selected: " + z);
        c49466upA.AEQbTJ();
    }

    public static final void copydefault(C49466upA c49466upA, android.view.View view) {
        if (c49466upA.OLrzqt != null) {
            AbstractC49563uqs abstractC49563uqs = c49466upA.copydefault;
            AbstractC49563uqs abstractC49563uqs2 = null;
            if (abstractC49563uqs == null) {
                Intrinsics.gEmmrt("");
                abstractC49563uqs = null;
            }
            C49469upD.KWHzl(abstractC49563uqs.copydefault.isChecked());
            AbstractC49563uqs abstractC49563uqs3 = c49466upA.copydefault;
            if (abstractC49563uqs3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC49563uqs2 = abstractC49563uqs3;
            }
            C49469upD.AEQbTJ(abstractC49563uqs2.OLrzqt.isChecked());
            Function1<? super AvailableSettingBean, Unit> function1 = c49466upA.KWHzl;
            if (function1 != null) {
                AvailableSettingBean availableSettingBean = c49466upA.OLrzqt;
                Intrinsics.copydefault(availableSettingBean);
                function1.invoke(availableSettingBean);
            }
        }
        c49466upA.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt() {
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String earnAvailable;
        java.lang.String assetAvailable;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        java.lang.String tradeAvailable;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLFetchVPNInfo3;
        C54797xVr c54797xVr = C54797xVr.copydefault;
        AvailableSettingBean availableSettingBean = this.OLrzqt;
        java.lang.String str = "";
        if (availableSettingBean == null || (instId = availableSettingBean.getInstId()) == null) {
            instId = "";
        }
        AvailableSettingBean availableSettingBean2 = this.OLrzqt;
        if (availableSettingBean2 == null || (instType = availableSettingBean2.getInstType()) == null) {
            instType = "";
        }
        AvailableSettingBean availableSettingBean3 = this.OLrzqt;
        boolean zIsQuote = availableSettingBean3 != null ? availableSettingBean3.isQuote() : false;
        AvailableSettingBean availableSettingBean4 = this.OLrzqt;
        java.lang.String safeString$default3 = null;
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(c54797xVr, instId, instType, null, zIsQuote, availableSettingBean4 != null ? availableSettingBean4.getTradeQuoteCcy() : null, 4, null);
        AbstractC49563uqs abstractC49563uqs = this.copydefault;
        if (abstractC49563uqs == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs = null;
        }
        android.widget.TextView textView = abstractC49563uqs.fetchVPNInfo;
        if (c54571xNhCreateAmtConvertor$default == null) {
            safeString$default = null;
        } else {
            AvailableSettingBean availableSettingBean5 = this.OLrzqt;
            if (availableSettingBean5 == null || (tradeAvailable = availableSettingBean5.getTradeAvailable()) == null) {
                tradeAvailable = "";
            }
            C54536xML c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default.AYXKKw(tradeAvailable);
            if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL3 = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL3.fetchVPNInfo()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null);
            }
        }
        textView.setText(safeString$default);
        AbstractC49563uqs abstractC49563uqs2 = this.copydefault;
        if (abstractC49563uqs2 == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs2 = null;
        }
        android.widget.TextView textView2 = abstractC49563uqs2.AYXKKw;
        AvailableSettingBean availableSettingBean6 = this.OLrzqt;
        java.lang.String str2 = "--";
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) (availableSettingBean6 != null ? availableSettingBean6.getAssetAvailable() : null))) {
            safeString$default2 = "--";
        } else if (c54571xNhCreateAmtConvertor$default == null) {
            safeString$default2 = null;
        } else {
            AvailableSettingBean availableSettingBean7 = this.OLrzqt;
            if (availableSettingBean7 == null || (assetAvailable = availableSettingBean7.getAssetAvailable()) == null) {
                assetAvailable = "";
            }
            C54536xML c54536xMLAYXKKw2 = c54571xNhCreateAmtConvertor$default.AYXKKw(assetAvailable);
            if (c54536xMLAYXKKw2 != null && (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) != null) {
                safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null);
            }
        }
        textView2.setText(safeString$default2);
        AbstractC49563uqs abstractC49563uqs3 = this.copydefault;
        if (abstractC49563uqs3 == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs3 = null;
        }
        android.widget.TextView textView3 = abstractC49563uqs3.DbNXlk;
        AvailableSettingBean availableSettingBean8 = this.OLrzqt;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (availableSettingBean8 != null ? availableSettingBean8.getEarnAvailable() : null))) {
            if (c54571xNhCreateAmtConvertor$default != null) {
                AvailableSettingBean availableSettingBean9 = this.OLrzqt;
                if (availableSettingBean9 != null && (earnAvailable = availableSettingBean9.getEarnAvailable()) != null) {
                    str = earnAvailable;
                }
                C54536xML c54536xMLAYXKKw3 = c54571xNhCreateAmtConvertor$default.AYXKKw(str);
                if (c54536xMLAYXKKw3 != null && (c54536xMLDjBIcL = c54536xMLAYXKKw3.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
                    safeString$default3 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
                }
            }
            str2 = safeString$default3;
        }
        textView3.setText(str2);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String instType;
        java.lang.String instId;
        AvailableSettingBean availableSettingBean = this.OLrzqt;
        java.lang.String safeString$default = null;
        java.lang.String tradeAvailable = availableSettingBean != null ? availableSettingBean.getTradeAvailable() : null;
        AbstractC49563uqs abstractC49563uqs = this.copydefault;
        if (abstractC49563uqs == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs = null;
        }
        if (abstractC49563uqs.copydefault.isChecked()) {
            AvailableSettingBean availableSettingBean2 = this.OLrzqt;
            tradeAvailable = C33129mqd.addS$default(tradeAvailable, availableSettingBean2 != null ? availableSettingBean2.getAssetAvailable() : null, null, null, null, 14, null);
        }
        java.lang.String strAddS$default = tradeAvailable;
        AbstractC49563uqs abstractC49563uqs2 = this.copydefault;
        if (abstractC49563uqs2 == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs2 = null;
        }
        if (abstractC49563uqs2.OLrzqt.isChecked()) {
            AvailableSettingBean availableSettingBean3 = this.OLrzqt;
            strAddS$default = C33129mqd.addS$default(strAddS$default, availableSettingBean3 != null ? availableSettingBean3.getEarnAvailable() : null, null, null, null, 14, null);
        }
        C54797xVr c54797xVr = C54797xVr.copydefault;
        AvailableSettingBean availableSettingBean4 = this.OLrzqt;
        java.lang.String str = (availableSettingBean4 == null || (instId = availableSettingBean4.getInstId()) == null) ? "" : instId;
        AvailableSettingBean availableSettingBean5 = this.OLrzqt;
        java.lang.String str2 = (availableSettingBean5 == null || (instType = availableSettingBean5.getInstType()) == null) ? "" : instType;
        AvailableSettingBean availableSettingBean6 = this.OLrzqt;
        boolean zIsQuote = availableSettingBean6 != null ? availableSettingBean6.isQuote() : false;
        AvailableSettingBean availableSettingBean7 = this.OLrzqt;
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(c54797xVr, str, str2, null, zIsQuote, availableSettingBean7 != null ? availableSettingBean7.getTradeQuoteCcy() : null, 4, null);
        AbstractC49563uqs abstractC49563uqs3 = this.copydefault;
        if (abstractC49563uqs3 == null) {
            Intrinsics.gEmmrt("");
            abstractC49563uqs3 = null;
        }
        android.widget.TextView textView = abstractC49563uqs3.valueOf;
        if (c54571xNhCreateAmtConvertor$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default.AYXKKw(C33129mqd.gEmmrt(strAddS$default))) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        textView.setText(safeString$default);
    }
}
