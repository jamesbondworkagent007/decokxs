package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringPriceRangePresenter;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vMR extends AbstractC49945uyC<AbstractC48387uPp, RecurringPriceRangePresenter> {
    public Function1<? super java.util.ArrayList<C55801xqm>, Unit> DbNXlk;
    public C52794wYp copydefault;
    public C52794wYp isConnected;
    public Function2<? super java.lang.String, ? super java.util.ArrayList<C55801xqm>, Unit> valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final int AYXKKw = C48033uCm.Activity.call;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.vMX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vMR.DbNXlk(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vMY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(vMR.AkhnZx(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vNa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vMR.fetchVPNInfo(this.EZpvd);
        }
    });
    public final StateListAnimator gEmmrt = new StateListAnimator();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vNc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vMR.djBIcL(this.KWHzl);
        }
    });
    public java.util.ArrayList<C55801xqm> values = new java.util.ArrayList<>();
    public java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>> AkhnZx = new LinkedHashMap();
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.vNf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vMR.isConnected(this.EZpvd);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function2<? super java.lang.String, ? super java.util.ArrayList<C55801xqm>, Unit> function2) {
        this.valueOf = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.util.ArrayList<C55801xqm>, Unit> function1) {
        this.DbNXlk = function1;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vMR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vMR$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ vMR newInstance$default(TaskDescription taskDescription, java.util.ArrayList arrayList, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                arrayList = null;
            }
            return taskDescription.copydefault(arrayList, function1);
        }

        public final vMR copydefault(java.util.ArrayList<SelectCoinData> arrayList, @NotNull Function1<? super java.util.ArrayList<C55801xqm>, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("selected_coins", arrayList);
            bundle.putBoolean("is_modification_mode", false);
            vMR vmr = new vMR();
            vmr.KWHzl(function1);
            vmr.setArguments(bundle);
            return vmr;
        }

        public final vMR EZpvd(@NotNull java.util.ArrayList<SelectCoinData> arrayList, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.String, ? super java.util.ArrayList<C55801xqm>, Unit> function2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("selected_coins", arrayList);
            bundle.putBoolean("is_modification_mode", true);
            bundle.putString("algo_id", str);
            vMR vmr = new vMR();
            vmr.AEQbTJ(function2);
            vmr.setArguments(bundle);
            return vmr;
        }
    }

    private final java.util.ArrayList<SelectCoinData> iwGUEr() {
        return (java.util.ArrayList) this.fetchVPNInfo.getValue();
    }

    public static final java.util.ArrayList DbNXlk(vMR vmr) {
        android.os.Bundle arguments = vmr.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("selected_coins") : null;
        if (serializable instanceof java.util.ArrayList) {
            return (java.util.ArrayList) serializable;
        }
        return null;
    }

    public final boolean fJNWhG() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean AkhnZx(vMR vmr) {
        android.os.Bundle arguments = vmr.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("is_modification_mode", false);
        }
        return false;
    }

    private final java.lang.String hDKMBd() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String fetchVPNInfo(vMR vmr) {
        android.os.Bundle arguments = vmr.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("algo_id") : null;
        return string == null ? "" : string;
    }

    public static final class StateListAnimator extends DiffUtil.ItemCallback<java.lang.Object> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof C55801xqm) && (obj2 instanceof C55801xqm)) {
                return Intrinsics.EZpvd((java.lang.Object) ((C55801xqm) obj).KWHzl(), (java.lang.Object) ((C55801xqm) obj2).KWHzl());
            }
            if (obj instanceof C55793xqe) {
                return obj2 instanceof C55793xqe;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof C55801xqm) && (obj2 instanceof C55801xqm)) {
                C55801xqm c55801xqm = (C55801xqm) obj;
                C55801xqm c55801xqm2 = (C55801xqm) obj2;
                if (Intrinsics.EZpvd((java.lang.Object) c55801xqm.AYXKKw(), (java.lang.Object) c55801xqm2.AYXKKw()) && Intrinsics.EZpvd((java.lang.Object) c55801xqm.valueOf(), (java.lang.Object) c55801xqm2.valueOf()) && Intrinsics.EZpvd((java.lang.Object) c55801xqm.copydefault(), (java.lang.Object) c55801xqm2.copydefault()) && c55801xqm.EZpvd() == c55801xqm2.EZpvd()) {
                    return true;
                }
            } else if ((obj instanceof C55793xqe) && (obj2 instanceof C55793xqe)) {
                return Intrinsics.EZpvd((java.lang.Object) ((C55793xqe) obj).KWHzl(), (java.lang.Object) ((C55793xqe) obj2).KWHzl());
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public java.lang.Object getChangePayload(java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof C55801xqm) && (obj2 instanceof C55801xqm)) {
                C55801xqm c55801xqm = (C55801xqm) obj;
                C55801xqm c55801xqm2 = (C55801xqm) obj2;
                if (!Intrinsics.EZpvd((java.lang.Object) c55801xqm.copydefault(), (java.lang.Object) c55801xqm2.copydefault()) && Intrinsics.EZpvd((java.lang.Object) c55801xqm.AYXKKw(), (java.lang.Object) c55801xqm2.AYXKKw()) && Intrinsics.EZpvd((java.lang.Object) c55801xqm.valueOf(), (java.lang.Object) c55801xqm2.valueOf()) && c55801xqm.EZpvd() == c55801xqm2.EZpvd()) {
                    return "price_update";
                }
            }
            return null;
        }
    }

    public static final C50027uzf djBIcL(vMR vmr) {
        return new C50027uzf(vmr.gEmmrt);
    }

    private final C50027uzf<java.lang.Object> getFieldNames() {
        return (C50027uzf) this.KWHzl.getValue();
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final C55793xqe isConnected() {
        return (C55793xqe) this.AhwBna.getValue();
    }

    public static final C55793xqe isConnected(vMR vmr) {
        java.lang.String strAYXKKw;
        if (vmr.fJNWhG()) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.scanPackages);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.init);
        }
        return new C55793xqe(strAYXKKw);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
        if (fJNWhG()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setExtras);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.UlpNxW);
        }
        wxq.setTitle(strAYXKKw);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setOKDSSize(52);
        wyf.setType(14);
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.viewCreated));
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        this.isConnected = wyf.AEQbTJ();
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        ejfBZ();
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new ActionBar(c52794wYpAEQbTJ2, 1000L, this));
        }
        this.copydefault = wyf.copydefault();
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        zsXlph();
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Application(c52794wYpCopydefault2, 1000L, this));
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ vMR AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vMR vmr) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = vmr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.fARcdN();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ vMR AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vMR vmr) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = vmr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismiss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vMR EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vMR vmr) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = vmr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.EZpvd.fJNWhG()) {
                    this.EZpvd.fIwbmz();
                } else {
                    this.EZpvd.getNewProxyInstance();
                }
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        java.util.ArrayList<C55801xqm> arrayListAEQbTJ = OLrzqt().AEQbTJ(iwGUEr());
        this.values = arrayListAEQbTJ;
        for (C55801xqm c55801xqm : arrayListAEQbTJ) {
            this.AkhnZx.put(c55801xqm.KWHzl(), new kotlin.Pair<>(c55801xqm.AYXKKw(), c55801xqm.valueOf()));
        }
        uzCIH();
    }

    private final void uzCIH() {
        android.content.Context context = getContext();
        if (context != null) {
            getFieldNames().register(C55801xqm.class, new C52553wPr(context, new yHT() { // from class: o.vMV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHT
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return vMR.KWHzl(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3, ((java.lang.Boolean) obj4).booleanValue());
                }
            }));
            getFieldNames().register(C55793xqe.class, new C52549wPn());
            RecyclerView recyclerView = values().KWHzl;
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(getFieldNames());
            C50027uzf.submitList$default(getFieldNames(), copydefault(), null, 2, null);
        }
        OLrzqt().KWHzl(this.values, new Function1() { // from class: o.vMZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vMR.AEQbTJ(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }, new yHO() { // from class: o.vMW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return vMR.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit KWHzl(vMR vmr, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.util.ArrayList<C55801xqm> arrayList = vmr.values;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (C55801xqm c55801xqmCopy$default : arrayList) {
            if (Intrinsics.EZpvd((java.lang.Object) c55801xqmCopy$default.KWHzl(), (java.lang.Object) str)) {
                c55801xqmCopy$default = C55801xqm.copy$default(c55801xqmCopy$default, null, null, null, null, str2, str3, z, 15, null);
            }
            arrayList2.add(c55801xqmCopy$default);
        }
        vmr.values = new java.util.ArrayList<>(arrayList2);
        vmr.ejfBZ();
        vmr.zsXlph();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vMR vmr, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        vmr.values = new java.util.ArrayList<>(arrayList);
        vmr.getFieldNames().setItems(vmr.copydefault());
        vmr.getFieldNames().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vMR vmr, int i, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i >= 0 && i < vmr.values.size()) {
            java.util.ArrayList<C55801xqm> arrayList = vmr.values;
            arrayList.set(i, C55801xqm.copy$default(arrayList.get(i), null, null, null, str2, null, null, false, 119, null));
            vmr.getFieldNames().setItems(vmr.copydefault());
            vmr.getFieldNames().notifyItemChanged(i, "price_update");
        }
        return Unit.INSTANCE;
    }

    public final java.util.List<java.lang.Object> copydefault() {
        return CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends C55793xqe>) CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.values), isConnected());
    }

    public final void ejfBZ() {
        boolean z = AuCTel() || !fJNWhG();
        C52794wYp c52794wYp = this.isConnected;
        if (c52794wYp != null) {
            c52794wYp.setEnabled(z);
        }
    }

    public final boolean AuCTel() {
        if (fJNWhG()) {
            java.util.ArrayList<C55801xqm> arrayList = this.values;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                for (C55801xqm c55801xqm : arrayList) {
                    kotlin.Pair<java.lang.String, java.lang.String> pair = this.AkhnZx.get(c55801xqm.KWHzl());
                    if (pair != null && (!Intrinsics.EZpvd((java.lang.Object) c55801xqm.AYXKKw(), (java.lang.Object) pair.getFirst()) || !Intrinsics.EZpvd((java.lang.Object) c55801xqm.valueOf(), (java.lang.Object) pair.getSecond()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        java.util.ArrayList<C55801xqm> arrayList2 = this.values;
        if (!(arrayList2 instanceof java.util.Collection) || !arrayList2.isEmpty()) {
            for (C55801xqm c55801xqm2 : arrayList2) {
                if (c55801xqm2.AYXKKw().length() > 0 || c55801xqm2.valueOf().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void zsXlph() {
        boolean z = (AuCTel() && OLrzqt().copydefault(this.values)) || !fJNWhG();
        C52794wYp c52794wYp = this.copydefault;
        if (c52794wYp != null) {
            c52794wYp.setEnabled(z);
        }
    }

    public final void fARcdN() {
        java.util.ArrayList arrayList;
        android.view.View viewFindFocus;
        values().KWHzl.clearFocus();
        android.view.View view = getView();
        if (view != null && (viewFindFocus = view.findFocus()) != null) {
            viewFindFocus.clearFocus();
        }
        if (fJNWhG()) {
            java.util.ArrayList<C55801xqm> arrayList2 = this.values;
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (C55801xqm c55801xqmCopy$default : arrayList2) {
                kotlin.Pair<java.lang.String, java.lang.String> pair = this.AkhnZx.get(c55801xqmCopy$default.KWHzl());
                if (pair != null) {
                    c55801xqmCopy$default = C55801xqm.copy$default(c55801xqmCopy$default, null, null, null, null, pair.getFirst(), pair.getSecond(), false, 15, null);
                }
                arrayList.add(c55801xqmCopy$default);
            }
        } else {
            java.util.ArrayList<C55801xqm> arrayList3 = this.values;
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
            java.util.Iterator<T> it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(C55801xqm.copy$default((C55801xqm) it.next(), null, null, null, null, "", "", false, 15, null));
            }
        }
        this.values = new java.util.ArrayList<>(arrayList);
        getFieldNames().setItems(copydefault());
        getFieldNames().notifyDataSetChanged();
        ejfBZ();
        zsXlph();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getNewProxyInstance() {
        if (!OLrzqt().copydefault(this.values)) {
            C50027uzf.submitList$default(getFieldNames(), copydefault(), null, 2, null);
            return;
        }
        java.util.ArrayList<C55801xqm> arrayList = this.values;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            C55801xqm c55801xqm = (C55801xqm) obj;
            if (c55801xqm.AYXKKw().length() > 0 || c55801xqm.valueOf().length() > 0) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
        Function1<? super java.util.ArrayList<C55801xqm>, Unit> function1 = this.DbNXlk;
        if (function1 != null) {
            function1.invoke(arrayList3);
        }
        dismiss();
    }

    public final void fIwbmz() {
        if (!OLrzqt().copydefault(this.values)) {
            C50027uzf.submitList$default(getFieldNames(), copydefault(), null, 2, null);
            return;
        }
        Function2<? super java.lang.String, ? super java.util.ArrayList<C55801xqm>, Unit> function2 = this.valueOf;
        if (function2 != null) {
            function2.invoke(hDKMBd(), this.values);
        }
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        OLrzqt().AEQbTJ();
    }
}
