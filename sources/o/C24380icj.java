package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.collection.ArrayMapKt;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.PriorityParam;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.dexui.main.swap.mememode.widget.PresetCustomPrioritySelectView$initRecyclerView$2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C24380icj;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.icj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24380icj extends LinearLayoutCompat {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public Function1<? super PriorityParam, Unit> AEQbTJ;
    public java.lang.String AYXKKw;
    public C43316rmw AhwBna;
    public final java.util.ArrayList<PrioritySelectionBean> AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public boolean OLrzqt;
    public boolean copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public java.lang.String fIwbmz;
    public MemeTransactionSceneType fJNWhG;
    public PriorityParam fetchVPNInfo;
    public java.lang.String gEmmrt;
    public final InterfaceC56387yDm hDKMBd;
    public java.lang.String isConnected;
    public java.lang.String valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43316rmw KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeValueCallback(Function1<? super PriorityParam, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityAdapter(@NotNull C43316rmw c43316rmw) {
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        this.AhwBna = c43316rmw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdatingProgrammatically(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24380icj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.icm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24380icj.fARcdN(this.copydefault);
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.ico
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24380icj.getFieldNames(this.EZpvd);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.icr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24380icj.fIwbmz(this.AEQbTJ);
            }
        });
        this.hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.ics
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24380icj.hDKMBd(this.AEQbTJ);
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.icp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24380icj.iwGUEr(this.OLrzqt);
            }
        });
        this.fetchVPNInfo = new PriorityParam((java.lang.String) null, PriorityFeeType.PriorityMarket.getValue(), false, 5, (DefaultConstructorMarker) null);
        this.AkhnZx = new java.util.ArrayList<>();
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.icq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24380icj.AuCTel(this.KWHzl);
            }
        });
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.icu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24380icj.getNewProxyInstance(this.KWHzl);
            }
        });
        this.values = "";
        this.isConnected = "";
        this.AYXKKw = "";
        this.gEmmrt = "";
        this.valueOf = "";
        this.fIwbmz = "";
        this.AhwBna = new C43316rmw();
        this.fJNWhG = MemeTransactionSceneType.Market;
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.fMBJsc, (android.view.ViewGroup) this, true);
        fIwbmz();
        ejfBZ();
    }

    /* JADX INFO: renamed from: o.icj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.icj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final RecyclerView djBIcL() {
        java.lang.Object value = this.DbNXlk.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (RecyclerView) value;
    }

    public static final RecyclerView fARcdN(C24380icj c24380icj) {
        return (RecyclerView) c24380icj.findViewById(C23274hvD.Application.Api26Impl);
    }

    public static final AppCompatTextView getFieldNames(C24380icj c24380icj) {
        return (AppCompatTextView) c24380icj.findViewById(C23274hvD.Application.getApplyableNightMode);
    }

    private final AppCompatTextView isConnected() {
        java.lang.Object value = this.ejfBZ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final LinearLayoutCompat fIwbmz(C24380icj c24380icj) {
        return (LinearLayoutCompat) c24380icj.findViewById(C23274hvD.Application.DcMfJKOmnske);
    }

    private final LinearLayoutCompat gEmmrt() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (LinearLayoutCompat) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C55320xhi DbNXlk() {
        java.lang.Object value = this.hDKMBd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C55320xhi) value;
    }

    public static final C55320xhi hDKMBd(C24380icj c24380icj) {
        return (C55320xhi) c24380icj.findViewById(C23274hvD.Application.DrawableContainerDrawableContainerState);
    }

    private final AppCompatTextView fetchVPNInfo() {
        java.lang.Object value = this.fARcdN.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView iwGUEr(C24380icj c24380icj) {
        return (AppCompatTextView) c24380icj.findViewById(C23274hvD.Application.wrap);
    }

    private final C55008xbo AYXKKw() {
        java.lang.Object value = this.djBIcL.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C55008xbo) value;
    }

    public static final C55008xbo AuCTel(C24380icj c24380icj) {
        return (C55008xbo) c24380icj.findViewById(C23274hvD.Application.sendQueue);
    }

    private final AppCompatTextView AkhnZx() {
        java.lang.Object value = this.AuCTel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView getNewProxyInstance(C24380icj c24380icj) {
        return (AppCompatTextView) c24380icj.findViewById(C23274hvD.Application.onDrawerSlide);
    }

    private final void fIwbmz() {
        C55001xbh c55001xbhAkhnZx = AYXKKw().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setShowThousandsSeparator(true);
        }
        android.widget.LinearLayout linearLayoutAuCTel = AYXKKw().AuCTel();
        if (linearLayoutAuCTel != null) {
            linearLayoutAuCTel.setMinimumWidth(0);
        }
        fARcdN();
    }

    public final void setTotalFeeView(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        gEmmrt().setVisibility(0);
        DbNXlk().setText(str);
        DbNXlk().setShowUnderline(z);
        fetchVPNInfo().setText(str2);
    }

    public final void setTotalFeeShowDetailDialog(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C55320xhi c55320xhiDbNXlk = DbNXlk();
        c55320xhiDbNXlk.setOnClickListener(new TaskDescription(c55320xhiDbNXlk, 1000L, this, function0));
    }

    public final void setData(@NotNull java.lang.String str, @NotNull java.util.List<PrioritySelectionBean> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z, @NotNull MemeTransactionSceneType memeTransactionSceneType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(memeTransactionSceneType, "");
        this.copydefault = z;
        this.valueOf = str;
        this.AYXKKw = str2;
        this.gEmmrt = str3;
        this.values = str4;
        this.isConnected = str5;
        this.fJNWhG = memeTransactionSceneType;
        this.fIwbmz = str7;
        this.AkhnZx.clear();
        this.AkhnZx.addAll(list);
        this.AhwBna.setItems(this.AkhnZx);
        this.AhwBna.notifyDataSetChanged();
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
        OLrzqt(i, str6);
        this.OLrzqt = true;
        if (i == PriorityFeeType.PriorityCustom.getValue()) {
            AYXKKw().setVisibility(0);
            AYXKKw().setText(str6);
        } else {
            AYXKKw().setText("");
        }
        this.OLrzqt = false;
        C55009xbp c55009xbpFIwbmz = AYXKKw().fIwbmz();
        if (c55009xbpFIwbmz != null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.UJEglR, (android.view.ViewGroup) null);
            ((AppCompatTextView) viewInflate.findViewById(C23274hvD.Application.getPaint)).setText(str7);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            c55009xbpFIwbmz.EZpvd(viewInflate);
        }
        C55001xbh c55001xbhAkhnZx = AYXKKw().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(KWHzl(str, str8));
        }
        C55008xbo c55008xboAYXKKw = AYXKKw();
        C23271hvA c23271hvA = C23271hvA.copydefault;
        c55008xboAYXKKw.setHintText(C23271hvA.formatTokenCode$default(c23271hvA, str3, true, null, false, null, null, 30, null) + " ~ " + C23271hvA.formatTokenCode$default(c23271hvA, str2, true, null, false, null, null, 30, null));
        AuCTel();
    }

    /* JADX INFO: renamed from: o.icj$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C24380icj KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C24380icj c24380icj) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c24380icj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.KWHzl.fJNWhG == MemeTransactionSceneType.Market) {
                    this.KWHzl.valueOf();
                } else {
                    this.KWHzl.copydefault();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.icj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C24380icj EZpvd;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C24380icj c24380icj, Function0 function0) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c24380icj;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.EZpvd.DbNXlk().AEQbTJ()) {
                    this.KWHzl.invoke();
                }
            }
        }
    }

    private final void AuCTel() {
        isConnected().setText(values());
    }

    private final java.lang.String values() {
        if (this.fJNWhG == MemeTransactionSceneType.Market) {
            if (this.copydefault && !Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) MemeChainType.MemeChainTypeSol.getValue())) {
                return C33070mpX.AYXKKw(C23274hvD.Fragment.onViewDetachedFromWindow);
            }
            return C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatApi21Builder);
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.access100);
    }

    private final void ejfBZ() {
        AppCompatTextView appCompatTextViewIsConnected = isConnected();
        appCompatTextViewIsConnected.setOnClickListener(new ActionBar(appCompatTextViewIsConnected, 1000L, this));
        C55001xbh c55001xbhAkhnZx = AYXKKw().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ick
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C24380icj.OLrzqt(this.OLrzqt, view, z);
                }
            });
        }
    }

    public static final void OLrzqt(C24380icj c24380icj, android.view.View view, boolean z) {
        java.lang.String strValueOf;
        C55001xbh c55001xbhAkhnZx = c24380icj.AYXKKw().AkhnZx();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null))) {
            C55001xbh c55001xbhAkhnZx2 = c24380icj.AYXKKw().AkhnZx();
            strValueOf = java.lang.String.valueOf(c55001xbhAkhnZx2 != null ? c55001xbhAkhnZx2.isConnected() : null);
        } else {
            strValueOf = "";
        }
        if (!z) {
            c24380icj.AYXKKw().clearFocus();
            c24380icj.setPriorityMessageStyle(strValueOf);
            return;
        }
        java.util.Iterator<T> it = c24380icj.AkhnZx.iterator();
        while (it.hasNext()) {
            ((PrioritySelectionBean) it.next()).setSelect(false);
        }
        c24380icj.AhwBna.notifyDataSetChanged();
        c24380icj.fetchVPNInfo.setPriorityType(PriorityFeeType.PriorityCustom.getValue());
        c24380icj.fetchVPNInfo.setValue(strValueOf);
        Function1<? super PriorityParam, Unit> function1 = c24380icj.AEQbTJ;
        if (function1 != null) {
            function1.invoke(c24380icj.fetchVPNInfo);
        }
        c24380icj.AEQbTJ();
        c24380icj.AkhnZx().setTextColor(ContextCompat.getColor(c24380icj.getContext(), C52761wXj.Activity.QwvEab));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        super.onAttachedToWindow();
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(getContext());
        if (activityOLrzqt == null || (lifecycleOwner = ViewTreeLifecycleOwner.get(this)) == null) {
            return;
        }
        C59541ziw.EZpvd(activityOLrzqt, lifecycleOwner, new InterfaceC59496ziD() { // from class: o.icl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                C24380icj.EZpvd(this.AEQbTJ, z);
            }
        });
    }

    public static final void EZpvd(C24380icj c24380icj, boolean z) {
        C55001xbh c55001xbhAkhnZx = c24380icj.AYXKKw().AkhnZx();
        if (c55001xbhAkhnZx == null || !c55001xbhAkhnZx.hasFocus()) {
            return;
        }
        if (z) {
            c24380icj.AEQbTJ();
        } else {
            c55001xbhAkhnZx.clearFocus();
        }
    }

    public final void AEQbTJ() {
        AkhnZx().post(new java.lang.Runnable() { // from class: o.icv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24380icj.fJNWhG(this.OLrzqt);
            }
        });
    }

    public static final void fJNWhG(C24380icj c24380icj) {
        c24380icj.AkhnZx().requestRectangleOnScreen(new android.graphics.Rect(0, 0, c24380icj.AkhnZx().getWidth(), c24380icj.AkhnZx().getHeight()), true);
    }

    public final void copydefault() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, C33070mpX.AYXKKw(C23274hvD.Fragment.getRating), C33070mpX.AYXKKw(C23274hvD.Fragment.getString), C23274hvD.Fragment.OcIXYQ);
    }

    public final void valueOf() {
        java.lang.String strAYXKKw;
        java.lang.String strValues = values();
        if (this.copydefault) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda1);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getString);
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, strValues, strAYXKKw, C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper);
    }

    public final C55001xbh EZpvd() {
        return AYXKKw().AkhnZx();
    }

    private final void fARcdN() {
        djBIcL().setLayoutManager(new GridLayoutManager(getContext(), 3));
        djBIcL().addItemDecoration(new C33599mzW(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, false));
        this.AhwBna.register(PrioritySelectionBean.class, new Application(PresetCustomPrioritySelectView$initRecyclerView$2.INSTANCE));
        djBIcL().setAdapter(this.AhwBna);
        this.AhwBna.notifyDataSetChanged();
        C55009xbp c55009xbpFIwbmz = AYXKKw().fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.icj$Application */
    public static final class Application extends AbstractC25436iwg<PrioritySelectionBean, C21577hEn> {
        public Application(PresetCustomPrioritySelectView$initRecyclerView$2 presetCustomPrioritySelectView$initRecyclerView$2) {
            super(presetCustomPrioritySelectView$initRecyclerView$2);
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
            android.view.View view = c25435iwf.itemView;
            final C24380icj c24380icj = C24380icj.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.icx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C24380icj.Application.AEQbTJ(c25435iwf, c24380icj, view2);
                }
            });
        }

        public static final void AEQbTJ(C25435iwf c25435iwf, C24380icj c24380icj, android.view.View view) {
            int layoutPosition = c25435iwf.getLayoutPosition();
            java.util.Iterator it = c24380icj.AkhnZx.iterator();
            while (it.hasNext()) {
                ((PrioritySelectionBean) it.next()).setSelect(false);
            }
            java.lang.Object obj = c24380icj.AkhnZx.get(layoutPosition);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            PrioritySelectionBean prioritySelectionBean = (PrioritySelectionBean) obj;
            c24380icj.OLrzqt(prioritySelectionBean.getPriorityType(), prioritySelectionBean.getValue());
            prioritySelectionBean.setSelect(true);
            c24380icj.AhwBna();
            Function1 function1 = c24380icj.AEQbTJ;
            if (function1 != null) {
                function1.invoke(c24380icj.fetchVPNInfo);
            }
            c24380icj.KWHzl().notifyDataSetChanged();
            c24380icj.setPriorityMessageStyle("");
        }
    }

    public final void AhwBna() {
        C55001xbh c55001xbhAkhnZx = AYXKKw().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setPlainNumericText("");
        }
        ((PrioritySelectionBean) CollectionsKt___CollectionsKt.AubY(this.AkhnZx)).setValue("");
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.OLrzqt(context, AYXKKw().AkhnZx());
        AYXKKw().clearFocus();
    }

    public final void setPriorityMessageStyle(java.lang.String str) {
        C55001xbh c55001xbhAkhnZx;
        if (C23313hvq.KWHzl(str, this.gEmmrt) && C23313hvq.EZpvd(str, 0) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            setErrorStyle(AYXKKw(), AkhnZx(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.DdI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("tokenAmount", pTB.formatLocalized$default(this.gEmmrt, null, 1, null)))));
            this.fetchVPNInfo.setPriorityType(PriorityFeeType.PriorityCustom.getValue());
            this.fetchVPNInfo.setValue("");
            Function1<? super PriorityParam, Unit> function1 = this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(this.fetchVPNInfo);
                return;
            }
            return;
        }
        if (C23313hvq.OLrzqt(str, this.AYXKKw)) {
            setErrorStyle(AYXKKw(), AkhnZx(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getMediaUri, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(this.AYXKKw, null, 1, null)), C56390yDp.OLrzqt("symbol", this.fIwbmz))));
            this.fetchVPNInfo.setPriorityType(PriorityFeeType.PriorityCustom.getValue());
            this.fetchVPNInfo.setValue("");
            Function1<? super PriorityParam, Unit> function12 = this.AEQbTJ;
            if (function12 != null) {
                function12.invoke(this.fetchVPNInfo);
                return;
            }
            return;
        }
        if (C23313hvq.KWHzl(str, 0)) {
            setErrorStyle(AYXKKw(), AkhnZx(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getIconUri, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("marketFee", pTB.formatLocalized$default(this.values, null, 1, null)), C56390yDp.OLrzqt("turboFee", pTB.formatLocalized$default(this.isConnected, null, 1, null)))));
            this.fetchVPNInfo.setPriorityType(PriorityFeeType.PriorityCustom.getValue());
            this.fetchVPNInfo.setValue("");
            Function1<? super PriorityParam, Unit> function13 = this.AEQbTJ;
            if (function13 != null) {
                function13.invoke(this.fetchVPNInfo);
                return;
            }
            return;
        }
        if (C23313hvq.copydefault(str, 0) && (c55001xbhAkhnZx = AYXKKw().AkhnZx()) != null && (!c55001xbhAkhnZx.isFocused()) && this.fetchVPNInfo.getPriorityType() == PriorityFeeType.PriorityCustom.getValue()) {
            setErrorStyle(AYXKKw(), AkhnZx(), C33070mpX.AYXKKw(C23274hvD.Fragment.rate));
            this.fetchVPNInfo.setValue("");
            Function1<? super PriorityParam, Unit> function14 = this.AEQbTJ;
            if (function14 != null) {
                function14.invoke(this.fetchVPNInfo);
                return;
            }
            return;
        }
        setNormalStyle$default(this, AYXKKw(), AkhnZx(), null, 4, null);
        if (str != null && this.fetchVPNInfo.getPriorityType() == PriorityFeeType.PriorityCustom.getValue()) {
            this.fetchVPNInfo.setValue(str);
        }
        Function1<? super PriorityParam, Unit> function15 = this.AEQbTJ;
        if (function15 != null) {
            function15.invoke(this.fetchVPNInfo);
        }
    }

    public static /* synthetic */ void setErrorStyle$default(C24380icj c24380icj, C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        c24380icj.setErrorStyle(c55008xbo, appCompatTextView, str);
    }

    public final void setErrorStyle(final C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str) {
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
            c55008xbo.post(new java.lang.Runnable() { // from class: o.icn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C24380icj.KWHzl(c55008xbo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(C55008xbo c55008xbo) {
        c55008xbo.ejfBZ().setBackgroundResource(C23274hvD.ActionBar.EZpvd);
    }

    public static /* synthetic */ void setNormalStyle$default(C24380icj c24380icj, C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        c24380icj.setNormalStyle(c55008xbo, appCompatTextView, str);
    }

    public final void setNormalStyle(C55008xbo c55008xbo, AppCompatTextView appCompatTextView, java.lang.String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(int i, java.lang.String str) {
        this.fetchVPNInfo.setPriorityType(i);
        this.fetchVPNInfo.setValue(str);
    }

    public final int KWHzl(java.lang.String str, java.lang.String str2) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MemeChainType.MemeChainTypeEVM.getValue()) ? C33129mqd.AhwBna(str2) : C22370heA.OLrzqt(str2);
    }
}
