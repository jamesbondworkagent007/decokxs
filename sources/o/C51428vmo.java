package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51428vmo extends android.widget.RelativeLayout {
    public Function1<? super C51484vnr, Unit> AEQbTJ;
    public AbstractC48624uYh KWHzl;
    public final C43316rmw copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51428vmo(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51428vmo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChildClickListener(Function1<? super C51484vnr, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.vmo.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51428vmo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51428vmo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C43316rmw c43316rmw = new C43316rmw();
        this.copydefault = c43316rmw;
        setClipChildren(false);
        setClipToPadding(false);
        this.KWHzl = (AbstractC48624uYh) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.drbYRJ, this, true);
        c43316rmw.register(C51484vnr.class, new C51420vmg(new Function1() { // from class: o.vmm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51428vmo.copydefault(this.KWHzl, (C51484vnr) obj);
            }
        }));
        RecyclerView recyclerView = this.KWHzl.KWHzl;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
        recyclerView.addItemDecoration(new C57584ylF(4, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null)));
        recyclerView.setAdapter(c43316rmw);
    }

    public static final Unit copydefault(C51428vmo c51428vmo, C51484vnr c51484vnr) {
        Intrinsics.checkNotNullParameter(c51484vnr, "");
        Function1<? super C51484vnr, Unit> function1 = c51428vmo.AEQbTJ;
        if (function1 != null) {
            function1.invoke(c51484vnr);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull C51938vwU c51938vwU) {
        Intrinsics.checkNotNullParameter(c51938vwU, "");
        AppCompatTextView appCompatTextView = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c51938vwU.EZpvd()) ^ true ? 0 : 8);
        this.KWHzl.EZpvd.setText(c51938vwU.EZpvd());
        C33064mpR.OLrzqt(this.copydefault, (java.util.List<? extends java.lang.Object>) c51938vwU.KWHzl());
    }
}
