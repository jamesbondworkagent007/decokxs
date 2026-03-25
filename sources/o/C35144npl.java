package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.data.BigDataTimeIntervalItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35144npl extends ConstraintLayout {
    public java.util.ArrayList<BigDataTimeIntervalItem> AEQbTJ;
    public C43316rmw EZpvd;
    public java.lang.String KWHzl;
    public RecyclerView OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeSelectCallBack(Function1<? super java.lang.String, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35144npl(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "KDataSelectTabView";
        this.AEQbTJ = new java.util.ArrayList<>();
        copydefault(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35144npl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "KDataSelectTabView";
        this.AEQbTJ = new java.util.ArrayList<>();
        copydefault(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35144npl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "KDataSelectTabView";
        this.AEQbTJ = new java.util.ArrayList<>();
        copydefault(context, attributeSet);
    }

    public final void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        AEQbTJ(context);
    }

    private final void AEQbTJ(android.content.Context context) {
        android.view.View.inflate(context, qZH.ActionBar.ORWKdN, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(qZH.StateListAnimator.nriSR);
        this.OLrzqt = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(C33047mpA.OLrzqt(context));
        }
        C43316rmw c43316rmw = new C43316rmw();
        this.EZpvd = c43316rmw;
        c43316rmw.register(BigDataTimeIntervalItem.class, new C34848nkG(new Function2() { // from class: o.npi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C35144npl.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
            }
        }));
        RecyclerView recyclerView2 = this.OLrzqt;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.EZpvd);
        }
        C43316rmw c43316rmw2 = this.EZpvd;
        if (c43316rmw2 != null) {
            c43316rmw2.setItems(this.AEQbTJ);
        }
    }

    public static final Unit copydefault(C35144npl c35144npl, int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i < 0) {
            return Unit.INSTANCE;
        }
        int i2 = 0;
        for (java.lang.Object obj : c35144npl.AEQbTJ) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ((BigDataTimeIntervalItem) obj).setSelect(i2 == i);
            i2++;
        }
        C43316rmw c43316rmw = c35144npl.EZpvd;
        if (c43316rmw != null) {
            c43316rmw.notifyDataSetChanged();
        }
        Function1<? super java.lang.String, Unit> function1 = c35144npl.copydefault;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public final void setData(@NotNull java.util.ArrayList<BigDataTimeIntervalItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AEQbTJ = arrayList;
        C43316rmw c43316rmw = this.EZpvd;
        if (c43316rmw != null) {
            c43316rmw.setItems(arrayList);
        }
        C43316rmw c43316rmw2 = this.EZpvd;
        if (c43316rmw2 != null) {
            c43316rmw2.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.npl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTimeSelectCallBack$default(C35144npl c35144npl, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        c35144npl.setTimeSelectCallBack(function1);
    }
}
