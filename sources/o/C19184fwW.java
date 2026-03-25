package o;

import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
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

/* JADX INFO: renamed from: o.fwW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19184fwW extends RecyclerView.ViewHolder {
    public final Function1<C18989fsn, Unit> AEQbTJ;
    public final C16873esD EZpvd;
    public final Function1<C18989fsn, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsn, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsn, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19184fwW(@NotNull C16873esD c16873esD, @NotNull Function1<? super C18989fsn, Unit> function1, @NotNull Function1<? super C18989fsn, Unit> function12) {
        super(c16873esD.getRoot());
        Intrinsics.checkNotNullParameter(c16873esD, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.EZpvd = c16873esD;
        this.copydefault = function1;
        this.AEQbTJ = function12;
    }

    public final void copydefault(@NotNull C18989fsn c18989fsn) {
        java.lang.String strCopydefault;
        java.lang.String string;
        java.lang.String strDbNXlk;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        final C16873esD c16873esD = this.EZpvd;
        boolean z = c18989fsn.AEQbTJ() instanceof AddressSearchHistory;
        AppCompatTextView appCompatTextView = c16873esD.AYXKKw;
        if (z) {
            strCopydefault = ((AddressSearchHistory) c18989fsn.AEQbTJ()).copydefault();
        } else {
            strCopydefault = c18989fsn.copydefault();
        }
        appCompatTextView.setText(strCopydefault);
        AppCompatTextView appCompatTextView2 = c16873esD.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        java.lang.String strCopydefault2 = c18989fsn.copydefault();
        appCompatTextView2.setVisibility((strCopydefault2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault2)) ^ true ? 0 : 8);
        if (z) {
            c16873esD.AYXKKw.setMaxLines(Integer.MAX_VALUE);
            c16873esD.AYXKKw.setEllipsize(null);
        } else {
            c16873esD.AYXKKw.setMaxLines(1);
            c16873esD.AYXKKw.setEllipsize(TextUtils.TruncateAt.END);
        }
        AppCompatTextView appCompatTextView3 = c16873esD.gEmmrt;
        SearchHistoryItem searchHistoryItemAEQbTJ = c18989fsn.AEQbTJ();
        if ((searchHistoryItemAEQbTJ instanceof TokenAssetHistory) || (searchHistoryItemAEQbTJ instanceof NFTAssetHistory) || (searchHistoryItemAEQbTJ instanceof DeFiAssetHistory)) {
            string = c16873esD.getRoot().getContext().getString(C13754dXa.FragmentManager.Rstring);
        } else if (!(searchHistoryItemAEQbTJ instanceof TokenSearchHistory) || (string = ((TokenSearchHistory) c18989fsn.AEQbTJ()).DbNXlk()) == null) {
            string = c18989fsn.OLrzqt();
        }
        appCompatTextView3.setText(string);
        AppCompatTextView appCompatTextView4 = c16873esD.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
        SearchHistoryItem searchHistoryItemAEQbTJ2 = c18989fsn.AEQbTJ();
        appCompatTextView4.setVisibility(((searchHistoryItemAEQbTJ2 instanceof TokenAssetHistory) || (searchHistoryItemAEQbTJ2 instanceof NFTAssetHistory) || (searchHistoryItemAEQbTJ2 instanceof DeFiAssetHistory) || !((strOLrzqt = c18989fsn.OLrzqt()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt))) ? 0 : 8);
        Group group = c16873esD.valueOf;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility((!(c18989fsn.AEQbTJ() instanceof TokenSearchHistory) || (strDbNXlk = ((TokenSearchHistory) c18989fsn.AEQbTJ()).DbNXlk()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) ? 8 : 0);
        c16873esD.djBIcL.setText(c18989fsn.OLrzqt());
        c16873esD.AEQbTJ.setBackgroundDrawable(null);
        c16873esD.AEQbTJ.setImageDrawable(null);
        SearchHistoryItem searchHistoryItemAEQbTJ3 = c18989fsn.AEQbTJ();
        if (searchHistoryItemAEQbTJ3 instanceof DAppSearchHistory) {
            java.lang.String strEZpvd = c18989fsn.EZpvd();
            if (strEZpvd == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
                AppCompatImageView appCompatImageView = c16873esD.AEQbTJ;
                android.content.Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                appCompatImageView.setBackgroundDrawable(C19177fwP.KWHzl(context));
            } else {
                android.content.Context context2 = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                LayerDrawable layerDrawableKWHzl = C19177fwP.KWHzl(context2);
                int iDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
                ViewGroup.LayoutParams layoutParams = c16873esD.AEQbTJ.getLayoutParams();
                layoutParams.width = iDp2px$default;
                layoutParams.height = iDp2px$default;
                Intrinsics.copydefault(Glide.KWHzl(c16873esD.AEQbTJ).EZpvd(c18989fsn.EZpvd()).EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null))).OLrzqt((RY) new StateListAnimator(c16873esD, layerDrawableKWHzl)).EZpvd((android.widget.ImageView) c16873esD.AEQbTJ));
            }
        } else if (searchHistoryItemAEQbTJ3 instanceof AddressSearchHistory) {
            AppCompatImageView appCompatImageView2 = c16873esD.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            C14725dqq.copydefault(appCompatImageView2, ((AddressSearchHistory) c18989fsn.AEQbTJ()).copydefault(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fwY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19184fwW.AEQbTJ(c16873esD, (C5335Nt) obj);
                }
            }, 32.0f);
        } else if ((searchHistoryItemAEQbTJ3 instanceof TokenAssetHistory) || (searchHistoryItemAEQbTJ3 instanceof NFTAssetHistory) || (searchHistoryItemAEQbTJ3 instanceof DeFiAssetHistory) || (searchHistoryItemAEQbTJ3 instanceof TokenSearchHistory)) {
            AppCompatImageView appCompatImageView3 = c16873esD.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            java.lang.String strEZpvd2 = c18989fsn.EZpvd();
            java.lang.String str = strEZpvd2 == null ? "" : strEZpvd2;
            int i = C52761wXj.TaskDescription.aHXSQp;
            int i2 = C52761wXj.Activity.zuBGHE;
            android.content.Context context3 = c16873esD.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            C14725dqq.loadFixSizeBorderImage$default(appCompatImageView3, str, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context3), false, 32, null);
        } else {
            if (!(searchHistoryItemAEQbTJ3 instanceof WebsiteSearchHistory)) {
                throw new NoWhenBranchMatchedException();
            }
            AppCompatImageView appCompatImageView4 = c16873esD.AEQbTJ;
            android.content.Context context4 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            appCompatImageView4.setBackgroundDrawable(C19177fwP.KWHzl(context4));
        }
        SearchHistoryItem searchHistoryItemAEQbTJ4 = c18989fsn.AEQbTJ();
        if (searchHistoryItemAEQbTJ4 instanceof TokenAssetHistory) {
            java.lang.String strCopydefault3 = ((TokenAssetHistory) c18989fsn.AEQbTJ()).copydefault();
            boolean z2 = !(strCopydefault3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault3));
            AppCompatImageView appCompatImageView5 = c16873esD.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView5, "");
            appCompatImageView5.setVisibility(z2 ? 0 : 8);
            if (z2) {
                AppCompatImageView appCompatImageView6 = c16873esD.copydefault;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView6, "");
                java.lang.String strCopydefault4 = ((TokenAssetHistory) c18989fsn.AEQbTJ()).copydefault();
                int i3 = C52761wXj.TaskDescription.fERRXa;
                int i4 = C52761wXj.Activity.zuBGHE;
                android.content.Context context5 = c16873esD.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                C14725dqq.loadFixSizeBorderImage$default(appCompatImageView6, strCopydefault4, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context5), false, 32, null);
            }
        } else if (searchHistoryItemAEQbTJ4 instanceof TokenSearchHistory) {
            java.lang.String strAEQbTJ = ((TokenSearchHistory) c18989fsn.AEQbTJ()).AEQbTJ();
            boolean z3 = !(strAEQbTJ == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ));
            AppCompatImageView appCompatImageView7 = c16873esD.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView7, "");
            appCompatImageView7.setVisibility(z3 ? 0 : 8);
            if (z3) {
                AppCompatImageView appCompatImageView8 = c16873esD.copydefault;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView8, "");
                java.lang.String strAEQbTJ2 = ((TokenSearchHistory) c18989fsn.AEQbTJ()).AEQbTJ();
                int i5 = C52761wXj.TaskDescription.fERRXa;
                int i6 = C52761wXj.Activity.zuBGHE;
                android.content.Context context6 = c16873esD.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                C14725dqq.loadFixSizeBorderImage$default(appCompatImageView8, strAEQbTJ2, i5, 1.0f, 16.0f, C33070mpX.OLrzqt(i6, context6), false, 32, null);
            }
        } else if (searchHistoryItemAEQbTJ4 instanceof DeFiAssetHistory) {
            java.lang.String strOLrzqt2 = ((DeFiAssetHistory) c18989fsn.AEQbTJ()).OLrzqt();
            boolean z4 = !(strOLrzqt2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt2));
            AppCompatImageView appCompatImageView9 = c16873esD.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView9, "");
            appCompatImageView9.setVisibility(z4 ? 0 : 8);
            if (z4) {
                AppCompatImageView appCompatImageView10 = c16873esD.copydefault;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView10, "");
                java.lang.String strOLrzqt3 = ((DeFiAssetHistory) c18989fsn.AEQbTJ()).OLrzqt();
                int i7 = C52761wXj.TaskDescription.fERRXa;
                int i8 = C52761wXj.Activity.zuBGHE;
                android.content.Context context7 = c16873esD.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                C14725dqq.loadFixSizeBorderImage$default(appCompatImageView10, strOLrzqt3, i7, 1.0f, 16.0f, C33070mpX.OLrzqt(i8, context7), false, 32, null);
            }
        } else {
            AppCompatImageView appCompatImageView11 = c16873esD.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView11, "");
            appCompatImageView11.setVisibility(8);
        }
        ConstraintLayout root = c16873esD.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, c18989fsn));
        AppCompatImageView appCompatImageView12 = c16873esD.OLrzqt;
        appCompatImageView12.setOnClickListener(new TaskDescription(appCompatImageView12, 1000L, this, c18989fsn));
    }

    /* JADX INFO: renamed from: o.fwW$StateListAnimator */
    public static final class StateListAnimator implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ LayerDrawable AEQbTJ;
        public final /* synthetic */ C16873esD copydefault;

        public StateListAnimator(C16873esD c16873esD, LayerDrawable layerDrawable) {
            this.copydefault = c16873esD;
            this.AEQbTJ = layerDrawable;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            this.copydefault.AEQbTJ.setBackgroundDrawable(this.AEQbTJ);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(drawable, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(dataSource, "");
            this.copydefault.AEQbTJ.setBackgroundDrawable(null);
            return false;
        }
    }

    /* JADX INFO: renamed from: o.fwW$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C18989fsn EZpvd;
        public final /* synthetic */ C19184fwW OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19184fwW c19184fwW, C18989fsn c18989fsn) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c19184fwW;
            this.EZpvd = c18989fsn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.copydefault.invoke(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.fwW$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C19184fwW AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C18989fsn OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C19184fwW c19184fwW, C18989fsn c18989fsn) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c19184fwW;
            this.OLrzqt = c18989fsn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ.invoke(this.OLrzqt);
            }
        }
    }

    public static final Unit AEQbTJ(C16873esD c16873esD, C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        android.content.Context context = c16873esD.AEQbTJ.getContext();
        int i = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c16873esD.AEQbTJ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C14641dpL(context, 8.0f, 1.0f, C33070mpX.OLrzqt(i, context2)));
        return Unit.INSTANCE;
    }
}
