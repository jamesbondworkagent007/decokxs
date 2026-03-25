package o;

import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.piM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38908piM extends AbstractC33000moG {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public java.util.ArrayList<java.lang.Long> AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public final java.util.ArrayList<java.lang.String> OLrzqt;
    public java.util.ArrayList<java.lang.String> gEmmrt;
    public MarketCoinInfo valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC33000moG, androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return -2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38908piM(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.valueOf = new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        this.EZpvd = true;
        this.gEmmrt = new java.util.ArrayList<>();
        this.AEQbTJ = new java.util.ArrayList<>();
        this.OLrzqt = new java.util.ArrayList<>();
    }

    /* JADX INFO: renamed from: o.piM$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.piM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ void setData$default(C38908piM c38908piM, MarketCoinInfo marketCoinInfo, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        c38908piM.OLrzqt(marketCoinInfo, z, z2);
    }

    public final void OLrzqt(@NotNull MarketCoinInfo marketCoinInfo, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        this.valueOf = marketCoinInfo;
        this.KWHzl = z;
        this.EZpvd = z2;
        java.util.ArrayList<java.lang.String> arrayList = this.gEmmrt;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.AEQbTJ.clear();
        this.OLrzqt.clear();
        if (z) {
            java.util.ArrayList<java.lang.String> arrayList2 = this.gEmmrt;
            if (arrayList2 != null) {
                arrayList2.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.iZzfmt));
            }
            this.OLrzqt.add("KLineTabOrderBook");
        } else if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "MARGIN")) {
            java.util.ArrayList<java.lang.String> arrayList3 = this.gEmmrt;
            if (arrayList3 != null) {
                arrayList3.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.iZzfmt));
            }
            java.util.ArrayList<java.lang.String> arrayList4 = this.gEmmrt;
            if (arrayList4 != null) {
                arrayList4.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.AxsJAYaxsJAY));
            }
            java.util.ArrayList<java.lang.String> arrayList5 = this.gEmmrt;
            if (arrayList5 != null) {
                arrayList5.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.iRxXKY));
            }
            this.OLrzqt.add("KLineTabOrderBook");
            this.OLrzqt.add("KLineTabDepth");
            this.OLrzqt.add("KLineTabTraders");
            KWHzl();
        } else if (Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "OPTION")) {
            java.util.ArrayList<java.lang.String> arrayList6 = this.gEmmrt;
            if (arrayList6 != null) {
                arrayList6.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.iZzfmt));
            }
            this.OLrzqt.add("KLineTabOrderBook");
            if (!Intrinsics.EZpvd((java.lang.Object) marketCoinInfo.getInstrumentType(), (java.lang.Object) "OPTION")) {
                java.util.ArrayList<java.lang.String> arrayList7 = this.gEmmrt;
                if (arrayList7 != null) {
                    arrayList7.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.AxsJAYaxsJAY));
                }
                this.OLrzqt.add("KLineTabDepth");
            }
            java.util.ArrayList<java.lang.String> arrayList8 = this.gEmmrt;
            if (arrayList8 != null) {
                arrayList8.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.iRxXKY));
            }
            this.OLrzqt.add("KLineTabTraders");
            KWHzl();
        } else {
            java.util.ArrayList<java.lang.String> arrayList9 = this.gEmmrt;
            if (arrayList9 != null) {
                arrayList9.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.iZzfmt));
            }
            java.util.ArrayList<java.lang.String> arrayList10 = this.gEmmrt;
            if (arrayList10 != null) {
                arrayList10.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.AxsJAYaxsJAY));
            }
            java.util.ArrayList<java.lang.String> arrayList11 = this.gEmmrt;
            if (arrayList11 != null) {
                arrayList11.add(C55734xpY.Companion.copydefault().getResources().getString(C35964oKf.Fragment.iRxXKY));
            }
            this.OLrzqt.add("KLineTabOrderBook");
            this.OLrzqt.add("KLineTabDepth");
            this.OLrzqt.add("KLineTabTraders");
            KWHzl();
        }
        notifyDataSetChanged();
    }

    public final void KWHzl() {
        if (C55608xnE.OLrzqt()) {
            return;
        }
        java.util.ArrayList<java.lang.String> arrayList = this.gEmmrt;
        if (arrayList != null) {
            arrayList.add(C33070mpX.AYXKKw(C35964oKf.Fragment.hpmliR));
        }
        this.OLrzqt.add("KLineTabMarketEvents");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [97=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.fragment.app.FragmentPagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(this.OLrzqt, i);
        if (str != null) {
            switch (str.hashCode()) {
                case 1882258369:
                    if (str.equals("KLineTabOrderBook")) {
                        return C38820pge.Companion.KWHzl(this.valueOf, this.EZpvd);
                    }
                    break;
                case 2109975597:
                    if (str.equals("KLineTabDepth")) {
                        return new C38826pgk();
                    }
                    break;
                case 2123028427:
                    if (str.equals("KLineTabMarketEvents")) {
                        return C36142oQv.Companion.AEQbTJ();
                    }
                    break;
                case 2134992271:
                    if (str.equals("KLineTabTraders")) {
                        return C38755pfS.Companion.AEQbTJ(this.valueOf);
                    }
                    break;
            }
        }
        return new androidx.fragment.app.Fragment();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.OLrzqt.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        java.util.ArrayList<java.lang.String> arrayList = this.gEmmrt;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        return null;
    }

    public final java.lang.String AEQbTJ(int i) {
        return (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(this.OLrzqt, i);
    }
}
