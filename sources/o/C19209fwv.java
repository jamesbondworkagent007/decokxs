package o;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.okinc.business.defi.wallet.mine.search.data.model.AddressSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.DeFiAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.NFTAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.WebsiteSearchHistory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19209fwv extends RecyclerView.ViewHolder {
    public final Function1<C18989fsn, Unit> AEQbTJ;
    public final C16871esB copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsn, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19209fwv(@NotNull C16871esB c16871esB, @NotNull Function1<? super C18989fsn, Unit> function1) {
        super(c16871esB.getRoot());
        Intrinsics.checkNotNullParameter(c16871esB, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = c16871esB;
        this.AEQbTJ = function1;
    }

    public final void AEQbTJ(@NotNull C18989fsn c18989fsn) {
        java.lang.String string;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        final C16871esB c16871esB = this.copydefault;
        c16871esB.OLrzqt.setText(c18989fsn.copydefault());
        AppCompatTextView appCompatTextView = c16871esB.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        java.lang.String strCopydefault = c18989fsn.copydefault();
        appCompatTextView.setVisibility((strCopydefault == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) ^ true ? 0 : 8);
        AppCompatTextView appCompatTextView2 = c16871esB.EZpvd;
        SearchHistoryItem searchHistoryItemAEQbTJ = c18989fsn.AEQbTJ();
        if ((searchHistoryItemAEQbTJ instanceof TokenAssetHistory) || (searchHistoryItemAEQbTJ instanceof NFTAssetHistory) || (searchHistoryItemAEQbTJ instanceof DeFiAssetHistory)) {
            string = c16871esB.getRoot().getContext().getString(C13754dXa.FragmentManager.Rstring);
        } else {
            string = c18989fsn.OLrzqt();
        }
        appCompatTextView2.setText(string);
        AppCompatTextView appCompatTextView3 = c16871esB.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        SearchHistoryItem searchHistoryItemAEQbTJ2 = c18989fsn.AEQbTJ();
        appCompatTextView3.setVisibility(((searchHistoryItemAEQbTJ2 instanceof TokenAssetHistory) || (searchHistoryItemAEQbTJ2 instanceof NFTAssetHistory) || (searchHistoryItemAEQbTJ2 instanceof DeFiAssetHistory) || !((strOLrzqt = c18989fsn.OLrzqt()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt))) ? 0 : 8);
        c16871esB.AEQbTJ.setBackgroundDrawable(null);
        c16871esB.AEQbTJ.setImageDrawable(null);
        SearchHistoryItem searchHistoryItemAEQbTJ3 = c18989fsn.AEQbTJ();
        if (searchHistoryItemAEQbTJ3 instanceof DAppSearchHistory) {
            java.lang.String strEZpvd = c18989fsn.EZpvd();
            if (strEZpvd == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
                AppCompatImageView appCompatImageView = c16871esB.AEQbTJ;
                android.content.Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                appCompatImageView.setBackgroundDrawable(C19177fwP.KWHzl(context));
            } else {
                android.content.Context context2 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                LayerDrawable layerDrawableKWHzl = C19177fwP.KWHzl(context2);
                int iDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
                ViewGroup.LayoutParams layoutParams = c16871esB.AEQbTJ.getLayoutParams();
                layoutParams.width = iDp2px$default;
                layoutParams.height = iDp2px$default;
                Intrinsics.copydefault(Glide.KWHzl(c16871esB.AEQbTJ).EZpvd(c18989fsn.EZpvd()).EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null))).OLrzqt((RY) new StateListAnimator(c16871esB, layerDrawableKWHzl)).EZpvd((android.widget.ImageView) c16871esB.AEQbTJ));
            }
        } else if (searchHistoryItemAEQbTJ3 instanceof AddressSearchHistory) {
            AppCompatImageView appCompatImageView2 = c16871esB.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            C14725dqq.copydefault(appCompatImageView2, ((AddressSearchHistory) c18989fsn.AEQbTJ()).copydefault(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fwx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19209fwv.KWHzl(c16871esB, (C5335Nt) obj);
                }
            }, 32.0f);
        } else if ((searchHistoryItemAEQbTJ3 instanceof TokenAssetHistory) || (searchHistoryItemAEQbTJ3 instanceof NFTAssetHistory) || (searchHistoryItemAEQbTJ3 instanceof DeFiAssetHistory) || (searchHistoryItemAEQbTJ3 instanceof TokenSearchHistory)) {
            AppCompatImageView appCompatImageView3 = c16871esB.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            java.lang.String strEZpvd2 = c18989fsn.EZpvd();
            java.lang.String str = strEZpvd2 == null ? "" : strEZpvd2;
            int i = C52761wXj.TaskDescription.aHXSQp;
            int i2 = C52761wXj.Activity.zuBGHE;
            android.content.Context context3 = c16871esB.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            C14725dqq.loadFixSizeBorderImage$default(appCompatImageView3, str, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context3), false, 32, null);
        } else {
            if (!(searchHistoryItemAEQbTJ3 instanceof WebsiteSearchHistory)) {
                throw new NoWhenBranchMatchedException();
            }
            AppCompatImageView appCompatImageView4 = c16871esB.AEQbTJ;
            android.content.Context context4 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            appCompatImageView4.setBackgroundDrawable(C19177fwP.KWHzl(context4));
        }
        SearchHistoryItem searchHistoryItemAEQbTJ4 = c18989fsn.AEQbTJ();
        if (searchHistoryItemAEQbTJ4 instanceof TokenAssetHistory) {
            java.lang.String strCopydefault2 = ((TokenAssetHistory) c18989fsn.AEQbTJ()).copydefault();
            boolean z = !(strCopydefault2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault2));
            AppCompatImageView appCompatImageView5 = c16871esB.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView5, "");
            appCompatImageView5.setVisibility(z ? 0 : 8);
            if (z) {
                AppCompatImageView appCompatImageView6 = c16871esB.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView6, "");
                java.lang.String strCopydefault3 = ((TokenAssetHistory) c18989fsn.AEQbTJ()).copydefault();
                int i3 = C52761wXj.TaskDescription.fERRXa;
                int i4 = C52761wXj.Activity.zuBGHE;
                android.content.Context context5 = c16871esB.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                C14725dqq.loadFixSizeBorderImage$default(appCompatImageView6, strCopydefault3, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context5), false, 32, null);
            }
        } else if (searchHistoryItemAEQbTJ4 instanceof TokenSearchHistory) {
            java.lang.String strAEQbTJ = ((TokenSearchHistory) c18989fsn.AEQbTJ()).AEQbTJ();
            boolean z2 = !(strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ));
            AppCompatImageView appCompatImageView7 = c16871esB.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView7, "");
            appCompatImageView7.setVisibility(z2 ? 0 : 8);
            if (z2) {
                AppCompatImageView appCompatImageView8 = c16871esB.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView8, "");
                java.lang.String strAEQbTJ2 = ((TokenSearchHistory) c18989fsn.AEQbTJ()).AEQbTJ();
                int i5 = C52761wXj.TaskDescription.fERRXa;
                int i6 = C52761wXj.Activity.zuBGHE;
                android.content.Context context6 = c16871esB.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                C14725dqq.loadFixSizeBorderImage$default(appCompatImageView8, strAEQbTJ2, i5, 1.0f, 16.0f, C33070mpX.OLrzqt(i6, context6), false, 32, null);
            }
        } else if (searchHistoryItemAEQbTJ4 instanceof DeFiAssetHistory) {
            java.lang.String strOLrzqt2 = ((DeFiAssetHistory) c18989fsn.AEQbTJ()).OLrzqt();
            boolean z3 = !(strOLrzqt2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt2));
            AppCompatImageView appCompatImageView9 = c16871esB.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView9, "");
            appCompatImageView9.setVisibility(z3 ? 0 : 8);
            if (z3) {
                AppCompatImageView appCompatImageView10 = c16871esB.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView10, "");
                java.lang.String strOLrzqt3 = ((DeFiAssetHistory) c18989fsn.AEQbTJ()).OLrzqt();
                int i7 = C52761wXj.TaskDescription.fERRXa;
                int i8 = C52761wXj.Activity.zuBGHE;
                android.content.Context context7 = c16871esB.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                C14725dqq.loadFixSizeBorderImage$default(appCompatImageView10, strOLrzqt3, i7, 1.0f, 16.0f, C33070mpX.OLrzqt(i8, context7), false, 32, null);
            }
        } else {
            AppCompatImageView appCompatImageView11 = c16871esB.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView11, "");
            appCompatImageView11.setVisibility(8);
        }
        ConstraintLayout root = c16871esB.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, c18989fsn));
    }

    /* JADX INFO: renamed from: o.fwv$StateListAnimator */
    public static final class StateListAnimator implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ C16871esB AEQbTJ;
        public final /* synthetic */ LayerDrawable copydefault;

        public StateListAnimator(C16871esB c16871esB, LayerDrawable layerDrawable) {
            this.AEQbTJ = c16871esB;
            this.copydefault = layerDrawable;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            this.AEQbTJ.AEQbTJ.setBackgroundDrawable(this.copydefault);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(drawable, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(dataSource, "");
            this.AEQbTJ.AEQbTJ.setBackgroundDrawable(null);
            return false;
        }
    }

    public static final Unit KWHzl(C16871esB c16871esB, C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        android.content.Context context = c16871esB.AEQbTJ.getContext();
        int i = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c16871esB.AEQbTJ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C14641dpL(context, 8.0f, 1.0f, C33070mpX.OLrzqt(i, context2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fwv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C18989fsn EZpvd;
        public final /* synthetic */ C19209fwv KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19209fwv c19209fwv, C18989fsn c18989fsn) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c19209fwv;
            this.EZpvd = c18989fsn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ.invoke(this.EZpvd);
            }
        }
    }
}
