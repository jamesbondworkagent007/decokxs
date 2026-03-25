package o;

import androidx.core.os.BundleKt;
import com.okinc.productmatrix.api.bean.Product;
import com.okinc.productmatrix.api.bean.ProductMatrixScene;
import com.okinc.productmatrix.api.bean.ProductType;
import com.okinc.productmatrix.api.bean.SceneInfo;
import com.okinc.web.WebActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tZP {
    public static final tZP EZpvd = new tZP();

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.PREDEFINED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.NATIVE_ROUTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.WEB_LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    private tZP() {
    }

    public final void OLrzqt(@NotNull android.app.Activity activity, @NotNull ProductMatrixScene productMatrixScene, @NotNull Product product, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(productMatrixScene, "");
        Intrinsics.checkNotNullParameter(product, "");
        ProductType productTypeValueOf = ProductType.CREATOR.valueOf(product.getActionType());
        int i = productTypeValueOf == null ? -1 : TaskDescription.KWHzl[productTypeValueOf.ordinal()];
        if (i == 1) {
            SceneInfo sceneInfo = new SceneInfo(productMatrixScene, product);
            tZN tznKWHzl = C48684uaN.EZpvd.KWHzl(sceneInfo);
            if (tznKWHzl != null) {
                tznKWHzl.copydefault(product, activity, bundle);
                pUU.KWHzl("HomeProductClickPerformer", "handler:" + tznKWHzl.getClass().getSimpleName() + " -->onPredefinedProductClick:" + product.getProductId());
                return;
            }
            C55326xho.toast$default("no handler support:" + sceneInfo, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                OLrzqt(product.getEventInfo());
                java.lang.String actionPath = product.getActionPath();
                Intrinsics.copydefault((java.lang.Object) actionPath);
                java.lang.String strAEQbTJ = C6813aWU.AEQbTJ(actionPath);
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", strAEQbTJ), C56390yDp.OLrzqt("title", product.getTitleName())), null, 4, null);
                pUU.KWHzl("HomeProductClickPerformer", "navigation->webUrl:" + strAEQbTJ);
                return;
            }
            C55326xho.toast$default("unknown moduleType:" + product.getActionType(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        OLrzqt(product.getEventInfo());
        java.lang.String strAEQbTJ2 = C34704nhP.copydefault.AEQbTJ();
        java.lang.String actionPath2 = product.getActionPath();
        Intrinsics.copydefault((java.lang.Object) actionPath2);
        kotlin.Pair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> pairKWHzl = C33568mys.AEQbTJ.KWHzl(C59449zhJ.replace$default(actionPath2, strAEQbTJ2 + "://", "", false, 4, (java.lang.Object) null));
        java.lang.String first = pairKWHzl.getFirst();
        java.util.Set<Map.Entry<java.lang.String, java.lang.String>> setEntrySet = pairKWHzl.getSecond().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(setEntrySet, 10)), 16));
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(activity, first, linkedHashMap, new Function1() { // from class: o.tZO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tZP.AEQbTJ((AbstractC43238rlX) obj);
            }
        });
        pUU.KWHzl("HomeProductClickPerformer", "jumpApp->path:" + first + " args:" + linkedHashMap.toString());
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        kotlin.Pair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> pairKWHzl = C33568mys.AEQbTJ.KWHzl(str);
        java.lang.String first = pairKWHzl.getFirst();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) first)) {
            C32866mlf.EZpvd(first, pairKWHzl.getSecond());
        }
    }
}
