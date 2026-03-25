package o;

import android.view.ViewGroup;
import com.okinc.business.dexui.widget.DexEmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25449iwt extends AbstractC59533zio<DexEmptyData, C25453iwx> {
    public final Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25449iwt() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:15) call: o.iwv.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:15) call: o.iwt.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C25449iwt(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: o.iwv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25449iwt.copydefault();
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public C25449iwt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C25453iwx onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21641hGx c21641hGxKWHzl = C21641hGx.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21641hGxKWHzl, "");
        return new C25453iwx(c21641hGxKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25453iwx c25453iwx, @NotNull DexEmptyData dexEmptyData) {
        Intrinsics.checkNotNullParameter(c25453iwx, "");
        Intrinsics.checkNotNullParameter(dexEmptyData, "");
        C55173xeu c55173xeu = c25453iwx.AEQbTJ().KWHzl;
        if (dexEmptyData.getEmptyType() == null) {
            c55173xeu.setImage((android.graphics.drawable.Drawable) null);
        } else {
            c55173xeu.setEmptyTypeImage(dexEmptyData.getEmptyType().intValue());
        }
        c55173xeu.setTitle(dexEmptyData.getTitle());
        c55173xeu.setSubTitle((java.lang.CharSequence) dexEmptyData.getSubTitle());
        c55173xeu.setRetry(dexEmptyData.getBtnText());
        C55173xeu root = c25453iwx.AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        if (root.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = dexEmptyData.getMarginTop();
                marginLayoutParams.bottomMargin = dexEmptyData.getMarginBottom();
                c25453iwx.AEQbTJ().getRoot().requestLayout();
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c25453iwx.AEQbTJ().KWHzl.AEQbTJ(), 0L, new Function1() { // from class: o.iwu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25449iwt.AEQbTJ(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(C25449iwt c25449iwt, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c25449iwt.copydefault.invoke();
        return Unit.INSTANCE;
    }
}
