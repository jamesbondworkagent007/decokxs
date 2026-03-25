package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.iVX;

/* JADX INFO: renamed from: o.iWp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24146iWp extends AbstractC24139iWi<iVX.Fragment> {
    public static final C24146iWp KWHzl = new C24146iWp();

    private C24146iWp() {
        super(C25493ixk.FragmentManager.fiXcQa, null, new Function2() { // from class: o.iWt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C24146iWp.KWHzl((android.view.View) obj, (iVX.Fragment) obj2);
            }
        });
    }

    public static final Unit KWHzl(android.view.View view, iVX.Fragment fragment) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c27508jwX.copydefault(context);
        return Unit.INSTANCE;
    }
}
