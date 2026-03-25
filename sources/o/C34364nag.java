package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.dexkline.market.features.history.domian.models.HistoryTokenChange;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C34364nag;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC34593ney;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.nag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34364nag extends AbstractC34586neq<C34371nan, StateListAnimator> {
    public boolean AEQbTJ;
    public Function1<? super java.util.List<TagWrapper>, Unit> AYXKKw;
    public Function0<Unit> AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public final mWN OLrzqt;
    public mWC copydefault;
    public Function1<? super java.lang.String, Unit> djBIcL;
    public long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull mWC mwc) {
        Intrinsics.checkNotNullParameter(mwc, "");
        this.copydefault = mwc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = z;
        this.AhwBna = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34364nag(boolean z, boolean z2, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull mWN mwn, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull Function1<? super java.util.List<TagWrapper>, Unit> function12) {
        super(new C34368nak(), fragmentManager, fragment, str);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(mwn, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.EZpvd = z;
        this.AEQbTJ = z2;
        this.djBIcL = function1;
        this.OLrzqt = mwn;
        this.AYXKKw = function12;
        this.valueOf = java.lang.System.currentTimeMillis();
        this.AhwBna = new Function0() { // from class: o.nad
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34364nag.valueOf();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nag */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFilterState$default(C34364nag c34364nag, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.naf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34364nag.djBIcL();
                }
            };
        }
        c34364nag.copydefault(z, (Function0<Unit>) function0);
    }

    /* JADX INFO: renamed from: o.nag$Activity */
    public static final class Activity {
        public static final Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.nag$Application */
    public static final class Application {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.nag$TaskDescription */
    public static final class TaskDescription {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    public final void AEQbTJ(boolean z) {
        this.EZpvd = z;
        notifyItemRangeChanged(1, getItemCount(), Application.KWHzl);
    }

    public final void EZpvd(boolean z) {
        this.AEQbTJ = z;
        this.valueOf = java.lang.System.currentTimeMillis();
        notifyItemRangeChanged(1, getItemCount(), Activity.EZpvd);
    }

    public final void copydefault() {
        notifyItemRangeChanged(1, getItemCount(), TaskDescription.EZpvd);
    }

    public final void OLrzqt() {
        if (this.AEQbTJ) {
            return;
        }
        this.valueOf = java.lang.System.currentTimeMillis();
        notifyItemRangeChanged(1, getItemCount(), Activity.EZpvd);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<o.nan>, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>] */
    @Override // o.AbstractC34586neq
    public void AEQbTJ(java.util.List<? extends C34371nan> list, boolean z, Function0<Unit> function0) {
        super.AEQbTJ(list, z, function0);
        OLrzqt();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull java.util.List<? extends java.lang.Object> list) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        InterfaceC34593ney item = getItem(i);
        if (viewHolder instanceof StateListAnimator) {
            InterfaceC34593ney.Application application = item instanceof InterfaceC34593ney.Application ? (InterfaceC34593ney.Application) item : null;
            if (application == null) {
                return;
            }
            for (java.lang.Object obj : list) {
                if (Intrinsics.EZpvd(obj, Activity.EZpvd)) {
                    android.widget.TextView textView = ((StateListAnimator) viewHolder).KWHzl().gEmmrt;
                    if (this.AEQbTJ) {
                        strOLrzqt = mUK.AEQbTJ.OLrzqt(((C34371nan) application.copydefault()).djBIcL());
                    } else {
                        strOLrzqt = C34376nas.AEQbTJ.OLrzqt(((C34371nan) application.copydefault()).djBIcL(), this.valueOf);
                    }
                    textView.setText(strOLrzqt);
                } else if (Intrinsics.EZpvd(obj, Application.KWHzl)) {
                    ((StateListAnimator) viewHolder).KWHzl((C34371nan) application.copydefault());
                } else if (Intrinsics.EZpvd(obj, TaskDescription.EZpvd)) {
                    java.lang.String strAEQbTJ = C34498ndH.OLrzqt.AEQbTJ(((C34371nan) application.copydefault()).EZpvd());
                    java.lang.String strEZpvd = this.OLrzqt.EZpvd(((C34371nan) application.copydefault()).AYXKKw());
                    if (strEZpvd != null) {
                        strAEQbTJ = strEZpvd;
                    } else if (strAEQbTJ.length() == 0) {
                        strAEQbTJ = mUO.formatAddress$default(((C34371nan) application.copydefault()).AYXKKw(), 4, 4, null, 4, null);
                    }
                    StateListAnimator stateListAnimator = (StateListAnimator) viewHolder;
                    stateListAnimator.KWHzl().AhwBna.setText(strAEQbTJ);
                    wYC wyc = stateListAnimator.KWHzl().KWHzl;
                    Intrinsics.checkNotNullExpressionValue(wyc, "");
                    wyc.setVisibility(this.OLrzqt.AEQbTJ(((C34371nan) application.copydefault()).AYXKKw()) ? 0 : 8);
                }
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/ViewGroup;)Lo/nev; */
    @Override // o.AbstractC34586neq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36070oOd c36070oOdOLrzqt = C36070oOd.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36070oOdOLrzqt, "");
        return new StateListAnimator(this, c36070oOdOLrzqt, this.OLrzqt);
    }

    /* JADX INFO: renamed from: o.nag$StateListAnimator */
    public final class StateListAnimator extends AbstractC34591nev<C34371nan> {
        public final /* synthetic */ C34364nag EZpvd;
        public final C36070oOd OLrzqt;
        public final mWN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36070oOd KWHzl() {
            return this.OLrzqt;
        }

        /* JADX INFO: renamed from: o.nag$StateListAnimator$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ C34371nan AEQbTJ;
            public final /* synthetic */ C34364nag KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C34364nag c34364nag, C34371nan c34371nan) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.KWHzl = c34364nag;
                this.AEQbTJ = c34371nan;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.KWHzl.djBIcL.invoke(this.AEQbTJ.AYXKKw());
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator(@NotNull C34364nag c34364nag, @NotNull C36070oOd c36070oOd, mWN mwn) {
            Intrinsics.checkNotNullParameter(c36070oOd, "");
            Intrinsics.checkNotNullParameter(mwn, "");
            this.EZpvd = c34364nag;
            ConstraintLayout root = c36070oOd.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.OLrzqt = c36070oOd;
            this.copydefault = mwn;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.AbstractC34591nev
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull final C34371nan c34371nan) {
            java.lang.String strOLrzqt;
            Intrinsics.checkNotNullParameter(c34371nan, "");
            C36070oOd c36070oOd = this.OLrzqt;
            final C34364nag c34364nag = this.EZpvd;
            copydefault((HistoryTokenChange) CollectionsKt___CollectionsKt.firstOrNull(c34371nan.OLrzqt()), Intrinsics.EZpvd((java.lang.Object) c34371nan.gEmmrt(), (java.lang.Object) "1"));
            AEQbTJ(c34371nan);
            KWHzl(c34371nan);
            android.widget.TextView textView = c36070oOd.gEmmrt;
            if (!c34364nag.AEQbTJ) {
                strOLrzqt = C34376nas.AEQbTJ.OLrzqt(c34371nan.djBIcL(), c34364nag.valueOf);
            } else {
                strOLrzqt = mUK.AEQbTJ.OLrzqt(c34371nan.djBIcL());
            }
            textView.setText(strOLrzqt);
            c36070oOd.valueOf.setText(mRJ.AEQbTJ.OLrzqt(c34371nan.KWHzl(), (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false));
            C34603nfH.setTags$default(c36070oOd.AEQbTJ, C34604nfI.Companion.OLrzqt(c34371nan.EZpvd(), false, this.OLrzqt.getRoot().getContext()), null, 2, null);
            c36070oOd.AEQbTJ.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nah
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return C34364nag.StateListAnimator.EZpvd(c34364nag, c34371nan, view);
                }
            });
            java.util.List<TagWrapper> listEZpvd = c34371nan.EZpvd();
            if ((listEZpvd instanceof java.util.Collection) && listEZpvd.isEmpty()) {
                c36070oOd.getRoot().setBackground(null);
            } else {
                java.util.Iterator<T> it = listEZpvd.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) it.next()).KWHzl(), (java.lang.Object) "suspectedRatTradingAddress")) {
                        c36070oOd.getRoot().setBackgroundColor(ColorUtils.setAlphaComponent(mUM.copydefault(C52761wXj.Activity.fHqPtx), 89));
                        break;
                    }
                }
                c36070oOd.getRoot().setBackground(null);
            }
            ConstraintLayout root = c36070oOd.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, c34364nag, c34371nan));
        }

        public static final boolean EZpvd(C34364nag c34364nag, C34371nan c34371nan, android.view.View view) {
            c34364nag.AYXKKw.invoke(c34371nan.EZpvd());
            return true;
        }

        public final void copydefault(HistoryTokenChange historyTokenChange, boolean z) {
            java.lang.String strCopydefault;
            int iTradeFallDefault$default;
            int iTradeFallTagFill$default;
            int iTradeFallDefault$default2;
            java.lang.String strAYXKKw;
            java.lang.String strOLrzqt;
            android.content.Context context = this.OLrzqt.getRoot().getContext();
            C36070oOd c36070oOd = this.OLrzqt;
            if (historyTokenChange == null || (strOLrzqt = historyTokenChange.OLrzqt()) == null) {
                strCopydefault = null;
            } else {
                strCopydefault = C32230mUh.copydefault(strOLrzqt, z ? Marker.ANY_NON_NULL_MARKER : "-", false);
            }
            android.widget.TextView textView = c36070oOd.isConnected;
            textView.setText(strCopydefault);
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
            android.widget.TextView textView2 = c36070oOd.values;
            if (z) {
                iTradeFallTagFill$default = C33512mxp.tradeRiseTagFill$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
            } else {
                iTradeFallTagFill$default = C33512mxp.tradeFallTagFill$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
            }
            textView2.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iTradeFallTagFill$default));
            if (z) {
                iTradeFallDefault$default2 = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
            } else {
                iTradeFallDefault$default2 = C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
            }
            textView2.setTextColor(iTradeFallDefault$default2);
            if (z) {
                strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKOmnske);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKffREWX);
            }
            textView2.setText(strAYXKKw);
        }

        public final void AEQbTJ(C34371nan c34371nan) {
            java.lang.String strAEQbTJ = C34498ndH.OLrzqt.AEQbTJ(c34371nan.EZpvd());
            if (strAEQbTJ.length() == 0) {
                strAEQbTJ = this.copydefault.EZpvd(c34371nan.AYXKKw());
            }
            if (strAEQbTJ == null) {
                strAEQbTJ = mUO.formatAddress$default(c34371nan.AYXKKw(), 4, 4, null, 4, null);
            }
            this.OLrzqt.AhwBna.setText(strAEQbTJ);
            wYC wyc = this.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(this.copydefault.AEQbTJ(c34371nan.AYXKKw()) ? 0 : 8);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void KWHzl(@NotNull C34371nan c34371nan) {
            java.lang.String usdValueToLocalValue$default;
            Intrinsics.checkNotNullParameter(c34371nan, "");
            android.widget.TextView textView = this.OLrzqt.AYXKKw;
            HistoryTokenChange historyTokenChange = (HistoryTokenChange) CollectionsKt___CollectionsKt.AkhnZx(c34371nan.OLrzqt(), 1);
            if (historyTokenChange != null) {
                C34364nag c34364nag = this.EZpvd;
                if (c34364nag.EZpvd) {
                    if (C33129mqd.AEQbTJ(c34371nan.KWHzl(), "0")) {
                        java.lang.String numberICUWithPrecision$default = mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, java.lang.String.valueOf(C33129mqd.djBIcL(c34371nan.AhwBna()) / C33129mqd.djBIcL(c34371nan.copydefault())), null, 1, null);
                        mWC mwc = c34364nag.copydefault;
                        usdValueToLocalValue$default = numberICUWithPrecision$default + " " + (mwc != null ? mwc.KWHzl() : null);
                    } else {
                        java.lang.String numberICUWithPrecision$default2 = mRD.getNumberICUWithPrecision$default(mRD.OLrzqt, historyTokenChange.OLrzqt(), null, 1, null);
                        mWC mwc2 = c34364nag.copydefault;
                        usdValueToLocalValue$default = numberICUWithPrecision$default2 + " " + (mwc2 != null ? mwc2.KWHzl() : null);
                    }
                } else {
                    usdValueToLocalValue$default = xHP.formatUsdValueToLocalValue$default(c34371nan.AhwBna(), true, null, null, null, 14, null);
                }
                if (usdValueToLocalValue$default == null) {
                    usdValueToLocalValue$default = "--";
                }
            }
            textView.setText(usdValueToLocalValue$default);
        }
    }

    @Override // o.AbstractC34586neq
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        RecyclerView.ViewHolder viewHolderAEQbTJ = super.AEQbTJ(viewGroup);
        Intrinsics.copydefault(viewHolderAEQbTJ, "");
        C34589net c34589net = (C34589net) viewHolderAEQbTJ;
        AEQbTJ(c34589net.AEQbTJ());
        return c34589net;
    }

    public final void AEQbTJ(oNK onk) {
        C55173xeu c55173xeu = onk.copydefault;
        if (this.KWHzl) {
            c55173xeu.setEmptyTypeImage(7);
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.DPhTBN));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C35964oKf.Fragment.frkDMe));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.nae
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34364nag.KWHzl(this.copydefault, view);
                }
            });
            return;
        }
        c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPzRXNTw));
    }

    public static final void KWHzl(C34364nag c34364nag, android.view.View view) {
        c34364nag.AhwBna.invoke();
    }
}
