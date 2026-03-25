package o;

import android.view.ViewGroup;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gxZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21321gxZ extends android.widget.FrameLayout {
    public androidx.fragment.app.FragmentManager AEQbTJ;
    public java.util.ArrayList<DeFiApyDataInfoData> EZpvd;
    public final wXI OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21321gxZ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21321gxZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.gxZ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C21321gxZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21321gxZ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.ArrayList<>();
        android.view.LayoutInflater.from(context).inflate(C13754dXa.TaskDescription.fHqPtx, (android.view.ViewGroup) this, true);
        wXI wxi = (wXI) findViewById(C13754dXa.ActionBar.QVsKAR);
        this.OLrzqt = wxi;
        wxi.setCreateViewHolderCallback(new Function1() { // from class: o.gyb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21321gxZ.OLrzqt(context, (ST) obj);
            }
        });
        wxi.KWHzl(C55298xhM.dpInt$default(72, (android.content.Context) null, 1, (java.lang.Object) null));
        wxi.setIndicator(null);
        wxi.setOnItemClick(new Function1() { // from class: o.gxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21321gxZ.KWHzl(this.EZpvd, context, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit OLrzqt(android.content.Context context, ST st) {
        Intrinsics.checkNotNullParameter(st, "");
        st.itemView.setPadding(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0);
        try {
            android.widget.TextView textView = (android.widget.TextView) st.OLrzqt(C52761wXj.FragmentManager.gHZMYf);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C55298xhM.dp2px$default(2.0f, null, 1, null);
            textView.setLayoutParams(marginLayoutParams);
        } catch (java.lang.Exception e) {
            pUU.copydefault("CoinDetailBanner", "init banner error: " + e);
        }
        android.view.View viewOLrzqt = st.OLrzqt(C52761wXj.FragmentManager.gwTjWJ);
        if (viewOLrzqt != null) {
            ViewGroup.LayoutParams layoutParams2 = viewOLrzqt.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = C55298xhM.OLrzqt(40, context);
                layoutParams2.width = C55298xhM.OLrzqt(40, context);
                viewOLrzqt.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C21321gxZ c21321gxZ, android.content.Context context, int i) {
        androidx.fragment.app.FragmentManager fragmentManager = c21321gxZ.AEQbTJ;
        if (fragmentManager != null) {
            java.util.ArrayList<DeFiApyDataInfoData> arrayList = c21321gxZ.EZpvd;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Long.valueOf(((DeFiApyDataInfoData) it.next()).getCoinId()));
            }
            if (arrayList2.contains(25034771L)) {
                ActivityC18241feg.Companion.copydefault(context, yDY.copydefault(25034771L), null);
            } else {
                InterfaceC25424iwU interfaceC25424iwU = (InterfaceC25424iwU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25424iwU.class));
                if (interfaceC25424iwU != null) {
                    interfaceC25424iwU.copydefault(fragmentManager, context, c21321gxZ.EZpvd);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.util.List<DeFiApyDataInfoData> list) {
        android.view.View viewEZpvd;
        java.lang.String strEZpvd;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.AEQbTJ = fragmentManager;
        this.EZpvd.clear();
        this.EZpvd.addAll(list != null ? list : new java.util.ArrayList<>());
        DeFiApyDataInfoData deFiApyDataInfoData = null;
        java.lang.Object next = null;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (C33129mqd.AEQbTJ(((DeFiApyDataInfoData) obj).getMaxApy(), 0)) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    java.lang.String maxApy = ((DeFiApyDataInfoData) next).getMaxApy();
                    do {
                        java.lang.Object next2 = it.next();
                        java.lang.String maxApy2 = ((DeFiApyDataInfoData) next2).getMaxApy();
                        if (maxApy.compareTo(maxApy2) < 0) {
                            next = next2;
                            maxApy = maxApy2;
                        }
                    } while (it.hasNext());
                }
            }
            deFiApyDataInfoData = (DeFiApyDataInfoData) next;
        }
        if (deFiApyDataInfoData == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int i = C13754dXa.FragmentManager.getText;
        InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
        if (interfaceC25429iwZ != null && (strEZpvd = interfaceC25429iwZ.EZpvd(deFiApyDataInfoData.getMaxApy(), false)) != null) {
            str = strEZpvd;
        }
        C52776wXy c52776wXy = new C52776wXy(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", str))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getString), null, C33070mpX.KWHzl(C13754dXa.Activity.zLjUOn), null, 20, null);
        InterfaceC52777wXz interfaceC52777wXzAEQbTJ = this.OLrzqt.AEQbTJ();
        if (interfaceC52777wXzAEQbTJ != null && (viewEZpvd = interfaceC52777wXzAEQbTJ.EZpvd()) != null) {
            viewEZpvd.setVisibility(8);
        }
        this.OLrzqt.setItems(yDY.AhwBna(c52776wXy));
    }
}
