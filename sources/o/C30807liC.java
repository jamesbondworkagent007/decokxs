package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.collection.ArrayMapKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.PriorityParam;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import com.okinc.business.trade.features.home.ui.cefi.setting.widget.AdvancedPresetCustomPrioritySelectView$initRecyclerView$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C30807liC;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.liC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30807liC extends LinearLayoutCompat {
    public yHO<? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> AEQbTJ;
    public final java.util.ArrayList<PrioritySelectionBean> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public java.lang.String AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public boolean KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public Function1<? super PriorityParam, Unit> copydefault;
    public java.lang.String djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public TradeMode fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public java.lang.String fetchVPNInfo;
    public PriorityParam gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public C43316rmw valueOf;
    public MemeTransactionSceneType values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43316rmw EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTrackingSettingsClickCallback(yHO<? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yho) {
        this.AEQbTJ = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeValueCallback(Function1<? super PriorityParam, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityAdapter(@NotNull C43316rmw c43316rmw) {
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        this.valueOf = c43316rmw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30807liC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.liE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30807liC.AuCTel(this.copydefault);
            }
        });
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.liF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30807liC.fIwbmz(this.KWHzl);
            }
        });
        this.gEmmrt = new PriorityParam((java.lang.String) null, AdvancedPriorityFeeType.Market.getValue(), false, 5, (DefaultConstructorMarker) null);
        this.AYXKKw = new java.util.ArrayList<>();
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.liH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30807liC.ejfBZ(this.OLrzqt);
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.liI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30807liC.fARcdN(this.OLrzqt);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.liG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30807liC.DbNXlk(this.AEQbTJ);
            }
        });
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.liJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30807liC.hDKMBd(this.EZpvd);
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.liM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30807liC.fJNWhG(this.KWHzl);
            }
        });
        this.AkhnZx = "";
        this.DbNXlk = "";
        this.EZpvd = "";
        this.djBIcL = "";
        this.fetchVPNInfo = "";
        this.valueOf = new C43316rmw();
        this.values = MemeTransactionSceneType.Market;
        this.fARcdN = TradeMode.Advanced;
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.QfsBiF, (android.view.ViewGroup) this, true);
        DbNXlk();
        fetchVPNInfo();
    }

    public static final RecyclerView AuCTel(C30807liC c30807liC) {
        return (RecyclerView) c30807liC.findViewById(C23274hvD.Application.Api26Impl);
    }

    private final RecyclerView KWHzl() {
        java.lang.Object value = this.isConnected.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (RecyclerView) value;
    }

    public static final AppCompatTextView fIwbmz(C30807liC c30807liC) {
        return (AppCompatTextView) c30807liC.findViewById(C23274hvD.Application.getApplyableNightMode);
    }

    private final AppCompatTextView gEmmrt() {
        java.lang.Object value = this.fJNWhG.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    private final C55008xbo copydefault() {
        java.lang.Object value = this.AhwBna.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C55008xbo) value;
    }

    public static final C55008xbo ejfBZ(C30807liC c30807liC) {
        return (C55008xbo) c30807liC.findViewById(C23274hvD.Application.sendQueue);
    }

    private final AppCompatTextView AhwBna() {
        java.lang.Object value = this.ejfBZ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView fARcdN(C30807liC c30807liC) {
        return (AppCompatTextView) c30807liC.findViewById(C23274hvD.Application.onDrawerSlide);
    }

    public static final LinearLayoutCompat DbNXlk(C30807liC c30807liC) {
        return (LinearLayoutCompat) c30807liC.findViewById(C23274hvD.Application.DcMfJKOmnske);
    }

    private final LinearLayoutCompat OLrzqt() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (LinearLayoutCompat) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C55320xhi djBIcL() {
        java.lang.Object value = this.AuCTel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C55320xhi) value;
    }

    public static final C55320xhi hDKMBd(C30807liC c30807liC) {
        return (C55320xhi) c30807liC.findViewById(C23274hvD.Application.DrawableContainerDrawableContainerState);
    }

    private final AppCompatTextView AYXKKw() {
        java.lang.Object value = this.fIwbmz.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView fJNWhG(C30807liC c30807liC) {
        return (AppCompatTextView) c30807liC.findViewById(C23274hvD.Application.wrap);
    }

    private final void DbNXlk() {
        C55001xbh c55001xbhAkhnZx = copydefault().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setShowThousandsSeparator(true);
        }
        C55001xbh c55001xbhAkhnZx2 = copydefault().AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setImeOptions(6);
        }
        android.widget.LinearLayout linearLayoutAuCTel = copydefault().AuCTel();
        if (linearLayoutAuCTel != null) {
            linearLayoutAuCTel.setMinimumWidth(0);
        }
        isConnected();
    }

    public final void setTotalFeeView(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt().setVisibility(z2 ? 0 : 8);
        djBIcL().setText(str);
        djBIcL().setShowUnderline(z);
        AYXKKw().setText(str2);
    }

    public final void setTotalFeeShowDetailDialog(Function0<Unit> function0) {
        if (function0 == null) {
            djBIcL().setOnClickListener(null);
        } else {
            C55320xhi c55320xhiDjBIcL = djBIcL();
            c55320xhiDjBIcL.setOnClickListener(new Activity(c55320xhiDjBIcL, 1000L, this, function0));
        }
    }

    public final void setData(@NotNull java.lang.String str, @NotNull java.util.List<PrioritySelectionBean> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, @NotNull TradeMode tradeMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(tradeMode, "");
        this.KWHzl = z;
        this.djBIcL = str;
        this.EZpvd = str2;
        this.AkhnZx = str3;
        this.DbNXlk = str4;
        this.values = this.values;
        this.fetchVPNInfo = str6;
        this.fARcdN = tradeMode;
        this.AYXKKw.clear();
        this.AYXKKw.addAll(list);
        this.valueOf.setItems(this.AYXKKw);
        this.valueOf.notifyDataSetChanged();
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            PrioritySelectionBean prioritySelectionBean = (PrioritySelectionBean) obj;
            if (prioritySelectionBean.isSelect()) {
                OLrzqt(prioritySelectionBean.getPriorityType(), prioritySelectionBean.getValue());
            }
            i2++;
        }
        if (i == AdvancedPriorityFeeType.Custom.getValue()) {
            copydefault().setVisibility(0);
            copydefault().setText(str5);
        }
        C55009xbp c55009xbpFIwbmz = copydefault().fIwbmz();
        if (c55009xbpFIwbmz != null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.UJEglR, (android.view.ViewGroup) null);
            ((AppCompatTextView) viewInflate.findViewById(C23274hvD.Application.getPaint)).setText(str6);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            c55009xbpFIwbmz.EZpvd(viewInflate);
        }
        C55001xbh c55001xbhAkhnZx = copydefault().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(AEQbTJ(str, str7));
        }
        if (this.values == MemeTransactionSceneType.Market) {
            C55008xbo c55008xboCopydefault = copydefault();
            C23271hvA c23271hvA = C23271hvA.copydefault;
            c55008xboCopydefault.setHintText(C23271hvA.formatTokenCode$default(c23271hvA, str3, true, null, false, null, null, 30, null) + " ~ " + C23271hvA.formatTokenCode$default(c23271hvA, str4, true, null, false, null, null, 30, null));
        } else {
            copydefault().setHintText(C33069mpW.copydefault(C23274hvD.Fragment.getPackageName, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23271hvA.formatTokenCode$default(C23271hvA.copydefault, str3, true, null, false, null, null, 30, null)))));
        }
        AkhnZx();
    }

    /* JADX INFO: renamed from: o.liC$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C30807liC KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C30807liC c30807liC) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c30807liC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                yHO yho = this.KWHzl.AEQbTJ;
                if (yho != null) {
                    yho.invoke("priority_fee_explain", DexTrackEventParameter.ButtonType.EXPLAIN.getValue(), C56424yEw.KWHzl());
                }
                this.KWHzl.values();
            }
        }
    }

    /* JADX INFO: renamed from: o.liC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C30807liC AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C30807liC c30807liC, Function0 function0) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c30807liC;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.AEQbTJ.djBIcL().AEQbTJ()) {
                    this.EZpvd.invoke();
                }
            }
        }
    }

    private final void AkhnZx() {
        gEmmrt().setText(valueOf());
    }

    private final java.lang.String valueOf() {
        if (this.values != MemeTransactionSceneType.Market) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.aVPvww);
        }
        if (this.KWHzl) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.onViewDetachedFromWindow);
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatApi21Builder);
    }

    private final void fetchVPNInfo() {
        AppCompatTextView appCompatTextViewGEmmrt = gEmmrt();
        appCompatTextViewGEmmrt.setOnClickListener(new ActionBar(appCompatTextViewGEmmrt, 1000L, this));
        C55001xbh c55001xbhAkhnZx = copydefault().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.liN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C30807liC.copydefault(this.AEQbTJ, view, z);
                }
            });
        }
    }

    public static final void copydefault(C30807liC c30807liC, android.view.View view, boolean z) {
        java.lang.String strValueOf;
        C55001xbh c55001xbhAkhnZx = c30807liC.copydefault().AkhnZx();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null))) {
            C55001xbh c55001xbhAkhnZx2 = c30807liC.copydefault().AkhnZx();
            strValueOf = java.lang.String.valueOf(c55001xbhAkhnZx2 != null ? c55001xbhAkhnZx2.isConnected() : null);
        } else {
            strValueOf = "";
        }
        if (!z) {
            if (strValueOf.length() == 0) {
                java.util.ArrayList<PrioritySelectionBean> arrayList = c30807liC.AYXKKw;
                if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                    java.util.Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((PrioritySelectionBean) it.next()).isSelect()) {
                        }
                    }
                }
                c30807liC.gEmmrt.setValid(false);
                C55008xbo c55008xboCopydefault = c30807liC.copydefault();
                AppCompatTextView appCompatTextViewAhwBna = c30807liC.AhwBna();
                java.lang.String string = c30807liC.getContext().getString(C23274hvD.Fragment.rate);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c30807liC.OLrzqt(c55008xboCopydefault, appCompatTextViewAhwBna, string);
                Function1<? super PriorityParam, Unit> function1 = c30807liC.copydefault;
                if (function1 != null) {
                    function1.invoke(c30807liC.gEmmrt);
                    return;
                }
                return;
            }
            c30807liC.setPriorityMessageStyle(strValueOf);
            return;
        }
        java.util.Iterator<T> it2 = c30807liC.AYXKKw.iterator();
        while (it2.hasNext()) {
            ((PrioritySelectionBean) it2.next()).setSelect(false);
        }
        c30807liC.valueOf.notifyDataSetChanged();
        c30807liC.gEmmrt.setPriorityType(AdvancedPriorityFeeType.Custom.getValue());
        c30807liC.gEmmrt.setValue(strValueOf);
        yHO<? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yho = c30807liC.AEQbTJ;
        if (yho != null) {
            yho.invoke("priority_fee_custom", DexTrackEventParameter.ButtonType.QUICK_BUTTON.getValue(), C56424yEw.KWHzl());
        }
        if (strValueOf.length() == 0) {
            c30807liC.gEmmrt.setValid(false);
        }
        Function1<? super PriorityParam, Unit> function12 = c30807liC.copydefault;
        if (function12 != null) {
            function12.invoke(c30807liC.gEmmrt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void values() {
        java.lang.String strAYXKKw;
        java.lang.String strValueOf = valueOf();
        if (this.KWHzl) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda1);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.keySet);
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, strValueOf, strAYXKKw, C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper);
    }

    public final C55001xbh AEQbTJ() {
        return copydefault().AkhnZx();
    }

    private final void isConnected() {
        KWHzl().setLayoutManager(new GridLayoutManager(getContext(), 3));
        KWHzl().addItemDecoration(new C33599mzW(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, false));
        this.valueOf.register(PrioritySelectionBean.class, new Application(AdvancedPresetCustomPrioritySelectView$initRecyclerView$2.INSTANCE));
        KWHzl().setAdapter(this.valueOf);
        this.valueOf.notifyDataSetChanged();
        C55009xbp c55009xbpFIwbmz = copydefault().fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.liC$Application */
    public static final class Application extends AbstractC25436iwg<PrioritySelectionBean, C21577hEn> {
        public Application(AdvancedPresetCustomPrioritySelectView$initRecyclerView$2 advancedPresetCustomPrioritySelectView$initRecyclerView$2) {
            super(advancedPresetCustomPrioritySelectView$initRecyclerView$2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C25435iwf<C21577hEn> c25435iwf, PrioritySelectionBean prioritySelectionBean) {
            Intrinsics.checkNotNullParameter(c25435iwf, "");
            Intrinsics.checkNotNullParameter(prioritySelectionBean, "");
            ((C21577hEn) c25435iwf.EZpvd()).copydefault.setText(prioritySelectionBean.getTitle());
            AppCompatTextView appCompatTextView = ((C21577hEn) c25435iwf.EZpvd()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(prioritySelectionBean.getValueDisplayFormat().length() > 0 ? 0 : 8);
            ((C21577hEn) c25435iwf.EZpvd()).AEQbTJ.setText(prioritySelectionBean.getValueDisplayFormat());
            ((C21577hEn) c25435iwf.EZpvd()).OLrzqt.setSelected(prioritySelectionBean.isSelect());
            ((C21577hEn) c25435iwf.EZpvd()).getRoot().setContentDescription(prioritySelectionBean.getContentDescription());
            android.view.View view = c25435iwf.itemView;
            final C30807liC c30807liC = C30807liC.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.liL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C30807liC.Application.KWHzl(c25435iwf, c30807liC, view2);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void KWHzl(C25435iwf c25435iwf, C30807liC c30807liC, android.view.View view) {
            java.lang.String str;
            int layoutPosition = c25435iwf.getLayoutPosition();
            java.util.Iterator it = c30807liC.AYXKKw.iterator();
            while (it.hasNext()) {
                ((PrioritySelectionBean) it.next()).setSelect(false);
            }
            java.lang.Object obj = c30807liC.AYXKKw.get(layoutPosition);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            PrioritySelectionBean prioritySelectionBean = (PrioritySelectionBean) obj;
            int priorityType = prioritySelectionBean.getPriorityType();
            if (priorityType != AdvancedPriorityFeeType.Market.getValue()) {
                if (priorityType == AdvancedPriorityFeeType.Turbo.getValue()) {
                    str = "priority_fee_turbo";
                } else {
                    str = priorityType == AdvancedPriorityFeeType.Fast.getValue() ? "priority_fee_fast" : "priority_fee_market";
                }
            }
            yHO yho = c30807liC.AEQbTJ;
            if (yho != null) {
                yho.invoke(str, DexTrackEventParameter.ButtonType.QUICK_BUTTON.getValue(), C56424yEw.KWHzl());
            }
            c30807liC.OLrzqt(prioritySelectionBean.getPriorityType(), prioritySelectionBean.getValue());
            prioritySelectionBean.setSelect(true);
            c30807liC.fARcdN();
            Function1 function1 = c30807liC.copydefault;
            if (function1 != null) {
                function1.invoke(c30807liC.gEmmrt);
            }
            c30807liC.EZpvd().notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fARcdN() {
        C55008xbo c55008xboCopydefault = copydefault();
        C55001xbh c55001xbhAkhnZx = c55008xboCopydefault.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setPlainNumericText("");
        }
        android.content.Context context = c55008xboCopydefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.OLrzqt(context, c55008xboCopydefault.AkhnZx());
        c55008xboCopydefault.clearFocus();
        OLrzqt(c55008xboCopydefault);
    }

    public final void setPriorityMessageStyle(java.lang.String str) {
        if (C23313hvq.KWHzl(str, this.AkhnZx) && C23313hvq.EZpvd(str, 0) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            OLrzqt(copydefault(), AhwBna(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.DdI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("tokenAmount", C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, this.AkhnZx, false, null, false, false, false, true, null, true, false, 351, null)))));
            this.gEmmrt.setPriorityType(AdvancedPriorityFeeType.Custom.getValue());
            if (str != null) {
                this.gEmmrt.setValue(str);
            }
            Function1<? super PriorityParam, Unit> function1 = this.copydefault;
            if (function1 != null) {
                function1.invoke(this.gEmmrt);
                return;
            }
            return;
        }
        if (C23313hvq.OLrzqt(str, this.DbNXlk) && C23313hvq.valueOf(str, this.EZpvd) && this.values == MemeTransactionSceneType.Market) {
            java.lang.String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("marketFee", pTB.formatLocalized$default(this.AkhnZx, null, 1, null)), C56390yDp.OLrzqt("turboFee", pTB.formatLocalized$default(this.DbNXlk, null, 1, null))));
            this.gEmmrt.setPriorityType(AdvancedPriorityFeeType.Custom.getValue());
            if (str != null) {
                this.gEmmrt.setValue(str);
            }
            setWarningStyle(copydefault(), AhwBna(), strKWHzl);
            Function1<? super PriorityParam, Unit> function12 = this.copydefault;
            if (function12 != null) {
                function12.invoke(this.gEmmrt);
                return;
            }
            return;
        }
        if (C23313hvq.OLrzqt(str, this.EZpvd)) {
            OLrzqt(copydefault(), AhwBna(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getMediaUri, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(this.EZpvd, null, 1, null)), C56390yDp.OLrzqt("symbol", this.fetchVPNInfo))));
            this.gEmmrt.setPriorityType(AdvancedPriorityFeeType.Custom.getValue());
            if (str != null) {
                this.gEmmrt.setValue(str);
            }
            Function1<? super PriorityParam, Unit> function13 = this.copydefault;
            if (function13 != null) {
                function13.invoke(this.gEmmrt);
                return;
            }
            return;
        }
        if (C23313hvq.KWHzl(str, 0)) {
            OLrzqt(copydefault(), AhwBna(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getIconUri, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("marketFee", pTB.formatLocalized$default(this.AkhnZx, null, 1, null)), C56390yDp.OLrzqt("turboFee", pTB.formatLocalized$default(this.DbNXlk, null, 1, null)))));
            this.gEmmrt.setPriorityType(AdvancedPriorityFeeType.Custom.getValue());
            this.gEmmrt.setValue("");
            Function1<? super PriorityParam, Unit> function14 = this.copydefault;
            if (function14 != null) {
                function14.invoke(this.gEmmrt);
                return;
            }
            return;
        }
        setNormalStyle$default(this, copydefault(), AhwBna(), null, 4, null);
        if (str != null && this.gEmmrt.getPriorityType() == AdvancedPriorityFeeType.Custom.getValue()) {
            this.gEmmrt.setValue(str);
        }
        Function1<? super PriorityParam, Unit> function15 = this.copydefault;
        if (function15 != null) {
            function15.invoke(this.gEmmrt);
        }
    }

    public static /* synthetic */ void setWarningStyle$default(C30807liC c30807liC, C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        c30807liC.setWarningStyle(c55008xbo, appCompatTextView, str);
    }

    public final void setWarningStyle(C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str) {
        android.widget.LinearLayout linearLayoutEjfBZ;
        if (c55008xbo != null && (linearLayoutEjfBZ = c55008xbo.ejfBZ()) != null) {
            linearLayoutEjfBZ.setBackgroundResource(C23274hvD.ActionBar.isConnected);
        }
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq));
        }
        if (appCompatTextView != null) {
            appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
        }
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
        this.gEmmrt.setValid(true);
    }

    public static /* synthetic */ void setErrorStyle$default(C30807liC c30807liC, C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        c30807liC.OLrzqt(c55008xbo, appCompatTextView, str);
    }

    private final void OLrzqt(final C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str) {
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fhUrPt));
        }
        if (appCompatTextView != null) {
            appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
        }
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
        if (c55008xbo != null) {
            c55008xbo.post(new java.lang.Runnable() { // from class: o.liK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C30807liC.EZpvd(c55008xbo);
                }
            });
        }
        this.gEmmrt.setValid(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(C55008xbo c55008xbo) {
        c55008xbo.ejfBZ().setBackgroundResource(C23274hvD.ActionBar.EZpvd);
    }

    public static /* synthetic */ void setNormalStyle$default(C30807liC c30807liC, C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        c30807liC.copydefault(c55008xbo, appCompatTextView, str);
    }

    private final void copydefault(C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str) {
        OLrzqt(c55008xbo);
        if (appCompatTextView != null) {
            appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
        this.gEmmrt.setValid(true);
    }

    private final void OLrzqt(C55008xbo c55008xbo) {
        android.widget.LinearLayout linearLayoutEjfBZ;
        C55001xbh c55001xbhAkhnZx;
        if (c55008xbo != null && (c55001xbhAkhnZx = c55008xbo.AkhnZx()) != null && c55001xbhAkhnZx.hasFocus()) {
            c55008xbo.ejfBZ().setBackgroundResource(C23274hvD.ActionBar.fARcdN);
        } else {
            if (c55008xbo == null || (linearLayoutEjfBZ = c55008xbo.ejfBZ()) == null) {
                return;
            }
            linearLayoutEjfBZ.setBackgroundResource(C57406yhn.Activity.AYXKKw);
        }
    }

    public final void OLrzqt(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt.setPriorityType(i);
        this.gEmmrt.setValue(str);
        this.gEmmrt.setValid(true);
    }

    private final int AEQbTJ(java.lang.String str, java.lang.String str2) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MemeChainType.MemeChainTypeEVM.getValue()) ? C33129mqd.AhwBna(str2) : C22370heA.OLrzqt(str2);
    }
}
