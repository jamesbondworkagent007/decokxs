package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.multitype.selection.Selectable;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC55274xgp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xfS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55198xfS extends ConstraintLayout implements InterfaceC55274xgp {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final C54937xaW AEQbTJ;
    public java.util.List<C55276xgr> AYXKKw;
    public Selectable.Mode AhwBna;
    public Function2<? super C55276xgr, ? super C55276xgr, ? extends java.util.List<C55276xgr>> AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm AuCTelauCTel;
    public C55276xgr AubY;
    public Function1<? super C55276xgr, ? extends java.util.List<C55276xgr>> DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public C43316rmw ejfBZ;
    public java.util.List<C55276xgr> fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public InterfaceC55196xfQ<C55276xgr, ?> fJNWhG;
    public Function1<? super C55276xgr, Unit> fetchVPNInfo;
    public InterfaceC55196xfQ<C55276xgr, ?> gEmmrt;
    public C55276xgr getFieldNames;
    public C55276xgr getNewProxyInstance;
    public java.util.List<yHO<C55276xgr, C55276xgr, C55276xgr, Unit>> hDKMBd;
    public Function1<? super java.util.List<C55276xgr>, Unit> isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public C55276xgr uzCIH;
    public InterfaceC55196xfQ<C55276xgr, ?> valueOf;
    public final InterfaceC56387yDm values;
    public final InterfaceC56387yDm wlaJM;
    public java.util.List<C55276xgr> zLjUOn;
    public C55276xgr zsXlph;
    public int zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55198xfS(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C55276xgr> DbNXlk() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.xfQ<o.xgr, VH extends androidx.recyclerview.widget.RecyclerView$ViewHolder> */
    /* JADX WARN: Multi-variable type inference failed */
    public <VH extends RecyclerView.ViewHolder> void EZpvd(@NotNull InterfaceC55196xfQ<C55276xgr, VH> interfaceC55196xfQ) {
        Intrinsics.checkNotNullParameter(interfaceC55196xfQ, "");
        this.valueOf = interfaceC55196xfQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.zuBGHE = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:51) call: o.xfS.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55198xfS(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // o.InterfaceC55274xgp
    public void setSingleOneColumnData(@NotNull java.util.List<C55276xgr> list, yHO<? super C55276xgr, ? super C55276xgr, ? super C55276xgr, Unit> yho) {
        InterfaceC55274xgp.StateListAnimator.EZpvd(this, list, yho);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55198xfS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.xfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.djBIcL(this.EZpvd);
            }
        });
        this.AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.xgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.isConnected(this.copydefault);
            }
        });
        this.wlaJM = C56392yDr.copydefault(new Function0() { // from class: o.xgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.gEmmrt(this.copydefault);
            }
        });
        C54937xaW c54937xaWOLrzqt = C54937xaW.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54937xaWOLrzqt, "");
        this.AEQbTJ = c54937xaWOLrzqt;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.valueOf();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.djBIcL();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.AYXKKw();
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.xgm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.AhwBna(this.EZpvd);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.xgl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.AhwBna();
            }
        });
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.xgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.AYXKKw(this.AEQbTJ);
            }
        });
        this.AhwBna = Selectable.Mode.Single;
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.xfR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55198xfS.gEmmrt();
            }
        });
        this.hDKMBd = new java.util.ArrayList();
        android.view.View viewAEQbTJ = c54937xaWOLrzqt.valueOf.AEQbTJ(StatefulView.Status.Empty);
        if (viewAEQbTJ != null) {
            C55173xeu c55173xeu = (C55173xeu) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.gasjUx);
            ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ((FrameLayout.LayoutParams) layoutParams).topMargin = C55298xhM.OLrzqt(64, context);
            c55173xeu.setEmptyTypeImage(7);
            C33089mpq c33089mpq = C33089mpq.EZpvd;
            if (c33089mpq.OLrzqt() != 0) {
                java.lang.String string = context.getString(c33089mpq.OLrzqt());
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu.setTitle(string);
            }
        }
    }

    public final C55230xfy isConnected() {
        C55230xfy c55230xfy = this.AEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
        return c55230xfy;
    }

    public final C55277xgs values() {
        return (C55277xgs) this.iwGUEr.getValue();
    }

    public static final C55277xgs djBIcL(C55198xfS c55198xfS) {
        return new C55277xgs(c55198xfS.AuCTel(), null, 2, 0 == true ? 1 : 0);
    }

    public final C55277xgs fetchVPNInfo() {
        return (C55277xgs) this.AuCTelauCTel.getValue();
    }

    public static final C55277xgs isConnected(C55198xfS c55198xfS) {
        return new C55277xgs(c55198xfS.fARcdN(), null, 2, 0 == true ? 1 : 0);
    }

    public final C55277xgs AkhnZx() {
        return (C55277xgs) this.wlaJM.getValue();
    }

    public static final C55277xgs gEmmrt(C55198xfS c55198xfS) {
        return new C55277xgs(c55198xfS.fIwbmz(), null, 2, 0 == true ? 1 : 0);
    }

    private final C43316rmw AuCTel() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    public static final C43316rmw valueOf() {
        return new C43316rmw();
    }

    public static final C43316rmw djBIcL() {
        return new C43316rmw();
    }

    private final C43316rmw fARcdN() {
        return (C43316rmw) this.KWHzl.getValue();
    }

    public static final C43316rmw AYXKKw() {
        return new C43316rmw();
    }

    private final C43316rmw fIwbmz() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    private final C43316rmw uzCIH() {
        return (C43316rmw) this.values.getValue();
    }

    public static final C43316rmw AhwBna(final C55198xfS c55198xfS) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(C55276xgr.class, new ViewOnClickListenerC55272xgn(null, new C55273xgo(false, 1, null), new Function2() { // from class: o.xfP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55198xfS.values(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        }));
        return c43316rmw;
    }

    /* JADX INFO: renamed from: o.xfS$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ Function2 EZpvd;
        public final /* synthetic */ C54937xaW OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C54937xaW c54937xaW, Function2 function2) {
            this.OLrzqt = c54937xaW;
            this.EZpvd = function2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (editable == null || editable.length() == 0) {
                C55198xfS.this.setSelectionContentVisibility(this.OLrzqt, 0);
                this.OLrzqt.valueOf.setVisibility(8);
            } else {
                C55198xfS.this.setSelectionContentVisibility(this.OLrzqt, 4);
                this.OLrzqt.valueOf.setVisibility(0);
                this.EZpvd.invoke(editable.toString(), C55198xfS.this.iwGUEr());
            }
        }
    }

    public static final Unit values(C55198xfS c55198xfS, int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        Function1<? super C55276xgr, Unit> function1 = c55198xfS.fetchVPNInfo;
        if (function1 != null) {
            function1.invoke(c55276xgr);
        }
        return Unit.INSTANCE;
    }

    private final java.util.List<java.lang.Object> hDKMBd() {
        return (java.util.List) this.djBIcL.getValue();
    }

    public static final java.util.List AhwBna() {
        return yDY.AhwBna();
    }

    private final Observer<java.util.List<C55276xgr>> getFieldNames() {
        return (Observer) this.AuCTel.getValue();
    }

    public static final Observer AYXKKw(final C55198xfS c55198xfS) {
        return new Observer() { // from class: o.xfX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C55198xfS.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        };
    }

    public static final void EZpvd(C55198xfS c55198xfS, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c55198xfS.copydefault(c55198xfS.uzCIH(), (java.util.List<?>) list);
        C43316rmw c43316rmw = c55198xfS.ejfBZ;
        if (c43316rmw != null) {
            c55198xfS.copydefault(c43316rmw, (java.util.List<?>) list);
        }
        if (list.isEmpty()) {
            c55198xfS.AEQbTJ.valueOf.setStatus(StatefulView.Status.Empty);
        } else {
            c55198xfS.AEQbTJ.valueOf.setStatus(StatefulView.Status.Content);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediatorLiveData<java.util.List<C55276xgr>> iwGUEr() {
        return (MediatorLiveData) this.fIwbmz.getValue();
    }

    public static final MediatorLiveData gEmmrt() {
        return new MediatorLiveData();
    }

    public final void setAdapter(@NotNull C43316rmw c43316rmw) {
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        this.AEQbTJ.AhwBna.setAdapter(c43316rmw);
        this.ejfBZ = c43316rmw;
    }

    public static /* synthetic */ void setType$default(C55198xfS c55198xfS, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c55198xfS.setType(i);
    }

    public final void copydefault(@NotNull yHO<? super C55276xgr, ? super C55276xgr, ? super C55276xgr, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.hDKMBd.add(yho);
    }

    @Override // o.InterfaceC55274xgp
    public void setMultipleOneColumnData(@NotNull java.util.List<C55276xgr> list, Function1<? super java.util.List<C55276xgr>, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AhwBna = Selectable.Mode.Multiple;
        this.AYXKKw = list;
        this.isConnected = function1;
        fJNWhG();
    }

    @Override // o.InterfaceC55274xgp
    public void setMultipleColumnData(java.util.List<C55276xgr> list, Function1<? super C55276xgr, ? extends java.util.List<C55276xgr>> function1, Function2<? super C55276xgr, ? super C55276xgr, ? extends java.util.List<C55276xgr>> function2, yHO<? super C55276xgr, ? super C55276xgr, ? super C55276xgr, Unit> yho) {
        this.AhwBna = Selectable.Mode.Single;
        this.AYXKKw = list;
        this.DbNXlk = function1;
        this.AkhnZx = function2;
        if (yho != null) {
            copydefault(yho);
        }
        fJNWhG();
    }

    @Override // o.InterfaceC55274xgp
    public void AEQbTJ(@NotNull Function2<? super java.lang.CharSequence, ? super MutableLiveData<java.util.List<C55276xgr>>, Unit> function2, Function1<? super C55276xgr, Unit> function1, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(function2, "");
        C54937xaW c54937xaW = this.AEQbTJ;
        c54937xaW.gEmmrt.setVisibility(0);
        c54937xaW.AhwBna.setLayoutManager(new LinearLayoutManager(getContext()));
        c54937xaW.AhwBna.setAdapter(uzCIH());
        this.fetchVPNInfo = function1;
        if (lifecycleOwner != null) {
            iwGUEr().observe(lifecycleOwner, getFieldNames());
        } else {
            iwGUEr().observeForever(getFieldNames());
        }
        c54937xaW.gEmmrt.EZpvd().addTextChangedListener(new Application(c54937xaW, function2));
    }

    @Override // o.InterfaceC55274xgp
    public void EZpvd(@NotNull Function1<? super C55230xfy, Unit> function1, @NotNull Function2<? super java.lang.CharSequence, ? super MutableLiveData<java.util.List<C55276xgr>>, Unit> function2, Function1<? super C55276xgr, Unit> function12, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C55230xfy c55230xfy = this.AEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
        function1.invoke(c55230xfy);
        AEQbTJ(function2, function12, lifecycleOwner);
    }

    public final void setPaddingForChildren(android.view.ViewGroup viewGroup, int i) {
        viewGroup.setPaddingRelative(0, 0, 0, i);
        viewGroup.setClipToPadding(false);
    }

    @Override // o.InterfaceC55274xgp
    public android.widget.PopupWindow OLrzqt(android.view.View view, final PopupWindow.OnDismissListener onDismissListener) {
        Intrinsics.checkNotNullExpressionValue(getResources(), "");
        int iEZpvd = yII.EZpvd(C55302xhQ.AEQbTJ(r0) * 0.6f);
        setBackgroundResource(C52761wXj.TaskDescription.HJWChPUUMfbK);
        C54937xaW c54937xaW = this.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(16, context);
        RecyclerView recyclerView = c54937xaW.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        setPaddingForChildren(recyclerView, iOLrzqt);
        RecyclerView recyclerView2 = c54937xaW.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        setPaddingForChildren(recyclerView2, iOLrzqt);
        RecyclerView recyclerView3 = c54937xaW.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
        setPaddingForChildren(recyclerView3, iOLrzqt);
        RecyclerView recyclerView4 = c54937xaW.AhwBna;
        Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
        setPaddingForChildren(recyclerView4, iOLrzqt);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMaxHeight(iEZpvd);
        final C54994xba c54994xba = new C54994xba(getContext(), this, false, true);
        c54994xba.AEQbTJ(true);
        c54994xba.setSoftInputMode(16);
        c54994xba.setInputMethodMode(1);
        if (view != null) {
            c54994xba.showAsDropDown(view);
        }
        c54994xba.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.xgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C55198xfS.EZpvd(c54994xba, this, onDismissListener);
            }
        });
        return c54994xba;
    }

    public static final void EZpvd(C54994xba c54994xba, C55198xfS c55198xfS, PopupWindow.OnDismissListener onDismissListener) {
        c54994xba.setOnDismissListener(null);
        c55198xfS.ejfBZ();
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void ejfBZ() {
        iwGUEr().removeObserver(getFieldNames());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C54937xaW c54937xaW = this.AEQbTJ;
        if (getMeasuredHeight() < c54937xaW.gEmmrt.getMeasuredHeight() + c54937xaW.AEQbTJ.getMeasuredHeight() || getMeasuredHeight() < c54937xaW.gEmmrt.getMeasuredHeight() + c54937xaW.OLrzqt.getMeasuredHeight() || getMeasuredHeight() < c54937xaW.gEmmrt.getMeasuredHeight() + c54937xaW.EZpvd.getMeasuredHeight()) {
            RecyclerView recyclerView = c54937xaW.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                layoutParams2.bottomToBottom = 0;
                recyclerView.setLayoutParams(layoutParams2);
                RecyclerView recyclerView2 = c54937xaW.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                ViewGroup.LayoutParams layoutParams3 = recyclerView2.getLayoutParams();
                if (layoutParams3 != null) {
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                    layoutParams4.bottomToBottom = 0;
                    recyclerView2.setLayoutParams(layoutParams4);
                    RecyclerView recyclerView3 = c54937xaW.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                    ViewGroup.LayoutParams layoutParams5 = recyclerView3.getLayoutParams();
                    if (layoutParams5 != null) {
                        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                        ((ViewGroup.MarginLayoutParams) layoutParams6).height = 0;
                        layoutParams6.bottomToBottom = 0;
                        recyclerView3.setLayoutParams(layoutParams6);
                        C55237xgE c55237xgE = c54937xaW.valueOf;
                        Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
                        ViewGroup.LayoutParams layoutParams7 = c55237xgE.getLayoutParams();
                        if (layoutParams7 != null) {
                            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                            ((ViewGroup.MarginLayoutParams) layoutParams8).height = 0;
                            layoutParams8.bottomToBottom = 0;
                            c55237xgE.setLayoutParams(layoutParams8);
                            ViewGroup.LayoutParams layoutParams9 = getLayoutParams();
                            if (layoutParams9 != null) {
                                layoutParams9.height = -1;
                                setLayoutParams(layoutParams9);
                                return;
                            }
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public final void fJNWhG() {
        if (this.AkhnZx != null) {
            EZpvd(this.AEQbTJ);
        } else if (this.DbNXlk != null) {
            copydefault(this.AEQbTJ);
        } else {
            KWHzl(this.AEQbTJ);
        }
    }

    public final void KWHzl(C54937xaW c54937xaW) {
        c54937xaW.OLrzqt.setVisibility(8);
        c54937xaW.EZpvd.setVisibility(8);
        c54937xaW.copydefault.setVisibility(8);
        c54937xaW.KWHzl.setGuidelinePercent(1.0f);
        values().EZpvd(this.AhwBna);
        C43316rmw c43316rmwAuCTel = AuCTel();
        C55277xgs c55277xgsValues = values();
        InterfaceC55196xfQ c55268xgj = this.valueOf;
        if (c55268xgj == null) {
            c55268xgj = new C55268xgj(this.AhwBna, this.zuBGHE);
        }
        c43316rmwAuCTel.register(C55276xgr.class, new ViewOnClickListenerC55272xgn(c55277xgsValues, c55268xgj, new Function2() { // from class: o.xga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55198xfS.AYXKKw(this.KWHzl, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        }));
        RecyclerView recyclerView = c54937xaW.AEQbTJ;
        recyclerView.setAdapter(values());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        copydefault(this.AYXKKw, 1);
    }

    public static final Unit AYXKKw(C55198xfS c55198xfS, int i, C55276xgr c55276xgr) {
        Function1<? super java.util.List<C55276xgr>, Unit> function1;
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        if (c55198xfS.values().OLrzqt() == Selectable.Mode.Single) {
            onGroupSelected$default(c55198xfS, c55276xgr, false, 0, 6, null);
        } else {
            java.util.List<C55276xgr> list = c55198xfS.AYXKKw;
            if (list != null && (function1 = c55198xfS.isConnected) != null) {
                java.util.Set<java.lang.Integer> setKWHzl = c55198xfS.values().KWHzl();
                Intrinsics.checkNotNullExpressionValue(setKWHzl, "");
                java.util.Set<java.lang.Integer> set = setKWHzl;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
                for (java.lang.Integer num : set) {
                    Intrinsics.copydefault(num);
                    arrayList.add(list.get(num.intValue()));
                }
                function1.invoke(arrayList);
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(C54937xaW c54937xaW) {
        java.util.List<C55276xgr> list = this.AYXKKw;
        c54937xaW.EZpvd.setVisibility(8);
        c54937xaW.AYXKKw.setVisibility(8);
        C43316rmw c43316rmwAuCTel = AuCTel();
        C55277xgs c55277xgsValues = values();
        InterfaceC55196xfQ c55273xgo = this.valueOf;
        int i = 1;
        if (c55273xgo == null) {
            c55273xgo = new C55273xgo(false, i, null);
        }
        c43316rmwAuCTel.register(C55276xgr.class, new ViewOnClickListenerC55272xgn(c55277xgsValues, c55273xgo, new Function2() { // from class: o.xgb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55198xfS.DbNXlk(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        }));
        C43316rmw c43316rmwFARcdN = fARcdN();
        C55277xgs c55277xgsFetchVPNInfo = fetchVPNInfo();
        InterfaceC55196xfQ c55273xgo2 = this.fJNWhG;
        if (c55273xgo2 == null) {
            c55273xgo2 = new C55273xgo(true);
        }
        c43316rmwFARcdN.register(C55276xgr.class, new ViewOnClickListenerC55272xgn(c55277xgsFetchVPNInfo, c55273xgo2, new Function2() { // from class: o.xfZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55198xfS.fetchVPNInfo(this.KWHzl, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        }));
        c54937xaW.AEQbTJ.setAdapter(values());
        c54937xaW.OLrzqt.setAdapter(fetchVPNInfo());
        c54937xaW.AEQbTJ.setLayoutManager(new LinearLayoutManager(getContext()));
        c54937xaW.OLrzqt.setLayoutManager(new LinearLayoutManager(getContext()));
        copydefault(list, 2);
    }

    public static final Unit DbNXlk(C55198xfS c55198xfS, int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        onGroupSelected$default(c55198xfS, c55276xgr, false, 2, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C55198xfS c55198xfS, int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        onSectionSelected$default(c55198xfS, c55198xfS.AubY, c55276xgr, null, false, 2, 12, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(C54937xaW c54937xaW) {
        java.util.List<C55276xgr> list = this.AYXKKw;
        C43316rmw c43316rmwAuCTel = AuCTel();
        C55277xgs c55277xgsValues = values();
        InterfaceC55196xfQ c55273xgo = this.valueOf;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 1;
        boolean z = false;
        if (c55273xgo == null) {
            c55273xgo = new C55273xgo(z, i, defaultConstructorMarker);
        }
        c43316rmwAuCTel.register(C55276xgr.class, new ViewOnClickListenerC55272xgn(c55277xgsValues, c55273xgo, new Function2() { // from class: o.xfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55198xfS.valueOf(this.KWHzl, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        }));
        C43316rmw c43316rmwFARcdN = fARcdN();
        C55277xgs c55277xgsFetchVPNInfo = fetchVPNInfo();
        InterfaceC55196xfQ c55273xgo2 = this.fJNWhG;
        if (c55273xgo2 == null) {
            c55273xgo2 = new C55273xgo(z, i, defaultConstructorMarker);
        }
        c43316rmwFARcdN.register(C55276xgr.class, new ViewOnClickListenerC55272xgn(c55277xgsFetchVPNInfo, c55273xgo2, new Function2() { // from class: o.xfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55198xfS.djBIcL(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        }));
        C43316rmw c43316rmwFIwbmz = fIwbmz();
        C55277xgs c55277xgsAkhnZx = AkhnZx();
        InterfaceC55196xfQ c55273xgo3 = this.gEmmrt;
        if (c55273xgo3 == null) {
            c55273xgo3 = new C55273xgo(z, i, defaultConstructorMarker);
        }
        c43316rmwFIwbmz.register(C55276xgr.class, new ViewOnClickListenerC55272xgn(c55277xgsAkhnZx, c55273xgo3, new Function2() { // from class: o.xfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55198xfS.AkhnZx(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        }));
        c54937xaW.AEQbTJ.setAdapter(values());
        c54937xaW.OLrzqt.setAdapter(fetchVPNInfo());
        c54937xaW.EZpvd.setAdapter(AkhnZx());
        this.AEQbTJ.AEQbTJ.setLayoutManager(new LinearLayoutManager(getContext()));
        this.AEQbTJ.OLrzqt.setLayoutManager(new LinearLayoutManager(getContext()));
        this.AEQbTJ.EZpvd.setLayoutManager(new LinearLayoutManager(getContext()));
        copydefault(list, 3);
    }

    public static final Unit valueOf(C55198xfS c55198xfS, int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        onGroupSelected$default(c55198xfS, c55276xgr, false, 3, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(final C55198xfS c55198xfS, int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        onSectionSelected$default(c55198xfS, c55198xfS.AubY, c55276xgr, new Function2() { // from class: o.xgc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55198xfS.copydefault(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2);
            }
        }, false, 3, 8, null);
        return Unit.INSTANCE;
    }

    public static final java.util.List copydefault(C55198xfS c55198xfS, C55276xgr c55276xgr, C55276xgr c55276xgr2) {
        if (c55276xgr != null && c55276xgr2 != null) {
            Function2<? super C55276xgr, ? super C55276xgr, ? extends java.util.List<C55276xgr>> function2 = c55198xfS.AkhnZx;
            listInvoke = function2 != null ? function2.invoke(c55276xgr, c55276xgr2) : null;
            c55198xfS.zLjUOn = listInvoke;
        }
        return listInvoke;
    }

    public static final Unit AkhnZx(C55198xfS c55198xfS, int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        onItemSelected$default(c55198xfS, c55198xfS.AubY, c55198xfS.zsXlph, c55276xgr, false, 8, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onGroupSelected$default(C55198xfS c55198xfS, C55276xgr c55276xgr, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        c55198xfS.EZpvd(c55276xgr, z, i);
    }

    public final void EZpvd(C55276xgr c55276xgr, boolean z, int i) {
        this.AubY = c55276xgr;
        Function2<? super C55276xgr, ? super C55276xgr, ? extends java.util.List<C55276xgr>> function2 = new Function2() { // from class: o.xfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C55198xfS.KWHzl(this.copydefault, (C55276xgr) obj, (C55276xgr) obj2);
            }
        };
        Function1<? super C55276xgr, ? extends java.util.List<C55276xgr>> function1 = this.DbNXlk;
        java.util.List<C55276xgr> listInvoke = function1 != null ? function1.invoke(c55276xgr) : null;
        this.fARcdN = listInvoke;
        if (listInvoke != null) {
            copydefault(fARcdN(), listInvoke);
            if (listInvoke.isEmpty()) {
                return;
            }
            this.zsXlph = null;
            int i2 = 0;
            int i3 = 0;
            for (java.lang.Object obj : listInvoke) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C55276xgr c55276xgr2 = (C55276xgr) obj;
                if (c55276xgr2.AEQbTJ()) {
                    this.zsXlph = c55276xgr2;
                    this.uzCIH = c55276xgr2;
                    i3 = i2;
                }
                fetchVPNInfo().AEQbTJ(i2, c55276xgr2.AEQbTJ());
                i2++;
            }
            C55276xgr c55276xgr3 = this.zsXlph;
            if (c55276xgr3 != null) {
                AEQbTJ(c55276xgr, c55276xgr3, function2, z, i);
            } else {
                C55276xgr c55276xgr4 = listInvoke.get(0);
                Function2<? super C55276xgr, ? super C55276xgr, ? extends java.util.List<C55276xgr>> function22 = this.AkhnZx;
                java.util.List<C55276xgr> listInvoke2 = function22 != null ? function22.invoke(c55276xgr, c55276xgr4) : null;
                if (listInvoke2 != null && !listInvoke2.isEmpty()) {
                    this.zsXlph = c55276xgr4;
                    fetchVPNInfo().AEQbTJ(0, true);
                    AEQbTJ(c55276xgr, c55276xgr4, function2, z, i);
                }
                Unit unit = Unit.INSTANCE;
            }
            this.AEQbTJ.OLrzqt.scrollToPosition(i3);
            return;
        }
        if (i > 1) {
            copydefault(fARcdN(), (java.util.List<?>) hDKMBd());
        }
        if (i > 2) {
            copydefault(fIwbmz(), (java.util.List<?>) hDKMBd());
        }
        onItemSelected$default(this, c55276xgr, null, null, z, 6, null);
    }

    public static final java.util.List KWHzl(C55198xfS c55198xfS, C55276xgr c55276xgr, C55276xgr c55276xgr2) {
        if (c55276xgr != null && c55276xgr2 != null) {
            Function2<? super C55276xgr, ? super C55276xgr, ? extends java.util.List<C55276xgr>> function2 = c55198xfS.AkhnZx;
            listInvoke = function2 != null ? function2.invoke(c55276xgr, c55276xgr2) : null;
            c55198xfS.zLjUOn = listInvoke;
        }
        return listInvoke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.xfS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onSectionSelected$default(C55198xfS c55198xfS, C55276xgr c55276xgr, C55276xgr c55276xgr2, Function2 function2, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            function2 = null;
        }
        Function2 function22 = function2;
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = 2;
        }
        c55198xfS.AEQbTJ(c55276xgr, c55276xgr2, function22, z2, i);
    }

    public final void AEQbTJ(C55276xgr c55276xgr, C55276xgr c55276xgr2, Function2<? super C55276xgr, ? super C55276xgr, ? extends java.util.List<C55276xgr>> function2, boolean z, int i) {
        java.util.List<C55276xgr> listInvoke;
        this.zsXlph = c55276xgr2;
        if (function2 != null && (listInvoke = function2.invoke(c55276xgr, c55276xgr2)) != null) {
            copydefault(fIwbmz(), listInvoke);
            if (listInvoke.isEmpty()) {
                return;
            }
            int i2 = 0;
            int i3 = 0;
            for (java.lang.Object obj : listInvoke) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                C55276xgr c55276xgr3 = (C55276xgr) obj;
                if (c55276xgr3.AEQbTJ()) {
                    this.getFieldNames = c55276xgr3;
                    i2 = i3;
                }
                AkhnZx().AEQbTJ(i3, c55276xgr3.AEQbTJ());
                i3++;
            }
            this.AEQbTJ.EZpvd.scrollToPosition(i2);
            return;
        }
        if (i > 2) {
            copydefault(fIwbmz(), (java.util.List<?>) hDKMBd());
        }
        onItemSelected$default(this, c55276xgr, c55276xgr2, null, z, 4, null);
    }

    public static /* synthetic */ void onItemSelected$default(C55198xfS c55198xfS, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c55276xgr = null;
        }
        if ((i & 2) != 0) {
            c55276xgr2 = null;
        }
        if ((i & 4) != 0) {
            c55276xgr3 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c55198xfS.OLrzqt(c55276xgr, c55276xgr2, c55276xgr3, z);
    }

    public final void OLrzqt(C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3, boolean z) {
        C55276xgr c55276xgr4 = this.getNewProxyInstance;
        if (c55276xgr4 != null) {
            c55276xgr4.copydefault(false);
        }
        if (c55276xgr != null) {
            c55276xgr.copydefault(true);
        }
        this.getNewProxyInstance = c55276xgr;
        C55276xgr c55276xgr5 = this.uzCIH;
        if (c55276xgr5 != null) {
            c55276xgr5.copydefault(false);
        }
        if (c55276xgr2 != null) {
            c55276xgr2.copydefault(true);
        }
        this.uzCIH = c55276xgr2;
        C55276xgr c55276xgr6 = this.getFieldNames;
        if (c55276xgr6 != null) {
            c55276xgr6.copydefault(false);
        }
        if (c55276xgr3 != null) {
            c55276xgr3.copydefault(true);
        }
        this.getFieldNames = c55276xgr3;
        if (z) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.hDKMBd);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yHO) it.next()).invoke(c55276xgr, c55276xgr2, c55276xgr3);
        }
    }

    public static /* synthetic */ void initSelected$default(C55198xfS c55198xfS, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        c55198xfS.copydefault((java.util.List<C55276xgr>) list, i);
    }

    public final void copydefault(java.util.List<C55276xgr> list, int i) {
        if (list != null) {
            copydefault(AuCTel(), list);
            int i2 = 0;
            int i3 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C55276xgr c55276xgr = (C55276xgr) obj;
                if (c55276xgr.AEQbTJ()) {
                    this.AubY = c55276xgr;
                    this.getNewProxyInstance = c55276xgr;
                    i3 = i2;
                }
                values().AEQbTJ(i2, c55276xgr.AEQbTJ());
                i2++;
            }
            C55276xgr c55276xgr2 = this.AubY;
            if (c55276xgr2 != null) {
                EZpvd(c55276xgr2, true, i);
            }
            this.AEQbTJ.AEQbTJ.scrollToPosition(i3);
        }
    }

    public final void copydefault(C43316rmw c43316rmw, java.util.List<?> list) {
        c43316rmw.setItems(list);
        c43316rmw.notifyDataSetChanged();
    }

    public final void setSelectionContentVisibility(C54937xaW c54937xaW, int i) {
        java.util.List<C55276xgr> list = this.AYXKKw;
        if (list != null && list.size() != 0) {
            c54937xaW.AEQbTJ.setVisibility(i);
            c54937xaW.copydefault.setVisibility(i);
        }
        java.util.List<C55276xgr> list2 = this.fARcdN;
        if (list2 != null && list2.size() != 0) {
            c54937xaW.OLrzqt.setVisibility(i);
            c54937xaW.AYXKKw.setVisibility(i);
        }
        java.util.List<C55276xgr> list3 = this.zLjUOn;
        if (list3 == null || list3.size() == 0) {
            return;
        }
        c54937xaW.EZpvd.setVisibility(i);
    }

    /* JADX INFO: renamed from: o.xfS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xfS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
