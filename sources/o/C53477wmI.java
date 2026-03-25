package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C38307pTy;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wmI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53477wmI extends ConstraintLayout {
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public AbstractC50872vcO EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public int djBIcL;
    public int fetchVPNInfo;
    public InterfaceC53520wmz gEmmrt;
    public java.lang.String isConnected;
    public java.lang.String valueOf;
    public int values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53477wmI(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53477wmI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC53520wmz interfaceC53520wmz) {
        Intrinsics.checkNotNullParameter(interfaceC53520wmz, "");
        this.gEmmrt = interfaceC53520wmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultRatio(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultTime(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaRatioMax(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaRatioMin(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntervalMax(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntervalMin(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:42) call: o.wmI.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53477wmI(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53477wmI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        java.lang.String strValueOf;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.values = 1;
        this.fetchVPNInfo = 1;
        this.AkhnZx = "";
        this.isConnected = "";
        this.KWHzl = "0.05";
        this.copydefault = "5";
        this.AYXKKw = "5";
        this.AhwBna = "1440";
        this.valueOf = "0.01";
        this.OLrzqt = "0.99";
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.DbNXlk, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                this.AkhnZx = java.lang.String.valueOf(typedArrayObtainStyledAttributes.getString(C48033uCm.LoaderManager.fJNWhG));
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.AuCTel, -1);
                if (resourceId != -1) {
                    strValueOf = context.getString(resourceId);
                    Intrinsics.copydefault((java.lang.Object) strValueOf);
                } else {
                    strValueOf = java.lang.String.valueOf(typedArrayObtainStyledAttributes.getString(C48033uCm.LoaderManager.AuCTel));
                }
                this.isConnected = strValueOf;
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        DbNXlk();
        EZpvd();
        KWHzl();
    }

    /* JADX INFO: renamed from: o.wmI$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wmI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final void DbNXlk() {
        AbstractC50872vcO abstractC50872vcOCopydefault = AbstractC50872vcO.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
        this.EZpvd = abstractC50872vcOCopydefault;
        AbstractC50872vcO abstractC50872vcO = null;
        if (abstractC50872vcOCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcOCopydefault = null;
        }
        EZpvd(abstractC50872vcOCopydefault.AEQbTJ);
        AbstractC50872vcO abstractC50872vcO2 = this.EZpvd;
        if (abstractC50872vcO2 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO2 = null;
        }
        EZpvd(abstractC50872vcO2.EZpvd);
        AbstractC50872vcO abstractC50872vcO3 = this.EZpvd;
        if (abstractC50872vcO3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50872vcO = abstractC50872vcO3;
        }
        abstractC50872vcO.copydefault.setMaxDecimal(0);
    }

    public final void EZpvd() {
        setSequenceAndTitle(this.AkhnZx, this.isConnected);
        AbstractC50872vcO abstractC50872vcO = this.EZpvd;
        AbstractC50872vcO abstractC50872vcO2 = null;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        abstractC50872vcO.OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ChecksSdkIntAtLeast));
        AbstractC50872vcO abstractC50872vcO3 = this.EZpvd;
        if (abstractC50872vcO3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO3 = null;
        }
        abstractC50872vcO3.copydefault.setInputUnit("%");
        AbstractC50872vcO abstractC50872vcO4 = this.EZpvd;
        if (abstractC50872vcO4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO4 = null;
        }
        android.widget.TextView textView = abstractC50872vcO4.AEQbTJ;
        xMR xmr = xMR.copydefault;
        BigDecimal bigDecimalOLrzqt = xmr.OLrzqt((java.lang.Object) 3);
        C38307pTy.Application application = C38307pTy.Companion;
        textView.setText(xMR.formatICUPercent$default(xmr, bigDecimalOLrzqt, null, application.copydefault(0), null, null, null, 58, null));
        AbstractC50872vcO abstractC50872vcO5 = this.EZpvd;
        if (abstractC50872vcO5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50872vcO2 = abstractC50872vcO5;
        }
        abstractC50872vcO2.EZpvd.setText(xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) 5), null, application.copydefault(0), null, null, null, 58, null));
        OLrzqt();
    }

    public final void KWHzl() {
        AbstractC50872vcO abstractC50872vcO = this.EZpvd;
        AbstractC50872vcO abstractC50872vcO2 = null;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        C55258xgZ c55258xgZ = abstractC50872vcO.KWHzl;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
        AbstractC50872vcO abstractC50872vcO3 = this.EZpvd;
        if (abstractC50872vcO3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO3 = null;
        }
        C55052xcf c55052xcf = abstractC50872vcO3.OLrzqt;
        c55052xcf.setOnClickListener(new StateListAnimator(c55052xcf, 1000L, this));
        AbstractC50872vcO abstractC50872vcO4 = this.EZpvd;
        if (abstractC50872vcO4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO4 = null;
        }
        abstractC50872vcO4.copydefault.setOnTextChangeCallback(new Function2() { // from class: o.wmH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53477wmI.OLrzqt(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        AbstractC50872vcO abstractC50872vcO5 = this.EZpvd;
        if (abstractC50872vcO5 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO5 = null;
        }
        abstractC50872vcO5.copydefault.setOnFocusChangeCallback(new Function2() { // from class: o.wmM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53477wmI.OLrzqt(this.EZpvd, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        AbstractC50872vcO abstractC50872vcO6 = this.EZpvd;
        if (abstractC50872vcO6 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO6 = null;
        }
        abstractC50872vcO6.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.wmN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53477wmI.KWHzl(this.OLrzqt, view);
            }
        });
        AbstractC50872vcO abstractC50872vcO7 = this.EZpvd;
        if (abstractC50872vcO7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50872vcO2 = abstractC50872vcO7;
        }
        abstractC50872vcO2.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wmL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53477wmI.AEQbTJ(this.AEQbTJ, view);
            }
        });
    }

    /* JADX INFO: renamed from: o.wmI$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    public static final Unit OLrzqt(C53477wmI c53477wmI, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        java.lang.Object obj = str;
        if (str == null) {
            obj = 0;
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(obj);
        int iAhwBna = strGEmmrt.length() != 0 ? C33129mqd.AhwBna(strGEmmrt) : 0;
        c53477wmI.djBIcL = iAhwBna;
        InterfaceC53520wmz interfaceC53520wmz = c53477wmI.gEmmrt;
        if (interfaceC53520wmz != null) {
            if (c53477wmI.values == 1) {
                interfaceC53520wmz.KWHzl("ratio", c53477wmI.copydefault, C33129mqd.divS$default(java.lang.Integer.valueOf(iAhwBna), 100, 2, null, null, 12, null));
            } else {
                if (c53477wmI.fetchVPNInfo == 1) {
                    c53477wmI.djBIcL = iAhwBna * 60;
                }
                interfaceC53520wmz.KWHzl(CrashHianalyticsData.TIME, C33129mqd.gEmmrt(java.lang.Integer.valueOf(c53477wmI.djBIcL)), c53477wmI.KWHzl);
            }
        }
        AbstractC50872vcO abstractC50872vcO = c53477wmI.EZpvd;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        abstractC50872vcO.copydefault.copydefault();
        C56028xvA.OLrzqt("balanceAmount", C56423yEv.EZpvd(C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_INPUT, strGEmmrt)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wmI$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C53477wmI OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53477wmI c53477wmI) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c53477wmI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.isConnected();
                C56028xvA.botClickTrack$default("tvBalanceMode", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.wmI$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C53477wmI KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53477wmI c53477wmI) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c53477wmI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.copydefault(context, "");
                android.app.Activity activity = (android.app.Activity) context;
                android.view.View viewInflate = android.view.View.inflate(activity, C48033uCm.Activity.dHguZz, null);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
                Intrinsics.copydefault(viewInflate);
                ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, viewInflate, 0, 2, null);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final Unit OLrzqt(C53477wmI c53477wmI, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && c47988uAv.AkhnZx().length() > 0) {
            c53477wmI.copydefault();
        }
        c53477wmI.setRecommendSelected(false, false);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C53477wmI c53477wmI, android.view.View view) {
        c53477wmI.OLrzqt(true);
        c53477wmI.setRecommendSelected(true, false);
    }

    public static final void AEQbTJ(C53477wmI c53477wmI, android.view.View view) {
        c53477wmI.OLrzqt(false);
        c53477wmI.setRecommendSelected(false, true);
    }

    public final void setRecommendSelected(boolean z, boolean z2) {
        AbstractC50872vcO abstractC50872vcO = this.EZpvd;
        AbstractC50872vcO abstractC50872vcO2 = null;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        abstractC50872vcO.AEQbTJ.setSelected(z);
        AbstractC50872vcO abstractC50872vcO3 = this.EZpvd;
        if (abstractC50872vcO3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50872vcO2 = abstractC50872vcO3;
        }
        abstractC50872vcO2.EZpvd.setSelected(z2);
    }

    private final void EZpvd(android.widget.TextView textView) {
        if (textView != null) {
            TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 1);
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, 8, 14, 1, 2);
        }
    }

    public final void OLrzqt(boolean z) {
        AbstractC50872vcO abstractC50872vcO = null;
        int i = 1;
        if (this.values == 1) {
            int i2 = z ? 3 : 5;
            AbstractC50872vcO abstractC50872vcO2 = this.EZpvd;
            if (abstractC50872vcO2 == null) {
                Intrinsics.gEmmrt("");
                abstractC50872vcO2 = null;
            }
            C47988uAv.setInputContent$default(abstractC50872vcO2.copydefault, java.lang.String.valueOf(i2), false, false, 6, null);
        } else {
            if (this.fetchVPNInfo != 1) {
                i = z ? 10 : 30;
            } else if (!z) {
                i = 4;
            }
            AbstractC50872vcO abstractC50872vcO3 = this.EZpvd;
            if (abstractC50872vcO3 == null) {
                Intrinsics.gEmmrt("");
                abstractC50872vcO3 = null;
            }
            C47988uAv.setInputContent$default(abstractC50872vcO3.copydefault, java.lang.String.valueOf(i), false, false, 6, null);
        }
        AbstractC50872vcO abstractC50872vcO4 = this.EZpvd;
        if (abstractC50872vcO4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50872vcO = abstractC50872vcO4;
        }
        abstractC50872vcO.copydefault.clearFocus();
    }

    public final void setSequenceAndTitle(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC50872vcO abstractC50872vcO = this.EZpvd;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        C55258xgZ c55258xgZ = abstractC50872vcO.KWHzl;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            str3 = str + JwtUtilsKt.JWT_DELIMITER;
        }
        c55258xgZ.setText(str3 + str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault() {
        java.lang.String strOLrzqt;
        if (this.values == 1) {
            java.lang.String strDivS$default = C33129mqd.divS$default(java.lang.Integer.valueOf(this.djBIcL), 100, 2, null, null, 12, null);
            strOLrzqt = (C33129mqd.copydefault(strDivS$default, this.valueOf) && C33129mqd.valueOf(strDivS$default, this.OLrzqt)) ? "" : C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.InspectableProperty), C56424yEw.gEmmrt(C56390yDp.OLrzqt("minRatio", C33129mqd.mulS$default(this.valueOf, 100, null, null, null, 14, null)), C56390yDp.OLrzqt("maxRatio", C33129mqd.mulS$default(this.OLrzqt, 100, null, null, null, 14, null))));
        } else if (this.fetchVPNInfo == 1) {
            int iAhwBna = C33129mqd.AhwBna(this.AYXKKw);
            int iAhwBna2 = C33129mqd.AhwBna(this.AhwBna);
            int i = this.djBIcL;
            if (iAhwBna > i || i > iAhwBna2) {
                java.lang.String str = this.AYXKKw;
                RoundingMode roundingMode = RoundingMode.UP;
                strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.hasAttributeId), C56424yEw.gEmmrt(C56390yDp.OLrzqt("minHour", java.lang.Integer.valueOf(C33129mqd.AhwBna(C33129mqd.divS$default(str, 60, 0, null, roundingMode, 4, null)))), C56390yDp.OLrzqt("maxHour", java.lang.Integer.valueOf(C33129mqd.AhwBna(C33129mqd.divS$default(this.AhwBna, 60, 0, null, roundingMode, 4, null))))));
            }
        } else {
            int iAhwBna3 = C33129mqd.AhwBna(this.AYXKKw);
            int iAhwBna4 = C33129mqd.AhwBna(this.AhwBna);
            int i2 = this.djBIcL;
            if (iAhwBna3 > i2 || i2 > iAhwBna4) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.name);
                xMR xmr = xMR.copydefault;
                strOLrzqt = C33069mpW.OLrzqt(strAYXKKw, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minTime", xmr.copydefault(this.AYXKKw)), C56390yDp.OLrzqt("maxTime", xmr.copydefault(this.AhwBna))));
            }
        }
        boolean z = strOLrzqt.length() == 0;
        AbstractC50872vcO abstractC50872vcO = null;
        if (z) {
            AbstractC50872vcO abstractC50872vcO2 = this.EZpvd;
            if (abstractC50872vcO2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC50872vcO = abstractC50872vcO2;
            }
            abstractC50872vcO.copydefault.copydefault();
        } else {
            AbstractC50872vcO abstractC50872vcO3 = this.EZpvd;
            if (abstractC50872vcO3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC50872vcO = abstractC50872vcO3;
            }
            abstractC50872vcO.copydefault.setInputErrorMsg(strOLrzqt);
        }
        return z;
    }

    public final void OLrzqt() {
        java.lang.String str;
        AbstractC50872vcO abstractC50872vcO = this.EZpvd;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        C47988uAv c47988uAv = abstractC50872vcO.copydefault;
        if (this.values == 1) {
            str = "≥ " + xMR.formatHundredfold$default(xMR.copydefault, this.valueOf, 0, false, null, 12, null);
        } else if (this.fetchVPNInfo == 1) {
            str = "1-24";
        } else {
            str = "≥ " + this.AYXKKw;
        }
        C47988uAv.setInputLabel$default(c47988uAv, str, null, 2, null);
    }

    public final void AYXKKw() {
        AbstractC50872vcO abstractC50872vcO = this.EZpvd;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        abstractC50872vcO.copydefault.requestFocus();
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        OLrzqt();
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        OLrzqt();
    }

    public final void isConnected() {
        C55276xgr[] c55276xgrArr = new C55276xgr[2];
        java.lang.String string = getResources().getString(C55688xof.Application.ChecksSdkIntAtLeast);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55276xgrArr[0] = new C55276xgr(string, 1, null, this.values == 1, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        java.lang.String string2 = getResources().getString(C55688xof.Application.suggest);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55276xgrArr[1] = new C55276xgr(string2, 0, null, this.values == 0, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        java.util.List<C55276xgr> listGEmmrt = yDY.gEmmrt(c55276xgrArr);
        android.content.Context context = getContext();
        Intrinsics.copydefault(context, "");
        androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        vMU vmu = new vMU();
        vmu.OLrzqt(listGEmmrt);
        vmu.AEQbTJ(new Function1() { // from class: o.wmQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53477wmI.AEQbTJ(this.OLrzqt, (C55276xgr) obj);
            }
        });
        vmu.show(supportFragmentManager);
    }

    public static final Unit AEQbTJ(C53477wmI c53477wmI, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        int i = c53477wmI.values;
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        if ((objOLrzqt instanceof java.lang.Integer) && i == ((java.lang.Number) objOLrzqt).intValue()) {
            return Unit.INSTANCE;
        }
        if (c53477wmI.values == 0) {
            c53477wmI.gEmmrt();
        } else {
            c53477wmI.AhwBna();
        }
        c53477wmI.AYXKKw();
        InterfaceC53520wmz interfaceC53520wmz = c53477wmI.gEmmrt;
        if (interfaceC53520wmz != null) {
            interfaceC53520wmz.AEQbTJ(c53477wmI.values);
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        this.values = 1;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ChecksSdkIntAtLeast);
        xMR xmr = xMR.copydefault;
        BigDecimal bigDecimalOLrzqt = xmr.OLrzqt((java.lang.Object) 3);
        C38307pTy.Application application = C38307pTy.Companion;
        EZpvd(strAYXKKw, "%", true, xMR.formatICUPercent$default(xmr, bigDecimalOLrzqt, null, application.copydefault(0), null, null, null, 58, null), xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) 5), null, application.copydefault(0), null, null, null, 58, null));
        OLrzqt();
    }

    public final void AhwBna() {
        this.values = 0;
        this.fetchVPNInfo = 1;
        switchBalanceModeText$default(this, C33070mpX.AYXKKw(C55688xof.Application.suggest), C33070mpX.AYXKKw(C55688xof.Application.Dimension), false, "1" + C33070mpX.AYXKKw(C55688xof.Application.message), "4" + C33070mpX.AYXKKw(C55688xof.Application.message), 4, null);
        OLrzqt();
    }

    public static /* synthetic */ void switchBalanceModeText$default(C53477wmI c53477wmI, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            z = false;
        }
        c53477wmI.EZpvd(str5, str2, z, str3, str4);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4) {
        AbstractC50872vcO abstractC50872vcO = null;
        if (str != null) {
            AbstractC50872vcO abstractC50872vcO2 = this.EZpvd;
            if (abstractC50872vcO2 == null) {
                Intrinsics.gEmmrt("");
                abstractC50872vcO2 = null;
            }
            abstractC50872vcO2.OLrzqt.setTitle(str);
        }
        AbstractC50872vcO abstractC50872vcO3 = this.EZpvd;
        if (abstractC50872vcO3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO3 = null;
        }
        C47988uAv.setInputContent$default(abstractC50872vcO3.copydefault, "", false, false, 6, null);
        AbstractC50872vcO abstractC50872vcO4 = this.EZpvd;
        if (abstractC50872vcO4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO4 = null;
        }
        abstractC50872vcO4.copydefault.setInputUnit(str2);
        AbstractC50872vcO abstractC50872vcO5 = this.EZpvd;
        if (abstractC50872vcO5 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO5 = null;
        }
        abstractC50872vcO5.copydefault.setUnitClickable(!z, new Function0() { // from class: o.wmJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53477wmI.OLrzqt(this.OLrzqt);
            }
        });
        AbstractC50872vcO abstractC50872vcO6 = this.EZpvd;
        if (abstractC50872vcO6 == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO6 = null;
        }
        abstractC50872vcO6.AEQbTJ.setText(str3);
        AbstractC50872vcO abstractC50872vcO7 = this.EZpvd;
        if (abstractC50872vcO7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50872vcO = abstractC50872vcO7;
        }
        abstractC50872vcO.EZpvd.setText(str4);
    }

    public static final Unit OLrzqt(C53477wmI c53477wmI) {
        c53477wmI.values();
        return Unit.INSTANCE;
    }

    public final void values() {
        if (this.values == 1) {
            AbstractC50872vcO abstractC50872vcO = this.EZpvd;
            if (abstractC50872vcO == null) {
                Intrinsics.gEmmrt("");
                abstractC50872vcO = null;
            }
            abstractC50872vcO.copydefault.setSidesLabelUnselect();
            return;
        }
        C55276xgr[] c55276xgrArr = new C55276xgr[2];
        java.lang.String string = getResources().getString(C55688xof.Application.Dimension);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55276xgrArr[0] = new C55276xgr(string, 1, null, this.fetchVPNInfo == 1, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        java.lang.String string2 = getResources().getString(C55688xof.Application.DimensionCompanion);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55276xgrArr[1] = new C55276xgr(string2, 0, null, this.fetchVPNInfo == 0, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        java.util.List<C55276xgr> listGEmmrt = yDY.gEmmrt(c55276xgrArr);
        android.content.Context context = getContext();
        Intrinsics.copydefault(context, "");
        androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        vMU vmu = new vMU();
        vmu.OLrzqt(listGEmmrt);
        vmu.AEQbTJ(new Function1() { // from class: o.wmO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53477wmI.OLrzqt(this.OLrzqt, (C55276xgr) obj);
            }
        });
        vmu.OLrzqt(new Function0() { // from class: o.wmK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53477wmI.AEQbTJ(this.AEQbTJ);
            }
        });
        vmu.show(supportFragmentManager);
    }

    public static final Unit OLrzqt(C53477wmI c53477wmI, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        AbstractC50872vcO abstractC50872vcO = c53477wmI.EZpvd;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        abstractC50872vcO.copydefault.setSidesLabelUnselect();
        int i = c53477wmI.fetchVPNInfo;
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        if ((objOLrzqt instanceof java.lang.Integer) && i == ((java.lang.Number) objOLrzqt).intValue()) {
            return Unit.INSTANCE;
        }
        if (c53477wmI.fetchVPNInfo == 0) {
            c53477wmI.djBIcL();
        } else {
            c53477wmI.valueOf();
        }
        c53477wmI.AYXKKw();
        InterfaceC53520wmz interfaceC53520wmz = c53477wmI.gEmmrt;
        if (interfaceC53520wmz != null) {
            interfaceC53520wmz.copydefault(c53477wmI.fetchVPNInfo);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53477wmI c53477wmI) {
        AbstractC50872vcO abstractC50872vcO = c53477wmI.EZpvd;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        abstractC50872vcO.copydefault.setSidesLabelUnselect();
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        switchBalanceModeText$default(this, null, C33070mpX.AYXKKw(C55688xof.Application.Dimension), false, "1" + getResources().getString(C55688xof.Application.message), "4" + getResources().getString(C55688xof.Application.message), 5, null);
        this.fetchVPNInfo = 1;
        OLrzqt();
    }

    public final void valueOf() {
        switchBalanceModeText$default(this, null, C33070mpX.AYXKKw(C55688xof.Application.DimensionCompanion), false, "10" + getResources().getString(C55688xof.Application.Discouraged), "30" + getResources().getString(C55688xof.Application.Discouraged), 5, null);
        this.fetchVPNInfo = 0;
        OLrzqt();
    }

    public final void setDefaultBalanceText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50872vcO abstractC50872vcO = this.EZpvd;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        C47988uAv.setInputContent$default(abstractC50872vcO.copydefault, str, false, false, 6, null);
    }

    public final C47988uAv AEQbTJ() {
        AbstractC50872vcO abstractC50872vcO = this.EZpvd;
        if (abstractC50872vcO == null) {
            Intrinsics.gEmmrt("");
            abstractC50872vcO = null;
        }
        C47988uAv c47988uAv = abstractC50872vcO.copydefault;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }
}
