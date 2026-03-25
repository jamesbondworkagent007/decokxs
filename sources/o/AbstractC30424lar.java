package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.kYY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30424lar<T extends kYY, VB extends ViewBinding> extends AbstractC31189lpN<T, VB> {
    public final Function1<DexMultiTokenInfoBean, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC30424lar(@NotNull Function1<? super DexMultiTokenInfoBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull VB vb, @NotNull final T t) {
        Intrinsics.checkNotNullParameter(vb, "");
        Intrinsics.checkNotNullParameter(t, "");
        vb.getRoot().setTag(t.EZpvd());
        C25352ivB.setOnDoubleCheckClickListener$default(vb.getRoot(), 0L, new Function1() { // from class: o.lax
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC30424lar.OLrzqt(t, this, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(kYY kyy, AbstractC30424lar abstractC30424lar, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (kyy.KWHzl()) {
            java.lang.Object tag = view.getTag();
            DexMultiTokenInfoBean dexMultiTokenInfoBean = tag instanceof DexMultiTokenInfoBean ? (DexMultiTokenInfoBean) tag : null;
            if (dexMultiTokenInfoBean != null) {
                abstractC30424lar.OLrzqt.invoke(dexMultiTokenInfoBean);
            }
        } else {
            C55326xho.toast$default(kyy.AEQbTJ(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.CharSequence EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int iIndexOf$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() == 0 || (iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, true, 2, (java.lang.Object) null)) == -1) {
            return str;
        }
        java.lang.String strSubstring = str.substring(iIndexOf$default, str2.length() + iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return C24324ibg.addSpanWithColor$default(C24324ibg.addBackgroundColor$default(C24324ibg.Companion.KWHzl(str), strSubstring, C25382ivf.KWHzl(C52761wXj.Activity.fkESqH), 0, 4, null), strSubstring, C25382ivf.KWHzl(C52761wXj.Activity.QVsKAR), 0, 4, null).AEQbTJ();
    }
}
