package o;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iTX extends iTL implements InterfaceC24077iUa {
    public java.lang.String EZpvd = "";
    public Activity KWHzl;
    public final boolean OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public interface Activity {
        void OLrzqt(@NotNull InvestPositionSelectUIItem investPositionSelectUIItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.OLrzqt;
    }

    @Override // o.iTL
    public boolean valueOf() {
        return true;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iTX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final iTX copydefault(@NotNull java.util.ArrayList<InvestPositionSelectUIItem> arrayList, Activity activity) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("data", arrayList);
            iTX itx = new iTX();
            itx.setArguments(bundle);
            itx.KWHzl = activity;
            return itx;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InvestPositionSelectUIItem> KWHzl() {
        android.os.Bundle arguments = getArguments();
        java.util.ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("data") : null;
        return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
    }

    public static final class StateListAnimator extends C43318rmy<InvestPositionSelectUIItem.InvestV3PositionSelectUIItem, AbstractC23787iJh> {
        public boolean EZpvd;
        public final InterfaceC24077iUa OLrzqt;

        public StateListAnimator(InterfaceC24077iUa interfaceC24077iUa) {
            super(C25493ixk.Activity.OJuSTm, C25488ixf.OLrzqt);
            this.OLrzqt = interfaceC24077iUa;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC23787iJh> c43312rms, @NotNull InvestPositionSelectUIItem.InvestV3PositionSelectUIItem investV3PositionSelectUIItem, @NotNull java.util.List<java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(investV3PositionSelectUIItem, "");
            Intrinsics.checkNotNullParameter(list, "");
            super.onBindViewHolder(c43312rms, investV3PositionSelectUIItem, list);
            AbstractC23787iJh abstractC23787iJh = (AbstractC23787iJh) c43312rms.OLrzqt();
            abstractC23787iJh.KWHzl.setText(investV3PositionSelectUIItem.getName());
            abstractC23787iJh.copydefault.setText(investV3PositionSelectUIItem.getRange());
            abstractC23787iJh.EZpvd.setText(investV3PositionSelectUIItem.getAmount());
            abstractC23787iJh.djBIcL.setOKDSPill(-2);
            abstractC23787iJh.djBIcL.setTagPaint(1);
            if (investV3PositionSelectUIItem.isActive()) {
                C55251xgS c55251xgS = abstractC23787iJh.djBIcL;
                c55251xgS.setText(c55251xgS.getContext().getString(C25493ixk.FragmentManager.RihMUf));
                abstractC23787iJh.djBIcL.setOKDSStyle(7);
            } else {
                C55251xgS c55251xgS2 = abstractC23787iJh.djBIcL;
                c55251xgS2.setText(c55251xgS2.getContext().getString(C25493ixk.FragmentManager.resume));
                abstractC23787iJh.djBIcL.setOKDSStyle(11);
            }
            if (investV3PositionSelectUIItem.getCannotInvest()) {
                android.widget.TextView textView = abstractC23787iJh.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC23787iJh.KWHzl.setAlpha(0.5f);
                abstractC23787iJh.copydefault.setAlpha(0.5f);
                abstractC23787iJh.EZpvd.setAlpha(0.5f);
                abstractC23787iJh.djBIcL.setAlpha(0.5f);
                abstractC23787iJh.OLrzqt.setAlpha(0.5f);
            } else {
                android.widget.TextView textView2 = abstractC23787iJh.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
                abstractC23787iJh.KWHzl.setAlpha(1.0f);
                abstractC23787iJh.copydefault.setAlpha(1.0f);
                abstractC23787iJh.EZpvd.setAlpha(1.0f);
                abstractC23787iJh.djBIcL.setAlpha(1.0f);
                abstractC23787iJh.OLrzqt.setAlpha(1.0f);
            }
            abstractC23787iJh.getRoot().setContentDescription("invest_v3_position_item");
            android.view.View root = abstractC23787iJh.getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0855StateListAnimator(root, 1000L, investV3PositionSelectUIItem, this));
            wYC wyc = abstractC23787iJh.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) investV3PositionSelectUIItem.getReverseRange()) ? 0 : 8);
            wYC wyc2 = abstractC23787iJh.AEQbTJ;
            wyc2.setOnClickListener(new Application(wyc2, 1000L, this, abstractC23787iJh, investV3PositionSelectUIItem));
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ StateListAnimator EZpvd;
            public final /* synthetic */ InvestPositionSelectUIItem.InvestV3PositionSelectUIItem KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ AbstractC23787iJh copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, StateListAnimator stateListAnimator, AbstractC23787iJh abstractC23787iJh, InvestPositionSelectUIItem.InvestV3PositionSelectUIItem investV3PositionSelectUIItem) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.EZpvd = stateListAnimator;
                this.copydefault = abstractC23787iJh;
                this.KWHzl = investV3PositionSelectUIItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.String range;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.EZpvd.EZpvd = !r7.EZpvd;
                    android.widget.TextView textView = this.copydefault.copydefault;
                    if (this.EZpvd.EZpvd) {
                        range = this.KWHzl.getReverseRange();
                    } else {
                        range = this.KWHzl.getRange();
                    }
                    textView.setText(range);
                }
            }
        }

        /* JADX INFO: renamed from: o.iTX$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0855StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ StateListAnimator KWHzl;
            public final /* synthetic */ InvestPositionSelectUIItem.InvestV3PositionSelectUIItem OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0855StateListAnimator(android.view.View view, long j, InvestPositionSelectUIItem.InvestV3PositionSelectUIItem investV3PositionSelectUIItem, StateListAnimator stateListAnimator) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.OLrzqt = investV3PositionSelectUIItem;
                this.KWHzl = stateListAnimator;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InterfaceC24077iUa interfaceC24077iUa;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    if (this.OLrzqt.getCannotInvest() || (interfaceC24077iUa = this.KWHzl.OLrzqt) == null) {
                        return;
                    }
                    interfaceC24077iUa.EZpvd(this.OLrzqt);
                }
            }
        }
    }

    public static final class Application extends C43318rmy<InvestPositionSelectUIItem.InvestExpiryPositionSelectUIItem, iIF> {
        public final InterfaceC24077iUa OLrzqt;

        public Application(InterfaceC24077iUa interfaceC24077iUa) {
            super(C25493ixk.Activity.DCUTEI, C25488ixf.OLrzqt);
            this.OLrzqt = interfaceC24077iUa;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<iIF> c43312rms, @NotNull InvestPositionSelectUIItem.InvestExpiryPositionSelectUIItem investExpiryPositionSelectUIItem, @NotNull java.util.List<java.lang.Object> list) {
            kotlin.Pair pairOLrzqt;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(investExpiryPositionSelectUIItem, "");
            Intrinsics.checkNotNullParameter(list, "");
            super.onBindViewHolder(c43312rms, investExpiryPositionSelectUIItem, list);
            iIF iif = (iIF) c43312rms.OLrzqt();
            if (investExpiryPositionSelectUIItem.isActive()) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.hCLrkq), 7);
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.DGOPHZDGOPHZ), 11);
            }
            int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
            iif.OLrzqt.setOKDSStyle(((java.lang.Number) pairOLrzqt.component2()).intValue());
            iif.OLrzqt.setText(iif.getRoot().getContext().getString(iIntValue));
            iif.copydefault.setText(pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(investExpiryPositionSelectUIItem.getSettlementTime()) * ((long) 1000)), null, 1, null));
            iif.AEQbTJ.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investExpiryPositionSelectUIItem.getAmount(), null, null, null, 14, null));
            if (investExpiryPositionSelectUIItem.isActive()) {
                iif.AEQbTJ.setTextColor(iif.getRoot().getContext().getColor(C52761wXj.Activity.fdOvFl));
                iif.copydefault.setTextColor(iif.getRoot().getContext().getColor(C52761wXj.Activity.QwvEab));
                iif.KWHzl.setColorFilter(iif.getRoot().getContext().getColor(C52761wXj.Activity.fdOvFl));
            } else {
                iif.AEQbTJ.setTextColor(iif.getRoot().getContext().getColor(C52761wXj.Activity.UlJrfe));
                iif.copydefault.setTextColor(iif.getRoot().getContext().getColor(C52761wXj.Activity.UlJrfe));
                iif.KWHzl.setColorFilter(iif.getRoot().getContext().getColor(C52761wXj.Activity.UlJrfe));
            }
            android.view.View root = iif.getRoot();
            root.setOnClickListener(new Activity(root, 1000L, investExpiryPositionSelectUIItem, this));
        }

        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ Application AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ InvestPositionSelectUIItem.InvestExpiryPositionSelectUIItem KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, InvestPositionSelectUIItem.InvestExpiryPositionSelectUIItem investExpiryPositionSelectUIItem, Application application) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.KWHzl = investExpiryPositionSelectUIItem;
                this.AEQbTJ = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InterfaceC24077iUa interfaceC24077iUa;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    if (!this.KWHzl.isActive() || (interfaceC24077iUa = this.AEQbTJ.OLrzqt) == null) {
                        return;
                    }
                    interfaceC24077iUa.EZpvd(this.KWHzl);
                }
            }
        }
    }

    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJT ijtAEQbTJ = iJT.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ijtAEQbTJ, "");
        ijtAEQbTJ.EZpvd.setText(this.EZpvd);
        ConstraintLayout root = ijtAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJS ijsKWHzl = iJS.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ijsKWHzl, "");
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(InvestPositionSelectUIItem.InvestV3PositionSelectUIItem.class, new StateListAnimator(this));
        c43316rmw.register(InvestPositionSelectUIItem.InvestExpiryPositionSelectUIItem.class, new Application(this));
        ijsKWHzl.AEQbTJ.setAdapter(c43316rmw);
        ijsKWHzl.AEQbTJ.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ijsKWHzl.AEQbTJ.addItemDecoration(new TaskDescription(ijsKWHzl));
        c43316rmw.setItems(KWHzl());
        c43316rmw.notifyDataSetChanged();
        ConstraintLayout root = ijsKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static final class TaskDescription extends RecyclerView.ItemDecoration {
        public final /* synthetic */ iJS KWHzl;

        public TaskDescription(iJS ijs) {
            this.KWHzl = ijs;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) < iTX.this.KWHzl().size() - 1) {
                rect.bottom = 1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(android.graphics.Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int dimensionPixelSize = iTX.this.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ORxRYg);
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth();
            int paddingRight = recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = recyclerView.getChildAt(i);
                if (recyclerView.getChildAdapterPosition(childAt) < iTX.this.KWHzl().size() - 1) {
                    float bottom = childAt.getBottom() + iTX.this.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.OcIXYQ);
                    android.graphics.Paint paint = new android.graphics.Paint();
                    paint.setColor(ContextCompat.getColor(this.KWHzl.AEQbTJ.getContext(), C52761wXj.Activity.AwvSrB));
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(paddingLeft + dimensionPixelSize, bottom, (width - paddingRight) - dimensionPixelSize, bottom + 0.5f, paint);
                }
            }
        }
    }

    @Override // o.iTL, o.C33003moJ, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        android.view.Window window = dialogOnCreateDialog.getWindow();
        if (window == null) {
            return dialogOnCreateDialog;
        }
        WindowCompat.setDecorFitsSystemWindows(window, false);
        int color = ContextCompat.getColor(dialogOnCreateDialog.getContext(), C52761wXj.Activity.registerUser);
        window.setNavigationBarColor(color);
        if (Build.VERSION.SDK_INT >= 28) {
            window.setNavigationBarDividerColor(color);
        }
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        if (insetsController != null) {
            insetsController.setAppearanceLightNavigationBars(!C33492mxV.OLrzqt());
        }
        return dialogOnCreateDialog;
    }

    @Override // o.iTL, o.C33003moJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorCopydefault;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        DialogC33577mzA dialogC33577mzA = dialog instanceof DialogC33577mzA ? (DialogC33577mzA) dialog : null;
        if (dialogC33577mzA == null || (bottomSheetBehaviorCopydefault = dialogC33577mzA.copydefault()) == null) {
            return;
        }
        bottomSheetBehaviorCopydefault.setSkipCollapsed(true);
    }

    @Override // o.InterfaceC24077iUa
    public void EZpvd(@NotNull InvestPositionSelectUIItem investPositionSelectUIItem) {
        Intrinsics.checkNotNullParameter(investPositionSelectUIItem, "");
        dismiss();
        Activity activity = this.KWHzl;
        if (activity != null) {
            activity.OLrzqt(investPositionSelectUIItem);
        }
    }
}
