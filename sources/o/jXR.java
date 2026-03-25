package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.history.domain.model.HistoryTokenChange;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.jXR;
import o.kLL;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public final class jXR extends kLH<C26277jYm, Activity> {
    public boolean AEQbTJ;
    public long AhwBna;
    public final InterfaceC26009jOo EZpvd;
    public jNY KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public Function1<? super java.lang.String, Unit> djBIcL;
    public Function0<Unit> gEmmrt;
    public Function1<? super java.util.List<TagWrapper>, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt(java.lang.String str) {
        return str == null ? "" : str;
    }

    public static final void OLrzqt(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = z;
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull jNY jny) {
        Intrinsics.checkNotNullParameter(jny, "");
        this.KWHzl = jny;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jXR(boolean z, boolean z2, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull InterfaceC26009jOo interfaceC26009jOo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull Function1<? super java.util.List<TagWrapper>, Unit> function12) {
        super(new C26267jYc(), fragmentManager, fragment, str);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(interfaceC26009jOo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = z;
        this.OLrzqt = z2;
        this.djBIcL = function1;
        this.EZpvd = interfaceC26009jOo;
        this.valueOf = function12;
        this.AhwBna = java.lang.System.currentTimeMillis();
        this.gEmmrt = new Function0() { // from class: o.jXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jXR.OLrzqt();
            }
        };
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jXR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFilterState$default(jXR jxr, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.jXV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jXR.AEQbTJ();
                }
            };
        }
        jxr.AEQbTJ(z, function0);
    }

    public static final class StateListAnimator {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    public static final class TaskDescription {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }

    public static final class ActionBar {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }
    }

    public final void EZpvd(boolean z) {
        this.copydefault = z;
        notifyItemRangeChanged(1, getItemCount(), TaskDescription.KWHzl);
    }

    public final void OLrzqt(boolean z) {
        this.OLrzqt = z;
        this.AhwBna = java.lang.System.currentTimeMillis();
        notifyItemRangeChanged(1, getItemCount(), StateListAnimator.EZpvd);
    }

    public final void valueOf() {
        notifyItemRangeChanged(1, getItemCount(), ActionBar.AEQbTJ);
    }

    public final void copydefault() {
        if (this.OLrzqt) {
            return;
        }
        this.AhwBna = java.lang.System.currentTimeMillis();
        notifyItemRangeChanged(1, getItemCount(), StateListAnimator.EZpvd);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<o.jYm>, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>] */
    @Override // o.kLH
    public void AEQbTJ(java.util.List<? extends C26277jYm> list, boolean z, Function0<Unit> function0) {
        super.AEQbTJ(list, z, function0);
        copydefault();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull java.util.List<? extends java.lang.Object> list) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        kLL item = getItem(i);
        if (viewHolder instanceof Activity) {
            final kLL.Activity activity = item instanceof kLL.Activity ? (kLL.Activity) item : null;
            if (activity == null) {
                return;
            }
            for (java.lang.Object obj : list) {
                if (Intrinsics.EZpvd(obj, StateListAnimator.EZpvd)) {
                    android.widget.TextView textView = ((Activity) viewHolder).OLrzqt().gEmmrt;
                    if (this.OLrzqt) {
                        strKWHzl = C25322iuY.OLrzqt.copydefault(((C26277jYm) activity.AEQbTJ()).gEmmrt());
                    } else {
                        strKWHzl = C28924kju.OLrzqt.KWHzl(((C26277jYm) activity.AEQbTJ()).gEmmrt(), this.AhwBna);
                    }
                    textView.setText(strKWHzl);
                } else if (Intrinsics.EZpvd(obj, TaskDescription.KWHzl)) {
                    ((Activity) viewHolder).OLrzqt((C26277jYm) activity.AEQbTJ());
                } else if (Intrinsics.EZpvd(obj, ActionBar.AEQbTJ)) {
                    final java.lang.String strAEQbTJ = C29694kyV.AEQbTJ.AEQbTJ(((C26277jYm) activity.AEQbTJ()).KWHzl());
                    java.lang.String strKWHzl2 = C31256lqb.KWHzl(C31256lqb.KWHzl(this.EZpvd.OLrzqt(((C26277jYm) activity.AEQbTJ()).AYXKKw()), (Function0<java.lang.String>) new Function0() { // from class: o.jXX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return jXR.OLrzqt(strAEQbTJ);
                        }
                    }), (Function0<java.lang.String>) new Function0() { // from class: o.jYa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return jXR.EZpvd(activity);
                        }
                    });
                    Activity activity2 = (Activity) viewHolder;
                    AppCompatTextView appCompatTextView = activity2.OLrzqt().AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                    C31258lqd.copydefault(appCompatTextView, strKWHzl2, this.EZpvd.AEQbTJ(((C26277jYm) activity.AEQbTJ()).AYXKKw()), C52761wXj.Activity.fdOvFl);
                    wYC wyc = activity2.OLrzqt().OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(wyc, "");
                    wyc.setVisibility(this.EZpvd.EZpvd(((C26277jYm) activity.AEQbTJ()).AYXKKw()) ? 0 : 8);
                }
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    public static final java.lang.String EZpvd(kLL.Activity activity) {
        return C25352ivB.formatAddress$default(((C26277jYm) activity.AEQbTJ()).AYXKKw(), 6, 4, null, 4, null);
    }

    public final class Activity extends kLN<C26277jYm> {
        public final InterfaceC26009jOo AEQbTJ;
        public final /* synthetic */ jXR EZpvd;
        public final C21527hCr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final java.lang.String copydefault(java.lang.String str) {
            return str == null ? "" : str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21527hCr OLrzqt() {
            return this.copydefault;
        }

        /* JADX INFO: renamed from: o.jXR$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0862Activity implements View.OnClickListener {
            public final /* synthetic */ jXR AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C26277jYm OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0862Activity(android.view.View view, long j, jXR jxr, C26277jYm c26277jYm) {
                this.EZpvd = view;
                this.copydefault = j;
                this.AEQbTJ = jxr;
                this.OLrzqt = c26277jYm;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.AEQbTJ.djBIcL.invoke(this.OLrzqt.AYXKKw());
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Activity(@NotNull jXR jxr, @NotNull C21527hCr c21527hCr, InterfaceC26009jOo interfaceC26009jOo) {
            Intrinsics.checkNotNullParameter(c21527hCr, "");
            Intrinsics.checkNotNullParameter(interfaceC26009jOo, "");
            this.EZpvd = jxr;
            ConstraintLayout root = c21527hCr.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.copydefault = c21527hCr;
            this.AEQbTJ = interfaceC26009jOo;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.kLN
        public void EZpvd(@NotNull final C26277jYm c26277jYm) {
            java.lang.String strKWHzl;
            Intrinsics.checkNotNullParameter(c26277jYm, "");
            C21527hCr c21527hCr = this.copydefault;
            final jXR jxr = this.EZpvd;
            AEQbTJ((HistoryTokenChange) CollectionsKt___CollectionsKt.firstOrNull(c26277jYm.EZpvd()), Intrinsics.EZpvd((java.lang.Object) c26277jYm.isConnected(), (java.lang.Object) "1"));
            AEQbTJ(c26277jYm);
            OLrzqt(c26277jYm);
            android.widget.TextView textView = c21527hCr.gEmmrt;
            if (!jxr.OLrzqt) {
                strKWHzl = C28924kju.OLrzqt.KWHzl(c26277jYm.gEmmrt(), jxr.AhwBna);
            } else {
                strKWHzl = C25322iuY.OLrzqt.copydefault(c26277jYm.gEmmrt());
            }
            textView.setText(strKWHzl);
            c21527hCr.djBIcL.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c26277jYm.copydefault(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
            C28067kNr.setTags$default(c21527hCr.KWHzl, c26277jYm.KWHzl(), false, false, null, null, 30, null);
            c21527hCr.KWHzl.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.jYd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return jXR.Activity.AEQbTJ(jxr, c26277jYm, view);
                }
            });
            java.util.List<TagWrapper> listKWHzl = c26277jYm.KWHzl();
            if ((listKWHzl instanceof java.util.Collection) && listKWHzl.isEmpty()) {
                c21527hCr.getRoot().setBackground(null);
            } else {
                java.util.Iterator<T> it = listKWHzl.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) it.next()).OLrzqt(), (java.lang.Object) "suspectedRatTradingAddress")) {
                        c21527hCr.getRoot().setBackgroundColor(ColorUtils.setAlphaComponent(C25382ivf.KWHzl(C52761wXj.Activity.fHqPtx), 89));
                        break;
                    }
                }
                c21527hCr.getRoot().setBackground(null);
            }
            ConstraintLayout root = c21527hCr.getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0862Activity(root, 1000L, jxr, c26277jYm));
        }

        public static final boolean AEQbTJ(jXR jxr, C26277jYm c26277jYm, android.view.View view) {
            jxr.valueOf.invoke(c26277jYm.KWHzl());
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void AEQbTJ(HistoryTokenChange historyTokenChange, boolean z) {
            java.lang.String strOLrzqt;
            int iTradeFallDefault$default;
            int iTradeFallBackground$default;
            int iTradeFallDefault$default2;
            java.lang.String strAYXKKw;
            java.lang.String strCopydefault;
            android.content.Context context = this.copydefault.getRoot().getContext();
            C21527hCr c21527hCr = this.copydefault;
            if (historyTokenChange == null || (strCopydefault = historyTokenChange.copydefault()) == null) {
                strOLrzqt = "--";
            } else {
                strOLrzqt = hSP.OLrzqt(strCopydefault, z ? Marker.ANY_NON_NULL_MARKER : "-");
                if (strOLrzqt == null) {
                }
            }
            android.widget.TextView textView = c21527hCr.values;
            textView.setText(strOLrzqt);
            if (z) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                Intrinsics.copydefault(context);
                iTradeFallDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
            } else {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                Intrinsics.copydefault(context);
                iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp2, context, 0.0f, 2, null);
            }
            textView.setTextColor(iTradeFallDefault$default);
            android.widget.TextView textView2 = c21527hCr.fetchVPNInfo;
            if (z) {
                iTradeFallBackground$default = C33512mxp.tradeRiseBackground$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
            } else {
                iTradeFallBackground$default = C33512mxp.tradeFallBackground$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
            }
            textView2.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iTradeFallBackground$default));
            if (z) {
                iTradeFallDefault$default2 = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
            } else {
                iTradeFallDefault$default2 = C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
            }
            textView2.setTextColor(iTradeFallDefault$default2);
            if (z) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getOnBackPressedDispatcher);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.onActivityResult);
            }
            textView2.setText(strAYXKKw);
        }

        public final void AEQbTJ(final C26277jYm c26277jYm) {
            final java.lang.String strAEQbTJ = C29694kyV.AEQbTJ.AEQbTJ(c26277jYm.KWHzl());
            java.lang.String strKWHzl = C31256lqb.KWHzl(C31256lqb.KWHzl(this.AEQbTJ.OLrzqt(c26277jYm.AYXKKw()), (Function0<java.lang.String>) new Function0() { // from class: o.jYb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jXR.Activity.copydefault(strAEQbTJ);
                }
            }), (Function0<java.lang.String>) new Function0() { // from class: o.jXZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jXR.Activity.copydefault(c26277jYm);
                }
            });
            AppCompatTextView appCompatTextView = this.copydefault.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            C31258lqd.copydefault(appCompatTextView, strKWHzl, this.EZpvd.EZpvd.AEQbTJ(c26277jYm.AYXKKw()), C52761wXj.Activity.fdOvFl);
            wYC wyc = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(this.AEQbTJ.EZpvd(c26277jYm.AYXKKw()) ? 0 : 8);
        }

        public static final java.lang.String copydefault(C26277jYm c26277jYm) {
            return C25352ivB.formatAddress$default(c26277jYm.AYXKKw(), 6, 4, null, 4, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OLrzqt(@NotNull C26277jYm c26277jYm) {
            java.lang.String scientificCurrency$default;
            Intrinsics.checkNotNullParameter(c26277jYm, "");
            android.widget.TextView textView = this.copydefault.valueOf;
            HistoryTokenChange historyTokenChange = (HistoryTokenChange) CollectionsKt___CollectionsKt.AkhnZx(c26277jYm.EZpvd(), 1);
            if (historyTokenChange != null) {
                jXR jxr = this.EZpvd;
                if (jxr.copydefault) {
                    if (C33129mqd.AEQbTJ(c26277jYm.copydefault(), "0")) {
                        java.lang.String numberICUWithPrecision$default = C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, java.lang.String.valueOf(C33129mqd.djBIcL(c26277jYm.AhwBna()) / C33129mqd.djBIcL(c26277jYm.OLrzqt())), null, 1, null);
                        jNY jny = jxr.KWHzl;
                        scientificCurrency$default = numberICUWithPrecision$default + " " + (jny != null ? jny.AEQbTJ() : null);
                    } else {
                        java.lang.String numberICUWithPrecision$default2 = C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, historyTokenChange.copydefault(), null, 1, null);
                        jNY jny2 = jxr.KWHzl;
                        scientificCurrency$default = numberICUWithPrecision$default2 + " " + (jny2 != null ? jny2.AEQbTJ() : null);
                    }
                } else {
                    scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c26277jYm.AhwBna(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null);
                }
                if (scientificCurrency$default == null) {
                    scientificCurrency$default = "--";
                }
            }
            textView.setText(scientificCurrency$default);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/ViewGroup;)Lo/kLN; */
    @Override // o.kLH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21527hCr c21527hCrAEQbTJ = C21527hCr.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21527hCrAEQbTJ, "");
        return new Activity(this, c21527hCrAEQbTJ, this.EZpvd);
    }

    @Override // o.kLH
    public RecyclerView.ViewHolder KWHzl(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        RecyclerView.ViewHolder viewHolderKWHzl = super.KWHzl(viewGroup);
        Intrinsics.copydefault(viewHolderKWHzl, "");
        kLA kla = (kLA) viewHolderKWHzl;
        EZpvd(kla.OLrzqt());
        return kla;
    }

    private final void EZpvd(C21465hAj c21465hAj) {
        C55173xeu c55173xeu = c21465hAj.OLrzqt;
        if (this.AEQbTJ) {
            c55173xeu.setEmptyTypeImage(7);
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.fmdvVn));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.scanPackages));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jXY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jXR.OLrzqt(this.copydefault, view);
                }
            });
            return;
        }
        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.fmdvVn));
        c55173xeu.setRetry("");
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jXW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jXR.OLrzqt(view);
            }
        });
    }

    public static final void OLrzqt(jXR jxr, android.view.View view) {
        jxr.gEmmrt.invoke();
    }
}
