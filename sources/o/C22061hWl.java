package o;

import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22061hWl extends AbstractC31189lpN<C22031hVi, hAA> {
    public final Function2<DetailSection, java.lang.Boolean, Unit> EZpvd;

    /* JADX INFO: renamed from: o.hWl$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DetailSection.values().length];
            try {
                iArr[DetailSection.OrderInfo.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DetailSection.TradeInfo.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C22061hWl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r1v0 kotlin.jvm.functions.Function2))
 A[MD:(kotlin.jvm.functions.Function2<? super com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection, ? super java.lang.Boolean, kotlin.Unit>):void (m)] (LINE:15) call: o.hWl.<init>(kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ C22061hWl(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22061hWl(Function2<? super DetailSection, ? super java.lang.Boolean, Unit> function2) {
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hAA KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hAA haaAEQbTJ = hAA.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(haaAEQbTJ, "");
        return haaAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hAA haa, @NotNull final C22031hVi c22031hVi) {
        int i;
        Intrinsics.checkNotNullParameter(haa, "");
        Intrinsics.checkNotNullParameter(c22031hVi, "");
        super.KWHzl(haa, c22031hVi);
        android.widget.TextView textView = haa.KWHzl;
        int i2 = StateListAnimator.OLrzqt[c22031hVi.EZpvd().ordinal()];
        if (i2 == 1) {
            i = C23274hvD.Fragment.PlaybackStateCompatApi21CustomAction;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23274hvD.Fragment.send;
        }
        textView.setText(i);
        haa.copydefault.setImageDrawable(C33070mpX.KWHzl(c22031hVi.OLrzqt() ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG));
        C25352ivB.OLrzqt(haa.copydefault, 350L, (Function1<? super android.view.View, Unit>) new Function1() { // from class: o.hWp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22061hWl.KWHzl(this.AEQbTJ, c22031hVi, (android.view.View) obj);
            }
        });
        android.widget.ImageView imageView = haa.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c22031hVi.AEQbTJ() ? 0 : 8);
    }

    public static final Unit KWHzl(C22061hWl c22061hWl, C22031hVi c22031hVi, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<DetailSection, java.lang.Boolean, Unit> function2 = c22061hWl.EZpvd;
        if (function2 != null) {
            function2.invoke(c22031hVi.EZpvd(), java.lang.Boolean.valueOf(!c22031hVi.OLrzqt()));
        }
        return Unit.INSTANCE;
    }
}
