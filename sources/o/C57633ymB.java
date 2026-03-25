package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57633ymB extends AbstractC33602mzZ {
    public final boolean AYXKKw;
    public final float AhwBna;
    public final int KWHzl;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC33602mzZ, o.AbstractC33587mzK
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC33602mzZ
    public boolean KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC33602mzZ
    public float OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1.0f float) : (r3v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, float, int, boolean):void (m)] (LINE:24) call: o.ymB.<init>(java.lang.String, float, int, boolean):void type: THIS */
    public /* synthetic */ C57633ymB(java.lang.String str, float f, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 1.0f : f, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    public C57633ymB(java.lang.String str, float f, @androidx.annotation.ColorInt int i, boolean z) {
        super(f, z, i);
        this.gEmmrt = str;
        this.AhwBna = f;
        this.KWHzl = i;
        this.AYXKKw = z;
    }

    @Override // o.AbstractC33602mzZ
    public android.view.View AEQbTJ(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup) {
        android.view.View viewInflate;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (this.gEmmrt == null) {
            viewInflate = android.view.LayoutInflater.from(context).inflate(C32113mPz.Fragment.fIwbmz, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
        } else {
            viewInflate = android.view.LayoutInflater.from(context).inflate(C32113mPz.Fragment.ejfBZ, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
        }
        ((android.widget.TextView) viewInflate.findViewById(C32113mPz.FragmentManager.gGvvIC)).setText(this.gEmmrt);
        return viewInflate;
    }

    @Override // o.AbstractC33587mzK
    public AbstractViewOnClickListenerC33585mzI<C33583mzG> EZpvd(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C32113mPz.Fragment.QOLQEE, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate, z);
    }

    /* JADX INFO: renamed from: o.ymB$TaskDescription */
    public static final class TaskDescription<B extends C33600mzX> extends AbstractViewOnClickListenerC33585mzI<B> {
        public android.widget.TextView AhwBna;
        public android.widget.ImageView fetchVPNInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view, boolean z) {
            super(view, z);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.iZzfmt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AhwBna = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C32113mPz.FragmentManager.fFgQHt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.fetchVPNInfo = (android.widget.ImageView) viewFindViewById2;
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(ILo/mzG;)V */
        @Override // o.AbstractViewOnClickListenerC33585mzI
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void OLrzqt(int i, @NotNull B b) {
            Intrinsics.checkNotNullParameter(b, "");
            this.AhwBna.setText(b.copydefault());
            this.AhwBna.setEnabled(b.AEQbTJ());
            if (this.AhwBna.isSelected()) {
                this.fetchVPNInfo.setVisibility(0);
            } else {
                this.fetchVPNInfo.setVisibility(4);
            }
        }
    }
}
