package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.net.bean.BannerInfoNew;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18027fae extends android.widget.RelativeLayout {
    public View.OnClickListener AEQbTJ;
    public C17088ewG KWHzl;
    public java.util.List<BannerInfoNew> OLrzqt;
    public final eZZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18027fae(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBannerClickListener(View.OnClickListener onClickListener) {
        this.AEQbTJ = onClickListener;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:40) call: o.fae.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C18027fae(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18027fae(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new eZY(null, null, null, 7, null);
        this.OLrzqt = yDY.AhwBna();
        C17088ewG c17088ewGKWHzl = C17088ewG.KWHzl(android.view.LayoutInflater.from(context), this);
        this.KWHzl = c17088ewGKWHzl;
        if (c17088ewGKWHzl != null) {
            wXI wxi = c17088ewGKWHzl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(wxi, "");
            try {
                wxi.setCreateViewHolderCallback(new Function1() { // from class: o.faj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C18027fae.AEQbTJ(context, (ST) obj);
                    }
                });
                wxi.KWHzl(C55298xhM.dpInt$default(96, (android.content.Context) null, 1, (java.lang.Object) null));
            } catch (java.lang.Exception e) {
                pUU.copydefault("zqh", "BannerView init error:" + e);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static final Unit AEQbTJ(android.content.Context context, ST st) {
        Intrinsics.checkNotNullParameter(st, "");
        st.itemView.setPadding(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0);
        android.view.View viewOLrzqt = st.OLrzqt(C52761wXj.FragmentManager.gwTjWJ);
        android.widget.TextView textView = (android.widget.TextView) st.OLrzqt(C52761wXj.FragmentManager.gHZMYf);
        android.widget.TextView textView2 = (android.widget.TextView) st.OLrzqt(C52761wXj.FragmentManager.iKEqwx);
        textView2.setMaxLines(1);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView.setEllipsize(truncateAt);
        Intrinsics.copydefault(viewOLrzqt);
        ViewGroup.LayoutParams layoutParams = viewOLrzqt.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C55298xhM.OLrzqt(72, context);
            layoutParams.width = C55298xhM.OLrzqt(72, context);
            viewOLrzqt.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = viewOLrzqt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(C55298xhM.KWHzl(8.0f, context));
            }
            viewOLrzqt.setLayoutParams(marginLayoutParams);
            return Unit.INSTANCE;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void setData(@NotNull final java.util.List<BannerInfoNew> list, boolean z, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        final wXI wxi;
        final java.lang.String dayLogo;
        android.view.View viewEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        setVisibility((list.isEmpty() || z) ? 8 : 0);
        if (EZpvd(this.OLrzqt, list)) {
            return;
        }
        this.OLrzqt = list;
        C17088ewG c17088ewG = this.KWHzl;
        if (c17088ewG == null || (wxi = c17088ewG.KWHzl) == null) {
            return;
        }
        InterfaceC52777wXz interfaceC52777wXzAEQbTJ = wxi.AEQbTJ();
        if (interfaceC52777wXzAEQbTJ != null && (viewEZpvd = interfaceC52777wXzAEQbTJ.EZpvd()) != null) {
            viewEZpvd.setVisibility(list.size() <= 1 ? 8 : 0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (BannerInfoNew bannerInfoNew : list) {
            if (C33492mxV.OLrzqt()) {
                dayLogo = bannerInfoNew.getNightLogo();
            } else {
                dayLogo = bannerInfoNew.getDayLogo();
            }
            arrayList.add(new C52776wXy(bannerInfoNew.getCampaignTitle(), bannerInfoNew.getCampaignContent(), null, null, new Function1() { // from class: o.faa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18027fae.OLrzqt(dayLogo, (android.widget.ImageView) obj);
                }
            }, 12, null));
        }
        wxi.setItems(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        wxi.setOnItemClick(new Function1() { // from class: o.fah
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18027fae.EZpvd(list, this, function1, wxi, ((java.lang.Integer) obj).intValue());
            }
        });
        wxi.setCurrentPage(wxi.copydefault());
        wxi.requestLayout();
    }

    public static final Unit OLrzqt(java.lang.String str, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Glide.KWHzl(imageView).EZpvd(str).KWHzl(C13754dXa.Activity.AwvSrB).copydefault(C13754dXa.Activity.AxsJAY).OLrzqt(new StateListAnimator(imageView));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fae$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5454Si<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.widget.ImageView KWHzl;

        @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        public StateListAnimator(android.widget.ImageView imageView) {
            this.KWHzl = imageView;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            drawable.setAutoMirrored(true);
            this.KWHzl.setImageDrawable(drawable);
        }
    }

    public static final Unit EZpvd(java.util.List list, C18027fae c18027fae, Function1 function1, wXI wxi, int i) {
        if (i >= 0 && i < list.size()) {
            BannerInfoNew bannerInfoNew = (BannerInfoNew) list.get(i);
            c18027fae.copydefault.AEQbTJ(java.lang.String.valueOf(bannerInfoNew.getId()));
            View.OnClickListener onClickListener = c18027fae.AEQbTJ;
            if (onClickListener != null) {
                C17088ewG c17088ewG = c18027fae.KWHzl;
                onClickListener.onClick(c17088ewG != null ? c17088ewG.KWHzl : null);
            }
            C13919dbf.EZpvd(bannerInfoNew);
            if (bannerInfoNew.getUrl().length() > 0) {
                int urlType = bannerInfoNew.getUrlType();
                if (urlType == 1) {
                    android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", bannerInfoNew.getUrl()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()), C56390yDp.OLrzqt("title", bannerInfoNew.getUrlTitle()));
                    WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                    android.content.Context context = wxi.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
                } else if (urlType == 2) {
                    java.lang.String[] strArrKWHzl = C34704nhP.copydefault.KWHzl();
                    if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) bannerInfoNew.getUrl(), (java.lang.CharSequence) "wallet/dapp/url", false, 2, (java.lang.Object) null) && StringsKt__StringsKt.contains$default((java.lang.CharSequence) bannerInfoNew.getUrl(), (java.lang.CharSequence) "showBottomBar=1", false, 2, (java.lang.Object) null)) {
                        function1.invoke(bannerInfoNew.getUrl());
                    } else {
                        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                        android.content.Context context2 = wxi.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context2, StringsKt__StringsKt.KWHzl(bannerInfoNew.getUrl(), strArrKWHzl + "://", bannerInfoNew.getUrl()), null, new Function1() { // from class: o.fag
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C18027fae.copydefault((AbstractC43238rlX) obj);
                            }
                        }, 4, null);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void setAutoPlay(boolean z) {
        wXI wxi;
        C17088ewG c17088ewG = this.KWHzl;
        if (c17088ewG == null || (wxi = c17088ewG.KWHzl) == null) {
            return;
        }
        wxi.setAutoPlay(z);
    }

    public final void setAutoTurningTime(long j) {
        wXI wxi;
        C17088ewG c17088ewG = this.KWHzl;
        if (c17088ewG == null || (wxi = c17088ewG.KWHzl) == null) {
            return;
        }
        wxi.setAutoTurningTime(j);
    }

    public final boolean EZpvd(java.util.List<BannerInfoNew> list, java.util.List<BannerInfoNew> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.EZpvd(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
