package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hbL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22222hbL extends ConstraintLayout {
    public final C21633hGp EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22222hbL(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:13) call: o.hbL.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C22222hbL(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22222hbL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21633hGp c21633hGpKWHzl = C21633hGp.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21633hGpKWHzl, "");
        this.EZpvd = c21633hGpKWHzl;
    }

    public static /* synthetic */ void updateData$default(C22222hbL c22222hbL, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c22222hbL.AEQbTJ(list, str);
    }

    public static final java.lang.CharSequence copydefault(int i) {
        return C33070mpX.AYXKKw(i);
    }

    public final void AEQbTJ(@NotNull java.util.List<C20064gZo> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((C20064gZo) it.next()).djBIcL().getStrRes()));
        }
        this.EZpvd.valueOf.setText(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.OqFWZa(arrayList), ",", null, null, 0, null, new Function1() { // from class: o.hbM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22222hbL.copydefault(((java.lang.Integer) obj).intValue());
            }
        }, 30, null));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C20064gZo) it2.next()).AEQbTJ());
        }
        this.EZpvd.AhwBna.setText(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.OqFWZa(arrayList2), ",", null, null, 0, null, null, 62, null));
        this.EZpvd.djBIcL.setText(C23322hvz.toLocalizedNumber$default(java.lang.String.valueOf(list.size()), false, (RoundingMode) null, false, false, 15, (java.lang.Object) null));
        AppCompatTextView appCompatTextView = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(str.length() > 0 ? 0 : 8);
        this.EZpvd.OLrzqt.setText(str);
    }
}
