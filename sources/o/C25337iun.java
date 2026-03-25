package o;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.widget.mev.MevRouteParam;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iun, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25337iun extends android.widget.LinearLayout {
    public C21620hGc AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public MevRouteParam EZpvd;
    public C54997xbd KWHzl;
    public yHO<? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> OLrzqt;
    public InterfaceC25298iuA copydefault;
    public final java.util.ArrayList<C25343iut> valueOf;

    /* JADX INFO: renamed from: o.iun$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PresetRouteType.values().length];
            try {
                iArr[PresetRouteType.RouteTypeAuto.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PresetRouteType.RouteTypeMev.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PresetRouteType.RouteTypeFast.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PresetRouteType.RouteTypeNotSupport.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTrackingSettingsClickCallback(yHO<? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yho) {
        this.OLrzqt = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(InterfaceC25298iuA interfaceC25298iuA) {
        this.copydefault = interfaceC25298iuA;
    }

    private final kMM KWHzl() {
        return (kMM) this.AhwBna.getValue();
    }

    public static final kMM gEmmrt(final C25337iun c25337iun) {
        C25346iuw c25346iuw = new C25346iuw(new Function2() { // from class: o.ius
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C25337iun.EZpvd(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (C25343iut) obj2);
            }
        });
        kMM kmm = new kMM();
        kmm.register(C25343iut.class, c25346iuw);
        return kmm;
    }

    public static final Unit EZpvd(C25337iun c25337iun, int i, C25343iut c25343iut) {
        Intrinsics.checkNotNullParameter(c25343iut, "");
        c25337iun.OLrzqt(i, c25343iut);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25337iun(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.iuu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25337iun.gEmmrt(this.EZpvd);
            }
        });
        this.valueOf = new java.util.ArrayList<>();
        copydefault();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25337iun(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25337iun(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setData(@NotNull MevRouteParam mevRouteParam) {
        C55320xhi c55320xhi;
        Intrinsics.checkNotNullParameter(mevRouteParam, "");
        setVisibility(mevRouteParam.EZpvd() ? 0 : 8);
        this.EZpvd = mevRouteParam;
        this.valueOf.clear();
        PresetRouteType presetRouteTypeKWHzl = mevRouteParam.KWHzl();
        PresetRouteType presetRouteType = PresetRouteType.RouteTypeAuto;
        boolean z = presetRouteTypeKWHzl == presetRouteType;
        this.valueOf.add(new C25343iut(z, C33070mpX.AYXKKw(C23274hvD.Fragment.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner1), presetRouteType));
        this.valueOf.add(new C25343iut(!z, C33070mpX.AYXKKw(C23274hvD.Fragment.ViewTreeFullyDrawnReporterOwner), PresetRouteType.RouteTypeMev));
        C21620hGc c21620hGc = this.AEQbTJ;
        if (c21620hGc != null && (c55320xhi = c21620hGc.DbNXlk) != null) {
            c55320xhi.setText(mevRouteParam.AEQbTJ());
        }
        KWHzl(mevRouteParam.KWHzl());
    }

    public final void copydefault() {
        this.AEQbTJ = C21620hGc.EZpvd(android.view.LayoutInflater.from(getContext()), this, true);
        EZpvd();
    }

    public final void EZpvd() {
        C21620hGc c21620hGc = this.AEQbTJ;
        if (c21620hGc != null) {
            C55320xhi c55320xhi = c21620hGc.DbNXlk;
            c55320xhi.setOnClickListener(new Application(c55320xhi, 1000L, this));
            android.widget.LinearLayout linearLayout = c21620hGc.valueOf;
            linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, this, c21620hGc));
            AppCompatTextView appCompatTextView = c21620hGc.copydefault;
            appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, c21620hGc, this));
            AppCompatTextView appCompatTextView2 = c21620hGc.KWHzl;
            appCompatTextView2.setOnClickListener(new PendingIntent(appCompatTextView2, 1000L, c21620hGc, this));
        }
    }

    /* JADX INFO: renamed from: o.iun$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    public final void OLrzqt() {
        AppCompatTextView appCompatTextView;
        RecyclerView recyclerView;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C54997xbd c54997xbd = new C54997xbd(context, null, 0, 0, 14, null);
        c54997xbd.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.iup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C25337iun.AhwBna(this.KWHzl);
            }
        });
        c54997xbd.EZpvd(android.view.LayoutInflater.from(c54997xbd.copydefault()).inflate(C23274hvD.Activity.putInt, (android.view.ViewGroup) this, false));
        this.KWHzl = c54997xbd;
        android.view.View viewKWHzl = c54997xbd.KWHzl();
        if (viewKWHzl != null && (recyclerView = (RecyclerView) viewKWHzl.findViewById(C23274hvD.Application.getState)) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(KWHzl());
            KWHzl().setItems(this.valueOf);
            KWHzl().notifyDataSetChanged();
        }
        C54997xbd c54997xbd2 = this.KWHzl;
        if (c54997xbd2 != null) {
            C21620hGc c21620hGc = this.AEQbTJ;
            c54997xbd2.showAsDropDown(c21620hGc != null ? c21620hGc.isConnected : null);
        }
        C21620hGc c21620hGc2 = this.AEQbTJ;
        if (c21620hGc2 == null || (appCompatTextView = c21620hGc2.isConnected) == null) {
            return;
        }
        appCompatTextView.setSelected(true);
    }

    public static final void AhwBna(C25337iun c25337iun) {
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        C21620hGc c21620hGc = c25337iun.AEQbTJ;
        if (c21620hGc != null && (appCompatTextView = c21620hGc.isConnected) != null) {
            appCompatTextView.setSelected(false);
        }
        C21620hGc c21620hGc2 = c25337iun.AEQbTJ;
        if (c21620hGc2 == null || (appCompatImageView = c21620hGc2.AEQbTJ) == null) {
            return;
        }
        appCompatImageView.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
    }

    public final void OLrzqt(int i, C25343iut c25343iut) {
        AppCompatTextView appCompatTextView;
        C54997xbd c54997xbd = this.KWHzl;
        if (c54997xbd != null) {
            c54997xbd.dismiss();
        }
        int i2 = 0;
        for (java.lang.Object obj : this.valueOf) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ((C25343iut) obj).EZpvd(i2 == i);
            i2++;
        }
        C21620hGc c21620hGc = this.AEQbTJ;
        if (c21620hGc != null && (appCompatTextView = c21620hGc.isConnected) != null) {
            appCompatTextView.setText(c25343iut.EZpvd());
        }
        MevRouteParam mevRouteParam = this.EZpvd;
        if (mevRouteParam != null) {
            mevRouteParam.OLrzqt(c25343iut.OLrzqt());
        }
        KWHzl(c25343iut.OLrzqt());
        java.lang.String str = c25343iut.OLrzqt() == PresetRouteType.RouteTypeAuto ? "route_auto" : "route_manual";
        yHO<? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yho = this.OLrzqt;
        if (yho != null) {
            yho.invoke(str, DexTrackEventParameter.ButtonType.TRADE.getValue(), C56424yEw.KWHzl());
        }
    }

    /* JADX INFO: renamed from: o.iun$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C25337iun KWHzl;
        public final /* synthetic */ C21620hGc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C25337iun c25337iun, C21620hGc c21620hGc) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c25337iun;
            this.copydefault = c21620hGc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C54997xbd c54997xbd = this.KWHzl.KWHzl;
                if (c54997xbd != null && c54997xbd.isShowing()) {
                    C54997xbd c54997xbd2 = this.KWHzl.KWHzl;
                    if (c54997xbd2 != null) {
                        c54997xbd2.dismiss();
                        return;
                    }
                    return;
                }
                this.copydefault.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
                this.KWHzl.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.iun$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C25337iun EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C21620hGc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C21620hGc c21620hGc, C25337iun c25337iun) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c21620hGc;
            this.EZpvd = c25337iun;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.copydefault.setSelected(true);
                this.copydefault.KWHzl.setSelected(false);
                MevRouteParam mevRouteParam = this.EZpvd.EZpvd;
                if (mevRouteParam != null) {
                    mevRouteParam.OLrzqt(PresetRouteType.RouteTypeMev);
                }
                this.EZpvd.KWHzl(PresetRouteType.RouteTypeMev);
            }
        }
    }

    /* JADX INFO: renamed from: o.iun$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C25337iun EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25337iun c25337iun) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c25337iun;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                int i = C23274hvD.Fragment.onLayoutChange;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                MevRouteParam mevRouteParam = this.EZpvd.EZpvd;
                java.lang.String strOLrzqt = mevRouteParam != null ? mevRouteParam.OLrzqt() : null;
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
                pairArr[0] = C56390yDp.OLrzqt("chain", strOLrzqt);
                MevRouteParam mevRouteParam2 = this.EZpvd.EZpvd;
                java.lang.String strCopydefault = mevRouteParam2 != null ? mevRouteParam2.copydefault() : null;
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                pairArr[1] = C56390yDp.OLrzqt("value", strCopydefault);
                java.lang.String strKWHzl = C33069mpW.KWHzl(applicationOLrzqt, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr));
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1);
                viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
                viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.OcIXYQ, new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
                yHO yho = this.EZpvd.OLrzqt;
                if (yho != null) {
                    yho.invoke("route_explain", DexTrackEventParameter.ButtonType.EXPLAIN.getValue(), C56424yEw.KWHzl());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.iun$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C21620hGc KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C25337iun copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C21620hGc c21620hGc, C25337iun c25337iun) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c21620hGc;
            this.copydefault = c25337iun;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.copydefault.setSelected(false);
                this.KWHzl.KWHzl.setSelected(true);
                MevRouteParam mevRouteParam = this.copydefault.EZpvd;
                if (mevRouteParam != null) {
                    mevRouteParam.OLrzqt(PresetRouteType.RouteTypeFast);
                }
                this.copydefault.KWHzl(PresetRouteType.RouteTypeFast);
            }
        }
    }

    private final void EZpvd(PresetRouteType presetRouteType) {
        AppCompatTextView appCompatTextView;
        java.util.ArrayList<C25343iut> arrayList;
        int i;
        C21620hGc c21620hGc = this.AEQbTJ;
        if (c21620hGc == null || (appCompatTextView = c21620hGc.isConnected) == null) {
            return;
        }
        if (presetRouteType == PresetRouteType.RouteTypeAuto) {
            arrayList = this.valueOf;
            i = 0;
        } else {
            arrayList = this.valueOf;
            i = 1;
        }
        appCompatTextView.setText(arrayList.get(i).EZpvd());
    }

    public final void KWHzl(PresetRouteType presetRouteType) {
        AppCompatTextView appCompatTextView;
        android.view.View view;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        android.widget.LinearLayout linearLayout;
        android.view.View view2;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        AppCompatTextView appCompatTextView8;
        android.widget.LinearLayout linearLayout2;
        AppCompatTextView appCompatTextView9;
        android.view.View view3;
        AppCompatTextView appCompatTextView10;
        AppCompatTextView appCompatTextView11;
        AppCompatTextView appCompatTextView12;
        AppCompatTextView appCompatTextView13;
        android.widget.LinearLayout linearLayout3;
        EZpvd(presetRouteType);
        MevRouteParam mevRouteParam = this.EZpvd;
        boolean zAhwBna = mevRouteParam != null ? mevRouteParam.AhwBna() : false;
        MevRouteParam mevRouteParam2 = this.EZpvd;
        boolean zAYXKKw = mevRouteParam2 != null ? mevRouteParam2.AYXKKw() : false;
        int i = StateListAnimator.KWHzl[presetRouteType.ordinal()];
        if (i == 1) {
            C21620hGc c21620hGc = this.AEQbTJ;
            if (c21620hGc != null && (linearLayout = c21620hGc.EZpvd) != null) {
                linearLayout.setVisibility(8);
            }
            C21620hGc c21620hGc2 = this.AEQbTJ;
            if (c21620hGc2 != null && (appCompatTextView3 = c21620hGc2.AhwBna) != null) {
                appCompatTextView3.setVisibility(8);
            }
            C21620hGc c21620hGc3 = this.AEQbTJ;
            if (c21620hGc3 != null && (appCompatTextView2 = c21620hGc3.gEmmrt) != null) {
                appCompatTextView2.setVisibility(8);
            }
            C21620hGc c21620hGc4 = this.AEQbTJ;
            if (c21620hGc4 != null && (view = c21620hGc4.OLrzqt) != null) {
                view.setVisibility(8);
            }
            C21620hGc c21620hGc5 = this.AEQbTJ;
            if (c21620hGc5 != null && (appCompatTextView = c21620hGc5.AYXKKw) != null) {
                appCompatTextView.setVisibility(8);
            }
        } else if (i == 2) {
            C21620hGc c21620hGc6 = this.AEQbTJ;
            if (c21620hGc6 != null && (linearLayout2 = c21620hGc6.EZpvd) != null) {
                linearLayout2.setVisibility(0);
            }
            C21620hGc c21620hGc7 = this.AEQbTJ;
            if (c21620hGc7 != null && (appCompatTextView8 = c21620hGc7.copydefault) != null) {
                appCompatTextView8.setSelected(true);
            }
            C21620hGc c21620hGc8 = this.AEQbTJ;
            if (c21620hGc8 != null && (appCompatTextView7 = c21620hGc8.KWHzl) != null) {
                appCompatTextView7.setSelected(false);
            }
            C21620hGc c21620hGc9 = this.AEQbTJ;
            if (c21620hGc9 != null && (appCompatTextView6 = c21620hGc9.AYXKKw) != null) {
                appCompatTextView6.setVisibility(zAhwBna ? 0 : 8);
            }
            C21620hGc c21620hGc10 = this.AEQbTJ;
            if (c21620hGc10 != null && (appCompatTextView5 = c21620hGc10.AhwBna) != null) {
                appCompatTextView5.setVisibility(8);
            }
            C21620hGc c21620hGc11 = this.AEQbTJ;
            if (c21620hGc11 != null && (appCompatTextView4 = c21620hGc11.gEmmrt) != null) {
                appCompatTextView4.setVisibility(zAYXKKw ? 0 : 8);
            }
            C21620hGc c21620hGc12 = this.AEQbTJ;
            if (c21620hGc12 != null && (view2 = c21620hGc12.OLrzqt) != null) {
                view2.setVisibility(0);
            }
        } else if (i == 3) {
            C21620hGc c21620hGc13 = this.AEQbTJ;
            if (c21620hGc13 != null && (linearLayout3 = c21620hGc13.EZpvd) != null) {
                linearLayout3.setVisibility(0);
            }
            C21620hGc c21620hGc14 = this.AEQbTJ;
            if (c21620hGc14 != null && (appCompatTextView13 = c21620hGc14.KWHzl) != null) {
                appCompatTextView13.setSelected(true);
            }
            C21620hGc c21620hGc15 = this.AEQbTJ;
            if (c21620hGc15 != null && (appCompatTextView12 = c21620hGc15.copydefault) != null) {
                appCompatTextView12.setSelected(false);
            }
            C21620hGc c21620hGc16 = this.AEQbTJ;
            if (c21620hGc16 != null && (appCompatTextView11 = c21620hGc16.AhwBna) != null) {
                appCompatTextView11.setVisibility(0);
            }
            C21620hGc c21620hGc17 = this.AEQbTJ;
            if (c21620hGc17 != null && (appCompatTextView10 = c21620hGc17.gEmmrt) != null) {
                appCompatTextView10.setVisibility(8);
            }
            C21620hGc c21620hGc18 = this.AEQbTJ;
            if (c21620hGc18 != null && (view3 = c21620hGc18.OLrzqt) != null) {
                view3.setVisibility(0);
            }
            C21620hGc c21620hGc19 = this.AEQbTJ;
            if (c21620hGc19 != null && (appCompatTextView9 = c21620hGc19.AYXKKw) != null) {
                appCompatTextView9.setVisibility(8);
            }
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            setVisibility(8);
        }
        InterfaceC25298iuA interfaceC25298iuA = this.copydefault;
        if (interfaceC25298iuA != null) {
            interfaceC25298iuA.OLrzqt(presetRouteType, this);
        }
    }
}
