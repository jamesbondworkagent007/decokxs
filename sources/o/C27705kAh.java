package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.trader.domain.model.Traders;
import com.okinc.business.market.features.trader.ui.TraderAction;
import com.okinc.business.market.features.trader.ui.model.TraderPnLFilter;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C27705kAh;
import o.C27711kAn;
import o.C32113mPz;
import o.C52761wXj;
import o.kLL;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.kAh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27705kAh extends kLH<Traders, Activity> {
    public final InterfaceC26009jOo AEQbTJ;
    public Function0<Unit> AYXKKw;
    public Function1<? super Traders, Unit> AhwBna;
    public final int EZpvd;
    public boolean KWHzl;
    public final java.lang.String OLrzqt;
    public boolean copydefault;
    public Function1<? super java.util.List<TagWrapper>, Unit> djBIcL;
    public final java.lang.String gEmmrt;
    public TraderPnLFilter valueOf;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = z;
        this.AYXKKw = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27705kAh(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull InterfaceC26009jOo interfaceC26009jOo, boolean z, @NotNull TraderPnLFilter traderPnLFilter, @NotNull java.lang.String str2, @NotNull Function1<? super Traders, Unit> function1, @NotNull Function1<? super java.util.List<TagWrapper>, Unit> function12, @NotNull java.lang.String str3) {
        super(new C27711kAn(), fragmentManager, fragment, str);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC26009jOo, "");
        Intrinsics.checkNotNullParameter(traderPnLFilter, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = interfaceC26009jOo;
        this.copydefault = z;
        this.valueOf = traderPnLFilter;
        this.OLrzqt = str2;
        this.AhwBna = function1;
        this.djBIcL = function12;
        this.gEmmrt = str3;
        this.EZpvd = 100;
        this.AYXKKw = new Function0() { // from class: o.kAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27705kAh.AEQbTJ();
            }
        };
    }

    /* JADX INFO: renamed from: o.kAh$StateListAnimator */
    public static final class StateListAnimator {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kAh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFilterState$default(C27705kAh c27705kAh, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.kAe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C27705kAh.KWHzl();
                }
            };
        }
        c27705kAh.copydefault(z, (Function0<Unit>) function0);
    }

    public final void EZpvd(boolean z) {
        this.copydefault = z;
        notifyItemRangeChanged(1, getItemCount(), StateListAnimator.OLrzqt);
    }

    public final void KWHzl(@NotNull TraderPnLFilter traderPnLFilter) {
        Intrinsics.checkNotNullParameter(traderPnLFilter, "");
        this.valueOf = traderPnLFilter;
        notifyItemRangeChanged(1, getItemCount(), StateListAnimator.OLrzqt);
    }

    @Override // o.kLH
    public kLN<Traders> OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21630hGm c21630hGmAEQbTJ = C21630hGm.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21630hGmAEQbTJ, "");
        return new Activity(this, c21630hGmAEQbTJ);
    }

    @Override // o.kLH
    public RecyclerView.ViewHolder KWHzl(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        RecyclerView.ViewHolder viewHolderKWHzl = super.KWHzl(viewGroup);
        Intrinsics.copydefault(viewHolderKWHzl, "");
        kLA kla = (kLA) viewHolderKWHzl;
        copydefault(kla.OLrzqt());
        return kla;
    }

    private final void copydefault(C21465hAj c21465hAj) {
        C55173xeu c55173xeu = c21465hAj.OLrzqt;
        if (this.KWHzl) {
            c55173xeu.setEmptyTypeImage(7);
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi21PlaybackInfo));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.sanrWj));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kAm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C27705kAh.KWHzl(this.AEQbTJ, view);
                }
            });
            return;
        }
        c55173xeu.setTitle("");
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.isCurrent));
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setRetry("");
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27705kAh.KWHzl(view);
            }
        });
    }

    public static final void KWHzl(C27705kAh c27705kAh, android.view.View view) {
        c27705kAh.AYXKKw.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        java.lang.Object item = getItem(i);
        kLL.Activity activity = item instanceof kLL.Activity ? (kLL.Activity) item : null;
        if (activity == null) {
            return;
        }
        if (!(viewHolder instanceof Activity) || !(!list.isEmpty())) {
            super.onBindViewHolder(viewHolder, i, list);
            return;
        }
        for (java.lang.Object obj : list) {
            if ((obj instanceof StateListAnimator) || Intrinsics.EZpvd(obj, C27711kAn.Application.KWHzl)) {
                ((Activity) viewHolder).copydefault((Traders) activity.AEQbTJ());
            } else if (obj instanceof C27711kAn.StateListAnimator) {
                ((Activity) viewHolder).OLrzqt((Traders) activity.AEQbTJ());
            }
        }
    }

    /* JADX INFO: renamed from: o.kAh$Activity */
    public final class Activity extends kLN<Traders> {
        public final C21630hGm KWHzl;
        public final /* synthetic */ C27705kAh OLrzqt;

        /* JADX INFO: renamed from: o.kAh$Activity$Activity, reason: collision with other inner class name */
        public final /* synthetic */ class C0865Activity {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TraderPnLFilter.values().length];
                try {
                    iArr[TraderPnLFilter.TOTAL.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TraderPnLFilter.REALIZED.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TraderPnLFilter.UNREALIZED.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final java.lang.String AEQbTJ(java.lang.String str) {
            return str == null ? "" : str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Activity(@NotNull C27705kAh c27705kAh, C21630hGm c21630hGm) {
            Intrinsics.checkNotNullParameter(c21630hGm, "");
            this.OLrzqt = c27705kAh;
            ConstraintLayout root = c21630hGm.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.KWHzl = c21630hGm;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.kLN
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull final Traders traders) {
            java.lang.String strGEmmrt;
            Intrinsics.checkNotNullParameter(traders, "");
            C21630hGm c21630hGm = this.KWHzl;
            final C27705kAh c27705kAh = this.OLrzqt;
            android.widget.TextView textView = c21630hGm.values;
            if (traders.EZpvd() > c27705kAh.EZpvd) {
                strGEmmrt = c27705kAh.EZpvd + Marker.ANY_NON_NULL_MARKER;
            } else {
                strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(traders.EZpvd()));
            }
            textView.setText(strGEmmrt);
            int iEZpvd = traders.EZpvd();
            if (1 <= iEZpvd && iEZpvd < 4) {
                textView.setTextAppearance(C52761wXj.LoaderManager.sSMYrx);
                textView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QKudOq));
            } else {
                textView.setTextAppearance(C32113mPz.Dialog.getNewProxyInstance);
                textView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            }
            final java.lang.String strAEQbTJ = C29694kyV.AEQbTJ.AEQbTJ(traders.AEQbTJ());
            java.lang.String strKWHzl = C31256lqb.KWHzl(C31256lqb.KWHzl(c27705kAh.AEQbTJ.OLrzqt(traders.isConnected()), (Function0<java.lang.String>) new Function0() { // from class: o.kAk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C27705kAh.Activity.AEQbTJ(strAEQbTJ);
                }
            }), (Function0<java.lang.String>) new Function0() { // from class: o.kAj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C27705kAh.Activity.EZpvd2(traders);
                }
            });
            android.widget.TextView textView2 = c21630hGm.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C31258lqd.copydefault(textView2, strKWHzl, c27705kAh.AEQbTJ.AEQbTJ(traders.isConnected()), C52761wXj.Activity.fdOvFl);
            wYC wyc = c21630hGm.copydefault;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(c27705kAh.AEQbTJ.EZpvd(traders.isConnected()) ? 0 : 8);
            C28067kNr.setTags$default(c21630hGm.OLrzqt, traders.AEQbTJ(), false, false, null, null, 30, null);
            c21630hGm.OLrzqt.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.kAq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return C27705kAh.Activity.OLrzqt(c27705kAh, traders, view);
                }
            });
            java.util.List<TagWrapper> listAEQbTJ = traders.AEQbTJ();
            if ((listAEQbTJ instanceof java.util.Collection) && listAEQbTJ.isEmpty()) {
                c21630hGm.getRoot().setBackground(null);
            } else {
                java.util.Iterator<T> it = listAEQbTJ.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) it.next()).OLrzqt(), (java.lang.Object) "suspectedRatTradingAddress")) {
                        c21630hGm.getRoot().setBackgroundColor(ColorUtils.setAlphaComponent(C25382ivf.KWHzl(C52761wXj.Activity.fHqPtx), 89));
                        break;
                    }
                }
                c21630hGm.getRoot().setBackground(null);
            }
            OLrzqt(traders);
            copydefault(traders);
            ConstraintLayout root = c21630hGm.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, c27705kAh, traders));
            android.widget.TextView textView3 = c21630hGm.DbNXlk;
            textView3.setOnClickListener(new TaskDescription(textView3, 1000L, c27705kAh, traders));
            C28067kNr c28067kNr = c21630hGm.OLrzqt;
            c28067kNr.setOnClickListener(new Application(c28067kNr, 1000L, c27705kAh, traders));
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public static final java.lang.String EZpvd2(Traders traders) {
            return C25352ivB.formatAddress$default(traders.isConnected(), 6, 4, null, 4, null);
        }

        public static final boolean OLrzqt(C27705kAh c27705kAh, Traders traders, android.view.View view) {
            c27705kAh.djBIcL.invoke(traders.AEQbTJ());
            return true;
        }

        /* JADX INFO: renamed from: o.kAh$Activity$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ Traders AEQbTJ;
            public final /* synthetic */ C27705kAh EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C27705kAh c27705kAh, Traders traders) {
                this.KWHzl = view;
                this.OLrzqt = j;
                this.EZpvd = c27705kAh;
                this.AEQbTJ = traders;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    C27698kAa.trackTraderAction$default(null, TraderAction.ADDRESS_CLICK, null, this.EZpvd.gEmmrt, 5, null);
                    this.EZpvd.AhwBna.invoke(this.AEQbTJ);
                }
            }
        }

        /* JADX INFO: renamed from: o.kAh$Activity$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C27705kAh KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ Traders copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, C27705kAh c27705kAh, Traders traders) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.KWHzl = c27705kAh;
                this.copydefault = traders;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.KWHzl.AhwBna.invoke(this.copydefault);
                }
            }
        }

        /* JADX INFO: renamed from: o.kAh$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C27705kAh KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ Traders copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C27705kAh c27705kAh, Traders traders) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.KWHzl = c27705kAh;
                this.copydefault = traders;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    C27698kAa.trackTraderAction$default(null, TraderAction.ADDRESS_CLICK, null, this.KWHzl.gEmmrt, 5, null);
                    this.KWHzl.AhwBna.invoke(this.copydefault);
                }
            }
        }

        public final void OLrzqt(@NotNull Traders traders) {
            Intrinsics.checkNotNullParameter(traders, "");
            android.widget.TextView textView = this.KWHzl.AhwBna;
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            java.lang.String strOLrzqt = traders.OLrzqt();
            RoundingMode roundingMode = RoundingMode.DOWN;
            textView.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strOLrzqt, true, roundingMode, true, false, false, false, null, false, false, 496, null));
            this.KWHzl.AkhnZx.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, traders.djBIcL(), true, roundingMode, true, false, false, false, null, false, false, 496, null));
        }

        public final void copydefault(@NotNull Traders traders) {
            java.lang.String strAYXKKw;
            java.lang.String strValues;
            int iTradeFallDefault$default;
            Intrinsics.checkNotNullParameter(traders, "");
            int i = C0865Activity.EZpvd[this.OLrzqt.valueOf.ordinal()];
            if (i == 1) {
                strAYXKKw = traders.AYXKKw();
                strValues = traders.values();
            } else if (i == 2) {
                strAYXKKw = traders.gEmmrt();
                strValues = traders.valueOf();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                strAYXKKw = traders.fetchVPNInfo();
                strValues = traders.AkhnZx();
            }
            boolean z = C33129mqd.djBIcL(strAYXKKw) > 0.0f;
            android.widget.TextView textView = this.KWHzl.djBIcL;
            C27705kAh c27705kAh = this.OLrzqt;
            textView.setText(kLY.OLrzqt(c27705kAh.copydefault, strAYXKKw, traders.KWHzl(), c27705kAh.OLrzqt));
            if (C33129mqd.djBIcL(strAYXKKw) == 0.0f) {
                iTradeFallDefault$default = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
            } else if (z) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iTradeFallDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
            } else {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
            }
            textView.setTextColor(iTradeFallDefault$default);
            this.KWHzl.AYXKKw.setText(kLY.formatPercentage$default(strValues, DisplaySign.EXCEPT_ZERO, false, null, null, 14, null));
        }
    }
}
