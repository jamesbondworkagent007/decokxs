package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.unify_trade.biz.DigitInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vTL extends ConstraintLayout {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public boolean OLrzqt;
    public final AbstractC50929vdS copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vTL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vTL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridPriceInterval(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AhwBna = str;
        this.djBIcL = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlDoubtHint(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpDoubtHint(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.content.Context context) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C57594ylP.AEQbTJ(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C57594ylP.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C53274wiR c53274wiRAEQbTJ = C53274wiR.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDCKfqPDCfLja), yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.LocalActivityResultRegistryOwner), C33070mpX.AYXKKw(C55688xof.Application.setDefaultDisplayHomeAsUpEnabled)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.setContent), C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequest))));
                Intrinsics.copydefault(this.OLrzqt, "");
                android.content.Context baseContext = ((android.view.ContextThemeWrapper) this.OLrzqt).getBaseContext();
                Intrinsics.copydefault(baseContext, "");
                c53274wiRAEQbTJ.show(((FragmentActivity) baseContext).getSupportFragmentManager(), C56524yIo.AEQbTJ(vTL.class).valueOf());
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.vTL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ vTL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vTL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.vqBjd, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50929vdS abstractC50929vdS = (AbstractC50929vdS) viewDataBindingInflate;
        this.copydefault = abstractC50929vdS;
        C47988uAv c47988uAv = abstractC50929vdS.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(8);
        C47988uAv c47988uAv2 = abstractC50929vdS.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        c47988uAv2.setVisibility(8);
        abstractC50929vdS.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.vTK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vTL.AEQbTJ(this.copydefault, view);
            }
        });
        abstractC50929vdS.gEmmrt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vTM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vTL.KWHzl(this.AEQbTJ, compoundButton, z);
            }
        });
        abstractC50929vdS.valueOf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vTN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vTL.AEQbTJ(this.AEQbTJ, compoundButton, z);
            }
        });
        abstractC50929vdS.djBIcL.KWHzl(new uBH(new Function0() { // from class: o.vTQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vTL.AEQbTJ(this.copydefault);
            }
        }));
        abstractC50929vdS.AYXKKw.KWHzl(new uBH(new Function0() { // from class: o.vTP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vTL.copydefault(this.OLrzqt);
            }
        }));
        values();
        C55258xgZ c55258xgZ = abstractC50929vdS.AhwBna;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, context));
        this.AYXKKw = "";
    }

    public static final void AEQbTJ(vTL vtl, android.view.View view) {
        vtl.KWHzl(!vtl.OLrzqt);
    }

    public static final void KWHzl(vTL vtl, android.widget.CompoundButton compoundButton, boolean z) {
        vtl.fIwbmz();
    }

    public static final void AEQbTJ(vTL vtl, android.widget.CompoundButton compoundButton, boolean z) {
        vtl.AuCTel();
    }

    public static final Unit AEQbTJ(vTL vtl) {
        C47988uAv c47988uAv = vtl.copydefault.djBIcL;
        c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), vtl.AEQbTJ, vtl.EZpvd));
        if (!vtl.copydefault.djBIcL.getFieldNames()) {
            vtl.copydefault();
            vtl.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vTL vtl) {
        C47988uAv c47988uAv = vtl.copydefault.AYXKKw;
        c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), vtl.AEQbTJ, vtl.EZpvd));
        if (!vtl.copydefault.AYXKKw.getFieldNames()) {
            vtl.OLrzqt();
            vtl.copydefault();
        }
        return Unit.INSTANCE;
    }

    public final void values() {
        this.copydefault.OLrzqt.setImageResource(this.OLrzqt ? C52761wXj.TaskDescription.QslYrK : C52761wXj.TaskDescription.abAflu);
    }

    public final void fIwbmz() {
        C47988uAv.setInputContent$default(this.copydefault.djBIcL, "", false, false, 6, null);
        if (this.copydefault.gEmmrt.isChecked()) {
            this.copydefault.djBIcL.setVisibility(0);
        } else {
            this.copydefault.djBIcL.setVisibility(8);
        }
        ejfBZ();
    }

    public final void AuCTel() {
        C47988uAv.setInputContent$default(this.copydefault.AYXKKw, "", false, false, 6, null);
        if (this.copydefault.valueOf.isChecked()) {
            this.copydefault.AYXKKw.setVisibility(0);
        } else {
            this.copydefault.AYXKKw.setVisibility(8);
        }
        ejfBZ();
    }

    public final void ejfBZ() {
        if (this.copydefault.gEmmrt.isChecked() || this.copydefault.valueOf.isChecked()) {
            this.copydefault.AEQbTJ.setVisibility(0);
        } else {
            this.copydefault.AEQbTJ.setVisibility(8);
        }
    }

    public final void setTpIsOpenState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        KWHzl(SPUtils.getBoolean(str, false));
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> AhwBna() {
        if (this.copydefault.gEmmrt.getVisibility() == 0 && this.copydefault.gEmmrt.isChecked()) {
            java.lang.String strAkhnZx = this.copydefault.djBIcL.AkhnZx();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
            }
            if (C33129mqd.AEQbTJ(strAkhnZx) < C33129mqd.AEQbTJ(this.djBIcL)) {
                C33134mqi.copydefault(C55688xof.Application.getDrawerToggleDelegate);
                return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null);
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, strAkhnZx);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    private final void KWHzl(boolean z) {
        if (this.OLrzqt == z) {
            return;
        }
        this.OLrzqt = z;
        this.copydefault.KWHzl.setVisibility(z ? 0 : 8);
        if (z) {
            this.copydefault.gEmmrt.setCheckedIgnoreListener(true);
            this.copydefault.valueOf.setCheckedIgnoreListener(true);
            this.copydefault.gEmmrt.setVisibility(0);
            this.copydefault.valueOf.setVisibility(0);
            fIwbmz();
            AuCTel();
        } else {
            this.copydefault.gEmmrt.setCheckedIgnoreListener(false);
            this.copydefault.valueOf.setCheckedIgnoreListener(false);
            this.copydefault.gEmmrt.setVisibility(8);
            this.copydefault.valueOf.setVisibility(8);
            fIwbmz();
            AuCTel();
            ejfBZ();
        }
        values();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.AYXKKw)) {
            SPUtils.put(this.AYXKKw, java.lang.Boolean.valueOf(this.OLrzqt));
        }
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> djBIcL() {
        if (this.copydefault.valueOf.getVisibility() == 0 && this.copydefault.valueOf.isChecked()) {
            java.lang.String strAkhnZx = this.copydefault.AYXKKw.AkhnZx();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
            }
            if (C33129mqd.AEQbTJ(strAkhnZx) > C33129mqd.AEQbTJ(this.AhwBna)) {
                C33134mqi.copydefault(C55688xof.Application.skipToQueueItem);
                return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null);
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, strAkhnZx);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public final java.lang.String DbNXlk() {
        return this.copydefault.djBIcL.AkhnZx();
    }

    public final java.lang.String gEmmrt() {
        return this.copydefault.AYXKKw.AkhnZx();
    }

    public final int valueOf() {
        return this.copydefault.gEmmrt.getVisibility();
    }

    public final boolean isConnected() {
        return this.copydefault.gEmmrt.isChecked();
    }

    public final int AEQbTJ() {
        return this.copydefault.valueOf.getVisibility();
    }

    public final boolean AkhnZx() {
        return this.copydefault.valueOf.isChecked();
    }

    public final void setTpInputErrMsg(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.djBIcL.setInputErrorMsg(str);
    }

    public final void KWHzl() {
        this.copydefault.djBIcL.copydefault();
    }

    public final void setSlInputErrMsg(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.AYXKKw.setInputErrorMsg(str);
    }

    public final void EZpvd() {
        this.copydefault.AYXKKw.copydefault();
    }

    public final boolean copydefault() {
        java.lang.String strAkhnZx = this.copydefault.djBIcL.AkhnZx();
        java.lang.String strAkhnZx2 = this.copydefault.AYXKKw.AkhnZx();
        C47988uAv c47988uAv = this.copydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c47988uAv.getVisibility() != 0 || strAkhnZx.length() == 0) {
            this.copydefault.djBIcL.copydefault();
            return true;
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "short")) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx2) && C33129mqd.copydefault(strAkhnZx, strAkhnZx2)) {
                this.copydefault.djBIcL.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.setRating));
                return false;
            }
            if (C33129mqd.copydefault(strAkhnZx, AYXKKw())) {
                this.copydefault.djBIcL.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.onNewIntent));
                return false;
            }
            if (C33129mqd.copydefault(strAkhnZx, this.AhwBna)) {
                this.copydefault.djBIcL.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatTransportControlsApi23));
                return false;
            }
        } else {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx2) && C33129mqd.valueOf(strAkhnZx, strAkhnZx2)) {
                this.copydefault.djBIcL.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.setHideOffset));
                return false;
            }
            if (C33129mqd.valueOf(strAkhnZx, AYXKKw())) {
                this.copydefault.djBIcL.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.addQueueItemAt));
                return false;
            }
            if (C33129mqd.valueOf(strAkhnZx, this.djBIcL)) {
                this.copydefault.djBIcL.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.getDrawerToggleDelegate));
                return false;
            }
        }
        this.copydefault.djBIcL.copydefault();
        return true;
    }

    public final boolean OLrzqt() {
        java.lang.String strAkhnZx = this.copydefault.djBIcL.AkhnZx();
        java.lang.String strAkhnZx2 = this.copydefault.AYXKKw.AkhnZx();
        C47988uAv c47988uAv = this.copydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c47988uAv.getVisibility() != 0 || strAkhnZx2.length() == 0) {
            this.copydefault.AYXKKw.copydefault();
            return true;
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "short")) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx) && C33129mqd.valueOf(strAkhnZx2, strAkhnZx)) {
                this.copydefault.AYXKKw.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                return false;
            }
            if (C33129mqd.valueOf(strAkhnZx2, AYXKKw())) {
                this.copydefault.AYXKKw.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.onPictureInPictureModeChanged));
                return false;
            }
            if (C33129mqd.valueOf(strAkhnZx2, this.djBIcL)) {
                this.copydefault.AYXKKw.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatMediaSessionImpl));
                return false;
            }
        } else {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx) && C33129mqd.copydefault(strAkhnZx2, strAkhnZx)) {
                this.copydefault.AYXKKw.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.setHomeAsUpIndicator));
                return false;
            }
            if (C33129mqd.copydefault(strAkhnZx2, AYXKKw())) {
                this.copydefault.AYXKKw.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggleDelegate));
                return false;
            }
            if (C33129mqd.copydefault(strAkhnZx2, this.AhwBna)) {
                this.copydefault.AYXKKw.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.skipToQueueItem));
                return false;
            }
        }
        this.copydefault.AYXKKw.copydefault();
        return true;
    }

    public final java.lang.String AYXKKw() {
        java.lang.String strAYXKKw;
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        return (value == null || (strAYXKKw = value.AYXKKw()) == null) ? "" : strAYXKKw;
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        this.AEQbTJ = str;
        this.EZpvd = str2;
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        DigitInfoBean digitInfoBeanIsConnected = new C55887xsS(str2, str).isConnected();
        this.copydefault.djBIcL.setInputUnit(digitInfoBeanIsConnected.getSymbol());
        this.copydefault.djBIcL.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        this.copydefault.AYXKKw.setInputUnit(digitInfoBeanIsConnected.getSymbol());
        this.copydefault.AYXKKw.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
    }

    public final boolean fetchVPNInfo() {
        return copydefault() && OLrzqt();
    }
}
