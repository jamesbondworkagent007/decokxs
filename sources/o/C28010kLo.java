package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28010kLo extends android.widget.FrameLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final LinkedHashMap<java.lang.String, java.lang.String> KWHzl;
    public final StateListAnimator OLrzqt;
    public InterfaceC28002kLg copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28010kLo(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28010kLo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull InterfaceC28002kLg interfaceC28002kLg) {
        Intrinsics.checkNotNullParameter(interfaceC28002kLg, "");
        this.copydefault = interfaceC28002kLg;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.kLo.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28010kLo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28010kLo(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28010kLo.EZpvd(context, this);
            }
        });
        this.KWHzl = new LinkedHashMap<>();
        this.OLrzqt = new StateListAnimator();
        LinearLayoutCompat linearLayoutCompat = AYXKKw().EZpvd;
        linearLayoutCompat.setOnClickListener(new ActionBar(linearLayoutCompat, 1000L, this));
    }

    private final hGX AYXKKw() {
        return (hGX) this.AEQbTJ.getValue();
    }

    public static final hGX EZpvd(android.content.Context context, C28010kLo c28010kLo) {
        return hGX.OLrzqt(android.view.LayoutInflater.from(context), c28010kLo, true);
    }

    /* JADX INFO: renamed from: o.kLo$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28006kLk {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC28006kLk
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C28010kLo.this.KWHzl.remove(str);
            C28010kLo.this.copydefault();
            InterfaceC28002kLg interfaceC28002kLg = C28010kLo.this.copydefault;
            if (interfaceC28002kLg != null) {
                java.util.Collection collectionValues = C28010kLo.this.KWHzl.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listAxsJAYsNCnLh) {
                    java.lang.String str2 = (java.lang.String) obj;
                    Intrinsics.copydefault((java.lang.Object) str2);
                    if (str2.length() > 0) {
                        arrayList.add(obj);
                    }
                }
                interfaceC28002kLg.EZpvd(arrayList);
            }
            InterfaceC28002kLg interfaceC28002kLg2 = C28010kLo.this.copydefault;
            if (interfaceC28002kLg2 != null) {
                interfaceC28002kLg2.copydefault();
            }
        }

        @Override // o.InterfaceC28006kLk
        public void EZpvd(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C28010kLo.this.KWHzl.put(str, str2);
            C28010kLo.this.EZpvd();
            InterfaceC28002kLg interfaceC28002kLg = C28010kLo.this.copydefault;
            if (interfaceC28002kLg != null) {
                java.util.Collection collectionValues = C28010kLo.this.KWHzl.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listAxsJAYsNCnLh) {
                    java.lang.String str3 = (java.lang.String) obj;
                    Intrinsics.copydefault((java.lang.Object) str3);
                    if (str3.length() > 0) {
                        arrayList.add(obj);
                    }
                }
                interfaceC28002kLg.EZpvd(arrayList);
            }
        }
    }

    public final void setData(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.clear();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        for (java.lang.String str : arrayList) {
            this.KWHzl.put(C31193lpR.AEQbTJ.KWHzl(), str);
        }
        if (this.KWHzl.isEmpty()) {
            this.KWHzl.put(C31193lpR.AEQbTJ.KWHzl(), "");
        }
        copydefault();
    }

    public final void copydefault() {
        EZpvd();
        KWHzl();
    }

    public final void EZpvd() {
        int i = OLrzqt() ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iKWHzl = C25382ivf.KWHzl(context, i);
        AYXKKw().AEQbTJ.setTextColor(iKWHzl);
        AYXKKw().OLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(iKWHzl));
    }

    public final void KWHzl() {
        AYXKKw().KWHzl.removeAllViews();
        java.util.Set<Map.Entry<java.lang.String, java.lang.String>> setEntrySet = this.KWHzl.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        int i = 0;
        for (java.lang.Object obj : setEntrySet) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Map.Entry entry = (Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.String str = (java.lang.String) key;
            java.lang.Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            AYXKKw().KWHzl.addView(OLrzqt(str, (java.lang.String) value, i == 0));
            i++;
        }
    }

    public final C28011kLp OLrzqt(java.lang.String str, java.lang.String str2, boolean z) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C28011kLp c28011kLp = new C28011kLp(context, null, 0, 6, null);
        c28011kLp.setCallback(this.OLrzqt);
        c28011kLp.setData(str, str2);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
        C55296xhK.AEQbTJ(layoutParams, 0, z ? 0 : C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0);
        c28011kLp.setLayoutParams(layoutParams);
        return c28011kLp;
    }

    public final void AEQbTJ() {
        this.KWHzl.put(C31193lpR.AEQbTJ.KWHzl(), "");
    }

    public final boolean OLrzqt() {
        return this.KWHzl.size() < 10;
    }

    /* JADX INFO: renamed from: o.kLo$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C28010kLo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28010kLo c28010kLo) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c28010kLo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.OLrzqt.OLrzqt()) {
                    this.OLrzqt.AEQbTJ();
                    this.OLrzqt.copydefault();
                    InterfaceC28002kLg interfaceC28002kLg = this.OLrzqt.copydefault;
                    if (interfaceC28002kLg != null) {
                        interfaceC28002kLg.EZpvd();
                    }
                }
            }
        }
    }
}
