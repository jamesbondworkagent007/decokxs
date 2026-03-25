package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7760aps extends AbstractC52789wYk {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C7684aoV AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C7684aoV c7684aoV) {
        this.AEQbTJ = c7684aoV;
    }

    @Override // o.AbstractC52789wYk, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52789wYk, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55317xhf c55317xhfOLrzqt;
        C55317xhf c55317xhfOLrzqt2;
        android.widget.TextView textViewValueOf;
        android.widget.TextView textViewGEmmrt;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        final C7684aoV c7684aoV = this.AEQbTJ;
        if (c7684aoV != null) {
            java.lang.String strDjBIcL = c7684aoV.djBIcL();
            if (strDjBIcL != null && (textViewGEmmrt = gEmmrt()) != null) {
                textViewGEmmrt.setText(strDjBIcL);
            }
            java.lang.String strCopydefault = c7684aoV.copydefault();
            if (strCopydefault != null && (textViewValueOf = valueOf()) != null) {
                textViewValueOf.setText(strCopydefault);
            }
            java.lang.String strAEQbTJ = c7684aoV.AEQbTJ();
            if (strAEQbTJ != null && (c55317xhfOLrzqt2 = OLrzqt()) != null) {
                c55317xhfOLrzqt2.setText(strAEQbTJ);
            }
            if (c7684aoV.KWHzl() != null && (c55317xhfOLrzqt = OLrzqt()) != null) {
                c55317xhfOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.apr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C7760aps.EZpvd(c7684aoV, view);
                    }
                });
            }
        }
        copydefault();
    }

    public static final void EZpvd(C7684aoV c7684aoV, android.view.View view) {
        View.OnClickListener onClickListenerKWHzl = c7684aoV.KWHzl();
        if (onClickListenerKWHzl != null) {
            onClickListenerKWHzl.onClick(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault() {
        java.util.List<C55371xig> arrayList;
        java.util.List<C7766apy> listEZpvd;
        C7684aoV c7684aoV = this.AEQbTJ;
        if (c7684aoV == null || (listEZpvd = c7684aoV.EZpvd()) == null) {
            arrayList = new java.util.ArrayList<>();
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            final int i = 0;
            for (java.lang.Object obj : listEZpvd) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C7766apy c7766apy = (C7766apy) obj;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                java.lang.String str = "";
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                final C55371xig c55371xig = new C55371xig(fragmentActivityRequireActivity, null, 2, null);
                java.lang.String strCopydefault = c7766apy.copydefault();
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                c55371xig.setTitleText(strCopydefault);
                java.lang.String strAEQbTJ = c7766apy.AEQbTJ();
                if (strAEQbTJ != null) {
                    str = strAEQbTJ;
                }
                c55371xig.setDescriptionText(str);
                AEQbTJ(c7766apy.EZpvd(), new Function1() { // from class: o.apA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C7760aps.KWHzl(c55371xig, (android.graphics.drawable.Drawable) obj2);
                    }
                });
                c55371xig.AhwBna().setAttachingView(c7766apy.OLrzqt());
                c55371xig.setClickCallback(new Function0() { // from class: o.apz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C7760aps.KWHzl(this.OLrzqt, i);
                    }
                });
                arrayList2.add(c55371xig);
                i++;
            }
            arrayList = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
            if (arrayList == null) {
            }
        }
        OLrzqt(arrayList);
    }

    public static final Unit KWHzl(C55371xig c55371xig, android.graphics.drawable.Drawable drawable) {
        c55371xig.setImageDrawable(drawable);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C7760aps c7760aps, int i) {
        AdapterView.OnItemClickListener onItemClickListenerOLrzqt;
        C7684aoV c7684aoV = c7760aps.AEQbTJ;
        if (c7684aoV != null && (onItemClickListenerOLrzqt = c7684aoV.OLrzqt()) != null) {
            onItemClickListenerOLrzqt.onItemClick(null, null, i, 0L);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final JDImageInfo jDImageInfo, final Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        if (jDImageInfo == null) {
            return;
        }
        if (Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            copydefault(jDImageInfo, function1);
        } else {
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.apv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C7760aps.EZpvd(this.AEQbTJ, jDImageInfo, function1);
                }
            });
        }
    }

    public static final void EZpvd(C7760aps c7760aps, JDImageInfo jDImageInfo, Function1 function1) {
        c7760aps.copydefault(jDImageInfo, (Function1<? super android.graphics.drawable.Drawable, Unit>) function1);
    }

    public final void copydefault(JDImageInfo jDImageInfo, final Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
        Intrinsics.checkNotNullExpressionValue(interfaceC7855arhAYXKKw, "");
        if (!zIsNetUrl && !android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            android.graphics.drawable.Drawable drawableKWHzl = interfaceC7855arhAYXKKw.KWHzl(context, jDImageInfo);
            Intrinsics.checkNotNullExpressionValue(drawableKWHzl, "");
            function1.invoke(drawableKWHzl);
        } else if (!zIsNetUrl && android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            function1.invoke(null);
        } else {
            if (android.text.TextUtils.isEmpty(jDImageInfo.getNetUrl())) {
                return;
            }
            interfaceC7855arhAYXKKw.KWHzl(context, jDImageInfo.getNetUrl(), jDImageInfo.isAutoMirrored(), null, new InterfaceC7852are() { // from class: o.apx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC7852are
                public final void copydefault(android.graphics.drawable.Drawable drawable, java.lang.String str) {
                    C7760aps.EZpvd(function1, drawable, str);
                }
            });
        }
    }

    public static final void EZpvd(Function1 function1, android.graphics.drawable.Drawable drawable, java.lang.String str) {
        function1.invoke(drawable);
    }

    /* JADX INFO: renamed from: o.aps$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aps.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C7760aps EZpvd(@NotNull C7684aoV c7684aoV) {
            Intrinsics.checkNotNullParameter(c7684aoV, "");
            C7760aps c7760aps = new C7760aps();
            c7760aps.KWHzl(c7684aoV);
            return c7760aps;
        }
    }
}
