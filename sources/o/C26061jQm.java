package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.data.constant.LiquidityChangeType;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C26061jQm;
import o.C52761wXj;
import o.jPR;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.jQm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26061jQm extends kLH<C26072jQx, Application> {
    public Function0<Unit> AEQbTJ;
    public final Function1<C26072jQx, Unit> KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;
    public boolean copydefault;

    public static final void KWHzl(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = z;
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jQx, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26061jQm(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super C26072jQx, Unit> function12, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str) {
        super(new C26068jQt(), fragmentManager, fragment, str);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = function1;
        this.KWHzl = function12;
        this.AEQbTJ = new Function0() { // from class: o.jQr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26061jQm.OLrzqt();
            }
        };
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jQm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFilterState$default(C26061jQm c26061jQm, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.jQo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C26061jQm.KWHzl();
                }
            };
        }
        c26061jQm.copydefault(z, (Function0<Unit>) function0);
    }

    @Override // o.kLH
    public kLN<C26072jQx> OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hDO hdoKWHzl = hDO.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hdoKWHzl, "");
        return new Application(this, hdoKWHzl);
    }

    /* JADX INFO: renamed from: o.jQm$Application */
    public final class Application extends kLN<C26072jQx> {
        public final hDO EZpvd;
        public final /* synthetic */ C26061jQm copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public Application(@NotNull C26061jQm c26061jQm, hDO hdo) {
            Intrinsics.checkNotNullParameter(hdo, "");
            this.copydefault = c26061jQm;
            LinearLayoutCompat root = hdo.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.EZpvd = hdo;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.kLN
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull final C26072jQx c26072jQx) {
            Intrinsics.checkNotNullParameter(c26072jQx, "");
            android.content.Context context = this.EZpvd.getRoot().getContext();
            hDO hdo = this.EZpvd;
            final C26061jQm c26061jQm = this.copydefault;
            hdo.getRoot().setOnClickListener(null);
            hdo.AYXKKw.setOnLongClickListener(null);
            hdo.AYXKKw.setOnClickListener(null);
            AppCompatTextView appCompatTextView = hdo.OLrzqt;
            jPR.TaskDescription taskDescription = jPR.Companion;
            Intrinsics.copydefault(context);
            appCompatTextView.setText(taskDescription.copydefault(context, c26072jQx.valueOf()));
            hdo.AkhnZx.setText(C25322iuY.OLrzqt.copydefault(c26072jQx.copydefault()));
            try {
                Result.Application application = Result.Companion;
                AppCompatImageView appCompatImageView = hdo.copydefault;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                C25386ivj.loadCircleImage$default(appCompatImageView, c26072jQx.OLrzqt(), false, 2, null);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (c26072jQx.EZpvd().size() > 1) {
                hdo.EZpvd.setText(c26072jQx.EZpvd().get(0).AEQbTJ());
                hdo.djBIcL.setText(c26072jQx.EZpvd().get(1).AEQbTJ());
                hdo.djBIcL.setVisibility(0);
                java.lang.String strKWHzl = c26072jQx.EZpvd().get(0).KWHzl();
                java.lang.String strKWHzl2 = c26072jQx.EZpvd().get(1).KWHzl();
                if (c26072jQx.valueOf() == LiquidityChangeType.Add) {
                    AppCompatTextView appCompatTextView2 = hdo.EZpvd;
                    java.lang.String strOLrzqt = hSP.OLrzqt(strKWHzl, Marker.ANY_NON_NULL_MARKER);
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    appCompatTextView2.setText(c26061jQm.KWHzl(strOLrzqt, C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null), c26072jQx.EZpvd().get(0).AEQbTJ()));
                    hdo.djBIcL.setText(c26061jQm.KWHzl(hSP.OLrzqt(strKWHzl2, Marker.ANY_NON_NULL_MARKER), C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null), c26072jQx.EZpvd().get(1).AEQbTJ()));
                } else {
                    AppCompatTextView appCompatTextView3 = hdo.EZpvd;
                    java.lang.String strOLrzqt2 = hSP.OLrzqt(strKWHzl, "-");
                    C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                    appCompatTextView3.setText(c26061jQm.KWHzl(strOLrzqt2, C33512mxp.tradeFallDefault$default(c33512mxp2, context, 0.0f, 2, null), c26072jQx.EZpvd().get(0).AEQbTJ()));
                    hdo.djBIcL.setText(c26061jQm.KWHzl(hSP.OLrzqt(strKWHzl2, "-"), C33512mxp.tradeFallDefault$default(c33512mxp2, context, 0.0f, 2, null), c26072jQx.EZpvd().get(1).AEQbTJ()));
                }
            } else if (c26072jQx.EZpvd().size() == 1) {
                hdo.EZpvd.setText(c26072jQx.EZpvd().get(0).AEQbTJ());
                hdo.djBIcL.setVisibility(8);
                java.lang.String strKWHzl3 = c26072jQx.EZpvd().get(0).KWHzl();
                if (c26072jQx.valueOf() == LiquidityChangeType.Add) {
                    hdo.EZpvd.setText(c26061jQm.KWHzl(hSP.OLrzqt(strKWHzl3, Marker.ANY_NON_NULL_MARKER), C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null), c26072jQx.EZpvd().get(0).AEQbTJ()));
                } else {
                    hdo.EZpvd.setText(c26061jQm.KWHzl(hSP.OLrzqt(strKWHzl3, "-"), C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null), c26072jQx.EZpvd().get(0).AEQbTJ()));
                }
            } else {
                hdo.djBIcL.setVisibility(0);
                hdo.EZpvd.setText(c26061jQm.KWHzl("--", C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "--"));
                hdo.djBIcL.setText(c26061jQm.KWHzl("--", C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "--"));
            }
            hdo.valueOf.setText(c26072jQx.AYXKKw().length() != 0 ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c26072jQx.AYXKKw(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null) : "--");
            hdo.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jQs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26061jQm.Application.AEQbTJ(c26061jQm, c26072jQx, view);
                }
            });
            if (c26072jQx.EZpvd().size() > 2) {
                hdo.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.jQp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C26061jQm.Application.KWHzl(c26061jQm, c26072jQx, view);
                    }
                });
                android.widget.ImageView imageView = hdo.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                return;
            }
            android.widget.ImageView imageView2 = hdo.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            hdo.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.jQq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26061jQm.Application.valueOf(c26061jQm, c26072jQx, view);
                }
            });
        }

        public static final void AEQbTJ(C26061jQm c26061jQm, C26072jQx c26072jQx, android.view.View view) {
            c26061jQm.OLrzqt.invoke(c26072jQx.djBIcL());
        }

        public static final void KWHzl(C26061jQm c26061jQm, C26072jQx c26072jQx, android.view.View view) {
            c26061jQm.KWHzl.invoke(c26072jQx);
        }

        public static final void valueOf(C26061jQm c26061jQm, C26072jQx c26072jQx, android.view.View view) {
            c26061jQm.OLrzqt.invoke(c26072jQx.djBIcL());
        }
    }

    public final android.text.SpannableStringBuilder KWHzl(java.lang.String str, @androidx.annotation.ColorInt int i, java.lang.String str2) {
        try {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str + " " + str2);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i), 0, str.length(), 17);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab)), str.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new C26070jQv(), 0, str.length(), 17);
            return spannableStringBuilder;
        } catch (java.lang.Exception unused) {
            return new android.text.SpannableStringBuilder(str + " " + str2);
        }
    }

    @Override // o.kLH
    public RecyclerView.ViewHolder KWHzl(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        RecyclerView.ViewHolder viewHolderKWHzl = super.KWHzl(viewGroup);
        Intrinsics.copydefault(viewHolderKWHzl, "");
        kLA kla = (kLA) viewHolderKWHzl;
        copydefault(kla.OLrzqt());
        return kla;
    }

    public final void copydefault(C21465hAj c21465hAj) {
        C55173xeu c55173xeu = c21465hAj.OLrzqt;
        if (this.copydefault) {
            c55173xeu.setEmptyTypeImage(7);
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi21PlaybackInfo));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.sanrWj));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jQl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26061jQm.copydefault(this.KWHzl, view);
                }
            });
            return;
        }
        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.initViewTreeOwners));
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setRetry("");
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jQk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26061jQm.KWHzl(view);
            }
        });
    }

    public static final void copydefault(C26061jQm c26061jQm, android.view.View view) {
        c26061jQm.AEQbTJ.invoke();
    }
}
