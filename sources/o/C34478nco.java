package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.dexkline.dexlogic.txs.TxType;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C34478nco;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.nco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34478nco extends androidx.recyclerview.widget.ListAdapter<C34462ncY, StateListAnimator> {
    public final Function1<java.lang.String, Unit> EZpvd;
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX INFO: renamed from: o.nco$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TxType.values().length];
            try {
                iArr[TxType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TxType.TRANSFER_IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TxType.SELL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TxType.TRANSFER_OUT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C34478nco(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        super(new C34487ncx());
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.KWHzl = function1;
        this.EZpvd = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36063oNx c36063oNxKWHzl = C36063oNx.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36063oNxKWHzl, "");
        return new StateListAnimator(this, c36063oNxKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C34462ncY item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        stateListAnimator.EZpvd(item);
    }

    /* JADX INFO: renamed from: o.nco$StateListAnimator */
    public final class StateListAnimator extends AbstractC34591nev<C34462ncY> {
        public final C36063oNx OLrzqt;
        public final /* synthetic */ C34478nco copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator(@NotNull C34478nco c34478nco, C36063oNx c36063oNx) {
            Intrinsics.checkNotNullParameter(c36063oNx, "");
            this.copydefault = c34478nco;
            LinearLayoutCompat root = c36063oNx.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.OLrzqt = c36063oNx;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.xHP.formatUsdValueToLocalValue$default(java.lang.String, boolean, com.okinc.localization.util.format.DisplaySign, java.math.RoundingMode, java.lang.Boolean, int, java.lang.Object):java.lang.String */
        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.AbstractC34591nev
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull final C34462ncY c34462ncY) {
            Intrinsics.checkNotNullParameter(c34462ncY, "");
            C36063oNx c36063oNx = this.OLrzqt;
            final C34478nco c34478nco = this.copydefault;
            final AppCompatTextView appCompatTextView = c36063oNx.AEQbTJ;
            appCompatTextView.setText(C34476ncm.Companion.copydefault(c34462ncY.AhwBna()));
            if (c34462ncY.copydefault()) {
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim);
                if (drawableKWHzl != null) {
                    C33057mpK.copydefault(drawableKWHzl, mUM.copydefault(C52761wXj.Activity.fdOvFl));
                    drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                } else {
                    drawableKWHzl = null;
                }
                appCompatTextView.setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
                appCompatTextView.setCompoundDrawablePadding(C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                mUO.setOnDoubleCheckClickListener$default(appCompatTextView, 0L, new Function1() { // from class: o.ncq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C34478nco.StateListAnimator.KWHzl(c34478nco, appCompatTextView, (android.view.View) obj);
                    }
                }, 1, null);
            } else {
                appCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
            }
            c36063oNx.valueOf.setText(mUK.AEQbTJ.OLrzqt(c34462ncY.KWHzl()));
            AppCompatTextView appCompatTextView2 = c36063oNx.copydefault;
            java.lang.String strOLrzqt = "--";
            appCompatTextView2.setText(c34462ncY.EZpvd().length() == 0 ? "--" : C32230mUh.copydefault(c34462ncY.EZpvd(), c34478nco.AEQbTJ(c34462ncY.AhwBna()), false));
            android.content.Context context = c36063oNx.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView2.setTextColor(c34478nco.AEQbTJ(context, c34462ncY.AhwBna()));
            c36063oNx.AYXKKw.setText(c34462ncY.AYXKKw().length() == 0 ? "--" : xHP.formatUsdValueToLocalValue$default(c34462ncY.AYXKKw(), false, null, null, null, 15, null));
            AppCompatTextView appCompatTextView3 = c36063oNx.djBIcL;
            if (c34462ncY.AEQbTJ().length() != 0) {
                strOLrzqt = mRJ.AEQbTJ.OLrzqt(c34462ncY.AEQbTJ(), (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
            }
            appCompatTextView3.setText(strOLrzqt);
            mUO.setOnDoubleCheckClickListener$default(c36063oNx.getRoot(), 0L, new Function1() { // from class: o.ncr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34478nco.StateListAnimator.EZpvd(c34478nco, c34462ncY, (android.view.View) obj);
                }
            }, 1, null);
        }

        public static final Unit KWHzl(C34478nco c34478nco, AppCompatTextView appCompatTextView, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = c34478nco.KWHzl;
            java.lang.String string = appCompatTextView.getContext().getString(C35964oKf.Fragment.invokespecialaKhcqp);
            Intrinsics.checkNotNullExpressionValue(string, "");
            function1.invoke(string);
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(C34478nco c34478nco, C34462ncY c34462ncY, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            c34478nco.EZpvd.invoke(c34462ncY.valueOf());
            return Unit.INSTANCE;
        }
    }

    public final java.lang.String AEQbTJ(TxType txType) {
        int i = Application.EZpvd[txType.ordinal()];
        return (i == 1 || i == 2 || !(i == 3 || i == 4)) ? Marker.ANY_NON_NULL_MARKER : "-";
    }

    public final int AEQbTJ(android.content.Context context, TxType txType) {
        android.content.Context contextKWHzl = mUM.KWHzl(context);
        int i = Application.EZpvd[txType.ordinal()];
        if (i == 1 || i == 2) {
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, contextKWHzl, 0.0f, 2, null);
        }
        if (i == 3 || i == 4) {
            return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, contextKWHzl, 0.0f, 2, null);
        }
        return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, contextKWHzl, 0.0f, 2, null);
    }
}
