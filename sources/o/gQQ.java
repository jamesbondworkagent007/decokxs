package o;

import com.okinc.business.dexui.widget.DexEmptyData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gQQ extends C43316rmw {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C30762lhK AEQbTJ;
    public int AhwBna;
    public Function0<Unit> EZpvd;
    public Function1<? super C30765lhN, Unit> KWHzl;
    public final Function0<Unit> OLrzqt;
    public Function0<Unit> djBIcL;
    public Function1<? super C30765lhN, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super C30765lhN, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.djBIcL = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super C30765lhN, Unit> function1) {
        this.valueOf = function1;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gQQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public gQQ(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    public final void EZpvd() {
        register(C30765lhN.class, new C30762lhK(this.OLrzqt, new Function1() { // from class: o.gQW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gQQ.OLrzqt(this.EZpvd, (C30765lhN) obj);
            }
        }, new Function1() { // from class: o.gQV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gQQ.copydefault(this.KWHzl, (C30765lhN) obj);
            }
        }));
        register(DexEmptyData.class, new C25449iwt(new Function0() { // from class: o.gQY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gQQ.AEQbTJ(this.copydefault);
            }
        }));
    }

    public static final Unit OLrzqt(gQQ gqq, C30765lhN c30765lhN) {
        Intrinsics.checkNotNullParameter(c30765lhN, "");
        Function1<? super C30765lhN, Unit> function1 = gqq.valueOf;
        if (function1 != null) {
            function1.invoke(c30765lhN);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(gQQ gqq, C30765lhN c30765lhN) {
        Intrinsics.checkNotNullParameter(c30765lhN, "");
        Function1<? super C30765lhN, Unit> function1 = gqq.KWHzl;
        if (function1 != null) {
            function1.invoke(c30765lhN);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(gQQ gqq) {
        if (gqq.AhwBna == 1) {
            Function0<Unit> function0 = gqq.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function0<Unit> function02 = gqq.djBIcL;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        setItems(list);
        C30762lhK c30762lhK = this.AEQbTJ;
        if (c30762lhK != null) {
            c30762lhK.KWHzl();
        }
        notifyDataSetChanged();
    }

    public final void AEQbTJ() {
        setItems(C56402yEa.EZpvd(new DexEmptyData(6, C33070mpX.AYXKKw(C23274hvD.Fragment.onProgressUpdate), null, null, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, 44, null)));
        notifyDataSetChanged();
    }

    public final void KWHzl() {
        this.AhwBna = 0;
        setItems(C56402yEa.EZpvd(new DexEmptyData(8, C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt), C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd), 0, 0, 48, null)));
        notifyDataSetChanged();
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        int iOLrzqt = OLrzqt(str, str2);
        if (iOLrzqt >= 0) {
            java.util.List<?> items = getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(items, iOLrzqt);
            C30765lhN c30765lhN = objAkhnZx instanceof C30765lhN ? (C30765lhN) objAkhnZx : null;
            if (c30765lhN == null) {
                return;
            }
            c30765lhN.AEQbTJ(str4);
            c30765lhN.KWHzl(str3);
            c30765lhN.EZpvd(str5);
            c30765lhN.copydefault(str6);
            notifyItemChanged(iOLrzqt, "payload_pnl");
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function0, "");
        int iOLrzqt = OLrzqt(str, str2);
        if (iOLrzqt >= 0) {
            if (C33129mqd.OLrzqt(str3, "0")) {
                java.util.List<?> items = getItems();
                Intrinsics.checkNotNullExpressionValue(items, "");
                java.util.List<?> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) items);
                listFJNWhG.remove(iOLrzqt);
                setItems(listFJNWhG);
                notifyItemRemoved(iOLrzqt);
                this.OLrzqt.invoke();
                return;
            }
            java.util.List<?> items2 = getItems();
            Intrinsics.checkNotNullExpressionValue(items2, "");
            java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(items2, iOLrzqt);
            C30765lhN c30765lhN = objAkhnZx instanceof C30765lhN ? (C30765lhN) objAkhnZx : null;
            if (c30765lhN == null) {
                return;
            }
            c30765lhN.OLrzqt(str3);
            c30765lhN.KWHzl(str4);
            notifyItemChanged(iOLrzqt, "payload_balance");
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            function0.invoke();
        }
    }

    public final java.util.Set<C28438kal> OLrzqt(int i, int i2) {
        C28438kal c28438kal;
        java.util.List<?> items = getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        for (java.lang.Object obj : items) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            if (i <= i3 && i3 <= i2) {
                arrayList.add(obj);
            }
            i3++;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (obj2 instanceof C30765lhN) {
                C30765lhN c30765lhN = (C30765lhN) obj2;
                c28438kal = new C28438kal(c30765lhN.AEQbTJ(), c30765lhN.gEmmrt());
            } else {
                c28438kal = null;
            }
            if (c28438kal != null) {
                arrayList2.add(c28438kal);
            }
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
    }

    public final int OLrzqt(java.lang.String str, java.lang.String str2) {
        java.util.List<?> items = getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int i = 0;
        for (java.lang.Object obj : items) {
            if (obj instanceof C30765lhN) {
                C30765lhN c30765lhN = (C30765lhN) obj;
                if (Intrinsics.EZpvd((java.lang.Object) c30765lhN.AEQbTJ(), (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) c30765lhN.gEmmrt(), (java.lang.Object) str2)) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
}
