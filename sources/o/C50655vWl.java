package o;

import androidx.databinding.DataBindingUtil;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vWl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50655vWl extends android.widget.LinearLayout {
    public final java.util.ArrayList<SelectCoinData> EZpvd;
    public InterfaceC50659vWp KWHzl;
    public int OLrzqt;
    public final AbstractC50912vdB copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50655vWl(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50655vWl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(InterfaceC50659vWp interfaceC50659vWp) {
        this.KWHzl = interfaceC50659vWp;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.vWl.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50655vWl(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50655vWl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.ArrayList<>();
        this.OLrzqt = 1;
        setOrientation(1);
        this.copydefault = (AbstractC50912vdB) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.RIKbBf, this, true);
    }

    public final void setOriginSelectCoins(@NotNull java.util.List<SelectCoinData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        this.copydefault.KWHzl.removeAllViews();
        boolean z = this.EZpvd.size() > this.OLrzqt;
        java.util.Iterator<T> it = this.EZpvd.iterator();
        java.lang.String strAddS$default = "";
        while (it.hasNext()) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, ((SelectCoinData) it.next()).getRatio(), null, null, null, 14, null);
        }
        int size = this.EZpvd.size();
        for (int i = 0; i < size; i++) {
            java.lang.String name = this.EZpvd.get(i).getName();
            if (name == null) {
                name = "";
            }
            java.lang.String icon = this.EZpvd.get(i).getIcon();
            if (icon == null) {
                icon = "";
            }
            java.lang.String ratio = this.EZpvd.get(i).getRatio();
            if (ratio == null) {
                ratio = "";
            }
            KWHzl(name, icon, ratio, z);
        }
        EZpvd();
        OLrzqt();
    }

    public final void OLrzqt() {
        InterfaceC50659vWp interfaceC50659vWp = this.KWHzl;
        if (interfaceC50659vWp != null) {
            interfaceC50659vWp.copydefault(copydefault());
        }
    }

    public final boolean copydefault() {
        java.lang.String strAYXKKw;
        int childCount = this.copydefault.KWHzl.getChildCount();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= childCount) {
                break;
            }
            android.view.View childAt = this.copydefault.KWHzl.getChildAt(i);
            C50651vWh c50651vWh = childAt instanceof C50651vWh ? (C50651vWh) childAt : null;
            if (c50651vWh != null && !c50651vWh.EZpvd()) {
                c50651vWh.setBgSelect(true);
                z = true;
            } else if (c50651vWh != null) {
                c50651vWh.setBgSelect(false);
            }
            i++;
        }
        if (z) {
            android.widget.TextView textView = this.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            this.copydefault.copydefault.setText(C33070mpX.AYXKKw(C55688xof.Application.removeOnActiveChangeListener));
            return false;
        }
        java.util.Iterator<T> it = this.EZpvd.iterator();
        int iAhwBna = 0;
        while (it.hasNext()) {
            iAhwBna += C33129mqd.AhwBna(((SelectCoinData) it.next()).getRatio());
        }
        if (iAhwBna != 100) {
            android.widget.TextView textView2 = this.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            android.widget.TextView textView3 = this.copydefault.copydefault;
            if (iAhwBna > 100) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.GuardedBy);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatApi21CustomAction);
            }
            textView3.setText(strAYXKKw);
            int childCount2 = this.copydefault.KWHzl.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                android.view.View childAt2 = this.copydefault.KWHzl.getChildAt(i2);
                C50651vWh c50651vWh2 = childAt2 instanceof C50651vWh ? (C50651vWh) childAt2 : null;
                if (c50651vWh2 != null) {
                    c50651vWh2.setBgSelect(true);
                }
            }
            return false;
        }
        android.widget.TextView textView4 = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(8);
        return true;
    }

    public final void EZpvd() {
        int childCount = this.copydefault.KWHzl.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = this.copydefault.KWHzl.getChildAt(i);
            C50651vWh c50651vWh = childAt instanceof C50651vWh ? (C50651vWh) childAt : null;
            if (c50651vWh != null) {
                c50651vWh.setBgSelect(false);
            }
        }
    }

    public static /* synthetic */ void addCoin$default(C50655vWl c50655vWl, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        c50655vWl.KWHzl(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: o.vWl$Activity */
    public static final class Activity implements InterfaceC50649vWf {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC50649vWf
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        public Activity() {
        }

        @Override // o.InterfaceC50649vWf
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C50655vWl.this.AEQbTJ(str, str2);
            C50655vWl.this.EZpvd();
            InterfaceC50659vWp interfaceC50659vWp = C50655vWl.this.KWHzl;
            if (interfaceC50659vWp != null) {
                interfaceC50659vWp.KWHzl(C50655vWl.this.EZpvd);
            }
            C50655vWl.this.OLrzqt();
        }
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        Activity activity = new Activity();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C50651vWh c50651vWh = new C50651vWh(str2, str, str3, activity, context, null, 0, 96, null);
        c50651vWh.setDeleteEnable(z);
        c50651vWh.setInputFilters();
        c50651vWh.setDeleteVisible(false);
        this.copydefault.KWHzl.addView(c50651vWh);
    }

    public final void setSelectCoins(@NotNull java.util.List<SelectCoinData> list) {
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(list, "");
        int i = 0;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String ratio = ((SelectCoinData) it.next()).getRatio();
                if (ratio != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ratio)) {
                    this.EZpvd.clear();
                    this.EZpvd.addAll(list);
                    java.util.ArrayList<SelectCoinData> arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((SelectCoinData) obj).getRatio())) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.ArrayList<SelectCoinData> arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((SelectCoinData) obj2).getRatio())) {
                            arrayList2.add(obj2);
                        }
                    }
                    java.util.Iterator it2 = arrayList.iterator();
                    java.lang.String strAddS$default = "";
                    while (it2.hasNext()) {
                        strAddS$default = C33129mqd.addS$default(strAddS$default, ((SelectCoinData) it2.next()).getRatio(), null, null, null, 14, null);
                    }
                    java.util.ArrayList<java.lang.String> arrayListAEQbTJ = C56064xvk.copydefault.AEQbTJ(arrayList.size());
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        java.lang.String ratio2 = ((SelectCoinData) arrayList.get(i2)).getRatio();
                        if (ratio2 == null) {
                            ratio2 = "";
                        }
                        arrayList3.add(ratio2);
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    java.util.Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((SelectCoinData) it3.next()).getRatio());
                    }
                    boolean z = CollectionsKt___CollectionsKt.QbewEr(arrayList4).size() == 1;
                    if (Intrinsics.EZpvd(arrayList3, arrayListAEQbTJ) || (z && arrayList2.isEmpty())) {
                        java.util.ArrayList<java.lang.String> arrayListAEQbTJ2 = C56064xvk.copydefault.AEQbTJ(this.EZpvd.size());
                        int size2 = this.EZpvd.size();
                        while (i < size2) {
                            this.EZpvd.get(i).setRatio(arrayListAEQbTJ2.get(i));
                            java.lang.String name = this.EZpvd.get(i).getName();
                            if (name == null) {
                                name = "";
                            }
                            java.lang.String icon = this.EZpvd.get(i).getIcon();
                            if (icon == null) {
                                icon = "";
                            }
                            java.lang.String str = arrayListAEQbTJ2.get(i);
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            KWHzl(name, icon, str, true);
                            i++;
                        }
                    } else {
                        for (SelectCoinData selectCoinData : arrayList) {
                            java.lang.String name2 = selectCoinData.getName();
                            if (name2 == null) {
                                name2 = "";
                            }
                            java.lang.String icon2 = selectCoinData.getIcon();
                            if (icon2 == null) {
                                icon2 = "";
                            }
                            java.lang.String ratio3 = selectCoinData.getRatio();
                            if (ratio3 == null) {
                                ratio3 = "";
                            }
                            KWHzl(name2, icon2, ratio3, true);
                        }
                        if (!C33129mqd.copydefault((java.lang.Object) strAddS$default, (java.lang.Object) 100)) {
                            if (C33129mqd.gEmmrt(strAddS$default, 100)) {
                                for (SelectCoinData selectCoinData2 : arrayList2) {
                                    int iAhwBna = C33129mqd.gEmmrt(strAddS$default, 100) ? C33129mqd.AhwBna(C33129mqd.subS$default(100, strAddS$default, null, null, null, 14, null)) : 5;
                                    strAddS$default = C33129mqd.addS$default(strAddS$default, java.lang.Integer.valueOf(iAhwBna), null, null, null, 14, null);
                                    java.util.Iterator<T> it4 = this.EZpvd.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            next = it4.next();
                                            if (Intrinsics.EZpvd((java.lang.Object) selectCoinData2.getName(), (java.lang.Object) ((SelectCoinData) next).getName())) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    SelectCoinData selectCoinData3 = (SelectCoinData) next;
                                    if (selectCoinData3 != null) {
                                        selectCoinData3.setRatio(C33129mqd.gEmmrt(java.lang.Integer.valueOf(iAhwBna)));
                                    }
                                    java.lang.String name3 = selectCoinData2.getName();
                                    if (name3 == null) {
                                        name3 = "";
                                    }
                                    java.lang.String icon3 = selectCoinData2.getIcon();
                                    if (icon3 == null) {
                                        icon3 = "";
                                    }
                                    KWHzl(name3, icon3, C33129mqd.gEmmrt(java.lang.Integer.valueOf(iAhwBna)), true);
                                }
                            }
                        } else {
                            for (SelectCoinData selectCoinData4 : arrayList2) {
                                java.util.Iterator<T> it5 = this.EZpvd.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next2 = it5.next();
                                        if (Intrinsics.EZpvd((java.lang.Object) selectCoinData4.getName(), (java.lang.Object) ((SelectCoinData) next2).getName())) {
                                            break;
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                SelectCoinData selectCoinData5 = (SelectCoinData) next2;
                                if (selectCoinData5 != null) {
                                    selectCoinData5.setRatio("5");
                                }
                                java.lang.String name4 = selectCoinData4.getName();
                                if (name4 == null) {
                                    name4 = "";
                                }
                                java.lang.String icon4 = selectCoinData4.getIcon();
                                if (icon4 == null) {
                                    icon4 = "";
                                }
                                KWHzl(name4, icon4, "5", true);
                            }
                        }
                    }
                    EZpvd();
                    InterfaceC50659vWp interfaceC50659vWp = this.KWHzl;
                    if (interfaceC50659vWp != null) {
                        interfaceC50659vWp.KWHzl(this.EZpvd);
                    }
                    OLrzqt();
                    return;
                }
            }
        }
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ3 = C56064xvk.copydefault.AEQbTJ(this.EZpvd.size());
        int size3 = this.EZpvd.size();
        while (i < size3) {
            this.EZpvd.get(i).setRatio(arrayListAEQbTJ3.get(i));
            java.lang.String name5 = this.EZpvd.get(i).getName();
            if (name5 == null) {
                name5 = "";
            }
            java.lang.String icon5 = this.EZpvd.get(i).getIcon();
            if (icon5 == null) {
                icon5 = "";
            }
            java.lang.String str2 = arrayListAEQbTJ3.get(i);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            KWHzl(name5, icon5, str2, true);
            i++;
        }
        EZpvd();
        InterfaceC50659vWp interfaceC50659vWp2 = this.KWHzl;
        if (interfaceC50659vWp2 != null) {
            interfaceC50659vWp2.KWHzl(this.EZpvd);
        }
        OLrzqt();
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        for (SelectCoinData selectCoinData : this.EZpvd) {
            if (Intrinsics.EZpvd((java.lang.Object) selectCoinData.getName(), (java.lang.Object) str)) {
                selectCoinData.setRatio(str2);
                return;
            }
        }
    }
}
