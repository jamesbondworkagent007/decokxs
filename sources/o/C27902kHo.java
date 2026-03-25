package o;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.core.widget.OKSlidingTabLayout;
import com.okinc.tradeapi.bean.TradeGroupData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kHo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27902kHo extends C27919kIe {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C27919kIe, o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.AhwBna;
    }

    @Override // o.AbstractC27884kGx
    public void KWHzl(@NotNull java.util.ArrayList<TradeGroupData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        super.KWHzl(arrayList);
        arrayList.add(0, new TradeGroupData(MultiTransferSignData.DEFAULT_INTERVAL, C33070mpX.AYXKKw(qZH.PendingIntent.QKVWgx), "Watchlist", (java.lang.String) null, false, 24, (DefaultConstructorMarker) null));
    }

    @Override // o.C27919kIe, o.AbstractC27884kGx
    public androidx.fragment.app.Fragment OLrzqt(@NotNull TradeGroupData tradeGroupData) {
        Intrinsics.checkNotNullParameter(tradeGroupData, "");
        if (Intrinsics.EZpvd((java.lang.Object) tradeGroupData.getType(), (java.lang.Object) "Watchlist")) {
            return new C27923kIi();
        }
        return super.OLrzqt(tradeGroupData);
    }

    @Override // o.C27919kIe, o.AbstractC27884kGx, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        android.widget.LinearLayout linearLayoutDjBIcL = djBIcL();
        if (linearLayoutDjBIcL != null) {
            linearLayoutDjBIcL.setVisibility(8);
        }
        C28000kLe c28000kLeKWHzl = KWHzl();
        if (c28000kLeKWHzl != null) {
            c28000kLeKWHzl.addOnPageChangeListener(new Application());
        }
        android.widget.LinearLayout linearLayoutDjBIcL2 = djBIcL();
        if (linearLayoutDjBIcL2 != null) {
            linearLayoutDjBIcL2.setOnClickListener(new Activity(linearLayoutDjBIcL2, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.kHo$Application */
    public static final class Application implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public Application() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            android.widget.LinearLayout linearLayoutDjBIcL = C27902kHo.this.djBIcL();
            if (linearLayoutDjBIcL != null) {
                linearLayoutDjBIcL.setVisibility(i != 0 ? 0 : 8);
            }
        }
    }

    @Override // o.AbstractC27884kGx
    public void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof OKSlidingTabLayout) {
            OKSlidingTabLayout oKSlidingTabLayout = (OKSlidingTabLayout) view;
            oKSlidingTabLayout.setViewPager(KWHzl());
            oKSlidingTabLayout.setTabSpaceEqual(false);
            oKSlidingTabLayout.setTabPadding(15.0f);
        }
    }

    @Override // o.C27919kIe, o.AbstractC27884kGx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
    }

    @Override // o.C27919kIe
    public void AuCTel() {
        super.AuCTel();
        C28000kLe c28000kLeKWHzl = KWHzl();
        int currentItem = c28000kLeKWHzl != null ? c28000kLeKWHzl.getCurrentItem() : 0;
        android.widget.LinearLayout linearLayoutDjBIcL = djBIcL();
        if (linearLayoutDjBIcL != null) {
            linearLayoutDjBIcL.setVisibility(currentItem == 0 ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: o.kHo$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C27902kHo EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C27902kHo c27902kHo) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c27902kHo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.fJNWhG();
            }
        }
    }
}
