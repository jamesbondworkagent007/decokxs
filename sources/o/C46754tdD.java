package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31909mIk;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46754tdD extends AbstractC5472Tb {
    public static final Application Companion = new Application(null);
    public static final int values = 8;
    public final java.util.List<C46707tcJ> AuCTel;
    public android.widget.TextView DbNXlk;
    public boolean ejfBZ;
    public Function1<? super java.util.List<C46707tcJ>, Unit> fARcdN;
    public final android.os.Handler fIwbmz;
    public yHO<? super C46705tcH, ? super java.lang.Integer, ? super java.lang.String, Unit> fJNWhG;
    public C31909mIk hDKMBd;

    /* JADX INFO: renamed from: o.tdD$ActionBar */
    public static final class ActionBar implements C31909mIk.TaskDescription {
        @Override // o.C31909mIk.TaskDescription
        public void KWHzl(C31909mIk c31909mIk) {
        }

        @Override // o.C31909mIk.TaskDescription
        public void OLrzqt(C31909mIk c31909mIk) {
        }

        @Override // o.C31909mIk.TaskDescription
        public void copydefault(C31909mIk c31909mIk) {
        }

        @Override // o.C31909mIk.TaskDescription
        public void copydefault(C31909mIk c31909mIk, float f) {
        }
    }

    @Override // o.AbstractC5472Tb
    public boolean DbNXlk(int i) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5472Tb
    public int EZpvd(int i) {
        return qZH.ActionBar.AxsJAYaxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5472Tb
    public void EZpvd(@NotNull C5476Tf c5476Tf, int i) {
        Intrinsics.checkNotNullParameter(c5476Tf, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull yHO<? super C46705tcH, ? super java.lang.Integer, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.fJNWhG = yho;
    }

    @Override // o.AbstractC5472Tb
    public int OLrzqt(int i) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super java.util.List<C46707tcJ>, Unit> function1) {
        this.fARcdN = function1;
    }

    @Override // o.AbstractC5472Tb
    public boolean djBIcL(int i) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5472Tb
    public int gEmmrt(int i) {
        return qZH.ActionBar.hUfVAv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46754tdD(@NotNull android.content.Context context, @NotNull java.util.List<C46707tcJ> list) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AuCTel = list;
        this.fIwbmz = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: o.tdD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tdD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void EZpvd(boolean z) {
        if (this.ejfBZ != z) {
            this.ejfBZ = z;
            AEQbTJ(false);
        }
    }

    @Override // o.AbstractC5472Tb
    public int copydefault() {
        return this.AuCTel.size();
    }

    @Override // o.AbstractC5472Tb
    public int copydefault(int i) {
        if (AuCTel(i)) {
            return this.AuCTel.get(i).AEQbTJ().size();
        }
        return 0;
    }

    @Override // o.AbstractC5472Tb
    public void AEQbTJ(@NotNull C5476Tf c5476Tf, final int i) {
        Intrinsics.checkNotNullParameter(c5476Tf, "");
        final C46707tcJ c46707tcJ = this.AuCTel.get(i);
        c5476Tf.copydefault(qZH.StateListAnimator.getUriFromString, c46707tcJ.OLrzqt());
        android.widget.TextView textView = (android.widget.TextView) c5476Tf.itemView.findViewById(qZH.StateListAnimator.QVMIlxQVMIlx);
        if (textView != null) {
            textView.setVisibility(c46707tcJ.AhwBna().length() > 0 ? 0 : 8);
            textView.setText(c46707tcJ.AhwBna());
        }
        int i2 = qZH.StateListAnimator.IPostMessageService;
        android.content.Context context = c5476Tf.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c5476Tf.copydefault(i2, C33069mpW.KWHzl(context, qZH.PendingIntent.ardYFU, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(c46707tcJ.AEQbTJ().size())))));
        c5476Tf.itemView.requestLayout();
        android.widget.CheckBox checkBox = (android.widget.CheckBox) c5476Tf.EZpvd(qZH.StateListAnimator.igXuih);
        if (checkBox != null) {
            checkBox.setVisibility((!this.ejfBZ || c46707tcJ.gEmmrt()) ? 8 : 0);
            checkBox.setOnCheckedChangeListener(null);
            checkBox.setChecked(c46707tcJ.djBIcL());
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.tdL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C46754tdD.AEQbTJ(this.KWHzl, c46707tcJ, compoundButton, z);
                }
            });
        }
        android.widget.ImageView imageView = (android.widget.ImageView) c5476Tf.itemView.findViewById(qZH.StateListAnimator.init);
        if (imageView != null) {
            C46742tcs.copydefault(imageView, c46707tcJ.KWHzl());
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) c5476Tf.itemView.findViewById(qZH.StateListAnimator.isInitInProgress);
        if (imageView2 != null) {
            C46705tcH c46705tcH = (C46705tcH) CollectionsKt___CollectionsKt.firstOrNull(c46707tcJ.AEQbTJ());
            if (c46705tcH != null && c46705tcH.AuCTel() == 2) {
                imageView2.setVisibility(0);
                C46742tcs.copydefault(imageView2, c46707tcJ.EZpvd(), new C46746tcw(C33070mpX.KWHzl(C52761wXj.TaskDescription.fERRXa), null, 0.0f, 0, 14, null));
            } else {
                imageView2.setVisibility(8);
            }
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) c5476Tf.EZpvd(qZH.StateListAnimator.gqOnQv);
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: o.tdO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C46754tdD.KWHzl(c46707tcJ, this, i, view);
                }
            });
        }
        if (c46707tcJ.valueOf()) {
            c5476Tf.EZpvd(qZH.StateListAnimator.gqOnQv, C52761wXj.TaskDescription.ExKek);
            c5476Tf.itemView.setPadding(0, 0, 0, 0);
        } else {
            c5476Tf.EZpvd(qZH.StateListAnimator.gqOnQv, C52761wXj.TaskDescription.DfrfUJ);
            c5476Tf.itemView.setPadding(0, 0, 0, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.giSNqX));
        }
        c5476Tf.EZpvd(qZH.StateListAnimator.zeUYeG).setOnClickListener(new View.OnClickListener() { // from class: o.tdN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46754tdD.copydefault(c46707tcJ, this, i, view);
            }
        });
    }

    public static final void AEQbTJ(C46754tdD c46754tdD, C46707tcJ c46707tcJ, android.widget.CompoundButton compoundButton, boolean z) {
        c46754tdD.AEQbTJ(c46707tcJ, z, true);
    }

    public static final void KWHzl(C46707tcJ c46707tcJ, C46754tdD c46754tdD, int i, android.view.View view) {
        if (c46707tcJ.valueOf()) {
            collapseGroup$default(c46754tdD, i, false, 2, null);
        } else {
            expandGroup$default(c46754tdD, i, false, 2, null);
        }
    }

    public static final void copydefault(C46707tcJ c46707tcJ, C46754tdD c46754tdD, int i, android.view.View view) {
        if (c46707tcJ.valueOf()) {
            collapseGroup$default(c46754tdD, i, false, 2, null);
        } else {
            expandGroup$default(c46754tdD, i, false, 2, null);
        }
    }

    @Override // o.AbstractC5472Tb
    public void OLrzqt(@NotNull final C5476Tf c5476Tf, final int i, int i2) {
        kotlin.Pair pairOLrzqt;
        java.lang.String strKWHzl;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(c5476Tf, "");
        this.DbNXlk = (android.widget.TextView) c5476Tf.EZpvd(qZH.StateListAnimator.zzJhsT);
        this.hDKMBd = (C31909mIk) c5476Tf.EZpvd(qZH.StateListAnimator.idLUrz);
        if (this.AuCTel.get(i).gEmmrt()) {
            ((android.widget.LinearLayout) c5476Tf.EZpvd(qZH.StateListAnimator.hgxRZI)).setVisibility(0);
            C31909mIk c31909mIk = this.hDKMBd;
            if (c31909mIk != null) {
                c31909mIk.setVisibility(8);
                return;
            }
            return;
        }
        ((android.widget.LinearLayout) c5476Tf.EZpvd(qZH.StateListAnimator.hgxRZI)).setVisibility(8);
        C31909mIk c31909mIk2 = this.hDKMBd;
        if (c31909mIk2 != null) {
            c31909mIk2.setVisibility(0);
        }
        C46705tcH c46705tcH = this.AuCTel.get(i).AEQbTJ().get(i2);
        final C46705tcH c46705tcH2 = c46705tcH;
        if (c46705tcH2.AuCTel() == 4 && Intrinsics.EZpvd((java.lang.Object) c46705tcH2.valueOf(), (java.lang.Object) "0")) {
            c46705tcH2.EZpvd(6);
        }
        Intrinsics.checkNotNullExpressionValue(c46705tcH, "");
        if (i2 == this.AuCTel.get(i).AEQbTJ().size() - 1) {
            c5476Tf.itemView.setPadding(0, 0, 0, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.giSNqX));
        } else {
            c5476Tf.itemView.setPadding(0, 0, 0, 0);
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) c5476Tf.EZpvd(qZH.StateListAnimator.igXuih);
        if (checkBox != null) {
            checkBox.setVisibility(this.ejfBZ ? 0 : 8);
            checkBox.setOnCheckedChangeListener(null);
            checkBox.setChecked(c46705tcH2.getFieldNames());
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.tdF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C46754tdD.EZpvd(this.KWHzl, c46705tcH2, compoundButton, z);
                }
            });
        }
        if (c46705tcH2.AuCTel() == 4) {
            int iAkhnZx = c46705tcH2.AkhnZx();
            if (iAkhnZx == 1) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.fObYrO), java.lang.Integer.valueOf(C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null)));
            } else {
                pairOLrzqt = (iAkhnZx == 2 || !Intrinsics.EZpvd((java.lang.Object) c46705tcH2.fJNWhG(), (java.lang.Object) "0")) ? C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.ddhgMB), java.lang.Integer.valueOf(C33512mxp.getFallDownColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null))) : C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.fObYrO), java.lang.Integer.valueOf(C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null)));
            }
        } else {
            switch (c46705tcH2.DbNXlk()) {
                case 1:
                case 3:
                case 7:
                case 9:
                case 11:
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.Activity.valueOf), java.lang.Integer.valueOf(C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null)));
                    break;
                case 2:
                case 4:
                case 8:
                case 10:
                case 12:
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.Activity.gEmmrt), java.lang.Integer.valueOf(C33512mxp.getFallDownColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null)));
                    break;
                case 5:
                case 6:
                default:
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.Activity.djBIcL), java.lang.Integer.valueOf(C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn)));
                    break;
            }
        }
        int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        android.view.View viewEZpvd = c5476Tf.EZpvd(qZH.StateListAnimator.init);
        if (viewEZpvd != null) {
            viewEZpvd.setBackgroundResource(iIntValue);
            viewEZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iIntValue2));
        }
        android.widget.TextView textView = (android.widget.TextView) c5476Tf.EZpvd(qZH.StateListAnimator.getNotifyChildrenChangedOptions);
        if (c46705tcH2.AuCTel() == 4) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) c46705tcH2.fJNWhG(), (java.lang.Object) "0") ? qZH.PendingIntent.ixgjPv : qZH.PendingIntent.DCUTEIdCUTEI);
            int iEjfBZ = c46705tcH2.ejfBZ();
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(iEjfBZ != 0 ? iEjfBZ != 1 ? iEjfBZ != 2 ? qZH.PendingIntent.call : qZH.PendingIntent.run : qZH.PendingIntent.Dmq : qZH.PendingIntent.DGOPHZ);
            int iAkhnZx2 = c46705tcH2.AkhnZx();
            if (iAkhnZx2 == 1 || iAkhnZx2 == 2) {
                strKWHzl = C33069mpW.copydefault(qZH.PendingIntent.UlJrfe, C56424yEw.gEmmrt(C56390yDp.OLrzqt("label", C33070mpX.AYXKKw(c46705tcH2.AkhnZx() == 1 ? qZH.PendingIntent.spnCvw : qZH.PendingIntent.zblBkD)), C56390yDp.OLrzqt("condition1", C46653tbI.KWHzl(c46705tcH2.EZpvd())), C56390yDp.OLrzqt("signalType", strAYXKKw2), C56390yDp.OLrzqt("condition2", C46653tbI.KWHzl(c46705tcH2.gEmmrt())), C56390yDp.OLrzqt("timePeriod", strAYXKKw3)));
            } else {
                strKWHzl = C33069mpW.copydefault(qZH.PendingIntent.USBtdM, C56424yEw.gEmmrt(C56390yDp.OLrzqt("condition1", C46653tbI.KWHzl(c46705tcH2.EZpvd())), C56390yDp.OLrzqt("signalType", strAYXKKw2), C56390yDp.OLrzqt("condition2", C46653tbI.KWHzl(c46705tcH2.gEmmrt())), C56390yDp.OLrzqt("timePeriod", strAYXKKw3)));
            }
        } else {
            switch (c46705tcH2.DbNXlk()) {
                case 1:
                    android.content.Context context = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    strKWHzl = C33069mpW.KWHzl(context, qZH.PendingIntent.fBE, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, c46705tcH2.fetchVPNInfo())));
                    break;
                case 2:
                    android.content.Context context2 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    strKWHzl = C33069mpW.KWHzl(context2, qZH.PendingIntent.gtCCJH, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, c46705tcH2.fetchVPNInfo())));
                    break;
                case 3:
                    android.content.Context context3 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    strKWHzl = C33069mpW.KWHzl(context3, qZH.PendingIntent.HJWChPhFGucI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("percentage", c46705tcH2.fetchVPNInfo()), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(qZH.PendingIntent.geLlBI))));
                    break;
                case 4:
                    android.content.Context context4 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    strKWHzl = C33069mpW.KWHzl(context4, qZH.PendingIntent.sanrWj, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("percentage", c46705tcH2.fetchVPNInfo()), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(qZH.PendingIntent.geLlBI))));
                    break;
                case 5:
                    android.content.Context context5 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    strKWHzl = C33069mpW.KWHzl(context5, qZH.PendingIntent.DGUQLIekVPG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, c46705tcH2.fetchVPNInfo())));
                    break;
                case 6:
                default:
                    android.content.Context context6 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    strKWHzl = C33069mpW.KWHzl(context6, qZH.PendingIntent.DGUQLIekVPG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, c46705tcH2.fetchVPNInfo())));
                    break;
                case 7:
                    android.content.Context context7 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "");
                    strKWHzl = C33069mpW.KWHzl(context7, qZH.PendingIntent.HJWChPhFGucI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("percentage", c46705tcH2.fetchVPNInfo()), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(qZH.PendingIntent.OGitdB))));
                    break;
                case 8:
                    android.content.Context context8 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "");
                    strKWHzl = C33069mpW.KWHzl(context8, qZH.PendingIntent.sanrWj, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("percentage", c46705tcH2.fetchVPNInfo()), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(qZH.PendingIntent.OGitdB))));
                    break;
                case 9:
                    android.content.Context context9 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "");
                    strKWHzl = C33069mpW.KWHzl(context9, qZH.PendingIntent.HJWChPhFGucI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("percentage", c46705tcH2.fetchVPNInfo()), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(qZH.PendingIntent.zdxASf))));
                    break;
                case 10:
                    android.content.Context context10 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context10, "");
                    strKWHzl = C33069mpW.KWHzl(context10, qZH.PendingIntent.sanrWj, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("percentage", c46705tcH2.fetchVPNInfo()), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(qZH.PendingIntent.zdxASf))));
                    break;
                case 11:
                    android.content.Context context11 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context11, "");
                    strKWHzl = C33069mpW.KWHzl(context11, qZH.PendingIntent.HJWChPhFGucI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("percentage", c46705tcH2.fetchVPNInfo()), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(qZH.PendingIntent.zzJhsT))));
                    break;
                case 12:
                    android.content.Context context12 = c5476Tf.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context12, "");
                    strKWHzl = C33069mpW.KWHzl(context12, qZH.PendingIntent.sanrWj, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("percentage", c46705tcH2.fetchVPNInfo()), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C33070mpX.AYXKKw(qZH.PendingIntent.zzJhsT))));
                    break;
            }
        }
        textView.setText(strKWHzl);
        final android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) c5476Tf.EZpvd(qZH.StateListAnimator.DXd);
        android.widget.TextView textView2 = (android.widget.TextView) c5476Tf.EZpvd(qZH.StateListAnimator.UUsvzU);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c46705tcH2.AhwBna())) {
            textView2.setVisibility(0);
            textView2.setText(c46705tcH2.AhwBna());
        } else {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = (android.widget.TextView) c5476Tf.EZpvd(qZH.StateListAnimator.ICustomTabsServiceStubProxy);
        if (c46705tcH2.isConnected() == 0) {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.DXd);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.GiPPlL);
        }
        textView3.setText(strAYXKKw);
        final android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) c5476Tf.EZpvd(qZH.StateListAnimator.OStAOF);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.tdI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46754tdD.AEQbTJ(this.KWHzl, c5476Tf, c46705tcH2, i, view);
            }
        });
        final C55239xgG c55239xgG = (C55239xgG) c5476Tf.EZpvd(qZH.StateListAnimator.DcMfJKfNUfqk);
        if (c55239xgG != null) {
            c55239xgG.setChecked(c46705tcH2.copydefault() % 2 >= 1);
            c55239xgG.setOnClickListener(new View.OnClickListener() { // from class: o.tdJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C46754tdD.AEQbTJ(this.copydefault, c46705tcH2, i, c55239xgG, view);
                }
            });
            c55239xgG.setVisibility(this.ejfBZ ? 4 : 0);
        }
        C31909mIk c31909mIk3 = this.hDKMBd;
        if (c31909mIk3 != null) {
            c31909mIk3.OLrzqt(true);
        }
        android.widget.TextView textView4 = this.DbNXlk;
        if (textView4 != null) {
            textView4.setOnClickListener(new View.OnClickListener() { // from class: o.tdH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C46754tdD.OLrzqt(this.AEQbTJ, c46705tcH2, i, view);
                }
            });
        }
        C31909mIk c31909mIk4 = this.hDKMBd;
        if (c31909mIk4 != null) {
            c31909mIk4.setSwipeListener(new ActionBar());
        }
        linearLayout2.post(new java.lang.Runnable() { // from class: o.tdG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46754tdD.OLrzqt(linearLayout, linearLayout2);
            }
        });
    }

    public static final void EZpvd(C46754tdD c46754tdD, C46705tcH c46705tcH, android.widget.CompoundButton compoundButton, boolean z) {
        c46754tdD.copydefault(c46705tcH, z);
    }

    public static final void AEQbTJ(C46754tdD c46754tdD, C5476Tf c5476Tf, C46705tcH c46705tcH, int i, android.view.View view) {
        yHO<? super C46705tcH, ? super java.lang.Integer, ? super java.lang.String, Unit> yho;
        android.widget.CheckBox checkBox;
        if (c46754tdD.ejfBZ && (checkBox = (android.widget.CheckBox) c5476Tf.EZpvd(qZH.StateListAnimator.igXuih)) != null) {
            checkBox.setChecked(!checkBox.isChecked());
        }
        if (c46754tdD.ejfBZ || (yho = c46754tdD.fJNWhG) == null) {
            return;
        }
        yho.invoke(c46705tcH, java.lang.Integer.valueOf(i), "0");
    }

    public static final void AEQbTJ(C46754tdD c46754tdD, C46705tcH c46705tcH, int i, C55239xgG c55239xgG, android.view.View view) {
        yHO<? super C46705tcH, ? super java.lang.Integer, ? super java.lang.String, Unit> yho = c46754tdD.fJNWhG;
        if (yho != null) {
            yho.invoke(c46705tcH, java.lang.Integer.valueOf(i), "1");
        }
        c46705tcH.KWHzl((c46705tcH.copydefault() + 1) % 2);
        c55239xgG.toggle();
    }

    public static final void OLrzqt(C46754tdD c46754tdD, C46705tcH c46705tcH, int i, android.view.View view) {
        yHO<? super C46705tcH, ? super java.lang.Integer, ? super java.lang.String, Unit> yho = c46754tdD.fJNWhG;
        if (yho != null) {
            yho.invoke(c46705tcH, java.lang.Integer.valueOf(i), "2");
        }
        C31909mIk c31909mIk = c46754tdD.hDKMBd;
        if (c31909mIk != null) {
            c31909mIk.OLrzqt(true);
        }
    }

    public static final void OLrzqt(android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2) {
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = linearLayout2.getHeight();
        }
        if (linearLayout != null) {
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    public final boolean AuCTel(int i) {
        return this.AuCTel.get(i).valueOf();
    }

    public static /* synthetic */ void expandGroup$default(C46754tdD c46754tdD, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c46754tdD.EZpvd(i, z);
    }

    public final void EZpvd(int i, boolean z) {
        this.AuCTel.get(i).EZpvd(true);
        if (z) {
            isConnected(i);
        } else {
            KWHzl();
        }
    }

    public static /* synthetic */ void collapseGroup$default(C46754tdD c46754tdD, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c46754tdD.OLrzqt(i, z);
    }

    public final void OLrzqt(int i, boolean z) {
        this.AuCTel.get(i).EZpvd(false);
        if (z) {
            fetchVPNInfo(i);
        } else {
            KWHzl();
        }
    }

    public static /* synthetic */ void markGroupSelected$default(C46754tdD c46754tdD, C46707tcJ c46707tcJ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        c46754tdD.AEQbTJ(c46707tcJ, z, z2);
    }

    public final void AEQbTJ(final C46707tcJ c46707tcJ, final boolean z, final boolean z2) {
        this.fIwbmz.post(new java.lang.Runnable() { // from class: o.tdM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46754tdD.copydefault(c46707tcJ, z, z2, this);
            }
        });
    }

    public static final void copydefault(C46707tcJ c46707tcJ, boolean z, boolean z2, C46754tdD c46754tdD) {
        if (c46707tcJ.djBIcL() == z) {
            return;
        }
        c46707tcJ.KWHzl(z);
        if (z2) {
            java.util.Iterator<T> it = c46707tcJ.AEQbTJ().iterator();
            while (it.hasNext()) {
                ((C46705tcH) it.next()).EZpvd(z);
            }
        }
        c46754tdD.AYXKKw(c46754tdD.AuCTel.indexOf(c46707tcJ), c46707tcJ.valueOf() ? c46707tcJ.AEQbTJ().size() : 1);
        Function1<? super java.util.List<C46707tcJ>, Unit> function1 = c46754tdD.fARcdN;
        if (function1 != null) {
            function1.invoke(c46754tdD.AuCTel);
        }
    }

    public final void copydefault(C46705tcH c46705tcH, boolean z) {
        boolean z2;
        if (c46705tcH.getFieldNames() == z) {
            return;
        }
        c46705tcH.EZpvd(z);
        int i = 0;
        for (java.lang.Object obj : this.AuCTel) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C46707tcJ c46707tcJ = (C46707tcJ) obj;
            int i2 = 0;
            for (java.lang.Object obj2 : c46707tcJ.AEQbTJ()) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                if (Intrinsics.EZpvd((java.lang.Object) ((C46705tcH) obj2).fARcdN(), (java.lang.Object) c46705tcH.fARcdN())) {
                    java.util.ArrayList<C46705tcH> arrayListAEQbTJ = c46707tcJ.AEQbTJ();
                    if ((arrayListAEQbTJ instanceof java.util.Collection) && arrayListAEQbTJ.isEmpty()) {
                        z2 = true;
                        AEQbTJ(c46707tcJ, z2, false);
                    } else {
                        java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
                        while (it.hasNext()) {
                            if (!((C46705tcH) it.next()).getFieldNames()) {
                                z2 = false;
                                break;
                            }
                        }
                        z2 = true;
                        AEQbTJ(c46707tcJ, z2, false);
                    }
                }
                i2++;
            }
            i++;
        }
        Function1<? super java.util.List<C46707tcJ>, Unit> function1 = this.fARcdN;
        if (function1 != null) {
            function1.invoke(this.AuCTel);
        }
    }

    public static final void KWHzl(C46754tdD c46754tdD) {
        Function1<? super java.util.List<C46707tcJ>, Unit> function1 = c46754tdD.fARcdN;
        if (function1 != null) {
            function1.invoke(c46754tdD.AuCTel);
        }
        c46754tdD.KWHzl();
    }

    public final java.util.List<C46705tcH> AEQbTJ() {
        java.util.List<C46707tcJ> list = this.AuCTel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C46707tcJ c46707tcJ : list) {
            if (!c46707tcJ.gEmmrt()) {
                arrayList.addAll(c46707tcJ.AEQbTJ());
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((C46705tcH) obj).getFieldNames()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void AEQbTJ(boolean z) {
        int i = 0;
        for (java.lang.Object obj : this.AuCTel) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C46707tcJ c46707tcJ = (C46707tcJ) obj;
            c46707tcJ.KWHzl(z);
            int i2 = 0;
            for (java.lang.Object obj2 : c46707tcJ.AEQbTJ()) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                ((C46705tcH) obj2).EZpvd(z);
                i2++;
            }
            i++;
        }
        this.fIwbmz.post(new java.lang.Runnable() { // from class: o.tdK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46754tdD.KWHzl(this.KWHzl);
            }
        });
    }
}
