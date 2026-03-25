package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.core.glide.ImageSize;
import com.okinc.productmatrix.api.bean.Product;
import com.okinc.productmatrix.api.bean.ProductDivide;
import com.okinc.productmatrix.api.bean.ProductGroup;
import com.okinc.productmatrix.api.bean.ProductMatrixScene;
import com.okinc.productmatrix.api.bean.ProductTitle;
import com.okinc.productmatrix.api.bean.StringPair;
import com.okinc.productmatrix.biz.bean.ProductMatrixInfo;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.stateful.StatefulData;
import java.util.Collections;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48688uaR;
import o.C48709uam;
import o.C52761wXj;
import o.tZL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uam, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48709uam extends tZL implements InterfaceC33040mou {
    public boolean AkhnZx;
    public ItemTouchHelper DbNXlk;
    public final C43316rmw EZpvd;
    public AbstractC48690uaT OLrzqt;
    public final C59534zip djBIcL;
    public tZZ ejfBZ;
    public ProductMatrixInfo fARcdN;
    public boolean fetchVPNInfo;
    public final java.util.ArrayList<Product> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final int copydefault = C48688uaR.TaskDescription.KWHzl;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.uaj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48709uam.EZpvd();
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.uaw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C48709uam.copydefault());
        }
    });
    public boolean values = true;
    public long AhwBna = 600000;
    public long KWHzl = 500000;
    public final java.util.ArrayList<Product> gEmmrt = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public C48709uam() {
        java.util.ArrayList<Product> arrayList = new java.util.ArrayList<>();
        this.valueOf = arrayList;
        this.EZpvd = new C43316rmw();
        this.djBIcL = new C59534zip(arrayList);
    }

    /* JADX INFO: renamed from: o.uam$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uam.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final tZL OLrzqt(@NotNull ProductMatrixScene productMatrixScene, java.util.List<StringPair> list) {
            Intrinsics.checkNotNullParameter(productMatrixScene, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("product_matrix_scene", productMatrixScene);
            if (list != null && !list.isEmpty()) {
                StringPair[] stringPairArr = (StringPair[]) list.toArray(new StringPair[0]);
                bundle.putParcelableArrayList("extras_params", yDY.copydefault(java.util.Arrays.copyOf(stringPairArr, stringPairArr.length)));
            }
            C48709uam c48709uam = new C48709uam();
            c48709uam.setArguments(bundle);
            return c48709uam;
        }
    }

    public static final ImageSize EZpvd() {
        return ImageSize.create(C33570myu.EZpvd(C32979mnm.EZpvd.OLrzqt(), 28));
    }

    public final ImageSize gEmmrt() {
        return (ImageSize) this.AYXKKw.getValue();
    }

    public static final boolean copydefault() {
        return C33492mxV.OLrzqt();
    }

    public final boolean AYXKKw() {
        return ((java.lang.Boolean) this.isConnected.getValue()).booleanValue();
    }

    public final void copydefault(boolean z) {
        this.AkhnZx = z;
        copydefault(this.fetchVPNInfo, z);
        EZpvd(z);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (!this.AkhnZx && !this.values) {
            tZZ tzz = this.ejfBZ;
            if (tzz == null) {
                Intrinsics.gEmmrt("");
                tzz = null;
            }
            tzz.copydefault();
        }
        this.values = false;
    }

    public final ProductMatrixScene fJNWhG() {
        java.lang.Object parcelable = BundleCompat.getParcelable(requireArguments(), "product_matrix_scene", ProductMatrixScene.class);
        Intrinsics.copydefault(parcelable);
        return (ProductMatrixScene) parcelable;
    }

    public final java.util.List<StringPair> valueOf() {
        return BundleCompat.getParcelableArrayList(requireArguments(), "extras_params", StringPair.class);
    }

    public void fARcdN() {
        tZZ tzz = null;
        this.fARcdN = null;
        pUU.KWHzl("ProductMatrix", "reloadData-->");
        tZZ tzz2 = this.ejfBZ;
        if (tzz2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tzz = tzz2;
        }
        tzz.KWHzl(true);
    }

    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        boolean z = this.AkhnZx;
        if (z) {
            isConnected();
        }
        pUU.KWHzl(getTAG(), "onBackPressed-->isEditMode:" + z);
        return z;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.OLrzqt = (AbstractC48690uaT) viewDataBindingBind;
        ProductMatrixScene productMatrixSceneFJNWhG = fJNWhG();
        java.util.List<StringPair> listValueOf = valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        this.ejfBZ = new tZZ(viewLifecycleOwner, fJNWhG(), valueOf());
        pUU.KWHzl(getTAG(), "initView->scene:" + productMatrixSceneFJNWhG + " extras:" + listValueOf);
        fIwbmz();
        DbNXlk();
        values();
        C48686uaP.KWHzl.KWHzl();
    }

    public final void AEQbTJ(boolean z) {
        AbstractC48690uaT abstractC48690uaT = this.OLrzqt;
        tZQ tzq = null;
        if (abstractC48690uaT == null) {
            Intrinsics.gEmmrt("");
            abstractC48690uaT = null;
        }
        RecyclerView recyclerView = abstractC48690uaT.gEmmrt;
        if (z) {
            tzq = new tZQ();
            tzq.setRemoveDuration(200L);
            tzq.setAddDuration(200L);
            tzq.setMoveDuration(200L);
        }
        recyclerView.setItemAnimator(tzq);
    }

    private final void fIwbmz() {
        this.DbNXlk = new ItemTouchHelper(new LoaderManager());
        this.djBIcL.register(Product.class, new Application());
        AbstractC48690uaT abstractC48690uaT = this.OLrzqt;
        if (abstractC48690uaT == null) {
            Intrinsics.gEmmrt("");
            abstractC48690uaT = null;
        }
        RecyclerView recyclerView = abstractC48690uaT.gEmmrt;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4, 1, false));
        AEQbTJ(true);
        ItemTouchHelper itemTouchHelper = this.DbNXlk;
        if (itemTouchHelper == null) {
            Intrinsics.gEmmrt("");
            itemTouchHelper = null;
        }
        itemTouchHelper.attachToRecyclerView(recyclerView);
        this.djBIcL.setHasStableIds(true);
        recyclerView.setAdapter(this.djBIcL);
        this.EZpvd.register(ProductTitle.class, new Dialog());
        this.EZpvd.register(Product.class, new StateListAnimator());
        this.EZpvd.register(ProductDivide.class, new TaskDescription());
        AbstractC48690uaT abstractC48690uaT2 = this.OLrzqt;
        if (abstractC48690uaT2 == null) {
            Intrinsics.gEmmrt("");
            abstractC48690uaT2 = null;
        }
        RecyclerView recyclerView2 = abstractC48690uaT2.AEQbTJ;
        recyclerView2.setNestedScrollingEnabled(false);
        FragmentManager fragmentManager = new FragmentManager();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView2.getContext(), 4, 1, false);
        gridLayoutManager.setSpanSizeLookup(fragmentManager);
        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.addItemDecoration(new C48705uai(fragmentManager, 4, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        recyclerView2.setItemAnimator(null);
        this.EZpvd.setHasStableIds(true);
        recyclerView2.setAdapter(this.EZpvd);
    }

    /* JADX INFO: renamed from: o.uam$FragmentManager */
    public static final class FragmentManager extends GridLayoutManager.SpanSizeLookup {
        public FragmentManager() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return C48709uam.this.EZpvd.AEQbTJ(i) instanceof Product ? 1 : 4;
        }
    }

    public final void DbNXlk() {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("ev_account_login", "ev_account_logout", "ev_account_change");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXAEQbTJ, this, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.uax
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48709uam.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.uay
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C48709uam.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C48709uam c48709uam, java.lang.String str) {
        if (android.text.TextUtils.equals(str, "ev_account_change") || android.text.TextUtils.equals(str, "ev_account_logout")) {
            FragmentActivity activity = c48709uam.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            tZZ tzz = c48709uam.ejfBZ;
            if (tzz == null) {
                Intrinsics.gEmmrt("");
                tzz = null;
            }
            tzz.AEQbTJ(false);
            c48709uam.fARcdN();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.uam$Fragment */
    public static final class Fragment extends AbstractC32992mnz<ProductMatrixInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32992mnz
        public boolean KWHzl(ProductMatrixInfo productMatrixInfo) {
            Intrinsics.checkNotNullParameter(productMatrixInfo, "");
            return false;
        }

        public Fragment(C55237xgE c55237xgE, tZZ tzz, int i) {
            super(c55237xgE, tzz, i);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(ProductMatrixInfo productMatrixInfo, android.view.View view) {
            Intrinsics.checkNotNullParameter(productMatrixInfo, "");
            super.AEQbTJ(productMatrixInfo, view);
            tZL.TaskDescription taskDescription = (tZL.TaskDescription) C33062mpP.EZpvd(C48709uam.this, tZL.TaskDescription.class);
            if (taskDescription != null) {
                taskDescription.AEQbTJ(StatefulData.Status.SUCCESS, productMatrixInfo.getProductGroups());
            }
            if (!Intrinsics.EZpvd(productMatrixInfo, C48709uam.this.fARcdN) || C48709uam.this.AkhnZx) {
                C48709uam.this.fARcdN = productMatrixInfo;
                C48709uam.this.EZpvd(productMatrixInfo);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C48709uam.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void KWHzl(ProductMatrixInfo productMatrixInfo, android.view.View view) {
            super.KWHzl(productMatrixInfo, view);
            tZL.TaskDescription taskDescription = (tZL.TaskDescription) C33062mpP.EZpvd(C48709uam.this, tZL.TaskDescription.class);
            if (taskDescription != null) {
                taskDescription.AEQbTJ(StatefulData.Status.LOADING, null);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.lang.Throwable th, ProductMatrixInfo productMatrixInfo, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, productMatrixInfo, view);
            tZL.TaskDescription taskDescription = (tZL.TaskDescription) C33062mpP.EZpvd(C48709uam.this, tZL.TaskDescription.class);
            if (taskDescription != null) {
                taskDescription.AEQbTJ(StatefulData.Status.ERROR, null);
            }
            o.StateListAnimator.KWHzl(th);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C48709uam.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final void values() {
        tZZ tzz = this.ejfBZ;
        tZZ tzz2 = null;
        if (tzz == null) {
            Intrinsics.gEmmrt("");
            tzz = null;
        }
        tzz.AEQbTJ(true);
        tZZ tzz3 = this.ejfBZ;
        if (tzz3 == null) {
            Intrinsics.gEmmrt("");
            tzz3 = null;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC48690uaT abstractC48690uaT = this.OLrzqt;
        if (abstractC48690uaT == null) {
            Intrinsics.gEmmrt("");
            abstractC48690uaT = null;
        }
        C55237xgE c55237xgE = abstractC48690uaT.isConnected;
        tZZ tzz4 = this.ejfBZ;
        if (tzz4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tzz2 = tzz4;
        }
        tzz3.observe(viewLifecycleOwner, new Fragment(c55237xgE, tzz2, C52761wXj.FragmentManager.fIwbmz));
    }

    public final void EZpvd(ProductMatrixInfo productMatrixInfo) {
        this.AhwBna = 600000L;
        this.KWHzl = 500000L;
        copydefault(productMatrixInfo.getPersonalProducts());
        KWHzl(productMatrixInfo.getProductGroups());
        ProductGroup personalProducts = productMatrixInfo.getPersonalProducts();
        this.fetchVPNInfo = personalProducts != null ? personalProducts.getEditable() : false;
        copydefault(false);
    }

    public final void copydefault(ProductGroup productGroup) {
        java.util.List<Product> products;
        AbstractC48690uaT abstractC48690uaT = this.OLrzqt;
        if (abstractC48690uaT == null) {
            Intrinsics.gEmmrt("");
            abstractC48690uaT = null;
        }
        if (productGroup == null || (products = productGroup.getProducts()) == null || products.isEmpty()) {
            abstractC48690uaT.copydefault.setVisibility(8);
            abstractC48690uaT.gEmmrt.setVisibility(8);
            abstractC48690uaT.DbNXlk.setVisibility(8);
            return;
        }
        abstractC48690uaT.copydefault.setVisibility(0);
        abstractC48690uaT.gEmmrt.setVisibility(0);
        abstractC48690uaT.DbNXlk.setVisibility(0);
        abstractC48690uaT.AYXKKw.setText(productGroup.getGroupName());
        this.gEmmrt.clear();
        this.valueOf.clear();
        this.gEmmrt.addAll(productGroup.getProducts());
        this.valueOf.addAll(productGroup.getProducts());
        this.djBIcL.notifyDataSetChanged();
    }

    public final void KWHzl(java.util.List<ProductGroup> list) {
        AbstractC48690uaT abstractC48690uaT = this.OLrzqt;
        if (abstractC48690uaT == null) {
            Intrinsics.gEmmrt("");
            abstractC48690uaT = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ProductGroup productGroup : list) {
            productGroup.getGroupId();
            long j = this.KWHzl;
            this.KWHzl = 1 + j;
            arrayList.add(new ProductDivide(j));
            arrayList.add(new ProductTitle(productGroup.getGroupId(), productGroup.getGroupName()));
            java.util.Iterator<T> it = productGroup.getProducts().iterator();
            while (it.hasNext()) {
                arrayList.add((Product) it.next());
            }
        }
        this.EZpvd.AhwBna(arrayList);
        abstractC48690uaT.AEQbTJ.setVisibility(0);
    }

    public final void copydefault(boolean z, boolean z2) {
        AbstractC48690uaT abstractC48690uaT = this.OLrzqt;
        if (abstractC48690uaT == null) {
            Intrinsics.gEmmrt("");
            abstractC48690uaT = null;
        }
        if (!z) {
            abstractC48690uaT.OLrzqt.setVisibility(8);
            abstractC48690uaT.valueOf.setVisibility(8);
            return;
        }
        if (z2) {
            abstractC48690uaT.OLrzqt.setVisibility(8);
            abstractC48690uaT.valueOf.setVisibility(0);
            abstractC48690uaT.OLrzqt.setOnClickListener(null);
            abstractC48690uaT.values.setOnClickListener(new View.OnClickListener() { // from class: o.uao
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C48709uam.AEQbTJ(this.copydefault, view);
                }
            });
            abstractC48690uaT.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.uan
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C48709uam.copydefault(this.KWHzl, view);
                }
            });
            return;
        }
        abstractC48690uaT.OLrzqt.setVisibility(0);
        abstractC48690uaT.valueOf.setVisibility(8);
        abstractC48690uaT.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.uar
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48709uam.djBIcL(this.AEQbTJ, view);
            }
        });
        abstractC48690uaT.values.setOnClickListener(null);
        abstractC48690uaT.EZpvd.setOnClickListener(null);
    }

    public static final void AEQbTJ(C48709uam c48709uam, android.view.View view) {
        c48709uam.fetchVPNInfo();
    }

    public static final void copydefault(C48709uam c48709uam, android.view.View view) {
        c48709uam.isConnected();
    }

    public static final void djBIcL(C48709uam c48709uam, android.view.View view) {
        c48709uam.copydefault(true);
    }

    public final void EZpvd(boolean z) {
        if (this.OLrzqt == null) {
            Intrinsics.gEmmrt("");
        }
        if (z) {
            int size = 8 - this.valueOf.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    this.valueOf.add(AEQbTJ());
                }
            }
            this.djBIcL.notifyDataSetChanged();
            this.EZpvd.notifyDataSetChanged();
            return;
        }
        AEQbTJ(false);
        this.valueOf.clear();
        this.valueOf.addAll(this.gEmmrt);
        this.djBIcL.notifyDataSetChanged();
        this.EZpvd.notifyDataSetChanged();
        AbstractC48690uaT abstractC48690uaT = this.OLrzqt;
        if (abstractC48690uaT == null) {
            Intrinsics.gEmmrt("");
            abstractC48690uaT = null;
        }
        abstractC48690uaT.gEmmrt.postDelayed(new java.lang.Runnable() { // from class: o.uak
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C48709uam.fJNWhG(this.OLrzqt);
            }
        }, 1000L);
    }

    public static final void fJNWhG(C48709uam c48709uam) {
        c48709uam.AEQbTJ(true);
    }

    public final void fetchVPNInfo() {
        if (djBIcL()) {
            if (AkhnZx()) {
                EZpvd(new Function0() { // from class: o.uaC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C48709uam.DbNXlk(this.EZpvd);
                    }
                });
                return;
            } else {
                AuCTel();
                return;
            }
        }
        copydefault(false);
    }

    public static final Unit DbNXlk(C48709uam c48709uam) {
        c48709uam.AuCTel();
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        if (djBIcL()) {
            copydefault(new Function0() { // from class: o.uav
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C48709uam.fetchVPNInfo(this.KWHzl);
                }
            }, new Function0() { // from class: o.uat
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C48709uam.AkhnZx(this.EZpvd);
                }
            });
        } else {
            copydefault(false);
        }
    }

    public static final Unit fetchVPNInfo(C48709uam c48709uam) {
        c48709uam.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C48709uam c48709uam) {
        c48709uam.copydefault(false);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final Function0<Unit> function0) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48688uaR.Activity.copydefault));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48688uaR.Activity.KWHzl), new View.OnClickListener() { // from class: o.uau
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48709uam.gEmmrt(viewOnClickListenerC54939xaY, function0, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C48688uaR.Activity.AEQbTJ), new View.OnClickListener() { // from class: o.uas
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48709uam.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault(final Function0<Unit> function0, final Function0<Unit> function02) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48688uaR.Activity.djBIcL));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48688uaR.Activity.EZpvd), new View.OnClickListener() { // from class: o.uap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48709uam.EZpvd(viewOnClickListenerC54939xaY, function0, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C48688uaR.Activity.OLrzqt), new View.OnClickListener() { // from class: o.uaq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48709uam.OLrzqt(viewOnClickListenerC54939xaY, function02, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    public static final Unit fIwbmz(C48709uam c48709uam) {
        c48709uam.dismissLoadingWithLogo();
        pUU.EZpvd(c48709uam.getTAG(), "requestSaveModify-->end");
        tZZ tzz = c48709uam.ejfBZ;
        if (tzz == null) {
            Intrinsics.gEmmrt("");
            tzz = null;
        }
        tzz.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C48709uam c48709uam, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault(c48709uam.getTAG(), "requestSaveModify-->error");
        c48709uam.dismissLoadingWithLogo();
        o.StateListAnimator.KWHzl(th);
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence EZpvd(Product product) {
        Intrinsics.checkNotNullParameter(product, "");
        return java.lang.String.valueOf(product.getProductId());
    }

    public final boolean djBIcL() {
        if (!this.AkhnZx) {
            return false;
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.gEmmrt, ",", null, null, 0, null, new Function1() { // from class: o.uaz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48709uam.EZpvd((Product) obj);
            }
        }, 30, null);
        java.util.ArrayList<Product> arrayList = this.valueOf;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((Product) obj).getProductId() != Integer.MIN_VALUE) {
                arrayList2.add(obj);
            }
        }
        return !android.text.TextUtils.equals(strJoinToString$default, CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, new Function1() { // from class: o.uaA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C48709uam.OLrzqt((Product) obj2);
            }
        }, 30, null));
    }

    public static final java.lang.CharSequence OLrzqt(Product product) {
        Intrinsics.checkNotNullParameter(product, "");
        return java.lang.String.valueOf(product.getProductId());
    }

    public final boolean AkhnZx() {
        return this.AkhnZx && ((Product) CollectionsKt___CollectionsKt.AuCTelauCTel(this.valueOf)).getProductId() == Integer.MIN_VALUE;
    }

    public final Product AEQbTJ() {
        long j = this.AhwBna;
        this.AhwBna = 1 + j;
        return new Product(Integer.MIN_VALUE, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (com.okinc.productmatrix.api.bean.Tag) null, j, 1022, (DefaultConstructorMarker) null);
    }

    public final android.os.Bundle copydefault(Product product) {
        if (product.getProductId() != 23) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("is_product_matrix", true);
        return bundle;
    }

    /* JADX INFO: renamed from: o.uam$LoaderManager */
    /* JADX INFO: loaded from: classes19.dex */
    public final class LoaderManager extends ItemTouchHelper.SimpleCallback {
        public final InterfaceC56387yDm AEQbTJ;
        public final InterfaceC56387yDm OLrzqt;
        public final InterfaceC56387yDm copydefault;

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isItemViewSwipeEnabled() {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public LoaderManager() {
            super(51, 0);
            this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.uaH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(C48709uam.LoaderManager.copydefault(c48709uam));
                }
            });
            this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.uaJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Float.valueOf(C48709uam.LoaderManager.OLrzqt(c48709uam));
                }
            });
            this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.uaI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C48709uam.LoaderManager.valueOf(c48709uam);
                }
            });
        }

        public final int OLrzqt() {
            return ((java.lang.Number) this.OLrzqt.getValue()).intValue();
        }

        public static final int copydefault(C48709uam c48709uam) {
            return c48709uam.requireContext().getResources().getColor(C32113mPz.ActionBar.values);
        }

        public final float copydefault() {
            return ((java.lang.Number) this.copydefault.getValue()).floatValue();
        }

        public static final float OLrzqt(C48709uam c48709uam) {
            return c48709uam.requireContext().getResources().getDisplayMetrics().density;
        }

        public static final android.os.Vibrator valueOf(C48709uam c48709uam) {
            java.lang.Object systemService = c48709uam.requireContext().getSystemService("vibrator");
            Intrinsics.copydefault(systemService, "");
            return (android.os.Vibrator) systemService;
        }

        public final android.os.Vibrator KWHzl() {
            return (android.os.Vibrator) this.AEQbTJ.getValue();
        }

        public final void AEQbTJ() {
            KWHzl().vibrate(60L);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
        public int getDragDirs(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            int adapterPosition = viewHolder.getAdapterPosition();
            Product product = adapterPosition >= 0 ? (Product) CollectionsKt___CollectionsKt.AkhnZx(C48709uam.this.valueOf, adapterPosition) : null;
            if (product == null || product.getProductId() == Integer.MIN_VALUE) {
                return 0;
            }
            return super.getDragDirs(recyclerView, viewHolder);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
            Product product;
            Product product2;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if (adapterPosition < 0 || adapterPosition2 < 0 || (product = (Product) CollectionsKt___CollectionsKt.AkhnZx(C48709uam.this.valueOf, adapterPosition)) == null || (product2 = (Product) CollectionsKt___CollectionsKt.AkhnZx(C48709uam.this.valueOf, adapterPosition2)) == null || product.getProductId() == Integer.MIN_VALUE) {
                return false;
            }
            if (product2.getProductId() == Integer.MIN_VALUE) {
                java.util.ArrayList arrayList = C48709uam.this.valueOf;
                java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        adapterPosition2 = -1;
                        break;
                    }
                    if (((Product) listIterator.previous()).getProductId() != Integer.MIN_VALUE) {
                        adapterPosition2 = listIterator.nextIndex();
                        break;
                    }
                }
                if (adapterPosition2 < 0 || adapterPosition2 == adapterPosition) {
                    return false;
                }
            }
            copydefault(adapterPosition, adapterPosition2);
            AEQbTJ();
            return true;
        }

        public final void copydefault(int i, int i2) {
            Collections.swap(C48709uam.this.valueOf, i, i2);
            C48709uam.this.djBIcL.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return C48709uam.this.AkhnZx;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onChildDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            android.view.View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            int top = view.getTop();
            super.onChildDraw(canvas, recyclerView, viewHolder, C56548yJl.KWHzl(f, -view.getLeft(), (recyclerView.getWidth() - view.getWidth()) - r4), C56548yJl.KWHzl(f2, -top, (recyclerView.getHeight() - view.getHeight()) - top), i, z);
            if (z) {
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(C48688uaR.StateListAnimator.isConnected);
                view.setBackgroundColor(OLrzqt());
                imageView.setVisibility(8);
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public long getAnimationDuration(@NotNull RecyclerView recyclerView, int i, float f, float f2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            return java.lang.Math.min(300L, ((long) 150) + ((long) ((java.lang.Math.max(java.lang.Math.abs(f), java.lang.Math.abs(f2)) / copydefault()) * 0.7f)));
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            super.clearView(recyclerView, viewHolder);
            android.view.View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(C48688uaR.StateListAnimator.isConnected);
            view.setBackground(null);
            imageView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: o.uam$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public final class Application extends ActionBar<AbstractC48691uaU> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48688uaR.TaskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
            super();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC48691uaU> c43312rms, @NotNull final Product product) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(product, "");
            ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
            C48709uam c48709uam = C48709uam.this;
            AbstractC48691uaU abstractC48691uaU = (AbstractC48691uaU) viewDataBindingOLrzqt;
            abstractC48691uaU.KWHzl(true);
            abstractC48691uaU.AEQbTJ(c48709uam.AkhnZx && product.getProductId() != Integer.MIN_VALUE);
            super.onBindViewHolder((C43312rms) c43312rms, product);
            abstractC48691uaU.copydefault.setContentDescription("userCenterItem" + product.getProductId());
            android.widget.ImageView imageView = abstractC48691uaU.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            AppCompatTextView appCompatTextView = abstractC48691uaU.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            KWHzl(product, imageView, appCompatTextView);
            C55251xgS c55251xgS = abstractC48691uaU.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            OLrzqt(c55251xgS, product.getTag(), c48709uam.AkhnZx);
            if (c48709uam.AkhnZx) {
                c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.uaL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C48709uam.Application.AEQbTJ(this.KWHzl, product, view);
                    }
                });
            } else {
                android.view.View view = c43312rms.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                OLrzqt(view, product, c48709uam.copydefault(product), true);
            }
            if (product.getProductId() != Integer.MIN_VALUE) {
                abstractC48691uaU.copydefault.setForeground(C33070mpX.KWHzl(C52761wXj.TaskDescription.dvKsVJ));
            } else {
                abstractC48691uaU.copydefault.setForeground(null);
            }
        }

        public static final void AEQbTJ(Application application, Product product, android.view.View view) {
            application.AYXKKw(product);
        }

        private final void AYXKKw(Product product) {
            int iKWHzl;
            if (!OLrzqt(product) || (iKWHzl = KWHzl(product)) == -1) {
                return;
            }
            C48709uam.this.djBIcL.notifyItemRangeChanged(iKWHzl, C48709uam.this.valueOf.size());
            AEQbTJ(product);
        }
    }

    /* JADX INFO: renamed from: o.uam$Dialog */
    /* JADX INFO: loaded from: classes19.dex */
    public final class Dialog extends AbstractC43310rmq<ProductTitle, AbstractC48696uaZ> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48688uaR.TaskDescription.OLrzqt;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public long getItemId(@NotNull ProductTitle productTitle) {
            Intrinsics.checkNotNullParameter(productTitle, "");
            return C33129mqd.valueOf(java.lang.Integer.valueOf(productTitle.getGroupId()));
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC48696uaZ> c43312rms, @NotNull ProductTitle productTitle) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(productTitle, "");
            super.onBindViewHolder((C43312rms) c43312rms, productTitle);
            ((AbstractC48696uaZ) c43312rms.OLrzqt()).copydefault.setText(productTitle.getGroupName());
        }
    }

    /* JADX INFO: renamed from: o.uam$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public final class StateListAnimator extends ActionBar<AbstractC48691uaU> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48688uaR.TaskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
            super();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC48691uaU> c43312rms, @NotNull final Product product) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(product, "");
            ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
            C48709uam c48709uam = C48709uam.this;
            AbstractC48691uaU abstractC48691uaU = (AbstractC48691uaU) viewDataBindingOLrzqt;
            abstractC48691uaU.AEQbTJ(c48709uam.AkhnZx);
            abstractC48691uaU.KWHzl(OLrzqt(product));
            super.onBindViewHolder((C43312rms) c43312rms, product);
            abstractC48691uaU.copydefault.setContentDescription("userCenterItem" + product.getProductId());
            android.widget.ImageView imageView = abstractC48691uaU.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            AppCompatTextView appCompatTextView = abstractC48691uaU.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            KWHzl(product, imageView, appCompatTextView);
            C55251xgS c55251xgS = abstractC48691uaU.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            OLrzqt(c55251xgS, product.getTag(), c48709uam.AkhnZx);
            if (c48709uam.AkhnZx) {
                c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.uaK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C48709uam.StateListAnimator.KWHzl(this.KWHzl, product, view);
                    }
                });
                return;
            }
            android.view.View view = c43312rms.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            OLrzqt(view, product, c48709uam.copydefault(product), false);
        }

        public static final void KWHzl(StateListAnimator stateListAnimator, Product product, android.view.View view) {
            stateListAnimator.valueOf(product);
        }

        public final void valueOf(Product product) {
            if (OLrzqt(product)) {
                int iKWHzl = KWHzl(product);
                if (iKWHzl != -1) {
                    C48709uam.this.djBIcL.notifyItemRangeChanged(iKWHzl, C48709uam.this.valueOf.size());
                    AEQbTJ(product);
                    return;
                }
                return;
            }
            if (!AhwBna()) {
                int iCopydefault = copydefault(product);
                if (iCopydefault != -1) {
                    C48709uam.this.djBIcL.notifyItemRangeChanged(iCopydefault, C48709uam.this.valueOf.size());
                    AEQbTJ(product);
                    return;
                }
                return;
            }
            C55326xho.toast$default(C33069mpW.copydefault(C48709uam.this, C48688uaR.Activity.valueOf, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, 8))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public final java.lang.String AYXKKw(Product product) {
        java.lang.String darkIconUrl = AYXKKw() ? product.getDarkIconUrl() : product.getLightIconUrl();
        java.lang.String strKWHzl = C55297xhL.KWHzl(darkIconUrl, gEmmrt().getWidth(), gEmmrt().getHeight());
        return strKWHzl == null ? darkIconUrl : strKWHzl;
    }

    @Override // o.tZL
    public void EZpvd(@NotNull Product product, @NotNull android.widget.ImageView imageView, @NotNull ImageSize imageSize, android.graphics.drawable.Drawable drawable, RY<android.graphics.Bitmap> ry) {
        Intrinsics.checkNotNullParameter(product, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(imageSize, "");
        Glide.AEQbTJ(imageView.getContext()).EZpvd().copydefault(AYXKKw(product)).AEQbTJ(drawable).copydefault(imageSize.getWidth(), imageSize.getHeight()).OLrzqt((RY) ry).EZpvd(imageView);
    }

    /* JADX INFO: renamed from: o.uam$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public final class TaskDescription extends AbstractC43310rmq<ProductDivide, AbstractC48696uaZ> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48688uaR.TaskDescription.EZpvd;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public long getItemId(@NotNull ProductDivide productDivide) {
            Intrinsics.checkNotNullParameter(productDivide, "");
            return productDivide.getGroupId();
        }
    }

    /* JADX INFO: renamed from: o.uam$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public abstract class ActionBar<VDB extends ViewDataBinding> extends AbstractC43310rmq<Product, VDB> {
        public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.uaE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48709uam.ActionBar.copydefault();
            }
        });
        public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uaD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48709uam.ActionBar.KWHzl();
            }
        });

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        public static final android.graphics.drawable.Drawable copydefault() {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C48688uaR.ActionBar.copydefault);
            Intrinsics.copydefault(drawableKWHzl);
            return drawableKWHzl;
        }

        public final android.graphics.drawable.Drawable AYXKKw() {
            return (android.graphics.drawable.Drawable) this.AEQbTJ.getValue();
        }

        public static final android.graphics.drawable.Drawable KWHzl() {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C48688uaR.ActionBar.KWHzl);
            Intrinsics.copydefault(drawableKWHzl);
            return drawableKWHzl;
        }

        public final android.graphics.drawable.Drawable AEQbTJ() {
            return (android.graphics.drawable.Drawable) this.EZpvd.getValue();
        }

        /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public long getItemId(@NotNull Product product) {
            Intrinsics.checkNotNullParameter(product, "");
            return product.getProductId() == Integer.MIN_VALUE ? product.getEmptyProductItemId() : C33129mqd.valueOf(java.lang.Integer.valueOf(product.getProductId()));
        }

        public final void KWHzl(@NotNull Product product, @NotNull android.widget.ImageView imageView, @NotNull AppCompatTextView appCompatTextView) {
            Intrinsics.checkNotNullParameter(product, "");
            Intrinsics.checkNotNullParameter(imageView, "");
            Intrinsics.checkNotNullParameter(appCompatTextView, "");
            appCompatTextView.setText(product.getModuleName());
            if (product.getProductId() != Integer.MIN_VALUE) {
                C48709uam c48709uam = C48709uam.this;
                ImageSize imageSizeGEmmrt = c48709uam.gEmmrt();
                Intrinsics.checkNotNullExpressionValue(imageSizeGEmmrt, "");
                tZL.loadIconByProduct$default(c48709uam, product, imageView, imageSizeGEmmrt, AYXKKw(), null, 16, null);
                return;
            }
            imageView.setImageDrawable(AEQbTJ());
        }

        public final void OLrzqt(@NotNull C55251xgS c55251xgS, com.okinc.productmatrix.api.bean.Tag tag, boolean z) {
            Intrinsics.checkNotNullParameter(c55251xgS, "");
            if (tag != null && C33129mqd.OLrzqt((java.lang.CharSequence) tag.getText()) && !z) {
                c55251xgS.setVisibility(0);
                c55251xgS.setText(tag.getText());
            } else {
                c55251xgS.setVisibility(8);
                c55251xgS.setText((java.lang.CharSequence) null);
            }
        }

        public final void OLrzqt(@NotNull final android.view.View view, @NotNull final Product product, final android.os.Bundle bundle, final boolean z) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(product, "");
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(view).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
            final C48709uam c48709uam = C48709uam.this;
            abstractC58247yxgThrottleFirst.subscribe(new InterfaceC58227yxM() { // from class: o.uaF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C48709uam.ActionBar.copydefault(c48709uam, product, bundle, view, z, obj);
                }
            });
        }

        public static final void copydefault(C48709uam c48709uam, Product product, android.os.Bundle bundle, android.view.View view, boolean z, java.lang.Object obj) {
            tZP tzp = tZP.EZpvd;
            FragmentActivity fragmentActivityRequireActivity = c48709uam.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            tzp.OLrzqt(fragmentActivityRequireActivity, c48709uam.fJNWhG(), product, bundle);
            C48686uaP.KWHzl.copydefault(product.getProductId());
            tZL.StateListAnimator stateListAnimator = (tZL.StateListAnimator) C33062mpP.EZpvd(c48709uam, tZL.StateListAnimator.class);
            if (stateListAnimator != null) {
                stateListAnimator.AEQbTJ(product, view, z);
            }
        }

        public final boolean OLrzqt(@NotNull Product product) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(product, "");
            if (product.getProductId() == Integer.MIN_VALUE) {
                return false;
            }
            java.util.Iterator it = C48709uam.this.valueOf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Product) next).getProductId() == product.getProductId()) {
                    break;
                }
            }
            return ((Product) next) != null;
        }

        public final int KWHzl(@NotNull Product product) {
            Intrinsics.checkNotNullParameter(product, "");
            int iIndexOf = C48709uam.this.valueOf.indexOf(product);
            if (iIndexOf < 0 || iIndexOf >= C48709uam.this.valueOf.size()) {
                return -1;
            }
            C48709uam.this.valueOf.remove(iIndexOf);
            C48709uam.this.valueOf.add(C48709uam.this.AEQbTJ());
            return iIndexOf;
        }

        public final int copydefault(@NotNull Product product) {
            Intrinsics.checkNotNullParameter(product, "");
            java.util.Iterator it = C48709uam.this.valueOf.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                java.lang.Object next = it.next();
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (((Product) next).getProductId() == Integer.MIN_VALUE) {
                    break;
                }
                i++;
            }
            if (i >= 0 && i < C48709uam.this.valueOf.size()) {
                C48709uam.this.valueOf.add(i, product);
                C48709uam.this.valueOf.remove(yDY.AuCTel(C48709uam.this.valueOf));
            }
            return i;
        }

        public final void AEQbTJ(@NotNull Product product) {
            Intrinsics.checkNotNullParameter(product, "");
            java.util.List<?> items = C48709uam.this.EZpvd.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            C48709uam c48709uam = C48709uam.this;
            java.util.Iterator<T> it = items.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                java.lang.Object next = it.next();
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if ((next instanceof Product) && ((Product) next).getProductId() == product.getProductId()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0 || i >= items.size()) {
                return;
            }
            c48709uam.EZpvd.notifyItemChanged(i);
        }

        public final boolean AhwBna() {
            return (C48709uam.this.valueOf.isEmpty() ^ true) && ((Product) CollectionsKt___CollectionsKt.AubY(C48709uam.this.valueOf)).getProductId() != Integer.MIN_VALUE;
        }
    }

    public final void AuCTel() {
        java.util.ArrayList<Product> arrayList = this.valueOf;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((Product) it.next()).getProductId()));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if (((java.lang.Number) obj).intValue() != Integer.MIN_VALUE) {
                arrayList3.add(obj);
            }
        }
        showLoadingWithLogo();
        pUU.KWHzl(getTAG(), "requestSaveModify-->start");
        tZW tzw = tZW.OLrzqt;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tzw.EZpvd(viewLifecycleOwner, arrayList3, new Function0() { // from class: o.uaB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48709uam.fIwbmz(this.copydefault);
            }
        }, new Function1() { // from class: o.uaG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C48709uam.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj2);
            }
        });
    }
}
