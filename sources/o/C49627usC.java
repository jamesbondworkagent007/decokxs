package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.tradeuilib.header.BizSettingItem;
import java.util.Collections;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C49707utd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.usC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49627usC extends AbstractC49393unh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public C49542uqX djBIcL;
    public Function0<Unit> gEmmrt;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.usG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Float.valueOf(C49627usC.KWHzl(this.OLrzqt));
        }
    });
    public final C43316rmw OLrzqt = new C43316rmw();
    public java.util.List<BizSettingItem> copydefault = new java.util.ArrayList();
    public java.util.Set<java.lang.String> AYXKKw = yEE.AhwBna("SPOT", "SWAP");
    public final ItemTouchHelper KWHzl = new ItemTouchHelper(new Application());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "TradeModeManagerBottomSheet";
    }

    /* JADX INFO: renamed from: o.usC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.usC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<BizSettingItem> list, @NotNull java.util.Set<java.lang.String> set, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(set, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C49627usC c49627usC = new C49627usC();
            c49627usC.AEQbTJ(function0);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("arg_items", new java.util.ArrayList<>(list));
            bundle.putStringArrayList("arg_mandatory", new java.util.ArrayList<>(set));
            c49627usC.setArguments(bundle);
            c49627usC.show(fragmentManager, "TradeModeManagerBottomSheet");
        }
    }

    public static final float KWHzl(C49627usC c49627usC) {
        Intrinsics.checkNotNullExpressionValue(c49627usC.requireContext(), "");
        return C55298xhM.EZpvd(32, r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float copydefault() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).floatValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AYXKKw().setGravity(8388611);
        wxq.setTitle(C33070mpX.AYXKKw(C49511upt.Activity.fetchVPNInfo));
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = C49542uqX.OLrzqt(getLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ();
        EZpvd();
        C49542uqX c49542uqX = this.djBIcL;
        if (c49542uqX == null || (c52794wYp = c49542uqX.OLrzqt) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.usE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49627usC.OLrzqt(this.EZpvd, view2);
            }
        });
    }

    public static final void OLrzqt(C49627usC c49627usC, android.view.View view) {
        c49627usC.OLrzqt();
        c49627usC.dismissAllowingStateLoss();
    }

    public final void AEQbTJ() {
        java.util.Set<java.lang.String> setAhwBna;
        android.os.Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "");
        java.util.ArrayList parcelableArrayList = bundleRequireArguments.getParcelableArrayList("arg_items");
        if (parcelableArrayList == null) {
            parcelableArrayList = new java.util.ArrayList();
        }
        this.copydefault = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) parcelableArrayList);
        java.util.ArrayList<java.lang.String> stringArrayList = bundleRequireArguments.getStringArrayList("arg_mandatory");
        if (stringArrayList == null || (setAhwBna = CollectionsKt___CollectionsKt.OqFWZa(stringArrayList)) == null) {
            setAhwBna = yEE.AhwBna("SPOT", "SWAP");
        }
        this.AYXKKw = setAhwBna;
    }

    private final void EZpvd() {
        RecyclerView recyclerView;
        this.OLrzqt.register(BizSettingItem.class, new C49634usJ(new Function1() { // from class: o.usB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49627usC.KWHzl(this.copydefault, (RecyclerView.ViewHolder) obj);
            }
        }));
        C49542uqX c49542uqX = this.djBIcL;
        if (c49542uqX != null && (recyclerView = c49542uqX.AEQbTJ) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.OLrzqt);
            this.KWHzl.attachToRecyclerView(recyclerView);
        }
        C33064mpR.OLrzqt(this.OLrzqt, (java.util.List<? extends java.lang.Object>) this.copydefault);
    }

    public static final Unit KWHzl(C49627usC c49627usC, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        c49627usC.KWHzl.startDrag(viewHolder);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "enabled_buttons", str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(java.lang.String str) {
        switch (str.hashCode()) {
            case -1956807563:
                return str.equals("OPTION") ? "options" : "";
            case -1201878036:
                if (str.equals("COPYTRADING")) {
                    return "marketplace";
                }
                break;
            case 2044812:
                if (str.equals("BOTS")) {
                    return "bots";
                }
                break;
            case 2552066:
                if (str.equals("SPOT")) {
                    return "spot";
                }
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    return "futures";
                }
                break;
            case 1669573011:
                if (str.equals("CONVERT")) {
                    return "convert";
                }
                break;
            case 1983970406:
                if (str.equals("CEDEFI")) {
                    return "dex";
                }
                break;
        }
    }

    /* JADX INFO: renamed from: o.usC$Application */
    public static final class Application extends ItemTouchHelper.SimpleCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
        }

        public Application() {
            super(3, 0);
        }

        public static final boolean KWHzl(RecyclerView.ViewHolder viewHolder, RecyclerView recyclerView) {
            android.view.View viewFindViewByPosition;
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            for (int i = 0; i < bindingAdapterPosition; i++) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (i < (layoutManager != null ? layoutManager.getItemCount() : 0)) {
                    RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                    if (C33129mqd.AEQbTJ((layoutManager2 == null || (viewFindViewByPosition = layoutManager2.findViewByPosition(i)) == null) ? null : java.lang.Integer.valueOf(viewFindViewByPosition.getHeight()), 0)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static final boolean EZpvd(RecyclerView.ViewHolder viewHolder, RecyclerView recyclerView) {
            android.view.View viewFindViewByPosition;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
            for (int bindingAdapterPosition = viewHolder.getBindingAdapterPosition() + 1; bindingAdapterPosition < itemCount; bindingAdapterPosition++) {
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                if (bindingAdapterPosition < (layoutManager2 != null ? layoutManager2.getItemCount() : 0)) {
                    RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                    if (C33129mqd.AEQbTJ((layoutManager3 == null || (viewFindViewByPosition = layoutManager3.findViewByPosition(bindingAdapterPosition)) == null) ? null : java.lang.Integer.valueOf(viewFindViewByPosition.getHeight()), 0)) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onChildDraw(android.graphics.Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            float f3;
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            if (i == 2) {
                float f4 = (KWHzl(viewHolder, recyclerView) && C33129mqd.gEmmrt(java.lang.Float.valueOf(f2), 0)) ? 0.0f : f2;
                f3 = (EZpvd(viewHolder, recyclerView) && C33129mqd.AEQbTJ(java.lang.Float.valueOf(f4), 0)) ? 0.0f : f4;
            } else {
                f3 = f2;
            }
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f3, i, z);
            android.view.View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            if (z) {
                ViewCompat.setElevation(view, C49627usC.this.copydefault());
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
            Collections.swap(C49627usC.this.OLrzqt.getItems(), bindingAdapterPosition, bindingAdapterPosition2);
            C49627usC.this.OLrzqt.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
            return true;
        }
    }

    /* JADX INFO: renamed from: o.usC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C49627usC AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C49627usC c49627usC) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c49627usC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public final void OLrzqt() {
        java.util.List<BizSettingItem> list = this.copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BizSettingItem) it.next()).getOrderType());
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        java.util.List<BizSettingItem> list2 = this.copydefault;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            BizSettingItem bizSettingItem = (BizSettingItem) obj;
            if (!bizSettingItem.getEnabled() && !this.AYXKKw.contains(bizSettingItem.getOrderType())) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((BizSettingItem) it2.next()).getOrderType());
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
        C49707utd.ActionBar actionBar = C49707utd.Companion;
        SPUtils.put(actionBar.EZpvd(), strJoinToString$default);
        SPUtils.put(actionBar.KWHzl(), CollectionsKt___CollectionsKt.joinToString$default(setOqFWZa, ",", null, null, 0, null, null, 62, null));
        KWHzl();
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void KWHzl() {
        java.util.List<BizSettingItem> list = this.copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            BizSettingItem bizSettingItem = (BizSettingItem) obj;
            if (bizSettingItem.getEnabled() || this.AYXKKw.contains(bizSettingItem.getOrderType())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(KWHzl(((BizSettingItem) it.next()).getOrderType()));
        }
        final java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null);
        C32866mlf.onEvent$default("Trade_TopBarBizNavigationEdit_Confirm_Click", (TrackChannel[]) null, new Function1() { // from class: o.usH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C49627usC.OLrzqt(strJoinToString$default, (EventParamsList) obj2);
            }
        }, 1, (java.lang.Object) null);
    }
}
