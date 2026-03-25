package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gQD extends LinearLayoutCompat {
    public final hGL EZpvd;
    public final C43316rmw OLrzqt;
    public final java.util.ArrayList<C20073gZx<? extends java.lang.Object>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gQD(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:19) call: o.gQD.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ gQD(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gQD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hGL hglOLrzqt = hGL.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hglOLrzqt, "");
        this.EZpvd = hglOLrzqt;
        this.OLrzqt = new C43316rmw();
        this.copydefault = new java.util.ArrayList<>();
        setOrientation(1);
        copydefault();
        copydefault(attributeSet);
    }

    private final void copydefault(android.util.AttributeSet attributeSet) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int[] iArr = C23274hvD.LoaderManager.zsXlph;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.EZpvd.copydefault.setText(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context2, C23274hvD.LoaderManager.gHZMYf, 0, 4, null));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void copydefault() {
        this.EZpvd.KWHzl.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.EZpvd.KWHzl.setAdapter(this.OLrzqt);
        this.EZpvd.KWHzl.addItemDecoration(new C22292hcc());
        this.OLrzqt.register(C20073gZx.class, new C22295hcf(new Function1() { // from class: o.gQB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gQD.AEQbTJ(this.copydefault, (C20073gZx) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(gQD gqd, C20073gZx c20073gZx) {
        Intrinsics.checkNotNullParameter(c20073gZx, "");
        java.util.Iterator<C20073gZx<? extends java.lang.Object>> it = gqd.copydefault.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().KWHzl()) {
                break;
            }
            i2++;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            java.util.ArrayList<C20073gZx<? extends java.lang.Object>> arrayList = gqd.copydefault;
            arrayList.set(iIntValue, C20073gZx.copy$default(arrayList.get(iIntValue), null, false, null, false, false, 29, null));
        }
        java.util.Iterator<C20073gZx<? extends java.lang.Object>> it2 = gqd.copydefault.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) it2.next().OLrzqt(), (java.lang.Object) c20073gZx.OLrzqt())) {
                break;
            }
            i++;
        }
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
        java.lang.Integer num = numValueOf2.intValue() != -1 ? numValueOf2 : null;
        if (num != null) {
            int iIntValue2 = num.intValue();
            java.util.ArrayList<C20073gZx<? extends java.lang.Object>> arrayList2 = gqd.copydefault;
            arrayList2.set(iIntValue2, C20073gZx.copy$default(arrayList2.get(iIntValue2), null, true, null, false, false, 29, null));
        }
        gqd.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final <T> void AEQbTJ(@NotNull java.util.List<C20073gZx<T>> list) {
        T next;
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.clear();
        this.copydefault.addAll(list);
        java.util.ArrayList<C20073gZx<? extends java.lang.Object>> arrayList = this.copydefault;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.KWHzl);
        java.lang.Object obj = new java.lang.Object();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            } else {
                next = it.next();
                if (((C20073gZx) next).KWHzl()) {
                    break;
                }
            }
        }
        arrayList.add(0, new C20073gZx<>(strAYXKKw, next == null, obj, false, true, 8, null));
        AEQbTJ();
    }

    private final void AEQbTJ() {
        this.OLrzqt.setItems(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.copydefault));
        this.OLrzqt.notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T KWHzl() {
        T next;
        java.lang.Object objAEQbTJ;
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            if (((C20073gZx) next).KWHzl()) {
                break;
            }
        }
        C20073gZx c20073gZx = next;
        if (c20073gZx == null) {
            objAEQbTJ = null;
        } else {
            if (c20073gZx.EZpvd()) {
                c20073gZx = null;
            }
            if (c20073gZx != null) {
                objAEQbTJ = c20073gZx.AEQbTJ();
            }
        }
        if (objAEQbTJ == null) {
            return null;
        }
        return (T) objAEQbTJ;
    }
}
