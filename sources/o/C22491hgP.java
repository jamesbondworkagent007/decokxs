package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.FaqSwapBean;
import com.okinc.business.dexlogic.bean.SimpleFaqArticle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hgP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22491hgP extends AbstractC33073mpa {
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<SimpleFaqArticle>>> EZpvd = new MutableLiveData<>();
    public MutableLiveData<java.lang.Boolean> KWHzl = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<SimpleFaqArticle>>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.KWHzl;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.KWHzl.setValue(java.lang.Boolean.TRUE);
        AbstractC58185ywX<FaqSwapBean> abstractC58185ywXAEQbTJ = C22380heK.OLrzqt.copydefault(str).AkhnZx().AEQbTJ(str4, str2, str3);
        final Function1 function1 = new Function1() { // from class: o.hgS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22491hgP.EZpvd(this.OLrzqt, (FaqSwapBean) obj);
            }
        };
        InterfaceC58227yxM<? super FaqSwapBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hgO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22491hgP.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hgQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22491hgP.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hgR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22491hgP.OLrzqt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, call());
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C22491hgP c22491hgP, FaqSwapBean faqSwapBean) {
        MutableLiveData<java.lang.Boolean> mutableLiveData = c22491hgP.KWHzl;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        mutableLiveData.setValue(bool);
        if (C33129mqd.KWHzl((java.util.Collection) faqSwapBean.getSimpleFaqArticles())) {
            MutableLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<SimpleFaqArticle>>> mutableLiveData2 = c22491hgP.EZpvd;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            java.util.List<SimpleFaqArticle> simpleFaqArticles = faqSwapBean.getSimpleFaqArticles();
            Intrinsics.copydefault(simpleFaqArticles);
            mutableLiveData2.setValue(C56390yDp.OLrzqt(bool2, simpleFaqArticles));
        } else {
            c22491hgP.EZpvd.setValue(C56390yDp.OLrzqt(bool, new java.util.ArrayList()));
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C22491hgP c22491hgP, java.lang.Throwable th) {
        MutableLiveData<java.lang.Boolean> mutableLiveData = c22491hgP.KWHzl;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        mutableLiveData.setValue(bool);
        c22491hgP.EZpvd.setValue(C56390yDp.OLrzqt(bool, new java.util.ArrayList()));
        C55328xhq.show$default(C55328xhq.OLrzqt, th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }
}
