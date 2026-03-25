package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C26526jdw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jbX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C26395jbX<T extends C26526jdw> extends AbstractC27118jpE<T, C23760iIh> {
    public final Function1<T, Unit> KWHzl;
    public final java.lang.Integer OLrzqt;
    public final Function0<android.app.Activity> copydefault;

    @Override // o.AbstractC27118jpE
    public /* synthetic */ void OLrzqt(C27120jpG c27120jpG, java.lang.Object obj) {
        KWHzl((C27120jpG<C23760iIh>) c27120jpG, (C26526jdw) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends android.app.Activity> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T extends o.jdw, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26395jbX(@NotNull Function0<? extends android.app.Activity> function0, @NotNull Function1<? super T, Unit> function1, java.lang.Integer num) {
        super(CommonProductItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function0;
        this.KWHzl = function1;
        this.OLrzqt = num;
    }

    public static final Unit OLrzqt(C26395jbX c26395jbX, C26526jdw c26526jdw) {
        c26395jbX.KWHzl.invoke(c26526jdw);
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull C27120jpG<C23760iIh> c27120jpG, @NotNull final T t) {
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(t, "");
        copydefault((C23760iIh) c27120jpG.KWHzl(), t, new Function0() { // from class: o.jbW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26395jbX.OLrzqt(this.AEQbTJ, t);
            }
        });
    }

    public void copydefault(@NotNull C23760iIh c23760iIh, @NotNull T t, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(c23760iIh, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(function0, "");
        java.lang.Integer num = this.OLrzqt;
        if (num != null) {
            int iIntValue = num.intValue();
            android.content.Context context = c23760iIh.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(iIntValue, context);
            ConstraintLayout root = c23760iIh.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setPadding(iOLrzqt, root.getPaddingTop(), iOLrzqt, root.getPaddingBottom());
        }
        c23760iIh.KWHzl.setData(t, this.copydefault, new Function1() { // from class: o.jbV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26395jbX.AEQbTJ(function0, (C26526jdw) obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function0 function0, C26526jdw c26526jdw) {
        Intrinsics.checkNotNullParameter(c26526jdw, "");
        function0.invoke();
        return Unit.INSTANCE;
    }
}
