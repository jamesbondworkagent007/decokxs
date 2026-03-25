package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.api.bean.ChartData;
import com.okinc.business.defi.api.bean.ChartType;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.BigDecimal;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18095fbt extends android.widget.LinearLayout {
    public java.util.List<ChartType> AEQbTJ;
    public boolean AYXKKw;
    public oXR AhwBna;
    public ConstraintLayout AkhnZx;
    public int DbNXlk;
    public java.util.List<ChartData> KWHzl;
    public AbstractC17102ewU copydefault;
    public Function1<? super BigDecimal, Unit> djBIcL;
    public final int fetchVPNInfo;
    public final oXR gEmmrt;
    public boolean valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final long EZpvd = 5;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oXR EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.math.BigDecimal, kotlin.Unit>, kotlin.jvm.functions.Function1<java.math.BigDecimal, kotlin.Unit> */
    public final Function1<BigDecimal, Unit> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstTimeLoad(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlineInteractionActiveDataPointListener(Function1<? super BigDecimal, Unit> function1) {
        this.djBIcL = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18095fbt(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.valueOf = true;
        int i = C13754dXa.TaskDescription.OqHLSf;
        this.fetchVPNInfo = i;
        this.DbNXlk = -1;
        AbstractC17102ewU abstractC17102ewU = (AbstractC17102ewU) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), i, this, true);
        this.copydefault = abstractC17102ewU;
        this.gEmmrt = abstractC17102ewU != null ? abstractC17102ewU.AYXKKw : null;
    }

    /* JADX INFO: renamed from: o.fbt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fbt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final long KWHzl() {
            return C18095fbt.EZpvd;
        }
    }

    public final void setSelectedChartType(int i) {
        this.DbNXlk = i;
        copydefault(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(1);
        this.AhwBna = (oXR) findViewById(C13754dXa.ActionBar.sYOsaF);
        this.AkhnZx = (ConstraintLayout) findViewById(C13754dXa.ActionBar.getThemedContext);
    }

    public static final boolean AEQbTJ(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view instanceof C54989xbV;
    }

    public final void copydefault(@NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ConstraintLayout constraintLayout = this.AkhnZx;
        if (constraintLayout == null) {
            Intrinsics.gEmmrt("");
            constraintLayout = null;
        }
        final int i = 0;
        for (java.lang.Object obj : C59467zhb.DbNXlk(ViewGroupKt.getChildren(constraintLayout), new Function1() { // from class: o.fbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C18095fbt.AEQbTJ((android.view.View) obj2));
            }
        })) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((android.view.View) obj).setOnClickListener(new View.OnClickListener() { // from class: o.fbw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C18095fbt.OLrzqt(this.KWHzl, i, function1, view);
                }
            });
            i++;
        }
    }

    public static final void OLrzqt(C18095fbt c18095fbt, int i, Function1 function1, android.view.View view) {
        ChartType chartType;
        java.util.List<ChartType> list = c18095fbt.AEQbTJ;
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.List<ChartType> list2 = c18095fbt.AEQbTJ;
        int chartTypeId = (list2 == null || (chartType = list2.get(i)) == null) ? -1 : chartType.getChartTypeId();
        function1.invoke(java.lang.Integer.valueOf(chartTypeId));
        c18095fbt.copydefault(chartTypeId);
    }

    public static final boolean OLrzqt(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view instanceof C54989xbV;
    }

    public static /* synthetic */ void setData$default(C18095fbt c18095fbt, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c18095fbt.setData(list, z);
    }

    public final void setData(@NotNull java.util.List<ChartData> list, boolean z) {
        C18055fbF c18055fbF;
        C18055fbF c18055fbF2;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        java.util.List<ChartData> list2 = this.KWHzl;
        oXR oxr = null;
        if (list2 == null || !list2.containsAll(list)) {
            this.KWHzl = list;
            final oXR oxr2 = this.AhwBna;
            if (oxr2 == null) {
                Intrinsics.gEmmrt("");
                oxr2 = null;
            }
            java.util.List<ChartData> listAhwBna = this.KWHzl;
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            this.AYXKKw = copydefault(listAhwBna);
            oXR oxr3 = this.AhwBna;
            if (oxr3 == null) {
                Intrinsics.gEmmrt("");
                oxr3 = null;
            }
            oXO oxo = oXO.AEQbTJ;
            boolean zOLrzqt = C33492mxV.OLrzqt();
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            oxr3.setFallOption(oxo.AEQbTJ(!zOLrzqt, c33512mxp.isConnected() == 0, false));
            oXR oxr4 = this.AhwBna;
            if (oxr4 == null) {
                Intrinsics.gEmmrt("");
                oxr4 = null;
            }
            oxr4.setRiseOption(oxo.AEQbTJ(!C33492mxV.OLrzqt(), c33512mxp.isConnected() == 0, true));
            if (this.valueOf || z) {
                oXR oxr5 = this.AhwBna;
                if (oxr5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    oxr = oxr5;
                }
                oxr.setDrawOption(oxo.AEQbTJ(!C33492mxV.OLrzqt(), c33512mxp.isConnected() == 0, this.AYXKKw));
                java.util.List<ChartData> listAhwBna2 = this.KWHzl;
                if (listAhwBna2 == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                oxr2.setData(listAhwBna2, (104 & 2) != 0 ? false : this.valueOf, (104 & 4) != 0 ? false : false, (104 & 8) != 0 ? oXM.Companion.OLrzqt() : new oXM(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.gkJEwt), C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf")), new Function1() { // from class: o.fbA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Float.valueOf(C18095fbt.copydefault((ChartData) obj));
                    }
                }, (104 & 32) != 0 ? new Function1() { // from class: o.oXX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oXR.KWHzl(obj);
                    }
                } : new Function1() { // from class: o.fbB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C18095fbt.valueOf(this.OLrzqt, (ChartData) obj);
                    }
                }, (104 & 64) != 0 ? new Function1() { // from class: o.oXT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oXR.copydefault(obj);
                    }
                } : new Function1() { // from class: o.fbz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C18095fbt.EZpvd(this.AEQbTJ, (ChartData) obj);
                    }
                });
                this.valueOf = false;
            } else {
                java.util.List<ChartData> listAhwBna3 = this.KWHzl;
                if (listAhwBna3 == null) {
                    listAhwBna3 = yDY.AhwBna();
                }
                oXY.KWHzl(oxr2, listAhwBna3, false, oxo.AEQbTJ(!C33492mxV.OLrzqt(), c33512mxp.isConnected() == 0, this.AYXKKw), new oXM(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.gkJEwt), C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf")), new Function1() { // from class: o.fbx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C18095fbt.gEmmrt(this.EZpvd, (ChartData) obj);
                    }
                }, new Function1() { // from class: o.fbC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C18095fbt.AhwBna(this.KWHzl, (ChartData) obj);
                    }
                }, new Function1() { // from class: o.fbE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Float.valueOf(C18095fbt.AEQbTJ((ChartData) obj));
                    }
                });
            }
            OLrzqt();
            oxr2.postDelayed(new java.lang.Runnable() { // from class: o.fbu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C18095fbt.setData$lambda$17$lambda$16(oxr2, this);
                }
            }, 100L);
            return;
        }
        AbstractC17102ewU abstractC17102ewU = this.copydefault;
        if (abstractC17102ewU == null || (c18055fbF = abstractC17102ewU.KWHzl) == null || c18055fbF.getVisibility() != 0) {
            return;
        }
        AbstractC17102ewU abstractC17102ewU2 = this.copydefault;
        if (abstractC17102ewU2 != null && (c18055fbF2 = abstractC17102ewU2.KWHzl) != null) {
            c18055fbF2.setVisibility(8);
        }
        oXR oxr6 = this.AhwBna;
        if (oxr6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            oxr = oxr6;
        }
        oxr.setVisibility(0);
    }

    public static final float copydefault(ChartData chartData) {
        Intrinsics.checkNotNullParameter(chartData, "");
        return java.lang.Float.parseFloat(chartData.getAssetAmount());
    }

    public static final java.lang.String valueOf(C18095fbt c18095fbt, ChartData chartData) {
        Intrinsics.checkNotNullParameter(chartData, "");
        java.lang.String valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(chartData.getAssetAmount(), null, false, 0, false, 11, null);
        oXR oxr = c18095fbt.AhwBna;
        if (oxr == null) {
            Intrinsics.gEmmrt("");
            oxr = null;
        }
        oxr.setMaxMinLabelsAlpha(C13912dbY.copydefault.djBIcL() ? 255 : 0);
        return valuationFromAsset$default;
    }

    public static final java.lang.String EZpvd(C18095fbt c18095fbt, ChartData chartData) {
        int i;
        Intrinsics.checkNotNullParameter(chartData, "");
        java.util.List<ChartType> list = c18095fbt.AEQbTJ;
        if (list != null) {
            java.util.Iterator<ChartType> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().getChartTypeId() == c18095fbt.DbNXlk) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            i = -1;
        }
        if (i == 0) {
            return xMM.formatTime$default(xMM.AEQbTJ, chartData.getDateTime(), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
        }
        if (i == 1) {
            return xMM.AEQbTJ.copydefault(chartData.getDateTime(), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, (56 & 8) != 0 ? java.util.Locale.getDefault() : null, (56 & 16) != 0 ? TimeZone.getDefault() : null, (56 & 32) != 0 ? false : false);
        }
        return xMM.formatDate$default(xMM.AEQbTJ, chartData.getDateTime(), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 12, null);
    }

    public static final float AEQbTJ(ChartData chartData) {
        Intrinsics.checkNotNullParameter(chartData, "");
        return java.lang.Float.parseFloat(chartData.getAssetAmount());
    }

    public static final java.lang.String gEmmrt(C18095fbt c18095fbt, ChartData chartData) {
        Intrinsics.checkNotNullParameter(chartData, "");
        java.lang.String valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(chartData.getAssetAmount(), null, false, 0, false, 11, null);
        oXR oxr = c18095fbt.AhwBna;
        if (oxr == null) {
            Intrinsics.gEmmrt("");
            oxr = null;
        }
        oxr.setMaxMinLabelsAlpha(C13912dbY.copydefault.djBIcL() ? 255 : 0);
        return valuationFromAsset$default;
    }

    public static final java.lang.String AhwBna(C18095fbt c18095fbt, ChartData chartData) {
        int i;
        Intrinsics.checkNotNullParameter(chartData, "");
        java.util.List<ChartType> list = c18095fbt.AEQbTJ;
        if (list != null) {
            java.util.Iterator<ChartType> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().getChartTypeId() == c18095fbt.DbNXlk) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            i = -1;
        }
        if (i == 0) {
            return xMM.formatTime$default(xMM.AEQbTJ, chartData.getDateTime(), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
        }
        if (i == 1) {
            return xMM.AEQbTJ.copydefault(chartData.getDateTime(), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, (56 & 8) != 0 ? java.util.Locale.getDefault() : null, (56 & 16) != 0 ? TimeZone.getDefault() : null, (56 & 32) != 0 ? false : false);
        }
        return xMM.formatDate$default(xMM.AEQbTJ, chartData.getDateTime(), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 12, null);
    }

    public static final void setData$lambda$17$lambda$16(oXR oxr, C18095fbt c18095fbt) {
        C18055fbF c18055fbF;
        C18055fbF c18055fbF2;
        oxr.setVisibility(0);
        AbstractC17102ewU abstractC17102ewU = c18095fbt.copydefault;
        if (abstractC17102ewU != null && (c18055fbF2 = abstractC17102ewU.KWHzl) != null) {
            c18055fbF2.setVisibility(8);
        }
        AbstractC17102ewU abstractC17102ewU2 = c18095fbt.copydefault;
        if (abstractC17102ewU2 == null || (c18055fbF = abstractC17102ewU2.KWHzl) == null) {
            return;
        }
        c18055fbF.copydefault();
    }

    /* JADX INFO: renamed from: o.fbt$Application */
    public static final class Application implements InterfaceC36341oYe {
        public Application() {
        }

        @Override // o.InterfaceC36341oYe
        public void EZpvd(java.lang.Float f, java.lang.Object obj) {
            Function1<BigDecimal, Unit> function1Copydefault;
            C14724dqp.EZpvd.KWHzl(C18095fbt.Companion.KWHzl());
            if (f == null || Intrinsics.EZpvd(f, -1000.0f) || obj == null || (function1Copydefault = C18095fbt.this.copydefault()) == null) {
                return;
            }
            function1Copydefault.invoke(C33129mqd.EZpvd(((ChartData) obj).getAssetAmount()));
        }

        @Override // o.InterfaceC36341oYe
        public void copydefault(java.lang.Float f, java.lang.Object obj) {
            Function1<BigDecimal, Unit> function1Copydefault;
            C14724dqp.EZpvd.KWHzl(C18095fbt.Companion.KWHzl());
            if (f == null || Intrinsics.EZpvd(f, -1000.0f) || (function1Copydefault = C18095fbt.this.copydefault()) == null) {
                return;
            }
            Intrinsics.copydefault(obj, "");
            function1Copydefault.invoke(C33129mqd.EZpvd(((ChartData) obj).getAssetAmount()));
        }

        @Override // o.InterfaceC36341oYe
        public void copydefault() {
            Function1<BigDecimal, Unit> function1Copydefault = C18095fbt.this.copydefault();
            if (function1Copydefault != null) {
                function1Copydefault.invoke(null);
            }
        }
    }

    public final void OLrzqt() {
        oXR oxr = this.AhwBna;
        if (oxr == null) {
            Intrinsics.gEmmrt("");
            oxr = null;
        }
        oxr.setOnChartTouchListener(new Application());
    }

    public final void setTimeAxisData(@NotNull java.util.List<ChartType> list) {
        ConstraintLayout constraintLayout;
        Sequence<android.view.View> children;
        Sequence sequenceDbNXlk;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        this.AEQbTJ = list;
        AbstractC17102ewU abstractC17102ewU = this.copydefault;
        if (abstractC17102ewU != null && (constraintLayout = abstractC17102ewU.djBIcL) != null && (children = ViewGroupKt.getChildren(constraintLayout)) != null && (sequenceDbNXlk = C59467zhb.DbNXlk(children, new Function1() { // from class: o.fby
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C18095fbt.valueOf((android.view.View) obj));
            }
        })) != null) {
            int i = 0;
            for (java.lang.Object obj : sequenceDbNXlk) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                android.view.View view = (android.view.View) obj;
                C54989xbV c54989xbV = view instanceof C54989xbV ? (C54989xbV) view : null;
                if (c54989xbV != null) {
                    c54989xbV.EZpvd().setText(list.get(i).getChartTypeMsg());
                }
                i++;
            }
        }
        copydefault(this.DbNXlk);
    }

    public static final boolean valueOf(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view instanceof C54989xbV;
    }

    public final boolean copydefault(java.util.List<ChartData> list) {
        Sequence sequenceQVAiDq;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null || (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(list)) == null) {
            return false;
        }
        java.util.Iterator it = sequenceQVAiDq.iterator();
        while (it.hasNext()) {
            if (java.lang.Float.parseFloat(((ChartData) it.next()).getAssetAmount()) != 0.0f) {
                return C33129mqd.gEmmrt(new BigDecimal(((ChartData) C59467zhb.AubY(sequenceQVAiDq)).getAssetAmount()), new BigDecimal(((ChartData) C59467zhb.zsXlph(sequenceQVAiDq)).getAssetAmount()));
            }
        }
        return true;
    }

    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        C18055fbF c18055fbF;
        oXR oxr;
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC17102ewU abstractC17102ewU = this.copydefault;
        if (abstractC17102ewU != null && (oxr = abstractC17102ewU.AYXKKw) != null) {
            oxr.setVisibility(8);
        }
        AbstractC17102ewU abstractC17102ewU2 = this.copydefault;
        if (abstractC17102ewU2 == null || (c18055fbF = abstractC17102ewU2.KWHzl) == null) {
            return;
        }
        c18055fbF.setVisibility(0);
        c18055fbF.copydefault(function0);
    }

    public final void AhwBna() {
        C18055fbF c18055fbF;
        oXR oxr;
        AbstractC17102ewU abstractC17102ewU = this.copydefault;
        if (abstractC17102ewU != null && (oxr = abstractC17102ewU.AYXKKw) != null) {
            oxr.setVisibility(8);
        }
        AbstractC17102ewU abstractC17102ewU2 = this.copydefault;
        if (abstractC17102ewU2 == null || (c18055fbF = abstractC17102ewU2.KWHzl) == null) {
            return;
        }
        c18055fbF.setVisibility(0);
        c18055fbF.EZpvd();
    }

    private final void copydefault(int i) {
        int i2;
        java.util.List<ChartType> list = this.AEQbTJ;
        if (list == null) {
            return;
        }
        if (list != null) {
            java.util.Iterator<ChartType> it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (it.next().getChartTypeId() == i) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = -1;
        } else {
            i2 = -1;
        }
        ConstraintLayout constraintLayout = this.AkhnZx;
        if (constraintLayout == null) {
            Intrinsics.gEmmrt("");
            constraintLayout = null;
        }
        int i3 = 0;
        for (java.lang.Object obj : C59467zhb.DbNXlk(ViewGroupKt.getChildren(constraintLayout), new Function1() { // from class: o.fbs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C18095fbt.OLrzqt((android.view.View) obj2));
            }
        })) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            android.view.View view = (android.view.View) obj;
            Intrinsics.copydefault(view, "");
            ((C54989xbV) view).setSelected(i2 == i3);
            i3++;
        }
    }
}
