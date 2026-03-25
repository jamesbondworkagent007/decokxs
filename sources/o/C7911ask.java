package o;

import com.immomo.mls.fun.ud.view.viewpager.UDViewPagerCell;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.ask, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7911ask {
    public static final int AEQbTJ(@NotNull android.content.Context context, int i) {
        int iEZpvd;
        Intrinsics.checkNotNullParameter(context, "");
        if (i > 0) {
            iEZpvd = C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            android.content.res.Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            iEZpvd = C55302xhQ.EZpvd(resources);
        }
        if (C34703nhO.AYXKKw(context)) {
            return (int) (((double) iEZpvd) * (context.getResources().getConfiguration().orientation != 1 ? 0.5d : 0.75d));
        }
        return iEZpvd / 2;
    }

    public static final void AEQbTJ(@NotNull final android.widget.ImageView imageView, @NotNull final JDImageInfo jDImageInfo, final InterfaceC7852are interfaceC7852are) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(jDImageInfo, "");
        if (Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            KWHzl(context, imageView, jDImageInfo, interfaceC7852are);
            return;
        }
        C7840arS.copydefault(new java.lang.Runnable() { // from class: o.asi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C7911ask.EZpvd(imageView, jDImageInfo, interfaceC7852are);
            }
        });
    }

    public static final void EZpvd(android.widget.ImageView imageView, JDImageInfo jDImageInfo, InterfaceC7852are interfaceC7852are) {
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        KWHzl(context, imageView, jDImageInfo, interfaceC7852are);
    }

    public static final void OLrzqt(@NotNull final android.content.Context context, @NotNull final JDImageInfo jDImageInfo, final InterfaceC7852are interfaceC7852are) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(jDImageInfo, "");
        if (Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            KWHzl(context, null, jDImageInfo, interfaceC7852are);
        } else {
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.ash
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C7911ask.AEQbTJ(context, jDImageInfo, interfaceC7852are);
                }
            });
        }
    }

    public static final void AEQbTJ(android.content.Context context, JDImageInfo jDImageInfo, InterfaceC7852are interfaceC7852are) {
        KWHzl(context, null, jDImageInfo, interfaceC7852are);
    }

    public static final void KWHzl(@NotNull android.content.Context context, android.widget.ImageView imageView, @NotNull JDImageInfo jDImageInfo, InterfaceC7852are interfaceC7852are) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(jDImageInfo, "");
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
        Intrinsics.checkNotNullExpressionValue(interfaceC7855arhAYXKKw, "");
        if (!zIsNetUrl && !android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            android.graphics.drawable.Drawable drawableKWHzl = interfaceC7855arhAYXKKw.KWHzl(context, jDImageInfo);
            if (imageView != null) {
                imageView.setImageDrawable(drawableKWHzl);
            }
            if (interfaceC7852are != null) {
                interfaceC7852are.copydefault(drawableKWHzl, null);
                return;
            }
            return;
        }
        if (!zIsNetUrl && android.text.TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            if (imageView != null) {
                imageView.setImageDrawable(null);
            }
            if (interfaceC7852are != null) {
                interfaceC7852are.copydefault(null, null);
                return;
            }
            return;
        }
        if (android.text.TextUtils.isEmpty(jDImageInfo.getNetUrl())) {
            return;
        }
        if (imageView != null) {
            interfaceC7855arhAYXKKw.EZpvd(context, imageView, jDImageInfo.getNetUrl(), jDImageInfo.isAutoMirrored(), null, null, interfaceC7852are);
        } else {
            interfaceC7855arhAYXKKw.KWHzl(context, jDImageInfo.getNetUrl(), jDImageInfo.isAutoMirrored(), null, interfaceC7852are);
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View, java.lang.Object] */
    public static final android.view.ViewGroup AEQbTJ(java.lang.Object obj) {
        if (obj instanceof C7462akL) {
            LuaTable luaTableCopydefault = ((C7462akL) obj).copydefault();
            LuaValue luaValue = luaTableCopydefault != null ? luaTableCopydefault.get("contentView") : null;
            if (luaValue instanceof UDViewPagerCell) {
                ?? F_ = ((UDViewPagerCell) luaValue).f_();
                Intrinsics.checkNotNullExpressionValue(F_, "");
                return AEQbTJ((android.view.View) F_, 0);
            }
        }
        return null;
    }

    public static final boolean OLrzqt(@NotNull Globals globals) {
        Intrinsics.checkNotNullParameter(globals, "");
        return AEQbTJ(C7594aml.AEQbTJ(globals));
    }

    public static final boolean AEQbTJ(android.content.Context context) {
        if (context == null) {
            return C33492mxV.OLrzqt();
        }
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            return false;
        }
        if (i != 32) {
            return C33492mxV.OLrzqt();
        }
        return true;
    }

    public static final boolean KWHzl(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (!(charSequence instanceof android.text.Spanned)) {
            return false;
        }
        java.lang.Object[] spans = ((android.text.Spanned) charSequence).getSpans(0, charSequence.length(), java.lang.Object.class);
        Intrinsics.copydefault(spans);
        return spans.length != 0;
    }

    public static final android.view.ViewGroup AEQbTJ(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        if (i >= 3 || view.getVisibility() != 0) {
            return null;
        }
        if (view instanceof C7542alm) {
            return ((C7542alm) view).djBIcL();
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = viewGroup.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            android.view.ViewGroup viewGroupAEQbTJ = AEQbTJ(childAt, i + 1);
            if (viewGroupAEQbTJ != null) {
                return viewGroupAEQbTJ;
            }
        }
        return null;
    }
}
