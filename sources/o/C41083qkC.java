package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C41090qkJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41083qkC extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C42706rbV AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41083qkC(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41083qkC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.qkC.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41083qkC(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41083qkC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42706rbV c42706rbVCopydefault = C42706rbV.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42706rbVCopydefault, "");
        this.AEQbTJ = c42706rbVCopydefault;
    }

    /* JADX INFO: renamed from: o.qkC$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qkC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull java.lang.String str, C41090qkJ c41090qkJ) {
        java.util.List<C41090qkJ.ActionBar> list;
        java.util.List<C41090qkJ.ActionBar> list2;
        java.util.List<C41090qkJ.ActionBar> list3;
        Intrinsics.checkNotNullParameter(str, "");
        LinkedHashMap<java.lang.String, java.util.List<C41090qkJ.ActionBar>> linkedHashMapEZpvd = c41090qkJ != null ? c41090qkJ.EZpvd() : null;
        java.util.List<C41090qkJ.ActionBar> list4 = linkedHashMapEZpvd != null ? linkedHashMapEZpvd.get("COLUMN_1") : null;
        int length = this.AEQbTJ.copydefault.getReferencedIds().length;
        if (list4 != null) {
            int i = 0;
            for (java.lang.Object obj : list4) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C41090qkJ.ActionBar actionBar = (C41090qkJ.ActionBar) obj;
                if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(length))) {
                    actionBar.KWHzl(true);
                }
                i++;
            }
        }
        EZpvd(list4);
        for (int i2 = 0; i2 < length; i2++) {
            C41081qkA c41081qkAEZpvd = EZpvd(this.AEQbTJ.copydefault.getReferencedIds()[i2]);
            if (!C33129mqd.KWHzl((java.util.Collection) list4)) {
                list3 = null;
            } else if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2), list4 != null ? java.lang.Integer.valueOf(list4.size()) : null)) {
                list3 = list4;
            }
            if (list3 != null && c41081qkAEZpvd != null) {
                c41081qkAEZpvd.copydefault(str, list3.get(i2));
            }
        }
        java.util.List<C41090qkJ.ActionBar> list5 = linkedHashMapEZpvd != null ? linkedHashMapEZpvd.get("COLUMN_2") : null;
        int length2 = this.AEQbTJ.OLrzqt.getReferencedIds().length;
        if (list5 != null) {
            int i3 = 0;
            for (java.lang.Object obj2 : list5) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                C41090qkJ.ActionBar actionBar2 = (C41090qkJ.ActionBar) obj2;
                if (C33129mqd.valueOf(java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(length2))) {
                    actionBar2.KWHzl(true);
                }
                i3++;
            }
        }
        EZpvd(list5);
        for (int i4 = 0; i4 < length2; i4++) {
            C41081qkA c41081qkAEZpvd2 = EZpvd(this.AEQbTJ.OLrzqt.getReferencedIds()[i4]);
            if (!C33129mqd.KWHzl((java.util.Collection) list5)) {
                list2 = null;
            } else if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i4), list5 != null ? java.lang.Integer.valueOf(list5.size()) : null)) {
                list2 = list5;
            }
            if (list2 != null && c41081qkAEZpvd2 != null) {
                c41081qkAEZpvd2.copydefault(str, list2.get(i4));
            }
        }
        java.util.List<C41090qkJ.ActionBar> list6 = linkedHashMapEZpvd != null ? linkedHashMapEZpvd.get("COLUMN_3") : null;
        int length3 = this.AEQbTJ.djBIcL.getReferencedIds().length;
        if (list6 != null) {
            int i5 = 0;
            for (java.lang.Object obj3 : list6) {
                if (i5 < 0) {
                    yDY.AYXKKw();
                }
                C41090qkJ.ActionBar actionBar3 = (C41090qkJ.ActionBar) obj3;
                if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(length3))) {
                    actionBar3.KWHzl(true);
                }
                i5++;
            }
        }
        EZpvd(list6);
        for (int i6 = 0; i6 < length3; i6++) {
            C41081qkA c41081qkAEZpvd3 = EZpvd(this.AEQbTJ.djBIcL.getReferencedIds()[i6]);
            if (!C33129mqd.KWHzl((java.util.Collection) list6)) {
                list = null;
            } else if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i6), list6 != null ? java.lang.Integer.valueOf(list6.size()) : null)) {
                list = list6;
            }
            if (list != null && c41081qkAEZpvd3 != null) {
                c41081qkAEZpvd3.copydefault(str, list.get(i6));
            }
        }
    }

    public final C41081qkA EZpvd(int i) {
        android.view.View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof C41081qkA) {
            return (C41081qkA) viewFindViewById;
        }
        return null;
    }

    public final void EZpvd(java.util.List<C41090qkJ.ActionBar> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        copydefault(list, list.size() - 1, C33129mqd.AhwBna(java.lang.Integer.valueOf(C55298xhM.dp2px$default(C33129mqd.djBIcL(java.lang.Integer.valueOf(223 - ((list.size() - 1) * 4))), null, 1, null))));
    }

    private final void copydefault(java.util.List<C41090qkJ.ActionBar> list, int i, int i2) {
        int i3 = i;
        if (list == null || list.isEmpty() || i3 > list.size() - 1) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (C33129mqd.OLrzqt((java.lang.Object) ((C41090qkJ.ActionBar) obj).djBIcL(), (java.lang.Object) 0)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == list.size()) {
            while (-1 < i3) {
                list.get(i3).OLrzqt(i2 / list.size());
                AEQbTJ(list.get(i3), list.get(i3).KWHzl());
                i3--;
            }
            return;
        }
        float fDjBIcL = 0.0f;
        for (int i4 = i3; -1 < i4; i4--) {
            fDjBIcL += C33129mqd.djBIcL(C33129mqd.EZpvd(list.get(i4).djBIcL()).abs());
        }
        for (int i5 = i3; -1 < i5; i5--) {
            int iAhwBna = C33129mqd.AhwBna(C33129mqd.mulS$default(C33129mqd.divS$default(java.lang.Float.valueOf(C33129mqd.djBIcL(C33129mqd.EZpvd(list.get(i5).djBIcL()).abs())), java.lang.Float.valueOf(fDjBIcL), null, null, null, 14, null), java.lang.Integer.valueOf(i2), null, null, null, 14, null));
            if (iAhwBna <= C55298xhM.dp2px$default(C33129mqd.djBIcL(58), null, 1, null)) {
                list.get(i5).OLrzqt(C55298xhM.dp2px$default(C33129mqd.djBIcL(58), null, 1, null));
                AEQbTJ(list.get(i5), list.get(i5).KWHzl());
                copydefault(list, i3 - 1, i2 - list.get(i5).KWHzl());
                return;
            }
            list.get(i5).OLrzqt(iAhwBna);
            AEQbTJ(list.get(i5), list.get(i5).KWHzl());
        }
    }

    public final void AEQbTJ(C41090qkJ.ActionBar actionBar, int i) {
        if (i <= C55298xhM.dp2px$default(C33129mqd.djBIcL(78), null, 1, null)) {
            actionBar.copydefault(0);
            actionBar.OLrzqt("");
            actionBar.copydefault(false);
        } else if (i > C55298xhM.dp2px$default(C33129mqd.djBIcL(78), null, 1, null) && i <= C55298xhM.dp2px$default(C33129mqd.djBIcL(102), null, 1, null)) {
            actionBar.copydefault(1);
            actionBar.OLrzqt("");
        } else {
            actionBar.copydefault(2);
        }
    }
}
