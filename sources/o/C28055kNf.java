package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kNf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28055kNf extends android.widget.FrameLayout {
    public InterfaceC28053kNd AEQbTJ;
    public RecyclerView.ItemDecoration EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final java.util.List<C28060kNk> OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28055kNf(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28055kNf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull InterfaceC28053kNd interfaceC28053kNd) {
        Intrinsics.checkNotNullParameter(interfaceC28053kNd, "");
        this.AEQbTJ = interfaceC28053kNd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.kNf.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28055kNf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28055kNf(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.kNi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28055kNf.KWHzl(context, this);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kNj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28055kNf.AEQbTJ(this.OLrzqt);
            }
        });
        this.OLrzqt = new java.util.ArrayList();
        KWHzl().EZpvd.setAdapter(AEQbTJ());
        setSpanCount(2);
    }

    private final C21650hHf KWHzl() {
        return (C21650hHf) this.KWHzl.getValue();
    }

    public static final C21650hHf KWHzl(android.content.Context context, C28055kNf c28055kNf) {
        return C21650hHf.copydefault(android.view.LayoutInflater.from(context), c28055kNf, true);
    }

    private final kMM AEQbTJ() {
        return (kMM) this.copydefault.getValue();
    }

    public static final kMM AEQbTJ(final C28055kNf c28055kNf) {
        C28056kNg c28056kNg = new C28056kNg(new Function1() { // from class: o.kNl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28055kNf.KWHzl(this.EZpvd, (java.lang.String) obj);
            }
        });
        kMM kmm = new kMM();
        kmm.register(C28060kNk.class, c28056kNg);
        return kmm;
    }

    public static final Unit KWHzl(C28055kNf c28055kNf, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c28055kNf.KWHzl(str, c28055kNf.OLrzqt);
        InterfaceC28053kNd interfaceC28053kNd = c28055kNf.AEQbTJ;
        if (interfaceC28053kNd != null) {
            interfaceC28053kNd.OLrzqt(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setData$default(C28055kNf c28055kNf, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c28055kNf.setData(list, str);
    }

    public final void setData(@NotNull java.util.List<C28060kNk> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(str, list);
    }

    public final void setSpanCount(int i) {
        RecyclerView recyclerView = KWHzl().EZpvd;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), i));
        recyclerView.setItemAnimator(null);
        RecyclerView.ItemDecoration itemDecoration = this.EZpvd;
        if (itemDecoration != null) {
            recyclerView.removeItemDecoration(itemDecoration);
        }
        RecyclerView.ItemDecoration itemDecorationAEQbTJ = C33047mpA.AEQbTJ(i, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        this.EZpvd = itemDecorationAEQbTJ;
        if (itemDecorationAEQbTJ != null) {
            recyclerView.addItemDecoration(itemDecorationAEQbTJ);
        }
    }

    public final void KWHzl(java.lang.String str, java.util.List<C28060kNk> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C28060kNk c28060kNk : list) {
            arrayList.add(C28060kNk.copy$default(c28060kNk, null, null, null, Intrinsics.EZpvd((java.lang.Object) c28060kNk.EZpvd(), (java.lang.Object) str), 7, null));
        }
        this.OLrzqt.clear();
        this.OLrzqt.addAll(arrayList);
        kMM.setData$default(AEQbTJ(), arrayList, null, 2, null);
    }
}
