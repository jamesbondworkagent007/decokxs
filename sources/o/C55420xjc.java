package o;

import android.graphics.Outline;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C5492Tv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xjc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55420xjc {
    public static final int KWHzl = C52761wXj.Activity.HJWChPfvRMlC;
    public static final int OLrzqt = C52761wXj.Activity.RZMhtF;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        showSyncSkeleton$default(view, null, 1, null);
    }

    public static /* synthetic */ void showSyncSkeleton$default(android.view.View view, C55358xiT c55358xiT, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c55358xiT = new C55358xiT(0L, 0, 0, 7, null);
        }
        copydefault(view, c55358xiT);
    }

    public static final void copydefault(@NotNull android.view.View view, @NotNull C55358xiT c55358xiT) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c55358xiT, "");
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup instanceof C5495Ty) {
            ((C5495Ty) viewGroup).showShimmer(true);
            return;
        }
        int iIndexOfChild = viewGroup != null ? viewGroup.indexOfChild(view) : 0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        C5495Ty c5495Ty = new C5495Ty(view.getContext());
        c5495Ty.addView(view, new FrameLayout.LayoutParams(-1, -1));
        if (layoutParams != null) {
            c5495Ty.setLayoutParams(layoutParams);
        }
        if (viewGroup != null) {
            viewGroup.addView(c5495Ty, iIndexOfChild);
        }
        c5495Ty.setShimmer(new C5492Tv.Activity().copydefault(c55358xiT.EZpvd()).djBIcL(ContextCompat.getColor(view.getContext(), c55358xiT.OLrzqt())).AYXKKw(ContextCompat.getColor(view.getContext(), c55358xiT.KWHzl())).copydefault(1.0f).KWHzl(0.0f).AhwBna(20.0f).KWHzl(view.getLayoutDirection() == 0 ? 0 : 2).AhwBna(0).copydefault());
        c5495Ty.showShimmer(true);
    }

    public static final void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.view.ViewParent parent = view.getParent();
        C5495Ty c5495Ty = parent instanceof C5495Ty ? (C5495Ty) parent : null;
        if (c5495Ty != null) {
            c5495Ty.hideShimmer();
        }
    }

    public static /* synthetic */ void asSkeleton$default(android.view.View view, C55360xiV c55360xiV, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c55360xiV = null;
        }
        AEQbTJ(view, c55360xiV);
    }

    public static final void AEQbTJ(@NotNull android.view.View view, C55360xiV c55360xiV) {
        Intrinsics.checkNotNullParameter(view, "");
        if (c55360xiV != null) {
            if (c55360xiV.KWHzl() != null) {
                view.setTag(C52761wXj.FragmentManager.frkDMe, java.lang.Integer.valueOf(view.getLayoutParams().width));
                view.getLayoutParams().width = copydefault(c55360xiV.KWHzl().intValue());
            }
            if (c55360xiV.EZpvd() != null) {
                view.setTag(C52761wXj.FragmentManager.dzCpvv, java.lang.Integer.valueOf(view.getLayoutParams().height));
                view.getLayoutParams().height = copydefault(c55360xiV.EZpvd().intValue());
            }
        }
        view.setTag(C52761wXj.FragmentManager.DUUtXg, view.getBackground());
        view.setTag(C52761wXj.FragmentManager.awiJhF, view.getOutlineProvider());
        view.setTag(C52761wXj.FragmentManager.DSiOMJ, java.lang.Boolean.valueOf(view.getClipToOutline()));
        if (view.getBackground() == null) {
            view.setBackgroundColor(-7829368);
        }
        view.setOutlineProvider(new ActionBar(c55360xiV, view));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: o.xjc$ActionBar */
    public static final class ActionBar extends android.view.ViewOutlineProvider {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C55360xiV EZpvd;

        public ActionBar(C55360xiV c55360xiV, android.view.View view) {
            this.EZpvd = c55360xiV;
            this.AEQbTJ = view;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            java.lang.Float fCopydefault;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            C55360xiV c55360xiV = this.EZpvd;
            if (c55360xiV != null && c55360xiV.OLrzqt()) {
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            C55360xiV c55360xiV2 = this.EZpvd;
            float fFloatValue = (c55360xiV2 == null || (fCopydefault = c55360xiV2.copydefault()) == null) ? 8.0f : fCopydefault.floatValue();
            android.content.Context context = this.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            outline.setRoundRect(0, 0, width, height, C55298xhM.OLrzqt(fFloatValue, context));
        }
    }

    public static final int copydefault(int i) {
        return yII.EZpvd(i * android.content.res.Resources.getSystem().getDisplayMetrics().density);
    }
}
