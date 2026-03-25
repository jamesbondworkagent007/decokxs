package o;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dIP extends AbstractActivityC33041mov {
    public C15063dxJ AEQbTJ;
    public AbstractC13460dMd EZpvd;
    public C59534zip OLrzqt;
    public java.lang.String copydefault = "";

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C15063dxJ c15063dxJ) {
        Intrinsics.checkNotNullParameter(c15063dxJ, "");
        this.AEQbTJ = c15063dxJ;
    }

    public final C15063dxJ KWHzl() {
        C15063dxJ c15063dxJ = this.AEQbTJ;
        if (c15063dxJ != null) {
            return c15063dxJ;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String url;
        C13241dEa mWebView;
        super.onCreate(bundle);
        overridePendingTransition(dLX.Activity.copydefault, dLX.Activity.OLrzqt);
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null || (url = mWebView.getUrl()) == null) {
            url = "";
        }
        this.copydefault = url;
        OLrzqt((C15063dxJ) new ViewModelProvider(this).get(C15063dxJ.class));
        EZpvd();
    }

    private final void EZpvd() {
        AbstractC13460dMd abstractC13460dMd = (AbstractC13460dMd) DataBindingUtil.setContentView(this, dLX.Fragment.KWHzl);
        this.EZpvd = abstractC13460dMd;
        C59534zip c59534zip = null;
        if (abstractC13460dMd == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd = null;
        }
        abstractC13460dMd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.dIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                dIP.EZpvd(this.KWHzl, view);
            }
        });
        AbstractC13460dMd abstractC13460dMd2 = this.EZpvd;
        if (abstractC13460dMd2 == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd2 = null;
        }
        abstractC13460dMd2.EZpvd.KWHzl().setText(this.copydefault);
        try {
            Result.Application application = Result.Companion;
            AbstractC13460dMd abstractC13460dMd3 = this.EZpvd;
            if (abstractC13460dMd3 == null) {
                Intrinsics.gEmmrt("");
                abstractC13460dMd3 = null;
            }
            abstractC13460dMd3.EZpvd.KWHzl().setSelection(this.copydefault.length());
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        AbstractC13460dMd abstractC13460dMd4 = this.EZpvd;
        if (abstractC13460dMd4 == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd4 = null;
        }
        abstractC13460dMd4.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.dIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                dIP.OLrzqt(this.KWHzl, view);
            }
        });
        AbstractC13460dMd abstractC13460dMd5 = this.EZpvd;
        if (abstractC13460dMd5 == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd5 = null;
        }
        abstractC13460dMd5.EZpvd.EZpvd().setImeOptions(3);
        AbstractC13460dMd abstractC13460dMd6 = this.EZpvd;
        if (abstractC13460dMd6 == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd6 = null;
        }
        abstractC13460dMd6.EZpvd.EZpvd().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.dIW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                return dIP.OLrzqt(this.KWHzl, textView, i, keyEvent);
            }
        });
        postDelay(new java.lang.Runnable() { // from class: o.dIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                dIP.AEQbTJ(this.EZpvd);
            }
        }, 200L);
        this.OLrzqt = new C59534zip(new java.util.ArrayList());
        AbstractC13460dMd abstractC13460dMd7 = this.EZpvd;
        if (abstractC13460dMd7 == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd7 = null;
        }
        abstractC13460dMd7.gEmmrt.setLayoutManager(new LinearLayoutManager(this));
        AbstractC13460dMd abstractC13460dMd8 = this.EZpvd;
        if (abstractC13460dMd8 == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd8 = null;
        }
        RecyclerView recyclerView = abstractC13460dMd8.gEmmrt;
        C59534zip c59534zip2 = this.OLrzqt;
        if (c59534zip2 == null) {
            Intrinsics.gEmmrt("");
            c59534zip2 = null;
        }
        recyclerView.setAdapter(c59534zip2);
        AbstractC13460dMd abstractC13460dMd9 = this.EZpvd;
        if (abstractC13460dMd9 == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd9 = null;
        }
        abstractC13460dMd9.gEmmrt.addOnScrollListener(new ActionBar());
        C59534zip c59534zip3 = this.OLrzqt;
        if (c59534zip3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c59534zip = c59534zip3;
        }
        c59534zip.register(DappSearchResultBean.class, new C15134dyb(this, new Function1() { // from class: o.dJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dIP.KWHzl(this.KWHzl, (DappSearchResultBean) obj);
            }
        }, new Function1() { // from class: o.dIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dIP.EZpvd(this.copydefault, (DappSearchResultBean) obj);
            }
        }));
        KWHzl().OLrzqt().observe(this, new Activity(new Function1() { // from class: o.dJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dIP.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        }));
        KWHzl().EZpvd();
    }

    public static final void EZpvd(dIP dip, android.view.View view) {
        dip.finish();
    }

    public static final void OLrzqt(dIP dip, android.view.View view) {
        dip.KWHzl().AEQbTJ();
    }

    public static final boolean OLrzqt(dIP dip, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        AbstractC13460dMd abstractC13460dMd = dip.EZpvd;
        AbstractC13460dMd abstractC13460dMd2 = null;
        if (abstractC13460dMd == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd = null;
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(abstractC13460dMd.EZpvd.EZpvd().getText());
        if (strGEmmrt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt)) {
            return false;
        }
        java.lang.Object systemService = dip.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        AbstractC13460dMd abstractC13460dMd3 = dip.EZpvd;
        if (abstractC13460dMd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC13460dMd2 = abstractC13460dMd3;
        }
        inputMethodManager.hideSoftInputFromWindow(abstractC13460dMd2.EZpvd.EZpvd().getWindowToken(), 2);
        dip.EZpvd(new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, strGEmmrt, (java.lang.String) null, 0L, 0, "5", (java.lang.String) null, 12031, (DefaultConstructorMarker) null));
        return false;
    }

    public static final void AEQbTJ(dIP dip) {
        dip.copydefault();
    }

    public static final class ActionBar extends RecyclerView.OnScrollListener {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            dIP.this.AEQbTJ();
        }
    }

    public static final Unit KWHzl(dIP dip, DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        C59534zip c59534zip = dip.OLrzqt;
        AbstractC13460dMd abstractC13460dMd = null;
        if (c59534zip == null) {
            Intrinsics.gEmmrt("");
            c59534zip = null;
        }
        java.util.List<?> items = c59534zip.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int iCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends DappSearchResultBean>) ((java.util.List<? extends java.lang.Object>) items), dappSearchResultBean);
        if (iCopydefault >= 0 && iCopydefault < items.size()) {
            items.remove(iCopydefault);
            C59534zip c59534zip2 = dip.OLrzqt;
            if (c59534zip2 == null) {
                Intrinsics.gEmmrt("");
                c59534zip2 = null;
            }
            c59534zip2.notifyItemRemoved(iCopydefault);
        }
        if (C33129mqd.KWHzl((java.util.Collection) items)) {
            AbstractC13460dMd abstractC13460dMd2 = dip.EZpvd;
            if (abstractC13460dMd2 == null) {
                Intrinsics.gEmmrt("");
                abstractC13460dMd2 = null;
            }
            abstractC13460dMd2.copydefault.setVisibility(8);
            AbstractC13460dMd abstractC13460dMd3 = dip.EZpvd;
            if (abstractC13460dMd3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC13460dMd = abstractC13460dMd3;
            }
            abstractC13460dMd.AhwBna.setVisibility(0);
        } else {
            AbstractC13460dMd abstractC13460dMd4 = dip.EZpvd;
            if (abstractC13460dMd4 == null) {
                Intrinsics.gEmmrt("");
                abstractC13460dMd4 = null;
            }
            abstractC13460dMd4.copydefault.setVisibility(0);
            AbstractC13460dMd abstractC13460dMd5 = dip.EZpvd;
            if (abstractC13460dMd5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC13460dMd = abstractC13460dMd5;
            }
            abstractC13460dMd.AhwBna.setVisibility(8);
        }
        dip.KWHzl().OLrzqt(dappSearchResultBean);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(dIP dip, DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        dip.EZpvd(C14923duc.EZpvd.copydefault(dappSearchResultBean));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(dIP dip, java.util.List list) {
        C59534zip c59534zip = null;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            AbstractC13460dMd abstractC13460dMd = dip.EZpvd;
            if (abstractC13460dMd == null) {
                Intrinsics.gEmmrt("");
                abstractC13460dMd = null;
            }
            abstractC13460dMd.copydefault.setVisibility(8);
            AbstractC13460dMd abstractC13460dMd2 = dip.EZpvd;
            if (abstractC13460dMd2 == null) {
                Intrinsics.gEmmrt("");
                abstractC13460dMd2 = null;
            }
            abstractC13460dMd2.AhwBna.setVisibility(0);
        } else {
            AbstractC13460dMd abstractC13460dMd3 = dip.EZpvd;
            if (abstractC13460dMd3 == null) {
                Intrinsics.gEmmrt("");
                abstractC13460dMd3 = null;
            }
            abstractC13460dMd3.copydefault.setVisibility(0);
            AbstractC13460dMd abstractC13460dMd4 = dip.EZpvd;
            if (abstractC13460dMd4 == null) {
                Intrinsics.gEmmrt("");
                abstractC13460dMd4 = null;
            }
            abstractC13460dMd4.AhwBna.setVisibility(8);
        }
        C59534zip c59534zip2 = dip.OLrzqt;
        if (c59534zip2 == null) {
            Intrinsics.gEmmrt("");
            c59534zip2 = null;
        }
        c59534zip2.setItems(list);
        C59534zip c59534zip3 = dip.OLrzqt;
        if (c59534zip3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c59534zip = c59534zip3;
        }
        c59534zip.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public final void EZpvd(PlatformItem platformItem) {
        C15142dyj c15142dyj = C15142dyj.EZpvd;
        java.lang.String strDjBIcL = c15142dyj.djBIcL(this.copydefault);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strDjBIcL)) {
            c15142dyj.OLrzqt(this, strDjBIcL);
        } else {
            C14923duc c14923duc = C14923duc.EZpvd;
            c14923duc.AEQbTJ(this, platformItem, (20992 & 4) != 0 ? null : null, (20992 & 8) != 0 ? null : null, (Function0<Unit>) ((20992 & 16) != 0 ? null : null), (20992 & 32) != 0 ? false : false, (java.util.List<DappChains>) ((20992 & 64) != 0 ? c14923duc.isConnected() : null), (20992 & 128) != 0, (20992 & 256) != 0 ? false : true, (Function1<? super PlatformItem, Unit>) ((20992 & 512) != 0 ? null : new Function1() { // from class: o.dIT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dIP.AEQbTJ(this.copydefault, (PlatformItem) obj);
                }
            }), (20992 & 1024) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : null, (20992 & 2048) != 0 ? "" : WalletSearchRequest.SEARCH_SOURCE_DISCOVER, (Function1<? super androidx.fragment.app.Fragment, Unit>) ((20992 & 4096) != 0 ? null : null), (20992 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (20992 & 16384) != 0 ? null : null, (20992 & 32768) != 0 ? null : null);
        }
    }

    public static final Unit AEQbTJ(dIP dip, PlatformItem platformItem) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("item", platformItem);
        Unit unit = Unit.INSTANCE;
        dip.setResult(-1, intent);
        dip.finish();
        return unit;
    }

    public final void copydefault() {
        getWindow().setSoftInputMode(32);
        AbstractC13460dMd abstractC13460dMd = null;
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setImportantForAutofill(8);
            AbstractC13460dMd abstractC13460dMd2 = this.EZpvd;
            if (abstractC13460dMd2 == null) {
                Intrinsics.gEmmrt("");
                abstractC13460dMd2 = null;
            }
            abstractC13460dMd2.EZpvd.setImportantForAutofill(2);
        }
        AbstractC13460dMd abstractC13460dMd3 = this.EZpvd;
        if (abstractC13460dMd3 == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd3 = null;
        }
        abstractC13460dMd3.EZpvd.EZpvd().requestFocus();
        AbstractC13460dMd abstractC13460dMd4 = this.EZpvd;
        if (abstractC13460dMd4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC13460dMd = abstractC13460dMd4;
        }
        abstractC13460dMd.EZpvd.EZpvd().postDelayed(new java.lang.Runnable() { // from class: o.dIV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                dIP.EZpvd(this.copydefault);
            }
        }, 500L);
    }

    public static final void EZpvd(dIP dip) {
        java.lang.Object systemService = dip.getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        AbstractC13460dMd abstractC13460dMd = dip.EZpvd;
        if (abstractC13460dMd == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd = null;
        }
        inputMethodManager.showSoftInput(abstractC13460dMd.EZpvd.EZpvd(), 0);
    }

    public final void AEQbTJ() {
        java.lang.Object systemService = getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        AbstractC13460dMd abstractC13460dMd = this.EZpvd;
        AbstractC13460dMd abstractC13460dMd2 = null;
        if (abstractC13460dMd == null) {
            Intrinsics.gEmmrt("");
            abstractC13460dMd = null;
        }
        inputMethodManager.hideSoftInputFromWindow(abstractC13460dMd.EZpvd.EZpvd().getWindowToken(), 2);
        AbstractC13460dMd abstractC13460dMd3 = this.EZpvd;
        if (abstractC13460dMd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC13460dMd2 = abstractC13460dMd3;
        }
        abstractC13460dMd2.EZpvd.EZpvd().clearFocus();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(dLX.Activity.copydefault, dLX.Activity.OLrzqt);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
