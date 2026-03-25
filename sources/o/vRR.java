package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TrailingPxResp;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridTrailingPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class vRR extends AbstractC49945uyC<AbstractC48611uXv, SpotGridTrailingPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final int copydefault = C48033uCm.Activity.OAhWiU;
    public final boolean AEQbTJ = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    public static final /* synthetic */ AbstractC48611uXv EZpvd(vRR vrr) {
        return vrr.values();
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vRR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ejfBZ();
        iwGUEr();
        fARcdN();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.RawRes));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOKDSSize(52);
        wyf.setOnClickListener(new Application(wyf, 1000L, this));
    }

    private final void ejfBZ() {
        OLrzqt().copydefault(getArguments());
    }

    private final void iwGUEr() {
        AuCTel();
        fIwbmz();
        isConnected();
    }

    private final void fARcdN() {
        values().OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vRW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vRR.EZpvd(this.OLrzqt, compoundButton, z);
            }
        });
        values().KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vRZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vRR.copydefault(this.copydefault, compoundButton, z);
            }
        });
    }

    public static final void EZpvd(vRR vrr, android.widget.CompoundButton compoundButton, boolean z) {
        vrr.EZpvd(z);
    }

    public static final void copydefault(vRR vrr, android.widget.CompoundButton compoundButton, boolean z) {
        vrr.KWHzl(z);
    }

    private final void AuCTel() {
        values().djBIcL.setContent(OLrzqt().fetchVPNInfo());
        values().copydefault.setContent(OLrzqt().AhwBna());
        java.lang.String strIsConnected = OLrzqt().isConnected();
        java.lang.String strAYXKKw = OLrzqt().AYXKKw();
        boolean z = (strIsConnected == null && strAYXKKw == null) ? false : true;
        Group group = values().AhwBna;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ? 0 : 8);
        if (z) {
            C53560wnm c53560wnm = values().AYXKKw;
            if (strIsConnected == null || strIsConnected.length() == 0) {
                strIsConnected = "--";
            }
            c53560wnm.setContent(strIsConnected);
            C53560wnm c53560wnm2 = values().gEmmrt;
            if (strAYXKKw == null || strAYXKKw.length() == 0) {
                strAYXKKw = "--";
            }
            c53560wnm2.setContent(strAYXKKw);
        }
    }

    public final void fIwbmz() {
        if (OLrzqt().ejfBZ()) {
            values().OLrzqt.setEnabled(false);
            C47988uAv c47988uAv = values().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
            c47988uAv.setVisibility(8);
            AppCompatTextView appCompatTextView = values().valueOf;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            return;
        }
        final C47988uAv c47988uAv2 = values().AEQbTJ;
        c47988uAv2.setInputHint(OLrzqt().AkhnZx());
        c47988uAv2.setInputUnit(OLrzqt().AEQbTJ());
        c47988uAv2.setMaxDecimal(OLrzqt().gEmmrt());
        TrailingConfig trailingUpConfig = OLrzqt().valueOf().getTrailingUpConfig();
        boolean enabled = trailingUpConfig != null ? trailingUpConfig.getEnabled() : false;
        EZpvd(enabled);
        values().OLrzqt.setChecked(enabled);
        OLrzqt(true);
        c47988uAv2.KWHzl(new uBH(new Function0() { // from class: o.vSa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vRR.OLrzqt(c47988uAv2, this);
            }
        }));
    }

    public static final Unit OLrzqt(C47988uAv c47988uAv, vRR vrr) {
        pUU.EZpvd("SpotGridTrailingDialog", "trailingUpPx: " + c47988uAv.AkhnZx());
        TrailingConfig trailingUpConfig = vrr.OLrzqt().valueOf().getTrailingUpConfig();
        if (trailingUpConfig != null) {
            trailingUpConfig.setStopPx(c47988uAv.AkhnZx());
        }
        if (c47988uAv.hasFocus()) {
            c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), vrr.OLrzqt().djBIcL().gEmmrt(), vrr.OLrzqt().djBIcL().djBIcL()));
        }
        if (!c47988uAv.getFieldNames()) {
            checkTrailingUpPxIsValid$default(vrr, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        final C47988uAv c47988uAv = values().EZpvd;
        c47988uAv.setInputHint(OLrzqt().DbNXlk());
        c47988uAv.setInputUnit(OLrzqt().AEQbTJ());
        c47988uAv.setMaxDecimal(OLrzqt().gEmmrt());
        TrailingConfig trailingDownConfig = OLrzqt().valueOf().getTrailingDownConfig();
        boolean enabled = trailingDownConfig != null ? trailingDownConfig.getEnabled() : false;
        KWHzl(enabled);
        values().KWHzl.setChecked(enabled);
        AEQbTJ(true);
        c47988uAv.KWHzl(new uBH(new Function0() { // from class: o.vRX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vRR.copydefault(c47988uAv, this);
            }
        }));
    }

    public static final Unit copydefault(C47988uAv c47988uAv, vRR vrr) {
        pUU.EZpvd("SpotGridTrailingDialog", "trailingDownPx: " + c47988uAv.AkhnZx());
        TrailingConfig trailingDownConfig = vrr.OLrzqt().valueOf().getTrailingDownConfig();
        if (trailingDownConfig != null) {
            trailingDownConfig.setStopPx(c47988uAv.AkhnZx());
        }
        if (c47988uAv.hasFocus()) {
            c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), vrr.OLrzqt().djBIcL().gEmmrt(), vrr.OLrzqt().djBIcL().djBIcL()));
        }
        if (!c47988uAv.getFieldNames()) {
            checkTrailingDownPxIsValid$default(vrr, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        C47988uAv c47988uAv = values().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(z ? 0 : 8);
        OLrzqt().valueOf().setTrailingUpConfig(z ? OLrzqt().EZpvd() : null);
        TrailingConfig trailingUpConfig = OLrzqt().valueOf().getTrailingUpConfig();
        java.lang.String stopPx = trailingUpConfig != null ? trailingUpConfig.getStopPx() : null;
        if (C33129mqd.AEQbTJ(stopPx, 0)) {
            C47988uAv.setInputContent$default(values().AEQbTJ, stopPx, false, false, 6, null);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ vRR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vRR vrr) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = vrr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.fJNWhG();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ vRR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vRR vrr) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = vrr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                vRR.EZpvd(this.copydefault).AEQbTJ.AuCTelauCTel();
                vRR.EZpvd(this.copydefault).EZpvd.AuCTelauCTel();
                if (vRR.checkTrailingUpPxIsValid$default(this.copydefault, false, 1, null) && vRR.checkTrailingDownPxIsValid$default(this.copydefault, false, 1, null)) {
                    this.copydefault.copydefault();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putParcelable("bot_grid_req", this.copydefault.OLrzqt().valueOf());
                    bundle.putBoolean("trailing_up_edit", this.copydefault.OLrzqt().fIwbmz());
                    bundle.putBoolean("trailing_down_edit", this.copydefault.OLrzqt().fJNWhG());
                    this.copydefault.getParentFragmentManager().setFragmentResult("trailing_settings", bundle);
                    this.copydefault.fJNWhG();
                }
            }
        }
    }

    public final void KWHzl(boolean z) {
        C47988uAv c47988uAv = values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(z ? 0 : 8);
        OLrzqt().valueOf().setTrailingDownConfig(z ? OLrzqt().KWHzl() : null);
        TrailingConfig trailingDownConfig = OLrzqt().valueOf().getTrailingDownConfig();
        java.lang.String stopPx = trailingDownConfig != null ? trailingDownConfig.getStopPx() : null;
        if (C33129mqd.AEQbTJ(stopPx, 0)) {
            C47988uAv.setInputContent$default(values().EZpvd, stopPx, false, false, 6, null);
        }
    }

    public static /* synthetic */ boolean checkTrailingUpPxIsValid$default(vRR vrr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return vrr.OLrzqt(z);
    }

    public final boolean OLrzqt(boolean z) {
        GridReq gridReqValueOf = OLrzqt().valueOf();
        TrailingPxResp trailingPxRespValues = OLrzqt().values();
        java.lang.String strAEQbTJ = C56042xvO.AEQbTJ(gridReqValueOf, trailingPxRespValues != null ? trailingPxRespValues.getMaxTrailingUpPx() : null, z);
        AbstractC48611uXv abstractC48611uXvValues = values();
        int length = strAEQbTJ.length();
        C47988uAv c47988uAv = abstractC48611uXvValues.AEQbTJ;
        if (length == 0) {
            c47988uAv.copydefault();
        } else {
            c47988uAv.setInputErrorMsg(strAEQbTJ);
        }
        return strAEQbTJ.length() == 0;
    }

    public static /* synthetic */ boolean checkTrailingDownPxIsValid$default(vRR vrr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return vrr.AEQbTJ(z);
    }

    public final boolean AEQbTJ(boolean z) {
        GridReq gridReqValueOf = OLrzqt().valueOf();
        TrailingPxResp trailingPxRespValues = OLrzqt().values();
        java.lang.String strEZpvd = C56042xvO.EZpvd(gridReqValueOf, trailingPxRespValues != null ? trailingPxRespValues.getMinTrailingDownPx() : null, z);
        AbstractC48611uXv abstractC48611uXvValues = values();
        int length = strEZpvd.length();
        C47988uAv c47988uAv = abstractC48611uXvValues.EZpvd;
        if (length == 0) {
            c47988uAv.copydefault();
        } else {
            c47988uAv.setInputErrorMsg(strEZpvd);
        }
        return strEZpvd.length() == 0;
    }

    public final void copydefault() {
        java.lang.String strAkhnZx = values().AEQbTJ.AkhnZx();
        if (!OLrzqt().fIwbmz() && !C33129mqd.OLrzqt(strAkhnZx, OLrzqt().copydefault())) {
            pUU.EZpvd("SpotGridTrailingDialog", "user edit up px from " + OLrzqt().copydefault() + " to " + strAkhnZx);
            OLrzqt().AEQbTJ(true);
        }
        java.lang.String strAkhnZx2 = values().EZpvd.AkhnZx();
        if (OLrzqt().fJNWhG() || C33129mqd.OLrzqt(strAkhnZx2, OLrzqt().OLrzqt())) {
            return;
        }
        pUU.EZpvd("SpotGridTrailingDialog", "user edit down px from " + OLrzqt().OLrzqt() + " to " + strAkhnZx2);
        OLrzqt().OLrzqt(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
