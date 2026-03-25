package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wmS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53487wmS extends android.widget.LinearLayout {
    public final java.util.ArrayList<SelectCoinData> AYXKKw;
    public InterfaceC53559wnl EZpvd;
    public final AbstractC50950vdn KWHzl;
    public int OLrzqt;
    public int copydefault;
    public int djBIcL;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53487wmS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53487wmS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAtLeastCoin(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(InterfaceC53559wnl interfaceC53559wnl) {
        this.EZpvd = interfaceC53559wnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCoin(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPerCoinMinAmt(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:53) call: o.wmS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53487wmS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53487wmS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = new java.util.ArrayList<>();
        this.OLrzqt = 1;
        this.copydefault = 20;
        this.djBIcL = 10;
        setOrientation(1);
        AbstractC50950vdn abstractC50950vdn = (AbstractC50950vdn) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.OmYuqg, this, true);
        this.KWHzl = abstractC50950vdn;
        android.widget.TextView textView = abstractC50950vdn.EZpvd;
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.fzHEvu);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
        } else {
            drawableKWHzl = null;
        }
        textView.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
        textView.setOnClickListener(new Activity(textView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.wmS$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wmS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.wmS$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(C33129mqd.AhwBna(((SelectCoinData) t).getRatio())), java.lang.Integer.valueOf(C33129mqd.AhwBna(((SelectCoinData) t2).getRatio())));
        }
    }

    public final java.util.List<SelectCoinData> EZpvd() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.AYXKKw);
    }

    public final void setSelectCoins(@NotNull java.util.List<SelectCoinData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ = C56064xvk.copydefault.AEQbTJ(this.AYXKKw.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = this.AYXKKw.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.String ratio = this.AYXKKw.get(i2).getRatio();
            if (ratio == null) {
                ratio = "";
            }
            arrayList.add(ratio);
        }
        this.AYXKKw.clear();
        this.AYXKKw.addAll(list);
        this.KWHzl.copydefault.removeAllViews();
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ2 = C56064xvk.copydefault.AEQbTJ(this.AYXKKw.size());
        boolean z = this.AYXKKw.size() > this.OLrzqt;
        if (Intrinsics.EZpvd(arrayList, arrayListAEQbTJ)) {
            int size2 = this.AYXKKw.size();
            while (i < size2) {
                this.AYXKKw.get(i).setRatio(arrayListAEQbTJ2.get(i));
                java.lang.String name = this.AYXKKw.get(i).getName();
                if (name == null) {
                    name = "";
                }
                java.lang.String icon = this.AYXKKw.get(i).getIcon();
                if (icon == null) {
                    icon = "";
                }
                java.lang.String str = arrayListAEQbTJ2.get(i);
                Intrinsics.checkNotNullExpressionValue(str, "");
                OLrzqt(name, icon, str, z);
                i++;
            }
        } else {
            java.util.Iterator<T> it = this.AYXKKw.iterator();
            java.lang.String strAddS$default = "";
            while (it.hasNext()) {
                strAddS$default = C33129mqd.addS$default(strAddS$default, ((SelectCoinData) it.next()).getRatio(), null, null, null, 14, null);
            }
            int iMax = java.lang.Math.max(5, C33129mqd.AhwBna(C33129mqd.subS$default(100, strAddS$default, null, null, null, 14, null)));
            int size3 = this.AYXKKw.size();
            while (i < size3 - 1) {
                java.lang.String name2 = this.AYXKKw.get(i).getName();
                if (name2 == null) {
                    name2 = "";
                }
                java.lang.String icon2 = this.AYXKKw.get(i).getIcon();
                if (icon2 == null) {
                    icon2 = "";
                }
                java.lang.String ratio2 = this.AYXKKw.get(i).getRatio();
                if (ratio2 == null) {
                    ratio2 = "";
                }
                OLrzqt(name2, icon2, ratio2, z);
                i++;
            }
            java.util.ArrayList<SelectCoinData> arrayList2 = this.AYXKKw;
            arrayList2.get(arrayList2.size() - 1).setRatio(C33129mqd.gEmmrt(java.lang.Integer.valueOf(iMax)));
            java.util.ArrayList<SelectCoinData> arrayList3 = this.AYXKKw;
            java.lang.String name3 = arrayList3.get(arrayList3.size() - 1).getName();
            if (name3 == null) {
                name3 = "";
            }
            java.util.ArrayList<SelectCoinData> arrayList4 = this.AYXKKw;
            java.lang.String icon3 = arrayList4.get(arrayList4.size() - 1).getIcon();
            OLrzqt(name3, icon3 != null ? icon3 : "", C33129mqd.gEmmrt(java.lang.Integer.valueOf(iMax)), z);
        }
        InterfaceC53559wnl interfaceC53559wnl = this.EZpvd;
        if (interfaceC53559wnl != null) {
            interfaceC53559wnl.OLrzqt(this.AYXKKw);
        }
        values();
        fetchVPNInfo();
        KWHzl();
    }

    public final void EZpvd(boolean z) {
        LinearLayoutCompat linearLayoutCompat = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.wmS$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C53487wmS EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53487wmS c53487wmS) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c53487wmS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC53559wnl interfaceC53559wnl = this.EZpvd.EZpvd;
                if (interfaceC53559wnl != null) {
                    interfaceC53559wnl.copydefault(this.EZpvd.AYXKKw);
                }
            }
        }
    }

    public final void copydefault() {
        this.KWHzl.copydefault.removeAllViews();
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ = C56064xvk.copydefault.AEQbTJ(this.AYXKKw.size());
        boolean z = this.AYXKKw.size() > this.OLrzqt;
        int size = this.AYXKKw.size();
        for (int i = 0; i < size; i++) {
            this.AYXKKw.get(i).setRatio(arrayListAEQbTJ.get(i));
            java.lang.String name = this.AYXKKw.get(i).getName();
            if (name == null) {
                name = "";
            }
            java.lang.String icon = this.AYXKKw.get(i).getIcon();
            if (icon == null) {
                icon = "";
            }
            java.lang.String str = arrayListAEQbTJ.get(i);
            Intrinsics.checkNotNullExpressionValue(str, "");
            OLrzqt(name, icon, str, z);
        }
        InterfaceC53559wnl interfaceC53559wnl = this.EZpvd;
        if (interfaceC53559wnl != null) {
            interfaceC53559wnl.OLrzqt(this.AYXKKw);
        }
        values();
        fetchVPNInfo();
        KWHzl();
    }

    public final boolean AEQbTJ() {
        java.lang.String strAYXKKw;
        int childCount = this.KWHzl.copydefault.getChildCount();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= childCount) {
                break;
            }
            android.view.View childAt = this.KWHzl.copydefault.getChildAt(i);
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
            android.widget.TextView textView = this.KWHzl.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            this.KWHzl.AYXKKw.setText(C33070mpX.AYXKKw(C55688xof.Application.removeOnActiveChangeListener));
            return false;
        }
        java.util.Iterator<T> it = this.AYXKKw.iterator();
        int iAhwBna = 0;
        while (it.hasNext()) {
            iAhwBna += C33129mqd.AhwBna(((SelectCoinData) it.next()).getRatio());
        }
        if (iAhwBna == 100) {
            return true;
        }
        android.widget.TextView textView2 = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        android.widget.TextView textView3 = this.KWHzl.AYXKKw;
        if (iAhwBna > 100) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.GuardedBy);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatApi21CustomAction);
        }
        textView3.setText(strAYXKKw);
        int childCount2 = this.KWHzl.copydefault.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            android.view.View childAt2 = this.KWHzl.copydefault.getChildAt(i2);
            C50651vWh c50651vWh2 = childAt2 instanceof C50651vWh ? (C50651vWh) childAt2 : null;
            if (c50651vWh2 != null) {
                c50651vWh2.setBgSelect(true);
            }
        }
        return false;
    }

    public final void KWHzl() {
        android.widget.TextView textView = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(this.AYXKKw.size() < this.copydefault ? 0 : 8);
    }

    public final void values() {
        android.widget.TextView textView = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        int childCount = this.KWHzl.copydefault.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = this.KWHzl.copydefault.getChildAt(i);
            C50651vWh c50651vWh = childAt instanceof C50651vWh ? (C50651vWh) childAt : null;
            if (c50651vWh != null) {
                c50651vWh.setBgSelect(false);
            }
        }
    }

    public static /* synthetic */ void addCoin$default(C53487wmS c53487wmS, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        c53487wmS.OLrzqt(str, str2, str3, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, o.vWh] */
    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Application application = new Application(objectRef);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ?? c50651vWh = new C50651vWh(str2, str, str3, application, context, null, 0, 96, null);
        objectRef.element = c50651vWh;
        c50651vWh.setDeleteEnable(z);
        ((C50651vWh) objectRef.element).setInputFilters();
        this.KWHzl.copydefault.addView((android.view.View) objectRef.element);
    }

    /* JADX INFO: renamed from: o.wmS$Application */
    public static final class Application implements InterfaceC50649vWf {
        public final /* synthetic */ Ref.ObjectRef<C50651vWh> EZpvd;

        public Application(Ref.ObjectRef<C50651vWh> objectRef) {
            this.EZpvd = objectRef;
        }

        @Override // o.InterfaceC50649vWf
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            boolean zIsSelected = C53487wmS.this.KWHzl.KWHzl.isSelected();
            boolean zIsSelected2 = C53487wmS.this.KWHzl.AEQbTJ.isSelected();
            java.util.ArrayList<java.lang.String> arrayListAEQbTJ = C56064xvk.copydefault.AEQbTJ(C53487wmS.this.AYXKKw.size());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            C53487wmS c53487wmS = C53487wmS.this;
            int size = c53487wmS.AYXKKw.size();
            for (int i = 0; i < size; i++) {
                java.lang.String ratio = ((SelectCoinData) c53487wmS.AYXKKw.get(i)).getRatio();
                if (ratio == null) {
                    ratio = "";
                }
                arrayList.add(ratio);
            }
            C53487wmS.this.AEQbTJ(str);
            C53487wmS.this.fetchVPNInfo();
            C53487wmS.this.KWHzl.copydefault.removeView(this.EZpvd.element);
            java.util.ArrayList<java.lang.String> arrayListAEQbTJ2 = C56064xvk.copydefault.AEQbTJ(C53487wmS.this.KWHzl.copydefault.getChildCount());
            if (Intrinsics.EZpvd(arrayList, arrayListAEQbTJ)) {
                int size2 = C53487wmS.this.AYXKKw.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    android.view.View childAt = C53487wmS.this.KWHzl.copydefault.getChildAt(i2);
                    C50651vWh c50651vWh = childAt instanceof C50651vWh ? (C50651vWh) childAt : null;
                    if (c50651vWh != null) {
                        java.lang.String str2 = arrayListAEQbTJ2.get(i2);
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        c50651vWh.setRatioConfig(str2);
                    }
                    ((SelectCoinData) C53487wmS.this.AYXKKw.get(i2)).setRatio(arrayListAEQbTJ2.get(i2));
                }
            }
            C53487wmS.this.AhwBna();
            C53487wmS.this.values();
            C53487wmS.this.KWHzl();
            InterfaceC53559wnl interfaceC53559wnl = C53487wmS.this.EZpvd;
            if (interfaceC53559wnl != null) {
                interfaceC53559wnl.OLrzqt(zIsSelected, zIsSelected2);
            }
        }

        @Override // o.InterfaceC50649vWf
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C53487wmS.this.AEQbTJ(str, str2);
            C53487wmS.this.fetchVPNInfo();
            C53487wmS.this.values();
            InterfaceC53559wnl interfaceC53559wnl = C53487wmS.this.EZpvd;
            if (interfaceC53559wnl != null) {
                interfaceC53559wnl.AEQbTJ(C53487wmS.this.AYXKKw);
            }
        }
    }

    public final void AhwBna() {
        if (this.AYXKKw.size() <= this.OLrzqt) {
            int childCount = this.KWHzl.copydefault.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = this.KWHzl.copydefault.getChildAt(i);
                C50651vWh c50651vWh = childAt instanceof C50651vWh ? (C50651vWh) childAt : null;
                if (c50651vWh != null) {
                    c50651vWh.setDeleteEnable(false);
                }
            }
        }
    }

    public final java.lang.String OLrzqt(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.AYXKKw);
        if (arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new StateListAnimator());
        }
        java.util.Iterator it = arrayList.iterator();
        java.lang.String strAddS$default = "";
        while (it.hasNext()) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, ((SelectCoinData) it.next()).getRatio(), null, null, null, 14, null);
        }
        return C33129mqd.OLrzqt((java.lang.Object) strAddS$default, (java.lang.Object) 100) ? C33129mqd.formatS$default(C33129mqd.divS$default(java.lang.Integer.valueOf(i), C33129mqd.divS$default(C33129mqd.copydefault(((SelectCoinData) arrayList.get(0)).getRatio()), 100, null, null, null, 14, null), null, null, null, 14, null), 2, null, RoundingMode.UP, 2, null) : "0";
    }

    public final java.lang.String AYXKKw() {
        return OLrzqt(this.djBIcL);
    }

    public final void isConnected() {
        this.KWHzl.KWHzl.OLrzqt(0L);
        this.KWHzl.KWHzl.post(new java.lang.Runnable() { // from class: o.wmW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C53487wmS.fetchVPNInfo(this.KWHzl);
            }
        });
    }

    public static final void fetchVPNInfo(C53487wmS c53487wmS) {
        C54984xbQ c54984xbQ = c53487wmS.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        c53487wmS.OLrzqt(c54984xbQ, true);
    }

    public final void djBIcL() {
        this.KWHzl.KWHzl.fIwbmz();
        C54984xbQ c54984xbQ = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        OLrzqt(c54984xbQ, 100L, new Function0() { // from class: o.wmR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53487wmS.AkhnZx(this.AEQbTJ);
            }
        });
    }

    public static final Unit AkhnZx(C53487wmS c53487wmS) {
        C54984xbQ c54984xbQ = c53487wmS.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        c53487wmS.setCheckmarkVisible(c54984xbQ, true);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        C54984xbQ c54984xbQ = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        setCheckmarkVisible(c54984xbQ, false);
        C54984xbQ c54984xbQ2 = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ2, "");
        OLrzqt(c54984xbQ2, 100L, new Function0() { // from class: o.wmP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53487wmS.values(this.OLrzqt);
            }
        });
    }

    public static final Unit values(C53487wmS c53487wmS) {
        C54984xbQ c54984xbQ = c53487wmS.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        c53487wmS.OLrzqt(c54984xbQ, false);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final boolean z) {
        C54984xbQ c54984xbQ = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        setCheckmarkVisible(c54984xbQ, z);
        C54984xbQ c54984xbQ2 = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ2, "");
        OLrzqt(c54984xbQ2, 100L, new Function0() { // from class: o.wmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53487wmS.copydefault(this.EZpvd, z);
            }
        });
    }

    public static final Unit copydefault(C53487wmS c53487wmS, boolean z) {
        C54984xbQ c54984xbQ = c53487wmS.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        c53487wmS.OLrzqt(c54984xbQ, z);
        return Unit.INSTANCE;
    }

    public final C54984xbQ valueOf() {
        C54984xbQ c54984xbQ = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        return c54984xbQ;
    }

    public final C54984xbQ OLrzqt() {
        C54984xbQ c54984xbQ = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c54984xbQ, "");
        return c54984xbQ;
    }

    public final void setCheckmarkVisible(C54984xbQ c54984xbQ, boolean z) {
        android.graphics.drawable.Drawable drawableKWHzl;
        if (!z || (drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.Dmq)) == null) {
            drawableKWHzl = null;
        } else {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        c54984xbQ.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
    }

    public static final void KWHzl(android.view.View view, Function0 function0) {
        try {
            Result.Application application = Result.Companion;
            function0.invoke();
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void OLrzqt(final android.view.View view, long j, final Function0<Unit> function0) {
        view.postDelayed(new java.lang.Runnable() { // from class: o.wmU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C53487wmS.KWHzl(view, function0);
            }
        }, j);
    }

    public final void OLrzqt(C54984xbQ c54984xbQ, boolean z) {
        c54984xbQ.setSelected(z);
        new C55280xgv().EZpvd(C55298xhM.dp2pxFloat$default(8.0f, null, 1, null)).values(C33070mpX.copydefault(C52761wXj.Activity.GQzpsZ)).fetchVPNInfo(z ? C55298xhM.dpInt$default(1.0f, (android.content.Context) null, 1, (java.lang.Object) null) : 0).DbNXlk(z ? C33070mpX.copydefault(C52761wXj.Activity.fdOvFl) : 0).OLrzqt(c54984xbQ);
    }

    public final void KWHzl(@NotNull java.util.List<SelectCoinData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        java.lang.String strAddS$default = "";
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SelectCoinData selectCoinData = (SelectCoinData) it.next();
            java.lang.String ratio = selectCoinData.getRatio();
            if (ratio != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ratio)) {
                if (C33129mqd.valueOf(selectCoinData.getRatio(), 1)) {
                    selectCoinData.setRatio(C33129mqd.mulS$default(selectCoinData.getRatio(), 100, null, null, null, 14, null));
                }
                strAddS$default = C33129mqd.addS$default(strAddS$default, selectCoinData.getRatio(), null, null, null, 14, null);
            }
        }
        if (C33129mqd.copydefault((java.lang.Object) strAddS$default, (java.lang.Object) 100)) {
            for (SelectCoinData selectCoinData2 : list) {
                java.lang.String ratio2 = selectCoinData2.getRatio();
                if (ratio2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ratio2)) {
                    selectCoinData2.setRatio("5");
                }
            }
        }
        this.AYXKKw.clear();
        this.AYXKKw.addAll(list);
        this.KWHzl.copydefault.removeAllViews();
        boolean z = this.AYXKKw.size() > this.OLrzqt;
        int size = this.AYXKKw.size();
        for (int i = 0; i < size; i++) {
            java.lang.String name = this.AYXKKw.get(i).getName();
            if (name == null) {
                name = "";
            }
            java.lang.String icon = this.AYXKKw.get(i).getIcon();
            if (icon == null) {
                icon = "";
            }
            java.lang.String ratio3 = this.AYXKKw.get(i).getRatio();
            if (ratio3 == null) {
                ratio3 = "";
            }
            OLrzqt(name, icon, ratio3, z);
        }
        InterfaceC53559wnl interfaceC53559wnl = this.EZpvd;
        if (interfaceC53559wnl != null) {
            interfaceC53559wnl.OLrzqt(this.AYXKKw);
        }
        values();
        fetchVPNInfo();
        KWHzl();
    }

    public final void AEQbTJ(java.lang.String str) {
        java.util.Iterator<T> it = this.AYXKKw.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SelectCoinData selectCoinData = (SelectCoinData) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) selectCoinData.getName(), (java.lang.Object) str)) {
                this.AYXKKw.remove(selectCoinData);
                break;
            }
        }
        InterfaceC53559wnl interfaceC53559wnl = this.EZpvd;
        if (interfaceC53559wnl != null) {
            interfaceC53559wnl.OLrzqt(this.AYXKKw);
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        for (SelectCoinData selectCoinData : this.AYXKKw) {
            if (Intrinsics.EZpvd((java.lang.Object) selectCoinData.getName(), (java.lang.Object) str)) {
                selectCoinData.setRatio(str2);
                return;
            }
        }
    }

    public final void fetchVPNInfo() {
        java.util.Iterator<T> it = this.AYXKKw.iterator();
        int iAhwBna = 0;
        while (it.hasNext()) {
            iAhwBna += C33129mqd.AhwBna(((SelectCoinData) it.next()).getRatio());
        }
        int iCopydefault = C33070mpX.copydefault(!C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(iAhwBna), (java.lang.Object) 100) ? C52761wXj.Activity.DPhTBN : C52761wXj.Activity.QwvEab);
        xMR xmr = xMR.copydefault;
        java.lang.String percent$default = xMR.formatPercent$default(xmr, C33129mqd.divS$default(java.lang.Integer.valueOf(100 - iAhwBna), 100, null, null, null, 14, null), 0, 0, null, 10, null);
        android.text.SpannableStringBuilder spannableStringBuilderValueOf = android.text.SpannableStringBuilder.valueOf(percent$default + " / " + xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) 100), null, C38307pTy.Companion.copydefault(0), null, null, null, 58, null));
        spannableStringBuilderValueOf.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), 0, percent$default.length(), 18);
        this.KWHzl.djBIcL.setText(spannableStringBuilderValueOf);
        InterfaceC53559wnl interfaceC53559wnl = this.EZpvd;
        if (interfaceC53559wnl != null) {
            interfaceC53559wnl.AEQbTJ(iAhwBna == 100);
        }
    }
}
