package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.bot.util.dca.DcaPreviewData;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vNj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50410vNj extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public uNL gEmmrt;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vNk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50410vNj.isConnected(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vNn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50410vNj.AYXKKw(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vNq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50410vNj.fetchVPNInfo(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vNu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50410vNj.djBIcL(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vNr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50410vNj.DbNXlk(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.vNs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C50410vNj.values(this.KWHzl));
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vNt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C50410vNj.ejfBZ(this.copydefault));
        }
    });

    /* JADX INFO: renamed from: o.vNj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vNj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<DcaPreviewOrderInfo> arrayList, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C50410vNj c50410vNj = new C50410vNj();
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("bot_inst_id", str), C56390yDp.OLrzqt("bot_inst_type", str2));
            bundleBundleOf.putParcelableArrayList("DATA", arrayList);
            c50410vNj.setArguments(bundleBundleOf);
            c50410vNj.show(fragmentManager);
        }
    }

    public static final java.util.List isConnected(C50410vNj c50410vNj) {
        android.os.Bundle arguments = c50410vNj.getArguments();
        java.util.ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("DATA") : null;
        return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
    }

    public final java.util.List<DcaPreviewOrderInfo> OLrzqt() {
        return (java.util.List) this.djBIcL.getValue();
    }

    public static final java.lang.String AYXKKw(C50410vNj c50410vNj) {
        android.os.Bundle arguments = c50410vNj.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("bot_inst_id") : null;
        return string == null ? "" : string;
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    private final java.lang.String AEQbTJ() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String fetchVPNInfo(C50410vNj c50410vNj) {
        android.os.Bundle arguments = c50410vNj.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("bot_inst_type") : null;
        return string == null ? "" : string;
    }

    private final AbstractC54531xLw copydefault() {
        return (AbstractC54531xLw) this.copydefault.getValue();
    }

    public static final AbstractC54531xLw djBIcL(C50410vNj c50410vNj) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            return interfaceC54581xNrCopydefault.OLrzqt(c50410vNj.AEQbTJ());
        }
        return null;
    }

    private final BizInstrument AYXKKw() {
        return (BizInstrument) this.AEQbTJ.getValue();
    }

    public static final BizInstrument DbNXlk(C50410vNj c50410vNj) {
        AbstractC54531xLw abstractC54531xLwCopydefault = c50410vNj.copydefault();
        if (abstractC54531xLwCopydefault != null) {
            return abstractC54531xLwCopydefault.valueOf(c50410vNj.EZpvd());
        }
        return null;
    }

    private final boolean valueOf() {
        return ((java.lang.Boolean) this.AhwBna.getValue()).booleanValue();
    }

    public static final boolean values(C50410vNj c50410vNj) {
        BizInstrument bizInstrumentAYXKKw = c50410vNj.AYXKKw();
        return Intrinsics.EZpvd((java.lang.Object) (bizInstrumentAYXKKw != null ? bizInstrumentAYXKKw.getInstType() : null), (java.lang.Object) "SWAP");
    }

    public final int KWHzl() {
        return ((java.lang.Number) this.valueOf.getValue()).intValue();
    }

    public static final int ejfBZ(C50410vNj c50410vNj) {
        java.lang.String strFIwbmz;
        AbstractC54531xLw abstractC54531xLwCopydefault = c50410vNj.copydefault();
        if (abstractC54531xLwCopydefault != null) {
            BizInstrument bizInstrumentAYXKKw = c50410vNj.AYXKKw();
            java.lang.String instFamily = bizInstrumentAYXKKw != null ? bizInstrumentAYXKKw.getInstFamily() : null;
            if (instFamily == null) {
                instFamily = "";
            }
            strFIwbmz = abstractC54531xLwCopydefault.fIwbmz(instFamily);
        } else {
            strFIwbmz = null;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(C33129mqd.AhwBna(strFIwbmz));
        java.lang.Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return 4;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DGOPHZDGOPHZ));
        wxq.setStyle(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        uNL unlAEQbTJ = uNL.AEQbTJ(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(unlAEQbTJ, "");
        KWHzl(unlAEQbTJ);
        this.gEmmrt = unlAEQbTJ;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.vNi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50410vNj.AkhnZx(this.OLrzqt);
            }
        });
    }

    public static final void AkhnZx(C50410vNj c50410vNj) {
        uNL unl = c50410vNj.gEmmrt;
        if (unl == null) {
            Intrinsics.gEmmrt("");
            unl = null;
        }
        android.widget.TableLayout tableLayout = unl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(tableLayout, "");
        if (tableLayout.getChildCount() == 0) {
            return;
        }
        uNL unl2 = c50410vNj.gEmmrt;
        if (unl2 == null) {
            Intrinsics.gEmmrt("");
            unl2 = null;
        }
        android.view.View childAt = unl2.gEmmrt.getChildAt(0);
        Intrinsics.copydefault(childAt, "");
        android.widget.TableRow tableRow = (android.widget.TableRow) childAt;
        uNL unl3 = c50410vNj.gEmmrt;
        if (unl3 == null) {
            Intrinsics.gEmmrt("");
            unl3 = null;
        }
        int childCount = unl3.AEQbTJ.getChildCount();
        for (int i = 0; i < childCount; i++) {
            uNL unl4 = c50410vNj.gEmmrt;
            if (unl4 == null) {
                Intrinsics.gEmmrt("");
                unl4 = null;
            }
            android.view.View childAt2 = unl4.AEQbTJ.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            android.view.View childAt3 = tableRow.getChildAt(i);
            layoutParams.width = childAt3.getWidth();
            Intrinsics.copydefault(childAt2);
            Intrinsics.copydefault(childAt3);
            childAt2.setVisibility(childAt3.getVisibility() == 0 ? 0 : 8);
            childAt2.setLayoutParams(layoutParams);
        }
    }

    public final void KWHzl(uNL unl) {
        OLrzqt(unl);
        java.lang.String strKWHzl = C53418wlC.KWHzl(C56033xvF.getBotAmountUnit$default(AEQbTJ(), EZpvd(), null, null, 12, null));
        java.lang.String str = C33070mpX.AYXKKw(C55688xof.Application.dmfpNf) + " (" + strKWHzl + ")";
        unl.EZpvd.setTextValue(str);
        unl.KWHzl.setTextValue(str);
        android.widget.TextView textView = unl.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(valueOf() ? 0 : 8);
        android.widget.TextView textView2 = unl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(valueOf() ? 0 : 8);
        android.widget.TableLayout tableLayout = unl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(tableLayout, "");
        EZpvd(tableLayout);
    }

    public final void EZpvd(android.widget.TableLayout tableLayout) {
        int i = 0;
        for (DcaPreviewOrderInfo dcaPreviewOrderInfo : OLrzqt()) {
            java.lang.String strCopydefault = xMR.copydefault.copydefault(dcaPreviewOrderInfo.djBIcL(), KWHzl());
            java.lang.String strKWHzl = KWHzl(dcaPreviewOrderInfo.valueOf(), new Function1() { // from class: o.vNy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50410vNj.OLrzqt(this.KWHzl, (java.lang.String) obj);
                }
            });
            java.lang.String strOLrzqt = dcaPreviewOrderInfo.OLrzqt();
            java.lang.String botAmount$default = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt) ? "" : C56033xvF.getBotAmount$default(AEQbTJ(), EZpvd(), strOLrzqt, null, false, null, 56, null);
            android.widget.TableRow tableRowOLrzqt = OLrzqt(i % 2 == 1);
            tableRowOLrzqt.addView(KWHzl(dcaPreviewOrderInfo.copydefault()));
            tableRowOLrzqt.addView(KWHzl(strCopydefault + strKWHzl));
            tableRowOLrzqt.addView(KWHzl(botAmount$default));
            tableRowOLrzqt.addView(KWHzl(KWHzl(dcaPreviewOrderInfo.EZpvd(), new Function1() { // from class: o.vNv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50410vNj.djBIcL(this.AEQbTJ, (java.lang.String) obj);
                }
            })));
            tableRowOLrzqt.addView(KWHzl(KWHzl(dcaPreviewOrderInfo.AhwBna(), new Function1() { // from class: o.vNp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50410vNj.valueOf(this.EZpvd, (java.lang.String) obj);
                }
            })));
            if (valueOf()) {
                tableRowOLrzqt.addView(KWHzl(KWHzl(dcaPreviewOrderInfo.AEQbTJ(), new Function1() { // from class: o.vNm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50410vNj.AhwBna(this.copydefault, (java.lang.String) obj);
                    }
                })));
                tableRowOLrzqt.addView(KWHzl(KWHzl(dcaPreviewOrderInfo.KWHzl(), new Function1() { // from class: o.vNl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50410vNj.OLrzqt((java.lang.String) obj);
                    }
                })));
            }
            tableRowOLrzqt.addView(KWHzl(KWHzl(dcaPreviewOrderInfo.AYXKKw(), new Function1() { // from class: o.vNo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50410vNj.copydefault((java.lang.String) obj);
                }
            })));
            tableLayout.addView(tableRowOLrzqt);
            i++;
        }
    }

    public static final java.lang.String OLrzqt(C50410vNj c50410vNj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        return " / " + (C33129mqd.OLrzqt(bigDecimalEZpvd, DcaPreviewData.Companion.OLrzqt()) ? "--" : pTB.formatDownToMax$default(bigDecimalEZpvd, c50410vNj.OLrzqt(bigDecimalEZpvd), null, 2, null));
    }

    public static final java.lang.String djBIcL(C50410vNj c50410vNj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xMR.copydefault.copydefault(str, c50410vNj.KWHzl());
    }

    public static final java.lang.String valueOf(C50410vNj c50410vNj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xMR.copydefault.copydefault(str, c50410vNj.KWHzl());
    }

    public static final java.lang.String AhwBna(C50410vNj c50410vNj, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0) ? "--" : xMR.copydefault.copydefault(str, c50410vNj.KWHzl());
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C53418wlC.KWHzl(C56033xvF.getBotLever$default(str, false, 2, null));
    }

    public static final java.lang.String copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56033xvF.copydefault(str);
    }

    /* JADX INFO: renamed from: o.vNj$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50410vNj KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50410vNj c50410vNj) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c50410vNj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.Ufzxmz);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.DCUTEIddSDPG);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C55688xof.Application.onCreate, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vNj$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C50410vNj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50410vNj c50410vNj) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c50410vNj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.dmfpNf);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.UrRBLY);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C55688xof.Application.onCreate, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vNj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C50410vNj EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50410vNj c50410vNj) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c50410vNj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.call);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C55688xof.Application.onCreate, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public final java.lang.String KWHzl(java.lang.String str, Function1<? super java.lang.String, java.lang.String> function1) {
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "" : function1.invoke(str);
    }

    public final android.widget.TextView KWHzl(java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(requireContext());
        textView.setText(str);
        textView.setTextSize(12.0f);
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        return textView;
    }

    public final android.widget.TableRow OLrzqt(boolean z) {
        android.widget.TableRow tableRow = new android.widget.TableRow(requireContext());
        if (z) {
            tableRow.setBackgroundResource(C52761wXj.Activity.invokespecialDPHOMC);
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams();
        int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.zuWLRA);
        tableRow.setPadding(0, iOLrzqt, 0, iOLrzqt);
        tableRow.setLayoutParams(layoutParams);
        tableRow.setShowDividers(2);
        tableRow.setDividerDrawable(C33070mpX.KWHzl(C48033uCm.ActionBar.DbNXlk));
        return tableRow;
    }

    public final void OLrzqt(uNL unl) {
        C55258xgZ c55258xgZ = unl.AYXKKw;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = unl.KWHzl;
        c55258xgZ2.setOnClickListener(new StateListAnimator(c55258xgZ2, 1000L, this));
        C55258xgZ c55258xgZ3 = unl.AhwBna;
        c55258xgZ3.setOnClickListener(new Application(c55258xgZ3, 1000L, this));
    }

    public final int OLrzqt(BigDecimal bigDecimal) {
        return C33129mqd.gEmmrt(bigDecimal, 1) ? 8 : 4;
    }
}
