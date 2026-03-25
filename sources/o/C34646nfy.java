package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34646nfy extends android.widget.FrameLayout {
    public final java.util.List<C34600nfE> AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public RecyclerView.ItemDecoration OLrzqt;
    public InterfaceC34596nfA copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34646nfy(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34646nfy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull InterfaceC34596nfA interfaceC34596nfA) {
        Intrinsics.checkNotNullParameter(interfaceC34596nfA, "");
        this.copydefault = interfaceC34596nfA;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.nfy.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34646nfy(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34646nfy(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34646nfy.EZpvd(context, this);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34646nfy.EZpvd(this.OLrzqt);
            }
        });
        this.AEQbTJ = new java.util.ArrayList();
        KWHzl().EZpvd.setAdapter(EZpvd());
        setSpanCount(2);
    }

    private final C36088oOv KWHzl() {
        return (C36088oOv) this.EZpvd.getValue();
    }

    public static final C36088oOv EZpvd(android.content.Context context, C34646nfy c34646nfy) {
        return C36088oOv.KWHzl(android.view.LayoutInflater.from(context), c34646nfy, true);
    }

    private final C34632nfk EZpvd() {
        return (C34632nfk) this.KWHzl.getValue();
    }

    public static final C34632nfk EZpvd(final C34646nfy c34646nfy) {
        C34647nfz c34647nfz = new C34647nfz(new Function1() { // from class: o.nfC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34646nfy.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        });
        C34632nfk c34632nfk = new C34632nfk();
        c34632nfk.register(C34600nfE.class, c34647nfz);
        return c34632nfk;
    }

    public static final Unit KWHzl(C34646nfy c34646nfy, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c34646nfy.AEQbTJ(str, c34646nfy.AEQbTJ);
        InterfaceC34596nfA interfaceC34596nfA = c34646nfy.copydefault;
        if (interfaceC34596nfA != null) {
            interfaceC34596nfA.AEQbTJ(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setData$default(C34646nfy c34646nfy, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c34646nfy.setData(list, str);
    }

    public final void setData(@NotNull java.util.List<C34600nfE> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(str, list);
    }

    public final void setSpanCount(int i) {
        RecyclerView recyclerView = KWHzl().EZpvd;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), i));
        recyclerView.setItemAnimator(null);
        RecyclerView.ItemDecoration itemDecoration = this.OLrzqt;
        if (itemDecoration != null) {
            recyclerView.removeItemDecoration(itemDecoration);
        }
        RecyclerView.ItemDecoration itemDecorationAEQbTJ = C33047mpA.AEQbTJ(i, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        this.OLrzqt = itemDecorationAEQbTJ;
        if (itemDecorationAEQbTJ != null) {
            recyclerView.addItemDecoration(itemDecorationAEQbTJ);
        }
    }

    public final void AEQbTJ(java.lang.String str, java.util.List<C34600nfE> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C34600nfE c34600nfE : list) {
            arrayList.add(C34600nfE.copy$default(c34600nfE, null, null, null, Intrinsics.EZpvd((java.lang.Object) c34600nfE.OLrzqt(), (java.lang.Object) str), 7, null));
        }
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(arrayList);
        C34632nfk.setData$default(EZpvd(), arrayList, null, 2, null);
    }
}
