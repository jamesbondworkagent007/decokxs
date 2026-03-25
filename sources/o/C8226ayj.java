package o;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.assets.api.model.SelectionType;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.assets.api.view.TotalAssetsUnitView$4$1$1;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import o.C8162axY;
import o.C8226ayj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8226ayj extends AppCompatTextView {
    public java.lang.String AEQbTJ;
    public final C54997xbd AYXKKw;
    public boolean AhwBna;
    public int AkhnZx;
    public final InterfaceC8161axX EZpvd;
    public final InterfaceC8218ayb KWHzl;
    public final InterfaceC8224ayh OLrzqt;
    public Activity copydefault;
    public android.graphics.drawable.Drawable[] djBIcL;
    public int fetchVPNInfo;
    public Function0<Unit> gEmmrt;
    public TaskDescription isConnected;
    public final InterfaceC46553tYp valueOf;
    public ActionBar values;

    /* JADX INFO: renamed from: o.ayj$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public interface ActionBar {
        void EZpvd(@NotNull java.lang.String str);
    }

    /* JADX INFO: renamed from: o.ayj$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public interface TaskDescription {
        void KWHzl(@NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8226ayj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8226ayj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar copydefault() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDropdownClickListener(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDropdownListUnitSelectListener(TaskDescription taskDescription) {
        this.isConnected = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnUnitChangeListener(ActionBar actionBar) {
        this.values = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPopWindowGravity(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setYOffset(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:41) call: o.ayj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C8226ayj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8226ayj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
        this.KWHzl = (InterfaceC8218ayb) C43251rlk.copydefault(InterfaceC8218ayb.class);
        this.valueOf = (InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class);
        this.EZpvd = (InterfaceC8161axX) C43251rlk.copydefault(InterfaceC8161axX.class);
        C54997xbd c54997xbd = new C54997xbd(context, null, 0, 0, 14, null);
        this.AYXKKw = c54997xbd;
        this.fetchVPNInfo = 1;
        this.AkhnZx = C55298xhM.copydefault(4.0f, context);
        this.AEQbTJ = "";
        this.djBIcL = new android.graphics.drawable.Drawable[0];
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8162axY.Application.copydefault);
        this.AhwBna = typedArrayObtainStyledAttributes.getBoolean(C8162axY.Application.EZpvd, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.AhwBna) {
            this.djBIcL = getCompoundDrawablesRelative();
            setCompoundDrawables(null, null, null, null);
        }
        setDropdownAttributes();
        setTotalAssetsUnitViewClickListener();
        this.copydefault = new Activity();
        RecyclerView recyclerView = new RecyclerView(context);
        KWHzl(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(this.copydefault);
        c54997xbd.EZpvd(recyclerView);
        c54997xbd.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.ayn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C8226ayj.AEQbTJ(this.OLrzqt);
            }
        });
        if (ViewCompat.isAttachedToWindow(this)) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
            if (lifecycleOwner != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new TotalAssetsUnitView$4$1$1(lifecycleOwner, this, null), 3, null);
                return;
            }
            return;
        }
        addOnAttachStateChangeListener(new Application(this, this));
    }

    /* JADX INFO: renamed from: o.ayj$Application */
    public static final class Application implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C8226ayj OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Application(android.view.View view, C8226ayj c8226ayj) {
            this.AEQbTJ = view;
            this.OLrzqt = c8226ayj;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ.removeOnAttachStateChangeListener(this);
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.OLrzqt);
            if (lifecycleOwner != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new TotalAssetsUnitView$4$1$1(lifecycleOwner, this.OLrzqt, null), 3, null);
            }
        }
    }

    public static final void AEQbTJ(C8226ayj c8226ayj) {
        c8226ayj.setSelected(false);
    }

    public final void EZpvd(boolean z) {
        this.AhwBna = z;
        if (z) {
            if (KWHzl()) {
                setCompoundDrawablesRelative(null, null, null, null);
                setEnabled(false);
                setClickable(false);
                return;
            } else {
                android.graphics.drawable.Drawable[] drawableArr = this.djBIcL;
                if (!(drawableArr.length == 0)) {
                    setCompoundDrawablesRelative(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
                }
                setEnabled(true);
                setClickable(true);
                return;
            }
        }
        android.graphics.drawable.Drawable[] drawableArr2 = this.djBIcL;
        if (!(drawableArr2.length == 0)) {
            setCompoundDrawablesRelative(drawableArr2[0], drawableArr2[1], drawableArr2[2], drawableArr2[3]);
        }
        setEnabled(true);
        setClickable(true);
    }

    public final boolean KWHzl() {
        return CollectionsKt___CollectionsKt.RJOkX(this.KWHzl.copydefault()) == 1;
    }

    public final boolean KWHzl(java.lang.String str) {
        java.util.ArrayList<ValuationCurrencyBean> arrayListQOLQEE = this.valueOf.QOLQEE();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListQOLQEE, 10));
        java.util.Iterator<T> it = arrayListQOLQEE.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValuationCurrencyBean) it.next()).getIsoCode());
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        java.util.Set<ValuationCurrency> setKWHzl = this.KWHzl.KWHzl();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(setKWHzl, 10));
        java.util.Iterator<T> it2 = setKWHzl.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ValuationCurrency) it2.next()).getUnit());
        }
        java.util.List listGEmmrt = yDY.gEmmrt("USD", str);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : listGEmmrt) {
            if (true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)) {
                arrayList3.add(obj);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList3) {
            if (!arrayList2.contains((java.lang.String) obj2)) {
                arrayList4.add(obj2);
            }
        }
        return setOqFWZa.size() >= 3 || !Intrinsics.EZpvd(CollectionsKt___CollectionsKt.OqFWZa(arrayList4), setOqFWZa);
    }

    public final java.util.List<C8219ayc> OLrzqt(java.util.Set<java.lang.String> set, boolean z) {
        java.util.Set<java.lang.String> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set2, 10));
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C8219ayc((java.lang.String) it.next(), SelectionType.CurrencyUnit));
        }
        java.util.List<C8219ayc> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
        if (!z) {
            return listAxsJAYsNCnLh;
        }
        java.lang.String string = getContext().getString(C8162axY.TaskDescription.isConnected);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends C8219ayc>) listAxsJAYsNCnLh, new C8219ayc(string, SelectionType.More));
    }

    public final void setTotalAssetsUnitViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: o.aym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C8226ayj.setTotalAssetsUnitViewClickListener$lambda$11(this.AEQbTJ, view);
            }
        });
    }

    public static final void setTotalAssetsUnitViewClickListener$lambda$11(C8226ayj c8226ayj, android.view.View view) {
        if (c8226ayj.isEnabled()) {
            if (c8226ayj.AYXKKw.isShowing()) {
                c8226ayj.AYXKKw.dismiss();
                return;
            }
            Function0<Unit> function0 = c8226ayj.gEmmrt;
            if (function0 != null) {
                function0.invoke();
            }
            c8226ayj.AYXKKw.showAsDropDown(c8226ayj);
            c8226ayj.setSelected(true);
        }
    }

    public final void setDropdownAttributes() {
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        c55279xgu.isConnected(ContextCompat.getColor(getContext(), C52761wXj.Activity.dHguZz));
        c55279xgu.AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
        c55279xgu.AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.invokespecialODCBUN));
        c55279xgu.copydefault(true);
        C55280xgv c55280xgv = new C55280xgv();
        android.view.View contentView = this.AYXKKw.getContentView();
        Intrinsics.checkNotNullExpressionValue(contentView, "");
        c55280xgv.KWHzl(contentView, c55279xgu);
    }

    private final void KWHzl(RecyclerView recyclerView) {
        C55279xgu c55279xgu = new C55279xgu();
        if (AppCompatDelegate.getDefaultNightMode() == 2) {
            c55279xgu.DbNXlk(ContextCompat.getColor(recyclerView.getContext(), C52761wXj.Activity.ORxRYg));
            android.content.Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55279xgu.fIwbmz(C55298xhM.OLrzqt(1, context));
        }
        c55279xgu.isConnected(ContextCompat.getColor(recyclerView.getContext(), C52761wXj.Activity.dHguZz));
        android.content.Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c55279xgu.OLrzqt(C55298xhM.EZpvd(8.0f, context2));
        new C55280xgv().KWHzl(recyclerView, c55279xgu);
    }

    public final void setCurrentUnit(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setText(str);
    }

    /* JADX INFO: renamed from: o.ayj$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public final class Activity extends RecyclerView.Adapter<StateListAnimator> {
        public java.util.List<C8219ayc> AEQbTJ = yDY.AhwBna();

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        public final void AEQbTJ(@NotNull java.util.List<C8219ayc> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
            notifyDataSetChanged();
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C8221aye c8221ayeCopydefault = C8221aye.copydefault(android.view.LayoutInflater.from(C8226ayj.this.getContext()), null, false);
            Intrinsics.checkNotNullExpressionValue(c8221ayeCopydefault, "");
            return new StateListAnimator(this, c8221ayeCopydefault);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            C56524yIo.AEQbTJ(stateListAnimator.getClass()).gEmmrt();
            stateListAnimator.KWHzl(this.AEQbTJ.get(i));
        }

        /* JADX INFO: renamed from: o.ayj$Activity$StateListAnimator */
        /* JADX INFO: loaded from: classes22.dex */
        public final class StateListAnimator extends RecyclerView.ViewHolder {
            public final /* synthetic */ Activity AEQbTJ;
            public final C8221aye KWHzl;

            /* JADX INFO: renamed from: o.ayj$Activity$StateListAnimator$Application */
            public final /* synthetic */ class Application {
                public static final /* synthetic */ int[] AEQbTJ;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[SelectionType.values().length];
                    try {
                        iArr[SelectionType.More.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    AEQbTJ = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull Activity activity, C8221aye c8221aye) {
                super(c8221aye.getRoot());
                Intrinsics.checkNotNullParameter(c8221aye, "");
                this.AEQbTJ = activity;
                this.KWHzl = c8221aye;
            }

            public final void KWHzl(@NotNull C8219ayc c8219ayc) {
                Intrinsics.checkNotNullParameter(c8219ayc, "");
                C8221aye c8221aye = this.KWHzl;
                c8221aye.EZpvd.setText(c8219ayc.OLrzqt());
                android.widget.ImageView imageView = c8221aye.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(c8219ayc.KWHzl() != SelectionType.More ? 4 : 0);
                EZpvd(c8221aye, c8219ayc);
                AEQbTJ(c8221aye, c8219ayc);
            }

            public final void EZpvd(C8221aye c8221aye, C8219ayc c8219ayc) {
                c8221aye.EZpvd.setTextColor(ContextCompat.getColor(C8226ayj.this.getContext(), (!Intrinsics.EZpvd((java.lang.Object) c8219ayc.OLrzqt(), (java.lang.Object) C8226ayj.this.AEQbTJ) || c8219ayc.KWHzl() == SelectionType.More) ? C52761wXj.Activity.QwvEab : C52761wXj.Activity.fdOvFl));
            }

            public final void AEQbTJ(C8221aye c8221aye, final C8219ayc c8219ayc) {
                ConstraintLayout root = c8221aye.getRoot();
                final C8226ayj c8226ayj = C8226ayj.this;
                root.setOnClickListener(new View.OnClickListener() { // from class: o.ayp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C8226ayj.Activity.StateListAnimator.OLrzqt(c8219ayc, c8226ayj, view);
                    }
                });
            }

            public static final void OLrzqt(C8219ayc c8219ayc, C8226ayj c8226ayj, android.view.View view) {
                SelectionType selectionTypeKWHzl = c8219ayc.KWHzl();
                if (selectionTypeKWHzl == null || Application.AEQbTJ[selectionTypeKWHzl.ordinal()] != 1) {
                    InterfaceC8224ayh interfaceC8224ayh = c8226ayj.OLrzqt;
                    android.content.Context context = c8226ayj.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    interfaceC8224ayh.OLrzqt(context, c8219ayc.OLrzqt());
                    c8226ayj.setCurrentUnit(c8219ayc.OLrzqt());
                    TaskDescription taskDescriptionEZpvd = c8226ayj.EZpvd();
                    if (taskDescriptionEZpvd != null) {
                        taskDescriptionEZpvd.KWHzl(c8219ayc.OLrzqt());
                    }
                } else {
                    c8226ayj.setSelected(false);
                    InterfaceC8224ayh interfaceC8224ayh2 = c8226ayj.OLrzqt;
                    android.content.Context context2 = c8226ayj.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    interfaceC8224ayh2.copydefault(context2);
                }
                c8226ayj.AYXKKw.dismiss();
            }
        }
    }

    public final java.util.Set<java.lang.String> copydefault(java.lang.String str, java.util.List<ValuationCurrency> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValuationCurrency) it.next()).getUnit());
        }
        java.util.Set<java.lang.String> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        java.lang.String isoCode = this.valueOf.zLjUOn().getIsoCode();
        if (setOqFWZa.contains(str)) {
            return (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "BTC") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "USDT")) ? yEJ.KWHzl(yED.AEQbTJ(isoCode), setOqFWZa) : setOqFWZa;
        }
        return yEJ.KWHzl(yED.AEQbTJ(str), setOqFWZa);
    }
}
