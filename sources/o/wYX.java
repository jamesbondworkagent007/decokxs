package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.chips.OKSelectionChipGroup$gridLayoutManager$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYX extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public ActionBar AYXKKw;
    public TaskDescription AhwBna;
    public final wYU EZpvd;
    public final C54966xaz OLrzqt;
    public final OKSelectionChipGroup$gridLayoutManager$1 copydefault;
    public wYW djBIcL;
    public java.util.List<wYO> valueOf;

    public interface ActionBar {
        void OLrzqt(@NotNull wYS wys);
    }

    public interface TaskDescription {
        void copydefault(@NotNull wYS wys, @NotNull wYO wyo, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wYX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<wYO> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.wYX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wYX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: androidx.recyclerview.widget.RecyclerView */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager, com.okinc.uilab.chips.OKSelectionChipGroup$gridLayoutManager$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public wYX(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54966xaz c54966xazKWHzl = C54966xaz.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54966xazKWHzl, "");
        this.OLrzqt = c54966xazKWHzl;
        ?? r0 = new GridLayoutManager(context) { // from class: com.okinc.uilab.chips.OKSelectionChipGroup$gridLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        this.copydefault = r0;
        wYU wyu = new wYU(3);
        this.EZpvd = wyu;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.dYepVG);
        try {
            setColumnCount(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.adevsa, 2));
            typedArrayObtainStyledAttributes.recycle();
            RecyclerView recyclerView = c54966xazKWHzl.OLrzqt;
            recyclerView.setLayoutManager(r0);
            recyclerView.setAdapter(wyu);
            this.AEQbTJ = 2;
            this.valueOf = yDY.AhwBna();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setColumnCount(int i) {
        if (i < 2 || i > 4) {
            return;
        }
        this.AEQbTJ = i;
        setSpanCount(i);
        wYW wyw = this.djBIcL;
        if (wyw != null) {
            this.OLrzqt.OLrzqt.removeItemDecoration(wyw);
        }
        int i2 = this.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wYW wyw2 = new wYW(i2, C55298xhM.OLrzqt(8, context));
        this.OLrzqt.OLrzqt.addItemDecoration(wyw2);
        this.djBIcL = wyw2;
    }

    public final void setSelectionChipBeans(@NotNull java.util.List<wYO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf = list;
        this.EZpvd.EZpvd(list);
    }

    public final void setOnChipClickListener(ActionBar actionBar) {
        this.AYXKKw = actionBar;
        this.EZpvd.AEQbTJ(actionBar);
    }

    public final void setOnChipSelectionChangeListener(TaskDescription taskDescription) {
        this.AhwBna = taskDescription;
        this.EZpvd.OLrzqt(taskDescription);
    }

    public final java.util.List<wYS> EZpvd() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int childCount = this.OLrzqt.OLrzqt.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = this.OLrzqt.OLrzqt.getChildAt(i);
            if ((childAt instanceof wYS) && ((wYS) childAt).isSelected()) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wYX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
