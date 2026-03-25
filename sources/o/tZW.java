package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.productmatrix.api.bean.Product;
import com.okinc.productmatrix.api.bean.ProductGroup;
import com.okinc.productmatrix.api.bean.ProductMatrixScene;
import com.okinc.productmatrix.api.bean.ProductType;
import com.okinc.productmatrix.api.bean.StringPair;
import com.okinc.productmatrix.biz.bean.ProductMatrixInfo;
import com.okinc.productmatrix.biz.bean.ProductUpdateReq;
import com.okinc.productmatrix.biz.net.ProductMatrixApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tZW {
    public static final tZW OLrzqt = new tZW();

    private tZW() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.okinc.productmatrix.api.bean.ProductGroup */
    /* JADX WARN: Multi-variable type inference failed */
    public final ProductMatrixInfo AEQbTJ(@NotNull ProductMatrixInfo productMatrixInfo) {
        java.lang.String groupName;
        Intrinsics.checkNotNullParameter(productMatrixInfo, "");
        java.util.List<ProductGroup> productGroups = productMatrixInfo.getProductGroups();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Map<java.lang.Integer, java.lang.Boolean> mapOLrzqt = tZS.AEQbTJ.OLrzqt();
        for (ProductGroup productGroup : productGroups) {
            if (C33129mqd.KWHzl((java.util.Collection) productGroup.getProducts())) {
                java.util.List<Product> products = productGroup.getProducts();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : products) {
                    Product product = (Product) obj;
                    ProductType productTypeValueOf = ProductType.CREATOR.valueOf(product.getActionType());
                    java.lang.Boolean bool = mapOLrzqt.get(java.lang.Integer.valueOf(product.getProductId()));
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                    boolean z = zBooleanValue && (product.getModuleName().length() > 0) && ((productTypeValueOf == ProductType.NATIVE_ROUTE || productTypeValueOf == ProductType.WEB_LINK) ? C33129mqd.OLrzqt((java.lang.CharSequence) product.getActionPath()) : true);
                    if (zBooleanValue) {
                        arrayList.add(java.lang.Integer.valueOf(product.getProductId()));
                    }
                    if (z) {
                        arrayList3.add(obj);
                    }
                }
                if (C33129mqd.KWHzl((java.util.Collection) arrayList3)) {
                    arrayList2.add(new ProductGroup(productGroup.getGroupName(), productGroup.getGroupId(), false, (java.util.List) arrayList3, 4, (DefaultConstructorMarker) null));
                }
            }
        }
        ProductGroup personalProducts = productMatrixInfo.getPersonalProducts();
        ProductGroup productGroup2 = new ProductGroup((personalProducts == null || (groupName = personalProducts.getGroupName()) == null) ? "" : groupName, personalProducts != null ? personalProducts.getGroupId() : -1, personalProducts != null ? personalProducts.getEditable() : false, (java.util.List) null, 8, (DefaultConstructorMarker) null);
        if (personalProducts != null && C33129mqd.KWHzl((java.util.Collection) personalProducts.getProducts())) {
            java.util.List<Product> products2 = personalProducts.getProducts();
            java.util.List arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : products2) {
                if (arrayList.contains(java.lang.Integer.valueOf(((Product) obj2).getProductId()))) {
                    arrayList4.add(obj2);
                }
            }
            if (arrayList4.size() > 8) {
                arrayList4 = arrayList4.subList(0, 8);
            }
            if (C33129mqd.KWHzl((java.util.Collection) arrayList4)) {
                productGroup2.setProducts(arrayList4);
            }
        }
        return new ProductMatrixInfo(productGroup2, arrayList2);
    }

    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.Integer> list, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super java.lang.Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C58156yvv.EZpvd(ProductMatrixApiService.Companion.OLrzqt().updateUseCenterPersonalProduct(new ProductUpdateReq(list)), lifecycleOwner));
        final Function1 function12 = new Function1() { // from class: o.tZU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tZW.EZpvd(function0, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.tZX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                tZW.OLrzqt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.uaa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tZW.OLrzqt(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tZY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                tZW.gEmmrt(function13, obj);
            }
        });
    }

    public static final Unit EZpvd(Function0 function0, ResponseData responseData) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final AbstractC58185ywX<ProductMatrixInfo> copydefault(@NotNull CacheStrategy cacheStrategy, @NotNull ProductMatrixScene productMatrixScene, java.util.List<StringPair> list, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        Intrinsics.checkNotNullParameter(productMatrixScene, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C58156yvv.OLrzqt(ProductMatrixApiService.Companion.OLrzqt().getMatrixProducts(cacheStrategy.name(), productMatrixScene.getScene(), KWHzl(list)), lifecycleOwner, Lifecycle.Event.ON_DESTROY), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.tZV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tZW.KWHzl((ProductMatrixInfo) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.tZT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return tZW.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C33024moe.KWHzl(abstractC58185ywXAEQbTJ);
    }

    public static final ProductMatrixInfo EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ProductMatrixInfo) function1.invoke(obj);
    }

    public static final ProductMatrixInfo KWHzl(ProductMatrixInfo productMatrixInfo) {
        Intrinsics.checkNotNullParameter(productMatrixInfo, "");
        return OLrzqt.AEQbTJ(productMatrixInfo);
    }

    public final java.util.Map<java.lang.String, java.lang.String> KWHzl(java.util.List<StringPair> list) {
        if (list == null || list.isEmpty()) {
            return new java.util.HashMap();
        }
        java.util.HashMap map = new java.util.HashMap(list.size());
        for (StringPair stringPair : list) {
            map.put(stringPair.getName(), stringPair.getValue());
        }
        return map;
    }
}
